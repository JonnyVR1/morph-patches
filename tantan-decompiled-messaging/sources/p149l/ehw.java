package p149l;

import com.clevertap.android.sdk.Constants;
import com.sina.weibo.sdk.constant.WBConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\r\u0018\u0000 !2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, m87232d2 = {"Ll/ehw;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", Constants.INAPP_DATA_TAG, "(Z)V", "boost", "", "b", "I", "()I", "e", "(I)V", "state", "", "c", "J", "()J", "g", "(J)V", WBConstants.AUTH_PARAMS_VERSION, "Ljava/lang/String;", "getUrl", "f", "(Ljava/lang/String;)V", "url", "Companion", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class ehw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean boost;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int state = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private String url = "";

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getBoost() {
        return this.boost;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: d */
    public final void m116601d(boolean z) {
        this.boost = z;
    }

    /* JADX INFO: renamed from: e */
    public final void m116602e(int i) {
        this.state = i;
    }

    /* JADX INFO: renamed from: f */
    public final void m116603f(@NotNull String str) {
        str.getClass();
        this.url = str;
    }

    /* JADX INFO: renamed from: g */
    public final void m116604g(long j) {
        this.version = j;
    }

    @NotNull
    public String toString() {
        return "{\n          \"state\": \"" + this.state + "\",\n          \"version\": \"" + this.version + "\",\n          \"boost\": \"" + this.boost + "\",\n          \"url\": \"" + this.url + "\"\n        }";
    }
}
