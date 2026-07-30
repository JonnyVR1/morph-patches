package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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

/* JADX INFO: loaded from: classes10.dex */
public class ReceiveRecords extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "receiverecords";

    @NonNull
    @ProtobufIndex(index = 2)
    public String amount;

    @ProtobufIndex(index = 4)
    public long createTime;

    @ProtobufIndex(index = 3)
    public boolean highest;

    @NonNull
    @ProtobufIndex(index = 5)
    public String name;

    @NonNull
    @ProtobufIndex(index = 6)
    public RedPacketUserPicture picture;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<ReceiveRecords> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReceiveRecords>() { // from class: com.p1.mobile.putong.core.data.ReceiveRecords.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ReceiveRecords receiveRecords) {
            String str = receiveRecords.userId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = receiveRecords.amount;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, receiveRecords.highest) + CodedOutputByteBufferNano.m17228j(4, receiveRecords.createTime);
            String str3 = receiveRecords.name;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            RedPacketUserPicture redPacketUserPicture = receiveRecords.picture;
            if (redPacketUserPicture != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(6, redPacketUserPicture, RedPacketUserPicture.PROTOBUF_ADAPTER);
            }
            receiveRecords.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ReceiveRecords parse(nb5 nb5Var) throws IOException {
            ReceiveRecords receiveRecords = new ReceiveRecords();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    receiveRecords.userId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    receiveRecords.amount = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    receiveRecords.highest = nb5Var.m158738g();
                } else if (iM158752u == 32) {
                    receiveRecords.createTime = nb5Var.m158742k();
                } else if (iM158752u == 42) {
                    receiveRecords.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 50) {
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
                    receiveRecords.picture = (RedPacketUserPicture) nb5Var.m158743l(RedPacketUserPicture.PROTOBUF_ADAPTER);
                }
            }
            return receiveRecords;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ReceiveRecords receiveRecords, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = receiveRecords.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = receiveRecords.amount;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17244A(3, receiveRecords.highest);
            codedOutputByteBufferNano.m17252I(4, receiveRecords.createTime);
            String str3 = receiveRecords.name;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
            RedPacketUserPicture redPacketUserPicture = receiveRecords.picture;
            if (redPacketUserPicture != null) {
                codedOutputByteBufferNano.m17254K(6, redPacketUserPicture, RedPacketUserPicture.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ReceiveRecords> JSON_ADAPTER = new ObjectJsonAdapter<ReceiveRecords>() { // from class: com.p1.mobile.putong.core.data.ReceiveRecords.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ReceiveRecords.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ReceiveRecords newInstance() {
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
                    receiveRecords.picture = RedPacketUserPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            if (receiveRecords.picture != null) {
                jsonGenerator.writeFieldName("picture");
                RedPacketUserPicture.JSON_ADAPTER.serialize(receiveRecords.picture, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReceiveRecords) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReceiveRecords) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReceiveRecords new_() {
        ReceiveRecords receiveRecords = new ReceiveRecords();
        receiveRecords.nullCheck();
        return receiveRecords;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ReceiveRecords mo223809clone() {
        ReceiveRecords receiveRecords = new ReceiveRecords();
        receiveRecords.userId = this.userId;
        receiveRecords.amount = this.amount;
        receiveRecords.highest = this.highest;
        receiveRecords.createTime = this.createTime;
        receiveRecords.name = this.name;
        RedPacketUserPicture redPacketUserPicture = this.picture;
        if (redPacketUserPicture != null) {
            receiveRecords.picture = redPacketUserPicture.mo223809clone();
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
        String str2 = this.amount;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        int i3 = this.highest ? 1231 : 1237;
        long j = this.createTime;
        int i4 = (((iHashCode2 + i3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.name;
        int iHashCode3 = (i4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        RedPacketUserPicture redPacketUserPicture = this.picture;
        int iHashCode4 = iHashCode3 + (redPacketUserPicture != null ? redPacketUserPicture.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
