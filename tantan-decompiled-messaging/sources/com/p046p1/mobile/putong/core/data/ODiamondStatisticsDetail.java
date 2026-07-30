package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class ODiamondStatisticsDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondstatisticsdetail";

    @NonNull
    @ProtobufIndex(index = 2)
    public String count;

    @NonNull
    @ProtobufIndex(index = 3)
    public String otherUserId;

    @NonNull
    @ProtobufIndex(index = 1)
    public ODiamondStatisticsType type;
    public static ProtobufAdapter<ODiamondStatisticsDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondStatisticsDetail>() { // from class: com.p1.mobile.putong.core.data.ODiamondStatisticsDetail.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ODiamondStatisticsDetail oDiamondStatisticsDetail) {
            ODiamondStatisticsType oDiamondStatisticsType = oDiamondStatisticsDetail.type;
            int iM17230l = oDiamondStatisticsType != null ? CodedOutputByteBufferNano.m17230l(1, oDiamondStatisticsType, ODiamondStatisticsType.PROTOBUF_ADAPTER) : 0;
            String str = oDiamondStatisticsDetail.count;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = oDiamondStatisticsDetail.otherUserId;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            oDiamondStatisticsDetail.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ODiamondStatisticsDetail parse(nb5 nb5Var) throws IOException {
            ODiamondStatisticsDetail oDiamondStatisticsDetail = new ODiamondStatisticsDetail();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oDiamondStatisticsDetail.type == null) {
                        oDiamondStatisticsDetail.type = (ODiamondStatisticsType) ODiamondStatisticsType.JSON_ADAPTER.defaultEnum();
                    }
                    if (oDiamondStatisticsDetail.count == null) {
                        oDiamondStatisticsDetail.count = "";
                    }
                    if (oDiamondStatisticsDetail.otherUserId != null) {
                        break;
                    }
                    oDiamondStatisticsDetail.otherUserId = "";
                    break;
                }
                if (iM158752u == 10) {
                    oDiamondStatisticsDetail.type = (ODiamondStatisticsType) nb5Var.m158743l(ODiamondStatisticsType.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    oDiamondStatisticsDetail.count = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (oDiamondStatisticsDetail.type == null) {
                            oDiamondStatisticsDetail.type = (ODiamondStatisticsType) ODiamondStatisticsType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oDiamondStatisticsDetail.count == null) {
                            oDiamondStatisticsDetail.count = "";
                        }
                        if (oDiamondStatisticsDetail.otherUserId != null) {
                            break;
                        }
                        oDiamondStatisticsDetail.otherUserId = "";
                        return oDiamondStatisticsDetail;
                    }
                    oDiamondStatisticsDetail.otherUserId = nb5Var.m158750s();
                }
            }
            return oDiamondStatisticsDetail;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ODiamondStatisticsDetail oDiamondStatisticsDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ODiamondStatisticsType oDiamondStatisticsType = oDiamondStatisticsDetail.type;
            if (oDiamondStatisticsType != null) {
                codedOutputByteBufferNano.m17254K(1, oDiamondStatisticsType, ODiamondStatisticsType.PROTOBUF_ADAPTER);
            }
            String str = oDiamondStatisticsDetail.count;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = oDiamondStatisticsDetail.otherUserId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<ODiamondStatisticsDetail> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondStatisticsDetail>() { // from class: com.p1.mobile.putong.core.data.ODiamondStatisticsDetail.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ODiamondStatisticsDetail.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ODiamondStatisticsDetail newInstance() {
            return new ODiamondStatisticsDetail();
        }

        public boolean parseField(ODiamondStatisticsDetail oDiamondStatisticsDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    oDiamondStatisticsDetail.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "type":
                    oDiamondStatisticsDetail.type = ODiamondStatisticsType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "count":
                    oDiamondStatisticsDetail.count = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ODiamondStatisticsDetail oDiamondStatisticsDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherUserId":
                case "type":
                case "count":
                    return true;
                default:
                    return super.parseFieldCheck(oDiamondStatisticsDetail, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ODiamondStatisticsDetail oDiamondStatisticsDetail, JsonGenerator jsonGenerator) throws IOException {
            if (oDiamondStatisticsDetail.type != null) {
                jsonGenerator.writeFieldName("type");
                ODiamondStatisticsType.JSON_ADAPTER.serialize(oDiamondStatisticsDetail.type, jsonGenerator, true);
            }
            String str = oDiamondStatisticsDetail.count;
            if (str != null) {
                jsonGenerator.writeStringField("count", str);
            }
            String str2 = oDiamondStatisticsDetail.otherUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("otherUserId", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondStatisticsDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondStatisticsDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondStatisticsDetail new_() {
        ODiamondStatisticsDetail oDiamondStatisticsDetail = new ODiamondStatisticsDetail();
        oDiamondStatisticsDetail.nullCheck();
        return oDiamondStatisticsDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ODiamondStatisticsDetail mo223809clone() {
        ODiamondStatisticsDetail oDiamondStatisticsDetail = new ODiamondStatisticsDetail();
        oDiamondStatisticsDetail.type = this.type;
        oDiamondStatisticsDetail.count = this.count;
        oDiamondStatisticsDetail.otherUserId = this.otherUserId;
        return oDiamondStatisticsDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ODiamondStatisticsDetail)) {
            return false;
        }
        ODiamondStatisticsDetail oDiamondStatisticsDetail = (ODiamondStatisticsDetail) obj;
        return ValueObject.util_equals(this.type, oDiamondStatisticsDetail.type) && ValueObject.util_equals(this.count, oDiamondStatisticsDetail.count) && ValueObject.util_equals(this.otherUserId, oDiamondStatisticsDetail.otherUserId);
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
        ODiamondStatisticsType oDiamondStatisticsType = this.type;
        int iHashCode = (i2 + (oDiamondStatisticsType != null ? oDiamondStatisticsType.hashCode() : 0)) * 41;
        String str = this.count;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.otherUserId;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = (ODiamondStatisticsType) ODiamondStatisticsType.JSON_ADAPTER.defaultEnum();
        }
        if (this.count == null) {
            this.count = "";
        }
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
