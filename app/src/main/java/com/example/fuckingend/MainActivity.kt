package com.example.fuckingend

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import kotlin.random.Random


/*TODO: ЕСЛИ КТО-ТО ЧТО-ЛИБО ДЕЛАЕТ ХОТЯ БЫ ЧТО-НИБУДЬ ИЗ ПРОПИСАННОГО СНИЗУ СПИСКА (ПРИОРИТЕТ СВЕРХУ ВНИЗ)
Сохранение паролей и логинов, номер или название картинки, которая выбрана в базу данных room https://developer.android.com/training/data-storage/room/
Чтение из бд и занос информации в соответствующее поле
Если останется время то можно реализовать шифрование паролей в файл и их дешифрование.
*/

//пупупуупупупупууппупупу
//пурупурупам параперепабам

class MainActivity : AppCompatActivity() {


    @SuppressLint("UseCompatLoadingForDrawables")
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
        val pass1 : EditText = findViewById(R.id.pass1)
        val pass2 : EditText = findViewById(R.id.pass2)
        val pass3 : EditText = findViewById(R.id.pass3)
        val pass4 : EditText = findViewById(R.id.pass4)
        val check1: CheckBox = findViewById(R.id.check1)
        val check2: CheckBox = findViewById(R.id.check2)
        val check3: CheckBox = findViewById(R.id.check3)
        val check4: CheckBox = findViewById(R.id.check4)

        menu() //Вызов функции всплывающего меню
        showpassword()

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
            check1.isVisible = false
            img1.setImageDrawable(getDrawable(R.drawable.ic_launcher_background))
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
            check2.isVisible = false
            img2.setImageDrawable(getDrawable(R.drawable.ic_launcher_background))
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
            check3.isVisible = false
            img3.setImageDrawable(getDrawable(R.drawable.ic_launcher_background))
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
            check4.isVisible = false
            img4.setImageDrawable(getDrawable(R.drawable.ic_launcher_background))
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
        val check1: CheckBox = findViewById(R.id.check1)
        val check2: CheckBox = findViewById(R.id.check2)
        val check3: CheckBox = findViewById(R.id.check3)
        val check4: CheckBox = findViewById(R.id.check4)

