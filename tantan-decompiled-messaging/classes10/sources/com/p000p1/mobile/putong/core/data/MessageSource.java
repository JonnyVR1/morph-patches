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
public class MessageSource extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagesource";

    @NonNull
    @ProtobufIndex(index = 1)
    public String scene;
    public static ProtobufAdapter<MessageSource> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageSource>() { // from class: com.p1.mobile.putong.core.data.MessageSource.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageSource messageSource) {
            String str = messageSource.scene;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) messageSource).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageSource m14271parse(nb5 nb5Var) throws IOException {
            MessageSource messageSource = new MessageSource();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageSource.scene != null) {
                        break;
                    }
                    messageSource.scene = "";
                    break;
                }
                if (iU != 10) {
                    if (messageSource.scene != null) {
                        break;
                    }
                    messageSource.scene = "";
                    return messageSource;
                }
                messageSource.scene = nb5Var.s();
            }
            return messageSource;
        }

        public void serialize(MessageSource messageSource, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageSource.scene;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<MessageSource> JSON_ADAPTER = new ObjectJsonAdapter<MessageSource>() { // from class: com.p1.mobile.putong.core.data.MessageSource.2
        public Class getDataClass() {
            return MessageSource.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageSource m14272newInstance() {
            return new MessageSource();
        }

        public boolean parseField(MessageSource messageSource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("scene")) {
                return false;
            }
            messageSource.scene = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MessageSource messageSource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("scene")) {
                return true;
            }
            return super.parseFieldCheck(messageSource, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MessageSource messageSource, JsonGenerator jsonGenerator) throws IOException {
            String str = messageSource.scene;
            if (str != null) {
                jsonGenerator.writeStringField("scene", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageSource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageSource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageSource new_() {
        MessageSource messageSource = new MessageSource();
        messageSource.nullCheck();
        return messageSource;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageSource m14270clone() {
        MessageSource messageSource = new MessageSource();
        messageSource.scene = this.scene;
        return messageSource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageSource) {
            return ValueObject.util_equals(this.scene, ((MessageSource) obj).scene);
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
        String str = this.scene;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.scene == null) {
            this.scene = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
