package com.tantanapp.common.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ConvertedJsonAdapter<T, K> extends JsonAdapter<K> {
    private final JsonAdapter<T> from;

    public ConvertedJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.from = jsonAdapter;
    }

    public abstract T from(K k);

    @Override // com.tantanapp.common.data.JsonAdapter
    public K parse(JsonParser jsonParser, String str) throws IOException {
        return mo59726to(this.from.parse(jsonParser, str));
    }

    @Override // com.tantanapp.common.data.JsonAdapter
    public void serialize(K k, JsonGenerator jsonGenerator, boolean z) throws IOException {
        this.from.serialize(from(k), jsonGenerator, z);
    }

    /* JADX INFO: renamed from: to */
    public abstract K mo59726to(T t);

    @Override // com.tantanapp.common.data.JsonAdapter
    public K parse(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
        return parse(jsonParser, str);
    }
}
