package p153l;

import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.app.PutongAct;

/* JADX INFO: loaded from: classes10.dex */
public class xc00 implements bqq {

    /* JADX INFO: renamed from: a */
    public final wc00 f193245a;

    /* JADX INFO: renamed from: b */
    public final PutongAct f193246b;

    /* JADX INFO: renamed from: c */
    public final MKWebView f193247c;

    /* JADX INFO: renamed from: d */
    public final String f193248d;

    /* JADX INFO: renamed from: e */
    public ad00 f193249e;

    public xc00(wc00 wc00Var, PutongAct putongAct, MKWebView mKWebView, String str) {
        this.f193245a = wc00Var;
        this.f193246b = putongAct;
        this.f193247c = mKWebView;
        this.f193248d = str;
        this.f193249e = new ad00(putongAct, mKWebView);
    }

    @Override // p153l.bqq
    /* JADX INFO: renamed from: b */
    public boolean mo99542b() {
        return this.f193246b.isFinishing();
    }

    @Override // p153l.bqq
    /* JADX INFO: renamed from: c */
    public PutongAct mo99543c() {
        return this.f193246b;
    }

    @Override // p153l.bqq
    /* JADX INFO: renamed from: d */
    public hqq mo99544d() {
        return this.f193249e;
    }

    @Override // p153l.bqq
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MKWebView mo99541a() {
        return this.f193247c;
    }

    /* JADX INFO: renamed from: f */
    public void m210086f(String str, String... strArr) {
        this.f193245a.m205739G(str, strArr);
    }

    @Override // p153l.bqq
    public String getToken() {
        return this.f193248d;
    }
}
