package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class RecallMembershipData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recallmembershipdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String cardBackgroundUrl;

    @NonNull
    @ProtobufIndex(index = 6)
    public String cardBtnSubTitle;

    @NonNull
    @ProtobufIndex(index = 5)
    public String cardBtnTitle;

    @NonNull
    @ProtobufIndex(index = 3)
    public String cardDesc;

    @NonNull
    @ProtobufIndex(index = 4)
    public String cardLogo;

    @NonNull
    @ProtobufIndex(index = 2)
    public String cardTitle;

    @NonNull
    @ProtobufIndex(index = 10)
    public String channel;

    @NonNull
    @ProtobufIndex(index = 9)
    public String h5URL;

    @NonNull
    @ProtobufIndex(index = 7)
    public String membershipType;

    @NonNull
    @ProtobufIndex(index = 8)
    public String quantity;
    public static ProtobufAdapter<RecallMembershipData> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecallMembershipData>() { // from class: com.p1.mobile.putong.core.data.RecallMembershipData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RecallMembershipData recallMembershipData) {
            String str = recallMembershipData.cardBackgroundUrl;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = recallMembershipData.cardTitle;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = recallMembershipData.cardDesc;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = recallMembershipData.cardLogo;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = recallMembershipData.cardBtnTitle;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = recallMembershipData.cardBtnSubTitle;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = recallMembershipData.membershipType;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            String str8 = recallMembershipData.quantity;
            if (str8 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(8, str8);
            }
            String str9 = recallMembershipData.h5URL;
            if (str9 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(9, str9);
            }
            String str10 = recallMembershipData.channel;
            if (str10 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(10, str10);
            }
            recallMembershipData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RecallMembershipData parse(nb5 nb5Var) throws IOException {
            RecallMembershipData recallMembershipData = new RecallMembershipData();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (recallMembershipData.cardBackgroundUrl == null) {
                            recallMembershipData.cardBackgroundUrl = "";
                        }
                        if (recallMembershipData.cardTitle == null) {
                            recallMembershipData.cardTitle = "";
                        }
                        if (recallMembershipData.cardDesc == null) {
                            recallMembershipData.cardDesc = "";
                        }
                        if (recallMembershipData.cardLogo == null) {
                            recallMembershipData.cardLogo = "";
                        }
                        if (recallMembershipData.cardBtnTitle == null) {
                            recallMembershipData.cardBtnTitle = "";
                        }
                        if (recallMembershipData.cardBtnSubTitle == null) {
                            recallMembershipData.cardBtnSubTitle = "";
                        }
                        if (recallMembershipData.membershipType == null) {
                            recallMembershipData.membershipType = "";
                        }
                        if (recallMembershipData.quantity == null) {
                            recallMembershipData.quantity = "";
                        }
                        if (recallMembershipData.h5URL == null) {
                            recallMembershipData.h5URL = "";
                        }
                        if (recallMembershipData.channel == null) {
                            recallMembershipData.channel = "";
                        }
                        break;
                    case 10:
                        recallMembershipData.cardBackgroundUrl = nb5Var.m158750s();
                        continue;
                    case 18:
                        recallMembershipData.cardTitle = nb5Var.m158750s();
                        continue;
                    case 26:
                        recallMembershipData.cardDesc = nb5Var.m158750s();
                        continue;
                    case 34:
                        recallMembershipData.cardLogo = nb5Var.m158750s();
                        continue;
                    case 42:
                        recallMembershipData.cardBtnTitle = nb5Var.m158750s();
                        continue;
                    case 50:
                        recallMembershipData.cardBtnSubTitle = nb5Var.m158750s();
                        continue;
                    case 58:
                        recallMembershipData.membershipType = nb5Var.m158750s();
                        continue;
                    case 66:
                        recallMembershipData.quantity = nb5Var.m158750s();
                        continue;
                    case 74:
                        recallMembershipData.h5URL = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        recallMembershipData.channel = nb5Var.m158750s();
                        continue;
                    default:
                        if (recallMembershipData.cardBackgroundUrl == null) {
                            recallMembershipData.cardBackgroundUrl = "";
                        }
                        if (recallMembershipData.cardTitle == null) {
                            recallMembershipData.cardTitle = "";
                        }
                        if (recallMembershipData.cardDesc == null) {
                            recallMembershipData.cardDesc = "";
                        }
                        if (recallMembershipData.cardLogo == null) {
                            recallMembershipData.cardLogo = "";
                        }
                        if (recallMembershipData.cardBtnTitle == null) {
                            recallMembershipData.cardBtnTitle = "";
                        }
                        if (recallMembershipData.cardBtnSubTitle == null) {
                            recallMembershipData.cardBtnSubTitle = "";
                        }
                        if (recallMembershipData.membershipType == null) {
                            recallMembershipData.membershipType = "";
                        }
                        if (recallMembershipData.quantity == null) {
                            recallMembershipData.quantity = "";
                        }
                        if (recallMembershipData.h5URL == null) {
                            recallMembershipData.h5URL = "";
                        }
                        if (recallMembershipData.channel == null) {
                            recallMembershipData.channel = "";
                            return recallMembershipData;
                        }
                        break;
                }
            }
            return recallMembershipData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RecallMembershipData recallMembershipData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = recallMembershipData.cardBackgroundUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = recallMembershipData.cardTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = recallMembershipData.cardDesc;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = recallMembershipData.cardLogo;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = recallMembershipData.cardBtnTitle;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = recallMembershipData.cardBtnSubTitle;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = recallMembershipData.membershipType;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
            String str8 = recallMembershipData.quantity;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(8, str8);
            }
            String str9 = recallMembershipData.h5URL;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(9, str9);
            }
            String str10 = recallMembershipData.channel;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(10, str10);
            }
        }
    };
    public static JsonAdapter<RecallMembershipData> JSON_ADAPTER = new ObjectJsonAdapter<RecallMembershipData>() { // from class: com.p1.mobile.putong.core.data.RecallMembershipData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RecallMembershipData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RecallMembershipData newInstance() {
            return new RecallMembershipData();
        }

        public boolean parseField(RecallMembershipData recallMembershipData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cardBtnTitle":
                    recallMembershipData.cardBtnTitle = jsonParser.getValueAsString();
                    return true;
                case "cardBackgroundUrl":
                    recallMembershipData.cardBackgroundUrl = jsonParser.getValueAsString();
                    return true;
                case "quantity":
                    recallMembershipData.quantity = jsonParser.getValueAsString();
                    return true;
                case "membershipType":
                    recallMembershipData.membershipType = jsonParser.getValueAsString();
                    return true;
                case "cardBtnSubTitle":
                    recallMembershipData.cardBtnSubTitle = jsonParser.getValueAsString();
                    return true;
                case "cardTitle":
                    recallMembershipData.cardTitle = jsonParser.getValueAsString();
                    return true;
                case "cardDesc":
                    recallMembershipData.cardDesc = jsonParser.getValueAsString();
                    return true;
                case "cardLogo":
                    recallMembershipData.cardLogo = jsonParser.getValueAsString();
                    return true;
                case "h5URL":
                    recallMembershipData.h5URL = jsonParser.getValueAsString();
                    return true;
                case "channel":
                    recallMembershipData.channel = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RecallMembershipData recallMembershipData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cardBtnTitle":
                case "cardBackgroundUrl":
                case "quantity":
                case "membershipType":
                case "cardBtnSubTitle":
                case "cardTitle":
                case "cardDesc":
                case "cardLogo":
                case "h5URL":
                case "channel":
                    return true;
                default:
                    return super.parseFieldCheck(recallMembershipData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecallMembershipData recallMembershipData, JsonGenerator jsonGenerator) throws IOException {
            String str = recallMembershipData.cardBackgroundUrl;
            if (str != null) {
                jsonGenerator.writeStringField("cardBackgroundUrl", str);
            }
            String str2 = recallMembershipData.cardTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("cardTitle", str2);
            }
            String str3 = recallMembershipData.cardDesc;
            if (str3 != null) {
                jsonGenerator.writeStringField("cardDesc", str3);
            }
            String str4 = recallMembershipData.cardLogo;
            if (str4 != null) {
                jsonGenerator.writeStringField("cardLogo", str4);
            }
            String str5 = recallMembershipData.cardBtnTitle;
            if (str5 != null) {
                jsonGenerator.writeStringField("cardBtnTitle", str5);
            }
            String str6 = recallMembershipData.cardBtnSubTitle;
            if (str6 != null) {
                jsonGenerator.writeStringField("cardBtnSubTitle", str6);
            }
            String str7 = recallMembershipData.membershipType;
            if (str7 != null) {
                jsonGenerator.writeStringField("membershipType", str7);
            }
            String str8 = recallMembershipData.quantity;
            if (str8 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.QUANTITY, str8);
            }
            String str9 = recallMembershipData.h5URL;
            if (str9 != null) {
                jsonGenerator.writeStringField("h5URL", str9);
            }
            String str10 = recallMembershipData.channel;
            if (str10 != null) {
                jsonGenerator.writeStringField("channel", str10);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecallMembershipData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecallMembershipData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecallMembershipData new_() {
        RecallMembershipData recallMembershipData = new RecallMembershipData();
        recallMembershipData.nullCheck();
        return recallMembershipData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RecallMembershipData mo223809clone() {
        RecallMembershipData recallMembershipData = new RecallMembershipData();
        recallMembershipData.cardBackgroundUrl = this.cardBackgroundUrl;
        recallMembershipData.cardTitle = this.cardTitle;
        recallMembershipData.cardDesc = this.cardDesc;
        recallMembershipData.cardLogo = this.cardLogo;
        recallMembershipData.cardBtnTitle = this.cardBtnTitle;
        recallMembershipData.cardBtnSubTitle = this.cardBtnSubTitle;
        recallMembershipData.membershipType = this.membershipType;
        recallMembershipData.quantity = this.quantity;
        recallMembershipData.h5URL = this.h5URL;
        recallMembershipData.channel = this.channel;
        return recallMembershipData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecallMembershipData)) {
            return false;
        }
        RecallMembershipData recallMembershipData = (RecallMembershipData) obj;
        return ValueObject.util_equals(this.cardBackgroundUrl, recallMembershipData.cardBackgroundUrl) && ValueObject.util_equals(this.cardTitle, recallMembershipData.cardTitle) && ValueObject.util_equals(this.cardDesc, recallMembershipData.cardDesc) && ValueObject.util_equals(this.cardLogo, recallMembershipData.cardLogo) && ValueObject.util_equals(this.cardBtnTitle, recallMembershipData.cardBtnTitle) && ValueObject.util_equals(this.cardBtnSubTitle, recallMembershipData.cardBtnSubTitle) && ValueObject.util_equals(this.membershipType, recallMembershipData.membershipType) && ValueObject.util_equals(this.quantity, recallMembershipData.quantity) && ValueObject.util_equals(this.h5URL, recallMembershipData.h5URL) && ValueObject.util_equals(this.channel, recallMembershipData.channel);
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
        String str = this.cardBackgroundUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.cardTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.cardDesc;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.cardLogo;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.cardBtnTitle;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.cardBtnSubTitle;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.membershipType;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.quantity;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.h5URL;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.channel;
        int iHashCode10 = iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cardBackgroundUrl == null) {
            this.cardBackgroundUrl = "";
        }
        if (this.cardTitle == null) {
            this.cardTitle = "";
        }
        if (this.cardDesc == null) {
            this.cardDesc = "";
        }
        if (this.cardLogo == null) {
            this.cardLogo = "";
        }
        if (this.cardBtnTitle == null) {
            this.cardBtnTitle = "";
        }
        if (this.cardBtnSubTitle == null) {
            this.cardBtnSubTitle = "";
        }
        if (this.membershipType == null) {
            this.membershipType = "";
        }
        if (this.quantity == null) {
            this.quantity = "";
        }
        if (this.h5URL == null) {
            this.h5URL = "";
        }
        if (this.channel == null) {
            this.channel = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
