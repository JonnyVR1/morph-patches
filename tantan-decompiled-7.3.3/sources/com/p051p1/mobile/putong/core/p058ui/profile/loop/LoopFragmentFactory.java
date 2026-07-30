package com.p051p1.mobile.putong.core.p058ui.profile.loop;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.clevertap.android.sdk.Constants;
import com.google.common.collect.Lists;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CategorySuggestions;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.HometownChinaItem;
import com.p051p1.mobile.putong.core.data.HometownSuggest;
import com.p051p1.mobile.putong.core.data.IdealInfo;
import com.p051p1.mobile.putong.core.data.IdealProfile;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopMultiSelectAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopQuestionAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopSchoolHideAct;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.ExtensionGame;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Physical;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.QualificationType;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import com.p051p1.mobile.putong.data.Work;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p153l.d63;
import p153l.gta;
import p153l.jyb;
import p153l.pf60;
import p153l.qcj;
import p153l.td8;
import p153l.tr90;
import p153l.xra;
import p153l.y20;
import p153l.z7c0;

/* JADX INFO: loaded from: classes4.dex */
public class LoopFragmentFactory {

    /* JADX INFO: renamed from: a */
    public static final ArrayList<LoopInputType> f34227a;

    /* JADX INFO: renamed from: b */
    public static final ArrayList<LoopInputType> f34228b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList<LoopInputType> f34229c;

    /* JADX INFO: renamed from: d */
    public static final ArrayList<LoopInputType> f34230d;

    /* JADX INFO: renamed from: e */
    public static final ArrayList<LoopInputType> f34231e;

    /* JADX INFO: renamed from: f */
    public static final ArrayList<LoopInputType> f34232f;

    /* JADX INFO: renamed from: g */
    public static final ArrayList<LoopInputType> f34233g;

    /* JADX INFO: renamed from: h */
    public static final ArrayList<LoopInputType> f34234h;

    /* JADX INFO: renamed from: i */
    public static final ArrayList<LoopInputType> f34235i;

    /* JADX INFO: renamed from: j */
    public static final ArrayList<LoopInputType> f34236j;

    /* JADX INFO: renamed from: k */
    public static final ArrayList<LoopInputType> f34237k;

    /* JADX INFO: renamed from: l */
    public static final ArrayList<LoopInputType> f34238l;

    /* JADX INFO: renamed from: m */
    public static final ArrayList<LoopInputType> f34239m;

    /* JADX INFO: renamed from: n */
    public static ArrayList<LoopInputType> f34240n;

    /* JADX INFO: renamed from: o */
    public static final ArrayList<LoopInputType> f34241o;

    /* JADX INFO: renamed from: p */
    public static final ArrayList<LoopInputType> f34242p;

    /* JADX INFO: renamed from: q */
    public static final ArrayList<LoopInputType> f34243q;

    /* JADX INFO: renamed from: r */
    public static final ArrayList<LoopInputType> f34244r;

    /* JADX INFO: renamed from: s */
    public static final ArrayList<LoopInputType> f34245s;

    /* JADX INFO: renamed from: t */
    public static final ArrayList<LoopInputType> f34246t;

    /* JADX INFO: renamed from: u */
    public static final ArrayList<LoopInputType> f34247u;

    /* JADX INFO: renamed from: v */
    public static final ArrayList<LoopInputType> f34248v;

    /* JADX INFO: renamed from: w */
    public static final ArrayList<LoopInputType> f34249w;

    /* JADX INFO: renamed from: x */
    public static final ArrayList<LoopInputType> f34250x;

    /* JADX INFO: renamed from: y */
    public static final ArrayList<LoopInputType> f34251y;

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
    public static /* synthetic */ class C8833a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34252a;

