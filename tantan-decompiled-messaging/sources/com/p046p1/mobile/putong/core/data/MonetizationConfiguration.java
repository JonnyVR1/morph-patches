package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.MonetizationConfiguration;
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
import java.util.Collections;
import java.util.Map;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class MonetizationConfiguration extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "monetizationconfiguration";

    @ProtobufIndex(index = 4)
    public boolean buyDialogHidePrice;

    @NonNull
    @ProtobufIndex(index = 1)
    public MonetizationConfigurationHighRisk complaint;

    @Nullable
    @ProtobufIndex(index = 7)
    public MonetizationConfigurationExtConfig extConfig;

    @Nullable
    @ProtobufIndex(index = 5)
    public HomeSeeVisitorConfigs homeIconSee;

    @Nullable
    @ProtobufIndex(index = 6)
    public HomeSeeVisitorConfigs homeIconVisitor;

    @NonNull
    @ProtobufIndex(index = 10)
    public Map<String, Map<String, Integer>> membershipDesc;

    @Nullable
    @ProtobufIndex(index = 12)
    public NearbyBlock nearbyBlock;

    @Nullable
    @ProtobufIndex(index = 13)
    public SeeTrialConfiguration seeTrial;

    @ProtobufIndex(index = 3)
    public boolean showCompliantEntry;

    @ProtobufIndex(index = 9)
    public boolean showIndexNearbyTab;

    @ProtobufIndex(index = 11)
    public boolean showPrivateCustomTab;

    @NonNull
    @ProtobufIndex(index = 2)
    public UserTags userTags;

    @ProtobufIndex(index = 8)
    public int willPayScore;
    public static ProtobufAdapter<MonetizationConfiguration> PROTOBUF_ADAPTER = new MessageNanoAdapter<MonetizationConfiguration>() { // from class: com.p1.mobile.putong.core.data.MonetizationConfiguration.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MonetizationConfiguration monetizationConfiguration) {
            MonetizationConfigurationHighRisk monetizationConfigurationHighRisk = monetizationConfiguration.complaint;
            int iM17230l = monetizationConfigurationHighRisk != null ? CodedOutputByteBufferNano.m17230l(1, monetizationConfigurationHighRisk, MonetizationConfigurationHighRisk.PROTOBUF_ADAPTER) : 0;
            UserTags userTags = monetizationConfiguration.userTags;
            if (userTags != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, userTags, UserTags.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17230l + CodedOutputByteBufferNano.m17220b(3, monetizationConfiguration.showCompliantEntry) + CodedOutputByteBufferNano.m17220b(4, monetizationConfiguration.buyDialogHidePrice);
            HomeSeeVisitorConfigs homeSeeVisitorConfigs = monetizationConfiguration.homeIconSee;
            if (homeSeeVisitorConfigs != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(5, homeSeeVisitorConfigs, HomeSeeVisitorConfigs.PROTOBUF_ADAPTER);
            }
            HomeSeeVisitorConfigs homeSeeVisitorConfigs2 = monetizationConfiguration.homeIconVisitor;
            if (homeSeeVisitorConfigs2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(6, homeSeeVisitorConfigs2, HomeSeeVisitorConfigs.PROTOBUF_ADAPTER);
            }
            MonetizationConfigurationExtConfig monetizationConfigurationExtConfig = monetizationConfiguration.extConfig;
            if (monetizationConfigurationExtConfig != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(7, monetizationConfigurationExtConfig, MonetizationConfigurationExtConfig.PROTOBUF_ADAPTER);
            }
            int iM17226h = iM17220b + CodedOutputByteBufferNano.m17226h(8, monetizationConfiguration.willPayScore) + CodedOutputByteBufferNano.m17220b(9, monetizationConfiguration.showIndexNearbyTab);
            Map<String, Map<String, Integer>> map = monetizationConfiguration.membershipDesc;
            if (map != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(10, map, ProtobufAdapter.INT_BOXED_ADAPTER.MAP_ADAPTER().MAP_ADAPTER());
            }
            int iM17220b2 = iM17226h + CodedOutputByteBufferNano.m17220b(11, monetizationConfiguration.showPrivateCustomTab);
            NearbyBlock nearbyBlock = monetizationConfiguration.nearbyBlock;
            if (nearbyBlock != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(12, nearbyBlock, NearbyBlock.PROTOBUF_ADAPTER);
            }
            SeeTrialConfiguration seeTrialConfiguration = monetizationConfiguration.seeTrial;
            if (seeTrialConfiguration != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(13, seeTrialConfiguration, SeeTrialConfiguration.PROTOBUF_ADAPTER);
            }
            monetizationConfiguration.cachedSize = iM17220b2;
            return iM17220b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MonetizationConfiguration parse(nb5 nb5Var) throws IOException {
            MonetizationConfiguration monetizationConfiguration = new MonetizationConfiguration();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (monetizationConfiguration.complaint == null) {
                            monetizationConfiguration.complaint = MonetizationConfigurationHighRisk.new_();
                        }
                        if (monetizationConfiguration.userTags == null) {
                            monetizationConfiguration.userTags = UserTags.new_();
                        }
                        if (monetizationConfiguration.membershipDesc == null) {
                            monetizationConfiguration.membershipDesc = Collections.EMPTY_MAP;
                        }
                        break;
                    case 10:
                        monetizationConfiguration.complaint = (MonetizationConfigurationHighRisk) nb5Var.m158743l(MonetizationConfigurationHighRisk.PROTOBUF_ADAPTER);
                        continue;
                    case 18:
                        monetizationConfiguration.userTags = (UserTags) nb5Var.m158743l(UserTags.PROTOBUF_ADAPTER);
                        continue;
                    case 24:
                        monetizationConfiguration.showCompliantEntry = nb5Var.m158738g();
                        continue;
                    case 32:
                        monetizationConfiguration.buyDialogHidePrice = nb5Var.m158738g();
                        continue;
                    case 42:
                        monetizationConfiguration.homeIconSee = (HomeSeeVisitorConfigs) nb5Var.m158743l(HomeSeeVisitorConfigs.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        monetizationConfiguration.homeIconVisitor = (HomeSeeVisitorConfigs) nb5Var.m158743l(HomeSeeVisitorConfigs.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        monetizationConfiguration.extConfig = (MonetizationConfigurationExtConfig) nb5Var.m158743l(MonetizationConfigurationExtConfig.PROTOBUF_ADAPTER);
                        continue;
                    case 64:
                        monetizationConfiguration.willPayScore = nb5Var.m158741j();
                        continue;
                    case 72:
                        monetizationConfiguration.showIndexNearbyTab = nb5Var.m158738g();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        monetizationConfiguration.membershipDesc = (Map) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.MAP_ADAPTER().MAP_ADAPTER());
                        continue;
                    case 88:
                        monetizationConfiguration.showPrivateCustomTab = nb5Var.m158738g();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        monetizationConfiguration.nearbyBlock = (NearbyBlock) nb5Var.m158743l(NearbyBlock.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        monetizationConfiguration.seeTrial = (SeeTrialConfiguration) nb5Var.m158743l(SeeTrialConfiguration.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (monetizationConfiguration.complaint == null) {
                            monetizationConfiguration.complaint = MonetizationConfigurationHighRisk.new_();
                        }
                        if (monetizationConfiguration.userTags == null) {
                            monetizationConfiguration.userTags = UserTags.new_();
                        }
                        if (monetizationConfiguration.membershipDesc == null) {
                            monetizationConfiguration.membershipDesc = Collections.EMPTY_MAP;
                            return monetizationConfiguration;
                        }
                        break;
                }
            }
            return monetizationConfiguration;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MonetizationConfiguration monetizationConfiguration, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MonetizationConfigurationHighRisk monetizationConfigurationHighRisk = monetizationConfiguration.complaint;
            if (monetizationConfigurationHighRisk != null) {
                codedOutputByteBufferNano.m17254K(1, monetizationConfigurationHighRisk, MonetizationConfigurationHighRisk.PROTOBUF_ADAPTER);
            }
            UserTags userTags = monetizationConfiguration.userTags;
            if (userTags != null) {
                codedOutputByteBufferNano.m17254K(2, userTags, UserTags.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(3, monetizationConfiguration.showCompliantEntry);
            codedOutputByteBufferNano.m17244A(4, monetizationConfiguration.buyDialogHidePrice);
            HomeSeeVisitorConfigs homeSeeVisitorConfigs = monetizationConfiguration.homeIconSee;
            if (homeSeeVisitorConfigs != null) {
                codedOutputByteBufferNano.m17254K(5, homeSeeVisitorConfigs, HomeSeeVisitorConfigs.PROTOBUF_ADAPTER);
            }
            HomeSeeVisitorConfigs homeSeeVisitorConfigs2 = monetizationConfiguration.homeIconVisitor;
            if (homeSeeVisitorConfigs2 != null) {
                codedOutputByteBufferNano.m17254K(6, homeSeeVisitorConfigs2, HomeSeeVisitorConfigs.PROTOBUF_ADAPTER);
            }
            MonetizationConfigurationExtConfig monetizationConfigurationExtConfig = monetizationConfiguration.extConfig;
            if (monetizationConfigurationExtConfig != null) {
                codedOutputByteBufferNano.m17254K(7, monetizationConfigurationExtConfig, MonetizationConfigurationExtConfig.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(8, monetizationConfiguration.willPayScore);
            codedOutputByteBufferNano.m17244A(9, monetizationConfiguration.showIndexNearbyTab);
            Map<String, Map<String, Integer>> map = monetizationConfiguration.membershipDesc;
            if (map != null) {
                codedOutputByteBufferNano.m17254K(10, map, ProtobufAdapter.INT_BOXED_ADAPTER.MAP_ADAPTER().MAP_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(11, monetizationConfiguration.showPrivateCustomTab);
            NearbyBlock nearbyBlock = monetizationConfiguration.nearbyBlock;
            if (nearbyBlock != null) {
                codedOutputByteBufferNano.m17254K(12, nearbyBlock, NearbyBlock.PROTOBUF_ADAPTER);
            }
            SeeTrialConfiguration seeTrialConfiguration = monetizationConfiguration.seeTrial;
            if (seeTrialConfiguration != null) {
                codedOutputByteBufferNano.m17254K(13, seeTrialConfiguration, SeeTrialConfiguration.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MonetizationConfiguration> JSON_ADAPTER = new ObjectJsonAdapter<MonetizationConfiguration>() { // from class: com.p1.mobile.putong.core.data.MonetizationConfiguration.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MonetizationConfiguration.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MonetizationConfiguration newInstance() {
            return new MonetizationConfiguration();
        }

        public boolean parseField(MonetizationConfiguration monetizationConfiguration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "willPayScore":
                    monetizationConfiguration.willPayScore = jsonParser.getValueAsInt();
                    return true;
                case "extConfig":
                    monetizationConfiguration.extConfig = MonetizationConfigurationExtConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "complaint":
                    monetizationConfiguration.complaint = MonetizationConfigurationHighRisk.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "showIndexNearbyTab":
                    monetizationConfiguration.showIndexNearbyTab = jsonParser.getValueAsBoolean();
                    return true;
                case "membershipDesc":
                    monetizationConfiguration.membershipDesc = JsonAdapter.parseMap(jsonParser, JsonAdapter.INT_BOXED_ADAPTER.MAP_ADAPTER(), str2);
                    return true;
                case "nearbyBlock":
                    monetizationConfiguration.nearbyBlock = NearbyBlock.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userTags":
                    monetizationConfiguration.userTags = UserTags.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "showPrivateCustomTab":
                    monetizationConfiguration.showPrivateCustomTab = jsonParser.getValueAsBoolean();
                    return true;
                case "seeTrial":
                    monetizationConfiguration.seeTrial = SeeTrialConfiguration.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "homeIconSee":
                    monetizationConfiguration.homeIconSee = HomeSeeVisitorConfigs.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "showCompliantEntry":
                    monetizationConfiguration.showCompliantEntry = jsonParser.getValueAsBoolean();
                    return true;
                case "buyDialogHidePrice":
                    monetizationConfiguration.buyDialogHidePrice = jsonParser.getValueAsBoolean();
                    return true;
                case "homeIconVisitor":
                    monetizationConfiguration.homeIconVisitor = HomeSeeVisitorConfigs.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MonetizationConfiguration monetizationConfiguration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "willPayScore":
                case "extConfig":
                case "complaint":
                case "showIndexNearbyTab":
                case "membershipDesc":
                case "nearbyBlock":
                case "userTags":
                case "showPrivateCustomTab":
                case "seeTrial":
                case "homeIconSee":
                case "showCompliantEntry":
                case "buyDialogHidePrice":
                case "homeIconVisitor":
                    return true;
                default:
                    return super.parseFieldCheck(monetizationConfiguration, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MonetizationConfiguration monetizationConfiguration, JsonGenerator jsonGenerator) throws IOException {
            if (monetizationConfiguration.complaint != null) {
                jsonGenerator.writeFieldName("complaint");
                MonetizationConfigurationHighRisk.JSON_ADAPTER.serialize(monetizationConfiguration.complaint, jsonGenerator, true);
            }
            if (monetizationConfiguration.userTags != null) {
                jsonGenerator.writeFieldName("userTags");
                UserTags.JSON_ADAPTER.serialize(monetizationConfiguration.userTags, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("showCompliantEntry", monetizationConfiguration.showCompliantEntry);
            jsonGenerator.writeBooleanField("buyDialogHidePrice", monetizationConfiguration.buyDialogHidePrice);
            if (monetizationConfiguration.homeIconSee != null) {
                jsonGenerator.writeFieldName("homeIconSee");
                HomeSeeVisitorConfigs.JSON_ADAPTER.serialize(monetizationConfiguration.homeIconSee, jsonGenerator, true);
            }
            if (monetizationConfiguration.homeIconVisitor != null) {
                jsonGenerator.writeFieldName("homeIconVisitor");
                HomeSeeVisitorConfigs.JSON_ADAPTER.serialize(monetizationConfiguration.homeIconVisitor, jsonGenerator, true);
            }
            if (monetizationConfiguration.extConfig != null) {
                jsonGenerator.writeFieldName("extConfig");
                MonetizationConfigurationExtConfig.JSON_ADAPTER.serialize(monetizationConfiguration.extConfig, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("willPayScore", monetizationConfiguration.willPayScore);
            jsonGenerator.writeBooleanField("showIndexNearbyTab", monetizationConfiguration.showIndexNearbyTab);
            if (monetizationConfiguration.membershipDesc != null) {
                jsonGenerator.writeFieldName("membershipDesc");
                JsonAdapter.serializeMap(monetizationConfiguration.membershipDesc, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER.MAP_ADAPTER());
            }
            jsonGenerator.writeBooleanField("showPrivateCustomTab", monetizationConfiguration.showPrivateCustomTab);
            if (monetizationConfiguration.nearbyBlock != null) {
                jsonGenerator.writeFieldName("nearbyBlock");
                NearbyBlock.JSON_ADAPTER.serialize(monetizationConfiguration.nearbyBlock, jsonGenerator, true);
            }
            if (monetizationConfiguration.seeTrial != null) {
                jsonGenerator.writeFieldName("seeTrial");
                SeeTrialConfiguration.JSON_ADAPTER.serialize(monetizationConfiguration.seeTrial, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MonetizationConfiguration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MonetizationConfiguration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m35694b(Integer num) {
        return num;
    }

    public static MonetizationConfiguration new_() {
        MonetizationConfiguration monetizationConfiguration = new MonetizationConfiguration();
        monetizationConfiguration.nullCheck();
        return monetizationConfiguration;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MonetizationConfiguration mo223809clone() {
        MonetizationConfiguration monetizationConfiguration = new MonetizationConfiguration();
        MonetizationConfigurationHighRisk monetizationConfigurationHighRisk = this.complaint;
        if (monetizationConfigurationHighRisk != null) {
            monetizationConfiguration.complaint = monetizationConfigurationHighRisk.mo223809clone();
        }
        UserTags userTags = this.userTags;
        if (userTags != null) {
            monetizationConfiguration.userTags = userTags.mo223809clone();
        }
        monetizationConfiguration.showCompliantEntry = this.showCompliantEntry;
        monetizationConfiguration.buyDialogHidePrice = this.buyDialogHidePrice;
        HomeSeeVisitorConfigs homeSeeVisitorConfigs = this.homeIconSee;
        if (homeSeeVisitorConfigs != null) {
            monetizationConfiguration.homeIconSee = homeSeeVisitorConfigs.mo223809clone();
        }
        HomeSeeVisitorConfigs homeSeeVisitorConfigs2 = this.homeIconVisitor;
        if (homeSeeVisitorConfigs2 != null) {
            monetizationConfiguration.homeIconVisitor = homeSeeVisitorConfigs2.mo223809clone();
        }
        MonetizationConfigurationExtConfig monetizationConfigurationExtConfig = this.extConfig;
        if (monetizationConfigurationExtConfig != null) {
            monetizationConfiguration.extConfig = monetizationConfigurationExtConfig.mo223809clone();
        }
        monetizationConfiguration.willPayScore = this.willPayScore;
        monetizationConfiguration.showIndexNearbyTab = this.showIndexNearbyTab;
        Map<String, Map<String, Integer>> map = this.membershipDesc;
        if (map != null) {
            monetizationConfiguration.membershipDesc = ValueObject.util_map(map, new w9j() { // from class: l.kx00
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ValueObject.util_map((Map) obj, new w9j() { // from class: l.jx00
                        @Override // p149l.w9j
                        public final Object call(Object obj2) {
                            return MonetizationConfiguration.m35694b((Integer) obj2);
                        }
                    });
                }
            });
        }
        monetizationConfiguration.showPrivateCustomTab = this.showPrivateCustomTab;
        NearbyBlock nearbyBlock = this.nearbyBlock;
        if (nearbyBlock != null) {
            monetizationConfiguration.nearbyBlock = nearbyBlock.mo223809clone();
        }
        SeeTrialConfiguration seeTrialConfiguration = this.seeTrial;
        if (seeTrialConfiguration != null) {
            monetizationConfiguration.seeTrial = seeTrialConfiguration.mo223809clone();
        }
        return monetizationConfiguration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MonetizationConfiguration)) {
            return false;
        }
        MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) obj;
        return ValueObject.util_equals(this.complaint, monetizationConfiguration.complaint) && ValueObject.util_equals(this.userTags, monetizationConfiguration.userTags) && this.showCompliantEntry == monetizationConfiguration.showCompliantEntry && this.buyDialogHidePrice == monetizationConfiguration.buyDialogHidePrice && ValueObject.util_equals(this.homeIconSee, monetizationConfiguration.homeIconSee) && ValueObject.util_equals(this.homeIconVisitor, monetizationConfiguration.homeIconVisitor) && ValueObject.util_equals(this.extConfig, monetizationConfiguration.extConfig) && this.willPayScore == monetizationConfiguration.willPayScore && this.showIndexNearbyTab == monetizationConfiguration.showIndexNearbyTab && ValueObject.util_equals(this.membershipDesc, monetizationConfiguration.membershipDesc) && this.showPrivateCustomTab == monetizationConfiguration.showPrivateCustomTab && ValueObject.util_equals(this.nearbyBlock, monetizationConfiguration.nearbyBlock) && ValueObject.util_equals(this.seeTrial, monetizationConfiguration.seeTrial);
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
        MonetizationConfigurationHighRisk monetizationConfigurationHighRisk = this.complaint;
        int iHashCode = (i2 + (monetizationConfigurationHighRisk != null ? monetizationConfigurationHighRisk.hashCode() : 0)) * 41;
        UserTags userTags = this.userTags;
        int iHashCode2 = (((((iHashCode + (userTags != null ? userTags.hashCode() : 0)) * 41) + (this.showCompliantEntry ? 1231 : 1237)) * 41) + (this.buyDialogHidePrice ? 1231 : 1237)) * 41;
        HomeSeeVisitorConfigs homeSeeVisitorConfigs = this.homeIconSee;
        int iHashCode3 = (iHashCode2 + (homeSeeVisitorConfigs != null ? homeSeeVisitorConfigs.hashCode() : 0)) * 41;
        HomeSeeVisitorConfigs homeSeeVisitorConfigs2 = this.homeIconVisitor;
        int iHashCode4 = (iHashCode3 + (homeSeeVisitorConfigs2 != null ? homeSeeVisitorConfigs2.hashCode() : 0)) * 41;
        MonetizationConfigurationExtConfig monetizationConfigurationExtConfig = this.extConfig;
        int iHashCode5 = (((((iHashCode4 + (monetizationConfigurationExtConfig != null ? monetizationConfigurationExtConfig.hashCode() : 0)) * 41) + this.willPayScore) * 41) + (this.showIndexNearbyTab ? 1231 : 1237)) * 41;
        Map<String, Map<String, Integer>> map = this.membershipDesc;
        int iHashCode6 = (((iHashCode5 + (map != null ? map.hashCode() : 0)) * 41) + (this.showPrivateCustomTab ? 1231 : 1237)) * 41;
        NearbyBlock nearbyBlock = this.nearbyBlock;
        int iHashCode7 = (iHashCode6 + (nearbyBlock != null ? nearbyBlock.hashCode() : 0)) * 41;
        SeeTrialConfiguration seeTrialConfiguration = this.seeTrial;
        int iHashCode8 = iHashCode7 + (seeTrialConfiguration != null ? seeTrialConfiguration.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.complaint == null) {
            this.complaint = MonetizationConfigurationHighRisk.new_();
        }
        if (this.userTags == null) {
            this.userTags = UserTags.new_();
        }
        if (this.membershipDesc == null) {
            this.membershipDesc = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
