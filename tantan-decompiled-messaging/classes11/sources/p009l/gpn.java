package p009l;

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
import com.p000p1.mobile.putong.core.newui.intlmeet.ilike.IntlILikeFrag;
import com.p1.mobile.putong.core.data.LikeUser;
import java.util.List;
import l.b3c0;
import l.hpn;
import l.s7m;
import l.vwb;
import l.xdl0;
import l.xma;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VPullUpRecyclerView;
import v.VText;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gpn implements s7m<apn> {

    /* JADX INFO: renamed from: a */
    public VLinear f13666a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f13667b;

    /* JADX INFO: renamed from: c */
    public VFrame f13668c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f13669d;

    /* JADX INFO: renamed from: e */
    public VImage f13670e;

    /* JADX INFO: renamed from: f */
    public VText f13671f;

    /* JADX INFO: renamed from: g */
    public VPullUpRecyclerView f13672g;

    /* JADX INFO: renamed from: h */
    public VText_NoTopPadding f13673h;

    /* JADX INFO: renamed from: i */
    public final IntlILikeFrag f13674i;

    /* JADX INFO: renamed from: j */
    public apn f13675j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public wdo f13676k;

    /* JADX INFO: renamed from: l.gpn$a */
    public class C0922a extends GridLayoutManager.c {
        public C0922a() {
        }

        /* JADX INFO: renamed from: f */
        public int m15160f(int i) {
            return 1;
        }
    }

    public gpn(IntlILikeFrag intlILikeFrag) {
        this.f13674i = intlILikeFrag;
    }

    /* JADX INFO: renamed from: f */
    private void m15147f() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f13674i.act(), 2);
        gridLayoutManager.v(new C0922a());
        this.f13672g.setLayoutManager(gridLayoutManager);
        this.f13672g.setAdapter(this.f13674i.m3412P4());
    }

    /* JADX INFO: renamed from: m */
    private void m15148m() {
        xdl0.M(this.f13673h, xma.e4());
    }

    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context m15149C0() {
        return this.f13674i.act();
    }

    /* JADX INFO: renamed from: b */
    public View m15150b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hpn.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public void m15151c() {
        apn apnVar = this.f13675j;
        if (apnVar != null && this.f13676k == null) {
            wdo wdoVar = new wdo(this.f13674i, apnVar);
            this.f13676k = wdoVar;
            wdoVar.m24088g(this.f13667b);
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m15155i1(apn apnVar) {
        this.f13675j = apnVar;
    }

    public void destroy() {
        wdo wdoVar = this.f13676k;
        if (wdoVar != null) {
            wdoVar.m24090i();
            this.f13676k = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m15153e() {
        xdl0.E0(this.f13673h, new View.OnClickListener() { // from class: l.fpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13133a.m15154i(view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m15154i(View view) {
        rtl.m21797d(this.f13674i.pageId());
        this.f13675j.m11581d1("p_intl_meet_view,e_intl_meet_like_i_sent_unlock_btn_click,click", true);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m15150b(layoutInflater, viewGroup);
    }

    public void init() {
        m15147f();
        m15153e();
    }

    /* JADX INFO: renamed from: j */
    public void m15156j() {
        wdo wdoVar = this.f13676k;
        if (wdoVar != null) {
            wdoVar.m24092k();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m15157k() {
        wdo wdoVar = this.f13676k;
        if (wdoVar != null) {
            wdoVar.m24094m();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m15158l(List<LikeUser> list) {
        if (list == null || vwb.J(list)) {
            xdl0.M(this.f13669d, true);
            xdl0.M(this.f13672g, false);
        } else {
            this.f13674i.m3412P4().m23563R(list);
            xdl0.M(this.f13669d, false);
            xdl0.M(this.f13672g, true);
        }
        m15148m();
        m15157k();
    }

    /* JADX INFO: renamed from: n */
    public void m15159n() {
        this.f13673h.setBackgroundResource(xma.y4() ? b3c0.K : b3c0.J);
        this.f13673h.setTextColor(Color.parseColor(xma.y4() ? "#F9E7FF" : "#000000"));
        m15148m();
    }
}
