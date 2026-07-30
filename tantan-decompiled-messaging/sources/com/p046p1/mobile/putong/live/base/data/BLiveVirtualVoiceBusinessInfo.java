package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVirtualVoiceBusinessInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVirtualVoiceBusinessInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVirtualVoiceBusinessInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVirtualVoiceBusinessInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVirtualVoiceBusinessInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVirtualVoiceBusinessInfo newInstance() {
            return new BLiveVirtualVoiceBusinessInfo();
        }

        public boolean parseField(BLiveVirtualVoiceBusinessInfo bLiveVirtualVoiceBusinessInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    bLiveVirtualVoiceBusinessInfo.subTitle = jsonParser.getValueAsString();
                    return true;
                case "logUrl":
                    bLiveVirtualVoiceBusinessInfo.logUrl = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveVirtualVoiceBusinessInfo.type = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveVirtualVoiceBusinessInfo.title = jsonParser.getValueAsString();
                    return true;
                case "userAreaSubTitle":
                    bLiveVirtualVoiceBusinessInfo.userAreaSubTitle = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVirtualVoiceBusinessInfo bLiveVirtualVoiceBusinessInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVirtualVoiceBusinessInfo.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveVirtualVoiceBusinessInfo.logUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("logUrl", str2);
            }
            String str3 = bLiveVirtualVoiceBusinessInfo.title;
            if (str3 != null) {
                jsonGenerator.writeStringField("title", str3);
            }
            String str4 = bLiveVirtualVoiceBusinessInfo.subTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("subTitle", str4);
            }
            String str5 = bLiveVirtualVoiceBusinessInfo.userAreaSubTitle;
            if (str5 != null) {
                jsonGenerator.writeStringField("userAreaSubTitle", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVirtualVoiceBusinessInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevirtualvoicebusinessinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String logUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userAreaSubTitle;

    public static BLiveVirtualVoiceBusinessInfo new_() {
        BLiveVirtualVoiceBusinessInfo bLiveVirtualVoiceBusinessInfo = new BLiveVirtualVoiceBusinessInfo();
        bLiveVirtualVoiceBusinessInfo.nullCheck();
        return bLiveVirtualVoiceBusinessInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVirtualVoiceBusinessInfo mo223809clone() {
        BLiveVirtualVoiceBusinessInfo bLiveVirtualVoiceBusinessInfo = new BLiveVirtualVoiceBusinessInfo();
        bLiveVirtualVoiceBusinessInfo.type = this.type;
        bLiveVirtualVoiceBusinessInfo.logUrl = this.logUrl;
        bLiveVirtualVoiceBusinessInfo.title = this.title;
        bLiveVirtualVoiceBusinessInfo.subTitle = this.subTitle;
        bLiveVirtualVoiceBusinessInfo.userAreaSubTitle = this.userAreaSubTitle;
        return bLiveVirtualVoiceBusinessInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVirtualVoiceBusinessInfo)) {
            return false;
        }
        BLiveVirtualVoiceBusinessInfo bLiveVirtualVoiceBusinessInfo = (BLiveVirtualVoiceBusinessInfo) obj;
        return ValueObject.util_equals(this.type, bLiveVirtualVoiceBusinessInfo.type) && ValueObject.util_equals(this.logUrl, bLiveVirtualVoiceBusinessInfo.logUrl) && ValueObject.util_equals(this.title, bLiveVirtualVoiceBusinessInfo.title) && ValueObject.util_equals(this.subTitle, bLiveVirtualVoiceBusinessInfo.subTitle) && ValueObject.util_equals(this.userAreaSubTitle, bLiveVirtualVoiceBusinessInfo.userAreaSubTitle);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.logUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.subTitle;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userAreaSubTitle;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.logUrl == null) {
            this.logUrl = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.userAreaSubTitle == null) {
            this.userAreaSubTitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
