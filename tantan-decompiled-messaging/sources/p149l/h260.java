package p149l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.R$string;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, m87232d2 = {"Ll/h260;", "", "<init>", "()V", "", "muted", "", "b", "(Z)I", "a", "playing", Constants.INAPP_DATA_TAG, "c", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class h260 {

    @NotNull
    public static final h260 INSTANCE = new h260();

    private h260() {
    }

    /* JADX INFO: renamed from: a */
    public final int m129090a(boolean muted) {
        return muted ? R$string.f4834l : R$string.f4828f;
    }

    /* JADX INFO: renamed from: b */
    public final int m129091b(boolean muted) {
        return muted ? q3c0.f152409j : q3c0.f152411l;
    }

    /* JADX INFO: renamed from: c */
    public final int m129092c(boolean playing) {
        return playing ? R$string.f4832j : R$string.f4833k;
    }

    /* JADX INFO: renamed from: d */
    public final int m129093d(boolean playing) {
        return playing ? q3c0.f152406g : q3c0.f152407h;
    }
}
