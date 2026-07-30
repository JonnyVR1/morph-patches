package p151v;

import android.app.Activity;
import android.widget.FrameLayout;
import p153l.gt0;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleCoverGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final C22647a f209880a;

    /* JADX INFO: renamed from: b */
    public boolean f209881b;

    /* JADX INFO: renamed from: v.SimpleCoverGuideView$a */
    public static class C22647a<T extends C22647a> {

        /* JADX INFO: renamed from: a */
        public boolean f209882a;

        /* JADX INFO: renamed from: b */
        public long f209883b;

        /* JADX INFO: renamed from: c */
        public long f209884c;

        /* JADX INFO: renamed from: d */
        public x20 f209885d;
    }

    /* JADX INFO: renamed from: b */
    public C22647a m224144b() {
        return this.f209880a;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void m224148g(boolean z) {
        if (!z && this.f209880a.f209885d != null) {
            this.f209880a.f209885d.call();
        }
        ((FrameLayout) ((Activity) getContext()).getWindow().getDecorView()).removeView(this);
    }

    /* JADX INFO: renamed from: d */
    public void m224146d() {
        mo51764e(false);
    }

    /* JADX INFO: renamed from: e */
    public void mo51764e(final boolean z) {
        if (this.f209881b) {
            if (this.f209880a.f209882a) {
                gt0.m132158d(this, this.f209880a.f209884c, gt0.m132162h(null, new Runnable() { // from class: l.uof0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f180080a.m224148g(z);
                    }
                }, null));
            } else {
                m224148g(z);
            }
            this.f209881b = false;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m224147f() {
        return this.f209881b;
    }

    public long getFadeInDuration() {
        return this.f209880a.f209883b;
    }

    public x20 getOnDismiss() {
        return this.f209880a.f209885d;
    }
}
