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
public class SettingsNotifications extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "settingsnotifications";

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean previewPushMessage;
    public static ProtobufAdapter<SettingsNotifications> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingsNotifications>() { // from class: com.p1.mobile.putong.data.SettingsNotifications.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SettingsNotifications settingsNotifications) {
            Boolean bool = settingsNotifications.previewPushMessage;
            int iM17220b = bool != null ? CodedOutputByteBufferNano.m17220b(1, bool.booleanValue()) : 0;
            settingsNotifications.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SettingsNotifications parse(nb5 nb5Var) throws IOException {
            SettingsNotifications settingsNotifications = new SettingsNotifications();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (settingsNotifications.previewPushMessage != null) {
                        break;
                    }
                    settingsNotifications.previewPushMessage = Boolean.FALSE;
                    break;
                }
                if (iM158752u != 8) {
                    if (settingsNotifications.previewPushMessage != null) {
                        break;
                    }
                    settingsNotifications.previewPushMessage = Boolean.FALSE;
                    return settingsNotifications;
                }
                settingsNotifications.previewPushMessage = Boolean.valueOf(nb5Var.m158738g());
            }
            return settingsNotifications;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SettingsNotifications settingsNotifications, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = settingsNotifications.previewPushMessage;
            if (bool != null) {
                codedOutputByteBufferNano.m17244A(1, bool.booleanValue());
            }
        }
    };
    public static JsonAdapter<SettingsNotifications> JSON_ADAPTER = new ObjectJsonAdapter<SettingsNotifications>() { // from class: com.p1.mobile.putong.data.SettingsNotifications.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SettingsNotifications.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SettingsNotifications newInstance() {
            return new SettingsNotifications();
        }

        public boolean parseField(SettingsNotifications settingsNotifications, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("previewPushMessage")) {
                return false;
            }
            settingsNotifications.previewPushMessage = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        }

        public boolean parseFieldCheck(SettingsNotifications settingsNotifications, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("previewPushMessage")) {
                return true;
            }
            return super.parseFieldCheck(settingsNotifications, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SettingsNotifications settingsNotifications, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = settingsNotifications.previewPushMessage;
            if (bool != null) {
                jsonGenerator.writeBooleanField("previewPushMessage", bool.booleanValue());
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingsNotifications) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingsNotifications) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingsNotifications new_() {
        SettingsNotifications settingsNotifications = new SettingsNotifications();
        settingsNotifications.nullCheck();
        return settingsNotifications;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SettingsNotifications mo223809clone() {
        SettingsNotifications settingsNotifications = new SettingsNotifications();
        settingsNotifications.previewPushMessage = this.previewPushMessage;
        return settingsNotifications;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SettingsNotifications) {
            return ValueObject.util_equals(this.previewPushMessage, ((SettingsNotifications) obj).previewPushMessage);
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
        Boolean bool = this.previewPushMessage;
        int iHashCode = i2 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.previewPushMessage == null) {
            this.previewPushMessage = Boolean.FALSE;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
