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
public class NewCoinsEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newcoinsenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public NewCoinsData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<NewCoinsEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewCoinsEnvelope>() { // from class: com.p1.mobile.putong.core.data.NewCoinsEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewCoinsEnvelope newCoinsEnvelope) {
            Meta meta = newCoinsEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            NewCoinsData newCoinsData = newCoinsEnvelope.data;
            if (newCoinsData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, newCoinsData, NewCoinsData.PROTOBUF_ADAPTER);
            }
            newCoinsEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewCoinsEnvelope parse(nb5 nb5Var) throws IOException {
            NewCoinsEnvelope newCoinsEnvelope = new NewCoinsEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (newCoinsEnvelope.meta == null) {
                        newCoinsEnvelope.meta = Meta.new_();
                    }
                    if (newCoinsEnvelope.data != null) {
                        break;
                    }
                    newCoinsEnvelope.data = NewCoinsData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    newCoinsEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (newCoinsEnvelope.meta == null) {
                            newCoinsEnvelope.meta = Meta.new_();
                        }
                        if (newCoinsEnvelope.data != null) {
                            break;
                        }
                        newCoinsEnvelope.data = NewCoinsData.new_();
                        return newCoinsEnvelope;
                    }
                    newCoinsEnvelope.data = (NewCoinsData) nb5Var.m158743l(NewCoinsData.PROTOBUF_ADAPTER);
                }
            }
            return newCoinsEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewCoinsEnvelope newCoinsEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = newCoinsEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            NewCoinsData newCoinsData = newCoinsEnvelope.data;
            if (newCoinsData != null) {
                codedOutputByteBufferNano.m17254K(2, newCoinsData, NewCoinsData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NewCoinsEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<NewCoinsEnvelope>() { // from class: com.p1.mobile.putong.core.data.NewCoinsEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewCoinsEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewCoinsEnvelope newInstance() {
            return new NewCoinsEnvelope();
        }

        public boolean parseField(NewCoinsEnvelope newCoinsEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                newCoinsEnvelope.data = NewCoinsData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            newCoinsEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NewCoinsEnvelope newCoinsEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(newCoinsEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewCoinsEnvelope newCoinsEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (newCoinsEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(newCoinsEnvelope.meta, jsonGenerator, true);
            }
            if (newCoinsEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                NewCoinsData.JSON_ADAPTER.serialize(newCoinsEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewCoinsEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewCoinsEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewCoinsEnvelope new_() {
        NewCoinsEnvelope newCoinsEnvelope = new NewCoinsEnvelope();
        newCoinsEnvelope.nullCheck();
        return newCoinsEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewCoinsEnvelope mo223809clone() {
        NewCoinsEnvelope newCoinsEnvelope = new NewCoinsEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            newCoinsEnvelope.meta = meta.mo223809clone();
        }
        NewCoinsData newCoinsData = this.data;
        if (newCoinsData != null) {
            newCoinsEnvelope.data = newCoinsData.mo223809clone();
        }
        return newCoinsEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewCoinsEnvelope)) {
            return false;
        }
        NewCoinsEnvelope newCoinsEnvelope = (NewCoinsEnvelope) obj;
        return ValueObject.util_equals(this.meta, newCoinsEnvelope.meta) && ValueObject.util_equals(this.data, newCoinsEnvelope.data);
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
        NewCoinsData newCoinsData = this.data;
        int iHashCode2 = iHashCode + (newCoinsData != null ? newCoinsData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = NewCoinsData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
