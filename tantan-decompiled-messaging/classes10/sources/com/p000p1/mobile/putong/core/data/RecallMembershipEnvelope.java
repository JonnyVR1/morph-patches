package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
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
public class RecallMembershipEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recallmembershipenvelope";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public RecallMembershipData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<RecallMembershipEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecallMembershipEnvelope>() { // from class: com.p1.mobile.putong.core.data.RecallMembershipEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RecallMembershipEnvelope recallMembershipEnvelope) {
            Meta meta = recallMembershipEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            RecallMembershipData recallMembershipData = recallMembershipEnvelope.data;
            if (recallMembershipData != null) {
                iL += CodedOutputByteBufferNano.l(2, recallMembershipData, RecallMembershipData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) recallMembershipEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RecallMembershipEnvelope m15293parse(nb5 nb5Var) throws IOException {
            RecallMembershipEnvelope recallMembershipEnvelope = new RecallMembershipEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (recallMembershipEnvelope.meta != null) {
                        break;
                    }
                    recallMembershipEnvelope.meta = Meta.new_();
                    break;
                }
                if (iU == 10) {
                    recallMembershipEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (recallMembershipEnvelope.meta != null) {
                            break;
                        }
                        recallMembershipEnvelope.meta = Meta.new_();
                        return recallMembershipEnvelope;
                    }
                    recallMembershipEnvelope.data = (RecallMembershipData) nb5Var.l(RecallMembershipData.PROTOBUF_ADAPTER);
                }
            }
            return recallMembershipEnvelope;
        }

        public void serialize(RecallMembershipEnvelope recallMembershipEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = recallMembershipEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            RecallMembershipData recallMembershipData = recallMembershipEnvelope.data;
            if (recallMembershipData != null) {
                codedOutputByteBufferNano.K(2, recallMembershipData, RecallMembershipData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RecallMembershipEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<RecallMembershipEnvelope>() { // from class: com.p1.mobile.putong.core.data.RecallMembershipEnvelope.2
        public Class getDataClass() {
            return RecallMembershipEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RecallMembershipEnvelope m15294newInstance() {
            return new RecallMembershipEnvelope();
        }

        public boolean parseField(RecallMembershipEnvelope recallMembershipEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                recallMembershipEnvelope.data = (RecallMembershipData) RecallMembershipData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            recallMembershipEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RecallMembershipEnvelope recallMembershipEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(recallMembershipEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecallMembershipEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecallMembershipEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecallMembershipEnvelope new_() {
        RecallMembershipEnvelope recallMembershipEnvelope = new RecallMembershipEnvelope();
        recallMembershipEnvelope.nullCheck();
        return recallMembershipEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RecallMembershipEnvelope m15292clone() {
        RecallMembershipEnvelope recallMembershipEnvelope = new RecallMembershipEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            recallMembershipEnvelope.meta = meta.clone();
        }
        RecallMembershipData recallMembershipData = this.data;
        if (recallMembershipData != null) {
            recallMembershipEnvelope.data = recallMembershipData.m15288clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        RecallMembershipData recallMembershipData = this.data;
        int iHashCode2 = iHashCode + (recallMembershipData != null ? recallMembershipData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
