# PrimeCheckerApp 🔍

Ứng dụng Java đơn giản để kiểm tra một số có phải là số nguyên tố hay không. Viết bằng NetBeans, kiểm thử bằng JUnit.

---

## ✅ Chức năng

- Kiểm tra xem một số nguyên có phải là số nguyên tố
- Có sử dụng cả vòng lặp (`for`) và rẽ nhánh (`if`)
- Viết test bằng JUnit để kiểm tra đầy đủ logic chương trình

---

## 🚀 Cách chạy

1. Mở project bằng NetBeans (đã test trên NetBeans 21, JDK 22)
2. Chạy file `PrimeCheckerApp.java` để kiểm tra số
3. Chạy file `PrimeCheckerTest.java` để thực thi các ca kiểm thử

---

## 🧪 Kiểm thử (JUnit)

### ✅ Bao phủ câu lệnh (statement coverage)
- Kiểm tra số âm
- Kiểm tra 0 và 1
- Kiểm tra số nguyên tố và không nguyên tố

### ✅ Bao phủ đường đi (path coverage)
- Trường hợp trả về sớm khi `n <= 1`
- Vòng lặp chạy và phát hiện chia hết (không phải số nguyên tố)
- Vòng lặp chạy đầy đủ nhưng không chia hết (là số nguyên tố)

---

## 🔧 Công nghệ sử dụng

- Java 22
- JUnit 4
- Hamcrest Core 1.3
- NetBeans + Ant (build tool mặc định)

---

## 🧠 Ví dụ kết quả

```java
checker.isPrime(2);   // true
checker.isPrime(9);   // false
checker.isPrime(-5);  // false
