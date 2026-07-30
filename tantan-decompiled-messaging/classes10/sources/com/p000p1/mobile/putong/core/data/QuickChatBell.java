package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class QuickChatBell extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatbell";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean agree;

    @ProtobufIndex(index = 1)
    public boolean isInitiator;
    public static ProtobufAdapter<QuickChatBell> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickChatBell>() { // from class: com.p1.mobile.putong.core.data.QuickChatBell.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(QuickChatBell quickChatBell) {
            int iB = CodedOutputByteBufferNano.b(1, quickChatBell.isInitiator) + CodedOutputByteBufferNano.b(2, quickChatBell.agree);
            ((MessageNano) quickChatBell).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public QuickChatBell m15153parse(nb5 nb5Var) throws IOException {
            QuickChatBell quickChatBell = new QuickChatBell();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    quickChatBell.isInitiator = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return quickChatBell;
                    }
                    quickChatBell.agree = nb5Var.g();
                }
            }
        }

        public void serialize(QuickChatBell quickChatBell, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, quickChatBell.isInitiator);
            codedOutputByteBufferNano.A(2, quickChatBell.agree);
        }
    };
    public static JsonAdapter<QuickChatBell> JSON_ADAPTER = new ObjectJsonAdapter<QuickChatBell>() { // from class: com.p1.mobile.putong.core.data.QuickChatBell.2
        public Class getDataClass() {
            return QuickChatBell.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public QuickChatBell m15154newInstance() {
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

        public void serializeFields(QuickChatBell quickChatBell, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isInitiator", quickChatBell.isInitiator);
            jsonGenerator.writeBooleanField("agree", quickChatBell.agree);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickChatBell) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickChatBell) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickChatBell new_() {
        QuickChatBell quickChatBell = new QuickChatBell();
        quickChatBell.nullCheck();
        return quickChatBell;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public QuickChatBell m15152clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.isInitiator ? 1231 : 1237)) * 41) + (this.agree ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
