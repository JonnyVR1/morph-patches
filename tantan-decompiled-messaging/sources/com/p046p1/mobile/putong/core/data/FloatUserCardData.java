package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.User;
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
public class FloatUserCardData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "floatusercarddata";

    @NonNull
    @ProtobufIndex(index = 2)
    public FloatsCardData floatCardData;

    @NonNull
    @ProtobufIndex(index = 1)
    public User user;
    public static ProtobufAdapter<FloatUserCardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<FloatUserCardData>() { // from class: com.p1.mobile.putong.core.data.FloatUserCardData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FloatUserCardData floatUserCardData) {
            User user = floatUserCardData.user;
            int iM17230l = user != null ? CodedOutputByteBufferNano.m17230l(1, user, User.PROTOBUF_ADAPTER) : 0;
            FloatsCardData floatsCardData = floatUserCardData.floatCardData;
            if (floatsCardData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, floatsCardData, FloatsCardData.PROTOBUF_ADAPTER);
            }
            floatUserCardData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FloatUserCardData parse(nb5 nb5Var) throws IOException {
            FloatUserCardData floatUserCardData = new FloatUserCardData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (floatUserCardData.user == null) {
                        floatUserCardData.user = User.new_();
                    }
                    if (floatUserCardData.floatCardData != null) {
                        break;
                    }
                    floatUserCardData.floatCardData = FloatsCardData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    floatUserCardData.user = (User) nb5Var.m158743l(User.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (floatUserCardData.user == null) {
                            floatUserCardData.user = User.new_();
                        }
                        if (floatUserCardData.floatCardData != null) {
                            break;
                        }
                        floatUserCardData.floatCardData = FloatsCardData.new_();
                        return floatUserCardData;
                    }
                    floatUserCardData.floatCardData = (FloatsCardData) nb5Var.m158743l(FloatsCardData.PROTOBUF_ADAPTER);
                }
            }
            return floatUserCardData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FloatUserCardData floatUserCardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            User user = floatUserCardData.user;
            if (user != null) {
                codedOutputByteBufferNano.m17254K(1, user, User.PROTOBUF_ADAPTER);
            }
            FloatsCardData floatsCardData = floatUserCardData.floatCardData;
            if (floatsCardData != null) {
                codedOutputByteBufferNano.m17254K(2, floatsCardData, FloatsCardData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FloatUserCardData> JSON_ADAPTER = new ObjectJsonAdapter<FloatUserCardData>() { // from class: com.p1.mobile.putong.core.data.FloatUserCardData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FloatUserCardData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FloatUserCardData newInstance() {
            return new FloatUserCardData();
        }

        public boolean parseField(FloatUserCardData floatUserCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("floatCardData")) {
                floatUserCardData.floatCardData = FloatsCardData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("user")) {
                return false;
            }
            floatUserCardData.user = User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FloatUserCardData floatUserCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("floatCardData") || str.equals("user")) {
                return true;
            }
            return super.parseFieldCheck(floatUserCardData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FloatUserCardData floatUserCardData, JsonGenerator jsonGenerator) throws IOException {
            if (floatUserCardData.user != null) {
                jsonGenerator.writeFieldName("user");
                User.JSON_ADAPTER.serialize(floatUserCardData.user, jsonGenerator, true);
            }
            if (floatUserCardData.floatCardData != null) {
                jsonGenerator.writeFieldName("floatCardData");
                FloatsCardData.JSON_ADAPTER.serialize(floatUserCardData.floatCardData, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FloatUserCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FloatUserCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FloatUserCardData new_() {
        FloatUserCardData floatUserCardData = new FloatUserCardData();
        floatUserCardData.nullCheck();
        return floatUserCardData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FloatUserCardData mo223809clone() {
        FloatUserCardData floatUserCardData = new FloatUserCardData();
        User user = this.user;
        if (user != null) {
            floatUserCardData.user = user.mo223809clone();
        }
        FloatsCardData floatsCardData = this.floatCardData;
        if (floatsCardData != null) {
            floatUserCardData.floatCardData = floatsCardData.mo223809clone();
        }
        return floatUserCardData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FloatUserCardData)) {
            return false;
        }
        FloatUserCardData floatUserCardData = (FloatUserCardData) obj;
        return ValueObject.util_equals(this.user, floatUserCardData.user) && ValueObject.util_equals(this.floatCardData, floatUserCardData.floatCardData);
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
        User user = this.user;
        int iHashCode = (i2 + (user != null ? user.hashCode() : 0)) * 41;
        FloatsCardData floatsCardData = this.floatCardData;
        int iHashCode2 = iHashCode + (floatsCardData != null ? floatsCardData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.user == null) {
            this.user = User.new_();
        }
        if (this.floatCardData == null) {
            this.floatCardData = FloatsCardData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
