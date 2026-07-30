package p149l;

import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: classes11.dex */
public class boq implements coq {

    /* JADX INFO: renamed from: a */
    public final PutongAct f76538a;

    /* JADX INFO: renamed from: b */
    public final WebViewX f76539b;

    /* JADX INFO: renamed from: c */
    public final String f76540c;

    /* JADX INFO: renamed from: d */
    public goq f76541d;

    public boq(PutongAct putongAct, WebViewX webViewX, String str) {
        this.f76538a = putongAct;
        this.f76539b = webViewX;
        this.f76540c = str;
        this.f76541d = new goq(putongAct, webViewX);
    }

    @Override // p149l.coq
    /* JADX INFO: renamed from: b */
    public boolean mo102960b() {
        return this.f76538a.isFinishing();
    }

    @Override // p149l.coq
    /* JADX INFO: renamed from: c */
    public PutongAct mo102961c() {
        return this.f76538a;
    }

    @Override // p149l.coq
    /* JADX INFO: renamed from: d */
    public hoq mo102962d() {
        return this.f76541d;
    }

    @Override // p149l.coq
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public WebViewX mo102959a() {
        return this.f76539b;
    }

    @Override // p149l.coq
    public String getToken() {
        return this.f76540c;
    }
}
