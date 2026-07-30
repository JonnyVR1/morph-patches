package kotlin.uuid;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.uuid.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0011\u001a\u00020\f*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Lkotlin/uuid/Uuid;", "uuid", "", "b", "(Lkotlin/uuid/Uuid;)Ljava/lang/Object;", "", "", "dst", "", "dstOffset", "startIndex", "endIndex", "", "a", "(J[BIII)V", FirebaseAnalytics.Param.INDEX, "value", "c", "([BIJ)V", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/uuid/UuidKt")
@SourceDebugExtension
public class C15392a {
    @ExperimentalUuidApi
    /* JADX INFO: renamed from: a */
    public static final void m93595a(long j, @NotNull byte[] bArr, int i, int i2, int i3) {
        bArr.getClass();
        C15393b.m93598d(j, bArr, i, i2, i3);
    }

    @ExperimentalUuidApi
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Object m93596b(@NotNull Uuid uuid) {
        uuid.getClass();
        return new UuidSerialized(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @ExperimentalUuidApi
    /* JADX INFO: renamed from: c */
    public static final void m93597c(@NotNull byte[] bArr, int i, long j) {
        bArr.getClass();
        C15393b.m93599e(bArr, i, j);
    }
}
