/*
 * Copyright (C) 2015 Karumi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.karumi.dividers;

import java.util.EnumSet;

/**
 * All the possible directions to move through a grid.
 */
public enum Direction {
  WEST,
  NORTH_WEST,
  NORTH,
  NORTH_EAST,
  EAST,
  SOUTH_EAST,
  SOUTH,
  SOUTH_WEST;

  public static EnumSet<Direction> ALL_NORTH = EnumSet.of(NORTH_WEST, NORTH, NORTH_EAST);
  public static EnumSet<Direction> ALL_SOUTH = EnumSet.of(SOUTH_WEST, SOUTH, SOUTH_EAST);
  public static EnumSet<Direction> ALL_WEST = EnumSet.of(SOUTH_WEST, WEST, NORTH_WEST);
  public static EnumSet<Direction> ALL_EAST = EnumSet.of(NORTH_EAST, EAST, SOUTH_EAST);
  public static EnumSet<Direction> NORTH_WEST_CORNER = EnumSet.of(WEST, NORTH_WEST, NORTH);
  public static EnumSet<Direction> NORTH_EAST_CORNER = EnumSet.of(NORTH, NORTH_EAST, EAST);
  public static EnumSet<Direction> SOUTH_EAST_CORNER = EnumSet.of(EAST, SOUTH_EAST, SOUTH);
  public static EnumSet<Direction> SOUTH_WEST_CORNER = EnumSet.of(SOUTH, SOUTH_WEST, WEST);
}
