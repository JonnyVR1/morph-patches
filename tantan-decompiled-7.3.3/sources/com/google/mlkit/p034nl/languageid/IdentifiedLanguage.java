package com.google.mlkit.p034nl.languageid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import p153l.cyv0;
import p153l.r1v0;
import p153l.uqw0;

/* JADX INFO: loaded from: classes7.dex */
@UsedByNative("language_id_jni.cc")
public final class IdentifiedLanguage {

    /* JADX INFO: renamed from: a */
    public final String f11540a;

    /* JADX INFO: renamed from: b */
    public final float f11541b;

    @UsedByNative("language_id_jni.cc")
    @KeepForSdk
    public IdentifiedLanguage(@NonNull String str, float f) {
        this.f11540a = str;
        this.f11541b = f;
    }

    /* JADX INFO: renamed from: a */
    public float m16934a() {
        return this.f11541b;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m16935b() {
        return this.f11540a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentifiedLanguage)) {
            return false;
        }
        IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
        return Float.compare(identifiedLanguage.f11541b, this.f11541b) == 0 && uqw0.m197378a(this.f11540a, identifiedLanguage.f11540a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11540a, Float.valueOf(this.f11541b)});
    }

    @NonNull
    public String toString() {
        r1v0 r1v0VarM113251a = cyv0.m113251a(this);
        r1v0VarM113251a.m179455b("languageTag", this.f11540a);
        r1v0VarM113251a.m179454a("confidence", this.f11541b);
        return r1v0VarM113251a.toString();
    }
}
