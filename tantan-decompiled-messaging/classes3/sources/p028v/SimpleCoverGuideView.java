package p028v;

import android.app.Activity;
import android.widget.FrameLayout;
import l.bt0;
import p003l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SimpleCoverGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final C1325a f12583a;

    /* JADX INFO: renamed from: b */
    public boolean f12584b;

    /* JADX INFO: renamed from: v.SimpleCoverGuideView$a */
    public static class C1325a<T extends C1325a> {

        /* JADX INFO: renamed from: a */
        public boolean f12585a;

        /* JADX INFO: renamed from: b */
        public long f12586b;

        /* JADX INFO: renamed from: c */
        public long f12587c;

        /* JADX INFO: renamed from: d */
        public d30 f12588d;
    }

    /* JADX INFO: renamed from: b */
    public C1325a m11370b() {
        return this.f12583a;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void m11375g(boolean z) {
        if (!z && this.f12583a.f12588d != null) {
            this.f12583a.f12588d.call();
        }
        ((FrameLayout) ((Activity) getContext()).getWindow().getDecorView()).removeView(this);
    }

    /* JADX INFO: renamed from: d */
    public void m11372d() {
        m11373e(false);
    }

    /* JADX INFO: renamed from: e */
    public void m11373e(final boolean z) {
        if (this.f12584b) {
            if (this.f12583a.f12585a) {
                bt0.d(this, this.f12583a.f12587c, bt0.h((Runnable) null, new Runnable() { // from class: l.ngf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5897a.m11375g(z);
                    }
                }, (Runnable) null));
            } else {
                m11375g(z);
            }
            this.f12584b = false;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m11374f() {
        return this.f12584b;
    }

    public long getFadeInDuration() {
        return this.f12583a.f12586b;
    }

    public d30 getOnDismiss() {
        return this.f12583a.f12588d;
    }
}
