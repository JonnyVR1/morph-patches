package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.settings.PersonalDetailsAct;
import com.p051p1.mobile.putong.core.p058ui.settings.addemoji.AddEmojiAct;
import com.p051p1.mobile.putong.core.p058ui.settings.personaldetails.PersonalDetailsPresenter;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VScroll;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class rt60 implements iam<PersonalDetailsPresenter> {

    /* JADX INFO: renamed from: a */
    public VLinear f164773a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f164774b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f164775c;

    /* JADX INFO: renamed from: d */
    public VScroll f164776d;

    /* JADX INFO: renamed from: e */
    public VLinear f164777e;

    /* JADX INFO: renamed from: f */
    public VText f164778f;

    /* JADX INFO: renamed from: g */
    public VLinear f164779g;

    /* JADX INFO: renamed from: h */
    public VText f164780h;

    /* JADX INFO: renamed from: i */
    public VLinear f164781i;

    /* JADX INFO: renamed from: j */
    public VText f164782j;

    /* JADX INFO: renamed from: k */
    public VLinear f164783k;

    /* JADX INFO: renamed from: l */
    public VText f164784l;

    /* JADX INFO: renamed from: m */
    public VLinear f164785m;

    /* JADX INFO: renamed from: n */
    public VText f164786n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f164787o;

    /* JADX INFO: renamed from: p */
    public PersonalDetailsPresenter f164788p;

    /* JADX INFO: renamed from: q */
    public Map<String, String> f164789q;

    /* JADX INFO: renamed from: r */
    public PersonalDetailsAct f164790r;

    /* JADX INFO: renamed from: s */
    public boolean f164791s = true;

    /* JADX INFO: renamed from: t */
    public boolean f164792t = false;

    public rt60(PersonalDetailsAct personalDetailsAct) {
        this.f164790r = personalDetailsAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m183063A(String str) {
        this.f164788p.m56848E0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m183064B(View view) {
        w1e.m204400d(this.f164790r).m204420E(1).m204419D(50).m204423H(this.f164788p.m56850p0()).m204421F(new y20() { // from class: l.qt60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159392a.m183063A((String) obj);
            }
        }).m204425J(new qcj() { // from class: l.bt60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bsj0.m106254L(((Spannable) obj).toString());
            }
        }).m204426n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m183065E(View view) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(getAct().getResources().getString(R$string.f19632s0));
        arrayList.add(getAct().getResources().getString(R$string.f19694u0));
        arrayList.add(getAct().getResources().getString(R$string.f19725v0));
        arrayList.add(getAct().getResources().getString(R$string.f19663t0));
        arrayList.add(getAct().getResources().getString(R$string.f19756w0));
        final ArrayList arrayListM147507f0 = jyb.m147507f0("A", "B", BloodType.f39576O, BloodType.f39574AB, "UNKNOWN");
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_blood_type_dialog", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        getAct().dialog().m21502E0(R$string.f19601r0).m21534e0(arrayList).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.ot60
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f148928a.m183086C(arrayList, arrayListM147507f0, dialog, view2, i, charSequence);
            }
        }).m21540k0(R$string.f19138c).m21525V(new DialogInterface.OnDismissListener() { // from class: l.pt60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21567z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m183066F(View view) {
        getAct().startActivityForResult(AddEmojiAct.m56413a2(getContext(), "personal_information"), 532);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m183067M() {
        CoreDlg.m46176I1(this.f164790r, new pcj() { // from class: l.dt60
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f90541a.m183087G();
            }
        }, new y20() { // from class: l.et60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95696a.m183089I((Double) obj);
            }
        }, new y20() { // from class: l.ft60
            @Override // p153l.y20
            public final void call(Object obj) {
                rt60.m183072e((Boolean) obj);
            }
        });
        i4g0.m138526x("e_edit_basic_info_calendar", "p_edit_basic_info_view");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m183072e(Boolean bool) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m183083u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m183085y(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m183086C(List list, List list2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i < list.size()) {
            this.f164788p.m56847C0(BloodType.get((String) list2.get(i)));
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f164790r;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Double m183087G() {
        return Double.valueOf(this.f164788p.m56849o0());
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m183088H(Double d) {
        this.f164788p.m56846A0(d.doubleValue());
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m183089I(final Double d) {
        if (d.doubleValue() == this.f164788p.m56849o0()) {
            return;
        }
        new jl80.C17971a(this.f164790r).m146056y0(pzi0.f154855b.format(d)).m146051t0(this.f164790r.string(R$string.f19765w9)).m146034c0(this.f164790r.getString(R$string.f19292h), new Runnable() { // from class: l.gt60
            @Override // java.lang.Runnable
            public final void run() {
                this.f106384a.m183088H(d);
            }
        }).m146029X(this.f164790r.string(R$string.f19817y), new nt60(this)).m146021P(true).m146049r0();
        if (!this.f164792t || d.equals(CoreModule.f18264c.f20381e0.m116593na().settings.birthdate)) {
            return;
        }
        qtk.m178003V0(getAct(), false, CoreModule.f18264c.f20381e0.m116593na().pictures.get(0), getAct().string(R$string.f18307Al), new Runnable() { // from class: l.ht60
            @Override // java.lang.Runnable
            public final void run() {
                rt60.m183083u();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m183090J() {
        this.f164781i.performClick();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m183091K(List list, View view) {
        if (vb0.m200642d()) {
            i4g0.m138492A("e_age_verify_edit_age", "p_edit_basic_info_view", jyb.m147494Y("edit_failed_reason", "verify_pending"));
            o1j0.m165649w(R$string.f18626L);
        } else if (vb0.m200643e()) {
            i4g0.m138492A("e_age_verify_edit_age", "p_edit_basic_info_view", jyb.m147494Y("edit_failed_reason", "verify_succeed"));
            o1j0.m165649w(R$string.f18595K);
        } else {
            if (jyb.m147479J(list) || ((SettingGroups) list.get(0)).profile.birthChanged) {
                return;
            }
            new jl80.C17971a(this.f164790r).m146056y0(this.f164790r.string(R$string.f19827y9)).m146051t0(this.f164790r.string(R$string.f19796x9)).m146034c0(this.f164790r.getString(R$string.f19734v9), new nt60(this)).m146021P(true).m146049r0();
        }
    }

    /* JADX INFO: renamed from: L */
    public void m183092L() {
        if (this.f164776d.getVisibility() == 4) {
            this.f164776d.setVisibility(0);
            this.f164775c.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m183093N() {
        this.f164792t = true;
        l51.m152886F(getAct(), new Runnable() { // from class: l.ct60
            @Override // java.lang.Runnable
            public final void run() {
                this.f83668a.m183090J();
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m183094O(User user) {
        this.f164778f.setText(this.f164789q.get(user.gender.toString()));
        this.f164780h.setText(user.name);
        this.f164782j.setText(pzi0.f154855b.format(user.settings.birthdate));
        if (!jyb.m147479J(user.profile.extensions.physical.bloodType)) {
            this.f164784l.setText(r43.m179738a(user.profile.extensions.physical.bloodType.get(0)));
        }
        final List<SettingGroups> list = user.settings.settingGroups;
        if (jyb.m147479J(list) || list.get(0).profile.birthChanged) {
            this.f164782j.setTextColor(k3d0.m148005a(c9c0.f80405c0));
            bnl0.m105509E0(this.f164781i, null);
        } else {
            this.f164782j.setTextColor(k3d0.m148005a(c9c0.f80374S1));
            bnl0.m105509E0(this.f164781i, new View.OnClickListener() { // from class: l.at60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f73211a.m183091K(list, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public void m183095P() {
        bnl0.m105524M(this.f164785m, true);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        boolean zM147479J = jyb.m147479J(userM116600p9.profile.extensions.interest.emoji);
        VText vText = this.f164786n;
        if (zM147479J) {
            bnl0.m105524M(vText, true);
            bnl0.m105524M(this.f164787o, false);
            return;
        }
        bnl0.m105524M(vText, false);
        bnl0.m105524M(this.f164787o, true);
        bnl0.m105524M(this.f164785m, true);
        uqb0.f180374G.m127115L0(this.f164787o, uqb0.f180392X.m135325n(userM116600p9.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f164790r;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m183097w(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m183096r() {
        this.f164782j.setTextColor(k3d0.m148005a(c9c0.f80405c0));
        this.f164774b.getLeftIconContainer().setBackgroundResource(dbc0.f87333q);
        this.f164774b.setTitle(R$string.f18950Vn);
        this.f164774b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.it60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116803a.m183085y(view);
            }
        });
        l01 l01Var = new l01();
        this.f164789q = l01Var;
        l01Var.put("male", getAct().getResources().getString(R$string.f19102ap));
        this.f164789q.put("female", getAct().getResources().getString(R$string.f19071Zo));
        new y20() { // from class: l.jt60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122554a.m183099z((Runnable) obj);
            }
        };
        this.f164779g.setOnClickListener(new View.OnClickListener() { // from class: l.kt60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128654a.m183064B(view);
            }
        });
        bnl0.m105525M0(this.f164783k, r43.m179739b());
        this.f164783k.setOnClickListener(new View.OnClickListener() { // from class: l.lt60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133527a.m183065E(view);
            }
        });
        m183095P();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.mt60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138547a.m183066F(view);
            }
        };
        this.f164785m.setOnClickListener(onClickListener);
        this.f164787o.setOnClickListener(onClickListener);
    }

    /* JADX INFO: renamed from: w */
    public View m183097w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return st60.m187847b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(PersonalDetailsPresenter personalDetailsPresenter) {
        this.f164788p = personalDetailsPresenter;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m183099z(Runnable runnable) {
        if (!this.f164791s) {
            runnable.run();
        } else {
            this.f164791s = false;
            this.f164790r.dialog().m21502E0(R$string.f19112b4).m21499D(R$string.f19143c4).m21555t0(R$string.f18866T, runnable).m21541l0(R$string.f19138c, null).m21495B(false).m21567z0();
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
