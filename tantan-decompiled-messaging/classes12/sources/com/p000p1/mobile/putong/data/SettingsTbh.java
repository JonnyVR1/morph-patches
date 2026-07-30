package com.p000p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class SettingsTbh extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "settingstbh";

    @Nullable
    @ProtobufIndex(index = 1)
    public SettingsStudies studies;
    public static ProtobufAdapter<SettingsTbh> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingsTbh>() { // from class: com.p1.mobile.putong.data.SettingsTbh.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SettingsTbh settingsTbh) {
            SettingsStudies settingsStudies = settingsTbh.studies;
            int iL = settingsStudies != null ? CodedOutputByteBufferNano.l(1, settingsStudies, SettingsStudies.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) settingsTbh).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SettingsTbh m18971parse(nb5 nb5Var) throws IOException {
            SettingsTbh settingsTbh = new SettingsTbh();
            while (nb5Var.u() == 10) {
                settingsTbh.studies = (SettingsStudies) nb5Var.l(SettingsStudies.PROTOBUF_ADAPTER);
            }
            return settingsTbh;
        }

        public void serialize(SettingsTbh settingsTbh, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SettingsStudies settingsStudies = settingsTbh.studies;
            if (settingsStudies != null) {
                codedOutputByteBufferNano.K(1, settingsStudies, SettingsStudies.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SettingsTbh> JSON_ADAPTER = new ObjectJsonAdapter<SettingsTbh>() { // from class: com.p1.mobile.putong.data.SettingsTbh.2
        public Class getDataClass() {
            return SettingsTbh.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SettingsTbh mo17830newInstance() {
            return new SettingsTbh();
        }

        public boolean parseField(SettingsTbh settingsTbh, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Studies.TYPE)) {
                return false;
            }
            settingsTbh.studies = (SettingsStudies) SettingsStudies.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SettingsTbh settingsTbh, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Studies.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(settingsTbh, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SettingsTbh settingsTbh, JsonGenerator jsonGenerator) throws IOException {
            if (settingsTbh.studies != null) {
                jsonGenerator.writeFieldName(Studies.TYPE);
                SettingsStudies.JSON_ADAPTER.serialize(settingsTbh.studies, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingsTbh) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingsTbh) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingsTbh new_() {
        SettingsTbh settingsTbh = new SettingsTbh();
        settingsTbh.nullCheck();
        return settingsTbh;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SettingsTbh m18970clone() {
        SettingsTbh settingsTbh = new SettingsTbh();
        SettingsStudies settingsStudies = this.studies;
        if (settingsStudies != null) {
            settingsTbh.studies = settingsStudies.m18967clone();
        }
        return settingsTbh;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SettingsTbh) {
            return ValueObject.util_equals(this.studies, ((SettingsTbh) obj).studies);
        }
        return false;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        SettingsStudies settingsStudies = this.studies;
        int iHashCode = i2 + (settingsStudies != null ? settingsStudies.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
