package p149l;

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
import com.p046p1.mobile.putong.core.data.LikeUser;
import com.p046p1.mobile.putong.core.newui.intlmeet.ilike.IntlILikeFrag;
import java.util.List;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes11.dex */
public class gpn implements s7m<apn> {

    /* JADX INFO: renamed from: a */
    public VLinear f103812a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f103813b;

    /* JADX INFO: renamed from: c */
    public VFrame f103814c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f103815d;

    /* JADX INFO: renamed from: e */
    public VImage f103816e;

    /* JADX INFO: renamed from: f */
    public VText f103817f;

    /* JADX INFO: renamed from: g */
    public VPullUpRecyclerView f103818g;

    /* JADX INFO: renamed from: h */
    public VText_NoTopPadding f103819h;

    /* JADX INFO: renamed from: i */
    public final IntlILikeFrag f103820i;

    /* JADX INFO: renamed from: j */
    public apn f103821j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public wdo f103822k;

    /* JADX INFO: renamed from: l.gpn$a */
    public class C17135a extends GridLayoutManager.AbstractC0553c {
        public C17135a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return 1;
        }
    }

    public gpn(IntlILikeFrag intlILikeFrag) {
        this.f103820i = intlILikeFrag;
    }

    /* JADX INFO: renamed from: f */
    private void m127407f() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f103820i.act(), 2);
        gridLayoutManager.m3326v(new C17135a());
        this.f103818g.setLayoutManager(gridLayoutManager);
        this.f103818g.setAdapter(this.f103820i.m39372P4());
    }

    /* JADX INFO: renamed from: m */
    private void m127408m() {
        xdl0.m208344M(this.f103819h, xma.m210071e4());
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f103820i.act();
    }

    /* JADX INFO: renamed from: b */
    public View m127409b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hpn.m132369b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public void m127410c() {
        apn apnVar = this.f103821j;
        if (apnVar != null && this.f103822k == null) {
            wdo wdoVar = new wdo(this.f103820i, apnVar);
            this.f103822k = wdoVar;
            wdoVar.m202766g(this.f103813b);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(apn apnVar) {
        this.f103821j = apnVar;
    }

    @Override // p149l.s7m
    public void destroy() {
        wdo wdoVar = this.f103822k;
        if (wdoVar != null) {
            wdoVar.m202768i();
            this.f103822k = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m127412e() {
        xdl0.m208329E0(this.f103819h, new View.OnClickListener() { // from class: l.fpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98720a.m127413i(view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m127413i(View view) {
        rtl.m180791d(this.f103820i.pageId());
        this.f103821j.m98156d1("p_intl_meet_view,e_intl_meet_like_i_sent_unlock_btn_click,click", true);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m127409b(layoutInflater, viewGroup);
    }

    public void init() {
        m127407f();
        m127412e();
    }

    /* JADX INFO: renamed from: j */
    public void m127414j() {
        wdo wdoVar = this.f103822k;
        if (wdoVar != null) {
            wdoVar.m202770k();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m127415k() {
        wdo wdoVar = this.f103822k;
        if (wdoVar != null) {
            wdoVar.m202772m();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m127416l(List<LikeUser> list) {
        if (list == null || vwb.m200296J(list)) {
            xdl0.m208344M(this.f103815d, true);
            xdl0.m208344M(this.f103818g, false);
        } else {
            this.f103820i.m39372P4().m199188R(list);
            xdl0.m208344M(this.f103815d, false);
            xdl0.m208344M(this.f103818g, true);
        }
        m127408m();
        m127415k();
    }

    /* JADX INFO: renamed from: n */
    public void m127417n() {
        this.f103819h.setBackgroundResource(xma.m210098y4() ? b3c0.f72890K : b3c0.f72883J);
        this.f103819h.setTextColor(Color.parseColor(xma.m210098y4() ? "#F9E7FF" : Constants.BLACK));
        m127408m();
    }
}
