package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class QuickChatBell extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatbell";

    @ProtobufIndex(index = 2)
    public boolean agree;

    @ProtobufIndex(index = 1)
    public boolean isInitiator;
    public static ProtobufAdapter<QuickChatBell> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickChatBell>() { // from class: com.p1.mobile.putong.core.data.QuickChatBell.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(QuickChatBell quickChatBell) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, quickChatBell.isInitiator) + CodedOutputByteBufferNano.m17220b(2, quickChatBell.agree);
            quickChatBell.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public QuickChatBell parse(nb5 nb5Var) throws IOException {
            QuickChatBell quickChatBell = new QuickChatBell();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    quickChatBell.isInitiator = nb5Var.m158738g();
                } else {
                    if (iM158752u != 16) {
                        return quickChatBell;
                    }
                    quickChatBell.agree = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(QuickChatBell quickChatBell, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, quickChatBell.isInitiator);
            codedOutputByteBufferNano.m17244A(2, quickChatBell.agree);
        }
    };
    public static JsonAdapter<QuickChatBell> JSON_ADAPTER = new ObjectJsonAdapter<QuickChatBell>() { // from class: com.p1.mobile.putong.core.data.QuickChatBell.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return QuickChatBell.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public QuickChatBell newInstance() {
            return new QuickChatBell();
        }

        public boolean parseField(QuickChatBell quickChatBell, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("agree")) {
                quickChatBell.agree = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("isInitiator")) {
                return false;
            }
            quickChatBell.isInitiator = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(QuickChatBell quickChatBell, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("agree") || str.equals("isInitiator")) {
                return true;
            }
            return super.parseFieldCheck(quickChatBell, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(QuickChatBell quickChatBell, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isInitiator", quickChatBell.isInitiator);
            jsonGenerator.writeBooleanField("agree", quickChatBell.agree);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickChatBell) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickChatBell) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickChatBell new_() {
        QuickChatBell quickChatBell = new QuickChatBell();
        quickChatBell.nullCheck();
        return quickChatBell;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public QuickChatBell mo223809clone() {
        QuickChatBell quickChatBell = new QuickChatBell();
        quickChatBell.isInitiator = this.isInitiator;
        quickChatBell.agree = this.agree;
        return quickChatBell;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickChatBell)) {
            return false;
        }
        QuickChatBell quickChatBell = (QuickChatBell) obj;
        return this.isInitiator == quickChatBell.isInitiator && this.agree == quickChatBell.agree;
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
        int i2 = (((i * 41) + (this.isInitiator ? 1231 : 1237)) * 41) + (this.agree ? 1231 : 1237);
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
