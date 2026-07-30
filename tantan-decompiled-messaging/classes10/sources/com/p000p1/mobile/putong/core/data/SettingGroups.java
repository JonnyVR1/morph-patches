package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SettingGroups extends ValueObject<SettingGroups> implements Cloneable, Serializable {
    public static final String TYPE = "settinggroups";
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;
    public static ProtobufAdapter<SettingGroups> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingGroups>() { // from class: com.p1.mobile.putong.core.data.SettingGroups.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SettingGroups m15597parse(nb5 nb5Var) throws IOException {
            SettingGroups settingGroups = new SettingGroups();
            nb5Var.u();
            return settingGroups;
        }

        public void serialize(SettingGroups settingGroups, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        }

        public int computeAndCacheSize(SettingGroups settingGroups) {
            ((MessageNano) settingGroups).cachedSize = 0;
            return 0;
        }
    };
    public static JsonAdapter<SettingGroups> JSON_ADAPTER = new ObjectJsonAdapter<SettingGroups>() { // from class: com.p1.mobile.putong.core.data.SettingGroups.2
        public Class getDataClass() {
            return SettingGroups.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SettingGroups m15598newInstance() {
            return new SettingGroups();
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingGroups) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public boolean parseFieldCheck(SettingGroups settingGroups, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            Objects.requireNonNull(str);
            return super.parseFieldCheck(settingGroups, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SettingGroups settingGroups, JsonGenerator jsonGenerator) throws IOException {
        }

        public boolean parseField(SettingGroups settingGroups, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            Objects.requireNonNull(str);
            return false;
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingGroups) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingGroups new_() {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.nullCheck();
        return settingGroups;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SettingGroups m15596clone() {
        return new SettingGroups();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i == 0) {
            ((ValueObject) this).hashCode = i;
        }
        return i;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(SettingGroups settingGroups) {
        if (!shouldMergeData() || equals(settingGroups)) {
            return;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
