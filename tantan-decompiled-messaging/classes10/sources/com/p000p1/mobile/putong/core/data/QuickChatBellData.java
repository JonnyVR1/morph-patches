package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class QuickChatBellData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatbelldata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String greetTracker;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean isCommonMatch;
    public static ProtobufAdapter<QuickChatBellData> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickChatBellData>() { // from class: com.p1.mobile.putong.core.data.QuickChatBellData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(QuickChatBellData quickChatBellData) {
            String str = quickChatBellData.greetTracker;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, quickChatBellData.isCommonMatch);
            ((MessageNano) quickChatBellData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public QuickChatBellData m15157parse(nb5 nb5Var) throws IOException {
            QuickChatBellData quickChatBellData = new QuickChatBellData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (quickChatBellData.greetTracker != null) {
                        break;
                    }
                    quickChatBellData.greetTracker = "";
                    break;
                }
                if (iU == 10) {
                    quickChatBellData.greetTracker = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (quickChatBellData.greetTracker != null) {
                            break;
                        }
                        quickChatBellData.greetTracker = "";
                        return quickChatBellData;
                    }
                    quickChatBellData.isCommonMatch = nb5Var.g();
                }
            }
            return quickChatBellData;
        }

        public void serialize(QuickChatBellData quickChatBellData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = quickChatBellData.greetTracker;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, quickChatBellData.isCommonMatch);
        }
    };
    public static JsonAdapter<QuickChatBellData> JSON_ADAPTER = new ObjectJsonAdapter<QuickChatBellData>() { // from class: com.p1.mobile.putong.core.data.QuickChatBellData.2
        public Class getDataClass() {
            return QuickChatBellData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public QuickChatBellData m15158newInstance() {
            return new QuickChatBellData();
        }

        public boolean parseField(QuickChatBellData quickChatBellData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("isCommonMatch")) {
                quickChatBellData.isCommonMatch = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("greetTracker")) {
                return false;
            }
            quickChatBellData.greetTracker = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(QuickChatBellData quickChatBellData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isCommonMatch") || str.equals("greetTracker")) {
                return true;
            }
            return super.parseFieldCheck(quickChatBellData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(QuickChatBellData quickChatBellData, JsonGenerator jsonGenerator) throws IOException {
            String str = quickChatBellData.greetTracker;
            if (str != null) {
                jsonGenerator.writeStringField("greetTracker", str);
            }
            jsonGenerator.writeBooleanField("isCommonMatch", quickChatBellData.isCommonMatch);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickChatBellData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickChatBellData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickChatBellData new_() {
        QuickChatBellData quickChatBellData = new QuickChatBellData();
        quickChatBellData.nullCheck();
        return quickChatBellData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public QuickChatBellData m15156clone() {
        QuickChatBellData quickChatBellData = new QuickChatBellData();
        quickChatBellData.greetTracker = this.greetTracker;
        quickChatBellData.isCommonMatch = this.isCommonMatch;
        return quickChatBellData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickChatBellData)) {
            return false;
        }
        QuickChatBellData quickChatBellData = (QuickChatBellData) obj;
        return ValueObject.util_equals(this.greetTracker, quickChatBellData.greetTracker) && this.isCommonMatch == quickChatBellData.isCommonMatch;
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
        String str = this.greetTracker;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isCommonMatch ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.greetTracker == null) {
            this.greetTracker = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
