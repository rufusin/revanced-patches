package app.revanced.patches.youtube.shorts.shortscomponent.fingerprints

import app.revanced.patches.youtube.utils.resourceid.SharedResourceIdPatch.ReelDynShare
import app.revanced.util.fingerprint.LiteralValueFingerprint

object ShortsShareFingerprint : LiteralValueFingerprint(
    returnType = "V",
    literalSupplier = { ReelDynShare }
)
