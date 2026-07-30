package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class QuickChatBellData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatbelldata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String greetTracker;

    @ProtobufIndex(index = 2)
    public boolean isCommonMatch;
    public static ProtobufAdapter<QuickChatBellData> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickChatBellData>() { // from class: com.p1.mobile.putong.core.data.QuickChatBellData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(QuickChatBellData quickChatBellData) {
            String str = quickChatBellData.greetTracker;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, quickChatBellData.isCommonMatch);
            quickChatBellData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public QuickChatBellData parse(nb5 nb5Var) throws IOException {
            QuickChatBellData quickChatBellData = new QuickChatBellData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (quickChatBellData.greetTracker != null) {
                        break;
                    }
                    quickChatBellData.greetTracker = "";
                    break;
                }
                if (iM158752u == 10) {
                    quickChatBellData.greetTracker = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (quickChatBellData.greetTracker != null) {
                            break;
                        }
                        quickChatBellData.greetTracker = "";
                        return quickChatBellData;
                    }
                    quickChatBellData.isCommonMatch = nb5Var.m158738g();
                }
            }
            return quickChatBellData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(QuickChatBellData quickChatBellData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = quickChatBellData.greetTracker;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, quickChatBellData.isCommonMatch);
        }
    };
    public static JsonAdapter<QuickChatBellData> JSON_ADAPTER = new ObjectJsonAdapter<QuickChatBellData>() { // from class: com.p1.mobile.putong.core.data.QuickChatBellData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return QuickChatBellData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public QuickChatBellData newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(QuickChatBellData quickChatBellData, JsonGenerator jsonGenerator) throws IOException {
            String str = quickChatBellData.greetTracker;
            if (str != null) {
                jsonGenerator.writeStringField("greetTracker", str);
            }
            jsonGenerator.writeBooleanField("isCommonMatch", quickChatBellData.isCommonMatch);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickChatBellData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickChatBellData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickChatBellData new_() {
        QuickChatBellData quickChatBellData = new QuickChatBellData();
        quickChatBellData.nullCheck();
        return quickChatBellData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public QuickChatBellData mo223809clone() {
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
        String str = this.greetTracker;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isCommonMatch ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.greetTracker == null) {
            this.greetTracker = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
