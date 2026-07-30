package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class BLiveVerificationAnchor extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVerificationAnchor> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVerificationAnchor>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVerificationAnchor.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVerificationAnchor.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVerificationAnchor newInstance() {
            return new BLiveVerificationAnchor();
        }

        public boolean parseField(BLiveVerificationAnchor bLiveVerificationAnchor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                bLiveVerificationAnchor.status = BLiveVerificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("guildId")) {
                return false;
            }
            bLiveVerificationAnchor.guildId = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVerificationAnchor bLiveVerificationAnchor, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVerificationAnchor.guildId;
            if (str != null) {
                jsonGenerator.writeStringField("guildId", str);
            }
            if (bLiveVerificationAnchor.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                BLiveVerificationStatus.JSON_ADAPTER.serialize(bLiveVerificationAnchor.status, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVerificationAnchor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveverificationanchor";

    @NonNull
    @ProtobufIndex(index = 1)
    public String guildId;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveVerificationStatus status;

    public static BLiveVerificationAnchor new_() {
        BLiveVerificationAnchor bLiveVerificationAnchor = new BLiveVerificationAnchor();
        bLiveVerificationAnchor.nullCheck();
        return bLiveVerificationAnchor;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVerificationAnchor mo223809clone() {
        BLiveVerificationAnchor bLiveVerificationAnchor = new BLiveVerificationAnchor();
        bLiveVerificationAnchor.guildId = this.guildId;
        bLiveVerificationAnchor.status = this.status;
        return bLiveVerificationAnchor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVerificationAnchor)) {
            return false;
        }
        BLiveVerificationAnchor bLiveVerificationAnchor = (BLiveVerificationAnchor) obj;
        return ValueObject.util_equals(this.guildId, bLiveVerificationAnchor.guildId) && ValueObject.util_equals(this.status, bLiveVerificationAnchor.status);
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
        String str = this.guildId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveVerificationStatus bLiveVerificationStatus = this.status;
        int iHashCode2 = iHashCode + (bLiveVerificationStatus != null ? bLiveVerificationStatus.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.guildId == null) {
            this.guildId = "";
        }
        if (this.status == null) {
            this.status = (BLiveVerificationStatus) BLiveVerificationStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
