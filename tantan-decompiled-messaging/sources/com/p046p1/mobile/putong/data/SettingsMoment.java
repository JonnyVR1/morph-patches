package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class SettingsMoment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "settingsmoment";

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean hidePublicMoments;
    public static ProtobufAdapter<SettingsMoment> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingsMoment>() { // from class: com.p1.mobile.putong.data.SettingsMoment.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SettingsMoment settingsMoment) {
            Boolean bool = settingsMoment.hidePublicMoments;
            int iM17220b = bool != null ? CodedOutputByteBufferNano.m17220b(1, bool.booleanValue()) : 0;
            settingsMoment.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SettingsMoment parse(nb5 nb5Var) throws IOException {
            SettingsMoment settingsMoment = new SettingsMoment();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (settingsMoment.hidePublicMoments != null) {
                        break;
                    }
                    settingsMoment.hidePublicMoments = Boolean.FALSE;
                    break;
                }
                if (iM158752u != 8) {
                    if (settingsMoment.hidePublicMoments != null) {
                        break;
                    }
                    settingsMoment.hidePublicMoments = Boolean.FALSE;
                    return settingsMoment;
                }
                settingsMoment.hidePublicMoments = Boolean.valueOf(nb5Var.m158738g());
            }
            return settingsMoment;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SettingsMoment settingsMoment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = settingsMoment.hidePublicMoments;
            if (bool != null) {
                codedOutputByteBufferNano.m17244A(1, bool.booleanValue());
            }
        }
    };
    public static JsonAdapter<SettingsMoment> JSON_ADAPTER = new ObjectJsonAdapter<SettingsMoment>() { // from class: com.p1.mobile.putong.data.SettingsMoment.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SettingsMoment.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SettingsMoment newInstance() {
            return new SettingsMoment();
        }

        public boolean parseField(SettingsMoment settingsMoment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("hidePublicMoments")) {
                return false;
            }
            settingsMoment.hidePublicMoments = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        }

        public boolean parseFieldCheck(SettingsMoment settingsMoment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("hidePublicMoments")) {
                return true;
            }
            return super.parseFieldCheck(settingsMoment, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SettingsMoment settingsMoment, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = settingsMoment.hidePublicMoments;
            if (bool != null) {
                jsonGenerator.writeBooleanField("hidePublicMoments", bool.booleanValue());
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingsMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingsMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingsMoment new_() {
        SettingsMoment settingsMoment = new SettingsMoment();
        settingsMoment.nullCheck();
        return settingsMoment;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SettingsMoment mo223809clone() {
        SettingsMoment settingsMoment = new SettingsMoment();
        settingsMoment.hidePublicMoments = this.hidePublicMoments;
        return settingsMoment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SettingsMoment) {
            return ValueObject.util_equals(this.hidePublicMoments, ((SettingsMoment) obj).hidePublicMoments);
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
        Boolean bool = this.hidePublicMoments;
        int iHashCode = i2 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.hidePublicMoments == null) {
            this.hidePublicMoments = Boolean.FALSE;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
