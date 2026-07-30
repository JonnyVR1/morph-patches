package p149l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Ll/g31;", j6f.GPS_MEASUREMENT_INTERRUPTED, "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "b", "()Ljava/lang/Object;", "expectedValue", Constants.KEY_NEW_VALUE, "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "base", "lifecycle-common"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class g31<V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AtomicReference<V> base;

    public g31(V v2) {
        this.base = new AtomicReference<>(v2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m124196a(V expectedValue, V newValue) {
        return f31.m119248a(this.base, expectedValue, newValue);
    }

    /* JADX INFO: renamed from: b */
    public final V m124197b() {
        return this.base.get();
    }
}
