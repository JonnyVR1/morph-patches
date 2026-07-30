package p153l;

import com.hellogroup.p036mk.business.base.p037ui.MKWebView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ed00 implements xpy.InterfaceC21413b<MKWebView> {

    /* JADX INFO: renamed from: a */
    private xpy.InterfaceC21414c<MKWebView> f93124a = new C16752a();

    /* JADX INFO: renamed from: l.ed00$a */
    public class C16752a implements xpy.InterfaceC21414c<MKWebView> {
        public C16752a() {
        }

        @Override // p153l.xpy.InterfaceC21414c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean mo120415a(MKWebView mKWebView) {
            if (mKWebView != null) {
                return mKWebView.mo17920e();
            }
            return false;
        }
    }

    @Override // p153l.xpy.InterfaceC21413b
    /* JADX INFO: renamed from: b */
    public xpy.InterfaceC21414c<MKWebView> mo120414b() {
        return this.f93124a;
    }
}
