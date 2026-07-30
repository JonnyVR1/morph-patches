package p002l;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import l.e51;
import l.qlf0;
import l.soj0;
import l.vwb;
import l.wnk;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class i80<V extends View> extends df2<V> implements wnk, qlf0 {

    /* JADX INFO: renamed from: q */
    public boolean f13093q;

    /* JADX INFO: renamed from: r */
    public final int f13094r;

    /* JADX INFO: renamed from: s */
    public final int f13095s;

    /* JADX INFO: renamed from: t */
    public final String f13096t;

    /* JADX INFO: renamed from: u */
    public final String f13097u;

    /* JADX INFO: renamed from: v */
    public int f13098v;

    /* JADX INFO: renamed from: w */
    public final b<soj0> f13099w;

    public i80(bsm bsmVar, @LayoutRes int i, BLiveBottomButton bLiveBottomButton, int i2, int i3, String str, String str2) {
        super(bsmVar, i, bLiveBottomButton);
        this.f13098v = 0;
        this.f13099w = b.b();
        this.f13094r = i2;
        this.f13095s = i3;
        this.f13096t = str;
        this.f13097u = str2;
    }

    @Override // p002l.df2
    @CallSuper
    /* JADX INFO: renamed from: T3 */
    public void mo11805T3() {
        this.f9198m = 2700;
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: U3 */
    public final void mo11806U3() {
        m25548F2().BottomEvent.addModelToSettingAdapter().j(this);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        m11815g4();
        m25548F2().BottomEvent.dismissSettingDialog().p();
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: W3 */
    public void mo11807W3() {
        m25548F2().BottomEvent.removeModelToSettingAdapter().j(this);
    }

    /* JADX INFO: renamed from: X1 */
    public int m15040X1() {
        return this.f13095s;
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: Z3 */
    public String mo11809Z3() {
        return (vwb.J(this.f9197l.icon) || this.f9197l.icon.size() < 3) ? "" : (String) this.f9197l.icon.get(2);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: b4 */
    public final void mo11811b4(final boolean z) {
        e51.F(this.f22037f, new Runnable() { // from class: l.h80
            @Override // java.lang.Runnable
            public final void run() {
                this.f11934a.m15043l4(z);
            }
        });
    }

    @Override // p002l.df2
    @CallSuper
    /* JADX INFO: renamed from: d4 */
    public void mo11312d4(V v) {
        super.mo11312d4(v);
        this.f9196k = v;
        v.setOnClickListener(new View.OnClickListener() { // from class: l.g80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11305a.mo10610V3(view);
            }
        });
        V v2 = this.f9196k;
        if (v2 instanceof RedDot) {
            ((RedDot) v2).mo5611g0(mo11814f4());
            Boolean bool = (Boolean) m14184F3(new yl3(this.f9198m).m26783e(this.f9197l.url));
            if (bool == null || bool.booleanValue() || !this.f9197l.enableNewlyEffect) {
                ((RedDot) this.f9196k).mo5613O(false);
            } else {
                ((RedDot) this.f9196k).mo5613O(true);
            }
        }
        if (this.f9196k.findViewById(g5c0.f10794A5) == null || !(this.f9196k.findViewById(g5c0.f10794A5) instanceof BottomViewGroup)) {
            return;
        }
        ((BottomViewGroup) this.f9196k.findViewById(g5c0.f10794A5)).setStyle(this.f13097u);
    }

    @Override // p002l.uj2
    public int getOrder() {
        return this.f13094r;
    }

    public boolean isFirst() {
        return this.f13093q;
    }

    /* JADX INFO: renamed from: j4 */
    public String m15041j4() {
        BLiveBottomButton bLiveBottomButton = this.f9197l;
        return bLiveBottomButton == null ? "" : bLiveBottomButton.url;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m15042k4() {
        return this.f13098v > 0;
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m15043l4(boolean z) {
        if (z) {
            m25548F2().BottomEvent.addModelToSettingAdapter().j(this);
        } else {
            m25548F2().BottomEvent.removeModelToSettingAdapter().j(this);
            m15044m4();
        }
    }

    /* JADX INFO: renamed from: m4 */
    public void m15044m4() {
        this.f9196k = null;
        this.f13099w.onNext(soj0.a);
    }

    /* JADX INFO: renamed from: r1 */
    public String m15045r1() {
        return this.f13096t;
    }

    /* JADX INFO: renamed from: z0 */
    public void m15046z0(boolean z) {
        this.f13093q = z;
    }
}
