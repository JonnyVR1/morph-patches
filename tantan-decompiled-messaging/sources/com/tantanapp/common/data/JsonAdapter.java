package com.tantanapp.common.data;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.roj0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class JsonAdapter<T> implements INetParser<T> {

    /* JADX INFO: renamed from: jf */
    public static JsonFactory f56012jf;

    /* JADX INFO: renamed from: aa */
    private JsonAdapter<List<T>> f56013aa = null;

    /* JADX INFO: renamed from: ma */
    private JsonAdapter<Map<String, T>> f56014ma = null;
    public static final JsonAdapter<roj0> UNIT_ADAPTER = new JsonAdapter<roj0>() { // from class: com.tantanapp.common.data.JsonAdapter.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public /* bridge */ /* synthetic */ roj0 parse(JsonParser jsonParser, String str, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parse2(jsonParser, str, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
        public roj0 parse2(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            return roj0.f160388a;
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public void serialize(roj0 roj0Var, JsonGenerator jsonGenerator, boolean z) throws IOException {
            throw new IllegalStateException();
        }
    };
    public static final JsonAdapter<Double> DOUBLE_BOXED_ADAPTER = new JsonAdapter<Double>() { // from class: com.tantanapp.common.data.JsonAdapter.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tantanapp.common.data.JsonAdapter
        public Double parse(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            return Double.valueOf(jsonParser.getValueAsDouble());
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public void serialize(Double d, JsonGenerator jsonGenerator, boolean z) throws IOException {
            jsonGenerator.writeNumber(d.doubleValue());
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public /* bridge */ /* synthetic */ Double parse(JsonParser jsonParser, String str, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parse(jsonParser, str, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final JsonAdapter<Integer> INT_BOXED_ADAPTER = new JsonAdapter<Integer>() { // from class: com.tantanapp.common.data.JsonAdapter.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tantanapp.common.data.JsonAdapter
        public Integer parse(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            return Integer.valueOf(jsonParser.getValueAsInt());
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public void serialize(Integer num, JsonGenerator jsonGenerator, boolean z) throws IOException {
            jsonGenerator.writeNumber(num.intValue());
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public /* bridge */ /* synthetic */ Integer parse(JsonParser jsonParser, String str, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parse(jsonParser, str, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final JsonAdapter<Long> LONG_BOXED_ADAPTER = new JsonAdapter<Long>() { // from class: com.tantanapp.common.data.JsonAdapter.4
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tantanapp.common.data.JsonAdapter
        public Long parse(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            return Long.valueOf(jsonParser.getValueAsLong());
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public void serialize(Long l2, JsonGenerator jsonGenerator, boolean z) throws IOException {
            jsonGenerator.writeNumber(l2.longValue());
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public /* bridge */ /* synthetic */ Long parse(JsonParser jsonParser, String str, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parse(jsonParser, str, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final JsonAdapter<Double> DOUBLE_ADAPTER = new JsonAdapter<Double>() { // from class: com.tantanapp.common.data.JsonAdapter.5
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tantanapp.common.data.JsonAdapter
        public Double parse(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            return Double.valueOf(jsonParser.getValueAsDouble());
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public void serialize(Double d, JsonGenerator jsonGenerator, boolean z) throws IOException {
            jsonGenerator.writeNumber(d.doubleValue());
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public /* bridge */ /* synthetic */ Double parse(JsonParser jsonParser, String str, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parse(jsonParser, str, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final JsonAdapter<Integer> INT_ADAPTER = new JsonAdapter<Integer>() { // from class: com.tantanapp.common.data.JsonAdapter.6
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tantanapp.common.data.JsonAdapter
        public Integer parse(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            return Integer.valueOf(jsonParser.getValueAsInt());
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public void serialize(Integer num, JsonGenerator jsonGenerator, boolean z) throws IOException {
            jsonGenerator.writeNumber(num.intValue());
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public /* bridge */ /* synthetic */ Integer parse(JsonParser jsonParser, String str, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parse(jsonParser, str, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final JsonAdapter<String> STRING_ADAPTER = new JsonAdapter<String>() { // from class: com.tantanapp.common.data.JsonAdapter.7
        @Override // com.tantanapp.common.data.JsonAdapter
        /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
        public String parse2(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return null;
            }
            return jsonParser.getValueAsString();
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public void serialize(String str, JsonGenerator jsonGenerator, boolean z) throws IOException {
            jsonGenerator.writeString(str);
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public /* bridge */ /* synthetic */ String parse(JsonParser jsonParser, String str, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parse2(jsonParser, str, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final JsonAdapter<Boolean> BOOLEAN_BOXED_ADAPTER = new JsonAdapter<Boolean>() { // from class: com.tantanapp.common.data.JsonAdapter.10
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tantanapp.common.data.JsonAdapter
        public Boolean parse(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            return Boolean.valueOf(jsonParser.getValueAsBoolean());
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public void serialize(Boolean bool, JsonGenerator jsonGenerator, boolean z) throws IOException {
            jsonGenerator.writeBoolean(bool.booleanValue());
        }

        @Override // com.tantanapp.common.data.JsonAdapter
        public /* bridge */ /* synthetic */ Boolean parse(JsonParser jsonParser, String str, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parse(jsonParser, str, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static final JsonFactory JSON_FACTORY() {
        if (f56012jf == null) {
            synchronized (JsonAdapter.class) {
                try {
                    if (f56012jf == null) {
                        f56012jf = new JsonFactory();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f56012jf;
    }

    public static <K> List<K> parseArray(JsonParser jsonParser, JsonAdapter<K> jsonAdapter, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
        if (jsonParser.getCurrentToken() != JsonToken.START_ARRAY) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(0);
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            K k = jsonAdapter.parse(jsonParser, str, arrayList, dataChecker);
            if (k != null) {
                arrayList2.add(k);
            }
        }
        return arrayList2;
    }

    public static <K> HashMap<String, K> parseMap(JsonParser jsonParser, JsonAdapter<K> jsonAdapter, String str) throws IOException {
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            return null;
        }
        HashMap<String, K> map = new HashMap<>();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String text = jsonParser.getText();
            jsonParser.nextToken();
            map.put(text, jsonAdapter.parse(jsonParser, str));
        }
        return map;
    }

    public static <K> void serializeArray(List<K> list, JsonGenerator jsonGenerator, JsonAdapter<K> jsonAdapter) throws IOException {
        if (list == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartArray();
        for (K k : list) {
            if (k != null) {
                jsonAdapter.serialize(k, jsonGenerator, true);
            }
        }
        jsonGenerator.writeEndArray();
    }

    public static <K> void serializeMap(Map<String, K> map, JsonGenerator jsonGenerator, JsonAdapter<K> jsonAdapter) throws IOException {
        if (map == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        for (Map.Entry<String, K> entry : map.entrySet()) {
            jsonGenerator.writeFieldName(entry.getKey());
            jsonAdapter.serialize(entry.getValue(), jsonGenerator, true);
        }
        jsonGenerator.writeEndObject();
    }

    public JsonAdapter<List<T>> ARRAY_ADAPTER() {
        if (this.f56013aa == null) {
            this.f56013aa = ARRAY_ADAPTER(this);
        }
        return this.f56013aa;
    }

    public JsonAdapter<Map<String, T>> MAP_ADAPTER() {
        if (this.f56014ma == null) {
            this.f56014ma = MAP_ADAPTER(this);
        }
        return this.f56014ma;
    }

    public Class getDataClass() {
        return null;
    }

    public abstract T parse(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException;

    public T parse(byte[] bArr, String str) throws IOException {
        JsonParser jsonParserCreateParser = JSON_FACTORY().createParser(bArr);
        jsonParserCreateParser.nextToken();
        T t = parse(jsonParserCreateParser, str);
        jsonParserCreateParser.close();
        return t;
    }

    public String serialize(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            JsonGenerator jsonGeneratorCreateGenerator = JSON_FACTORY().createGenerator(stringWriter);
            serialize(t, jsonGeneratorCreateGenerator, true);
            jsonGeneratorCreateGenerator.close();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public abstract void serialize(T t, JsonGenerator jsonGenerator, boolean z) throws IOException;

    public static <T> JsonAdapter<List<T>> ARRAY_ADAPTER(JsonAdapter<T> jsonAdapter) {
        return new JsonAdapter<List<T>>() { // from class: com.tantanapp.common.data.JsonAdapter.9
            @Override // com.tantanapp.common.data.JsonAdapter
            public List<T> parse(byte[] bArr, String str) throws IOException {
                if (bArr == null) {
                    return null;
                }
                return bArr.length == 2 ? new ArrayList(0) : (List) super.parse(bArr, str);
            }

            @Override // com.tantanapp.common.data.JsonAdapter
            public void serialize(List<T> list, JsonGenerator jsonGenerator, boolean z) throws IOException {
                JsonAdapter.serializeArray(list, jsonGenerator, JsonAdapter.this);
            }

            @Override // com.tantanapp.common.data.JsonAdapter
            public List<T> parse(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
                return JsonAdapter.parseArray(jsonParser, JsonAdapter.this, str, arrayList, dataChecker);
            }

            @Override // com.tantanapp.common.data.JsonAdapter
            public /* bridge */ /* synthetic */ Object parse(JsonParser jsonParser, String str, ArrayList arrayList, DataChecker dataChecker) throws IOException {
                return parse(jsonParser, str, (ArrayList<BaseData>) arrayList, dataChecker);
            }
        };
    }

    public static <T> JsonAdapter<Map<String, T>> MAP_ADAPTER(JsonAdapter<T> jsonAdapter) {
        return new JsonAdapter<Map<String, T>>() { // from class: com.tantanapp.common.data.JsonAdapter.8
            @Override // com.tantanapp.common.data.JsonAdapter
            public Map<String, T> parse(byte[] bArr, String str) throws IOException {
                if (bArr == null) {
                    return null;
                }
                return bArr.length == 2 ? new HashMap() : (Map) super.parse(bArr, str);
            }

            @Override // com.tantanapp.common.data.JsonAdapter
            public void serialize(Map<String, T> map, JsonGenerator jsonGenerator, boolean z) throws IOException {
                JsonAdapter.serializeMap(map, jsonGenerator, JsonAdapter.this);
            }

            @Override // com.tantanapp.common.data.JsonAdapter
            public Map<String, T> parse(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
                return JsonAdapter.parseMap(jsonParser, JsonAdapter.this, str);
            }

            @Override // com.tantanapp.common.data.JsonAdapter
            public /* bridge */ /* synthetic */ Object parse(JsonParser jsonParser, String str, ArrayList arrayList, DataChecker dataChecker) throws IOException {
                return parse(jsonParser, str, (ArrayList<BaseData>) arrayList, dataChecker);
            }
        };
    }

    public T parse(JsonParser jsonParser, String str) throws IOException {
        return parse(jsonParser, str, null, null);
    }

    public T parse(JsonParser jsonParser, String str, DataChecker dataChecker) throws IOException {
        return parse(jsonParser, str, null, dataChecker);
    }

    public T parse(JsonParser jsonParser) throws IOException {
        return parse(jsonParser, "");
    }

    @Override // com.tantanapp.common.data.INetParser
    public T parse(InputStream inputStream, String str) throws IOException {
        JsonParser jsonParserCreateParser = JSON_FACTORY().createParser(inputStream);
        jsonParserCreateParser.nextToken();
        T t = parse(jsonParserCreateParser, str);
        jsonParserCreateParser.close();
        return t;
    }

    public void serialize(T t, OutputStream outputStream) {
        try {
            JsonGenerator jsonGeneratorCreateGenerator = JSON_FACTORY().createGenerator(outputStream);
            serialize(t, jsonGeneratorCreateGenerator, true);
            jsonGeneratorCreateGenerator.close();
        } catch (IOException unused) {
        }
    }

    @Override // com.tantanapp.common.data.INetParser
    public T parse(InputStream inputStream, String str, DataChecker dataChecker) throws IOException {
        JsonParser jsonParserCreateParser = JSON_FACTORY().createParser(inputStream);
        jsonParserCreateParser.nextToken();
        T t = parse(jsonParserCreateParser, str, dataChecker);
        jsonParserCreateParser.close();
        return t;
    }

    public T parse(InputStream inputStream) throws IOException {
        return parse(inputStream, "");
    }

    public T parse(String str, String str2) throws IOException {
        JsonParser jsonParserCreateParser = JSON_FACTORY().createParser(str);
        jsonParserCreateParser.nextToken();
        T t = parse(jsonParserCreateParser, str2);
        jsonParserCreateParser.close();
        return t;
    }

    public T parse(String str) throws IOException {
        return parse(str, "");
    }
}
