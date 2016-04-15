package com.devshorts.data.typetag2

object TinyType {
  type Tagged[U] = { type Tag = U }
  
  trait TinyWorkId
  type workId = String with Tagged[TinyWorkId]
  def WorkId(rawType: String): workId = rawType.asInstanceOf[workId]

  trait TinyFunId
  type funId = Int with Tagged[TinyFunId]
  def FunId(rawType: Int): funId = rawType.asInstanceOf[funId]

  trait TinyBarId
  type barId = Int with Tagged[TinyBarId]
  def BarId(rawType: Int): barId = rawType.asInstanceOf[barId]

  trait TinyTableId
  type tableId = java.util.UUID with Tagged[TinyTableId]
  def TableId(rawType: java.util.UUID): tableId = rawType.asInstanceOf[tableId]
}