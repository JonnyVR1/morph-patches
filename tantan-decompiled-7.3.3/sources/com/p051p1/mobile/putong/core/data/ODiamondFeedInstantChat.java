package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class ODiamondFeedInstantChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondfeedinstantchat";

    @ProtobufIndex(index = 2)
    public long latestVisitTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<ODiamondFeedInstantChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondFeedInstantChat>() { // from class: com.p1.mobile.putong.core.data.ODiamondFeedInstantChat.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ODiamondFeedInstantChat oDiamondFeedInstantChat) {
            String str = oDiamondFeedInstantChat.userId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17283j(2, oDiamondFeedInstantChat.latestVisitTime);
            oDiamondFeedInstantChat.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ODiamondFeedInstantChat parse(nc5 nc5Var) throws IOException {
            ODiamondFeedInstantChat oDiamondFeedInstantChat = new ODiamondFeedInstantChat();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oDiamondFeedInstantChat.userId != null) {
                        break;
                    }
                    oDiamondFeedInstantChat.userId = "";
                    break;
                }
                if (iM162497u == 10) {
                    oDiamondFeedInstantChat.userId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (oDiamondFeedInstantChat.userId != null) {
                            break;
                        }
                        oDiamondFeedInstantChat.userId = "";
                        return oDiamondFeedInstantChat;
                    }
                    oDiamondFeedInstantChat.latestVisitTime = nc5Var.m162487k();
                }
            }
            return oDiamondFeedInstantChat;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ODiamondFeedInstantChat oDiamondFeedInstantChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oDiamondFeedInstantChat.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17307I(2, oDiamondFeedInstantChat.latestVisitTime);
        }
    };
    public static JsonAdapter<ODiamondFeedInstantChat> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondFeedInstantChat>() { // from class: com.p1.mobile.putong.core.data.ODiamondFeedInstantChat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ODiamondFeedInstantChat.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ODiamondFeedInstantChat newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ODiamondFeedInstantChat oDiamondFeedInstantChat, JsonGenerator jsonGenerator) throws IOException {
            String str = oDiamondFeedInstantChat.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("latestVisitTime", oDiamondFeedInstantChat.latestVisitTime);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondFeedInstantChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondFeedInstantChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondFeedInstantChat new_() {
        ODiamondFeedInstantChat oDiamondFeedInstantChat = new ODiamondFeedInstantChat();
        oDiamondFeedInstantChat.nullCheck();
        return oDiamondFeedInstantChat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ODiamondFeedInstantChat mo225055clone() {
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.latestVisitTime;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
