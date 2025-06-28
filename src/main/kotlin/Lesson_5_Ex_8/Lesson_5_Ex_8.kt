package Lesson_5_Ex_8

import org.jsoup.Jsoup

fun main() {

    try {
        val document = Jsoup.connect(QUOTES_URL).get()
        val quoteElements = document.select("div.quote__content")

        if (quoteElements.isEmpty()) {
            println("Цитаты не найдены на странице.")
            return
        }

        quoteElements.forEachIndexed { index, element ->
            val quoteText = element.text().trim()
            println("Цитата ${index + 1}: $quoteText")
        }
    } catch (e: Exception) {
        println("Ошибка при загрузке страницы: ${e.message}")
    }
}

const val QUOTES_URL = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
