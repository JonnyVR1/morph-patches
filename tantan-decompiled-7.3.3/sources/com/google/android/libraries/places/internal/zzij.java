package com.google.android.libraries.places.internal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

/* JADX INFO: loaded from: classes7.dex */
public final class zzij {
    private final Gson zza = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    public final Object zza(String str, Class cls) throws zzfk {
        try {
            return this.zza.fromJson(str, cls);
        } catch (JsonSyntaxException unused) {
            throw new zzfk("Could not convert JSON string to " + cls.getName() + " due to syntax errors.");
        }
    }
}
