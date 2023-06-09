package com.example.tiptime

import com.example.tipapp.calculateTip
import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.lang.NumberFormatException
import java.text.NumberFormat

class TipCalculatorTest {
    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}