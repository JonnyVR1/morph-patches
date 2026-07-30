package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.UserStrategy;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class UserStrategyConfiguration extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userstrategyconfiguration";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<UserStrategy> userStrategyMap;
    public static ProtobufAdapter<UserStrategyConfiguration> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserStrategyConfiguration>() { // from class: com.p1.mobile.putong.core.data.UserStrategyConfiguration.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserStrategyConfiguration userStrategyConfiguration) {
            List<UserStrategy> list = userStrategyConfiguration.userStrategyMap;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, UserStrategy.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) userStrategyConfiguration).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserStrategyConfiguration m16184parse(nb5 nb5Var) throws IOException {
            UserStrategyConfiguration userStrategyConfiguration = new UserStrategyConfiguration();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userStrategyConfiguration.userStrategyMap != null) {
                        break;
                    }
                    userStrategyConfiguration.userStrategyMap = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (userStrategyConfiguration.userStrategyMap != null) {
                        break;
                    }
                    userStrategyConfiguration.userStrategyMap = new ArrayList();
                    return userStrategyConfiguration;
                }
                userStrategyConfiguration.userStrategyMap = (List) nb5Var.l(UserStrategy.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return userStrategyConfiguration;
        }

        public void serialize(UserStrategyConfiguration userStrategyConfiguration, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<UserStrategy> list = userStrategyConfiguration.userStrategyMap;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, UserStrategy.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserStrategyConfiguration> JSON_ADAPTER = new ObjectJsonAdapter<UserStrategyConfiguration>() { // from class: com.p1.mobile.putong.core.data.UserStrategyConfiguration.2
        public Class getDataClass() {
            return UserStrategyConfiguration.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserStrategyConfiguration m16185newInstance() {
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

        public void serializeFields(UserStrategyConfiguration userStrategyConfiguration, JsonGenerator jsonGenerator) throws IOException {
            if (userStrategyConfiguration.userStrategyMap != null) {
                jsonGenerator.writeFieldName("userStrategyMap");
                JsonAdapter.serializeArray(userStrategyConfiguration.userStrategyMap, jsonGenerator, UserStrategy.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserStrategyConfiguration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserStrategyConfiguration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserStrategyConfiguration new_() {
        UserStrategyConfiguration userStrategyConfiguration = new UserStrategyConfiguration();
        userStrategyConfiguration.nullCheck();
        return userStrategyConfiguration;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserStrategyConfiguration m16183clone() {
        UserStrategyConfiguration userStrategyConfiguration = new UserStrategyConfiguration();
        List<UserStrategy> list = this.userStrategyMap;
        if (list != null) {
            userStrategyConfiguration.userStrategyMap = ValueObject.util_map(list, new w9j() { // from class: l.x9k0
                public final Object call(Object obj) {
                    return ((UserStrategy) obj).m16179clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<UserStrategy> list = this.userStrategyMap;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userStrategyMap == null) {
            this.userStrategyMap = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
