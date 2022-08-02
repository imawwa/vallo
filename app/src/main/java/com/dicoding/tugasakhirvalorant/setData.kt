package com.dicoding.tugasakhirvalorant



object setData {

    val agentName = arrayOf(
        "Astra",
        "Breach",
        "Chamber",
        "Jett",
        "KillJoy",
        "Neon",
        "Raze",
        "Reyna",
        "Viper",
        "Yoru")

    val agentPhoto = intArrayOf(
        R.drawable.astra,
        R.drawable.breach,
        R.drawable.chamber,
        R.drawable.jett,
        R.drawable.killjoy,
        R.drawable.neon,
        R.drawable.raze,
        R.drawable.reyna,
        R.drawable.viper,
        R.drawable.yoru,)

    val agentRole = arrayOf(
        "Controller",
                "Initiators",
                "Sentinels",
                "Duelist",
                "Sentinels",
                "Duelist",
                "Duelist",
                "Duelist",
                "Controller",
                "Duelist",)

    val agentRealName = arrayOf(
        "Efia Danso",
               "Erik Torsten",
                "Vincent Fabron",
               "Sunwoo Han",
                "Klara Bohringer",
                "Nicole Dimaapi Valdez",
              "Tayane Alves",
             "Zyanya Mondragón",
              "Sabine Calla",
            "Ryo Kiritani",)
    val agentGender = arrayOf(
       "Female",
           "Male",
               "Male",
               "Female",
         "Female",
          "Female",
           "Female",
             "Female",
              "Female",
            "Male",)
    val agentNegara = arrayOf(
        "Ghana",
                "Swedia",
         "Perancis",
              "South Korea",
              "Jerman",
                "Filipina",
                "Brazil",
            "Mexico",
                "Amerika Serikat",
            "Jepang",)



    val deskripsi = arrayOf(
        "Agen asal Ghana, Astra, memberdayakan kekuatan semesta untuk mereka ulang medan tempur sesuka hatinya. Dengan kendali penuh atas wujud astralnya dan bakat meramal strategisnya, dia akan selalu unggul dari musuuhnya.",
        "Breach, orang bionik dari Swedia, menembakkan ledakan kinetik kuat tertarget untuk membuka jalan secara agresif menembus wilayah musuh. Kerusakan dan gangguan yang dia timbulkan memastikan pertarungan tak akan pernah adil.",
        "Berpakaian rapi dan bersenjata lengkap, desainer senjata dari Prancis, Chamber, menghalau penyerang dengan presisi yang mematikan. Dia memanfaatkan persenjataan kustomnya untuk mempertahankan barisan, menembak musuh dari jauh, dengan kontingensi yang tersusun untuk tiap rencana.",
        "Mewakili negara asalnya, Korea Selatan, gaya bertarung Jett yang tangkas dengan banyak pengelakan memungkinkannya mengambil risiko yang tak bisa dilakukan orang lain. Dia mengitari tiap pertempuran, menebas musuh sebelum mereka menyadari apa yang terjadi.",
        "Sang genius dari Jerman. Killjoy mengamankan medan perang dengan mudah menggunakan segudang penemuannya. Jika kerusakan dari peralatannya tak menghentikan musuh, debuff robot-robotnya akan mengatasinya.",
        "Agen dari Filipina, Neon, melesat maju dengan kecepatan yang mencengangkan, menyemburkan pancaran bioelektrik secepat tubuhnya menghasilkannya. Dia berlari untuk mengejutkan musuh, lalu menyerang mereka lebih cepat dari kilat.",
        "Raze membawa kemeriahan dari Brasil bersama kepribadian besar serta senapan besarnya. Dengan gaya bermain trauma benda tumpul, dia unggul dalam menyapu musuh bertahan dan mengosongkan ruang sempit dengan ledakan besar.",
        "Tertempa di jantung Meksiko, Reyna mendominasi kombat tunggal dan menjadi makin kuat tiap berhasil membunuh. Kepiawaiannya hanya terhambat oleh keahlian mentahnya, membuatnya sangat bergantung pada performa.",
        "Seorang ahli kimia dari Amerika, Viper mengerahkan sejumlah perangkat kimia beracun untuk mengendalikan medan perang dan menghalangi pandangan musuh. Jika racun tak membunuh buruannya, permainan pikirannya pasti menghabisi mereka.",
        "Agen asal Jepang Yoru melubangi realitas untuk menyusup ke wilayah musuh tanpa terlihat. Dengan bermodal tipuan dan agresi yang seimbang, dia menghabisi tiap target sebelum mereka sadar ke mana harus melihat.",

        )

    val listData : ArrayList<AgentData>
        get() {
            val list = arrayListOf<AgentData>()
            for (position in agentName.indices) {
                val agent = AgentData()
                agent.agentName= agentName[position]
                agent.agentPhoto= agentPhoto[position]
                agent.agentRole= agentRole[position]
                agent.agentGender= agentRole[position]
                agent.agentRealname= agentRealName[position]
                agent.agentNegara= agentNegara[position]
                agent.agentDeskripsi = deskripsi[position]
                list.add(agent)
            }
            return list
        }

}