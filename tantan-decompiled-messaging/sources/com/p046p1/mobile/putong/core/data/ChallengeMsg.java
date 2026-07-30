package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Link;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class ChallengeMsg extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "challengemsg";

    @NonNull
    @ProtobufIndex(index = 5)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 7)
    public String eventlog;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20359id;

    @NonNull
    @ProtobufIndex(index = 6)
    public String link;

    @NonNull
    @ProtobufIndex(index = 8)
    public String picUrl;

    @NonNull
    @ProtobufIndex(index = 10)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 11)
    public String scriptId;

    @NonNull
    @ProtobufIndex(index = 9)
    public String source;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<ChallengeMsg> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChallengeMsg>() { // from class: com.p1.mobile.putong.core.data.ChallengeMsg.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChallengeMsg challengeMsg) {
            String str = challengeMsg.f20359id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = challengeMsg.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = challengeMsg.title;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = challengeMsg.subTitle;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = challengeMsg.buttonText;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = challengeMsg.link;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = challengeMsg.eventlog;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            String str8 = challengeMsg.picUrl;
            if (str8 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(8, str8);
            }
            String str9 = challengeMsg.source;
            if (str9 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(9, str9);
            }
            String str10 = challengeMsg.roomId;
            if (str10 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(10, str10);
            }
            String str11 = challengeMsg.scriptId;
            if (str11 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(11, str11);
            }
            challengeMsg.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChallengeMsg parse(nb5 nb5Var) throws IOException {
            ChallengeMsg challengeMsg = new ChallengeMsg();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (challengeMsg.f20359id == null) {
                            challengeMsg.f20359id = "";
                        }
                        if (challengeMsg.type == null) {
                            challengeMsg.type = "";
                        }
                        if (challengeMsg.title == null) {
                            challengeMsg.title = "";
                        }
                        if (challengeMsg.subTitle == null) {
                            challengeMsg.subTitle = "";
                        }
                        if (challengeMsg.buttonText == null) {
                            challengeMsg.buttonText = "";
                        }
                        if (challengeMsg.link == null) {
                            challengeMsg.link = "";
                        }
                        if (challengeMsg.eventlog == null) {
                            challengeMsg.eventlog = "";
                        }
                        if (challengeMsg.picUrl == null) {
                            challengeMsg.picUrl = "";
                        }
                        if (challengeMsg.source == null) {
                            challengeMsg.source = "";
                        }
                        if (challengeMsg.roomId == null) {
                            challengeMsg.roomId = "";
                        }
                        if (challengeMsg.scriptId == null) {
                            challengeMsg.scriptId = "";
                        }
                        break;
                    case 10:
                        challengeMsg.f20359id = nb5Var.m158750s();
                        continue;
                    case 18:
                        challengeMsg.type = nb5Var.m158750s();
                        continue;
                    case 26:
                        challengeMsg.title = nb5Var.m158750s();
                        continue;
                    case 34:
                        challengeMsg.subTitle = nb5Var.m158750s();
                        continue;
                    case 42:
                        challengeMsg.buttonText = nb5Var.m158750s();
                        continue;
                    case 50:
                        challengeMsg.link = nb5Var.m158750s();
                        continue;
                    case 58:
                        challengeMsg.eventlog = nb5Var.m158750s();
                        continue;
                    case 66:
                        challengeMsg.picUrl = nb5Var.m158750s();
                        continue;
                    case 74:
                        challengeMsg.source = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        challengeMsg.roomId = nb5Var.m158750s();
                        continue;
                    case 90:
                        challengeMsg.scriptId = nb5Var.m158750s();
                        continue;
                    default:
                        if (challengeMsg.f20359id == null) {
                            challengeMsg.f20359id = "";
                        }
                        if (challengeMsg.type == null) {
                            challengeMsg.type = "";
                        }
                        if (challengeMsg.title == null) {
                            challengeMsg.title = "";
                        }
                        if (challengeMsg.subTitle == null) {
                            challengeMsg.subTitle = "";
                        }
                        if (challengeMsg.buttonText == null) {
                            challengeMsg.buttonText = "";
                        }
                        if (challengeMsg.link == null) {
                            challengeMsg.link = "";
                        }
                        if (challengeMsg.eventlog == null) {
                            challengeMsg.eventlog = "";
                        }
                        if (challengeMsg.picUrl == null) {
                            challengeMsg.picUrl = "";
                        }
                        if (challengeMsg.source == null) {
                            challengeMsg.source = "";
                        }
                        if (challengeMsg.roomId == null) {
                            challengeMsg.roomId = "";
                        }
                        if (challengeMsg.scriptId == null) {
                            challengeMsg.scriptId = "";
                            return challengeMsg;
                        }
                        break;
                }
            }
            return challengeMsg;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChallengeMsg challengeMsg, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = challengeMsg.f20359id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = challengeMsg.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = challengeMsg.title;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = challengeMsg.subTitle;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = challengeMsg.buttonText;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = challengeMsg.link;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = challengeMsg.eventlog;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
            String str8 = challengeMsg.picUrl;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(8, str8);
            }
            String str9 = challengeMsg.source;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(9, str9);
            }
            String str10 = challengeMsg.roomId;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(10, str10);
            }
            String str11 = challengeMsg.scriptId;
            if (str11 != null) {
                codedOutputByteBufferNano.m17261R(11, str11);
            }
        }
    };
    public static JsonAdapter<ChallengeMsg> JSON_ADAPTER = new ObjectJsonAdapter<ChallengeMsg>() { // from class: com.p1.mobile.putong.core.data.ChallengeMsg.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChallengeMsg.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChallengeMsg newInstance() {
            return new ChallengeMsg();
        }

        public boolean parseField(ChallengeMsg challengeMsg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    challengeMsg.subTitle = jsonParser.getValueAsString();
                    return true;
                case "picUrl":
                    challengeMsg.picUrl = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    challengeMsg.roomId = jsonParser.getValueAsString();
                    return true;
                case "source":
                    challengeMsg.source = jsonParser.getValueAsString();
                    return true;
                case "scriptId":
                    challengeMsg.scriptId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    challengeMsg.f20359id = jsonParser.getValueAsString();
                    return false;
                case "link":
                    challengeMsg.link = jsonParser.getValueAsString();
                    return true;
                case "type":
                    challengeMsg.type = jsonParser.getValueAsString();
                    return true;
                case "title":
                    challengeMsg.title = jsonParser.getValueAsString();
                    return true;
                case "eventlog":
                    challengeMsg.eventlog = jsonParser.getValueAsString();
                    return true;
                case "buttonText":
                    challengeMsg.buttonText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChallengeMsg challengeMsg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "picUrl":
                case "roomId":
                case "source":
                case "scriptId":
                    return true;
                case "id":
                    return false;
                case "link":
                case "type":
                case "title":
                case "eventlog":
                case "buttonText":
                    return true;
                default:
                    return super.parseFieldCheck(challengeMsg, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChallengeMsg challengeMsg, JsonGenerator jsonGenerator) throws IOException {
            String str = challengeMsg.f20359id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = challengeMsg.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = challengeMsg.title;
            if (str3 != null) {
                jsonGenerator.writeStringField("title", str3);
            }
            String str4 = challengeMsg.subTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("subTitle", str4);
            }
            String str5 = challengeMsg.buttonText;
            if (str5 != null) {
                jsonGenerator.writeStringField("buttonText", str5);
            }
            String str6 = challengeMsg.link;
            if (str6 != null) {
                jsonGenerator.writeStringField(Link.TYPE, str6);
            }
            String str7 = challengeMsg.eventlog;
            if (str7 != null) {
                jsonGenerator.writeStringField("eventlog", str7);
            }
            String str8 = challengeMsg.picUrl;
            if (str8 != null) {
                jsonGenerator.writeStringField("picUrl", str8);
            }
            String str9 = challengeMsg.source;
            if (str9 != null) {
                jsonGenerator.writeStringField("source", str9);
            }
            String str10 = challengeMsg.roomId;
            if (str10 != null) {
                jsonGenerator.writeStringField("roomId", str10);
            }
            String str11 = challengeMsg.scriptId;
            if (str11 != null) {
                jsonGenerator.writeStringField("scriptId", str11);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChallengeMsg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChallengeMsg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChallengeMsg new_() {
        ChallengeMsg challengeMsg = new ChallengeMsg();
        challengeMsg.nullCheck();
        return challengeMsg;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChallengeMsg mo223809clone() {
        ChallengeMsg challengeMsg = new ChallengeMsg();
        challengeMsg.f20359id = this.f20359id;
        challengeMsg.type = this.type;
        challengeMsg.title = this.title;
        challengeMsg.subTitle = this.subTitle;
        challengeMsg.buttonText = this.buttonText;
        challengeMsg.link = this.link;
        challengeMsg.eventlog = this.eventlog;
        challengeMsg.picUrl = this.picUrl;
        challengeMsg.source = this.source;
        challengeMsg.roomId = this.roomId;
        challengeMsg.scriptId = this.scriptId;
        return challengeMsg;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChallengeMsg)) {
            return false;
        }
        ChallengeMsg challengeMsg = (ChallengeMsg) obj;
        return ValueObject.util_equals(this.f20359id, challengeMsg.f20359id) && ValueObject.util_equals(this.type, challengeMsg.type) && ValueObject.util_equals(this.title, challengeMsg.title) && ValueObject.util_equals(this.subTitle, challengeMsg.subTitle) && ValueObject.util_equals(this.buttonText, challengeMsg.buttonText) && ValueObject.util_equals(this.link, challengeMsg.link) && ValueObject.util_equals(this.eventlog, challengeMsg.eventlog) && ValueObject.util_equals(this.picUrl, challengeMsg.picUrl) && ValueObject.util_equals(this.source, challengeMsg.source) && ValueObject.util_equals(this.roomId, challengeMsg.roomId) && ValueObject.util_equals(this.scriptId, challengeMsg.scriptId);
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
        String str = this.f20359id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.subTitle;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.buttonText;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.link;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.eventlog;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.picUrl;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.source;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.roomId;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.scriptId;
        int iHashCode11 = iHashCode10 + (str11 != null ? str11.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20359id == null) {
            this.f20359id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
        if (this.link == null) {
            this.link = "";
        }
        if (this.eventlog == null) {
            this.eventlog = "";
        }
        if (this.picUrl == null) {
            this.picUrl = "";
        }
        if (this.source == null) {
            this.source = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.scriptId == null) {
            this.scriptId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
