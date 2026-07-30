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
public class GPEnvelop extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpenvelop";

    @NonNull
    @ProtobufIndex(index = 2)
    public GPData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<GPEnvelop> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPEnvelop>() { // from class: com.p1.mobile.putong.data.GPEnvelop.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPEnvelop gPEnvelop) {
            Meta meta = gPEnvelop.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            GPData gPData = gPEnvelop.data;
            if (gPData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, gPData, GPData.PROTOBUF_ADAPTER);
            }
            gPEnvelop.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPEnvelop parse(nb5 nb5Var) throws IOException {
            GPEnvelop gPEnvelop = new GPEnvelop();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (gPEnvelop.meta == null) {
                        gPEnvelop.meta = Meta.new_();
                    }
                    if (gPEnvelop.data != null) {
                        break;
                    }
                    gPEnvelop.data = GPData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    gPEnvelop.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (gPEnvelop.meta == null) {
                            gPEnvelop.meta = Meta.new_();
                        }
                        if (gPEnvelop.data != null) {
                            break;
                        }
                        gPEnvelop.data = GPData.new_();
                        return gPEnvelop;
                    }
                    gPEnvelop.data = (GPData) nb5Var.m158743l(GPData.PROTOBUF_ADAPTER);
                }
            }
            return gPEnvelop;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPEnvelop gPEnvelop, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = gPEnvelop.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            GPData gPData = gPEnvelop.data;
            if (gPData != null) {
                codedOutputByteBufferNano.m17254K(2, gPData, GPData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GPEnvelop> JSON_ADAPTER = new ObjectJsonAdapter<GPEnvelop>() { // from class: com.p1.mobile.putong.data.GPEnvelop.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPEnvelop.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPEnvelop newInstance() {
            return new GPEnvelop();
        }

        public boolean parseField(GPEnvelop gPEnvelop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                gPEnvelop.data = GPData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            gPEnvelop.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPEnvelop gPEnvelop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(gPEnvelop, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPEnvelop gPEnvelop, JsonGenerator jsonGenerator) throws IOException {
            if (gPEnvelop.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(gPEnvelop.meta, jsonGenerator, true);
            }
            if (gPEnvelop.data != null) {
                jsonGenerator.writeFieldName("data");
                GPData.JSON_ADAPTER.serialize(gPEnvelop.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPEnvelop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPEnvelop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPEnvelop new_() {
        GPEnvelop gPEnvelop = new GPEnvelop();
        gPEnvelop.nullCheck();
        return gPEnvelop;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPEnvelop mo223809clone() {
        GPEnvelop gPEnvelop = new GPEnvelop();
        Meta meta = this.meta;
        if (meta != null) {
            gPEnvelop.meta = meta.mo223809clone();
        }
        GPData gPData = this.data;
        if (gPData != null) {
            gPEnvelop.data = gPData.mo223809clone();
        }
        return gPEnvelop;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPEnvelop)) {
            return false;
        }
        GPEnvelop gPEnvelop = (GPEnvelop) obj;
        return ValueObject.util_equals(this.meta, gPEnvelop.meta) && ValueObject.util_equals(this.data, gPEnvelop.data);
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
        GPData gPData = this.data;
        int iHashCode2 = iHashCode + (gPData != null ? gPData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = GPData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
