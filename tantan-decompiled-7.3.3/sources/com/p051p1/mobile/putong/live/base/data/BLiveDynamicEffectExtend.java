package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveDynamicEffectExtend extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDynamicEffectExtend> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDynamicEffectExtend>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDynamicEffectExtend.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDynamicEffectExtend newInstance() {
            return new BLiveDynamicEffectExtend();
        }

        public boolean parseField(BLiveDynamicEffectExtend bLiveDynamicEffectExtend, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Constants.KEY_KEY)) {
                bLiveDynamicEffectExtend.key = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("value")) {
                return false;
            }
            bLiveDynamicEffectExtend.value = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDynamicEffectExtend bLiveDynamicEffectExtend, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveDynamicEffectExtend.key;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str);
            }
            if (bLiveDynamicEffectExtend.value != null) {
                jsonGenerator.writeFieldName("value");
                JsonAdapter.serializeArray(bLiveDynamicEffectExtend.value, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDynamicEffectExtend) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedynamiceffectextend";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> value;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69109a(String str) {
        return str;
    }

    public static BLiveDynamicEffectExtend new_() {
        BLiveDynamicEffectExtend bLiveDynamicEffectExtend = new BLiveDynamicEffectExtend();
        bLiveDynamicEffectExtend.nullCheck();
        return bLiveDynamicEffectExtend;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDynamicEffectExtend mo225055clone() {
        BLiveDynamicEffectExtend bLiveDynamicEffectExtend = new BLiveDynamicEffectExtend();
        bLiveDynamicEffectExtend.key = this.key;
        List<String> list = this.value;
        if (list != null) {
            bLiveDynamicEffectExtend.value = ValueObject.util_map(list, new qcj() { // from class: l.ez1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveDynamicEffectExtend.m69109a((String) obj);
                }
            });
        }
        return bLiveDynamicEffectExtend;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDynamicEffectExtend)) {
            return false;
        }
        BLiveDynamicEffectExtend bLiveDynamicEffectExtend = (BLiveDynamicEffectExtend) obj;
        return ValueObject.util_equals(this.key, bLiveDynamicEffectExtend.key) && ValueObject.util_equals(this.value, bLiveDynamicEffectExtend.value);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.value;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.value == null) {
            this.value = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
