/*
 * Copyright 2017 Dennis Vriend
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.dnvriend

import org.sameersingh.scalaplot.Implicits._
import org.sameersingh.scalaplot.XYChart

object Sin extends App {
  val x = 0.0 until 2.0 * math.Pi by 0.1
  val sin: Double => Double = math.sin
  val cos: Double => Double = math.cos
  val tan: Double => Double = math.tan
  val chart: XYChart = xyChart(x -> (sin, cos, tan))
  output(GUI, chart)
}