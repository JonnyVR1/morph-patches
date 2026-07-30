package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTag;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveDirectionTags extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDirectionTags> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDirectionTags>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDirectionTags.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDirectionTags.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDirectionTags newInstance() {
            return new BLiveDirectionTags();
        }

        public boolean parseField(BLiveDirectionTags bLiveDirectionTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bottomTags":
                    bLiveDirectionTags.bottomTags = JsonAdapter.parseArray(jsonParser, BLiveVoiceTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "topTags":
                    bLiveDirectionTags.topTags = JsonAdapter.parseArray(jsonParser, BLiveVoiceTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "leftTopTags":
                    bLiveDirectionTags.leftTopTags = JsonAdapter.parseArray(jsonParser, BLiveVoiceTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDirectionTags bLiveDirectionTags, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveDirectionTags.topTags != null) {
                jsonGenerator.writeFieldName("topTags");
                JsonAdapter.serializeArray(bLiveDirectionTags.topTags, jsonGenerator, BLiveVoiceTag.JSON_ADAPTER);
            }
            if (bLiveDirectionTags.bottomTags != null) {
                jsonGenerator.writeFieldName("bottomTags");
                JsonAdapter.serializeArray(bLiveDirectionTags.bottomTags, jsonGenerator, BLiveVoiceTag.JSON_ADAPTER);
            }
            if (bLiveDirectionTags.leftTopTags != null) {
                jsonGenerator.writeFieldName("leftTopTags");
                JsonAdapter.serializeArray(bLiveDirectionTags.leftTopTags, jsonGenerator, BLiveVoiceTag.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDirectionTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedirectiontags";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveVoiceTag> bottomTags;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveVoiceTag> leftTopTags;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveVoiceTag> topTags;

    public static BLiveDirectionTags new_() {
        BLiveDirectionTags bLiveDirectionTags = new BLiveDirectionTags();
        bLiveDirectionTags.nullCheck();
        return bLiveDirectionTags;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDirectionTags mo223809clone() {
        BLiveDirectionTags bLiveDirectionTags = new BLiveDirectionTags();
        List<BLiveVoiceTag> list = this.topTags;
        if (list != null) {
            bLiveDirectionTags.topTags = ValueObject.util_map(list, new w9j() { // from class: l.ry1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceTag) obj).mo223809clone();
                }
            });
        }
        List<BLiveVoiceTag> list2 = this.bottomTags;
        if (list2 != null) {
            bLiveDirectionTags.bottomTags = ValueObject.util_map(list2, new w9j() { // from class: l.sy1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceTag) obj).mo223809clone();
                }
            });
        }
        List<BLiveVoiceTag> list3 = this.leftTopTags;
        if (list3 != null) {
            bLiveDirectionTags.leftTopTags = ValueObject.util_map(list3, new w9j() { // from class: l.ty1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceTag) obj).mo223809clone();
                }
            });
        }
        return bLiveDirectionTags;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDirectionTags)) {
            return false;
        }
        BLiveDirectionTags bLiveDirectionTags = (BLiveDirectionTags) obj;
        return ValueObject.util_equals(this.topTags, bLiveDirectionTags.topTags) && ValueObject.util_equals(this.bottomTags, bLiveDirectionTags.bottomTags) && ValueObject.util_equals(this.leftTopTags, bLiveDirectionTags.leftTopTags);
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
        List<BLiveVoiceTag> list = this.topTags;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveVoiceTag> list2 = this.bottomTags;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<BLiveVoiceTag> list3 = this.leftTopTags;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.topTags == null) {
            this.topTags = new ArrayList();
        }
        if (this.bottomTags == null) {
            this.bottomTags = new ArrayList();
        }
        if (this.leftTopTags == null) {
            this.leftTopTags = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
