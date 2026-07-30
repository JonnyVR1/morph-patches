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
public class NewUserMonetizationEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newusermonetizationenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public NewUserMonetizationData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<NewUserMonetizationEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewUserMonetizationEnvelope>() { // from class: com.p1.mobile.putong.core.data.NewUserMonetizationEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewUserMonetizationEnvelope newUserMonetizationEnvelope) {
            Meta meta = newUserMonetizationEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            NewUserMonetizationData newUserMonetizationData = newUserMonetizationEnvelope.data;
            if (newUserMonetizationData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, newUserMonetizationData, NewUserMonetizationData.PROTOBUF_ADAPTER);
            }
            newUserMonetizationEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewUserMonetizationEnvelope parse(nb5 nb5Var) throws IOException {
            NewUserMonetizationEnvelope newUserMonetizationEnvelope = new NewUserMonetizationEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (newUserMonetizationEnvelope.meta == null) {
                        newUserMonetizationEnvelope.meta = Meta.new_();
                    }
                    if (newUserMonetizationEnvelope.data != null) {
                        break;
                    }
                    newUserMonetizationEnvelope.data = NewUserMonetizationData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    newUserMonetizationEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (newUserMonetizationEnvelope.meta == null) {
                            newUserMonetizationEnvelope.meta = Meta.new_();
                        }
                        if (newUserMonetizationEnvelope.data != null) {
                            break;
                        }
                        newUserMonetizationEnvelope.data = NewUserMonetizationData.new_();
                        return newUserMonetizationEnvelope;
                    }
                    newUserMonetizationEnvelope.data = (NewUserMonetizationData) nb5Var.m158743l(NewUserMonetizationData.PROTOBUF_ADAPTER);
                }
            }
            return newUserMonetizationEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewUserMonetizationEnvelope newUserMonetizationEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = newUserMonetizationEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            NewUserMonetizationData newUserMonetizationData = newUserMonetizationEnvelope.data;
            if (newUserMonetizationData != null) {
                codedOutputByteBufferNano.m17254K(2, newUserMonetizationData, NewUserMonetizationData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NewUserMonetizationEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<NewUserMonetizationEnvelope>() { // from class: com.p1.mobile.putong.core.data.NewUserMonetizationEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewUserMonetizationEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewUserMonetizationEnvelope newInstance() {
            return new NewUserMonetizationEnvelope();
        }

        public boolean parseField(NewUserMonetizationEnvelope newUserMonetizationEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                newUserMonetizationEnvelope.data = NewUserMonetizationData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            newUserMonetizationEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NewUserMonetizationEnvelope newUserMonetizationEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(newUserMonetizationEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewUserMonetizationEnvelope newUserMonetizationEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (newUserMonetizationEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(newUserMonetizationEnvelope.meta, jsonGenerator, true);
            }
            if (newUserMonetizationEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                NewUserMonetizationData.JSON_ADAPTER.serialize(newUserMonetizationEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewUserMonetizationEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewUserMonetizationEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewUserMonetizationEnvelope new_() {
        NewUserMonetizationEnvelope newUserMonetizationEnvelope = new NewUserMonetizationEnvelope();
        newUserMonetizationEnvelope.nullCheck();
        return newUserMonetizationEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewUserMonetizationEnvelope mo223809clone() {
        NewUserMonetizationEnvelope newUserMonetizationEnvelope = new NewUserMonetizationEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            newUserMonetizationEnvelope.meta = meta.mo223809clone();
        }
        NewUserMonetizationData newUserMonetizationData = this.data;
        if (newUserMonetizationData != null) {
            newUserMonetizationEnvelope.data = newUserMonetizationData.mo223809clone();
        }
        return newUserMonetizationEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewUserMonetizationEnvelope)) {
            return false;
        }
        NewUserMonetizationEnvelope newUserMonetizationEnvelope = (NewUserMonetizationEnvelope) obj;
        return ValueObject.util_equals(this.meta, newUserMonetizationEnvelope.meta) && ValueObject.util_equals(this.data, newUserMonetizationEnvelope.data);
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
        NewUserMonetizationData newUserMonetizationData = this.data;
        int iHashCode2 = iHashCode + (newUserMonetizationData != null ? newUserMonetizationData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = NewUserMonetizationData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
