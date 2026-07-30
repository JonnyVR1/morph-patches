package com.p051p1.mobile.putong.data;

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
    public String f39605id;

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
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, gPContract.chargeInterval);
            String str2 = gPContract.f39605id;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = gPContract.itemId;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            gPContract.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPContract parse(nc5 nc5Var) throws IOException {
            GPContract gPContract = new GPContract();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (gPContract.iapProductID == null) {
                        gPContract.iapProductID = "";
                    }
                    if (gPContract.f39605id == null) {
                        gPContract.f39605id = "";
                    }
                    if (gPContract.itemId != null) {
                        break;
                    }
                    gPContract.itemId = "";
                    break;
                }
                if (iM162497u == 10) {
                    gPContract.iapProductID = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    gPContract.chargeInterval = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    gPContract.f39605id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (gPContract.iapProductID == null) {
                            gPContract.iapProductID = "";
                        }
                        if (gPContract.f39605id == null) {
                            gPContract.f39605id = "";
                        }
                        if (gPContract.itemId != null) {
                            break;
                        }
                        gPContract.itemId = "";
                        return gPContract;
                    }
                    gPContract.itemId = nc5Var.m162495s();
                }
            }
            return gPContract;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPContract gPContract, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gPContract.iapProductID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, gPContract.chargeInterval);
            String str2 = gPContract.f39605id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = gPContract.itemId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
        }
    };
    public static JsonAdapter<GPContract> JSON_ADAPTER = new ObjectJsonAdapter<GPContract>() { // from class: com.p1.mobile.putong.data.GPContract.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPContract.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    gPContract.f39605id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPContract gPContract, JsonGenerator jsonGenerator) throws IOException {
            String str = gPContract.iapProductID;
            if (str != null) {
                jsonGenerator.writeStringField("iapProductID", str);
            }
            jsonGenerator.writeNumberField("chargeInterval", gPContract.chargeInterval);
            String str2 = gPContract.f39605id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            String str3 = gPContract.itemId;
            if (str3 != null) {
                jsonGenerator.writeStringField("itemId", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPContract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public GPContract mo225055clone() {
        GPContract gPContract = new GPContract();
        gPContract.iapProductID = this.iapProductID;
        gPContract.chargeInterval = this.chargeInterval;
        gPContract.f39605id = this.f39605id;
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
        return ValueObject.util_equals(this.iapProductID, gPContract.iapProductID) && this.chargeInterval == gPContract.chargeInterval && ValueObject.util_equals(this.f39605id, gPContract.f39605id) && ValueObject.util_equals(this.itemId, gPContract.itemId);
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
        String str2 = this.f39605id;
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
        if (this.f39605id == null) {
            this.f39605id = "";
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
