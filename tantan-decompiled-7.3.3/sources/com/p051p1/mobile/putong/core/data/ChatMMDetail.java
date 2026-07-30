package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
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
public class ChatMMDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatmmdetail";

    @ProtobufIndex(index = 2)
    public int level;

    @ProtobufIndex(index = 1)
    public int mmCnt;

    @ProtobufIndex(index = 3)
    public double timestamp;
    public static ProtobufAdapter<ChatMMDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatMMDetail>() { // from class: com.p1.mobile.putong.core.data.ChatMMDetail.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatMMDetail chatMMDetail) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, chatMMDetail.mmCnt) + CodedOutputByteBufferNano.m17281h(2, chatMMDetail.level) + CodedOutputByteBufferNano.m17277d(3, chatMMDetail.timestamp);
            chatMMDetail.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatMMDetail parse(nc5 nc5Var) throws IOException {
            ChatMMDetail chatMMDetail = new ChatMMDetail();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    chatMMDetail.mmCnt = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    chatMMDetail.level = nc5Var.m162486j();
                } else {
                    if (iM162497u != 25) {
                        return chatMMDetail;
                    }
                    chatMMDetail.timestamp = nc5Var.m162484h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatMMDetail chatMMDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, chatMMDetail.mmCnt);
            codedOutputByteBufferNano.m17305G(2, chatMMDetail.level);
            codedOutputByteBufferNano.m17301C(3, chatMMDetail.timestamp);
        }
    };
    public static JsonAdapter<ChatMMDetail> JSON_ADAPTER = new ObjectJsonAdapter<ChatMMDetail>() { // from class: com.p1.mobile.putong.core.data.ChatMMDetail.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatMMDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatMMDetail newInstance() {
            return new ChatMMDetail();
        }

        public boolean parseField(ChatMMDetail chatMMDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "timestamp":
                    chatMMDetail.timestamp = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "level":
                    chatMMDetail.level = jsonParser.getValueAsInt();
                    return true;
                case "mmCnt":
                    chatMMDetail.mmCnt = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatMMDetail chatMMDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "timestamp":
                case "level":
                case "mmCnt":
                    return true;
                default:
                    return super.parseFieldCheck(chatMMDetail, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatMMDetail chatMMDetail, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("mmCnt", chatMMDetail.mmCnt);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, chatMMDetail.level);
            jsonGenerator.writeFieldName("timestamp");
            Converter.API_TIME.serialize(Double.valueOf(chatMMDetail.timestamp), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatMMDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatMMDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatMMDetail new_() {
        ChatMMDetail chatMMDetail = new ChatMMDetail();
        chatMMDetail.nullCheck();
        return chatMMDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatMMDetail mo225055clone() {
        ChatMMDetail chatMMDetail = new ChatMMDetail();
        chatMMDetail.mmCnt = this.mmCnt;
        chatMMDetail.level = this.level;
        chatMMDetail.timestamp = this.timestamp;
        return chatMMDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatMMDetail)) {
            return false;
        }
        ChatMMDetail chatMMDetail = (ChatMMDetail) obj;
        return this.mmCnt == chatMMDetail.mmCnt && this.level == chatMMDetail.level && this.timestamp == chatMMDetail.timestamp;
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
        int i2 = (((i * 41) + this.mmCnt) * 41) + this.level;
        long jDoubleToLongBits = Double.doubleToLongBits(this.timestamp);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
