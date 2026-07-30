package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveRoomCover extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRoomCover> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRoomCover>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRoomCover.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRoomCover.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRoomCover newInstance() {
            return new BLiveRoomCover();
        }

        public boolean parseField(BLiveRoomCover bLiveRoomCover, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isDefaultCover":
                    bLiveRoomCover.isDefaultCover = jsonParser.getValueAsBoolean();
                    return true;
                case "status":
                    bLiveRoomCover.status = BLiveRoomCoverStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "media":
                    bLiveRoomCover.media = Converter.RAW_PICTURE_TO_PICTURE.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRoomCover bLiveRoomCover, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveRoomCover.media != null) {
                jsonGenerator.writeFieldName("media");
                Converter.RAW_PICTURE_TO_PICTURE.serialize(bLiveRoomCover.media, jsonGenerator, true);
            }
            if (bLiveRoomCover.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                BLiveRoomCoverStatus.JSON_ADAPTER.serialize(bLiveRoomCover.status, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isDefaultCover", bLiveRoomCover.isDefaultCover);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRoomCover) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveroomcover";

    @ProtobufIndex(index = 3)
    public boolean isDefaultCover;

    @NonNull
    @ProtobufIndex(index = 1)
    public Picture media;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveRoomCoverStatus status;

    public static BLiveRoomCover new_() {
        BLiveRoomCover bLiveRoomCover = new BLiveRoomCover();
        bLiveRoomCover.nullCheck();
        return bLiveRoomCover;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRoomCover mo225055clone() {
        BLiveRoomCover bLiveRoomCover = new BLiveRoomCover();
        Picture picture = this.media;
        if (picture != null) {
            bLiveRoomCover.media = picture.mo225055clone();
        }
        bLiveRoomCover.status = this.status;
        bLiveRoomCover.isDefaultCover = this.isDefaultCover;
        return bLiveRoomCover;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRoomCover)) {
            return false;
        }
        BLiveRoomCover bLiveRoomCover = (BLiveRoomCover) obj;
        return ValueObject.util_equals(this.media, bLiveRoomCover.media) && ValueObject.util_equals(this.status, bLiveRoomCover.status) && this.isDefaultCover == bLiveRoomCover.isDefaultCover;
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
        Picture picture = this.media;
        int iHashCode = (i2 + (picture != null ? picture.hashCode() : 0)) * 41;
        BLiveRoomCoverStatus bLiveRoomCoverStatus = this.status;
        int iHashCode2 = ((iHashCode + (bLiveRoomCoverStatus != null ? bLiveRoomCoverStatus.hashCode() : 0)) * 41) + (this.isDefaultCover ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.media == null) {
            this.media = Picture.new_();
        }
        if (this.status == null) {
            this.status = (BLiveRoomCoverStatus) BLiveRoomCoverStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
