package com.p046p1.mobile.putong.core.p053ui.profile.loop;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.clevertap.android.sdk.Constants;
import com.google.common.collect.Lists;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CategorySuggestions;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.HometownChinaItem;
import com.p046p1.mobile.putong.core.data.HometownSuggest;
import com.p046p1.mobile.putong.core.data.IdealInfo;
import com.p046p1.mobile.putong.core.data.IdealProfile;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopMultiSelectAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopQuestionAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopSchoolHideAct;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.ExtensionGame;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Physical;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.QualificationType;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.p046p1.mobile.putong.data.Work;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p149l.e30;
import p149l.j760;
import p149l.lqa;
import p149l.n53;
import p149l.pc8;
import p149l.pj90;
import p149l.tzb0;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class LoopFragmentFactory {

    /* JADX INFO: renamed from: a */
    public static final ArrayList<LoopInputType> f33379a;

    /* JADX INFO: renamed from: b */
    public static final ArrayList<LoopInputType> f33380b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList<LoopInputType> f33381c;

    /* JADX INFO: renamed from: d */
    public static final ArrayList<LoopInputType> f33382d;

    /* JADX INFO: renamed from: e */
    public static final ArrayList<LoopInputType> f33383e;

    /* JADX INFO: renamed from: f */
    public static final ArrayList<LoopInputType> f33384f;

    /* JADX INFO: renamed from: g */
    public static final ArrayList<LoopInputType> f33385g;

    /* JADX INFO: renamed from: h */
    public static final ArrayList<LoopInputType> f33386h;

    /* JADX INFO: renamed from: i */
    public static final ArrayList<LoopInputType> f33387i;

    /* JADX INFO: renamed from: j */
    public static final ArrayList<LoopInputType> f33388j;

    /* JADX INFO: renamed from: k */
    public static final ArrayList<LoopInputType> f33389k;

    /* JADX INFO: renamed from: l */
    public static final ArrayList<LoopInputType> f33390l;

    /* JADX INFO: renamed from: m */
    public static final ArrayList<LoopInputType> f33391m;

    /* JADX INFO: renamed from: n */
    public static ArrayList<LoopInputType> f33392n;

    /* JADX INFO: renamed from: o */
    public static final ArrayList<LoopInputType> f33393o;

    /* JADX INFO: renamed from: p */
    public static final ArrayList<LoopInputType> f33394p;

    /* JADX INFO: renamed from: q */
    public static final ArrayList<LoopInputType> f33395q;

    /* JADX INFO: renamed from: r */
    public static final ArrayList<LoopInputType> f33396r;

    /* JADX INFO: renamed from: s */
    public static final ArrayList<LoopInputType> f33397s;

    /* JADX INFO: renamed from: t */
    public static final ArrayList<LoopInputType> f33398t;

    /* JADX INFO: renamed from: u */
    public static final ArrayList<LoopInputType> f33399u;

    /* JADX INFO: renamed from: v */
    public static final ArrayList<LoopInputType> f33400v;

    /* JADX INFO: renamed from: w */
    public static final ArrayList<LoopInputType> f33401w;

    /* JADX INFO: renamed from: x */
    public static final ArrayList<LoopInputType> f33402x;

    /* JADX INFO: renamed from: y */
    public static final ArrayList<LoopInputType> f33403y;

    public enum LoopCreateEntryType {
        ENTRY_EDIT,
        ENTRY_CARD,
        ENTRY_CARD_FACK_UP_DATA,
        ENTRY_CARD_UPLOAD_PHOTO,
        ENTRY_PROFILE_UPLOAD_PHOTO,
        ENTRY_FILTER_DIALOG,
        ENTRY_EXPLORE,
        ENTRY_SERIOUS_DIALOG,
        ENTRY_INTL_FILL_INFO_KIT,
        ENTRY_MOMENT_GAME,
        ENTRY_FROM_CHAT_COMPLETE_PROFILE,
        ENTRY_FROM_MYTAB_COMPLETE_PROFILE,
        ENTRY_FROM_LEFT_SWIPE_COMPLETE_PROFILE,
        ENTRY_FROM_LIKE_COMPLETE_PROFILE,
        ENTRY_FROM_IDEAL_OTHER_PROFILE_FEEDBACK,
        ENTRY_FROM_IDEAL_PROFILE_GUIDE,
        ENTRY_FROM_IDEAL_PROFILE_ITEM,
        ENTRY_FROM_EXPLORE_UPLOAD_PET_PHOTO,
        ENTRY_FROM_CARD_GUIDE_IMPROVE_PROFILE,
        ENTRY_FROM_MY_TAB_OPT,
        ENTRY_FROM_PICKS
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.LoopFragmentFactory$a */
    public static /* synthetic */ class C8670a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33404a;

        static {
            int[] iArr = new int[LoopInputType.values().length];
            f33404a = iArr;
            try {
                iArr[LoopInputType.HANGOUTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33404a[LoopInputType.VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33404a[LoopInputType.SIGNATURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33404a[LoopInputType.FRIEND_PURPOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33404a[LoopInputType.PROFESSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33404a[LoopInputType.INDUSTRY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33404a[LoopInputType.DEPARTMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33404a[LoopInputType.COMPANY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33404a[LoopInputType.MAJOR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33404a[LoopInputType.SCHOOL_NEW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f33404a[LoopInputType.SCHOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f33404a[LoopInputType.HOMETOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f33404a[LoopInputType.NICKNAME.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f33404a[LoopInputType.BIRTHDAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f33404a[LoopInputType.HEIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f33404a[LoopInputType.QUALIFICATION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f33404a[LoopInputType.CAR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f33404a[LoopInputType.PET.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f33404a[LoopInputType.HOUSE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f33404a[LoopInputType.INCOME.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f33404a[LoopInputType.NEW_TAG.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f33404a[LoopInputType.ARTWORK.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f33404a[LoopInputType.ETHNICITY.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f33404a[LoopInputType.LANGUAGE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f33404a[LoopInputType.GAME_NAME.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f33404a[LoopInputType.GAME_TOGETHER.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f33404a[LoopInputType.GAME_LEVEL.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f33404a[LoopInputType.GAME_VOICE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f33404a[LoopInputType.FITNESS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f33404a[LoopInputType.DRINKING.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f33404a[LoopInputType.SMOKING.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f33404a[LoopInputType.MY_LIFT.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f33404a[LoopInputType.TAG_MATCH_PIC.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f33404a[LoopInputType.PIC_MATCH_TAG.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f33404a[LoopInputType.GUIDE_UPLOAD_PIC_AND_TAG.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f33404a[LoopInputType.MY_LIFE_SEE_MYSELF.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f33404a[LoopInputType.MY_QUESTION.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f33404a[LoopInputType.MBTI_TEST.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f33404a[LoopInputType.GAME_CP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f33404a[LoopInputType.DO_NOT_WISH.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f33404a[LoopInputType.GROWTH_FOOD.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f33404a[LoopInputType.ABOUT_ME.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
        }
    }

    static {
        LoopInputType loopInputType = LoopInputType.INDUSTRY;
        LoopInputType loopInputType2 = LoopInputType.DEPARTMENT;
        LoopInputType loopInputType3 = LoopInputType.COMPANY;
        LoopInputType loopInputType4 = LoopInputType.SCHOOL_NEW;
        LoopInputType loopInputType5 = LoopInputType.HOMETOWN;
        LoopInputType loopInputType6 = LoopInputType.SIGNATURE;
        LoopInputType loopInputType7 = LoopInputType.NICKNAME;
        LoopInputType loopInputType8 = LoopInputType.BIRTHDAY;
        f33379a = new ArrayList<>(vwb.m200324f0(loopInputType, loopInputType2, loopInputType3, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8));
        LoopInputType loopInputType9 = LoopInputType.ETHNICITY;
        LoopInputType loopInputType10 = LoopInputType.LANGUAGE;
        LoopInputType loopInputType11 = LoopInputType.QUALIFICATION;
        f33380b = vwb.m200324f0(loopInputType9, loopInputType10, loopInputType, loopInputType2, loopInputType3, loopInputType11, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8);
        LoopInputType loopInputType12 = LoopInputType.MAJOR;
        LoopInputType loopInputType13 = LoopInputType.SCHOOL;
        f33381c = new ArrayList<>(vwb.m200324f0(loopInputType, loopInputType12, loopInputType13, loopInputType5, loopInputType6, loopInputType7, loopInputType8));
        f33382d = vwb.m200324f0(loopInputType9, loopInputType10, loopInputType, loopInputType12, loopInputType11, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8);
        f33383e = new ArrayList<>(vwb.m200324f0(loopInputType5, loopInputType4, loopInputType, loopInputType2, loopInputType3, loopInputType6));
        LoopInputType loopInputType14 = LoopInputType.PROFESSION;
        f33384f = new ArrayList<>(vwb.m200324f0(loopInputType5, loopInputType14, loopInputType3, loopInputType4, loopInputType6));
        f33385g = new ArrayList<>(vwb.m200324f0(loopInputType14, loopInputType3, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8));
        f33386h = new ArrayList<>(vwb.m200324f0(loopInputType6, loopInputType14, loopInputType3, loopInputType4, loopInputType5, loopInputType7, loopInputType8));
        f33387i = new ArrayList<>(vwb.m200324f0(loopInputType5, loopInputType, loopInputType12, loopInputType13, loopInputType6));
        LoopInputType loopInputType15 = LoopInputType.FRIEND_PURPOSE;
        f33388j = new ArrayList<>(vwb.m200324f0(loopInputType, loopInputType2, loopInputType3, loopInputType4, loopInputType5, loopInputType15, loopInputType6, loopInputType7, loopInputType8));
        f33389k = new ArrayList<>(vwb.m200324f0(loopInputType, loopInputType12, loopInputType13, loopInputType5, loopInputType15, loopInputType6, loopInputType7, loopInputType8));
        f33390l = new ArrayList<>(vwb.m200324f0(loopInputType5, loopInputType4, loopInputType, loopInputType2, loopInputType3, loopInputType15, loopInputType6));
        f33391m = new ArrayList<>(vwb.m200324f0(loopInputType5, loopInputType, loopInputType12, loopInputType13, loopInputType15, loopInputType6));
        f33392n = new ArrayList<>(vwb.m200324f0(loopInputType14, loopInputType4, loopInputType5));
        f33393o = new ArrayList<>(vwb.m200324f0(loopInputType14, loopInputType3, loopInputType4, loopInputType5, loopInputType15, loopInputType6, loopInputType7, loopInputType8));
        f33394p = new ArrayList<>(vwb.m200324f0(loopInputType6, loopInputType14, loopInputType3, loopInputType4, loopInputType5, loopInputType15, loopInputType7, loopInputType8));
        f33395q = new ArrayList<>(vwb.m200324f0(loopInputType5, loopInputType14, loopInputType3, loopInputType4, loopInputType15, loopInputType6));
        LoopInputType loopInputType16 = LoopInputType.HEIGHT;
        LoopInputType loopInputType17 = LoopInputType.INCOME;
        LoopInputType loopInputType18 = LoopInputType.CAR;
        LoopInputType loopInputType19 = LoopInputType.HOUSE;
        LoopInputType loopInputType20 = LoopInputType.GAME_NAME;
        LoopInputType loopInputType21 = LoopInputType.GAME_TOGETHER;
        LoopInputType loopInputType22 = LoopInputType.GAME_LEVEL;
        LoopInputType loopInputType23 = LoopInputType.GAME_VOICE;
        LoopInputType loopInputType24 = LoopInputType.GROWTH_FOOD;
        f33396r = new ArrayList<>(vwb.m200324f0(loopInputType6, loopInputType14, loopInputType3, loopInputType4, loopInputType11, loopInputType5, loopInputType15, loopInputType16, loopInputType17, loopInputType18, loopInputType19, loopInputType20, loopInputType21, loopInputType22, loopInputType23, loopInputType24, loopInputType7, loopInputType8));
        f33397s = new ArrayList<>(vwb.m200324f0(loopInputType6, loopInputType14, loopInputType3, loopInputType4, loopInputType11, loopInputType5, loopInputType15, loopInputType16, loopInputType20, loopInputType21, loopInputType22, loopInputType23, loopInputType24, loopInputType7, loopInputType8));
        f33398t = new ArrayList<>(vwb.m200324f0(loopInputType6, loopInputType, loopInputType12, loopInputType13, loopInputType11, loopInputType5, loopInputType15, loopInputType16, loopInputType20, loopInputType21, loopInputType22, loopInputType23, loopInputType24, loopInputType7, loopInputType8));
        f33399u = new ArrayList<>(vwb.m200324f0(loopInputType6, loopInputType, loopInputType12, loopInputType13, loopInputType11, loopInputType5, loopInputType15, loopInputType16, loopInputType17, loopInputType18, loopInputType19, loopInputType20, loopInputType21, loopInputType22, loopInputType23, loopInputType24, loopInputType7, loopInputType8));
        f33400v = vwb.m200324f0(loopInputType11, loopInputType4);
        f33401w = vwb.m200324f0(loopInputType, loopInputType2, loopInputType3);
        f33402x = vwb.m200324f0(loopInputType, loopInputType12);
        f33403y = vwb.m200324f0(loopInputType9, loopInputType10);
    }

    /* JADX INFO: renamed from: A */
    public static ArrayList<LoopInputType> m51457A(LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user, boolean z, boolean z2) {
        return m51458B(loopCreateEntryType, loopInputType, user, z, z2, "");
    }

    /* JADX INFO: renamed from: B */
    public static ArrayList<LoopInputType> m51458B(LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user, boolean z, boolean z2, String str) {
        return m51459C(loopCreateEntryType, loopInputType, user, z, z2, str, null);
    }

    /* JADX INFO: renamed from: C */
    public static ArrayList<LoopInputType> m51459C(LoopCreateEntryType loopCreateEntryType, final LoopInputType loopInputType, User user, boolean z, boolean z2, String str, User user2) {
        j760<String, IdealInfo> j760Var;
        IdealInfo idealInfo;
        User user3 = user2;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        new ArrayList();
        if (lqa.m150972j() && (CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO.equals(str) || CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO.equals(str))) {
            arrayList.add(LoopInputType.PHOTO);
        } else if (CoreStaticData.ProfileFromType.FROM_EXPLORE.equals(str)) {
            arrayList.add(LoopInputType.PET_PHOTO);
        } else if (CoreStaticData.ProfileFromType.FROM_PROFILE_FRAG_EDIT.equals(str)) {
            arrayList.addAll(f33392n);
        } else if (lqa.m150969g() && (loopCreateEntryType == LoopCreateEntryType.ENTRY_EDIT || loopCreateEntryType == LoopCreateEntryType.ENTRY_CARD_FACK_UP_DATA)) {
            m51474R(arrayList, f33386h, f33385g);
        } else if (lqa.m150969g()) {
            arrayList.addAll(f33384f);
        } else if (user.profile.studies.active) {
            if (loopCreateEntryType == LoopCreateEntryType.ENTRY_EDIT) {
                arrayList.addAll(f33382d);
            } else {
                arrayList.addAll(f33387i);
            }
        } else if (loopCreateEntryType == LoopCreateEntryType.ENTRY_EDIT) {
            arrayList.addAll(f33380b);
        } else {
            arrayList.addAll(f33383e);
        }
        if (!IntlCountryCodeController.m28114j()) {
            arrayList.remove(LoopInputType.ETHNICITY);
            arrayList.remove(LoopInputType.LANGUAGE);
        }
        if (lqa.m150969g()) {
            m51471O(arrayList);
        }
        if (lqa.m150972j() && CoreStaticData.ProfileFromType.FROM_THIN_POPUP.equals(str) && user.pictures.size() < 2) {
            arrayList.add(LoopInputType.PHOTO);
        }
        if (loopCreateEntryType == LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT) {
            arrayList.clear();
            str.getClass();
            switch (str) {
                case "intl_profile_education_kit":
                    arrayList.addAll(f33400v);
                    break;
                case "intl_profile_about_kit":
                    arrayList.add(LoopInputType.SIGNATURE);
                    break;
                case "intl_profile_ethnicity_language_kit":
                    arrayList.addAll(f33403y);
                    break;
                case "intl_profile_job_kit":
                    if (user.profile.studies.active) {
                        arrayList.addAll(f33402x);
                        break;
                    } else {
                        arrayList.addAll(f33401w);
                        break;
                    }
                    break;
            }
        }
        if (lqa.m150978p() && loopCreateEntryType == LoopCreateEntryType.ENTRY_SERIOUS_DIALOG) {
            arrayList.clear();
            arrayList.addAll(vwb.m200324f0(LoopInputType.QUALIFICATION, LoopInputType.HEIGHT, LoopInputType.INCOME, LoopInputType.CAR, LoopInputType.HOUSE));
        }
        if (lqa.m150985w()) {
            if (loopCreateEntryType == LoopCreateEntryType.ENTRY_EDIT) {
                arrayList.clear();
                LoopInputType loopInputType2 = LoopInputType.SIGNATURE;
                LoopInputType loopInputType3 = LoopInputType.FRIEND_PURPOSE;
                LoopInputType loopInputType4 = LoopInputType.HEIGHT;
                LoopInputType loopInputType5 = LoopInputType.PROFESSION;
                LoopInputType loopInputType6 = LoopInputType.COMPANY;
                LoopInputType loopInputType7 = LoopInputType.QUALIFICATION;
                LoopInputType loopInputType8 = LoopInputType.SCHOOL_NEW;
                LoopInputType loopInputType9 = LoopInputType.HOMETOWN;
                LoopInputType loopInputType10 = LoopInputType.FITNESS;
                LoopInputType loopInputType11 = LoopInputType.DRINKING;
                LoopInputType loopInputType12 = LoopInputType.SMOKING;
                LoopInputType loopInputType13 = LoopInputType.INCOME;
                LoopInputType loopInputType14 = LoopInputType.CAR;
                LoopInputType loopInputType15 = LoopInputType.HOUSE;
                LoopInputType loopInputType16 = LoopInputType.DO_NOT_WISH;
                arrayList.addAll(vwb.m200324f0(loopInputType2, loopInputType3, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8, loopInputType9, loopInputType10, loopInputType11, loopInputType12, loopInputType13, loopInputType14, loopInputType15, loopInputType16, LoopInputType.GAME_NAME, LoopInputType.GAME_TOGETHER, LoopInputType.GAME_LEVEL, LoopInputType.GAME_VOICE, LoopInputType.GROWTH_FOOD, LoopInputType.PET));
                if (!lqa.m150968f()) {
                    arrayList.remove(loopInputType16);
                }
            } else if (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_CHAT_COMPLETE_PROFILE || loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_MYTAB_COMPLETE_PROFILE || loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_LEFT_SWIPE_COMPLETE_PROFILE) {
                arrayList.clear();
                arrayList.addAll(vwb.m200324f0(LoopInputType.PROFESSION, LoopInputType.QUALIFICATION, LoopInputType.HOMETOWN, LoopInputType.FRIEND_PURPOSE, LoopInputType.HEIGHT, LoopInputType.FITNESS, LoopInputType.DRINKING, LoopInputType.SMOKING, LoopInputType.SIGNATURE, LoopInputType.MY_LIFT));
            } else if (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE) {
                arrayList.clear();
                LoopInputType loopInputType17 = LoopInputType.SIGNATURE;
                LoopInputType loopInputType18 = LoopInputType.MY_LIFT;
                LoopInputType loopInputType19 = LoopInputType.MY_QUESTION;
                LoopInputType loopInputType20 = LoopInputType.GAME_CP;
                LoopInputType loopInputType21 = LoopInputType.PET;
                arrayList.addAll(vwb.m200324f0(loopInputType17, loopInputType18, loopInputType19, loopInputType20, loopInputType21, LoopInputType.MBTI_TEST));
                if (NullChecker.m81303a(user3.profile.extensions) && NullChecker.m81303a(user3.profile.extensions.wealth) && !vwb.m200296J(user3.profile.extensions.wealth.pet) && (TextUtils.equals(user3.profile.extensions.wealth.pet.get(0), "已有宠物") || TextUtils.equals(user3.profile.extensions.wealth.pet.get(0), CoreModule.f17544b.getString(R$string.f27890m2)))) {
                    arrayList.remove(loopInputType21);
                }
            }
        }
        LoopInputType loopInputType22 = LoopInputType.GAME_NAME;
        if (arrayList.indexOf(loopInputType22) != -1) {
            if (user3 == null) {
                user3 = user;
            }
            if (!m51466J(loopInputType22, user3, str)) {
                arrayList.removeAll(vwb.m200324f0(LoopInputType.GAME_TOGETHER, LoopInputType.GAME_LEVEL, LoopInputType.GAME_VOICE));
            }
        }
        if (loopCreateEntryType == LoopCreateEntryType.ENTRY_MOMENT_GAME) {
            arrayList.clear();
            arrayList.add(loopInputType);
        }
        if (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT) {
            arrayList.clear();
            LoopInputType loopInputType23 = LoopInputType.MY_LIFE_SEE_MYSELF;
            if (loopInputType == loopInputType23) {
                arrayList.addAll(vwb.m200324f0(loopInputType23, LoopInputType.SIGNATURE, LoopInputType.VERIFICATION));
            } else {
                arrayList.addAll(vwb.m200324f0(LoopInputType.SIGNATURE, loopInputType23, LoopInputType.VERIFICATION));
            }
        }
        if (lqa.m150968f() && (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_GUIDE || loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM || loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_IDEAL_OTHER_PROFILE_FEEDBACK)) {
            ArrayList arrayListM200324f0 = vwb.m200324f0(LoopInputType.QUALIFICATION, LoopInputType.SCHOOL_NEW, LoopInputType.PROFESSION, LoopInputType.HEIGHT, LoopInputType.FITNESS, LoopInputType.MY_LIFT, LoopInputType.SIGNATURE, LoopInputType.INCOME, LoopInputType.CAR, LoopInputType.HOUSE, LoopInputType.PET, LoopInputType.GAME_CP, LoopInputType.MBTI_TEST);
            if (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM && (j760Var = pj90.f149731s) != null && !TextUtils.isEmpty(j760Var.f116564a) && (idealInfo = pj90.f149731s.f116565b) != null) {
                ArrayList arrayListM200324f1 = vwb.m200324f0(new String[0]);
                Iterator<IdealProfile> it = idealInfo.idealProfiles.iterator();
                while (it.hasNext()) {
                    arrayListM200324f1.addAll(it.next().profiles);
                }
                final ArrayList arrayListM200303Q = vwb.m200303Q(arrayListM200324f1, new w9j() { // from class: l.m3w
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return pj90.m169802n((String) obj);
                    }
                });
                if (arrayListM200324f1.size() > 0) {
                    Objects.requireNonNull(arrayListM200303Q);
                    arrayListM200324f0 = vwb.m200339n(arrayListM200324f0, new w9j() { // from class: l.o3w
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(arrayListM200303Q.contains((LoopInputType) obj));
                        }
                    });
                }
            }
            arrayList.clear();
            arrayList.addAll(arrayListM200324f0);
        }
        if (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_CARD_GUIDE_IMPROVE_PROFILE) {
            arrayList.clear();
            LoopInputType loopInputType24 = LoopInputType.FITNESS;
            if (loopInputType == loopInputType24) {
                arrayList.addAll(vwb.m200324f0(loopInputType24));
            } else {
                LoopInputType loopInputType25 = LoopInputType.DRINKING;
                if (loopInputType == loopInputType25) {
                    arrayList.addAll(vwb.m200324f0(loopInputType25));
                } else {
                    LoopInputType loopInputType26 = LoopInputType.SMOKING;
                    if (loopInputType == loopInputType26) {
                        arrayList.addAll(vwb.m200324f0(loopInputType26));
                    } else {
                        LoopInputType loopInputType27 = LoopInputType.GAME_NAME;
                        if (loopInputType == loopInputType27) {
                            arrayList.addAll(vwb.m200324f0(loopInputType27, LoopInputType.GAME_TOGETHER));
                        }
                    }
                }
            }
        }
        ArrayList<LoopInputType> arrayList2 = new ArrayList<>();
        int iM200293G = vwb.m200293G(arrayList, new w9j() { // from class: l.p3w
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LoopInputType) obj) == loopInputType);
            }
        });
        int i = iM200293G >= 0 ? iM200293G : 0;
        if (NullChecker.m81303a(loopInputType)) {
            arrayList2.add(loopInputType);
        }
        for (int i2 = i; i2 < arrayList.size() + i; i2++) {
            LoopInputType loopInputType28 = (LoopInputType) arrayList.get(i2 % arrayList.size());
            if (loopInputType28 != loopInputType && (!m51466J(loopInputType28, user, str) || ((loopInputType28 == LoopInputType.INDUSTRY && !z) || ((loopInputType28 == LoopInputType.PET && loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE) || (loopInputType28 == LoopInputType.PROFESSION && !z && lqa.m150969g()))))) {
                arrayList2.add(loopInputType28);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: D */
    public static CategorySuggestions m51460D() {
        return ura.m195053e().m195057d().mo33720Mk();
    }

    /* JADX INFO: renamed from: E */
    public static void m51461E(LoopInputType loopInputType, Frag frag, User user, int i) {
        LoopEditInfo loopEditInfoM51494o = m51494o(loopInputType, user, frag.getContext());
        loopEditInfoM51494o.maxInput = i;
        frag.startActivityForResult(ProfileLoopCreateTagAct.m51638b2(loopEditInfoM51494o, frag.getContext()), loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: F */
    public static void m51462F(String str, Fragment fragment, User user) {
        LoopInputType loopInputType;
        if (TextUtils.equals(str, "personality")) {
            loopInputType = LoopInputType.PERSONALITY;
        } else if (TextUtils.equals(str, "sports")) {
            loopInputType = LoopInputType.SPORTS;
        } else if (TextUtils.equals(str, "music")) {
            loopInputType = LoopInputType.MUSIC;
        } else if (TextUtils.equals(str, "literature")) {
            loopInputType = LoopInputType.LITERATURE;
        } else if (TextUtils.equals(str, "movies")) {
            loopInputType = LoopInputType.MOVIES;
        } else if (TextUtils.equals(str, "food")) {
            loopInputType = LoopInputType.FOOD;
        } else {
            loopInputType = TextUtils.equals(str, "places") ? LoopInputType.PLACES : null;
        }
        LoopEditInfo loopEditInfoM51494o = m51494o(loopInputType, user, fragment.getContext());
        loopEditInfoM51494o.setMultiType(str);
        fragment.startActivityForResult(ProfileLoopMultiSelectAct.m51653Y1(loopEditInfoM51494o, fragment.getContext()), loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: G */
    public static void m51463G(Frag frag) {
        frag.startActivityForResult(ProfileLoopSchoolHideAct.m51666a2(frag.getContext()), LoopInputType.HIDDEN_SCHOOL.requestCode);
    }

    /* JADX INFO: renamed from: H */
    public static void m51464H(Frag frag, LoopInputType loopInputType) {
        Intent intentM51660Z1 = ProfileLoopQuestionAct.m51660Z1(frag.getContext());
        intentM51660Z1.putExtra("loop_create_tag_info", loopInputType);
        frag.startActivityForResult(intentM51660Z1, loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: I */
    public static void m51465I(User user, Act act, LoopInputType loopInputType) {
        Intent intentM51660Z1 = ProfileLoopQuestionAct.m51660Z1(act);
        intentM51660Z1.putExtra("loop_create_tag_info", loopInputType);
        intentM51660Z1.putExtra("loop_edit_user", user);
        act.startActivityForResult(intentM51660Z1, loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m51466J(LoopInputType loopInputType, User user, String str) {
        return m51467K(loopInputType, user, str, m51468L(str));
    }

    /* JADX INFO: renamed from: K */
    public static boolean m51467K(LoopInputType loopInputType, User user, String str, boolean z) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        boolean z2 = (NullChecker.m81303a(userM169527p9.settings) && NullChecker.m81304b(userM169527p9.settings.verification) && NullChecker.m81304b(userM169527p9.settings.verification.studies) && TEnum.equals(userM169527p9.settings.verification.studies.status, "pending")) ? false : true;
        String str2 = "";
        switch (C8670a.f33404a[loopInputType.ordinal()]) {
            case 1:
                return !TextUtils.isEmpty(user.profile.hangouts);
            case 2:
                VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
                return verificationCenterM31612k4 != null && (TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending"));
            case 3:
                return !TextUtils.isEmpty(user.description);
            case 4:
                return !vwb.m200296J(user.profile.extensions.basic.friendPurpose);
            case 5:
                if (!z2) {
                    return true;
                }
                if (CoreStaticData.ProfileFromType.FROM_PROFILE_FRAG_EDIT.equals(str)) {
                    Profile profile = user.profile;
                    if (profile.studies.active) {
                        return true;
                    }
                    Work work = profile.work;
                    String str3 = work.industry;
                    String str4 = work.department;
                    String string = CoreModule.f17544b.getString(R$string.f27773R2);
                    if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.equals(str3, string) || TextUtils.equals(str3, "其它") || TextUtils.equals(str4, string) || TextUtils.equals(str4, "其它")) {
                        return false;
                    }
                }
                return !TextUtils.isEmpty(user.profile.work.industry) || user.profile.studies.active;
            case 6:
                return (z2 && TextUtils.isEmpty(user.profile.work.industry) && !user.profile.studies.active) ? false : true;
            case 7:
                return (TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_FILTER_PURPOSE_DIALOG) && user.profile.studies.active) || !TextUtils.isEmpty(user.profile.work.department);
            case 8:
                Profile profile2 = user.profile;
                return profile2.studies.active || !TextUtils.isEmpty(profile2.work.company);
            case 9:
                return !TextUtils.isEmpty(user.profile.studies.major);
            case 10:
            case 11:
                return (z2 && TextUtils.isEmpty(user.profile.studies.school)) ? false : true;
            case 12:
                return m51490k(user);
            case 13:
            case 14:
                return true;
            case 15:
                if (vwb.m200296J(user.profile.extensions.physical.height) || TextUtils.isEmpty(user.profile.extensions.physical.height.get(0))) {
                    return false;
                }
                return (z && TextUtils.equals(user.profile.extensions.physical.height.get(0), CoreModule.f17544b.getString(R$string.f27884l2))) ? false : true;
            case 16:
                return (!NullChecker.m81303a(user.profile.studies) || TEnum.equals(user.profile.studies.qualification, "unknown_") || TEnum.equals(user.profile.studies.qualification, QualificationType.NO_QUALIFICATION)) ? false : true;
            case 17:
                UserWealth userWealth = user.profile.extensions.wealth;
                if (userWealth != null && !vwb.m200296J(userWealth.car)) {
                    str2 = user.profile.extensions.wealth.car.get(0);
                }
                if (FriendPurposeHelper.m59430i(str2)) {
                    return (z && !vwb.m200296J(user.profile.extensions.wealth.car) && TextUtils.equals(user.profile.extensions.wealth.car.get(0), CoreModule.f17544b.getString(R$string.f27884l2))) ? false : true;
                }
                return false;
            case 18:
                if (NullChecker.m81303a(user.profile.extensions.wealth) && !vwb.m200296J(user.profile.extensions.wealth.pet)) {
                    str2 = user.profile.extensions.wealth.pet.get(0);
                }
                if (FriendPurposeHelper.m59433l(str2)) {
                    return (z && !vwb.m200296J(user.profile.extensions.wealth.pet) && TextUtils.equals(user.profile.extensions.wealth.pet.get(0), CoreModule.f17544b.getString(R$string.f27884l2))) ? false : true;
                }
                return false;
            case 19:
                if (NullChecker.m81303a(user.profile.extensions.wealth) && !vwb.m200296J(user.profile.extensions.wealth.house)) {
                    str2 = user.profile.extensions.wealth.house.get(0);
                }
                if (FriendPurposeHelper.m59431j(str2)) {
                    return (z && !vwb.m200296J(user.profile.extensions.wealth.house) && TextUtils.equals(user.profile.extensions.wealth.house.get(0), CoreModule.f17544b.getString(R$string.f27884l2))) ? false : true;
                }
                return false;
            case 20:
                if (NullChecker.m81303a(user.profile.extensions.wealth)) {
                    UserWealth userWealth2 = user.profile.extensions.wealth;
                    if (FriendPurposeHelper.m59432k(userWealth2.upperIncome, userWealth2.lowIncome)) {
                        return (z && !vwb.m200296J(user.profile.extensions.wealth.lowIncome) && TextUtils.equals(user.profile.extensions.wealth.lowIncome.get(0), CoreModule.f17544b.getString(R$string.f27884l2))) ? false : true;
                    }
                }
                return false;
            case 21:
                return NullChecker.m81303a(user.profile.extensions.interest) && !vwb.m200296J(user.profile.extensions.interest.tags);
            case 22:
                return !vwb.m200296J(n53.m157985a(CoreModule.m29931H().userId()));
            case 23:
                return !vwb.m200296J(user.profile.extensions.basic.ethnicity);
            case 24:
                return !vwb.m200296J(user.profile.extensions.basic.language);
            case 25:
                return NullChecker.m81303a(user.profile.extensions.game) && pc8.m168317u0(user.profile.extensions.game.name);
            case 26:
                return NullChecker.m81303a(user.profile.extensions.game) && pc8.m168317u0(user.profile.extensions.game.together);
            case 27:
                return NullChecker.m81303a(user.profile.extensions.game) && pc8.m168317u0(user.profile.extensions.game.level);
            case 28:
                return NullChecker.m81303a(user.profile.extensions.game) && pc8.m168317u0(user.profile.extensions.game.voice);
            case 29:
                if (!NullChecker.m81303a(user.profile.extensions.physical) || vwb.m200296J(user.profile.extensions.physical.fitness) || TextUtils.isEmpty(user.profile.extensions.physical.fitness.get(0))) {
                    return false;
                }
                return (z && TextUtils.equals(user.profile.extensions.physical.fitness.get(0), FriendPurposeHelper.FitnessType.not_reveal.toString())) ? false : true;
            case 30:
                if (!NullChecker.m81303a(user.profile.extensions.physical) || vwb.m200296J(user.profile.extensions.physical.drink) || TextUtils.isEmpty(user.profile.extensions.physical.drink.get(0))) {
                    return false;
                }
                return (z && TextUtils.equals(FriendPurposeHelper.DrinkType.getDes(user.profile.extensions.physical.drink.get(0)), CoreModule.f17544b.getString(R$string.f27884l2))) ? false : true;
            case 31:
                if (!NullChecker.m81303a(user.profile.extensions.physical) || vwb.m200296J(user.profile.extensions.physical.smoke) || TextUtils.isEmpty(user.profile.extensions.physical.smoke.get(0))) {
                    return false;
                }
                return (z && TextUtils.equals(FriendPurposeHelper.SmokeType.getDes(user.profile.extensions.physical.smoke.get(0)), CoreModule.f17544b.getString(R$string.f27884l2))) ? false : true;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                if (!m51468L(str) || m51469M(str)) {
                    return user.pictures.size() >= 3;
                }
                return user.pictures.size() == 9;
            case 37:
                return !vwb.m200296J(user.profile.answers);
            case 38:
                return pj90.m169807t(CoreModule.f17545c.f19639e0.m169520na());
            case 39:
                return NullChecker.m81303a(user.profile.extensions.game) && !vwb.m200296J(user.profile.extensions.game.screenshot);
            case 40:
                return pj90.m169805r(user);
            case 41:
                return NullChecker.m81303a(user.profile.extensions.interest) && pc8.m168317u0(user.profile.extensions.interest.taste);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: L */
    public static boolean m51468L(String str) {
        return TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG) || m51469M(str);
    }

    /* JADX INFO: renamed from: M */
    public static boolean m51469M(String str) {
        return TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_PROFILE_ITEM);
    }

    /* JADX INFO: renamed from: N */
    public static boolean m51470N(int i, User user, Intent intent) {
        Answer next;
        if (i == LoopInputType.FRIEND_PURPOSE.requestCode) {
            return true;
        }
        if (i == LoopInputType.HANGOUTS.requestCode) {
            user.profile.hangouts = intent.getStringExtra("loop_result_key");
            return true;
        }
        if (i == LoopInputType.PERSONALITY.requestCode || i == LoopInputType.SPORTS.requestCode || i == LoopInputType.MUSIC.requestCode || i == LoopInputType.LITERATURE.requestCode || i == LoopInputType.MOVIES.requestCode || i == LoopInputType.FOOD.requestCode || i == LoopInputType.PLACES.requestCode || i == LoopInputType.ETHNICITY.requestCode || i == LoopInputType.LANGUAGE.requestCode || i == LoopInputType.QUESTION_CHOICE.requestCode) {
            return true;
        }
        if (i != LoopInputType.QUESTION_EDIT.requestCode) {
            return i == LoopInputType.HIDDEN_SCHOOL.requestCode;
        }
        String stringExtra = intent.getStringExtra("loop_result_key");
        LoopEditInfo loopEditInfo = (LoopEditInfo) intent.getSerializableExtra("loop_create_tag_info");
        if (!NullChecker.m81303a(loopEditInfo)) {
            return false;
        }
        String str = loopEditInfo.editObjKey;
        if (TextUtils.isEmpty(str) || vwb.m200296J(user.profile.answers)) {
            return false;
        }
        Iterator<Answer> it = user.profile.answers.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!TextUtils.equals(next.question, str));
        if (!NullChecker.m81303a(next)) {
            return false;
        }
        if (vwb.m200298L(stringExtra)) {
            user.profile.answers.remove(next);
        } else {
            next.value = stringExtra;
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public static void m51471O(ArrayList<LoopInputType> arrayList) {
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            LoopInputType loopInputType = arrayList.get(i3);
            if (loopInputType == LoopInputType.INDUSTRY) {
                i = i3;
            } else if (loopInputType == LoopInputType.SCHOOL) {
                i2 = i3;
            } else if (loopInputType == LoopInputType.DEPARTMENT) {
                z = true;
            } else if (loopInputType == LoopInputType.MAJOR) {
                z2 = true;
            }
        }
        if (i >= 0) {
            arrayList.set(i, LoopInputType.PROFESSION);
        }
        if (i2 >= 0) {
            arrayList.set(i2, LoopInputType.SCHOOL_NEW);
        }
        if (z) {
            arrayList.remove(LoopInputType.DEPARTMENT);
        }
        if (z2) {
            arrayList.remove(LoopInputType.MAJOR);
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m51472P(User user, String str) {
        if (!lqa.m150969g()) {
            user.profile.hometown = str;
            return;
        }
        Profile profile = user.profile;
        profile.hometown = "";
        profile.extensions.basic.country = new ArrayList();
        user.profile.extensions.basic.province = new ArrayList();
        user.profile.extensions.basic.city = new ArrayList();
        String[] strArrSplit = str.split("·");
        if (strArrSplit.length >= 3 && !TextUtils.isEmpty(strArrSplit[2])) {
            user.profile.extensions.basic.city.add(0, strArrSplit[2]);
        }
        if (strArrSplit.length >= 2 && !TextUtils.isEmpty(strArrSplit[1])) {
            user.profile.extensions.basic.province.add(0, strArrSplit[1]);
            user.profile.hometown = strArrSplit[1];
        }
        if (strArrSplit.length < 1 || TextUtils.isEmpty(strArrSplit[0])) {
            return;
        }
        user.profile.extensions.basic.country.add(0, strArrSplit[0]);
        if (TextUtils.isEmpty(user.profile.hometown)) {
            user.profile.hometown = strArrSplit[0];
        }
    }

    /* JADX INFO: renamed from: Q */
    public static List<String> m51473Q(List<String> list) {
        Collator collator = Collator.getInstance(Locale.getDefault());
        collator.setStrength(0);
        Collections.sort(list, collator);
        for (final String str : Lists.m15930q(vwb.m200304R(CoreModule.f17544b.getString(R$string.f27902o2).split(Constants.SEPARATOR_COMMA), new w9j() { // from class: l.s3w
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((String) obj).trim();
            }
        }))) {
            int iM200293G = vwb.m200293G(list, new w9j() { // from class: l.t3w
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).toLowerCase().equals(str));
                }
            });
            if (iM200293G > 0) {
                String str2 = list.get(iM200293G);
                list.remove(iM200293G);
                list.add(0, str2);
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: R */
    public static void m51474R(ArrayList<LoopInputType> arrayList, ArrayList<LoopInputType> arrayList2, ArrayList<LoopInputType> arrayList3) {
        if (lqa.m150983u()) {
            arrayList.addAll(arrayList2);
        } else {
            arrayList.addAll(arrayList3);
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m51475S(User user, Frag frag, LoopInputType loopInputType) {
        m51476T(user, frag, loopInputType, LoopCreateEntryType.ENTRY_EDIT);
    }

    /* JADX INFO: renamed from: T */
    public static void m51476T(User user, Frag frag, LoopInputType loopInputType, LoopCreateEntryType loopCreateEntryType) {
        m51477U(user, frag, loopInputType, loopCreateEntryType, "");
    }

    /* JADX INFO: renamed from: U */
    public static void m51477U(User user, Frag frag, LoopInputType loopInputType, LoopCreateEntryType loopCreateEntryType, String str) {
        m51478V(user, frag, loopInputType, loopCreateEntryType, str, true);
    }

    /* JADX INFO: renamed from: V */
    public static void m51478V(User user, Frag frag, LoopInputType loopInputType, LoopCreateEntryType loopCreateEntryType, String str, boolean z) {
        m51479W(user, frag, loopInputType, loopCreateEntryType, str, z, null);
    }

    /* JADX INFO: renamed from: W */
    public static void m51479W(User user, Frag frag, LoopInputType loopInputType, LoopCreateEntryType loopCreateEntryType, String str, boolean z, C4317a.a aVar) {
        Intent intentM51507Y1 = ProfileInfoLoopEditAct.m51507Y1(frag.getContext(), loopCreateEntryType, loopInputType, user, str);
        ura.m195053e().m195057d().mo33888no(user.profile.studies.active);
        if (NullChecker.m81303a(aVar)) {
            frag.m20601u4(3500, intentM51507Y1, aVar);
        } else {
            frag.startActivityForResult(intentM51507Y1, 3500);
        }
        if (z) {
            frag.getActivity().overridePendingTransition(tzb0.f172721h, tzb0.f172716c);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m51489j(Act act) {
        if (ura.m195053e().m195057d().mo33757Uc().profile.studies.active) {
            ura.m195053e().m195057d().mo33873kl();
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m51490k(User user) {
        if (!TextUtils.isEmpty(user.profile.hometown)) {
            return true;
        }
        if (!vwb.m200296J(user.profile.extensions.basic.country) && !TextUtils.isEmpty(user.profile.extensions.basic.country.get(0))) {
            return true;
        }
        if (vwb.m200296J(user.profile.extensions.basic.province) || TextUtils.isEmpty(user.profile.extensions.basic.province.get(0))) {
            return (vwb.m200296J(user.profile.extensions.basic.city) || TextUtils.isEmpty(user.profile.extensions.basic.city.get(0))) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static void m51491l(User user, LoopInputType loopInputType, String str, String str2, int i) {
        int i2 = C8670a.f33404a[loopInputType.ordinal()];
        if (i2 == 4) {
            user.profile.extensions.basic.friendPurpose = ura.m195053e().m195057d().mo33887nn(str2);
            return;
        }
        if (i2 == 20) {
            Pair<List<String>, List<String>> pairMo33751T8 = ura.m195053e().m195057d().mo33751T8(str2);
            if (!NullChecker.m81303a(user.profile.extensions.wealth)) {
                user.profile.extensions.wealth = UserWealth.new_();
            }
            UserWealth userWealth = user.profile.extensions.wealth;
            userWealth.lowIncome = (List) pairMo33751T8.first;
            userWealth.upperIncome = (List) pairMo33751T8.second;
            return;
        }
        switch (i2) {
            case 6:
                if (NullChecker.m81303a(m51460D())) {
                    if (!TextUtils.equals(m51460D().industry.get(0), str2)) {
                        Profile profile = user.profile;
                        profile.studies.active = false;
                        Work work = profile.work;
                        work.active = true;
                        work.industry = str2;
                    } else {
                        Profile profile2 = user.profile;
                        profile2.studies.active = true;
                        profile2.work.active = false;
                    }
                }
                break;
            case 7:
                user.profile.work.department = str2;
                break;
            case 8:
                user.profile.work.company = str2;
                break;
            case 9:
                user.profile.studies.major = str2;
                break;
            case 10:
            case 11:
                user.profile.studies.school = str2;
                break;
            case 12:
                m51472P(user, str2);
                break;
            case 13:
                user.name = str2;
                break;
            default:
                switch (i2) {
                    case 16:
                        user.profile.studies.qualification = ura.m195053e().m195057d().mo33702Ik(str2);
                        break;
                    case 17:
                        if (!NullChecker.m81303a(user.profile.extensions.wealth)) {
                            user.profile.extensions.wealth = UserWealth.new_();
                        }
                        user.profile.extensions.wealth.car = ura.m195053e().m195057d().mo33825fa(str2);
                        break;
                    case 18:
                        if (!NullChecker.m81303a(user.profile.extensions.wealth)) {
                            user.profile.extensions.wealth = UserWealth.new_();
                        }
                        user.profile.extensions.wealth.pet = ura.m195053e().m195057d().mo33737Os(str2);
                        break;
                    default:
                        switch (i2) {
                            case 28:
                                user.profile.extensions.game.voice = vwb.m200324f0(str2);
                                break;
                            case 29:
                                Extensions extensions = user.profile.extensions;
                                if (extensions.physical == null) {
                                    extensions.physical = Physical.new_();
                                }
                                user.profile.extensions.physical.fitness.clear();
                                user.profile.extensions.physical.fitness.add(str);
                                break;
                            case 30:
                                Extensions extensions2 = user.profile.extensions;
                                if (extensions2.physical == null) {
                                    extensions2.physical = Physical.new_();
                                }
                                user.profile.extensions.physical.drink.clear();
                                user.profile.extensions.physical.drink.add(str);
                                break;
                            case 31:
                                Extensions extensions3 = user.profile.extensions;
                                if (extensions3.physical == null) {
                                    extensions3.physical = Physical.new_();
                                }
                                user.profile.extensions.physical.smoke.clear();
                                user.profile.extensions.physical.smoke.add(str);
                                break;
                        }
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m51492m(User user, LoopInputType loopInputType, List<String> list) {
        int i = C8670a.f33404a[loopInputType.ordinal()];
        if (i == 25) {
            user.profile.extensions.game.name = list;
        } else if (i == 26) {
            user.profile.extensions.game.together = list;
        } else {
            if (i != 41) {
                return;
            }
            user.profile.extensions.interest.taste = list;
        }
    }

    /* JADX INFO: renamed from: n */
    public static ArrayList<LoopSelectFillData> m51493n(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (NullChecker.m81303a(m51460D())) {
            List<String> list = m51460D().department.get(user.profile.work.industry) == null ? m51460D().department.get("general") : m51460D().department.get(user.profile.work.industry);
            if (!vwb.m200296J(list)) {
                arrayList.add(new LoopSelectFillData(CoreModule.f17544b.getString(R$string.f27793V2), LoopSelectFillData.LoopSelectType.INPUT_ENTRY));
                String str = user.profile.work.department;
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(new LoopSelectFillData(str).m51583i(true));
                }
                for (String str2 : list) {
                    if (!TextUtils.equals(str, str2)) {
                        LoopSelectFillData loopSelectFillData = new LoopSelectFillData(str2);
                        arrayList.add(loopSelectFillData);
                        if (TextUtils.equals(str2, user.profile.work.department)) {
                            loopSelectFillData.m51583i(true);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static LoopEditInfo m51494o(LoopInputType loopInputType, User user, Context context) {
        if (loopInputType == LoopInputType.ABOUT_ME) {
            return lqa.m150980r() ? LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 100, context.getString(R$string.f27834d0)).setEmptyInput(true) : LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 500, ura.m195053e().m195057d().mo33934uj()).setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.COMPANY) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f27713F2)).setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.MAJOR) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f27748M2)).setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.SCHOOL) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f27763P2)).setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.NICKNAME) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 50, context.getString(R$string.f27950w2));
        }
        if (loopInputType == LoopInputType.INDUSTRY) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f27932t2)).setEmptyInput(false);
        }
        if (loopInputType == LoopInputType.HANGOUTS) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f27728I2)).setEmptyInput(true).setDefaultContent(user.profile.hangouts);
        }
        LoopInputType loopInputType2 = LoopInputType.PERSONALITY;
        if (loopInputType == loopInputType2) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f27956x2));
        }
        if (loopInputType == loopInputType2 || loopInputType == LoopInputType.SPORTS || loopInputType == LoopInputType.MUSIC || loopInputType == LoopInputType.LITERATURE || loopInputType == LoopInputType.MOVIES || loopInputType == LoopInputType.FOOD || loopInputType == LoopInputType.PLACES) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f27938u2));
        }
        if (loopInputType == LoopInputType.DEPARTMENT) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f27944v2)).setEmptyInput(false);
        }
        if (loopInputType == LoopInputType.HOMETOWN) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f27926s2)).setEmptyInput(false);
        }
        if (loopInputType == LoopInputType.SIGNATURE) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 500, context.getString(R$string.f27873j3)).setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.FAMILY) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 100, "介绍下父母职业，比如普通家庭，经商家庭，高知家庭（请认真填写，乱填会被举报封禁的哦）").setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.INTEREST) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 100, "业余喜欢做什么，比如喜欢看什么样的书，喜欢去什么样的地方旅行等（请认真填写，乱填会被举报封禁的哦）").setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.LOVE) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 100, "你期待什么样的爱情，你如何看待爱情（请认真填写，乱填会被举报封禁的哦）").setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.HALF) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 100, "说出你对另一半的期许（请认真填写，乱填会被举报封禁的哦）").setEmptyInput(true);
        }
        if (loopInputType != LoopInputType.DO_NOT_WISH) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f27956x2));
        }
        LoopEditInfo emptyInput = LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 100, "我不希望你...").setEmptyInput(true);
        emptyInput.subTitle = "关于交友，我不希望你...";
        return emptyInput;
    }

    /* JADX INFO: renamed from: p */
    public static ArrayList<LoopSelectFillData> m51495p(LoopInputType loopInputType, User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (loopInputType == LoopInputType.INDUSTRY) {
            return m51503x(user);
        }
        if (loopInputType == LoopInputType.DEPARTMENT) {
            return m51493n(user);
        }
        if (loopInputType == LoopInputType.HOMETOWN) {
            return lqa.m150969g() ? m51502w(user) : m51501v(user);
        }
        if (loopInputType == LoopInputType.FRIEND_PURPOSE) {
            return FriendPurposeHelper.m59425d(user);
        }
        if (loopInputType == LoopInputType.QUALIFICATION) {
            return FriendPurposeHelper.m59428g(user);
        }
        if (loopInputType == LoopInputType.INCOME) {
            return FriendPurposeHelper.m59426e(user);
        }
        if (loopInputType == LoopInputType.CAR) {
            return FriendPurposeHelper.m59422a(user);
        }
        if (loopInputType == LoopInputType.PET) {
            return FriendPurposeHelper.m59427f(user);
        }
        if (loopInputType == LoopInputType.PERSONALITY || loopInputType == LoopInputType.SPORTS || loopInputType == LoopInputType.MUSIC || loopInputType == LoopInputType.LITERATURE || loopInputType == LoopInputType.MOVIES || loopInputType == LoopInputType.FOOD || loopInputType == LoopInputType.PLACES) {
            return m51504y(loopInputType, user);
        }
        if (loopInputType == LoopInputType.GAME_VOICE) {
            return m51498s(user);
        }
        if (loopInputType == LoopInputType.GAME_NAME) {
            return m51496q(user);
        }
        if (loopInputType == LoopInputType.GAME_TOGETHER) {
            return m51497r(user);
        }
        if (loopInputType == LoopInputType.FITNESS) {
            return FriendPurposeHelper.m59424c(user);
        }
        if (loopInputType == LoopInputType.DRINKING) {
            return FriendPurposeHelper.m59423b(user);
        }
        if (loopInputType == LoopInputType.SMOKING) {
            return FriendPurposeHelper.m59429h(user);
        }
        return loopInputType == LoopInputType.GROWTH_FOOD ? m51499t(user) : arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static ArrayList<LoopSelectFillData> m51496q(User user) {
        ExtensionGame extensionGame = user.profile.extensions.game;
        final List arrayList = extensionGame == null ? new ArrayList() : extensionGame.name;
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        ArrayList arrayListM200324f0 = vwb.m200324f0(new LoopSelectFillData("王者荣耀", loopSelectType), new LoopSelectFillData("和平精英", loopSelectType), new LoopSelectFillData("蛋仔派对", loopSelectType), new LoopSelectFillData("原神", loopSelectType), new LoopSelectFillData("第五人格", loopSelectType), new LoopSelectFillData("英雄联盟", loopSelectType), new LoopSelectFillData("金铲铲之战", loopSelectType), new LoopSelectFillData("狼人杀", loopSelectType));
        vwb.m200354z(arrayListM200324f0, new e30() { // from class: l.q3w
            @Override // p149l.e30
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m51583i(arrayList.contains(loopSelectFillData.m51575a()));
            }
        });
        return new ArrayList<>(arrayListM200324f0);
    }

    /* JADX INFO: renamed from: r */
    public static ArrayList<LoopSelectFillData> m51497r(User user) {
        ExtensionGame extensionGame = user.profile.extensions.game;
        final List arrayList = extensionGame == null ? new ArrayList() : extensionGame.together;
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        ArrayList arrayListM200324f0 = vwb.m200324f0(new LoopSelectFillData("组队", loopSelectType), new LoopSelectFillData("cpdd", loopSelectType), new LoopSelectFillData("求大佬", loopSelectType), new LoopSelectFillData("找战队", loopSelectType), new LoopSelectFillData("其他", loopSelectType));
        vwb.m200354z(arrayListM200324f0, new e30() { // from class: l.u3w
            @Override // p149l.e30
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m51583i(arrayList.contains(loopSelectFillData.m51575a()));
            }
        });
        return new ArrayList<>(arrayListM200324f0);
    }

    /* JADX INFO: renamed from: s */
    public static ArrayList<LoopSelectFillData> m51498s(User user) {
        ExtensionGame extensionGame = user.profile.extensions.game;
        final List arrayList = extensionGame == null ? new ArrayList() : extensionGame.voice;
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        ArrayList arrayListM200324f0 = vwb.m200324f0(new LoopSelectFillData("可以开麦", loopSelectType), new LoopSelectFillData("不开麦", loopSelectType));
        vwb.m200354z(arrayListM200324f0, new e30() { // from class: l.n3w
            @Override // p149l.e30
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m51583i(TextUtils.equals((CharSequence) pc8.m168316t0(arrayList), loopSelectFillData.m51575a()));
            }
        });
        return new ArrayList<>(arrayListM200324f0);
    }

    /* JADX INFO: renamed from: t */
    public static ArrayList<LoopSelectFillData> m51499t(User user) {
        final List arrayList = user.profile.extensions.interest.taste;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        ArrayList arrayListM200324f0 = vwb.m200324f0(new LoopSelectFillData("boldFlavorLover", "重口味爱好者", loopSelectType), new LoopSelectFillData("mildFlavorFan", "清淡饮食", loopSelectType), new LoopSelectFillData("exoticFlavorLover", "异域风情品鉴家", loopSelectType), new LoopSelectFillData("chineseFoodLover", "中华料理狂热者", loopSelectType), new LoopSelectFillData("meatLover", "肉食主义", loopSelectType), new LoopSelectFillData("vegetarian", "素食主义", loopSelectType));
        vwb.m200354z(arrayListM200324f0, new e30() { // from class: l.r3w
            @Override // p149l.e30
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m51583i(arrayList.contains(loopSelectFillData.m51576b()));
            }
        });
        return new ArrayList<>(arrayListM200324f0);
    }

    /* JADX INFO: renamed from: u */
    public static HometownSuggest m51500u() {
        return ura.m195053e().m195057d().mo33723N6();
    }

    /* JADX INFO: renamed from: v */
    public static ArrayList<LoopSelectFillData> m51501v(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (NullChecker.m81303a(m51460D())) {
            List<String> listM51473Q = m51473Q(vwb.m200290D(m51460D().hometown));
            if (!vwb.m200296J(listM51473Q)) {
                arrayList.add(new LoopSelectFillData(CoreModule.f17544b.getString(R$string.f27793V2), LoopSelectFillData.LoopSelectType.INPUT_ENTRY));
                String str = user.profile.hometown;
                if (!TextUtils.isEmpty(str)) {
                    LoopSelectFillData loopSelectFillData = new LoopSelectFillData(str);
                    loopSelectFillData.m51583i(true);
                    arrayList.add(loopSelectFillData);
                }
                for (String str2 : listM51473Q) {
                    if (!TextUtils.equals(str2, str)) {
                        LoopSelectFillData loopSelectFillData2 = new LoopSelectFillData(str2);
                        if (!vwb.m200296J(m51460D().hometown.get(str2))) {
                            loopSelectFillData2.m51584j();
                        }
                        arrayList.add(loopSelectFillData2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public static ArrayList<LoopSelectFillData> m51502w(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (NullChecker.m81303a(m51500u())) {
            String strMo33725Nb = lqa.m150969g() ? ura.m195053e().m195057d().mo33725Nb(user.profile) : "";
            if (TextUtils.isEmpty(strMo33725Nb)) {
                strMo33725Nb = user.profile.hometown;
            }
            if (!TextUtils.isEmpty(strMo33725Nb)) {
                LoopSelectFillData loopSelectFillData = new LoopSelectFillData(strMo33725Nb);
                loopSelectFillData.m51583i(true);
                arrayList.add(loopSelectFillData);
            }
            List<HometownChinaItem> list = m51500u().china;
            for (int i = 0; i < list.size(); i++) {
                HometownChinaItem hometownChinaItem = list.get(i);
                if (!TextUtils.equals(hometownChinaItem.region, strMo33725Nb)) {
                    LoopSelectFillData loopSelectFillData2 = new LoopSelectFillData(hometownChinaItem.region);
                    if (!vwb.m200296J(hometownChinaItem.subRegion)) {
                        loopSelectFillData2.m51584j();
                    }
                    arrayList.add(loopSelectFillData2);
                }
            }
            LoopSelectFillData loopSelectFillData3 = new LoopSelectFillData(CoreModule.f17544b.getString(R$string.f27811Z0), LoopSelectFillData.LoopSelectType.SELECT_OVERSEAS);
            loopSelectFillData3.m51583i(false);
            loopSelectFillData3.m51584j();
            arrayList.add(loopSelectFillData3);
            String string = CoreModule.f17544b.getString(R$string.f27773R2);
            if (!TextUtils.equals(strMo33725Nb, string)) {
                LoopSelectFillData loopSelectFillData4 = new LoopSelectFillData(string, LoopSelectFillData.LoopSelectType.SELECT_OTHER);
                loopSelectFillData4.m51583i(false);
                arrayList.add(loopSelectFillData4);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static ArrayList<LoopSelectFillData> m51503x(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (NullChecker.m81303a(m51460D()) && !vwb.m200296J(m51460D().industry)) {
            String str = m51460D().industry.get(0);
            Profile profile = user.profile;
            String str2 = profile.studies.active ? str : profile.work.industry;
            arrayList.add(new LoopSelectFillData(CoreModule.f17544b.getString(R$string.f27793V2), LoopSelectFillData.LoopSelectType.INPUT_ENTRY));
            if (!TextUtils.isEmpty(str2)) {
                LoopSelectFillData loopSelectFillData = new LoopSelectFillData(str2);
                loopSelectFillData.m51583i(true);
                arrayList.add(loopSelectFillData);
            }
            for (String str3 : m51460D().industry) {
                if (!TextUtils.equals(str3, str2)) {
                    LoopSelectFillData loopSelectFillData2 = new LoopSelectFillData(str3);
                    arrayList.add(loopSelectFillData2);
                    if (TextUtils.equals(str, str3) && user.profile.studies.active) {
                        loopSelectFillData2.m51583i(true);
                    } else {
                        Profile profile2 = user.profile;
                        Work work = profile2.work;
                        if (work.active && !profile2.studies.active && TextUtils.equals(work.industry, str3)) {
                            loopSelectFillData2.m51583i(true);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static ArrayList<LoopSelectFillData> m51504y(final LoopInputType loopInputType, User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (!NullChecker.m81303a(m51460D())) {
            return arrayList;
        }
        ArrayList arrayListM200339n = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.v3w
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Tag) obj).category.equals(loopInputType.tagKey));
            }
        });
        ArrayList arrayList2 = arrayListM200339n == null ? new ArrayList() : vwb.m200303Q(arrayListM200339n, new w9j() { // from class: l.w3w
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Tag) obj).value;
            }
        });
        ArrayList arrayList3 = new ArrayList();
        if (loopInputType == LoopInputType.PERSONALITY) {
            arrayList3 = new ArrayList(m51460D().personality);
        } else if (loopInputType == LoopInputType.SPORTS) {
            arrayList3 = new ArrayList(m51460D().sports);
        } else if (loopInputType == LoopInputType.MUSIC) {
            arrayList3 = new ArrayList(m51460D().music);
        } else if (loopInputType == LoopInputType.LITERATURE) {
            arrayList3 = new ArrayList(m51460D().literature);
        } else if (loopInputType == LoopInputType.MOVIES) {
            arrayList3 = new ArrayList(m51460D().movies);
        } else if (loopInputType == LoopInputType.FOOD) {
            arrayList3 = new ArrayList(m51460D().food);
        } else if (loopInputType == LoopInputType.PLACES) {
            arrayList3 = new ArrayList(m51460D().places);
        }
        arrayList3.removeAll(arrayList2);
        if (!vwb.m200296J(arrayList2)) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                LoopSelectFillData loopSelectFillData = new LoopSelectFillData((String) it.next());
                loopSelectFillData.m51583i(true).m51581g();
                arrayList.add(loopSelectFillData);
            }
        }
        if (!vwb.m200296J(arrayList3)) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                LoopSelectFillData loopSelectFillData2 = new LoopSelectFillData((String) it2.next());
                loopSelectFillData2.m51583i(false).m51581g();
                arrayList.add(loopSelectFillData2);
            }
        }
        arrayList.add(0, new LoopSelectFillData(CoreModule.f17544b.getString(R$string.f27793V2), LoopSelectFillData.LoopSelectType.INPUT_ENTRY));
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public static ArrayList<LoopInputType> m51505z(LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user) {
        return m51457A(loopCreateEntryType, loopInputType, user, true, true);
    }
}
