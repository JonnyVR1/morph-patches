package p153l;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AdvancedSettings;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p151v.VListCell;
import p151v.VSwitchButton;

/* JADX INFO: loaded from: classes12.dex */
public class pn20 implements iam<hn20> {

    /* JADX INFO: renamed from: a */
    public VListCell f153246a;

    /* JADX INFO: renamed from: b */
    public VListCell f153247b;

    /* JADX INFO: renamed from: c */
    public VListCell f153248c;

    /* JADX INFO: renamed from: d */
    public VListCell f153249d;

    /* JADX INFO: renamed from: e */
    public VListCell f153250e;

    /* JADX INFO: renamed from: f */
    public VLinear f153251f;

    /* JADX INFO: renamed from: g */
    public VLinear f153252g;

    /* JADX INFO: renamed from: h */
    public Act f153253h;

    /* JADX INFO: renamed from: i */
    public View f153254i;

    /* JADX INFO: renamed from: j */
    public hn20 f153255j;

    /* JADX INFO: renamed from: k */
    public String f153256k = "";

    public pn20(Act act) {
        this.f153253h = act;
    }

    /* JADX INFO: renamed from: B */
    private void m173002B(Drawable drawable, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setBackground(drawable);
        }
    }

    /* JADX INFO: renamed from: C */
    private void m173003C(@ColorInt int i, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setTitleColor(i);
        }
    }

    /* JADX INFO: renamed from: E */
    private void m173004E(Typeface typeface, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setTitleTypeface(typeface);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m173005a(int i, int i2, VListCell vListCell) {
        VSwitchButton vSwitchButton = (VSwitchButton) vListCell.findViewById(gdc0.f103660S);
        if (NullChecker.m82486a(vSwitchButton)) {
            vSwitchButton.setThumbActiveColor(i);
            vSwitchButton.setThumbInActiveColor(i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m173009e(int i, VListCell vListCell) {
        VSwitchButton vSwitchButton = (VSwitchButton) vListCell.findViewById(gdc0.f103660S);
        if (NullChecker.m82486a(vSwitchButton)) {
            vSwitchButton.setActiveSliderColor(i);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m173012A(Drawable drawable) {
        m173002B(drawable, this.f153246a, this.f153247b, this.f153248c, this.f153249d, this.f153250e);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f153253h;
    }

    /* JADX INFO: renamed from: F */
    public void m173013F(String str) {
        this.f153256k = str;
    }

    /* JADX INFO: renamed from: G */
    public void m173014G(@ColorInt int i) {
        m173003C(i, this.f153246a, this.f153247b, this.f153248c, this.f153249d, this.f153250e);
    }

    /* JADX INFO: renamed from: H */
    public void m173015H(Typeface typeface) {
        m173004E(typeface, this.f153246a, this.f153247b, this.f153248c, this.f153249d, this.f153250e);
    }

    /* JADX INFO: renamed from: I */
    public final void m173016I(String str) {
        CoreModule.f18276o.m132214d().mo34855ip(this.f153253h, str, Privilege.advanced_filter);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f153254i;
    }

    /* JADX INFO: renamed from: j */
    public final void m173017j(View view) {
        qn20.m177178a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void mo172484k(View view) {
        this.f153254i = view;
        m173017j(view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(hn20 hn20Var) {
        this.f153255j = hn20Var;
    }

    /* JADX INFO: renamed from: m */
    public void m173019m(final int i) {
        jyb.m147537z(jyb.m147507f0(this.f153246a, this.f153247b, this.f153248c, this.f153249d, this.f153250e), new y20() { // from class: l.nn20
            @Override // p153l.y20
            public final void call(Object obj) {
                pn20.m173009e(i, (VListCell) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m173020n(final int i, final int i2) {
        jyb.m147537z(jyb.m147507f0(this.f153246a, this.f153247b, this.f153248c, this.f153249d, this.f153250e), new y20() { // from class: l.on20
            @Override // p153l.y20
            public final void call(Object obj) {
                pn20.m173005a(i, i2, (VListCell) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public String m173021p() {
        return this.f153256k;
    }

    /* JADX INFO: renamed from: q */
    public void m173022q(AdvancedSettings advancedSettings) {
        bsj0.m106284t(this.f153247b, advancedSettings.popular.booleanValue());
        bsj0.m106284t(this.f153248c, advancedSettings.realFace.booleanValue());
        bsj0.m106284t(this.f153249d, advancedSettings.student.booleanValue());
        bsj0.m106284t(this.f153250e, advancedSettings.newUser.booleanValue());
        bsj0.m106284t(this.f153246a, advancedSettings.online.booleanValue());
    }

    /* JADX INFO: renamed from: s */
    public void m173023s(View view) {
        mo172484k(view);
        if (xra.m212803v()) {
            if (NullChecker.m82486a(this.f153251f)) {
                bnl0.m105524M(this.f153251f, false);
            } else {
                bnl0.m105524M(this.f153248c, false);
            }
        }
        this.f153247b.setOnClickListener(new View.OnClickListener() { // from class: l.in20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f115860a.m173024u(view2);
            }
        });
        this.f153248c.setOnClickListener(new View.OnClickListener() { // from class: l.jn20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f121740a.m173025v(view2);
            }
        });
        this.f153249d.setOnClickListener(new View.OnClickListener() { // from class: l.kn20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f127551a.m173026w(view2);
            }
        });
        this.f153250e.setOnClickListener(new View.OnClickListener() { // from class: l.ln20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f132737a.m173027x(view2);
            }
        });
        this.f153246a.setOnClickListener(new View.OnClickListener() { // from class: l.mn20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f137647a.m173028y(view2);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m173024u(View view) {
        i4g0.m138523u("e_advanced_filter_pop", m173021p(), jyb.m147494Y("is_selected", Boolean.valueOf(!bsj0.m106285u(this.f153247b))));
        if (!this.f153255j.m136039u0() && !joa.m146412z3()) {
            m173016I("p_home_filter,advanced");
            return;
        }
        i4g0.m138524v("e_advanced_filter_pop", m173021p(), jyb.m147494Y("is_selected", Boolean.valueOf(!bsj0.m106285u(this.f153247b))));
        bsj0.m106262T(this.f153247b);
        this.f153255j.m136030A0();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m173025v(View view) {
        i4g0.m138523u("e_advanced_filter_real", m173021p(), jyb.m147494Y("is_selected", Boolean.valueOf(!bsj0.m106285u(this.f153248c))));
        if (!this.f153255j.m136039u0() && !this.f153255j.m136034o0() && !joa.m146412z3()) {
            m173016I("p_home_filter,advanced");
            return;
        }
        i4g0.m138524v("e_advanced_filter_real", m173021p(), jyb.m147494Y("is_selected", Boolean.valueOf(!bsj0.m106285u(this.f153248c))));
        bsj0.m106262T(this.f153248c);
        this.f153255j.m136030A0();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m173026w(View view) {
        i4g0.m138523u("e_advanced_filter_student", m173021p(), jyb.m147494Y("is_selected", Boolean.valueOf(!bsj0.m106285u(this.f153249d))));
        if (!this.f153255j.m136039u0() && !this.f153255j.m136035p0() && !joa.m146412z3()) {
            m173016I("p_advanced_filter_page,e_advanced_filter_student,click");
            return;
        }
        i4g0.m138524v("e_advanced_filter_student", m173021p(), jyb.m147494Y("is_selected", Boolean.valueOf(!bsj0.m106285u(this.f153249d))));
        bsj0.m106262T(this.f153249d);
        this.f153255j.m136030A0();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m173027x(View view) {
        i4g0.m138523u("e_advanced_filter_new", m173021p(), jyb.m147494Y("is_selected", Boolean.valueOf(!bsj0.m106285u(this.f153250e))));
        if (!this.f153255j.m136039u0() && !joa.m146412z3()) {
            m173016I("p_home_filter,advanced");
            return;
        }
        i4g0.m138524v("e_advanced_filter_new", m173021p(), jyb.m147494Y("is_selected", Boolean.valueOf(!bsj0.m106285u(this.f153250e))));
        bsj0.m106262T(this.f153250e);
        this.f153255j.m136030A0();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m173028y(View view) {
        i4g0.m138523u("e_advanced_filter_online", m173021p(), jyb.m147494Y("is_selected", Boolean.valueOf(!bsj0.m106285u(this.f153246a))));
        if (!this.f153255j.m136039u0() && !joa.m146412z3()) {
            m173016I("p_home_filter,advanced");
            return;
        }
        i4g0.m138524v("e_advanced_filter_online", m173021p(), jyb.m147494Y("is_selected", Boolean.valueOf(!bsj0.m106285u(this.f153246a))));
        bsj0.m106262T(this.f153246a);
        this.f153255j.m136030A0();
    }

    /* JADX INFO: renamed from: z */
    public void m173029z(AdvancedSettings advancedSettings) {
        advancedSettings.popular = Boolean.valueOf(bsj0.m106285u(this.f153247b));
        advancedSettings.realFace = Boolean.valueOf(bsj0.m106285u(this.f153248c));
        advancedSettings.student = Boolean.valueOf(bsj0.m106285u(this.f153249d));
        advancedSettings.newUser = Boolean.valueOf(bsj0.m106285u(this.f153250e));
        advancedSettings.online = Boolean.valueOf(bsj0.m106285u(this.f153246a));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
