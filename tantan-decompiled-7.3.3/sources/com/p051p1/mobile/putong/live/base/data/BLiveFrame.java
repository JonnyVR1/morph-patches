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
public class BLiveFrame extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFrame> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFrame>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFrame.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFrame.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFrame newInstance() {
            return new BLiveFrame();
        }

        public boolean parseField(BLiveFrame bLiveFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "region":
                    bLiveFrame.region = jsonParser.getValueAsString();
                    return true;
                case "frameGrade":
                    bLiveFrame.frameGrade = jsonParser.getValueAsInt();
                    return true;
                case "framePicUrl":
                    bLiveFrame.framePicUrl = jsonParser.getValueAsString();
                    return true;
                case "frameSvgUrl":
                    bLiveFrame.frameSvgUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveFrame.f45219id = jsonParser.getValueAsString();
                    return false;
                case "frameName":
                    bLiveFrame.frameName = jsonParser.getValueAsString();
                    return true;
                case "liveType":
                    bLiveFrame.liveType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFrame bLiveFrame, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFrame.f45219id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveFrame.frameName;
            if (str2 != null) {
                jsonGenerator.writeStringField("frameName", str2);
            }
            String str3 = bLiveFrame.framePicUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("framePicUrl", str3);
            }
            jsonGenerator.writeNumberField("frameGrade", bLiveFrame.frameGrade);
            String str4 = bLiveFrame.liveType;
            if (str4 != null) {
                jsonGenerator.writeStringField("liveType", str4);
            }
            String str5 = bLiveFrame.region;
            if (str5 != null) {
                jsonGenerator.writeStringField("region", str5);
            }
            String str6 = bLiveFrame.frameSvgUrl;
            if (str6 != null) {
                jsonGenerator.writeStringField("frameSvgUrl", str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveframe";

    @ProtobufIndex(index = 6)
    public int frameGrade;

    @NonNull
    @ProtobufIndex(index = 2)
    public String frameName;

    @NonNull
    @ProtobufIndex(index = 3)
    public String framePicUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public String frameSvgUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45219id;

    @NonNull
    @ProtobufIndex(index = 7)
    public String liveType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String region;

    public static BLiveFrame new_() {
        BLiveFrame bLiveFrame = new BLiveFrame();
        bLiveFrame.nullCheck();
        return bLiveFrame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFrame mo225055clone() {
        BLiveFrame bLiveFrame = new BLiveFrame();
        bLiveFrame.f45219id = this.f45219id;
        bLiveFrame.frameName = this.frameName;
        bLiveFrame.framePicUrl = this.framePicUrl;
        bLiveFrame.frameGrade = this.frameGrade;
        bLiveFrame.liveType = this.liveType;
        bLiveFrame.region = this.region;
        bLiveFrame.frameSvgUrl = this.frameSvgUrl;
        return bLiveFrame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFrame)) {
            return false;
        }
        BLiveFrame bLiveFrame = (BLiveFrame) obj;
        return ValueObject.util_equals(this.f45219id, bLiveFrame.f45219id) && ValueObject.util_equals(this.frameName, bLiveFrame.frameName) && ValueObject.util_equals(this.framePicUrl, bLiveFrame.framePicUrl) && this.frameGrade == bLiveFrame.frameGrade && ValueObject.util_equals(this.liveType, bLiveFrame.liveType) && ValueObject.util_equals(this.region, bLiveFrame.region) && ValueObject.util_equals(this.frameSvgUrl, bLiveFrame.frameSvgUrl);
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
        String str = this.f45219id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.frameName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.framePicUrl;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.frameGrade) * 41;
        String str4 = this.liveType;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.region;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.frameSvgUrl;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45219id == null) {
            this.f45219id = "";
        }
        if (this.frameName == null) {
            this.frameName = "";
        }
        if (this.framePicUrl == null) {
            this.framePicUrl = "";
        }
        if (this.liveType == null) {
            this.liveType = "";
        }
        if (this.region == null) {
            this.region = "";
        }
        if (this.frameSvgUrl == null) {
            this.frameSvgUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
