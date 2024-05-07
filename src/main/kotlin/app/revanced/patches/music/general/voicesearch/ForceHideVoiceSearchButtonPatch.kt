package app.revanced.patches.music.general.voicesearch

import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.shared.patch.voicesearch.AbstractVoiceSearchButtonPatch

@Patch(
    name = "Force hide voice search button",
    description = "Force to hide voice search button in search bar.",
    compatiblePackages = [CompatiblePackage("com.google.android.apps.youtube.music")],
    use = false
)
@Suppress("unused")
object VoiceSearchButtonPatch : AbstractVoiceSearchButtonPatch(
    arrayOf("search_toolbar_view.xml"),
    arrayOf("height", "width")
)
