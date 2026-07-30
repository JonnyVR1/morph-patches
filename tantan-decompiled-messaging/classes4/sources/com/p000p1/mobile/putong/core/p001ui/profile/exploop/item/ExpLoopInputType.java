package com.p000p1.mobile.putong.core.p001ui.profile.exploop.item;

import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpInputContentBaseData;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopCustomBirthdayTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopCustomHomeTownTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopCustomPetTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopCustomQuestionTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopCustomSchoolTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopCustomSignatureTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopCustomVerificationTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopTextTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopUploadImageTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.data.User;
import java.io.Serializable;
import l.qib0;
import p002l.bif;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class ExpLoopInputType implements Serializable {
    public static final int BIRTHDAY = 22;
    public static final int CAR = 6;
    public static final int COMPANY = 15;
    public static final int DRINKING = 3;
    public static final int EMPTY = 0;
    public static final int FITNESS = 2;
    public static final int FOOD_FLAVOR = 26;
    public static final int FRIEND_PURPOSE = 7;
    public static final int GAME_LEVEL = 16;
    public static final int GAME_NAME = 8;
    public static final int GAME_TOGETHER = 9;
    public static final int GAME_VOICE = 10;
    public static final int HANGOUTS = 23;
    public static final int HEIGHT = 13;
    public static final int HOMETOWN = 19;
    public static final int HOUSE = 11;
    public static final String ICON_BIRTHDAY = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNKV1ZZRFpFUk1VWVFFUlpYSUdNRFBaV0VPTEVUQjE0IiwidyI6NDE1LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxODAwMzk2MjQxMDg2NjY2Nzk2MX0.png";
    public static final String ICON_CAR = "https://auto.tancdn.com/v1/images/eyJpZCI6IjNWUDNPNDdWSE1MUVI1RU42UlpSSVBQUVc2N1BUWTE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzY2MzEyNjY0ODMzNDg5Mjk4fQ.png";
    public static final String ICON_COMPANY = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVXU1dMRzVZSElKS0ZXQkVJNE9aVUlYQzZST0k2QTE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5MTMxMzI0MTIyODAzMzE3MTg4fQ.png";
    public static final String ICON_DRINKING = "https://auto.tancdn.com/v1/images/eyJpZCI6IkdZV1FJNDJEQlg0MzdEMkxNNllERElRTDJaN1dURzE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTg0MzUwOTY3NzMwNTY3ODA4Mn0.png";
    public static final String ICON_FITNESS = "https://auto.tancdn.com/v1/images/eyJpZCI6IjdUSVRGT1UzVFFHWUtJUVpGQ1FVSlhTQ09FNEEzQTE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1ODQwMTMxNTQzNzMxNTk4NzMwfQ.png";
    public static final String ICON_FOOD_FLAVOR = "https://auto.tancdn.com/v1/images/eyJpZCI6IkRLNEJRWk9NSlpHQjdWNjdMMlA3Sk1EQjQ3UExLSzE0IiwidyI6NDE1LCJoIjozNjEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MTk3Mjc2MDk3NjM1OTQyOTI4fQ.png";
    public static final String ICON_FRIEND_PURPOSE = "https://auto.tancdn.com/v1/images/eyJpZCI6IjRIRkFTSFoySVJUVTQzNUVWWE83VVpRRlJHVDRBNzE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTM5NDA5NTY4MDczNDE1NzA1OH0.png";
    public static final String ICON_GAME_LEVEL = "https://auto.tancdn.com/v1/images/eyJpZCI6IlJMRUZEVE5VQUNNV1lPUE9XT0lCNzUySlgyVkVGUjE0IiwidyI6NDE1LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2ODA0MDQ4ODkzMDI2NDAyNDd9.png";
    public static final String ICON_GAME_NAME = "https://auto.tancdn.com/v1/images/eyJpZCI6IkRRS0lIV0g2RkE1NFFTVEFPVjJDSjRDVFFFTTZaNDE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1Mjk4MTYwNDUzODE5MTk3ODQ0fQ.png";
    public static final String ICON_GAME_TOGETHER = "https://auto.tancdn.com/v1/images/eyJpZCI6IllORk1ETFlPVEZVRkxLQUtSSVhMT0dFM1VVV1ZLTzE0IiwidyI6NDE1LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTg0MDE1NjU5NTc1MTIyMjQ1fQ.png";
    public static final String ICON_GAME_VOICE = "https://auto.tancdn.com/v1/images/eyJpZCI6IjdTRFFYMzRIUkdOWFdVNDZXV1dCUUlFNUkyVUtJNzE0IiwidyI6NDE1LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDc2NzUxOTE2OTEwNjc2NjIyOX0.png";
    public static final String ICON_HANGOUTS = "https://auto.tancdn.com/v1/images/eyJpZCI6IlBDVVdLUU9TRzVDS083WDZXRVdBTEhUNFdKQU5WNjE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzk1NDU1ODI5MDc2NzcwNDY4MX0.png";
    public static final String ICON_HEIGHT = "https://auto.tancdn.com/v1/images/eyJpZCI6IkZENEpXUE9UQjVQWk9aVEVNWlU2M1lJVUpDNlBGUDE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjgwMTY3NTg3MjY5ODQyMzg4OH0.png";
    public static final String ICON_HOMETOWN = "https://auto.tancdn.com/v1/images/eyJpZCI6IkZTR0JXSFFFNEo3NDJYWVIzNkRPVlBNNTVKTFdCNjE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjg3Mzc3NDczMTI5MDUwNzU5NH0.png";
    public static final String ICON_HOUSE = "https://auto.tancdn.com/v1/images/eyJpZCI6IjNBUDROV1cyS1hCU09SREJOVDJCRVZQUE83REVMQzE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MjQ4MDc1MzM3MjAwODkwMzc0fQ.png";
    public static final String ICON_INCOME = "https://auto.tancdn.com/v1/images/eyJpZCI6IkFUQUlQUU9EU0NOSk5PTFlSMjNOWkRLVEhNRDNFWjE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5MzEzNjQyMjg1MDkyNjcwNDF9.png";
    public static final String ICON_MY_LIFE = "https://auto.tancdn.com/v1/images/eyJpZCI6IkFKUkZTQVA3M0NNRlNYR1laNFIyN0ZNWVU2M0NPVTE0IiwidyI6NDE1LCJoIjozNjEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTkyMDQyMjE2MjUzNTYyOTI0NX0.png";
    public static final String ICON_MY_QUESTION = "https://auto.tancdn.com/v1/images/eyJpZCI6IkRETVdKVEFJSVZSNFpLUzZNUVJPRDVVRENGREczNDE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0NzQxMzc0MzIwNzM4ODkwNzg1fQ.png";
    public static final String ICON_NICKNAME = "https://auto.tancdn.com/v1/images/eyJpZCI6IjNFRDNWRlFRUENJRUNCWEM1STVYUVhGRkJGMlQzNDE0IiwidyI6NDE1LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDE5NDY4MjUwNTY3Mjg2MzA2MX0.png";
    public static final String ICON_PET = "https://auto.tancdn.com/v1/images/eyJpZCI6IkxINUtXSEpNWVhCTEJGSjdOUlZYRDRDTzdMWUdJMjE0IiwidyI6NDE1LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjk1ODkwMjc2NTAxMjQxMDI5fQ.png";
    public static final String ICON_PROFESSION = "https://auto.tancdn.com/v1/images/eyJpZCI6Ijc2TFZYN1FLQklLM05LUkxCNDNQVEFBU1RBU0Q3VDE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0NzUxNTMxNzAzNjgwOTA1NDEyfQ.png";
    public static final String ICON_QUALIFICATION = "https://auto.tancdn.com/v1/images/eyJpZCI6IkxJUzVPV0hFNkw1TU5JWUZMT002RlVUSFRORzI3TjE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjQ3MzA2MzMwNjA2NDE2MzI0fQ.png";
    public static final String ICON_SCHOOL = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9EQzNQSTRQUjdaV0pCMjNOTEhLT1BTTzQ3M0ZERzE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTY4NjgyMTEyMDM1MTg0MzQwOH0.png";
    public static final String ICON_SIGNATURE = "https://auto.tancdn.com/v1/images/eyJpZCI6IkJIRjdaUURVTzJBSFpYSUhNUVUzRE1OSFJVSU5PNDE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5NTM2NDg3NTQyODU1NjA4ODc2fQ.png";
    public static final String ICON_SMOKING = "https://auto.tancdn.com/v1/images/eyJpZCI6IlRFUTRINFZFVkoyRk9ZNEQzR0pRRE1LQzNHWE9ZSjE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzAxNTc2OTAxMTk0MjUxMzc1Mn0.png";
    public static final String ICON_VERIFICATION = "https://auto.tancdn.com/v1/images/eyJpZCI6IjRLUzRCTlMyTlRXSTJaUE8zRTdTWElXQTJaNktETzE0IiwidyI6NDE0LCJoIjozNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTU3NTgyMzQ5MDg4NjI2NDg1MH0.png";
    public static final int INCOME = 5;
    public static final int INPUT_CUSTOM_BIRTHDAY = 1022;
    public static final int INPUT_CUSTOM_HOMETOWN = 1019;
    private static final int INPUT_CUSTOM_OFFSET = 1000;
    public static final int INPUT_CUSTOM_PET = 1021;
    public static final int INPUT_CUSTOM_QUESTION = 1020;
    public static final int INPUT_CUSTOM_SCHOOL_NEW = 1018;
    public static final int INPUT_CUSTOM_SIGNATURE = 1014;
    public static final int INPUT_CUSTOM_VERIFICATION = 1025;
    public static final int INPUT_MULTI_LINE_TEXT = 4;
    public static final int INPUT_SELECT_MULTI = 2;
    public static final int INPUT_SELECT_SINGLE = 1;
    public static final int INPUT_SINGLE_LINE_TEXT = 5;
    public static final int INPUT_UPLOAD_IMAGE = 6;
    public static final int INPUT_WHEEL_PICKER = 3;
    public static final int MY_LIFE = 24;
    public static final int MY_QUESTION = 20;
    public static final int NICKNAME = 17;
    public static final int PET = 21;
    public static final int PROFESSION = 12;
    public static final int QUALIFICATION = 1;
    public static final int SCHOOL_NEW = 18;
    public static final int SIGNATURE = 14;
    public static final int SMOKING = 4;
    public static final int VERIFICATION = 25;
    public String iconUrl;
    private ExpInputContentBaseData inputContentData = new ExpInputContentBaseData();
    public int inputContentType;
    public int inputTypeName;
    public String pageName;
    public String subTitle;
    public String title;

    public ExpLoopInputType(int i, String str, String str2, int i2) {
        this.inputTypeName = i;
        this.title = str;
        this.iconUrl = str2;
        this.inputContentType = i2;
        qib0.G.x0(str2);
    }

    public boolean canExit(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return hasInfoExist(user, loopCreateEntryType);
    }

    public boolean checkIfNeed(User user) {
        return true;
    }

    public boolean checkOnComplete(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        return true;
    }

    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
    }

    public ExpInputContentBaseData getData() {
        return this.inputContentData;
    }

    public Class getFragment() {
        int i = this.inputContentType;
        if (i == 1014) {
            return ExpProfileLoopCustomSignatureTypeFrag.class;
        }
        if (i == 1025) {
            return ExpProfileLoopCustomVerificationTypeFrag.class;
        }
        switch (i) {
            case 1:
            case 2:
                return ExpProfileLoopSelectTypeFrag.class;
            case 3:
                return ExpProfileLoopWheelTypeFrag.class;
            case 4:
            case 5:
                return ExpProfileLoopTextTypeFrag.class;
            case 6:
                return ExpProfileLoopUploadImageTypeFrag.class;
            default:
                switch (i) {
                    case INPUT_CUSTOM_SCHOOL_NEW /* 1018 */:
                        return ExpProfileLoopCustomSchoolTypeFrag.class;
                    case INPUT_CUSTOM_HOMETOWN /* 1019 */:
                        return ExpProfileLoopCustomHomeTownTypeFrag.class;
                    case INPUT_CUSTOM_QUESTION /* 1020 */:
                        return ExpProfileLoopCustomQuestionTypeFrag.class;
                    case INPUT_CUSTOM_PET /* 1021 */:
                        return ExpProfileLoopCustomPetTypeFrag.class;
                    case INPUT_CUSTOM_BIRTHDAY /* 1022 */:
                        return ExpProfileLoopCustomBirthdayTypeFrag.class;
                    default:
                        return null;
                }
        }
    }

    public abstract String getPageId();

    public abstract String getPageName();

    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return false;
    }

    public boolean hasWheelDataChanged(User user) {
        return false;
    }

    public void saveUserInfo(User user) {
    }

    public void setData(ExpInputContentBaseData expInputContentBaseData) {
        this.inputContentData = expInputContentBaseData;
    }

    public ExpLoopInputType setSubTitle(String str) {
        this.subTitle = str;
        return this;
    }

    public void updateButtonState(bif bifVar) {
    }
}
