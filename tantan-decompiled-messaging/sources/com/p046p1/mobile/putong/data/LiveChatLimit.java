package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class LiveChatLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livechatlimit";

    @ProtobufIndex(index = 2)
    public int remaining;

    @ProtobufIndex(index = 1)
    public int total;
    public static ProtobufAdapter<LiveChatLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveChatLimit>() { // from class: com.p1.mobile.putong.data.LiveChatLimit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveChatLimit liveChatLimit) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, liveChatLimit.total) + CodedOutputByteBufferNano.m17226h(2, liveChatLimit.remaining);
            liveChatLimit.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveChatLimit parse(nb5 nb5Var) throws IOException {
            LiveChatLimit liveChatLimit = new LiveChatLimit();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    liveChatLimit.total = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return liveChatLimit;
                    }
                    liveChatLimit.remaining = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveChatLimit liveChatLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, liveChatLimit.total);
            codedOutputByteBufferNano.m17250G(2, liveChatLimit.remaining);
        }
    };
    public static JsonAdapter<LiveChatLimit> JSON_ADAPTER = new ObjectJsonAdapter<LiveChatLimit>() { // from class: com.p1.mobile.putong.data.LiveChatLimit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveChatLimit.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveChatLimit newInstance() {
            return new LiveChatLimit();
        }

        public boolean parseField(LiveChatLimit liveChatLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("total")) {
                liveChatLimit.total = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("remaining")) {
                return false;
            }
            liveChatLimit.remaining = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(LiveChatLimit liveChatLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("total") || str.equals("remaining")) {
                return true;
            }
            return super.parseFieldCheck(liveChatLimit, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveChatLimit liveChatLimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("total", liveChatLimit.total);
            jsonGenerator.writeNumberField("remaining", liveChatLimit.remaining);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveChatLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveChatLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveChatLimit new_() {
        LiveChatLimit liveChatLimit = new LiveChatLimit();
        liveChatLimit.nullCheck();
        return liveChatLimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveChatLimit mo223809clone() {
        LiveChatLimit liveChatLimit = new LiveChatLimit();
        liveChatLimit.total = this.total;
        liveChatLimit.remaining = this.remaining;
        return liveChatLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveChatLimit)) {
            return false;
        }
        LiveChatLimit liveChatLimit = (LiveChatLimit) obj;
        return this.total == liveChatLimit.total && this.remaining == liveChatLimit.remaining;
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
        int i2 = (((i * 41) + this.total) * 41) + this.remaining;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
