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
public class ODiamondFeedInstantChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondfeedinstantchat";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long latestVisitTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<ODiamondFeedInstantChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondFeedInstantChat>() { // from class: com.p1.mobile.putong.core.data.ODiamondFeedInstantChat.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ODiamondFeedInstantChat oDiamondFeedInstantChat) {
            String str = oDiamondFeedInstantChat.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, oDiamondFeedInstantChat.latestVisitTime);
            ((MessageNano) oDiamondFeedInstantChat).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ODiamondFeedInstantChat m14585parse(nb5 nb5Var) throws IOException {
            ODiamondFeedInstantChat oDiamondFeedInstantChat = new ODiamondFeedInstantChat();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oDiamondFeedInstantChat.userId != null) {
                        break;
                    }
                    oDiamondFeedInstantChat.userId = "";
                    break;
                }
                if (iU == 10) {
                    oDiamondFeedInstantChat.userId = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (oDiamondFeedInstantChat.userId != null) {
                            break;
                        }
                        oDiamondFeedInstantChat.userId = "";
                        return oDiamondFeedInstantChat;
                    }
                    oDiamondFeedInstantChat.latestVisitTime = nb5Var.k();
                }
            }
            return oDiamondFeedInstantChat;
        }

        public void serialize(ODiamondFeedInstantChat oDiamondFeedInstantChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oDiamondFeedInstantChat.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, oDiamondFeedInstantChat.latestVisitTime);
        }
    };
    public static JsonAdapter<ODiamondFeedInstantChat> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondFeedInstantChat>() { // from class: com.p1.mobile.putong.core.data.ODiamondFeedInstantChat.2
        public Class getDataClass() {
            return ODiamondFeedInstantChat.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ODiamondFeedInstantChat m14586newInstance() {
            return new ODiamondFeedInstantChat();
        }

        public boolean parseField(ODiamondFeedInstantChat oDiamondFeedInstantChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                oDiamondFeedInstantChat.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("latestVisitTime")) {
                return false;
            }
            oDiamondFeedInstantChat.latestVisitTime = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(ODiamondFeedInstantChat oDiamondFeedInstantChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("latestVisitTime")) {
                return true;
            }
            return super.parseFieldCheck(oDiamondFeedInstantChat, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ODiamondFeedInstantChat oDiamondFeedInstantChat, JsonGenerator jsonGenerator) throws IOException {
            String str = oDiamondFeedInstantChat.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("latestVisitTime", oDiamondFeedInstantChat.latestVisitTime);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondFeedInstantChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondFeedInstantChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondFeedInstantChat new_() {
        ODiamondFeedInstantChat oDiamondFeedInstantChat = new ODiamondFeedInstantChat();
        oDiamondFeedInstantChat.nullCheck();
        return oDiamondFeedInstantChat;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ODiamondFeedInstantChat m14584clone() {
        ODiamondFeedInstantChat oDiamondFeedInstantChat = new ODiamondFeedInstantChat();
        oDiamondFeedInstantChat.userId = this.userId;
        oDiamondFeedInstantChat.latestVisitTime = this.latestVisitTime;
        return oDiamondFeedInstantChat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ODiamondFeedInstantChat)) {
            return false;
        }
        ODiamondFeedInstantChat oDiamondFeedInstantChat = (ODiamondFeedInstantChat) obj;
        return ValueObject.util_equals(this.userId, oDiamondFeedInstantChat.userId) && this.latestVisitTime == oDiamondFeedInstantChat.latestVisitTime;
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.latestVisitTime;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
