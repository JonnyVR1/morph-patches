package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallInteractTextItem;
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
public class BLiveNewGiftWallInteract extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftWallInteract> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftWallInteract>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftWallInteract.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftWallInteract.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftWallInteract newInstance() {
            return new BLiveNewGiftWallInteract();
        }

        public boolean parseField(BLiveNewGiftWallInteract bLiveNewGiftWallInteract, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("button")) {
                bLiveNewGiftWallInteract.button = BLiveCommonViewConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("texts")) {
                return false;
            }
            bLiveNewGiftWallInteract.texts = JsonAdapter.parseArray(jsonParser, BLiveNewGiftWallInteractTextItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftWallInteract bLiveNewGiftWallInteract, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveNewGiftWallInteract.texts != null) {
                jsonGenerator.writeFieldName("texts");
                JsonAdapter.serializeArray(bLiveNewGiftWallInteract.texts, jsonGenerator, BLiveNewGiftWallInteractTextItem.JSON_ADAPTER);
            }
            if (bLiveNewGiftWallInteract.button != null) {
                jsonGenerator.writeFieldName("button");
                BLiveCommonViewConfig.JSON_ADAPTER.serialize(bLiveNewGiftWallInteract.button, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftWallInteract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftwallinteract";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveCommonViewConfig button;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveNewGiftWallInteractTextItem> texts;

    public static BLiveNewGiftWallInteract new_() {
        BLiveNewGiftWallInteract bLiveNewGiftWallInteract = new BLiveNewGiftWallInteract();
        bLiveNewGiftWallInteract.nullCheck();
        return bLiveNewGiftWallInteract;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftWallInteract mo225055clone() {
        BLiveNewGiftWallInteract bLiveNewGiftWallInteract = new BLiveNewGiftWallInteract();
        List<BLiveNewGiftWallInteractTextItem> list = this.texts;
        if (list != null) {
            bLiveNewGiftWallInteract.texts = ValueObject.util_map(list, new qcj() { // from class: l.v32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveNewGiftWallInteractTextItem) obj).mo225055clone();
                }
            });
        }
        BLiveCommonViewConfig bLiveCommonViewConfig = this.button;
        if (bLiveCommonViewConfig != null) {
            bLiveNewGiftWallInteract.button = bLiveCommonViewConfig.mo225055clone();
        }
        return bLiveNewGiftWallInteract;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftWallInteract)) {
            return false;
        }
        BLiveNewGiftWallInteract bLiveNewGiftWallInteract = (BLiveNewGiftWallInteract) obj;
        return ValueObject.util_equals(this.texts, bLiveNewGiftWallInteract.texts) && ValueObject.util_equals(this.button, bLiveNewGiftWallInteract.button);
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
        List<BLiveNewGiftWallInteractTextItem> list = this.texts;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveCommonViewConfig bLiveCommonViewConfig = this.button;
        int iHashCode2 = iHashCode + (bLiveCommonViewConfig != null ? bLiveCommonViewConfig.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.texts == null) {
            this.texts = new ArrayList();
        }
        if (this.button == null) {
            this.button = BLiveCommonViewConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
