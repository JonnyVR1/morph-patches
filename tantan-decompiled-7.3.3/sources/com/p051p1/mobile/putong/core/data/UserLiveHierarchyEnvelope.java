package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class UserLiveHierarchyEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userlivehierarchyenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public UserLiveHierarchy data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<UserLiveHierarchyEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserLiveHierarchyEnvelope>() { // from class: com.p1.mobile.putong.core.data.UserLiveHierarchyEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserLiveHierarchyEnvelope userLiveHierarchyEnvelope) {
            Meta meta = userLiveHierarchyEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            UserLiveHierarchy userLiveHierarchy = userLiveHierarchyEnvelope.data;
            if (userLiveHierarchy != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, userLiveHierarchy, UserLiveHierarchy.PROTOBUF_ADAPTER);
            }
            userLiveHierarchyEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserLiveHierarchyEnvelope parse(nc5 nc5Var) throws IOException {
            UserLiveHierarchyEnvelope userLiveHierarchyEnvelope = new UserLiveHierarchyEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userLiveHierarchyEnvelope.meta == null) {
                        userLiveHierarchyEnvelope.meta = Meta.new_();
                    }
                    if (userLiveHierarchyEnvelope.data != null) {
                        break;
                    }
                    userLiveHierarchyEnvelope.data = UserLiveHierarchy.new_();
                    break;
                }
                if (iM162497u == 10) {
                    userLiveHierarchyEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (userLiveHierarchyEnvelope.meta == null) {
                            userLiveHierarchyEnvelope.meta = Meta.new_();
                        }
                        if (userLiveHierarchyEnvelope.data != null) {
                            break;
                        }
                        userLiveHierarchyEnvelope.data = UserLiveHierarchy.new_();
                        return userLiveHierarchyEnvelope;
                    }
                    userLiveHierarchyEnvelope.data = (UserLiveHierarchy) nc5Var.m162488l(UserLiveHierarchy.PROTOBUF_ADAPTER);
                }
            }
            return userLiveHierarchyEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserLiveHierarchyEnvelope userLiveHierarchyEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = userLiveHierarchyEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            UserLiveHierarchy userLiveHierarchy = userLiveHierarchyEnvelope.data;
            if (userLiveHierarchy != null) {
                codedOutputByteBufferNano.m17309K(2, userLiveHierarchy, UserLiveHierarchy.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserLiveHierarchyEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<UserLiveHierarchyEnvelope>() { // from class: com.p1.mobile.putong.core.data.UserLiveHierarchyEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserLiveHierarchyEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserLiveHierarchyEnvelope newInstance() {
            return new UserLiveHierarchyEnvelope();
        }

        public boolean parseField(UserLiveHierarchyEnvelope userLiveHierarchyEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                userLiveHierarchyEnvelope.data = UserLiveHierarchy.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            userLiveHierarchyEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UserLiveHierarchyEnvelope userLiveHierarchyEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(userLiveHierarchyEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserLiveHierarchyEnvelope userLiveHierarchyEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (userLiveHierarchyEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(userLiveHierarchyEnvelope.meta, jsonGenerator, true);
            }
            if (userLiveHierarchyEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                UserLiveHierarchy.JSON_ADAPTER.serialize(userLiveHierarchyEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserLiveHierarchyEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserLiveHierarchyEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserLiveHierarchyEnvelope new_() {
        UserLiveHierarchyEnvelope userLiveHierarchyEnvelope = new UserLiveHierarchyEnvelope();
        userLiveHierarchyEnvelope.nullCheck();
        return userLiveHierarchyEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserLiveHierarchyEnvelope mo225055clone() {
        UserLiveHierarchyEnvelope userLiveHierarchyEnvelope = new UserLiveHierarchyEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            userLiveHierarchyEnvelope.meta = meta.mo225055clone();
        }
        UserLiveHierarchy userLiveHierarchy = this.data;
        if (userLiveHierarchy != null) {
            userLiveHierarchyEnvelope.data = userLiveHierarchy.mo225055clone();
        }
        return userLiveHierarchyEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserLiveHierarchyEnvelope)) {
            return false;
        }
        UserLiveHierarchyEnvelope userLiveHierarchyEnvelope = (UserLiveHierarchyEnvelope) obj;
        return ValueObject.util_equals(this.meta, userLiveHierarchyEnvelope.meta) && ValueObject.util_equals(this.data, userLiveHierarchyEnvelope.data);
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
        UserLiveHierarchy userLiveHierarchy = this.data;
        int iHashCode2 = iHashCode + (userLiveHierarchy != null ? userLiveHierarchy.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = UserLiveHierarchy.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
