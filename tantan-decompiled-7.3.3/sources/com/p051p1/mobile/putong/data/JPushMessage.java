package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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

/* JADX INFO: loaded from: classes12.dex */
public class JPushMessage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "jpushmessage";

    @NonNull
    @ProtobufIndex(index = 1)
    public String custom;
    public static ProtobufAdapter<JPushMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<JPushMessage>() { // from class: com.p1.mobile.putong.data.JPushMessage.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(JPushMessage jPushMessage) {
            String str = jPushMessage.custom;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            jPushMessage.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public JPushMessage parse(nc5 nc5Var) throws IOException {
            JPushMessage jPushMessage = new JPushMessage();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (jPushMessage.custom != null) {
                        break;
                    }
                    jPushMessage.custom = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (jPushMessage.custom != null) {
                        break;
                    }
                    jPushMessage.custom = "";
                    return jPushMessage;
                }
                jPushMessage.custom = nc5Var.m162495s();
            }
            return jPushMessage;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(JPushMessage jPushMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = jPushMessage.custom;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<JPushMessage> JSON_ADAPTER = new ObjectJsonAdapter<JPushMessage>() { // from class: com.p1.mobile.putong.data.JPushMessage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return JPushMessage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public JPushMessage newInstance() {
            return new JPushMessage();
        }

        public boolean parseField(JPushMessage jPushMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("custom")) {
                return false;
            }
            jPushMessage.custom = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(JPushMessage jPushMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("custom")) {
                return true;
            }
            return super.parseFieldCheck(jPushMessage, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(JPushMessage jPushMessage, JsonGenerator jsonGenerator) throws IOException {
            String str = jPushMessage.custom;
            if (str != null) {
                jsonGenerator.writeStringField("custom", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((JPushMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((JPushMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static JPushMessage new_() {
        JPushMessage jPushMessage = new JPushMessage();
        jPushMessage.nullCheck();
        return jPushMessage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public JPushMessage mo225055clone() {
        JPushMessage jPushMessage = new JPushMessage();
        jPushMessage.custom = this.custom;
        return jPushMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JPushMessage) {
            return ValueObject.util_equals(this.custom, ((JPushMessage) obj).custom);
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
        String str = this.custom;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.custom == null) {
            this.custom = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
