package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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

/* JADX INFO: loaded from: classes10.dex */
public class ConversationMomentInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationmomentinfo";

    @ProtobufIndex(index = 4)
    public double lastMomentExpandedTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String lastShowedMomentId;

    @ProtobufIndex(index = 3)
    public double newMomentCreatedTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String newMomentId;
    public static ProtobufAdapter<ConversationMomentInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationMomentInfo>() { // from class: com.p1.mobile.putong.core.data.ConversationMomentInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationMomentInfo conversationMomentInfo) {
            String str = conversationMomentInfo.newMomentId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = conversationMomentInfo.lastShowedMomentId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(3, conversationMomentInfo.newMomentCreatedTime) + CodedOutputByteBufferNano.m17222d(4, conversationMomentInfo.lastMomentExpandedTime);
            conversationMomentInfo.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationMomentInfo parse(nb5 nb5Var) throws IOException {
            ConversationMomentInfo conversationMomentInfo = new ConversationMomentInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (conversationMomentInfo.newMomentId == null) {
                        conversationMomentInfo.newMomentId = "";
                    }
                    if (conversationMomentInfo.lastShowedMomentId != null) {
                        break;
                    }
                    conversationMomentInfo.lastShowedMomentId = "";
                    break;
                }
                if (iM158752u == 10) {
                    conversationMomentInfo.newMomentId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    conversationMomentInfo.lastShowedMomentId = nb5Var.m158750s();
                } else if (iM158752u == 25) {
                    conversationMomentInfo.newMomentCreatedTime = nb5Var.m158739h();
                } else {
                    if (iM158752u != 33) {
                        if (conversationMomentInfo.newMomentId == null) {
                            conversationMomentInfo.newMomentId = "";
                        }
                        if (conversationMomentInfo.lastShowedMomentId != null) {
                            break;
                        }
                        conversationMomentInfo.lastShowedMomentId = "";
                        return conversationMomentInfo;
                    }
                    conversationMomentInfo.lastMomentExpandedTime = nb5Var.m158739h();
                }
            }
            return conversationMomentInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationMomentInfo conversationMomentInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationMomentInfo.newMomentId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = conversationMomentInfo.lastShowedMomentId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17246C(3, conversationMomentInfo.newMomentCreatedTime);
            codedOutputByteBufferNano.m17246C(4, conversationMomentInfo.lastMomentExpandedTime);
        }
    };
    public static JsonAdapter<ConversationMomentInfo> JSON_ADAPTER = new ObjectJsonAdapter<ConversationMomentInfo>() { // from class: com.p1.mobile.putong.core.data.ConversationMomentInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationMomentInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationMomentInfo newInstance() {
            return new ConversationMomentInfo();
        }

        public boolean parseField(ConversationMomentInfo conversationMomentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "newMomentCreatedTime":
                    conversationMomentInfo.newMomentCreatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "newMomentId":
                    conversationMomentInfo.newMomentId = jsonParser.getValueAsString();
                    return true;
                case "lastMomentExpandedTime":
                    conversationMomentInfo.lastMomentExpandedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "lastShowedMomentId":
                    conversationMomentInfo.lastShowedMomentId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationMomentInfo conversationMomentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "newMomentCreatedTime":
                case "newMomentId":
                case "lastMomentExpandedTime":
                case "lastShowedMomentId":
                    return true;
                default:
                    return super.parseFieldCheck(conversationMomentInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationMomentInfo conversationMomentInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationMomentInfo.newMomentId;
            if (str != null) {
                jsonGenerator.writeStringField("newMomentId", str);
            }
            String str2 = conversationMomentInfo.lastShowedMomentId;
            if (str2 != null) {
                jsonGenerator.writeStringField("lastShowedMomentId", str2);
            }
            jsonGenerator.writeFieldName("newMomentCreatedTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(conversationMomentInfo.newMomentCreatedTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("lastMomentExpandedTime");
            jsonAdapter.serialize(Double.valueOf(conversationMomentInfo.lastMomentExpandedTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationMomentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationMomentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationMomentInfo new_() {
        ConversationMomentInfo conversationMomentInfo = new ConversationMomentInfo();
        conversationMomentInfo.nullCheck();
        return conversationMomentInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationMomentInfo mo223809clone() {
        ConversationMomentInfo conversationMomentInfo = new ConversationMomentInfo();
        conversationMomentInfo.newMomentId = this.newMomentId;
        conversationMomentInfo.lastShowedMomentId = this.lastShowedMomentId;
        conversationMomentInfo.newMomentCreatedTime = this.newMomentCreatedTime;
        conversationMomentInfo.lastMomentExpandedTime = this.lastMomentExpandedTime;
        return conversationMomentInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationMomentInfo)) {
            return false;
        }
        ConversationMomentInfo conversationMomentInfo = (ConversationMomentInfo) obj;
        return ValueObject.util_equals(this.newMomentId, conversationMomentInfo.newMomentId) && ValueObject.util_equals(this.lastShowedMomentId, conversationMomentInfo.lastShowedMomentId) && this.newMomentCreatedTime == conversationMomentInfo.newMomentCreatedTime && this.lastMomentExpandedTime == conversationMomentInfo.lastMomentExpandedTime;
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
        String str = this.newMomentId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.lastShowedMomentId;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.newMomentCreatedTime);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.lastMomentExpandedTime);
        int i4 = (i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.newMomentId == null) {
            this.newMomentId = "";
        }
        if (this.lastShowedMomentId == null) {
            this.lastShowedMomentId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
