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
public class H5MerchandiseEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5merchandiseenvelope";

    @NonNull
    @ProtobufIndex(index = 1)
    public H5MerchandiseData data;
    public static ProtobufAdapter<H5MerchandiseEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5MerchandiseEnvelope>() { // from class: com.p1.mobile.putong.core.data.H5MerchandiseEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(H5MerchandiseEnvelope h5MerchandiseEnvelope) {
            H5MerchandiseData h5MerchandiseData = h5MerchandiseEnvelope.data;
            int iL = h5MerchandiseData != null ? CodedOutputByteBufferNano.l(1, h5MerchandiseData, H5MerchandiseData.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) h5MerchandiseEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public H5MerchandiseEnvelope m13189parse(nb5 nb5Var) throws IOException {
            H5MerchandiseEnvelope h5MerchandiseEnvelope = new H5MerchandiseEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (h5MerchandiseEnvelope.data != null) {
                        break;
                    }
                    h5MerchandiseEnvelope.data = H5MerchandiseData.new_();
                    break;
                }
                if (iU != 10) {
                    if (h5MerchandiseEnvelope.data != null) {
                        break;
                    }
                    h5MerchandiseEnvelope.data = H5MerchandiseData.new_();
                    return h5MerchandiseEnvelope;
                }
                h5MerchandiseEnvelope.data = (H5MerchandiseData) nb5Var.l(H5MerchandiseData.PROTOBUF_ADAPTER);
            }
            return h5MerchandiseEnvelope;
        }

        public void serialize(H5MerchandiseEnvelope h5MerchandiseEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            H5MerchandiseData h5MerchandiseData = h5MerchandiseEnvelope.data;
            if (h5MerchandiseData != null) {
                codedOutputByteBufferNano.K(1, h5MerchandiseData, H5MerchandiseData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<H5MerchandiseEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<H5MerchandiseEnvelope>() { // from class: com.p1.mobile.putong.core.data.H5MerchandiseEnvelope.2
        public Class getDataClass() {
            return H5MerchandiseEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public H5MerchandiseEnvelope m13190newInstance() {
            return new H5MerchandiseEnvelope();
        }

        public boolean parseField(H5MerchandiseEnvelope h5MerchandiseEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            h5MerchandiseEnvelope.data = (H5MerchandiseData) H5MerchandiseData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(H5MerchandiseEnvelope h5MerchandiseEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(h5MerchandiseEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(H5MerchandiseEnvelope h5MerchandiseEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (h5MerchandiseEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                H5MerchandiseData.JSON_ADAPTER.serialize(h5MerchandiseEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5MerchandiseEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5MerchandiseEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5MerchandiseEnvelope new_() {
        H5MerchandiseEnvelope h5MerchandiseEnvelope = new H5MerchandiseEnvelope();
        h5MerchandiseEnvelope.nullCheck();
        return h5MerchandiseEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public H5MerchandiseEnvelope m13188clone() {
        H5MerchandiseEnvelope h5MerchandiseEnvelope = new H5MerchandiseEnvelope();
        H5MerchandiseData h5MerchandiseData = this.data;
        if (h5MerchandiseData != null) {
            h5MerchandiseEnvelope.data = h5MerchandiseData.m13184clone();
        }
        return h5MerchandiseEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H5MerchandiseEnvelope) {
            return ValueObject.util_equals(this.data, ((H5MerchandiseEnvelope) obj).data);
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
        H5MerchandiseData h5MerchandiseData = this.data;
        int iHashCode = i2 + (h5MerchandiseData != null ? h5MerchandiseData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.data == null) {
            this.data = H5MerchandiseData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