        if (del1.isVisible == false){
            del1.isVisible = true
            ed1.isVisible = true
            view1.isVisible = true
            img1.isVisible = true
            login1.isVisible = true
            pass1.isVisible = true
            check1.isVisible = true
        }
        else if (del2.isVisible == false){
            del2.isVisible = true
            ed2.isVisible = true
            view2.isVisible = true
            img2.isVisible = true
            login2.isVisible = true
            pass2.isVisible = true
            check2.isVisible = true
        }
        else if (del3.isVisible == false){
            del3.isVisible = true
            ed3.isVisible = true
            view3.isVisible = true
            img3.isVisible = true
            login3.isVisible = true
            pass3.isVisible = true
            check3.isVisible = true
        }
        else if (del4.isVisible == false){
            del4.isVisible = true
            ed4.isVisible = true
            view4.isVisible = true
            img4.isVisible = true
            login4.isVisible = true
            pass4.isVisible = true
            check4.isVisible = true
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
    fun pswGenerator(pswNumber: EditText){
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

        //теперь не заглушка, пароли генерируются
        if (pswNumber == pass1)
        {
            pass1.text = password
        }
        else if (pswNumber == pass2)
        {
            pass2.text = password
        }
        else if (pswNumber == pass3)
        {
            pass3.text = password
        }
        else
        {
            pass4.text = password
        }
    }
    //Появление меню у каждой кнопки по нажатию на каждую
    fun menu(){
        val ed1 : Button = findViewById(R.id.ed1)
        val ed2 : Button = findViewById(R.id.ed2)
        val ed3 : Button = findViewById(R.id.ed3)
        val ed4 : Button = findViewById(R.id.ed4)

        val login1 : EditText = findViewById(R.id.login1)
        val login2 : EditText = findViewById(R.id.login2)
        val login3 : EditText = findViewById(R.id.login3)
        val login4 : EditText = findViewById(R.id.login4)

        val img1 : ImageView = findViewById(R.id.img1)
        val img2 : ImageView = findViewById(R.id.img2)
        val img3 : ImageView = findViewById(R.id.img3)
        val img4 : ImageView = findViewById(R.id.img4)

        val pass1 : EditText = findViewById(R.id.pass1)
        val pass2 : EditText = findViewById(R.id.pass2)
        val pass3 : EditText = findViewById(R.id.pass3)
        val pass4 : EditText = findViewById(R.id.pass4)

        ed1.setOnClickListener {
            showMenu(b = ed1,e=login1,pass=pass1, image=img1)
        }
        ed2.setOnClickListener {
            showMenu(b = ed2,e=login2,pass=pass2, image=img2)
        }
        ed3.setOnClickListener {
            showMenu(b = ed3,e=login3,pass=pass3, image=img3)
        }
        ed4.setOnClickListener {
            showMenu(b = ed4,e=login4,pass=pass4, image=img4)
        }

    }
    //Функция для появления всплывающего меню
    fun showMenu(b: Button, e: EditText, pass: EditText, image: ImageView){
        val menu = androidx.appcompat.widget.PopupMenu(this,b)
        menu.inflate(R.menu.menu)
        menu.setOnMenuItemClickListener{
            when(it.itemId){
                R.id.generate -> {
                    pswGenerator(pass)
                    true
                }
                R.id.change_icon -> {
                    showicons(i=image)
                    true
                }
                R.id.login -> {
                    e.requestFocus()
                    true
                }
                else -> true
            }
        }
        menu.show()
    }
    //Появление всплываюшего меню со списком названий иконок при выборе пункта "Сменить иконку"
    //В зависимости от выбора той или иной иконки она соответственно меняется
    fun showicons(i: ImageView){
        val icons = androidx.appcompat.widget.PopupMenu(this,i)
        icons.inflate(R.menu.icons)
        icons.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.discord -> {
                    i.setImageDrawable(getDrawable(R.drawable.discord))
                    true
                }
                R.id.github -> {
                    i.setImageDrawable(getDrawable(R.drawable.github))
                    true
                }
                R.id.google -> {
                    i.setImageDrawable(getDrawable(R.drawable.google))
                    true
                }
                R.id.microsoft -> {
                    i.setImageDrawable(getDrawable(R.drawable.microsoft))
                    true
                }
                R.id.steam -> {
                    i.setImageDrawable(getDrawable(R.drawable.steam))
                    true
                }
                R.id.telegram -> {
                    i.setImageDrawable(getDrawable(R.drawable.telegram))
                    true
                }
                R.id.vk -> {
                    i.setImageDrawable(getDrawable(R.drawable.vk))
                    true
                }
                R.id.x -> {
                    i.setImageDrawable(getDrawable(R.drawable.x))
                    true
                }
                R.id.yandex -> {
                    i.setImageDrawable(getDrawable(R.drawable.yandex))
                    true
                }
                else -> true
            }
        }
        icons.show()
    }
    //Чтобы в onCreate не писать несколько раз однотипный код я решил объединить все в одну функцию
    //Функция показа/скрытия паролей с помощью checkbox
    //Вид точек в else отличается от изначального, но думаю не сильно страшно
    fun showpassword(){
        val pass1 : EditText = findViewById(R.id.pass1)
        val pass2 : EditText = findViewById(R.id.pass2)
        val pass3 : EditText = findViewById(R.id.pass3)
        val pass4 : EditText = findViewById(R.id.pass4)

        val check1: CheckBox = findViewById(R.id.check1)
        val check2: CheckBox = findViewById(R.id.check2)
        val check3: CheckBox = findViewById(R.id.check3)
        val check4: CheckBox = findViewById(R.id.check4)

        check1.setOnClickListener {
            if(check1.isChecked){
                pass1.inputType = 1
            }
            else{
                pass1.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
        }
        check2.setOnClickListener {
            if(check2.isChecked){
                pass2.inputType = 1
            }
            else{
                pass2.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
        }
        check3.setOnClickListener {
            if(check3.isChecked){
                pass3.inputType = 1
            }
            else{
                pass3.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
        }
        check4.setOnClickListener {
            if(check4.isChecked){
                pass4.inputType = 1
            }
            else{
                pass4.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
        }
    }
}