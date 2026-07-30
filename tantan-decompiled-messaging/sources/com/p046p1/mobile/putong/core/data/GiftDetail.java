package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class GiftDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftdetail";

    @ProtobufIndex(index = 1)
    public int giftItemId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String giftType;
    public String name;
    public double purchasePrice;
    public double share;

    @ProtobufIndex(index = 3)
    public int total;
    public String unit;
    public double unitPrice;

    @Nullable
    @ProtobufIndex(index = 4)
    public String url;
    public static ProtobufAdapter<GiftDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftDetail>() { // from class: com.p1.mobile.putong.core.data.GiftDetail.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GiftDetail giftDetail) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, giftDetail.giftItemId);
            String str = giftDetail.giftType;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(3, giftDetail.total);
            String str2 = giftDetail.url;
            if (str2 != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            giftDetail.cachedSize = iM17226h2;
            return iM17226h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GiftDetail parse(nb5 nb5Var) throws IOException {
            GiftDetail giftDetail = new GiftDetail();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (giftDetail.giftType != null) {
                        break;
                    }
                    giftDetail.giftType = "";
                    break;
                }
                if (iM158752u == 8) {
                    giftDetail.giftItemId = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    giftDetail.giftType = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    giftDetail.total = nb5Var.m158741j();
                } else {
                    if (iM158752u != 34) {
                        if (giftDetail.giftType != null) {
                            break;
                        }
                        giftDetail.giftType = "";
                        return giftDetail;
                    }
                    giftDetail.url = nb5Var.m158750s();
                }
            }
            return giftDetail;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GiftDetail giftDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, giftDetail.giftItemId);
            String str = giftDetail.giftType;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            codedOutputByteBufferNano.m17250G(3, giftDetail.total);
            String str2 = giftDetail.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
        }
    };
    public static JsonAdapter<GiftDetail> JSON_ADAPTER = new ObjectJsonAdapter<GiftDetail>() { // from class: com.p1.mobile.putong.core.data.GiftDetail.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GiftDetail.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GiftDetail newInstance() {
            return new GiftDetail();
        }

        public boolean parseField(GiftDetail giftDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftItemId":
                    giftDetail.giftItemId = jsonParser.getValueAsInt();
                    return true;
                case "url":
                    giftDetail.url = jsonParser.getValueAsString();
                    return true;
                case "total":
                    giftDetail.total = jsonParser.getValueAsInt();
                    return true;
                case "giftType":
                    giftDetail.giftType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GiftDetail giftDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "giftItemId":
                case "url":
                case "total":
                case "giftType":
                    return true;
                default:
                    return super.parseFieldCheck(giftDetail, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GiftDetail giftDetail, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("giftItemId", giftDetail.giftItemId);
            String str = giftDetail.giftType;
            if (str != null) {
                jsonGenerator.writeStringField("giftType", str);
            }
            jsonGenerator.writeNumberField("total", giftDetail.total);
            String str2 = giftDetail.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftDetail new_() {
        GiftDetail giftDetail = new GiftDetail();
        giftDetail.nullCheck();
        return giftDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GiftDetail mo223809clone() {
        GiftDetail giftDetail = new GiftDetail();
        giftDetail.giftItemId = this.giftItemId;
        giftDetail.giftType = this.giftType;
        giftDetail.total = this.total;
        giftDetail.url = this.url;
        return giftDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftDetail)) {
            return false;
        }
        GiftDetail giftDetail = (GiftDetail) obj;
        return this.giftItemId == giftDetail.giftItemId && ValueObject.util_equals(this.giftType, giftDetail.giftType) && this.total == giftDetail.total && ValueObject.util_equals(this.url, giftDetail.url);
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
        int i2 = ((i * 41) + this.giftItemId) * 41;
        String str = this.giftType;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.total) * 41;
        String str2 = this.url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftType == null) {
            this.giftType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
