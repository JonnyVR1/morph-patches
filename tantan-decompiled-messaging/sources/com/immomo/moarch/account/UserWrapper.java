package com.immomo.moarch.account;

import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public abstract class UserWrapper implements IUser {
    protected Class<? extends IUser> baseUserClass;
    protected IUser mBase;

    public abstract <T extends IUser> T getAdaptiveUser();

    @Override // com.immomo.moarch.account.IUser
    public int getAge() {
        IUser iUser = this.mBase;
        if (iUser != null) {
            return iUser.getAge();
        }
        return 0;
    }

    @Override // com.immomo.moarch.account.IUser
    public String getAvatar() {
        IUser iUser = this.mBase;
        if (iUser != null) {
            return iUser.getAvatar();
        }
        return null;
    }

    public IUser getBase() {
        return this.mBase;
    }

    @Override // com.immomo.moarch.account.IUser
    public String getDisplayName() {
        IUser iUser = this.mBase;
        if (iUser != null) {
            return iUser.getDisplayName();
        }
        return null;
    }

    @Override // com.immomo.moarch.account.IUser
    public int getGender() {
        IUser iUser = this.mBase;
        if (iUser != null) {
            return iUser.getGender();
        }
        return 0;
    }

    @Override // com.immomo.moarch.account.IUser
    public String getId() {
        IUser iUser = this.mBase;
        if (iUser != null) {
            return iUser.getId();
        }
        return null;
    }

    @Override // com.immomo.moarch.account.IUser
    public String getName() {
        IUser iUser = this.mBase;
        if (iUser != null) {
            return iUser.getName();
        }
        return null;
    }

    public void readFromParcel(Parcel parcel) {
        this.baseUserClass = (Class) parcel.readSerializable();
        try {
            this.mBase = (IUser) parcel.readSerializable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setUser(IUser iUser) {
        this.mBase = iUser;
        if (iUser != null) {
            this.baseUserClass = iUser.getClass();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.baseUserClass);
        try {
            parcel.writeSerializable(this.mBase);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
