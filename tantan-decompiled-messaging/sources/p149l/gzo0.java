package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0004\b\u0012\u0010\u0005¨\u0006\u0014"}, m87232d2 = {"Ll/gzo0;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setText", "", "b", "Z", "()Z", Constants.INAPP_DATA_TAG, "(Z)V", "enable", "e", Constants.KEY_KEY, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class gzo0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean enable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public String key;

    public gzo0(@NotNull String str) {
        str.getClass();
        this.text = str;
        this.enable = true;
        this.key = "";
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: d */
    public final void m128907d(boolean z) {
        this.enable = z;
    }

    /* JADX INFO: renamed from: e */
    public final void m128908e(@NotNull String str) {
        str.getClass();
        this.key = str;
    }
}
