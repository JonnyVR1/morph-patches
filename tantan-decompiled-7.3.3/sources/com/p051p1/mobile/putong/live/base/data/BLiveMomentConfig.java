package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveMomentConfigItem;
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
public class BLiveMomentConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMomentConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMomentConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMomentConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMomentConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMomentConfig newInstance() {
            return new BLiveMomentConfig();
        }

        public boolean parseField(BLiveMomentConfig bLiveMomentConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("textList")) {
                bLiveMomentConfig.textList = JsonAdapter.parseArray(jsonParser, BLiveMomentConfigItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("minGradeShow")) {
                return false;
            }
            bLiveMomentConfig.minGradeShow = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMomentConfig bLiveMomentConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("minGradeShow", bLiveMomentConfig.minGradeShow);
            if (bLiveMomentConfig.textList != null) {
                jsonGenerator.writeFieldName("textList");
                JsonAdapter.serializeArray(bLiveMomentConfig.textList, jsonGenerator, BLiveMomentConfigItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMomentConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemomentconfig";

    @ProtobufIndex(index = 1)
    public int minGradeShow;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveMomentConfigItem> textList;

    public static BLiveMomentConfig new_() {
        BLiveMomentConfig bLiveMomentConfig = new BLiveMomentConfig();
        bLiveMomentConfig.nullCheck();
        return bLiveMomentConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMomentConfig mo225055clone() {
        BLiveMomentConfig bLiveMomentConfig = new BLiveMomentConfig();
        bLiveMomentConfig.minGradeShow = this.minGradeShow;
        List<BLiveMomentConfigItem> list = this.textList;
        if (list != null) {
            bLiveMomentConfig.textList = ValueObject.util_map(list, new qcj() { // from class: l.y22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMomentConfigItem) obj).mo225055clone();
                }
            });
        }
        return bLiveMomentConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMomentConfig)) {
            return false;
        }
        BLiveMomentConfig bLiveMomentConfig = (BLiveMomentConfig) obj;
        return this.minGradeShow == bLiveMomentConfig.minGradeShow && ValueObject.util_equals(this.textList, bLiveMomentConfig.textList);
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
        int i2 = ((i * 41) + this.minGradeShow) * 41;
        List<BLiveMomentConfigItem> list = this.textList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.textList == null) {
            this.textList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
