package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
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
public class RecallMembershipEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recallmembershipenvelope";

    @Nullable
    @ProtobufIndex(index = 2)
    public RecallMembershipData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<RecallMembershipEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecallMembershipEnvelope>() { // from class: com.p1.mobile.putong.core.data.RecallMembershipEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RecallMembershipEnvelope recallMembershipEnvelope) {
            Meta meta = recallMembershipEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            RecallMembershipData recallMembershipData = recallMembershipEnvelope.data;
            if (recallMembershipData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, recallMembershipData, RecallMembershipData.PROTOBUF_ADAPTER);
            }
            recallMembershipEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RecallMembershipEnvelope parse(nc5 nc5Var) throws IOException {
            RecallMembershipEnvelope recallMembershipEnvelope = new RecallMembershipEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (recallMembershipEnvelope.meta != null) {
                        break;
                    }
                    recallMembershipEnvelope.meta = Meta.new_();
                    break;
                }
                if (iM162497u == 10) {
                    recallMembershipEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (recallMembershipEnvelope.meta != null) {
                            break;
                        }
                        recallMembershipEnvelope.meta = Meta.new_();
                        return recallMembershipEnvelope;
                    }
                    recallMembershipEnvelope.data = (RecallMembershipData) nc5Var.m162488l(RecallMembershipData.PROTOBUF_ADAPTER);
                }
            }
            return recallMembershipEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RecallMembershipEnvelope recallMembershipEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = recallMembershipEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            RecallMembershipData recallMembershipData = recallMembershipEnvelope.data;
            if (recallMembershipData != null) {
                codedOutputByteBufferNano.m17309K(2, recallMembershipData, RecallMembershipData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RecallMembershipEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<RecallMembershipEnvelope>() { // from class: com.p1.mobile.putong.core.data.RecallMembershipEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RecallMembershipEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RecallMembershipEnvelope newInstance() {
            return new RecallMembershipEnvelope();
        }

        public boolean parseField(RecallMembershipEnvelope recallMembershipEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                recallMembershipEnvelope.data = RecallMembershipData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            recallMembershipEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RecallMembershipEnvelope recallMembershipEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(recallMembershipEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecallMembershipEnvelope recallMembershipEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (recallMembershipEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(recallMembershipEnvelope.meta, jsonGenerator, true);
            }
            if (recallMembershipEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                RecallMembershipData.JSON_ADAPTER.serialize(recallMembershipEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecallMembershipEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecallMembershipEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecallMembershipEnvelope new_() {
        RecallMembershipEnvelope recallMembershipEnvelope = new RecallMembershipEnvelope();
        recallMembershipEnvelope.nullCheck();
        return recallMembershipEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RecallMembershipEnvelope mo225055clone() {
        RecallMembershipEnvelope recallMembershipEnvelope = new RecallMembershipEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            recallMembershipEnvelope.meta = meta.mo225055clone();
        }
        RecallMembershipData recallMembershipData = this.data;
        if (recallMembershipData != null) {
            recallMembershipEnvelope.data = recallMembershipData.mo225055clone();
        }
        return recallMembershipEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecallMembershipEnvelope)) {
            return false;
        }
        RecallMembershipEnvelope recallMembershipEnvelope = (RecallMembershipEnvelope) obj;
        return ValueObject.util_equals(this.meta, recallMembershipEnvelope.meta) && ValueObject.util_equals(this.data, recallMembershipEnvelope.data);
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
        RecallMembershipData recallMembershipData = this.data;
        int iHashCode2 = iHashCode + (recallMembershipData != null ? recallMembershipData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
