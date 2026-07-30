package p153l;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e80<V extends View> extends kf2<V> implements mqk, ztf0 {

    /* JADX INFO: renamed from: q */
    public boolean f92492q;

    /* JADX INFO: renamed from: r */
    public final int f92493r;

    /* JADX INFO: renamed from: s */
    public final int f92494s;

    /* JADX INFO: renamed from: t */
    public final String f92495t;

    /* JADX INFO: renamed from: u */
    public final String f92496u;

    /* JADX INFO: renamed from: v */
    public int f92497v;

    /* JADX INFO: renamed from: w */
    public final C22508b<vxj0> f92498w;

    public e80(dum dumVar, @LayoutRes int i, BLiveBottomButton bLiveBottomButton, int i2, int i3, String str, String str2) {
        super(dumVar, i, bLiveBottomButton);
        this.f92497v = 0;
        this.f92498w = C22508b.m222767b();
        this.f92493r = i2;
        this.f92494s = i3;
        this.f92495t = str;
        this.f92496u = str2;
    }

    @Override // p153l.kf2
    @CallSuper
    /* JADX INFO: renamed from: T3 */
    public void mo119790T3() {
        this.f126234m = 2700;
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: U3 */
    public final void mo119791U3() {
        m213811F2().BottomEvent.addModelToSettingAdapter().mo199273j(this);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        m149350g4();
        m213811F2().BottomEvent.dismissSettingDialog().m199277p();
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: W3 */
    public void mo119792W3() {
        m213811F2().BottomEvent.removeModelToSettingAdapter().mo199273j(this);
    }

    @Override // p153l.mqk
    /* JADX INFO: renamed from: X1 */
    public int mo113884X1() {
        return this.f92494s;
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: Z3 */
    public String mo119793Z3() {
        return (jyb.m147479J(this.f126233l.icon) || this.f126233l.icon.size() < 3) ? "" : this.f126233l.icon.get(2);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: b4 */
    public final void mo119794b4(final boolean z) {
        l51.m152886F(this.f196919f, new Runnable() { // from class: l.d80
            @Override // java.lang.Runnable
            public final void run() {
                this.f85563a.m119797l4(z);
            }
        });
    }

    @Override // p153l.kf2
    @CallSuper
    /* JADX INFO: renamed from: d4 */
    public void mo108591d4(V v2) {
        super.mo108591d4(v2);
        this.f126232k = v2;
        v2.setOnClickListener(new View.OnClickListener() { // from class: l.c80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80172a.mo96798V3(view);
            }
        });
        V v3 = this.f126232k;
        if (v3 instanceof RedDot) {
            ((RedDot) v3).mo73321g0(mo149349f4());
            Boolean bool = (Boolean) m138856F3(new ym3(this.f126234m).m216672e(this.f126233l.url));
            if (bool == null || bool.booleanValue() || !this.f126233l.enableNewlyEffect) {
                ((RedDot) this.f126232k).mo73323O(false);
            } else {
                ((RedDot) this.f126232k).mo73323O(true);
            }
        }
        if (this.f126232k.findViewById(mdc0.f135889A5) == null || !(this.f126232k.findViewById(mdc0.f135889A5) instanceof BottomViewGroup)) {
            return;
        }
        ((BottomViewGroup) this.f126232k.findViewById(mdc0.f135889A5)).setStyle(this.f92496u);
    }

    @Override // p153l.ck2, p153l.ztf0
    public int getOrder() {
        return this.f92493r;
    }

    @Override // p153l.mqk
    public boolean isFirst() {
        return this.f92492q;
    }

    /* JADX INFO: renamed from: j4 */
    public String m119795j4() {
        BLiveBottomButton bLiveBottomButton = this.f126233l;
        return bLiveBottomButton == null ? "" : bLiveBottomButton.url;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m119796k4() {
        return this.f92497v > 0;
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m119797l4(boolean z) {
        if (z) {
            m213811F2().BottomEvent.addModelToSettingAdapter().mo199273j(this);
        } else {
            m213811F2().BottomEvent.removeModelToSettingAdapter().mo199273j(this);
            m119798m4();
        }
    }

    /* JADX INFO: renamed from: m4 */
    public void m119798m4() {
        this.f126232k = null;
        this.f92498w.onNext(vxj0.f186265a);
    }

    @Override // p153l.mqk
    /* JADX INFO: renamed from: r1 */
    public String mo113886r1() {
        return this.f92495t;
    }

    @Override // p153l.mqk
    /* JADX INFO: renamed from: z0 */
    public void mo113892z0(boolean z) {
        this.f92492q = z;
    }
}
