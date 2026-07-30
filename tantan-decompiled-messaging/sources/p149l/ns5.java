package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0010"}, m87232d2 = {"", "Ll/tuw;", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Ll/tuw;", "", "e", "()Ljava/lang/Void;", "Ll/yfh0;", "a", "Ll/yfh0;", "REHASH", "b", "Ll/tuw;", "MARKED_NULL", "c", "MARKED_TRUE", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class ns5 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final yfh0 f140238a = new yfh0("REHASH");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final tuw f140239b = new tuw(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final tuw f140240c = new tuw(Boolean.TRUE);

    /* JADX INFO: renamed from: d */
    public static final tuw m160760d(Object obj) {
        if (obj == null) {
            return f140239b;
        }
        return Intrinsics.m87488d(obj, Boolean.TRUE) ? f140240c : new tuw(obj);
    }

    /* JADX INFO: renamed from: e */
    public static final Void m160761e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
