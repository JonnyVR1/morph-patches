package p149l;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes9.dex */
public class e3l extends a500 {

    /* JADX INFO: renamed from: J */
    public Timer f89194J;

    /* JADX INFO: renamed from: K */
    public final WeakReference<PutongAct> f89195K;

    /* JADX INFO: renamed from: l.e3l$a */
    public class C16530a extends miw {

        /* JADX INFO: renamed from: l.e3l$a$a */
        public class a extends TimerTask {
            public a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                c30.m104960b((Act) e3l.this.f89195K.get());
            }
        }

        public C16530a() {
        }

        @Override // p149l.miw
        /* JADX INFO: renamed from: e */
        public void mo43911e(WebView webView, int i, String str, String str2) {
            super.mo43911e(webView, i, str, str2);
            c30.m104960b(e3l.this.act());
        }

        @Override // p149l.miw
        /* JADX INFO: renamed from: f */
        public void mo43912f(WebView webView, String str) {
            super.mo43912f(webView, str);
            e3l.this.m114606c0();
            PutongAct putongActAct = e3l.this.act();
            if (NullChecker.m81303a(putongActAct)) {
                CoreModule.f17545c.f19639e0.m169475c7(putongActAct.getIntent().getIntExtra("extra_layer_id", -1), putongActAct.getIntent().getStringExtra("extra_layer_display"));
            }
        }

        @Override // p149l.miw
        /* JADX INFO: renamed from: g */
        public void mo43913g(WebView webView, String str, Bitmap bitmap) {
            super.mo43913g(webView, str, bitmap);
            e3l.this.f89194J = new Timer();
            e3l.this.f89194J.schedule(new a(), 7000L);
        }
    }

    public e3l(PutongAct putongAct) {
        super(putongAct);
        this.f89195K = new WeakReference<>(putongAct);
    }

    @Override // p149l.a500
    /* JADX INFO: renamed from: E */
    public void mo94978E() {
        super.mo94978E();
        this.f67601g.m87083P(new C16530a());
    }

    /* JADX INFO: renamed from: b0 */
    public void m114605b0() {
        m114606c0();
    }

    /* JADX INFO: renamed from: c0 */
    public void m114606c0() {
        if (NullChecker.m81303a(this.f89194J)) {
            this.f89194J.cancel();
            this.f89194J = null;
        }
    }
}
