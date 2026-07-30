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
public class BLiveTrackShowLabel extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTrackShowLabel> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTrackShowLabel>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTrackShowLabel.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTrackShowLabel.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTrackShowLabel newInstance() {
            return new BLiveTrackShowLabel();
        }

        public boolean parseField(BLiveTrackShowLabel bLiveTrackShowLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "have_red_packet":
                    bLiveTrackShowLabel.have_red_packet = jsonParser.getValueAsString();
                    return true;
                case "label_name_tool":
                    bLiveTrackShowLabel.label_name_tool = jsonParser.getValueAsString();
                    return true;
                case "label_name":
                    bLiveTrackShowLabel.label_name = jsonParser.getValueAsString();
                    return true;
                case "room_name":
                    bLiveTrackShowLabel.room_name = jsonParser.getValueAsString();
                    return true;
                case "viewer":
                    bLiveTrackShowLabel.viewer = jsonParser.getValueAsString();
                    return true;
                case "label_name_top":
                    bLiveTrackShowLabel.label_name_top = jsonParser.getValueAsString();
                    return true;
                case "distance":
                    bLiveTrackShowLabel.distance = jsonParser.getValueAsString();
                    return true;
                case "label_name_fixed":
                    bLiveTrackShowLabel.label_name_fixed = jsonParser.getValueAsString();
                    return true;
                case "state_label":
                    bLiveTrackShowLabel.state_label = jsonParser.getValueAsString();
                    return true;
                case "label_name_sp":
                    bLiveTrackShowLabel.label_name_sp = jsonParser.getValueAsString();
                    return true;
                case "label_name_custom":
                    bLiveTrackShowLabel.label_name_custom = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTrackShowLabel bLiveTrackShowLabel, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveTrackShowLabel.distance;
            if (str != null) {
                jsonGenerator.writeStringField("distance", str);
            }
            String str2 = bLiveTrackShowLabel.room_name;
            if (str2 != null) {
                jsonGenerator.writeStringField("room_name", str2);
            }
            String str3 = bLiveTrackShowLabel.viewer;
            if (str3 != null) {
                jsonGenerator.writeStringField("viewer", str3);
            }
            String str4 = bLiveTrackShowLabel.label_name;
            if (str4 != null) {
                jsonGenerator.writeStringField("label_name", str4);
            }
            String str5 = bLiveTrackShowLabel.label_name_top;
            if (str5 != null) {
                jsonGenerator.writeStringField("label_name_top", str5);
            }
            String str6 = bLiveTrackShowLabel.label_name_sp;
            if (str6 != null) {
                jsonGenerator.writeStringField("label_name_sp", str6);
            }
            String str7 = bLiveTrackShowLabel.label_name_tool;
            if (str7 != null) {
                jsonGenerator.writeStringField("label_name_tool", str7);
            }
            String str8 = bLiveTrackShowLabel.state_label;
            if (str8 != null) {
                jsonGenerator.writeStringField("state_label", str8);
            }
            String str9 = bLiveTrackShowLabel.have_red_packet;
            if (str9 != null) {
                jsonGenerator.writeStringField("have_red_packet", str9);
            }
            String str10 = bLiveTrackShowLabel.label_name_custom;
            if (str10 != null) {
                jsonGenerator.writeStringField("label_name_custom", str10);
            }
            String str11 = bLiveTrackShowLabel.label_name_fixed;
            if (str11 != null) {
                jsonGenerator.writeStringField("label_name_fixed", str11);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTrackShowLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetrackshowlabel";

    @NonNull
    @ProtobufIndex(index = 1)
    public String distance;

    @NonNull
    @ProtobufIndex(index = 9)
    public String have_red_packet;

    @NonNull
    @ProtobufIndex(index = 4)
    public String label_name;

    @NonNull
    @ProtobufIndex(index = 10)
    public String label_name_custom;

    @NonNull
    @ProtobufIndex(index = 11)
    public String label_name_fixed;

    @NonNull
    @ProtobufIndex(index = 6)
    public String label_name_sp;

    @NonNull
    @ProtobufIndex(index = 7)
    public String label_name_tool;

    @NonNull
    @ProtobufIndex(index = 5)
    public String label_name_top;

    @NonNull
    @ProtobufIndex(index = 2)
    public String room_name;

    @NonNull
    @ProtobufIndex(index = 8)
    public String state_label;

    @NonNull
    @ProtobufIndex(index = 3)
    public String viewer;

    public static BLiveTrackShowLabel new_() {
        BLiveTrackShowLabel bLiveTrackShowLabel = new BLiveTrackShowLabel();
        bLiveTrackShowLabel.nullCheck();
        return bLiveTrackShowLabel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTrackShowLabel mo223809clone() {
        BLiveTrackShowLabel bLiveTrackShowLabel = new BLiveTrackShowLabel();
        bLiveTrackShowLabel.distance = this.distance;
        bLiveTrackShowLabel.room_name = this.room_name;
        bLiveTrackShowLabel.viewer = this.viewer;
        bLiveTrackShowLabel.label_name = this.label_name;
        bLiveTrackShowLabel.label_name_top = this.label_name_top;
        bLiveTrackShowLabel.label_name_sp = this.label_name_sp;
        bLiveTrackShowLabel.label_name_tool = this.label_name_tool;
        bLiveTrackShowLabel.state_label = this.state_label;
        bLiveTrackShowLabel.have_red_packet = this.have_red_packet;
        bLiveTrackShowLabel.label_name_custom = this.label_name_custom;
        bLiveTrackShowLabel.label_name_fixed = this.label_name_fixed;
        return bLiveTrackShowLabel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTrackShowLabel)) {
            return false;
        }
        BLiveTrackShowLabel bLiveTrackShowLabel = (BLiveTrackShowLabel) obj;
        return ValueObject.util_equals(this.distance, bLiveTrackShowLabel.distance) && ValueObject.util_equals(this.room_name, bLiveTrackShowLabel.room_name) && ValueObject.util_equals(this.viewer, bLiveTrackShowLabel.viewer) && ValueObject.util_equals(this.label_name, bLiveTrackShowLabel.label_name) && ValueObject.util_equals(this.label_name_top, bLiveTrackShowLabel.label_name_top) && ValueObject.util_equals(this.label_name_sp, bLiveTrackShowLabel.label_name_sp) && ValueObject.util_equals(this.label_name_tool, bLiveTrackShowLabel.label_name_tool) && ValueObject.util_equals(this.state_label, bLiveTrackShowLabel.state_label) && ValueObject.util_equals(this.have_red_packet, bLiveTrackShowLabel.have_red_packet) && ValueObject.util_equals(this.label_name_custom, bLiveTrackShowLabel.label_name_custom) && ValueObject.util_equals(this.label_name_fixed, bLiveTrackShowLabel.label_name_fixed);
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
        String str = this.distance;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.room_name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.viewer;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.label_name;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.label_name_top;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.label_name_sp;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.label_name_tool;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.state_label;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.have_red_packet;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.label_name_custom;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.label_name_fixed;
        int iHashCode11 = iHashCode10 + (str11 != null ? str11.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.distance == null) {
            this.distance = "";
        }
        if (this.room_name == null) {
            this.room_name = "";
        }
        if (this.viewer == null) {
            this.viewer = "";
        }
        if (this.label_name == null) {
            this.label_name = "";
        }
        if (this.label_name_top == null) {
            this.label_name_top = "";
        }
        if (this.label_name_sp == null) {
            this.label_name_sp = "";
        }
        if (this.label_name_tool == null) {
            this.label_name_tool = "";
        }
        if (this.state_label == null) {
            this.state_label = "";
        }
        if (this.have_red_packet == null) {
            this.have_red_packet = "";
        }
        if (this.label_name_custom == null) {
            this.label_name_custom = "";
        }
        if (this.label_name_fixed == null) {
            this.label_name_fixed = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
