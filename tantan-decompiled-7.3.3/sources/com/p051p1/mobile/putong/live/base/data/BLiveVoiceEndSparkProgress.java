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
public class BLiveVoiceEndSparkProgress extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceEndSparkProgress> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceEndSparkProgress>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceEndSparkProgress.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceEndSparkProgress.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceEndSparkProgress newInstance() {
            return new BLiveVoiceEndSparkProgress();
        }

        public boolean parseField(BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchorUserId":
                    bLiveVoiceEndSparkProgress.anchorUserId = jsonParser.getValueAsString();
                    return true;
                case "totalCount":
                    bLiveVoiceEndSparkProgress.totalCount = jsonParser.getValueAsInt();
                    return true;
                case "h5Url":
                    bLiveVoiceEndSparkProgress.h5Url = jsonParser.getValueAsString();
                    return true;
                case "currentCount":
                    bLiveVoiceEndSparkProgress.currentCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceEndSparkProgress.anchorUserId;
            if (str != null) {
                jsonGenerator.writeStringField("anchorUserId", str);
            }
            jsonGenerator.writeNumberField("currentCount", bLiveVoiceEndSparkProgress.currentCount);
            jsonGenerator.writeNumberField("totalCount", bLiveVoiceEndSparkProgress.totalCount);
            String str2 = bLiveVoiceEndSparkProgress.h5Url;
            if (str2 != null) {
                jsonGenerator.writeStringField("h5Url", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceEndSparkProgress) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceendsparkprogress";

    @NonNull
    @ProtobufIndex(index = 1)
    public String anchorUserId;

    @ProtobufIndex(index = 2)
    public int currentCount;

    @NonNull
    @ProtobufIndex(index = 4)
    public String h5Url;

    @ProtobufIndex(index = 3)
    public int totalCount;

    public static BLiveVoiceEndSparkProgress new_() {
        BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress = new BLiveVoiceEndSparkProgress();
        bLiveVoiceEndSparkProgress.nullCheck();
        return bLiveVoiceEndSparkProgress;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceEndSparkProgress mo225055clone() {
        BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress = new BLiveVoiceEndSparkProgress();
        bLiveVoiceEndSparkProgress.anchorUserId = this.anchorUserId;
        bLiveVoiceEndSparkProgress.currentCount = this.currentCount;
        bLiveVoiceEndSparkProgress.totalCount = this.totalCount;
        bLiveVoiceEndSparkProgress.h5Url = this.h5Url;
        return bLiveVoiceEndSparkProgress;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceEndSparkProgress)) {
            return false;
        }
        BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress = (BLiveVoiceEndSparkProgress) obj;
        return ValueObject.util_equals(this.anchorUserId, bLiveVoiceEndSparkProgress.anchorUserId) && this.currentCount == bLiveVoiceEndSparkProgress.currentCount && this.totalCount == bLiveVoiceEndSparkProgress.totalCount && ValueObject.util_equals(this.h5Url, bLiveVoiceEndSparkProgress.h5Url);
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
        String str = this.anchorUserId;
        int iHashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.currentCount) * 41) + this.totalCount) * 41;
        String str2 = this.h5Url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.anchorUserId == null) {
            this.anchorUserId = "";
        }
        if (this.h5Url == null) {
            this.h5Url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
