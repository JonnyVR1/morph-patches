package p006l;

import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.CoreModule;
import l.e30;
import l.e51;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cwy implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f9893a;

    /* JADX INFO: renamed from: b */
    public int f9894b = 0;

    /* JADX INFO: renamed from: c */
    public int f9895c;

    /* JADX INFO: renamed from: d */
    public e30<Long> f9896d;

    public cwy(int i, int i2, e30<Long> e30Var) {
        this.f9893a = i;
        this.f9895c = i2;
        this.f9896d = e30Var;
    }

    /* JADX INFO: renamed from: a */
    public void m13684a() {
        e51.G(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = this.f9894b;
        int i2 = this.f9893a;
        if (i < i2 * AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) {
            this.f9896d.call(Long.valueOf((((long) i2) * 1000) - ((long) i)));
            int i3 = this.f9894b;
            int i4 = this.f9895c;
            this.f9894b = i3 + i4;
            e51.H(CoreModule.f1533b, this, i4);
        }
    }

    public void stop() {
        e51.J(this);
    }
}
