package com.p000p1.mobile.putong.core.newui.home.card.expanded;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public enum IdealMatchUserInfoType {
    HEIGHT("height", "身高"),
    DATINGATTITUDE("datingAttitude", "交友目的"),
    SCHOOL("school", "学校"),
    EDUCATION("education", "学历"),
    WORK("work", "工作"),
    COMPANY("company", "公司"),
    HOMETOWN("hometown", "家乡"),
    HANGOUTS("hangouts", "常去地"),
    ZODIAC("zodiac", "星座"),
    INCOME("income", "收入"),
    HOUSE_INFO("hangouts", "房产"),
    CAR("car", "车产"),
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
