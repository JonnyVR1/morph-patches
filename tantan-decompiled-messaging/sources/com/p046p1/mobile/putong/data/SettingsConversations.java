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
public class SettingsConversations extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "settingsconversations";

    @ProtobufIndex(index = 1)
    public boolean showMomentLikes;
    public static ProtobufAdapter<SettingsConversations> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingsConversations>() { // from class: com.p1.mobile.putong.data.SettingsConversations.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SettingsConversations settingsConversations) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, settingsConversations.showMomentLikes);
            settingsConversations.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SettingsConversations parse(nb5 nb5Var) throws IOException {
            SettingsConversations settingsConversations = new SettingsConversations();
            while (nb5Var.m158752u() == 8) {
                settingsConversations.showMomentLikes = nb5Var.m158738g();
            }
            return settingsConversations;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SettingsConversations settingsConversations, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, settingsConversations.showMomentLikes);
        }
    };
    public static JsonAdapter<SettingsConversations> JSON_ADAPTER = new ObjectJsonAdapter<SettingsConversations>() { // from class: com.p1.mobile.putong.data.SettingsConversations.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SettingsConversations.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SettingsConversations newInstance() {
            return new SettingsConversations();
        }

        public boolean parseField(SettingsConversations settingsConversations, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("showMomentLikes")) {
                return false;
            }
            settingsConversations.showMomentLikes = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(SettingsConversations settingsConversations, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("showMomentLikes")) {
                return true;
            }
            return super.parseFieldCheck(settingsConversations, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SettingsConversations settingsConversations, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("showMomentLikes", settingsConversations.showMomentLikes);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingsConversations) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingsConversations) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingsConversations new_() {
        SettingsConversations settingsConversations = new SettingsConversations();
        settingsConversations.nullCheck();
        return settingsConversations;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SettingsConversations mo223809clone() {
        SettingsConversations settingsConversations = new SettingsConversations();
        settingsConversations.showMomentLikes = this.showMomentLikes;
        return settingsConversations;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SettingsConversations) && this.showMomentLikes == ((SettingsConversations) obj).showMomentLikes;
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
        int i2 = (i * 41) + (this.showMomentLikes ? 1231 : 1237);
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
