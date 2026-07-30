package com.p051p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class SettingsTbh extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "settingstbh";

    @Nullable
    @ProtobufIndex(index = 1)
    public SettingsStudies studies;
    public static ProtobufAdapter<SettingsTbh> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingsTbh>() { // from class: com.p1.mobile.putong.data.SettingsTbh.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SettingsTbh settingsTbh) {
            SettingsStudies settingsStudies = settingsTbh.studies;
            int iM17285l = settingsStudies != null ? CodedOutputByteBufferNano.m17285l(1, settingsStudies, SettingsStudies.PROTOBUF_ADAPTER) : 0;
            settingsTbh.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SettingsTbh parse(nc5 nc5Var) throws IOException {
            SettingsTbh settingsTbh = new SettingsTbh();
            while (nc5Var.m162497u() == 10) {
                settingsTbh.studies = (SettingsStudies) nc5Var.m162488l(SettingsStudies.PROTOBUF_ADAPTER);
            }
            return settingsTbh;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SettingsTbh settingsTbh, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SettingsStudies settingsStudies = settingsTbh.studies;
            if (settingsStudies != null) {
                codedOutputByteBufferNano.m17309K(1, settingsStudies, SettingsStudies.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SettingsTbh> JSON_ADAPTER = new ObjectJsonAdapter<SettingsTbh>() { // from class: com.p1.mobile.putong.data.SettingsTbh.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SettingsTbh.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SettingsTbh newInstance() {
            return new SettingsTbh();
        }

        public boolean parseField(SettingsTbh settingsTbh, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Studies.TYPE)) {
                return false;
            }
            settingsTbh.studies = SettingsStudies.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SettingsTbh settingsTbh, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Studies.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(settingsTbh, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SettingsTbh settingsTbh, JsonGenerator jsonGenerator) throws IOException {
            if (settingsTbh.studies != null) {
                jsonGenerator.writeFieldName(Studies.TYPE);
                SettingsStudies.JSON_ADAPTER.serialize(settingsTbh.studies, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingsTbh) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingsTbh) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingsTbh new_() {
        SettingsTbh settingsTbh = new SettingsTbh();
        settingsTbh.nullCheck();
        return settingsTbh;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SettingsTbh mo225055clone() {
        SettingsTbh settingsTbh = new SettingsTbh();
        SettingsStudies settingsStudies = this.studies;
        if (settingsStudies != null) {
            settingsTbh.studies = settingsStudies.mo225055clone();
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
        SettingsStudies settingsStudies = this.studies;
        int iHashCode = i2 + (settingsStudies != null ? settingsStudies.hashCode() : 0);
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
