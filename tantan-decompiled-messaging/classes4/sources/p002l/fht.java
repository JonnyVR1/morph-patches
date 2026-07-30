package p002l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.live.base.data.BLiveQuitPopup;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLive;
import l.d1q;
import l.hxs;
import l.t100;
import l.uep0;
import l.vwb;
import l.wk4;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fht extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f10384a;

    /* JADX INFO: renamed from: b */
    public VLinear f10385b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f10386c;

    /* JADX INFO: renamed from: d */
    public VText f10387d;

    /* JADX INFO: renamed from: e */
    public VText f10388e;

    /* JADX INFO: renamed from: f */
    public VFrame f10389f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f10390g;

    /* JADX INFO: renamed from: h */
    public VText f10391h;

    /* JADX INFO: renamed from: i */
    public VText f10392i;

    /* JADX INFO: renamed from: j */
    public VFrame f10393j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f10394k;

    /* JADX INFO: renamed from: l */
    public VText f10395l;

    /* JADX INFO: renamed from: m */
    public VText f10396m;

    /* JADX INFO: renamed from: n */
    public BLiveQuitPopup f10397n;

    /* JADX INFO: renamed from: o */
    public ugt f10398o;

    /* JADX INFO: renamed from: p */
    public int f10399p = 0;

    public fht(BLiveQuitPopup bLiveQuitPopup, ugt ugtVar) {
        this.f10397n = bLiveQuitPopup;
        this.f10398o = ugtVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m13238N(View view) {
        if (this.f10398o == null || vwb.J(this.f10397n.level2SuggestedLives)) {
            return;
        }
        this.f10398o.m23463W3(m13244p(), (BLiveSuggestLive) this.f10397n.level2SuggestedLives.get(0));
        ydd0.m26652a(m13244p(), (BLiveSuggestLive) this.f10397n.level2SuggestedLives.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m13239P(View view) {
        if (this.f10398o != null) {
            zvf0.r("e_exit_first_click", "p_live_exit_popup");
            this.f10398o.m23468b4(true, this.f10397n.pageViewId);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m13240K(View view) {
        ght.m13816a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m13241L(View view, int i) {
        int iE = wk4.e(i);
        this.f10399p = iE;
        xdl0.C0(view, iE);
        uep0.m(view, t100.j);
        VDraweeView vDraweeView = this.f10390g;
        int i2 = t100.o;
        uep0.m(vDraweeView, i2);
        uep0.m(this.f10394k, i2);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m13242O(View view) {
        if (!vwb.J(this.f10397n.level2SuggestedLives) || this.f10397n.level2SuggestedLives.size() <= 1) {
            return;
        }
        this.f10398o.m23463W3(m13244p(), (BLiveSuggestLive) this.f10397n.level2SuggestedLives.get(1));
        ydd0.m26652a(m13244p(), (BLiveSuggestLive) this.f10397n.level2SuggestedLives.get(1));
    }

    /* JADX INFO: renamed from: o */
    public int m13243o() {
        return t6c0.f19749Y5;
    }

    @NonNull
    @NotNull
    /* JADX INFO: renamed from: p */
    public String m13244p() {
        return "p_live_exit_popup";
    }

    /* JADX INFO: renamed from: q */
    public int m13245q() {
        return 3;
    }

    /* JADX INFO: renamed from: u */
    public void m13246u(View view) {
        super.u(view);
        if (this.f10397n == null) {
            return;
        }
        m13240K(view);
        m13241L(view, 2);
        xdl0.E0(this.f10389f, new View.OnClickListener() { // from class: l.cht
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8682a.m13238N(view2);
            }
        });
        xdl0.E0(this.f10393j, new View.OnClickListener() { // from class: l.dht
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9283a.m13242O(view2);
            }
        });
        xdl0.E0(this.f10385b, new View.OnClickListener() { // from class: l.eht
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9798a.m13239P(view2);
            }
        });
        hxs.s("context_single_room", this.f10384a, this.f10397n.recommendPolicyImage);
        hxs.s("context_single_room", this.f10386c, this.f10397n.recommendPolicyIcon);
        this.f10387d.setText(this.f10397n.recommendPolicyName);
        if (vwb.J(this.f10397n.level2SuggestedLives)) {
            return;
        }
        this.f10388e.setText(String.valueOf(this.f10397n.level2SuggestedLives.size()));
        if (this.f10397n.level2SuggestedLives.size() >= 1 && this.f10397n.level2SuggestedLives.get(0) != null) {
            hxs.o("context_single_room", this.f10390g, ((BLiveSuggestLive) this.f10397n.level2SuggestedLives.get(0)).anchor.profilePicture);
            this.f10391h.setText(((BLiveSuggestLive) this.f10397n.level2SuggestedLives.get(0)).anchor.name);
            ydd0.m26653b(m13244p(), (BLiveSuggestLive) this.f10397n.level2SuggestedLives.get(0));
        }
        if (this.f10397n.level2SuggestedLives.size() < 2 || this.f10397n.level2SuggestedLives.get(1) == null) {
            return;
        }
        hxs.o("context_single_room", this.f10394k, ((BLiveSuggestLive) this.f10397n.level2SuggestedLives.get(1)).anchor.profilePicture);
        this.f10395l.setText(((BLiveSuggestLive) this.f10397n.level2SuggestedLives.get(1)).anchor.name);
        ydd0.m26653b(m13244p(), (BLiveSuggestLive) this.f10397n.level2SuggestedLives.get(1));
    }
}
