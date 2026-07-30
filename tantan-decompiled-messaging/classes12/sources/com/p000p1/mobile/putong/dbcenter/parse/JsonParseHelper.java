package com.p000p1.mobile.putong.dbcenter.parse;

import android.text.TextUtils;
import android.util.Pair;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class JsonParseHelper {
    private static void lodError(String str, Exception exc) {
    }

    private static void parseArray(String str, JsonParser jsonParser, JsonGenerator jsonGenerator) {
        if (jsonParser.getCurrentToken() == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                jsonGenerator.writeStartArray();
            } else {
                jsonGenerator.writeArrayFieldStart(str);
            }
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                readJson(jsonParser, jsonGenerator);
            }
            jsonGenerator.writeEndArray();
            jsonParser.skipChildren();
        } catch (Exception e) {
            CrashHelper.c(e);
            lodError("parseArray", e);
        }
    }

    public static <T extends ValueObject> List<T> parseList(String str, JsonAdapter<T> jsonAdapter) {
        ArrayList arrayList = new ArrayList();
        try {
            List<T> list = (List) jsonAdapter.ARRAY_ADAPTER().parse(str);
            try {
                if (!vwb.J(list)) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().nullCheck();
                    }
                }
                return list;
            } catch (Exception unused) {
                return list;
            }
        } catch (Exception unused2) {
            return arrayList;
        }
    }

    private static void parseObj(String str, JsonParser jsonParser, JsonGenerator jsonGenerator) {
        if (jsonParser.getCurrentToken() == null) {
            return;
        }
        try {
            if (jsonParser.getCurrentToken() == null) {
                jsonParser.nextToken();
            }
            if (TextUtils.isEmpty(str)) {
                jsonGenerator.writeStartObject();
            } else {
                jsonGenerator.writeObjectFieldStart(str);
            }
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                readJson(jsonParser, jsonGenerator);
            }
            jsonGenerator.writeEndObject();
            jsonParser.skipChildren();
        } catch (Exception e) {
            CrashHelper.c(e);
            lodError("parseObj", e);
        }
    }

    public static int parseTimes(ArrayList<Pair<BaseData, ObjectJsonAdapter<BaseData>>> arrayList, String str) {
        int i = 0;
        for (Pair<BaseData, ObjectJsonAdapter<BaseData>> pair : arrayList) {
            String str2 = str;
            if (((ObjectJsonAdapter) pair.second).parseFieldCheck((BaseData) pair.first, str2, null, null, null, null)) {
                i++;
            }
            str = str2;
        }
        return i;
    }

    private static void parseValue(String str, JsonParser jsonParser, JsonGenerator jsonGenerator) {
        try {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_STRING) {
                if (TextUtils.isEmpty(str)) {
                    jsonGenerator.writeString(jsonParser.getValueAsString());
                } else {
                    jsonGenerator.writeStringField(str, jsonParser.getValueAsString());
                }
            } else if (currentToken == JsonToken.VALUE_NUMBER_INT) {
                if (TextUtils.isEmpty(str)) {
                    jsonGenerator.writeNumber(jsonParser.getValueAsLong());
                } else {
                    jsonGenerator.writeNumberField(str, jsonParser.getValueAsLong());
                }
            } else if (currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
                if (TextUtils.isEmpty(str)) {
                    jsonGenerator.writeNumber(jsonParser.getFloatValue());
                } else {
                    jsonGenerator.writeNumberField(str, jsonParser.getFloatValue());
                }
            } else if (currentToken == JsonToken.VALUE_NULL) {
                if (TextUtils.isEmpty(str)) {
                    jsonGenerator.writeNull();
                } else {
                    jsonGenerator.writeNullField(str);
                }
            } else if (currentToken == JsonToken.VALUE_FALSE) {
                if (TextUtils.isEmpty(str)) {
                    jsonGenerator.writeBoolean(false);
                } else {
                    jsonGenerator.writeBooleanField(str, false);
                }
            } else if (currentToken == JsonToken.VALUE_TRUE) {
                if (TextUtils.isEmpty(str)) {
                    jsonGenerator.writeBoolean(true);
                } else {
                    jsonGenerator.writeBooleanField(str, true);
                }
            } else if (TextUtils.isEmpty(str)) {
                jsonGenerator.writeString(jsonParser.getValueAsString());
            } else {
                jsonGenerator.writeStringField(str, jsonParser.getValueAsString());
            }
            jsonParser.skipChildren();
        } catch (Exception e) {
            CrashHelper.c(e);
            lodError("parseValue", e);
        }
    }

    public static void readJson(JsonParser jsonParser, JsonGenerator jsonGenerator) {
        if (jsonParser.getCurrentToken() == null) {
            return;
        }
        try {
            String currentName = jsonParser.getCurrentName();
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                parseArray(currentName, jsonParser, jsonGenerator);
                return;
            }
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                parseObj(currentName, jsonParser, jsonGenerator);
            } else if (jsonParser.getCurrentToken() != JsonToken.FIELD_NAME) {
                parseValue(currentName, jsonParser, jsonGenerator);
            } else {
                jsonParser.nextToken();
                readJson(jsonParser, jsonGenerator);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            lodError("readJson", e);
        }
    }

    public static void readJsonBegin(JsonParser jsonParser, JsonGenerator jsonGenerator) {
        try {
            if (jsonParser.getCurrentToken() == null) {
                jsonParser.nextToken();
            }
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                parseArray(null, jsonParser, jsonGenerator);
            } else if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                parseObj(null, jsonParser, jsonGenerator);
            } else {
                parseValue(null, jsonParser, jsonGenerator);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            lodError("readJsonBegin", e);
        }
    }
}
