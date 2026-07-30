package com.p051p1.mobile.putong.data.tenum;

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import java.io.IOException;
import java.util.ArrayList;
import p153l.l01;

/* JADX INFO: loaded from: classes12.dex */
public abstract class TEnumJsonAdapter<T extends TEnum> extends JsonAdapter<T> {
    private static final String unknown_ = "unknown_";
    private final l01<String, Integer> strToInteger = new l01<>();
    private final l01<Integer, String> integerToStr = new l01<>();

    public void addExtJsonValue(String str, int i) {
        Integer num = this.strToInteger.get(str);
        l01<String, Integer> l01Var = this.strToInteger;
        if (num == null) {
            l01Var.put(str, Integer.valueOf(i));
        } else if (l01Var.get(str).intValue() != i) {
            throw new RuntimeException("addExtJsonValue error " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i);
        }
        String str2 = this.integerToStr.get(Integer.valueOf(i));
        l01<Integer, String> l01Var2 = this.integerToStr;
        if (str2 == null) {
            l01Var2.put(Integer.valueOf(i), str);
        } else {
            if (l01Var2.get(Integer.valueOf(i)).equals(str)) {
                return;
            }
            throw new RuntimeException("addExtJsonValue error" + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i);
        }
    }

    public T defaultEnum() {
        return (T) newTEnum("unknown_", this.strToInteger.get("unknown_").intValue());
    }

    public l01<String, Integer> getEnums() {
        return this.strToInteger;
    }

    public Integer getInteger(String str) {
        return this.strToInteger.get(str);
    }

    public String getString(Integer num) {
        return this.integerToStr.get(num);
    }

    public abstract T newTEnum(String str, int i);

    @Override // com.tantanapp.common.data.JsonAdapter
    public T parse(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
        String valueAsString = jsonParser.getValueAsString();
        if (TextUtils.isEmpty(valueAsString)) {
            return null;
        }
        Integer num = this.strToInteger.get(valueAsString);
        if (num == null) {
            num = this.strToInteger.get("unknown_");
        }
        return (T) newTEnum(valueAsString, num.intValue());
    }

    @Override // com.tantanapp.common.data.JsonAdapter
    public void serialize(T t, JsonGenerator jsonGenerator, boolean z) throws IOException {
        if (t == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeString(t.toString());
        }
    }

    @Override // com.tantanapp.common.data.JsonAdapter
    public /* bridge */ /* synthetic */ Object parse(JsonParser jsonParser, String str, ArrayList arrayList, DataChecker dataChecker) throws IOException {
        return parse(jsonParser, str, (ArrayList<BaseData>) arrayList, dataChecker);
    }
}
