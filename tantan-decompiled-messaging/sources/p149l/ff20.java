package p149l;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AdvancedSettings;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p147v.VListCell;
import p147v.VSwitchButton;

/* JADX INFO: loaded from: classes9.dex */
public class ff20 implements s7m<xe20> {

    /* JADX INFO: renamed from: a */
    public VListCell f97170a;

    /* JADX INFO: renamed from: b */
    public VListCell f97171b;

    /* JADX INFO: renamed from: c */
    public VListCell f97172c;

    /* JADX INFO: renamed from: d */
    public VListCell f97173d;

    /* JADX INFO: renamed from: e */
    public VListCell f97174e;

    /* JADX INFO: renamed from: f */
    public VLinear f97175f;

    /* JADX INFO: renamed from: g */
    public VLinear f97176g;

    /* JADX INFO: renamed from: h */
    public Act f97177h;

    /* JADX INFO: renamed from: i */
    public View f97178i;

    /* JADX INFO: renamed from: j */
    public xe20 f97179j;

    /* JADX INFO: renamed from: k */
    public String f97180k = "";

    public ff20(Act act) {
        this.f97177h = act;
    }

    /* JADX INFO: renamed from: B */
    private void m121072B(Drawable drawable, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setBackground(drawable);
        }
    }

    /* JADX INFO: renamed from: C */
    private void m121073C(@ColorInt int i, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setTitleColor(i);
        }
    }

    /* JADX INFO: renamed from: E */
    private void m121074E(Typeface typeface, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setTitleTypeface(typeface);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m121075a(int i, int i2, VListCell vListCell) {
        VSwitchButton vSwitchButton = (VSwitchButton) vListCell.findViewById(a5c0.f67665S);
        if (NullChecker.m81303a(vSwitchButton)) {
            vSwitchButton.setThumbActiveColor(i);
            vSwitchButton.setThumbInActiveColor(i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m121079e(int i, VListCell vListCell) {
        VSwitchButton vSwitchButton = (VSwitchButton) vListCell.findViewById(a5c0.f67665S);
        if (NullChecker.m81303a(vSwitchButton)) {
            vSwitchButton.setActiveSliderColor(i);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m121082A(Drawable drawable) {
        m121072B(drawable, this.f97170a, this.f97171b, this.f97172c, this.f97173d, this.f97174e);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f97177h;
    }

    /* JADX INFO: renamed from: F */
    public void m121083F(String str) {
        this.f97180k = str;
    }

    /* JADX INFO: renamed from: G */
    public void m121084G(@ColorInt int i) {
        m121073C(i, this.f97170a, this.f97171b, this.f97172c, this.f97173d, this.f97174e);
    }

    /* JADX INFO: renamed from: H */
    public void m121085H(Typeface typeface) {
        m121074E(typeface, this.f97170a, this.f97171b, this.f97172c, this.f97173d, this.f97174e);
    }

    /* JADX INFO: renamed from: I */
    public final void m121086I(String str) {
        CoreModule.f17557o.m195057d().mo33852ip(this.f97177h, str, Privilege.advanced_filter);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f97178i;
    }

    /* JADX INFO: renamed from: j */
    public final void m121087j(View view) {
        gf20.m125872a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void mo100946k(View view) {
        this.f97178i = view;
        m121087j(view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xe20 xe20Var) {
        this.f97179j = xe20Var;
    }

    /* JADX INFO: renamed from: m */
    public void m121089m(final int i) {
        vwb.m200354z(vwb.m200324f0(this.f97170a, this.f97171b, this.f97172c, this.f97173d, this.f97174e), new e30() { // from class: l.df20
            @Override // p149l.e30
            public final void call(Object obj) {
                ff20.m121079e(i, (VListCell) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m121090n(final int i, final int i2) {
        vwb.m200354z(vwb.m200324f0(this.f97170a, this.f97171b, this.f97172c, this.f97173d, this.f97174e), new e30() { // from class: l.ef20
            @Override // p149l.e30
            public final void call(Object obj) {
                ff20.m121075a(i, i2, (VListCell) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public String m121091p() {
        return this.f97180k;
    }

    /* JADX INFO: renamed from: q */
    public void m121092q(AdvancedSettings advancedSettings) {
        yij0.m214964t(this.f97171b, advancedSettings.popular.booleanValue());
        yij0.m214964t(this.f97172c, advancedSettings.realFace.booleanValue());
        yij0.m214964t(this.f97173d, advancedSettings.student.booleanValue());
        yij0.m214964t(this.f97174e, advancedSettings.newUser.booleanValue());
        yij0.m214964t(this.f97170a, advancedSettings.online.booleanValue());
    }

    /* JADX INFO: renamed from: s */
    public void m121093s(View view) {
        mo100946k(view);
        if (lqa.m150984v()) {
            if (NullChecker.m81303a(this.f97175f)) {
                xdl0.m208344M(this.f97175f, false);
            } else {
                xdl0.m208344M(this.f97172c, false);
            }
        }
        this.f97171b.setOnClickListener(new View.OnClickListener() { // from class: l.ye20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f197657a.m121094u(view2);
            }
        });
        this.f97172c.setOnClickListener(new View.OnClickListener() { // from class: l.ze20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f202768a.m121095v(view2);
            }
        });
        this.f97173d.setOnClickListener(new View.OnClickListener() { // from class: l.af20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f69147a.m121096w(view2);
            }
        });
        this.f97174e.setOnClickListener(new View.OnClickListener() { // from class: l.bf20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f75270a.m121097x(view2);
            }
        });
        this.f97170a.setOnClickListener(new View.OnClickListener() { // from class: l.cf20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f80535a.m121098y(view2);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m121094u(View view) {
        zvf0.m220399u("e_advanced_filter_pop", m121091p(), vwb.m200311Y("is_selected", Boolean.valueOf(!yij0.m214965u(this.f97171b))));
        if (!this.f97179j.m208502u0() && !xma.m210097y3()) {
            m121086I("p_home_filter,advanced");
            return;
        }
        zvf0.m220400v("e_advanced_filter_pop", m121091p(), vwb.m200311Y("is_selected", Boolean.valueOf(!yij0.m214965u(this.f97171b))));
        yij0.m214942T(this.f97171b);
        this.f97179j.m208493A0();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m121095v(View view) {
        zvf0.m220399u("e_advanced_filter_real", m121091p(), vwb.m200311Y("is_selected", Boolean.valueOf(!yij0.m214965u(this.f97172c))));
        if (!this.f97179j.m208502u0() && !this.f97179j.m208497o0() && !xma.m210097y3()) {
            m121086I("p_home_filter,advanced");
            return;
        }
        zvf0.m220400v("e_advanced_filter_real", m121091p(), vwb.m200311Y("is_selected", Boolean.valueOf(!yij0.m214965u(this.f97172c))));
        yij0.m214942T(this.f97172c);
        this.f97179j.m208493A0();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m121096w(View view) {
        zvf0.m220399u("e_advanced_filter_student", m121091p(), vwb.m200311Y("is_selected", Boolean.valueOf(!yij0.m214965u(this.f97173d))));
        if (!this.f97179j.m208502u0() && !this.f97179j.m208498p0() && !xma.m210097y3()) {
            m121086I("p_advanced_filter_page,e_advanced_filter_student,click");
            return;
        }
        zvf0.m220400v("e_advanced_filter_student", m121091p(), vwb.m200311Y("is_selected", Boolean.valueOf(!yij0.m214965u(this.f97173d))));
        yij0.m214942T(this.f97173d);
        this.f97179j.m208493A0();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m121097x(View view) {
        zvf0.m220399u("e_advanced_filter_new", m121091p(), vwb.m200311Y("is_selected", Boolean.valueOf(!yij0.m214965u(this.f97174e))));
        if (!this.f97179j.m208502u0() && !xma.m210097y3()) {
            m121086I("p_home_filter,advanced");
            return;
        }
        zvf0.m220400v("e_advanced_filter_new", m121091p(), vwb.m200311Y("is_selected", Boolean.valueOf(!yij0.m214965u(this.f97174e))));
        yij0.m214942T(this.f97174e);
        this.f97179j.m208493A0();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m121098y(View view) {
        zvf0.m220399u("e_advanced_filter_online", m121091p(), vwb.m200311Y("is_selected", Boolean.valueOf(!yij0.m214965u(this.f97170a))));
        if (!this.f97179j.m208502u0() && !xma.m210097y3()) {
            m121086I("p_home_filter,advanced");
            return;
        }
        zvf0.m220400v("e_advanced_filter_online", m121091p(), vwb.m200311Y("is_selected", Boolean.valueOf(!yij0.m214965u(this.f97170a))));
        yij0.m214942T(this.f97170a);
        this.f97179j.m208493A0();
    }

    /* JADX INFO: renamed from: z */
    public void m121099z(AdvancedSettings advancedSettings) {
        advancedSettings.popular = Boolean.valueOf(yij0.m214965u(this.f97171b));
        advancedSettings.realFace = Boolean.valueOf(yij0.m214965u(this.f97172c));
        advancedSettings.student = Boolean.valueOf(yij0.m214965u(this.f97173d));
        advancedSettings.newUser = Boolean.valueOf(yij0.m214965u(this.f97174e));
        advancedSettings.online = Boolean.valueOf(yij0.m214965u(this.f97170a));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
