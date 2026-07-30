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
public class GreetingMessages extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingmessages";

    @NonNull
    @ProtobufIndex(index = 1)
    public String latestId;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int unread;
    public static ProtobufAdapter<GreetingMessages> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingMessages>() { // from class: com.p1.mobile.putong.core.data.GreetingMessages.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GreetingMessages greetingMessages) {
            String str = greetingMessages.latestId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, greetingMessages.unread);
            ((MessageNano) greetingMessages).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GreetingMessages m13037parse(nb5 nb5Var) throws IOException {
            GreetingMessages greetingMessages = new GreetingMessages();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (greetingMessages.latestId != null) {
                        break;
                    }
                    greetingMessages.latestId = "";
                    break;
                }
                if (iU == 10) {
                    greetingMessages.latestId = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (greetingMessages.latestId != null) {
                            break;
                        }
                        greetingMessages.latestId = "";
                        return greetingMessages;
                    }
                    greetingMessages.unread = nb5Var.j();
                }
            }
            return greetingMessages;
        }

        public void serialize(GreetingMessages greetingMessages, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = greetingMessages.latestId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, greetingMessages.unread);
        }
    };
    public static JsonAdapter<GreetingMessages> JSON_ADAPTER = new ObjectJsonAdapter<GreetingMessages>() { // from class: com.p1.mobile.putong.core.data.GreetingMessages.2
        public Class getDataClass() {
            return GreetingMessages.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GreetingMessages m13038newInstance() {
            return new GreetingMessages();
        }

        public boolean parseField(GreetingMessages greetingMessages, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("latestId")) {
                greetingMessages.latestId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(LimitTimePictureStatus.unread)) {
                return false;
            }
            greetingMessages.unread = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(GreetingMessages greetingMessages, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("latestId") || str.equals(LimitTimePictureStatus.unread)) {
                return true;
            }
            return super.parseFieldCheck(greetingMessages, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(GreetingMessages greetingMessages, JsonGenerator jsonGenerator) throws IOException {
            String str = greetingMessages.latestId;
            if (str != null) {
                jsonGenerator.writeStringField("latestId", str);
            }
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, greetingMessages.unread);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingMessages new_() {
        GreetingMessages greetingMessages = new GreetingMessages();
        greetingMessages.nullCheck();
        return greetingMessages;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GreetingMessages m13036clone() {
        GreetingMessages greetingMessages = new GreetingMessages();
        greetingMessages.latestId = this.latestId;
        greetingMessages.unread = this.unread;
        return greetingMessages;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreetingMessages)) {
            return false;
        }
        GreetingMessages greetingMessages = (GreetingMessages) obj;
        return ValueObject.util_equals(this.latestId, greetingMessages.latestId) && this.unread == greetingMessages.unread;
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
        String str = this.latestId;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.unread;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.latestId == null) {
            this.latestId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
