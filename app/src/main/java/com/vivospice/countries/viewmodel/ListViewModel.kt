package com.vivospice.countries.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.vivospice.countries.model.Country

class ListViewModel: ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        fetchCountries()
    }

    private fun fetchCountries(){
        val mockData = listOf(Country(countryName = "CountryA"),
            Country(countryName = "CountryB"),
            Country(countryName = "CountryC"),
            Country(countryName = "CountryD"),
            Country(countryName = "CountryE"),
            Country(countryName = "CountryF"),
            Country(countryName = "CountryG"),
            Country(countryName = "CountryH"),
            Country(countryName = "CountryI"),
            Country(countryName = "CountryJ")
            )

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }
}