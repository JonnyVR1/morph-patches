package com.immomo.molive.foundation.util.safegson.adapter;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorHandleTypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class IntegerTypeAdapter extends SafeErrorHandleTypeAdapter<Integer> {

    /* JADX INFO: renamed from: com.immomo.molive.foundation.util.safegson.adapter.IntegerTypeAdapter$a */
    public static /* synthetic */ class C3817a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f13124a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f13124a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13124a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Integer read2(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i = C3817a.f13124a[jsonTokenPeek.ordinal()];
        if (i == 1) {
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (NumberFormatException unused) {
                return Integer.valueOf((int) jsonReader.nextDouble());
            }
        }
        if (i != 2) {
            mo18623b(jsonReader, TypeToken.get(Integer.class), jsonReader.getPath(), jsonTokenPeek);
            jsonReader.skipValue();
            return 0;
        }
        mo18623b(jsonReader, TypeToken.get(Integer.class), jsonReader.getPath(), jsonTokenPeek);
        String strNextString = jsonReader.nextString();
        if (strNextString != null && !"".equals(strNextString)) {
            try {
                return Integer.valueOf(Integer.parseInt(strNextString));
            } catch (NumberFormatException unused2) {
            }
        }
        return 0;
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, Integer num) throws IOException {
        jsonWriter.value(num);
    }
}
