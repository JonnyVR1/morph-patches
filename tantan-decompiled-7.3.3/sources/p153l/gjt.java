package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveQuitPopup;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gjt extends d3q<View> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f104667a;

    /* JADX INFO: renamed from: b */
    public VLinear f104668b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f104669c;

    /* JADX INFO: renamed from: d */
    public VText f104670d;

    /* JADX INFO: renamed from: e */
    public VText f104671e;

    /* JADX INFO: renamed from: f */
    public VFrame f104672f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f104673g;

    /* JADX INFO: renamed from: h */
    public VText f104674h;

    /* JADX INFO: renamed from: i */
    public VText f104675i;

    /* JADX INFO: renamed from: j */
    public VFrame f104676j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f104677k;

    /* JADX INFO: renamed from: l */
    public VText f104678l;

    /* JADX INFO: renamed from: m */
    public VText f104679m;

    /* JADX INFO: renamed from: n */
    public BLiveQuitPopup f104680n;

    /* JADX INFO: renamed from: o */
    public vit f104681o;

    /* JADX INFO: renamed from: p */
    public int f104682p = 0;

    public gjt(BLiveQuitPopup bLiveQuitPopup, vit vitVar) {
        this.f104680n = bLiveQuitPopup;
        this.f104681o = vitVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m130550N(View view) {
        if (this.f104681o == null || jyb.m147479J(this.f104680n.level2SuggestedLives)) {
            return;
        }
        this.f104681o.m201419W3(mo113885p(), this.f104680n.level2SuggestedLives.get(0));
        amd0.m98819a(mo113885p(), this.f104680n.level2SuggestedLives.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m130551P(View view) {
        if (this.f104681o != null) {
            i4g0.m138520r("e_exit_first_click", "p_live_exit_popup");
            this.f104681o.m201424b4(true, this.f104680n.pageViewId);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m130552K(View view) {
        hjt.m135525a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m130553L(View view, int i) {
        int iM201593e = vl4.m201593e(i);
        this.f104682p = iM201593e;
        bnl0.m105505C0(view, iM201593e);
        ynp0.m216936m(view, qa00.f156323j);
        VDraweeView vDraweeView = this.f104673g;
        int i2 = qa00.f156328o;
        ynp0.m216936m(vDraweeView, i2);
        ynp0.m216936m(this.f104677k, i2);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m130554O(View view) {
        if (!jyb.m147479J(this.f104680n.level2SuggestedLives) || this.f104680n.level2SuggestedLives.size() <= 1) {
            return;
        }
        this.f104681o.m201419W3(mo113885p(), this.f104680n.level2SuggestedLives.get(1));
        amd0.m98819a(mo113885p(), this.f104680n.level2SuggestedLives.get(1));
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198985Y5;
    }

    @Override // p153l.d3q
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: p */
    public String mo113885p() {
        return "p_live_exit_popup";
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 3;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(View view) {
        super.mo71749u(view);
        if (this.f104680n == null) {
            return;
        }
        m130552K(view);
        m130553L(view, 2);
        bnl0.m105509E0(this.f104672f, new View.OnClickListener() { // from class: l.djt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f88933a.m130550N(view2);
            }
        });
        bnl0.m105509E0(this.f104676j, new View.OnClickListener() { // from class: l.ejt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f94321a.m130554O(view2);
            }
        });
        bnl0.m105509E0(this.f104668b, new View.OnClickListener() { // from class: l.fjt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f99431a.m130551P(view2);
            }
        });
        izs.m142868s("context_single_room", this.f104667a, this.f104680n.recommendPolicyImage);
        izs.m142868s("context_single_room", this.f104669c, this.f104680n.recommendPolicyIcon);
        this.f104670d.setText(this.f104680n.recommendPolicyName);
        if (jyb.m147479J(this.f104680n.level2SuggestedLives)) {
            return;
        }
        this.f104671e.setText(String.valueOf(this.f104680n.level2SuggestedLives.size()));
        if (this.f104680n.level2SuggestedLives.size() >= 1 && this.f104680n.level2SuggestedLives.get(0) != null) {
            izs.m142864o("context_single_room", this.f104673g, this.f104680n.level2SuggestedLives.get(0).anchor.profilePicture);
            this.f104674h.setText(this.f104680n.level2SuggestedLives.get(0).anchor.name);
            amd0.m98820b(mo113885p(), this.f104680n.level2SuggestedLives.get(0));
        }
        if (this.f104680n.level2SuggestedLives.size() < 2 || this.f104680n.level2SuggestedLives.get(1) == null) {
            return;
        }
        izs.m142864o("context_single_room", this.f104677k, this.f104680n.level2SuggestedLives.get(1).anchor.profilePicture);
        this.f104678l.setText(this.f104680n.level2SuggestedLives.get(1).anchor.name);
        amd0.m98820b(mo113885p(), this.f104680n.level2SuggestedLives.get(1));
    }
}
