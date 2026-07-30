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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class LiveAnchorLevel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveanchorlevel";

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
    public long wealth;

    @ProtobufIndex(index = 2)
    public double wealthRatio;
    public static ProtobufAdapter<LiveAnchorLevel> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveAnchorLevel>() { // from class: com.p1.mobile.putong.data.LiveAnchorLevel.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveAnchorLevel liveAnchorLevel) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, liveAnchorLevel.grade) + CodedOutputByteBufferNano.m17277d(2, liveAnchorLevel.wealthRatio) + CodedOutputByteBufferNano.m17283j(3, liveAnchorLevel.gap);
            String str = liveAnchorLevel.iconUrl;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(4, str);
            }
            String str2 = liveAnchorLevel.backendUrl;
            if (str2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            int iM17283j2 = iM17283j + CodedOutputByteBufferNano.m17283j(6, liveAnchorLevel.wealth);
            liveAnchorLevel.cachedSize = iM17283j2;
            return iM17283j2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveAnchorLevel parse(nc5 nc5Var) throws IOException {
            LiveAnchorLevel liveAnchorLevel = new LiveAnchorLevel();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (liveAnchorLevel.iconUrl == null) {
                        liveAnchorLevel.iconUrl = "";
                    }
                    if (liveAnchorLevel.backendUrl != null) {
                        break;
                    }
                    liveAnchorLevel.backendUrl = "";
                    break;
                }
                if (iM162497u == 8) {
                    liveAnchorLevel.grade = nc5Var.m162487k();
                } else if (iM162497u == 17) {
                    liveAnchorLevel.wealthRatio = nc5Var.m162484h();
                } else if (iM162497u == 24) {
                    liveAnchorLevel.gap = nc5Var.m162487k();
                } else if (iM162497u == 34) {
                    liveAnchorLevel.iconUrl = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    liveAnchorLevel.backendUrl = nc5Var.m162495s();
                } else {
                    if (iM162497u != 48) {
                        if (liveAnchorLevel.iconUrl == null) {
                            liveAnchorLevel.iconUrl = "";
                        }
                        if (liveAnchorLevel.backendUrl != null) {
                            break;
                        }
                        liveAnchorLevel.backendUrl = "";
                        return liveAnchorLevel;
                    }
                    liveAnchorLevel.wealth = nc5Var.m162487k();
                }
            }
            return liveAnchorLevel;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveAnchorLevel liveAnchorLevel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, liveAnchorLevel.grade);
            codedOutputByteBufferNano.m17301C(2, liveAnchorLevel.wealthRatio);
            codedOutputByteBufferNano.m17307I(3, liveAnchorLevel.gap);
            String str = liveAnchorLevel.iconUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(4, str);
            }
            String str2 = liveAnchorLevel.backendUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
            codedOutputByteBufferNano.m17307I(6, liveAnchorLevel.wealth);
        }
    };
    public static JsonAdapter<LiveAnchorLevel> JSON_ADAPTER = new ObjectJsonAdapter<LiveAnchorLevel>() { // from class: com.p1.mobile.putong.data.LiveAnchorLevel.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveAnchorLevel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveAnchorLevel newInstance() {
            return new LiveAnchorLevel();
        }

        public boolean parseField(LiveAnchorLevel liveAnchorLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "backendUrl":
                    liveAnchorLevel.backendUrl = jsonParser.getValueAsString();
                    return true;
                case "wealth":
                    liveAnchorLevel.wealth = jsonParser.getValueAsLong();
                    return true;
                case "gap":
                    liveAnchorLevel.gap = jsonParser.getValueAsLong();
                    return true;
                case "grade":
                    liveAnchorLevel.grade = jsonParser.getValueAsLong();
                    return true;
                case "wealthRatio":
                    liveAnchorLevel.wealthRatio = jsonParser.getValueAsDouble();
                    return true;
                case "iconUrl":
                    liveAnchorLevel.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveAnchorLevel liveAnchorLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "backendUrl":
                case "wealth":
                case "gap":
                case "grade":
                case "wealthRatio":
                case "iconUrl":
                    return true;
                default:
                    return super.parseFieldCheck(liveAnchorLevel, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveAnchorLevel liveAnchorLevel, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(Grade.TYPE, liveAnchorLevel.grade);
            jsonGenerator.writeNumberField("wealthRatio", liveAnchorLevel.wealthRatio);
            jsonGenerator.writeNumberField("gap", liveAnchorLevel.gap);
            String str = liveAnchorLevel.iconUrl;
            if (str != null) {
                jsonGenerator.writeStringField("iconUrl", str);
            }
            String str2 = liveAnchorLevel.backendUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("backendUrl", str2);
            }
            jsonGenerator.writeNumberField("wealth", liveAnchorLevel.wealth);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveAnchorLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveAnchorLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveAnchorLevel new_() {
        LiveAnchorLevel liveAnchorLevel = new LiveAnchorLevel();
        liveAnchorLevel.nullCheck();
        return liveAnchorLevel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveAnchorLevel mo225055clone() {
        LiveAnchorLevel liveAnchorLevel = new LiveAnchorLevel();
        liveAnchorLevel.grade = this.grade;
        liveAnchorLevel.wealthRatio = this.wealthRatio;
        liveAnchorLevel.gap = this.gap;
        liveAnchorLevel.iconUrl = this.iconUrl;
        liveAnchorLevel.backendUrl = this.backendUrl;
        liveAnchorLevel.wealth = this.wealth;
        return liveAnchorLevel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveAnchorLevel)) {
            return false;
        }
        LiveAnchorLevel liveAnchorLevel = (LiveAnchorLevel) obj;
        return this.grade == liveAnchorLevel.grade && this.wealthRatio == liveAnchorLevel.wealthRatio && this.gap == liveAnchorLevel.gap && ValueObject.util_equals(this.iconUrl, liveAnchorLevel.iconUrl) && ValueObject.util_equals(this.backendUrl, liveAnchorLevel.backendUrl) && this.wealth == liveAnchorLevel.wealth;
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
        long j3 = this.wealth;
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
