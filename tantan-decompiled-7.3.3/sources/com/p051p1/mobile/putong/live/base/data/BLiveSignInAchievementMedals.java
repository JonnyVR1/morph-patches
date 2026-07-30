package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInMedal;
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
public class BLiveSignInAchievementMedals extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSignInAchievementMedals> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSignInAchievementMedals>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSignInAchievementMedals.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSignInAchievementMedals newInstance() {
            return new BLiveSignInAchievementMedals();
        }

        public boolean parseField(BLiveSignInAchievementMedals bLiveSignInAchievementMedals, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "medals":
                    bLiveSignInAchievementMedals.medals = JsonAdapter.parseArray(jsonParser, BLiveSignInMedal.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "progress":
                    bLiveSignInAchievementMedals.progress = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "explainContents":
                    bLiveSignInAchievementMedals.explainContents = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSignInAchievementMedals bLiveSignInAchievementMedals, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveSignInAchievementMedals.medals != null) {
                jsonGenerator.writeFieldName("medals");
                JsonAdapter.serializeArray(bLiveSignInAchievementMedals.medals, jsonGenerator, BLiveSignInMedal.JSON_ADAPTER);
            }
            if (bLiveSignInAchievementMedals.progress != null) {
                jsonGenerator.writeFieldName("progress");
                JsonAdapter.serializeArray(bLiveSignInAchievementMedals.progress, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (bLiveSignInAchievementMedals.explainContents != null) {
                jsonGenerator.writeFieldName("explainContents");
                JsonAdapter.serializeArray(bLiveSignInAchievementMedals.explainContents, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSignInAchievementMedals) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesigninachievementmedals";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> explainContents;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveSignInMedal> medals;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Integer> progress;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69408a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m69409b(Integer num) {
        return num;
    }

    public static BLiveSignInAchievementMedals new_() {
        BLiveSignInAchievementMedals bLiveSignInAchievementMedals = new BLiveSignInAchievementMedals();
        bLiveSignInAchievementMedals.nullCheck();
        return bLiveSignInAchievementMedals;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSignInAchievementMedals mo225055clone() {
        BLiveSignInAchievementMedals bLiveSignInAchievementMedals = new BLiveSignInAchievementMedals();
        List<BLiveSignInMedal> list = this.medals;
        if (list != null) {
            bLiveSignInAchievementMedals.medals = ValueObject.util_map(list, new qcj() { // from class: l.y52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSignInMedal) obj).mo225055clone();
                }
            });
        }
        List<Integer> list2 = this.progress;
        if (list2 != null) {
            bLiveSignInAchievementMedals.progress = ValueObject.util_map(list2, new qcj() { // from class: l.z52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveSignInAchievementMedals.m69409b((Integer) obj);
                }
            });
        }
        List<String> list3 = this.explainContents;
        if (list3 != null) {
            bLiveSignInAchievementMedals.explainContents = ValueObject.util_map(list3, new qcj() { // from class: l.a62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveSignInAchievementMedals.m69408a((String) obj);
                }
            });
        }
        return bLiveSignInAchievementMedals;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSignInAchievementMedals)) {
            return false;
        }
        BLiveSignInAchievementMedals bLiveSignInAchievementMedals = (BLiveSignInAchievementMedals) obj;
        return ValueObject.util_equals(this.medals, bLiveSignInAchievementMedals.medals) && ValueObject.util_equals(this.progress, bLiveSignInAchievementMedals.progress) && ValueObject.util_equals(this.explainContents, bLiveSignInAchievementMedals.explainContents);
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
        List<BLiveSignInMedal> list = this.medals;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Integer> list2 = this.progress;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.explainContents;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.medals == null) {
            this.medals = new ArrayList();
        }
        if (this.progress == null) {
            this.progress = new ArrayList();
        }
        if (this.explainContents == null) {
            this.explainContents = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
