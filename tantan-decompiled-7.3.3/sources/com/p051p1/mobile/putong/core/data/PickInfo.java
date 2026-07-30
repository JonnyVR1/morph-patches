package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class PickInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pickinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public PicksTagType picksTagType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String picksTracker;
    public static ProtobufAdapter<PickInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<PickInfo>() { // from class: com.p1.mobile.putong.core.data.PickInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PickInfo pickInfo) {
            PicksTagType picksTagType = pickInfo.picksTagType;
            int iM17285l = picksTagType != null ? CodedOutputByteBufferNano.m17285l(1, picksTagType, PicksTagType.PROTOBUF_ADAPTER) : 0;
            String str = pickInfo.picksTracker;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            pickInfo.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PickInfo parse(nc5 nc5Var) throws IOException {
            PickInfo pickInfo = new PickInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (pickInfo.picksTagType == null) {
                        pickInfo.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
                    }
                    if (pickInfo.picksTracker != null) {
                        break;
                    }
                    pickInfo.picksTracker = "";
                    break;
                }
                if (iM162497u == 10) {
                    pickInfo.picksTagType = (PicksTagType) nc5Var.m162488l(PicksTagType.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (pickInfo.picksTagType == null) {
                            pickInfo.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
                        }
                        if (pickInfo.picksTracker != null) {
                            break;
                        }
                        pickInfo.picksTracker = "";
                        return pickInfo;
                    }
                    pickInfo.picksTracker = nc5Var.m162495s();
                }
            }
            return pickInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PickInfo pickInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PicksTagType picksTagType = pickInfo.picksTagType;
            if (picksTagType != null) {
                codedOutputByteBufferNano.m17309K(1, picksTagType, PicksTagType.PROTOBUF_ADAPTER);
            }
            String str = pickInfo.picksTracker;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<PickInfo> JSON_ADAPTER = new ObjectJsonAdapter<PickInfo>() { // from class: com.p1.mobile.putong.core.data.PickInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PickInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PickInfo newInstance() {
            return new PickInfo();
        }

        public boolean parseField(PickInfo pickInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("picksTagType")) {
                pickInfo.picksTagType = PicksTagType.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("picksTracker")) {
                return false;
            }
            pickInfo.picksTracker = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(PickInfo pickInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("picksTagType") || str.equals("picksTracker")) {
                return true;
            }
            return super.parseFieldCheck(pickInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PickInfo pickInfo, JsonGenerator jsonGenerator) throws IOException {
            if (pickInfo.picksTagType != null) {
                jsonGenerator.writeFieldName("picksTagType");
                PicksTagType.JSON_ADAPTER.serialize(pickInfo.picksTagType, jsonGenerator, true);
            }
            String str = pickInfo.picksTracker;
            if (str != null) {
                jsonGenerator.writeStringField("picksTracker", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PickInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PickInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PickInfo new_() {
        PickInfo pickInfo = new PickInfo();
        pickInfo.nullCheck();
        return pickInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PickInfo mo225055clone() {
        PickInfo pickInfo = new PickInfo();
        pickInfo.picksTagType = this.picksTagType;
        pickInfo.picksTracker = this.picksTracker;
        return pickInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PickInfo)) {
            return false;
        }
        PickInfo pickInfo = (PickInfo) obj;
        return ValueObject.util_equals(this.picksTagType, pickInfo.picksTagType) && ValueObject.util_equals(this.picksTracker, pickInfo.picksTracker);
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
        PicksTagType picksTagType = this.picksTagType;
        int iHashCode = (i2 + (picksTagType != null ? picksTagType.hashCode() : 0)) * 41;
        String str = this.picksTracker;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.picksTagType == null) {
            this.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
        }
        if (this.picksTracker == null) {
            this.picksTracker = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
