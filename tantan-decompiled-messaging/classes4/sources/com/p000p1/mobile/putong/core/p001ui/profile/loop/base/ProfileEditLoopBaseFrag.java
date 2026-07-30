package com.p000p1.mobile.putong.core.p001ui.profile.loop.base;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Work;
import java.util.List;
import l.j760;
import l.lqa;
import l.o6j0;
import l.vwb;
import l.zvf0;
import p002l.xha0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class ProfileEditLoopBaseFrag extends PutongFrag implements xha0 {

    /* JADX INFO: renamed from: A */
    public String f1269A;

    /* JADX INFO: renamed from: B */
    public int f1270B;

    /* JADX INFO: renamed from: C */
    public int f1271C;

    /* JADX INFO: renamed from: D */
    public boolean f1272D;

    /* JADX INFO: renamed from: E */
    public String f1273E;

    /* JADX INFO: renamed from: F */
    public String f1274F;

    /* JADX INFO: renamed from: G */
    public String f1275G;

    /* JADX INFO: renamed from: H */
    public String f1276H;

    /* JADX INFO: renamed from: z */
    public LoopInputType f1277z;

    @Override // p002l.xha0
    /* JADX INFO: renamed from: H */
    public void mo2072H() {
        if (mo2074N4()) {
            mo2092e5();
            User userMo2078R4 = mo2078R4();
            mo2076P4(userMo2078R4);
            m2075O4(userMo2078R4, mo2079S4());
            m2085X4(true);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public void mo2073M4() {
    }

    /* JADX INFO: renamed from: N4 */
    public boolean mo2074N4() {
        return true;
    }

    /* JADX INFO: renamed from: O4 */
    public final void m2075O4(User user, User user2) {
        Profile profile = user2.profile;
        Work work = profile.work;
        Profile profile2 = user.profile;
        work.active = profile2.work.active;
        profile.studies.active = profile2.studies.active;
    }

    /* JADX INFO: renamed from: P4 */
    public abstract void mo2076P4(User user);

    /* JADX INFO: renamed from: Q4 */
    public ProfileInfoLoopEditAct m2077Q4() {
        return getActivity();
    }

    /* JADX INFO: renamed from: R4 */
    public User mo2078R4() {
        return act() instanceof ProfileInfoLoopEditAct ? m2077Q4().m1991a2().m2043u0() : CoreModule.c.e0.na().clone();
    }

    /* JADX INFO: renamed from: S4 */
    public User mo2079S4() {
        return act() instanceof ProfileInfoLoopEditAct ? m2077Q4().m1991a2().m2045y0() : CoreModule.c.e0.na().clone();
    }

    /* JADX INFO: renamed from: T4 */
    public boolean mo2080T4(boolean z) {
        return false;
    }

    /* JADX INFO: renamed from: U4 */
    public boolean m2081U4() {
        return TextUtils.equals(this.f1274F, "from_ideal_guide_dialog") || TextUtils.equals(this.f1274F, "from_ideal_guide_profile_item");
    }

    /* JADX INFO: renamed from: V4 */
    public boolean m2082V4() {
        ProfileInfoLoopEditAct profileInfoLoopEditAct = (Act) getActivity();
        if (profileInfoLoopEditAct instanceof ProfileInfoLoopEditAct) {
            return profileInfoLoopEditAct.m1991a2().m2046z0();
        }
        return false;
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m2083W4() {
        ProfileInfoLoopEditAct profileInfoLoopEditAct = (Act) getActivity();
        return (profileInfoLoopEditAct instanceof ProfileInfoLoopEditAct) && profileInfoLoopEditAct.m1991a2().m2044x0() == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT;
    }

    @Override // p002l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo2084X() {
        return true;
    }

    /* JADX INFO: renamed from: X4 */
    public final void m2085X4(boolean z) {
        if (!mo2080T4(z) && (getContext() instanceof ProfileInfoLoopEditAct)) {
            ((ProfileInfoLoopEditAct) getContext()).m1993c2(z);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public void mo2086Y4(List<Media> list, int i) {
    }

    /* JADX INFO: renamed from: Z4 */
    public void m2087Z4() {
        LoopInputType loopInputType = this.f1277z;
        if (loopInputType == LoopInputType.BIRTHDAY) {
            J4().p(new j760[]{j760.a("continuous_edit_complete_count", 0), j760.a("continuous_edit_last_step", Boolean.valueOf(this.f1272D)), j760.a("continuous_edit_step_num", 1), j760.a("edit_show_from", "edit_profile_view")});
        } else if (loopInputType == LoopInputType.NICKNAME) {
            J4().p(new j760[]{j760.a("continuous_edit_complete_count", 0), j760.a("continuous_edit_last_step", Boolean.valueOf(this.f1272D)), j760.a("continuous_edit_step_num", 1), j760.a("edit_show_from", "edit_profile_view")});
        } else if (loopInputType == LoopInputType.PROFESSION) {
            J4().p(new j760[]{j760.a("edit_specific_profile_show_from", this.f1273E)});
        } else if (loopInputType == LoopInputType.GROWTH_FOOD) {
            J4().p(new j760[]{j760.a("continuous_edit_complete_count", Integer.valueOf(this.f1271C)), j760.a("continuous_edit_last_step", Boolean.valueOf(this.f1272D)), j760.a("continuous_edit_step_num", Integer.valueOf(this.f1270B)), j760.a("edit_specific_profile_show_from", this.f1273E), j760.a("tantanx_scene_name", this.f1273E), j760.a("is_test_field", lqa.w() ? "is_test_field_y" : "is_test_field_n")});
        } else {
            J4().p(new j760[]{j760.a("continuous_edit_complete_count", Integer.valueOf(this.f1271C)), j760.a("continuous_edit_last_step", Boolean.valueOf(this.f1272D)), j760.a("continuous_edit_step_num", Integer.valueOf(this.f1270B)), j760.a("edit_specific_profile_show_from", this.f1273E)});
        }
        if (this.f1277z != LoopInputType.PHOTO) {
            mo2091d5();
        }
    }

    /* JADX INFO: renamed from: a5 */
    public void m2088a5(LoopInputType loopInputType, int i, int i2, boolean z, String str, String str2, String str3) {
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
    public void m2089b5(LoopInputType loopInputType, String str, String str2) {
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
    public void m2090c5() {
        LoopInputType loopInputType = this.f1277z;
        zvf0.u("e_edit_specific_profile_skip", loopInputType.pageId, new j760[]{vwb.Y("specific_edit_page_name", loopInputType.pageName)});
    }

    /* JADX INFO: renamed from: d5 */
    public void mo2091d5() {
        LoopInputType loopInputType = this.f1277z;
        zvf0.A("e_edit_specific_profile_skip", loopInputType.pageId, new j760[]{vwb.Y("specific_edit_page_name", loopInputType.pageName)});
    }

    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: e5 */
    public void mo2092e5() {
        LoopInputType loopInputType = this.f1277z;
        if (loopInputType != LoopInputType.INDUSTRY && loopInputType != LoopInputType.DEPARTMENT && loopInputType != LoopInputType.HOMETOWN && loopInputType != LoopInputType.QUALIFICATION && loopInputType != LoopInputType.FRIEND_PURPOSE && loopInputType != LoopInputType.INCOME && loopInputType != LoopInputType.GROWTH_FOOD && loopInputType != LoopInputType.CAR) {
            zvf0.u("e_edit_specific_profile_next", loopInputType.pageId, new j760[]{vwb.Y("specific_edit_page_name", loopInputType.pageName)});
        }
        if (this.f1277z == LoopInputType.QUALIFICATION) {
            o6j0.c("e_intl_edit_degree_btn", "p_intl_edit_degree", new o6j0.a[0]);
        }
        if (this.f1277z == LoopInputType.SCHOOL_NEW) {
            o6j0.c("e_intl_edit_school_btn", "p_intl_edit_school", new o6j0.a[0]);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public void m2093f5() {
        LoopInputType loopInputType = this.f1277z;
        zvf0.A("e_edit_specific_profile_next", loopInputType.pageId, new j760[]{vwb.Y("specific_edit_page_name", loopInputType.pageName)});
    }

    /* JADX INFO: renamed from: g5 */
    public void m2094g5(int i) {
        if (i < 0) {
            return;
        }
        LoopInputType loopInputType = this.f1277z;
        if (loopInputType == LoopInputType.INDUSTRY) {
            zvf0.r("e_edit_industry_selection", loopInputType.pageId);
            return;
        }
        if (loopInputType == LoopInputType.HOMETOWN) {
            zvf0.r("e_edit_hometown_selection", loopInputType.pageId);
            return;
        }
        if (loopInputType == LoopInputType.DEPARTMENT) {
            zvf0.r("e_edit_job_selection", loopInputType.pageId);
            return;
        }
        if (loopInputType == LoopInputType.FRIEND_PURPOSE) {
            if (i < CoreModule.o.d().Wg()) {
                zvf0.u("e_edit_dating_purpose_selection", this.f1277z.pageId, new j760[]{vwb.Y("dating_purpose", CoreModule.o.d().El(i))});
            }
        } else {
            if (loopInputType == LoopInputType.INCOME) {
                zvf0.r("e_edit_income_selection", loopInputType.pageId);
                return;
            }
            if (loopInputType == LoopInputType.CAR) {
                zvf0.r("e_edit_car_selection", loopInputType.pageId);
            } else if (loopInputType == LoopInputType.QUALIFICATION) {
                zvf0.r("e_edit_education_degree_selection", loopInputType.pageId);
            } else if (loopInputType == LoopInputType.GROWTH_FOOD) {
                zvf0.r("e_edit_flavor_preference_selection", loopInputType.pageId);
            }
        }
    }

    @Override // p002l.xha0
    /* JADX INFO: renamed from: h1 */
    public void mo2095h1() {
        m2090c5();
        m2085X4(false);
    }

    @Override // p002l.xha0
    public boolean isLast() {
        return m2077Q4().m1992b2();
    }

    public void onCreate(Bundle bundle) {
        this.f1277z = (LoopInputType) getArguments().getSerializable("loop_input_type");
        this.f1269A = getArguments().getString("loop_page_id");
        this.f1270B = getArguments().getInt("loop_has_show_count") + 1;
        this.f1271C = getArguments().getInt("loop_has_input_count");
        this.f1272D = getArguments().getBoolean("loop_is_finish_page");
        this.f1273E = getArguments().getString("loop_create_from_page");
        this.f1274F = getArguments().getString("loop_edit_from");
        this.f1275G = getArguments().getString("ext_value");
        this.f1276H = getArguments().getString("loop_single_frag_ext_value");
        super/*com.p1.mobile.android.app.Frag*/.onCreate(bundle);
        m2087Z4();
    }

    public String pageId() {
        return this.f1269A;
    }
}
