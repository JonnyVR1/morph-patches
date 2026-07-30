package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveMedal;
import com.sina.weibo.sdk.constant.WBConstants;
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
public class BLiveMedals extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMedals> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMedals>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMedals.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMedals.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMedals newInstance() {
            return new BLiveMedals();
        }

        public boolean parseField(BLiveMedals bLiveMedals, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "fanbaseMedals":
                    bLiveMedals.fanbaseMedals = JsonAdapter.parseArray(jsonParser, BLiveFanBaseMedal.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "medals":
                    bLiveMedals.medals = JsonAdapter.parseArray(jsonParser, BLiveMedal.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "version":
                    bLiveMedals.version = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMedals bLiveMedals, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMedals.version;
            if (str != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str);
            }
            if (bLiveMedals.medals != null) {
                jsonGenerator.writeFieldName("medals");
                JsonAdapter.serializeArray(bLiveMedals.medals, jsonGenerator, BLiveMedal.JSON_ADAPTER);
            }
            if (bLiveMedals.fanbaseMedals != null) {
                jsonGenerator.writeFieldName("fanbaseMedals");
                JsonAdapter.serializeArray(bLiveMedals.fanbaseMedals, jsonGenerator, BLiveFanBaseMedal.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMedals) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemedals";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveFanBaseMedal> fanbaseMedals;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveMedal> medals;

    @NonNull
    @ProtobufIndex(index = 1)
    public String version;

    public static BLiveMedals new_() {
        BLiveMedals bLiveMedals = new BLiveMedals();
        bLiveMedals.nullCheck();
        return bLiveMedals;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMedals mo225055clone() {
        BLiveMedals bLiveMedals = new BLiveMedals();
        bLiveMedals.version = this.version;
        List<BLiveMedal> list = this.medals;
        if (list != null) {
            bLiveMedals.medals = ValueObject.util_map(list, new qcj() { // from class: l.o22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMedal) obj).mo225055clone();
                }
            });
        }
        List<BLiveFanBaseMedal> list2 = this.fanbaseMedals;
        if (list2 != null) {
            bLiveMedals.fanbaseMedals = ValueObject.util_map(list2, new qcj() { // from class: l.p22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveFanBaseMedal) obj).mo225055clone();
                }
            });
        }
        return bLiveMedals;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMedals)) {
            return false;
        }
        BLiveMedals bLiveMedals = (BLiveMedals) obj;
        return ValueObject.util_equals(this.version, bLiveMedals.version) && ValueObject.util_equals(this.medals, bLiveMedals.medals) && ValueObject.util_equals(this.fanbaseMedals, bLiveMedals.fanbaseMedals);
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
        String str = this.version;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveMedal> list = this.medals;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveFanBaseMedal> list2 = this.fanbaseMedals;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.version == null) {
            this.version = "";
        }
        if (this.medals == null) {
            this.medals = new ArrayList();
        }
        if (this.fanbaseMedals == null) {
            this.fanbaseMedals = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
