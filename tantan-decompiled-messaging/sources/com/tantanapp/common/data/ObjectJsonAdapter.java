package com.tantanapp.common.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ObjectJsonAdapter<T extends ValueObject> extends JsonAdapter<T> {
    public abstract T newInstance();

    @Override // com.tantanapp.common.data.JsonAdapter
    public T parse(JsonParser jsonParser, String str, DataChecker dataChecker) throws IOException {
        T t = (T) newInstance();
        t.setParsedApiRequest(str);
        if (jsonParser.getCurrentToken() == null) {
            jsonParser.nextToken();
        }
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            t.putParsedField(currentName);
            jsonParser.nextToken();
            parseField(t, currentName, jsonParser, str);
            jsonParser.skipChildren();
        }
        if (dataChecker != null && dataChecker.needCheck(t)) {
            dataChecker.netDataErrorCheck(t);
        }
        t.nullCheck();
        t.onApiParseComplete();
        return t;
    }

    public abstract void parseField(T t, String str, JsonParser jsonParser, String str2) throws IOException;

    @Override // com.tantanapp.common.data.JsonAdapter
    public final void serialize(T t, JsonGenerator jsonGenerator, boolean z) throws IOException {
        if (t == null) {
            jsonGenerator.writeNull();
            return;
        }
        if (z) {
            jsonGenerator.writeStartObject();
        }
        serializeFields(t.beforeApiSerialize(), jsonGenerator);
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public abstract void serializeFields(T t, JsonGenerator jsonGenerator) throws IOException;
}
