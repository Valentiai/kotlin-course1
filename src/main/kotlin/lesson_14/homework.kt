package lesson_14

//Для решения каждой задачи постарайтесь использовать наиболее подходящий метод,
// не повторяясь с решением других задач.

//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
// Определите среднее время выполнения теста.
val testTimes = mapOf("test1" to 30, "test2" to 45, "test3" to 25)
val averageTime = testTimes.values.average()

//Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов,
// а значения - строка с метаданными. Выведите список всех тестовых методов.
val testMetadata = mapOf("testA" to "meta1", "testB" to "meta2")
val methodNames = testMetadata.keys.toList()

//В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
val testResults = mutableMapOf("test1" to "Passed", "test2" to "Failed")
testResults["test3"] = "Passed"

//Посчитайте количество успешных тестов в словаре с результатами.
val successfulTests = testResults.count { it.value == "Passed" }

//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
val bugTracking = mutableMapOf("bug123" to "Open", "bug124" to "Fixed")
bugTracking.remove("bug124")

//Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
// выведите сообщение о странице и статусе её проверки.
val pageStatuses = mapOf("page1.com" to "Checked", "page2.com" to "Unchecked")
pageStatuses.forEach { (url, status) -> println("Page: $url, Status: $status") }

//Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
val serviceTimes = mapOf("serviceA" to 500, "serviceB" to 200)
val threshold = 300
val slowServices = serviceTimes.filter { it.value > threshold }

//В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке).
// Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
val apiResults = mapOf("endpoint1" to "200 OK", "endpoint2" to "404 Not Found")
val status = apiResults.getOrElse("endpoint3") { "Not Tested" }

//Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации),
// получите значение для "browserType". Ответ не может быть null.
val config = mapOf("browserType" to "Chrome", "resolution" to "1920x1080")
val browserType = config.getValue("browserType")

//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.
val versions = mapOf("1.0" to "Stable", "1.1" to "Beta")
val newVersions = versions.toMutableMap()
newVersions["1.2"] = "Alpha"

//Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства),
// получите настройки для конкретной модели или верните настройки по умолчанию.
val deviceSettings = mapOf("iPhone" to "iOS", "Samsung" to "Android")
val settings = deviceSettings.getOrDefault("Nokia", "Default Settings")

//Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.
val errors = mapOf("404" to "Not Found", "500" to "Server Error")
val hasError = "404" in errors

//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
// а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
// Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.
val testScenarios = mapOf("Test1_1.0" to "Passed", "Test2_2.0" to "Failed")
val version = "1.0"
val filteredScenarios = testScenarios.filterKeys { it.endsWith("_$version") }

//У вас есть словарь, где ключи — это названия функциональных модулей приложения,
// а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
val moduleResults = mapOf("Module1" to "Passed", "Module2" to "Failed")
val hasFailed = moduleResults.containsValue("Failed")

//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
val envSettings = mutableMapOf("OS" to "Linux", "RAM" to "16GB")
val additionalSettings = mapOf("CPU" to "8 cores")
envSettings.putAll(additionalSettings)

//Объедините два неизменяемых словаря с данными о багах.
val bugs1 = mapOf("bug1" to "Open")
val bugs2 = mapOf("bug2" to "Closed")
val mergedBugs = bugs1 + bugs2

//Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
val tempTestRunData = mutableMapOf("test1" to "Running")
tempTestRunData.clear()

//Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)
val testReport = mapOf("test1" to "Passed", "test2" to "Skipped")
val filteredReport = testReport.filterNot { it.value == "Skipped" }

//Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.
val configurations = mutableMapOf("v1" to "Active", "v0" to "Deprecated")
configurations.remove("v0")

//Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
// (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
val testResultsMap = mapOf("test1" to "Passed", "test2" to "Failed")
val report = testResultsMap.map { (id, result) -> "Test ID: $id, Result: $result" }

//Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
val lastTestResults = mutableMapOf("test1" to "Passed")
val archivedResults = lastTestResults.toMap()

//Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов,
// заменив идентификаторы тестов на их названия (название можно получить вызвав фейковый метод, например getNameById(id: String))
val testTimes = mapOf("ID1" to 120, "ID2" to 90)
val testNames = testTimes.mapKeys { getNameById(it.key) }

//Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%,
// чтобы учесть новые условия тестирования.
val performanceRatings = mutableMapOf("v1.0" to 80, "v1.1" to 90)
performanceRatings.replaceAll { _, value -> (value * 1.1).toInt() }

//Проверьте, пуст ли словарь с ошибками компиляции тестов.
val compilationErrors = emptyMap<String, String>()
val isEmpty = compilationErrors.isEmpty()

//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
val loadTestResults = mapOf("Test1" to "Passed")
val hasResults = loadTestResults.isNotEmpty()

//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
val allPassed = testResults.all { it.value == "Passed" }

//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
val hasFailures = testResults.any { it.value == "Failed" }

//Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты,
// которые не прошли успешно и содержат в названии “optional”.
val serviceTests = mapOf("optionalTest1" to "Failed", "mainTest" to "Passed")
val failedOptionalTests = serviceTests.filter { it.key.contains("optional") && it.value != "Passed" }