package com.ajimuhlisin.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ajimuhlisin.recyclerview.adapter.AdapterMahasiswa
import com.ajimuhlisin.recyclerview.databinding.ActivityMainBinding
import com.ajimuhlisin.recyclerview.model.Mahasiswa

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listMahasiswa = ArrayList<Mahasiswa>()
        listMahasiswa.add(Mahasiswa("Thibaut Courtois",R.drawable.courtois,"Penjaga Gawang","2.00 m","Bree (Belgia)","11 Mei 1992"))
        listMahasiswa.add(Mahasiswa("Karim Benzema",R.drawable.benzema,"Penyerang","1,85 m","Lyon (Perancis)","19 Desember 1987"))
        listMahasiswa.add(Mahasiswa("Marcelo Vieira da Silva",R.drawable.marcello,"Belakang","1,74 m","Rio de Janeiro (Brasil)","12 Mei 1988"))
        listMahasiswa.add(Mahasiswa("Sergio Ramos García",R.drawable.ramos,"Belakang","1,84 m","Camas (Sevilla)","30 Maret 1986"))
        listMahasiswa.add(Mahasiswa("Zinedine Yazid Zidane",R.drawable.zidan,"Pelatih","1,85 m","Marseille (Prancis)","23 Juni 1972"))

        binding.list.adapter = AdapterMahasiswa(this,listMahasiswa,object : AdapterMahasiswa.OnClickListener{
            override fun detailData(item: Mahasiswa?) {
                TODO("Not yet implemented")
            }

        })
    }


}