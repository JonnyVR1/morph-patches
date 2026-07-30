package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class RoamedLocationData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "roamedlocationdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<MessageLocation> data;
    public static ProtobufAdapter<RoamedLocationData> PROTOBUF_ADAPTER = new MessageNanoAdapter<RoamedLocationData>() { // from class: com.p1.mobile.putong.core.data.RoamedLocationData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RoamedLocationData roamedLocationData) {
            List<MessageLocation> list = roamedLocationData.data;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, MessageLocation.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            roamedLocationData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RoamedLocationData parse(nb5 nb5Var) throws IOException {
            RoamedLocationData roamedLocationData = new RoamedLocationData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (roamedLocationData.data != null) {
                        break;
                    }
                    roamedLocationData.data = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (roamedLocationData.data != null) {
                        break;
                    }
                    roamedLocationData.data = new ArrayList();
                    return roamedLocationData;
                }
                roamedLocationData.data = (List) nb5Var.m158743l(MessageLocation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return roamedLocationData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RoamedLocationData roamedLocationData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<MessageLocation> list = roamedLocationData.data;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, MessageLocation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RoamedLocationData> JSON_ADAPTER = new ObjectJsonAdapter<RoamedLocationData>() { // from class: com.p1.mobile.putong.core.data.RoamedLocationData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RoamedLocationData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RoamedLocationData newInstance() {
            return new RoamedLocationData();
        }

        public boolean parseField(RoamedLocationData roamedLocationData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            roamedLocationData.data = JsonAdapter.parseArray(jsonParser, MessageLocation.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RoamedLocationData roamedLocationData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(roamedLocationData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RoamedLocationData roamedLocationData, JsonGenerator jsonGenerator) throws IOException {
            if (roamedLocationData.data != null) {
                jsonGenerator.writeFieldName("data");
                JsonAdapter.serializeArray(roamedLocationData.data, jsonGenerator, MessageLocation.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RoamedLocationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RoamedLocationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RoamedLocationData new_() {
        RoamedLocationData roamedLocationData = new RoamedLocationData();
        roamedLocationData.nullCheck();
        return roamedLocationData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RoamedLocationData mo223809clone() {
        RoamedLocationData roamedLocationData = new RoamedLocationData();
        List<MessageLocation> list = this.data;
        if (list != null) {
            roamedLocationData.data = ValueObject.util_map(list, new w9j() { // from class: l.e5d0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MessageLocation) obj).mo223809clone();
                }
            });
        }
        return roamedLocationData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RoamedLocationData) {
            return ValueObject.util_equals(this.data, ((RoamedLocationData) obj).data);
        }
        return false;
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
        List<MessageLocation> list = this.data;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.data == null) {
            this.data = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
