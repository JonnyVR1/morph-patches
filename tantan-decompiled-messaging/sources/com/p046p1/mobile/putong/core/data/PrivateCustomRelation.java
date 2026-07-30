package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class PrivateCustomRelation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privatecustomrelation";

    @NonNull
    @ProtobufIndex(index = 2)
    public String otherState;

    @NonNull
    @ProtobufIndex(index = 1)
    public String state;
    public static ProtobufAdapter<PrivateCustomRelation> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivateCustomRelation>() { // from class: com.p1.mobile.putong.core.data.PrivateCustomRelation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrivateCustomRelation privateCustomRelation) {
            String str = privateCustomRelation.state;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = privateCustomRelation.otherState;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            privateCustomRelation.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrivateCustomRelation parse(nb5 nb5Var) throws IOException {
            PrivateCustomRelation privateCustomRelation = new PrivateCustomRelation();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (privateCustomRelation.state == null) {
                        privateCustomRelation.state = "";
                    }
                    if (privateCustomRelation.otherState != null) {
                        break;
                    }
                    privateCustomRelation.otherState = "";
                    break;
                }
                if (iM158752u == 10) {
                    privateCustomRelation.state = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (privateCustomRelation.state == null) {
                            privateCustomRelation.state = "";
                        }
                        if (privateCustomRelation.otherState != null) {
                            break;
                        }
                        privateCustomRelation.otherState = "";
                        return privateCustomRelation;
                    }
                    privateCustomRelation.otherState = nb5Var.m158750s();
                }
            }
            return privateCustomRelation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrivateCustomRelation privateCustomRelation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = privateCustomRelation.state;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = privateCustomRelation.otherState;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<PrivateCustomRelation> JSON_ADAPTER = new ObjectJsonAdapter<PrivateCustomRelation>() { // from class: com.p1.mobile.putong.core.data.PrivateCustomRelation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrivateCustomRelation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrivateCustomRelation newInstance() {
            return new PrivateCustomRelation();
        }

        public boolean parseField(PrivateCustomRelation privateCustomRelation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("otherState")) {
                privateCustomRelation.otherState = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("state")) {
                return false;
            }
            privateCustomRelation.state = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(PrivateCustomRelation privateCustomRelation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("otherState") || str.equals("state")) {
                return true;
            }
            return super.parseFieldCheck(privateCustomRelation, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivateCustomRelation privateCustomRelation, JsonGenerator jsonGenerator) throws IOException {
            String str = privateCustomRelation.state;
            if (str != null) {
                jsonGenerator.writeStringField("state", str);
            }
            String str2 = privateCustomRelation.otherState;
            if (str2 != null) {
                jsonGenerator.writeStringField("otherState", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivateCustomRelation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivateCustomRelation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivateCustomRelation new_() {
        PrivateCustomRelation privateCustomRelation = new PrivateCustomRelation();
        privateCustomRelation.nullCheck();
        return privateCustomRelation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrivateCustomRelation mo223809clone() {
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
        String str = this.state;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.otherState;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.state == null) {
            this.state = "";
        }
        if (this.otherState == null) {
            this.otherState = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
