package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLivePkSummaryTab;
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
public class BLivePkSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkSummary.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkSummary newInstance() {
            return new BLivePkSummary();
        }

        public boolean parseField(BLivePkSummary bLivePkSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "winTimes":
                    bLivePkSummary.winTimes = jsonParser.getValueAsLong();
                    return true;
                case "bountyWinTimes":
                    bLivePkSummary.bountyWinTimes = jsonParser.getValueAsLong();
                    return true;
                case "tabs":
                    bLivePkSummary.tabs = JsonAdapter.parseArray(jsonParser, BLivePkSummaryTab.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "canJoinBountyPk":
                    bLivePkSummary.canJoinBountyPk = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkSummary bLivePkSummary, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("winTimes", bLivePkSummary.winTimes);
            jsonGenerator.writeNumberField("bountyWinTimes", bLivePkSummary.bountyWinTimes);
            jsonGenerator.writeBooleanField("canJoinBountyPk", bLivePkSummary.canJoinBountyPk);
            if (bLivePkSummary.tabs != null) {
                jsonGenerator.writeFieldName("tabs");
                JsonAdapter.serializeArray(bLivePkSummary.tabs, jsonGenerator, BLivePkSummaryTab.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepksummary";

    @ProtobufIndex(index = 2)
    public long bountyWinTimes;

    @ProtobufIndex(index = 3)
    public boolean canJoinBountyPk;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLivePkSummaryTab> tabs;

    @ProtobufIndex(index = 1)
    public long winTimes;

    public static BLivePkSummary new_() {
        BLivePkSummary bLivePkSummary = new BLivePkSummary();
        bLivePkSummary.nullCheck();
        return bLivePkSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkSummary mo225055clone() {
        BLivePkSummary bLivePkSummary = new BLivePkSummary();
        bLivePkSummary.winTimes = this.winTimes;
        bLivePkSummary.bountyWinTimes = this.bountyWinTimes;
        bLivePkSummary.canJoinBountyPk = this.canJoinBountyPk;
        List<BLivePkSummaryTab> list = this.tabs;
        if (list != null) {
            bLivePkSummary.tabs = ValueObject.util_map(list, new qcj() { // from class: l.t42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePkSummaryTab) obj).mo225055clone();
                }
            });
        }
        return bLivePkSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkSummary)) {
            return false;
        }
        BLivePkSummary bLivePkSummary = (BLivePkSummary) obj;
        return this.winTimes == bLivePkSummary.winTimes && this.bountyWinTimes == bLivePkSummary.bountyWinTimes && this.canJoinBountyPk == bLivePkSummary.canJoinBountyPk && ValueObject.util_equals(this.tabs, bLivePkSummary.tabs);
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
        long j = this.winTimes;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.bountyWinTimes;
        int i3 = (((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + (this.canJoinBountyPk ? 1231 : 1237)) * 41;
        List<BLivePkSummaryTab> list = this.tabs;
        int iHashCode = i3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tabs == null) {
            this.tabs = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
