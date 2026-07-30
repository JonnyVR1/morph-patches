package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.RegionRule;
import com.p000p1.mobile.putong.core.data.RegionRuleTag;
import com.p1.mobile.putong.data.LiveRegionTag;
import com.p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class RegionRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "regionrule";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f154id;

    @NonNull
    @ProtobufIndex(index = 4)
    public LiveRegionTag liveRegionTag;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<RegionRuleTag> tags;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String userId;
    public static ProtobufAdapter<RegionRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<RegionRule>() { // from class: com.p1.mobile.putong.core.data.RegionRule.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RegionRule regionRule) {
            String str = regionRule.f154id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = regionRule.userId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<RegionRuleTag> list = regionRule.tags;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, RegionRuleTag.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LiveRegionTag liveRegionTag = regionRule.liveRegionTag;
            if (liveRegionTag != null) {
                iO += CodedOutputByteBufferNano.h(4, liveRegionTag.ordinal());
            }
            List<RegionRuleTag> list2 = regionRule.tags;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(5, list2, RegionRuleTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LiveRegionTag liveRegionTag2 = regionRule.liveRegionTag;
            if (liveRegionTag2 != null) {
                iO += CodedOutputByteBufferNano.l(6, liveRegionTag2, LiveRegionTag.PROTOBUF_ADAPTER);
            }
            ((MessageNano) regionRule).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RegionRule m15363parse(nb5 nb5Var) throws IOException {
            RegionRule regionRule = new RegionRule();
            List list = null;
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (regionRule.tags == null && list != null) {
                        regionRule.tags = RegionRuleTag.oldEnumCovertList(list);
                    }
                    if (regionRule.liveRegionTag == null && numValueOf != null) {
                        regionRule.liveRegionTag = LiveRegionTag.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (regionRule.f154id == null) {
                        regionRule.f154id = "";
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
                    regionRule.liveRegionTag = LiveRegionTag.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    regionRule.f154id = nb5Var.s();
                } else if (iU == 18) {
                    regionRule.userId = nb5Var.s();
                } else if (iU == 26) {
                    list = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 32) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 42) {
                    regionRule.tags = (List) nb5Var.l(RegionRuleTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 50) {
                        if (regionRule.tags == null && list != null) {
                            regionRule.tags = RegionRuleTag.oldEnumCovertList(list);
                        }
                        if (regionRule.liveRegionTag == null && numValueOf != null) {
                            regionRule.liveRegionTag = LiveRegionTag.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (regionRule.f154id == null) {
                            regionRule.f154id = "";
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
                        regionRule.liveRegionTag = LiveRegionTag.JSON_ADAPTER.defaultEnum();
                        return regionRule;
                    }
                    regionRule.liveRegionTag = (LiveRegionTag) nb5Var.l(LiveRegionTag.PROTOBUF_ADAPTER);
                }
            }
            return regionRule;
        }

        public void serialize(RegionRule regionRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = regionRule.f154id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = regionRule.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<RegionRuleTag> list = regionRule.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(3, RegionRuleTag.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LiveRegionTag liveRegionTag = regionRule.liveRegionTag;
            if (liveRegionTag != null) {
                codedOutputByteBufferNano.G(4, liveRegionTag.ordinal());
            }
            List<RegionRuleTag> list2 = regionRule.tags;
            if (list2 != null) {
                codedOutputByteBufferNano.K(5, list2, RegionRuleTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LiveRegionTag liveRegionTag2 = regionRule.liveRegionTag;
            if (liveRegionTag2 != null) {
                codedOutputByteBufferNano.K(6, liveRegionTag2, LiveRegionTag.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RegionRule> JSON_ADAPTER = new ObjectJsonAdapter<RegionRule>() { // from class: com.p1.mobile.putong.core.data.RegionRule.2
        public Class getDataClass() {
            return RegionRule.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RegionRule m15364newInstance() {
            return new RegionRule();
        }

        public boolean parseField(RegionRule regionRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    regionRule.userId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    regionRule.f154id = jsonParser.getValueAsString();
                    return false;
                case "tags":
                    regionRule.tags = JsonAdapter.parseArray(jsonParser, RegionRuleTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "liveRegionTag":
                    regionRule.liveRegionTag = (LiveRegionTag) LiveRegionTag.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(RegionRule regionRule, JsonGenerator jsonGenerator) throws IOException {
            String str = regionRule.f154id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RegionRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RegionRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ RegionRuleTag m618a(RegionRuleTag regionRuleTag) {
        return regionRuleTag;
    }

    public static RegionRule new_() {
        RegionRule regionRule = new RegionRule();
        regionRule.nullCheck();
        return regionRule;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RegionRule m15362clone() {
        RegionRule regionRule = new RegionRule();
        regionRule.f154id = this.f154id;
        regionRule.userId = this.userId;
        List<RegionRuleTag> list = this.tags;
        if (list != null) {
            regionRule.tags = ValueObject.util_map(list, new w9j() { // from class: l.lnc0
                public final Object call(Object obj) {
                    return RegionRule.m618a((RegionRuleTag) obj);
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
        return ValueObject.util_equals(this.f154id, regionRule.f154id) && ValueObject.util_equals(this.userId, regionRule.userId) && ValueObject.util_equals(this.tags, regionRule.tags) && ValueObject.util_equals(this.liveRegionTag, regionRule.liveRegionTag);
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
        String str = this.f154id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<RegionRuleTag> list = this.tags;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        LiveRegionTag liveRegionTag = this.liveRegionTag;
        int iHashCode4 = iHashCode3 + (liveRegionTag != null ? liveRegionTag.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f154id == null) {
            this.f154id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.liveRegionTag == null) {
            this.liveRegionTag = LiveRegionTag.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
