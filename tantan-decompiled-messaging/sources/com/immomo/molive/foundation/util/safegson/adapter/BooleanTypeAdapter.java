package com.immomo.molive.foundation.util.safegson.adapter;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorHandleTypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class BooleanTypeAdapter extends SafeErrorHandleTypeAdapter<Boolean> {

    /* JADX INFO: renamed from: com.immomo.molive.foundation.util.safegson.adapter.BooleanTypeAdapter$a */
    public static /* synthetic */ class C3814a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f13121a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f13121a = iArr;
            try {
                iArr[JsonToken.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13121a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13121a[JsonToken.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public Boolean read2(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i = C3814a.f13121a[jsonTokenPeek.ordinal()];
        if (i == 1) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i == 2) {
            mo18623b(jsonReader, TypeToken.get(Boolean.class), jsonReader.getPath(), jsonTokenPeek);
            return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
        }
        if (i == 3) {
            mo18623b(jsonReader, TypeToken.get(Boolean.class), jsonReader.getPath(), jsonTokenPeek);
            return Boolean.valueOf(jsonReader.nextInt() != 0);
        }
        mo18623b(jsonReader, TypeToken.get(Boolean.class), jsonReader.getPath(), jsonTokenPeek);
        jsonReader.skipValue();
        return Boolean.FALSE;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
        jsonWriter.value(bool);
    }
}
