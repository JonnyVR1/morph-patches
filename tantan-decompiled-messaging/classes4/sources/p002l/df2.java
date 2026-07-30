package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.tantanapp.common.data.DbObject;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class df2<V extends View> extends uj2<ho2, pat> {

    /* JADX INFO: renamed from: o */
    public static final int f9193o = t100.d(44.0f);

    /* JADX INFO: renamed from: p */
    public static final int f9194p = t100.d(38.0f);

    /* JADX INFO: renamed from: j */
    public String f9195j;

    /* JADX INFO: renamed from: k */
    public V f9196k;

    /* JADX INFO: renamed from: l */
    public final BLiveBottomButton f9197l;

    /* JADX INFO: renamed from: m */
    public int f9198m;

    /* JADX INFO: renamed from: n */
    @LayoutRes
    public final int f9199n;

    public df2(bsm bsmVar, @LayoutRes int i, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar);
        this.f9197l = bLiveBottomButton;
        this.f9199n = i;
        m11813e4(String.valueOf(bLiveBottomButton.id));
        mo11805T3();
    }

    @Override // p002l.uj2
    /* JADX INFO: renamed from: M3 */
    public final String getItemType() {
        return mo10613X3().name();
    }

    /* JADX INFO: renamed from: T */
    public void mo10607T() {
        super.T();
        mo11806U3();
    }

    /* JADX INFO: renamed from: T3 */
    public void mo11805T3() {
        this.f9198m = 800;
        V v = (V) this.f22037f.inflater().inflate(this.f9199n, (ViewGroup) null);
        this.f9196k = v;
        v.setOnClickListener(new View.OnClickListener() { // from class: l.cf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8623a.mo10610V3(view);
            }
        });
        V v2 = this.f9196k;
        if (v2 instanceof RedDot) {
            ((RedDot) v2).mo5611g0(mo11814f4());
        }
    }

    /* JADX INFO: renamed from: U3 */
    public void mo11806U3() {
        mo11312d4(this.f9196k);
        m23501L3(this.f9196k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        m11815g4();
        if (!(view instanceof RedDot) || TEnum.equals(mo10613X3(), "settingButton")) {
            return;
        }
        ((RedDot) view).mo5611g0(false);
    }

    /* JADX INFO: renamed from: W3 */
    public void mo11807W3() {
        m23505R3(this.f9196k);
    }

    /* JADX INFO: renamed from: X3 */
    public abstract BLiveButtonType mo10613X3();

    /* JADX INFO: renamed from: Y3 */
    public String m11808Y3() {
        return this.f9195j;
    }

    /* JADX INFO: renamed from: Z3 */
    public String mo11809Z3() {
        return (vwb.J(this.f9197l.icon) || this.f9197l.icon.size() < 2) ? "" : (String) this.f9197l.icon.get(1);
    }

    /* JADX INFO: renamed from: a4 */
    public View mo11810a4() {
        return this.f9196k;
    }

    /* JADX INFO: renamed from: b4 */
    public void mo11811b4(boolean z) {
        V v = this.f9196k;
        if (v != null) {
            xdl0.M(v, z);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m11812c4() {
        m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(800).m25610e(this.f9197l.url).m25608c());
    }

    @CallSuper
    /* JADX INFO: renamed from: d4 */
    public void mo11312d4(V v) {
        m11816h4();
    }

    /* JADX INFO: renamed from: e4 */
    public void m11813e4(String str) {
        this.f9195j = str;
    }

    /* JADX INFO: renamed from: f4 */
    public boolean mo11814f4() {
        if (TEnum.equals(mo10613X3(), "settingButton")) {
            return false;
        }
        return ((Boolean) m14184F3(new ujc0(this.f9198m).m23509e(this.f9197l.url))).booleanValue() && !((Boolean) m14184F3(new yl3(this.f9198m).m26783e(this.f9197l.url))).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: g4 */
    public final void m11815g4() {
        if (m25547E2() == 0 || m25547E2().m14582l0() == null || this.f9197l == null) {
            return;
        }
        m25548F2().BottomEvent.markButtonClicked().j(this.f9197l);
        zvf0.u("e_live_button", mo21430R2(), new j760[]{vwb.Y("liveId", m25547E2().m17235k()), vwb.Y("live_anchor_id", ((DbObject) m25547E2().m14582l0()).id), vwb.Y("live_button_site", Integer.valueOf(this instanceof i80 ? 1 : 0)), vwb.Y("live_button_type", this.f9197l.type), vwb.Y("roomId", m25547E2().m17239o())});
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: h4 */
    public final void m11816h4() {
        if (m25547E2() == 0 || m25547E2().m14582l0() == null || this.f9197l == null) {
            return;
        }
        zvf0.A("e_live_button", mo21430R2(), new j760[]{vwb.Y("liveId", m25547E2().m17235k()), vwb.Y("live_anchor_id", ((DbObject) m25547E2().m14582l0()).id), vwb.Y("live_button_site", Integer.valueOf(this instanceof i80 ? 1 : 0)), vwb.Y("live_button_type", this.f9197l.type), vwb.Y("roomId", m25547E2().m17239o())});
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        mo11807W3();
    }
}
