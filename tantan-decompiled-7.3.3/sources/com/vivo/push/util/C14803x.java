package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.vivo.push.util.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C14803x implements InterfaceC14783d {

    /* JADX INFO: renamed from: a */
    private static String f61985a = "SpCache";

    /* JADX INFO: renamed from: b */
    private static String f61986b = "com.vivo.push.cache";

    /* JADX INFO: renamed from: c */
    private SharedPreferences f61987c;

    @Override // com.vivo.push.util.InterfaceC14783d
    /* JADX INFO: renamed from: a */
    public final String mo86142a(String str, String str2) {
        String string = this.f61987c.getString(str, str2);
        C14795p.m86192d(f61985a, "getString " + str + " is " + string);
        return string;
    }

    @Override // com.vivo.push.util.InterfaceC14783d
    /* JADX INFO: renamed from: b */
    public final void mo86144b(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f61987c.edit();
        if (editorEdit == null) {
            C14795p.m86186b(f61985a, "putString error by ".concat(String.valueOf(str)));
            return;
        }
        editorEdit.putString(str, str2);
        C14781b.m86128a(editorEdit);
        C14795p.m86192d(f61985a, "putString by ".concat(String.valueOf(str)));
    }

    @Override // com.vivo.push.util.InterfaceC14783d
    /* JADX INFO: renamed from: a */
    public final boolean mo86143a(Context context) {
        if (this.f61987c != null) {
            return true;
        }
        this.f61987c = context.getSharedPreferences(f61986b, 0);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m86221a() {
        SharedPreferences.Editor editorEdit = this.f61987c.edit();
        if (editorEdit != null) {
            editorEdit.clear();
            C14781b.m86128a(editorEdit);
        }
        C14795p.m86192d(f61985a, "system cache is cleared");
    }
}
