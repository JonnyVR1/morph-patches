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
public class BLiveFanBaseNotifyParams extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBaseNotifyParams> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBaseNotifyParams>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBaseNotifyParams.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBaseNotifyParams.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBaseNotifyParams newInstance() {
            return new BLiveFanBaseNotifyParams();
        }

        public boolean parseField(BLiveFanBaseNotifyParams bLiveFanBaseNotifyParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveFanBaseNotifyParams.userId = jsonParser.getValueAsString();
                    return true;
                case "fanbaseId":
                    bLiveFanBaseNotifyParams.fanbaseId = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveFanBaseNotifyParams.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBaseNotifyParams bLiveFanBaseNotifyParams, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFanBaseNotifyParams.fanbaseId;
            if (str != null) {
                jsonGenerator.writeStringField("fanbaseId", str);
            }
            String str2 = bLiveFanBaseNotifyParams.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = bLiveFanBaseNotifyParams.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBaseNotifyParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbasenotifyparams";

    @NonNull
    @ProtobufIndex(index = 1)
    public String fanbaseId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    public static BLiveFanBaseNotifyParams new_() {
        BLiveFanBaseNotifyParams bLiveFanBaseNotifyParams = new BLiveFanBaseNotifyParams();
        bLiveFanBaseNotifyParams.nullCheck();
        return bLiveFanBaseNotifyParams;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBaseNotifyParams mo223809clone() {
        BLiveFanBaseNotifyParams bLiveFanBaseNotifyParams = new BLiveFanBaseNotifyParams();
        bLiveFanBaseNotifyParams.fanbaseId = this.fanbaseId;
        bLiveFanBaseNotifyParams.userId = this.userId;
        bLiveFanBaseNotifyParams.type = this.type;
        return bLiveFanBaseNotifyParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFanBaseNotifyParams)) {
            return false;
        }
        BLiveFanBaseNotifyParams bLiveFanBaseNotifyParams = (BLiveFanBaseNotifyParams) obj;
        return ValueObject.util_equals(this.fanbaseId, bLiveFanBaseNotifyParams.fanbaseId) && ValueObject.util_equals(this.userId, bLiveFanBaseNotifyParams.userId) && ValueObject.util_equals(this.type, bLiveFanBaseNotifyParams.type);
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
        String str = this.fanbaseId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.fanbaseId == null) {
            this.fanbaseId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
