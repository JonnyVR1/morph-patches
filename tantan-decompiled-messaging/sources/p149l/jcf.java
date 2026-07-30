package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditItemView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputCompany;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputFriendPurpose;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputHangouts;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputHeight;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputHomeTown;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputProfession;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputQualification;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputSchoolNew;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Purpose;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Work;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jcf extends AbstractC8639c {

    /* JADX INFO: renamed from: A */
    public ExpEditItemView f117297A;

    /* JADX INFO: renamed from: B */
    public ExpEditItemView f117298B;

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f117299u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f117300v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f117301w;

    /* JADX INFO: renamed from: x */
    public ExpEditItemView f117302x;

    /* JADX INFO: renamed from: y */
    public ExpEditItemView f117303y;

    /* JADX INFO: renamed from: z */
    public ExpEditItemView f117304z;

    public jcf(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: a0 */
    public static String m140903a0(Profile profile) {
        if (!NullChecker.m81303a(profile)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str = vwb.m200296J(profile.extensions.basic.country) ? "" : profile.extensions.basic.country.get(0);
        if (!TextUtils.isEmpty(str) && !"中国".equals(str)) {
            sb.append(str);
        }
        String str2 = vwb.m200296J(profile.extensions.basic.province) ? "" : profile.extensions.basic.province.get(0);
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(str2);
        }
        String str3 = vwb.m200296J(profile.extensions.basic.city) ? "" : profile.extensions.basic.city.get(0);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("·");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m140904d0() {
        o6j0.m162859c("e_edit_profile_dating_purpose", "p_edit_profile_view", new o6j0.C18854a[0]);
        fif.m121508c(m51157i(), new ExpLoopInputFriendPurpose());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m140905e0() {
        o6j0.m162859c("e_edit_profile_education_degree", "p_edit_profile_view", new o6j0.C18854a[0]);
        fif.m121508c(m51157i(), new ExpLoopInputQualification());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m140906f0() {
        o6j0.m162859c("e_edit_profile_height", "p_edit_profile_view", new o6j0.C18854a[0]);
        fif.m121508c(m51157i(), new ExpLoopInputHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m140907g0(boolean z) {
        if (z) {
            fif.m121508c(m51157i(), new ExpLoopInputProfession());
        } else {
            lsi0.m151595y("审核中，请稍后操作。");
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final String m140908b0(Profile profile) {
        String strM140903a0 = m140903a0(profile);
        return TextUtils.isEmpty(strM140903a0) ? profile.hometown : strM140903a0;
    }

    /* JADX INFO: renamed from: c0 */
    public String m140909c0(int i) {
        return m51172x().act().getString(i);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m140910h0() {
        o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", ProfileLikeCategoryType.company));
        fif.m121508c(m51157i(), new ExpLoopInputCompany());
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m140911i0(boolean z) {
        if (!z) {
            lsi0.m151595y("审核中，请稍后操作。");
        } else if (!m51172x().m94569i2().profile.studies.verified) {
            fif.m121508c(m51157i(), new ExpLoopInputSchoolNew());
        } else {
            o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", "school"));
            LoopFragmentFactory.m51463G(m51172x().mo51066J1());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m140912j0() {
        o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", ProfileLikeCategoryType.hometown));
        fif.m121508c(m51157i(), new ExpLoopInputHomeTown());
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m140913k0() {
        o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", ProfileLikeCategoryType.hangouts));
        fif.m121508c(m51157i(), new ExpLoopInputHangouts());
    }

    /* JADX INFO: renamed from: l0 */
    public void m140914l0(User user) {
        String str;
        String str2;
        String str3;
        List<Purpose> list = user.profile.extensions.basic.friendPurpose;
        String strM129711W = "";
        String str4 = !vwb.m200296J(list) ? h7j.m129708T(list.get(0).toString()).f191751a : "";
        List<String> list2 = user.profile.extensions.physical.height;
        if (vwb.m200296J(list2) || TextUtils.isEmpty(list2.get(0)) || pj90.m169808v(list2.get(0))) {
            str = "";
        } else {
            str = list2.get(0) + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
        }
        Profile profile = user.profile;
        boolean z = profile.studies.active;
        ExpEditItemView expEditItemView = this.f117302x;
        if (z) {
            xdl0.m208344M(expEditItemView, false);
            xdl0.m208344M(this.f117302x.getDividerView(), false);
            str2 = "学生";
            str3 = "";
        } else {
            xdl0.m208344M(expEditItemView, true);
            xdl0.m208344M(this.f117302x.getDividerView(), true);
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
        if (NullChecker.m81303a(user.settings) && user.settings.hideSchoolName() && m51172x().mo51075P1()) {
            str5 = profile.studies.school + "(" + m140909c0(R$string.f17627C0) + ")";
        }
        List<String> list3 = user.profile.extensions.basic.qualification;
        if (!vwb.m200296J(list3) && !TextUtils.isEmpty(list3.get(0)) && !pj90.m169808v(list3.get(0))) {
            strM129711W = h7j.m129711W(list3.get(0));
        }
        m51226Q(this.f117299u, str4);
        m51226Q(this.f117300v, str);
        m51226Q(this.f117301w, str2);
        m51226Q(this.f117302x, str3);
        m51226Q(this.f117304z, str5);
        m51226Q(this.f117303y, strM129711W);
        m51226Q(this.f117297A, m140908b0(profile));
        m51226Q(this.f117298B, profile.hangouts);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "我的信息";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return BaseSei.INFO;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: q */
    public void mo51165q(View view) {
        super.mo51165q(view);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        final boolean z = (NullChecker.m81303a(userM169527p9.settings) && NullChecker.m81304b(userM169527p9.settings.verification) && NullChecker.m81304b(userM169527p9.settings.verification.studies) && TEnum.equals(userM169527p9.settings.verification.studies.status, "pending")) ? false : true;
        m51170v(this.f117299u, new d30() { // from class: l.bcf
            @Override // p149l.d30
            public final void call() {
                this.f74917a.m140904d0();
            }
        }, true);
        m51170v(this.f117303y, new d30() { // from class: l.ccf
            @Override // p149l.d30
            public final void call() {
                this.f80232a.m140905e0();
            }
        }, true);
        m51170v(this.f117300v, new d30() { // from class: l.dcf
            @Override // p149l.d30
            public final void call() {
                this.f85396a.m140906f0();
            }
        }, true);
        m51170v(this.f117301w, new d30() { // from class: l.ecf
            @Override // p149l.d30
            public final void call() {
                this.f90495a.m140907g0(z);
            }
        }, true);
        m51170v(this.f117302x, new d30() { // from class: l.fcf
            @Override // p149l.d30
            public final void call() {
                this.f96793a.m140910h0();
            }
        }, true);
        m51170v(this.f117304z, new d30() { // from class: l.gcf
            @Override // p149l.d30
            public final void call() {
                this.f102006a.m140911i0(z);
            }
        }, true);
        m51170v(this.f117297A, new d30() { // from class: l.hcf
            @Override // p149l.d30
            public final void call() {
                this.f107044a.m140912j0();
            }
        }, true);
        m51170v(this.f117298B, new d30() { // from class: l.icf
            @Override // p149l.d30
            public final void call() {
                this.f112458a.m140913k0();
            }
        }, true);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    @NonNull
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f117299u = expEditItemView;
        expEditItemView.m50829d("交友目的", x2c0.f189529Ls);
        this.f117299u.getDividerView();
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f117300v = expEditItemView2;
        expEditItemView2.m50829d("身高", x2c0.f190759ys);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f117301w = expEditItemView3;
        expEditItemView3.m50829d("职业", x2c0.f189182As);
        ExpEditItemView expEditItemView4 = new ExpEditItemView(viewGroup.getContext());
        this.f117302x = expEditItemView4;
        expEditItemView4.m50829d("公司", x2c0.f190439os);
        ExpEditItemView expEditItemView5 = new ExpEditItemView(viewGroup.getContext());
        this.f117303y = expEditItemView5;
        expEditItemView5.m50829d("学历", x2c0.f189560Ms);
        ExpEditItemView expEditItemView6 = new ExpEditItemView(viewGroup.getContext());
        this.f117304z = expEditItemView6;
        expEditItemView6.m50829d("学校", x2c0.f189591Ns);
        ExpEditItemView expEditItemView7 = new ExpEditItemView(viewGroup.getContext());
        this.f117297A = expEditItemView7;
        expEditItemView7.m50829d("家乡", x2c0.f190791zs);
        ExpEditItemView expEditItemView8 = new ExpEditItemView(viewGroup.getContext());
        this.f117298B = expEditItemView8;
        expEditItemView8.m50829d("经常出没", x2c0.f190727xs);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f117299u);
        linearLayout.addView(this.f117299u.getDividerView());
        linearLayout.addView(this.f117300v);
        linearLayout.addView(this.f117300v.getDividerView());
        linearLayout.addView(this.f117301w);
        linearLayout.addView(this.f117301w.getDividerView());
        linearLayout.addView(this.f117302x);
        linearLayout.addView(this.f117302x.getDividerView());
        linearLayout.addView(this.f117304z);
        linearLayout.addView(this.f117304z.getDividerView());
        linearLayout.addView(this.f117303y);
        linearLayout.addView(this.f117303y.getDividerView());
        linearLayout.addView(this.f117297A);
        linearLayout.addView(this.f117297A.getDividerView());
        linearLayout.addView(this.f117298B);
        return linearLayout;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        m140914l0(m51172x().m94569i2());
    }
}
