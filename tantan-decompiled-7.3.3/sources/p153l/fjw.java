package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u001d\u0010\u001bR$\u0010\"\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\"\u0010(\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010$\u001a\u0004\b\u001f\u0010%\"\u0004\b&\u0010'R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010*¨\u0006-"}, m88121d2 = {"Ll/fjw;", "", "<init>", "()V", "Ll/cd00;", "call", "", "a", "(Ll/cd00;)V", "c", "()Ll/cd00;", "", "I", Constants.INAPP_DATA_TAG, "()I", "j", "(I)V", "levelType", "b", "g", BLiveStormDanmakuGiftResourceType.f45292l, "taskPriority", "", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "url", RXScreenCaptureService.KEY_INDEX, "bid", "e", "f", "setSid", "sid", "", "Z", "()Z", "k", "(Z)V", "needUrlCheckGrey", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "callback", "Companion", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class fjw {

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
    private boolean needUrlCheckGrey;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private WeakReference<cd00> callback;

    /* JADX INFO: renamed from: a */
    public final void m125917a(@Nullable cd00 call) {
        WeakReference<cd00> weakReference = this.callback;
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
    public final cd00 m125919c() {
        WeakReference<cd00> weakReference = this.callback;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getLevelType() {
        return this.levelType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getNeedUrlCheckGrey() {
        return this.needUrlCheckGrey;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getTaskPriority() {
        return this.taskPriority;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: i */
    public final void m125925i(@Nullable String str) {
        this.bid = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m125926j(int i) {
        this.levelType = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m125927k(boolean z) {
        this.needUrlCheckGrey = z;
    }

    /* JADX INFO: renamed from: l */
    public final void m125928l(int i) {
        this.taskPriority = i;
    }

    /* JADX INFO: renamed from: m */
    public final void m125929m(@Nullable String str) {
        this.url = str;
    }
}
