package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummaryFrame;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAnchorKnightInfos extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAnchorKnightInfos> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAnchorKnightInfos>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAnchorKnightInfos.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAnchorKnightInfos.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAnchorKnightInfos newInstance() {
            return new BLiveAnchorKnightInfos();
        }

        public boolean parseField(BLiveAnchorKnightInfos bLiveAnchorKnightInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "onlineKnights":
                    bLiveAnchorKnightInfos.onlineKnights = JsonAdapter.parseArray(jsonParser, BLiveUserKnightInfoSummary.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "knightsRuleInfos":
                    bLiveAnchorKnightInfos.knightsRuleInfos = BLiveUserKnightInfoSummaryFrame.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "users":
                    bLiveAnchorKnightInfos.users = JsonAdapter.parseArray(jsonParser, BLiveUserKnightInfoSummaryFrame.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "potentialKnights":
                    bLiveAnchorKnightInfos.potentialKnights = JsonAdapter.parseArray(jsonParser, BLiveUserKnightInfoSummary.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAnchorKnightInfos bLiveAnchorKnightInfos, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveAnchorKnightInfos.potentialKnights != null) {
                jsonGenerator.writeFieldName("potentialKnights");
                JsonAdapter.serializeArray(bLiveAnchorKnightInfos.potentialKnights, jsonGenerator, BLiveUserKnightInfoSummary.JSON_ADAPTER);
            }
            if (bLiveAnchorKnightInfos.onlineKnights != null) {
                jsonGenerator.writeFieldName("onlineKnights");
                JsonAdapter.serializeArray(bLiveAnchorKnightInfos.onlineKnights, jsonGenerator, BLiveUserKnightInfoSummary.JSON_ADAPTER);
            }
            if (bLiveAnchorKnightInfos.knightsRuleInfos != null) {
                jsonGenerator.writeFieldName("knightsRuleInfos");
                BLiveUserKnightInfoSummaryFrame.JSON_ADAPTER.serialize(bLiveAnchorKnightInfos.knightsRuleInfos, jsonGenerator, true);
            }
            if (bLiveAnchorKnightInfos.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(bLiveAnchorKnightInfos.users, jsonGenerator, BLiveUserKnightInfoSummaryFrame.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAnchorKnightInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveanchorknightinfos";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveUserKnightInfoSummaryFrame knightsRuleInfos;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveUserKnightInfoSummary> onlineKnights;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveUserKnightInfoSummary> potentialKnights;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveUserKnightInfoSummaryFrame> users;

    public static BLiveAnchorKnightInfos new_() {
        BLiveAnchorKnightInfos bLiveAnchorKnightInfos = new BLiveAnchorKnightInfos();
        bLiveAnchorKnightInfos.nullCheck();
        return bLiveAnchorKnightInfos;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAnchorKnightInfos mo225055clone() {
        BLiveAnchorKnightInfos bLiveAnchorKnightInfos = new BLiveAnchorKnightInfos();
        List<BLiveUserKnightInfoSummary> list = this.potentialKnights;
        if (list != null) {
            bLiveAnchorKnightInfos.potentialKnights = ValueObject.util_map(list, new qcj() { // from class: l.hr1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserKnightInfoSummary) obj).mo225055clone();
                }
            });
        }
        List<BLiveUserKnightInfoSummary> list2 = this.onlineKnights;
        if (list2 != null) {
            bLiveAnchorKnightInfos.onlineKnights = ValueObject.util_map(list2, new qcj() { // from class: l.ir1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserKnightInfoSummary) obj).mo225055clone();
                }
            });
        }
        BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame = this.knightsRuleInfos;
        if (bLiveUserKnightInfoSummaryFrame != null) {
            bLiveAnchorKnightInfos.knightsRuleInfos = bLiveUserKnightInfoSummaryFrame.mo225055clone();
        }
        List<BLiveUserKnightInfoSummaryFrame> list3 = this.users;
        if (list3 != null) {
            bLiveAnchorKnightInfos.users = ValueObject.util_map(list3, new qcj() { // from class: l.jr1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserKnightInfoSummaryFrame) obj).mo225055clone();
                }
            });
        }
        return bLiveAnchorKnightInfos;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAnchorKnightInfos)) {
            return false;
        }
        BLiveAnchorKnightInfos bLiveAnchorKnightInfos = (BLiveAnchorKnightInfos) obj;
        return ValueObject.util_equals(this.potentialKnights, bLiveAnchorKnightInfos.potentialKnights) && ValueObject.util_equals(this.onlineKnights, bLiveAnchorKnightInfos.onlineKnights) && ValueObject.util_equals(this.knightsRuleInfos, bLiveAnchorKnightInfos.knightsRuleInfos) && ValueObject.util_equals(this.users, bLiveAnchorKnightInfos.users);
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
        List<BLiveUserKnightInfoSummary> list = this.potentialKnights;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveUserKnightInfoSummary> list2 = this.onlineKnights;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame = this.knightsRuleInfos;
        int iHashCode3 = (iHashCode2 + (bLiveUserKnightInfoSummaryFrame != null ? bLiveUserKnightInfoSummaryFrame.hashCode() : 0)) * 41;
        List<BLiveUserKnightInfoSummaryFrame> list3 = this.users;
        int iHashCode4 = iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.potentialKnights == null) {
            this.potentialKnights = new ArrayList();
        }
        if (this.onlineKnights == null) {
            this.onlineKnights = new ArrayList();
        }
        if (this.knightsRuleInfos == null) {
            this.knightsRuleInfos = BLiveUserKnightInfoSummaryFrame.new_();
        }
        if (this.users == null) {
            this.users = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
