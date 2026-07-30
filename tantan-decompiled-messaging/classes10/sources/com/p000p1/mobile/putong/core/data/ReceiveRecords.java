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
public class ReceiveRecords extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "receiverecords";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String amount;

    @ProtobufIndex(index = 4)
    public long createTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean highest;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String name;

    @NonNull
    @ProtobufIndex(index = 6)
    public RedPacketUserPicture picture;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<ReceiveRecords> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReceiveRecords>() { // from class: com.p1.mobile.putong.core.data.ReceiveRecords.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ReceiveRecords receiveRecords) {
            String str = receiveRecords.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = receiveRecords.amount;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, receiveRecords.highest) + CodedOutputByteBufferNano.j(4, receiveRecords.createTime);
            String str3 = receiveRecords.name;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(5, str3);
            }
            RedPacketUserPicture redPacketUserPicture = receiveRecords.picture;
            if (redPacketUserPicture != null) {
                iB += CodedOutputByteBufferNano.l(6, redPacketUserPicture, RedPacketUserPicture.PROTOBUF_ADAPTER);
            }
            ((MessageNano) receiveRecords).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ReceiveRecords m15297parse(nb5 nb5Var) throws IOException {
            ReceiveRecords receiveRecords = new ReceiveRecords();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (receiveRecords.userId == null) {
                        receiveRecords.userId = "";
                    }
                    if (receiveRecords.amount == null) {
                        receiveRecords.amount = "";
                    }
                    if (receiveRecords.name == null) {
                        receiveRecords.name = "";
                    }
                    if (receiveRecords.picture != null) {
                        break;
                    }
                    receiveRecords.picture = RedPacketUserPicture.new_();
                    break;
                }
                if (iU == 10) {
                    receiveRecords.userId = nb5Var.s();
                } else if (iU == 18) {
                    receiveRecords.amount = nb5Var.s();
                } else if (iU == 24) {
                    receiveRecords.highest = nb5Var.g();
                } else if (iU == 32) {
                    receiveRecords.createTime = nb5Var.k();
                } else if (iU == 42) {
                    receiveRecords.name = nb5Var.s();
                } else {
                    if (iU != 50) {
                        if (receiveRecords.userId == null) {
                            receiveRecords.userId = "";
                        }
                        if (receiveRecords.amount == null) {
                            receiveRecords.amount = "";
                        }
                        if (receiveRecords.name == null) {
                            receiveRecords.name = "";
                        }
                        if (receiveRecords.picture != null) {
                            break;
                        }
                        receiveRecords.picture = RedPacketUserPicture.new_();
                        return receiveRecords;
                    }
                    receiveRecords.picture = (RedPacketUserPicture) nb5Var.l(RedPacketUserPicture.PROTOBUF_ADAPTER);
                }
            }
            return receiveRecords;
        }

        public void serialize(ReceiveRecords receiveRecords, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = receiveRecords.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = receiveRecords.amount;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, receiveRecords.highest);
            codedOutputByteBufferNano.I(4, receiveRecords.createTime);
            String str3 = receiveRecords.name;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            RedPacketUserPicture redPacketUserPicture = receiveRecords.picture;
            if (redPacketUserPicture != null) {
                codedOutputByteBufferNano.K(6, redPacketUserPicture, RedPacketUserPicture.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ReceiveRecords> JSON_ADAPTER = new ObjectJsonAdapter<ReceiveRecords>() { // from class: com.p1.mobile.putong.core.data.ReceiveRecords.2
        public Class getDataClass() {
            return ReceiveRecords.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ReceiveRecords m15298newInstance() {
            return new ReceiveRecords();
        }

        public boolean parseField(ReceiveRecords receiveRecords, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "amount":
                    receiveRecords.amount = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    receiveRecords.userId = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    receiveRecords.picture = (RedPacketUserPicture) RedPacketUserPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    receiveRecords.name = jsonParser.getValueAsString();
                    return true;
                case "highest":
                    receiveRecords.highest = jsonParser.getValueAsBoolean();
                    return true;
                case "createTime":
                    receiveRecords.createTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ReceiveRecords receiveRecords, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "amount":
                case "userId":
                case "picture":
                case "name":
                case "highest":
                case "createTime":
                    return true;
                default:
                    return super.parseFieldCheck(receiveRecords, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ReceiveRecords receiveRecords, JsonGenerator jsonGenerator) throws IOException {
            String str = receiveRecords.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = receiveRecords.amount;
            if (str2 != null) {
                jsonGenerator.writeStringField("amount", str2);
            }
            jsonGenerator.writeBooleanField("highest", receiveRecords.highest);
            jsonGenerator.writeNumberField("createTime", receiveRecords.createTime);
            String str3 = receiveRecords.name;
            if (str3 != null) {
                jsonGenerator.writeStringField("name", str3);
            }
            if (receiveRecords.picture != null) {
                jsonGenerator.writeFieldName("picture");
                RedPacketUserPicture.JSON_ADAPTER.serialize(receiveRecords.picture, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReceiveRecords) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReceiveRecords) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReceiveRecords new_() {
        ReceiveRecords receiveRecords = new ReceiveRecords();
        receiveRecords.nullCheck();
        return receiveRecords;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ReceiveRecords m15296clone() {
        ReceiveRecords receiveRecords = new ReceiveRecords();
        receiveRecords.userId = this.userId;
        receiveRecords.amount = this.amount;
        receiveRecords.highest = this.highest;
        receiveRecords.createTime = this.createTime;
        receiveRecords.name = this.name;
        RedPacketUserPicture redPacketUserPicture = this.picture;
        if (redPacketUserPicture != null) {
            receiveRecords.picture = redPacketUserPicture.m15350clone();
        }
        return receiveRecords;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReceiveRecords)) {
            return false;
        }
        ReceiveRecords receiveRecords = (ReceiveRecords) obj;
        return ValueObject.util_equals(this.userId, receiveRecords.userId) && ValueObject.util_equals(this.amount, receiveRecords.amount) && this.highest == receiveRecords.highest && this.createTime == receiveRecords.createTime && ValueObject.util_equals(this.name, receiveRecords.name) && ValueObject.util_equals(this.picture, receiveRecords.picture);
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
        String str2 = this.amount;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        int i3 = this.highest ? 1231 : 1237;
        long j = this.createTime;
        int i4 = (((iHashCode2 + i3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.name;
        int iHashCode3 = (i4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        RedPacketUserPicture redPacketUserPicture = this.picture;
        int iHashCode4 = iHashCode3 + (redPacketUserPicture != null ? redPacketUserPicture.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.amount == null) {
            this.amount = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.picture == null) {
            this.picture = RedPacketUserPicture.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
