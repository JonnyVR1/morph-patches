package com.immomo.moarch.account.def;

import com.immomo.moarch.account.IUser;

/* JADX INFO: loaded from: classes7.dex */
public class SimpleAccountUser implements IUser {
    private String userId;

    public SimpleAccountUser(String str) {
        this.userId = str;
    }

    @Override // com.immomo.moarch.account.IUser
    public int getAge() {
        return 0;
    }

    @Override // com.immomo.moarch.account.IUser
    public String getAvatar() {
        return "";
    }

    @Override // com.immomo.moarch.account.IUser
    public String getDisplayName() {
        return "";
    }

    @Override // com.immomo.moarch.account.IUser
    public int getGender() {
        return 0;
    }

    @Override // com.immomo.moarch.account.IUser
    public String getId() {
        return this.userId;
    }

    @Override // com.immomo.moarch.account.IUser
    public String getName() {
        return "";
    }
}
