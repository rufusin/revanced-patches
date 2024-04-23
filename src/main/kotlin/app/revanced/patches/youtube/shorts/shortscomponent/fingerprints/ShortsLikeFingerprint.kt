package app.revanced.patches.youtube.shorts.shortscomponent.fingerprints

import app.revanced.patches.youtube.utils.resourceid.SharedResourceIdPatch.ReelRightLikeIcon
import app.revanced.util.fingerprint.LiteralValueFingerprint

object ShortsLikeFingerprint : LiteralValueFingerprint(
    returnType = "V",
    literalSupplier = { ReelRightLikeIcon }
)
