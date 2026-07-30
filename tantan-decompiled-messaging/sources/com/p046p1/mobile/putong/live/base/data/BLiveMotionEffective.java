package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveMotionEffective extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMotionEffective> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMotionEffective>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMotionEffective.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMotionEffective.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMotionEffective newInstance() {
            return new BLiveMotionEffective();
        }

        public boolean parseField(BLiveMotionEffective bLiveMotionEffective, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "limitation":
                    bLiveMotionEffective.limitation = BLiveEntranceLimitation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "showAfterWatchSeconds":
                    bLiveMotionEffective.showAfterWatchSeconds = jsonParser.getValueAsLong();
                    return true;
                case "show":
                    bLiveMotionEffective.show = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMotionEffective bLiveMotionEffective, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("show", bLiveMotionEffective.show);
            jsonGenerator.writeNumberField("showAfterWatchSeconds", bLiveMotionEffective.showAfterWatchSeconds);
            if (bLiveMotionEffective.limitation != null) {
                jsonGenerator.writeFieldName("limitation");
                BLiveEntranceLimitation.JSON_ADAPTER.serialize(bLiveMotionEffective.limitation, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMotionEffective) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemotioneffective";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveEntranceLimitation limitation;

    @ProtobufIndex(index = 1)
    public boolean show;

    @ProtobufIndex(index = 2)
    public long showAfterWatchSeconds;

    public static BLiveMotionEffective new_() {
        BLiveMotionEffective bLiveMotionEffective = new BLiveMotionEffective();
        bLiveMotionEffective.nullCheck();
        return bLiveMotionEffective;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMotionEffective mo223809clone() {
        BLiveMotionEffective bLiveMotionEffective = new BLiveMotionEffective();
        bLiveMotionEffective.show = this.show;
        bLiveMotionEffective.showAfterWatchSeconds = this.showAfterWatchSeconds;
        BLiveEntranceLimitation bLiveEntranceLimitation = this.limitation;
        if (bLiveEntranceLimitation != null) {
            bLiveMotionEffective.limitation = bLiveEntranceLimitation.mo223809clone();
        }
        return bLiveMotionEffective;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMotionEffective)) {
            return false;
        }
        BLiveMotionEffective bLiveMotionEffective = (BLiveMotionEffective) obj;
        return this.show == bLiveMotionEffective.show && this.showAfterWatchSeconds == bLiveMotionEffective.showAfterWatchSeconds && ValueObject.util_equals(this.limitation, bLiveMotionEffective.limitation);
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
        int i2 = ((i * 41) + (this.show ? 1231 : 1237)) * 41;
        long j = this.showAfterWatchSeconds;
        int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 41;
        BLiveEntranceLimitation bLiveEntranceLimitation = this.limitation;
        int iHashCode = i3 + (bLiveEntranceLimitation != null ? bLiveEntranceLimitation.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.limitation == null) {
            this.limitation = BLiveEntranceLimitation.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
