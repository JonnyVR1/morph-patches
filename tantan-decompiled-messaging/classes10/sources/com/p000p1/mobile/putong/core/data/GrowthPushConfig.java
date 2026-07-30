package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Gender;
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
public class GrowthPushConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthpushconfig";

    @NonNull
    @ProtobufIndex(index = 4)
    public String buttonText;

    @ProtobufIndex(index = 7)
    public int distance;

    @NonNull
    @ProtobufIndex(index = 9)
    public Gender gender;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f71id;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean isPassive;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @NonNull
    @ProtobufIndex(index = 6)
    public String tracker;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String url;

    @NonNull
    @ProtobufIndex(index = 8)
    public String zodiac;
    public static ProtobufAdapter<GrowthPushConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthPushConfig>() { // from class: com.p1.mobile.putong.core.data.GrowthPushConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GrowthPushConfig growthPushConfig) {
            String str = growthPushConfig.f71id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = growthPushConfig.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = growthPushConfig.url;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = growthPushConfig.buttonText;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            int iB = iO + CodedOutputByteBufferNano.b(5, growthPushConfig.isPassive);
            String str5 = growthPushConfig.tracker;
            if (str5 != null) {
                iB += CodedOutputByteBufferNano.o(6, str5);
            }
            int iH = iB + CodedOutputByteBufferNano.h(7, growthPushConfig.distance);
            String str6 = growthPushConfig.zodiac;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(8, str6);
            }
            Gender gender = growthPushConfig.gender;
            if (gender != null) {
                iH += CodedOutputByteBufferNano.l(9, gender, Gender.PROTOBUF_ADAPTER);
            }
            ((MessageNano) growthPushConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GrowthPushConfig m13151parse(nb5 nb5Var) throws IOException {
            GrowthPushConfig growthPushConfig = new GrowthPushConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (growthPushConfig.f71id == null) {
                        growthPushConfig.f71id = "";
                    }
                    if (growthPushConfig.name == null) {
                        growthPushConfig.name = "";
                    }
                    if (growthPushConfig.url == null) {
                        growthPushConfig.url = "";
                    }
                    if (growthPushConfig.zodiac == null) {
                        growthPushConfig.zodiac = "";
                    }
                    if (growthPushConfig.tracker == null) {
                        growthPushConfig.tracker = "";
                    }
                    if (growthPushConfig.buttonText == null) {
                        growthPushConfig.buttonText = "";
                    }
                    if (growthPushConfig.gender != null) {
                        break;
                    }
                    growthPushConfig.gender = Gender.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    growthPushConfig.f71id = nb5Var.s();
                } else if (iU == 18) {
                    growthPushConfig.name = nb5Var.s();
                } else if (iU == 26) {
                    growthPushConfig.url = nb5Var.s();
                } else if (iU == 34) {
                    growthPushConfig.buttonText = nb5Var.s();
                } else if (iU == 40) {
                    growthPushConfig.isPassive = nb5Var.g();
                } else if (iU == 50) {
                    growthPushConfig.tracker = nb5Var.s();
                } else if (iU == 56) {
                    growthPushConfig.distance = nb5Var.j();
                } else if (iU == 66) {
                    growthPushConfig.zodiac = nb5Var.s();
                } else {
                    if (iU != 74) {
                        if (growthPushConfig.f71id == null) {
                            growthPushConfig.f71id = "";
                        }
                        if (growthPushConfig.name == null) {
                            growthPushConfig.name = "";
                        }
                        if (growthPushConfig.url == null) {
                            growthPushConfig.url = "";
                        }
                        if (growthPushConfig.zodiac == null) {
                            growthPushConfig.zodiac = "";
                        }
                        if (growthPushConfig.tracker == null) {
                            growthPushConfig.tracker = "";
                        }
                        if (growthPushConfig.buttonText == null) {
                            growthPushConfig.buttonText = "";
                        }
                        if (growthPushConfig.gender != null) {
                            break;
                        }
                        growthPushConfig.gender = Gender.JSON_ADAPTER.defaultEnum();
                        return growthPushConfig;
                    }
                    growthPushConfig.gender = (Gender) nb5Var.l(Gender.PROTOBUF_ADAPTER);
                }
            }
            return growthPushConfig;
        }

        public void serialize(GrowthPushConfig growthPushConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = growthPushConfig.f71id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = growthPushConfig.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = growthPushConfig.url;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = growthPushConfig.buttonText;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            codedOutputByteBufferNano.A(5, growthPushConfig.isPassive);
            String str5 = growthPushConfig.tracker;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            codedOutputByteBufferNano.G(7, growthPushConfig.distance);
            String str6 = growthPushConfig.zodiac;
            if (str6 != null) {
                codedOutputByteBufferNano.R(8, str6);
            }
            Gender gender = growthPushConfig.gender;
            if (gender != null) {
                codedOutputByteBufferNano.K(9, gender, Gender.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GrowthPushConfig> JSON_ADAPTER = new ObjectJsonAdapter<GrowthPushConfig>() { // from class: com.p1.mobile.putong.core.data.GrowthPushConfig.2
        public Class getDataClass() {
            return GrowthPushConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GrowthPushConfig m13152newInstance() {
            return new GrowthPushConfig();
        }

        public boolean parseField(GrowthPushConfig growthPushConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isPassive":
                    growthPushConfig.isPassive = jsonParser.getValueAsBoolean();
                    return true;
                case "gender":
                    growthPushConfig.gender = (Gender) Gender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "tracker":
                    growthPushConfig.tracker = jsonParser.getValueAsString();
                    return true;
                case "zodiac":
                    growthPushConfig.zodiac = jsonParser.getValueAsString();
                    return true;
                case "id":
                    growthPushConfig.f71id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    growthPushConfig.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    growthPushConfig.name = jsonParser.getValueAsString();
                    return true;
                case "distance":
                    growthPushConfig.distance = jsonParser.getValueAsInt();
                    return true;
                case "buttonText":
                    growthPushConfig.buttonText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GrowthPushConfig growthPushConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isPassive":
                case "gender":
                case "tracker":
                case "zodiac":
                    return true;
                case "id":
                    return false;
                case "url":
                case "name":
                case "distance":
                case "buttonText":
                    return true;
                default:
                    return super.parseFieldCheck(growthPushConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GrowthPushConfig growthPushConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = growthPushConfig.f71id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = growthPushConfig.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = growthPushConfig.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            String str4 = growthPushConfig.zodiac;
            if (str4 != null) {
                jsonGenerator.writeStringField(ProfileLikeCategoryType.zodiac, str4);
            }
            jsonGenerator.writeNumberField("distance", growthPushConfig.distance);
            String str5 = growthPushConfig.tracker;
            if (str5 != null) {
                jsonGenerator.writeStringField("tracker", str5);
            }
            String str6 = growthPushConfig.buttonText;
            if (str6 != null) {
                jsonGenerator.writeStringField("buttonText", str6);
            }
            jsonGenerator.writeBooleanField("isPassive", growthPushConfig.isPassive);
            if (growthPushConfig.gender != null) {
                jsonGenerator.writeFieldName("gender");
                Gender.JSON_ADAPTER.serialize(growthPushConfig.gender, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthPushConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthPushConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthPushConfig new_() {
        GrowthPushConfig growthPushConfig = new GrowthPushConfig();
        growthPushConfig.nullCheck();
        return growthPushConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GrowthPushConfig m13150clone() {
        GrowthPushConfig growthPushConfig = new GrowthPushConfig();
        growthPushConfig.f71id = this.f71id;
        growthPushConfig.name = this.name;
        growthPushConfig.url = this.url;
        growthPushConfig.zodiac = this.zodiac;
        growthPushConfig.distance = this.distance;
        growthPushConfig.tracker = this.tracker;
        growthPushConfig.buttonText = this.buttonText;
        growthPushConfig.isPassive = this.isPassive;
        growthPushConfig.gender = this.gender;
        return growthPushConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GrowthPushConfig)) {
            return false;
        }
        GrowthPushConfig growthPushConfig = (GrowthPushConfig) obj;
        return ValueObject.util_equals(this.f71id, growthPushConfig.f71id) && ValueObject.util_equals(this.name, growthPushConfig.name) && ValueObject.util_equals(this.url, growthPushConfig.url) && ValueObject.util_equals(this.zodiac, growthPushConfig.zodiac) && this.distance == growthPushConfig.distance && ValueObject.util_equals(this.tracker, growthPushConfig.tracker) && ValueObject.util_equals(this.buttonText, growthPushConfig.buttonText) && this.isPassive == growthPushConfig.isPassive && ValueObject.util_equals(this.gender, growthPushConfig.gender);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f71id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.zodiac;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.distance) * 41;
        String str5 = this.tracker;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.buttonText;
        int iHashCode6 = (((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.isPassive ? 1231 : 1237)) * 41;
        Gender gender = this.gender;
        int iHashCode7 = iHashCode6 + (gender != null ? gender.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.f71id == null) {
            this.f71id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.zodiac == null) {
            this.zodiac = "";
        }
        if (this.tracker == null) {
            this.tracker = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
        if (this.gender == null) {
            this.gender = Gender.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
