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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class GreetSendGiftConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetsendgiftconfig";

    @NonNull
    @ProtobufIndex(index = 10)
    public String femaleRefusedGiftTips;

    @NonNull
    @ProtobufIndex(index = 9)
    public String femaleSendTips;

    @NonNull
    @ProtobufIndex(index = 6)
    public String femaleSendTipsByMoment;

    @NonNull
    @ProtobufIndex(index = 4)
    public String femaleSubTitle;

    @NonNull
    @ProtobufIndex(index = 2)
    public String femaleTitle;

    @NonNull
    @ProtobufIndex(index = 8)
    public String maleRefusedGiftTips;

    @NonNull
    @ProtobufIndex(index = 7)
    public String maleSendTips;

    @NonNull
    @ProtobufIndex(index = 5)
    public String maleSendTipsByMoment;

    @NonNull
    @ProtobufIndex(index = 3)
    public String maleSubTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String maleTitle;
    public static ProtobufAdapter<GreetSendGiftConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetSendGiftConfig>() { // from class: com.p1.mobile.putong.core.data.GreetSendGiftConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GreetSendGiftConfig greetSendGiftConfig) {
            String str = greetSendGiftConfig.maleTitle;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = greetSendGiftConfig.femaleTitle;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = greetSendGiftConfig.maleSubTitle;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = greetSendGiftConfig.femaleSubTitle;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = greetSendGiftConfig.maleSendTipsByMoment;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = greetSendGiftConfig.femaleSendTipsByMoment;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            String str7 = greetSendGiftConfig.maleSendTips;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str7);
            }
            String str8 = greetSendGiftConfig.maleRefusedGiftTips;
            if (str8 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str8);
            }
            String str9 = greetSendGiftConfig.femaleSendTips;
            if (str9 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(9, str9);
            }
            String str10 = greetSendGiftConfig.femaleRefusedGiftTips;
            if (str10 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(10, str10);
            }
            greetSendGiftConfig.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GreetSendGiftConfig parse(nc5 nc5Var) throws IOException {
            GreetSendGiftConfig greetSendGiftConfig = new GreetSendGiftConfig();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (greetSendGiftConfig.maleTitle == null) {
                            greetSendGiftConfig.maleTitle = "";
                        }
                        if (greetSendGiftConfig.femaleTitle == null) {
                            greetSendGiftConfig.femaleTitle = "";
                        }
                        if (greetSendGiftConfig.maleSubTitle == null) {
                            greetSendGiftConfig.maleSubTitle = "";
                        }
                        if (greetSendGiftConfig.femaleSubTitle == null) {
                            greetSendGiftConfig.femaleSubTitle = "";
                        }
                        if (greetSendGiftConfig.maleSendTipsByMoment == null) {
                            greetSendGiftConfig.maleSendTipsByMoment = "";
                        }
                        if (greetSendGiftConfig.femaleSendTipsByMoment == null) {
                            greetSendGiftConfig.femaleSendTipsByMoment = "";
                        }
                        if (greetSendGiftConfig.maleSendTips == null) {
                            greetSendGiftConfig.maleSendTips = "";
                        }
                        if (greetSendGiftConfig.femaleSendTips == null) {
                            greetSendGiftConfig.femaleSendTips = "";
                        }
                        if (greetSendGiftConfig.maleRefusedGiftTips == null) {
                            greetSendGiftConfig.maleRefusedGiftTips = "";
                        }
                        if (greetSendGiftConfig.femaleRefusedGiftTips == null) {
                            greetSendGiftConfig.femaleRefusedGiftTips = "";
                        }
                        break;
                    case 10:
                        greetSendGiftConfig.maleTitle = nc5Var.m162495s();
                        continue;
                    case 18:
                        greetSendGiftConfig.femaleTitle = nc5Var.m162495s();
                        continue;
                    case 26:
                        greetSendGiftConfig.maleSubTitle = nc5Var.m162495s();
                        continue;
                    case 34:
                        greetSendGiftConfig.femaleSubTitle = nc5Var.m162495s();
                        continue;
                    case 42:
                        greetSendGiftConfig.maleSendTipsByMoment = nc5Var.m162495s();
                        continue;
                    case 50:
                        greetSendGiftConfig.femaleSendTipsByMoment = nc5Var.m162495s();
                        continue;
                    case 58:
                        greetSendGiftConfig.maleSendTips = nc5Var.m162495s();
                        continue;
                    case 66:
                        greetSendGiftConfig.maleRefusedGiftTips = nc5Var.m162495s();
                        continue;
                    case 74:
                        greetSendGiftConfig.femaleSendTips = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        greetSendGiftConfig.femaleRefusedGiftTips = nc5Var.m162495s();
                        continue;
                    default:
                        if (greetSendGiftConfig.maleTitle == null) {
                            greetSendGiftConfig.maleTitle = "";
                        }
                        if (greetSendGiftConfig.femaleTitle == null) {
                            greetSendGiftConfig.femaleTitle = "";
                        }
                        if (greetSendGiftConfig.maleSubTitle == null) {
                            greetSendGiftConfig.maleSubTitle = "";
                        }
                        if (greetSendGiftConfig.femaleSubTitle == null) {
                            greetSendGiftConfig.femaleSubTitle = "";
                        }
                        if (greetSendGiftConfig.maleSendTipsByMoment == null) {
                            greetSendGiftConfig.maleSendTipsByMoment = "";
                        }
                        if (greetSendGiftConfig.femaleSendTipsByMoment == null) {
                            greetSendGiftConfig.femaleSendTipsByMoment = "";
                        }
                        if (greetSendGiftConfig.maleSendTips == null) {
                            greetSendGiftConfig.maleSendTips = "";
                        }
                        if (greetSendGiftConfig.femaleSendTips == null) {
                            greetSendGiftConfig.femaleSendTips = "";
                        }
                        if (greetSendGiftConfig.maleRefusedGiftTips == null) {
                            greetSendGiftConfig.maleRefusedGiftTips = "";
                        }
                        if (greetSendGiftConfig.femaleRefusedGiftTips == null) {
                            greetSendGiftConfig.femaleRefusedGiftTips = "";
                            return greetSendGiftConfig;
                        }
                        break;
                }
            }
            return greetSendGiftConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GreetSendGiftConfig greetSendGiftConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = greetSendGiftConfig.maleTitle;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = greetSendGiftConfig.femaleTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = greetSendGiftConfig.maleSubTitle;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = greetSendGiftConfig.femaleSubTitle;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = greetSendGiftConfig.maleSendTipsByMoment;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = greetSendGiftConfig.femaleSendTipsByMoment;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            String str7 = greetSendGiftConfig.maleSendTips;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(7, str7);
            }
            String str8 = greetSendGiftConfig.maleRefusedGiftTips;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(8, str8);
            }
            String str9 = greetSendGiftConfig.femaleSendTips;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(9, str9);
            }
            String str10 = greetSendGiftConfig.femaleRefusedGiftTips;
            if (str10 != null) {
                codedOutputByteBufferNano.m17316R(10, str10);
            }
        }
    };
    public static JsonAdapter<GreetSendGiftConfig> JSON_ADAPTER = new ObjectJsonAdapter<GreetSendGiftConfig>() { // from class: com.p1.mobile.putong.core.data.GreetSendGiftConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GreetSendGiftConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GreetSendGiftConfig newInstance() {
            return new GreetSendGiftConfig();
        }

        public boolean parseField(GreetSendGiftConfig greetSendGiftConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "maleSendTipsByMoment":
                    greetSendGiftConfig.maleSendTipsByMoment = jsonParser.getValueAsString();
                    return true;
                case "maleSendTips":
                    greetSendGiftConfig.maleSendTips = jsonParser.getValueAsString();
                    return true;
                case "femaleSendTips":
                    greetSendGiftConfig.femaleSendTips = jsonParser.getValueAsString();
                    return true;
                case "maleSubTitle":
                    greetSendGiftConfig.maleSubTitle = jsonParser.getValueAsString();
                    return true;
                case "femaleSubTitle":
                    greetSendGiftConfig.femaleSubTitle = jsonParser.getValueAsString();
                    return true;
                case "maleRefusedGiftTips":
                    greetSendGiftConfig.maleRefusedGiftTips = jsonParser.getValueAsString();
                    return true;
                case "femaleSendTipsByMoment":
                    greetSendGiftConfig.femaleSendTipsByMoment = jsonParser.getValueAsString();
                    return true;
                case "femaleTitle":
                    greetSendGiftConfig.femaleTitle = jsonParser.getValueAsString();
                    return true;
                case "femaleRefusedGiftTips":
                    greetSendGiftConfig.femaleRefusedGiftTips = jsonParser.getValueAsString();
                    return true;
                case "maleTitle":
                    greetSendGiftConfig.maleTitle = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GreetSendGiftConfig greetSendGiftConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "maleSendTipsByMoment":
                case "maleSendTips":
                case "femaleSendTips":
                case "maleSubTitle":
                case "femaleSubTitle":
                case "maleRefusedGiftTips":
                case "femaleSendTipsByMoment":
                case "femaleTitle":
                case "femaleRefusedGiftTips":
                case "maleTitle":
                    return true;
                default:
                    return super.parseFieldCheck(greetSendGiftConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GreetSendGiftConfig greetSendGiftConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = greetSendGiftConfig.maleTitle;
            if (str != null) {
                jsonGenerator.writeStringField("maleTitle", str);
            }
            String str2 = greetSendGiftConfig.femaleTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("femaleTitle", str2);
            }
            String str3 = greetSendGiftConfig.maleSubTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("maleSubTitle", str3);
            }
            String str4 = greetSendGiftConfig.femaleSubTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("femaleSubTitle", str4);
            }
            String str5 = greetSendGiftConfig.maleSendTipsByMoment;
            if (str5 != null) {
                jsonGenerator.writeStringField("maleSendTipsByMoment", str5);
            }
            String str6 = greetSendGiftConfig.femaleSendTipsByMoment;
            if (str6 != null) {
                jsonGenerator.writeStringField("femaleSendTipsByMoment", str6);
            }
            String str7 = greetSendGiftConfig.maleSendTips;
            if (str7 != null) {
                jsonGenerator.writeStringField("maleSendTips", str7);
            }
            String str8 = greetSendGiftConfig.femaleSendTips;
            if (str8 != null) {
                jsonGenerator.writeStringField("femaleSendTips", str8);
            }
            String str9 = greetSendGiftConfig.maleRefusedGiftTips;
            if (str9 != null) {
                jsonGenerator.writeStringField("maleRefusedGiftTips", str9);
            }
            String str10 = greetSendGiftConfig.femaleRefusedGiftTips;
            if (str10 != null) {
                jsonGenerator.writeStringField("femaleRefusedGiftTips", str10);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetSendGiftConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetSendGiftConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetSendGiftConfig new_() {
        GreetSendGiftConfig greetSendGiftConfig = new GreetSendGiftConfig();
        greetSendGiftConfig.nullCheck();
        return greetSendGiftConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GreetSendGiftConfig mo225055clone() {
        GreetSendGiftConfig greetSendGiftConfig = new GreetSendGiftConfig();
        greetSendGiftConfig.maleTitle = this.maleTitle;
        greetSendGiftConfig.femaleTitle = this.femaleTitle;
        greetSendGiftConfig.maleSubTitle = this.maleSubTitle;
        greetSendGiftConfig.femaleSubTitle = this.femaleSubTitle;
        greetSendGiftConfig.maleSendTipsByMoment = this.maleSendTipsByMoment;
        greetSendGiftConfig.femaleSendTipsByMoment = this.femaleSendTipsByMoment;
        greetSendGiftConfig.maleSendTips = this.maleSendTips;
        greetSendGiftConfig.femaleSendTips = this.femaleSendTips;
        greetSendGiftConfig.maleRefusedGiftTips = this.maleRefusedGiftTips;
        greetSendGiftConfig.femaleRefusedGiftTips = this.femaleRefusedGiftTips;
        return greetSendGiftConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreetSendGiftConfig)) {
            return false;
        }
        GreetSendGiftConfig greetSendGiftConfig = (GreetSendGiftConfig) obj;
        return ValueObject.util_equals(this.maleTitle, greetSendGiftConfig.maleTitle) && ValueObject.util_equals(this.femaleTitle, greetSendGiftConfig.femaleTitle) && ValueObject.util_equals(this.maleSubTitle, greetSendGiftConfig.maleSubTitle) && ValueObject.util_equals(this.femaleSubTitle, greetSendGiftConfig.femaleSubTitle) && ValueObject.util_equals(this.maleSendTipsByMoment, greetSendGiftConfig.maleSendTipsByMoment) && ValueObject.util_equals(this.femaleSendTipsByMoment, greetSendGiftConfig.femaleSendTipsByMoment) && ValueObject.util_equals(this.maleSendTips, greetSendGiftConfig.maleSendTips) && ValueObject.util_equals(this.femaleSendTips, greetSendGiftConfig.femaleSendTips) && ValueObject.util_equals(this.maleRefusedGiftTips, greetSendGiftConfig.maleRefusedGiftTips) && ValueObject.util_equals(this.femaleRefusedGiftTips, greetSendGiftConfig.femaleRefusedGiftTips);
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
        String str = this.maleTitle;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.femaleTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.maleSubTitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.femaleSubTitle;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.maleSendTipsByMoment;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.femaleSendTipsByMoment;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.maleSendTips;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.femaleSendTips;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.maleRefusedGiftTips;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.femaleRefusedGiftTips;
        int iHashCode10 = iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.maleTitle == null) {
            this.maleTitle = "";
        }
        if (this.femaleTitle == null) {
            this.femaleTitle = "";
        }
        if (this.maleSubTitle == null) {
            this.maleSubTitle = "";
        }
        if (this.femaleSubTitle == null) {
            this.femaleSubTitle = "";
        }
        if (this.maleSendTipsByMoment == null) {
            this.maleSendTipsByMoment = "";
        }
        if (this.femaleSendTipsByMoment == null) {
            this.femaleSendTipsByMoment = "";
        }
        if (this.maleSendTips == null) {
            this.maleSendTips = "";
        }
        if (this.femaleSendTips == null) {
            this.femaleSendTips = "";
        }
        if (this.maleRefusedGiftTips == null) {
            this.maleRefusedGiftTips = "";
        }
        if (this.femaleRefusedGiftTips == null) {
            this.femaleRefusedGiftTips = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
