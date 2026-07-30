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
public class SwipeUpperLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "swipeupperlimit";

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<SwipeUpperLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<SwipeUpperLimit>() { // from class: com.p1.mobile.putong.core.data.SwipeUpperLimit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SwipeUpperLimit swipeUpperLimit) {
            String str = swipeUpperLimit.userID;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            swipeUpperLimit.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SwipeUpperLimit parse(nb5 nb5Var) throws IOException {
            SwipeUpperLimit swipeUpperLimit = new SwipeUpperLimit();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (swipeUpperLimit.userID != null) {
                        break;
                    }
                    swipeUpperLimit.userID = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (swipeUpperLimit.userID != null) {
                        break;
                    }
                    swipeUpperLimit.userID = "";
                    return swipeUpperLimit;
                }
                swipeUpperLimit.userID = nb5Var.m158750s();
            }
            return swipeUpperLimit;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SwipeUpperLimit swipeUpperLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = swipeUpperLimit.userID;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<SwipeUpperLimit> JSON_ADAPTER = new ObjectJsonAdapter<SwipeUpperLimit>() { // from class: com.p1.mobile.putong.core.data.SwipeUpperLimit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SwipeUpperLimit.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SwipeUpperLimit newInstance() {
            return new SwipeUpperLimit();
        }

        public boolean parseField(SwipeUpperLimit swipeUpperLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("userID")) {
                return false;
            }
            swipeUpperLimit.userID = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SwipeUpperLimit swipeUpperLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userID")) {
                return true;
            }
            return super.parseFieldCheck(swipeUpperLimit, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SwipeUpperLimit swipeUpperLimit, JsonGenerator jsonGenerator) throws IOException {
            String str = swipeUpperLimit.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeUpperLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwipeUpperLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SwipeUpperLimit new_() {
        SwipeUpperLimit swipeUpperLimit = new SwipeUpperLimit();
        swipeUpperLimit.nullCheck();
        return swipeUpperLimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SwipeUpperLimit mo223809clone() {
        SwipeUpperLimit swipeUpperLimit = new SwipeUpperLimit();
        swipeUpperLimit.userID = this.userID;
        return swipeUpperLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SwipeUpperLimit) {
            return ValueObject.util_equals(this.userID, ((SwipeUpperLimit) obj).userID);
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
        String str = this.userID;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
