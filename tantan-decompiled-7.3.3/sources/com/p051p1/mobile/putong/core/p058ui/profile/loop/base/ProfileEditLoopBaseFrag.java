package com.p051p1.mobile.putong.core.p058ui.profile.loop.base;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Work;
import java.util.List;
import p153l.bqa0;
import p153l.i4g0;
import p153l.jyb;
import p153l.pf60;
import p153l.sfj0;
import p153l.xra;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ProfileEditLoopBaseFrag extends PutongFrag implements bqa0 {

    /* JADX INFO: renamed from: A */
    public String f34295A;

    /* JADX INFO: renamed from: B */
    public int f34296B;

    /* JADX INFO: renamed from: C */
    public int f34297C;

    /* JADX INFO: renamed from: D */
    public boolean f34298D;

    /* JADX INFO: renamed from: E */
    public String f34299E;

    /* JADX INFO: renamed from: F */
    public String f34300F;

    /* JADX INFO: renamed from: G */
    public String f34301G;

    /* JADX INFO: renamed from: H */
    public String f34302H;

    /* JADX INFO: renamed from: z */
    public LoopInputType f34303z;

    @Override // p153l.bqa0
    /* JADX INFO: renamed from: H */
    public void mo52769H() {
        if (mo52771N4()) {
            mo52789e5();
            User userMo52775R4 = mo52775R4();
            mo52773P4(userMo52775R4);
            m52772O4(userMo52775R4, mo52776S4());
            m52782X4(true);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public void mo52770M4() {
    }

    /* JADX INFO: renamed from: N4 */
    public boolean mo52771N4() {
        return true;
    }

    /* JADX INFO: renamed from: O4 */
    public final void m52772O4(User user, User user2) {
        Profile profile = user2.profile;
        Work work = profile.work;
        Profile profile2 = user.profile;
        work.active = profile2.work.active;
        profile.studies.active = profile2.studies.active;
    }

    /* JADX INFO: renamed from: P4 */
    public abstract void mo52773P4(User user);

    /* JADX INFO: renamed from: Q4 */
    public ProfileInfoLoopEditAct m52774Q4() {
        return (ProfileInfoLoopEditAct) getActivity();
    }

    /* JADX INFO: renamed from: R4 */
    public User mo52775R4() {
        return act() instanceof ProfileInfoLoopEditAct ? m52774Q4().m52692b2().m52742u0() : CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
    }

    /* JADX INFO: renamed from: S4 */
    public User mo52776S4() {
        return act() instanceof ProfileInfoLoopEditAct ? m52774Q4().m52692b2().m52744y0() : CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
    }

    /* JADX INFO: renamed from: T4 */
    public boolean mo52777T4(boolean z) {
        return false;
    }

    /* JADX INFO: renamed from: U4 */
    public boolean m52778U4() {
        return TextUtils.equals(this.f34300F, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG) || TextUtils.equals(this.f34300F, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_PROFILE_ITEM);
    }

    /* JADX INFO: renamed from: V4 */
    public boolean m52779V4() {
        Act act = (Act) getActivity();
        if (act instanceof ProfileInfoLoopEditAct) {
            return ((ProfileInfoLoopEditAct) act).m52692b2().m52745z0();
        }
        return false;
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m52780W4() {
        Act act = (Act) getActivity();
        return (act instanceof ProfileInfoLoopEditAct) && ((ProfileInfoLoopEditAct) act).m52692b2().m52743x0() == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT;
    }

    @Override // p153l.bqa0
    /* JADX INFO: renamed from: X */
    public boolean mo52781X() {
        return true;
    }

    /* JADX INFO: renamed from: X4 */
    public final void m52782X4(boolean z) {
        if (!mo52777T4(z) && (getContext() instanceof ProfileInfoLoopEditAct)) {
            ((ProfileInfoLoopEditAct) getContext()).m52694d2(z);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public void mo52783Y4(List<Media> list, int i) {
    }

    /* JADX INFO: renamed from: Z4 */
    public void m52784Z4() {
        LoopInputType loopInputType = this.f34303z;
        if (loopInputType == LoopInputType.BIRTHDAY) {
            mo30636J4().m152781p(pf60.m172085a("continuous_edit_complete_count", 0), pf60.m172085a("continuous_edit_last_step", Boolean.valueOf(this.f34298D)), pf60.m172085a("continuous_edit_step_num", 1), pf60.m172085a("edit_show_from", "edit_profile_view"));
        } else if (loopInputType == LoopInputType.NICKNAME) {
            mo30636J4().m152781p(pf60.m172085a("continuous_edit_complete_count", 0), pf60.m172085a("continuous_edit_last_step", Boolean.valueOf(this.f34298D)), pf60.m172085a("continuous_edit_step_num", 1), pf60.m172085a("edit_show_from", "edit_profile_view"));
        } else if (loopInputType == LoopInputType.PROFESSION) {
            mo30636J4().m152781p(pf60.m172085a("edit_specific_profile_show_from", this.f34299E));
        } else if (loopInputType == LoopInputType.GROWTH_FOOD) {
            mo30636J4().m152781p(pf60.m172085a("continuous_edit_complete_count", Integer.valueOf(this.f34297C)), pf60.m172085a("continuous_edit_last_step", Boolean.valueOf(this.f34298D)), pf60.m172085a("continuous_edit_step_num", Integer.valueOf(this.f34296B)), pf60.m172085a("edit_specific_profile_show_from", this.f34299E), pf60.m172085a("tantanx_scene_name", this.f34299E), pf60.m172085a("is_test_field", xra.m212804w() ? "is_test_field_y" : "is_test_field_n"));
        } else {
            mo30636J4().m152781p(pf60.m172085a("continuous_edit_complete_count", Integer.valueOf(this.f34297C)), pf60.m172085a("continuous_edit_last_step", Boolean.valueOf(this.f34298D)), pf60.m172085a("continuous_edit_step_num", Integer.valueOf(this.f34296B)), pf60.m172085a("edit_specific_profile_show_from", this.f34299E));
        }
        if (this.f34303z != LoopInputType.PHOTO) {
            mo52788d5();
        }
    }

    /* JADX INFO: renamed from: a5 */
    public void m52785a5(LoopInputType loopInputType, int i, int i2, boolean z, String str, String str2, String str3) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            setArguments(arguments);
        }
        arguments.putSerializable("loop_input_type", loopInputType);
        arguments.putString("loop_page_id", loopInputType.pageId);
        arguments.putInt("loop_has_input_count", i2);
        arguments.putInt("loop_has_show_count", i);
        arguments.putBoolean("loop_is_finish_page", z);
        arguments.putString("loop_create_from_page", str);
        arguments.putString("loop_edit_from", str2);
        arguments.putString("ext_value", str3);
    }

    /* JADX INFO: renamed from: b5 */
    public void m52786b5(LoopInputType loopInputType, String str, String str2) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            setArguments(arguments);
        }
        arguments.putSerializable("loop_input_type", loopInputType);
        arguments.putString("loop_page_id", loopInputType.pageId);
        arguments.putInt("loop_has_input_count", 1);
        arguments.putInt("loop_has_show_count", 0);
        arguments.putBoolean("loop_is_finish_page", true);
        arguments.putString("loop_edit_from", "edit_profile");
        arguments.putString("loop_create_from_page", str);
        arguments.putString("loop_single_frag_ext_value", str2);
    }

    /* JADX INFO: renamed from: c5 */
    public void m52787c5() {
        LoopInputType loopInputType = this.f34303z;
        i4g0.m138523u("e_edit_specific_profile_skip", loopInputType.pageId, jyb.m147494Y("specific_edit_page_name", loopInputType.pageName));
    }

    /* JADX INFO: renamed from: d5 */
    public void mo52788d5() {
        LoopInputType loopInputType = this.f34303z;
        i4g0.m138492A("e_edit_specific_profile_skip", loopInputType.pageId, jyb.m147494Y("specific_edit_page_name", loopInputType.pageName));
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: e5 */
    public void mo52789e5() {
        LoopInputType loopInputType = this.f34303z;
        if (loopInputType != LoopInputType.INDUSTRY && loopInputType != LoopInputType.DEPARTMENT && loopInputType != LoopInputType.HOMETOWN && loopInputType != LoopInputType.QUALIFICATION && loopInputType != LoopInputType.FRIEND_PURPOSE && loopInputType != LoopInputType.INCOME && loopInputType != LoopInputType.GROWTH_FOOD && loopInputType != LoopInputType.CAR) {
            i4g0.m138523u("e_edit_specific_profile_next", loopInputType.pageId, jyb.m147494Y("specific_edit_page_name", loopInputType.pageName));
        }
        if (this.f34303z == LoopInputType.QUALIFICATION) {
            sfj0.m185596c("e_intl_edit_degree_btn", "p_intl_edit_degree", new sfj0.C20032a[0]);
        }
        if (this.f34303z == LoopInputType.SCHOOL_NEW) {
            sfj0.m185596c("e_intl_edit_school_btn", "p_intl_edit_school", new sfj0.C20032a[0]);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public void m52790f5() {
        LoopInputType loopInputType = this.f34303z;
        i4g0.m138492A("e_edit_specific_profile_next", loopInputType.pageId, jyb.m147494Y("specific_edit_page_name", loopInputType.pageName));
    }

    /* JADX INFO: renamed from: g5 */
    public void m52791g5(int i) {
        if (i < 0) {
            return;
        }
        LoopInputType loopInputType = this.f34303z;
        if (loopInputType == LoopInputType.INDUSTRY) {
            i4g0.m138520r("e_edit_industry_selection", loopInputType.pageId);
            return;
        }
        if (loopInputType == LoopInputType.HOMETOWN) {
            i4g0.m138520r("e_edit_hometown_selection", loopInputType.pageId);
            return;
        }
        if (loopInputType == LoopInputType.DEPARTMENT) {
            i4g0.m138520r("e_edit_job_selection", loopInputType.pageId);
            return;
        }
        if (loopInputType == LoopInputType.FRIEND_PURPOSE) {
            if (i < CoreModule.f18276o.m132214d().mo34779Wg()) {
                i4g0.m138523u("e_edit_dating_purpose_selection", this.f34303z.pageId, jyb.m147494Y("dating_purpose", CoreModule.f18276o.m132214d().mo34683El(i)));
            }
        } else {
            if (loopInputType == LoopInputType.INCOME) {
                i4g0.m138520r("e_edit_income_selection", loopInputType.pageId);
                return;
            }
            if (loopInputType == LoopInputType.CAR) {
                i4g0.m138520r("e_edit_car_selection", loopInputType.pageId);
            } else if (loopInputType == LoopInputType.QUALIFICATION) {
                i4g0.m138520r("e_edit_education_degree_selection", loopInputType.pageId);
            } else if (loopInputType == LoopInputType.GROWTH_FOOD) {
                i4g0.m138520r("e_edit_flavor_preference_selection", loopInputType.pageId);
            }
        }
    }

    @Override // p153l.bqa0
    /* JADX INFO: renamed from: h1 */
    public void mo52792h1() {
        m52787c5();
        m52782X4(false);
    }

    @Override // p153l.bqa0
    public boolean isLast() {
        return m52774Q4().m52693c2();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        this.f34303z = (LoopInputType) getArguments().getSerializable("loop_input_type");
        this.f34295A = getArguments().getString("loop_page_id");
        this.f34296B = getArguments().getInt("loop_has_show_count") + 1;
        this.f34297C = getArguments().getInt("loop_has_input_count");
        this.f34298D = getArguments().getBoolean("loop_is_finish_page");
        this.f34299E = getArguments().getString("loop_create_from_page");
        this.f34300F = getArguments().getString("loop_edit_from");
        this.f34301G = getArguments().getString("ext_value");
        this.f34302H = getArguments().getString("loop_single_frag_ext_value");
        super.onCreate(bundle);
        m52784Z4();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return this.f34295A;
    }
}
