package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.RelationshipStatus;
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
public class QuickChatCardInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatcardinfo";

    @NonNull
    @ProtobufIndex(index = 4)
    public QuickChatType biz;

    @NonNull
    @ProtobufIndex(index = 6)
    public String fitReason;

    @NonNull
    @ProtobufIndex(index = 7)
    public String friendPurpose;

    @NonNull
    @ProtobufIndex(index = 3)
    public RelationshipStatus rsState;

    @NonNull
    @ProtobufIndex(index = 2)
    public String secretKey;

    @NonNull
    @ProtobufIndex(index = 5)
    public String stage;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;

    @NonNull
    @ProtobufIndex(index = 8)
    public String zodiacFitPercent;
    public static ProtobufAdapter<QuickChatCardInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickChatCardInfo>() { // from class: com.p1.mobile.putong.core.data.QuickChatCardInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(QuickChatCardInfo quickChatCardInfo) {
            String str = quickChatCardInfo.userID;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = quickChatCardInfo.secretKey;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            RelationshipStatus relationshipStatus = quickChatCardInfo.rsState;
            if (relationshipStatus != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            QuickChatType quickChatType = quickChatCardInfo.biz;
            if (quickChatType != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, quickChatType, QuickChatType.PROTOBUF_ADAPTER);
            }
            String str3 = quickChatCardInfo.stage;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            String str4 = quickChatCardInfo.fitReason;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            String str5 = quickChatCardInfo.friendPurpose;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            String str6 = quickChatCardInfo.zodiacFitPercent;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str6);
            }
            quickChatCardInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public QuickChatCardInfo parse(nc5 nc5Var) throws IOException {
            QuickChatCardInfo quickChatCardInfo = new QuickChatCardInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (quickChatCardInfo.userID == null) {
                        quickChatCardInfo.userID = "";
                    }
                    if (quickChatCardInfo.secretKey == null) {
                        quickChatCardInfo.secretKey = "";
                    }
                    if (quickChatCardInfo.rsState == null) {
                        quickChatCardInfo.rsState = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (quickChatCardInfo.biz == null) {
                        quickChatCardInfo.biz = (QuickChatType) QuickChatType.JSON_ADAPTER.defaultEnum();
                    }
                    if (quickChatCardInfo.stage == null) {
                        quickChatCardInfo.stage = "";
                    }
                    if (quickChatCardInfo.fitReason == null) {
                        quickChatCardInfo.fitReason = "";
                    }
                    if (quickChatCardInfo.friendPurpose == null) {
                        quickChatCardInfo.friendPurpose = "";
                    }
                    if (quickChatCardInfo.zodiacFitPercent != null) {
                        break;
                    }
                    quickChatCardInfo.zodiacFitPercent = "";
                    break;
                }
                if (iM162497u == 10) {
                    quickChatCardInfo.userID = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    quickChatCardInfo.secretKey = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    quickChatCardInfo.rsState = (RelationshipStatus) nc5Var.m162488l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else if (iM162497u == 34) {
                    quickChatCardInfo.biz = (QuickChatType) nc5Var.m162488l(QuickChatType.PROTOBUF_ADAPTER);
                } else if (iM162497u == 42) {
                    quickChatCardInfo.stage = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    quickChatCardInfo.fitReason = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    quickChatCardInfo.friendPurpose = nc5Var.m162495s();
                } else {
                    if (iM162497u != 66) {
                        if (quickChatCardInfo.userID == null) {
                            quickChatCardInfo.userID = "";
                        }
                        if (quickChatCardInfo.secretKey == null) {
                            quickChatCardInfo.secretKey = "";
                        }
                        if (quickChatCardInfo.rsState == null) {
                            quickChatCardInfo.rsState = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (quickChatCardInfo.biz == null) {
                            quickChatCardInfo.biz = (QuickChatType) QuickChatType.JSON_ADAPTER.defaultEnum();
                        }
                        if (quickChatCardInfo.stage == null) {
                            quickChatCardInfo.stage = "";
                        }
                        if (quickChatCardInfo.fitReason == null) {
                            quickChatCardInfo.fitReason = "";
                        }
                        if (quickChatCardInfo.friendPurpose == null) {
                            quickChatCardInfo.friendPurpose = "";
                        }
                        if (quickChatCardInfo.zodiacFitPercent != null) {
                            break;
                        }
                        quickChatCardInfo.zodiacFitPercent = "";
                        return quickChatCardInfo;
                    }
                    quickChatCardInfo.zodiacFitPercent = nc5Var.m162495s();
                }
            }
            return quickChatCardInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(QuickChatCardInfo quickChatCardInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = quickChatCardInfo.userID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = quickChatCardInfo.secretKey;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            RelationshipStatus relationshipStatus = quickChatCardInfo.rsState;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.m17309K(3, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            QuickChatType quickChatType = quickChatCardInfo.biz;
            if (quickChatType != null) {
                codedOutputByteBufferNano.m17309K(4, quickChatType, QuickChatType.PROTOBUF_ADAPTER);
            }
            String str3 = quickChatCardInfo.stage;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            String str4 = quickChatCardInfo.fitReason;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            String str5 = quickChatCardInfo.friendPurpose;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
            String str6 = quickChatCardInfo.zodiacFitPercent;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(8, str6);
            }
        }
    };
    public static JsonAdapter<QuickChatCardInfo> JSON_ADAPTER = new ObjectJsonAdapter<QuickChatCardInfo>() { // from class: com.p1.mobile.putong.core.data.QuickChatCardInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return QuickChatCardInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public QuickChatCardInfo newInstance() {
            return new QuickChatCardInfo();
        }

        public boolean parseField(QuickChatCardInfo quickChatCardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "friendPurpose":
                    quickChatCardInfo.friendPurpose = jsonParser.getValueAsString();
                    return true;
                case "userID":
                    quickChatCardInfo.userID = jsonParser.getValueAsString();
                    return true;
                case "secretKey":
                    quickChatCardInfo.secretKey = jsonParser.getValueAsString();
                    return true;
                case "zodiacFitPercent":
                    quickChatCardInfo.zodiacFitPercent = jsonParser.getValueAsString();
                    return true;
                case "biz":
                    quickChatCardInfo.biz = QuickChatType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "stage":
                    quickChatCardInfo.stage = jsonParser.getValueAsString();
                    return true;
                case "fitReason":
                    quickChatCardInfo.fitReason = jsonParser.getValueAsString();
                    return true;
                case "rsState":
                    quickChatCardInfo.rsState = RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(QuickChatCardInfo quickChatCardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "friendPurpose":
                case "userID":
                case "secretKey":
                case "zodiacFitPercent":
                case "biz":
                case "stage":
                case "fitReason":
                case "rsState":
                    return true;
                default:
                    return super.parseFieldCheck(quickChatCardInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(QuickChatCardInfo quickChatCardInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = quickChatCardInfo.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            String str2 = quickChatCardInfo.secretKey;
            if (str2 != null) {
                jsonGenerator.writeStringField("secretKey", str2);
            }
            if (quickChatCardInfo.rsState != null) {
                jsonGenerator.writeFieldName("rsState");
                RelationshipStatus.JSON_ADAPTER.serialize(quickChatCardInfo.rsState, jsonGenerator, true);
            }
            if (quickChatCardInfo.biz != null) {
                jsonGenerator.writeFieldName("biz");
                QuickChatType.JSON_ADAPTER.serialize(quickChatCardInfo.biz, jsonGenerator, true);
            }
            String str3 = quickChatCardInfo.stage;
            if (str3 != null) {
                jsonGenerator.writeStringField("stage", str3);
            }
            String str4 = quickChatCardInfo.fitReason;
            if (str4 != null) {
                jsonGenerator.writeStringField("fitReason", str4);
            }
            String str5 = quickChatCardInfo.friendPurpose;
            if (str5 != null) {
                jsonGenerator.writeStringField(ProfileLikeCategoryType.friendPurpose, str5);
            }
            String str6 = quickChatCardInfo.zodiacFitPercent;
            if (str6 != null) {
                jsonGenerator.writeStringField("zodiacFitPercent", str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickChatCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickChatCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickChatCardInfo new_() {
        QuickChatCardInfo quickChatCardInfo = new QuickChatCardInfo();
        quickChatCardInfo.nullCheck();
        return quickChatCardInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public QuickChatCardInfo mo225055clone() {
        QuickChatCardInfo quickChatCardInfo = new QuickChatCardInfo();
        quickChatCardInfo.userID = this.userID;
        quickChatCardInfo.secretKey = this.secretKey;
        quickChatCardInfo.rsState = this.rsState;
        quickChatCardInfo.biz = this.biz;
        quickChatCardInfo.stage = this.stage;
        quickChatCardInfo.fitReason = this.fitReason;
        quickChatCardInfo.friendPurpose = this.friendPurpose;
        quickChatCardInfo.zodiacFitPercent = this.zodiacFitPercent;
        return quickChatCardInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickChatCardInfo)) {
            return false;
        }
        QuickChatCardInfo quickChatCardInfo = (QuickChatCardInfo) obj;
        return ValueObject.util_equals(this.userID, quickChatCardInfo.userID) && ValueObject.util_equals(this.secretKey, quickChatCardInfo.secretKey) && ValueObject.util_equals(this.rsState, quickChatCardInfo.rsState) && ValueObject.util_equals(this.biz, quickChatCardInfo.biz) && ValueObject.util_equals(this.stage, quickChatCardInfo.stage) && ValueObject.util_equals(this.fitReason, quickChatCardInfo.fitReason) && ValueObject.util_equals(this.friendPurpose, quickChatCardInfo.friendPurpose) && ValueObject.util_equals(this.zodiacFitPercent, quickChatCardInfo.zodiacFitPercent);
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
        String str = this.userID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.secretKey;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        RelationshipStatus relationshipStatus = this.rsState;
        int iHashCode3 = (iHashCode2 + (relationshipStatus != null ? relationshipStatus.hashCode() : 0)) * 41;
        QuickChatType quickChatType = this.biz;
        int iHashCode4 = (iHashCode3 + (quickChatType != null ? quickChatType.hashCode() : 0)) * 41;
        String str3 = this.stage;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.fitReason;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.friendPurpose;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.zodiacFitPercent;
        int iHashCode8 = iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
        if (this.secretKey == null) {
            this.secretKey = "";
        }
        if (this.rsState == null) {
            this.rsState = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.biz == null) {
            this.biz = (QuickChatType) QuickChatType.JSON_ADAPTER.defaultEnum();
        }
        if (this.stage == null) {
            this.stage = "";
        }
        if (this.fitReason == null) {
            this.fitReason = "";
        }
        if (this.friendPurpose == null) {
            this.friendPurpose = "";
        }
        if (this.zodiacFitPercent == null) {
            this.zodiacFitPercent = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
