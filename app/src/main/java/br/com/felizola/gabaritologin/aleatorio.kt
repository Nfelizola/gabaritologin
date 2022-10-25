package br.com.felizola.gabaritologin

import kotlin.random.Random

class aleatorio {
    fun sorteio(): Int {
        val nsorteado =Random.nextInt(0, 6)
        return nsorteado
    }
}