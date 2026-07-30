package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.UserStrategy;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class UserStrategyConfiguration extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userstrategyconfiguration";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<UserStrategy> userStrategyMap;
    public static ProtobufAdapter<UserStrategyConfiguration> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserStrategyConfiguration>() { // from class: com.p1.mobile.putong.core.data.UserStrategyConfiguration.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserStrategyConfiguration userStrategyConfiguration) {
            List<UserStrategy> list = userStrategyConfiguration.userStrategyMap;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, UserStrategy.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            userStrategyConfiguration.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserStrategyConfiguration parse(nb5 nb5Var) throws IOException {
            UserStrategyConfiguration userStrategyConfiguration = new UserStrategyConfiguration();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userStrategyConfiguration.userStrategyMap != null) {
                        break;
                    }
                    userStrategyConfiguration.userStrategyMap = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (userStrategyConfiguration.userStrategyMap != null) {
                        break;
                    }
                    userStrategyConfiguration.userStrategyMap = new ArrayList();
                    return userStrategyConfiguration;
                }
                userStrategyConfiguration.userStrategyMap = (List) nb5Var.m158743l(UserStrategy.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return userStrategyConfiguration;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserStrategyConfiguration userStrategyConfiguration, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<UserStrategy> list = userStrategyConfiguration.userStrategyMap;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, UserStrategy.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserStrategyConfiguration> JSON_ADAPTER = new ObjectJsonAdapter<UserStrategyConfiguration>() { // from class: com.p1.mobile.putong.core.data.UserStrategyConfiguration.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserStrategyConfiguration.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserStrategyConfiguration newInstance() {
            return new UserStrategyConfiguration();
        }

        public boolean parseField(UserStrategyConfiguration userStrategyConfiguration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("userStrategyMap")) {
                return false;
            }
            userStrategyConfiguration.userStrategyMap = JsonAdapter.parseArray(jsonParser, UserStrategy.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UserStrategyConfiguration userStrategyConfiguration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userStrategyMap")) {
                return true;
            }
            return super.parseFieldCheck(userStrategyConfiguration, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserStrategyConfiguration userStrategyConfiguration, JsonGenerator jsonGenerator) throws IOException {
            if (userStrategyConfiguration.userStrategyMap != null) {
                jsonGenerator.writeFieldName("userStrategyMap");
                JsonAdapter.serializeArray(userStrategyConfiguration.userStrategyMap, jsonGenerator, UserStrategy.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserStrategyConfiguration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserStrategyConfiguration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserStrategyConfiguration new_() {
        UserStrategyConfiguration userStrategyConfiguration = new UserStrategyConfiguration();
        userStrategyConfiguration.nullCheck();
        return userStrategyConfiguration;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserStrategyConfiguration mo223809clone() {
        UserStrategyConfiguration userStrategyConfiguration = new UserStrategyConfiguration();
        List<UserStrategy> list = this.userStrategyMap;
        if (list != null) {
            userStrategyConfiguration.userStrategyMap = ValueObject.util_map(list, new w9j() { // from class: l.x9k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((UserStrategy) obj).mo223809clone();
                }
            });
        }
        return userStrategyConfiguration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserStrategyConfiguration) {
            return ValueObject.util_equals(this.userStrategyMap, ((UserStrategyConfiguration) obj).userStrategyMap);
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
        List<UserStrategy> list = this.userStrategyMap;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userStrategyMap == null) {
            this.userStrategyMap = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
