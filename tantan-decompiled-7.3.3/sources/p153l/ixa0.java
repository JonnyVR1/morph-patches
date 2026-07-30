package p153l;

import android.graphics.Color;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterRemainingSwitcherView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VFrame_FlipContainer;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ixa0 {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f117353a;

    /* JADX INFO: renamed from: b */
    public VLinear f117354b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f117355c;

    /* JADX INFO: renamed from: d */
    public VText f117356d;

    /* JADX INFO: renamed from: e */
    public VLinear f117357e;

    /* JADX INFO: renamed from: f */
    public VFrame_Shadow f117358f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f117359g;

    /* JADX INFO: renamed from: h */
    public VFrame_Shadow f117360h;

    /* JADX INFO: renamed from: i */
    public VFrame_FlipContainer f117361i;

    /* JADX INFO: renamed from: j */
    public VImage f117362j;

    /* JADX INFO: renamed from: k */
    public VText f117363k;

    /* JADX INFO: renamed from: l */
    public VFrame_Shadow f117364l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f117365m;

    /* JADX INFO: renamed from: n */
    public VLinear f117366n;

    /* JADX INFO: renamed from: o */
    public VLinear f117367o;

    /* JADX INFO: renamed from: p */
    public VLinear f117368p;

    /* JADX INFO: renamed from: q */
    public VFrame_Shadow f117369q;

    /* JADX INFO: renamed from: r */
    public VLinear f117370r;

    /* JADX INFO: renamed from: s */
    public VImage f117371s;

    /* JADX INFO: renamed from: t */
    public VText f117372t;

    /* JADX INFO: renamed from: u */
    public VLinear f117373u;

    /* JADX INFO: renamed from: v */
    public VImage f117374v;

    /* JADX INFO: renamed from: w */
    public LetterRemainingSwitcherView f117375w;

    /* JADX INFO: renamed from: x */
    public boolean f117376x = false;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m142499b(Act act, User user, x20 x20Var, View view) {
        i4g0.m138520r("e_intl_instantmatch_btn", OMSDialogPositon.p_suggest_user_profile_info_view);
        C8618a.m48771w().m48793p(act, user, "p_suggest_user_profile_info_view,e_intl_instantmatch_btn,click", x20Var);
    }

    /* JADX INFO: renamed from: e */
    public void m142502e(View view) {
        jxa0.m147333a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m142503f(final Act act, final User user, String str, final x20 x20Var) {
        m142504g(act);
        bnl0.m105509E0(this.f117373u, new View.OnClickListener() { // from class: l.exa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ixa0.m142499b(act, user, x20Var, view);
            }
        });
        if (NullChecker.m82486a(user)) {
            i4g0.m138526x("e_intl_instantmatch_btn", OMSDialogPositon.p_suggest_user_profile_info_view);
        }
        this.f117353a.post(new Runnable() { // from class: l.fxa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f101246a.m142505h();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m142504g(Act act) {
        if (d79.m114663V()) {
            m142508k();
            m142507j(jyb.m147507f0(act.getString(R$string.f19586qg)));
        } else if (C8619b.m48823t() && t450.m189174h().m189178a()) {
            t450.m189174h().m189189p();
            act.duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("instantChat")).distinctUntilChanged(new qcj() { // from class: l.gxa0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Integer.valueOf(((UserPrivilege) obj).content.remaining);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.hxa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111972a.m142506i((UserPrivilege) obj);
                }
            }));
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add("一键配对");
            m142507j(arrayList);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m142505h() {
        if (bnl0.m105529O0(this.f117355c) && bnl0.m105529O0(this.f117373u) && this.f117373u.getRight() > this.f117353a.getWidth()) {
            bnl0.m105507D0(qa00.m175859d(48.0f), this.f117373u);
            this.f117376x = true;
            this.f117375w.m58909i();
            bnl0.m105524M(this.f117375w, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m142506i(UserPrivilege userPrivilege) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("一键配对");
        int i = userPrivilege.content.remaining;
        if (i > 0) {
            arrayList.add(String.format("剩余%s次", a9g0.m96566a(i, 99L)));
        }
        m142507j(arrayList);
    }

    /* JADX INFO: renamed from: j */
    public final void m142507j(List<String> list) {
        if (this.f117376x) {
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(qa00.m175861f(14));
        Iterator<String> it = list.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(textPaint.measureText(it.next()), fMax);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f117375w.getLayoutParams();
        layoutParams.width = ((int) fMax) + qa00.m175859d(2.0f);
        this.f117375w.setLayoutParams(layoutParams);
        bnl0.m105524M(this.f117375w, true);
        this.f117375w.m58909i();
        this.f117375w.setTextList(list);
        this.f117375w.setOutTranslateY(0.5f);
        this.f117375w.setAnimateDirection(false);
        this.f117375w.setInOutAnimation(300L);
        this.f117375w.m58908h();
    }

    /* JADX INFO: renamed from: k */
    public void m142508k() {
        this.f117373u.setBackgroundResource(dbc0.f86469Pc);
        this.f117374v.setImageResource(dbc0.f86501Qc);
        this.f117375w.setTextColor(Color.parseColor("#F9E7FF"));
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f117354b.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0221a).width = -1;
        ((ViewGroup.MarginLayoutParams) c0221a).leftMargin = qa00.m175859d(16.0f);
        ((ViewGroup.MarginLayoutParams) c0221a).rightMargin = qa00.m175859d(16.0f);
        this.f117354b.setLayoutParams(c0221a);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f117371s.getLayoutParams();
        layoutParams.gravity = 17;
        layoutParams.leftMargin = 0;
        this.f117371s.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f117373u.getLayoutParams();
        layoutParams2.width = 0;
        layoutParams2.weight = 1.0f;
        this.f117373u.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f117370r.getLayoutParams();
        layoutParams3.width = qa00.m175859d(48.0f);
        this.f117370r.setLayoutParams(layoutParams3);
        this.f117370r.setGravity(17);
        bnl0.m105524M(this.f117372t, false);
    }
}
