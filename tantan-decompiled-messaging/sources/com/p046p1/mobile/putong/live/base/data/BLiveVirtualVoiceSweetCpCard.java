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
public class BLiveVirtualVoiceSweetCpCard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVirtualVoiceSweetCpCard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVirtualVoiceSweetCpCard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVirtualVoiceSweetCpCard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVirtualVoiceSweetCpCard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVirtualVoiceSweetCpCard newInstance() {
            return new BLiveVirtualVoiceSweetCpCard();
        }

        public boolean parseField(BLiveVirtualVoiceSweetCpCard bLiveVirtualVoiceSweetCpCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "sweetCp":
                    bLiveVirtualVoiceSweetCpCard.sweetCp = BLiveVirtualVoiceCpInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "schema":
                    bLiveVirtualVoiceSweetCpCard.schema = jsonParser.getValueAsString();
                    return true;
                case "houseUrl":
                    bLiveVirtualVoiceSweetCpCard.houseUrl = jsonParser.getValueAsString();
                    return true;
                case "show":
                    bLiveVirtualVoiceSweetCpCard.show = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVirtualVoiceSweetCpCard bLiveVirtualVoiceSweetCpCard, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("show", bLiveVirtualVoiceSweetCpCard.show);
            String str = bLiveVirtualVoiceSweetCpCard.schema;
            if (str != null) {
                jsonGenerator.writeStringField("schema", str);
            }
            if (bLiveVirtualVoiceSweetCpCard.sweetCp != null) {
                jsonGenerator.writeFieldName("sweetCp");
                BLiveVirtualVoiceCpInfo.JSON_ADAPTER.serialize(bLiveVirtualVoiceSweetCpCard.sweetCp, jsonGenerator, true);
            }
            String str2 = bLiveVirtualVoiceSweetCpCard.houseUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("houseUrl", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVirtualVoiceSweetCpCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevirtualvoicesweetcpcard";

    @NonNull
    @ProtobufIndex(index = 4)
    public String houseUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String schema;

    @ProtobufIndex(index = 1)
    public boolean show;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveVirtualVoiceCpInfo sweetCp;

    public static BLiveVirtualVoiceSweetCpCard new_() {
        BLiveVirtualVoiceSweetCpCard bLiveVirtualVoiceSweetCpCard = new BLiveVirtualVoiceSweetCpCard();
        bLiveVirtualVoiceSweetCpCard.nullCheck();
        return bLiveVirtualVoiceSweetCpCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVirtualVoiceSweetCpCard mo223809clone() {
        BLiveVirtualVoiceSweetCpCard bLiveVirtualVoiceSweetCpCard = new BLiveVirtualVoiceSweetCpCard();
        bLiveVirtualVoiceSweetCpCard.show = this.show;
        bLiveVirtualVoiceSweetCpCard.schema = this.schema;
        BLiveVirtualVoiceCpInfo bLiveVirtualVoiceCpInfo = this.sweetCp;
        if (bLiveVirtualVoiceCpInfo != null) {
            bLiveVirtualVoiceSweetCpCard.sweetCp = bLiveVirtualVoiceCpInfo.mo223809clone();
        }
        bLiveVirtualVoiceSweetCpCard.houseUrl = this.houseUrl;
        return bLiveVirtualVoiceSweetCpCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVirtualVoiceSweetCpCard)) {
            return false;
        }
        BLiveVirtualVoiceSweetCpCard bLiveVirtualVoiceSweetCpCard = (BLiveVirtualVoiceSweetCpCard) obj;
        return this.show == bLiveVirtualVoiceSweetCpCard.show && ValueObject.util_equals(this.schema, bLiveVirtualVoiceSweetCpCard.schema) && ValueObject.util_equals(this.sweetCp, bLiveVirtualVoiceSweetCpCard.sweetCp) && ValueObject.util_equals(this.houseUrl, bLiveVirtualVoiceSweetCpCard.houseUrl);
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
        String str = this.schema;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveVirtualVoiceCpInfo bLiveVirtualVoiceCpInfo = this.sweetCp;
        int iHashCode2 = (iHashCode + (bLiveVirtualVoiceCpInfo != null ? bLiveVirtualVoiceCpInfo.hashCode() : 0)) * 41;
        String str2 = this.houseUrl;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.sweetCp == null) {
            this.sweetCp = BLiveVirtualVoiceCpInfo.new_();
        }
        if (this.houseUrl == null) {
            this.houseUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
