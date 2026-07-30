package com.p051p1.mobile.putong.core.newui.home.card.expanded;

import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.data.Work;

/* JADX INFO: loaded from: classes11.dex */
public enum IdealMatchUserInfoType {
    HEIGHT("height", "身高"),
    DATINGATTITUDE("datingAttitude", "交友目的"),
    SCHOOL("school", "学校"),
    EDUCATION("education", "学历"),
    WORK(Work.TYPE, "工作"),
    COMPANY(ProfileLikeCategoryType.company, "公司"),
    HOMETOWN(ProfileLikeCategoryType.hometown, "家乡"),
    HANGOUTS(ProfileLikeCategoryType.hangouts, "常去地"),
    ZODIAC(ProfileLikeCategoryType.zodiac, "星座"),
    INCOME("income", "收入"),
    HOUSE_INFO(ProfileLikeCategoryType.hangouts, "房产"),
    CAR(ProfileLikeCategoryType.car, "车产"),
    FITNESS("fitness", "健身信息"),
    DRINK("drink", "喝酒"),
    SMOKE("smoke", "抽烟"),
    AVATAR("avatar", "头像标签");

    private String desc;
    private String typeStr;

    IdealMatchUserInfoType(String str, String str2) {
        this.typeStr = str;
        this.desc = str2;
    }

    public String getType() {
        return this.typeStr;
    }
}
