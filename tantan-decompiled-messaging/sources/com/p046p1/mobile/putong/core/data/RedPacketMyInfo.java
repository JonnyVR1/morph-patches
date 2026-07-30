package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class RedPacketMyInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "redpacketmyinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String amount;

    @ProtobufIndex(index = 2)
    public boolean highest;
    public static ProtobufAdapter<RedPacketMyInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<RedPacketMyInfo>() { // from class: com.p1.mobile.putong.core.data.RedPacketMyInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RedPacketMyInfo redPacketMyInfo) {
            String str = redPacketMyInfo.amount;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, redPacketMyInfo.highest);
            redPacketMyInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RedPacketMyInfo parse(nb5 nb5Var) throws IOException {
            RedPacketMyInfo redPacketMyInfo = new RedPacketMyInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (redPacketMyInfo.amount != null) {
                        break;
                    }
                    redPacketMyInfo.amount = "";
                    break;
                }
                if (iM158752u == 10) {
                    redPacketMyInfo.amount = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (redPacketMyInfo.amount != null) {
                            break;
                        }
                        redPacketMyInfo.amount = "";
                        return redPacketMyInfo;
                    }
                    redPacketMyInfo.highest = nb5Var.m158738g();
                }
            }
            return redPacketMyInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RedPacketMyInfo redPacketMyInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = redPacketMyInfo.amount;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, redPacketMyInfo.highest);
        }
    };
    public static JsonAdapter<RedPacketMyInfo> JSON_ADAPTER = new ObjectJsonAdapter<RedPacketMyInfo>() { // from class: com.p1.mobile.putong.core.data.RedPacketMyInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RedPacketMyInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RedPacketMyInfo newInstance() {
            return new RedPacketMyInfo();
        }

        public boolean parseField(RedPacketMyInfo redPacketMyInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("amount")) {
                redPacketMyInfo.amount = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("highest")) {
                return false;
            }
            redPacketMyInfo.highest = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(RedPacketMyInfo redPacketMyInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("amount") || str.equals("highest")) {
                return true;
            }
            return super.parseFieldCheck(redPacketMyInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RedPacketMyInfo redPacketMyInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = redPacketMyInfo.amount;
            if (str != null) {
                jsonGenerator.writeStringField("amount", str);
            }
            jsonGenerator.writeBooleanField("highest", redPacketMyInfo.highest);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RedPacketMyInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RedPacketMyInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RedPacketMyInfo new_() {
        RedPacketMyInfo redPacketMyInfo = new RedPacketMyInfo();
        redPacketMyInfo.nullCheck();
        return redPacketMyInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RedPacketMyInfo mo223809clone() {
        RedPacketMyInfo redPacketMyInfo = new RedPacketMyInfo();
        redPacketMyInfo.amount = this.amount;
        redPacketMyInfo.highest = this.highest;
        return redPacketMyInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RedPacketMyInfo)) {
            return false;
        }
        RedPacketMyInfo redPacketMyInfo = (RedPacketMyInfo) obj;
        return ValueObject.util_equals(this.amount, redPacketMyInfo.amount) && this.highest == redPacketMyInfo.highest;
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
        String str = this.amount;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.highest ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.amount == null) {
            this.amount = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
