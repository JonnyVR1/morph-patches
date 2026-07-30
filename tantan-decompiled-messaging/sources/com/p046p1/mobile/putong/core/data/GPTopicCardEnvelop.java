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
public class GPTopicCardEnvelop extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gptopiccardenvelop";

    @NonNull
    @ProtobufIndex(index = 2)
    public GPTopicCardData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<GPTopicCardEnvelop> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPTopicCardEnvelop>() { // from class: com.p1.mobile.putong.core.data.GPTopicCardEnvelop.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPTopicCardEnvelop gPTopicCardEnvelop) {
            Meta meta = gPTopicCardEnvelop.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            GPTopicCardData gPTopicCardData = gPTopicCardEnvelop.data;
            if (gPTopicCardData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, gPTopicCardData, GPTopicCardData.PROTOBUF_ADAPTER);
            }
            gPTopicCardEnvelop.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPTopicCardEnvelop parse(nb5 nb5Var) throws IOException {
            GPTopicCardEnvelop gPTopicCardEnvelop = new GPTopicCardEnvelop();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (gPTopicCardEnvelop.meta == null) {
                        gPTopicCardEnvelop.meta = Meta.new_();
                    }
                    if (gPTopicCardEnvelop.data != null) {
                        break;
                    }
                    gPTopicCardEnvelop.data = GPTopicCardData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    gPTopicCardEnvelop.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (gPTopicCardEnvelop.meta == null) {
                            gPTopicCardEnvelop.meta = Meta.new_();
                        }
                        if (gPTopicCardEnvelop.data != null) {
                            break;
                        }
                        gPTopicCardEnvelop.data = GPTopicCardData.new_();
                        return gPTopicCardEnvelop;
                    }
                    gPTopicCardEnvelop.data = (GPTopicCardData) nb5Var.m158743l(GPTopicCardData.PROTOBUF_ADAPTER);
                }
            }
            return gPTopicCardEnvelop;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPTopicCardEnvelop gPTopicCardEnvelop, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = gPTopicCardEnvelop.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            GPTopicCardData gPTopicCardData = gPTopicCardEnvelop.data;
            if (gPTopicCardData != null) {
                codedOutputByteBufferNano.m17254K(2, gPTopicCardData, GPTopicCardData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GPTopicCardEnvelop> JSON_ADAPTER = new ObjectJsonAdapter<GPTopicCardEnvelop>() { // from class: com.p1.mobile.putong.core.data.GPTopicCardEnvelop.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPTopicCardEnvelop.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPTopicCardEnvelop newInstance() {
            return new GPTopicCardEnvelop();
        }

        public boolean parseField(GPTopicCardEnvelop gPTopicCardEnvelop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                gPTopicCardEnvelop.data = GPTopicCardData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            gPTopicCardEnvelop.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPTopicCardEnvelop gPTopicCardEnvelop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(gPTopicCardEnvelop, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPTopicCardEnvelop gPTopicCardEnvelop, JsonGenerator jsonGenerator) throws IOException {
            if (gPTopicCardEnvelop.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(gPTopicCardEnvelop.meta, jsonGenerator, true);
            }
            if (gPTopicCardEnvelop.data != null) {
                jsonGenerator.writeFieldName("data");
                GPTopicCardData.JSON_ADAPTER.serialize(gPTopicCardEnvelop.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPTopicCardEnvelop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPTopicCardEnvelop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPTopicCardEnvelop new_() {
        GPTopicCardEnvelop gPTopicCardEnvelop = new GPTopicCardEnvelop();
        gPTopicCardEnvelop.nullCheck();
        return gPTopicCardEnvelop;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPTopicCardEnvelop mo223809clone() {
        GPTopicCardEnvelop gPTopicCardEnvelop = new GPTopicCardEnvelop();
        Meta meta = this.meta;
        if (meta != null) {
            gPTopicCardEnvelop.meta = meta.mo223809clone();
        }
        GPTopicCardData gPTopicCardData = this.data;
        if (gPTopicCardData != null) {
            gPTopicCardEnvelop.data = gPTopicCardData.mo223809clone();
        }
        return gPTopicCardEnvelop;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPTopicCardEnvelop)) {
            return false;
        }
        GPTopicCardEnvelop gPTopicCardEnvelop = (GPTopicCardEnvelop) obj;
        return ValueObject.util_equals(this.meta, gPTopicCardEnvelop.meta) && ValueObject.util_equals(this.data, gPTopicCardEnvelop.data);
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
        GPTopicCardData gPTopicCardData = this.data;
        int iHashCode2 = iHashCode + (gPTopicCardData != null ? gPTopicCardData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = GPTopicCardData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
