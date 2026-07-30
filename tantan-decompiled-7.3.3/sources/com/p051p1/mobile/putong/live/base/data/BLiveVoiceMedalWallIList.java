package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItem;
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
public class BLiveVoiceMedalWallIList extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceMedalWallIList> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceMedalWallIList>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceMedalWallIList.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceMedalWallIList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceMedalWallIList newInstance() {
            return new BLiveVoiceMedalWallIList();
        }

        public boolean parseField(BLiveVoiceMedalWallIList bLiveVoiceMedalWallIList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("medals")) {
                return false;
            }
            bLiveVoiceMedalWallIList.medals = JsonAdapter.parseArray(jsonParser, BLiveVoiceMedalWallItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceMedalWallIList bLiveVoiceMedalWallIList, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceMedalWallIList.medals != null) {
                jsonGenerator.writeFieldName("medals");
                JsonAdapter.serializeArray(bLiveVoiceMedalWallIList.medals, jsonGenerator, BLiveVoiceMedalWallItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceMedalWallIList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicemedalwallilist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveVoiceMedalWallItem> medals;

    public static BLiveVoiceMedalWallIList new_() {
        BLiveVoiceMedalWallIList bLiveVoiceMedalWallIList = new BLiveVoiceMedalWallIList();
        bLiveVoiceMedalWallIList.nullCheck();
        return bLiveVoiceMedalWallIList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceMedalWallIList mo225055clone() {
        BLiveVoiceMedalWallIList bLiveVoiceMedalWallIList = new BLiveVoiceMedalWallIList();
        List<BLiveVoiceMedalWallItem> list = this.medals;
        if (list != null) {
            bLiveVoiceMedalWallIList.medals = ValueObject.util_map(list, new qcj() { // from class: l.l92
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceMedalWallItem) obj).mo225055clone();
                }
            });
        }
        return bLiveVoiceMedalWallIList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveVoiceMedalWallIList) {
            return ValueObject.util_equals(this.medals, ((BLiveVoiceMedalWallIList) obj).medals);
        }
        return false;
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
        List<BLiveVoiceMedalWallItem> list = this.medals;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.medals == null) {
            this.medals = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
