package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class TextCardData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "textcarddata";

    @NonNull
    @ProtobufIndex(index = 4)
    public String biz;

    @NonNull
    @ProtobufIndex(index = 5)
    public String fitReason;

    @NonNull
    @ProtobufIndex(index = 7)
    public String friendPurpose;

    @NonNull
    @ProtobufIndex(index = 2)
    public String secretKey;

    @NonNull
    @ProtobufIndex(index = 3)
    public String stage;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;

    @NonNull
    @ProtobufIndex(index = 6)
    public String zodiacFitPercent;
    public static ProtobufAdapter<TextCardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TextCardData>() { // from class: com.p1.mobile.putong.core.data.TextCardData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TextCardData textCardData) {
            String str = textCardData.userID;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = textCardData.secretKey;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = textCardData.stage;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = textCardData.biz;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = textCardData.fitReason;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = textCardData.zodiacFitPercent;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            String str7 = textCardData.friendPurpose;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str7);
            }
            textCardData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TextCardData parse(nc5 nc5Var) throws IOException {
            TextCardData textCardData = new TextCardData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (textCardData.userID == null) {
                        textCardData.userID = "";
                    }
                    if (textCardData.secretKey == null) {
                        textCardData.secretKey = "";
                    }
                    if (textCardData.stage == null) {
                        textCardData.stage = "";
                    }
                    if (textCardData.biz == null) {
                        textCardData.biz = "";
                    }
                    if (textCardData.fitReason == null) {
                        textCardData.fitReason = "";
                    }
                    if (textCardData.zodiacFitPercent == null) {
                        textCardData.zodiacFitPercent = "";
                    }
                    if (textCardData.friendPurpose != null) {
                        break;
                    }
                    textCardData.friendPurpose = "";
                    break;
                }
                if (iM162497u == 10) {
                    textCardData.userID = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    textCardData.secretKey = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    textCardData.stage = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    textCardData.biz = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    textCardData.fitReason = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    textCardData.zodiacFitPercent = nc5Var.m162495s();
                } else {
                    if (iM162497u != 58) {
                        if (textCardData.userID == null) {
                            textCardData.userID = "";
                        }
                        if (textCardData.secretKey == null) {
                            textCardData.secretKey = "";
                        }
                        if (textCardData.stage == null) {
                            textCardData.stage = "";
                        }
                        if (textCardData.biz == null) {
                            textCardData.biz = "";
                        }
                        if (textCardData.fitReason == null) {
                            textCardData.fitReason = "";
                        }
                        if (textCardData.zodiacFitPercent == null) {
                            textCardData.zodiacFitPercent = "";
                        }
                        if (textCardData.friendPurpose != null) {
                            break;
                        }
                        textCardData.friendPurpose = "";
                        return textCardData;
                    }
                    textCardData.friendPurpose = nc5Var.m162495s();
                }
            }
            return textCardData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TextCardData textCardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = textCardData.userID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = textCardData.secretKey;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = textCardData.stage;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = textCardData.biz;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = textCardData.fitReason;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = textCardData.zodiacFitPercent;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            String str7 = textCardData.friendPurpose;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(7, str7);
            }
        }
    };
    public static JsonAdapter<TextCardData> JSON_ADAPTER = new ObjectJsonAdapter<TextCardData>() { // from class: com.p1.mobile.putong.core.data.TextCardData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TextCardData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TextCardData newInstance() {
            return new TextCardData();
        }

        public boolean parseField(TextCardData textCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "friendPurpose":
                    textCardData.friendPurpose = jsonParser.getValueAsString();
                    return true;
                case "userID":
                    textCardData.userID = jsonParser.getValueAsString();
                    return true;
                case "secretKey":
                    textCardData.secretKey = jsonParser.getValueAsString();
                    return true;
                case "zodiacFitPercent":
                    textCardData.zodiacFitPercent = jsonParser.getValueAsString();
                    return true;
                case "biz":
                    textCardData.biz = jsonParser.getValueAsString();
                    return true;
                case "stage":
                    textCardData.stage = jsonParser.getValueAsString();
                    return true;
                case "fitReason":
                    textCardData.fitReason = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TextCardData textCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "friendPurpose":
                case "userID":
                case "secretKey":
                case "zodiacFitPercent":
                case "biz":
                case "stage":
                case "fitReason":
                    return true;
                default:
                    return super.parseFieldCheck(textCardData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TextCardData textCardData, JsonGenerator jsonGenerator) throws IOException {
            String str = textCardData.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            String str2 = textCardData.secretKey;
            if (str2 != null) {
                jsonGenerator.writeStringField("secretKey", str2);
            }
            String str3 = textCardData.stage;
            if (str3 != null) {
                jsonGenerator.writeStringField("stage", str3);
            }
            String str4 = textCardData.biz;
            if (str4 != null) {
                jsonGenerator.writeStringField("biz", str4);
            }
            String str5 = textCardData.fitReason;
            if (str5 != null) {
                jsonGenerator.writeStringField("fitReason", str5);
            }
            String str6 = textCardData.zodiacFitPercent;
            if (str6 != null) {
                jsonGenerator.writeStringField("zodiacFitPercent", str6);
            }
            String str7 = textCardData.friendPurpose;
            if (str7 != null) {
                jsonGenerator.writeStringField(ProfileLikeCategoryType.friendPurpose, str7);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TextCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TextCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TextCardData new_() {
        TextCardData textCardData = new TextCardData();
        textCardData.nullCheck();
        return textCardData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TextCardData mo225055clone() {
        TextCardData textCardData = new TextCardData();
        textCardData.userID = this.userID;
        textCardData.secretKey = this.secretKey;
        textCardData.stage = this.stage;
        textCardData.biz = this.biz;
        textCardData.fitReason = this.fitReason;
        textCardData.zodiacFitPercent = this.zodiacFitPercent;
        textCardData.friendPurpose = this.friendPurpose;
        return textCardData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextCardData)) {
            return false;
        }
        TextCardData textCardData = (TextCardData) obj;
        return ValueObject.util_equals(this.userID, textCardData.userID) && ValueObject.util_equals(this.secretKey, textCardData.secretKey) && ValueObject.util_equals(this.stage, textCardData.stage) && ValueObject.util_equals(this.biz, textCardData.biz) && ValueObject.util_equals(this.fitReason, textCardData.fitReason) && ValueObject.util_equals(this.zodiacFitPercent, textCardData.zodiacFitPercent) && ValueObject.util_equals(this.friendPurpose, textCardData.friendPurpose);
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
        String str3 = this.stage;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.biz;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.fitReason;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.zodiacFitPercent;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.friendPurpose;
        int iHashCode7 = iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
        if (this.secretKey == null) {
            this.secretKey = "";
        }
        if (this.stage == null) {
            this.stage = "";
        }
        if (this.biz == null) {
            this.biz = "";
        }
        if (this.fitReason == null) {
            this.fitReason = "";
        }
        if (this.zodiacFitPercent == null) {
            this.zodiacFitPercent = "";
        }
        if (this.friendPurpose == null) {
            this.friendPurpose = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