        static {
            int[] iArr = new int[LoopInputType.values().length];
            f34252a = iArr;
            try {
                iArr[LoopInputType.HANGOUTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34252a[LoopInputType.VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34252a[LoopInputType.SIGNATURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34252a[LoopInputType.FRIEND_PURPOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34252a[LoopInputType.PROFESSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34252a[LoopInputType.INDUSTRY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34252a[LoopInputType.DEPARTMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34252a[LoopInputType.COMPANY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34252a[LoopInputType.MAJOR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34252a[LoopInputType.SCHOOL_NEW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34252a[LoopInputType.SCHOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34252a[LoopInputType.HOMETOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34252a[LoopInputType.NICKNAME.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34252a[LoopInputType.BIRTHDAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f34252a[LoopInputType.HEIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f34252a[LoopInputType.QUALIFICATION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f34252a[LoopInputType.CAR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f34252a[LoopInputType.PET.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f34252a[LoopInputType.HOUSE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f34252a[LoopInputType.INCOME.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f34252a[LoopInputType.NEW_TAG.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f34252a[LoopInputType.ARTWORK.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f34252a[LoopInputType.ETHNICITY.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f34252a[LoopInputType.LANGUAGE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f34252a[LoopInputType.GAME_NAME.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f34252a[LoopInputType.GAME_TOGETHER.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f34252a[LoopInputType.GAME_LEVEL.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f34252a[LoopInputType.GAME_VOICE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f34252a[LoopInputType.FITNESS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f34252a[LoopInputType.DRINKING.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f34252a[LoopInputType.SMOKING.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f34252a[LoopInputType.MY_LIFT.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f34252a[LoopInputType.TAG_MATCH_PIC.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f34252a[LoopInputType.PIC_MATCH_TAG.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f34252a[LoopInputType.GUIDE_UPLOAD_PIC_AND_TAG.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f34252a[LoopInputType.MY_LIFE_SEE_MYSELF.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f34252a[LoopInputType.MY_QUESTION.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f34252a[LoopInputType.MBTI_TEST.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f34252a[LoopInputType.GAME_CP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f34252a[LoopInputType.DO_NOT_WISH.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f34252a[LoopInputType.GROWTH_FOOD.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f34252a[LoopInputType.ABOUT_ME.ordinal()] = 42;
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
        f34227a = new ArrayList<>(jyb.m147507f0(loopInputType, loopInputType2, loopInputType3, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8));
        LoopInputType loopInputType9 = LoopInputType.ETHNICITY;
        LoopInputType loopInputType10 = LoopInputType.LANGUAGE;
        LoopInputType loopInputType11 = LoopInputType.QUALIFICATION;
        f34228b = jyb.m147507f0(loopInputType9, loopInputType10, loopInputType, loopInputType2, loopInputType3, loopInputType11, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8);
        LoopInputType loopInputType12 = LoopInputType.MAJOR;
        LoopInputType loopInputType13 = LoopInputType.SCHOOL;
        f34229c = new ArrayList<>(jyb.m147507f0(loopInputType, loopInputType12, loopInputType13, loopInputType5, loopInputType6, loopInputType7, loopInputType8));
        f34230d = jyb.m147507f0(loopInputType9, loopInputType10, loopInputType, loopInputType12, loopInputType11, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8);
        f34231e = new ArrayList<>(jyb.m147507f0(loopInputType5, loopInputType4, loopInputType, loopInputType2, loopInputType3, loopInputType6));
        LoopInputType loopInputType14 = LoopInputType.PROFESSION;
        f34232f = new ArrayList<>(jyb.m147507f0(loopInputType5, loopInputType14, loopInputType3, loopInputType4, loopInputType6));
        f34233g = new ArrayList<>(jyb.m147507f0(loopInputType14, loopInputType3, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8));
        f34234h = new ArrayList<>(jyb.m147507f0(loopInputType6, loopInputType14, loopInputType3, loopInputType4, loopInputType5, loopInputType7, loopInputType8));
        f34235i = new ArrayList<>(jyb.m147507f0(loopInputType5, loopInputType, loopInputType12, loopInputType13, loopInputType6));
        LoopInputType loopInputType15 = LoopInputType.FRIEND_PURPOSE;
        f34236j = new ArrayList<>(jyb.m147507f0(loopInputType, loopInputType2, loopInputType3, loopInputType4, loopInputType5, loopInputType15, loopInputType6, loopInputType7, loopInputType8));
        f34237k = new ArrayList<>(jyb.m147507f0(loopInputType, loopInputType12, loopInputType13, loopInputType5, loopInputType15, loopInputType6, loopInputType7, loopInputType8));
        f34238l = new ArrayList<>(jyb.m147507f0(loopInputType5, loopInputType4, loopInputType, loopInputType2, loopInputType3, loopInputType15, loopInputType6));
        f34239m = new ArrayList<>(jyb.m147507f0(loopInputType5, loopInputType, loopInputType12, loopInputType13, loopInputType15, loopInputType6));
        f34240n = new ArrayList<>(jyb.m147507f0(loopInputType14, loopInputType4, loopInputType5));
        f34241o = new ArrayList<>(jyb.m147507f0(loopInputType14, loopInputType3, loopInputType4, loopInputType5, loopInputType15, loopInputType6, loopInputType7, loopInputType8));
        f34242p = new ArrayList<>(jyb.m147507f0(loopInputType6, loopInputType14, loopInputType3, loopInputType4, loopInputType5, loopInputType15, loopInputType7, loopInputType8));
        f34243q = new ArrayList<>(jyb.m147507f0(loopInputType5, loopInputType14, loopInputType3, loopInputType4, loopInputType15, loopInputType6));
        LoopInputType loopInputType16 = LoopInputType.HEIGHT;
        LoopInputType loopInputType17 = LoopInputType.INCOME;
        LoopInputType loopInputType18 = LoopInputType.CAR;
        LoopInputType loopInputType19 = LoopInputType.HOUSE;
        LoopInputType loopInputType20 = LoopInputType.GAME_NAME;
        LoopInputType loopInputType21 = LoopInputType.GAME_TOGETHER;
        LoopInputType loopInputType22 = LoopInputType.GAME_LEVEL;
        LoopInputType loopInputType23 = LoopInputType.GAME_VOICE;
        LoopInputType loopInputType24 = LoopInputType.GROWTH_FOOD;
        f34244r = new ArrayList<>(jyb.m147507f0(loopInputType6, loopInputType14, loopInputType3, loopInputType4, loopInputType11, loopInputType5, loopInputType15, loopInputType16, loopInputType17, loopInputType18, loopInputType19, loopInputType20, loopInputType21, loopInputType22, loopInputType23, loopInputType24, loopInputType7, loopInputType8));
        f34245s = new ArrayList<>(jyb.m147507f0(loopInputType6, loopInputType14, loopInputType3, loopInputType4, loopInputType11, loopInputType5, loopInputType15, loopInputType16, loopInputType20, loopInputType21, loopInputType22, loopInputType23, loopInputType24, loopInputType7, loopInputType8));
        f34246t = new ArrayList<>(jyb.m147507f0(loopInputType6, loopInputType, loopInputType12, loopInputType13, loopInputType11, loopInputType5, loopInputType15, loopInputType16, loopInputType20, loopInputType21, loopInputType22, loopInputType23, loopInputType24, loopInputType7, loopInputType8));
        f34247u = new ArrayList<>(jyb.m147507f0(loopInputType6, loopInputType, loopInputType12, loopInputType13, loopInputType11, loopInputType5, loopInputType15, loopInputType16, loopInputType17, loopInputType18, loopInputType19, loopInputType20, loopInputType21, loopInputType22, loopInputType23, loopInputType24, loopInputType7, loopInputType8));
        f34248v = jyb.m147507f0(loopInputType11, loopInputType4);
        f34249w = jyb.m147507f0(loopInputType, loopInputType2, loopInputType3);
        f34250x = jyb.m147507f0(loopInputType, loopInputType12);
        f34251y = jyb.m147507f0(loopInputType9, loopInputType10);
    }

    /* JADX INFO: renamed from: A */
    public static ArrayList<LoopInputType> m52640A(LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user, boolean z, boolean z2) {
        return m52641B(loopCreateEntryType, loopInputType, user, z, z2, "");
    }

    /* JADX INFO: renamed from: B */
    public static ArrayList<LoopInputType> m52641B(LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user, boolean z, boolean z2, String str) {
        return m52642C(loopCreateEntryType, loopInputType, user, z, z2, str, null);
    }

    /* JADX INFO: renamed from: C */
    public static ArrayList<LoopInputType> m52642C(LoopCreateEntryType loopCreateEntryType, final LoopInputType loopInputType, User user, boolean z, boolean z2, String str, User user2) {
        pf60<String, IdealInfo> pf60Var;
        IdealInfo idealInfo;
        User user3 = user2;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        new ArrayList();
        if (xra.m212791j() && (CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO.equals(str) || CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO.equals(str))) {
            arrayList.add(LoopInputType.PHOTO);
        } else if (CoreStaticData.ProfileFromType.FROM_EXPLORE.equals(str)) {
            arrayList.add(LoopInputType.PET_PHOTO);
        } else if (CoreStaticData.ProfileFromType.FROM_PROFILE_FRAG_EDIT.equals(str)) {
            arrayList.addAll(f34240n);
        } else if (xra.m212788g() && (loopCreateEntryType == LoopCreateEntryType.ENTRY_EDIT || loopCreateEntryType == LoopCreateEntryType.ENTRY_CARD_FACK_UP_DATA)) {
            m52657R(arrayList, f34234h, f34233g);
        } else if (xra.m212788g()) {
            arrayList.addAll(f34232f);
        } else if (user.profile.studies.active) {
            if (loopCreateEntryType == LoopCreateEntryType.ENTRY_EDIT) {
                arrayList.addAll(f34230d);
            } else {
                arrayList.addAll(f34235i);
            }
        } else if (loopCreateEntryType == LoopCreateEntryType.ENTRY_EDIT) {
            arrayList.addAll(f34228b);
        } else {
            arrayList.addAll(f34231e);
        }
        if (!IntlCountryCodeController.m29113j()) {
            arrayList.remove(LoopInputType.ETHNICITY);
            arrayList.remove(LoopInputType.LANGUAGE);
        }
        if (xra.m212788g()) {
            m52654O(arrayList);
        }
        if (xra.m212791j() && CoreStaticData.ProfileFromType.FROM_THIN_POPUP.equals(str) && user.pictures.size() < 2) {
            arrayList.add(LoopInputType.PHOTO);
        }
        if (loopCreateEntryType == LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT) {
            arrayList.clear();
            str.getClass();
            switch (str) {
                case "intl_profile_education_kit":
                    arrayList.addAll(f34248v);
                    break;
                case "intl_profile_about_kit":
                    arrayList.add(LoopInputType.SIGNATURE);
                    break;
                case "intl_profile_ethnicity_language_kit":
                    arrayList.addAll(f34251y);
                    break;
                case "intl_profile_job_kit":
                    if (user.profile.studies.active) {
                        arrayList.addAll(f34250x);
                        break;
                    } else {
                        arrayList.addAll(f34249w);
                        break;
                    }
                    break;
            }
        }
        if (xra.m212797p() && loopCreateEntryType == LoopCreateEntryType.ENTRY_SERIOUS_DIALOG) {
            arrayList.clear();
            arrayList.addAll(jyb.m147507f0(LoopInputType.QUALIFICATION, LoopInputType.HEIGHT, LoopInputType.INCOME, LoopInputType.CAR, LoopInputType.HOUSE));
        }
        if (xra.m212804w()) {
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
                arrayList.addAll(jyb.m147507f0(loopInputType2, loopInputType3, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8, loopInputType9, loopInputType10, loopInputType11, loopInputType12, loopInputType13, loopInputType14, loopInputType15, loopInputType16, LoopInputType.GAME_NAME, LoopInputType.GAME_TOGETHER, LoopInputType.GAME_LEVEL, LoopInputType.GAME_VOICE, LoopInputType.GROWTH_FOOD, LoopInputType.PET));
                if (!xra.m212787f()) {
                    arrayList.remove(loopInputType16);
                }
            } else if (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_CHAT_COMPLETE_PROFILE || loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_MYTAB_COMPLETE_PROFILE || loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_LEFT_SWIPE_COMPLETE_PROFILE) {
                arrayList.clear();
                arrayList.addAll(jyb.m147507f0(LoopInputType.PROFESSION, LoopInputType.QUALIFICATION, LoopInputType.HOMETOWN, LoopInputType.FRIEND_PURPOSE, LoopInputType.HEIGHT, LoopInputType.FITNESS, LoopInputType.DRINKING, LoopInputType.SMOKING, LoopInputType.SIGNATURE, LoopInputType.MY_LIFT));
            } else if (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE) {
                arrayList.clear();
                LoopInputType loopInputType17 = LoopInputType.SIGNATURE;
                LoopInputType loopInputType18 = LoopInputType.MY_LIFT;
                LoopInputType loopInputType19 = LoopInputType.MY_QUESTION;
                LoopInputType loopInputType20 = LoopInputType.GAME_CP;
                LoopInputType loopInputType21 = LoopInputType.PET;
                arrayList.addAll(jyb.m147507f0(loopInputType17, loopInputType18, loopInputType19, loopInputType20, loopInputType21, LoopInputType.MBTI_TEST));
                if (NullChecker.m82486a(user3.profile.extensions) && NullChecker.m82486a(user3.profile.extensions.wealth) && !jyb.m147479J(user3.profile.extensions.wealth.pet) && (TextUtils.equals(user3.profile.extensions.wealth.pet.get(0), "已有宠物") || TextUtils.equals(user3.profile.extensions.wealth.pet.get(0), CoreModule.f18263b.getString(R$string.f28738m2)))) {
                    arrayList.remove(loopInputType21);
                }
            }
        }
        LoopInputType loopInputType22 = LoopInputType.GAME_NAME;
        if (arrayList.indexOf(loopInputType22) != -1) {
            if (user3 == null) {
                user3 = user;
            }
            if (!m52649J(loopInputType22, user3, str)) {
                arrayList.removeAll(jyb.m147507f0(LoopInputType.GAME_TOGETHER, LoopInputType.GAME_LEVEL, LoopInputType.GAME_VOICE));
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
                arrayList.addAll(jyb.m147507f0(loopInputType23, LoopInputType.SIGNATURE, LoopInputType.VERIFICATION));
            } else {
                arrayList.addAll(jyb.m147507f0(LoopInputType.SIGNATURE, loopInputType23, LoopInputType.VERIFICATION));
            }
        }
        if (xra.m212787f() && (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_GUIDE || loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM || loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_IDEAL_OTHER_PROFILE_FEEDBACK)) {
            ArrayList arrayListM147507f0 = jyb.m147507f0(LoopInputType.QUALIFICATION, LoopInputType.SCHOOL_NEW, LoopInputType.PROFESSION, LoopInputType.HEIGHT, LoopInputType.FITNESS, LoopInputType.MY_LIFT, LoopInputType.SIGNATURE, LoopInputType.INCOME, LoopInputType.CAR, LoopInputType.HOUSE, LoopInputType.PET, LoopInputType.GAME_CP, LoopInputType.MBTI_TEST);
            if (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM && (pf60Var = tr90.f175825s) != null && !TextUtils.isEmpty(pf60Var.f152156a) && (idealInfo = tr90.f175825s.f152157b) != null) {
                ArrayList arrayListM147507f1 = jyb.m147507f0(new String[0]);
                Iterator<IdealProfile> it = idealInfo.idealProfiles.iterator();
                while (it.hasNext()) {
                    arrayListM147507f1.addAll(it.next().profiles);
                }
                final ArrayList arrayListM147486Q = jyb.m147486Q(arrayListM147507f1, new qcj() { // from class: l.k5w
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return tr90.m192427n((String) obj);
                    }
                });
                if (arrayListM147507f1.size() > 0) {
                    Objects.requireNonNull(arrayListM147486Q);
                    arrayListM147507f0 = jyb.m147522n(arrayListM147507f0, new qcj() { // from class: l.m5w
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(arrayListM147486Q.contains((LoopInputType) obj));
                        }
                    });
                }
            }
            arrayList.clear();
            arrayList.addAll(arrayListM147507f0);
        }
        if (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_CARD_GUIDE_IMPROVE_PROFILE) {
            arrayList.clear();
            LoopInputType loopInputType24 = LoopInputType.FITNESS;
            if (loopInputType == loopInputType24) {
                arrayList.addAll(jyb.m147507f0(loopInputType24));
            } else {
                LoopInputType loopInputType25 = LoopInputType.DRINKING;
                if (loopInputType == loopInputType25) {
                    arrayList.addAll(jyb.m147507f0(loopInputType25));
                } else {
                    LoopInputType loopInputType26 = LoopInputType.SMOKING;
                    if (loopInputType == loopInputType26) {
                        arrayList.addAll(jyb.m147507f0(loopInputType26));
                    } else {
                        LoopInputType loopInputType27 = LoopInputType.GAME_NAME;
                        if (loopInputType == loopInputType27) {
                            arrayList.addAll(jyb.m147507f0(loopInputType27, LoopInputType.GAME_TOGETHER));
                        }
                    }
                }
            }
        }
        ArrayList<LoopInputType> arrayList2 = new ArrayList<>();
        int iM147476G = jyb.m147476G(arrayList, new qcj() { // from class: l.n5w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LoopInputType) obj) == loopInputType);
            }
        });
        int i = iM147476G >= 0 ? iM147476G : 0;
        if (NullChecker.m82486a(loopInputType)) {
            arrayList2.add(loopInputType);
        }
        for (int i2 = i; i2 < arrayList.size() + i; i2++) {
            LoopInputType loopInputType28 = (LoopInputType) arrayList.get(i2 % arrayList.size());
            if (loopInputType28 != loopInputType && (!m52649J(loopInputType28, user, str) || ((loopInputType28 == LoopInputType.INDUSTRY && !z) || ((loopInputType28 == LoopInputType.PET && loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE) || (loopInputType28 == LoopInputType.PROFESSION && !z && xra.m212788g()))))) {
                arrayList2.add(loopInputType28);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: D */
    public static CategorySuggestions m52643D() {
        return gta.m132210e().m132214d().mo34723Mk();
    }

    /* JADX INFO: renamed from: E */
    public static void m52644E(LoopInputType loopInputType, Frag frag, User user, int i) {
        LoopEditInfo loopEditInfoM52677o = m52677o(loopInputType, user, frag.getContext());
        loopEditInfoM52677o.maxInput = i;
        frag.startActivityForResult(ProfileLoopCreateTagAct.m52821c2(loopEditInfoM52677o, frag.getContext()), loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: F */
    public static void m52645F(String str, Fragment fragment, User user) {
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
        LoopEditInfo loopEditInfoM52677o = m52677o(loopInputType, user, fragment.getContext());
        loopEditInfoM52677o.setMultiType(str);
        fragment.startActivityForResult(ProfileLoopMultiSelectAct.m52836Z1(loopEditInfoM52677o, fragment.getContext()), loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: G */
    public static void m52646G(Frag frag) {
        frag.startActivityForResult(ProfileLoopSchoolHideAct.m52849b2(frag.getContext()), LoopInputType.HIDDEN_SCHOOL.requestCode);
    }

    /* JADX INFO: renamed from: H */
    public static void m52647H(Frag frag, LoopInputType loopInputType) {
        Intent intentM52843a2 = ProfileLoopQuestionAct.m52843a2(frag.getContext());
        intentM52843a2.putExtra("loop_create_tag_info", loopInputType);
        frag.startActivityForResult(intentM52843a2, loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: I */
    public static void m52648I(User user, Act act, LoopInputType loopInputType) {
        Intent intentM52843a2 = ProfileLoopQuestionAct.m52843a2(act);
        intentM52843a2.putExtra("loop_create_tag_info", loopInputType);
        intentM52843a2.putExtra("loop_edit_user", user);
        act.startActivityForResult(intentM52843a2, loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m52649J(LoopInputType loopInputType, User user, String str) {
        return m52650K(loopInputType, user, str, m52651L(str));
    }

    /* JADX INFO: renamed from: K */
    public static boolean m52650K(LoopInputType loopInputType, User user, String str, boolean z) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        boolean z2 = (NullChecker.m82486a(userM116600p9.settings) && NullChecker.m82487b(userM116600p9.settings.verification) && NullChecker.m82487b(userM116600p9.settings.verification.studies) && TEnum.equals(userM116600p9.settings.verification.studies.status, "pending")) ? false : true;
        String str2 = "";
        switch (C8833a.f34252a[loopInputType.ordinal()]) {
            case 1:
                return !TextUtils.isEmpty(user.profile.hangouts);
            case 2:
                VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
                return verificationCenterM32615k4 != null && (TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending"));
            case 3:
                return !TextUtils.isEmpty(user.description);
            case 4:
                return !jyb.m147479J(user.profile.extensions.basic.friendPurpose);
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
                    String string = CoreModule.f18263b.getString(R$string.f28621R2);
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
                return m52673k(user);
            case 13:
            case 14:
                return true;
            case 15:
                if (jyb.m147479J(user.profile.extensions.physical.height) || TextUtils.isEmpty(user.profile.extensions.physical.height.get(0))) {
                    return false;
                }
                return (z && TextUtils.equals(user.profile.extensions.physical.height.get(0), CoreModule.f18263b.getString(R$string.f28732l2))) ? false : true;
            case 16:
                return (!NullChecker.m82486a(user.profile.studies) || TEnum.equals(user.profile.studies.qualification, "unknown_") || TEnum.equals(user.profile.studies.qualification, QualificationType.NO_QUALIFICATION)) ? false : true;
            case 17:
                UserWealth userWealth = user.profile.extensions.wealth;
                if (userWealth != null && !jyb.m147479J(userWealth.car)) {
                    str2 = user.profile.extensions.wealth.car.get(0);
                }
                if (FriendPurposeHelper.m60614i(str2)) {
                    return (z && !jyb.m147479J(user.profile.extensions.wealth.car) && TextUtils.equals(user.profile.extensions.wealth.car.get(0), CoreModule.f18263b.getString(R$string.f28732l2))) ? false : true;
                }
                return false;
            case 18:
                if (NullChecker.m82486a(user.profile.extensions.wealth) && !jyb.m147479J(user.profile.extensions.wealth.pet)) {
                    str2 = user.profile.extensions.wealth.pet.get(0);
                }
                if (FriendPurposeHelper.m60617l(str2)) {
                    return (z && !jyb.m147479J(user.profile.extensions.wealth.pet) && TextUtils.equals(user.profile.extensions.wealth.pet.get(0), CoreModule.f18263b.getString(R$string.f28732l2))) ? false : true;
                }
                return false;
            case 19:
                if (NullChecker.m82486a(user.profile.extensions.wealth) && !jyb.m147479J(user.profile.extensions.wealth.house)) {
                    str2 = user.profile.extensions.wealth.house.get(0);
                }
                if (FriendPurposeHelper.m60615j(str2)) {
                    return (z && !jyb.m147479J(user.profile.extensions.wealth.house) && TextUtils.equals(user.profile.extensions.wealth.house.get(0), CoreModule.f18263b.getString(R$string.f28732l2))) ? false : true;
                }
                return false;
            case 20:
                if (NullChecker.m82486a(user.profile.extensions.wealth)) {
                    UserWealth userWealth2 = user.profile.extensions.wealth;
                    if (FriendPurposeHelper.m60616k(userWealth2.upperIncome, userWealth2.lowIncome)) {
                        return (z && !jyb.m147479J(user.profile.extensions.wealth.lowIncome) && TextUtils.equals(user.profile.extensions.wealth.lowIncome.get(0), CoreModule.f18263b.getString(R$string.f28732l2))) ? false : true;
                    }
                }
                return false;
            case 21:
                return NullChecker.m82486a(user.profile.extensions.interest) && !jyb.m147479J(user.profile.extensions.interest.tags);
            case 22:
                return !jyb.m147479J(d63.m114365a(CoreModule.m30929H().userId()));
            case 23:
                return !jyb.m147479J(user.profile.extensions.basic.ethnicity);
            case 24:
                return !jyb.m147479J(user.profile.extensions.basic.language);
            case 25:
                return NullChecker.m82486a(user.profile.extensions.game) && td8.m190611u0(user.profile.extensions.game.name);
            case 26:
                return NullChecker.m82486a(user.profile.extensions.game) && td8.m190611u0(user.profile.extensions.game.together);
            case 27:
                return NullChecker.m82486a(user.profile.extensions.game) && td8.m190611u0(user.profile.extensions.game.level);
            case 28:
                return NullChecker.m82486a(user.profile.extensions.game) && td8.m190611u0(user.profile.extensions.game.voice);
            case 29:
                if (!NullChecker.m82486a(user.profile.extensions.physical) || jyb.m147479J(user.profile.extensions.physical.fitness) || TextUtils.isEmpty(user.profile.extensions.physical.fitness.get(0))) {
                    return false;
                }
                return (z && TextUtils.equals(user.profile.extensions.physical.fitness.get(0), FriendPurposeHelper.FitnessType.not_reveal.toString())) ? false : true;
            case 30:
                if (!NullChecker.m82486a(user.profile.extensions.physical) || jyb.m147479J(user.profile.extensions.physical.drink) || TextUtils.isEmpty(user.profile.extensions.physical.drink.get(0))) {
                    return false;
                }
                return (z && TextUtils.equals(FriendPurposeHelper.DrinkType.getDes(user.profile.extensions.physical.drink.get(0)), CoreModule.f18263b.getString(R$string.f28732l2))) ? false : true;
            case 31:
                if (!NullChecker.m82486a(user.profile.extensions.physical) || jyb.m147479J(user.profile.extensions.physical.smoke) || TextUtils.isEmpty(user.profile.extensions.physical.smoke.get(0))) {
                    return false;
                }
                return (z && TextUtils.equals(FriendPurposeHelper.SmokeType.getDes(user.profile.extensions.physical.smoke.get(0)), CoreModule.f18263b.getString(R$string.f28732l2))) ? false : true;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                if (!m52651L(str) || m52652M(str)) {
                    return user.pictures.size() >= 3;
                }
                return user.pictures.size() == 9;
            case 37:
                return !jyb.m147479J(user.profile.answers);
            case 38:
                return tr90.m192432t(CoreModule.f18264c.f20381e0.m116593na());
            case 39:
                return NullChecker.m82486a(user.profile.extensions.game) && !jyb.m147479J(user.profile.extensions.game.screenshot);
            case 40:
                return tr90.m192430r(user);
            case 41:
                return NullChecker.m82486a(user.profile.extensions.interest) && td8.m190611u0(user.profile.extensions.interest.taste);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: L */
    public static boolean m52651L(String str) {
        return TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG) || m52652M(str);
    }

    /* JADX INFO: renamed from: M */
    public static boolean m52652M(String str) {
        return TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_PROFILE_ITEM);
    }

    /* JADX INFO: renamed from: N */
    public static boolean m52653N(int i, User user, Intent intent) {
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
        if (!NullChecker.m82486a(loopEditInfo)) {
            return false;
        }
        String str = loopEditInfo.editObjKey;
        if (TextUtils.isEmpty(str) || jyb.m147479J(user.profile.answers)) {
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
        if (!NullChecker.m82486a(next)) {
            return false;
        }
        if (jyb.m147481L(stringExtra)) {
            user.profile.answers.remove(next);
        } else {
            next.value = stringExtra;
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public static void m52654O(ArrayList<LoopInputType> arrayList) {
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
    public static void m52655P(User user, String str) {
        if (!xra.m212788g()) {
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
    public static List<String> m52656Q(List<String> list) {
        Collator collator = Collator.getInstance(Locale.getDefault());
        collator.setStrength(0);
        Collections.sort(list, collator);
        for (final String str : Lists.m15984q(jyb.m147487R(CoreModule.f18263b.getString(R$string.f28750o2).split(Constants.SEPARATOR_COMMA), new qcj() { // from class: l.q5w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((String) obj).trim();
            }
        }))) {
            int iM147476G = jyb.m147476G(list, new qcj() { // from class: l.r5w
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).toLowerCase().equals(str));
                }
            });
            if (iM147476G > 0) {
                String str2 = list.get(iM147476G);
                list.remove(iM147476G);
                list.add(0, str2);
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: R */
    public static void m52657R(ArrayList<LoopInputType> arrayList, ArrayList<LoopInputType> arrayList2, ArrayList<LoopInputType> arrayList3) {
        if (xra.m212802u()) {
            arrayList.addAll(arrayList2);
        } else {
            arrayList.addAll(arrayList3);
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m52658S(User user, Frag frag, LoopInputType loopInputType) {
        m52659T(user, frag, loopInputType, LoopCreateEntryType.ENTRY_EDIT);
    }

    /* JADX INFO: renamed from: T */
    public static void m52659T(User user, Frag frag, LoopInputType loopInputType, LoopCreateEntryType loopCreateEntryType) {
        m52660U(user, frag, loopInputType, loopCreateEntryType, "");
    }

    /* JADX INFO: renamed from: U */
    public static void m52660U(User user, Frag frag, LoopInputType loopInputType, LoopCreateEntryType loopCreateEntryType, String str) {
        m52661V(user, frag, loopInputType, loopCreateEntryType, str, true);
    }

    /* JADX INFO: renamed from: V */
    public static void m52661V(User user, Frag frag, LoopInputType loopInputType, LoopCreateEntryType loopCreateEntryType, String str, boolean z) {
        m52662W(user, frag, loopInputType, loopCreateEntryType, str, z, null);
    }

    /* JADX INFO: renamed from: W */
    public static void m52662W(User user, Frag frag, LoopInputType loopInputType, LoopCreateEntryType loopCreateEntryType, String str, boolean z, C4468a.a aVar) {
        Intent intentM52690Z1 = ProfileInfoLoopEditAct.m52690Z1(frag.getContext(), loopCreateEntryType, loopInputType, user, str);
        gta.m132210e().m132214d().mo34891no(user.profile.studies.active);
        if (NullChecker.m82486a(aVar)) {
            frag.m21600u4(3500, intentM52690Z1, aVar);
        } else {
            frag.startActivityForResult(intentM52690Z1, 3500);
        }
        if (z) {
            frag.getActivity().overridePendingTransition(z7c0.f203239h, z7c0.f203234c);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m52672j(Act act) {
        if (gta.m132210e().m132214d().mo34760Uc().profile.studies.active) {
            gta.m132210e().m132214d().mo34876kl();
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m52673k(User user) {
        if (!TextUtils.isEmpty(user.profile.hometown)) {
            return true;
        }
        if (!jyb.m147479J(user.profile.extensions.basic.country) && !TextUtils.isEmpty(user.profile.extensions.basic.country.get(0))) {
            return true;
        }
        if (jyb.m147479J(user.profile.extensions.basic.province) || TextUtils.isEmpty(user.profile.extensions.basic.province.get(0))) {
            return (jyb.m147479J(user.profile.extensions.basic.city) || TextUtils.isEmpty(user.profile.extensions.basic.city.get(0))) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static void m52674l(User user, LoopInputType loopInputType, String str, String str2, int i) {
        int i2 = C8833a.f34252a[loopInputType.ordinal()];
        if (i2 == 4) {
            user.profile.extensions.basic.friendPurpose = gta.m132210e().m132214d().mo34890nn(str2);
            return;
        }
        if (i2 == 20) {
            Pair<List<String>, List<String>> pairMo34754T8 = gta.m132210e().m132214d().mo34754T8(str2);
            if (!NullChecker.m82486a(user.profile.extensions.wealth)) {
                user.profile.extensions.wealth = UserWealth.new_();
            }
            UserWealth userWealth = user.profile.extensions.wealth;
            userWealth.lowIncome = (List) pairMo34754T8.first;
            userWealth.upperIncome = (List) pairMo34754T8.second;
            return;
        }
        switch (i2) {
            case 6:
                if (NullChecker.m82486a(m52643D())) {
                    if (!TextUtils.equals(m52643D().industry.get(0), str2)) {
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
                m52655P(user, str2);
                break;
            case 13:
                user.name = str2;
                break;
            default:
                switch (i2) {
                    case 16:
                        user.profile.studies.qualification = gta.m132210e().m132214d().mo34705Ik(str2);
                        break;
                    case 17:
                        if (!NullChecker.m82486a(user.profile.extensions.wealth)) {
                            user.profile.extensions.wealth = UserWealth.new_();
                        }
                        user.profile.extensions.wealth.car = gta.m132210e().m132214d().mo34828fa(str2);
                        break;
                    case 18:
                        if (!NullChecker.m82486a(user.profile.extensions.wealth)) {
                            user.profile.extensions.wealth = UserWealth.new_();
                        }
                        user.profile.extensions.wealth.pet = gta.m132210e().m132214d().mo34740Os(str2);
                        break;
                    default:
                        switch (i2) {
                            case 28:
                                user.profile.extensions.game.voice = jyb.m147507f0(str2);
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
    public static void m52675m(User user, LoopInputType loopInputType, List<String> list) {
        int i = C8833a.f34252a[loopInputType.ordinal()];
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
    public static ArrayList<LoopSelectFillData> m52676n(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (NullChecker.m82486a(m52643D())) {
            List<String> list = m52643D().department.get(user.profile.work.industry) == null ? m52643D().department.get("general") : m52643D().department.get(user.profile.work.industry);
            if (!jyb.m147479J(list)) {
                arrayList.add(new LoopSelectFillData(CoreModule.f18263b.getString(R$string.f28641V2), LoopSelectFillData.LoopSelectType.INPUT_ENTRY));
                String str = user.profile.work.department;
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(new LoopSelectFillData(str).m52766i(true));
                }
                for (String str2 : list) {
                    if (!TextUtils.equals(str, str2)) {
                        LoopSelectFillData loopSelectFillData = new LoopSelectFillData(str2);
                        arrayList.add(loopSelectFillData);
                        if (TextUtils.equals(str2, user.profile.work.department)) {
                            loopSelectFillData.m52766i(true);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static LoopEditInfo m52677o(LoopInputType loopInputType, User user, Context context) {
        if (loopInputType == LoopInputType.ABOUT_ME) {
            return xra.m212799r() ? LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 100, context.getString(R$string.f28682d0)).setEmptyInput(true) : LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 500, gta.m132210e().m132214d().mo34937uj()).setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.COMPANY) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f28561F2)).setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.MAJOR) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f28596M2)).setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.SCHOOL) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f28611P2)).setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.NICKNAME) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 50, context.getString(R$string.f28798w2));
        }
        if (loopInputType == LoopInputType.INDUSTRY) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f28780t2)).setEmptyInput(false);
        }
        if (loopInputType == LoopInputType.HANGOUTS) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f28576I2)).setEmptyInput(true).setDefaultContent(user.profile.hangouts);
        }
        LoopInputType loopInputType2 = LoopInputType.PERSONALITY;
        if (loopInputType == loopInputType2) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f28804x2));
        }
        if (loopInputType == loopInputType2 || loopInputType == LoopInputType.SPORTS || loopInputType == LoopInputType.MUSIC || loopInputType == LoopInputType.LITERATURE || loopInputType == LoopInputType.MOVIES || loopInputType == LoopInputType.FOOD || loopInputType == LoopInputType.PLACES) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f28786u2));
        }
        if (loopInputType == LoopInputType.DEPARTMENT) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f28792v2)).setEmptyInput(false);
        }
        if (loopInputType == LoopInputType.HOMETOWN) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f28774s2)).setEmptyInput(false);
        }
        if (loopInputType == LoopInputType.SIGNATURE) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 500, context.getString(R$string.f28721j3)).setEmptyInput(true);
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
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R$string.f28804x2));
        }
        LoopEditInfo emptyInput = LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 100, "我不希望你...").setEmptyInput(true);
        emptyInput.subTitle = "关于交友，我不希望你...";
        return emptyInput;
    }

    /* JADX INFO: renamed from: p */
    public static ArrayList<LoopSelectFillData> m52678p(LoopInputType loopInputType, User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (loopInputType == LoopInputType.INDUSTRY) {
            return m52686x(user);
        }
        if (loopInputType == LoopInputType.DEPARTMENT) {
            return m52676n(user);
        }
        if (loopInputType == LoopInputType.HOMETOWN) {
            return xra.m212788g() ? m52685w(user) : m52684v(user);
        }
        if (loopInputType == LoopInputType.FRIEND_PURPOSE) {
            return FriendPurposeHelper.m60609d(user);
        }
        if (loopInputType == LoopInputType.QUALIFICATION) {
            return FriendPurposeHelper.m60612g(user);
        }
        if (loopInputType == LoopInputType.INCOME) {
            return FriendPurposeHelper.m60610e(user);
        }
        if (loopInputType == LoopInputType.CAR) {
            return FriendPurposeHelper.m60606a(user);
        }
        if (loopInputType == LoopInputType.PET) {
            return FriendPurposeHelper.m60611f(user);
        }
        if (loopInputType == LoopInputType.PERSONALITY || loopInputType == LoopInputType.SPORTS || loopInputType == LoopInputType.MUSIC || loopInputType == LoopInputType.LITERATURE || loopInputType == LoopInputType.MOVIES || loopInputType == LoopInputType.FOOD || loopInputType == LoopInputType.PLACES) {
            return m52687y(loopInputType, user);
        }
        if (loopInputType == LoopInputType.GAME_VOICE) {
            return m52681s(user);
        }
        if (loopInputType == LoopInputType.GAME_NAME) {
            return m52679q(user);
        }
        if (loopInputType == LoopInputType.GAME_TOGETHER) {
            return m52680r(user);
        }
        if (loopInputType == LoopInputType.FITNESS) {
            return FriendPurposeHelper.m60608c(user);
        }
        if (loopInputType == LoopInputType.DRINKING) {
            return FriendPurposeHelper.m60607b(user);
        }
        if (loopInputType == LoopInputType.SMOKING) {
            return FriendPurposeHelper.m60613h(user);
        }
        return loopInputType == LoopInputType.GROWTH_FOOD ? m52682t(user) : arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static ArrayList<LoopSelectFillData> m52679q(User user) {
        ExtensionGame extensionGame = user.profile.extensions.game;
        final List arrayList = extensionGame == null ? new ArrayList() : extensionGame.name;
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        ArrayList arrayListM147507f0 = jyb.m147507f0(new LoopSelectFillData("王者荣耀", loopSelectType), new LoopSelectFillData("和平精英", loopSelectType), new LoopSelectFillData("蛋仔派对", loopSelectType), new LoopSelectFillData("原神", loopSelectType), new LoopSelectFillData("第五人格", loopSelectType), new LoopSelectFillData("英雄联盟", loopSelectType), new LoopSelectFillData("金铲铲之战", loopSelectType), new LoopSelectFillData("狼人杀", loopSelectType));
        jyb.m147537z(arrayListM147507f0, new y20() { // from class: l.o5w
            @Override // p153l.y20
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m52766i(arrayList.contains(loopSelectFillData.m52758a()));
            }
        });
        return new ArrayList<>(arrayListM147507f0);
    }

    /* JADX INFO: renamed from: r */
    public static ArrayList<LoopSelectFillData> m52680r(User user) {
        ExtensionGame extensionGame = user.profile.extensions.game;
        final List arrayList = extensionGame == null ? new ArrayList() : extensionGame.together;
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        ArrayList arrayListM147507f0 = jyb.m147507f0(new LoopSelectFillData("组队", loopSelectType), new LoopSelectFillData("cpdd", loopSelectType), new LoopSelectFillData("求大佬", loopSelectType), new LoopSelectFillData("找战队", loopSelectType), new LoopSelectFillData("其他", loopSelectType));
        jyb.m147537z(arrayListM147507f0, new y20() { // from class: l.s5w
            @Override // p153l.y20
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m52766i(arrayList.contains(loopSelectFillData.m52758a()));
            }
        });
        return new ArrayList<>(arrayListM147507f0);
    }

    /* JADX INFO: renamed from: s */
    public static ArrayList<LoopSelectFillData> m52681s(User user) {
        ExtensionGame extensionGame = user.profile.extensions.game;
        final List arrayList = extensionGame == null ? new ArrayList() : extensionGame.voice;
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        ArrayList arrayListM147507f0 = jyb.m147507f0(new LoopSelectFillData("可以开麦", loopSelectType), new LoopSelectFillData("不开麦", loopSelectType));
        jyb.m147537z(arrayListM147507f0, new y20() { // from class: l.l5w
            @Override // p153l.y20
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m52766i(TextUtils.equals((CharSequence) td8.m190610t0(arrayList), loopSelectFillData.m52758a()));
            }
        });
        return new ArrayList<>(arrayListM147507f0);
    }

    /* JADX INFO: renamed from: t */
    public static ArrayList<LoopSelectFillData> m52682t(User user) {
        final List arrayList = user.profile.extensions.interest.taste;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        ArrayList arrayListM147507f0 = jyb.m147507f0(new LoopSelectFillData("boldFlavorLover", "重口味爱好者", loopSelectType), new LoopSelectFillData("mildFlavorFan", "清淡饮食", loopSelectType), new LoopSelectFillData("exoticFlavorLover", "异域风情品鉴家", loopSelectType), new LoopSelectFillData("chineseFoodLover", "中华料理狂热者", loopSelectType), new LoopSelectFillData("meatLover", "肉食主义", loopSelectType), new LoopSelectFillData("vegetarian", "素食主义", loopSelectType));
        jyb.m147537z(arrayListM147507f0, new y20() { // from class: l.p5w
            @Override // p153l.y20
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m52766i(arrayList.contains(loopSelectFillData.m52759b()));
            }
        });
        return new ArrayList<>(arrayListM147507f0);
    }

    /* JADX INFO: renamed from: u */
    public static HometownSuggest m52683u() {
        return gta.m132210e().m132214d().mo34726N6();
    }

    /* JADX INFO: renamed from: v */
    public static ArrayList<LoopSelectFillData> m52684v(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (NullChecker.m82486a(m52643D())) {
            List<String> listM52656Q = m52656Q(jyb.m147473D(m52643D().hometown));
            if (!jyb.m147479J(listM52656Q)) {
                arrayList.add(new LoopSelectFillData(CoreModule.f18263b.getString(R$string.f28641V2), LoopSelectFillData.LoopSelectType.INPUT_ENTRY));
                String str = user.profile.hometown;
                if (!TextUtils.isEmpty(str)) {
                    LoopSelectFillData loopSelectFillData = new LoopSelectFillData(str);
                    loopSelectFillData.m52766i(true);
                    arrayList.add(loopSelectFillData);
                }
                for (String str2 : listM52656Q) {
                    if (!TextUtils.equals(str2, str)) {
                        LoopSelectFillData loopSelectFillData2 = new LoopSelectFillData(str2);
                        if (!jyb.m147479J(m52643D().hometown.get(str2))) {
                            loopSelectFillData2.m52767j();
                        }
                        arrayList.add(loopSelectFillData2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public static ArrayList<LoopSelectFillData> m52685w(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (NullChecker.m82486a(m52683u())) {
            String strMo34728Nb = xra.m212788g() ? gta.m132210e().m132214d().mo34728Nb(user.profile) : "";
            if (TextUtils.isEmpty(strMo34728Nb)) {
                strMo34728Nb = user.profile.hometown;
            }
            if (!TextUtils.isEmpty(strMo34728Nb)) {
                LoopSelectFillData loopSelectFillData = new LoopSelectFillData(strMo34728Nb);
                loopSelectFillData.m52766i(true);
                arrayList.add(loopSelectFillData);
            }
            List<HometownChinaItem> list = m52683u().china;
            for (int i = 0; i < list.size(); i++) {
                HometownChinaItem hometownChinaItem = list.get(i);
                if (!TextUtils.equals(hometownChinaItem.region, strMo34728Nb)) {
                    LoopSelectFillData loopSelectFillData2 = new LoopSelectFillData(hometownChinaItem.region);
                    if (!jyb.m147479J(hometownChinaItem.subRegion)) {
                        loopSelectFillData2.m52767j();
                    }
                    arrayList.add(loopSelectFillData2);
                }
            }
            LoopSelectFillData loopSelectFillData3 = new LoopSelectFillData(CoreModule.f18263b.getString(R$string.f28659Z0), LoopSelectFillData.LoopSelectType.SELECT_OVERSEAS);
            loopSelectFillData3.m52766i(false);
            loopSelectFillData3.m52767j();
            arrayList.add(loopSelectFillData3);
            String string = CoreModule.f18263b.getString(R$string.f28621R2);
            if (!TextUtils.equals(strMo34728Nb, string)) {
                LoopSelectFillData loopSelectFillData4 = new LoopSelectFillData(string, LoopSelectFillData.LoopSelectType.SELECT_OTHER);
                loopSelectFillData4.m52766i(false);
                arrayList.add(loopSelectFillData4);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static ArrayList<LoopSelectFillData> m52686x(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (NullChecker.m82486a(m52643D()) && !jyb.m147479J(m52643D().industry)) {
            String str = m52643D().industry.get(0);
            Profile profile = user.profile;
            String str2 = profile.studies.active ? str : profile.work.industry;
            arrayList.add(new LoopSelectFillData(CoreModule.f18263b.getString(R$string.f28641V2), LoopSelectFillData.LoopSelectType.INPUT_ENTRY));
            if (!TextUtils.isEmpty(str2)) {
                LoopSelectFillData loopSelectFillData = new LoopSelectFillData(str2);
                loopSelectFillData.m52766i(true);
                arrayList.add(loopSelectFillData);
            }
            for (String str3 : m52643D().industry) {
                if (!TextUtils.equals(str3, str2)) {
                    LoopSelectFillData loopSelectFillData2 = new LoopSelectFillData(str3);
                    arrayList.add(loopSelectFillData2);
                    if (TextUtils.equals(str, str3) && user.profile.studies.active) {
                        loopSelectFillData2.m52766i(true);
                    } else {
                        Profile profile2 = user.profile;
                        Work work = profile2.work;
                        if (work.active && !profile2.studies.active && TextUtils.equals(work.industry, str3)) {
                            loopSelectFillData2.m52766i(true);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static ArrayList<LoopSelectFillData> m52687y(final LoopInputType loopInputType, User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (!NullChecker.m82486a(m52643D())) {
            return arrayList;
        }
        ArrayList arrayListM147522n = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.t5w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Tag) obj).category.equals(loopInputType.tagKey));
            }
        });
        ArrayList arrayList2 = arrayListM147522n == null ? new ArrayList() : jyb.m147486Q(arrayListM147522n, new qcj() { // from class: l.u5w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Tag) obj).value;
            }
        });
        ArrayList arrayList3 = new ArrayList();
        if (loopInputType == LoopInputType.PERSONALITY) {
            arrayList3 = new ArrayList(m52643D().personality);
        } else if (loopInputType == LoopInputType.SPORTS) {
            arrayList3 = new ArrayList(m52643D().sports);
        } else if (loopInputType == LoopInputType.MUSIC) {
            arrayList3 = new ArrayList(m52643D().music);
        } else if (loopInputType == LoopInputType.LITERATURE) {
            arrayList3 = new ArrayList(m52643D().literature);
        } else if (loopInputType == LoopInputType.MOVIES) {
            arrayList3 = new ArrayList(m52643D().movies);
        } else if (loopInputType == LoopInputType.FOOD) {
            arrayList3 = new ArrayList(m52643D().food);
        } else if (loopInputType == LoopInputType.PLACES) {
            arrayList3 = new ArrayList(m52643D().places);
        }
        arrayList3.removeAll(arrayList2);
        if (!jyb.m147479J(arrayList2)) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                LoopSelectFillData loopSelectFillData = new LoopSelectFillData((String) it.next());
                loopSelectFillData.m52766i(true).m52764g();
                arrayList.add(loopSelectFillData);
            }
        }
        if (!jyb.m147479J(arrayList3)) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                LoopSelectFillData loopSelectFillData2 = new LoopSelectFillData((String) it2.next());
                loopSelectFillData2.m52766i(false).m52764g();
                arrayList.add(loopSelectFillData2);
            }
        }
        arrayList.add(0, new LoopSelectFillData(CoreModule.f18263b.getString(R$string.f28641V2), LoopSelectFillData.LoopSelectType.INPUT_ENTRY));
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public static ArrayList<LoopInputType> m52688z(LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user) {
        return m52640A(loopCreateEntryType, loopInputType, user, true, true);
    }
}
