package com.immomo.molive.foundation.util.safegson.adapter;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorHandleTypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class DoubleTypeAdapter extends SafeErrorHandleTypeAdapter<Double> {

    /* JADX INFO: renamed from: com.immomo.molive.foundation.util.safegson.adapter.DoubleTypeAdapter$a */
    public static /* synthetic */ class C3958a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f13816a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f13816a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13816a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, Double d) throws IOException {
        jsonWriter.value(d);
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public Double read2(JsonReader jsonReader) throws IOException {
        Double dValueOf = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i = C3958a.f13816a[jsonTokenPeek.ordinal()];
        if (i == 1) {
            return Double.valueOf(jsonReader.nextDouble());
        }
        if (i != 2) {
            mo19603b(jsonReader, TypeToken.get(Double.class), jsonReader.getPath(), jsonTokenPeek);
            jsonReader.skipValue();
            return dValueOf;
        }
        mo19603b(jsonReader, TypeToken.get(Double.class), jsonReader.getPath(), jsonTokenPeek);
        String strNextString = jsonReader.nextString();
        if (strNextString != null && !"".equals(strNextString)) {
            try {
                return Double.valueOf(Double.parseDouble(strNextString));
            } catch (NumberFormatException unused) {
            }
        }
        return dValueOf;
    }
}
