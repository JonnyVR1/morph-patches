package com.p051p1.mobile.putong.core.p058ui.profile.loop;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4901p;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ethnicitylanguage.ProfileLoopEthnicityLanguageFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.height.ProfileLoopSelectHeightFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.house.ProfileLoopSelectHouseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopBirthdayFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopEditPetPicFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopEditPicFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopGameCpFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopMBTTestFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopMultiSelectAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopMyLifeFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopMyQuestionInputFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopQuestionAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopSchoolHideAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopSelectInputAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopSelectInputFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopSingleLineTextFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopTextInputFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopVerificationFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopWebViewFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.profession.ProfileLoopSelectProfessionFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.school.ProfileLoopSelectSchoolFrag;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import p153l.hj40;

/* JADX INFO: loaded from: classes4.dex */
public enum LoopInputType {
    ABOUT_ME(ProfileLoopTextInputFrag.class, CoreModule.f18263b.getString(R$string.f28808y0), 2500, "p_edit_about_me", "about_me"),
    INDUSTRY(ProfileLoopSelectInputFrag.class, CoreModule.f18263b.getString(R$string.f28586K2), 2504, "p_industry_selection_view", "industry"),
    DEPARTMENT(ProfileLoopSelectInputFrag.class, CoreModule.f18263b.getString(R$string.f28566G2), 2505, "p_work_area_selection_view", "job"),
    COMPANY(ProfileLoopTextInputFrag.class, CoreModule.f18263b.getString(R$string.f28555E2), 2506, "p_edit_company_view", ProfileLikeCategoryType.company),
    MAJOR(ProfileLoopTextInputFrag.class, CoreModule.f18263b.getString(R$string.f28591L2), 2507, "p_edit_academic_major_view", "department"),
    SCHOOL(ProfileLoopTextInputFrag.class, CoreModule.f18263b.getString(R$string.f28606O2), 2508, "p_edit_school_view", "school"),
    HOMETOWN(ProfileLoopSelectInputFrag.class, CoreModule.f18263b.getString(R$string.f28581J2), 2509, "p_hometown_selection_view", ProfileLikeCategoryType.hometown),
    NICKNAME(ProfileLoopTextInputFrag.class, CoreModule.f18263b.getString(R$string.f28742n0), 2510, "p_edit_nickname", "nickname"),
    BIRTHDAY(ProfileLoopBirthdayFrag.class, CoreModule.f18263b.getString(R$string.f28727k3), 2511, "p_edit_birthday", "birthday"),
    HANGOUTS(ProfileLoopCreateTagAct.class, CoreModule.f18263b.getString(R$string.f28571H2), 2512, "", ""),
    PERSONALITY(ProfileLoopMultiSelectAct.class, CoreModule.f18263b.getString(R$string.f28626S2), "personality", 2513, "p_personality_selection", ""),
    SPORTS(ProfileLoopMultiSelectAct.class, CoreModule.f18263b.getString(R$string.f28667a3), "sports", 2513, "p_interests_selection_view", ""),
    MUSIC(ProfileLoopMultiSelectAct.class, CoreModule.f18263b.getString(R$string.f28661Z2), "music", 2514, "p_interests_selection_view", ""),
    LITERATURE(ProfileLoopMultiSelectAct.class, CoreModule.f18263b.getString(R$string.f28646W2), "literature", 2515, "p_interests_selection_view", ""),
    MOVIES(ProfileLoopMultiSelectAct.class, CoreModule.f18263b.getString(R$string.f28656Y2), "movies", 2516, "p_interests_selection_view", ""),
    FOOD(ProfileLoopMultiSelectAct.class, CoreModule.f18263b.getString(R$string.f28651X2), "food", 2517, "p_interests_selection_view", ""),
    PLACES(ProfileLoopMultiSelectAct.class, CoreModule.f18263b.getString(R$string.f28673b3), "places", 2517, "p_interests_selection_view", ""),
    QUESTION_CHOICE(ProfileLoopQuestionAct.class, CoreModule.f18263b.getString(R$string.f28816z2), 2518, "p_my_question_edit_answer", ""),
    QUESTION_EDIT(ProfileLoopCreateTagAct.class, CoreModule.f18263b.getString(R$string.f28810y2), 2519, "p_my_question_edit_answer", ""),
    HIDDEN_SCHOOL(ProfileLoopSchoolHideAct.class, CoreModule.f18263b.getString(R$string.f28606O2), 2520, "", ""),
    HOMETOWN_CITY(ProfileLoopSelectInputAct.class, CoreModule.f18263b.getString(R$string.f28581J2), 2521, "", ""),
    SIGNATURE(ProfileLoopTextInputFrag.class, CoreModule.f18263b.getString(R$string.f28631T2), 2522, "p_edit_self_introduction_view", "self_introduction"),
    FRIEND_PURPOSE(ProfileLoopSelectInputFrag.class, CoreModule.f18263b.getString(R$string.f28638V), CoreStaticData.FriendPurposeHelperType.FRIEND_PURPOSE_KEY, 2523, "p_edit_dating_purpose", "dating_purpose"),
    PROFESSION(ProfileLoopSelectProfessionFrag.class, CoreModule.f18263b.getString(R$string.f28601N2), 2526, "p_edit_occupation", "occupation"),
    SCHOOL_NEW(ProfileLoopSelectSchoolFrag.class, CoreModule.f18263b.getString(R$string.f28606O2), 2527, "p_intl_edit_school", "school"),
    PHOTO(ProfileLoopEditPicFrag.class, "添加照片", 2528, "p_upload_photos", "upload_photos"),
    QUALIFICATION(ProfileLoopSelectInputFrag.class, CoreModule.f18263b.getString(R$string.f28814z0), 2529, "p_intl_edit_degree", "education_degree"),
    HEIGHT(ProfileLoopSelectHeightFrag.class, CoreModule.f18263b.getString(R$string.f28649X0), 2530, "p_edit_height", "height"),
    INCOME(ProfileLoopSelectInputFrag.class, CoreModule.f18263b.getString(R$string.f28723k), 2531, "p_edit_income", "income"),
    CAR(ProfileLoopSelectInputFrag.class, CoreModule.f18263b.getString(R$string.f28578J), 2532, "p_edit_car", ProfileLikeCategoryType.car),
    HOUSE(ProfileLoopSelectHouseFrag.class, CoreModule.f18263b.getString(R$string.f28665a1), 2533, "p_edit_house", ProfileLikeCategoryType.house),
    PET(ProfileLoopSelectInputFrag.class, "宠物", 2532, "p_edit_pet", "pet"),
    FAMILY(ProfileLoopTextInputFrag.class, "家庭背景", 2534, "p_edit_family", IjkMediaPlayer.OnNativeInvokeListener.ARG_FAMILIY),
    INTEREST(ProfileLoopTextInputFrag.class, "兴趣爱好", 2535, "p_edit_hobby", "hobby"),
    LOVE(ProfileLoopTextInputFrag.class, "爱情观", 2536, "p_edit_attitude", "attitude"),
    HALF(ProfileLoopTextInputFrag.class, "理想的另一半", 2537, "p_edit_ideal_type", "ideal_type"),
    NEW_TAG(ProfileLoopWebViewFrag.class, "我的个性标签", 2538, "p_complete_profile_add_tag", "mytag", hj40.f110159a),
    ARTWORK(ProfileLoopWebViewFrag.class, "我的书影剧", 2539, "p_complete_profile_add_artwork", "artwork", C4901p.f20820e0),
    ETHNICITY(ProfileLoopEthnicityLanguageFrag.class, CoreModule.f18263b.getString(R$string.f28755p1), 2546, "p_profile_ethnicity", "ethnicity"),
    LANGUAGE(ProfileLoopEthnicityLanguageFrag.class, CoreModule.f18263b.getString(R$string.f28761q1), 2547, "p_profile_language", IjkMediaMeta.IJKM_KEY_LANGUAGE),
    FITNESS(ProfileLoopSelectInputFrag.class, "你平时健身吗？", 2548, "p_edit_exercise", "fitness"),
    DRINKING(ProfileLoopSelectInputFrag.class, "你喝酒吗？", 2549, "p_edit_drinking", "drinking"),
    SMOKING(ProfileLoopSelectInputFrag.class, "你吸烟吗？", 2550, "p_edit_smoking", "smoking"),
    MY_LIFT(ProfileLoopMyLifeFrag.class, "我的生活", 2551, "p_edit_lifestyle", "my_lift"),
    TAG_MATCH_PIC(ProfileLoopMyLifeFrag.class, "我的生活", 2552, "p_edit_lifestyle", "my_lift"),
    PIC_MATCH_TAG(ProfileLoopMyLifeFrag.class, "我的生活", 2553, "p_edit_lifestyle", "my_lift"),
    GUIDE_UPLOAD_PIC_AND_TAG(ProfileLoopMyLifeFrag.class, "我的生活", 2554, "p_edit_lifestyle", "my_lift"),
    GAME_NAME(ProfileLoopSelectInputFrag.class, "游戏名称（多选）", 2555, "p_game_info_game_name", "game_name"),
    GAME_TOGETHER(ProfileLoopSelectInputFrag.class, "想找人一起（多选）", 2556, "p_edit_game_intention", "game_intention"),
    GAME_LEVEL(ProfileLoopSingleLineTextFrag.class, "游戏段位", 2557, "p_edit_game_level", "game_level"),
    GAME_VOICE(ProfileLoopSelectInputFrag.class, "游戏开麦", 2558, "p_edit_microphone", "microphone"),
    MY_QUESTION(ProfileLoopMyQuestionInputFrag.class, CoreModule.f18263b.getString(R$string.f28816z2), 2559, "p_edit_my_qa", "my_question"),
    MBTI_TEST(ProfileLoopMBTTestFrag.class, "我的MBTI", 2560, "p_test_mbti", "test_mbti"),
    GAME_CP(ProfileLoopGameCpFrag.class, "我的游戏日常", 2561, "p_game_info_edit", "game_cp"),
    MY_QUESTION_PATCH(ProfileLoopMyQuestionInputFrag.class, CoreModule.f18263b.getString(R$string.f28816z2), 2562, "p_edit_my_qa", "my_question"),
    DO_NOT_WISH(ProfileLoopTextInputFrag.class, "我不希望你", 2563, "p_edit_dislike_type", "do_not_wish"),
    PET_PHOTO(ProfileLoopEditPetPicFrag.class, "上传宠物照片", 2564, "p_tantanx_pet_photo_normalguide", "upload_pet_photos"),
    GROWTH_FOOD(ProfileLoopSelectInputFrag.class, "风味喜好（多选）", 2565, "p_edit_flavor_preference", "growth_taste"),
    VERIFICATION(ProfileLoopVerificationFrag.class, "完成头像本人认证", 2566, "p_avatar_verify", "verification"),
    MY_LIFE_SEE_MYSELF(ProfileLoopMyLifeFrag.class, "我的生活", 2557, "p_upload_photos", "my_lift");

    public Class fragmentClass;
    public String pageId;
    public String pageName;
    public int requestCode;
    public String tagKey;
    public String title;
    public String url;

    LoopInputType(Class cls, String str, int i, String str2, String str3, String str4) {
        this.fragmentClass = cls;
        this.title = str;
        this.requestCode = i;
        this.pageId = str2;
        this.pageName = str3;
        this.url = str4;
    }

    LoopInputType(Class cls, String str, int i, String str2, String str3) {
        this.fragmentClass = cls;
        this.title = str;
        this.requestCode = i;
        this.pageId = str2;
        this.pageName = str3;
    }

    LoopInputType(Class cls, String str, String str2, int i, String str3, String str4) {
        this.fragmentClass = cls;
        this.title = str;
        this.requestCode = i;
        this.tagKey = str2;
        this.pageId = str3;
        this.pageName = str4;
    }
}
