package p006l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.PersonalDetailsAct;
import com.p000p1.mobile.putong.core.p004ui.settings.addemoji.AddEmojiAct;
import com.p000p1.mobile.putong.core.p004ui.settings.personaldetails.PersonalDetailsPresenter;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l.ark;
import l.cwf0;
import l.dd80;
import l.e01;
import l.e30;
import l.e51;
import l.hvc0;
import l.i0e;
import l.j760;
import l.lsi0;
import l.ml60;
import l.mqi0;
import l.s7m;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.yij0;
import l.zvf0;
import v.VDraweeView;
import v.VLinear;
import v.VProgressBar;
import v.VScroll;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ll60 implements s7m<PersonalDetailsPresenter> {

    /* JADX INFO: renamed from: a */
    public VLinear f16487a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f16488b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f16489c;

    /* JADX INFO: renamed from: d */
    public VScroll f16490d;

    /* JADX INFO: renamed from: e */
    public VLinear f16491e;

    /* JADX INFO: renamed from: f */
    public VText f16492f;

    /* JADX INFO: renamed from: g */
    public VLinear f16493g;

    /* JADX INFO: renamed from: h */
    public VText f16494h;

    /* JADX INFO: renamed from: i */
    public VLinear f16495i;

    /* JADX INFO: renamed from: j */
    public VText f16496j;

    /* JADX INFO: renamed from: k */
    public VLinear f16497k;

    /* JADX INFO: renamed from: l */
    public VText f16498l;

    /* JADX INFO: renamed from: m */
    public VLinear f16499m;

    /* JADX INFO: renamed from: n */
    public VText f16500n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f16501o;

    /* JADX INFO: renamed from: p */
    public PersonalDetailsPresenter f16502p;

    /* JADX INFO: renamed from: q */
    public Map<String, String> f16503q;

    /* JADX INFO: renamed from: r */
    public PersonalDetailsAct f16504r;

    /* JADX INFO: renamed from: s */
    public boolean f16505s = true;

    /* JADX INFO: renamed from: t */
    public boolean f16506t = false;

    public ll60(PersonalDetailsAct personalDetailsAct) {
        this.f16504r = personalDetailsAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m18853A(String str) {
        this.f16502p.m9061E0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m18854B(View view) {
        i0e.d(this.f16504r).E(1).D(50).H(this.f16502p.m9064p0()).F(new e30() { // from class: l.kl60
            public final void call(Object obj) {
                this.f15887a.m18853A((String) obj);
            }
        }).J(new w9j() { // from class: l.vk60
            public final Object call(Object obj) {
                return yij0.L(((Spannable) obj).toString());
            }
        }).n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m18855E(View view) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(act().getResources().getString(R$string.f2888s0));
        arrayList.add(act().getResources().getString(R$string.f2948u0));
        arrayList.add(act().getResources().getString(R$string.f2978v0));
        arrayList.add(act().getResources().getString(R$string.f2918t0));
        arrayList.add(act().getResources().getString(R$string.f3008w0));
        final ArrayList arrayListF0 = vwb.f0(new String[]{"A", "B", "O", "AB", "UNKNOWN"});
        final cwf0 cwf0VarC = i0e.c("p_blood_type_dialog", Dialog.class.getName());
        i0e.f(cwf0VarC);
        act().dialog().E0(R$string.f2858r0).e0(arrayList).g0(new Dialog.g() { // from class: l.il60
            /* JADX INFO: renamed from: a */
            public final void m16729a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f14541a.m18876C(arrayList, arrayListF0, dialog, view2, i, charSequence);
            }
        }).k0(R$string.f2397c).V(new DialogInterface.OnDismissListener() { // from class: l.jl60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m18856F(View view) {
        act().startActivityForResult(AddEmojiAct.m8599Z1(m18877C0(), "personal_information"), 532);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m18857M() {
        CoreDlg.I1(this.f16504r, new v9j() { // from class: l.xk60
            public final Object call() {
                return this.f27560a.m18878G();
            }
        }, new e30() { // from class: l.yk60
            public final void call(Object obj) {
                this.f28256a.m18880I((Double) obj);
            }
        }, new e30() { // from class: l.zk60
            public final void call(Object obj) {
                ll60.m18862e((Boolean) obj);
            }
        });
        zvf0.x("e_edit_basic_info_calendar", "p_edit_basic_info_view");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m18862e(Boolean bool) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m18873u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m18875y(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m18876C(List list, List list2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i < list.size()) {
            this.f16502p.m9060C0(BloodType.get((String) list2.get(i)));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18877C0() {
        return this.f16504r;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Double m18878G() {
        return Double.valueOf(this.f16502p.m9063o0());
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m18879H(Double d) {
        this.f16502p.m9059A0(d.doubleValue());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m18880I(final Double d) {
        if (d.doubleValue() == this.f16502p.m9063o0()) {
            return;
        }
        new dd80.a(this.f16504r).y0(mqi0.b.format(d)).t0(this.f16504r.string(R$string.f2837q9)).c0(this.f16504r.getString(R$string.f2551h), new Runnable() { // from class: l.al60
            @Override // java.lang.Runnable
            public final void run() {
                this.f8310a.m18879H(d);
            }
        }).X(this.f16504r.string(R$string.f3067y), new hl60(this)).P(true).r0();
        if (!this.f16506t || d.equals(CoreModule.f1534c.f3628e0.m21483na().settings.birthdate)) {
            return;
        }
        ark.V0(act(), false, (Media) CoreModule.f1534c.f3628e0.m21483na().pictures.get(0), act().string(R$string.f2480el), new Runnable() { // from class: l.bl60
            @Override // java.lang.Runnable
            public final void run() {
                ll60.m18873u();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m18881J() {
        this.f16495i.performClick();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m18882K(List list, View view) {
        if (zb0.m28637d()) {
            zvf0.A("e_age_verify_edit_age", "p_edit_basic_info_view", new j760[]{vwb.Y("edit_failed_reason", "verify_pending")});
            lsi0.w(R$string.f1885L);
        } else if (zb0.m28638e()) {
            zvf0.A("e_age_verify_edit_age", "p_edit_basic_info_view", new j760[]{vwb.Y("edit_failed_reason", "verify_succeed")});
            lsi0.w(R$string.f1855K);
        } else {
            if (vwb.J(list) || ((SettingGroups) list.get(0)).profile.birthChanged) {
                return;
            }
            new dd80.a(this.f16504r).y0(this.f16504r.string(R$string.f2897s9)).t0(this.f16504r.string(R$string.f2867r9)).c0(this.f16504r.getString(R$string.f2807p9), new hl60(this)).P(true).r0();
        }
    }

    /* JADX INFO: renamed from: L */
    public void m18883L() {
        if (this.f16490d.getVisibility() == 4) {
            this.f16490d.setVisibility(0);
            this.f16489c.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m18884N() {
        this.f16506t = true;
        e51.F(act(), new Runnable() { // from class: l.wk60
            @Override // java.lang.Runnable
            public final void run() {
                this.f25190a.m18881J();
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m18885O(User user) {
        this.f16492f.setText(this.f16503q.get(user.gender.toString()));
        this.f16494h.setText(user.name);
        this.f16496j.setText(mqi0.b.format(user.settings.birthdate));
        if (!vwb.J(user.profile.extensions.physical.bloodType)) {
            this.f16498l.setText(b43.m12518a((BloodType) user.profile.extensions.physical.bloodType.get(0)));
        }
        final List list = user.settings.settingGroups;
        if (vwb.J(list) || ((SettingGroups) list.get(0)).profile.birthChanged) {
            this.f16496j.setTextColor(hvc0.a(w0c0.f24672b0));
            xdl0.E0(this.f16495i, (View.OnClickListener) null);
        } else {
            this.f16496j.setTextColor(hvc0.a(w0c0.f24642R1));
            xdl0.E0(this.f16495i, new View.OnClickListener() { // from class: l.uk60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23585a.m18882K(list, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public void m18886P() {
        xdl0.M(this.f16499m, true);
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        boolean zJ = vwb.J(userM21490p9.profile.extensions.interest.emoji);
        VText vText = this.f16500n;
        if (zJ) {
            xdl0.M(vText, true);
            xdl0.M(this.f16501o, false);
            return;
        }
        xdl0.M(vText, false);
        xdl0.M(this.f16501o, true);
        xdl0.M(this.f16499m, true);
        qib0.f19782G.m12744L0(this.f16501o, qib0.f19800X.m15799n((String) userM21490p9.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    @Nullable
    public Act act() {
        return this.f16504r;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m18889w(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m18888r() {
        this.f16496j.setTextColor(hvc0.a(w0c0.f24672b0));
        this.f16488b.getLeftIconContainer().setBackgroundResource(x2c0.f26978p);
        this.f16488b.setTitle(R$string.f3121zn);
        this.f16488b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.cl60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9709a.m18875y(view);
            }
        });
        e01 e01Var = new e01();
        this.f16503q = e01Var;
        e01Var.put("male", act().getResources().getString(R$string.f1700Eo));
        this.f16503q.put("female", act().getResources().getString(R$string.f1670Do));
        new e30() { // from class: l.dl60
            public final void call(Object obj) {
                this.f10456a.m18891z((Runnable) obj);
            }
        };
        this.f16493g.setOnClickListener(new View.OnClickListener() { // from class: l.el60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11229a.m18854B(view);
            }
        });
        xdl0.M0(this.f16497k, b43.m12519b());
        this.f16497k.setOnClickListener(new View.OnClickListener() { // from class: l.fl60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12754a.m18855E(view);
            }
        });
        m18886P();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.gl60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13355a.m18856F(view);
            }
        };
        this.f16499m.setOnClickListener(onClickListener);
        this.f16501o.setOnClickListener(onClickListener);
    }

    /* JADX INFO: renamed from: w */
    public View m18889w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ml60.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m18887i1(PersonalDetailsPresenter personalDetailsPresenter) {
        this.f16502p = personalDetailsPresenter;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m18891z(Runnable runnable) {
        if (!this.f16505s) {
            runnable.run();
        } else {
            this.f16505s = false;
            this.f16504r.dialog().E0(R$string.f2309Z3).D(R$string.f2340a4).t0(R$string.f2125T, runnable).l0(R$string.f2397c, (Runnable) null).B(false).z0();
        }
    }

    public void destroy() {
    }
}
