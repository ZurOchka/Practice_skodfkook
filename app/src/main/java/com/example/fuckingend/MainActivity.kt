package com.example.fuckingend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import kotlin.random.Random


/*TODO: ЕСЛИ КТО-ТО ЧТО-ЛИБО ДЕЛАЕТ ХОТЯ БЫ ЧТО-НИБУДЬ ИЗ ПРОПИСАННОГО СНИЗУ СПИСКА (ПРИОРИТЕТ СВЕРХУ ВНИЗ)
Для оптимизации кода вызывать одну и ту же функцию при нажатии разных кнопок, но с пониманием того какая кнопка жмется
Сохранение паролей и логинов, номер или название картинки, которая выбрана в файл
Чтение из файла
Копирование пароля в буфер обмена
Скрытие и показ пароля при нажатии на текст
Выпадающий список картинок с картинками сервисов, для которых сохраняется пароль
Если останется время то можно реализовать шифрование паролей в файл и их дешифрование.
*/



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val del1 : Button = findViewById(R.id.del1)
        val del2 : Button = findViewById(R.id.del2)
        val del3 : Button = findViewById(R.id.del3)
        val del4 : Button = findViewById(R.id.del4)
        val ed1 : Button = findViewById(R.id.ed1)
        val ed2 : Button = findViewById(R.id.ed2)
        val ed3 : Button = findViewById(R.id.ed3)
        val ed4 : Button = findViewById(R.id.ed4)
        val view1 : View = findViewById(R.id.v1)
        val view2 : View = findViewById(R.id.v2)
        val view3 : View = findViewById(R.id.v3)
        val view4 : View = findViewById(R.id.v4)
        val img1 : ImageView = findViewById(R.id.img1)
        val img2 : ImageView = findViewById(R.id.img2)
        val img3 : ImageView = findViewById(R.id.img3)
        val img4 : ImageView = findViewById(R.id.img4)
        val login1 : TextView = findViewById(R.id.login1)
        val login2 : TextView = findViewById(R.id.login2)
        val login3 : TextView = findViewById(R.id.login3)
        val login4 : TextView = findViewById(R.id.login4)
        val pass1 : TextView = findViewById(R.id.pass1)
        val pass2 : TextView = findViewById(R.id.pass2)
        val pass3 : TextView = findViewById(R.id.pass3)
        val pass4 : TextView = findViewById(R.id.pass4)

        //Удаление (скрытие) паролей
        del1.setOnClickListener{
            del1.isVisible = false
            ed1.isVisible = false
            view1.isVisible = false
            img1.isVisible = false
            login1.isVisible = false
            pass1.isVisible = false
            login1.text = null
            pass1.text = null
        }
        del2.setOnClickListener{
            del2.isVisible = false
            ed2.isVisible = false
            view2.isVisible = false
            img2.isVisible = false
            login2.isVisible = false
            pass2.isVisible = false
            login2.text = null
            pass2.text = null
        }
        del3.setOnClickListener {
            del3.isVisible = false
            ed3.isVisible = false
            view3.isVisible = false
            img3.isVisible = false
            login3.isVisible = false
            pass3.isVisible = false
            login3.text = null
            pass3.text = null
        }
        del4.setOnClickListener {
            del4.isVisible = false
            ed4.isVisible = false
            view4.isVisible = false
            img4.isVisible = false
            login4.isVisible = false
            pass4.isVisible = false
            login4.text = null
            pass4.text = null
        }
    }

    //Добавление (раскрытие) элементов паролей
    fun add(view: View){
        val del1 : Button = findViewById(R.id.del1)
        val del2 : Button = findViewById(R.id.del2)
        val del3 : Button = findViewById(R.id.del3)
        val del4 : Button = findViewById(R.id.del4)
        val ed1 : Button = findViewById(R.id.ed1)
        val ed2 : Button = findViewById(R.id.ed2)
        val ed3 : Button = findViewById(R.id.ed3)
        val ed4 : Button = findViewById(R.id.ed4)
        val view1 : View = findViewById(R.id.v1)
        val view2 : View = findViewById(R.id.v2)
        val view3 : View = findViewById(R.id.v3)
        val view4 : View = findViewById(R.id.v4)
        val img1 : ImageView = findViewById(R.id.img1)
        val img2 : ImageView = findViewById(R.id.img2)
        val img3 : ImageView = findViewById(R.id.img3)
        val img4 : ImageView = findViewById(R.id.img4)
        val login1 : TextView = findViewById(R.id.login1)
        val login2 : TextView = findViewById(R.id.login2)
        val login3 : TextView = findViewById(R.id.login3)
        val login4 : TextView = findViewById(R.id.login4)
        val pass1 : TextView = findViewById(R.id.pass1)
        val pass2 : TextView = findViewById(R.id.pass2)
        val pass3 : TextView = findViewById(R.id.pass3)
        val pass4 : TextView = findViewById(R.id.pass4)

        if (del1.isVisible == false){
            del1.isVisible = true
            ed1.isVisible = true
            view1.isVisible = true
            img1.isVisible = true
            login1.isVisible = true
            pass1.isVisible = true
        }
        else if (del2.isVisible == false){
            del2.isVisible = true
            ed2.isVisible = true
            view2.isVisible = true
            img2.isVisible = true
            login2.isVisible = true
            pass2.isVisible = true
        }
        else if (del3.isVisible == false){
            del3.isVisible = true
            ed3.isVisible = true
            view3.isVisible = true
            img3.isVisible = true
            login3.isVisible = true
            pass3.isVisible = true
        }
        else if (del4.isVisible == false){
            del4.isVisible = true
            ed4.isVisible = true
            view4.isVisible = true
            img4.isVisible = true
            login4.isVisible = true
            pass4.isVisible = true
        }
    }

    //dataclass для того чтобы можно было загенить пароль
    data class PasswordGeneratorOptions(
        val length: Int,
        val includeUppercase: Boolean,
        val includeLowercase: Boolean,
        val includeDigits: Boolean,
        val includeSpecialChars: Boolean
    )

    //непосредственно сам генератор паролей
    fun generatePassword(options: PasswordGeneratorOptions): String {
        val uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val lowercaseLetters = "abcdefghijklmnopqrstuvwxyz"
        val digits = "0123456789"
        val specialChars = "#$%&*()-_=+<>?:"

        var charSet = ""
        if (options.includeUppercase) charSet += uppercaseLetters
        if (options.includeLowercase) charSet += lowercaseLetters
        if (options.includeDigits) charSet += digits
        if (options.includeSpecialChars) charSet += specialChars

        require(charSet.isNotEmpty()) { "Должен быть выбран хотя бы один из пунктов" }

        return (1..options.length)
            .map { Random.nextInt(charSet.length) }
            .map(charSet::get)
            .joinToString("")
    }

    //немного костыльный метод вывода пароля, но зато можно настроить непосредственно вид пароля
    fun pswGenerator(pswNumber: Int){
        val passwordOptions = PasswordGeneratorOptions(
            length = 15,
            includeUppercase = true,
            includeLowercase = true,
            includeDigits = true,
            includeSpecialChars = true
        )
        val pass1 : TextView = findViewById(R.id.pass1)
        val pass2 : TextView = findViewById(R.id.pass2)
        val pass3 : TextView = findViewById(R.id.pass3)
        val pass4 : TextView = findViewById(R.id.pass4)

        val password = generatePassword(passwordOptions)
        //тут пока что чисто заглушка для того как можно будет определять кнопка какого из паролей была нажата,
        //мы же не хотим конкретно говнокодить и делать четыре одинаковых генератора паролей
        if (pswNumber == 1)
        {
            pass1.text = password
        }
        else if (pswNumber == 2)
        {
            pass2.text = password
        }
        else if (pswNumber == 3)
        {
            pass3.text = password
        }
        else
        {
            pass4.text = password
        }

    }
}