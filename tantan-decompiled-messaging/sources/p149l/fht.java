package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveQuitPopup;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class fht extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f97565a;

    /* JADX INFO: renamed from: b */
    public VLinear f97566b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f97567c;

    /* JADX INFO: renamed from: d */
    public VText f97568d;

    /* JADX INFO: renamed from: e */
    public VText f97569e;

    /* JADX INFO: renamed from: f */
    public VFrame f97570f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f97571g;

    /* JADX INFO: renamed from: h */
    public VText f97572h;

    /* JADX INFO: renamed from: i */
    public VText f97573i;

    /* JADX INFO: renamed from: j */
    public VFrame f97574j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f97575k;

    /* JADX INFO: renamed from: l */
    public VText f97576l;

    /* JADX INFO: renamed from: m */
    public VText f97577m;

    /* JADX INFO: renamed from: n */
    public BLiveQuitPopup f97578n;

    /* JADX INFO: renamed from: o */
    public ugt f97579o;

    /* JADX INFO: renamed from: p */
    public int f97580p = 0;

    public fht(BLiveQuitPopup bLiveQuitPopup, ugt ugtVar) {
        this.f97578n = bLiveQuitPopup;
        this.f97579o = ugtVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m121453N(View view) {
        if (this.f97579o == null || vwb.m200296J(this.f97578n.level2SuggestedLives)) {
            return;
        }
        this.f97579o.m193579W3(mo109667p(), this.f97578n.level2SuggestedLives.get(0));
        ydd0.m214279a(mo109667p(), this.f97578n.level2SuggestedLives.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m121454P(View view) {
        if (this.f97579o != null) {
            zvf0.m220396r("e_exit_first_click", "p_live_exit_popup");
            this.f97579o.m193584b4(true, this.f97578n.pageViewId);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m121455K(View view) {
        ght.m126222a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m121456L(View view, int i) {
        int iM203652e = wk4.m203652e(i);
        this.f97580p = iM203652e;
        xdl0.m208325C0(view, iM203652e);
        uep0.m193326m(view, t100.f167261j);
        VDraweeView vDraweeView = this.f97571g;
        int i2 = t100.f167266o;
        uep0.m193326m(vDraweeView, i2);
        uep0.m193326m(this.f97575k, i2);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m121457O(View view) {
        if (!vwb.m200296J(this.f97578n.level2SuggestedLives) || this.f97578n.level2SuggestedLives.size() <= 1) {
            return;
        }
        this.f97579o.m193579W3(mo109667p(), this.f97578n.level2SuggestedLives.get(1));
        ydd0.m214279a(mo109667p(), this.f97578n.level2SuggestedLives.get(1));
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168253Y5;
    }

    @Override // p149l.d1q
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: p */
    public String mo109667p() {
        return "p_live_exit_popup";
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 3;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(View view) {
        super.mo70566u(view);
        if (this.f97578n == null) {
            return;
        }
        m121455K(view);
        m121456L(view, 2);
        xdl0.m208329E0(this.f97570f, new View.OnClickListener() { // from class: l.cht
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f81011a.m121453N(view2);
            }
        });
        xdl0.m208329E0(this.f97574j, new View.OnClickListener() { // from class: l.dht
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f86321a.m121457O(view2);
            }
        });
        xdl0.m208329E0(this.f97566b, new View.OnClickListener() { // from class: l.eht
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f91413a.m121454P(view2);
            }
        });
        hxs.m133406s("context_single_room", this.f97565a, this.f97578n.recommendPolicyImage);
        hxs.m133406s("context_single_room", this.f97567c, this.f97578n.recommendPolicyIcon);
        this.f97568d.setText(this.f97578n.recommendPolicyName);
        if (vwb.m200296J(this.f97578n.level2SuggestedLives)) {
            return;
        }
        this.f97569e.setText(String.valueOf(this.f97578n.level2SuggestedLives.size()));
        if (this.f97578n.level2SuggestedLives.size() >= 1 && this.f97578n.level2SuggestedLives.get(0) != null) {
            hxs.m133402o("context_single_room", this.f97571g, this.f97578n.level2SuggestedLives.get(0).anchor.profilePicture);
            this.f97572h.setText(this.f97578n.level2SuggestedLives.get(0).anchor.name);
            ydd0.m214280b(mo109667p(), this.f97578n.level2SuggestedLives.get(0));
        }
        if (this.f97578n.level2SuggestedLives.size() < 2 || this.f97578n.level2SuggestedLives.get(1) == null) {
            return;
        }
        hxs.m133402o("context_single_room", this.f97575k, this.f97578n.level2SuggestedLives.get(1).anchor.profilePicture);
        this.f97576l.setText(this.f97578n.level2SuggestedLives.get(1).anchor.name);
        ydd0.m214280b(mo109667p(), this.f97578n.level2SuggestedLives.get(1));
    }
}
