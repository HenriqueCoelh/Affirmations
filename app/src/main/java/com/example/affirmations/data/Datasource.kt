package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource{

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.afirmação1),
            Affirmation(R.string.afirmação2),
            Affirmation(R.string.afirmação3),
            Affirmation(R.string.afirmação4),
            Affirmation(R.string.afirmação5),
            Affirmation(R.string.afirmação6),
            Affirmation(R.string.afirmação7),
            Affirmation(R.string.afirmação8),
            Affirmation(R.string.afirmação9),
            Affirmation(R.string.afirmação10),
        )
    }
}

