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
public class PrivateCustomRelation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privatecustomrelation";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String otherState;

    @NonNull
    @ProtobufIndex(index = 1)
    public String state;
    public static ProtobufAdapter<PrivateCustomRelation> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivateCustomRelation>() { // from class: com.p1.mobile.putong.core.data.PrivateCustomRelation.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PrivateCustomRelation privateCustomRelation) {
            String str = privateCustomRelation.state;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = privateCustomRelation.otherState;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) privateCustomRelation).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PrivateCustomRelation m14861parse(nb5 nb5Var) throws IOException {
            PrivateCustomRelation privateCustomRelation = new PrivateCustomRelation();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (privateCustomRelation.state == null) {
                        privateCustomRelation.state = "";
                    }
                    if (privateCustomRelation.otherState != null) {
                        break;
                    }
                    privateCustomRelation.otherState = "";
                    break;
                }
                if (iU == 10) {
                    privateCustomRelation.state = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (privateCustomRelation.state == null) {
                            privateCustomRelation.state = "";
                        }
                        if (privateCustomRelation.otherState != null) {
                            break;
                        }
                        privateCustomRelation.otherState = "";
                        return privateCustomRelation;
                    }
                    privateCustomRelation.otherState = nb5Var.s();
                }
            }
            return privateCustomRelation;
        }

        public void serialize(PrivateCustomRelation privateCustomRelation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = privateCustomRelation.state;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = privateCustomRelation.otherState;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<PrivateCustomRelation> JSON_ADAPTER = new ObjectJsonAdapter<PrivateCustomRelation>() { // from class: com.p1.mobile.putong.core.data.PrivateCustomRelation.2
        public Class getDataClass() {
            return PrivateCustomRelation.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PrivateCustomRelation m14862newInstance() {
            return new PrivateCustomRelation();
        }

        public boolean parseField(PrivateCustomRelation privateCustomRelation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("otherState")) {
                privateCustomRelation.otherState = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(MessageChannel.state)) {
                return false;
            }
            privateCustomRelation.state = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(PrivateCustomRelation privateCustomRelation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("otherState") || str.equals(MessageChannel.state)) {
                return true;
            }
            return super.parseFieldCheck(privateCustomRelation, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(PrivateCustomRelation privateCustomRelation, JsonGenerator jsonGenerator) throws IOException {
            String str = privateCustomRelation.state;
            if (str != null) {
                jsonGenerator.writeStringField(MessageChannel.state, str);
            }
            String str2 = privateCustomRelation.otherState;
            if (str2 != null) {
                jsonGenerator.writeStringField("otherState", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivateCustomRelation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivateCustomRelation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivateCustomRelation new_() {
        PrivateCustomRelation privateCustomRelation = new PrivateCustomRelation();
        privateCustomRelation.nullCheck();
        return privateCustomRelation;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PrivateCustomRelation m14860clone() {
        PrivateCustomRelation privateCustomRelation = new PrivateCustomRelation();
        privateCustomRelation.state = this.state;
        privateCustomRelation.otherState = this.otherState;
        return privateCustomRelation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivateCustomRelation)) {
            return false;
        }
        PrivateCustomRelation privateCustomRelation = (PrivateCustomRelation) obj;
        return ValueObject.util_equals(this.state, privateCustomRelation.state) && ValueObject.util_equals(this.otherState, privateCustomRelation.otherState);
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
        String str = this.state;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.otherState;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.state == null) {
            this.state = "";
        }
        if (this.otherState == null) {
            this.otherState = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
