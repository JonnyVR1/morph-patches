package com.hihonor.push.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import p153l.mnd0;

/* JADX INFO: renamed from: com.hihonor.push.sdk.h1 */
/* JADX INFO: loaded from: classes7.dex */
public class C3657h1 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f12622a;

    public C3657h1(Context context, String str) {
        if (context == null) {
            mnd0.m159157a("context is null!");
            throw null;
        }
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("move_to_de_records", 0);
        if (contextCreateDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str) & (!sharedPreferences.getBoolean(str, false))) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(str, true);
            editorEdit.apply();
        }
        this.f12622a = contextCreateDeviceProtectedStorageContext.getSharedPreferences(str, 0);
    }

    /* JADX INFO: renamed from: a */
    public boolean m18593a(String str, String str2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f12622a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return false;
        }
        return editorEdit.putString(str, str2).commit();
    }

    /* JADX INFO: renamed from: a */
    public boolean m18592a(String str) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f12622a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return false;
        }
        return editorEdit.remove(str).commit();
    }
}
