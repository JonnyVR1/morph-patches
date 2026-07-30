package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kf2<V extends View> extends ck2<oo2, qct> {

    /* JADX INFO: renamed from: o */
    public static final int f126229o = qa00.m175859d(44.0f);

    /* JADX INFO: renamed from: p */
    public static final int f126230p = qa00.m175859d(38.0f);

    /* JADX INFO: renamed from: j */
    public String f126231j;

    /* JADX INFO: renamed from: k */
    public V f126232k;

    /* JADX INFO: renamed from: l */
    public final BLiveBottomButton f126233l;

    /* JADX INFO: renamed from: m */
    public int f126234m;

    /* JADX INFO: renamed from: n */
    @LayoutRes
    public final int f126235n;

    public kf2(dum dumVar, @LayoutRes int i, BLiveBottomButton bLiveBottomButton) {
        super(dumVar);
        this.f126233l = bLiveBottomButton;
        this.f126235n = i;
        m149348e4(String.valueOf(bLiveBottomButton.f45187id));
        mo119790T3();
    }

    @Override // p153l.ck2
    /* JADX INFO: renamed from: M3 */
    public final String mo110324M3() {
        return mo96799X3().name();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        mo119791U3();
    }

    /* JADX INFO: renamed from: T3 */
    public void mo119790T3() {
        this.f126234m = 800;
        V v2 = (V) this.f196919f.inflater().inflate(this.f126235n, (ViewGroup) null);
        this.f126232k = v2;
        v2.setOnClickListener(new View.OnClickListener() { // from class: l.jf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120548a.mo96798V3(view);
            }
        });
        V v3 = this.f126232k;
        if (v3 instanceof RedDot) {
            ((RedDot) v3).mo73321g0(mo149349f4());
        }
    }

    /* JADX INFO: renamed from: U3 */
    public void mo119791U3() {
        mo108591d4(this.f126232k);
        m110323L3(this.f126232k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        m149350g4();
        if (!(view instanceof RedDot) || TEnum.equals(mo96799X3(), "settingButton")) {
            return;
        }
        ((RedDot) view).mo73321g0(false);
    }

    /* JADX INFO: renamed from: W3 */
    public void mo119792W3() {
        m110328R3(this.f126232k);
    }

    /* JADX INFO: renamed from: X3 */
    public abstract BLiveButtonType mo96799X3();

    /* JADX INFO: renamed from: Y3 */
    public String m149345Y3() {
        return this.f126231j;
    }

    /* JADX INFO: renamed from: Z3 */
    public String mo119793Z3() {
        return (jyb.m147479J(this.f126233l.icon) || this.f126233l.icon.size() < 2) ? "" : this.f126233l.icon.get(1);
    }

    /* JADX INFO: renamed from: a4 */
    public View mo149346a4() {
        return this.f126232k;
    }

    /* JADX INFO: renamed from: b4 */
    public void mo119794b4(boolean z) {
        V v2 = this.f126232k;
        if (v2 != null) {
            bnl0.m105524M(v2, z);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m149347c4() {
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(800).m103154e(this.f126233l.url).m103152c());
    }

    @CallSuper
    /* JADX INFO: renamed from: d4 */
    public void mo108591d4(V v2) {
        m149351h4();
    }

    /* JADX INFO: renamed from: e4 */
    public void m149348e4(String str) {
        this.f126231j = str;
    }

    /* JADX INFO: renamed from: f4 */
    public boolean mo149349f4() {
        if (TEnum.equals(mo96799X3(), "settingButton")) {
            return false;
        }
        return ((Boolean) m138856F3(new bsc0(this.f126234m).m106219e(this.f126233l.url))).booleanValue() && !((Boolean) m138856F3(new ym3(this.f126234m).m216672e(this.f126233l.url))).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: g4 */
    public final void m149350g4() {
        if (m213810E2() == 0 || m213810E2().m168532l0() == null || this.f126233l == null) {
            return;
        }
        m213811F2().BottomEvent.markButtonClicked().mo199273j(this.f126233l);
        i4g0.m138523u("e_live_button", mo78457R2(), jyb.m147494Y("liveId", m213810E2().m202191k()), jyb.m147494Y("live_anchor_id", m213810E2().m168532l0().f56859id), jyb.m147494Y("live_button_site", Integer.valueOf(this instanceof e80 ? 1 : 0)), jyb.m147494Y("live_button_type", this.f126233l.type), jyb.m147494Y("roomId", m213810E2().m202194o()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: h4 */
    public final void m149351h4() {
        if (m213810E2() == 0 || m213810E2().m168532l0() == null || this.f126233l == null) {
            return;
        }
        i4g0.m138492A("e_live_button", mo78457R2(), jyb.m147494Y("liveId", m213810E2().m202191k()), jyb.m147494Y("live_anchor_id", m213810E2().m168532l0().f56859id), jyb.m147494Y("live_button_site", Integer.valueOf(this instanceof e80 ? 1 : 0)), jyb.m147494Y("live_button_type", this.f126233l.type), jyb.m147494Y("roomId", m213810E2().m202194o()));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        mo119792W3();
    }
}
