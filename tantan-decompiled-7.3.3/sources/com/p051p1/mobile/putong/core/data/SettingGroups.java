package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class SettingGroups extends ValueObject<SettingGroups> implements Cloneable, Serializable {
    public static final String TYPE = "settinggroups";
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;
    public static ProtobufAdapter<SettingGroups> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingGroups>() { // from class: com.p1.mobile.putong.core.data.SettingGroups.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SettingGroups parse(nc5 nc5Var) throws IOException {
            SettingGroups settingGroups = new SettingGroups();
            nc5Var.m162497u();
            return settingGroups;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SettingGroups settingGroups, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SettingGroups settingGroups) {
            settingGroups.cachedSize = 0;
            return 0;
        }
    };
    public static JsonAdapter<SettingGroups> JSON_ADAPTER = new ObjectJsonAdapter<SettingGroups>() { // from class: com.p1.mobile.putong.core.data.SettingGroups.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SettingGroups.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SettingGroups newInstance() {
            return new SettingGroups();
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingGroups) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public boolean parseFieldCheck(SettingGroups settingGroups, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            Objects.requireNonNull(str);
            return super.parseFieldCheck(settingGroups, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SettingGroups settingGroups, JsonGenerator jsonGenerator) throws IOException {
        }

        public boolean parseField(SettingGroups settingGroups, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            Objects.requireNonNull(str);
            return false;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingGroups) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingGroups new_() {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.nullCheck();
        return settingGroups;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SettingGroups mo225055clone() {
        return new SettingGroups();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "settinggroups";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            this.hashCode = i;
        }
        return i;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(SettingGroups settingGroups) {
        if (!shouldMergeData() || equals(settingGroups)) {
            return;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public SettingGroups subtract(SettingGroups settingGroups) {
        SettingGroups settingGroups2 = new SettingGroups();
        if (settingGroups2.equals(new SettingGroups())) {
            return null;
        }
        return settingGroups2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
