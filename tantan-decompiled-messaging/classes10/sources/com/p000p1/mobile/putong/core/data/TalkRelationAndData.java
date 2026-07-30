package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class TalkRelationAndData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "talkrelationanddata";

    @Nullable
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String answer;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f179id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String otherUserId;

    @Nullable
    @ProtobufIndex(index = 9)
    public TalkUnitData otherUserTalk;

    @Nullable
    @ProtobufIndex(index = 7)
    public String questionId;

    @Nullable
    @ProtobufIndex(index = 6)
    public String status;

    @NonNull
    @ProtobufIndex(index = 4)
    public String talkId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String userId;

    @Nullable
    @ProtobufIndex(index = 8)
    public TalkUnitData userTalk;
    public static ProtobufAdapter<TalkRelationAndData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TalkRelationAndData>() { // from class: com.p1.mobile.putong.core.data.TalkRelationAndData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TalkRelationAndData talkRelationAndData) {
            String str = talkRelationAndData.f179id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = talkRelationAndData.userId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = talkRelationAndData.otherUserId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = talkRelationAndData.talkId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = talkRelationAndData.answer;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = talkRelationAndData.status;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = talkRelationAndData.questionId;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            TalkUnitData talkUnitData = talkRelationAndData.userTalk;
            if (talkUnitData != null) {
                iO += CodedOutputByteBufferNano.l(8, talkUnitData, TalkUnitData.PROTOBUF_ADAPTER);
            }
            TalkUnitData talkUnitData2 = talkRelationAndData.otherUserTalk;
            if (talkUnitData2 != null) {
                iO += CodedOutputByteBufferNano.l(9, talkUnitData2, TalkUnitData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) talkRelationAndData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TalkRelationAndData m15922parse(nb5 nb5Var) throws IOException {
            TalkRelationAndData talkRelationAndData = new TalkRelationAndData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (talkRelationAndData.f179id == null) {
                        talkRelationAndData.f179id = "";
                    }
                    if (talkRelationAndData.userId == null) {
                        talkRelationAndData.userId = "";
                    }
                    if (talkRelationAndData.otherUserId == null) {
                        talkRelationAndData.otherUserId = "";
                    }
                    if (talkRelationAndData.talkId != null) {
                        break;
                    }
                    talkRelationAndData.talkId = "";
                    break;
                }
                if (iU == 10) {
                    talkRelationAndData.f179id = nb5Var.s();
                } else if (iU == 18) {
                    talkRelationAndData.userId = nb5Var.s();
                } else if (iU == 26) {
                    talkRelationAndData.otherUserId = nb5Var.s();
                } else if (iU == 34) {
                    talkRelationAndData.talkId = nb5Var.s();
                } else if (iU == 42) {
                    talkRelationAndData.answer = nb5Var.s();
                } else if (iU == 50) {
                    talkRelationAndData.status = nb5Var.s();
                } else if (iU == 58) {
                    talkRelationAndData.questionId = nb5Var.s();
                } else if (iU == 66) {
                    talkRelationAndData.userTalk = (TalkUnitData) nb5Var.l(TalkUnitData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 74) {
                        if (talkRelationAndData.f179id == null) {
                            talkRelationAndData.f179id = "";
                        }
                        if (talkRelationAndData.userId == null) {
                            talkRelationAndData.userId = "";
                        }
                        if (talkRelationAndData.otherUserId == null) {
                            talkRelationAndData.otherUserId = "";
                        }
                        if (talkRelationAndData.talkId != null) {
                            break;
                        }
                        talkRelationAndData.talkId = "";
                        return talkRelationAndData;
                    }
                    talkRelationAndData.otherUserTalk = (TalkUnitData) nb5Var.l(TalkUnitData.PROTOBUF_ADAPTER);
                }
            }
            return talkRelationAndData;
        }

        public void serialize(TalkRelationAndData talkRelationAndData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = talkRelationAndData.f179id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = talkRelationAndData.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = talkRelationAndData.otherUserId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = talkRelationAndData.talkId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = talkRelationAndData.answer;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = talkRelationAndData.status;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = talkRelationAndData.questionId;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            TalkUnitData talkUnitData = talkRelationAndData.userTalk;
            if (talkUnitData != null) {
                codedOutputByteBufferNano.K(8, talkUnitData, TalkUnitData.PROTOBUF_ADAPTER);
            }
            TalkUnitData talkUnitData2 = talkRelationAndData.otherUserTalk;
            if (talkUnitData2 != null) {
                codedOutputByteBufferNano.K(9, talkUnitData2, TalkUnitData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TalkRelationAndData> JSON_ADAPTER = new ObjectJsonAdapter<TalkRelationAndData>() { // from class: com.p1.mobile.putong.core.data.TalkRelationAndData.2
        public Class getDataClass() {
            return TalkRelationAndData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TalkRelationAndData m15923newInstance() {
            return new TalkRelationAndData();
        }

        public boolean parseField(TalkRelationAndData talkRelationAndData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    talkRelationAndData.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "answer":
                    talkRelationAndData.answer = jsonParser.getValueAsString();
                    return true;
                case "status":
                    talkRelationAndData.status = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    talkRelationAndData.userId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    talkRelationAndData.f179id = jsonParser.getValueAsString();
                    return false;
                case "questionId":
                    talkRelationAndData.questionId = jsonParser.getValueAsString();
                    return true;
                case "shuoshuoId":
                    talkRelationAndData.talkId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TalkRelationAndData talkRelationAndData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherUserId":
                case "answer":
                case "status":
                case "userId":
                    return true;
                case "id":
                    return false;
                case "questionId":
                case "shuoshuoId":
                    return true;
                default:
                    return super.parseFieldCheck(talkRelationAndData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(TalkRelationAndData talkRelationAndData, JsonGenerator jsonGenerator) throws IOException {
            String str = talkRelationAndData.f179id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = talkRelationAndData.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = talkRelationAndData.otherUserId;
            if (str3 != null) {
                jsonGenerator.writeStringField("otherUserId", str3);
            }
            String str4 = talkRelationAndData.talkId;
            if (str4 != null) {
                jsonGenerator.writeStringField("shuoshuoId", str4);
            }
            String str5 = talkRelationAndData.answer;
            if (str5 != null) {
                jsonGenerator.writeStringField("answer", str5);
            }
            String str6 = talkRelationAndData.status;
            if (str6 != null) {
                jsonGenerator.writeStringField("status", str6);
            }
            String str7 = talkRelationAndData.questionId;
            if (str7 != null) {
                jsonGenerator.writeStringField("questionId", str7);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TalkRelationAndData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TalkRelationAndData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TalkRelationAndData new_() {
        TalkRelationAndData talkRelationAndData = new TalkRelationAndData();
        talkRelationAndData.nullCheck();
        return talkRelationAndData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TalkRelationAndData m15921clone() {
        TalkRelationAndData talkRelationAndData = new TalkRelationAndData();
        talkRelationAndData.f179id = this.f179id;
        talkRelationAndData.userId = this.userId;
        talkRelationAndData.otherUserId = this.otherUserId;
        talkRelationAndData.talkId = this.talkId;
        talkRelationAndData.answer = this.answer;
        talkRelationAndData.status = this.status;
        talkRelationAndData.questionId = this.questionId;
        TalkUnitData talkUnitData = this.userTalk;
        if (talkUnitData != null) {
            talkRelationAndData.userTalk = talkUnitData.m15929clone();
        }
        TalkUnitData talkUnitData2 = this.otherUserTalk;
        if (talkUnitData2 != null) {
            talkRelationAndData.otherUserTalk = talkUnitData2.m15929clone();
        }
        return talkRelationAndData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TalkRelationAndData)) {
            return false;
        }
        TalkRelationAndData talkRelationAndData = (TalkRelationAndData) obj;
        return ValueObject.util_equals(this.f179id, talkRelationAndData.f179id) && ValueObject.util_equals(this.userId, talkRelationAndData.userId) && ValueObject.util_equals(this.otherUserId, talkRelationAndData.otherUserId) && ValueObject.util_equals(this.talkId, talkRelationAndData.talkId) && ValueObject.util_equals(this.answer, talkRelationAndData.answer) && ValueObject.util_equals(this.status, talkRelationAndData.status) && ValueObject.util_equals(this.questionId, talkRelationAndData.questionId) && ValueObject.util_equals(this.userTalk, talkRelationAndData.userTalk) && ValueObject.util_equals(this.otherUserTalk, talkRelationAndData.otherUserTalk);
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
        String str = this.f179id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.otherUserId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.talkId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.answer;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.status;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.questionId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        TalkUnitData talkUnitData = this.userTalk;
        int iHashCode8 = (iHashCode7 + (talkUnitData != null ? talkUnitData.hashCode() : 0)) * 41;
        TalkUnitData talkUnitData2 = this.otherUserTalk;
        int iHashCode9 = iHashCode8 + (talkUnitData2 != null ? talkUnitData2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode9;
        return iHashCode9;
    }

    public void nullCheck() {
        if (this.f179id == null) {
            this.f179id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
        if (this.talkId == null) {
            this.talkId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
