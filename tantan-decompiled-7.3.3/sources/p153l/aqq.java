package p153l;

import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: classes10.dex */
public class aqq implements bqq {

    /* JADX INFO: renamed from: a */
    public final PutongAct f72829a;

    /* JADX INFO: renamed from: b */
    public final WebViewX f72830b;

    /* JADX INFO: renamed from: c */
    public final String f72831c;

    /* JADX INFO: renamed from: d */
    public gqq f72832d;

    public aqq(PutongAct putongAct, WebViewX webViewX, String str) {
        this.f72829a = putongAct;
        this.f72830b = webViewX;
        this.f72831c = str;
        this.f72832d = new gqq(putongAct, webViewX);
    }

    @Override // p153l.bqq
    /* JADX INFO: renamed from: b */
    public boolean mo99542b() {
        return this.f72829a.isFinishing();
    }

    @Override // p153l.bqq
    /* JADX INFO: renamed from: c */
    public PutongAct mo99543c() {
        return this.f72829a;
    }

    @Override // p153l.bqq
    /* JADX INFO: renamed from: d */
    public hqq mo99544d() {
        return this.f72832d;
    }

    @Override // p153l.bqq
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public WebViewX mo99541a() {
        return this.f72830b;
    }

    @Override // p153l.bqq
    public String getToken() {
        return this.f72831c;
    }
}
