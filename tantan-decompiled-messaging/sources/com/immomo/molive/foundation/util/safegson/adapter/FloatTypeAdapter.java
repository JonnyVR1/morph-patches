package com.immomo.molive.foundation.util.safegson.adapter;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorHandleTypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class FloatTypeAdapter extends SafeErrorHandleTypeAdapter<Float> {

    /* JADX INFO: renamed from: com.immomo.molive.foundation.util.safegson.adapter.FloatTypeAdapter$a */
    public static /* synthetic */ class C3816a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f13123a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f13123a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13123a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, Float f) throws IOException {
        jsonWriter.value(f);
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public Float read2(JsonReader jsonReader) throws IOException {
        Float fValueOf = Float.valueOf(0.0f);
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i = C3816a.f13123a[jsonTokenPeek.ordinal()];
        if (i == 1) {
            return Float.valueOf((float) jsonReader.nextDouble());
        }
        if (i != 2) {
            mo18623b(jsonReader, TypeToken.get(Float.class), jsonReader.getPath(), jsonTokenPeek);
            jsonReader.skipValue();
            return fValueOf;
        }
        mo18623b(jsonReader, TypeToken.get(Float.class), jsonReader.getPath(), jsonTokenPeek);
        String strNextString = jsonReader.nextString();
        if (strNextString != null && !"".equals(strNextString)) {
            try {
                return Float.valueOf(Float.parseFloat(strNextString));
            } catch (NumberFormatException unused) {
            }
        }
        return fValueOf;
    }
}
