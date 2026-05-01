## 📋 نظرة عامة عن المشروع

هذا المشروع يطبق **مبادئ الـ Refactoring** المستفادة من المحاضرة على كود Java.

### التقنيات المستخدمة:

| # | التقنية | الملف |
|---|---------|-------|
| 1 | **Rename Variables/Methods** | `Calculator.java` |
| 2 | **Extract Method** | `OrderProcessor.java` |
| 3 | **Guard Clauses** | `DiscountCalculator.java` |
| 4 | **Eliminating Duplicate Code** | `OrderProcessor.java` |


---

## 🚀 كيفية تشغيل المشروع

### المتطلبات الأساسية:
- Java JDK 8 أو أحدث
- أي محرر نصوص (VS Code, IntelliJ, أو Notepad)

### خطوات التشغيل:

```bash
# 1. ادخل إلى مجلد المشروع
cd refactoring-lab

# 2. ترجمة جميع الملفات
javac *.java

# 3. تشغيل البرنامج
java Main

The Result
Order Summary:
Customer: أحمد
Items:
  - لابتوب
  - ماوس
Total Price: $945.0
الخصم: 20.0%

## تنفيذ مبدأ Commit قبل وبعد

تم اتباع التعليمات التالية لكل تمرين:

```bash
# التمرين 1: Rename Methods
git add Calculator.java
git commit -m "BEFORE: Calculator with unclear names"

# Refactoring

git add Calculator.java
git commit -m "AFTER: renamed calc to calculateSumProductRatio"

