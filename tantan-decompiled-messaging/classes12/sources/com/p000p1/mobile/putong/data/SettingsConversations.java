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
public class SettingsConversations extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "settingsconversations";

    @ProtobufIndex(index = 1)
    public boolean showMomentLikes;
    public static ProtobufAdapter<SettingsConversations> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingsConversations>() { // from class: com.p1.mobile.putong.data.SettingsConversations.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SettingsConversations settingsConversations) {
            int iB = CodedOutputByteBufferNano.b(1, settingsConversations.showMomentLikes);
            ((MessageNano) settingsConversations).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SettingsConversations m18959parse(nb5 nb5Var) throws IOException {
            SettingsConversations settingsConversations = new SettingsConversations();
            while (nb5Var.u() == 8) {
                settingsConversations.showMomentLikes = nb5Var.g();
            }
            return settingsConversations;
        }

        public void serialize(SettingsConversations settingsConversations, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, settingsConversations.showMomentLikes);
        }
    };
    public static JsonAdapter<SettingsConversations> JSON_ADAPTER = new ObjectJsonAdapter<SettingsConversations>() { // from class: com.p1.mobile.putong.data.SettingsConversations.2
        public Class getDataClass() {
            return SettingsConversations.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SettingsConversations mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SettingsConversations settingsConversations, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("showMomentLikes", settingsConversations.showMomentLikes);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingsConversations) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingsConversations) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingsConversations new_() {
        SettingsConversations settingsConversations = new SettingsConversations();
        settingsConversations.nullCheck();
        return settingsConversations;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SettingsConversations m18958clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.showMomentLikes ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
