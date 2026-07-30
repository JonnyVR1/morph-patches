package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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
public class SettingsMoment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "settingsmoment";

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean hidePublicMoments;
    public static ProtobufAdapter<SettingsMoment> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingsMoment>() { // from class: com.p1.mobile.putong.data.SettingsMoment.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SettingsMoment settingsMoment) {
            Boolean bool = settingsMoment.hidePublicMoments;
            int iB = bool != null ? CodedOutputByteBufferNano.b(1, bool.booleanValue()) : 0;
            ((MessageNano) settingsMoment).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SettingsMoment m18962parse(nb5 nb5Var) throws IOException {
            SettingsMoment settingsMoment = new SettingsMoment();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (settingsMoment.hidePublicMoments != null) {
                        break;
                    }
                    settingsMoment.hidePublicMoments = Boolean.FALSE;
                    break;
                }
                if (iU != 8) {
                    if (settingsMoment.hidePublicMoments != null) {
                        break;
                    }
                    settingsMoment.hidePublicMoments = Boolean.FALSE;
                    return settingsMoment;
                }
                settingsMoment.hidePublicMoments = Boolean.valueOf(nb5Var.g());
            }
            return settingsMoment;
        }

        public void serialize(SettingsMoment settingsMoment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = settingsMoment.hidePublicMoments;
            if (bool != null) {
                codedOutputByteBufferNano.A(1, bool.booleanValue());
            }
        }
    };
    public static JsonAdapter<SettingsMoment> JSON_ADAPTER = new ObjectJsonAdapter<SettingsMoment>() { // from class: com.p1.mobile.putong.data.SettingsMoment.2
        public Class getDataClass() {
            return SettingsMoment.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SettingsMoment mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SettingsMoment settingsMoment, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = settingsMoment.hidePublicMoments;
            if (bool != null) {
                jsonGenerator.writeBooleanField("hidePublicMoments", bool.booleanValue());
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingsMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingsMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingsMoment new_() {
        SettingsMoment settingsMoment = new SettingsMoment();
        settingsMoment.nullCheck();
        return settingsMoment;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SettingsMoment m18961clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Boolean bool = this.hidePublicMoments;
        int iHashCode = i2 + (bool != null ? bool.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.hidePublicMoments == null) {
            this.hidePublicMoments = Boolean.FALSE;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
