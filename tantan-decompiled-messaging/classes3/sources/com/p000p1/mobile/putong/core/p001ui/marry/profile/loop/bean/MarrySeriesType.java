package com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean;

import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.address.MarryLoopHometownFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.authentication.MarryEditAvatarAuthenticationFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.birthday.MarryEditProfileBirthdayFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.height.MarryEditProfileHeightFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.house.MarryEditProfileHouseFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.input.MarryEditProfileInputFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.interval.MarryEditProfileIntervalFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.life.MarryLoopLifeMomentFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.mate.MarryEditProfileMateFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.multiple.MarryEditProfileMultipleFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.profession.MarryEditProfileProfessionFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.weight.MarryEditProfileWeightFrag;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public enum MarrySeriesType implements Serializable {
    AVATAR("头像", false, null, null),
    STATUS("当前婚恋状态", true, MarryEditProfileMultipleFrag.class, "p_edit_marriage_status"),
    EXPECTED_TIME("结婚预期时间", true, MarryEditProfileMultipleFrag.class, "p_edit_marriage_goal"),
    MATE("理想伴侣", true, MarryEditProfileMateFrag.class, "p_edit_marriage_ideal"),
    DECLARATION("征婚宣言", true, MarryEditProfileInputFrag.class, "p_edit_marriage_declaration"),
    LIFE_MOMENT("生活瞬间", true, MarryLoopLifeMomentFrag.class, "p_edit_life_moment"),
    BABY_WILLING("生娃意愿", false, MarryEditProfileMultipleFrag.class, "p_edit_baby"),
    MATE_STATUS("理想伴侣的婚恋状态", false, MarryEditProfileMultipleFrag.class, "p_edit_marriage_ideal_status"),
    MATE_AGE("理想伴侣的年龄", false, MarryEditProfileIntervalFrag.class, "p_edit_marriage_ideal_age"),
    MATE_AGE_EDIT("理想伴侣的年龄", false, MarryEditProfileIntervalFrag.class, "p_edit_marriage_ideal_age"),
    MATE_QUALIFICATIONS("理想伴侣的学历", false, MarryEditProfileMultipleFrag.class, "p_edit_marriage_ideal_education"),
    MATE_HEIGHT("理想伴侣的身高", false, MarryEditProfileIntervalFrag.class, "p_edit_marriage_ideal_height"),
    MATE_INCOME("理想伴侣的年收入", false, MarryEditProfileMultipleFrag.class, "p_edit_marriage_ideal_income"),
    MATE_ADDRESS("是否接受异地", false, MarryEditProfileMultipleFrag.class, "p_edit_marriage_ideal_place"),
    FAMILY_BACKGROUND("家庭背景", true, MarryEditProfileInputFrag.class, "p_edit_background"),
    BRIDE_PRICE("婚礼/彩礼", false, MarryEditProfileInputFrag.class, "p_edit_bride_price"),
    PROFESSION("职业", true, MarryEditProfileProfessionFrag.class, "p_edit_occupation"),
    INCOME("年收入", true, MarryEditProfileMultipleFrag.class, "p_edit_income"),
    CAR("车辆信息", true, MarryEditProfileMultipleFrag.class, "p_edit_car"),
    HOUSE("房产", true, MarryEditProfileHouseFrag.class, "p_edit_house"),
    MONTHLY_COST("月消费", false, MarryEditProfileMultipleFrag.class, "p_edit_consumption"),
    QUALIFICATIONS("学历", true, MarryEditProfileMultipleFrag.class, "p_edit_education_degree"),
    ADDRESS_HOMETOWN("家乡", true, MarryLoopHometownFrag.class, "p_hometown_selection_view"),
    ADDRESS_LIVE_NOW("现居地", true, MarryLoopHometownFrag.class, "p_hometown_address"),
    HEIGHT("身高", true, MarryEditProfileHeightFrag.class, "p_edit_height"),
    WEIGHT("体重", false, MarryEditProfileWeightFrag.class, "p_edit_weight"),
    NICK_NAME("昵称", true, MarryEditProfileInputFrag.class, "p_edit_nickname"),
    BIRTHDAY("生日", true, MarryEditProfileBirthdayFrag.class, "p_edit_birthday"),
    PROLOGUE("开场白", true, MarryEditProfileInputFrag.class, "p_edit_marriage_prologue"),
    BIND_PHONE("绑定手机", true, null, ""),
    PROFILE_FEATURED_UPLOAD_PHOTOS("上传照片", false, MarryLoopLifeMomentFrag.class, "p_upload_photos"),
    PROFILE_FEATURED_ABOUT_ME("自我介绍", false, MarryEditProfileInputFrag.class, "p_edit_self_introduction_view"),
    PROFILE_FEATURED_FRIEND_PURPOSE("交友目的", false, MarryEditProfileMultipleFrag.class, "p_edit_dating_purpose"),
    PROFILE_FEATURED_AVATAR_AUTHENTICATION("头像认证", false, MarryEditAvatarAuthenticationFrag.class, "p_selected_users_avatar_verified");

    private final Class<?> mFragClass;
    private final boolean mIsRequired;
    private final String mPageId;
    private final String mTitle;

    MarrySeriesType(String str, boolean z, Class cls, String str2) {
        this.mTitle = str;
        this.mIsRequired = z;
        this.mFragClass = cls;
        this.mPageId = str2;
    }

    public Class<?> getFragClass() {
        return this.mFragClass;
    }

    public String getPageId() {
        return this.mPageId;
    }

    public String getTitleName() {
        return this.mTitle;
    }

    public boolean isRequired() {
        return this.mIsRequired;
    }
}
