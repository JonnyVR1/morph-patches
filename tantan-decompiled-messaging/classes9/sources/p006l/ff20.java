package p006l;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.AdvancedSettings;
import com.p1.mobile.putong.core.data.Privilege;
import com.tantanapp.common.utils.NullChecker;
import l.a5c0;
import l.e30;
import l.gf20;
import l.j760;
import l.lqa;
import l.s7m;
import l.vwb;
import l.xdl0;
import l.yij0;
import l.zvf0;
import v.VLinear;
import v.VListCell;
import v.VSwitchButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ff20 implements s7m<xe20> {

    /* JADX INFO: renamed from: a */
    public VListCell f12682a;

    /* JADX INFO: renamed from: b */
    public VListCell f12683b;

    /* JADX INFO: renamed from: c */
    public VListCell f12684c;

    /* JADX INFO: renamed from: d */
    public VListCell f12685d;

    /* JADX INFO: renamed from: e */
    public VListCell f12686e;

    /* JADX INFO: renamed from: f */
    public VLinear f12687f;

    /* JADX INFO: renamed from: g */
    public VLinear f12688g;

    /* JADX INFO: renamed from: h */
    public Act f12689h;

    /* JADX INFO: renamed from: i */
    public View f12690i;

    /* JADX INFO: renamed from: j */
    public xe20 f12691j;

    /* JADX INFO: renamed from: k */
    public String f12692k = "";

    public ff20(Act act) {
        this.f12689h = act;
    }

    /* JADX INFO: renamed from: B */
    private void m15318B(Drawable drawable, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setBackground(drawable);
        }
    }

    /* JADX INFO: renamed from: C */
    private void m15319C(@ColorInt int i, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setTitleColor(i);
        }
    }

    /* JADX INFO: renamed from: E */
    private void m15320E(Typeface typeface, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setTitleTypeface(typeface);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15321a(int i, int i2, VListCell vListCell) {
        VSwitchButton vSwitchButtonFindViewById = vListCell.findViewById(a5c0.S);
        if (NullChecker.a(vSwitchButtonFindViewById)) {
            vSwitchButtonFindViewById.setThumbActiveColor(i);
            vSwitchButtonFindViewById.setThumbInActiveColor(i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m15325e(int i, VListCell vListCell) {
        VSwitchButton vSwitchButtonFindViewById = vListCell.findViewById(a5c0.S);
        if (NullChecker.a(vSwitchButtonFindViewById)) {
            vSwitchButtonFindViewById.setActiveSliderColor(i);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m15328A(Drawable drawable) {
        m15318B(drawable, this.f12682a, this.f12683b, this.f12684c, this.f12685d, this.f12686e);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m15329C0() {
        return this.f12689h;
    }

    /* JADX INFO: renamed from: F */
    public void m15330F(String str) {
        this.f12692k = str;
    }

    /* JADX INFO: renamed from: G */
    public void m15331G(@ColorInt int i) {
        m15319C(i, this.f12682a, this.f12683b, this.f12684c, this.f12685d, this.f12686e);
    }

    /* JADX INFO: renamed from: H */
    public void m15332H(Typeface typeface) {
        m15320E(typeface, this.f12682a, this.f12683b, this.f12684c, this.f12685d, this.f12686e);
    }

    /* JADX INFO: renamed from: I */
    public final void m15333I(String str) {
        CoreModule.f1546o.m25559d().m5789ip(this.f12689h, str, Privilege.advanced_filter);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f12690i;
    }

    /* JADX INFO: renamed from: j */
    public final void m15335j(View view) {
        gf20.a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void mo12598k(View view) {
        this.f12690i = view;
        m15335j(view);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m15334i1(xe20 xe20Var) {
        this.f12691j = xe20Var;
    }

    /* JADX INFO: renamed from: m */
    public void m15337m(final int i) {
        vwb.z(vwb.f0(new VListCell[]{this.f12682a, this.f12683b, this.f12684c, this.f12685d, this.f12686e}), new e30() { // from class: l.df20
            public final void call(Object obj) {
                ff20.m15325e(i, (VListCell) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m15338n(final int i, final int i2) {
        vwb.z(vwb.f0(new VListCell[]{this.f12682a, this.f12683b, this.f12684c, this.f12685d, this.f12686e}), new e30() { // from class: l.ef20
            public final void call(Object obj) {
                ff20.m15321a(i, i2, (VListCell) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public String m15339p() {
        return this.f12692k;
    }

    /* JADX INFO: renamed from: q */
    public void m15340q(AdvancedSettings advancedSettings) {
        yij0.t(this.f12683b, advancedSettings.popular.booleanValue());
        yij0.t(this.f12684c, advancedSettings.realFace.booleanValue());
        yij0.t(this.f12685d, advancedSettings.student.booleanValue());
        yij0.t(this.f12686e, advancedSettings.newUser.booleanValue());
        yij0.t(this.f12682a, advancedSettings.online.booleanValue());
    }

    /* JADX INFO: renamed from: s */
    public void m15341s(View view) {
        mo12598k(view);
        if (lqa.v()) {
            if (NullChecker.a(this.f12687f)) {
                xdl0.M(this.f12687f, false);
            } else {
                xdl0.M(this.f12684c, false);
            }
        }
        this.f12683b.setOnClickListener(new View.OnClickListener() { // from class: l.ye20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f28167a.m15342u(view2);
            }
        });
        this.f12684c.setOnClickListener(new View.OnClickListener() { // from class: l.ze20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f28721a.m15343v(view2);
            }
        });
        this.f12685d.setOnClickListener(new View.OnClickListener() { // from class: l.af20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8235a.m15344w(view2);
            }
        });
        this.f12686e.setOnClickListener(new View.OnClickListener() { // from class: l.bf20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8856a.m15345x(view2);
            }
        });
        this.f12682a.setOnClickListener(new View.OnClickListener() { // from class: l.cf20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9631a.m15346y(view2);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m15342u(View view) {
        zvf0.u("e_advanced_filter_pop", m15339p(), new j760[]{vwb.Y("is_selected", Boolean.valueOf(!yij0.u(this.f12683b)))});
        if (!this.f12691j.m27223u0() && !xma.m27405y3()) {
            m15333I("p_home_filter,advanced");
            return;
        }
        zvf0.v("e_advanced_filter_pop", m15339p(), new j760[]{vwb.Y("is_selected", Boolean.valueOf(!yij0.u(this.f12683b)))});
        yij0.T(this.f12683b);
        this.f12691j.m27214A0();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m15343v(View view) {
        zvf0.u("e_advanced_filter_real", m15339p(), new j760[]{vwb.Y("is_selected", Boolean.valueOf(!yij0.u(this.f12684c)))});
        if (!this.f12691j.m27223u0() && !this.f12691j.m27218o0() && !xma.m27405y3()) {
            m15333I("p_home_filter,advanced");
            return;
        }
        zvf0.v("e_advanced_filter_real", m15339p(), new j760[]{vwb.Y("is_selected", Boolean.valueOf(!yij0.u(this.f12684c)))});
        yij0.T(this.f12684c);
        this.f12691j.m27214A0();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m15344w(View view) {
        zvf0.u("e_advanced_filter_student", m15339p(), new j760[]{vwb.Y("is_selected", Boolean.valueOf(!yij0.u(this.f12685d)))});
        if (!this.f12691j.m27223u0() && !this.f12691j.m27219p0() && !xma.m27405y3()) {
            m15333I("p_advanced_filter_page,e_advanced_filter_student,click");
            return;
        }
        zvf0.v("e_advanced_filter_student", m15339p(), new j760[]{vwb.Y("is_selected", Boolean.valueOf(!yij0.u(this.f12685d)))});
        yij0.T(this.f12685d);
        this.f12691j.m27214A0();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m15345x(View view) {
        zvf0.u("e_advanced_filter_new", m15339p(), new j760[]{vwb.Y("is_selected", Boolean.valueOf(!yij0.u(this.f12686e)))});
        if (!this.f12691j.m27223u0() && !xma.m27405y3()) {
            m15333I("p_home_filter,advanced");
            return;
        }
        zvf0.v("e_advanced_filter_new", m15339p(), new j760[]{vwb.Y("is_selected", Boolean.valueOf(!yij0.u(this.f12686e)))});
        yij0.T(this.f12686e);
        this.f12691j.m27214A0();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m15346y(View view) {
        zvf0.u("e_advanced_filter_online", m15339p(), new j760[]{vwb.Y("is_selected", Boolean.valueOf(!yij0.u(this.f12682a)))});
        if (!this.f12691j.m27223u0() && !xma.m27405y3()) {
            m15333I("p_home_filter,advanced");
            return;
        }
        zvf0.v("e_advanced_filter_online", m15339p(), new j760[]{vwb.Y("is_selected", Boolean.valueOf(!yij0.u(this.f12682a)))});
        yij0.T(this.f12682a);
        this.f12691j.m27214A0();
    }

    /* JADX INFO: renamed from: z */
    public void m15347z(AdvancedSettings advancedSettings) {
        advancedSettings.popular = Boolean.valueOf(yij0.u(this.f12683b));
        advancedSettings.realFace = Boolean.valueOf(yij0.u(this.f12684c));
        advancedSettings.student = Boolean.valueOf(yij0.u(this.f12685d));
        advancedSettings.newUser = Boolean.valueOf(yij0.u(this.f12686e));
        advancedSettings.online = Boolean.valueOf(yij0.u(this.f12682a));
    }

    public void destroy() {
    }
}
