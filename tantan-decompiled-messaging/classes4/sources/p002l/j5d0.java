package p002l;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Ll/j5d0;", "", "", "resId", "", "picUrl", "<init>", "(ILjava/lang/String;)V", "a", "I", "b", "()I", "Ljava/lang/String;", "()Ljava/lang/String;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j5d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int resId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String picUrl;

    public /* synthetic */ j5d0(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPicUrl() {
        return this.picUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    public j5d0(int i, @Nullable String str) {
        this.resId = i;
        this.picUrl = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j5d0() {
        String str = null;
        this(0, str, 3, str);
    }
}
