package com.immomo.molive.foundation.util.safegson.adapter;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorHandleTypeAdapter;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public class BigDecimalTypeAdapter extends SafeErrorHandleTypeAdapter<BigDecimal> {

    /* JADX INFO: renamed from: com.immomo.molive.foundation.util.safegson.adapter.BigDecimalTypeAdapter$a */
    public static /* synthetic */ class C3956a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f13814a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f13814a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13814a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public BigDecimal read2(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i = C3956a.f13814a[jsonTokenPeek.ordinal()];
        if (i != 1 && i != 2) {
            mo19603b(jsonReader, TypeToken.get(BigDecimal.class), jsonReader.getPath(), jsonTokenPeek);
            jsonReader.skipValue();
            return new BigDecimal(0);
        }
        String strNextString = jsonReader.nextString();
        if (strNextString == null || "".equals(strNextString)) {
            return new BigDecimal(0);
        }
        try {
            return new BigDecimal(strNextString);
        } catch (NumberFormatException unused) {
            return new BigDecimal(0);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
        jsonWriter.value(bigDecimal);
    }
}
