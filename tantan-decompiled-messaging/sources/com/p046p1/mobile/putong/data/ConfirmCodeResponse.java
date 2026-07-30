package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class ConfirmCodeResponse extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "confirmcoderesponse";

    @NonNull
    @ProtobufIndex(index = 1)
    public String action;
    public static ProtobufAdapter<ConfirmCodeResponse> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConfirmCodeResponse>() { // from class: com.p1.mobile.putong.data.ConfirmCodeResponse.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConfirmCodeResponse confirmCodeResponse) {
            String str = confirmCodeResponse.action;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            confirmCodeResponse.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConfirmCodeResponse parse(nb5 nb5Var) throws IOException {
            ConfirmCodeResponse confirmCodeResponse = new ConfirmCodeResponse();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (confirmCodeResponse.action != null) {
                        break;
                    }
                    confirmCodeResponse.action = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (confirmCodeResponse.action != null) {
                        break;
                    }
                    confirmCodeResponse.action = "";
                    return confirmCodeResponse;
                }
                confirmCodeResponse.action = nb5Var.m158750s();
            }
            return confirmCodeResponse;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConfirmCodeResponse confirmCodeResponse, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = confirmCodeResponse.action;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<ConfirmCodeResponse> JSON_ADAPTER = new ObjectJsonAdapter<ConfirmCodeResponse>() { // from class: com.p1.mobile.putong.data.ConfirmCodeResponse.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConfirmCodeResponse.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConfirmCodeResponse newInstance() {
            return new ConfirmCodeResponse();
        }

        public boolean parseField(ConfirmCodeResponse confirmCodeResponse, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("action")) {
                return false;
            }
            confirmCodeResponse.action = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ConfirmCodeResponse confirmCodeResponse, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("action")) {
                return true;
            }
            return super.parseFieldCheck(confirmCodeResponse, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConfirmCodeResponse confirmCodeResponse, JsonGenerator jsonGenerator) throws IOException {
            String str = confirmCodeResponse.action;
            if (str != null) {
                jsonGenerator.writeStringField("action", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConfirmCodeResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConfirmCodeResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConfirmCodeResponse new_() {
        ConfirmCodeResponse confirmCodeResponse = new ConfirmCodeResponse();
        confirmCodeResponse.nullCheck();
        return confirmCodeResponse;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConfirmCodeResponse mo223809clone() {
        ConfirmCodeResponse confirmCodeResponse = new ConfirmCodeResponse();
        confirmCodeResponse.action = this.action;
        return confirmCodeResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfirmCodeResponse) {
            return ValueObject.util_equals(this.action, ((ConfirmCodeResponse) obj).action);
        }
        return false;
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
        String str = this.action;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.action == null) {
            this.action = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
