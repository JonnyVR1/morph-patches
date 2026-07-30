package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0010"}, m88121d2 = {"", "Ll/sxw;", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Ll/sxw;", "", "e", "()Ljava/lang/Void;", "Ll/goh0;", "a", "Ll/goh0;", "REHASH", "b", "Ll/sxw;", "MARKED_NULL", "c", "MARKED_TRUE", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class rt5 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final goh0 f164770a = new goh0("REHASH");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final sxw f164771b = new sxw(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final sxw f164772c = new sxw(Boolean.TRUE);

    /* JADX INFO: renamed from: d */
    public static final sxw m183061d(Object obj) {
        if (obj == null) {
            return f164771b;
        }
        return Intrinsics.m88377d(obj, Boolean.TRUE) ? f164772c : new sxw(obj);
    }

    /* JADX INFO: renamed from: e */
    public static final Void m183062e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
