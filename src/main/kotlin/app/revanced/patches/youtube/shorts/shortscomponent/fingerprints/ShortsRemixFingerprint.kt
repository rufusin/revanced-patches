package app.revanced.patches.youtube.shorts.shortscomponent.fingerprints

import app.revanced.patches.youtube.utils.resourceid.SharedResourceIdPatch.ReelDynRemix
import app.revanced.util.fingerprint.LiteralValueFingerprint

object ShortsRemixFingerprint : LiteralValueFingerprint(
    returnType = "V",
    literalSupplier = { ReelDynRemix }
)
