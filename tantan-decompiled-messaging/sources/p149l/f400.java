package p149l;

import com.p046p1.mobile.putong.app.PutongAct;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;

/* JADX INFO: loaded from: classes11.dex */
public class f400 implements coq {

    /* JADX INFO: renamed from: a */
    public final e400 f94726a;

    /* JADX INFO: renamed from: b */
    public final PutongAct f94727b;

    /* JADX INFO: renamed from: c */
    public final MKWebView f94728c;

    /* JADX INFO: renamed from: d */
    public final String f94729d;

    /* JADX INFO: renamed from: e */
    public i400 f94730e;

    public f400(e400 e400Var, PutongAct putongAct, MKWebView mKWebView, String str) {
        this.f94726a = e400Var;
        this.f94727b = putongAct;
        this.f94728c = mKWebView;
        this.f94729d = str;
        this.f94730e = new i400(putongAct, mKWebView);
    }

    @Override // p149l.coq
    /* JADX INFO: renamed from: b */
    public boolean mo102960b() {
        return this.f94727b.isFinishing();
    }

    @Override // p149l.coq
    /* JADX INFO: renamed from: c */
    public PutongAct mo102961c() {
        return this.f94727b;
    }

    @Override // p149l.coq
    /* JADX INFO: renamed from: d */
    public hoq mo102962d() {
        return this.f94730e;
    }

    @Override // p149l.coq
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MKWebView mo102959a() {
        return this.f94728c;
    }

    /* JADX INFO: renamed from: f */
    public void m119269f(String str, String... strArr) {
        this.f94726a.m114660y(str, strArr);
    }

    @Override // p149l.coq
    public String getToken() {
        return this.f94729d;
    }
}
