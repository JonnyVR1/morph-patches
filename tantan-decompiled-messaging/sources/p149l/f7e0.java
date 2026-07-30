package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Figure;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class f7e0 extends aie0 {

    /* JADX INFO: renamed from: i */
    public ViewTreeObserverOnGlobalLayoutListenerC7866b f96251i;

    /* JADX INFO: renamed from: j */
    public String f96252j;

    /* JADX INFO: renamed from: k */
    public String f96253k;

    /* JADX INFO: renamed from: l */
    public int f96254l;

    /* JADX INFO: renamed from: m */
    public int f96255m;

    /* JADX INFO: renamed from: n */
    public Figure f96256n;

    /* JADX INFO: renamed from: o */
    public double f96257o;

    /* JADX INFO: renamed from: p */
    public String f96258p;

    public f7e0(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, String str, String str2, int i, int i2, Figure figure, double d, String str3) {
        this.f96251i = viewTreeObserverOnGlobalLayoutListenerC7866b;
        this.f96252j = str;
        this.f96253k = str2;
        this.f96254l = i;
        this.f96255m = i2;
        this.f96256n = figure;
        this.f96257o = d;
        this.f96258p = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m119805C() {
        if (NullChecker.m81303a(this.f97025b)) {
            this.f97025b.call();
        }
    }

    @Override // p149l.aie0
    /* JADX INFO: renamed from: A */
    public int mo21134A() {
        NewMainAct newMainActAct = this.f96251i.act();
        if (newMainActAct == null || newMainActAct.isFinishing()) {
            if (!NullChecker.m81303a(this.f97025b)) {
                return 0;
            }
            this.f97025b.call();
            return 0;
        }
        this.f96251i.m37365u6(this.f96252j, this.f96253k, this.f96258p, this.f96254l, this.f96255m, this.f96256n, this.f96257o, new d30() { // from class: l.e7e0
            @Override // p149l.d30
            public final void call() {
                this.f89703a.m119805C();
            }
        });
        if (!NullChecker.m81303a(this.f97024a)) {
            return 5000;
        }
        this.f97024a.call();
        return 5000;
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: j */
    public int mo21138j() {
        return this.f96251i.act().hashCode();
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return this.f96251i.act();
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: o */
    public String mo21140o() {
        return MagicBubble.SEE_ANIM.getGroup();
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return MagicBubble.SEE_ANIM.getId();
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: f */
    public void mo20865f(boolean z) {
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean z) {
    }
}
