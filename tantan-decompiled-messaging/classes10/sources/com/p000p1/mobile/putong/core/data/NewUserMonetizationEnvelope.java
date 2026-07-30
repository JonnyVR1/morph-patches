package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class NewUserMonetizationEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newusermonetizationenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public NewUserMonetizationData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<NewUserMonetizationEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewUserMonetizationEnvelope>() { // from class: com.p1.mobile.putong.core.data.NewUserMonetizationEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewUserMonetizationEnvelope newUserMonetizationEnvelope) {
            Meta meta = newUserMonetizationEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            NewUserMonetizationData newUserMonetizationData = newUserMonetizationEnvelope.data;
            if (newUserMonetizationData != null) {
                iL += CodedOutputByteBufferNano.l(2, newUserMonetizationData, NewUserMonetizationData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) newUserMonetizationEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewUserMonetizationEnvelope m14551parse(nb5 nb5Var) throws IOException {
            NewUserMonetizationEnvelope newUserMonetizationEnvelope = new NewUserMonetizationEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (newUserMonetizationEnvelope.meta == null) {
                        newUserMonetizationEnvelope.meta = Meta.new_();
                    }
                    if (newUserMonetizationEnvelope.data != null) {
                        break;
                    }
                    newUserMonetizationEnvelope.data = NewUserMonetizationData.new_();
                    break;
                }
                if (iU == 10) {
                    newUserMonetizationEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (newUserMonetizationEnvelope.meta == null) {
                            newUserMonetizationEnvelope.meta = Meta.new_();
                        }
                        if (newUserMonetizationEnvelope.data != null) {
                            break;
                        }
                        newUserMonetizationEnvelope.data = NewUserMonetizationData.new_();
                        return newUserMonetizationEnvelope;
                    }
                    newUserMonetizationEnvelope.data = (NewUserMonetizationData) nb5Var.l(NewUserMonetizationData.PROTOBUF_ADAPTER);
                }
            }
            return newUserMonetizationEnvelope;
        }

        public void serialize(NewUserMonetizationEnvelope newUserMonetizationEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = newUserMonetizationEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            NewUserMonetizationData newUserMonetizationData = newUserMonetizationEnvelope.data;
            if (newUserMonetizationData != null) {
                codedOutputByteBufferNano.K(2, newUserMonetizationData, NewUserMonetizationData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NewUserMonetizationEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<NewUserMonetizationEnvelope>() { // from class: com.p1.mobile.putong.core.data.NewUserMonetizationEnvelope.2
        public Class getDataClass() {
            return NewUserMonetizationEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NewUserMonetizationEnvelope m14552newInstance() {
            return new NewUserMonetizationEnvelope();
        }

        public boolean parseField(NewUserMonetizationEnvelope newUserMonetizationEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                newUserMonetizationEnvelope.data = (NewUserMonetizationData) NewUserMonetizationData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            newUserMonetizationEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NewUserMonetizationEnvelope newUserMonetizationEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(newUserMonetizationEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewUserMonetizationEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewUserMonetizationEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewUserMonetizationEnvelope new_() {
        NewUserMonetizationEnvelope newUserMonetizationEnvelope = new NewUserMonetizationEnvelope();
        newUserMonetizationEnvelope.nullCheck();
        return newUserMonetizationEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewUserMonetizationEnvelope m14550clone() {
        NewUserMonetizationEnvelope newUserMonetizationEnvelope = new NewUserMonetizationEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            newUserMonetizationEnvelope.meta = meta.clone();
        }
        NewUserMonetizationData newUserMonetizationData = this.data;
        if (newUserMonetizationData != null) {
            newUserMonetizationEnvelope.data = newUserMonetizationData.m14546clone();
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
        NewUserMonetizationData newUserMonetizationData = this.data;
        int iHashCode2 = iHashCode + (newUserMonetizationData != null ? newUserMonetizationData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = NewUserMonetizationData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
