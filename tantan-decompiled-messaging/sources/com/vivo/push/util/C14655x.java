package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.vivo.push.util.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C14655x implements InterfaceC14635d {

    /* JADX INFO: renamed from: a */
    private static String f61138a = "SpCache";

    /* JADX INFO: renamed from: b */
    private static String f61139b = "com.vivo.push.cache";

    /* JADX INFO: renamed from: c */
    private SharedPreferences f61140c;

    @Override // com.vivo.push.util.InterfaceC14635d
    /* JADX INFO: renamed from: a */
    public final String mo84971a(String str, String str2) {
        String string = this.f61140c.getString(str, str2);
        C14647p.m85021d(f61138a, "getString " + str + " is " + string);
        return string;
    }

    @Override // com.vivo.push.util.InterfaceC14635d
    /* JADX INFO: renamed from: b */
    public final void mo84973b(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f61140c.edit();
        if (editorEdit == null) {
            C14647p.m85015b(f61138a, "putString error by ".concat(String.valueOf(str)));
            return;
        }
        editorEdit.putString(str, str2);
        C14633b.m84957a(editorEdit);
        C14647p.m85021d(f61138a, "putString by ".concat(String.valueOf(str)));
    }

    @Override // com.vivo.push.util.InterfaceC14635d
    /* JADX INFO: renamed from: a */
    public final boolean mo84972a(Context context) {
        if (this.f61140c != null) {
            return true;
        }
        this.f61140c = context.getSharedPreferences(f61139b, 0);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m85050a() {
        SharedPreferences.Editor editorEdit = this.f61140c.edit();
        if (editorEdit != null) {
            editorEdit.clear();
            C14633b.m84957a(editorEdit);
        }
        C14647p.m85021d(f61138a, "system cache is cleared");
    }
}
