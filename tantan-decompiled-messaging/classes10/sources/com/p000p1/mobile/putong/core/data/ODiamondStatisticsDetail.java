package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ODiamondStatisticsDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondstatisticsdetail";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String count;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String otherUserId;

    @NonNull
    @ProtobufIndex(index = 1)
    public ODiamondStatisticsType type;
    public static ProtobufAdapter<ODiamondStatisticsDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondStatisticsDetail>() { // from class: com.p1.mobile.putong.core.data.ODiamondStatisticsDetail.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ODiamondStatisticsDetail oDiamondStatisticsDetail) {
            ODiamondStatisticsType oDiamondStatisticsType = oDiamondStatisticsDetail.type;
            int iL = oDiamondStatisticsType != null ? CodedOutputByteBufferNano.l(1, oDiamondStatisticsType, ODiamondStatisticsType.PROTOBUF_ADAPTER) : 0;
            String str = oDiamondStatisticsDetail.count;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = oDiamondStatisticsDetail.otherUserId;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) oDiamondStatisticsDetail).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ODiamondStatisticsDetail m14615parse(nb5 nb5Var) throws IOException {
            ODiamondStatisticsDetail oDiamondStatisticsDetail = new ODiamondStatisticsDetail();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    oDiamondStatisticsDetail.type = (ODiamondStatisticsType) nb5Var.l(ODiamondStatisticsType.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    oDiamondStatisticsDetail.count = nb5Var.s();
                } else {
                    if (iU != 26) {
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
                    oDiamondStatisticsDetail.otherUserId = nb5Var.s();
                }
            }
            return oDiamondStatisticsDetail;
        }

        public void serialize(ODiamondStatisticsDetail oDiamondStatisticsDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ODiamondStatisticsType oDiamondStatisticsType = oDiamondStatisticsDetail.type;
            if (oDiamondStatisticsType != null) {
                codedOutputByteBufferNano.K(1, oDiamondStatisticsType, ODiamondStatisticsType.PROTOBUF_ADAPTER);
            }
            String str = oDiamondStatisticsDetail.count;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = oDiamondStatisticsDetail.otherUserId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<ODiamondStatisticsDetail> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondStatisticsDetail>() { // from class: com.p1.mobile.putong.core.data.ODiamondStatisticsDetail.2
        public Class getDataClass() {
            return ODiamondStatisticsDetail.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ODiamondStatisticsDetail m14616newInstance() {
            return new ODiamondStatisticsDetail();
        }

        public boolean parseField(ODiamondStatisticsDetail oDiamondStatisticsDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    oDiamondStatisticsDetail.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "type":
                    oDiamondStatisticsDetail.type = (ODiamondStatisticsType) ODiamondStatisticsType.JSON_ADAPTER.parse(jsonParser, str2);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondStatisticsDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondStatisticsDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondStatisticsDetail new_() {
        ODiamondStatisticsDetail oDiamondStatisticsDetail = new ODiamondStatisticsDetail();
        oDiamondStatisticsDetail.nullCheck();
        return oDiamondStatisticsDetail;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ODiamondStatisticsDetail m14614clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
