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
public class BLiveOperationHierarchy extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationHierarchy> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationHierarchy>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationHierarchy.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationHierarchy.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationHierarchy newInstance() {
            return new BLiveOperationHierarchy();
        }

        public boolean parseField(BLiveOperationHierarchy bLiveOperationHierarchy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("userHierarchy")) {
                return false;
            }
            bLiveOperationHierarchy.userHierarchy = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationHierarchy bLiveOperationHierarchy, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("userHierarchy", bLiveOperationHierarchy.userHierarchy);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationHierarchy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationhierarchy";

    @ProtobufIndex(index = 1)
    public int userHierarchy;

    public static BLiveOperationHierarchy new_() {
        BLiveOperationHierarchy bLiveOperationHierarchy = new BLiveOperationHierarchy();
        bLiveOperationHierarchy.nullCheck();
        return bLiveOperationHierarchy;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationHierarchy mo223809clone() {
        BLiveOperationHierarchy bLiveOperationHierarchy = new BLiveOperationHierarchy();
        bLiveOperationHierarchy.userHierarchy = this.userHierarchy;
        return bLiveOperationHierarchy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveOperationHierarchy) && this.userHierarchy == ((BLiveOperationHierarchy) obj).userHierarchy;
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
        int i2 = (i * 41) + this.userHierarchy;
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
