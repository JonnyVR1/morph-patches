package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveDynamicEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveMagicList;
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
public class BLiveMagicList extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMagicList> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMagicList>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMagicList.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMagicList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMagicList newInstance() {
            return new BLiveMagicList();
        }

        public boolean parseField(BLiveMagicList bLiveMagicList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "notice":
                    bLiveMagicList.notice = jsonParser.getValueAsString();
                    return true;
                case "typeName":
                    bLiveMagicList.typeName = jsonParser.getValueAsString();
                    return true;
                case "bgColor":
                    bLiveMagicList.bgColor = jsonParser.getValueAsString();
                    return true;
                case "gesture":
                    bLiveMagicList.gesture = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveMagicList.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveMagicList.type = jsonParser.getValueAsString();
                    return true;
                case "dynamicEffect":
                    bLiveMagicList.dynamicEffect = JsonAdapter.parseArray(jsonParser, BLiveDynamicEffect.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "filterLiveMode":
                    bLiveMagicList.filterLiveMode = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMagicList bLiveMagicList, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMagicList.gesture;
            if (str != null) {
                jsonGenerator.writeStringField("gesture", str);
            }
            String str2 = bLiveMagicList.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveMagicList.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            if (bLiveMagicList.dynamicEffect != null) {
                jsonGenerator.writeFieldName("dynamicEffect");
                JsonAdapter.serializeArray(bLiveMagicList.dynamicEffect, jsonGenerator, BLiveDynamicEffect.JSON_ADAPTER);
            }
            String str4 = bLiveMagicList.bgColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("bgColor", str4);
            }
            String str5 = bLiveMagicList.typeName;
            if (str5 != null) {
                jsonGenerator.writeStringField("typeName", str5);
            }
            String str6 = bLiveMagicList.notice;
            if (str6 != null) {
                jsonGenerator.writeStringField("notice", str6);
            }
            if (bLiveMagicList.filterLiveMode != null) {
                jsonGenerator.writeFieldName("filterLiveMode");
                JsonAdapter.serializeArray(bLiveMagicList.filterLiveMode, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMagicList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemagiclist";

    @NonNull
    @ProtobufIndex(index = 5)
    public String bgColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveDynamicEffect> dynamicEffect;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> filterLiveMode;

    @NonNull
    @ProtobufIndex(index = 1)
    public String gesture;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @NonNull
    @ProtobufIndex(index = 7)
    public String notice;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 6)
    public String typeName;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69230a(String str) {
        return str;
    }

    public static BLiveMagicList new_() {
        BLiveMagicList bLiveMagicList = new BLiveMagicList();
        bLiveMagicList.nullCheck();
        return bLiveMagicList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMagicList mo225055clone() {
        BLiveMagicList bLiveMagicList = new BLiveMagicList();
        bLiveMagicList.gesture = this.gesture;
        bLiveMagicList.type = this.type;
        bLiveMagicList.name = this.name;
        List<BLiveDynamicEffect> list = this.dynamicEffect;
        if (list != null) {
            bLiveMagicList.dynamicEffect = ValueObject.util_map(list, new qcj() { // from class: l.i22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveDynamicEffect) obj).mo225055clone();
                }
            });
        }
        bLiveMagicList.bgColor = this.bgColor;
        bLiveMagicList.typeName = this.typeName;
        bLiveMagicList.notice = this.notice;
        List<String> list2 = this.filterLiveMode;
        if (list2 != null) {
            bLiveMagicList.filterLiveMode = ValueObject.util_map(list2, new qcj() { // from class: l.j22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveMagicList.m69230a((String) obj);
                }
            });
        }
        return bLiveMagicList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMagicList)) {
            return false;
        }
        BLiveMagicList bLiveMagicList = (BLiveMagicList) obj;
        return ValueObject.util_equals(this.gesture, bLiveMagicList.gesture) && ValueObject.util_equals(this.type, bLiveMagicList.type) && ValueObject.util_equals(this.name, bLiveMagicList.name) && ValueObject.util_equals(this.dynamicEffect, bLiveMagicList.dynamicEffect) && ValueObject.util_equals(this.bgColor, bLiveMagicList.bgColor) && ValueObject.util_equals(this.typeName, bLiveMagicList.typeName) && ValueObject.util_equals(this.notice, bLiveMagicList.notice) && ValueObject.util_equals(this.filterLiveMode, bLiveMagicList.filterLiveMode);
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
        String str = this.gesture;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<BLiveDynamicEffect> list = this.dynamicEffect;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        String str4 = this.bgColor;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.typeName;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.notice;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        List<String> list2 = this.filterLiveMode;
        int iHashCode8 = iHashCode7 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.gesture == null) {
            this.gesture = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.dynamicEffect == null) {
            this.dynamicEffect = new ArrayList();
        }
        if (this.bgColor == null) {
            this.bgColor = "";
        }
        if (this.typeName == null) {
            this.typeName = "";
        }
        if (this.notice == null) {
            this.notice = "";
        }
        if (this.filterLiveMode == null) {
            this.filterLiveMode = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
