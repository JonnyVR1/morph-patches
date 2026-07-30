package com.google.mlkit.p033nl.languageid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import p149l.lsu0;
import p149l.ohw0;
import p149l.wov0;

/* JADX INFO: loaded from: classes7.dex */
@UsedByNative("language_id_jni.cc")
public final class IdentifiedLanguage {

    /* JADX INFO: renamed from: a */
    public final String f11503a;

    /* JADX INFO: renamed from: b */
    public final float f11504b;

    @UsedByNative("language_id_jni.cc")
    @KeepForSdk
    public IdentifiedLanguage(@NonNull String str, float f) {
        this.f11503a = str;
        this.f11504b = f;
    }

    /* JADX INFO: renamed from: a */
    public float m16879a() {
        return this.f11504b;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m16880b() {
        return this.f11503a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentifiedLanguage)) {
            return false;
        }
        IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
        return Float.compare(identifiedLanguage.f11504b, this.f11504b) == 0 && ohw0.m164485a(this.f11503a, identifiedLanguage.f11503a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11503a, Float.valueOf(this.f11504b)});
    }

    @NonNull
    public String toString() {
        lsu0 lsu0VarM204874a = wov0.m204874a(this);
        lsu0VarM204874a.m151648b("languageTag", this.f11503a);
        lsu0VarM204874a.m151647a("confidence", this.f11504b);
        return lsu0VarM204874a.toString();
    }
}
