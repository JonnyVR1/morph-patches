package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.Grade;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class LiveFansClubLevel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livefansclublevel";

    @ProtobufIndex(index = 5)
    public long gap;

    @ProtobufIndex(index = 2)
    public long grade;

    @NonNull
    @ProtobufIndex(index = 7)
    public String iconUrl;

    @ProtobufIndex(index = 3)
    public long memberCount;

    @NonNull
    @ProtobufIndex(index = 9)
    public String shadingBackUrl;

    @NonNull
    @ProtobufIndex(index = 8)
    public String shadingFrontUrl;

    @NonNull
    @ProtobufIndex(index = 11)
    public String textColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @ProtobufIndex(index = 6)
    public long updatedTime;

    @NonNull
    @ProtobufIndex(index = 12)
    public String userType;

    @ProtobufIndex(index = 4)
    public long wealth;

    @ProtobufIndex(index = 10)
    public double wealthRatio;
    public static ProtobufAdapter<LiveFansClubLevel> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveFansClubLevel>() { // from class: com.p1.mobile.putong.data.LiveFansClubLevel.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveFansClubLevel liveFansClubLevel) {
            String str = liveFansClubLevel.title;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17283j(2, liveFansClubLevel.grade) + CodedOutputByteBufferNano.m17283j(3, liveFansClubLevel.memberCount) + CodedOutputByteBufferNano.m17283j(4, liveFansClubLevel.wealth) + CodedOutputByteBufferNano.m17283j(5, liveFansClubLevel.gap) + CodedOutputByteBufferNano.m17283j(6, liveFansClubLevel.updatedTime);
            String str2 = liveFansClubLevel.iconUrl;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str2);
            }
            String str3 = liveFansClubLevel.shadingFrontUrl;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str3);
            }
            String str4 = liveFansClubLevel.shadingBackUrl;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(9, str4);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(10, liveFansClubLevel.wealthRatio);
            String str5 = liveFansClubLevel.textColor;
            if (str5 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(11, str5);
            }
            String str6 = liveFansClubLevel.userType;
            if (str6 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(12, str6);
            }
            liveFansClubLevel.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveFansClubLevel parse(nc5 nc5Var) throws IOException {
            LiveFansClubLevel liveFansClubLevel = new LiveFansClubLevel();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (liveFansClubLevel.title == null) {
                            liveFansClubLevel.title = "";
                        }
                        if (liveFansClubLevel.iconUrl == null) {
                            liveFansClubLevel.iconUrl = "";
                        }
                        if (liveFansClubLevel.shadingFrontUrl == null) {
                            liveFansClubLevel.shadingFrontUrl = "";
                        }
                        if (liveFansClubLevel.shadingBackUrl == null) {
                            liveFansClubLevel.shadingBackUrl = "";
                        }
                        if (liveFansClubLevel.textColor == null) {
                            liveFansClubLevel.textColor = "";
                        }
                        if (liveFansClubLevel.userType == null) {
                            liveFansClubLevel.userType = "";
                        }
                        break;
                    case 10:
                        liveFansClubLevel.title = nc5Var.m162495s();
                        continue;
                    case 16:
                        liveFansClubLevel.grade = nc5Var.m162487k();
                        continue;
                    case 24:
                        liveFansClubLevel.memberCount = nc5Var.m162487k();
                        continue;
                    case 32:
                        liveFansClubLevel.wealth = nc5Var.m162487k();
                        continue;
                    case 40:
                        liveFansClubLevel.gap = nc5Var.m162487k();
                        continue;
                    case 48:
                        liveFansClubLevel.updatedTime = nc5Var.m162487k();
                        continue;
                    case 58:
                        liveFansClubLevel.iconUrl = nc5Var.m162495s();
                        continue;
                    case 66:
                        liveFansClubLevel.shadingFrontUrl = nc5Var.m162495s();
                        continue;
                    case 74:
                        liveFansClubLevel.shadingBackUrl = nc5Var.m162495s();
                        continue;
                    case EACTags.FILE_REFERENCE /* 81 */:
                        liveFansClubLevel.wealthRatio = nc5Var.m162484h();
                        continue;
                    case 90:
                        liveFansClubLevel.textColor = nc5Var.m162495s();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        liveFansClubLevel.userType = nc5Var.m162495s();
                        continue;
                    default:
                        if (liveFansClubLevel.title == null) {
                            liveFansClubLevel.title = "";
                        }
                        if (liveFansClubLevel.iconUrl == null) {
                            liveFansClubLevel.iconUrl = "";
                        }
                        if (liveFansClubLevel.shadingFrontUrl == null) {
                            liveFansClubLevel.shadingFrontUrl = "";
                        }
                        if (liveFansClubLevel.shadingBackUrl == null) {
                            liveFansClubLevel.shadingBackUrl = "";
                        }
                        if (liveFansClubLevel.textColor == null) {
                            liveFansClubLevel.textColor = "";
                        }
                        if (liveFansClubLevel.userType == null) {
                            liveFansClubLevel.userType = "";
                            return liveFansClubLevel;
                        }
                        break;
                }
            }
            return liveFansClubLevel;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveFansClubLevel liveFansClubLevel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveFansClubLevel.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17307I(2, liveFansClubLevel.grade);
            codedOutputByteBufferNano.m17307I(3, liveFansClubLevel.memberCount);
            codedOutputByteBufferNano.m17307I(4, liveFansClubLevel.wealth);
            codedOutputByteBufferNano.m17307I(5, liveFansClubLevel.gap);
            codedOutputByteBufferNano.m17307I(6, liveFansClubLevel.updatedTime);
            String str2 = liveFansClubLevel.iconUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(7, str2);
            }
            String str3 = liveFansClubLevel.shadingFrontUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(8, str3);
            }
            String str4 = liveFansClubLevel.shadingBackUrl;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(9, str4);
            }
            codedOutputByteBufferNano.m17301C(10, liveFansClubLevel.wealthRatio);
            String str5 = liveFansClubLevel.textColor;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(11, str5);
            }
            String str6 = liveFansClubLevel.userType;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(12, str6);
            }
        }
    };
    public static JsonAdapter<LiveFansClubLevel> JSON_ADAPTER = new ObjectJsonAdapter<LiveFansClubLevel>() { // from class: com.p1.mobile.putong.data.LiveFansClubLevel.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveFansClubLevel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveFansClubLevel newInstance() {
            return new LiveFansClubLevel();
        }

        public boolean parseField(LiveFansClubLevel liveFansClubLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "textColor":
                    liveFansClubLevel.textColor = jsonParser.getValueAsString();
                    return true;
                case "wealth":
                    liveFansClubLevel.wealth = jsonParser.getValueAsLong();
                    return true;
                case "updatedTime":
                    liveFansClubLevel.updatedTime = jsonParser.getValueAsLong();
                    return true;
                case "shadingFrontUrl":
                    liveFansClubLevel.shadingFrontUrl = jsonParser.getValueAsString();
                    return true;
                case "userType":
                    liveFansClubLevel.userType = jsonParser.getValueAsString();
                    return true;
                case "gap":
                    liveFansClubLevel.gap = jsonParser.getValueAsLong();
                    return true;
                case "grade":
                    liveFansClubLevel.grade = jsonParser.getValueAsLong();
                    return true;
                case "title":
                    liveFansClubLevel.title = jsonParser.getValueAsString();
                    return true;
                case "wealthRatio":
                    liveFansClubLevel.wealthRatio = jsonParser.getValueAsDouble();
                    return true;
                case "memberCount":
                    liveFansClubLevel.memberCount = jsonParser.getValueAsLong();
                    return true;
                case "iconUrl":
                    liveFansClubLevel.iconUrl = jsonParser.getValueAsString();
                    return true;
                case "shadingBackUrl":
                    liveFansClubLevel.shadingBackUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveFansClubLevel liveFansClubLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "textColor":
                case "wealth":
                case "updatedTime":
                case "shadingFrontUrl":
                case "userType":
                case "gap":
                case "grade":
                case "title":
                case "wealthRatio":
                case "memberCount":
                case "iconUrl":
                case "shadingBackUrl":
                    return true;
                default:
                    return super.parseFieldCheck(liveFansClubLevel, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveFansClubLevel liveFansClubLevel, JsonGenerator jsonGenerator) throws IOException {
            String str = liveFansClubLevel.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            jsonGenerator.writeNumberField(Grade.TYPE, liveFansClubLevel.grade);
            jsonGenerator.writeNumberField("memberCount", liveFansClubLevel.memberCount);
            jsonGenerator.writeNumberField("wealth", liveFansClubLevel.wealth);
            jsonGenerator.writeNumberField("gap", liveFansClubLevel.gap);
            jsonGenerator.writeNumberField(LocationInvisibleField.updatedTime, liveFansClubLevel.updatedTime);
            String str2 = liveFansClubLevel.iconUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("iconUrl", str2);
            }
            String str3 = liveFansClubLevel.shadingFrontUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("shadingFrontUrl", str3);
            }
            String str4 = liveFansClubLevel.shadingBackUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("shadingBackUrl", str4);
            }
            jsonGenerator.writeNumberField("wealthRatio", liveFansClubLevel.wealthRatio);
            String str5 = liveFansClubLevel.textColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("textColor", str5);
            }
            String str6 = liveFansClubLevel.userType;
            if (str6 != null) {
                jsonGenerator.writeStringField("userType", str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveFansClubLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveFansClubLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveFansClubLevel new_() {
        LiveFansClubLevel liveFansClubLevel = new LiveFansClubLevel();
        liveFansClubLevel.nullCheck();
        return liveFansClubLevel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveFansClubLevel mo225055clone() {
        LiveFansClubLevel liveFansClubLevel = new LiveFansClubLevel();
        liveFansClubLevel.title = this.title;
        liveFansClubLevel.grade = this.grade;
        liveFansClubLevel.memberCount = this.memberCount;
        liveFansClubLevel.wealth = this.wealth;
        liveFansClubLevel.gap = this.gap;
        liveFansClubLevel.updatedTime = this.updatedTime;
        liveFansClubLevel.iconUrl = this.iconUrl;
        liveFansClubLevel.shadingFrontUrl = this.shadingFrontUrl;
        liveFansClubLevel.shadingBackUrl = this.shadingBackUrl;
        liveFansClubLevel.wealthRatio = this.wealthRatio;
        liveFansClubLevel.textColor = this.textColor;
        liveFansClubLevel.userType = this.userType;
        return liveFansClubLevel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveFansClubLevel)) {
            return false;
        }
        LiveFansClubLevel liveFansClubLevel = (LiveFansClubLevel) obj;
        return ValueObject.util_equals(this.title, liveFansClubLevel.title) && this.grade == liveFansClubLevel.grade && this.memberCount == liveFansClubLevel.memberCount && this.wealth == liveFansClubLevel.wealth && this.gap == liveFansClubLevel.gap && this.updatedTime == liveFansClubLevel.updatedTime && ValueObject.util_equals(this.iconUrl, liveFansClubLevel.iconUrl) && ValueObject.util_equals(this.shadingFrontUrl, liveFansClubLevel.shadingFrontUrl) && ValueObject.util_equals(this.shadingBackUrl, liveFansClubLevel.shadingBackUrl) && this.wealthRatio == liveFansClubLevel.wealthRatio && ValueObject.util_equals(this.textColor, liveFansClubLevel.textColor) && ValueObject.util_equals(this.userType, liveFansClubLevel.userType);
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
        String str = this.title;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.grade;
        int i3 = (((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.memberCount;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.wealth;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        long j4 = this.gap;
        int i6 = (i5 + ((int) (j4 ^ (j4 >>> 32)))) * 41;
        long j5 = this.updatedTime;
        int i7 = (i6 + ((int) (j5 ^ (j5 >>> 32)))) * 41;
        String str2 = this.iconUrl;
        int iHashCode2 = (i7 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.shadingFrontUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.shadingBackUrl;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        long jDoubleToLongBits = Double.doubleToLongBits(this.wealthRatio);
        int i8 = ((iHashCode4 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str5 = this.textColor;
        int iHashCode5 = (i8 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.userType;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.shadingFrontUrl == null) {
            this.shadingFrontUrl = "";
        }
        if (this.shadingBackUrl == null) {
            this.shadingBackUrl = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
        if (this.userType == null) {
            this.userType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
