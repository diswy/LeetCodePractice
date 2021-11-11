package com.xiaofu.practice.year2021.month11

import kotlin.math.max

class MaxProfit {
    fun total(prices: IntArray): Int {
        if (prices.size < 2) {
            return 0
        }
        var hold = -prices[0]
        var noHold = 0
        for (i in 1 until prices.size) {
            noHold = max(noHold, hold + prices[i])
            hold = max(hold, noHold - prices[i])
        }
        return noHold
    }

    fun total2(prices: IntArray): Int {
        if (prices.size < 2) {
            return 0
        }
        var total = 0
        for (i in 0 until prices.size - 1) {
            total += max(prices[i + 1] - prices[i], 0)
        }
        return total
    }
}