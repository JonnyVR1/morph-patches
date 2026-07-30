package p002l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditItemView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputCompany;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputFriendPurpose;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputHangouts;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputHeight;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputHomeTown;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputProfession;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputQualification;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputSchoolNew;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Work;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.lsi0;
import l.mcr;
import l.o6j0;
import l.pj90;
import l.vwb;
import l.x2c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jcf extends AbstractC0064c {

    /* JADX INFO: renamed from: A */
    public ExpEditItemView f13678A;

    /* JADX INFO: renamed from: B */
    public ExpEditItemView f13679B;

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f13680u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f13681v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f13682w;

    /* JADX INFO: renamed from: x */
    public ExpEditItemView f13683x;

    /* JADX INFO: renamed from: y */
    public ExpEditItemView f13684y;

    /* JADX INFO: renamed from: z */
    public ExpEditItemView f13685z;

    public jcf(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: a0 */
    public static String m15836a0(Profile profile) {
        if (!NullChecker.a(profile)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str = vwb.J(profile.extensions.basic.country) ? "" : (String) profile.extensions.basic.country.get(0);
        if (!TextUtils.isEmpty(str) && !"中国".equals(str)) {
            sb.append(str);
        }
        String str2 = vwb.J(profile.extensions.basic.province) ? "" : (String) profile.extensions.basic.province.get(0);
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(str2);
        }
        String str3 = vwb.J(profile.extensions.basic.city) ? "" : (String) profile.extensions.basic.city.get(0);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("·");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m15837d0() {
        o6j0.c("e_edit_profile_dating_purpose", "p_edit_profile_view", new o6j0.a[0]);
        fif.m13250c(m1609i(), new ExpLoopInputFriendPurpose());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m15838e0() {
        o6j0.c("e_edit_profile_education_degree", "p_edit_profile_view", new o6j0.a[0]);
        fif.m13250c(m1609i(), new ExpLoopInputQualification());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m15839f0() {
        o6j0.c("e_edit_profile_height", "p_edit_profile_view", new o6j0.a[0]);
        fif.m13250c(m1609i(), new ExpLoopInputHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m15840g0(boolean z) {
        if (z) {
            fif.m13250c(m1609i(), new ExpLoopInputProfession());
        } else {
            lsi0.y("审核中，请稍后操作。");
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final String m15841b0(Profile profile) {
        String strM15836a0 = m15836a0(profile);
        return TextUtils.isEmpty(strM15836a0) ? profile.hometown : strM15836a0;
    }

    /* JADX INFO: renamed from: c0 */
    public String m15842c0(int i) {
        return m1624x().act().getString(i);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m15843h0() {
        o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "company")});
        fif.m13250c(m1609i(), new ExpLoopInputCompany());
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m15844i0(boolean z) {
        if (!z) {
            lsi0.y("审核中，请稍后操作。");
        } else if (!m1624x().m9268i2().profile.studies.verified) {
            fif.m13250c(m1609i(), new ExpLoopInputSchoolNew());
        } else {
            o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "school")});
            LoopFragmentFactory.m1945G(m1624x().mo1514J1());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m15845j0() {
        o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "hometown")});
        fif.m13250c(m1609i(), new ExpLoopInputHomeTown());
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m15846k0() {
        o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "hangouts")});
        fif.m13250c(m1609i(), new ExpLoopInputHangouts());
    }

    /* JADX INFO: renamed from: l0 */
    public void m15847l0(User user) {
        String str;
        String str2;
        String str3;
        List list = user.profile.extensions.basic.friendPurpose;
        String strM14242W = "";
        String str4 = !vwb.J(list) ? (String) h7j.m14239T(((Purpose) list.get(0)).toString()).a : "";
        List list2 = user.profile.extensions.physical.height;
        if (vwb.J(list2) || TextUtils.isEmpty((CharSequence) list2.get(0)) || pj90.v((String) list2.get(0))) {
            str = "";
        } else {
            str = ((String) list2.get(0)) + "cm";
        }
        Profile profile = user.profile;
        boolean z = profile.studies.active;
        ExpEditItemView expEditItemView = this.f13683x;
        if (z) {
            xdl0.M(expEditItemView, false);
            xdl0.M(this.f13683x.getDividerView(), false);
            str2 = "学生";
            str3 = "";
        } else {
            xdl0.M(expEditItemView, true);
            xdl0.M(this.f13683x.getDividerView(), true);
            boolean zIsEmpty = TextUtils.isEmpty(profile.work.industry);
            Work work = profile.work;
            if (zIsEmpty) {
                str2 = work.department;
            } else if ((TextUtils.equals(work.industry, "其他") || TextUtils.equals(profile.work.industry, "其它")) && !TextUtils.isEmpty(profile.work.department) && (TextUtils.equals(profile.work.department, "其他") || TextUtils.equals(profile.work.department, "其它"))) {
                str2 = "其他";
            } else {
                boolean zIsEmpty2 = TextUtils.isEmpty(profile.work.department);
                Work work2 = profile.work;
                if (zIsEmpty2) {
                    str2 = work2.industry;
                } else {
                    str2 = work2.industry + "·" + profile.work.department;
                }
            }
            str3 = profile.work.company;
        }
        String str5 = profile.studies.school;
        if (NullChecker.a(user.settings) && user.settings.hideSchoolName() && m1624x().mo1523P1()) {
            str5 = profile.studies.school + "(" + m15842c0(R.string.C0) + ")";
        }
        List list3 = user.profile.extensions.basic.qualification;
        if (!vwb.J(list3) && !TextUtils.isEmpty((CharSequence) list3.get(0)) && !pj90.v((String) list3.get(0))) {
            strM14242W = h7j.m14242W((String) list3.get(0));
        }
        m1681Q(this.f13680u, str4);
        m1681Q(this.f13681v, str);
        m1681Q(this.f13682w, str2);
        m1681Q(this.f13683x, str3);
        m1681Q(this.f13685z, str5);
        m1681Q(this.f13684y, strM14242W);
        m1681Q(this.f13678A, m15841b0(profile));
        m1681Q(this.f13679B, profile.hangouts);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "我的信息";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "info";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: q */
    public void mo1617q(View view) {
        super.mo1617q(view);
        User userP9 = CoreModule.c.e0.p9();
        final boolean z = (NullChecker.a(userP9.settings) && NullChecker.b(userP9.settings.verification) && NullChecker.b(userP9.settings.verification.studies) && TEnum.equals(userP9.settings.verification.studies.status, "pending")) ? false : true;
        m1622v(this.f13680u, new d30() { // from class: l.bcf
            public final void call() {
                this.f8070a.m15837d0();
            }
        }, true);
        m1622v(this.f13684y, new d30() { // from class: l.ccf
            public final void call() {
                this.f8590a.m15838e0();
            }
        }, true);
        m1622v(this.f13681v, new d30() { // from class: l.dcf
            public final void call() {
                this.f9164a.m15839f0();
            }
        }, true);
        m1622v(this.f13682w, new d30() { // from class: l.ecf
            public final void call() {
                this.f9666a.m15840g0(z);
            }
        }, true);
        m1622v(this.f13683x, new d30() { // from class: l.fcf
            public final void call() {
                this.f10230a.m15843h0();
            }
        }, true);
        m1622v(this.f13685z, new d30() { // from class: l.gcf
            public final void call() {
                this.f11360a.m15844i0(z);
            }
        }, true);
        m1622v(this.f13678A, new d30() { // from class: l.hcf
            public final void call() {
                this.f11970a.m15845j0();
            }
        }, true);
        m1622v(this.f13679B, new d30() { // from class: l.icf
            public final void call() {
                this.f13143a.m15846k0();
            }
        }, true);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    @NonNull
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f13680u = expEditItemView;
        expEditItemView.m1275d("交友目的", x2c0.Ls);
        this.f13680u.getDividerView();
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f13681v = expEditItemView2;
        expEditItemView2.m1275d("身高", x2c0.ys);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f13682w = expEditItemView3;
        expEditItemView3.m1275d("职业", x2c0.As);
        ExpEditItemView expEditItemView4 = new ExpEditItemView(viewGroup.getContext());
        this.f13683x = expEditItemView4;
        expEditItemView4.m1275d("公司", x2c0.os);
        ExpEditItemView expEditItemView5 = new ExpEditItemView(viewGroup.getContext());
        this.f13684y = expEditItemView5;
        expEditItemView5.m1275d("学历", x2c0.Ms);
        ExpEditItemView expEditItemView6 = new ExpEditItemView(viewGroup.getContext());
        this.f13685z = expEditItemView6;
        expEditItemView6.m1275d("学校", x2c0.Ns);
        ExpEditItemView expEditItemView7 = new ExpEditItemView(viewGroup.getContext());
        this.f13678A = expEditItemView7;
        expEditItemView7.m1275d("家乡", x2c0.zs);
        ExpEditItemView expEditItemView8 = new ExpEditItemView(viewGroup.getContext());
        this.f13679B = expEditItemView8;
        expEditItemView8.m1275d("经常出没", x2c0.xs);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f13680u);
        linearLayout.addView(this.f13680u.getDividerView());
        linearLayout.addView(this.f13681v);
        linearLayout.addView(this.f13681v.getDividerView());
        linearLayout.addView(this.f13682w);
        linearLayout.addView(this.f13682w.getDividerView());
        linearLayout.addView(this.f13683x);
        linearLayout.addView(this.f13683x.getDividerView());
        linearLayout.addView(this.f13685z);
        linearLayout.addView(this.f13685z.getDividerView());
        linearLayout.addView(this.f13684y);
        linearLayout.addView(this.f13684y.getDividerView());
        linearLayout.addView(this.f13678A);
        linearLayout.addView(this.f13678A.getDividerView());
        linearLayout.addView(this.f13679B);
        return linearLayout;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        m15847l0(m1624x().m9268i2());
    }
}
