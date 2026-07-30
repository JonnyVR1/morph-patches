package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveToolBar;
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
public class BLiveToolBar extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveToolBar> JSON_ADAPTER = new ObjectJsonAdapter<BLiveToolBar>() { // from class: com.p1.mobile.putong.live.base.data.BLiveToolBar.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveToolBar.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveToolBar newInstance() {
            return new BLiveToolBar();
        }

        public boolean parseField(BLiveToolBar bLiveToolBar, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("audienceButtonOrder")) {
                bLiveToolBar.audienceButtonOrder = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("anchorButtonOrder")) {
                return false;
            }
            bLiveToolBar.anchorButtonOrder = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveToolBar bLiveToolBar, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveToolBar.audienceButtonOrder != null) {
                jsonGenerator.writeFieldName("audienceButtonOrder");
                JsonAdapter.serializeArray(bLiveToolBar.audienceButtonOrder, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveToolBar.anchorButtonOrder != null) {
                jsonGenerator.writeFieldName("anchorButtonOrder");
                JsonAdapter.serializeArray(bLiveToolBar.anchorButtonOrder, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveToolBar) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetoolbar";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> anchorButtonOrder;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> audienceButtonOrder;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69452a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m69453b(String str) {
        return str;
    }

    public static BLiveToolBar new_() {
        BLiveToolBar bLiveToolBar = new BLiveToolBar();
        bLiveToolBar.nullCheck();
        return bLiveToolBar;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveToolBar mo225055clone() {
        BLiveToolBar bLiveToolBar = new BLiveToolBar();
        List<String> list = this.audienceButtonOrder;
        if (list != null) {
            bLiveToolBar.audienceButtonOrder = ValueObject.util_map(list, new qcj() { // from class: l.e72
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveToolBar.m69452a((String) obj);
                }
            });
        }
        List<String> list2 = this.anchorButtonOrder;
        if (list2 != null) {
            bLiveToolBar.anchorButtonOrder = ValueObject.util_map(list2, new qcj() { // from class: l.f72
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveToolBar.m69453b((String) obj);
                }
            });
        }
        return bLiveToolBar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveToolBar)) {
            return false;
        }
        BLiveToolBar bLiveToolBar = (BLiveToolBar) obj;
        return ValueObject.util_equals(this.audienceButtonOrder, bLiveToolBar.audienceButtonOrder) && ValueObject.util_equals(this.anchorButtonOrder, bLiveToolBar.anchorButtonOrder);
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
        List<String> list = this.audienceButtonOrder;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.anchorButtonOrder;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.audienceButtonOrder == null) {
            this.audienceButtonOrder = new ArrayList();
        }
        if (this.anchorButtonOrder == null) {
            this.anchorButtonOrder = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
