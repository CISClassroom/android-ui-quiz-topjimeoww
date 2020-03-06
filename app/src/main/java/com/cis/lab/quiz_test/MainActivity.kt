package com.cis.lab.quiz_test


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listview)
        var list = mutableListOf<Model>()

        list.add(Model("นายกฤษฎา ท่าสะอาด", "603410032-9", R.drawable.m))
        list.add(Model("นายกัมพล โชติทอง", "603410034-5", R.drawable.m))
        list.add(Model("นายณัฐนนท์ ทาไธสง", "603410041-8", R.drawable.m))
        list.add(Model("นายนฤเบศร์ พระโรจน์", "603410047-6", R.drawable.m))
        list.add(Model("นายพรหมพัฒน์ ชาญโชคประเสริฐ", "603410052-3", R.drawable.m))
        list.add(Model("นายเมธาวี สารีผล", "603410057-3", R.drawable.m))
        list.add(Model("นายรัฐเขต สีเหลือง", "603410059-9", R.drawable.m))
        list.add(Model("นายรุ่งโรจน์ พลเยี่ยม", "603410060-4", R.drawable.m))
        list.add(Model("นายวิธาน วงษาบุตร", "603410061-2", R.drawable.m))
        list.add(Model("นางสาวศศิกร กอเสนาะรส", "603410063-8", R.drawable.w))
        list.add(Model("นางสาวอนันตยา โคตรศรี", "603410070-1", R.drawable.w))
        list.add(Model("นายอภิเดช นารอง", "603410071-9", R.drawable.m))
        list.add(Model("นายอุทัยพันธ์ เที่ยงโคตร", "603410073-5", R.drawable.m))
        list.add(Model("นางสาวพัชรี แอแป", "603410155-3", R.drawable.w))
        list.add(Model("นางสาวศศิธร พิมมะทา", "603410156-1", R.drawable.w))
        list.add(Model("นายสุรพร อินพิลึก", "603410157-9", R.drawable.m))
        list.add(Model("นายกฤษดา อุ่นสำโรง", "603410194-3", R.drawable.m))
        list.add(Model("นายณรงค์ศึก เตชะศรี", "603410200-4", R.drawable.m))
        list.add(Model("นายติยพล ต่อติด", "603410202-0", R.drawable.m))
        list.add(Model("นายทรัพย์ทวี เพ็ชรสาย", "603410203-8", R.drawable.m))
        list.add(Model("นางสาวธิดารัตน์ ดานะพันธ์", "603410204-6", R.drawable.w))
        list.add(Model("นายปิยทัศน์ นวกิจวัฒนา", "603410208-8", R.drawable.m))
        list.add(Model("นายพรสิน มีสีบู", "603410210-1", R.drawable.m))
        list.add(Model("นายพัชรพล ไทยมานี้", "603410211-9", R.drawable.m))
        list.add(Model("นายวงษกร พันธ์พิบูลย์", "603410213-5", R.drawable.m))
        list.add(Model("นายวรรณพงษ์ ภัททิยไพบูลย์", "603410214-3", R.drawable.m))
        list.add(Model("นายวิวัฒน์ วงษ์พิชัย", "603410217-7", R.drawable.m))
        list.add(Model("นางสาวศุภรัตน์ นพวัติ", "603410219-3", R.drawable.w))
        list.add(Model("นางสาวสิรินาถ จริยพันธ์", "603410221-6", R.drawable.w))
        list.add(Model("นายเกียรติศักดิ์ วรภาพ", "603410289-2", R.drawable.m))
        list.add(Model("นางสาวธัญสิริ ผลไสว", "603410291-5", R.drawable.w))
        list.add(Model("นางสาวอาทิตยา ฉิมมาแก้ว", "603410321-2", R.drawable.w))


        listView.adapter = Adapter(this,R.layout.row,list)


        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if (position == 0) {
                Toast.makeText(this@MainActivity, "Man Profile", Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if (position == 1) {
                Toast.makeText(this@MainActivity, "Man Profile", Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if (position == 2) {
                Toast.makeText(this@MainActivity, "Man Profile", Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 3){
                Toast.makeText(this@MainActivity, "Man Profile", Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 4){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 5){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 6){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 7){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 8){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 9){
                Toast.makeText(this@MainActivity,"Woman Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 10){
                Toast.makeText(this@MainActivity,"Woman Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 11){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 12){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 13){
                Toast.makeText(this@MainActivity,"Woman Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 14){
                Toast.makeText(this@MainActivity,"Woman Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 15){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 16){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 17){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 18){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 19){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 20){
                Toast.makeText(this@MainActivity,"Woman Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 21){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 22){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 23){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 24){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 25){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 26){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 27){
                Toast.makeText(this@MainActivity,"Woman Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 28){
                Toast.makeText(this@MainActivity,"Woman Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 29){
                Toast.makeText(this@MainActivity,"Man Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 30){
                Toast.makeText(this@MainActivity,"Woman Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 31){
                Toast.makeText(this@MainActivity,"Woman Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }
            if(position == 32){
                Toast.makeText(this@MainActivity,"Woman Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, Student1Activity::class.java)
                startActivity(changePage)
            }


        }
    }
}