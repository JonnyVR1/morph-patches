package p009l;

import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p000p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Figure;
import com.tantanapp.common.utils.NullChecker;
import l.aie0;
import l.d30;
import l.fdb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class f7e0 extends aie0 {

    /* JADX INFO: renamed from: i */
    public ViewTreeObserverOnGlobalLayoutListenerC0030b f12846i;

    /* JADX INFO: renamed from: j */
    public String f12847j;

    /* JADX INFO: renamed from: k */
    public String f12848k;

    /* JADX INFO: renamed from: l */
    public int f12849l;

    /* JADX INFO: renamed from: m */
    public int f12850m;

    /* JADX INFO: renamed from: n */
    public Figure f12851n;

    /* JADX INFO: renamed from: o */
    public double f12852o;

    /* JADX INFO: renamed from: p */
    public String f12853p;

    public f7e0(ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b, String str, String str2, int i, int i2, Figure figure, double d, String str3) {
        this.f12846i = viewTreeObserverOnGlobalLayoutListenerC0030b;
        this.f12847j = str;
        this.f12848k = str2;
        this.f12849l = i;
        this.f12850m = i2;
        this.f12851n = figure;
        this.f12852o = d;
        this.f12853p = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m14306C() {
        if (NullChecker.a(((fdb0) this).b)) {
            ((fdb0) this).b.call();
        }
    }

    /* JADX INFO: renamed from: A */
    public int m14307A() {
        NewMainAct newMainActAct = this.f12846i.act();
        if (newMainActAct == null || newMainActAct.isFinishing()) {
            if (!NullChecker.a(((fdb0) this).b)) {
                return 0;
            }
            ((fdb0) this).b.call();
            return 0;
        }
        this.f12846i.m1334u6(this.f12847j, this.f12848k, this.f12853p, this.f12849l, this.f12850m, this.f12851n, this.f12852o, new d30() { // from class: l.e7e0
            public final void call() {
                this.f12442a.m14306C();
            }
        });
        if (!NullChecker.a(((fdb0) this).a)) {
            return 5000;
        }
        ((fdb0) this).a.call();
        return 5000;
    }

    /* JADX INFO: renamed from: j */
    public int m14309j() {
        return this.f12846i.act().hashCode();
    }

    /* JADX INFO: renamed from: m */
    public Act m14310m() {
        return this.f12846i.act();
    }

    /* JADX INFO: renamed from: o */
    public String m14312o() {
        return MagicBubble.SEE_ANIM.getGroup();
    }

    /* JADX INFO: renamed from: p */
    public String m14313p() {
        return MagicBubble.SEE_ANIM.getId();
    }

    /* JADX INFO: renamed from: f */
    public void m14308f(boolean z) {
    }

    /* JADX INFO: renamed from: n */
    public void m14311n(boolean z) {
    }
}
