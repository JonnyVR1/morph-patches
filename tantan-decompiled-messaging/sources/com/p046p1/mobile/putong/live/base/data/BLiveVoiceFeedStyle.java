package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceFeedStyle extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceFeedStyle> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceFeedStyle>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceFeedStyle.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceFeedStyle.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceFeedStyle newInstance() {
            return new BLiveVoiceFeedStyle();
        }

        public boolean parseField(BLiveVoiceFeedStyle bLiveVoiceFeedStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "follow":
                    bLiveVoiceFeedStyle.follow = BLiveVoiceFeedStyleType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "nearby":
                    bLiveVoiceFeedStyle.nearby = BLiveVoiceFeedStyleType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "photo":
                    bLiveVoiceFeedStyle.photo = BLiveVoiceFeedStyleType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceFeedStyle bLiveVoiceFeedStyle, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceFeedStyle.nearby != null) {
                jsonGenerator.writeFieldName("nearby");
                BLiveVoiceFeedStyleType.JSON_ADAPTER.serialize(bLiveVoiceFeedStyle.nearby, jsonGenerator, true);
            }
            if (bLiveVoiceFeedStyle.follow != null) {
                jsonGenerator.writeFieldName("follow");
                BLiveVoiceFeedStyleType.JSON_ADAPTER.serialize(bLiveVoiceFeedStyle.follow, jsonGenerator, true);
            }
            if (bLiveVoiceFeedStyle.photo != null) {
                jsonGenerator.writeFieldName(ReminderAction.photo);
                BLiveVoiceFeedStyleType.JSON_ADAPTER.serialize(bLiveVoiceFeedStyle.photo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceFeedStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicefeedstyle";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveVoiceFeedStyleType follow;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveVoiceFeedStyleType nearby;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveVoiceFeedStyleType photo;

    public static BLiveVoiceFeedStyle new_() {
        BLiveVoiceFeedStyle bLiveVoiceFeedStyle = new BLiveVoiceFeedStyle();
        bLiveVoiceFeedStyle.nullCheck();
        return bLiveVoiceFeedStyle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceFeedStyle mo223809clone() {
        BLiveVoiceFeedStyle bLiveVoiceFeedStyle = new BLiveVoiceFeedStyle();
        bLiveVoiceFeedStyle.nearby = this.nearby;
        bLiveVoiceFeedStyle.follow = this.follow;
        bLiveVoiceFeedStyle.photo = this.photo;
        return bLiveVoiceFeedStyle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceFeedStyle)) {
            return false;
        }
        BLiveVoiceFeedStyle bLiveVoiceFeedStyle = (BLiveVoiceFeedStyle) obj;
        return ValueObject.util_equals(this.nearby, bLiveVoiceFeedStyle.nearby) && ValueObject.util_equals(this.follow, bLiveVoiceFeedStyle.follow) && ValueObject.util_equals(this.photo, bLiveVoiceFeedStyle.photo);
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
        BLiveVoiceFeedStyleType bLiveVoiceFeedStyleType = this.nearby;
        int iHashCode = (i2 + (bLiveVoiceFeedStyleType != null ? bLiveVoiceFeedStyleType.hashCode() : 0)) * 41;
        BLiveVoiceFeedStyleType bLiveVoiceFeedStyleType2 = this.follow;
        int iHashCode2 = (iHashCode + (bLiveVoiceFeedStyleType2 != null ? bLiveVoiceFeedStyleType2.hashCode() : 0)) * 41;
        BLiveVoiceFeedStyleType bLiveVoiceFeedStyleType3 = this.photo;
        int iHashCode3 = iHashCode2 + (bLiveVoiceFeedStyleType3 != null ? bLiveVoiceFeedStyleType3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.nearby == null) {
            this.nearby = (BLiveVoiceFeedStyleType) BLiveVoiceFeedStyleType.JSON_ADAPTER.defaultEnum();
        }
        if (this.follow == null) {
            this.follow = (BLiveVoiceFeedStyleType) BLiveVoiceFeedStyleType.JSON_ADAPTER.defaultEnum();
        }
        if (this.photo == null) {
            this.photo = (BLiveVoiceFeedStyleType) BLiveVoiceFeedStyleType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
