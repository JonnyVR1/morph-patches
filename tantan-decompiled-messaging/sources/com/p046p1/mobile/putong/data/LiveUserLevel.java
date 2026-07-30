package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Grade;
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

/* JADX INFO: loaded from: classes12.dex */
public class LiveUserLevel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveuserlevel";

    @NonNull
    @ProtobufIndex(index = 5)
    public String backendUrl;

    @ProtobufIndex(index = 3)
    public long gap;

    @ProtobufIndex(index = 1)
    public long grade;

    @NonNull
    @ProtobufIndex(index = 4)
    public String iconUrl;

    @ProtobufIndex(index = 6)
    public long superGrade;

    @ProtobufIndex(index = 2)
    public double wealthRatio;
    public static ProtobufAdapter<LiveUserLevel> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveUserLevel>() { // from class: com.p1.mobile.putong.data.LiveUserLevel.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveUserLevel liveUserLevel) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, liveUserLevel.grade) + CodedOutputByteBufferNano.m17222d(2, liveUserLevel.wealthRatio) + CodedOutputByteBufferNano.m17228j(3, liveUserLevel.gap);
            String str = liveUserLevel.iconUrl;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(4, str);
            }
            String str2 = liveUserLevel.backendUrl;
            if (str2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(5, str2);
            }
            int iM17228j2 = iM17228j + CodedOutputByteBufferNano.m17228j(6, liveUserLevel.superGrade);
            liveUserLevel.cachedSize = iM17228j2;
            return iM17228j2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveUserLevel parse(nb5 nb5Var) throws IOException {
            LiveUserLevel liveUserLevel = new LiveUserLevel();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveUserLevel.iconUrl == null) {
                        liveUserLevel.iconUrl = "";
                    }
                    if (liveUserLevel.backendUrl != null) {
                        break;
                    }
                    liveUserLevel.backendUrl = "";
                    break;
                }
                if (iM158752u == 8) {
                    liveUserLevel.grade = nb5Var.m158742k();
                } else if (iM158752u == 17) {
                    liveUserLevel.wealthRatio = nb5Var.m158739h();
                } else if (iM158752u == 24) {
                    liveUserLevel.gap = nb5Var.m158742k();
                } else if (iM158752u == 34) {
                    liveUserLevel.iconUrl = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    liveUserLevel.backendUrl = nb5Var.m158750s();
                } else {
                    if (iM158752u != 48) {
                        if (liveUserLevel.iconUrl == null) {
                            liveUserLevel.iconUrl = "";
                        }
                        if (liveUserLevel.backendUrl != null) {
                            break;
                        }
                        liveUserLevel.backendUrl = "";
                        return liveUserLevel;
                    }
                    liveUserLevel.superGrade = nb5Var.m158742k();
                }
            }
            return liveUserLevel;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveUserLevel liveUserLevel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, liveUserLevel.grade);
            codedOutputByteBufferNano.m17246C(2, liveUserLevel.wealthRatio);
            codedOutputByteBufferNano.m17252I(3, liveUserLevel.gap);
            String str = liveUserLevel.iconUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(4, str);
            }
            String str2 = liveUserLevel.backendUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(5, str2);
            }
            codedOutputByteBufferNano.m17252I(6, liveUserLevel.superGrade);
        }
    };
    public static JsonAdapter<LiveUserLevel> JSON_ADAPTER = new ObjectJsonAdapter<LiveUserLevel>() { // from class: com.p1.mobile.putong.data.LiveUserLevel.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveUserLevel.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveUserLevel newInstance() {
            return new LiveUserLevel();
        }

        public boolean parseField(LiveUserLevel liveUserLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "superGrade":
                    liveUserLevel.superGrade = jsonParser.getValueAsLong();
                    return true;
                case "backendUrl":
                    liveUserLevel.backendUrl = jsonParser.getValueAsString();
                    return true;
                case "gap":
                    liveUserLevel.gap = jsonParser.getValueAsLong();
                    return true;
                case "grade":
                    liveUserLevel.grade = jsonParser.getValueAsLong();
                    return true;
                case "wealthRatio":
                    liveUserLevel.wealthRatio = jsonParser.getValueAsDouble();
                    return true;
                case "iconUrl":
                    liveUserLevel.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveUserLevel liveUserLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "superGrade":
                case "backendUrl":
                case "gap":
                case "grade":
                case "wealthRatio":
                case "iconUrl":
                    return true;
                default:
                    return super.parseFieldCheck(liveUserLevel, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveUserLevel liveUserLevel, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(Grade.TYPE, liveUserLevel.grade);
            jsonGenerator.writeNumberField("wealthRatio", liveUserLevel.wealthRatio);
            jsonGenerator.writeNumberField("gap", liveUserLevel.gap);
            String str = liveUserLevel.iconUrl;
            if (str != null) {
                jsonGenerator.writeStringField("iconUrl", str);
            }
            String str2 = liveUserLevel.backendUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("backendUrl", str2);
            }
            jsonGenerator.writeNumberField("superGrade", liveUserLevel.superGrade);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveUserLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveUserLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveUserLevel new_() {
        LiveUserLevel liveUserLevel = new LiveUserLevel();
        liveUserLevel.nullCheck();
        return liveUserLevel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveUserLevel mo223809clone() {
        LiveUserLevel liveUserLevel = new LiveUserLevel();
        liveUserLevel.grade = this.grade;
        liveUserLevel.wealthRatio = this.wealthRatio;
        liveUserLevel.gap = this.gap;
        liveUserLevel.iconUrl = this.iconUrl;
        liveUserLevel.backendUrl = this.backendUrl;
        liveUserLevel.superGrade = this.superGrade;
        return liveUserLevel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveUserLevel)) {
            return false;
        }
        LiveUserLevel liveUserLevel = (LiveUserLevel) obj;
        return this.grade == liveUserLevel.grade && this.wealthRatio == liveUserLevel.wealthRatio && this.gap == liveUserLevel.gap && ValueObject.util_equals(this.iconUrl, liveUserLevel.iconUrl) && ValueObject.util_equals(this.backendUrl, liveUserLevel.backendUrl) && this.superGrade == liveUserLevel.superGrade;
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
        long j = this.grade;
        int i2 = (i * 41) + ((int) (j ^ (j >>> 32)));
        long jDoubleToLongBits = Double.doubleToLongBits(this.wealthRatio);
        int i3 = ((i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        long j2 = this.gap;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str = this.iconUrl;
        int iHashCode = (i4 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.backendUrl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j3 = this.superGrade;
        int i5 = ((iHashCode + iHashCode2) * 41) + ((int) (j3 ^ (j3 >>> 32)));
        this.hashCode = i5;
        return i5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.backendUrl == null) {
            this.backendUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
