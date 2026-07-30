package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditItemView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputCompany;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputFriendPurpose;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputHangouts;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputHeight;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputHomeTown;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputProfession;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputQualification;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputSchoolNew;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Purpose;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Work;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class pdf extends AbstractC8802c {

    /* JADX INFO: renamed from: A */
    public ExpEditItemView f151746A;

    /* JADX INFO: renamed from: B */
    public ExpEditItemView f151747B;

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f151748u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f151749v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f151750w;

    /* JADX INFO: renamed from: x */
    public ExpEditItemView f151751x;

    /* JADX INFO: renamed from: y */
    public ExpEditItemView f151752y;

    /* JADX INFO: renamed from: z */
    public ExpEditItemView f151753z;

    public pdf(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: a0 */
    public static String m171799a0(Profile profile) {
        if (!NullChecker.m82486a(profile)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str = jyb.m147479J(profile.extensions.basic.country) ? "" : profile.extensions.basic.country.get(0);
        if (!TextUtils.isEmpty(str) && !"中国".equals(str)) {
            sb.append(str);
        }
        String str2 = jyb.m147479J(profile.extensions.basic.province) ? "" : profile.extensions.basic.province.get(0);
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(str2);
        }
        String str3 = jyb.m147479J(profile.extensions.basic.city) ? "" : profile.extensions.basic.city.get(0);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("·");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m171800d0() {
        sfj0.m185596c("e_edit_profile_dating_purpose", "p_edit_profile_view", new sfj0.C20032a[0]);
        ljf.m154506c(m52340i(), new ExpLoopInputFriendPurpose());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m171801e0() {
        sfj0.m185596c("e_edit_profile_education_degree", "p_edit_profile_view", new sfj0.C20032a[0]);
        ljf.m154506c(m52340i(), new ExpLoopInputQualification());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m171802f0() {
        sfj0.m185596c("e_edit_profile_height", "p_edit_profile_view", new sfj0.C20032a[0]);
        ljf.m154506c(m52340i(), new ExpLoopInputHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m171803g0(boolean z) {
        if (z) {
            ljf.m154506c(m52340i(), new ExpLoopInputProfession());
        } else {
            o1j0.m165651y("审核中，请稍后操作。");
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final String m171804b0(Profile profile) {
        String strM171799a0 = m171799a0(profile);
        return TextUtils.isEmpty(strM171799a0) ? profile.hometown : strM171799a0;
    }

    /* JADX INFO: renamed from: c0 */
    public String m171805c0(int i) {
        return m52355x().act().getString(i);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m171806h0() {
        sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", ProfileLikeCategoryType.company));
        ljf.m154506c(m52340i(), new ExpLoopInputCompany());
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m171807i0(boolean z) {
        if (!z) {
            o1j0.m165651y("审核中，请稍后操作。");
        } else if (!m52355x().m189086i2().profile.studies.verified) {
            ljf.m154506c(m52340i(), new ExpLoopInputSchoolNew());
        } else {
            sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", "school"));
            LoopFragmentFactory.m52646G(m52355x().mo52249J1());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m171808j0() {
        sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", ProfileLikeCategoryType.hometown));
        ljf.m154506c(m52340i(), new ExpLoopInputHomeTown());
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m171809k0() {
        sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", ProfileLikeCategoryType.hangouts));
        ljf.m154506c(m52340i(), new ExpLoopInputHangouts());
    }

    /* JADX INFO: renamed from: l0 */
    public void m171810l0(User user) {
        String str;
        String str2;
        String str3;
        List<Purpose> list = user.profile.extensions.basic.friendPurpose;
        String strM103182W = "";
        String str4 = !jyb.m147479J(list) ? baj.m103179T(list.get(0).toString()).f77081a : "";
        List<String> list2 = user.profile.extensions.physical.height;
        if (jyb.m147479J(list2) || TextUtils.isEmpty(list2.get(0)) || tr90.m192433v(list2.get(0))) {
            str = "";
        } else {
            str = list2.get(0) + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
        }
        Profile profile = user.profile;
        boolean z = profile.studies.active;
        ExpEditItemView expEditItemView = this.f151751x;
        if (z) {
            bnl0.m105524M(expEditItemView, false);
            bnl0.m105524M(this.f151751x.getDividerView(), false);
            str2 = "学生";
            str3 = "";
        } else {
            bnl0.m105524M(expEditItemView, true);
            bnl0.m105524M(this.f151751x.getDividerView(), true);
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
        if (NullChecker.m82486a(user.settings) && user.settings.hideSchoolName() && m52355x().mo52258P1()) {
            str5 = profile.studies.school + "(" + m171805c0(R$string.f18348C0) + ")";
        }
        List<String> list3 = user.profile.extensions.basic.qualification;
        if (!jyb.m147479J(list3) && !TextUtils.isEmpty(list3.get(0)) && !tr90.m192433v(list3.get(0))) {
            strM103182W = baj.m103182W(list3.get(0));
        }
        m52409Q(this.f151748u, str4);
        m52409Q(this.f151749v, str);
        m52409Q(this.f151750w, str2);
        m52409Q(this.f151751x, str3);
        m52409Q(this.f151753z, str5);
        m52409Q(this.f151752y, strM103182W);
        m52409Q(this.f151746A, m171804b0(profile));
        m52409Q(this.f151747B, profile.hangouts);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "我的信息";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return BaseSei.INFO;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: q */
    public void mo52348q(View view) {
        super.mo52348q(view);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        final boolean z = (NullChecker.m82486a(userM116600p9.settings) && NullChecker.m82487b(userM116600p9.settings.verification) && NullChecker.m82487b(userM116600p9.settings.verification.studies) && TEnum.equals(userM116600p9.settings.verification.studies.status, "pending")) ? false : true;
        m52353v(this.f151748u, new x20() { // from class: l.hdf
            @Override // p153l.x20
            public final void call() {
                this.f108985a.m171800d0();
            }
        }, true);
        m52353v(this.f151752y, new x20() { // from class: l.idf
            @Override // p153l.x20
            public final void call() {
                this.f114502a.m171801e0();
            }
        }, true);
        m52353v(this.f151749v, new x20() { // from class: l.jdf
            @Override // p153l.x20
            public final void call() {
                this.f120248a.m171802f0();
            }
        }, true);
        m52353v(this.f151750w, new x20() { // from class: l.kdf
            @Override // p153l.x20
            public final void call() {
                this.f125240a.m171803g0(z);
            }
        }, true);
        m52353v(this.f151751x, new x20() { // from class: l.ldf
            @Override // p153l.x20
            public final void call() {
                this.f131630a.m171806h0();
            }
        }, true);
        m52353v(this.f151753z, new x20() { // from class: l.mdf
            @Override // p153l.x20
            public final void call() {
                this.f136374a.m171807i0(z);
            }
        }, true);
        m52353v(this.f151746A, new x20() { // from class: l.ndf
            @Override // p153l.x20
            public final void call() {
                this.f141487a.m171808j0();
            }
        }, true);
        m52353v(this.f151747B, new x20() { // from class: l.odf
            @Override // p153l.x20
            public final void call() {
                this.f146901a.m171809k0();
            }
        }, true);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    @NonNull
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f151748u = expEditItemView;
        expEditItemView.m52012d("交友目的", dbc0.f86006At);
        this.f151748u.getDividerView();
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f151749v = expEditItemView2;
        expEditItemView2.m52012d("身高", dbc0.f87264nt);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f151750w = expEditItemView3;
        expEditItemView3.m52012d("职业", dbc0.f87330pt);
        ExpEditItemView expEditItemView4 = new ExpEditItemView(viewGroup.getContext());
        this.f151751x = expEditItemView4;
        expEditItemView4.m52012d("公司", dbc0.f86904ct);
        ExpEditItemView expEditItemView5 = new ExpEditItemView(viewGroup.getContext());
        this.f151752y = expEditItemView5;
        expEditItemView5.m52012d("学历", dbc0.f86038Bt);
        ExpEditItemView expEditItemView6 = new ExpEditItemView(viewGroup.getContext());
        this.f151753z = expEditItemView6;
        expEditItemView6.m52012d("学校", dbc0.f86070Ct);
        ExpEditItemView expEditItemView7 = new ExpEditItemView(viewGroup.getContext());
        this.f151746A = expEditItemView7;
        expEditItemView7.m52012d("家乡", dbc0.f87297ot);
        ExpEditItemView expEditItemView8 = new ExpEditItemView(viewGroup.getContext());
        this.f151747B = expEditItemView8;
        expEditItemView8.m52012d("经常出没", dbc0.f87231mt);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f151748u);
        linearLayout.addView(this.f151748u.getDividerView());
        linearLayout.addView(this.f151749v);
        linearLayout.addView(this.f151749v.getDividerView());
        linearLayout.addView(this.f151750w);
        linearLayout.addView(this.f151750w.getDividerView());
        linearLayout.addView(this.f151751x);
        linearLayout.addView(this.f151751x.getDividerView());
        linearLayout.addView(this.f151753z);
        linearLayout.addView(this.f151753z.getDividerView());
        linearLayout.addView(this.f151752y);
        linearLayout.addView(this.f151752y.getDividerView());
        linearLayout.addView(this.f151746A);
        linearLayout.addView(this.f151746A.getDividerView());
        linearLayout.addView(this.f151747B);
        return linearLayout;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        m171810l0(m52355x().m189086i2());
    }
}
