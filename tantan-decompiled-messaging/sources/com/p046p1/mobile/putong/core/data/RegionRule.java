package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.RegionRule;
import com.p046p1.mobile.putong.core.data.RegionRuleTag;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class RegionRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "regionrule";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20492id;

    @NonNull
    @ProtobufIndex(index = 4)
    public LiveRegionTag liveRegionTag;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<RegionRuleTag> tags;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;
    public static ProtobufAdapter<RegionRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<RegionRule>() { // from class: com.p1.mobile.putong.core.data.RegionRule.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RegionRule regionRule) {
            String str = regionRule.f20492id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = regionRule.userId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            List<RegionRuleTag> list = regionRule.tags;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, RegionRuleTag.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LiveRegionTag liveRegionTag = regionRule.liveRegionTag;
            if (liveRegionTag != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(4, liveRegionTag.ordinal());
            }
            List<RegionRuleTag> list2 = regionRule.tags;
            if (list2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, list2, RegionRuleTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LiveRegionTag liveRegionTag2 = regionRule.liveRegionTag;
            if (liveRegionTag2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, liveRegionTag2, LiveRegionTag.PROTOBUF_ADAPTER);
            }
            regionRule.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RegionRule parse(nb5 nb5Var) throws IOException {
            RegionRule regionRule = new RegionRule();
            List list = null;
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (regionRule.tags == null && list != null) {
                        regionRule.tags = RegionRuleTag.oldEnumCovertList(list);
                    }
                    if (regionRule.liveRegionTag == null && numValueOf != null) {
                        regionRule.liveRegionTag = (LiveRegionTag) LiveRegionTag.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (regionRule.f20492id == null) {
                        regionRule.f20492id = "";
                    }
                    if (regionRule.userId == null) {
                        regionRule.userId = "";
                    }
                    if (regionRule.tags == null) {
                        regionRule.tags = new ArrayList();
                    }
                    if (regionRule.liveRegionTag != null) {
                        break;
                    }
                    regionRule.liveRegionTag = (LiveRegionTag) LiveRegionTag.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 10) {
                    regionRule.f20492id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    regionRule.userId = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    list = (List) nb5Var.m158743l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 32) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 42) {
                    regionRule.tags = (List) nb5Var.m158743l(RegionRuleTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 50) {
                        if (regionRule.tags == null && list != null) {
                            regionRule.tags = RegionRuleTag.oldEnumCovertList(list);
                        }
                        if (regionRule.liveRegionTag == null && numValueOf != null) {
                            regionRule.liveRegionTag = (LiveRegionTag) LiveRegionTag.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (regionRule.f20492id == null) {
                            regionRule.f20492id = "";
                        }
                        if (regionRule.userId == null) {
                            regionRule.userId = "";
                        }
                        if (regionRule.tags == null) {
                            regionRule.tags = new ArrayList();
                        }
                        if (regionRule.liveRegionTag != null) {
                            break;
                        }
                        regionRule.liveRegionTag = (LiveRegionTag) LiveRegionTag.JSON_ADAPTER.defaultEnum();
                        return regionRule;
                    }
                    regionRule.liveRegionTag = (LiveRegionTag) nb5Var.m158743l(LiveRegionTag.PROTOBUF_ADAPTER);
                }
            }
            return regionRule;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RegionRule regionRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = regionRule.f20492id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = regionRule.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            List<RegionRuleTag> list = regionRule.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, RegionRuleTag.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LiveRegionTag liveRegionTag = regionRule.liveRegionTag;
            if (liveRegionTag != null) {
                codedOutputByteBufferNano.m17250G(4, liveRegionTag.ordinal());
            }
            List<RegionRuleTag> list2 = regionRule.tags;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(5, list2, RegionRuleTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LiveRegionTag liveRegionTag2 = regionRule.liveRegionTag;
            if (liveRegionTag2 != null) {
                codedOutputByteBufferNano.m17254K(6, liveRegionTag2, LiveRegionTag.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RegionRule> JSON_ADAPTER = new ObjectJsonAdapter<RegionRule>() { // from class: com.p1.mobile.putong.core.data.RegionRule.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RegionRule.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RegionRule newInstance() {
            return new RegionRule();
        }

        public boolean parseField(RegionRule regionRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    regionRule.userId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    regionRule.f20492id = jsonParser.getValueAsString();
                    return false;
                case "tags":
                    regionRule.tags = JsonAdapter.parseArray(jsonParser, RegionRuleTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "liveRegionTag":
                    regionRule.liveRegionTag = LiveRegionTag.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RegionRule regionRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                    return true;
                case "id":
                    return false;
                case "tags":
                case "liveRegionTag":
                    return true;
                default:
                    return super.parseFieldCheck(regionRule, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RegionRule regionRule, JsonGenerator jsonGenerator) throws IOException {
            String str = regionRule.f20492id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = regionRule.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            if (regionRule.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(regionRule.tags, jsonGenerator, RegionRuleTag.JSON_ADAPTER);
            }
            if (regionRule.liveRegionTag != null) {
                jsonGenerator.writeFieldName("liveRegionTag");
                LiveRegionTag.JSON_ADAPTER.serialize(regionRule.liveRegionTag, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RegionRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RegionRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ RegionRuleTag m35816a(RegionRuleTag regionRuleTag) {
        return regionRuleTag;
    }

    public static RegionRule new_() {
        RegionRule regionRule = new RegionRule();
        regionRule.nullCheck();
        return regionRule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RegionRule mo223809clone() {
        RegionRule regionRule = new RegionRule();
        regionRule.f20492id = this.f20492id;
        regionRule.userId = this.userId;
        List<RegionRuleTag> list = this.tags;
        if (list != null) {
            regionRule.tags = ValueObject.util_map(list, new w9j() { // from class: l.lnc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return RegionRule.m35816a((RegionRuleTag) obj);
                }
            });
        }
        regionRule.liveRegionTag = this.liveRegionTag;
        return regionRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegionRule)) {
            return false;
        }
        RegionRule regionRule = (RegionRule) obj;
        return ValueObject.util_equals(this.f20492id, regionRule.f20492id) && ValueObject.util_equals(this.userId, regionRule.userId) && ValueObject.util_equals(this.tags, regionRule.tags) && ValueObject.util_equals(this.liveRegionTag, regionRule.liveRegionTag);
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
        String str = this.f20492id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<RegionRuleTag> list = this.tags;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        LiveRegionTag liveRegionTag = this.liveRegionTag;
        int iHashCode4 = iHashCode3 + (liveRegionTag != null ? liveRegionTag.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20492id == null) {
            this.f20492id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.liveRegionTag == null) {
            this.liveRegionTag = (LiveRegionTag) LiveRegionTag.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
