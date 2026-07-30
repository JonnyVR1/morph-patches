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
public class SettingsStudies extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "settingsstudies";

    @Nullable
    @ProtobufIndex(index = 2)
    public String grade;

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 1)
    public String f274id;

    @Nullable
    @ProtobufIndex(index = 3)
    public String type;
    public static ProtobufAdapter<SettingsStudies> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingsStudies>() { // from class: com.p1.mobile.putong.data.SettingsStudies.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SettingsStudies settingsStudies) {
            String str = settingsStudies.f274id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = settingsStudies.grade;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = settingsStudies.type;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) settingsStudies).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SettingsStudies m18968parse(nb5 nb5Var) throws IOException {
            SettingsStudies settingsStudies = new SettingsStudies();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    settingsStudies.f274id = nb5Var.s();
                } else if (iU == 18) {
                    settingsStudies.grade = nb5Var.s();
                } else {
                    if (iU != 26) {
                        return settingsStudies;
                    }
                    settingsStudies.type = nb5Var.s();
                }
            }
        }

        public void serialize(SettingsStudies settingsStudies, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = settingsStudies.f274id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = settingsStudies.grade;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = settingsStudies.type;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<SettingsStudies> JSON_ADAPTER = new ObjectJsonAdapter<SettingsStudies>() { // from class: com.p1.mobile.putong.data.SettingsStudies.2
        public Class getDataClass() {
            return SettingsStudies.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SettingsStudies mo17830newInstance() {
            return new SettingsStudies();
        }

        public boolean parseField(SettingsStudies settingsStudies, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    settingsStudies.f274id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SettingsStudies settingsStudies, JsonGenerator jsonGenerator) throws IOException {
            String str = settingsStudies.f274id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = settingsStudies.grade;
            if (str2 != null) {
                jsonGenerator.writeStringField("grade", str2);
            }
            String str3 = settingsStudies.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingsStudies) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingsStudies) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingsStudies new_() {
        SettingsStudies settingsStudies = new SettingsStudies();
        settingsStudies.nullCheck();
        return settingsStudies;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SettingsStudies m18967clone() {
        SettingsStudies settingsStudies = new SettingsStudies();
        settingsStudies.f274id = this.f274id;
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
        return ValueObject.util_equals(this.f274id, settingsStudies.f274id) && ValueObject.util_equals(this.grade, settingsStudies.grade) && ValueObject.util_equals(this.type, settingsStudies.type);
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
        String str = this.f274id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.grade;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
