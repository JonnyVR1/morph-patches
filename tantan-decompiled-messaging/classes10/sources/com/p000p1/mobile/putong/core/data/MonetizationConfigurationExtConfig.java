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
public class MonetizationConfigurationExtConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "monetizationconfigurationextconfig";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String attributeChannel;

    @ProtobufIndex(index = 4)
    public boolean canFreeUseBoost;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean crowdSvip;

    @NonNull
    @ProtobufIndex(index = 1)
    public GuideBoostMode guideBoostMode;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int huaweiExpStrategy;

    @ProtobufIndex(index = 6)
    public boolean isLowPriceGroup;
    public static ProtobufAdapter<MonetizationConfigurationExtConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MonetizationConfigurationExtConfig>() { // from class: com.p1.mobile.putong.core.data.MonetizationConfigurationExtConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MonetizationConfigurationExtConfig monetizationConfigurationExtConfig) {
            GuideBoostMode guideBoostMode = monetizationConfigurationExtConfig.guideBoostMode;
            int iL = guideBoostMode != null ? CodedOutputByteBufferNano.l(1, guideBoostMode, GuideBoostMode.PROTOBUF_ADAPTER) : 0;
            String str = monetizationConfigurationExtConfig.attributeChannel;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            int iH = iL + CodedOutputByteBufferNano.h(3, monetizationConfigurationExtConfig.huaweiExpStrategy) + CodedOutputByteBufferNano.b(4, monetizationConfigurationExtConfig.canFreeUseBoost) + CodedOutputByteBufferNano.b(5, monetizationConfigurationExtConfig.crowdSvip) + CodedOutputByteBufferNano.b(6, monetizationConfigurationExtConfig.isLowPriceGroup);
            ((MessageNano) monetizationConfigurationExtConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MonetizationConfigurationExtConfig m14361parse(nb5 nb5Var) throws IOException {
            MonetizationConfigurationExtConfig monetizationConfigurationExtConfig = new MonetizationConfigurationExtConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (monetizationConfigurationExtConfig.guideBoostMode == null) {
                        monetizationConfigurationExtConfig.guideBoostMode = (GuideBoostMode) GuideBoostMode.JSON_ADAPTER.defaultEnum();
                    }
                    if (monetizationConfigurationExtConfig.attributeChannel != null) {
                        break;
                    }
                    monetizationConfigurationExtConfig.attributeChannel = "";
                    break;
                }
                if (iU == 10) {
                    monetizationConfigurationExtConfig.guideBoostMode = (GuideBoostMode) nb5Var.l(GuideBoostMode.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    monetizationConfigurationExtConfig.attributeChannel = nb5Var.s();
                } else if (iU == 24) {
                    monetizationConfigurationExtConfig.huaweiExpStrategy = nb5Var.j();
                } else if (iU == 32) {
                    monetizationConfigurationExtConfig.canFreeUseBoost = nb5Var.g();
                } else if (iU == 40) {
                    monetizationConfigurationExtConfig.crowdSvip = nb5Var.g();
                } else {
                    if (iU != 48) {
                        if (monetizationConfigurationExtConfig.guideBoostMode == null) {
                            monetizationConfigurationExtConfig.guideBoostMode = (GuideBoostMode) GuideBoostMode.JSON_ADAPTER.defaultEnum();
                        }
                        if (monetizationConfigurationExtConfig.attributeChannel != null) {
                            break;
                        }
                        monetizationConfigurationExtConfig.attributeChannel = "";
                        return monetizationConfigurationExtConfig;
                    }
                    monetizationConfigurationExtConfig.isLowPriceGroup = nb5Var.g();
                }
            }
            return monetizationConfigurationExtConfig;
        }

        public void serialize(MonetizationConfigurationExtConfig monetizationConfigurationExtConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            GuideBoostMode guideBoostMode = monetizationConfigurationExtConfig.guideBoostMode;
            if (guideBoostMode != null) {
                codedOutputByteBufferNano.K(1, guideBoostMode, GuideBoostMode.PROTOBUF_ADAPTER);
            }
            String str = monetizationConfigurationExtConfig.attributeChannel;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.G(3, monetizationConfigurationExtConfig.huaweiExpStrategy);
            codedOutputByteBufferNano.A(4, monetizationConfigurationExtConfig.canFreeUseBoost);
            codedOutputByteBufferNano.A(5, monetizationConfigurationExtConfig.crowdSvip);
            codedOutputByteBufferNano.A(6, monetizationConfigurationExtConfig.isLowPriceGroup);
        }
    };
    public static JsonAdapter<MonetizationConfigurationExtConfig> JSON_ADAPTER = new ObjectJsonAdapter<MonetizationConfigurationExtConfig>() { // from class: com.p1.mobile.putong.core.data.MonetizationConfigurationExtConfig.2
        public Class getDataClass() {
            return MonetizationConfigurationExtConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MonetizationConfigurationExtConfig m14362newInstance() {
            return new MonetizationConfigurationExtConfig();
        }

        public boolean parseField(MonetizationConfigurationExtConfig monetizationConfigurationExtConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "guideBoostMode":
                    monetizationConfigurationExtConfig.guideBoostMode = (GuideBoostMode) GuideBoostMode.JSON_ADAPTER.parse(jsonParser, str2);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MonetizationConfigurationExtConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MonetizationConfigurationExtConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MonetizationConfigurationExtConfig new_() {
        MonetizationConfigurationExtConfig monetizationConfigurationExtConfig = new MonetizationConfigurationExtConfig();
        monetizationConfigurationExtConfig.nullCheck();
        return monetizationConfigurationExtConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MonetizationConfigurationExtConfig m14360clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        GuideBoostMode guideBoostMode = this.guideBoostMode;
        int iHashCode = (i2 + (guideBoostMode != null ? guideBoostMode.hashCode() : 0)) * 41;
        String str = this.attributeChannel;
        int iHashCode2 = ((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + this.huaweiExpStrategy) * 41) + (this.canFreeUseBoost ? 1231 : 1237)) * 41) + (this.crowdSvip ? 1231 : 1237)) * 41) + (this.isLowPriceGroup ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.guideBoostMode == null) {
            this.guideBoostMode = (GuideBoostMode) GuideBoostMode.JSON_ADAPTER.defaultEnum();
        }
        if (this.attributeChannel == null) {
            this.attributeChannel = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
