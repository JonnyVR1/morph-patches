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
public class BLiveVoiceRightAttribute extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceRightAttribute> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRightAttribute>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRightAttribute.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRightAttribute.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRightAttribute newInstance() {
            return new BLiveVoiceRightAttribute();
        }

        public boolean parseField(BLiveVoiceRightAttribute bLiveVoiceRightAttribute, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("avatarConfig")) {
                return false;
            }
            bLiveVoiceRightAttribute.avatarConfig = BLiveMaskAvatarConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRightAttribute bLiveVoiceRightAttribute, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceRightAttribute.avatarConfig != null) {
                jsonGenerator.writeFieldName("avatarConfig");
                BLiveMaskAvatarConfig.JSON_ADAPTER.serialize(bLiveVoiceRightAttribute.avatarConfig, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRightAttribute) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicerightattribute";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveMaskAvatarConfig avatarConfig;

    public static BLiveVoiceRightAttribute new_() {
        BLiveVoiceRightAttribute bLiveVoiceRightAttribute = new BLiveVoiceRightAttribute();
        bLiveVoiceRightAttribute.nullCheck();
        return bLiveVoiceRightAttribute;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRightAttribute mo223809clone() {
        BLiveVoiceRightAttribute bLiveVoiceRightAttribute = new BLiveVoiceRightAttribute();
        BLiveMaskAvatarConfig bLiveMaskAvatarConfig = this.avatarConfig;
        if (bLiveMaskAvatarConfig != null) {
            bLiveVoiceRightAttribute.avatarConfig = bLiveMaskAvatarConfig.mo223809clone();
        }
        return bLiveVoiceRightAttribute;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveVoiceRightAttribute) {
            return ValueObject.util_equals(this.avatarConfig, ((BLiveVoiceRightAttribute) obj).avatarConfig);
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
        BLiveMaskAvatarConfig bLiveMaskAvatarConfig = this.avatarConfig;
        int iHashCode = i2 + (bLiveMaskAvatarConfig != null ? bLiveMaskAvatarConfig.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.avatarConfig == null) {
            this.avatarConfig = BLiveMaskAvatarConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
