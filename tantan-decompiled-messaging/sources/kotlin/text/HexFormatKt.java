package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"", "", "b", "(Ljava/lang/String;)Z", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class HexFormatKt {
    /* JADX INFO: renamed from: b */
    public static final boolean m93360b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.m87489e(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
