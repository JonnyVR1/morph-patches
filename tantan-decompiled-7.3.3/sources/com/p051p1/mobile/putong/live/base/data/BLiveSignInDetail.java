package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInTask;
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
public class BLiveSignInDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSignInDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSignInDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSignInDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSignInDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSignInDetail newInstance() {
            return new BLiveSignInDetail();
        }

        public boolean parseField(BLiveSignInDetail bLiveSignInDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cyclicTasks":
                    bLiveSignInDetail.cyclicTasks = BLiveSignInCycleTask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "unReceivedTasks":
                    bLiveSignInDetail.unReceivedTasks = JsonAdapter.parseArray(jsonParser, BLiveSignInTask.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "unFinishedTasks":
                    bLiveSignInDetail.unFinishedTasks = JsonAdapter.parseArray(jsonParser, BLiveSignInTask.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "signInCount":
                    bLiveSignInDetail.signInCount = jsonParser.getValueAsInt();
                    return true;
                case "signInPeriod":
                    bLiveSignInDetail.signInPeriod = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSignInDetail bLiveSignInDetail, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("signInCount", bLiveSignInDetail.signInCount);
            String str = bLiveSignInDetail.signInPeriod;
            if (str != null) {
                jsonGenerator.writeStringField("signInPeriod", str);
            }
            if (bLiveSignInDetail.unFinishedTasks != null) {
                jsonGenerator.writeFieldName("unFinishedTasks");
                JsonAdapter.serializeArray(bLiveSignInDetail.unFinishedTasks, jsonGenerator, BLiveSignInTask.JSON_ADAPTER);
            }
            if (bLiveSignInDetail.unReceivedTasks != null) {
                jsonGenerator.writeFieldName("unReceivedTasks");
                JsonAdapter.serializeArray(bLiveSignInDetail.unReceivedTasks, jsonGenerator, BLiveSignInTask.JSON_ADAPTER);
            }
            if (bLiveSignInDetail.cyclicTasks != null) {
                jsonGenerator.writeFieldName("cyclicTasks");
                BLiveSignInCycleTask.JSON_ADAPTER.serialize(bLiveSignInDetail.cyclicTasks, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSignInDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesignindetail";

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveSignInCycleTask cyclicTasks;

    @ProtobufIndex(index = 1)
    public int signInCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public String signInPeriod;

    @Nullable
    @ProtobufIndex(index = 3)
    public List<BLiveSignInTask> unFinishedTasks;

    @Nullable
    @ProtobufIndex(index = 4)
    public List<BLiveSignInTask> unReceivedTasks;

    public static BLiveSignInDetail new_() {
        BLiveSignInDetail bLiveSignInDetail = new BLiveSignInDetail();
        bLiveSignInDetail.nullCheck();
        return bLiveSignInDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSignInDetail mo225055clone() {
        BLiveSignInDetail bLiveSignInDetail = new BLiveSignInDetail();
        bLiveSignInDetail.signInCount = this.signInCount;
        bLiveSignInDetail.signInPeriod = this.signInPeriod;
        List<BLiveSignInTask> list = this.unFinishedTasks;
        if (list != null) {
            bLiveSignInDetail.unFinishedTasks = ValueObject.util_map(list, new qcj() { // from class: l.c62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSignInTask) obj).mo225055clone();
                }
            });
        }
        List<BLiveSignInTask> list2 = this.unReceivedTasks;
        if (list2 != null) {
            bLiveSignInDetail.unReceivedTasks = ValueObject.util_map(list2, new qcj() { // from class: l.d62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSignInTask) obj).mo225055clone();
                }
            });
        }
        BLiveSignInCycleTask bLiveSignInCycleTask = this.cyclicTasks;
        if (bLiveSignInCycleTask != null) {
            bLiveSignInDetail.cyclicTasks = bLiveSignInCycleTask.mo225055clone();
        }
        return bLiveSignInDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSignInDetail)) {
            return false;
        }
        BLiveSignInDetail bLiveSignInDetail = (BLiveSignInDetail) obj;
        return this.signInCount == bLiveSignInDetail.signInCount && ValueObject.util_equals(this.signInPeriod, bLiveSignInDetail.signInPeriod) && ValueObject.util_equals(this.unFinishedTasks, bLiveSignInDetail.unFinishedTasks) && ValueObject.util_equals(this.unReceivedTasks, bLiveSignInDetail.unReceivedTasks) && ValueObject.util_equals(this.cyclicTasks, bLiveSignInDetail.cyclicTasks);
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
        int i2 = ((i * 41) + this.signInCount) * 41;
        String str = this.signInPeriod;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveSignInTask> list = this.unFinishedTasks;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveSignInTask> list2 = this.unReceivedTasks;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        BLiveSignInCycleTask bLiveSignInCycleTask = this.cyclicTasks;
        int iHashCode4 = iHashCode3 + (bLiveSignInCycleTask != null ? bLiveSignInCycleTask.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.signInPeriod == null) {
            this.signInPeriod = "";
        }
        if (this.cyclicTasks == null) {
            this.cyclicTasks = BLiveSignInCycleTask.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
