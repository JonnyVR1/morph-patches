package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Meta;
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
public class UserRightsEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userrightsenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public UserRightsData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<UserRightsEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserRightsEnvelope>() { // from class: com.p1.mobile.putong.core.data.UserRightsEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserRightsEnvelope userRightsEnvelope) {
            Meta meta = userRightsEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            UserRightsData userRightsData = userRightsEnvelope.data;
            if (userRightsData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, userRightsData, UserRightsData.PROTOBUF_ADAPTER);
            }
            userRightsEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserRightsEnvelope parse(nb5 nb5Var) throws IOException {
            UserRightsEnvelope userRightsEnvelope = new UserRightsEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userRightsEnvelope.meta == null) {
                        userRightsEnvelope.meta = Meta.new_();
                    }
                    if (userRightsEnvelope.data != null) {
                        break;
                    }
                    userRightsEnvelope.data = UserRightsData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    userRightsEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (userRightsEnvelope.meta == null) {
                            userRightsEnvelope.meta = Meta.new_();
                        }
                        if (userRightsEnvelope.data != null) {
                            break;
                        }
                        userRightsEnvelope.data = UserRightsData.new_();
                        return userRightsEnvelope;
                    }
                    userRightsEnvelope.data = (UserRightsData) nb5Var.m158743l(UserRightsData.PROTOBUF_ADAPTER);
                }
            }
            return userRightsEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserRightsEnvelope userRightsEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = userRightsEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            UserRightsData userRightsData = userRightsEnvelope.data;
            if (userRightsData != null) {
                codedOutputByteBufferNano.m17254K(2, userRightsData, UserRightsData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserRightsEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<UserRightsEnvelope>() { // from class: com.p1.mobile.putong.core.data.UserRightsEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserRightsEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserRightsEnvelope newInstance() {
            return new UserRightsEnvelope();
        }

        public boolean parseField(UserRightsEnvelope userRightsEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                userRightsEnvelope.data = UserRightsData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            userRightsEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UserRightsEnvelope userRightsEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(userRightsEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserRightsEnvelope userRightsEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (userRightsEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(userRightsEnvelope.meta, jsonGenerator, true);
            }
            if (userRightsEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                UserRightsData.JSON_ADAPTER.serialize(userRightsEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserRightsEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserRightsEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserRightsEnvelope new_() {
        UserRightsEnvelope userRightsEnvelope = new UserRightsEnvelope();
        userRightsEnvelope.nullCheck();
        return userRightsEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserRightsEnvelope mo223809clone() {
        UserRightsEnvelope userRightsEnvelope = new UserRightsEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            userRightsEnvelope.meta = meta.mo223809clone();
        }
        UserRightsData userRightsData = this.data;
        if (userRightsData != null) {
            userRightsEnvelope.data = userRightsData.mo223809clone();
        }
        return userRightsEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserRightsEnvelope)) {
            return false;
        }
        UserRightsEnvelope userRightsEnvelope = (UserRightsEnvelope) obj;
        return ValueObject.util_equals(this.meta, userRightsEnvelope.meta) && ValueObject.util_equals(this.data, userRightsEnvelope.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        UserRightsData userRightsData = this.data;
        int iHashCode2 = iHashCode + (userRightsData != null ? userRightsData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = UserRightsData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
