package p149l;

import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 %2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u001d\u0010\u001bR$\u0010!\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001bR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#¨\u0006&"}, m87232d2 = {"Ll/dhw;", "", "<init>", "()V", "Ll/n400;", "call", "", "a", "(Ll/n400;)V", "c", "()Ll/n400;", "", "I", Constants.INAPP_DATA_TAG, "()I", RXScreenCaptureService.KEY_INDEX, "(I)V", "levelType", "b", "f", "j", "taskPriority", "", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "k", "(Ljava/lang/String;)V", "url", "h", "bid", "e", "setSid", "sid", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "callback", "Companion", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public class dhw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int levelType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int taskPriority = 500;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String url;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String bid;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String sid;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private WeakReference<n400> callback;

    /* JADX INFO: renamed from: a */
    public final void m111831a(@Nullable n400 call) {
        WeakReference<n400> weakReference = this.callback;
        if (weakReference != null && call == null) {
            if (weakReference != null) {
                weakReference.clear();
            }
            this.callback = null;
        }
        if (call != null) {
            this.callback = new WeakReference<>(call);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBid() {
        return this.bid;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final n400 m111833c() {
        WeakReference<n400> weakReference = this.callback;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getLevelType() {
        return this.levelType;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTaskPriority() {
        return this.taskPriority;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: h */
    public final void m111838h(@Nullable String str) {
        this.bid = str;
    }

    /* JADX INFO: renamed from: i */
    public final void m111839i(int i) {
        this.levelType = i;
    }

    /* JADX INFO: renamed from: j */
    public final void m111840j(int i) {
        this.taskPriority = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m111841k(@Nullable String str) {
        this.url = str;
    }
}
