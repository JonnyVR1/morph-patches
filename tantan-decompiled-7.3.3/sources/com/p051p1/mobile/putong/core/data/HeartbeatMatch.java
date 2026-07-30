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
import org.aspectj.lang.JoinPoint;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class HeartbeatMatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "heartbeatmatch";

    @ProtobufIndex(index = 3)
    public double acceptTime;

    @ProtobufIndex(index = 1)
    public double expireTime;

    @NonNull
    @ProtobufIndex(index = 10)
    public String greetEmoji;

    @NonNull
    @ProtobufIndex(index = 9)
    public String greetText;

    @ProtobufIndex(index = 7)
    public boolean guideFakeToGood;

    @ProtobufIndex(index = 2)
    public boolean isPassive;

    @ProtobufIndex(index = 5)
    public boolean lock;

    @ProtobufIndex(index = 8)
    public int matchType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String source;

    @NonNull
    @ProtobufIndex(index = 6)
    public String tracker;
    public static ProtobufAdapter<HeartbeatMatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<HeartbeatMatch>() { // from class: com.p1.mobile.putong.core.data.HeartbeatMatch.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HeartbeatMatch heartbeatMatch) {
            int iM17277d = CodedOutputByteBufferNano.m17277d(1, heartbeatMatch.expireTime) + CodedOutputByteBufferNano.m17275b(2, heartbeatMatch.isPassive) + CodedOutputByteBufferNano.m17277d(3, heartbeatMatch.acceptTime);
            String str = heartbeatMatch.source;
            if (str != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(4, str);
            }
            int iM17275b = iM17277d + CodedOutputByteBufferNano.m17275b(5, heartbeatMatch.lock);
            String str2 = heartbeatMatch.tracker;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(6, str2);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(7, heartbeatMatch.guideFakeToGood) + CodedOutputByteBufferNano.m17281h(8, heartbeatMatch.matchType);
            String str3 = heartbeatMatch.greetText;
            if (str3 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17288o(9, str3);
            }
            String str4 = heartbeatMatch.greetEmoji;
            if (str4 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17288o(10, str4);
            }
            heartbeatMatch.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HeartbeatMatch parse(nc5 nc5Var) throws IOException {
            HeartbeatMatch heartbeatMatch = new HeartbeatMatch();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (heartbeatMatch.source == null) {
                            heartbeatMatch.source = "";
                        }
                        if (heartbeatMatch.tracker == null) {
                            heartbeatMatch.tracker = "";
                        }
                        if (heartbeatMatch.greetText == null) {
                            heartbeatMatch.greetText = "";
                        }
                        if (heartbeatMatch.greetEmoji == null) {
                            heartbeatMatch.greetEmoji = "";
                        }
                        break;
                    case 9:
                        heartbeatMatch.expireTime = nc5Var.m162484h();
                        continue;
                    case 16:
                        heartbeatMatch.isPassive = nc5Var.m162483g();
                        continue;
                    case 25:
                        heartbeatMatch.acceptTime = nc5Var.m162484h();
                        continue;
                    case 34:
                        heartbeatMatch.source = nc5Var.m162495s();
                        continue;
                    case 40:
                        heartbeatMatch.lock = nc5Var.m162483g();
                        continue;
                    case 50:
                        heartbeatMatch.tracker = nc5Var.m162495s();
                        continue;
                    case 56:
                        heartbeatMatch.guideFakeToGood = nc5Var.m162483g();
                        continue;
                    case 64:
                        heartbeatMatch.matchType = nc5Var.m162486j();
                        continue;
                    case 74:
                        heartbeatMatch.greetText = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        heartbeatMatch.greetEmoji = nc5Var.m162495s();
                        continue;
                    default:
                        if (heartbeatMatch.source == null) {
                            heartbeatMatch.source = "";
                        }
                        if (heartbeatMatch.tracker == null) {
                            heartbeatMatch.tracker = "";
                        }
                        if (heartbeatMatch.greetText == null) {
                            heartbeatMatch.greetText = "";
                        }
                        if (heartbeatMatch.greetEmoji == null) {
                            heartbeatMatch.greetEmoji = "";
                            return heartbeatMatch;
                        }
                        break;
                }
            }
            return heartbeatMatch;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HeartbeatMatch heartbeatMatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17301C(1, heartbeatMatch.expireTime);
            codedOutputByteBufferNano.m17299A(2, heartbeatMatch.isPassive);
            codedOutputByteBufferNano.m17301C(3, heartbeatMatch.acceptTime);
            String str = heartbeatMatch.source;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(4, str);
            }
            codedOutputByteBufferNano.m17299A(5, heartbeatMatch.lock);
            String str2 = heartbeatMatch.tracker;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(6, str2);
            }
            codedOutputByteBufferNano.m17299A(7, heartbeatMatch.guideFakeToGood);
            codedOutputByteBufferNano.m17305G(8, heartbeatMatch.matchType);
            String str3 = heartbeatMatch.greetText;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(9, str3);
            }
            String str4 = heartbeatMatch.greetEmoji;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(10, str4);
            }
        }
    };
    public static JsonAdapter<HeartbeatMatch> JSON_ADAPTER = new ObjectJsonAdapter<HeartbeatMatch>() { // from class: com.p1.mobile.putong.core.data.HeartbeatMatch.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HeartbeatMatch.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HeartbeatMatch newInstance() {
            return new HeartbeatMatch();
        }

        public boolean parseField(HeartbeatMatch heartbeatMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isPassive":
                    heartbeatMatch.isPassive = jsonParser.getValueAsBoolean();
                    return true;
                case "acceptTime":
                    heartbeatMatch.acceptTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "tracker":
                    heartbeatMatch.tracker = jsonParser.getValueAsString();
                    return true;
                case "source":
                    heartbeatMatch.source = jsonParser.getValueAsString();
                    return true;
                case "expireTime":
                    heartbeatMatch.expireTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "guideFakeToGood":
                    heartbeatMatch.guideFakeToGood = jsonParser.getValueAsBoolean();
                    return true;
                case "greetEmoji":
                    heartbeatMatch.greetEmoji = jsonParser.getValueAsString();
                    return true;
                case "lock":
                    heartbeatMatch.lock = jsonParser.getValueAsBoolean();
                    return true;
                case "matchType":
                    heartbeatMatch.matchType = jsonParser.getValueAsInt();
                    return true;
                case "greetText":
                    heartbeatMatch.greetText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HeartbeatMatch heartbeatMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isPassive":
                case "acceptTime":
                case "tracker":
                case "source":
                case "expireTime":
                case "guideFakeToGood":
                case "greetEmoji":
                case "lock":
                case "matchType":
                case "greetText":
                    return true;
                default:
                    return super.parseFieldCheck(heartbeatMatch, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HeartbeatMatch heartbeatMatch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("expireTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(heartbeatMatch.expireTime), jsonGenerator, true);
            jsonGenerator.writeBooleanField("isPassive", heartbeatMatch.isPassive);
            jsonGenerator.writeFieldName("acceptTime");
            jsonAdapter.serialize(Double.valueOf(heartbeatMatch.acceptTime), jsonGenerator, true);
            String str = heartbeatMatch.source;
            if (str != null) {
                jsonGenerator.writeStringField("source", str);
            }
            jsonGenerator.writeBooleanField(JoinPoint.SYNCHRONIZATION_LOCK, heartbeatMatch.lock);
            String str2 = heartbeatMatch.tracker;
            if (str2 != null) {
                jsonGenerator.writeStringField("tracker", str2);
            }
            jsonGenerator.writeBooleanField("guideFakeToGood", heartbeatMatch.guideFakeToGood);
            jsonGenerator.writeNumberField("matchType", heartbeatMatch.matchType);
            String str3 = heartbeatMatch.greetText;
            if (str3 != null) {
                jsonGenerator.writeStringField("greetText", str3);
            }
            String str4 = heartbeatMatch.greetEmoji;
            if (str4 != null) {
                jsonGenerator.writeStringField("greetEmoji", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HeartbeatMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HeartbeatMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HeartbeatMatch new_() {
        HeartbeatMatch heartbeatMatch = new HeartbeatMatch();
        heartbeatMatch.nullCheck();
        return heartbeatMatch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HeartbeatMatch mo225055clone() {
        HeartbeatMatch heartbeatMatch = new HeartbeatMatch();
        heartbeatMatch.expireTime = this.expireTime;
        heartbeatMatch.isPassive = this.isPassive;
        heartbeatMatch.acceptTime = this.acceptTime;
        heartbeatMatch.source = this.source;
        heartbeatMatch.lock = this.lock;
        heartbeatMatch.tracker = this.tracker;
        heartbeatMatch.guideFakeToGood = this.guideFakeToGood;
        heartbeatMatch.matchType = this.matchType;
        heartbeatMatch.greetText = this.greetText;
        heartbeatMatch.greetEmoji = this.greetEmoji;
        return heartbeatMatch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartbeatMatch)) {
            return false;
        }
        HeartbeatMatch heartbeatMatch = (HeartbeatMatch) obj;
        return this.expireTime == heartbeatMatch.expireTime && this.isPassive == heartbeatMatch.isPassive && this.acceptTime == heartbeatMatch.acceptTime && ValueObject.util_equals(this.source, heartbeatMatch.source) && this.lock == heartbeatMatch.lock && ValueObject.util_equals(this.tracker, heartbeatMatch.tracker) && this.guideFakeToGood == heartbeatMatch.guideFakeToGood && this.matchType == heartbeatMatch.matchType && ValueObject.util_equals(this.greetText, heartbeatMatch.greetText) && ValueObject.util_equals(this.greetEmoji, heartbeatMatch.greetEmoji);
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.expireTime);
        int i2 = ((i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        int i3 = this.isPassive ? 1231 : 1237;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.acceptTime);
        int i4 = (((i2 + i3) * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        String str = this.source;
        int iHashCode = (((i4 + (str != null ? str.hashCode() : 0)) * 41) + (this.lock ? 1231 : 1237)) * 41;
        String str2 = this.tracker;
        int iHashCode2 = (((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.guideFakeToGood ? 1231 : 1237)) * 41) + this.matchType) * 41;
        String str3 = this.greetText;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.greetEmoji;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.source == null) {
            this.source = "";
        }
        if (this.tracker == null) {
            this.tracker = "";
        }
        if (this.greetText == null) {
            this.greetText = "";
        }
        if (this.greetEmoji == null) {
            this.greetEmoji = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
