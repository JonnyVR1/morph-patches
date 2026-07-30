package com.hihonor.push.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import p149l.jfd0;

/* JADX INFO: renamed from: com.hihonor.push.sdk.h1 */
/* JADX INFO: loaded from: classes7.dex */
public class C3498h1 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f11881a;

    public C3498h1(Context context, String str) {
        if (context == null) {
            jfd0.m141176a("context is null!");
            throw null;
        }
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("move_to_de_records", 0);
        if (contextCreateDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str) & (!sharedPreferences.getBoolean(str, false))) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(str, true);
            editorEdit.apply();
        }
        this.f11881a = contextCreateDeviceProtectedStorageContext.getSharedPreferences(str, 0);
    }

    /* JADX INFO: renamed from: a */
    public boolean m17516a(String str, String str2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f11881a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return false;
        }
        return editorEdit.putString(str, str2).commit();
    }

    /* JADX INFO: renamed from: a */
    public boolean m17515a(String str) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f11881a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return false;
        }
        return editorEdit.remove(str).commit();
    }
}
