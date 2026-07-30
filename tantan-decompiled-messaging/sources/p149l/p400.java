package p149l;

import immomo.com.mklibrary.core.base.p115ui.MKWebView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p400 implements ahy.InterfaceC15627b<MKWebView> {

    /* JADX INFO: renamed from: a */
    private ahy.InterfaceC15628c<MKWebView> f147028a = new C19127a();

    /* JADX INFO: renamed from: l.p400$a */
    public class C19127a implements ahy.InterfaceC15628c<MKWebView> {
        public C19127a() {
        }

        @Override // p149l.ahy.InterfaceC15628c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean mo96760a(MKWebView mKWebView) {
            if (mKWebView != null) {
                return mKWebView.m87089v0();
            }
            return false;
        }
    }

    @Override // p149l.ahy.InterfaceC15627b
    /* JADX INFO: renamed from: b */
    public ahy.InterfaceC15628c<MKWebView> mo96759b() {
        return this.f147028a;
    }
}
