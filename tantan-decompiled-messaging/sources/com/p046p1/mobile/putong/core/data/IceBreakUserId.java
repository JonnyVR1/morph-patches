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
public class IceBreakUserId extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakuserid";

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<IceBreakUserId> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakUserId>() { // from class: com.p1.mobile.putong.core.data.IceBreakUserId.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IceBreakUserId iceBreakUserId) {
            String str = iceBreakUserId.userId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            iceBreakUserId.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IceBreakUserId parse(nb5 nb5Var) throws IOException {
            IceBreakUserId iceBreakUserId = new IceBreakUserId();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (iceBreakUserId.userId != null) {
                        break;
                    }
                    iceBreakUserId.userId = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (iceBreakUserId.userId != null) {
                        break;
                    }
                    iceBreakUserId.userId = "";
                    return iceBreakUserId;
                }
                iceBreakUserId.userId = nb5Var.m158750s();
            }
            return iceBreakUserId;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IceBreakUserId iceBreakUserId, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iceBreakUserId.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<IceBreakUserId> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakUserId>() { // from class: com.p1.mobile.putong.core.data.IceBreakUserId.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IceBreakUserId.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IceBreakUserId newInstance() {
            return new IceBreakUserId();
        }

        public boolean parseField(IceBreakUserId iceBreakUserId, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("userId")) {
                return false;
            }
            iceBreakUserId.userId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IceBreakUserId iceBreakUserId, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId")) {
                return true;
            }
            return super.parseFieldCheck(iceBreakUserId, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IceBreakUserId iceBreakUserId, JsonGenerator jsonGenerator) throws IOException {
            String str = iceBreakUserId.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakUserId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreakUserId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreakUserId new_() {
        IceBreakUserId iceBreakUserId = new IceBreakUserId();
        iceBreakUserId.nullCheck();
        return iceBreakUserId;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IceBreakUserId mo223809clone() {
        IceBreakUserId iceBreakUserId = new IceBreakUserId();
        iceBreakUserId.userId = this.userId;
        return iceBreakUserId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IceBreakUserId) {
            return ValueObject.util_equals(this.userId, ((IceBreakUserId) obj).userId);
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
        String str = this.userId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
