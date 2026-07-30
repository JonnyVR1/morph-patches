package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class JPushMessage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "jpushmessage";

    @NonNull
    @ProtobufIndex(index = 1)
    public String custom;
    public static ProtobufAdapter<JPushMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<JPushMessage>() { // from class: com.p1.mobile.putong.data.JPushMessage.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(JPushMessage jPushMessage) {
            String str = jPushMessage.custom;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) jPushMessage).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public JPushMessage m18265parse(nb5 nb5Var) throws IOException {
            JPushMessage jPushMessage = new JPushMessage();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (jPushMessage.custom != null) {
                        break;
                    }
                    jPushMessage.custom = "";
                    break;
                }
                if (iU != 10) {
                    if (jPushMessage.custom != null) {
                        break;
                    }
                    jPushMessage.custom = "";
                    return jPushMessage;
                }
                jPushMessage.custom = nb5Var.s();
            }
            return jPushMessage;
        }

        public void serialize(JPushMessage jPushMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = jPushMessage.custom;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<JPushMessage> JSON_ADAPTER = new ObjectJsonAdapter<JPushMessage>() { // from class: com.p1.mobile.putong.data.JPushMessage.2
        public Class getDataClass() {
            return JPushMessage.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public JPushMessage mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(JPushMessage jPushMessage, JsonGenerator jsonGenerator) throws IOException {
            String str = jPushMessage.custom;
            if (str != null) {
                jsonGenerator.writeStringField("custom", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((JPushMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((JPushMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static JPushMessage new_() {
        JPushMessage jPushMessage = new JPushMessage();
        jPushMessage.nullCheck();
        return jPushMessage;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public JPushMessage m18264clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.custom;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.custom == null) {
            this.custom = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
