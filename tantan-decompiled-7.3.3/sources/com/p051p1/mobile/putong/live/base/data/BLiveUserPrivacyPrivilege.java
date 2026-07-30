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
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUserPrivacyPrivilege extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserPrivacyPrivilege> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserPrivacyPrivilege>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserPrivacyPrivilege.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserPrivacyPrivilege.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserPrivacyPrivilege newInstance() {
            return new BLiveUserPrivacyPrivilege();
        }

        public boolean parseField(BLiveUserPrivacyPrivilege bLiveUserPrivacyPrivilege, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("hiddenConsumeRecordButton")) {
                return false;
            }
            bLiveUserPrivacyPrivilege.hiddenConsumeRecordButton = BLiveHiddenConsumeRecordButton.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserPrivacyPrivilege bLiveUserPrivacyPrivilege, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveUserPrivacyPrivilege.hiddenConsumeRecordButton != null) {
                jsonGenerator.writeFieldName("hiddenConsumeRecordButton");
                BLiveHiddenConsumeRecordButton.JSON_ADAPTER.serialize(bLiveUserPrivacyPrivilege.hiddenConsumeRecordButton, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserPrivacyPrivilege) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveuserprivacyprivilege";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveHiddenConsumeRecordButton hiddenConsumeRecordButton;

    public static BLiveUserPrivacyPrivilege new_() {
        BLiveUserPrivacyPrivilege bLiveUserPrivacyPrivilege = new BLiveUserPrivacyPrivilege();
        bLiveUserPrivacyPrivilege.nullCheck();
        return bLiveUserPrivacyPrivilege;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserPrivacyPrivilege mo225055clone() {
        BLiveUserPrivacyPrivilege bLiveUserPrivacyPrivilege = new BLiveUserPrivacyPrivilege();
        BLiveHiddenConsumeRecordButton bLiveHiddenConsumeRecordButton = this.hiddenConsumeRecordButton;
        if (bLiveHiddenConsumeRecordButton != null) {
            bLiveUserPrivacyPrivilege.hiddenConsumeRecordButton = bLiveHiddenConsumeRecordButton.mo225055clone();
        }
        return bLiveUserPrivacyPrivilege;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveUserPrivacyPrivilege) {
            return ValueObject.util_equals(this.hiddenConsumeRecordButton, ((BLiveUserPrivacyPrivilege) obj).hiddenConsumeRecordButton);
        }
        return false;
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
        BLiveHiddenConsumeRecordButton bLiveHiddenConsumeRecordButton = this.hiddenConsumeRecordButton;
        int iHashCode = i2 + (bLiveHiddenConsumeRecordButton != null ? bLiveHiddenConsumeRecordButton.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.hiddenConsumeRecordButton == null) {
            this.hiddenConsumeRecordButton = BLiveHiddenConsumeRecordButton.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
