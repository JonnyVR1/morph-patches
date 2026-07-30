package com.p046p1.mobile.putong.core.p053ui.profile.loop.base;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Work;
import java.util.List;
import p149l.j760;
import p149l.lqa;
import p149l.o6j0;
import p149l.vwb;
import p149l.xha0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ProfileEditLoopBaseFrag extends PutongFrag implements xha0 {

    /* JADX INFO: renamed from: A */
    public String f33447A;

    /* JADX INFO: renamed from: B */
    public int f33448B;

    /* JADX INFO: renamed from: C */
    public int f33449C;

    /* JADX INFO: renamed from: D */
    public boolean f33450D;

    /* JADX INFO: renamed from: E */
    public String f33451E;

    /* JADX INFO: renamed from: F */
    public String f33452F;

    /* JADX INFO: renamed from: G */
    public String f33453G;

    /* JADX INFO: renamed from: H */
    public String f33454H;

    /* JADX INFO: renamed from: z */
    public LoopInputType f33455z;

    @Override // p149l.xha0
    /* JADX INFO: renamed from: H */
    public void mo51586H() {
        if (mo51588N4()) {
            mo51606e5();
            User userMo51592R4 = mo51592R4();
            mo51590P4(userMo51592R4);
            m51589O4(userMo51592R4, mo51593S4());
            m51599X4(true);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public void mo51587M4() {
    }

    /* JADX INFO: renamed from: N4 */
    public boolean mo51588N4() {
        return true;
    }

    /* JADX INFO: renamed from: O4 */
    public final void m51589O4(User user, User user2) {
        Profile profile = user2.profile;
        Work work = profile.work;
        Profile profile2 = user.profile;
        work.active = profile2.work.active;
        profile.studies.active = profile2.studies.active;
    }

    /* JADX INFO: renamed from: P4 */
    public abstract void mo51590P4(User user);

    /* JADX INFO: renamed from: Q4 */
    public ProfileInfoLoopEditAct m51591Q4() {
        return (ProfileInfoLoopEditAct) getActivity();
    }

    /* JADX INFO: renamed from: R4 */
    public User mo51592R4() {
        return act() instanceof ProfileInfoLoopEditAct ? m51591Q4().m51509a2().m51559u0() : CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
    }

    /* JADX INFO: renamed from: S4 */
    public User mo51593S4() {
        return act() instanceof ProfileInfoLoopEditAct ? m51591Q4().m51509a2().m51561y0() : CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
    }

    /* JADX INFO: renamed from: T4 */
    public boolean mo51594T4(boolean z) {
        return false;
    }

    /* JADX INFO: renamed from: U4 */
    public boolean m51595U4() {
        return TextUtils.equals(this.f33452F, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG) || TextUtils.equals(this.f33452F, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_PROFILE_ITEM);
    }

    /* JADX INFO: renamed from: V4 */
    public boolean m51596V4() {
        Act act = (Act) getActivity();
        if (act instanceof ProfileInfoLoopEditAct) {
            return ((ProfileInfoLoopEditAct) act).m51509a2().m51562z0();
        }
        return false;
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m51597W4() {
        Act act = (Act) getActivity();
        return (act instanceof ProfileInfoLoopEditAct) && ((ProfileInfoLoopEditAct) act).m51509a2().m51560x0() == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT;
    }

    @Override // p149l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo51598X() {
        return true;
    }

    /* JADX INFO: renamed from: X4 */
    public final void m51599X4(boolean z) {
        if (!mo51594T4(z) && (getContext() instanceof ProfileInfoLoopEditAct)) {
            ((ProfileInfoLoopEditAct) getContext()).m51511c2(z);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public void mo51600Y4(List<Media> list, int i) {
    }

    /* JADX INFO: renamed from: Z4 */
    public void m51601Z4() {
        LoopInputType loopInputType = this.f33455z;
        if (loopInputType == LoopInputType.BIRTHDAY) {
            mo29638J4().m109040p(j760.m140076a("continuous_edit_complete_count", 0), j760.m140076a("continuous_edit_last_step", Boolean.valueOf(this.f33450D)), j760.m140076a("continuous_edit_step_num", 1), j760.m140076a("edit_show_from", "edit_profile_view"));
        } else if (loopInputType == LoopInputType.NICKNAME) {
            mo29638J4().m109040p(j760.m140076a("continuous_edit_complete_count", 0), j760.m140076a("continuous_edit_last_step", Boolean.valueOf(this.f33450D)), j760.m140076a("continuous_edit_step_num", 1), j760.m140076a("edit_show_from", "edit_profile_view"));
        } else if (loopInputType == LoopInputType.PROFESSION) {
            mo29638J4().m109040p(j760.m140076a("edit_specific_profile_show_from", this.f33451E));
        } else if (loopInputType == LoopInputType.GROWTH_FOOD) {
            mo29638J4().m109040p(j760.m140076a("continuous_edit_complete_count", Integer.valueOf(this.f33449C)), j760.m140076a("continuous_edit_last_step", Boolean.valueOf(this.f33450D)), j760.m140076a("continuous_edit_step_num", Integer.valueOf(this.f33448B)), j760.m140076a("edit_specific_profile_show_from", this.f33451E), j760.m140076a("tantanx_scene_name", this.f33451E), j760.m140076a("is_test_field", lqa.m150985w() ? "is_test_field_y" : "is_test_field_n"));
        } else {
            mo29638J4().m109040p(j760.m140076a("continuous_edit_complete_count", Integer.valueOf(this.f33449C)), j760.m140076a("continuous_edit_last_step", Boolean.valueOf(this.f33450D)), j760.m140076a("continuous_edit_step_num", Integer.valueOf(this.f33448B)), j760.m140076a("edit_specific_profile_show_from", this.f33451E));
        }
        if (this.f33455z != LoopInputType.PHOTO) {
            mo51605d5();
        }
    }

    /* JADX INFO: renamed from: a5 */
    public void m51602a5(LoopInputType loopInputType, int i, int i2, boolean z, String str, String str2, String str3) {
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
    public void m51603b5(LoopInputType loopInputType, String str, String str2) {
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
    public void m51604c5() {
        LoopInputType loopInputType = this.f33455z;
        zvf0.m220399u("e_edit_specific_profile_skip", loopInputType.pageId, vwb.m200311Y("specific_edit_page_name", loopInputType.pageName));
    }

    /* JADX INFO: renamed from: d5 */
    public void mo51605d5() {
        LoopInputType loopInputType = this.f33455z;
        zvf0.m220368A("e_edit_specific_profile_skip", loopInputType.pageId, vwb.m200311Y("specific_edit_page_name", loopInputType.pageName));
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: e5 */
    public void mo51606e5() {
        LoopInputType loopInputType = this.f33455z;
        if (loopInputType != LoopInputType.INDUSTRY && loopInputType != LoopInputType.DEPARTMENT && loopInputType != LoopInputType.HOMETOWN && loopInputType != LoopInputType.QUALIFICATION && loopInputType != LoopInputType.FRIEND_PURPOSE && loopInputType != LoopInputType.INCOME && loopInputType != LoopInputType.GROWTH_FOOD && loopInputType != LoopInputType.CAR) {
            zvf0.m220399u("e_edit_specific_profile_next", loopInputType.pageId, vwb.m200311Y("specific_edit_page_name", loopInputType.pageName));
        }
        if (this.f33455z == LoopInputType.QUALIFICATION) {
            o6j0.m162859c("e_intl_edit_degree_btn", "p_intl_edit_degree", new o6j0.C18854a[0]);
        }
        if (this.f33455z == LoopInputType.SCHOOL_NEW) {
            o6j0.m162859c("e_intl_edit_school_btn", "p_intl_edit_school", new o6j0.C18854a[0]);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public void m51607f5() {
        LoopInputType loopInputType = this.f33455z;
        zvf0.m220368A("e_edit_specific_profile_next", loopInputType.pageId, vwb.m200311Y("specific_edit_page_name", loopInputType.pageName));
    }

    /* JADX INFO: renamed from: g5 */
    public void m51608g5(int i) {
        if (i < 0) {
            return;
        }
        LoopInputType loopInputType = this.f33455z;
        if (loopInputType == LoopInputType.INDUSTRY) {
            zvf0.m220396r("e_edit_industry_selection", loopInputType.pageId);
            return;
        }
        if (loopInputType == LoopInputType.HOMETOWN) {
            zvf0.m220396r("e_edit_hometown_selection", loopInputType.pageId);
            return;
        }
        if (loopInputType == LoopInputType.DEPARTMENT) {
            zvf0.m220396r("e_edit_job_selection", loopInputType.pageId);
            return;
        }
        if (loopInputType == LoopInputType.FRIEND_PURPOSE) {
            if (i < CoreModule.f17557o.m195057d().mo33776Wg()) {
                zvf0.m220399u("e_edit_dating_purpose_selection", this.f33455z.pageId, vwb.m200311Y("dating_purpose", CoreModule.f17557o.m195057d().mo33680El(i)));
            }
        } else {
            if (loopInputType == LoopInputType.INCOME) {
                zvf0.m220396r("e_edit_income_selection", loopInputType.pageId);
                return;
            }
            if (loopInputType == LoopInputType.CAR) {
                zvf0.m220396r("e_edit_car_selection", loopInputType.pageId);
            } else if (loopInputType == LoopInputType.QUALIFICATION) {
                zvf0.m220396r("e_edit_education_degree_selection", loopInputType.pageId);
            } else if (loopInputType == LoopInputType.GROWTH_FOOD) {
                zvf0.m220396r("e_edit_flavor_preference_selection", loopInputType.pageId);
            }
        }
    }

    @Override // p149l.xha0
    /* JADX INFO: renamed from: h1 */
    public void mo51609h1() {
        m51604c5();
        m51599X4(false);
    }

    @Override // p149l.xha0
    public boolean isLast() {
        return m51591Q4().m51510b2();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        this.f33455z = (LoopInputType) getArguments().getSerializable("loop_input_type");
        this.f33447A = getArguments().getString("loop_page_id");
        this.f33448B = getArguments().getInt("loop_has_show_count") + 1;
        this.f33449C = getArguments().getInt("loop_has_input_count");
        this.f33450D = getArguments().getBoolean("loop_is_finish_page");
        this.f33451E = getArguments().getString("loop_create_from_page");
        this.f33452F = getArguments().getString("loop_edit_from");
        this.f33453G = getArguments().getString("ext_value");
        this.f33454H = getArguments().getString("loop_single_frag_ext_value");
        super.onCreate(bundle);
        m51601Z4();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return this.f33447A;
    }
}
