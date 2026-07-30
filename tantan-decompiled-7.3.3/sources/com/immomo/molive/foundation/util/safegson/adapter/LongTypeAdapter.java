package com.immomo.molive.foundation.util.safegson.adapter;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorHandleTypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class LongTypeAdapter extends SafeErrorHandleTypeAdapter<Long> {

    /* JADX INFO: renamed from: com.immomo.molive.foundation.util.safegson.adapter.LongTypeAdapter$a */
    public static /* synthetic */ class C3961a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f13819a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f13819a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13819a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long read2(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i = C3961a.f13819a[jsonTokenPeek.ordinal()];
        if (i == 1) {
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        if (i != 2) {
            mo19603b(jsonReader, TypeToken.get(Long.class), jsonReader.getPath(), jsonTokenPeek);
            jsonReader.skipValue();
            return 0L;
        }
        String strNextString = jsonReader.nextString();
        mo19603b(jsonReader, TypeToken.get(Long.class), jsonReader.getPath(), jsonTokenPeek);
        if (strNextString != null && !"".equals(strNextString)) {
            try {
                return Long.valueOf(Long.parseLong(strNextString));
            } catch (NumberFormatException unused2) {
            }
        }
        return 0L;
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, Long l2) throws IOException {
        jsonWriter.value(l2);
    }
}
