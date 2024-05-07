package app.revanced.patches.youtube.shorts.shortscomponent.fingerprints

import app.revanced.patches.youtube.utils.resourceid.SharedResourceIdPatch.ReelRightDislikeIcon
import app.revanced.util.fingerprint.LiteralValueFingerprint

object ShortsDislikeFingerprint : LiteralValueFingerprint(
    returnType = "V",
    literalSupplier = { ReelRightDislikeIcon }
)
