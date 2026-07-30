package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Gender;
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
    public String f21151id;

    @ProtobufIndex(index = 5)
    public boolean isPassive;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 6)
    public String tracker;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;

    @NonNull
    @ProtobufIndex(index = 8)
    public String zodiac;
    public static ProtobufAdapter<GrowthPushConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthPushConfig>() { // from class: com.p1.mobile.putong.core.data.GrowthPushConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GrowthPushConfig growthPushConfig) {
            String str = growthPushConfig.f21151id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = growthPushConfig.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = growthPushConfig.url;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = growthPushConfig.buttonText;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(5, growthPushConfig.isPassive);
            String str5 = growthPushConfig.tracker;
            if (str5 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(6, str5);
            }
            int iM17281h = iM17275b + CodedOutputByteBufferNano.m17281h(7, growthPushConfig.distance);
            String str6 = growthPushConfig.zodiac;
            if (str6 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(8, str6);
            }
            Gender gender = growthPushConfig.gender;
            if (gender != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(9, gender, Gender.PROTOBUF_ADAPTER);
            }
            growthPushConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GrowthPushConfig parse(nc5 nc5Var) throws IOException {
            GrowthPushConfig growthPushConfig = new GrowthPushConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (growthPushConfig.f21151id == null) {
                        growthPushConfig.f21151id = "";
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
                    growthPushConfig.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 10) {
                    growthPushConfig.f21151id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    growthPushConfig.name = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    growthPushConfig.url = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    growthPushConfig.buttonText = nc5Var.m162495s();
                } else if (iM162497u == 40) {
                    growthPushConfig.isPassive = nc5Var.m162483g();
                } else if (iM162497u == 50) {
                    growthPushConfig.tracker = nc5Var.m162495s();
                } else if (iM162497u == 56) {
                    growthPushConfig.distance = nc5Var.m162486j();
                } else if (iM162497u == 66) {
                    growthPushConfig.zodiac = nc5Var.m162495s();
                } else {
                    if (iM162497u != 74) {
                        if (growthPushConfig.f21151id == null) {
                            growthPushConfig.f21151id = "";
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
                        growthPushConfig.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                        return growthPushConfig;
                    }
                    growthPushConfig.gender = (Gender) nc5Var.m162488l(Gender.PROTOBUF_ADAPTER);
                }
            }
            return growthPushConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GrowthPushConfig growthPushConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = growthPushConfig.f21151id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = growthPushConfig.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = growthPushConfig.url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = growthPushConfig.buttonText;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            codedOutputByteBufferNano.m17299A(5, growthPushConfig.isPassive);
            String str5 = growthPushConfig.tracker;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(6, str5);
            }
            codedOutputByteBufferNano.m17305G(7, growthPushConfig.distance);
            String str6 = growthPushConfig.zodiac;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(8, str6);
            }
            Gender gender = growthPushConfig.gender;
            if (gender != null) {
                codedOutputByteBufferNano.m17309K(9, gender, Gender.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GrowthPushConfig> JSON_ADAPTER = new ObjectJsonAdapter<GrowthPushConfig>() { // from class: com.p1.mobile.putong.core.data.GrowthPushConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GrowthPushConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GrowthPushConfig newInstance() {
            return new GrowthPushConfig();
        }

        public boolean parseField(GrowthPushConfig growthPushConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isPassive":
                    growthPushConfig.isPassive = jsonParser.getValueAsBoolean();
                    return true;
                case "gender":
                    growthPushConfig.gender = Gender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "tracker":
                    growthPushConfig.tracker = jsonParser.getValueAsString();
                    return true;
                case "zodiac":
                    growthPushConfig.zodiac = jsonParser.getValueAsString();
                    return true;
                case "id":
                    growthPushConfig.f21151id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GrowthPushConfig growthPushConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = growthPushConfig.f21151id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = growthPushConfig.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthPushConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthPushConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthPushConfig new_() {
        GrowthPushConfig growthPushConfig = new GrowthPushConfig();
        growthPushConfig.nullCheck();
        return growthPushConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GrowthPushConfig mo225055clone() {
        GrowthPushConfig growthPushConfig = new GrowthPushConfig();
        growthPushConfig.f21151id = this.f21151id;
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
        return ValueObject.util_equals(this.f21151id, growthPushConfig.f21151id) && ValueObject.util_equals(this.name, growthPushConfig.name) && ValueObject.util_equals(this.url, growthPushConfig.url) && ValueObject.util_equals(this.zodiac, growthPushConfig.zodiac) && this.distance == growthPushConfig.distance && ValueObject.util_equals(this.tracker, growthPushConfig.tracker) && ValueObject.util_equals(this.buttonText, growthPushConfig.buttonText) && this.isPassive == growthPushConfig.isPassive && ValueObject.util_equals(this.gender, growthPushConfig.gender);
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
        String str = this.f21151id;
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
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21151id == null) {
            this.f21151id = "";
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
            this.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
