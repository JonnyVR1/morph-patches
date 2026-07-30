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
public class TalkInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "talkinfo";

    @NonNull
    @ProtobufIndex(index = 4)
    public String talkAnswer;

    @NonNull
    @ProtobufIndex(index = 1)
    public String talkId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String talkMsg;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String talkQuestion;
    public static ProtobufAdapter<TalkInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<TalkInfo>() { // from class: com.p1.mobile.putong.core.data.TalkInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TalkInfo talkInfo) {
            String str = talkInfo.talkId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = talkInfo.talkMsg;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = talkInfo.talkQuestion;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = talkInfo.talkAnswer;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) talkInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TalkInfo m15914parse(nb5 nb5Var) throws IOException {
            TalkInfo talkInfo = new TalkInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (talkInfo.talkId == null) {
                        talkInfo.talkId = "";
                    }
                    if (talkInfo.talkMsg == null) {
                        talkInfo.talkMsg = "";
                    }
                    if (talkInfo.talkQuestion == null) {
                        talkInfo.talkQuestion = "";
                    }
                    if (talkInfo.talkAnswer != null) {
                        break;
                    }
                    talkInfo.talkAnswer = "";
                    break;
                }
                if (iU == 10) {
                    talkInfo.talkId = nb5Var.s();
                } else if (iU == 18) {
                    talkInfo.talkMsg = nb5Var.s();
                } else if (iU == 26) {
                    talkInfo.talkQuestion = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (talkInfo.talkId == null) {
                            talkInfo.talkId = "";
                        }
                        if (talkInfo.talkMsg == null) {
                            talkInfo.talkMsg = "";
                        }
                        if (talkInfo.talkQuestion == null) {
                            talkInfo.talkQuestion = "";
                        }
                        if (talkInfo.talkAnswer != null) {
                            break;
                        }
                        talkInfo.talkAnswer = "";
                        return talkInfo;
                    }
                    talkInfo.talkAnswer = nb5Var.s();
                }
            }
            return talkInfo;
        }

        public void serialize(TalkInfo talkInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = talkInfo.talkId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = talkInfo.talkMsg;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = talkInfo.talkQuestion;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = talkInfo.talkAnswer;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<TalkInfo> JSON_ADAPTER = new ObjectJsonAdapter<TalkInfo>() { // from class: com.p1.mobile.putong.core.data.TalkInfo.2
        public Class getDataClass() {
            return TalkInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TalkInfo m15915newInstance() {
            return new TalkInfo();
        }

        public boolean parseField(TalkInfo talkInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "talkMsg":
                    talkInfo.talkMsg = jsonParser.getValueAsString();
                    return true;
                case "talkQuestion":
                    talkInfo.talkQuestion = jsonParser.getValueAsString();
                    return true;
                case "talkId":
                    talkInfo.talkId = jsonParser.getValueAsString();
                    return true;
                case "talkAnswer":
                    talkInfo.talkAnswer = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TalkInfo talkInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "talkMsg":
                case "talkQuestion":
                case "talkId":
                case "talkAnswer":
                    return true;
                default:
                    return super.parseFieldCheck(talkInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(TalkInfo talkInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = talkInfo.talkId;
            if (str != null) {
                jsonGenerator.writeStringField("talkId", str);
            }
            String str2 = talkInfo.talkMsg;
            if (str2 != null) {
                jsonGenerator.writeStringField("talkMsg", str2);
            }
            String str3 = talkInfo.talkQuestion;
            if (str3 != null) {
                jsonGenerator.writeStringField("talkQuestion", str3);
            }
            String str4 = talkInfo.talkAnswer;
            if (str4 != null) {
                jsonGenerator.writeStringField("talkAnswer", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TalkInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TalkInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TalkInfo new_() {
        TalkInfo talkInfo = new TalkInfo();
        talkInfo.nullCheck();
        return talkInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TalkInfo m15913clone() {
        TalkInfo talkInfo = new TalkInfo();
        talkInfo.talkId = this.talkId;
        talkInfo.talkMsg = this.talkMsg;
        talkInfo.talkQuestion = this.talkQuestion;
        talkInfo.talkAnswer = this.talkAnswer;
        return talkInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TalkInfo)) {
            return false;
        }
        TalkInfo talkInfo = (TalkInfo) obj;
        return ValueObject.util_equals(this.talkId, talkInfo.talkId) && ValueObject.util_equals(this.talkMsg, talkInfo.talkMsg) && ValueObject.util_equals(this.talkQuestion, talkInfo.talkQuestion) && ValueObject.util_equals(this.talkAnswer, talkInfo.talkAnswer);
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
        String str = this.talkId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.talkMsg;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.talkQuestion;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.talkAnswer;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.talkId == null) {
            this.talkId = "";
        }
        if (this.talkMsg == null) {
            this.talkMsg = "";
        }
        if (this.talkQuestion == null) {
            this.talkQuestion = "";
        }
        if (this.talkAnswer == null) {
            this.talkAnswer = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
