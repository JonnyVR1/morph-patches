package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class TencentResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tencentresult";

    @NonNull
    @ProtobufIndex(index = 1)
    public String orderNo;

    @NonNull
    @ProtobufIndex(index = 3)
    public String providerAppId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String publicUserId;
    public static ProtobufAdapter<TencentResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<TencentResult>() { // from class: com.p1.mobile.putong.data.TencentResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TencentResult tencentResult) {
            String str = tencentResult.orderNo;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = tencentResult.publicUserId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = tencentResult.providerAppId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            tencentResult.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TencentResult parse(nb5 nb5Var) throws IOException {
            TencentResult tencentResult = new TencentResult();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (tencentResult.orderNo == null) {
                        tencentResult.orderNo = "";
                    }
                    if (tencentResult.publicUserId == null) {
                        tencentResult.publicUserId = "";
                    }
                    if (tencentResult.providerAppId != null) {
                        break;
                    }
                    tencentResult.providerAppId = "";
                    break;
                }
                if (iM158752u == 10) {
                    tencentResult.orderNo = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    tencentResult.publicUserId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (tencentResult.orderNo == null) {
                            tencentResult.orderNo = "";
                        }
                        if (tencentResult.publicUserId == null) {
                            tencentResult.publicUserId = "";
                        }
                        if (tencentResult.providerAppId != null) {
                            break;
                        }
                        tencentResult.providerAppId = "";
                        return tencentResult;
                    }
                    tencentResult.providerAppId = nb5Var.m158750s();
                }
            }
            return tencentResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TencentResult tencentResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tencentResult.orderNo;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = tencentResult.publicUserId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = tencentResult.providerAppId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<TencentResult> JSON_ADAPTER = new ObjectJsonAdapter<TencentResult>() { // from class: com.p1.mobile.putong.data.TencentResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TencentResult.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TencentResult newInstance() {
            return new TencentResult();
        }

        public boolean parseField(TencentResult tencentResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "orderNo":
                    tencentResult.orderNo = jsonParser.getValueAsString();
                    return true;
                case "providerAppId":
                    tencentResult.providerAppId = jsonParser.getValueAsString();
                    return true;
                case "publicUserId":
                    tencentResult.publicUserId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TencentResult tencentResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "orderNo":
                case "providerAppId":
                case "publicUserId":
                    return true;
                default:
                    return super.parseFieldCheck(tencentResult, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TencentResult tencentResult, JsonGenerator jsonGenerator) throws IOException {
            String str = tencentResult.orderNo;
            if (str != null) {
                jsonGenerator.writeStringField("orderNo", str);
            }
            String str2 = tencentResult.publicUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("publicUserId", str2);
            }
            String str3 = tencentResult.providerAppId;
            if (str3 != null) {
                jsonGenerator.writeStringField("providerAppId", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TencentResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TencentResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TencentResult new_() {
        TencentResult tencentResult = new TencentResult();
        tencentResult.nullCheck();
        return tencentResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TencentResult mo223809clone() {
        TencentResult tencentResult = new TencentResult();
        tencentResult.orderNo = this.orderNo;
        tencentResult.publicUserId = this.publicUserId;
        tencentResult.providerAppId = this.providerAppId;
        return tencentResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TencentResult)) {
            return false;
        }
        TencentResult tencentResult = (TencentResult) obj;
        return ValueObject.util_equals(this.orderNo, tencentResult.orderNo) && ValueObject.util_equals(this.publicUserId, tencentResult.publicUserId) && ValueObject.util_equals(this.providerAppId, tencentResult.providerAppId);
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
        String str = this.orderNo;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.publicUserId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.providerAppId;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.orderNo == null) {
            this.orderNo = "";
        }
        if (this.publicUserId == null) {
            this.publicUserId = "";
        }
        if (this.providerAppId == null) {
            this.providerAppId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
