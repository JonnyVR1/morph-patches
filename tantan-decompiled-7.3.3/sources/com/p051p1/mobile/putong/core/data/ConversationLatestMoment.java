package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class ConversationLatestMoment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationlatestmoment";

    @ProtobufIndex(index = 3)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String momentId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<ConversationLatestMoment> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationLatestMoment>() { // from class: com.p1.mobile.putong.core.data.ConversationLatestMoment.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationLatestMoment conversationLatestMoment) {
            String str = conversationLatestMoment.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = conversationLatestMoment.momentId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(3, conversationLatestMoment.createdTime);
            conversationLatestMoment.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationLatestMoment parse(nc5 nc5Var) throws IOException {
            ConversationLatestMoment conversationLatestMoment = new ConversationLatestMoment();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (conversationLatestMoment.userId == null) {
                        conversationLatestMoment.userId = "";
                    }
                    if (conversationLatestMoment.momentId != null) {
                        break;
                    }
                    conversationLatestMoment.momentId = "";
                    break;
                }
                if (iM162497u == 10) {
                    conversationLatestMoment.userId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    conversationLatestMoment.momentId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 25) {
                        if (conversationLatestMoment.userId == null) {
                            conversationLatestMoment.userId = "";
                        }
                        if (conversationLatestMoment.momentId != null) {
                            break;
                        }
                        conversationLatestMoment.momentId = "";
                        return conversationLatestMoment;
                    }
                    conversationLatestMoment.createdTime = nc5Var.m162484h();
                }
            }
            return conversationLatestMoment;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationLatestMoment conversationLatestMoment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationLatestMoment.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = conversationLatestMoment.momentId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17301C(3, conversationLatestMoment.createdTime);
        }
    };
    public static JsonAdapter<ConversationLatestMoment> JSON_ADAPTER = new ObjectJsonAdapter<ConversationLatestMoment>() { // from class: com.p1.mobile.putong.core.data.ConversationLatestMoment.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationLatestMoment.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationLatestMoment newInstance() {
            return new ConversationLatestMoment();
        }

        public boolean parseField(ConversationLatestMoment conversationLatestMoment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    conversationLatestMoment.userId = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    conversationLatestMoment.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "momentId":
                    conversationLatestMoment.momentId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationLatestMoment conversationLatestMoment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "createdTime":
                case "momentId":
                    return true;
                default:
                    return super.parseFieldCheck(conversationLatestMoment, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationLatestMoment conversationLatestMoment, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationLatestMoment.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = conversationLatestMoment.momentId;
            if (str2 != null) {
                jsonGenerator.writeStringField("momentId", str2);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(conversationLatestMoment.createdTime), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationLatestMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationLatestMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationLatestMoment new_() {
        ConversationLatestMoment conversationLatestMoment = new ConversationLatestMoment();
        conversationLatestMoment.nullCheck();
        return conversationLatestMoment;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationLatestMoment mo225055clone() {
        ConversationLatestMoment conversationLatestMoment = new ConversationLatestMoment();
        conversationLatestMoment.userId = this.userId;
        conversationLatestMoment.momentId = this.momentId;
        conversationLatestMoment.createdTime = this.createdTime;
        return conversationLatestMoment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationLatestMoment)) {
            return false;
        }
        ConversationLatestMoment conversationLatestMoment = (ConversationLatestMoment) obj;
        return ValueObject.util_equals(this.userId, conversationLatestMoment.userId) && ValueObject.util_equals(this.momentId, conversationLatestMoment.momentId) && this.createdTime == conversationLatestMoment.createdTime;
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
        String str2 = this.momentId;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.momentId == null) {
            this.momentId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
