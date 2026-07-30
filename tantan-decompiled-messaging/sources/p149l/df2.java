package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot;

/* JADX INFO: loaded from: classes4.dex */
public abstract class df2<V extends View> extends uj2<ho2, pat> {

    /* JADX INFO: renamed from: o */
    public static final int f85884o = t100.m186890d(44.0f);

    /* JADX INFO: renamed from: p */
    public static final int f85885p = t100.m186890d(38.0f);

    /* JADX INFO: renamed from: j */
    public String f85886j;

    /* JADX INFO: renamed from: k */
    public V f85887k;

    /* JADX INFO: renamed from: l */
    public final BLiveBottomButton f85888l;

    /* JADX INFO: renamed from: m */
    public int f85889m;

    /* JADX INFO: renamed from: n */
    @LayoutRes
    public final int f85890n;

    public df2(bsm bsmVar, @LayoutRes int i, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar);
        this.f85888l = bLiveBottomButton;
        this.f85890n = i;
        m111421e4(String.valueOf(bLiveBottomButton.f44339id));
        mo111413T3();
    }

    @Override // p149l.uj2
    /* JADX INFO: renamed from: M3 */
    public final String mo95286M3() {
        return mo103807X3().name();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        mo111414U3();
    }

    /* JADX INFO: renamed from: T3 */
    public void mo111413T3() {
        this.f85889m = 800;
        V v2 = (V) this.f188513f.inflater().inflate(this.f85890n, (ViewGroup) null);
        this.f85887k = v2;
        v2.setOnClickListener(new View.OnClickListener() { // from class: l.cf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80534a.mo103804V3(view);
            }
        });
        V v3 = this.f85887k;
        if (v3 instanceof RedDot) {
            ((RedDot) v3).mo72138g0(mo111422f4());
        }
    }

    /* JADX INFO: renamed from: U3 */
    public void mo111414U3() {
        mo108215d4(this.f85887k);
        m193995L3(this.f85887k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        m111423g4();
        if (!(view instanceof RedDot) || TEnum.equals(mo103807X3(), "settingButton")) {
            return;
        }
        ((RedDot) view).mo72138g0(false);
    }

    /* JADX INFO: renamed from: W3 */
    public void mo111415W3() {
        m193999R3(this.f85887k);
    }

    /* JADX INFO: renamed from: X3 */
    public abstract BLiveButtonType mo103807X3();

    /* JADX INFO: renamed from: Y3 */
    public String m111416Y3() {
        return this.f85886j;
    }

    /* JADX INFO: renamed from: Z3 */
    public String mo111417Z3() {
        return (vwb.m200296J(this.f85888l.icon) || this.f85888l.icon.size() < 2) ? "" : this.f85888l.icon.get(1);
    }

    /* JADX INFO: renamed from: a4 */
    public View mo111418a4() {
        return this.f85887k;
    }

    /* JADX INFO: renamed from: b4 */
    public void mo111419b4(boolean z) {
        V v2 = this.f85887k;
        if (v2 != null) {
            xdl0.m208344M(v2, z);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m111420c4() {
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(800).m206701e(this.f85888l.url).m206699c());
    }

    @CallSuper
    /* JADX INFO: renamed from: d4 */
    public void mo108215d4(V v2) {
        m111424h4();
    }

    /* JADX INFO: renamed from: e4 */
    public void m111421e4(String str) {
        this.f85886j = str;
    }

    /* JADX INFO: renamed from: f4 */
    public boolean mo111422f4() {
        if (TEnum.equals(mo103807X3(), "settingButton")) {
            return false;
        }
        return ((Boolean) m129297F3(new ujc0(this.f85889m).m194010e(this.f85888l.url))).booleanValue() && !((Boolean) m129297F3(new yl3(this.f85889m).m215212e(this.f85888l.url))).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: g4 */
    public final void m111423g4() {
        if (m206027E2() == 0 || m206027E2().m132146l0() == null || this.f85888l == null) {
            return;
        }
        m206028F2().BottomEvent.markButtonClicked().mo172463j(this.f85888l);
        zvf0.m220399u("e_live_button", mo77274R2(), vwb.m200311Y("liveId", m206027E2().m149814k()), vwb.m200311Y("live_anchor_id", m206027E2().m132146l0().f56011id), vwb.m200311Y("live_button_site", Integer.valueOf(this instanceof i80 ? 1 : 0)), vwb.m200311Y("live_button_type", this.f85888l.type), vwb.m200311Y("roomId", m206027E2().m149818o()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: h4 */
    public final void m111424h4() {
        if (m206027E2() == 0 || m206027E2().m132146l0() == null || this.f85888l == null) {
            return;
        }
        zvf0.m220368A("e_live_button", mo77274R2(), vwb.m200311Y("liveId", m206027E2().m149814k()), vwb.m200311Y("live_anchor_id", m206027E2().m132146l0().f56011id), vwb.m200311Y("live_button_site", Integer.valueOf(this instanceof i80 ? 1 : 0)), vwb.m200311Y("live_button_type", this.f85888l.type), vwb.m200311Y("roomId", m206027E2().m149818o()));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mo111415W3();
    }
}
