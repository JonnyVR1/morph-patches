package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
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
public class LoveLetterEntryInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "loveletterentryinfo";

    @ProtobufIndex(index = 2)
    public int count;

    @ProtobufIndex(index = 1)
    public boolean display;

    @ProtobufIndex(index = 4)
    public double endTime;

    @Nullable
    @ProtobufIndex(index = 5)
    public LoveLetterMessageInfo message;

    @ProtobufIndex(index = 6)
    public int msgLimit;

    @NonNull
    @ProtobufIndex(index = 7)
    public String shadingWord;

    @ProtobufIndex(index = 3)
    public double startTime;
    public static ProtobufAdapter<LoveLetterEntryInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveLetterEntryInfo>() { // from class: com.p1.mobile.putong.core.data.LoveLetterEntryInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LoveLetterEntryInfo loveLetterEntryInfo) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, loveLetterEntryInfo.display) + CodedOutputByteBufferNano.m17226h(2, loveLetterEntryInfo.count) + CodedOutputByteBufferNano.m17222d(3, loveLetterEntryInfo.startTime) + CodedOutputByteBufferNano.m17222d(4, loveLetterEntryInfo.endTime);
            LoveLetterMessageInfo loveLetterMessageInfo = loveLetterEntryInfo.message;
            if (loveLetterMessageInfo != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(5, loveLetterMessageInfo, LoveLetterMessageInfo.PROTOBUF_ADAPTER);
            }
            int iM17226h = iM17220b + CodedOutputByteBufferNano.m17226h(6, loveLetterEntryInfo.msgLimit);
            String str = loveLetterEntryInfo.shadingWord;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(7, str);
            }
            loveLetterEntryInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LoveLetterEntryInfo parse(nb5 nb5Var) throws IOException {
            LoveLetterEntryInfo loveLetterEntryInfo = new LoveLetterEntryInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (loveLetterEntryInfo.shadingWord != null) {
                        break;
                    }
                    loveLetterEntryInfo.shadingWord = "";
                    break;
                }
                if (iM158752u == 8) {
                    loveLetterEntryInfo.display = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    loveLetterEntryInfo.count = nb5Var.m158741j();
                } else if (iM158752u == 25) {
                    loveLetterEntryInfo.startTime = nb5Var.m158739h();
                } else if (iM158752u == 33) {
                    loveLetterEntryInfo.endTime = nb5Var.m158739h();
                } else if (iM158752u == 42) {
                    loveLetterEntryInfo.message = (LoveLetterMessageInfo) nb5Var.m158743l(LoveLetterMessageInfo.PROTOBUF_ADAPTER);
                } else if (iM158752u == 48) {
                    loveLetterEntryInfo.msgLimit = nb5Var.m158741j();
                } else {
                    if (iM158752u != 58) {
                        if (loveLetterEntryInfo.shadingWord != null) {
                            break;
                        }
                        loveLetterEntryInfo.shadingWord = "";
                        return loveLetterEntryInfo;
                    }
                    loveLetterEntryInfo.shadingWord = nb5Var.m158750s();
                }
            }
            return loveLetterEntryInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LoveLetterEntryInfo loveLetterEntryInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, loveLetterEntryInfo.display);
            codedOutputByteBufferNano.m17250G(2, loveLetterEntryInfo.count);
            codedOutputByteBufferNano.m17246C(3, loveLetterEntryInfo.startTime);
            codedOutputByteBufferNano.m17246C(4, loveLetterEntryInfo.endTime);
            LoveLetterMessageInfo loveLetterMessageInfo = loveLetterEntryInfo.message;
            if (loveLetterMessageInfo != null) {
                codedOutputByteBufferNano.m17254K(5, loveLetterMessageInfo, LoveLetterMessageInfo.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(6, loveLetterEntryInfo.msgLimit);
            String str = loveLetterEntryInfo.shadingWord;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(7, str);
            }
        }
    };
    public static JsonAdapter<LoveLetterEntryInfo> JSON_ADAPTER = new ObjectJsonAdapter<LoveLetterEntryInfo>() { // from class: com.p1.mobile.putong.core.data.LoveLetterEntryInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LoveLetterEntryInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LoveLetterEntryInfo newInstance() {
            return new LoveLetterEntryInfo();
        }

        public boolean parseField(LoveLetterEntryInfo loveLetterEntryInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    loveLetterEntryInfo.startTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "endTime":
                    loveLetterEntryInfo.endTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "msgLimit":
                    loveLetterEntryInfo.msgLimit = jsonParser.getValueAsInt();
                    return true;
                case "count":
                    loveLetterEntryInfo.count = jsonParser.getValueAsInt();
                    return true;
                case "message":
                    loveLetterEntryInfo.message = LoveLetterMessageInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "shadingWord":
                    loveLetterEntryInfo.shadingWord = jsonParser.getValueAsString();
                    return true;
                case "display":
                    loveLetterEntryInfo.display = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LoveLetterEntryInfo loveLetterEntryInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "endTime":
                case "msgLimit":
                case "count":
                case "message":
                case "shadingWord":
                case "display":
                    return true;
                default:
                    return super.parseFieldCheck(loveLetterEntryInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LoveLetterEntryInfo loveLetterEntryInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, loveLetterEntryInfo.display);
            jsonGenerator.writeNumberField("count", loveLetterEntryInfo.count);
            jsonGenerator.writeFieldName(StudentVerRejectedReason.startTime);
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(loveLetterEntryInfo.startTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(loveLetterEntryInfo.endTime), jsonGenerator, true);
            if (loveLetterEntryInfo.message != null) {
                jsonGenerator.writeFieldName("message");
                LoveLetterMessageInfo.JSON_ADAPTER.serialize(loveLetterEntryInfo.message, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("msgLimit", loveLetterEntryInfo.msgLimit);
            String str = loveLetterEntryInfo.shadingWord;
            if (str != null) {
                jsonGenerator.writeStringField("shadingWord", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveLetterEntryInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveLetterEntryInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LoveLetterEntryInfo new_() {
        LoveLetterEntryInfo loveLetterEntryInfo = new LoveLetterEntryInfo();
        loveLetterEntryInfo.nullCheck();
        return loveLetterEntryInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LoveLetterEntryInfo mo223809clone() {
        LoveLetterEntryInfo loveLetterEntryInfo = new LoveLetterEntryInfo();
        loveLetterEntryInfo.display = this.display;
        loveLetterEntryInfo.count = this.count;
        loveLetterEntryInfo.startTime = this.startTime;
        loveLetterEntryInfo.endTime = this.endTime;
        LoveLetterMessageInfo loveLetterMessageInfo = this.message;
        if (loveLetterMessageInfo != null) {
            loveLetterEntryInfo.message = loveLetterMessageInfo.mo223809clone();
        }
        loveLetterEntryInfo.msgLimit = this.msgLimit;
        loveLetterEntryInfo.shadingWord = this.shadingWord;
        return loveLetterEntryInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoveLetterEntryInfo)) {
            return false;
        }
        LoveLetterEntryInfo loveLetterEntryInfo = (LoveLetterEntryInfo) obj;
        return this.display == loveLetterEntryInfo.display && this.count == loveLetterEntryInfo.count && this.startTime == loveLetterEntryInfo.startTime && this.endTime == loveLetterEntryInfo.endTime && ValueObject.util_equals(this.message, loveLetterEntryInfo.message) && this.msgLimit == loveLetterEntryInfo.msgLimit && ValueObject.util_equals(this.shadingWord, loveLetterEntryInfo.shadingWord);
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
        int i2 = (((i * 41) + (this.display ? 1231 : 1237)) * 41) + this.count;
        long jDoubleToLongBits = Double.doubleToLongBits(this.startTime);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.endTime);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        LoveLetterMessageInfo loveLetterMessageInfo = this.message;
        int iHashCode = (((i4 + (loveLetterMessageInfo != null ? loveLetterMessageInfo.hashCode() : 0)) * 41) + this.msgLimit) * 41;
        String str = this.shadingWord;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.shadingWord == null) {
            this.shadingWord = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
