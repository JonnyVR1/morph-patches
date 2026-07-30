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
public class LoveLetterMessageInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lovelettermessageinfo";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f99id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String otherUser;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public LoveLetterMessageState state;
    public static ProtobufAdapter<LoveLetterMessageInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveLetterMessageInfo>() { // from class: com.p1.mobile.putong.core.data.LoveLetterMessageInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LoveLetterMessageInfo loveLetterMessageInfo) {
            String str = loveLetterMessageInfo.f99id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = loveLetterMessageInfo.otherUser;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            LoveLetterMessageState loveLetterMessageState = loveLetterMessageInfo.state;
            if (loveLetterMessageState != null) {
                iO += CodedOutputByteBufferNano.l(3, loveLetterMessageState, LoveLetterMessageState.PROTOBUF_ADAPTER);
            }
            ((MessageNano) loveLetterMessageInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LoveLetterMessageInfo m14011parse(nb5 nb5Var) throws IOException {
            LoveLetterMessageInfo loveLetterMessageInfo = new LoveLetterMessageInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (loveLetterMessageInfo.f99id == null) {
                        loveLetterMessageInfo.f99id = "";
                    }
                    if (loveLetterMessageInfo.otherUser == null) {
                        loveLetterMessageInfo.otherUser = "";
                    }
                    if (loveLetterMessageInfo.state != null) {
                        break;
                    }
                    loveLetterMessageInfo.state = (LoveLetterMessageState) LoveLetterMessageState.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    loveLetterMessageInfo.f99id = nb5Var.s();
                } else if (iU == 18) {
                    loveLetterMessageInfo.otherUser = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (loveLetterMessageInfo.f99id == null) {
                            loveLetterMessageInfo.f99id = "";
                        }
                        if (loveLetterMessageInfo.otherUser == null) {
                            loveLetterMessageInfo.otherUser = "";
                        }
                        if (loveLetterMessageInfo.state != null) {
                            break;
                        }
                        loveLetterMessageInfo.state = (LoveLetterMessageState) LoveLetterMessageState.JSON_ADAPTER.defaultEnum();
                        return loveLetterMessageInfo;
                    }
                    loveLetterMessageInfo.state = (LoveLetterMessageState) nb5Var.l(LoveLetterMessageState.PROTOBUF_ADAPTER);
                }
            }
            return loveLetterMessageInfo;
        }

        public void serialize(LoveLetterMessageInfo loveLetterMessageInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = loveLetterMessageInfo.f99id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = loveLetterMessageInfo.otherUser;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            LoveLetterMessageState loveLetterMessageState = loveLetterMessageInfo.state;
            if (loveLetterMessageState != null) {
                codedOutputByteBufferNano.K(3, loveLetterMessageState, LoveLetterMessageState.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LoveLetterMessageInfo> JSON_ADAPTER = new ObjectJsonAdapter<LoveLetterMessageInfo>() { // from class: com.p1.mobile.putong.core.data.LoveLetterMessageInfo.2
        public Class getDataClass() {
            return LoveLetterMessageInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LoveLetterMessageInfo m14012newInstance() {
            return new LoveLetterMessageInfo();
        }

        public boolean parseField(LoveLetterMessageInfo loveLetterMessageInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUser":
                    loveLetterMessageInfo.otherUser = jsonParser.getValueAsString();
                    return true;
                case "id":
                    loveLetterMessageInfo.f99id = jsonParser.getValueAsString();
                    return false;
                case "state":
                    loveLetterMessageInfo.state = (LoveLetterMessageState) LoveLetterMessageState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LoveLetterMessageInfo loveLetterMessageInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherUser":
                    return true;
                case "id":
                    return false;
                case "state":
                    return true;
                default:
                    return super.parseFieldCheck(loveLetterMessageInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(LoveLetterMessageInfo loveLetterMessageInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = loveLetterMessageInfo.f99id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = loveLetterMessageInfo.otherUser;
            if (str2 != null) {
                jsonGenerator.writeStringField("otherUser", str2);
            }
            if (loveLetterMessageInfo.state != null) {
                jsonGenerator.writeFieldName(MessageChannel.state);
                LoveLetterMessageState.JSON_ADAPTER.serialize(loveLetterMessageInfo.state, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveLetterMessageInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveLetterMessageInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LoveLetterMessageInfo new_() {
        LoveLetterMessageInfo loveLetterMessageInfo = new LoveLetterMessageInfo();
        loveLetterMessageInfo.nullCheck();
        return loveLetterMessageInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LoveLetterMessageInfo m14010clone() {
        LoveLetterMessageInfo loveLetterMessageInfo = new LoveLetterMessageInfo();
        loveLetterMessageInfo.f99id = this.f99id;
        loveLetterMessageInfo.otherUser = this.otherUser;
        loveLetterMessageInfo.state = this.state;
        return loveLetterMessageInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoveLetterMessageInfo)) {
            return false;
        }
        LoveLetterMessageInfo loveLetterMessageInfo = (LoveLetterMessageInfo) obj;
        return ValueObject.util_equals(this.f99id, loveLetterMessageInfo.f99id) && ValueObject.util_equals(this.otherUser, loveLetterMessageInfo.otherUser) && ValueObject.util_equals(this.state, loveLetterMessageInfo.state);
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
        String str = this.f99id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.otherUser;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        LoveLetterMessageState loveLetterMessageState = this.state;
        int iHashCode3 = iHashCode2 + (loveLetterMessageState != null ? loveLetterMessageState.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f99id == null) {
            this.f99id = "";
        }
        if (this.otherUser == null) {
            this.otherUser = "";
        }
        if (this.state == null) {
            this.state = (LoveLetterMessageState) LoveLetterMessageState.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
