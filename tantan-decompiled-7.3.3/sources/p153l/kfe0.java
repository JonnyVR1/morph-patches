package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Figure;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class kfe0 extends fqe0 {

    /* JADX INFO: renamed from: i */
    public ViewTreeObserverOnGlobalLayoutListenerC8017b f126380i;

    /* JADX INFO: renamed from: j */
    public String f126381j;

    /* JADX INFO: renamed from: k */
    public String f126382k;

    /* JADX INFO: renamed from: l */
    public int f126383l;

    /* JADX INFO: renamed from: m */
    public int f126384m;

    /* JADX INFO: renamed from: n */
    public Figure f126385n;

    /* JADX INFO: renamed from: o */
    public double f126386o;

    /* JADX INFO: renamed from: p */
    public String f126387p;

    public kfe0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, String str, String str2, int i, int i2, Figure figure, double d, String str3) {
        this.f126380i = viewTreeObserverOnGlobalLayoutListenerC8017b;
        this.f126381j = str;
        this.f126382k = str2;
        this.f126383l = i;
        this.f126384m = i2;
        this.f126385n = figure;
        this.f126386o = d;
        this.f126387p = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m149508C() {
        if (NullChecker.m82486a(this.f121543b)) {
            this.f121543b.call();
        }
    }

    @Override // p153l.fqe0
    /* JADX INFO: renamed from: A */
    public int mo22133A() {
        NewMainAct newMainActAct = this.f126380i.act();
        if (newMainActAct == null || newMainActAct.isFinishing()) {
            if (!NullChecker.m82486a(this.f121543b)) {
                return 0;
            }
            this.f121543b.call();
            return 0;
        }
        this.f126380i.m38368u6(this.f126381j, this.f126382k, this.f126387p, this.f126383l, this.f126384m, this.f126385n, this.f126386o, new x20() { // from class: l.jfe0
            @Override // p153l.x20
            public final void call() {
                this.f120584a.m149508C();
            }
        });
        if (!NullChecker.m82486a(this.f121542a)) {
            return 5000;
        }
        this.f121542a.call();
        return 5000;
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: j */
    public int mo22137j() {
        return this.f126380i.act().hashCode();
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return this.f126380i.act();
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: o */
    public String mo22139o() {
        return MagicBubble.SEE_ANIM.getGroup();
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return MagicBubble.SEE_ANIM.getId();
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: f */
    public void mo21864f(boolean z) {
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean z) {
    }
}
