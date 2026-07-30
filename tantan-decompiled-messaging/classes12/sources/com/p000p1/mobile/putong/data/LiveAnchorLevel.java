package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveAnchorLevel liveAnchorLevel) {
            int iJ = CodedOutputByteBufferNano.j(1, liveAnchorLevel.grade) + CodedOutputByteBufferNano.d(2, liveAnchorLevel.wealthRatio) + CodedOutputByteBufferNano.j(3, liveAnchorLevel.gap);
            String str = liveAnchorLevel.iconUrl;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(4, str);
            }
            String str2 = liveAnchorLevel.backendUrl;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(5, str2);
            }
            int iJ2 = iJ + CodedOutputByteBufferNano.j(6, liveAnchorLevel.wealth);
            ((MessageNano) liveAnchorLevel).cachedSize = iJ2;
            return iJ2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveAnchorLevel m18322parse(nb5 nb5Var) throws IOException {
            LiveAnchorLevel liveAnchorLevel = new LiveAnchorLevel();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveAnchorLevel.iconUrl == null) {
                        liveAnchorLevel.iconUrl = "";
                    }
                    if (liveAnchorLevel.backendUrl != null) {
                        break;
                    }
                    liveAnchorLevel.backendUrl = "";
                    break;
                }
                if (iU == 8) {
                    liveAnchorLevel.grade = nb5Var.k();
                } else if (iU == 17) {
                    liveAnchorLevel.wealthRatio = nb5Var.h();
                } else if (iU == 24) {
                    liveAnchorLevel.gap = nb5Var.k();
                } else if (iU == 34) {
                    liveAnchorLevel.iconUrl = nb5Var.s();
                } else if (iU == 42) {
                    liveAnchorLevel.backendUrl = nb5Var.s();
                } else {
                    if (iU != 48) {
                        if (liveAnchorLevel.iconUrl == null) {
                            liveAnchorLevel.iconUrl = "";
                        }
                        if (liveAnchorLevel.backendUrl != null) {
                            break;
                        }
                        liveAnchorLevel.backendUrl = "";
                        return liveAnchorLevel;
                    }
                    liveAnchorLevel.wealth = nb5Var.k();
                }
            }
            return liveAnchorLevel;
        }

        public void serialize(LiveAnchorLevel liveAnchorLevel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, liveAnchorLevel.grade);
            codedOutputByteBufferNano.C(2, liveAnchorLevel.wealthRatio);
            codedOutputByteBufferNano.I(3, liveAnchorLevel.gap);
            String str = liveAnchorLevel.iconUrl;
            if (str != null) {
                codedOutputByteBufferNano.R(4, str);
            }
            String str2 = liveAnchorLevel.backendUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            codedOutputByteBufferNano.I(6, liveAnchorLevel.wealth);
        }
    };
    public static JsonAdapter<LiveAnchorLevel> JSON_ADAPTER = new ObjectJsonAdapter<LiveAnchorLevel>() { // from class: com.p1.mobile.putong.data.LiveAnchorLevel.2
        public Class getDataClass() {
            return LiveAnchorLevel.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveAnchorLevel mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveAnchorLevel liveAnchorLevel, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("grade", liveAnchorLevel.grade);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveAnchorLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveAnchorLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveAnchorLevel new_() {
        LiveAnchorLevel liveAnchorLevel = new LiveAnchorLevel();
        liveAnchorLevel.nullCheck();
        return liveAnchorLevel;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveAnchorLevel m18321clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = i5;
        return i5;
    }

    public void nullCheck() {
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.backendUrl == null) {
            this.backendUrl = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
