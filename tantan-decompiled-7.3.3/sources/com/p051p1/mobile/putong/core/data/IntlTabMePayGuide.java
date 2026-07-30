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
public class IntlTabMePayGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intltabmepayguide";

    @NonNull
    @ProtobufIndex(index = 2)
    public String bannerType;

    @ProtobufIndex(index = 6)
    public int contractIntervalDays;

    @ProtobufIndex(index = 4)
    public boolean isUpgraded;

    @NonNull
    @ProtobufIndex(index = 3)
    public String membershipType;

    @ProtobufIndex(index = 1)
    public boolean showBanner;

    @NonNull
    @ProtobufIndex(index = 5)
    public IntlTabMePayGuideText text;
    public static ProtobufAdapter<IntlTabMePayGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlTabMePayGuide>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuide.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlTabMePayGuide intlTabMePayGuide) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, intlTabMePayGuide.showBanner);
            String str = intlTabMePayGuide.bannerType;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = intlTabMePayGuide.membershipType;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(4, intlTabMePayGuide.isUpgraded);
            IntlTabMePayGuideText intlTabMePayGuideText = intlTabMePayGuide.text;
            if (intlTabMePayGuideText != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(5, intlTabMePayGuideText, IntlTabMePayGuideText.PROTOBUF_ADAPTER);
            }
            int iM17281h = iM17275b2 + CodedOutputByteBufferNano.m17281h(6, intlTabMePayGuide.contractIntervalDays);
            intlTabMePayGuide.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlTabMePayGuide parse(nc5 nc5Var) throws IOException {
            IntlTabMePayGuide intlTabMePayGuide = new IntlTabMePayGuide();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlTabMePayGuide.bannerType == null) {
                        intlTabMePayGuide.bannerType = "";
                    }
                    if (intlTabMePayGuide.membershipType == null) {
                        intlTabMePayGuide.membershipType = "";
                    }
                    if (intlTabMePayGuide.text != null) {
                        break;
                    }
                    intlTabMePayGuide.text = IntlTabMePayGuideText.new_();
                    break;
                }
                if (iM162497u == 8) {
                    intlTabMePayGuide.showBanner = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    intlTabMePayGuide.bannerType = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    intlTabMePayGuide.membershipType = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    intlTabMePayGuide.isUpgraded = nc5Var.m162483g();
                } else if (iM162497u == 42) {
                    intlTabMePayGuide.text = (IntlTabMePayGuideText) nc5Var.m162488l(IntlTabMePayGuideText.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 48) {
                        if (intlTabMePayGuide.bannerType == null) {
                            intlTabMePayGuide.bannerType = "";
                        }
                        if (intlTabMePayGuide.membershipType == null) {
                            intlTabMePayGuide.membershipType = "";
                        }
                        if (intlTabMePayGuide.text != null) {
                            break;
                        }
                        intlTabMePayGuide.text = IntlTabMePayGuideText.new_();
                        return intlTabMePayGuide;
                    }
                    intlTabMePayGuide.contractIntervalDays = nc5Var.m162486j();
                }
            }
            return intlTabMePayGuide;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlTabMePayGuide intlTabMePayGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, intlTabMePayGuide.showBanner);
            String str = intlTabMePayGuide.bannerType;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = intlTabMePayGuide.membershipType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            codedOutputByteBufferNano.m17299A(4, intlTabMePayGuide.isUpgraded);
            IntlTabMePayGuideText intlTabMePayGuideText = intlTabMePayGuide.text;
            if (intlTabMePayGuideText != null) {
                codedOutputByteBufferNano.m17309K(5, intlTabMePayGuideText, IntlTabMePayGuideText.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(6, intlTabMePayGuide.contractIntervalDays);
        }
    };
    public static JsonAdapter<IntlTabMePayGuide> JSON_ADAPTER = new ObjectJsonAdapter<IntlTabMePayGuide>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlTabMePayGuide.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlTabMePayGuide newInstance() {
            return new IntlTabMePayGuide();
        }

        public boolean parseField(IntlTabMePayGuide intlTabMePayGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bannerType":
                    intlTabMePayGuide.bannerType = jsonParser.getValueAsString();
                    return true;
                case "membershipType":
                    intlTabMePayGuide.membershipType = jsonParser.getValueAsString();
                    return true;
                case "text":
                    intlTabMePayGuide.text = IntlTabMePayGuideText.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "showBanner":
                    intlTabMePayGuide.showBanner = jsonParser.getValueAsBoolean();
                    return true;
                case "isUpgraded":
                    intlTabMePayGuide.isUpgraded = jsonParser.getValueAsBoolean();
                    return true;
                case "contractIntervalDays":
                    intlTabMePayGuide.contractIntervalDays = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlTabMePayGuide intlTabMePayGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bannerType":
                case "membershipType":
                case "text":
                case "showBanner":
                case "isUpgraded":
                case "contractIntervalDays":
                    return true;
                default:
                    return super.parseFieldCheck(intlTabMePayGuide, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlTabMePayGuide intlTabMePayGuide, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("showBanner", intlTabMePayGuide.showBanner);
            String str = intlTabMePayGuide.bannerType;
            if (str != null) {
                jsonGenerator.writeStringField("bannerType", str);
            }
            String str2 = intlTabMePayGuide.membershipType;
            if (str2 != null) {
                jsonGenerator.writeStringField("membershipType", str2);
            }
            jsonGenerator.writeBooleanField("isUpgraded", intlTabMePayGuide.isUpgraded);
            if (intlTabMePayGuide.text != null) {
                jsonGenerator.writeFieldName("text");
                IntlTabMePayGuideText.JSON_ADAPTER.serialize(intlTabMePayGuide.text, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("contractIntervalDays", intlTabMePayGuide.contractIntervalDays);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlTabMePayGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlTabMePayGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlTabMePayGuide new_() {
        IntlTabMePayGuide intlTabMePayGuide = new IntlTabMePayGuide();
        intlTabMePayGuide.nullCheck();
        return intlTabMePayGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlTabMePayGuide mo225055clone() {
        IntlTabMePayGuide intlTabMePayGuide = new IntlTabMePayGuide();
        intlTabMePayGuide.showBanner = this.showBanner;
        intlTabMePayGuide.bannerType = this.bannerType;
        intlTabMePayGuide.membershipType = this.membershipType;
        intlTabMePayGuide.isUpgraded = this.isUpgraded;
        IntlTabMePayGuideText intlTabMePayGuideText = this.text;
        if (intlTabMePayGuideText != null) {
            intlTabMePayGuide.text = intlTabMePayGuideText.mo225055clone();
        }
        intlTabMePayGuide.contractIntervalDays = this.contractIntervalDays;
        return intlTabMePayGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlTabMePayGuide)) {
            return false;
        }
        IntlTabMePayGuide intlTabMePayGuide = (IntlTabMePayGuide) obj;
        return this.showBanner == intlTabMePayGuide.showBanner && ValueObject.util_equals(this.bannerType, intlTabMePayGuide.bannerType) && ValueObject.util_equals(this.membershipType, intlTabMePayGuide.membershipType) && this.isUpgraded == intlTabMePayGuide.isUpgraded && ValueObject.util_equals(this.text, intlTabMePayGuide.text) && this.contractIntervalDays == intlTabMePayGuide.contractIntervalDays;
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
        int i2 = ((i * 41) + (this.showBanner ? 1231 : 1237)) * 41;
        String str = this.bannerType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.membershipType;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isUpgraded ? 1231 : 1237)) * 41;
        IntlTabMePayGuideText intlTabMePayGuideText = this.text;
        int iHashCode3 = ((iHashCode2 + (intlTabMePayGuideText != null ? intlTabMePayGuideText.hashCode() : 0)) * 41) + this.contractIntervalDays;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.bannerType == null) {
            this.bannerType = "";
        }
        if (this.membershipType == null) {
            this.membershipType = "";
        }
        if (this.text == null) {
            this.text = IntlTabMePayGuideText.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
