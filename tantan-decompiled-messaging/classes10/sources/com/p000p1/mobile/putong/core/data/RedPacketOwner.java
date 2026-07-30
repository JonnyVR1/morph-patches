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
public class RedPacketOwner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "redpacketowner";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public String ownerId;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean type;
    public static ProtobufAdapter<RedPacketOwner> PROTOBUF_ADAPTER = new MessageNanoAdapter<RedPacketOwner>() { // from class: com.p1.mobile.putong.core.data.RedPacketOwner.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RedPacketOwner redPacketOwner) {
            String str = redPacketOwner.ownerId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = redPacketOwner.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, redPacketOwner.type);
            ((MessageNano) redPacketOwner).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RedPacketOwner m15347parse(nb5 nb5Var) throws IOException {
            RedPacketOwner redPacketOwner = new RedPacketOwner();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (redPacketOwner.ownerId == null) {
                        redPacketOwner.ownerId = "";
                    }
                    if (redPacketOwner.name != null) {
                        break;
                    }
                    redPacketOwner.name = "";
                    break;
                }
                if (iU == 10) {
                    redPacketOwner.ownerId = nb5Var.s();
                } else if (iU == 18) {
                    redPacketOwner.name = nb5Var.s();
                } else {
                    if (iU != 24) {
                        if (redPacketOwner.ownerId == null) {
                            redPacketOwner.ownerId = "";
                        }
                        if (redPacketOwner.name != null) {
                            break;
                        }
                        redPacketOwner.name = "";
                        return redPacketOwner;
                    }
                    redPacketOwner.type = nb5Var.g();
                }
            }
            return redPacketOwner;
        }

        public void serialize(RedPacketOwner redPacketOwner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = redPacketOwner.ownerId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = redPacketOwner.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, redPacketOwner.type);
        }
    };
    public static JsonAdapter<RedPacketOwner> JSON_ADAPTER = new ObjectJsonAdapter<RedPacketOwner>() { // from class: com.p1.mobile.putong.core.data.RedPacketOwner.2
        public Class getDataClass() {
            return RedPacketOwner.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RedPacketOwner m15348newInstance() {
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

        public void serializeFields(RedPacketOwner redPacketOwner, JsonGenerator jsonGenerator) throws IOException {
            String str = redPacketOwner.ownerId;
            if (str != null) {
                jsonGenerator.writeStringField("ownerId", str);
            }
            String str2 = redPacketOwner.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            jsonGenerator.writeBooleanField("type", redPacketOwner.type);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RedPacketOwner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RedPacketOwner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RedPacketOwner new_() {
        RedPacketOwner redPacketOwner = new RedPacketOwner();
        redPacketOwner.nullCheck();
        return redPacketOwner;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RedPacketOwner m15346clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.ownerId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.type ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.ownerId == null) {
            this.ownerId = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
