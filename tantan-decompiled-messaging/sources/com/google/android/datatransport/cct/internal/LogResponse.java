package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes6.dex */
public abstract class LogResponse {
    private static final String LOG_TAG = "LogResponseInternal";

    public static LogResponse create(long j) {
        return new AutoValue_LogResponse(j);
    }

    @NonNull
    public static LogResponse fromJson(@NonNull Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        LogResponse logResponseCreate = create(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return logResponseCreate;
                    }
                    LogResponse logResponseCreate2 = create(jsonReader.nextLong());
                    jsonReader.close();
                    return logResponseCreate2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public abstract long getNextRequestWaitMillis();
}
