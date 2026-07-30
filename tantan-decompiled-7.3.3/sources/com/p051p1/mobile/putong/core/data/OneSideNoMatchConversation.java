package com.p051p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class OneSideNoMatchConversation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "onesidenomatchconversation";

    @Nullable
    @ProtobufIndex(index = 1)
    public Boolean selfSend;
    public static ProtobufAdapter<OneSideNoMatchConversation> PROTOBUF_ADAPTER = new MessageNanoAdapter<OneSideNoMatchConversation>() { // from class: com.p1.mobile.putong.core.data.OneSideNoMatchConversation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OneSideNoMatchConversation oneSideNoMatchConversation) {
            Boolean bool = oneSideNoMatchConversation.selfSend;
            int iM17275b = bool != null ? CodedOutputByteBufferNano.m17275b(1, bool.booleanValue()) : 0;
            oneSideNoMatchConversation.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OneSideNoMatchConversation parse(nc5 nc5Var) throws IOException {
            OneSideNoMatchConversation oneSideNoMatchConversation = new OneSideNoMatchConversation();
            while (nc5Var.m162497u() == 8) {
                oneSideNoMatchConversation.selfSend = Boolean.valueOf(nc5Var.m162483g());
            }
            return oneSideNoMatchConversation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OneSideNoMatchConversation oneSideNoMatchConversation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = oneSideNoMatchConversation.selfSend;
            if (bool != null) {
                codedOutputByteBufferNano.m17299A(1, bool.booleanValue());
            }
        }
    };
    public static JsonAdapter<OneSideNoMatchConversation> JSON_ADAPTER = new ObjectJsonAdapter<OneSideNoMatchConversation>() { // from class: com.p1.mobile.putong.core.data.OneSideNoMatchConversation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OneSideNoMatchConversation.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OneSideNoMatchConversation newInstance() {
            return new OneSideNoMatchConversation();
        }

        public boolean parseField(OneSideNoMatchConversation oneSideNoMatchConversation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("selfSend")) {
                return false;
            }
            oneSideNoMatchConversation.selfSend = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        }

        public boolean parseFieldCheck(OneSideNoMatchConversation oneSideNoMatchConversation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("selfSend")) {
                return true;
            }
            return super.parseFieldCheck(oneSideNoMatchConversation, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OneSideNoMatchConversation oneSideNoMatchConversation, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = oneSideNoMatchConversation.selfSend;
            if (bool != null) {
                jsonGenerator.writeBooleanField("selfSend", bool.booleanValue());
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OneSideNoMatchConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OneSideNoMatchConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OneSideNoMatchConversation new_() {
        OneSideNoMatchConversation oneSideNoMatchConversation = new OneSideNoMatchConversation();
        oneSideNoMatchConversation.nullCheck();
        return oneSideNoMatchConversation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OneSideNoMatchConversation mo225055clone() {
        OneSideNoMatchConversation oneSideNoMatchConversation = new OneSideNoMatchConversation();
        oneSideNoMatchConversation.selfSend = this.selfSend;
        return oneSideNoMatchConversation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OneSideNoMatchConversation) {
            return ValueObject.util_equals(this.selfSend, ((OneSideNoMatchConversation) obj).selfSend);
        }
        return false;
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
        Boolean bool = this.selfSend;
        int iHashCode = i2 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
