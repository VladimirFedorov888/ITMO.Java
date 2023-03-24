package Task05;

public class Main {
    public static void findLongestWord(String text) {
        String[] words = text.split(" "); // разбиваем текст на слова
        String longestWord = ""; // переменная для хранения самого длинного слова

        for (String word : words) {
            if (word.length() > longestWord.length()) { // если текущее слово длиннее, чем сохраненное
                longestWord = word; // сохраняем текущее слово как самое длинное
            }
        }

        System.out.println(longestWord); // возвращаем самое длинное слово
    }
    public static boolean isPalindrome(String word) {
        int length = word.length(); // длина слова
        for (int i = 0; i < length / 2; i++) { // перебираем символы слова только до половины
            if (word.charAt(i) != word.charAt(length - 1 - i)) { // сравниваем символы с обоих концов слова
                return false; // если символы не совпадают, слово не является палиндромом
            }
        }
        return true; // если все символы совпали, слово является палиндромом
    }
    public static String censorText(String text) {
        String censoredText = text.replaceAll("бяка", "[вырезано цензурой]"); // заменяем все вхождения слова "бяка"
        return censoredText; // возвращаем цензурированный текст
    }

    public static int countSubstringOccurrences(String text, String substring) {
        int count = 0; // переменная для хранения количества вхождений
        int index = text.indexOf(substring); // ищем первое вхождение подстроки в строке
        while (index != -1) { // пока вхождение найдено
            count++; // увеличиваем счетчик
            index = text.indexOf(substring, index + 1); // ищем следующее вхождение после предыдущего
        }
        return count; // возвращаем количество вхождений
    }
    public static String reverseLettersInWords(String text) {
        String[] words = text.split(" "); // разбиваем текст на слова
        StringBuilder reversedText = new StringBuilder(); // переменная для хранения инвертированной строки
        for (int i = 0; i < words.length; i++) { // перебираем слова
            String reversedWord = new StringBuilder(words[i]).reverse().toString(); // инвертируем порядок букв в каждом слове
            reversedText.append(reversedWord).append(" "); // добавляем каждое инвертированное слово в инвертированную строку
        }
        return reversedText.toString().trim(); // возвращаем инвертированную строку без пробелов в начале и конце
    }
    public static void main(String[] args) {
        findLongestWord("Строка в которой надо найти самое длинное слово трататататататататат");
        System.out.println(isPalindrome("шалаши"));
        System.out.println(censorText("бяка пошла гулять и встретила другую бяка с бяка в кармане"));
        System.out.println("Количество вхождений: " + countSubstringOccurrences("строка для проверки количетва вхождений слова строка", "строка"));
        System.out.println(reverseLettersInWords("Эту строку надо инвертировать"));
    }

}
