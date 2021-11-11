package com.xiaofu.practice

import com.xiaofu.practice.year2021.month11.MaxProfit
import com.xiaofu.practice.year2021.month11.MovesToSeat
import com.xiaofu.practice.year2021.month11.RemoveDuplicates

fun main(args : Array<String>){

//    val obj = MovesToSeat()
//    val time = obj.minMoves(intArrayOf(3,1,5), intArrayOf(2,7,4))
//    println(time.toString())

//    val obj = RemoveDuplicates()
//    obj.remove(intArrayOf(1,1,2))

    val obj = MaxProfit()
    val total = obj.total(intArrayOf())
    println("最大收益$total")
}