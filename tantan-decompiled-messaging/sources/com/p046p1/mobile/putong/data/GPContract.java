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
public class GPContract extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpcontract";

    @ProtobufIndex(index = 2)
    public int chargeInterval;

    @NonNull
    @ProtobufIndex(index = 1)
    public String iapProductID;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f38757id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String itemId;
    public static ProtobufAdapter<GPContract> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPContract>() { // from class: com.p1.mobile.putong.data.GPContract.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPContract gPContract) {
            String str = gPContract.iapProductID;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, gPContract.chargeInterval);
            String str2 = gPContract.f38757id;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = gPContract.itemId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            gPContract.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPContract parse(nb5 nb5Var) throws IOException {
            GPContract gPContract = new GPContract();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (gPContract.iapProductID == null) {
                        gPContract.iapProductID = "";
                    }
                    if (gPContract.f38757id == null) {
                        gPContract.f38757id = "";
                    }
                    if (gPContract.itemId != null) {
                        break;
                    }
                    gPContract.itemId = "";
                    break;
                }
                if (iM158752u == 10) {
                    gPContract.iapProductID = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    gPContract.chargeInterval = nb5Var.m158741j();
                } else if (iM158752u == 26) {
                    gPContract.f38757id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (gPContract.iapProductID == null) {
                            gPContract.iapProductID = "";
                        }
                        if (gPContract.f38757id == null) {
                            gPContract.f38757id = "";
                        }
                        if (gPContract.itemId != null) {
                            break;
                        }
                        gPContract.itemId = "";
                        return gPContract;
                    }
                    gPContract.itemId = nb5Var.m158750s();
                }
            }
            return gPContract;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPContract gPContract, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gPContract.iapProductID;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, gPContract.chargeInterval);
            String str2 = gPContract.f38757id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = gPContract.itemId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<GPContract> JSON_ADAPTER = new ObjectJsonAdapter<GPContract>() { // from class: com.p1.mobile.putong.data.GPContract.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPContract.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPContract newInstance() {
            return new GPContract();
        }

        public boolean parseField(GPContract gPContract, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "iapProductID":
                    gPContract.iapProductID = jsonParser.getValueAsString();
                    return true;
                case "itemId":
                    gPContract.itemId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    gPContract.f38757id = jsonParser.getValueAsString();
                    return false;
                case "chargeInterval":
                    gPContract.chargeInterval = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GPContract gPContract, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "iapProductID":
                case "itemId":
                    return true;
                case "id":
                    return false;
                case "chargeInterval":
                    return true;
                default:
                    return super.parseFieldCheck(gPContract, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPContract gPContract, JsonGenerator jsonGenerator) throws IOException {
            String str = gPContract.iapProductID;
            if (str != null) {
                jsonGenerator.writeStringField("iapProductID", str);
            }
            jsonGenerator.writeNumberField("chargeInterval", gPContract.chargeInterval);
            String str2 = gPContract.f38757id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            String str3 = gPContract.itemId;
            if (str3 != null) {
                jsonGenerator.writeStringField("itemId", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPContract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPContract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPContract new_() {
        GPContract gPContract = new GPContract();
        gPContract.nullCheck();
        return gPContract;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPContract mo223809clone() {
        GPContract gPContract = new GPContract();
        gPContract.iapProductID = this.iapProductID;
        gPContract.chargeInterval = this.chargeInterval;
        gPContract.f38757id = this.f38757id;
        gPContract.itemId = this.itemId;
        return gPContract;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPContract)) {
            return false;
        }
        GPContract gPContract = (GPContract) obj;
        return ValueObject.util_equals(this.iapProductID, gPContract.iapProductID) && this.chargeInterval == gPContract.chargeInterval && ValueObject.util_equals(this.f38757id, gPContract.f38757id) && ValueObject.util_equals(this.itemId, gPContract.itemId);
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
        String str = this.iapProductID;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.chargeInterval) * 41;
        String str2 = this.f38757id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.itemId;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.iapProductID == null) {
            this.iapProductID = "";
        }
        if (this.f38757id == null) {
            this.f38757id = "";
        }
        if (this.itemId == null) {
            this.itemId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
