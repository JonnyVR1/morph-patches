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
public class LoveScript extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lovescript";

    @ProtobufIndex(index = 1)
    public long createdTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long expireTime;

    @ProtobufIndex(index = 4)
    public boolean firstMessageInserted;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String roomId;
    public static ProtobufAdapter<LoveScript> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveScript>() { // from class: com.p1.mobile.putong.core.data.LoveScript.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LoveScript loveScript) {
            int iJ = CodedOutputByteBufferNano.j(1, loveScript.createdTime) + CodedOutputByteBufferNano.j(2, loveScript.expireTime);
            String str = loveScript.roomId;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(3, str);
            }
            int iB = iJ + CodedOutputByteBufferNano.b(4, loveScript.firstMessageInserted);
            ((MessageNano) loveScript).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LoveScript m14021parse(nb5 nb5Var) throws IOException {
            LoveScript loveScript = new LoveScript();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (loveScript.roomId != null) {
                        break;
                    }
                    loveScript.roomId = "";
                    break;
                }
                if (iU == 8) {
                    loveScript.createdTime = nb5Var.k();
                } else if (iU == 16) {
                    loveScript.expireTime = nb5Var.k();
                } else if (iU == 26) {
                    loveScript.roomId = nb5Var.s();
                } else {
                    if (iU != 32) {
                        if (loveScript.roomId != null) {
                            break;
                        }
                        loveScript.roomId = "";
                        return loveScript;
                    }
                    loveScript.firstMessageInserted = nb5Var.g();
                }
            }
            return loveScript;
        }

        public void serialize(LoveScript loveScript, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, loveScript.createdTime);
            codedOutputByteBufferNano.I(2, loveScript.expireTime);
            String str = loveScript.roomId;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            codedOutputByteBufferNano.A(4, loveScript.firstMessageInserted);
        }
    };
    public static JsonAdapter<LoveScript> JSON_ADAPTER = new ObjectJsonAdapter<LoveScript>() { // from class: com.p1.mobile.putong.core.data.LoveScript.2
        public Class getDataClass() {
            return LoveScript.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LoveScript m14022newInstance() {
            return new LoveScript();
        }

        public boolean parseField(LoveScript loveScript, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "firstMessageInserted":
                    loveScript.firstMessageInserted = jsonParser.getValueAsBoolean();
                    return true;
                case "roomId":
                    loveScript.roomId = jsonParser.getValueAsString();
                    return true;
                case "expireTime":
                    loveScript.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "createdTime":
                    loveScript.createdTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LoveScript loveScript, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "firstMessageInserted":
                case "roomId":
                case "expireTime":
                case "createdTime":
                    return true;
                default:
                    return super.parseFieldCheck(loveScript, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(LoveScript loveScript, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("createdTime", loveScript.createdTime);
            jsonGenerator.writeNumberField("expireTime", loveScript.expireTime);
            String str = loveScript.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            jsonGenerator.writeBooleanField("firstMessageInserted", loveScript.firstMessageInserted);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveScript) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveScript) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LoveScript new_() {
        LoveScript loveScript = new LoveScript();
        loveScript.nullCheck();
        return loveScript;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LoveScript m14020clone() {
        LoveScript loveScript = new LoveScript();
        loveScript.createdTime = this.createdTime;
        loveScript.expireTime = this.expireTime;
        loveScript.roomId = this.roomId;
        loveScript.firstMessageInserted = this.firstMessageInserted;
        return loveScript;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoveScript)) {
            return false;
        }
        LoveScript loveScript = (LoveScript) obj;
        return this.createdTime == loveScript.createdTime && this.expireTime == loveScript.expireTime && ValueObject.util_equals(this.roomId, loveScript.roomId) && this.firstMessageInserted == loveScript.firstMessageInserted;
    }

    public String getClassParseName() {
        return "lovescript";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.createdTime;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.expireTime;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str = this.roomId;
        int iHashCode = ((i3 + (str != null ? str.hashCode() : 0)) * 41) + (this.firstMessageInserted ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
