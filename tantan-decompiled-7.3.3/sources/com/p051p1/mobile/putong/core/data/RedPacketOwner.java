package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class RedPacketOwner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "redpacketowner";

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public String ownerId;

    @ProtobufIndex(index = 3)
    public boolean type;
    public static ProtobufAdapter<RedPacketOwner> PROTOBUF_ADAPTER = new MessageNanoAdapter<RedPacketOwner>() { // from class: com.p1.mobile.putong.core.data.RedPacketOwner.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RedPacketOwner redPacketOwner) {
            String str = redPacketOwner.ownerId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = redPacketOwner.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(3, redPacketOwner.type);
            redPacketOwner.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RedPacketOwner parse(nc5 nc5Var) throws IOException {
            RedPacketOwner redPacketOwner = new RedPacketOwner();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (redPacketOwner.ownerId == null) {
                        redPacketOwner.ownerId = "";
                    }
                    if (redPacketOwner.name != null) {
                        break;
                    }
                    redPacketOwner.name = "";
                    break;
                }
                if (iM162497u == 10) {
                    redPacketOwner.ownerId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    redPacketOwner.name = nc5Var.m162495s();
                } else {
                    if (iM162497u != 24) {
                        if (redPacketOwner.ownerId == null) {
                            redPacketOwner.ownerId = "";
                        }
                        if (redPacketOwner.name != null) {
                            break;
                        }
                        redPacketOwner.name = "";
                        return redPacketOwner;
                    }
                    redPacketOwner.type = nc5Var.m162483g();
                }
            }
            return redPacketOwner;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RedPacketOwner redPacketOwner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = redPacketOwner.ownerId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = redPacketOwner.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17299A(3, redPacketOwner.type);
        }
    };
    public static JsonAdapter<RedPacketOwner> JSON_ADAPTER = new ObjectJsonAdapter<RedPacketOwner>() { // from class: com.p1.mobile.putong.core.data.RedPacketOwner.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RedPacketOwner.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RedPacketOwner newInstance() {
            return new RedPacketOwner();
        }

        public boolean parseField(RedPacketOwner redPacketOwner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "ownerId":
                    redPacketOwner.ownerId = jsonParser.getValueAsString();
                    return true;
                case "name":
                    redPacketOwner.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    redPacketOwner.type = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RedPacketOwner redPacketOwner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "ownerId":
                case "name":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(redPacketOwner, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RedPacketOwner redPacketOwner, JsonGenerator jsonGenerator) throws IOException {
            String str = redPacketOwner.ownerId;
            if (str != null) {
                jsonGenerator.writeStringField("ownerId", str);
            }
            String str2 = redPacketOwner.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            jsonGenerator.writeBooleanField("type", redPacketOwner.type);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RedPacketOwner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RedPacketOwner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RedPacketOwner new_() {
        RedPacketOwner redPacketOwner = new RedPacketOwner();
        redPacketOwner.nullCheck();
        return redPacketOwner;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RedPacketOwner mo225055clone() {
        RedPacketOwner redPacketOwner = new RedPacketOwner();
        redPacketOwner.ownerId = this.ownerId;
        redPacketOwner.name = this.name;
        redPacketOwner.type = this.type;
        return redPacketOwner;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RedPacketOwner)) {
            return false;
        }
        RedPacketOwner redPacketOwner = (RedPacketOwner) obj;
        return ValueObject.util_equals(this.ownerId, redPacketOwner.ownerId) && ValueObject.util_equals(this.name, redPacketOwner.name) && this.type == redPacketOwner.type;
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
        String str = this.ownerId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.type ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ownerId == null) {
            this.ownerId = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
