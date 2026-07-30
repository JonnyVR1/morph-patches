package p006l;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import l.a500;
import l.c30;
import l.miw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class e3l extends a500 {

    /* JADX INFO: renamed from: J */
    public Timer f10746J;

    /* JADX INFO: renamed from: K */
    public final WeakReference<PutongAct> f10747K;

    /* JADX INFO: renamed from: l.e3l$a */
    public class C0664a extends miw {

        /* JADX INFO: renamed from: l.e3l$a$a */
        public class a extends TimerTask {
            public a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                c30.b((Act) e3l.this.f10747K.get());
            }
        }

        public C0664a() {
        }

        /* JADX INFO: renamed from: e */
        public void m14392e(WebView webView, int i, String str, String str2) {
            super.e(webView, i, str, str2);
            c30.b(e3l.this.p());
        }

        /* JADX INFO: renamed from: f */
        public void m14393f(WebView webView, String str) {
            super.f(webView, str);
            e3l.this.m14391c0();
            Act actP = e3l.this.p();
            if (NullChecker.a(actP)) {
                CoreModule.f1534c.f3628e0.m21438c7(actP.getIntent().getIntExtra("extra_layer_id", -1), actP.getIntent().getStringExtra("extra_layer_display"));
            }
        }

        /* JADX INFO: renamed from: g */
        public void m14394g(WebView webView, String str, Bitmap bitmap) {
            super.g(webView, str, bitmap);
            e3l.this.f10746J = new Timer();
            e3l.this.f10746J.schedule(new a(), 7000L);
        }
    }

    public e3l(PutongAct putongAct) {
        super(putongAct);
        this.f10747K = new WeakReference<>(putongAct);
    }

    /* JADX INFO: renamed from: E */
    public void m14389E() {
        super.E();
        ((a500) this).g.P(new C0664a());
    }

    /* JADX INFO: renamed from: b0 */
    public void m14390b0() {
        m14391c0();
    }

    /* JADX INFO: renamed from: c0 */
    public void m14391c0() {
        if (NullChecker.a(this.f10746J)) {
            this.f10746J.cancel();
            this.f10746J = null;
        }
    }
}
