package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceActivityMember;
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
public class BLiveVoiceLiveActivityMoment extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceLiveActivityMoment> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceLiveActivityMoment>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceLiveActivityMoment.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceLiveActivityMoment.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceLiveActivityMoment newInstance() {
            return new BLiveVoiceLiveActivityMoment();
        }

        public boolean parseField(BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "memberList":
                    bLiveVoiceLiveActivityMoment.memberList = JsonAdapter.parseArray(jsonParser, BLiveVoiceActivityMember.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "momentTimeStamp":
                    bLiveVoiceLiveActivityMoment.momentTimeStamp = jsonParser.getValueAsLong();
                    return true;
                case "activityMomentStatus":
                    bLiveVoiceLiveActivityMoment.activityMomentStatus = jsonParser.getValueAsString();
                    return true;
                case "mainTitle":
                    bLiveVoiceLiveActivityMoment.mainTitle = jsonParser.getValueAsString();
                    return true;
                case "secondTitle":
                    bLiveVoiceLiveActivityMoment.secondTitle = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceLiveActivityMoment.mainTitle;
            if (str != null) {
                jsonGenerator.writeStringField("mainTitle", str);
            }
            String str2 = bLiveVoiceLiveActivityMoment.secondTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("secondTitle", str2);
            }
            jsonGenerator.writeNumberField("momentTimeStamp", bLiveVoiceLiveActivityMoment.momentTimeStamp);
            String str3 = bLiveVoiceLiveActivityMoment.activityMomentStatus;
            if (str3 != null) {
                jsonGenerator.writeStringField("activityMomentStatus", str3);
            }
            if (bLiveVoiceLiveActivityMoment.memberList != null) {
                jsonGenerator.writeFieldName("memberList");
                JsonAdapter.serializeArray(bLiveVoiceLiveActivityMoment.memberList, jsonGenerator, BLiveVoiceActivityMember.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceLiveActivityMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceliveactivitymoment";

    @NonNull
    @ProtobufIndex(index = 4)
    public String activityMomentStatus;

    @NonNull
    @ProtobufIndex(index = 1)
    public String mainTitle;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<BLiveVoiceActivityMember> memberList;

    @ProtobufIndex(index = 3)
    public long momentTimeStamp;

    @NonNull
    @ProtobufIndex(index = 2)
    public String secondTitle;

    public static BLiveVoiceLiveActivityMoment new_() {
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment = new BLiveVoiceLiveActivityMoment();
        bLiveVoiceLiveActivityMoment.nullCheck();
        return bLiveVoiceLiveActivityMoment;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceLiveActivityMoment mo225055clone() {
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment = new BLiveVoiceLiveActivityMoment();
        bLiveVoiceLiveActivityMoment.mainTitle = this.mainTitle;
        bLiveVoiceLiveActivityMoment.secondTitle = this.secondTitle;
        bLiveVoiceLiveActivityMoment.momentTimeStamp = this.momentTimeStamp;
        bLiveVoiceLiveActivityMoment.activityMomentStatus = this.activityMomentStatus;
        List<BLiveVoiceActivityMember> list = this.memberList;
        if (list != null) {
            bLiveVoiceLiveActivityMoment.memberList = ValueObject.util_map(list, new qcj() { // from class: l.h92
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceActivityMember) obj).mo225055clone();
                }
            });
        }
        return bLiveVoiceLiveActivityMoment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceLiveActivityMoment)) {
            return false;
        }
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment = (BLiveVoiceLiveActivityMoment) obj;
        return ValueObject.util_equals(this.mainTitle, bLiveVoiceLiveActivityMoment.mainTitle) && ValueObject.util_equals(this.secondTitle, bLiveVoiceLiveActivityMoment.secondTitle) && this.momentTimeStamp == bLiveVoiceLiveActivityMoment.momentTimeStamp && ValueObject.util_equals(this.activityMomentStatus, bLiveVoiceLiveActivityMoment.activityMomentStatus) && ValueObject.util_equals(this.memberList, bLiveVoiceLiveActivityMoment.memberList);
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
        String str = this.mainTitle;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.secondTitle;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.momentTimeStamp;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.activityMomentStatus;
        int iHashCode3 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<BLiveVoiceActivityMember> list = this.memberList;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.mainTitle == null) {
            this.mainTitle = "";
        }
        if (this.secondTitle == null) {
            this.secondTitle = "";
        }
        if (this.activityMomentStatus == null) {
            this.activityMomentStatus = "";
        }
        if (this.memberList == null) {
            this.memberList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
