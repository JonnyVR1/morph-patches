package com.google.firebase.iid;

/* JADX INFO: loaded from: classes7.dex */
final class InstanceIdResultImpl implements InstanceIdResult {

    /* JADX INFO: renamed from: id */
    private final String f11459id;
    private final String token;

    public InstanceIdResultImpl(String str, String str2) {
        this.f11459id = str;
        this.token = str2;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public String getId() {
        return this.f11459id;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public String getToken() {
        return this.token;
    }
}
