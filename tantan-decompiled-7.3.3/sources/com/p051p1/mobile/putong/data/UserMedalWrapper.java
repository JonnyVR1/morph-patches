package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.UserMedal;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class UserMedalWrapper extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usermedalwrapper";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<UserMedal> medals;

    @NonNull
    public List<UserMedal> multiRoomMedals;

    @NonNull
    public List<UserMedal> singleRoomMedals;

    @NonNull
    @ProtobufIndex(index = 1)
    public String version;
    public static ProtobufAdapter<UserMedalWrapper> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserMedalWrapper>() { // from class: com.p1.mobile.putong.data.UserMedalWrapper.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserMedalWrapper userMedalWrapper) {
            String str = userMedalWrapper.version;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<UserMedal> list = userMedalWrapper.medals;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, UserMedal.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            userMedalWrapper.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserMedalWrapper parse(nc5 nc5Var) throws IOException {
            UserMedalWrapper userMedalWrapper = new UserMedalWrapper();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userMedalWrapper.version == null) {
                        userMedalWrapper.version = "";
                    }
                    if (userMedalWrapper.medals == null) {
                        userMedalWrapper.medals = new ArrayList();
                    }
                    if (userMedalWrapper.singleRoomMedals == null) {
                        userMedalWrapper.singleRoomMedals = new ArrayList();
                    }
                    if (userMedalWrapper.multiRoomMedals != null) {
                        break;
                    }
                    userMedalWrapper.multiRoomMedals = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    userMedalWrapper.version = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (userMedalWrapper.version == null) {
                            userMedalWrapper.version = "";
                        }
                        if (userMedalWrapper.medals == null) {
                            userMedalWrapper.medals = new ArrayList();
                        }
                        if (userMedalWrapper.singleRoomMedals == null) {
                            userMedalWrapper.singleRoomMedals = new ArrayList();
                        }
                        if (userMedalWrapper.multiRoomMedals != null) {
                            break;
                        }
                        userMedalWrapper.multiRoomMedals = new ArrayList();
                        return userMedalWrapper;
                    }
                    userMedalWrapper.medals = (List) nc5Var.m162488l(UserMedal.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return userMedalWrapper;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserMedalWrapper userMedalWrapper, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userMedalWrapper.version;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<UserMedal> list = userMedalWrapper.medals;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, UserMedal.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserMedalWrapper> JSON_ADAPTER = new ObjectJsonAdapter<UserMedalWrapper>() { // from class: com.p1.mobile.putong.data.UserMedalWrapper.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserMedalWrapper.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserMedalWrapper newInstance() {
            return new UserMedalWrapper();
        }

        public boolean parseField(UserMedalWrapper userMedalWrapper, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "medals":
                    userMedalWrapper.medals = JsonAdapter.parseArray(jsonParser, UserMedal.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "singleRoomMedals":
                    userMedalWrapper.singleRoomMedals = JsonAdapter.parseArray(jsonParser, UserMedal.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "version":
                    userMedalWrapper.version = jsonParser.getValueAsString();
                    return true;
                case "multiRoomMedals":
                    userMedalWrapper.multiRoomMedals = JsonAdapter.parseArray(jsonParser, UserMedal.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserMedalWrapper userMedalWrapper, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "medals":
                case "singleRoomMedals":
                case "version":
                case "multiRoomMedals":
                    return true;
                default:
                    return super.parseFieldCheck(userMedalWrapper, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserMedalWrapper userMedalWrapper, JsonGenerator jsonGenerator) throws IOException {
            String str = userMedalWrapper.version;
            if (str != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str);
            }
            if (userMedalWrapper.medals != null) {
                jsonGenerator.writeFieldName("medals");
                JsonAdapter.serializeArray(userMedalWrapper.medals, jsonGenerator, UserMedal.JSON_ADAPTER);
            }
            if (userMedalWrapper.singleRoomMedals != null) {
                jsonGenerator.writeFieldName("singleRoomMedals");
                JsonAdapter.serializeArray(userMedalWrapper.singleRoomMedals, jsonGenerator, UserMedal.JSON_ADAPTER);
            }
            if (userMedalWrapper.multiRoomMedals != null) {
                jsonGenerator.writeFieldName("multiRoomMedals");
                JsonAdapter.serializeArray(userMedalWrapper.multiRoomMedals, jsonGenerator, UserMedal.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserMedalWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserMedalWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserMedalWrapper new_() {
        UserMedalWrapper userMedalWrapper = new UserMedalWrapper();
        userMedalWrapper.nullCheck();
        return userMedalWrapper;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserMedalWrapper mo225055clone() {
        UserMedalWrapper userMedalWrapper = new UserMedalWrapper();
        userMedalWrapper.version = this.version;
        List<UserMedal> list = this.medals;
        if (list != null) {
            userMedalWrapper.medals = ValueObject.util_map(list, new qcj() { // from class: l.pfk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((UserMedal) obj).mo225055clone();
                }
            });
        }
        List<UserMedal> list2 = this.singleRoomMedals;
        if (list2 != null) {
            userMedalWrapper.singleRoomMedals = ValueObject.util_map(list2, new qcj() { // from class: l.qfk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((UserMedal) obj).mo225055clone();
                }
            });
        }
        List<UserMedal> list3 = this.multiRoomMedals;
        if (list3 != null) {
            userMedalWrapper.multiRoomMedals = ValueObject.util_map(list3, new qcj() { // from class: l.rfk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((UserMedal) obj).mo225055clone();
                }
            });
        }
        return userMedalWrapper;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserMedalWrapper)) {
            return false;
        }
        UserMedalWrapper userMedalWrapper = (UserMedalWrapper) obj;
        return ValueObject.util_equals(this.version, userMedalWrapper.version) && ValueObject.util_equals(this.medals, userMedalWrapper.medals) && ValueObject.util_equals(this.singleRoomMedals, userMedalWrapper.singleRoomMedals) && ValueObject.util_equals(this.multiRoomMedals, userMedalWrapper.multiRoomMedals);
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
        String str = this.version;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<UserMedal> list = this.medals;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<UserMedal> list2 = this.singleRoomMedals;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<UserMedal> list3 = this.multiRoomMedals;
        int iHashCode4 = iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.version == null) {
            this.version = "";
        }
        if (this.medals == null) {
            this.medals = new ArrayList();
        }
        if (this.singleRoomMedals == null) {
            this.singleRoomMedals = new ArrayList();
        }
        if (this.multiRoomMedals == null) {
            this.multiRoomMedals = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
