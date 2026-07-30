package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.settings.PersonalDetailsAct;
import com.p046p1.mobile.putong.core.p053ui.settings.addemoji.AddEmojiAct;
import com.p046p1.mobile.putong.core.p053ui.settings.personaldetails.PersonalDetailsPresenter;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VScroll;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class ll60 implements s7m<PersonalDetailsPresenter> {

    /* JADX INFO: renamed from: a */
    public VLinear f128638a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f128639b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f128640c;

    /* JADX INFO: renamed from: d */
    public VScroll f128641d;

    /* JADX INFO: renamed from: e */
    public VLinear f128642e;

    /* JADX INFO: renamed from: f */
    public VText f128643f;

    /* JADX INFO: renamed from: g */
    public VLinear f128644g;

    /* JADX INFO: renamed from: h */
    public VText f128645h;

    /* JADX INFO: renamed from: i */
    public VLinear f128646i;

    /* JADX INFO: renamed from: j */
    public VText f128647j;

    /* JADX INFO: renamed from: k */
    public VLinear f128648k;

    /* JADX INFO: renamed from: l */
    public VText f128649l;

    /* JADX INFO: renamed from: m */
    public VLinear f128650m;

    /* JADX INFO: renamed from: n */
    public VText f128651n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f128652o;

    /* JADX INFO: renamed from: p */
    public PersonalDetailsPresenter f128653p;

    /* JADX INFO: renamed from: q */
    public Map<String, String> f128654q;

    /* JADX INFO: renamed from: r */
    public PersonalDetailsAct f128655r;

    /* JADX INFO: renamed from: s */
    public boolean f128656s = true;

    /* JADX INFO: renamed from: t */
    public boolean f128657t = false;

    public ll60(PersonalDetailsAct personalDetailsAct) {
        this.f128655r = personalDetailsAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m150410A(String str) {
        this.f128653p.m55665E0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m150411B(View view) {
        i0e.m133795d(this.f128655r).m133815E(1).m133814D(50).m133818H(this.f128653p.m55667p0()).m133816F(new e30() { // from class: l.kl60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123638a.m150410A((String) obj);
            }
        }).m133820J(new w9j() { // from class: l.vk60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return yij0.m214934L(((Spannable) obj).toString());
            }
        }).m133821n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m150412E(View view) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(getAct().getResources().getString(R$string.f18899s0));
        arrayList.add(getAct().getResources().getString(R$string.f18959u0));
        arrayList.add(getAct().getResources().getString(R$string.f18989v0));
        arrayList.add(getAct().getResources().getString(R$string.f18929t0));
        arrayList.add(getAct().getResources().getString(R$string.f19019w0));
        final ArrayList arrayListM200324f0 = vwb.m200324f0("A", "B", BloodType.f38728O, BloodType.f38726AB, "UNKNOWN");
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_blood_type_dialog", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        getAct().dialog().m20503E0(R$string.f18869r0).m20535e0(arrayList).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.il60
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f113770a.m150433C(arrayList, arrayListM200324f0, dialog, view2, i, charSequence);
            }
        }).m20541k0(R$string.f18408c).m20526V(new DialogInterface.OnDismissListener() { // from class: l.jl60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20568z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m150413F(View view) {
        getAct().startActivityForResult(AddEmojiAct.m55230Z1(getContext(), "personal_information"), 532);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m150414M() {
        CoreDlg.m44993I1(this.f128655r, new v9j() { // from class: l.xk60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f193268a.m150434G();
            }
        }, new e30() { // from class: l.yk60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198728a.m150436I((Double) obj);
            }
        }, new e30() { // from class: l.zk60
            @Override // p149l.e30
            public final void call(Object obj) {
                ll60.m150419e((Boolean) obj);
            }
        });
        zvf0.m220402x("e_edit_basic_info_calendar", "p_edit_basic_info_view");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m150419e(Boolean bool) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m150430u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m150432y(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m150433C(List list, List list2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i < list.size()) {
            this.f128653p.m55664C0(BloodType.get((String) list2.get(i)));
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f128655r;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Double m150434G() {
        return Double.valueOf(this.f128653p.m55666o0());
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m150435H(Double d) {
        this.f128653p.m55663A0(d.doubleValue());
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m150436I(final Double d) {
        if (d.doubleValue() == this.f128653p.m55666o0()) {
            return;
        }
        new dd80.C16336a(this.f128655r).m110996y0(mqi0.f135250b.format(d)).m110991t0(this.f128655r.string(R$string.f18848q9)).m110974c0(this.f128655r.getString(R$string.f18562h), new Runnable() { // from class: l.al60
            @Override // java.lang.Runnable
            public final void run() {
                this.f70410a.m150435H(d);
            }
        }).m110969X(this.f128655r.string(R$string.f19078y), new hl60(this)).m110961P(true).m110989r0();
        if (!this.f128657t || d.equals(CoreModule.f17545c.f19639e0.m169520na().settings.birthdate)) {
            return;
        }
        ark.m98453V0(getAct(), false, CoreModule.f17545c.f19639e0.m169520na().pictures.get(0), getAct().string(R$string.f18491el), new Runnable() { // from class: l.bl60
            @Override // java.lang.Runnable
            public final void run() {
                ll60.m150430u();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m150437J() {
        this.f128646i.performClick();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m150438K(List list, View view) {
        if (zb0.m217807d()) {
            zvf0.m220368A("e_age_verify_edit_age", "p_edit_basic_info_view", vwb.m200311Y("edit_failed_reason", "verify_pending"));
            lsi0.m151593w(R$string.f17896L);
        } else if (zb0.m217808e()) {
            zvf0.m220368A("e_age_verify_edit_age", "p_edit_basic_info_view", vwb.m200311Y("edit_failed_reason", "verify_succeed"));
            lsi0.m151593w(R$string.f17866K);
        } else {
            if (vwb.m200296J(list) || ((SettingGroups) list.get(0)).profile.birthChanged) {
                return;
            }
            new dd80.C16336a(this.f128655r).m110996y0(this.f128655r.string(R$string.f18908s9)).m110991t0(this.f128655r.string(R$string.f18878r9)).m110974c0(this.f128655r.getString(R$string.f18818p9), new hl60(this)).m110961P(true).m110989r0();
        }
    }

    /* JADX INFO: renamed from: L */
    public void m150439L() {
        if (this.f128641d.getVisibility() == 4) {
            this.f128641d.setVisibility(0);
            this.f128640c.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m150440N() {
        this.f128657t = true;
        e51.m114741F(getAct(), new Runnable() { // from class: l.wk60
            @Override // java.lang.Runnable
            public final void run() {
                this.f186727a.m150437J();
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m150441O(User user) {
        this.f128643f.setText(this.f128654q.get(user.gender.toString()));
        this.f128645h.setText(user.name);
        this.f128647j.setText(mqi0.f135250b.format(user.settings.birthdate));
        if (!vwb.m200296J(user.profile.extensions.physical.bloodType)) {
            this.f128649l.setText(b43.m100167a(user.profile.extensions.physical.bloodType.get(0)));
        }
        final List<SettingGroups> list = user.settings.settingGroups;
        if (vwb.m200296J(list) || list.get(0).profile.birthChanged) {
            this.f128647j.setTextColor(hvc0.m133154a(w0c0.f183832b0));
            xdl0.m208329E0(this.f128646i, null);
        } else {
            this.f128647j.setTextColor(hvc0.m133154a(w0c0.f183802R1));
            xdl0.m208329E0(this.f128646i, new View.OnClickListener() { // from class: l.uk60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f176908a.m150438K(list, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public void m150442P() {
        xdl0.m208344M(this.f128650m, true);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        boolean zM200296J = vwb.m200296J(userM169527p9.profile.extensions.interest.emoji);
        VText vText = this.f128651n;
        if (zM200296J) {
            xdl0.m208344M(vText, true);
            xdl0.m208344M(this.f128652o, false);
            return;
        }
        xdl0.m208344M(vText, false);
        xdl0.m208344M(this.f128652o, true);
        xdl0.m208344M(this.f128650m, true);
        qib0.f154691G.m102331L0(this.f128652o, qib0.f154709X.m126254n(userM169527p9.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f128655r;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m150444w(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m150443r() {
        this.f128647j.setTextColor(hvc0.m133154a(w0c0.f183832b0));
        this.f128639b.getLeftIconContainer().setBackgroundResource(x2c0.f190442p);
        this.f128639b.setTitle(R$string.f19132zn);
        this.f128639b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.cl60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81371a.m150432y(view);
            }
        });
        e01 e01Var = new e01();
        this.f128654q = e01Var;
        e01Var.put("male", getAct().getResources().getString(R$string.f17711Eo));
        this.f128654q.put("female", getAct().getResources().getString(R$string.f17681Do));
        new e30() { // from class: l.dl60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86783a.m150446z((Runnable) obj);
            }
        };
        this.f128644g.setOnClickListener(new View.OnClickListener() { // from class: l.el60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92073a.m150411B(view);
            }
        });
        xdl0.m208345M0(this.f128648k, b43.m100168b());
        this.f128648k.setOnClickListener(new View.OnClickListener() { // from class: l.fl60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98128a.m150412E(view);
            }
        });
        m150442P();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.gl60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103299a.m150413F(view);
            }
        };
        this.f128650m.setOnClickListener(onClickListener);
        this.f128652o.setOnClickListener(onClickListener);
    }

    /* JADX INFO: renamed from: w */
    public View m150444w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ml60.m155123b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(PersonalDetailsPresenter personalDetailsPresenter) {
        this.f128653p = personalDetailsPresenter;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m150446z(Runnable runnable) {
        if (!this.f128656s) {
            runnable.run();
        } else {
            this.f128656s = false;
            this.f128655r.dialog().m20503E0(R$string.f18320Z3).m20500D(R$string.f18351a4).m20556t0(R$string.f18136T, runnable).m20542l0(R$string.f18408c, null).m20496B(false).m20568z0();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
