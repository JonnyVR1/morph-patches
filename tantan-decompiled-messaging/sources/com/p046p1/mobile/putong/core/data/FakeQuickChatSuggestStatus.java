package com.p046p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class FakeQuickChatSuggestStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakequickchatsuggeststatus";

    @ProtobufIndex(index = 2)
    public boolean retryFlag;

    @Nullable
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<FakeQuickChatSuggestStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakeQuickChatSuggestStatus>() { // from class: com.p1.mobile.putong.core.data.FakeQuickChatSuggestStatus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FakeQuickChatSuggestStatus fakeQuickChatSuggestStatus) {
            String str = fakeQuickChatSuggestStatus.userID;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, fakeQuickChatSuggestStatus.retryFlag);
            fakeQuickChatSuggestStatus.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FakeQuickChatSuggestStatus parse(nb5 nb5Var) throws IOException {
            FakeQuickChatSuggestStatus fakeQuickChatSuggestStatus = new FakeQuickChatSuggestStatus();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    fakeQuickChatSuggestStatus.userID = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        return fakeQuickChatSuggestStatus;
                    }
                    fakeQuickChatSuggestStatus.retryFlag = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FakeQuickChatSuggestStatus fakeQuickChatSuggestStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fakeQuickChatSuggestStatus.userID;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, fakeQuickChatSuggestStatus.retryFlag);
        }
    };
    public static JsonAdapter<FakeQuickChatSuggestStatus> JSON_ADAPTER = new ObjectJsonAdapter<FakeQuickChatSuggestStatus>() { // from class: com.p1.mobile.putong.core.data.FakeQuickChatSuggestStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FakeQuickChatSuggestStatus.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FakeQuickChatSuggestStatus newInstance() {
            return new FakeQuickChatSuggestStatus();
        }

        public boolean parseField(FakeQuickChatSuggestStatus fakeQuickChatSuggestStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("retryFlag")) {
                fakeQuickChatSuggestStatus.retryFlag = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("userID")) {
                return false;
            }
            fakeQuickChatSuggestStatus.userID = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(FakeQuickChatSuggestStatus fakeQuickChatSuggestStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("retryFlag") || str.equals("userID")) {
                return true;
            }
            return super.parseFieldCheck(fakeQuickChatSuggestStatus, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FakeQuickChatSuggestStatus fakeQuickChatSuggestStatus, JsonGenerator jsonGenerator) throws IOException {
            String str = fakeQuickChatSuggestStatus.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            jsonGenerator.writeBooleanField("retryFlag", fakeQuickChatSuggestStatus.retryFlag);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakeQuickChatSuggestStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakeQuickChatSuggestStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakeQuickChatSuggestStatus new_() {
        FakeQuickChatSuggestStatus fakeQuickChatSuggestStatus = new FakeQuickChatSuggestStatus();
        fakeQuickChatSuggestStatus.nullCheck();
        return fakeQuickChatSuggestStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FakeQuickChatSuggestStatus mo223809clone() {
        FakeQuickChatSuggestStatus fakeQuickChatSuggestStatus = new FakeQuickChatSuggestStatus();
        fakeQuickChatSuggestStatus.userID = this.userID;
        fakeQuickChatSuggestStatus.retryFlag = this.retryFlag;
        return fakeQuickChatSuggestStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FakeQuickChatSuggestStatus)) {
            return false;
        }
        FakeQuickChatSuggestStatus fakeQuickChatSuggestStatus = (FakeQuickChatSuggestStatus) obj;
        return ValueObject.util_equals(this.userID, fakeQuickChatSuggestStatus.userID) && this.retryFlag == fakeQuickChatSuggestStatus.retryFlag;
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
        String str = this.userID;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.retryFlag ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
