package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Meta;
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
public class GPSubscriptionsEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpsubscriptionsenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public GPSubscriptions data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<GPSubscriptionsEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPSubscriptionsEnvelope>() { // from class: com.p1.mobile.putong.core.data.GPSubscriptionsEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPSubscriptionsEnvelope gPSubscriptionsEnvelope) {
            Meta meta = gPSubscriptionsEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            GPSubscriptions gPSubscriptions = gPSubscriptionsEnvelope.data;
            if (gPSubscriptions != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, gPSubscriptions, GPSubscriptions.PROTOBUF_ADAPTER);
            }
            gPSubscriptionsEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPSubscriptionsEnvelope parse(nb5 nb5Var) throws IOException {
            GPSubscriptionsEnvelope gPSubscriptionsEnvelope = new GPSubscriptionsEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (gPSubscriptionsEnvelope.meta == null) {
                        gPSubscriptionsEnvelope.meta = Meta.new_();
                    }
                    if (gPSubscriptionsEnvelope.data != null) {
                        break;
                    }
                    gPSubscriptionsEnvelope.data = GPSubscriptions.new_();
                    break;
                }
                if (iM158752u == 10) {
                    gPSubscriptionsEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (gPSubscriptionsEnvelope.meta == null) {
                            gPSubscriptionsEnvelope.meta = Meta.new_();
                        }
                        if (gPSubscriptionsEnvelope.data != null) {
                            break;
                        }
                        gPSubscriptionsEnvelope.data = GPSubscriptions.new_();
                        return gPSubscriptionsEnvelope;
                    }
                    gPSubscriptionsEnvelope.data = (GPSubscriptions) nb5Var.m158743l(GPSubscriptions.PROTOBUF_ADAPTER);
                }
            }
            return gPSubscriptionsEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPSubscriptionsEnvelope gPSubscriptionsEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = gPSubscriptionsEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            GPSubscriptions gPSubscriptions = gPSubscriptionsEnvelope.data;
            if (gPSubscriptions != null) {
                codedOutputByteBufferNano.m17254K(2, gPSubscriptions, GPSubscriptions.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GPSubscriptionsEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<GPSubscriptionsEnvelope>() { // from class: com.p1.mobile.putong.core.data.GPSubscriptionsEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPSubscriptionsEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPSubscriptionsEnvelope newInstance() {
            return new GPSubscriptionsEnvelope();
        }

        public boolean parseField(GPSubscriptionsEnvelope gPSubscriptionsEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                gPSubscriptionsEnvelope.data = GPSubscriptions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            gPSubscriptionsEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPSubscriptionsEnvelope gPSubscriptionsEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(gPSubscriptionsEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPSubscriptionsEnvelope gPSubscriptionsEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (gPSubscriptionsEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(gPSubscriptionsEnvelope.meta, jsonGenerator, true);
            }
            if (gPSubscriptionsEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                GPSubscriptions.JSON_ADAPTER.serialize(gPSubscriptionsEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPSubscriptionsEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPSubscriptionsEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPSubscriptionsEnvelope new_() {
        GPSubscriptionsEnvelope gPSubscriptionsEnvelope = new GPSubscriptionsEnvelope();
        gPSubscriptionsEnvelope.nullCheck();
        return gPSubscriptionsEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPSubscriptionsEnvelope mo223809clone() {
        GPSubscriptionsEnvelope gPSubscriptionsEnvelope = new GPSubscriptionsEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            gPSubscriptionsEnvelope.meta = meta.mo223809clone();
        }
        GPSubscriptions gPSubscriptions = this.data;
        if (gPSubscriptions != null) {
            gPSubscriptionsEnvelope.data = gPSubscriptions.mo223809clone();
        }
        return gPSubscriptionsEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPSubscriptionsEnvelope)) {
            return false;
        }
        GPSubscriptionsEnvelope gPSubscriptionsEnvelope = (GPSubscriptionsEnvelope) obj;
        return ValueObject.util_equals(this.meta, gPSubscriptionsEnvelope.meta) && ValueObject.util_equals(this.data, gPSubscriptionsEnvelope.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        GPSubscriptions gPSubscriptions = this.data;
        int iHashCode2 = iHashCode + (gPSubscriptions != null ? gPSubscriptions.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = GPSubscriptions.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
