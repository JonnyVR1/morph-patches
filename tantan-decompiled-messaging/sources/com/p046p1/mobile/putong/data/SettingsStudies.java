package com.p046p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Grade;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class SettingsStudies extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "settingsstudies";

    @Nullable
    @ProtobufIndex(index = 2)
    public String grade;

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 1)
    public String f38813id;

    @Nullable
    @ProtobufIndex(index = 3)
    public String type;
    public static ProtobufAdapter<SettingsStudies> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingsStudies>() { // from class: com.p1.mobile.putong.data.SettingsStudies.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SettingsStudies settingsStudies) {
            String str = settingsStudies.f38813id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = settingsStudies.grade;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = settingsStudies.type;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            settingsStudies.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SettingsStudies parse(nb5 nb5Var) throws IOException {
            SettingsStudies settingsStudies = new SettingsStudies();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    settingsStudies.f38813id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    settingsStudies.grade = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        return settingsStudies;
                    }
                    settingsStudies.type = nb5Var.m158750s();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SettingsStudies settingsStudies, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = settingsStudies.f38813id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = settingsStudies.grade;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = settingsStudies.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<SettingsStudies> JSON_ADAPTER = new ObjectJsonAdapter<SettingsStudies>() { // from class: com.p1.mobile.putong.data.SettingsStudies.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SettingsStudies.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SettingsStudies newInstance() {
            return new SettingsStudies();
        }

        public boolean parseField(SettingsStudies settingsStudies, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    settingsStudies.f38813id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    settingsStudies.type = jsonParser.getValueAsString();
                    return true;
                case "grade":
                    settingsStudies.grade = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SettingsStudies settingsStudies, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "type":
                case "grade":
                    return true;
                default:
                    return super.parseFieldCheck(settingsStudies, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SettingsStudies settingsStudies, JsonGenerator jsonGenerator) throws IOException {
            String str = settingsStudies.f38813id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = settingsStudies.grade;
            if (str2 != null) {
                jsonGenerator.writeStringField(Grade.TYPE, str2);
            }
            String str3 = settingsStudies.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingsStudies) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingsStudies) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingsStudies new_() {
        SettingsStudies settingsStudies = new SettingsStudies();
        settingsStudies.nullCheck();
        return settingsStudies;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SettingsStudies mo223809clone() {
        SettingsStudies settingsStudies = new SettingsStudies();
        settingsStudies.f38813id = this.f38813id;
        settingsStudies.grade = this.grade;
        settingsStudies.type = this.type;
        return settingsStudies;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SettingsStudies)) {
            return false;
        }
        SettingsStudies settingsStudies = (SettingsStudies) obj;
        return ValueObject.util_equals(this.f38813id, settingsStudies.f38813id) && ValueObject.util_equals(this.grade, settingsStudies.grade) && ValueObject.util_equals(this.type, settingsStudies.type);
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
        String str = this.f38813id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.grade;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
