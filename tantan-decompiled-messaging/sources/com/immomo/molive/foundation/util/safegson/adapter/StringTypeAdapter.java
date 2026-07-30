package com.immomo.molive.foundation.util.safegson.adapter;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorHandleTypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class StringTypeAdapter extends SafeErrorHandleTypeAdapter<String> {

    /* JADX INFO: renamed from: com.immomo.molive.foundation.util.safegson.adapter.StringTypeAdapter$a */
    public static /* synthetic */ class C3819a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f13126a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f13126a = iArr;
            try {
                iArr[JsonToken.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13126a[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public String read2(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i = C3819a.f13126a[jsonTokenPeek.ordinal()];
        if (i == 1 || i == 2) {
            return jsonReader.nextString();
        }
        mo18623b(jsonReader, TypeToken.get(String.class), jsonReader.getPath(), jsonTokenPeek);
        jsonReader.skipValue();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, String str) throws IOException {
        jsonWriter.value(str);
    }
}
