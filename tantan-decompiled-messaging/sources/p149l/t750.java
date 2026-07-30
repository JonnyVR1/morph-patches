package p149l;

import com.cosmos.mdlog.MDLog;
import com.immomo.mmdns.MomoMainThreadExecutor;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/t750;", "Ljava/lang/Runnable;", "", "bid", "fileName", "Limmomo/com/mklibrary/core/base/ui/MKWebView$e;", "checkInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Limmomo/com/mklibrary/core/base/ui/MKWebView$e;)V", "", "run", "()V", "a", "Ljava/lang/String;", "getBid", "()Ljava/lang/String;", "b", "getFileName", "c", "Limmomo/com/mklibrary/core/base/ui/MKWebView$e;", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class t750 implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String bid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String fileName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final MKWebView.C14912e checkInfo;

    /* JADX INFO: renamed from: l.t750$a */
    @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m87232d2 = {"<anonymous>", "", "run"}, m87233k = 3, m87234mv = {1, 1, 16})
    public static final class RunnableC20115a implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MKWebView f168666b;

        public RunnableC20115a(MKWebView mKWebView) {
            this.f168666b = mKWebView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MDLog.m7399w("webRsa", "webView reload");
            this.f168666b.reload();
            t750.this.checkInfo.f63276b = true;
        }
    }

    public t750(@NotNull String str, @NotNull String str2, @NotNull MKWebView.C14912e c14912e) {
        str.getClass();
        str2.getClass();
        c14912e.getClass();
        this.bid = str;
        this.fileName = str2;
        this.checkInfo = c14912e;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObjectM197339e;
        try {
            WeakReference<MKWebView> weakReference = this.checkInfo.f63275a;
            if (weakReference != null && weakReference.get() != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                v750 v750VarM214871t = yhw.m214862s().m214871t(this.bid);
                if (v750VarM214871t == null || !v750VarM214871t.m197344j() || (jSONObjectM197339e = v750VarM214871t.m197339e()) == null) {
                    return;
                }
                String strM93479F = C15386d.m93479F(this.fileName, v750VarM214871t.m197337c() + File.separator, "", false, 4, null);
                if (mpj0.m155814c(v750VarM214871t.m197337c(), strM93479F, jSONObjectM197339e)) {
                    MDLog.m7400w("webRsa", "校验本地文件成功, current cost: %d ms, name: %s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), strM93479F);
                    return;
                }
                if (this.checkInfo.f63276b) {
                    MDLog.m7389d("webRsa", "already remove and reload");
                    return;
                }
                MDLog.m7400w("webRsa", "校验本地文件失败, name: %s, 将删除包", strM93479F);
                yhw.m214862s().m214866D(this.bid);
                MKWebView mKWebView = this.checkInfo.f63275a.get();
                if (mKWebView != null) {
                    MomoMainThreadExecutor.postDelayed(new Object(), new RunnableC20115a(mKWebView), 100L);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
