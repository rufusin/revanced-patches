package app.revanced.patches.youtube.shorts.shortscomponent.fingerprints

import app.revanced.patches.youtube.utils.resourceid.SharedResourceIdPatch.RightComment
import app.revanced.util.fingerprint.LiteralValueFingerprint

object ShortsCommentFingerprint : LiteralValueFingerprint(
    returnType = "V",
    literalSupplier = { RightComment }
)
