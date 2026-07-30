package com.p051p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftSkin;
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
public class BLiveGiftSkin extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftSkin> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftSkin>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftSkin.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftSkin.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftSkin newInstance() {
            return new BLiveGiftSkin();
        }

        public boolean parseField(BLiveGiftSkin bLiveGiftSkin, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "interlayer":
                    bLiveGiftSkin.interlayer = BLiveGiftSkinBg.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "bindTabId":
                    bLiveGiftSkin.bindTabId = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "cornerBg":
                    bLiveGiftSkin.cornerBg = BLiveGiftSkinBg.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "bg":
                    bLiveGiftSkin.f45231bg = BLiveGiftSkinBg.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveGiftSkin.f45232id = jsonParser.getValueAsString();
                    return false;
                case "top":
                    bLiveGiftSkin.top = BLiveGiftSkinTop.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "bindGiftId":
                    bLiveGiftSkin.bindGiftId = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftSkin bLiveGiftSkin, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftSkin.f45232id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveGiftSkin.top != null) {
                jsonGenerator.writeFieldName(StickStatus.top);
                BLiveGiftSkinTop.JSON_ADAPTER.serialize(bLiveGiftSkin.top, jsonGenerator, true);
            }
            if (bLiveGiftSkin.f45231bg != null) {
                jsonGenerator.writeFieldName(Constants.KEY_BG);
                BLiveGiftSkinBg.JSON_ADAPTER.serialize(bLiveGiftSkin.f45231bg, jsonGenerator, true);
            }
            if (bLiveGiftSkin.interlayer != null) {
                jsonGenerator.writeFieldName("interlayer");
                BLiveGiftSkinBg.JSON_ADAPTER.serialize(bLiveGiftSkin.interlayer, jsonGenerator, true);
            }
            if (bLiveGiftSkin.cornerBg != null) {
                jsonGenerator.writeFieldName("cornerBg");
                BLiveGiftSkinBg.JSON_ADAPTER.serialize(bLiveGiftSkin.cornerBg, jsonGenerator, true);
            }
            if (bLiveGiftSkin.bindTabId != null) {
                jsonGenerator.writeFieldName("bindTabId");
                JsonAdapter.serializeArray(bLiveGiftSkin.bindTabId, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (bLiveGiftSkin.bindGiftId != null) {
                jsonGenerator.writeFieldName("bindGiftId");
                JsonAdapter.serializeArray(bLiveGiftSkin.bindGiftId, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftSkin) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftskin";
    public static final String TYPE_H5 = "H5";
    public static final String TYPE_PIC = "Pic";

    /* JADX INFO: renamed from: bg */
    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveGiftSkinBg f45231bg;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<Integer> bindGiftId;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<Integer> bindTabId;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveGiftSkinBg cornerBg;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45232id;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveGiftSkinBg interlayer;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveGiftSkinTop top;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m69177a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m69178b(Integer num) {
        return num;
    }

    public static BLiveGiftSkin new_() {
        BLiveGiftSkin bLiveGiftSkin = new BLiveGiftSkin();
        bLiveGiftSkin.nullCheck();
        return bLiveGiftSkin;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftSkin mo225055clone() {
        BLiveGiftSkin bLiveGiftSkin = new BLiveGiftSkin();
        bLiveGiftSkin.f45232id = this.f45232id;
        BLiveGiftSkinTop bLiveGiftSkinTop = this.top;
        if (bLiveGiftSkinTop != null) {
            bLiveGiftSkin.top = bLiveGiftSkinTop.mo225055clone();
        }
        BLiveGiftSkinBg bLiveGiftSkinBg = this.f45231bg;
        if (bLiveGiftSkinBg != null) {
            bLiveGiftSkin.f45231bg = bLiveGiftSkinBg.mo225055clone();
        }
        BLiveGiftSkinBg bLiveGiftSkinBg2 = this.interlayer;
        if (bLiveGiftSkinBg2 != null) {
            bLiveGiftSkin.interlayer = bLiveGiftSkinBg2.mo225055clone();
        }
        BLiveGiftSkinBg bLiveGiftSkinBg3 = this.cornerBg;
        if (bLiveGiftSkinBg3 != null) {
            bLiveGiftSkin.cornerBg = bLiveGiftSkinBg3.mo225055clone();
        }
        List<Integer> list = this.bindTabId;
        if (list != null) {
            bLiveGiftSkin.bindTabId = ValueObject.util_map(list, new qcj() { // from class: l.c12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveGiftSkin.m69177a((Integer) obj);
                }
            });
        }
        List<Integer> list2 = this.bindGiftId;
        if (list2 != null) {
            bLiveGiftSkin.bindGiftId = ValueObject.util_map(list2, new qcj() { // from class: l.d12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveGiftSkin.m69178b((Integer) obj);
                }
            });
        }
        return bLiveGiftSkin;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftSkin)) {
            return false;
        }
        BLiveGiftSkin bLiveGiftSkin = (BLiveGiftSkin) obj;
        return ValueObject.util_equals(this.f45232id, bLiveGiftSkin.f45232id) && ValueObject.util_equals(this.top, bLiveGiftSkin.top) && ValueObject.util_equals(this.f45231bg, bLiveGiftSkin.f45231bg) && ValueObject.util_equals(this.interlayer, bLiveGiftSkin.interlayer) && ValueObject.util_equals(this.cornerBg, bLiveGiftSkin.cornerBg) && ValueObject.util_equals(this.bindTabId, bLiveGiftSkin.bindTabId) && ValueObject.util_equals(this.bindGiftId, bLiveGiftSkin.bindGiftId);
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
        String str = this.f45232id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveGiftSkinTop bLiveGiftSkinTop = this.top;
        int iHashCode2 = (iHashCode + (bLiveGiftSkinTop != null ? bLiveGiftSkinTop.hashCode() : 0)) * 41;
        BLiveGiftSkinBg bLiveGiftSkinBg = this.f45231bg;
        int iHashCode3 = (iHashCode2 + (bLiveGiftSkinBg != null ? bLiveGiftSkinBg.hashCode() : 0)) * 41;
        BLiveGiftSkinBg bLiveGiftSkinBg2 = this.interlayer;
        int iHashCode4 = (iHashCode3 + (bLiveGiftSkinBg2 != null ? bLiveGiftSkinBg2.hashCode() : 0)) * 41;
        BLiveGiftSkinBg bLiveGiftSkinBg3 = this.cornerBg;
        int iHashCode5 = (iHashCode4 + (bLiveGiftSkinBg3 != null ? bLiveGiftSkinBg3.hashCode() : 0)) * 41;
        List<Integer> list = this.bindTabId;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 41;
        List<Integer> list2 = this.bindGiftId;
        int iHashCode7 = iHashCode6 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    public boolean isH5Type() {
        return TextUtils.equals(this.top.type, "H5");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45232id == null) {
            this.f45232id = "";
        }
        if (this.top == null) {
            this.top = BLiveGiftSkinTop.new_();
        }
        if (this.f45231bg == null) {
            this.f45231bg = BLiveGiftSkinBg.new_();
        }
        if (this.interlayer == null) {
            this.interlayer = BLiveGiftSkinBg.new_();
        }
        if (this.cornerBg == null) {
            this.cornerBg = BLiveGiftSkinBg.new_();
        }
        if (this.bindTabId == null) {
            this.bindTabId = new ArrayList();
        }
        if (this.bindGiftId == null) {
            this.bindGiftId = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
