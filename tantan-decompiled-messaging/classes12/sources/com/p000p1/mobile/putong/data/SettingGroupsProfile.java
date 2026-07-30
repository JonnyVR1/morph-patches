package com.p000p1.mobile.putong.data;

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
public class SettingGroupsProfile extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "settinggroupsprofile";

    @ProtobufIndex(index = 2)
    public boolean birthChanged;

    @ProtobufIndex(index = 1)
    public boolean sendQuestions;
    public static ProtobufAdapter<SettingGroupsProfile> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingGroupsProfile>() { // from class: com.p1.mobile.putong.data.SettingGroupsProfile.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SettingGroupsProfile settingGroupsProfile) {
            int iB = CodedOutputByteBufferNano.b(1, settingGroupsProfile.sendQuestions) + CodedOutputByteBufferNano.b(2, settingGroupsProfile.birthChanged);
            ((MessageNano) settingGroupsProfile).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SettingGroupsProfile m18950parse(nb5 nb5Var) throws IOException {
            SettingGroupsProfile settingGroupsProfile = new SettingGroupsProfile();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    settingGroupsProfile.sendQuestions = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return settingGroupsProfile;
                    }
                    settingGroupsProfile.birthChanged = nb5Var.g();
                }
            }
        }

        public void serialize(SettingGroupsProfile settingGroupsProfile, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, settingGroupsProfile.sendQuestions);
            codedOutputByteBufferNano.A(2, settingGroupsProfile.birthChanged);
        }
    };
    public static JsonAdapter<SettingGroupsProfile> JSON_ADAPTER = new ObjectJsonAdapter<SettingGroupsProfile>() { // from class: com.p1.mobile.putong.data.SettingGroupsProfile.2
        public Class getDataClass() {
            return SettingGroupsProfile.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SettingGroupsProfile mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SettingGroupsProfile settingGroupsProfile, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("sendQuestions", settingGroupsProfile.sendQuestions);
            jsonGenerator.writeBooleanField("birthChanged", settingGroupsProfile.birthChanged);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingGroupsProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingGroupsProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingGroupsProfile new_() {
        SettingGroupsProfile settingGroupsProfile = new SettingGroupsProfile();
        settingGroupsProfile.nullCheck();
        return settingGroupsProfile;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SettingGroupsProfile m18949clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.sendQuestions ? 1231 : 1237)) * 41) + (this.birthChanged ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
