package com.tantanapp.common.data;

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.lang.Enum;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class EnumJsonAdapter<T extends Enum> extends JsonAdapter<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public final T[] JAVA;
    private final String[] json;

    public EnumJsonAdapter(String[] strArr, T[] tArr) {
        this.json = strArr;
        this.JAVA = tArr;
    }

    @Override // com.tantanapp.common.data.JsonAdapter
    public final T parse(JsonParser jsonParser, String str) throws IOException {
        String valueAsString = jsonParser.getValueAsString();
        if (TextUtils.isEmpty(valueAsString)) {
            return null;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.json;
            if (i >= strArr.length) {
                return this.JAVA[0];
            }
            if (strArr[i].equals(valueAsString)) {
                return this.JAVA[i];
            }
            i++;
        }
    }

    @Override // com.tantanapp.common.data.JsonAdapter
    public final void serialize(T t, JsonGenerator jsonGenerator, boolean z) throws IOException {
        if (t == null) {
            jsonGenerator.writeNull();
            return;
        }
        int i = 0;
        while (true) {
            T[] tArr = this.JAVA;
            if (i >= tArr.length) {
                return;
            }
            if (tArr[i] == t) {
                jsonGenerator.writeString(this.json[i]);
                return;
            }
            i++;
        }
    }

    @Override // com.tantanapp.common.data.JsonAdapter
    public /* bridge */ /* synthetic */ Object parse(JsonParser jsonParser, String str, ArrayList arrayList, DataChecker dataChecker) throws IOException {
        return parse(jsonParser, str, (ArrayList<BaseData>) arrayList, dataChecker);
    }

    @Override // com.tantanapp.common.data.JsonAdapter
    public T parse(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
        return parse(jsonParser, str, dataChecker);
    }
}
