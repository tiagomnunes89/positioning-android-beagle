package io.usebeagle.positioning.beagle

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.DesignSystem
import io.usebeagle.positioning.R

const val TEXT_WHITE_EXTRA_LARGE  = "DesignSystem.Text.White.Extra.Large"
const val TEXT_WHITE_LARGE  = "DesignSystem.Text.White.Large"
const val TEXT_WHITE_BUTTON = "DesignSystem.Text.White.Button"
const val TEXT_WHITE_MEDIUM  = "DesignSystem.Text.White.Medium"

@BeagleComponent
class AppDesignSystem: DesignSystem()  {

    override fun textStyle(id: String): Int? {
        return when (id) {
            TEXT_WHITE_EXTRA_LARGE -> R.style.DesignSystem_Text_White_Extra_Large
            TEXT_WHITE_LARGE -> R.style.DesignSystem_Text_White_Large
            TEXT_WHITE_BUTTON -> R.style.DesignSystem_Text_White_Button
            TEXT_WHITE_MEDIUM -> R.style.DesignSystem_Text_White_Medium
            else -> R.style.Default
        }
    }

}