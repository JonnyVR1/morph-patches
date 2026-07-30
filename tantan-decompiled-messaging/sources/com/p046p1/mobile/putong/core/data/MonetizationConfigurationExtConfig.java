package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class MonetizationConfigurationExtConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "monetizationconfigurationextconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String attributeChannel;

    @ProtobufIndex(index = 4)
    public boolean canFreeUseBoost;

    @ProtobufIndex(index = 5)
    public boolean crowdSvip;

    @NonNull
    @ProtobufIndex(index = 1)
    public GuideBoostMode guideBoostMode;

    @ProtobufIndex(index = 3)
    public int huaweiExpStrategy;

    @ProtobufIndex(index = 6)
    public boolean isLowPriceGroup;
    public static ProtobufAdapter<MonetizationConfigurationExtConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MonetizationConfigurationExtConfig>() { // from class: com.p1.mobile.putong.core.data.MonetizationConfigurationExtConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MonetizationConfigurationExtConfig monetizationConfigurationExtConfig) {
            GuideBoostMode guideBoostMode = monetizationConfigurationExtConfig.guideBoostMode;
            int iM17230l = guideBoostMode != null ? CodedOutputByteBufferNano.m17230l(1, guideBoostMode, GuideBoostMode.PROTOBUF_ADAPTER) : 0;
            String str = monetizationConfigurationExtConfig.attributeChannel;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            int iM17226h = iM17230l + CodedOutputByteBufferNano.m17226h(3, monetizationConfigurationExtConfig.huaweiExpStrategy) + CodedOutputByteBufferNano.m17220b(4, monetizationConfigurationExtConfig.canFreeUseBoost) + CodedOutputByteBufferNano.m17220b(5, monetizationConfigurationExtConfig.crowdSvip) + CodedOutputByteBufferNano.m17220b(6, monetizationConfigurationExtConfig.isLowPriceGroup);
            monetizationConfigurationExtConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MonetizationConfigurationExtConfig parse(nb5 nb5Var) throws IOException {
            MonetizationConfigurationExtConfig monetizationConfigurationExtConfig = new MonetizationConfigurationExtConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (monetizationConfigurationExtConfig.guideBoostMode == null) {
                        monetizationConfigurationExtConfig.guideBoostMode = (GuideBoostMode) GuideBoostMode.JSON_ADAPTER.defaultEnum();
                    }
                    if (monetizationConfigurationExtConfig.attributeChannel != null) {
                        break;
                    }
                    monetizationConfigurationExtConfig.attributeChannel = "";
                    break;
                }
                if (iM158752u == 10) {
                    monetizationConfigurationExtConfig.guideBoostMode = (GuideBoostMode) nb5Var.m158743l(GuideBoostMode.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    monetizationConfigurationExtConfig.attributeChannel = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    monetizationConfigurationExtConfig.huaweiExpStrategy = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    monetizationConfigurationExtConfig.canFreeUseBoost = nb5Var.m158738g();
                } else if (iM158752u == 40) {
                    monetizationConfigurationExtConfig.crowdSvip = nb5Var.m158738g();
                } else {
                    if (iM158752u != 48) {
                        if (monetizationConfigurationExtConfig.guideBoostMode == null) {
                            monetizationConfigurationExtConfig.guideBoostMode = (GuideBoostMode) GuideBoostMode.JSON_ADAPTER.defaultEnum();
                        }
                        if (monetizationConfigurationExtConfig.attributeChannel != null) {
                            break;
                        }
                        monetizationConfigurationExtConfig.attributeChannel = "";
                        return monetizationConfigurationExtConfig;
                    }
                    monetizationConfigurationExtConfig.isLowPriceGroup = nb5Var.m158738g();
                }
            }
            return monetizationConfigurationExtConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MonetizationConfigurationExtConfig monetizationConfigurationExtConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            GuideBoostMode guideBoostMode = monetizationConfigurationExtConfig.guideBoostMode;
            if (guideBoostMode != null) {
                codedOutputByteBufferNano.m17254K(1, guideBoostMode, GuideBoostMode.PROTOBUF_ADAPTER);
            }
            String str = monetizationConfigurationExtConfig.attributeChannel;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            codedOutputByteBufferNano.m17250G(3, monetizationConfigurationExtConfig.huaweiExpStrategy);
            codedOutputByteBufferNano.m17244A(4, monetizationConfigurationExtConfig.canFreeUseBoost);
            codedOutputByteBufferNano.m17244A(5, monetizationConfigurationExtConfig.crowdSvip);
            codedOutputByteBufferNano.m17244A(6, monetizationConfigurationExtConfig.isLowPriceGroup);
        }
    };
    public static JsonAdapter<MonetizationConfigurationExtConfig> JSON_ADAPTER = new ObjectJsonAdapter<MonetizationConfigurationExtConfig>() { // from class: com.p1.mobile.putong.core.data.MonetizationConfigurationExtConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MonetizationConfigurationExtConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MonetizationConfigurationExtConfig newInstance() {
            return new MonetizationConfigurationExtConfig();
        }

        public boolean parseField(MonetizationConfigurationExtConfig monetizationConfigurationExtConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "guideBoostMode":
                    monetizationConfigurationExtConfig.guideBoostMode = GuideBoostMode.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "isLowPriceGroup":
                    monetizationConfigurationExtConfig.isLowPriceGroup = jsonParser.getValueAsBoolean();
                    return true;
                case "canFreeUseBoost":
                    monetizationConfigurationExtConfig.canFreeUseBoost = jsonParser.getValueAsBoolean();
                    return true;
                case "huaweiExpStrategy":
                    monetizationConfigurationExtConfig.huaweiExpStrategy = jsonParser.getValueAsInt();
                    return true;
                case "attributeChannel":
                    monetizationConfigurationExtConfig.attributeChannel = jsonParser.getValueAsString();
                    return true;
                case "crowdSvip":
                    monetizationConfigurationExtConfig.crowdSvip = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MonetizationConfigurationExtConfig monetizationConfigurationExtConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "guideBoostMode":
                case "isLowPriceGroup":
                case "canFreeUseBoost":
                case "huaweiExpStrategy":
                case "attributeChannel":
                case "crowdSvip":
                    return true;
                default:
                    return super.parseFieldCheck(monetizationConfigurationExtConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MonetizationConfigurationExtConfig monetizationConfigurationExtConfig, JsonGenerator jsonGenerator) throws IOException {
            if (monetizationConfigurationExtConfig.guideBoostMode != null) {
                jsonGenerator.writeFieldName("guideBoostMode");
                GuideBoostMode.JSON_ADAPTER.serialize(monetizationConfigurationExtConfig.guideBoostMode, jsonGenerator, true);
            }
            String str = monetizationConfigurationExtConfig.attributeChannel;
            if (str != null) {
                jsonGenerator.writeStringField("attributeChannel", str);
            }
            jsonGenerator.writeNumberField("huaweiExpStrategy", monetizationConfigurationExtConfig.huaweiExpStrategy);
            jsonGenerator.writeBooleanField("canFreeUseBoost", monetizationConfigurationExtConfig.canFreeUseBoost);
            jsonGenerator.writeBooleanField("crowdSvip", monetizationConfigurationExtConfig.crowdSvip);
            jsonGenerator.writeBooleanField("isLowPriceGroup", monetizationConfigurationExtConfig.isLowPriceGroup);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MonetizationConfigurationExtConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MonetizationConfigurationExtConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MonetizationConfigurationExtConfig new_() {
        MonetizationConfigurationExtConfig monetizationConfigurationExtConfig = new MonetizationConfigurationExtConfig();
        monetizationConfigurationExtConfig.nullCheck();
        return monetizationConfigurationExtConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MonetizationConfigurationExtConfig mo223809clone() {
        MonetizationConfigurationExtConfig monetizationConfigurationExtConfig = new MonetizationConfigurationExtConfig();
        monetizationConfigurationExtConfig.guideBoostMode = this.guideBoostMode;
        monetizationConfigurationExtConfig.attributeChannel = this.attributeChannel;
        monetizationConfigurationExtConfig.huaweiExpStrategy = this.huaweiExpStrategy;
        monetizationConfigurationExtConfig.canFreeUseBoost = this.canFreeUseBoost;
        monetizationConfigurationExtConfig.crowdSvip = this.crowdSvip;
        monetizationConfigurationExtConfig.isLowPriceGroup = this.isLowPriceGroup;
        return monetizationConfigurationExtConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MonetizationConfigurationExtConfig)) {
            return false;
        }
        MonetizationConfigurationExtConfig monetizationConfigurationExtConfig = (MonetizationConfigurationExtConfig) obj;
        return ValueObject.util_equals(this.guideBoostMode, monetizationConfigurationExtConfig.guideBoostMode) && ValueObject.util_equals(this.attributeChannel, monetizationConfigurationExtConfig.attributeChannel) && this.huaweiExpStrategy == monetizationConfigurationExtConfig.huaweiExpStrategy && this.canFreeUseBoost == monetizationConfigurationExtConfig.canFreeUseBoost && this.crowdSvip == monetizationConfigurationExtConfig.crowdSvip && this.isLowPriceGroup == monetizationConfigurationExtConfig.isLowPriceGroup;
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
        GuideBoostMode guideBoostMode = this.guideBoostMode;
        int iHashCode = (i2 + (guideBoostMode != null ? guideBoostMode.hashCode() : 0)) * 41;
        String str = this.attributeChannel;
        int iHashCode2 = ((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + this.huaweiExpStrategy) * 41) + (this.canFreeUseBoost ? 1231 : 1237)) * 41) + (this.crowdSvip ? 1231 : 1237)) * 41) + (this.isLowPriceGroup ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.guideBoostMode == null) {
            this.guideBoostMode = (GuideBoostMode) GuideBoostMode.JSON_ADAPTER.defaultEnum();
        }
        if (this.attributeChannel == null) {
            this.attributeChannel = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
