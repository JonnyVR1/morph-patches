package com.p051p1.mobile.putong.data;

import com.p051p1.mobile.putong.api.api.AccountTempApi;

/* JADX INFO: loaded from: classes12.dex */
public class SignOutParams {
    private boolean hasContract;
    private String inactiveCategory = "";
    private AccountTempApi.InactiveType inactiveType;
    private boolean isLogOutAb;
    private boolean showUpdateDialog;

    public SignOutParams(boolean z, AccountTempApi.InactiveType inactiveType, boolean z2, boolean z3) {
        this.showUpdateDialog = z;
        this.inactiveType = inactiveType;
        this.hasContract = z2;
        this.isLogOutAb = z3;
    }

    public String getInactiveCategory() {
        return this.inactiveCategory;
    }

    public AccountTempApi.InactiveType getInactiveType() {
        return this.inactiveType;
    }

    public boolean isHasContract() {
        return this.hasContract;
    }

    public boolean isLogOutAb() {
        return this.isLogOutAb;
    }

    public boolean isShowUpdateDialog() {
        return this.showUpdateDialog;
    }

    public void setHasContract(boolean z) {
        this.hasContract = z;
    }

    public void setInactiveCategory(String str) {
        this.inactiveCategory = str;
    }

    public void setInactiveType(AccountTempApi.InactiveType inactiveType) {
        this.inactiveType = inactiveType;
    }

    public void setLogOutAb(boolean z) {
        this.isLogOutAb = z;
    }

    public void setShowUpdateDialog(boolean z) {
        this.showUpdateDialog = z;
    }
}
