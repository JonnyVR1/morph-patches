package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.R$string;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, m88121d2 = {"Ll/ma60;", "", "<init>", "()V", "", "muted", "", "b", "(Z)I", "a", "playing", Constants.INAPP_DATA_TAG, "c", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ma60 {

    @NotNull
    public static final ma60 INSTANCE = new ma60();

    private ma60() {
    }

    /* JADX INFO: renamed from: a */
    public final int m157637a(boolean muted) {
        return muted ? R$string.f4871l : R$string.f4865f;
    }

    /* JADX INFO: renamed from: b */
    public final int m157638b(boolean muted) {
        return muted ? wbc0.f188237j : wbc0.f188239l;
    }

    /* JADX INFO: renamed from: c */
    public final int m157639c(boolean playing) {
        return playing ? R$string.f4869j : R$string.f4870k;
    }

    /* JADX INFO: renamed from: d */
    public final int m157640d(boolean playing) {
        return playing ? wbc0.f188234g : wbc0.f188235h;
    }
}
