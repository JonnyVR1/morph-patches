package com.p000p1.mobile.putong.data.tenum;

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import java.io.IOException;
import java.util.ArrayList;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class TEnumJsonAdapter<T extends TEnum> extends JsonAdapter<T> {
    private static final String unknown_ = "unknown_";
    private final e01<String, Integer> strToInteger = new e01<>();
    private final e01<Integer, String> integerToStr = new e01<>();

    public void addExtJsonValue(String str, int i) {
        Object obj = this.strToInteger.get(str);
        e01<String, Integer> e01Var = this.strToInteger;
        if (obj == null) {
            e01Var.put(str, Integer.valueOf(i));
        } else if (((Integer) e01Var.get(str)).intValue() != i) {
            throw new RuntimeException("addExtJsonValue error " + str + " " + i);
        }
        Object obj2 = this.integerToStr.get(Integer.valueOf(i));
        e01<Integer, String> e01Var2 = this.integerToStr;
        if (obj2 == null) {
            e01Var2.put(Integer.valueOf(i), str);
        } else {
            if (((String) e01Var2.get(Integer.valueOf(i))).equals(str)) {
                return;
            }
            throw new RuntimeException("addExtJsonValue error" + str + " " + i);
        }
    }

    public T defaultEnum() {
        return (T) newTEnum("unknown_", ((Integer) this.strToInteger.get("unknown_")).intValue());
    }

    public e01<String, Integer> getEnums() {
        return this.strToInteger;
    }

    public Integer getInteger(String str) {
        return (Integer) this.strToInteger.get(str);
    }

    public String getString(Integer num) {
        return (String) this.integerToStr.get(num);
    }

    public abstract T newTEnum(String str, int i);

    public T parse(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
        String valueAsString = jsonParser.getValueAsString();
        if (TextUtils.isEmpty(valueAsString)) {
            return null;
        }
        Integer num = (Integer) this.strToInteger.get(valueAsString);
        if (num == null) {
            num = (Integer) this.strToInteger.get("unknown_");
        }
        return (T) newTEnum(valueAsString, num.intValue());
    }

    public void serialize(T t, JsonGenerator jsonGenerator, boolean z) throws IOException {
        if (t == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeString(t.toString());
        }
    }

    /* JADX INFO: renamed from: parse, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m19396parse(JsonParser jsonParser, String str, ArrayList arrayList, DataChecker dataChecker) throws IOException {
        return parse(jsonParser, str, (ArrayList<BaseData>) arrayList, dataChecker);
    }
}
