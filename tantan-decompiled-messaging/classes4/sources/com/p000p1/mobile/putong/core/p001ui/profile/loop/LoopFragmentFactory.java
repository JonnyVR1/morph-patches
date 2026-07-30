package com.p000p1.mobile.putong.core.p001ui.profile.loop;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.google.common.collect.Lists;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.LoopSelectFillData;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopMultiSelectAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopQuestionAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopSchoolHideAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CategorySuggestions;
import com.p1.mobile.putong.core.data.HometownChinaItem;
import com.p1.mobile.putong.core.data.HometownSuggest;
import com.p1.mobile.putong.core.data.IdealInfo;
import com.p1.mobile.putong.core.data.IdealProfile;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.ExtensionGame;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Physical;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import com.p1.mobile.putong.data.Work;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import l.e30;
import l.j760;
import l.lqa;
import l.pc8;
import l.pj90;
import l.tzb0;
import l.ura;
import l.vwb;
import l.w9j;
import p002l.n53;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LoopFragmentFactory {

    /* JADX INFO: renamed from: a */
    public static final ArrayList<LoopInputType> f1201a;

    /* JADX INFO: renamed from: b */
    public static final ArrayList<LoopInputType> f1202b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList<LoopInputType> f1203c;

    /* JADX INFO: renamed from: d */
    public static final ArrayList<LoopInputType> f1204d;

    /* JADX INFO: renamed from: e */
    public static final ArrayList<LoopInputType> f1205e;

    /* JADX INFO: renamed from: f */
    public static final ArrayList<LoopInputType> f1206f;

    /* JADX INFO: renamed from: g */
    public static final ArrayList<LoopInputType> f1207g;

    /* JADX INFO: renamed from: h */
    public static final ArrayList<LoopInputType> f1208h;

    /* JADX INFO: renamed from: i */
    public static final ArrayList<LoopInputType> f1209i;

    /* JADX INFO: renamed from: j */
    public static final ArrayList<LoopInputType> f1210j;

    /* JADX INFO: renamed from: k */
    public static final ArrayList<LoopInputType> f1211k;

    /* JADX INFO: renamed from: l */
    public static final ArrayList<LoopInputType> f1212l;

    /* JADX INFO: renamed from: m */
    public static final ArrayList<LoopInputType> f1213m;

    /* JADX INFO: renamed from: n */
    public static ArrayList<LoopInputType> f1214n;

    /* JADX INFO: renamed from: o */
    public static final ArrayList<LoopInputType> f1215o;

    /* JADX INFO: renamed from: p */
    public static final ArrayList<LoopInputType> f1216p;

    /* JADX INFO: renamed from: q */
    public static final ArrayList<LoopInputType> f1217q;

    /* JADX INFO: renamed from: r */
    public static final ArrayList<LoopInputType> f1218r;

    /* JADX INFO: renamed from: s */
    public static final ArrayList<LoopInputType> f1219s;

    /* JADX INFO: renamed from: t */
    public static final ArrayList<LoopInputType> f1220t;

    /* JADX INFO: renamed from: u */
    public static final ArrayList<LoopInputType> f1221u;

    /* JADX INFO: renamed from: v */
    public static final ArrayList<LoopInputType> f1222v;

    /* JADX INFO: renamed from: w */
    public static final ArrayList<LoopInputType> f1223w;

    /* JADX INFO: renamed from: x */
    public static final ArrayList<LoopInputType> f1224x;

    /* JADX INFO: renamed from: y */
    public static final ArrayList<LoopInputType> f1225y;

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
    public static /* synthetic */ class C0095a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1226a;

        static {
            int[] iArr = new int[LoopInputType.values().length];
            f1226a = iArr;
            try {
                iArr[LoopInputType.HANGOUTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1226a[LoopInputType.VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1226a[LoopInputType.SIGNATURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1226a[LoopInputType.FRIEND_PURPOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1226a[LoopInputType.PROFESSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1226a[LoopInputType.INDUSTRY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1226a[LoopInputType.DEPARTMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1226a[LoopInputType.COMPANY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1226a[LoopInputType.MAJOR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1226a[LoopInputType.SCHOOL_NEW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1226a[LoopInputType.SCHOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1226a[LoopInputType.HOMETOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1226a[LoopInputType.NICKNAME.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1226a[LoopInputType.BIRTHDAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1226a[LoopInputType.HEIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1226a[LoopInputType.QUALIFICATION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1226a[LoopInputType.CAR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f1226a[LoopInputType.PET.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f1226a[LoopInputType.HOUSE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f1226a[LoopInputType.INCOME.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f1226a[LoopInputType.NEW_TAG.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f1226a[LoopInputType.ARTWORK.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f1226a[LoopInputType.ETHNICITY.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f1226a[LoopInputType.LANGUAGE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f1226a[LoopInputType.GAME_NAME.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f1226a[LoopInputType.GAME_TOGETHER.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f1226a[LoopInputType.GAME_LEVEL.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f1226a[LoopInputType.GAME_VOICE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f1226a[LoopInputType.FITNESS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f1226a[LoopInputType.DRINKING.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f1226a[LoopInputType.SMOKING.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f1226a[LoopInputType.MY_LIFT.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f1226a[LoopInputType.TAG_MATCH_PIC.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f1226a[LoopInputType.PIC_MATCH_TAG.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f1226a[LoopInputType.GUIDE_UPLOAD_PIC_AND_TAG.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f1226a[LoopInputType.MY_LIFE_SEE_MYSELF.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f1226a[LoopInputType.MY_QUESTION.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f1226a[LoopInputType.MBTI_TEST.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f1226a[LoopInputType.GAME_CP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f1226a[LoopInputType.DO_NOT_WISH.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f1226a[LoopInputType.GROWTH_FOOD.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f1226a[LoopInputType.ABOUT_ME.ordinal()] = 42;
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
        f1201a = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType, loopInputType2, loopInputType3, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8}));
        LoopInputType loopInputType9 = LoopInputType.ETHNICITY;
        LoopInputType loopInputType10 = LoopInputType.LANGUAGE;
        LoopInputType loopInputType11 = LoopInputType.QUALIFICATION;
        f1202b = vwb.f0(new LoopInputType[]{loopInputType9, loopInputType10, loopInputType, loopInputType2, loopInputType3, loopInputType11, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8});
        LoopInputType loopInputType12 = LoopInputType.MAJOR;
        LoopInputType loopInputType13 = LoopInputType.SCHOOL;
        f1203c = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType, loopInputType12, loopInputType13, loopInputType5, loopInputType6, loopInputType7, loopInputType8}));
        f1204d = vwb.f0(new LoopInputType[]{loopInputType9, loopInputType10, loopInputType, loopInputType12, loopInputType11, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8});
        f1205e = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType5, loopInputType4, loopInputType, loopInputType2, loopInputType3, loopInputType6}));
        LoopInputType loopInputType14 = LoopInputType.PROFESSION;
        f1206f = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType5, loopInputType14, loopInputType3, loopInputType4, loopInputType6}));
        f1207g = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType14, loopInputType3, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8}));
        f1208h = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType6, loopInputType14, loopInputType3, loopInputType4, loopInputType5, loopInputType7, loopInputType8}));
        f1209i = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType5, loopInputType, loopInputType12, loopInputType13, loopInputType6}));
        LoopInputType loopInputType15 = LoopInputType.FRIEND_PURPOSE;
        f1210j = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType, loopInputType2, loopInputType3, loopInputType4, loopInputType5, loopInputType15, loopInputType6, loopInputType7, loopInputType8}));
        f1211k = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType, loopInputType12, loopInputType13, loopInputType5, loopInputType15, loopInputType6, loopInputType7, loopInputType8}));
        f1212l = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType5, loopInputType4, loopInputType, loopInputType2, loopInputType3, loopInputType15, loopInputType6}));
        f1213m = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType5, loopInputType, loopInputType12, loopInputType13, loopInputType15, loopInputType6}));
        f1214n = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType14, loopInputType4, loopInputType5}));
        f1215o = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType14, loopInputType3, loopInputType4, loopInputType5, loopInputType15, loopInputType6, loopInputType7, loopInputType8}));
        f1216p = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType6, loopInputType14, loopInputType3, loopInputType4, loopInputType5, loopInputType15, loopInputType7, loopInputType8}));
        f1217q = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType5, loopInputType14, loopInputType3, loopInputType4, loopInputType15, loopInputType6}));
        LoopInputType loopInputType16 = LoopInputType.HEIGHT;
        LoopInputType loopInputType17 = LoopInputType.INCOME;
        LoopInputType loopInputType18 = LoopInputType.CAR;
        LoopInputType loopInputType19 = LoopInputType.HOUSE;
        LoopInputType loopInputType20 = LoopInputType.GAME_NAME;
        LoopInputType loopInputType21 = LoopInputType.GAME_TOGETHER;
        LoopInputType loopInputType22 = LoopInputType.GAME_LEVEL;
        LoopInputType loopInputType23 = LoopInputType.GAME_VOICE;
        LoopInputType loopInputType24 = LoopInputType.GROWTH_FOOD;
        f1218r = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType6, loopInputType14, loopInputType3, loopInputType4, loopInputType11, loopInputType5, loopInputType15, loopInputType16, loopInputType17, loopInputType18, loopInputType19, loopInputType20, loopInputType21, loopInputType22, loopInputType23, loopInputType24, loopInputType7, loopInputType8}));
        f1219s = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType6, loopInputType14, loopInputType3, loopInputType4, loopInputType11, loopInputType5, loopInputType15, loopInputType16, loopInputType20, loopInputType21, loopInputType22, loopInputType23, loopInputType24, loopInputType7, loopInputType8}));
        f1220t = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType6, loopInputType, loopInputType12, loopInputType13, loopInputType11, loopInputType5, loopInputType15, loopInputType16, loopInputType20, loopInputType21, loopInputType22, loopInputType23, loopInputType24, loopInputType7, loopInputType8}));
        f1221u = new ArrayList<>(vwb.f0(new LoopInputType[]{loopInputType6, loopInputType, loopInputType12, loopInputType13, loopInputType11, loopInputType5, loopInputType15, loopInputType16, loopInputType17, loopInputType18, loopInputType19, loopInputType20, loopInputType21, loopInputType22, loopInputType23, loopInputType24, loopInputType7, loopInputType8}));
        f1222v = vwb.f0(new LoopInputType[]{loopInputType11, loopInputType4});
        f1223w = vwb.f0(new LoopInputType[]{loopInputType, loopInputType2, loopInputType3});
        f1224x = vwb.f0(new LoopInputType[]{loopInputType, loopInputType12});
        f1225y = vwb.f0(new LoopInputType[]{loopInputType9, loopInputType10});
    }

    /* JADX INFO: renamed from: A */
    public static ArrayList<LoopInputType> m1939A(LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user, boolean z, boolean z2) {
        return m1940B(loopCreateEntryType, loopInputType, user, z, z2, "");
    }

    /* JADX INFO: renamed from: B */
    public static ArrayList<LoopInputType> m1940B(LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user, boolean z, boolean z2, String str) {
        return m1941C(loopCreateEntryType, loopInputType, user, z, z2, str, null);
    }

    /* JADX INFO: renamed from: C */
    public static ArrayList<LoopInputType> m1941C(LoopCreateEntryType loopCreateEntryType, final LoopInputType loopInputType, User user, boolean z, boolean z2, String str, User user2) {
        j760 j760Var;
        IdealInfo idealInfo;
        User user3 = user2;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        new ArrayList();
        if (lqa.j() && ("from_card_upload_photo".equals(str) || "from_profile_upload_photo".equals(str))) {
            arrayList.add(LoopInputType.PHOTO);
        } else if ("from_explore_card".equals(str)) {
            arrayList.add(LoopInputType.PET_PHOTO);
        } else if ("from_profile_frag_edit".equals(str)) {
            arrayList.addAll(f1214n);
        } else if (lqa.g() && (loopCreateEntryType == LoopCreateEntryType.ENTRY_EDIT || loopCreateEntryType == LoopCreateEntryType.ENTRY_CARD_FACK_UP_DATA)) {
            m1956R(arrayList, f1208h, f1207g);
        } else if (lqa.g()) {
            arrayList.addAll(f1206f);
        } else if (user.profile.studies.active) {
            if (loopCreateEntryType == LoopCreateEntryType.ENTRY_EDIT) {
                arrayList.addAll(f1204d);
            } else {
                arrayList.addAll(f1209i);
            }
        } else if (loopCreateEntryType == LoopCreateEntryType.ENTRY_EDIT) {
            arrayList.addAll(f1202b);
        } else {
            arrayList.addAll(f1205e);
        }
        if (!IntlCountryCodeController.j()) {
            arrayList.remove(LoopInputType.ETHNICITY);
            arrayList.remove(LoopInputType.LANGUAGE);
        }
        if (lqa.g()) {
            m1953O(arrayList);
        }
        if (lqa.j() && "thin_popup".equals(str) && user.pictures.size() < 2) {
            arrayList.add(LoopInputType.PHOTO);
        }
        if (loopCreateEntryType == LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT) {
            arrayList.clear();
            str.getClass();
            switch (str) {
                case "intl_profile_education_kit":
                    arrayList.addAll(f1222v);
                    break;
                case "intl_profile_about_kit":
                    arrayList.add(LoopInputType.SIGNATURE);
                    break;
                case "intl_profile_ethnicity_language_kit":
                    arrayList.addAll(f1225y);
                    break;
                case "intl_profile_job_kit":
                    if (user.profile.studies.active) {
                        arrayList.addAll(f1224x);
                        break;
                    } else {
                        arrayList.addAll(f1223w);
                        break;
                    }
                    break;
            }
        }
        if (lqa.p() && loopCreateEntryType == LoopCreateEntryType.ENTRY_SERIOUS_DIALOG) {
            arrayList.clear();
            arrayList.addAll(vwb.f0(new LoopInputType[]{LoopInputType.QUALIFICATION, LoopInputType.HEIGHT, LoopInputType.INCOME, LoopInputType.CAR, LoopInputType.HOUSE}));
        }
        if (lqa.w()) {
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
                arrayList.addAll(vwb.f0(new LoopInputType[]{loopInputType2, loopInputType3, loopInputType4, loopInputType5, loopInputType6, loopInputType7, loopInputType8, loopInputType9, loopInputType10, loopInputType11, loopInputType12, loopInputType13, loopInputType14, loopInputType15, loopInputType16, LoopInputType.GAME_NAME, LoopInputType.GAME_TOGETHER, LoopInputType.GAME_LEVEL, LoopInputType.GAME_VOICE, LoopInputType.GROWTH_FOOD, LoopInputType.PET}));
                if (!lqa.f()) {
                    arrayList.remove(loopInputType16);
                }
            } else if (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_CHAT_COMPLETE_PROFILE || loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_MYTAB_COMPLETE_PROFILE || loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_LEFT_SWIPE_COMPLETE_PROFILE) {
                arrayList.clear();
                arrayList.addAll(vwb.f0(new LoopInputType[]{LoopInputType.PROFESSION, LoopInputType.QUALIFICATION, LoopInputType.HOMETOWN, LoopInputType.FRIEND_PURPOSE, LoopInputType.HEIGHT, LoopInputType.FITNESS, LoopInputType.DRINKING, LoopInputType.SMOKING, LoopInputType.SIGNATURE, LoopInputType.MY_LIFT}));
            } else if (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE) {
                arrayList.clear();
                LoopInputType loopInputType17 = LoopInputType.SIGNATURE;
                LoopInputType loopInputType18 = LoopInputType.MY_LIFT;
                LoopInputType loopInputType19 = LoopInputType.MY_QUESTION;
                LoopInputType loopInputType20 = LoopInputType.GAME_CP;
                LoopInputType loopInputType21 = LoopInputType.PET;
                arrayList.addAll(vwb.f0(new LoopInputType[]{loopInputType17, loopInputType18, loopInputType19, loopInputType20, loopInputType21, LoopInputType.MBTI_TEST}));
                if (NullChecker.a(user3.profile.extensions) && NullChecker.a(user3.profile.extensions.wealth) && !vwb.J(user3.profile.extensions.wealth.pet) && (TextUtils.equals((CharSequence) user3.profile.extensions.wealth.pet.get(0), "已有宠物") || TextUtils.equals((CharSequence) user3.profile.extensions.wealth.pet.get(0), CoreModule.b.getString(R.string.m2)))) {
                    arrayList.remove(loopInputType21);
                }
            }
        }
        LoopInputType loopInputType22 = LoopInputType.GAME_NAME;
        if (arrayList.indexOf(loopInputType22) != -1) {
            if (user3 == null) {
                user3 = user;
            }
            if (!m1948J(loopInputType22, user3, str)) {
                arrayList.removeAll(vwb.f0(new LoopInputType[]{LoopInputType.GAME_TOGETHER, LoopInputType.GAME_LEVEL, LoopInputType.GAME_VOICE}));
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
                arrayList.addAll(vwb.f0(new LoopInputType[]{loopInputType23, LoopInputType.SIGNATURE, LoopInputType.VERIFICATION}));
            } else {
                arrayList.addAll(vwb.f0(new LoopInputType[]{LoopInputType.SIGNATURE, loopInputType23, LoopInputType.VERIFICATION}));
            }
        }
        if (lqa.f() && (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_GUIDE || loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM || loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_IDEAL_OTHER_PROFILE_FEEDBACK)) {
            ArrayList arrayListF0 = vwb.f0(new LoopInputType[]{LoopInputType.QUALIFICATION, LoopInputType.SCHOOL_NEW, LoopInputType.PROFESSION, LoopInputType.HEIGHT, LoopInputType.FITNESS, LoopInputType.MY_LIFT, LoopInputType.SIGNATURE, LoopInputType.INCOME, LoopInputType.CAR, LoopInputType.HOUSE, LoopInputType.PET, LoopInputType.GAME_CP, LoopInputType.MBTI_TEST});
            if (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM && (j760Var = pj90.s) != null && !TextUtils.isEmpty((CharSequence) j760Var.a) && (idealInfo = (IdealInfo) pj90.s.b) != null) {
                ArrayList arrayListF1 = vwb.f0(new String[0]);
                Iterator it = idealInfo.idealProfiles.iterator();
                while (it.hasNext()) {
                    arrayListF1.addAll(((IdealProfile) it.next()).profiles);
                }
                final ArrayList arrayListQ = vwb.Q(arrayListF1, new w9j() { // from class: l.m3w
                    public final Object call(Object obj) {
                        return pj90.n((String) obj);
                    }
                });
                if (arrayListF1.size() > 0) {
                    Objects.requireNonNull(arrayListQ);
                    arrayListF0 = vwb.n(arrayListF0, new w9j() { // from class: l.o3w
                        public final Object call(Object obj) {
                            return Boolean.valueOf(arrayListQ.contains((LoopInputType) obj));
                        }
                    });
                }
            }
            arrayList.clear();
            arrayList.addAll(arrayListF0);
        }
        if (loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_CARD_GUIDE_IMPROVE_PROFILE) {
            arrayList.clear();
            LoopInputType loopInputType24 = LoopInputType.FITNESS;
            if (loopInputType == loopInputType24) {
                arrayList.addAll(vwb.f0(new LoopInputType[]{loopInputType24}));
            } else {
                LoopInputType loopInputType25 = LoopInputType.DRINKING;
                if (loopInputType == loopInputType25) {
                    arrayList.addAll(vwb.f0(new LoopInputType[]{loopInputType25}));
                } else {
                    LoopInputType loopInputType26 = LoopInputType.SMOKING;
                    if (loopInputType == loopInputType26) {
                        arrayList.addAll(vwb.f0(new LoopInputType[]{loopInputType26}));
                    } else {
                        LoopInputType loopInputType27 = LoopInputType.GAME_NAME;
                        if (loopInputType == loopInputType27) {
                            arrayList.addAll(vwb.f0(new LoopInputType[]{loopInputType27, LoopInputType.GAME_TOGETHER}));
                        }
                    }
                }
            }
        }
        ArrayList<LoopInputType> arrayList2 = new ArrayList<>();
        int iG = vwb.G(arrayList, new w9j() { // from class: l.p3w
            public final Object call(Object obj) {
                return Boolean.valueOf(((LoopInputType) obj) == loopInputType);
            }
        });
        int i = iG >= 0 ? iG : 0;
        if (NullChecker.a(loopInputType)) {
            arrayList2.add(loopInputType);
        }
        for (int i2 = i; i2 < arrayList.size() + i; i2++) {
            LoopInputType loopInputType28 = (LoopInputType) arrayList.get(i2 % arrayList.size());
            if (loopInputType28 != loopInputType && (!m1948J(loopInputType28, user, str) || ((loopInputType28 == LoopInputType.INDUSTRY && !z) || ((loopInputType28 == LoopInputType.PET && loopCreateEntryType == LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE) || (loopInputType28 == LoopInputType.PROFESSION && !z && lqa.g()))))) {
                arrayList2.add(loopInputType28);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: D */
    public static CategorySuggestions m1942D() {
        return ura.e().d().Mk();
    }

    /* JADX INFO: renamed from: E */
    public static void m1943E(LoopInputType loopInputType, Frag frag, User user, int i) {
        LoopEditInfo loopEditInfoM1976o = m1976o(loopInputType, user, frag.getContext());
        loopEditInfoM1976o.maxInput = i;
        frag.startActivityForResult(ProfileLoopCreateTagAct.m2131b2(loopEditInfoM1976o, frag.getContext()), loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: F */
    public static void m1944F(String str, Fragment fragment, User user) {
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
        LoopEditInfo loopEditInfoM1976o = m1976o(loopInputType, user, fragment.getContext());
        loopEditInfoM1976o.setMultiType(str);
        fragment.startActivityForResult(ProfileLoopMultiSelectAct.m2156Y1(loopEditInfoM1976o, fragment.getContext()), loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: G */
    public static void m1945G(Frag frag) {
        frag.startActivityForResult(ProfileLoopSchoolHideAct.m2177a2(frag.getContext()), LoopInputType.HIDDEN_SCHOOL.requestCode);
    }

    /* JADX INFO: renamed from: H */
    public static void m1946H(Frag frag, LoopInputType loopInputType) {
        Intent intentM2169Z1 = ProfileLoopQuestionAct.m2169Z1(frag.getContext());
        intentM2169Z1.putExtra("loop_create_tag_info", loopInputType);
        frag.startActivityForResult(intentM2169Z1, loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: I */
    public static void m1947I(User user, Act act, LoopInputType loopInputType) {
        Intent intentM2169Z1 = ProfileLoopQuestionAct.m2169Z1(act);
        intentM2169Z1.putExtra("loop_create_tag_info", loopInputType);
        intentM2169Z1.putExtra("loop_edit_user", (Serializable) user);
        act.startActivityForResult(intentM2169Z1, loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m1948J(LoopInputType loopInputType, User user, String str) {
        return m1949K(loopInputType, user, str, m1950L(str));
    }

    /* JADX INFO: renamed from: K */
    public static boolean m1949K(LoopInputType loopInputType, User user, String str, boolean z) {
        User userP9 = CoreModule.c.e0.p9();
        boolean z2 = (NullChecker.a(userP9.settings) && NullChecker.b(userP9.settings.verification) && NullChecker.b(userP9.settings.verification.studies) && TEnum.equals(userP9.settings.verification.studies.status, "pending")) ? false : true;
        String str2 = "";
        switch (C0095a.f1226a[loopInputType.ordinal()]) {
            case 1:
                return !TextUtils.isEmpty(user.profile.hangouts);
            case 2:
                VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
                return verificationCenterK4 != null && (TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending"));
            case 3:
                return !TextUtils.isEmpty(user.description);
            case 4:
                return !vwb.J(user.profile.extensions.basic.friendPurpose);
            case 5:
                if (!z2) {
                    return true;
                }
                if ("from_profile_frag_edit".equals(str)) {
                    Profile profile = user.profile;
                    if (profile.studies.active) {
                        return true;
                    }
                    Work work = profile.work;
                    String str3 = work.industry;
                    String str4 = work.department;
                    String string = CoreModule.b.getString(R.string.R2);
                    if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.equals(str3, string) || TextUtils.equals(str3, "其它") || TextUtils.equals(str4, string) || TextUtils.equals(str4, "其它")) {
                        return false;
                    }
                }
                return !TextUtils.isEmpty(user.profile.work.industry) || user.profile.studies.active;
            case 6:
                return (z2 && TextUtils.isEmpty(user.profile.work.industry) && !user.profile.studies.active) ? false : true;
            case ExpLoopInputType.FRIEND_PURPOSE /* 7 */:
                return (TextUtils.equals(str, "from_filter_purpose_dialog") && user.profile.studies.active) || !TextUtils.isEmpty(user.profile.work.department);
            case ExpLoopInputType.GAME_NAME /* 8 */:
                Profile profile2 = user.profile;
                return profile2.studies.active || !TextUtils.isEmpty(profile2.work.company);
            case ExpLoopInputType.GAME_TOGETHER /* 9 */:
                return !TextUtils.isEmpty(user.profile.studies.major);
            case ExpLoopInputType.GAME_VOICE /* 10 */:
            case ExpLoopInputType.HOUSE /* 11 */:
                return (z2 && TextUtils.isEmpty(user.profile.studies.school)) ? false : true;
            case ExpLoopInputType.PROFESSION /* 12 */:
                return m1972k(user);
            case ExpLoopInputType.HEIGHT /* 13 */:
            case ExpLoopInputType.SIGNATURE /* 14 */:
                return true;
            case ExpLoopInputType.COMPANY /* 15 */:
                if (vwb.J(user.profile.extensions.physical.height) || TextUtils.isEmpty((CharSequence) user.profile.extensions.physical.height.get(0))) {
                    return false;
                }
                return (z && TextUtils.equals((CharSequence) user.profile.extensions.physical.height.get(0), CoreModule.b.getString(R.string.l2))) ? false : true;
            case ExpLoopInputType.GAME_LEVEL /* 16 */:
                return (!NullChecker.a(user.profile.studies) || TEnum.equals(user.profile.studies.qualification, "unknown_") || TEnum.equals(user.profile.studies.qualification, "NO_QUALIFICATION")) ? false : true;
            case ExpLoopInputType.NICKNAME /* 17 */:
                UserWealth userWealth = user.profile.extensions.wealth;
                if (userWealth != null && !vwb.J(userWealth.car)) {
                    str2 = (String) user.profile.extensions.wealth.car.get(0);
                }
                if (FriendPurposeHelper.i(str2)) {
                    return (z && !vwb.J(user.profile.extensions.wealth.car) && TextUtils.equals((CharSequence) user.profile.extensions.wealth.car.get(0), CoreModule.b.getString(R.string.l2))) ? false : true;
                }
                return false;
            case ExpLoopInputType.SCHOOL_NEW /* 18 */:
                if (NullChecker.a(user.profile.extensions.wealth) && !vwb.J(user.profile.extensions.wealth.pet)) {
                    str2 = (String) user.profile.extensions.wealth.pet.get(0);
                }
                if (FriendPurposeHelper.l(str2)) {
                    return (z && !vwb.J(user.profile.extensions.wealth.pet) && TextUtils.equals((CharSequence) user.profile.extensions.wealth.pet.get(0), CoreModule.b.getString(R.string.l2))) ? false : true;
                }
                return false;
            case ExpLoopInputType.HOMETOWN /* 19 */:
                if (NullChecker.a(user.profile.extensions.wealth) && !vwb.J(user.profile.extensions.wealth.house)) {
                    str2 = (String) user.profile.extensions.wealth.house.get(0);
                }
                if (FriendPurposeHelper.j(str2)) {
                    return (z && !vwb.J(user.profile.extensions.wealth.house) && TextUtils.equals((CharSequence) user.profile.extensions.wealth.house.get(0), CoreModule.b.getString(R.string.l2))) ? false : true;
                }
                return false;
            case ExpLoopInputType.MY_QUESTION /* 20 */:
                if (NullChecker.a(user.profile.extensions.wealth)) {
                    UserWealth userWealth2 = user.profile.extensions.wealth;
                    if (FriendPurposeHelper.k(userWealth2.upperIncome, userWealth2.lowIncome)) {
                        return (z && !vwb.J(user.profile.extensions.wealth.lowIncome) && TextUtils.equals((CharSequence) user.profile.extensions.wealth.lowIncome.get(0), CoreModule.b.getString(R.string.l2))) ? false : true;
                    }
                }
                return false;
            case ExpLoopInputType.PET /* 21 */:
                return NullChecker.a(user.profile.extensions.interest) && !vwb.J(user.profile.extensions.interest.tags);
            case ExpLoopInputType.BIRTHDAY /* 22 */:
                return !vwb.J(n53.m18509a(CoreModule.H().userId()));
            case ExpLoopInputType.HANGOUTS /* 23 */:
                return !vwb.J(user.profile.extensions.basic.ethnicity);
            case ExpLoopInputType.MY_LIFE /* 24 */:
                return !vwb.J(user.profile.extensions.basic.language);
            case ExpLoopInputType.VERIFICATION /* 25 */:
                return NullChecker.a(user.profile.extensions.game) && pc8.u0(user.profile.extensions.game.name);
            case ExpLoopInputType.FOOD_FLAVOR /* 26 */:
                return NullChecker.a(user.profile.extensions.game) && pc8.u0(user.profile.extensions.game.together);
            case 27:
                return NullChecker.a(user.profile.extensions.game) && pc8.u0(user.profile.extensions.game.level);
            case 28:
                return NullChecker.a(user.profile.extensions.game) && pc8.u0(user.profile.extensions.game.voice);
            case 29:
                if (!NullChecker.a(user.profile.extensions.physical) || vwb.J(user.profile.extensions.physical.fitness) || TextUtils.isEmpty((CharSequence) user.profile.extensions.physical.fitness.get(0))) {
                    return false;
                }
                return (z && TextUtils.equals((CharSequence) user.profile.extensions.physical.fitness.get(0), FriendPurposeHelper.FitnessType.not_reveal.toString())) ? false : true;
            case 30:
                if (!NullChecker.a(user.profile.extensions.physical) || vwb.J(user.profile.extensions.physical.drink) || TextUtils.isEmpty((CharSequence) user.profile.extensions.physical.drink.get(0))) {
                    return false;
                }
                return (z && TextUtils.equals(FriendPurposeHelper.DrinkType.getDes((String) user.profile.extensions.physical.drink.get(0)), CoreModule.b.getString(R.string.l2))) ? false : true;
            case 31:
                if (!NullChecker.a(user.profile.extensions.physical) || vwb.J(user.profile.extensions.physical.smoke) || TextUtils.isEmpty((CharSequence) user.profile.extensions.physical.smoke.get(0))) {
                    return false;
                }
                return (z && TextUtils.equals(FriendPurposeHelper.SmokeType.getDes((String) user.profile.extensions.physical.smoke.get(0)), CoreModule.b.getString(R.string.l2))) ? false : true;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                if (!m1950L(str) || m1951M(str)) {
                    return user.pictures.size() >= 3;
                }
                return user.pictures.size() == 9;
            case 37:
                return !vwb.J(user.profile.answers);
            case 38:
                return pj90.t(CoreModule.c.e0.na());
            case 39:
                return NullChecker.a(user.profile.extensions.game) && !vwb.J(user.profile.extensions.game.screenshot);
            case 40:
                return pj90.r(user);
            case 41:
                return NullChecker.a(user.profile.extensions.interest) && pc8.u0(user.profile.extensions.interest.taste);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: L */
    public static boolean m1950L(String str) {
        return TextUtils.equals(str, "from_ideal_guide_dialog") || m1951M(str);
    }

    /* JADX INFO: renamed from: M */
    public static boolean m1951M(String str) {
        return TextUtils.equals(str, "from_ideal_guide_profile_item");
    }

    /* JADX INFO: renamed from: N */
    public static boolean m1952N(int i, User user, Intent intent) {
        Answer answer;
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
        if (!NullChecker.a(loopEditInfo)) {
            return false;
        }
        String str = loopEditInfo.editObjKey;
        if (TextUtils.isEmpty(str) || vwb.J(user.profile.answers)) {
            return false;
        }
        Iterator it = user.profile.answers.iterator();
        do {
            if (!it.hasNext()) {
                answer = null;
                break;
            }
            answer = (Answer) it.next();
        } while (!TextUtils.equals(answer.question, str));
        if (!NullChecker.a(answer)) {
            return false;
        }
        if (vwb.L(stringExtra)) {
            user.profile.answers.remove(answer);
        } else {
            answer.value = stringExtra;
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public static void m1953O(ArrayList<LoopInputType> arrayList) {
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
    public static void m1954P(User user, String str) {
        if (!lqa.g()) {
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
    public static List<String> m1955Q(List<String> list) {
        Collator collator = Collator.getInstance(Locale.getDefault());
        collator.setStrength(0);
        Collections.sort(list, collator);
        for (final String str : Lists.q(vwb.R(CoreModule.b.getString(R.string.o2).split(","), new w9j() { // from class: l.s3w
            public final Object call(Object obj) {
                return ((String) obj).trim();
            }
        }))) {
            int iG = vwb.G(list, new w9j() { // from class: l.t3w
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).toLowerCase().equals(str));
                }
            });
            if (iG > 0) {
                String str2 = list.get(iG);
                list.remove(iG);
                list.add(0, str2);
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: R */
    public static void m1956R(ArrayList<LoopInputType> arrayList, ArrayList<LoopInputType> arrayList2, ArrayList<LoopInputType> arrayList3) {
        if (lqa.u()) {
            arrayList.addAll(arrayList2);
        } else {
            arrayList.addAll(arrayList3);
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m1957S(User user, Frag frag, LoopInputType loopInputType) {
        m1958T(user, frag, loopInputType, LoopCreateEntryType.ENTRY_EDIT);
    }

    /* JADX INFO: renamed from: T */
    public static void m1958T(User user, Frag frag, LoopInputType loopInputType, LoopCreateEntryType loopCreateEntryType) {
        m1959U(user, frag, loopInputType, loopCreateEntryType, "");
    }

    /* JADX INFO: renamed from: U */
    public static void m1959U(User user, Frag frag, LoopInputType loopInputType, LoopCreateEntryType loopCreateEntryType, String str) {
        m1960V(user, frag, loopInputType, loopCreateEntryType, str, true);
    }

    /* JADX INFO: renamed from: V */
    public static void m1960V(User user, Frag frag, LoopInputType loopInputType, LoopCreateEntryType loopCreateEntryType, String str, boolean z) {
        m1961W(user, frag, loopInputType, loopCreateEntryType, str, z, null);
    }

    /* JADX INFO: renamed from: W */
    public static void m1961W(User user, Frag frag, LoopInputType loopInputType, LoopCreateEntryType loopCreateEntryType, String str, boolean z, a.a aVar) {
        Intent intentM1989Y1 = ProfileInfoLoopEditAct.m1989Y1(frag.getContext(), loopCreateEntryType, loopInputType, user, str);
        ura.e().d().no(user.profile.studies.active);
        if (NullChecker.a(aVar)) {
            frag.u4(3500, intentM1989Y1, aVar);
        } else {
            frag.startActivityForResult(intentM1989Y1, 3500);
        }
        if (z) {
            frag.getActivity().overridePendingTransition(tzb0.h, tzb0.c);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m1971j(Act act) {
        if (ura.e().d().Uc().profile.studies.active) {
            ura.e().d().kl();
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1972k(User user) {
        if (!TextUtils.isEmpty(user.profile.hometown)) {
            return true;
        }
        if (!vwb.J(user.profile.extensions.basic.country) && !TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.country.get(0))) {
            return true;
        }
        if (vwb.J(user.profile.extensions.basic.province) || TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.province.get(0))) {
            return (vwb.J(user.profile.extensions.basic.city) || TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.city.get(0))) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static void m1973l(User user, LoopInputType loopInputType, String str, String str2, int i) {
        int i2 = C0095a.f1226a[loopInputType.ordinal()];
        if (i2 == 4) {
            user.profile.extensions.basic.friendPurpose = ura.e().d().nn(str2);
            return;
        }
        if (i2 == 20) {
            Pair pairT8 = ura.e().d().T8(str2);
            if (!NullChecker.a(user.profile.extensions.wealth)) {
                user.profile.extensions.wealth = UserWealth.new_();
            }
            UserWealth userWealth = user.profile.extensions.wealth;
            userWealth.lowIncome = (List) pairT8.first;
            userWealth.upperIncome = (List) pairT8.second;
            return;
        }
        switch (i2) {
            case 6:
                if (NullChecker.a(m1942D())) {
                    if (!TextUtils.equals((String) m1942D().industry.get(0), str2)) {
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
            case ExpLoopInputType.FRIEND_PURPOSE /* 7 */:
                user.profile.work.department = str2;
                break;
            case ExpLoopInputType.GAME_NAME /* 8 */:
                user.profile.work.company = str2;
                break;
            case ExpLoopInputType.GAME_TOGETHER /* 9 */:
                user.profile.studies.major = str2;
                break;
            case ExpLoopInputType.GAME_VOICE /* 10 */:
            case ExpLoopInputType.HOUSE /* 11 */:
                user.profile.studies.school = str2;
                break;
            case ExpLoopInputType.PROFESSION /* 12 */:
                m1954P(user, str2);
                break;
            case ExpLoopInputType.HEIGHT /* 13 */:
                user.name = str2;
                break;
            default:
                switch (i2) {
                    case ExpLoopInputType.GAME_LEVEL /* 16 */:
                        user.profile.studies.qualification = ura.e().d().Ik(str2);
                        break;
                    case ExpLoopInputType.NICKNAME /* 17 */:
                        if (!NullChecker.a(user.profile.extensions.wealth)) {
                            user.profile.extensions.wealth = UserWealth.new_();
                        }
                        user.profile.extensions.wealth.car = ura.e().d().fa(str2);
                        break;
                    case ExpLoopInputType.SCHOOL_NEW /* 18 */:
                        if (!NullChecker.a(user.profile.extensions.wealth)) {
                            user.profile.extensions.wealth = UserWealth.new_();
                        }
                        user.profile.extensions.wealth.pet = ura.e().d().Os(str2);
                        break;
                    default:
                        switch (i2) {
                            case 28:
                                user.profile.extensions.game.voice = vwb.f0(new String[]{str2});
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
    public static void m1974m(User user, LoopInputType loopInputType, List<String> list) {
        int i = C0095a.f1226a[loopInputType.ordinal()];
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
    public static ArrayList<LoopSelectFillData> m1975n(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (NullChecker.a(m1942D())) {
            List<String> list = m1942D().department.get(user.profile.work.industry) == null ? (List) m1942D().department.get("general") : (List) m1942D().department.get(user.profile.work.industry);
            if (!vwb.J(list)) {
                arrayList.add(new LoopSelectFillData(CoreModule.b.getString(R.string.V2), LoopSelectFillData.LoopSelectType.INPUT_ENTRY));
                String str = user.profile.work.department;
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(new LoopSelectFillData(str).m2069i(true));
                }
                for (String str2 : list) {
                    if (!TextUtils.equals(str, str2)) {
                        LoopSelectFillData loopSelectFillData = new LoopSelectFillData(str2);
                        arrayList.add(loopSelectFillData);
                        if (TextUtils.equals(str2, user.profile.work.department)) {
                            loopSelectFillData.m2069i(true);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static LoopEditInfo m1976o(LoopInputType loopInputType, User user, Context context) {
        if (loopInputType == LoopInputType.ABOUT_ME) {
            return lqa.r() ? LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 100, context.getString(R.string.d0)).setEmptyInput(true) : LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 500, ura.e().d().uj()).setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.COMPANY) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R.string.F2)).setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.MAJOR) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R.string.M2)).setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.SCHOOL) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R.string.P2)).setEmptyInput(true);
        }
        if (loopInputType == LoopInputType.NICKNAME) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 50, context.getString(R.string.w2));
        }
        if (loopInputType == LoopInputType.INDUSTRY) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R.string.t2)).setEmptyInput(false);
        }
        if (loopInputType == LoopInputType.HANGOUTS) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R.string.I2)).setEmptyInput(true).setDefaultContent(user.profile.hangouts);
        }
        LoopInputType loopInputType2 = LoopInputType.PERSONALITY;
        if (loopInputType == loopInputType2) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R.string.x2));
        }
        if (loopInputType == loopInputType2 || loopInputType == LoopInputType.SPORTS || loopInputType == LoopInputType.MUSIC || loopInputType == LoopInputType.LITERATURE || loopInputType == LoopInputType.MOVIES || loopInputType == LoopInputType.FOOD || loopInputType == LoopInputType.PLACES) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R.string.u2));
        }
        if (loopInputType == LoopInputType.DEPARTMENT) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R.string.v2)).setEmptyInput(false);
        }
        if (loopInputType == LoopInputType.HOMETOWN) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R.string.s2)).setEmptyInput(false);
        }
        if (loopInputType == LoopInputType.SIGNATURE) {
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 500, context.getString(R.string.j3)).setEmptyInput(true);
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
            return LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 40, context.getString(R.string.x2));
        }
        LoopEditInfo emptyInput = LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 100, "我不希望你...").setEmptyInput(true);
        emptyInput.subTitle = "关于交友，我不希望你...";
        return emptyInput;
    }

    /* JADX INFO: renamed from: p */
    public static ArrayList<LoopSelectFillData> m1977p(LoopInputType loopInputType, User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (loopInputType == LoopInputType.INDUSTRY) {
            return m1985x(user);
        }
        if (loopInputType == LoopInputType.DEPARTMENT) {
            return m1975n(user);
        }
        if (loopInputType == LoopInputType.HOMETOWN) {
            return lqa.g() ? m1984w(user) : m1983v(user);
        }
        if (loopInputType == LoopInputType.FRIEND_PURPOSE) {
            return FriendPurposeHelper.d(user);
        }
        if (loopInputType == LoopInputType.QUALIFICATION) {
            return FriendPurposeHelper.g(user);
        }
        if (loopInputType == LoopInputType.INCOME) {
            return FriendPurposeHelper.e(user);
        }
        if (loopInputType == LoopInputType.CAR) {
            return FriendPurposeHelper.a(user);
        }
        if (loopInputType == LoopInputType.PET) {
            return FriendPurposeHelper.f(user);
        }
        if (loopInputType == LoopInputType.PERSONALITY || loopInputType == LoopInputType.SPORTS || loopInputType == LoopInputType.MUSIC || loopInputType == LoopInputType.LITERATURE || loopInputType == LoopInputType.MOVIES || loopInputType == LoopInputType.FOOD || loopInputType == LoopInputType.PLACES) {
            return m1986y(loopInputType, user);
        }
        if (loopInputType == LoopInputType.GAME_VOICE) {
            return m1980s(user);
        }
        if (loopInputType == LoopInputType.GAME_NAME) {
            return m1978q(user);
        }
        if (loopInputType == LoopInputType.GAME_TOGETHER) {
            return m1979r(user);
        }
        if (loopInputType == LoopInputType.FITNESS) {
            return FriendPurposeHelper.c(user);
        }
        if (loopInputType == LoopInputType.DRINKING) {
            return FriendPurposeHelper.b(user);
        }
        if (loopInputType == LoopInputType.SMOKING) {
            return FriendPurposeHelper.h(user);
        }
        return loopInputType == LoopInputType.GROWTH_FOOD ? m1981t(user) : arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static ArrayList<LoopSelectFillData> m1978q(User user) {
        ExtensionGame extensionGame = user.profile.extensions.game;
        final List arrayList = extensionGame == null ? new ArrayList() : extensionGame.name;
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        ArrayList arrayListF0 = vwb.f0(new LoopSelectFillData[]{new LoopSelectFillData("王者荣耀", loopSelectType), new LoopSelectFillData("和平精英", loopSelectType), new LoopSelectFillData("蛋仔派对", loopSelectType), new LoopSelectFillData("原神", loopSelectType), new LoopSelectFillData("第五人格", loopSelectType), new LoopSelectFillData("英雄联盟", loopSelectType), new LoopSelectFillData("金铲铲之战", loopSelectType), new LoopSelectFillData("狼人杀", loopSelectType)});
        vwb.z(arrayListF0, new e30() { // from class: l.q3w
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m2069i(arrayList.contains(loopSelectFillData.m2061a()));
            }
        });
        return new ArrayList<>(arrayListF0);
    }

    /* JADX INFO: renamed from: r */
    public static ArrayList<LoopSelectFillData> m1979r(User user) {
        ExtensionGame extensionGame = user.profile.extensions.game;
        final List arrayList = extensionGame == null ? new ArrayList() : extensionGame.together;
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        ArrayList arrayListF0 = vwb.f0(new LoopSelectFillData[]{new LoopSelectFillData("组队", loopSelectType), new LoopSelectFillData("cpdd", loopSelectType), new LoopSelectFillData("求大佬", loopSelectType), new LoopSelectFillData("找战队", loopSelectType), new LoopSelectFillData("其他", loopSelectType)});
        vwb.z(arrayListF0, new e30() { // from class: l.u3w
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m2069i(arrayList.contains(loopSelectFillData.m2061a()));
            }
        });
        return new ArrayList<>(arrayListF0);
    }

    /* JADX INFO: renamed from: s */
    public static ArrayList<LoopSelectFillData> m1980s(User user) {
        ExtensionGame extensionGame = user.profile.extensions.game;
        final List arrayList = extensionGame == null ? new ArrayList() : extensionGame.voice;
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        ArrayList arrayListF0 = vwb.f0(new LoopSelectFillData[]{new LoopSelectFillData("可以开麦", loopSelectType), new LoopSelectFillData("不开麦", loopSelectType)});
        vwb.z(arrayListF0, new e30() { // from class: l.n3w
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m2069i(TextUtils.equals((CharSequence) pc8.t0(arrayList), loopSelectFillData.m2061a()));
            }
        });
        return new ArrayList<>(arrayListF0);
    }

    /* JADX INFO: renamed from: t */
    public static ArrayList<LoopSelectFillData> m1981t(User user) {
        final List arrayList = user.profile.extensions.interest.taste;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        ArrayList arrayListF0 = vwb.f0(new LoopSelectFillData[]{new LoopSelectFillData("boldFlavorLover", "重口味爱好者", loopSelectType), new LoopSelectFillData("mildFlavorFan", "清淡饮食", loopSelectType), new LoopSelectFillData("exoticFlavorLover", "异域风情品鉴家", loopSelectType), new LoopSelectFillData("chineseFoodLover", "中华料理狂热者", loopSelectType), new LoopSelectFillData("meatLover", "肉食主义", loopSelectType), new LoopSelectFillData("vegetarian", "素食主义", loopSelectType)});
        vwb.z(arrayListF0, new e30() { // from class: l.r3w
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m2069i(arrayList.contains(loopSelectFillData.m2062b()));
            }
        });
        return new ArrayList<>(arrayListF0);
    }

    /* JADX INFO: renamed from: u */
    public static HometownSuggest m1982u() {
        return ura.e().d().N6();
    }

    /* JADX INFO: renamed from: v */
    public static ArrayList<LoopSelectFillData> m1983v(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (NullChecker.a(m1942D())) {
            List<String> listM1955Q = m1955Q(vwb.D(m1942D().hometown));
            if (!vwb.J(listM1955Q)) {
                arrayList.add(new LoopSelectFillData(CoreModule.b.getString(R.string.V2), LoopSelectFillData.LoopSelectType.INPUT_ENTRY));
                String str = user.profile.hometown;
                if (!TextUtils.isEmpty(str)) {
                    LoopSelectFillData loopSelectFillData = new LoopSelectFillData(str);
                    loopSelectFillData.m2069i(true);
                    arrayList.add(loopSelectFillData);
                }
                for (String str2 : listM1955Q) {
                    if (!TextUtils.equals(str2, str)) {
                        LoopSelectFillData loopSelectFillData2 = new LoopSelectFillData(str2);
                        if (!vwb.J((List) m1942D().hometown.get(str2))) {
                            loopSelectFillData2.m2070j();
                        }
                        arrayList.add(loopSelectFillData2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public static ArrayList<LoopSelectFillData> m1984w(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (NullChecker.a(m1982u())) {
            String strNb = lqa.g() ? ura.e().d().Nb(user.profile) : "";
            if (TextUtils.isEmpty(strNb)) {
                strNb = user.profile.hometown;
            }
            if (!TextUtils.isEmpty(strNb)) {
                LoopSelectFillData loopSelectFillData = new LoopSelectFillData(strNb);
                loopSelectFillData.m2069i(true);
                arrayList.add(loopSelectFillData);
            }
            List list = m1982u().china;
            for (int i = 0; i < list.size(); i++) {
                HometownChinaItem hometownChinaItem = (HometownChinaItem) list.get(i);
                if (!TextUtils.equals(hometownChinaItem.region, strNb)) {
                    LoopSelectFillData loopSelectFillData2 = new LoopSelectFillData(hometownChinaItem.region);
                    if (!vwb.J(hometownChinaItem.subRegion)) {
                        loopSelectFillData2.m2070j();
                    }
                    arrayList.add(loopSelectFillData2);
                }
            }
            LoopSelectFillData loopSelectFillData3 = new LoopSelectFillData(CoreModule.b.getString(R.string.Z0), LoopSelectFillData.LoopSelectType.SELECT_OVERSEAS);
            loopSelectFillData3.m2069i(false);
            loopSelectFillData3.m2070j();
            arrayList.add(loopSelectFillData3);
            String string = CoreModule.b.getString(R.string.R2);
            if (!TextUtils.equals(strNb, string)) {
                LoopSelectFillData loopSelectFillData4 = new LoopSelectFillData(string, LoopSelectFillData.LoopSelectType.SELECT_OTHER);
                loopSelectFillData4.m2069i(false);
                arrayList.add(loopSelectFillData4);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static ArrayList<LoopSelectFillData> m1985x(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (NullChecker.a(m1942D()) && !vwb.J(m1942D().industry)) {
            String str = (String) m1942D().industry.get(0);
            Profile profile = user.profile;
            String str2 = profile.studies.active ? str : profile.work.industry;
            arrayList.add(new LoopSelectFillData(CoreModule.b.getString(R.string.V2), LoopSelectFillData.LoopSelectType.INPUT_ENTRY));
            if (!TextUtils.isEmpty(str2)) {
                LoopSelectFillData loopSelectFillData = new LoopSelectFillData(str2);
                loopSelectFillData.m2069i(true);
                arrayList.add(loopSelectFillData);
            }
            for (String str3 : m1942D().industry) {
                if (!TextUtils.equals(str3, str2)) {
                    LoopSelectFillData loopSelectFillData2 = new LoopSelectFillData(str3);
                    arrayList.add(loopSelectFillData2);
                    if (TextUtils.equals(str, str3) && user.profile.studies.active) {
                        loopSelectFillData2.m2069i(true);
                    } else {
                        Profile profile2 = user.profile;
                        Work work = profile2.work;
                        if (work.active && !profile2.studies.active && TextUtils.equals(work.industry, str3)) {
                            loopSelectFillData2.m2069i(true);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static ArrayList<LoopSelectFillData> m1986y(final LoopInputType loopInputType, User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (!NullChecker.a(m1942D())) {
            return arrayList;
        }
        ArrayList arrayListN = vwb.n(user.profile.tags, new w9j() { // from class: l.v3w
            public final Object call(Object obj) {
                return Boolean.valueOf(((Tag) obj).category.equals(loopInputType.tagKey));
            }
        });
        ArrayList arrayList2 = arrayListN == null ? new ArrayList() : vwb.Q(arrayListN, new w9j() { // from class: l.w3w
            public final Object call(Object obj) {
                return ((Tag) obj).value;
            }
        });
        ArrayList arrayList3 = new ArrayList();
        if (loopInputType == LoopInputType.PERSONALITY) {
            arrayList3 = new ArrayList(m1942D().personality);
        } else if (loopInputType == LoopInputType.SPORTS) {
            arrayList3 = new ArrayList(m1942D().sports);
        } else if (loopInputType == LoopInputType.MUSIC) {
            arrayList3 = new ArrayList(m1942D().music);
        } else if (loopInputType == LoopInputType.LITERATURE) {
            arrayList3 = new ArrayList(m1942D().literature);
        } else if (loopInputType == LoopInputType.MOVIES) {
            arrayList3 = new ArrayList(m1942D().movies);
        } else if (loopInputType == LoopInputType.FOOD) {
            arrayList3 = new ArrayList(m1942D().food);
        } else if (loopInputType == LoopInputType.PLACES) {
            arrayList3 = new ArrayList(m1942D().places);
        }
        arrayList3.removeAll(arrayList2);
        if (!vwb.J(arrayList2)) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                LoopSelectFillData loopSelectFillData = new LoopSelectFillData((String) it.next());
                loopSelectFillData.m2069i(true).m2067g();
                arrayList.add(loopSelectFillData);
            }
        }
        if (!vwb.J(arrayList3)) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                LoopSelectFillData loopSelectFillData2 = new LoopSelectFillData((String) it2.next());
                loopSelectFillData2.m2069i(false).m2067g();
                arrayList.add(loopSelectFillData2);
            }
        }
        arrayList.add(0, new LoopSelectFillData(CoreModule.b.getString(R.string.V2), LoopSelectFillData.LoopSelectType.INPUT_ENTRY));
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public static ArrayList<LoopInputType> m1987z(LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user) {
        return m1939A(loopCreateEntryType, loopInputType, user, true, true);
    }
}
