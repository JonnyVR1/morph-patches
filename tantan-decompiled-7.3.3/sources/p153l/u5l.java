package p153l;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes12.dex */
public class u5l extends pd00 {

    /* JADX INFO: renamed from: J */
    public Timer f177658J;

    /* JADX INFO: renamed from: K */
    public final WeakReference<PutongAct> f177659K;

    /* JADX INFO: renamed from: l.u5l$a */
    public class C20495a extends ilw {

        /* JADX INFO: renamed from: l.u5l$a$a */
        public class a extends TimerTask {
            public a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                w20.m204487b((Act) u5l.this.f177659K.get());
            }
        }

        public C20495a() {
        }

        @Override // p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            super.mo17978e(webView, i, str, str2);
            w20.m204487b(u5l.this.act());
        }

        @Override // p153l.ilw
        /* JADX INFO: renamed from: f */
        public void mo17979f(WebView webView, String str) {
            super.mo17979f(webView, str);
            u5l.this.m194611c0();
            PutongAct putongActAct = u5l.this.act();
            if (NullChecker.m82486a(putongActAct)) {
                CoreModule.f18264c.f20381e0.m116548c7(putongActAct.getIntent().getIntExtra("extra_layer_id", -1), putongActAct.getIntent().getStringExtra("extra_layer_display"));
            }
        }

        @Override // p153l.ilw
        /* JADX INFO: renamed from: g */
        public void mo17980g(WebView webView, String str, Bitmap bitmap) {
            super.mo17980g(webView, str, bitmap);
            u5l.this.f177658J = new Timer();
            u5l.this.f177658J.schedule(new a(), 7000L);
        }
    }

    public u5l(PutongAct putongAct) {
        super(putongAct);
        this.f177659K = new WeakReference<>(putongAct);
    }

    @Override // p153l.pd00
    /* JADX INFO: renamed from: E */
    public void mo171724E() {
        super.mo171724E();
        this.f151655g.m17925h0(new C20495a());
    }

    /* JADX INFO: renamed from: b0 */
    public void m194610b0() {
        m194611c0();
    }

    /* JADX INFO: renamed from: c0 */
    public void m194611c0() {
        if (NullChecker.m82486a(this.f177658J)) {
            this.f177658J.cancel();
            this.f177658J = null;
        }
    }
}
