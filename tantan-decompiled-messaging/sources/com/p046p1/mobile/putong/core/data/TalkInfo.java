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
public class TalkInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "talkinfo";

    @NonNull
    @ProtobufIndex(index = 4)
    public String talkAnswer;

    @NonNull
    @ProtobufIndex(index = 1)
    public String talkId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String talkMsg;

    @NonNull
    @ProtobufIndex(index = 3)
    public String talkQuestion;
    public static ProtobufAdapter<TalkInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<TalkInfo>() { // from class: com.p1.mobile.putong.core.data.TalkInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TalkInfo talkInfo) {
            String str = talkInfo.talkId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = talkInfo.talkMsg;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = talkInfo.talkQuestion;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = talkInfo.talkAnswer;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            talkInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TalkInfo parse(nb5 nb5Var) throws IOException {
            TalkInfo talkInfo = new TalkInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    talkInfo.talkId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    talkInfo.talkMsg = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    talkInfo.talkQuestion = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
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
                    talkInfo.talkAnswer = nb5Var.m158750s();
                }
            }
            return talkInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TalkInfo talkInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = talkInfo.talkId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = talkInfo.talkMsg;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = talkInfo.talkQuestion;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = talkInfo.talkAnswer;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<TalkInfo> JSON_ADAPTER = new ObjectJsonAdapter<TalkInfo>() { // from class: com.p1.mobile.putong.core.data.TalkInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TalkInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TalkInfo newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TalkInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TalkInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TalkInfo new_() {
        TalkInfo talkInfo = new TalkInfo();
        talkInfo.nullCheck();
        return talkInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TalkInfo mo223809clone() {
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
        String str = this.talkId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.talkMsg;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.talkQuestion;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.talkAnswer;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
