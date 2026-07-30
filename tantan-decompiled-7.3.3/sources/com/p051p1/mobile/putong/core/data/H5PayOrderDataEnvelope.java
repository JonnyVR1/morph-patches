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
public class H5PayOrderDataEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5payorderdataenvelope";

    @NonNull
    @ProtobufIndex(index = 1)
    public H5PayOrderDataList data;
    public static ProtobufAdapter<H5PayOrderDataEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5PayOrderDataEnvelope>() { // from class: com.p1.mobile.putong.core.data.H5PayOrderDataEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(H5PayOrderDataEnvelope h5PayOrderDataEnvelope) {
            H5PayOrderDataList h5PayOrderDataList = h5PayOrderDataEnvelope.data;
            int iM17285l = h5PayOrderDataList != null ? CodedOutputByteBufferNano.m17285l(1, h5PayOrderDataList, H5PayOrderDataList.PROTOBUF_ADAPTER) : 0;
            h5PayOrderDataEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public H5PayOrderDataEnvelope parse(nc5 nc5Var) throws IOException {
            H5PayOrderDataEnvelope h5PayOrderDataEnvelope = new H5PayOrderDataEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (h5PayOrderDataEnvelope.data != null) {
                        break;
                    }
                    h5PayOrderDataEnvelope.data = H5PayOrderDataList.new_();
                    break;
                }
                if (iM162497u != 10) {
                    if (h5PayOrderDataEnvelope.data != null) {
                        break;
                    }
                    h5PayOrderDataEnvelope.data = H5PayOrderDataList.new_();
                    return h5PayOrderDataEnvelope;
                }
                h5PayOrderDataEnvelope.data = (H5PayOrderDataList) nc5Var.m162488l(H5PayOrderDataList.PROTOBUF_ADAPTER);
            }
            return h5PayOrderDataEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(H5PayOrderDataEnvelope h5PayOrderDataEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            H5PayOrderDataList h5PayOrderDataList = h5PayOrderDataEnvelope.data;
            if (h5PayOrderDataList != null) {
                codedOutputByteBufferNano.m17309K(1, h5PayOrderDataList, H5PayOrderDataList.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<H5PayOrderDataEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<H5PayOrderDataEnvelope>() { // from class: com.p1.mobile.putong.core.data.H5PayOrderDataEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return H5PayOrderDataEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public H5PayOrderDataEnvelope newInstance() {
            return new H5PayOrderDataEnvelope();
        }

        public boolean parseField(H5PayOrderDataEnvelope h5PayOrderDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            h5PayOrderDataEnvelope.data = H5PayOrderDataList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(H5PayOrderDataEnvelope h5PayOrderDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(h5PayOrderDataEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(H5PayOrderDataEnvelope h5PayOrderDataEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (h5PayOrderDataEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                H5PayOrderDataList.JSON_ADAPTER.serialize(h5PayOrderDataEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5PayOrderDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5PayOrderDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5PayOrderDataEnvelope new_() {
        H5PayOrderDataEnvelope h5PayOrderDataEnvelope = new H5PayOrderDataEnvelope();
        h5PayOrderDataEnvelope.nullCheck();
        return h5PayOrderDataEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public H5PayOrderDataEnvelope mo225055clone() {
        H5PayOrderDataEnvelope h5PayOrderDataEnvelope = new H5PayOrderDataEnvelope();
        H5PayOrderDataList h5PayOrderDataList = this.data;
        if (h5PayOrderDataList != null) {
            h5PayOrderDataEnvelope.data = h5PayOrderDataList.mo225055clone();
        }
        return h5PayOrderDataEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H5PayOrderDataEnvelope) {
            return ValueObject.util_equals(this.data, ((H5PayOrderDataEnvelope) obj).data);
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
        H5PayOrderDataList h5PayOrderDataList = this.data;
        int iHashCode = i2 + (h5PayOrderDataList != null ? h5PayOrderDataList.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.data == null) {
            this.data = H5PayOrderDataList.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
