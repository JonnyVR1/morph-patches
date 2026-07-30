package com.immomo.moarch.account;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;
import p149l.dqi0;
import p149l.yek0;

/* JADX INFO: loaded from: classes7.dex */
public class AccountUser extends UserWrapper implements Serializable, Parcelable {
    public static final Parcelable.Creator<AccountUser> CREATOR = new C3806a();
    public static final int NO_LOGIN_TYPE = -1;
    public static final int PHONE_LOGIN = 1;
    public static final int THIRD_PARTY_LOGIN = 2;
    private String accountName;
    private String areaCode;
    private transient Object instanceHolder1;
    private transient Object instanceHolder2;
    private transient Object instanceHolder3;
    private boolean isGuest;
    private boolean isOnline;
    private int loginType;
    private String loginWithoutPwdToken;
    private String phoneNumber;
    Boolean receiptNotification;
    private String session;
    Integer unReadMessage;
    String unReadTip;
    private String userId;

    /* JADX INFO: renamed from: com.immomo.moarch.account.AccountUser$a */
    public static class C3806a implements Parcelable.Creator<AccountUser> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountUser createFromParcel(Parcel parcel) {
            return new AccountUser(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AccountUser[] newArray(int i) {
            return new AccountUser[i];
        }
    }

    public AccountUser(Parcel parcel) {
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AccountUser) {
            return TextUtils.equals(getId(), ((AccountUser) obj).getId());
        }
        return this == obj;
    }

    public String getAccountName() {
        return TextUtils.isEmpty(this.accountName) ? getId() : this.accountName;
    }

    @Override // com.immomo.moarch.account.UserWrapper
    public <T extends IUser> T getAdaptiveUser() {
        IUser iUser;
        String str;
        if (this.baseUserClass != null && (iUser = this.mBase) != null) {
            if (iUser != null && iUser.getId() != null && (str = this.userId) != null && !str.equals(this.mBase.getId())) {
                yek0.m214351a("userId not match : %s %s", new Object[]{this.mBase.getId(), this.userId});
                return null;
            }
            if (this.baseUserClass.isInstance(this)) {
                return this;
            }
            if (this.baseUserClass.isInstance(this.mBase)) {
                return (T) this.mBase;
            }
        }
        return null;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    @Override // com.immomo.moarch.account.UserWrapper, com.immomo.moarch.account.IUser
    public String getId() {
        String str;
        IUser iUser = this.mBase;
        if (iUser == null || iUser.getId() == null || (str = this.userId) == null || str.equals(this.mBase.getId())) {
            return this.userId;
        }
        yek0.m214351a("userId not match : %s %s", new Object[]{this.mBase.getId(), this.userId});
        return null;
    }

    public <T> T getInstanceHolder1() {
        return (T) this.instanceHolder1;
    }

    public <T> T getInstanceHolder2() {
        return (T) this.instanceHolder2;
    }

    public <T> T getInstanceHolder3() {
        return (T) this.instanceHolder3;
    }

    public int getLoginType() {
        return this.loginType;
    }

    public String getLoginWithoutPwdToken() {
        return this.loginWithoutPwdToken;
    }

    public String getNonCheckId() {
        return this.userId;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getSession() {
        return this.session;
    }

    public int getUnReadMessage() {
        Integer num = this.unReadMessage;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public String getUnReadTip() {
        return this.unReadTip;
    }

    public boolean hasLogin() {
        return !TextUtils.isEmpty(this.session);
    }

    public boolean isGuest() {
        return this.isGuest;
    }

    public boolean isOnline() {
        return this.isOnline;
    }

    public boolean isReceiptNotification() {
        Boolean bool = this.receiptNotification;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.immomo.moarch.account.UserWrapper
    public void readFromParcel(Parcel parcel) {
        this.isOnline = parcel.readByte() != 0;
        this.session = parcel.readString();
        this.userId = parcel.readString();
        this.unReadMessage = (Integer) parcel.readSerializable();
        this.receiptNotification = (Boolean) parcel.readSerializable();
        this.unReadTip = parcel.readString();
        super.readFromParcel(parcel);
    }

    public void setAccountName(String str) {
        this.accountName = str;
    }

    public void setAreaCode(String str) {
        this.areaCode = str;
    }

    public void setGuest(boolean z) {
        this.isGuest = z;
    }

    public <T> void setInstanceHolder1(T t) {
        this.instanceHolder1 = t;
    }

    public <T> void setInstanceHolder2(T t) {
        this.instanceHolder2 = t;
    }

    public <T> void setInstanceHolder3(T t) {
        this.instanceHolder3 = t;
    }

    public void setLoginType(int i) {
        this.loginType = i;
    }

    public void setLoginWithoutPwdToken(String str) {
        this.loginWithoutPwdToken = str;
    }

    public void setOnline(boolean z) {
        this.isOnline = z;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setReceiptNotification(boolean z) {
        this.receiptNotification = Boolean.valueOf(z);
    }

    public void setSession(String str) {
        this.session = str;
    }

    public void setUnReadMessage(int i) {
        this.unReadMessage = Integer.valueOf(i);
    }

    public void setUnReadTip(String str) {
        this.unReadTip = str;
    }

    @Override // com.immomo.moarch.account.UserWrapper
    public void setUser(IUser iUser) {
        String str;
        if (iUser == null || iUser.getId() == null || (str = this.userId) == null || str.equals(iUser.getId())) {
            super.setUser(iUser);
        } else {
            dqi0.m113073a("userId not match : %s %s", new Object[]{iUser.getId(), this.userId});
        }
    }

    public void setUserId(String str) {
        IUser iUser = this.mBase;
        if (iUser == null || iUser.getId() == null || str == null || str.equals(this.mBase.getId())) {
            this.userId = str;
        } else {
            dqi0.m113073a("userId not match : %s %s", new Object[]{this.mBase.getId(), str});
        }
    }

    @Override // com.immomo.moarch.account.UserWrapper, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isOnline ? (byte) 1 : (byte) 0);
        parcel.writeString(this.session);
        parcel.writeString(this.userId);
        parcel.writeSerializable(this.unReadMessage);
        parcel.writeSerializable(this.receiptNotification);
        parcel.writeString(this.unReadTip);
        super.writeToParcel(parcel, i);
    }

    public AccountUser() {
    }
}
