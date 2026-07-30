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
public class BLiveCallConnection extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCallConnection> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCallConnection>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCallConnection.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCallConnection.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCallConnection newInstance() {
            return new BLiveCallConnection();
        }

        public boolean parseField(BLiveCallConnection bLiveCallConnection, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveCallConnection.userId = jsonParser.getValueAsString();
                    return true;
                case "verticalEffectSvga":
                    bLiveCallConnection.verticalEffectSvga = jsonParser.getValueAsString();
                    return true;
                case "horizontalEffectSvga":
                    bLiveCallConnection.horizontalEffectSvga = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCallConnection bLiveCallConnection, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveCallConnection.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveCallConnection.horizontalEffectSvga;
            if (str2 != null) {
                jsonGenerator.writeStringField("horizontalEffectSvga", str2);
            }
            String str3 = bLiveCallConnection.verticalEffectSvga;
            if (str3 != null) {
                jsonGenerator.writeStringField("verticalEffectSvga", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCallConnection) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecallconnection";

    @NonNull
    @ProtobufIndex(index = 2)
    public String horizontalEffectSvga;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String verticalEffectSvga;

    public static BLiveCallConnection new_() {
        BLiveCallConnection bLiveCallConnection = new BLiveCallConnection();
        bLiveCallConnection.nullCheck();
        return bLiveCallConnection;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCallConnection mo223809clone() {
        BLiveCallConnection bLiveCallConnection = new BLiveCallConnection();
        bLiveCallConnection.userId = this.userId;
        bLiveCallConnection.horizontalEffectSvga = this.horizontalEffectSvga;
        bLiveCallConnection.verticalEffectSvga = this.verticalEffectSvga;
        return bLiveCallConnection;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCallConnection)) {
            return false;
        }
        BLiveCallConnection bLiveCallConnection = (BLiveCallConnection) obj;
        return ValueObject.util_equals(this.userId, bLiveCallConnection.userId) && ValueObject.util_equals(this.horizontalEffectSvga, bLiveCallConnection.horizontalEffectSvga) && ValueObject.util_equals(this.verticalEffectSvga, bLiveCallConnection.verticalEffectSvga);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.horizontalEffectSvga;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.verticalEffectSvga;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.horizontalEffectSvga == null) {
            this.horizontalEffectSvga = "";
        }
        if (this.verticalEffectSvga == null) {
            this.verticalEffectSvga = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
