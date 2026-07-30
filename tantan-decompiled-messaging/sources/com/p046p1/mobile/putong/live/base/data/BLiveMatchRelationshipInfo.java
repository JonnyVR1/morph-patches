package com.p046p1.mobile.putong.live.base.data;

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
public class BLiveMatchRelationshipInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMatchRelationshipInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMatchRelationshipInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMatchRelationshipInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMatchRelationshipInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMatchRelationshipInfo newInstance() {
            return new BLiveMatchRelationshipInfo();
        }

        public boolean parseField(BLiveMatchRelationshipInfo bLiveMatchRelationshipInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isMatched")) {
                return false;
            }
            bLiveMatchRelationshipInfo.isMatched = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMatchRelationshipInfo bLiveMatchRelationshipInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isMatched", bLiveMatchRelationshipInfo.isMatched);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMatchRelationshipInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivematchrelationshipinfo";

    @ProtobufIndex(index = 1)
    public boolean isMatched;

    public static BLiveMatchRelationshipInfo new_() {
        BLiveMatchRelationshipInfo bLiveMatchRelationshipInfo = new BLiveMatchRelationshipInfo();
        bLiveMatchRelationshipInfo.nullCheck();
        return bLiveMatchRelationshipInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMatchRelationshipInfo mo223809clone() {
        BLiveMatchRelationshipInfo bLiveMatchRelationshipInfo = new BLiveMatchRelationshipInfo();
        bLiveMatchRelationshipInfo.isMatched = this.isMatched;
        return bLiveMatchRelationshipInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveMatchRelationshipInfo) && this.isMatched == ((BLiveMatchRelationshipInfo) obj).isMatched;
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
        int i2 = (i * 41) + (this.isMatched ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
