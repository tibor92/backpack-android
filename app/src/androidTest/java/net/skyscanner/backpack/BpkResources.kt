package net.skyscanner.backpack

import android.content.res.Resources
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class BpkResources {

  @Test
  fun bpkColours() {
    val appContext = InstrumentationRegistry.getTargetContext()
   assertEquals("#ff00b2d6", appContext.getResources().getString(R.color.bpkBlue500));
   assertEquals("#ff00d775", appContext.getResources().getString(R.color.bpkGreen500));
   assertEquals("#ffff5452", appContext.getResources().getString(R.color.bpkRed500));
   assertEquals("#ffffbb00", appContext.getResources().getString(R.color.bpkYellow500));
   assertEquals("#fffa488a", appContext.getResources().getString(R.color.bpkPink500));
   assertEquals("#ff817b8f", appContext.getResources().getString(R.color.bpkGray500));
   assertEquals("#ffffffff", appContext.getResources().getString(R.color.bpkWhite));
  }
}