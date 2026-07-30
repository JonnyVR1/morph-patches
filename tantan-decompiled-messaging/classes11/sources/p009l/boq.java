package p009l;

import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class boq implements coq {

    /* JADX INFO: renamed from: a */
    public final PutongAct f10222a;

    /* JADX INFO: renamed from: b */
    public final WebViewX f10223b;

    /* JADX INFO: renamed from: c */
    public final String f10224c;

    /* JADX INFO: renamed from: d */
    public goq f10225d;

    public boq(PutongAct putongAct, WebViewX webViewX, String str) {
        this.f10222a = putongAct;
        this.f10223b = webViewX;
        this.f10224c = str;
        this.f10225d = new goq(putongAct, webViewX);
    }

    @Override // p009l.coq
    /* JADX INFO: renamed from: b */
    public boolean mo12183b() {
        return this.f10222a.isFinishing();
    }

    @Override // p009l.coq
    /* JADX INFO: renamed from: c */
    public PutongAct mo12184c() {
        return this.f10222a;
    }

    @Override // p009l.coq
    /* JADX INFO: renamed from: d */
    public hoq mo12185d() {
        return this.f10225d;
    }

    @Override // p009l.coq
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public WebViewX mo12182a() {
        return this.f10223b;
    }

    @Override // p009l.coq
    public String getToken() {
        return this.f10224c;
    }
}
