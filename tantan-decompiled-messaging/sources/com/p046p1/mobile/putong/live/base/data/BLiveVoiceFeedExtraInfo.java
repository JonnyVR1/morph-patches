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
public class BLiveVoiceFeedExtraInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceFeedExtraInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceFeedExtraInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceFeedExtraInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceFeedExtraInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceFeedExtraInfo newInstance() {
            return new BLiveVoiceFeedExtraInfo();
        }

        public boolean parseField(BLiveVoiceFeedExtraInfo bLiveVoiceFeedExtraInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "sourceName":
                    bLiveVoiceFeedExtraInfo.sourceName = jsonParser.getValueAsString();
                    return true;
                case "isfollowingAnchor":
                    bLiveVoiceFeedExtraInfo.isfollowingAnchor = jsonParser.getValueAsBoolean();
                    return true;
                case "onCallCnt":
                    bLiveVoiceFeedExtraInfo.onCallCnt = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceFeedExtraInfo bLiveVoiceFeedExtraInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceFeedExtraInfo.sourceName;
            if (str != null) {
                jsonGenerator.writeStringField("sourceName", str);
            }
            jsonGenerator.writeNumberField("onCallCnt", bLiveVoiceFeedExtraInfo.onCallCnt);
            jsonGenerator.writeBooleanField("isfollowingAnchor", bLiveVoiceFeedExtraInfo.isfollowingAnchor);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceFeedExtraInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicefeedextrainfo";

    @ProtobufIndex(index = 3)
    public boolean isfollowingAnchor;

    @ProtobufIndex(index = 1)
    public int onCallCnt;

    @NonNull
    @ProtobufIndex(index = 2)
    public String sourceName;

    public static BLiveVoiceFeedExtraInfo new_() {
        BLiveVoiceFeedExtraInfo bLiveVoiceFeedExtraInfo = new BLiveVoiceFeedExtraInfo();
        bLiveVoiceFeedExtraInfo.nullCheck();
        return bLiveVoiceFeedExtraInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceFeedExtraInfo mo223809clone() {
        BLiveVoiceFeedExtraInfo bLiveVoiceFeedExtraInfo = new BLiveVoiceFeedExtraInfo();
        bLiveVoiceFeedExtraInfo.sourceName = this.sourceName;
        bLiveVoiceFeedExtraInfo.onCallCnt = this.onCallCnt;
        bLiveVoiceFeedExtraInfo.isfollowingAnchor = this.isfollowingAnchor;
        return bLiveVoiceFeedExtraInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceFeedExtraInfo)) {
            return false;
        }
        BLiveVoiceFeedExtraInfo bLiveVoiceFeedExtraInfo = (BLiveVoiceFeedExtraInfo) obj;
        return ValueObject.util_equals(this.sourceName, bLiveVoiceFeedExtraInfo.sourceName) && this.onCallCnt == bLiveVoiceFeedExtraInfo.onCallCnt && this.isfollowingAnchor == bLiveVoiceFeedExtraInfo.isfollowingAnchor;
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
        String str = this.sourceName;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.onCallCnt) * 41) + (this.isfollowingAnchor ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.sourceName == null) {
            this.sourceName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
