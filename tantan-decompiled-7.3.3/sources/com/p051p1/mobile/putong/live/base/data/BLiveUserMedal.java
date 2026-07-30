package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUserMedal extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserMedal> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserMedal>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserMedal.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserMedal.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserMedal newInstance() {
            return new BLiveUserMedal();
        }

        public boolean parseField(BLiveUserMedal bLiveUserMedal, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveID":
                    bLiveUserMedal.liveID = jsonParser.getValueAsString();
                    return true;
                case "familyGrade":
                    bLiveUserMedal.familyGrade = jsonParser.getValueAsInt();
                    return true;
                case "familyLight":
                    bLiveUserMedal.familyLight = jsonParser.getValueAsBoolean();
                    return true;
                case "expireTime":
                    bLiveUserMedal.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    bLiveUserMedal.f45321id = jsonParser.getValueAsString();
                    return false;
                case "fanbaseGrade":
                    bLiveUserMedal.fanbaseGrade = jsonParser.getValueAsInt();
                    return true;
                case "familyText":
                    bLiveUserMedal.familyText = jsonParser.getValueAsString();
                    return true;
                case "voiceFanbaseColor":
                    bLiveUserMedal.voiceFanbaseColor = jsonParser.getValueAsString();
                    return true;
                case "voiceFanbaseGrade":
                    bLiveUserMedal.voiceFanbaseGrade = jsonParser.getValueAsInt();
                    return true;
                case "voiceFanbaseText":
                    bLiveUserMedal.voiceFanbaseText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserMedal bLiveUserMedal, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserMedal.f45321id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveUserMedal.liveID;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveID", str2);
            }
            jsonGenerator.writeNumberField("expireTime", bLiveUserMedal.expireTime);
            jsonGenerator.writeNumberField("fanbaseGrade", bLiveUserMedal.fanbaseGrade);
            String str3 = bLiveUserMedal.familyText;
            if (str3 != null) {
                jsonGenerator.writeStringField("familyText", str3);
            }
            jsonGenerator.writeNumberField("familyGrade", bLiveUserMedal.familyGrade);
            jsonGenerator.writeNumberField("voiceFanbaseGrade", bLiveUserMedal.voiceFanbaseGrade);
            String str4 = bLiveUserMedal.voiceFanbaseColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("voiceFanbaseColor", str4);
            }
            String str5 = bLiveUserMedal.voiceFanbaseText;
            if (str5 != null) {
                jsonGenerator.writeStringField("voiceFanbaseText", str5);
            }
            jsonGenerator.writeBooleanField("familyLight", bLiveUserMedal.familyLight);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserMedal) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveusermedal";

    @ProtobufIndex(index = 3)
    public long expireTime;

    @ProtobufIndex(index = 6)
    public int familyGrade;

    @ProtobufIndex(index = 10)
    public boolean familyLight;

    @NonNull
    @ProtobufIndex(index = 5)
    public String familyText;

    @ProtobufIndex(index = 4)
    public int fanbaseGrade;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45321id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String liveID;

    @NonNull
    @ProtobufIndex(index = 8)
    public String voiceFanbaseColor;

    @ProtobufIndex(index = 7)
    public int voiceFanbaseGrade;

    @NonNull
    @ProtobufIndex(index = 9)
    public String voiceFanbaseText;

    public static BLiveUserMedal new_() {
        BLiveUserMedal bLiveUserMedal = new BLiveUserMedal();
        bLiveUserMedal.nullCheck();
        return bLiveUserMedal;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserMedal mo225055clone() {
        BLiveUserMedal bLiveUserMedal = new BLiveUserMedal();
        bLiveUserMedal.f45321id = this.f45321id;
        bLiveUserMedal.liveID = this.liveID;
        bLiveUserMedal.expireTime = this.expireTime;
        bLiveUserMedal.fanbaseGrade = this.fanbaseGrade;
        bLiveUserMedal.familyText = this.familyText;
        bLiveUserMedal.familyGrade = this.familyGrade;
        bLiveUserMedal.voiceFanbaseGrade = this.voiceFanbaseGrade;
        bLiveUserMedal.voiceFanbaseColor = this.voiceFanbaseColor;
        bLiveUserMedal.voiceFanbaseText = this.voiceFanbaseText;
        bLiveUserMedal.familyLight = this.familyLight;
        return bLiveUserMedal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserMedal)) {
            return false;
        }
        BLiveUserMedal bLiveUserMedal = (BLiveUserMedal) obj;
        return ValueObject.util_equals(this.f45321id, bLiveUserMedal.f45321id) && ValueObject.util_equals(this.liveID, bLiveUserMedal.liveID) && this.expireTime == bLiveUserMedal.expireTime && this.fanbaseGrade == bLiveUserMedal.fanbaseGrade && ValueObject.util_equals(this.familyText, bLiveUserMedal.familyText) && this.familyGrade == bLiveUserMedal.familyGrade && this.voiceFanbaseGrade == bLiveUserMedal.voiceFanbaseGrade && ValueObject.util_equals(this.voiceFanbaseColor, bLiveUserMedal.voiceFanbaseColor) && ValueObject.util_equals(this.voiceFanbaseText, bLiveUserMedal.voiceFanbaseText) && this.familyLight == bLiveUserMedal.familyLight;
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
        String str = this.f45321id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.liveID;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.expireTime;
        int i3 = (((((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.fanbaseGrade) * 41;
        String str3 = this.familyText;
        int iHashCode3 = (((((i3 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.familyGrade) * 41) + this.voiceFanbaseGrade) * 41;
        String str4 = this.voiceFanbaseColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.voiceFanbaseText;
        int iHashCode5 = ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.familyLight ? 1231 : 1237);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45321id == null) {
            this.f45321id = "";
        }
        if (this.liveID == null) {
            this.liveID = "";
        }
        if (this.familyText == null) {
            this.familyText = "";
        }
        if (this.voiceFanbaseColor == null) {
            this.voiceFanbaseColor = "";
        }
        if (this.voiceFanbaseText == null) {
            this.voiceFanbaseText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
