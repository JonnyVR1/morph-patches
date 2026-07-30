package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.Grade;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveMedalColorTemplate;
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
public class BLiveFanBaseMedal extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBaseMedal> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBaseMedal>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBaseMedal.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBaseMedal.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBaseMedal newInstance() {
            return new BLiveFanBaseMedal();
        }

        public boolean parseField(BLiveFanBaseMedal bLiveFanBaseMedal, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveId":
                    bLiveFanBaseMedal.liveId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveFanBaseMedal.userId = jsonParser.getValueAsString();
                    return true;
                case "expireTime":
                    bLiveFanBaseMedal.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "fanbaseId":
                    bLiveFanBaseMedal.fanbaseId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveFanBaseMedal.f45213id = jsonParser.getValueAsString();
                    return false;
                case "fanbaseGrade":
                    bLiveFanBaseMedal.fanbaseGrade = jsonParser.getValueAsInt();
                    return true;
                case "grade":
                    bLiveFanBaseMedal.grade = jsonParser.getValueAsInt();
                    return true;
                case "colorTemplates":
                    bLiveFanBaseMedal.colorTemplates = JsonAdapter.parseArray(jsonParser, BLiveMedalColorTemplate.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBaseMedal bLiveFanBaseMedal, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFanBaseMedal.f45213id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveFanBaseMedal.liveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveId", str2);
            }
            jsonGenerator.writeNumberField("expireTime", bLiveFanBaseMedal.expireTime);
            jsonGenerator.writeNumberField("fanbaseGrade", bLiveFanBaseMedal.fanbaseGrade);
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveFanBaseMedal.grade);
            if (bLiveFanBaseMedal.colorTemplates != null) {
                jsonGenerator.writeFieldName("colorTemplates");
                JsonAdapter.serializeArray(bLiveFanBaseMedal.colorTemplates, jsonGenerator, BLiveMedalColorTemplate.JSON_ADAPTER);
            }
            String str3 = bLiveFanBaseMedal.fanbaseId;
            if (str3 != null) {
                jsonGenerator.writeStringField("fanbaseId", str3);
            }
            String str4 = bLiveFanBaseMedal.userId;
            if (str4 != null) {
                jsonGenerator.writeStringField("userId", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBaseMedal) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbasemedal";

    @Nullable
    @ProtobufIndex(index = 6)
    public List<BLiveMedalColorTemplate> colorTemplates;

    @ProtobufIndex(index = 3)
    public long expireTime;

    @ProtobufIndex(index = 4)
    public int fanbaseGrade;

    @NonNull
    @ProtobufIndex(index = 7)
    public String fanbaseId;

    @ProtobufIndex(index = 5)
    public int grade;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45213id;

    @Nullable
    @ProtobufIndex(index = 2)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String userId;

    public static BLiveFanBaseMedal new_() {
        BLiveFanBaseMedal bLiveFanBaseMedal = new BLiveFanBaseMedal();
        bLiveFanBaseMedal.nullCheck();
        return bLiveFanBaseMedal;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBaseMedal mo225055clone() {
        BLiveFanBaseMedal bLiveFanBaseMedal = new BLiveFanBaseMedal();
        bLiveFanBaseMedal.f45213id = this.f45213id;
        bLiveFanBaseMedal.liveId = this.liveId;
        bLiveFanBaseMedal.expireTime = this.expireTime;
        bLiveFanBaseMedal.fanbaseGrade = this.fanbaseGrade;
        bLiveFanBaseMedal.grade = this.grade;
        List<BLiveMedalColorTemplate> list = this.colorTemplates;
        if (list != null) {
            bLiveFanBaseMedal.colorTemplates = ValueObject.util_map(list, new qcj() { // from class: l.xz1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMedalColorTemplate) obj).mo225055clone();
                }
            });
        }
        bLiveFanBaseMedal.fanbaseId = this.fanbaseId;
        bLiveFanBaseMedal.userId = this.userId;
        return bLiveFanBaseMedal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFanBaseMedal)) {
            return false;
        }
        BLiveFanBaseMedal bLiveFanBaseMedal = (BLiveFanBaseMedal) obj;
        return ValueObject.util_equals(this.f45213id, bLiveFanBaseMedal.f45213id) && ValueObject.util_equals(this.liveId, bLiveFanBaseMedal.liveId) && this.expireTime == bLiveFanBaseMedal.expireTime && this.fanbaseGrade == bLiveFanBaseMedal.fanbaseGrade && this.grade == bLiveFanBaseMedal.grade && ValueObject.util_equals(this.colorTemplates, bLiveFanBaseMedal.colorTemplates) && ValueObject.util_equals(this.fanbaseId, bLiveFanBaseMedal.fanbaseId) && ValueObject.util_equals(this.userId, bLiveFanBaseMedal.userId);
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
        String str = this.f45213id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.liveId;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.expireTime;
        int i3 = (((((((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.fanbaseGrade) * 41) + this.grade) * 41;
        List<BLiveMedalColorTemplate> list = this.colorTemplates;
        int iHashCode3 = (i3 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.fanbaseId;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userId;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45213id == null) {
            this.f45213id = "";
        }
        if (this.fanbaseId == null) {
            this.fanbaseId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
