package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class ConversationLatestMoment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationlatestmoment";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String momentId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<ConversationLatestMoment> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationLatestMoment>() { // from class: com.p1.mobile.putong.core.data.ConversationLatestMoment.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationLatestMoment conversationLatestMoment) {
            String str = conversationLatestMoment.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = conversationLatestMoment.momentId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iD = iO + CodedOutputByteBufferNano.d(3, conversationLatestMoment.createdTime);
            ((MessageNano) conversationLatestMoment).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationLatestMoment m12381parse(nb5 nb5Var) throws IOException {
            ConversationLatestMoment conversationLatestMoment = new ConversationLatestMoment();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (conversationLatestMoment.userId == null) {
                        conversationLatestMoment.userId = "";
                    }
                    if (conversationLatestMoment.momentId != null) {
                        break;
                    }
                    conversationLatestMoment.momentId = "";
                    break;
                }
                if (iU == 10) {
                    conversationLatestMoment.userId = nb5Var.s();
                } else if (iU == 18) {
                    conversationLatestMoment.momentId = nb5Var.s();
                } else {
                    if (iU != 25) {
                        if (conversationLatestMoment.userId == null) {
                            conversationLatestMoment.userId = "";
                        }
                        if (conversationLatestMoment.momentId != null) {
                            break;
                        }
                        conversationLatestMoment.momentId = "";
                        return conversationLatestMoment;
                    }
                    conversationLatestMoment.createdTime = nb5Var.h();
                }
            }
            return conversationLatestMoment;
        }

        public void serialize(ConversationLatestMoment conversationLatestMoment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationLatestMoment.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = conversationLatestMoment.momentId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.C(3, conversationLatestMoment.createdTime);
        }
    };
    public static JsonAdapter<ConversationLatestMoment> JSON_ADAPTER = new ObjectJsonAdapter<ConversationLatestMoment>() { // from class: com.p1.mobile.putong.core.data.ConversationLatestMoment.2
        public Class getDataClass() {
            return ConversationLatestMoment.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationLatestMoment m12382newInstance() {
            return new ConversationLatestMoment();
        }

        public boolean parseField(ConversationLatestMoment conversationLatestMoment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    conversationLatestMoment.userId = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    conversationLatestMoment.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationLatestMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationLatestMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationLatestMoment new_() {
        ConversationLatestMoment conversationLatestMoment = new ConversationLatestMoment();
        conversationLatestMoment.nullCheck();
        return conversationLatestMoment;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationLatestMoment m12380clone() {
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
        String str2 = this.momentId;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.momentId == null) {
            this.momentId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
