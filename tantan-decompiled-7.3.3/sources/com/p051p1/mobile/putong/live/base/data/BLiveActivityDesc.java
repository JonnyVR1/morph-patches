package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.LimitTimePictureStatus;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveActivityDesc extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveActivityDesc> JSON_ADAPTER = new ObjectJsonAdapter<BLiveActivityDesc>() { // from class: com.p1.mobile.putong.live.base.data.BLiveActivityDesc.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveActivityDesc.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveActivityDesc newInstance() {
            return new BLiveActivityDesc();
        }

        public boolean parseField(BLiveActivityDesc bLiveActivityDesc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    bLiveActivityDesc.subtitle = jsonParser.getValueAsString();
                    return true;
                case "unread":
                    bLiveActivityDesc.unread = jsonParser.getValueAsString();
                    return true;
                case "desc":
                    bLiveActivityDesc.desc = jsonParser.getValueAsString();
                    return true;
                case "read":
                    bLiveActivityDesc.read = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveActivityDesc.title = jsonParser.getValueAsString();
                    return true;
                case "redDotNum":
                    bLiveActivityDesc.redDotNum = jsonParser.getValueAsInt();
                    return true;
                case "showRedDot":
                    bLiveActivityDesc.showRedDot = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveActivityDesc bLiveActivityDesc, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveActivityDesc.unread;
            if (str != null) {
                jsonGenerator.writeStringField(LimitTimePictureStatus.unread, str);
            }
            String str2 = bLiveActivityDesc.read;
            if (str2 != null) {
                jsonGenerator.writeStringField("read", str2);
            }
            String str3 = bLiveActivityDesc.subtitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subtitle", str3);
            }
            String str4 = bLiveActivityDesc.title;
            if (str4 != null) {
                jsonGenerator.writeStringField("title", str4);
            }
            String str5 = bLiveActivityDesc.desc;
            if (str5 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str5);
            }
            jsonGenerator.writeBooleanField("showRedDot", bLiveActivityDesc.showRedDot);
            jsonGenerator.writeNumberField("redDotNum", bLiveActivityDesc.redDotNum);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveActivityDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveactivitydesc";

    @NonNull
    @ProtobufIndex(index = 5)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 2)
    public String read;

    @ProtobufIndex(index = 7)
    public int redDotNum;

    @ProtobufIndex(index = 6)
    public boolean showRedDot;

    @NonNull
    @ProtobufIndex(index = 3)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = 4)
    public String title;

    @NonNull
    @ProtobufIndex(index = 1)
    public String unread;

    public static BLiveActivityDesc new_() {
        BLiveActivityDesc bLiveActivityDesc = new BLiveActivityDesc();
        bLiveActivityDesc.nullCheck();
        return bLiveActivityDesc;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveActivityDesc mo225055clone() {
        BLiveActivityDesc bLiveActivityDesc = new BLiveActivityDesc();
        bLiveActivityDesc.unread = this.unread;
        bLiveActivityDesc.read = this.read;
        bLiveActivityDesc.subtitle = this.subtitle;
        bLiveActivityDesc.title = this.title;
        bLiveActivityDesc.desc = this.desc;
        bLiveActivityDesc.showRedDot = this.showRedDot;
        bLiveActivityDesc.redDotNum = this.redDotNum;
        return bLiveActivityDesc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveActivityDesc)) {
            return false;
        }
        BLiveActivityDesc bLiveActivityDesc = (BLiveActivityDesc) obj;
        return ValueObject.util_equals(this.unread, bLiveActivityDesc.unread) && ValueObject.util_equals(this.read, bLiveActivityDesc.read) && ValueObject.util_equals(this.subtitle, bLiveActivityDesc.subtitle) && ValueObject.util_equals(this.title, bLiveActivityDesc.title) && ValueObject.util_equals(this.desc, bLiveActivityDesc.desc) && this.showRedDot == bLiveActivityDesc.showRedDot && this.redDotNum == bLiveActivityDesc.redDotNum;
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
        String str = this.unread;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.read;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.desc;
        int iHashCode5 = ((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.showRedDot ? 1231 : 1237)) * 41) + this.redDotNum;
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.unread == null) {
            this.unread = "";
        }
        if (this.read == null) {
            this.read = "";
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
