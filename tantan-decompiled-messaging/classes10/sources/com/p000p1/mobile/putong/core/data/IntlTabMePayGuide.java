package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlTabMePayGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intltabmepayguide";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String bannerType;

    @ProtobufIndex(index = 6)
    public int contractIntervalDays;

    @ProtobufIndex(index = 4)
    public boolean isUpgraded;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String membershipType;

    @ProtobufIndex(index = 1)
    public boolean showBanner;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public IntlTabMePayGuideText text;
    public static ProtobufAdapter<IntlTabMePayGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlTabMePayGuide>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuide.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlTabMePayGuide intlTabMePayGuide) {
            int iB = CodedOutputByteBufferNano.b(1, intlTabMePayGuide.showBanner);
            String str = intlTabMePayGuide.bannerType;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = intlTabMePayGuide.membershipType;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(3, str2);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(4, intlTabMePayGuide.isUpgraded);
            IntlTabMePayGuideText intlTabMePayGuideText = intlTabMePayGuide.text;
            if (intlTabMePayGuideText != null) {
                iB2 += CodedOutputByteBufferNano.l(5, intlTabMePayGuideText, IntlTabMePayGuideText.PROTOBUF_ADAPTER);
            }
            int iH = iB2 + CodedOutputByteBufferNano.h(6, intlTabMePayGuide.contractIntervalDays);
            ((MessageNano) intlTabMePayGuide).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlTabMePayGuide m13687parse(nb5 nb5Var) throws IOException {
            IntlTabMePayGuide intlTabMePayGuide = new IntlTabMePayGuide();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    intlTabMePayGuide.showBanner = nb5Var.g();
                } else if (iU == 18) {
                    intlTabMePayGuide.bannerType = nb5Var.s();
                } else if (iU == 26) {
                    intlTabMePayGuide.membershipType = nb5Var.s();
                } else if (iU == 32) {
                    intlTabMePayGuide.isUpgraded = nb5Var.g();
                } else if (iU == 42) {
                    intlTabMePayGuide.text = (IntlTabMePayGuideText) nb5Var.l(IntlTabMePayGuideText.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 48) {
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
                    intlTabMePayGuide.contractIntervalDays = nb5Var.j();
                }
            }
            return intlTabMePayGuide;
        }

        public void serialize(IntlTabMePayGuide intlTabMePayGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, intlTabMePayGuide.showBanner);
            String str = intlTabMePayGuide.bannerType;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = intlTabMePayGuide.membershipType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            codedOutputByteBufferNano.A(4, intlTabMePayGuide.isUpgraded);
            IntlTabMePayGuideText intlTabMePayGuideText = intlTabMePayGuide.text;
            if (intlTabMePayGuideText != null) {
                codedOutputByteBufferNano.K(5, intlTabMePayGuideText, IntlTabMePayGuideText.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(6, intlTabMePayGuide.contractIntervalDays);
        }
    };
    public static JsonAdapter<IntlTabMePayGuide> JSON_ADAPTER = new ObjectJsonAdapter<IntlTabMePayGuide>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuide.2
        public Class getDataClass() {
            return IntlTabMePayGuide.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlTabMePayGuide m13688newInstance() {
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
                    intlTabMePayGuide.text = (IntlTabMePayGuideText) IntlTabMePayGuideText.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlTabMePayGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlTabMePayGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlTabMePayGuide new_() {
        IntlTabMePayGuide intlTabMePayGuide = new IntlTabMePayGuide();
        intlTabMePayGuide.nullCheck();
        return intlTabMePayGuide;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlTabMePayGuide m13686clone() {
        IntlTabMePayGuide intlTabMePayGuide = new IntlTabMePayGuide();
        intlTabMePayGuide.showBanner = this.showBanner;
        intlTabMePayGuide.bannerType = this.bannerType;
        intlTabMePayGuide.membershipType = this.membershipType;
        intlTabMePayGuide.isUpgraded = this.isUpgraded;
        IntlTabMePayGuideText intlTabMePayGuideText = this.text;
        if (intlTabMePayGuideText != null) {
            intlTabMePayGuide.text = intlTabMePayGuideText.m13694clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
