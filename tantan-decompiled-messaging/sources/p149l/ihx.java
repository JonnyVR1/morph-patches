package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\u0006\"\u0004\b\t\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\b\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\n¨\u0006\u000f"}, m87232d2 = {"Ll/ihx;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "channelToken", "b", Constants.INAPP_DATA_TAG, "react", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ihx {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String channelToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String react;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getChannelToken() {
        return this.channelToken;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getReact() {
        return this.react;
    }

    /* JADX INFO: renamed from: c */
    public final void m136325c(@Nullable String str) {
        this.channelToken = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m136326d(@Nullable String str) {
        this.react = str;
    }

    @NotNull
    public String toString() {
        return "MediaBuzzPair(channelToken=" + this.channelToken + ", react=" + this.react + ")";
    }
}
