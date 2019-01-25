/**
 * Created by smallufo on 2019-01-25.
 */
package com.example

interface IContext<T> {

  fun getContentAsString(instance: T): String
}

