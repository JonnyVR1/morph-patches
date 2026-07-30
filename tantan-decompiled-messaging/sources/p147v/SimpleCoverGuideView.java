package p147v;

import android.app.Activity;
import android.widget.FrameLayout;
import p149l.bt0;
import p149l.d30;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleCoverGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final C22532a f208958a;

    /* JADX INFO: renamed from: b */
    public boolean f208959b;

    /* JADX INFO: renamed from: v.SimpleCoverGuideView$a */
    public static class C22532a<T extends C22532a> {

        /* JADX INFO: renamed from: a */
        public boolean f208960a;

        /* JADX INFO: renamed from: b */
        public long f208961b;

        /* JADX INFO: renamed from: c */
        public long f208962c;

        /* JADX INFO: renamed from: d */
        public d30 f208963d;
    }

    /* JADX INFO: renamed from: b */
    public C22532a m222898b() {
        return this.f208958a;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void m222902g(boolean z) {
        if (!z && this.f208958a.f208963d != null) {
            this.f208958a.f208963d.call();
        }
        ((FrameLayout) ((Activity) getContext()).getWindow().getDecorView()).removeView(this);
    }

    /* JADX INFO: renamed from: d */
    public void m222900d() {
        mo50581e(false);
    }

    /* JADX INFO: renamed from: e */
    public void mo50581e(final boolean z) {
        if (this.f208959b) {
            if (this.f208958a.f208960a) {
                bt0.m103731d(this, this.f208958a.f208962c, bt0.m103735h(null, new Runnable() { // from class: l.ngf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f138869a.m222902g(z);
                    }
                }, null));
            } else {
                m222902g(z);
            }
            this.f208959b = false;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m222901f() {
        return this.f208959b;
    }

    public long getFadeInDuration() {
        return this.f208958a.f208961b;
    }

    public d30 getOnDismiss() {
        return this.f208958a.f208963d;
    }
}
