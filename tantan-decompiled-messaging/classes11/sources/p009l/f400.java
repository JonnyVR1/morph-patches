package p009l;

import com.p1.mobile.putong.app.PutongAct;
import immomo.com.mklibrary.core.base.ui.MKWebView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class f400 implements coq {

    /* JADX INFO: renamed from: a */
    public final e400 f12766a;

    /* JADX INFO: renamed from: b */
    public final PutongAct f12767b;

    /* JADX INFO: renamed from: c */
    public final MKWebView f12768c;

    /* JADX INFO: renamed from: d */
    public final String f12769d;

    /* JADX INFO: renamed from: e */
    public i400 f12770e;

    public f400(e400 e400Var, PutongAct putongAct, MKWebView mKWebView, String str) {
        this.f12766a = e400Var;
        this.f12767b = putongAct;
        this.f12768c = mKWebView;
        this.f12769d = str;
        this.f12770e = new i400(putongAct, mKWebView);
    }

    @Override // p009l.coq
    /* JADX INFO: renamed from: b */
    public boolean mo12183b() {
        return this.f12767b.isFinishing();
    }

    @Override // p009l.coq
    /* JADX INFO: renamed from: c */
    public PutongAct mo12184c() {
        return this.f12767b;
    }

    @Override // p009l.coq
    /* JADX INFO: renamed from: d */
    public hoq mo12185d() {
        return this.f12770e;
    }

    @Override // p009l.coq
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MKWebView mo12182a() {
        return this.f12768c;
    }

    /* JADX INFO: renamed from: f */
    public void m14203f(String str, String... strArr) {
        this.f12766a.m13719y(str, strArr);
    }

    @Override // p009l.coq
    public String getToken() {
        return this.f12769d;
    }
}
