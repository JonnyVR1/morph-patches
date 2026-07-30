package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Answer;
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
public class TalkRelationAndData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "talkrelationanddata";

    @Nullable
    @ProtobufIndex(index = 5)
    public String answer;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20517id;

    @NonNull
    @ProtobufIndex(index = 3)
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
    @ProtobufIndex(index = 2)
    public String userId;

    @Nullable
    @ProtobufIndex(index = 8)
    public TalkUnitData userTalk;
    public static ProtobufAdapter<TalkRelationAndData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TalkRelationAndData>() { // from class: com.p1.mobile.putong.core.data.TalkRelationAndData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TalkRelationAndData talkRelationAndData) {
            String str = talkRelationAndData.f20517id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = talkRelationAndData.userId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = talkRelationAndData.otherUserId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = talkRelationAndData.talkId;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = talkRelationAndData.answer;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = talkRelationAndData.status;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = talkRelationAndData.questionId;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            TalkUnitData talkUnitData = talkRelationAndData.userTalk;
            if (talkUnitData != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(8, talkUnitData, TalkUnitData.PROTOBUF_ADAPTER);
            }
            TalkUnitData talkUnitData2 = talkRelationAndData.otherUserTalk;
            if (talkUnitData2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(9, talkUnitData2, TalkUnitData.PROTOBUF_ADAPTER);
            }
            talkRelationAndData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TalkRelationAndData parse(nb5 nb5Var) throws IOException {
            TalkRelationAndData talkRelationAndData = new TalkRelationAndData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (talkRelationAndData.f20517id == null) {
                        talkRelationAndData.f20517id = "";
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
                if (iM158752u == 10) {
                    talkRelationAndData.f20517id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    talkRelationAndData.userId = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    talkRelationAndData.otherUserId = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    talkRelationAndData.talkId = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    talkRelationAndData.answer = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    talkRelationAndData.status = nb5Var.m158750s();
                } else if (iM158752u == 58) {
                    talkRelationAndData.questionId = nb5Var.m158750s();
                } else if (iM158752u == 66) {
                    talkRelationAndData.userTalk = (TalkUnitData) nb5Var.m158743l(TalkUnitData.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 74) {
                        if (talkRelationAndData.f20517id == null) {
                            talkRelationAndData.f20517id = "";
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
                    talkRelationAndData.otherUserTalk = (TalkUnitData) nb5Var.m158743l(TalkUnitData.PROTOBUF_ADAPTER);
                }
            }
            return talkRelationAndData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TalkRelationAndData talkRelationAndData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = talkRelationAndData.f20517id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = talkRelationAndData.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = talkRelationAndData.otherUserId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = talkRelationAndData.talkId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = talkRelationAndData.answer;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = talkRelationAndData.status;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = talkRelationAndData.questionId;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
            TalkUnitData talkUnitData = talkRelationAndData.userTalk;
            if (talkUnitData != null) {
                codedOutputByteBufferNano.m17254K(8, talkUnitData, TalkUnitData.PROTOBUF_ADAPTER);
            }
            TalkUnitData talkUnitData2 = talkRelationAndData.otherUserTalk;
            if (talkUnitData2 != null) {
                codedOutputByteBufferNano.m17254K(9, talkUnitData2, TalkUnitData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TalkRelationAndData> JSON_ADAPTER = new ObjectJsonAdapter<TalkRelationAndData>() { // from class: com.p1.mobile.putong.core.data.TalkRelationAndData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TalkRelationAndData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TalkRelationAndData newInstance() {
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
                    talkRelationAndData.f20517id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TalkRelationAndData talkRelationAndData, JsonGenerator jsonGenerator) throws IOException {
            String str = talkRelationAndData.f20517id;
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
                jsonGenerator.writeStringField(Answer.TYPE, str5);
            }
            String str6 = talkRelationAndData.status;
            if (str6 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str6);
            }
            String str7 = talkRelationAndData.questionId;
            if (str7 != null) {
                jsonGenerator.writeStringField("questionId", str7);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TalkRelationAndData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TalkRelationAndData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TalkRelationAndData new_() {
        TalkRelationAndData talkRelationAndData = new TalkRelationAndData();
        talkRelationAndData.nullCheck();
        return talkRelationAndData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TalkRelationAndData mo223809clone() {
        TalkRelationAndData talkRelationAndData = new TalkRelationAndData();
        talkRelationAndData.f20517id = this.f20517id;
        talkRelationAndData.userId = this.userId;
        talkRelationAndData.otherUserId = this.otherUserId;
        talkRelationAndData.talkId = this.talkId;
        talkRelationAndData.answer = this.answer;
        talkRelationAndData.status = this.status;
        talkRelationAndData.questionId = this.questionId;
        TalkUnitData talkUnitData = this.userTalk;
        if (talkUnitData != null) {
            talkRelationAndData.userTalk = talkUnitData.mo223809clone();
        }
        TalkUnitData talkUnitData2 = this.otherUserTalk;
        if (talkUnitData2 != null) {
            talkRelationAndData.otherUserTalk = talkUnitData2.mo223809clone();
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
        return ValueObject.util_equals(this.f20517id, talkRelationAndData.f20517id) && ValueObject.util_equals(this.userId, talkRelationAndData.userId) && ValueObject.util_equals(this.otherUserId, talkRelationAndData.otherUserId) && ValueObject.util_equals(this.talkId, talkRelationAndData.talkId) && ValueObject.util_equals(this.answer, talkRelationAndData.answer) && ValueObject.util_equals(this.status, talkRelationAndData.status) && ValueObject.util_equals(this.questionId, talkRelationAndData.questionId) && ValueObject.util_equals(this.userTalk, talkRelationAndData.userTalk) && ValueObject.util_equals(this.otherUserTalk, talkRelationAndData.otherUserTalk);
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
        String str = this.f20517id;
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
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20517id == null) {
            this.f20517id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
