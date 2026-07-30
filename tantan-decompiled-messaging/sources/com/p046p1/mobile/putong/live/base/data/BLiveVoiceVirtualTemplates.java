package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceVirtualTemplates extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceVirtualTemplates> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceVirtualTemplates>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceVirtualTemplates.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceVirtualTemplates.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceVirtualTemplates newInstance() {
            return new BLiveVoiceVirtualTemplates();
        }

        public boolean parseField(BLiveVoiceVirtualTemplates bLiveVoiceVirtualTemplates, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("virtualAvatar")) {
                return false;
            }
            bLiveVoiceVirtualTemplates.virtualAvatar = JsonAdapter.parseArray(jsonParser, BLiveTemplate.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceVirtualTemplates bLiveVoiceVirtualTemplates, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceVirtualTemplates.virtualAvatar != null) {
                jsonGenerator.writeFieldName("virtualAvatar");
                JsonAdapter.serializeArray(bLiveVoiceVirtualTemplates.virtualAvatar, jsonGenerator, BLiveTemplate.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceVirtualTemplates) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicevirtualtemplates";

    @Nullable
    @ProtobufIndex(index = 1)
    public List<BLiveTemplate> virtualAvatar;

    public static BLiveVoiceVirtualTemplates new_() {
        BLiveVoiceVirtualTemplates bLiveVoiceVirtualTemplates = new BLiveVoiceVirtualTemplates();
        bLiveVoiceVirtualTemplates.nullCheck();
        return bLiveVoiceVirtualTemplates;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceVirtualTemplates mo223809clone() {
        BLiveVoiceVirtualTemplates bLiveVoiceVirtualTemplates = new BLiveVoiceVirtualTemplates();
        List<BLiveTemplate> list = this.virtualAvatar;
        if (list != null) {
            bLiveVoiceVirtualTemplates.virtualAvatar = ValueObject.util_map(list, new w9j() { // from class: l.ma2
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveTemplate) obj).mo223809clone();
                }
            });
        }
        return bLiveVoiceVirtualTemplates;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveVoiceVirtualTemplates) {
            return ValueObject.util_equals(this.virtualAvatar, ((BLiveVoiceVirtualTemplates) obj).virtualAvatar);
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
        List<BLiveTemplate> list = this.virtualAvatar;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
