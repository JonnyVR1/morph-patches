package com.p046p1.mobile.putong.live.base.data;

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
public class BLiveGivenGiftRemindStatus extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGivenGiftRemindStatus> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGivenGiftRemindStatus>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGivenGiftRemindStatus.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGivenGiftRemindStatus.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGivenGiftRemindStatus newInstance() {
            return new BLiveGivenGiftRemindStatus();
        }

        public boolean parseField(BLiveGivenGiftRemindStatus bLiveGivenGiftRemindStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("canGuide")) {
                return false;
            }
            bLiveGivenGiftRemindStatus.canGuide = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGivenGiftRemindStatus bLiveGivenGiftRemindStatus, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("canGuide", bLiveGivenGiftRemindStatus.canGuide);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGivenGiftRemindStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegivengiftremindstatus";

    @ProtobufIndex(index = 1)
    public boolean canGuide;

    public static BLiveGivenGiftRemindStatus new_() {
        BLiveGivenGiftRemindStatus bLiveGivenGiftRemindStatus = new BLiveGivenGiftRemindStatus();
        bLiveGivenGiftRemindStatus.nullCheck();
        return bLiveGivenGiftRemindStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGivenGiftRemindStatus mo223809clone() {
        BLiveGivenGiftRemindStatus bLiveGivenGiftRemindStatus = new BLiveGivenGiftRemindStatus();
        bLiveGivenGiftRemindStatus.canGuide = this.canGuide;
        return bLiveGivenGiftRemindStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveGivenGiftRemindStatus) && this.canGuide == ((BLiveGivenGiftRemindStatus) obj).canGuide;
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
        int i2 = (i * 41) + (this.canGuide ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
