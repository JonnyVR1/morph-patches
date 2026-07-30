package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuTipContent;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveStormDanmakuTip extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStormDanmakuTip> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStormDanmakuTip>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStormDanmakuTip.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStormDanmakuTip.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStormDanmakuTip newInstance() {
            return new BLiveStormDanmakuTip();
        }

        public boolean parseField(BLiveStormDanmakuTip bLiveStormDanmakuTip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "fields":
                    bLiveStormDanmakuTip.fields = JsonAdapter.parseArray(jsonParser, BLiveStormDanmakuTipContent.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "bgColor":
                    bLiveStormDanmakuTip.bgColor = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveStormDanmakuTip.f44448id = jsonParser.getValueAsString();
                    return false;
                case "text":
                    bLiveStormDanmakuTip.text = jsonParser.getValueAsString();
                    return true;
                case "borderColor":
                    bLiveStormDanmakuTip.borderColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStormDanmakuTip bLiveStormDanmakuTip, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveStormDanmakuTip.f44448id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveStormDanmakuTip.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            String str3 = bLiveStormDanmakuTip.bgColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("bgColor", str3);
            }
            String str4 = bLiveStormDanmakuTip.borderColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("borderColor", str4);
            }
            if (bLiveStormDanmakuTip.fields != null) {
                jsonGenerator.writeFieldName("fields");
                JsonAdapter.serializeArray(bLiveStormDanmakuTip.fields, jsonGenerator, BLiveStormDanmakuTipContent.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStormDanmakuTip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestormdanmakutip";

    @NonNull
    @ProtobufIndex(index = 3)
    public String bgColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String borderColor;

    @Nullable
    @ProtobufIndex(index = 5)
    public List<BLiveStormDanmakuTipContent> fields;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44448id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    public static BLiveStormDanmakuTip new_() {
        BLiveStormDanmakuTip bLiveStormDanmakuTip = new BLiveStormDanmakuTip();
        bLiveStormDanmakuTip.nullCheck();
        return bLiveStormDanmakuTip;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStormDanmakuTip mo223809clone() {
        BLiveStormDanmakuTip bLiveStormDanmakuTip = new BLiveStormDanmakuTip();
        bLiveStormDanmakuTip.f44448id = this.f44448id;
        bLiveStormDanmakuTip.text = this.text;
        bLiveStormDanmakuTip.bgColor = this.bgColor;
        bLiveStormDanmakuTip.borderColor = this.borderColor;
        List<BLiveStormDanmakuTipContent> list = this.fields;
        if (list != null) {
            bLiveStormDanmakuTip.fields = ValueObject.util_map(list, new w9j() { // from class: l.h62
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveStormDanmakuTipContent) obj).mo223809clone();
                }
            });
        }
        return bLiveStormDanmakuTip;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStormDanmakuTip)) {
            return false;
        }
        BLiveStormDanmakuTip bLiveStormDanmakuTip = (BLiveStormDanmakuTip) obj;
        return ValueObject.util_equals(this.f44448id, bLiveStormDanmakuTip.f44448id) && ValueObject.util_equals(this.text, bLiveStormDanmakuTip.text) && ValueObject.util_equals(this.bgColor, bLiveStormDanmakuTip.bgColor) && ValueObject.util_equals(this.borderColor, bLiveStormDanmakuTip.borderColor) && ValueObject.util_equals(this.fields, bLiveStormDanmakuTip.fields);
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
        String str = this.f44448id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bgColor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.borderColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<BLiveStormDanmakuTipContent> list = this.fields;
        int iHashCode5 = iHashCode4 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44448id == null) {
            this.f44448id = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.bgColor == null) {
            this.bgColor = "";
        }
        if (this.borderColor == null) {
            this.borderColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
