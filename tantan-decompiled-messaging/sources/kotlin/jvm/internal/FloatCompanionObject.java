package kotlin.jvm.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"Lkotlin/jvm/internal/FloatCompanionObject;", "", "<init>", "()V", "", "b", "()F", "a", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class FloatCompanionObject {

    @NotNull
    public static final FloatCompanionObject INSTANCE = new FloatCompanionObject();

    private FloatCompanionObject() {
    }

    /* JADX INFO: renamed from: a */
    public final float m87480a() {
        return Float.NEGATIVE_INFINITY;
    }

    /* JADX INFO: renamed from: b */
    public final float m87481b() {
        return Float.POSITIVE_INFINITY;
    }
}
