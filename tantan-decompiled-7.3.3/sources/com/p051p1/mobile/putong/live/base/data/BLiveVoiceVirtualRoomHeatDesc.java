package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceVirtualRoomHeatDesc extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceVirtualRoomHeatDesc> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceVirtualRoomHeatDesc>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomHeatDesc.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceVirtualRoomHeatDesc.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceVirtualRoomHeatDesc newInstance() {
            return new BLiveVoiceVirtualRoomHeatDesc();
        }

        public boolean parseField(BLiveVoiceVirtualRoomHeatDesc bLiveVoiceVirtualRoomHeatDesc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bgEndColor":
                    bLiveVoiceVirtualRoomHeatDesc.bgEndColor = jsonParser.getValueAsString();
                    return true;
                case "bgStartColor":
                    bLiveVoiceVirtualRoomHeatDesc.bgStartColor = jsonParser.getValueAsString();
                    return true;
                case "desc":
                    bLiveVoiceVirtualRoomHeatDesc.desc = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveVoiceVirtualRoomHeatDesc.icon = jsonParser.getValueAsString();
                    return true;
                case "svga":
                    bLiveVoiceVirtualRoomHeatDesc.svga = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveVoiceVirtualRoomHeatDesc.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceVirtualRoomHeatDesc bLiveVoiceVirtualRoomHeatDesc, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceVirtualRoomHeatDesc.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveVoiceVirtualRoomHeatDesc.desc;
            if (str2 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str2);
            }
            String str3 = bLiveVoiceVirtualRoomHeatDesc.bgStartColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("bgStartColor", str3);
            }
            String str4 = bLiveVoiceVirtualRoomHeatDesc.bgEndColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("bgEndColor", str4);
            }
            String str5 = bLiveVoiceVirtualRoomHeatDesc.icon;
            if (str5 != null) {
                jsonGenerator.writeStringField("icon", str5);
            }
            String str6 = bLiveVoiceVirtualRoomHeatDesc.svga;
            if (str6 != null) {
                jsonGenerator.writeStringField("svga", str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceVirtualRoomHeatDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicevirtualroomheatdesc";

    @NonNull
    @ProtobufIndex(index = 4)
    public String bgEndColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public String bgStartColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 5)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 6)
    public String svga;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLiveVoiceVirtualRoomHeatDesc new_() {
        BLiveVoiceVirtualRoomHeatDesc bLiveVoiceVirtualRoomHeatDesc = new BLiveVoiceVirtualRoomHeatDesc();
        bLiveVoiceVirtualRoomHeatDesc.nullCheck();
        return bLiveVoiceVirtualRoomHeatDesc;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceVirtualRoomHeatDesc mo225055clone() {
        BLiveVoiceVirtualRoomHeatDesc bLiveVoiceVirtualRoomHeatDesc = new BLiveVoiceVirtualRoomHeatDesc();
        bLiveVoiceVirtualRoomHeatDesc.title = this.title;
        bLiveVoiceVirtualRoomHeatDesc.desc = this.desc;
        bLiveVoiceVirtualRoomHeatDesc.bgStartColor = this.bgStartColor;
        bLiveVoiceVirtualRoomHeatDesc.bgEndColor = this.bgEndColor;
        bLiveVoiceVirtualRoomHeatDesc.icon = this.icon;
        bLiveVoiceVirtualRoomHeatDesc.svga = this.svga;
        return bLiveVoiceVirtualRoomHeatDesc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceVirtualRoomHeatDesc)) {
            return false;
        }
        BLiveVoiceVirtualRoomHeatDesc bLiveVoiceVirtualRoomHeatDesc = (BLiveVoiceVirtualRoomHeatDesc) obj;
        return ValueObject.util_equals(this.title, bLiveVoiceVirtualRoomHeatDesc.title) && ValueObject.util_equals(this.desc, bLiveVoiceVirtualRoomHeatDesc.desc) && ValueObject.util_equals(this.bgStartColor, bLiveVoiceVirtualRoomHeatDesc.bgStartColor) && ValueObject.util_equals(this.bgEndColor, bLiveVoiceVirtualRoomHeatDesc.bgEndColor) && ValueObject.util_equals(this.icon, bLiveVoiceVirtualRoomHeatDesc.icon) && ValueObject.util_equals(this.svga, bLiveVoiceVirtualRoomHeatDesc.svga);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bgStartColor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.bgEndColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.icon;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.svga;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.bgStartColor == null) {
            this.bgStartColor = "";
        }
        if (this.bgEndColor == null) {
            this.bgEndColor = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.svga == null) {
            this.svga = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
