package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.LikeUser;
import com.p051p1.mobile.putong.core.newui.intlmeet.ilike.IntlILikeFrag;
import java.util.List;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes11.dex */
public class grn implements iam<arn> {

    /* JADX INFO: renamed from: a */
    public VLinear f106083a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f106084b;

    /* JADX INFO: renamed from: c */
    public VFrame f106085c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f106086d;

    /* JADX INFO: renamed from: e */
    public VImage f106087e;

    /* JADX INFO: renamed from: f */
    public VText f106088f;

    /* JADX INFO: renamed from: g */
    public VPullUpRecyclerView f106089g;

    /* JADX INFO: renamed from: h */
    public VText_NoTopPadding f106090h;

    /* JADX INFO: renamed from: i */
    public final IntlILikeFrag f106091i;

    /* JADX INFO: renamed from: j */
    public arn f106092j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public wfo f106093k;

    /* JADX INFO: renamed from: l.grn$a */
    public class C17283a extends GridLayoutManager.AbstractC0554c {
        public C17283a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return 1;
        }
    }

    public grn(IntlILikeFrag intlILikeFrag) {
        this.f106091i = intlILikeFrag;
    }

    /* JADX INFO: renamed from: f */
    private void m131823f() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f106091i.act(), 2);
        gridLayoutManager.m3327v(new C17283a());
        this.f106089g.setLayoutManager(gridLayoutManager);
        this.f106089g.setAdapter(this.f106091i.m40375P4());
    }

    /* JADX INFO: renamed from: m */
    private void m131824m() {
        bnl0.m105524M(this.f106090h, joa.m146386f4());
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f106091i.act();
    }

    /* JADX INFO: renamed from: b */
    public View m131825b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hrn.m136905b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public void m131826c() {
        arn arnVar = this.f106092j;
        if (arnVar != null && this.f106093k == null) {
            wfo wfoVar = new wfo(this.f106091i, arnVar);
            this.f106093k = wfoVar;
            wfoVar.m206137g(this.f106084b);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(arn arnVar) {
        this.f106092j = arnVar;
    }

    @Override // p153l.iam
    public void destroy() {
        wfo wfoVar = this.f106093k;
        if (wfoVar != null) {
            wfoVar.m206139i();
            this.f106093k = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m131828e() {
        bnl0.m105509E0(this.f106090h, new View.OnClickListener() { // from class: l.frn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100440a.m131829i(view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m131829i(View view) {
        fwl.m127798d(this.f106091i.pageId());
        this.f106092j.m99758d1("p_intl_meet_view,e_intl_meet_like_i_sent_unlock_btn_click,click", true);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m131825b(layoutInflater, viewGroup);
    }

    public void init() {
        m131823f();
        m131828e();
    }

    /* JADX INFO: renamed from: j */
    public void m131830j() {
        wfo wfoVar = this.f106093k;
        if (wfoVar != null) {
            wfoVar.m206141k();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m131831k() {
        wfo wfoVar = this.f106093k;
        if (wfoVar != null) {
            wfoVar.m206143m();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m131832l(List<LikeUser> list) {
        if (list == null || jyb.m147479J(list)) {
            bnl0.m105524M(this.f106086d, true);
            bnl0.m105524M(this.f106089g, false);
        } else {
            this.f106091i.m40375P4().m202422R(list);
            bnl0.m105524M(this.f106086d, false);
            bnl0.m105524M(this.f106089g, true);
        }
        m131824m();
        m131831k();
    }

    /* JADX INFO: renamed from: n */
    public void m131833n() {
        this.f106090h.setBackgroundResource(joa.m146413z4() ? gbc0.f103141K : gbc0.f103134J);
        this.f106090h.setTextColor(Color.parseColor(joa.m146413z4() ? "#F9E7FF" : Constants.BLACK));
        m131824m();
    }
}
