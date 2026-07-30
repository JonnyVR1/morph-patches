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
public class GPContractCancelParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpcontractcancelparams";

    @NonNull
    @ProtobufIndex(index = 2)
    public String contractID;

    @NonNull
    @ProtobufIndex(index = 1)
    public String orderID;
    public static ProtobufAdapter<GPContractCancelParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPContractCancelParams>() { // from class: com.p1.mobile.putong.data.GPContractCancelParams.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPContractCancelParams gPContractCancelParams) {
            String str = gPContractCancelParams.orderID;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = gPContractCancelParams.contractID;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            gPContractCancelParams.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPContractCancelParams parse(nc5 nc5Var) throws IOException {
            GPContractCancelParams gPContractCancelParams = new GPContractCancelParams();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (gPContractCancelParams.orderID == null) {
                        gPContractCancelParams.orderID = "";
                    }
                    if (gPContractCancelParams.contractID != null) {
                        break;
                    }
                    gPContractCancelParams.contractID = "";
                    break;
                }
                if (iM162497u == 10) {
                    gPContractCancelParams.orderID = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (gPContractCancelParams.orderID == null) {
                            gPContractCancelParams.orderID = "";
                        }
                        if (gPContractCancelParams.contractID != null) {
                            break;
                        }
                        gPContractCancelParams.contractID = "";
                        return gPContractCancelParams;
                    }
                    gPContractCancelParams.contractID = nc5Var.m162495s();
                }
            }
            return gPContractCancelParams;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPContractCancelParams gPContractCancelParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gPContractCancelParams.orderID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = gPContractCancelParams.contractID;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<GPContractCancelParams> JSON_ADAPTER = new ObjectJsonAdapter<GPContractCancelParams>() { // from class: com.p1.mobile.putong.data.GPContractCancelParams.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPContractCancelParams.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPContractCancelParams newInstance() {
            return new GPContractCancelParams();
        }

        public boolean parseField(GPContractCancelParams gPContractCancelParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("orderID")) {
                gPContractCancelParams.orderID = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("contractID")) {
                return false;
            }
            gPContractCancelParams.contractID = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GPContractCancelParams gPContractCancelParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("orderID") || str.equals("contractID")) {
                return true;
            }
            return super.parseFieldCheck(gPContractCancelParams, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPContractCancelParams gPContractCancelParams, JsonGenerator jsonGenerator) throws IOException {
            String str = gPContractCancelParams.orderID;
            if (str != null) {
                jsonGenerator.writeStringField("orderID", str);
            }
            String str2 = gPContractCancelParams.contractID;
            if (str2 != null) {
                jsonGenerator.writeStringField("contractID", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPContractCancelParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPContractCancelParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPContractCancelParams new_() {
        GPContractCancelParams gPContractCancelParams = new GPContractCancelParams();
        gPContractCancelParams.nullCheck();
        return gPContractCancelParams;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPContractCancelParams mo225055clone() {
        GPContractCancelParams gPContractCancelParams = new GPContractCancelParams();
        gPContractCancelParams.orderID = this.orderID;
        gPContractCancelParams.contractID = this.contractID;
        return gPContractCancelParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPContractCancelParams)) {
            return false;
        }
        GPContractCancelParams gPContractCancelParams = (GPContractCancelParams) obj;
        return ValueObject.util_equals(this.orderID, gPContractCancelParams.orderID) && ValueObject.util_equals(this.contractID, gPContractCancelParams.contractID);
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
        String str = this.orderID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.contractID;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.orderID == null) {
            this.orderID = "";
        }
        if (this.contractID == null) {
            this.contractID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
