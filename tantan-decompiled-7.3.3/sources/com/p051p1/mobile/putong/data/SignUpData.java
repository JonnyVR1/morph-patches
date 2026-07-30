package com.p051p1.mobile.putong.data;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import java.io.Serializable;
import java.util.List;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class SignUpData implements Serializable {
    public String action;
    public int age;
    public String appsFlyerUID;

    /* JADX INFO: renamed from: b1 */
    public boolean f39664b1;

    /* JADX INFO: renamed from: b2 */
    public boolean f39665b2;

    /* JADX INFO: renamed from: b3 */
    public boolean f39666b3;

    /* JADX INFO: renamed from: b4 */
    public boolean f39667b4;
    public VerifyData bindVerifyData;
    public Double birthdate;
    public BloodType bloodType;
    public int code;
    public int countryCode;
    public String email;
    public List<String> ethnicity;
    public FBSignupData fbSignupData;
    public String firebaseId;
    public Gender gender;
    public boolean hideContacts;
    public boolean hideMutualContacts;
    public List<String> intlFriendPurpose;
    public List<String> language;
    public String name;
    public IntlGender newGender;
    public List<String> newProfilePath;
    public OtherSettingsOthers others;
    public String password;
    public String phoneNumber;
    public String profileMineType;
    public String profilePath;
    public QualificationType qualificationType;
    public boolean readContactsPermissionGranted;
    public String school;
    public AccountTempApi.SignUpType signUpType;
    public String subGenderOption;
    public String thirdPartyAccessCode;
    public String thirdPartyId;
    public String thirdPartyToken;
    public String thirdPartyUnionid;
    public ThirdPartyValidation thirdPartyValidation;
    public boolean tsd1;
    public boolean tsd2;
    public String verifyType;

    /* JADX INFO: renamed from: bb */
    public boolean f39668bb = true;
    public boolean profileShowGender = false;

    public static String getNonNullPhoneNumber() {
        return TextUtils.isEmpty(uqb0.f180397c0.getSignUpData().phoneNumber) ? "" : uqb0.f180397c0.getSignUpData().phoneNumber;
    }
}
