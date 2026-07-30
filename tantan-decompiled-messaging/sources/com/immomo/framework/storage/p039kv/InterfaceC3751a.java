package com.immomo.framework.storage.p039kv;

import android.content.ContentValues;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.immomo.framework.storage.kv.a */
/* JADX INFO: loaded from: classes7.dex */
interface InterfaceC3751a {
    /* JADX INFO: renamed from: a */
    long mo18345a(String str, Long l2);

    /* JADX INFO: renamed from: b */
    boolean mo18346b(@Nullable ContentValues contentValues);

    /* JADX INFO: renamed from: c */
    boolean mo18347c(String str, @Nullable Object obj);

    /* JADX INFO: renamed from: d */
    boolean mo18348d(String str, boolean z);

    /* JADX INFO: renamed from: e */
    boolean mo18349e(String str);

    int getInt(String str, int i);

    String getString(String str, @Nullable String str2);

    void remove(String str);
}
