package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
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

/* JADX INFO: loaded from: classes10.dex */
public class ConvAdditionalMatchInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "convadditionalmatchinfo";

    @ProtobufIndex(index = 1)
    public double likeTime;

    @ProtobufIndex(index = 2)
    public double likedByTime;

    @ProtobufIndex(index = 6)
    public double matchTime;

    @NonNull
    @ProtobufIndex(index = 5)
    public String otherState;

    @NonNull
    @ProtobufIndex(index = 3)
    public String source;

    @NonNull
    @ProtobufIndex(index = 10)
    public String sourceEn;

    @NonNull
    @ProtobufIndex(index = 7)
    public String sourceUserID;

    @NonNull
    @ProtobufIndex(index = 4)
    public String state;

    @NonNull
    @ProtobufIndex(index = 9)
    public String verifyInviteOwner;

    @ProtobufIndex(index = 8)
    public double verifyInviteTime;
    public static ProtobufAdapter<ConvAdditionalMatchInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConvAdditionalMatchInfo>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalMatchInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConvAdditionalMatchInfo convAdditionalMatchInfo) {
            int iM17277d = CodedOutputByteBufferNano.m17277d(1, convAdditionalMatchInfo.likeTime) + CodedOutputByteBufferNano.m17277d(2, convAdditionalMatchInfo.likedByTime);
            String str = convAdditionalMatchInfo.source;
            if (str != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(3, str);
            }
            String str2 = convAdditionalMatchInfo.state;
            if (str2 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            String str3 = convAdditionalMatchInfo.otherState;
            if (str3 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            int iM17277d2 = iM17277d + CodedOutputByteBufferNano.m17277d(6, convAdditionalMatchInfo.matchTime);
            String str4 = convAdditionalMatchInfo.sourceUserID;
            if (str4 != null) {
                iM17277d2 += CodedOutputByteBufferNano.m17288o(7, str4);
            }
            int iM17277d3 = iM17277d2 + CodedOutputByteBufferNano.m17277d(8, convAdditionalMatchInfo.verifyInviteTime);
            String str5 = convAdditionalMatchInfo.verifyInviteOwner;
            if (str5 != null) {
                iM17277d3 += CodedOutputByteBufferNano.m17288o(9, str5);
            }
            String str6 = convAdditionalMatchInfo.sourceEn;
            if (str6 != null) {
                iM17277d3 += CodedOutputByteBufferNano.m17288o(10, str6);
            }
            convAdditionalMatchInfo.cachedSize = iM17277d3;
            return iM17277d3;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConvAdditionalMatchInfo parse(nc5 nc5Var) throws IOException {
            ConvAdditionalMatchInfo convAdditionalMatchInfo = new ConvAdditionalMatchInfo();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (convAdditionalMatchInfo.source == null) {
                            convAdditionalMatchInfo.source = "";
                        }
                        if (convAdditionalMatchInfo.state == null) {
                            convAdditionalMatchInfo.state = "";
                        }
                        if (convAdditionalMatchInfo.otherState == null) {
                            convAdditionalMatchInfo.otherState = "";
                        }
                        if (convAdditionalMatchInfo.sourceUserID == null) {
                            convAdditionalMatchInfo.sourceUserID = "";
                        }
                        if (convAdditionalMatchInfo.verifyInviteOwner == null) {
                            convAdditionalMatchInfo.verifyInviteOwner = "";
                        }
                        if (convAdditionalMatchInfo.sourceEn == null) {
                            convAdditionalMatchInfo.sourceEn = "";
                        }
                        break;
                    case 9:
                        convAdditionalMatchInfo.likeTime = nc5Var.m162484h();
                        continue;
                    case 17:
                        convAdditionalMatchInfo.likedByTime = nc5Var.m162484h();
                        continue;
                    case 26:
                        convAdditionalMatchInfo.source = nc5Var.m162495s();
                        continue;
                    case 34:
                        convAdditionalMatchInfo.state = nc5Var.m162495s();
                        continue;
                    case 42:
                        convAdditionalMatchInfo.otherState = nc5Var.m162495s();
                        continue;
                    case 49:
                        convAdditionalMatchInfo.matchTime = nc5Var.m162484h();
                        continue;
                    case 58:
                        convAdditionalMatchInfo.sourceUserID = nc5Var.m162495s();
                        continue;
                    case 65:
                        convAdditionalMatchInfo.verifyInviteTime = nc5Var.m162484h();
                        continue;
                    case 74:
                        convAdditionalMatchInfo.verifyInviteOwner = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        convAdditionalMatchInfo.sourceEn = nc5Var.m162495s();
                        continue;
                    default:
                        if (convAdditionalMatchInfo.source == null) {
                            convAdditionalMatchInfo.source = "";
                        }
                        if (convAdditionalMatchInfo.state == null) {
                            convAdditionalMatchInfo.state = "";
                        }
                        if (convAdditionalMatchInfo.otherState == null) {
                            convAdditionalMatchInfo.otherState = "";
                        }
                        if (convAdditionalMatchInfo.sourceUserID == null) {
                            convAdditionalMatchInfo.sourceUserID = "";
                        }
                        if (convAdditionalMatchInfo.verifyInviteOwner == null) {
                            convAdditionalMatchInfo.verifyInviteOwner = "";
                        }
                        if (convAdditionalMatchInfo.sourceEn == null) {
                            convAdditionalMatchInfo.sourceEn = "";
                            return convAdditionalMatchInfo;
                        }
                        break;
                }
            }
            return convAdditionalMatchInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConvAdditionalMatchInfo convAdditionalMatchInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17301C(1, convAdditionalMatchInfo.likeTime);
            codedOutputByteBufferNano.m17301C(2, convAdditionalMatchInfo.likedByTime);
            String str = convAdditionalMatchInfo.source;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            String str2 = convAdditionalMatchInfo.state;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            String str3 = convAdditionalMatchInfo.otherState;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            codedOutputByteBufferNano.m17301C(6, convAdditionalMatchInfo.matchTime);
            String str4 = convAdditionalMatchInfo.sourceUserID;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(7, str4);
            }
            codedOutputByteBufferNano.m17301C(8, convAdditionalMatchInfo.verifyInviteTime);
            String str5 = convAdditionalMatchInfo.verifyInviteOwner;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(9, str5);
            }
            String str6 = convAdditionalMatchInfo.sourceEn;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(10, str6);
            }
        }
    };
    public static JsonAdapter<ConvAdditionalMatchInfo> JSON_ADAPTER = new ObjectJsonAdapter<ConvAdditionalMatchInfo>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalMatchInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConvAdditionalMatchInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConvAdditionalMatchInfo newInstance() {
            return new ConvAdditionalMatchInfo();
        }

        public boolean parseField(ConvAdditionalMatchInfo convAdditionalMatchInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "verifyInviteOwner":
                    convAdditionalMatchInfo.verifyInviteOwner = jsonParser.getValueAsString();
                    return true;
                case "source":
                    convAdditionalMatchInfo.source = jsonParser.getValueAsString();
                    return true;
                case "otherState":
                    convAdditionalMatchInfo.otherState = jsonParser.getValueAsString();
                    return true;
                case "verifyInviteTime":
                    convAdditionalMatchInfo.verifyInviteTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "state":
                    convAdditionalMatchInfo.state = jsonParser.getValueAsString();
                    return true;
                case "likedByTime":
                    convAdditionalMatchInfo.likedByTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "matchTime":
                    convAdditionalMatchInfo.matchTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "likeTime":
                    convAdditionalMatchInfo.likeTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "sourceUserID":
                    convAdditionalMatchInfo.sourceUserID = jsonParser.getValueAsString();
                    return true;
                case "sourceEn":
                    convAdditionalMatchInfo.sourceEn = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConvAdditionalMatchInfo convAdditionalMatchInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "verifyInviteOwner":
                case "source":
                case "otherState":
                case "verifyInviteTime":
                case "state":
                case "likedByTime":
                case "matchTime":
                case "likeTime":
                case "sourceUserID":
                case "sourceEn":
                    return true;
                default:
                    return super.parseFieldCheck(convAdditionalMatchInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConvAdditionalMatchInfo convAdditionalMatchInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("likeTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(convAdditionalMatchInfo.likeTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("likedByTime");
            jsonAdapter.serialize(Double.valueOf(convAdditionalMatchInfo.likedByTime), jsonGenerator, true);
            String str = convAdditionalMatchInfo.source;
            if (str != null) {
                jsonGenerator.writeStringField("source", str);
            }
            String str2 = convAdditionalMatchInfo.state;
            if (str2 != null) {
                jsonGenerator.writeStringField("state", str2);
            }
            String str3 = convAdditionalMatchInfo.otherState;
            if (str3 != null) {
                jsonGenerator.writeStringField("otherState", str3);
            }
            jsonGenerator.writeFieldName("matchTime");
            jsonAdapter.serialize(Double.valueOf(convAdditionalMatchInfo.matchTime), jsonGenerator, true);
            String str4 = convAdditionalMatchInfo.sourceUserID;
            if (str4 != null) {
                jsonGenerator.writeStringField("sourceUserID", str4);
            }
            jsonGenerator.writeFieldName("verifyInviteTime");
            jsonAdapter.serialize(Double.valueOf(convAdditionalMatchInfo.verifyInviteTime), jsonGenerator, true);
            String str5 = convAdditionalMatchInfo.verifyInviteOwner;
            if (str5 != null) {
                jsonGenerator.writeStringField("verifyInviteOwner", str5);
            }
            String str6 = convAdditionalMatchInfo.sourceEn;
            if (str6 != null) {
                jsonGenerator.writeStringField("sourceEn", str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConvAdditionalMatchInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConvAdditionalMatchInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConvAdditionalMatchInfo new_() {
        ConvAdditionalMatchInfo convAdditionalMatchInfo = new ConvAdditionalMatchInfo();
        convAdditionalMatchInfo.nullCheck();
        return convAdditionalMatchInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConvAdditionalMatchInfo mo225055clone() {
        ConvAdditionalMatchInfo convAdditionalMatchInfo = new ConvAdditionalMatchInfo();
        convAdditionalMatchInfo.likeTime = this.likeTime;
        convAdditionalMatchInfo.likedByTime = this.likedByTime;
        convAdditionalMatchInfo.source = this.source;
        convAdditionalMatchInfo.state = this.state;
        convAdditionalMatchInfo.otherState = this.otherState;
        convAdditionalMatchInfo.matchTime = this.matchTime;
        convAdditionalMatchInfo.sourceUserID = this.sourceUserID;
        convAdditionalMatchInfo.verifyInviteTime = this.verifyInviteTime;
        convAdditionalMatchInfo.verifyInviteOwner = this.verifyInviteOwner;
        convAdditionalMatchInfo.sourceEn = this.sourceEn;
        return convAdditionalMatchInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConvAdditionalMatchInfo)) {
            return false;
        }
        ConvAdditionalMatchInfo convAdditionalMatchInfo = (ConvAdditionalMatchInfo) obj;
        return this.likeTime == convAdditionalMatchInfo.likeTime && this.likedByTime == convAdditionalMatchInfo.likedByTime && ValueObject.util_equals(this.source, convAdditionalMatchInfo.source) && ValueObject.util_equals(this.state, convAdditionalMatchInfo.state) && ValueObject.util_equals(this.otherState, convAdditionalMatchInfo.otherState) && this.matchTime == convAdditionalMatchInfo.matchTime && ValueObject.util_equals(this.sourceUserID, convAdditionalMatchInfo.sourceUserID) && this.verifyInviteTime == convAdditionalMatchInfo.verifyInviteTime && ValueObject.util_equals(this.verifyInviteOwner, convAdditionalMatchInfo.verifyInviteOwner) && ValueObject.util_equals(this.sourceEn, convAdditionalMatchInfo.sourceEn);
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.likeTime);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.likedByTime);
        int i3 = ((i2 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        String str = this.source;
        int iHashCode = (i3 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.state;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.otherState;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.matchTime);
        int i4 = (((iHashCode2 + iHashCode3) * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 41;
        String str4 = this.sourceUserID;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.verifyInviteTime);
        int i5 = (((i4 + iHashCode4) * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 41;
        String str5 = this.verifyInviteOwner;
        int iHashCode5 = (i5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.sourceEn;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.source == null) {
            this.source = "";
        }
        if (this.state == null) {
            this.state = "";
        }
        if (this.otherState == null) {
            this.otherState = "";
        }
        if (this.sourceUserID == null) {
            this.sourceUserID = "";
        }
        if (this.verifyInviteOwner == null) {
            this.verifyInviteOwner = "";
        }
        if (this.sourceEn == null) {
            this.sourceEn = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
