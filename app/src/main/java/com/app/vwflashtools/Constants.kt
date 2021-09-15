/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.app.vwflashtools

import java.util.*


// Message types sent from the BluetoothChatService Handler
val MESSAGE_STATE_CHANGE    = 1
val MESSAGE_TASK_CHANGE     = 2
val MESSAGE_READ            = 3
val MESSAGE_WRITE           = 4
val MESSAGE_TOAST           = 5
val MESSAGE_READ_VIN        = 6
val MESSAGE_READ_LOG        = 7

// Constants that indicate the current connection state
val STATE_ERROR         = -1 // we're doing nothing
val STATE_NONE          = 0 // we're doing nothing
val STATE_CONNECTING    = 1 // now initiating an outgoing connection
val STATE_CONNECTED     = 2 // now connected to a remote device

val TASK_NONE       = 0
val TASK_FLASHING   = 1
val TASK_LOGGING    = 2 // uploading to remote device
val TASK_RD_VIN     = 3 // download from remote device

//UUIDS
val BT_CCCD_UUID    = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb")
val BT_SERVICE_UUID = UUID.fromString("0000abf0-0000-1000-8000-00805f9b34fb")
val BT_DATA_TX_UUID = UUID.fromString("0000abf1-0000-1000-8000-00805f9b34fb")
val BT_DATA_RX_UUID = UUID.fromString("0000abf2-0000-1000-8000-00805f9b34fb")
val BT_CMD_TX_UUID  = UUID.fromString("0000abf3-0000-1000-8000-00805f9b34fb")
val BT_CMD_RX_UUID  = UUID.fromString("0000abf4-0000-1000-8000-00805f9b34fb")

//set MAX MTU SIZE
val GATT_MAX_MTU_SIZE = 64

//Intent constants
val REQUEST_ENABLE_BT = 1
val REQUEST_LOCATION_PERMISSION = 2
val REQUEST_READ_STORAGE = 3
val REQUEST_WRITE_STORAGE = 4

//Timers
val SCAN_PERIOD = 10000L

val CHANNEL_ID = "BTService"
val CHANNEL_NAME = "BTService"

//BT functions
val BT_STOP_SERVICE     = 0
val BT_START_SERVICE    = 1
val BT_DO_CONNECT       = 2
val BT_DO_DISCONNECT    = 3
val BT_DO_SEND_STATUS   = 4
val BT_DO_CHECK_VIN     = 5
val BT_DO_CHECK_PID     = 6
val BT_DO_STOP_PID      = 7

//
val BLE_HEADER_ID = 0xF1
val BLE_HEADER_TX = 0x7E0
val BLE_HEADER_RX = 0x7E8

// Command flags
val BLE_COMMAND_FLAG_PER_ENABLE     = 1
val BLE_COMMAND_FLAG_PER_CLEAR		= 2
val BLE_COMMAND_FLAG_PER_ADD		= 4
val BLE_COMMAND_FLAG_MULT_PK		= 8
val BLE_COMMAND_FLAG_MULT_END		= 16

infix fun Byte.shl(that: Int): Int = this.toInt().shl(that)
infix fun Short.shl(that: Int): Int = this.toInt().shl(that)
infix fun Byte.shr(that: Int): Int = this.toInt().shr(that)
infix fun Short.shr(that: Int): Int = this.toInt().shr(that)
infix fun Byte.and(that: Int): Int = this.toInt().and(that)
infix fun Short.and(that: Int): Int = this.toInt().and(that)