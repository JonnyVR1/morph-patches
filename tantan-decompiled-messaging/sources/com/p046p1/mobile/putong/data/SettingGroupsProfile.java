package com.p046p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class SettingGroupsProfile extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "settinggroupsprofile";

    @ProtobufIndex(index = 2)
    public boolean birthChanged;

    @ProtobufIndex(index = 1)
    public boolean sendQuestions;
    public static ProtobufAdapter<SettingGroupsProfile> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingGroupsProfile>() { // from class: com.p1.mobile.putong.data.SettingGroupsProfile.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SettingGroupsProfile settingGroupsProfile) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, settingGroupsProfile.sendQuestions) + CodedOutputByteBufferNano.m17220b(2, settingGroupsProfile.birthChanged);
            settingGroupsProfile.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SettingGroupsProfile parse(nb5 nb5Var) throws IOException {
            SettingGroupsProfile settingGroupsProfile = new SettingGroupsProfile();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    settingGroupsProfile.sendQuestions = nb5Var.m158738g();
                } else {
                    if (iM158752u != 16) {
                        return settingGroupsProfile;
                    }
                    settingGroupsProfile.birthChanged = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SettingGroupsProfile settingGroupsProfile, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, settingGroupsProfile.sendQuestions);
            codedOutputByteBufferNano.m17244A(2, settingGroupsProfile.birthChanged);
        }
    };
    public static JsonAdapter<SettingGroupsProfile> JSON_ADAPTER = new ObjectJsonAdapter<SettingGroupsProfile>() { // from class: com.p1.mobile.putong.data.SettingGroupsProfile.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SettingGroupsProfile.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SettingGroupsProfile newInstance() {
            return new SettingGroupsProfile();
        }

        public boolean parseField(SettingGroupsProfile settingGroupsProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("sendQuestions")) {
                settingGroupsProfile.sendQuestions = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("birthChanged")) {
                return false;
            }
            settingGroupsProfile.birthChanged = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(SettingGroupsProfile settingGroupsProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("sendQuestions") || str.equals("birthChanged")) {
                return true;
            }
            return super.parseFieldCheck(settingGroupsProfile, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SettingGroupsProfile settingGroupsProfile, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("sendQuestions", settingGroupsProfile.sendQuestions);
            jsonGenerator.writeBooleanField("birthChanged", settingGroupsProfile.birthChanged);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingGroupsProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingGroupsProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingGroupsProfile new_() {
        SettingGroupsProfile settingGroupsProfile = new SettingGroupsProfile();
        settingGroupsProfile.nullCheck();
        return settingGroupsProfile;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SettingGroupsProfile mo223809clone() {
        SettingGroupsProfile settingGroupsProfile = new SettingGroupsProfile();
        settingGroupsProfile.sendQuestions = this.sendQuestions;
        settingGroupsProfile.birthChanged = this.birthChanged;
        return settingGroupsProfile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SettingGroupsProfile)) {
            return false;
        }
        SettingGroupsProfile settingGroupsProfile = (SettingGroupsProfile) obj;
        return this.sendQuestions == settingGroupsProfile.sendQuestions && this.birthChanged == settingGroupsProfile.birthChanged;
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
        int i2 = (((i * 41) + (this.sendQuestions ? 1231 : 1237)) * 41) + (this.birthChanged ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
