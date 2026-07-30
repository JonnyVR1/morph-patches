package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLivePreDefineMessages;
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
public class BLivePreDefineMessages extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePreDefineMessages> JSON_ADAPTER = new ObjectJsonAdapter<BLivePreDefineMessages>() { // from class: com.p1.mobile.putong.live.base.data.BLivePreDefineMessages.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePreDefineMessages.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePreDefineMessages newInstance() {
            return new BLivePreDefineMessages();
        }

        public boolean parseField(BLivePreDefineMessages bLivePreDefineMessages, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "voiceAudience":
                    bLivePreDefineMessages.voiceAudience = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "anchor":
                    bLivePreDefineMessages.anchor = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "voiceAnchor":
                    bLivePreDefineMessages.voiceAnchor = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "audience":
                    bLivePreDefineMessages.audience = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePreDefineMessages bLivePreDefineMessages, JsonGenerator jsonGenerator) throws IOException {
            if (bLivePreDefineMessages.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                JsonAdapter.serializeArray(bLivePreDefineMessages.anchor, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (bLivePreDefineMessages.audience != null) {
                jsonGenerator.writeFieldName("audience");
                JsonAdapter.serializeArray(bLivePreDefineMessages.audience, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (bLivePreDefineMessages.voiceAudience != null) {
                jsonGenerator.writeFieldName("voiceAudience");
                JsonAdapter.serializeArray(bLivePreDefineMessages.voiceAudience, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (bLivePreDefineMessages.voiceAnchor != null) {
                jsonGenerator.writeFieldName("voiceAnchor");
                JsonAdapter.serializeArray(bLivePreDefineMessages.voiceAnchor, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePreDefineMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepredefinemessages";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Integer> anchor;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Integer> audience;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<Integer> voiceAnchor;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Integer> voiceAudience;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m69351a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m69352b(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m69353c(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Integer m69354d(Integer num) {
        return num;
    }

    public static BLivePreDefineMessages new_() {
        BLivePreDefineMessages bLivePreDefineMessages = new BLivePreDefineMessages();
        bLivePreDefineMessages.nullCheck();
        return bLivePreDefineMessages;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePreDefineMessages mo225055clone() {
        BLivePreDefineMessages bLivePreDefineMessages = new BLivePreDefineMessages();
        List<Integer> list = this.anchor;
        if (list != null) {
            bLivePreDefineMessages.anchor = ValueObject.util_map(list, new qcj() { // from class: l.u42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLivePreDefineMessages.m69352b((Integer) obj);
                }
            });
        }
        List<Integer> list2 = this.audience;
        if (list2 != null) {
            bLivePreDefineMessages.audience = ValueObject.util_map(list2, new qcj() { // from class: l.v42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLivePreDefineMessages.m69351a((Integer) obj);
                }
            });
        }
        List<Integer> list3 = this.voiceAudience;
        if (list3 != null) {
            bLivePreDefineMessages.voiceAudience = ValueObject.util_map(list3, new qcj() { // from class: l.w42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLivePreDefineMessages.m69353c((Integer) obj);
                }
            });
        }
        List<Integer> list4 = this.voiceAnchor;
        if (list4 != null) {
            bLivePreDefineMessages.voiceAnchor = ValueObject.util_map(list4, new qcj() { // from class: l.x42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLivePreDefineMessages.m69354d((Integer) obj);
                }
            });
        }
        return bLivePreDefineMessages;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePreDefineMessages)) {
            return false;
        }
        BLivePreDefineMessages bLivePreDefineMessages = (BLivePreDefineMessages) obj;
        return ValueObject.util_equals(this.anchor, bLivePreDefineMessages.anchor) && ValueObject.util_equals(this.audience, bLivePreDefineMessages.audience) && ValueObject.util_equals(this.voiceAudience, bLivePreDefineMessages.voiceAudience) && ValueObject.util_equals(this.voiceAnchor, bLivePreDefineMessages.voiceAnchor);
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
        List<Integer> list = this.anchor;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Integer> list2 = this.audience;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<Integer> list3 = this.voiceAudience;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<Integer> list4 = this.voiceAnchor;
        int iHashCode4 = iHashCode3 + (list4 != null ? list4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.anchor == null) {
            this.anchor = new ArrayList();
        }
        if (this.audience == null) {
            this.audience = new ArrayList();
        }
        if (this.voiceAudience == null) {
            this.voiceAudience = new ArrayList();
        }
        if (this.voiceAnchor == null) {
            this.voiceAnchor = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
