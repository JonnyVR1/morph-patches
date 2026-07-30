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
public class H5PayOrderDataEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5payorderdataenvelope";

    @NonNull
    @ProtobufIndex(index = 1)
    public H5PayOrderDataList data;
    public static ProtobufAdapter<H5PayOrderDataEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5PayOrderDataEnvelope>() { // from class: com.p1.mobile.putong.core.data.H5PayOrderDataEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(H5PayOrderDataEnvelope h5PayOrderDataEnvelope) {
            H5PayOrderDataList h5PayOrderDataList = h5PayOrderDataEnvelope.data;
            int iL = h5PayOrderDataList != null ? CodedOutputByteBufferNano.l(1, h5PayOrderDataList, H5PayOrderDataList.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) h5PayOrderDataEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public H5PayOrderDataEnvelope m13201parse(nb5 nb5Var) throws IOException {
            H5PayOrderDataEnvelope h5PayOrderDataEnvelope = new H5PayOrderDataEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (h5PayOrderDataEnvelope.data != null) {
                        break;
                    }
                    h5PayOrderDataEnvelope.data = H5PayOrderDataList.new_();
                    break;
                }
                if (iU != 10) {
                    if (h5PayOrderDataEnvelope.data != null) {
                        break;
                    }
                    h5PayOrderDataEnvelope.data = H5PayOrderDataList.new_();
                    return h5PayOrderDataEnvelope;
                }
                h5PayOrderDataEnvelope.data = (H5PayOrderDataList) nb5Var.l(H5PayOrderDataList.PROTOBUF_ADAPTER);
            }
            return h5PayOrderDataEnvelope;
        }

        public void serialize(H5PayOrderDataEnvelope h5PayOrderDataEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            H5PayOrderDataList h5PayOrderDataList = h5PayOrderDataEnvelope.data;
            if (h5PayOrderDataList != null) {
                codedOutputByteBufferNano.K(1, h5PayOrderDataList, H5PayOrderDataList.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<H5PayOrderDataEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<H5PayOrderDataEnvelope>() { // from class: com.p1.mobile.putong.core.data.H5PayOrderDataEnvelope.2
        public Class getDataClass() {
            return H5PayOrderDataEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public H5PayOrderDataEnvelope m13202newInstance() {
            return new H5PayOrderDataEnvelope();
        }

        public boolean parseField(H5PayOrderDataEnvelope h5PayOrderDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            h5PayOrderDataEnvelope.data = (H5PayOrderDataList) H5PayOrderDataList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(H5PayOrderDataEnvelope h5PayOrderDataEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(h5PayOrderDataEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(H5PayOrderDataEnvelope h5PayOrderDataEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (h5PayOrderDataEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                H5PayOrderDataList.JSON_ADAPTER.serialize(h5PayOrderDataEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5PayOrderDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5PayOrderDataEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5PayOrderDataEnvelope new_() {
        H5PayOrderDataEnvelope h5PayOrderDataEnvelope = new H5PayOrderDataEnvelope();
        h5PayOrderDataEnvelope.nullCheck();
        return h5PayOrderDataEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public H5PayOrderDataEnvelope m13200clone() {
        H5PayOrderDataEnvelope h5PayOrderDataEnvelope = new H5PayOrderDataEnvelope();
        H5PayOrderDataList h5PayOrderDataList = this.data;
        if (h5PayOrderDataList != null) {
            h5PayOrderDataEnvelope.data = h5PayOrderDataList.m13204clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        H5PayOrderDataList h5PayOrderDataList = this.data;
        int iHashCode = i2 + (h5PayOrderDataList != null ? h5PayOrderDataList.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.data == null) {
            this.data = H5PayOrderDataList.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
