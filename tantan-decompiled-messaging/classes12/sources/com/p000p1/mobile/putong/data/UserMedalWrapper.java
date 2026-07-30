package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.UserMedal;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserMedalWrapper userMedalWrapper) {
            String str = userMedalWrapper.version;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<UserMedal> list = userMedalWrapper.medals;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, UserMedal.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) userMedalWrapper).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserMedalWrapper m19196parse(nb5 nb5Var) throws IOException {
            UserMedalWrapper userMedalWrapper = new UserMedalWrapper();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    userMedalWrapper.version = nb5Var.s();
                } else {
                    if (iU != 18) {
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
                    userMedalWrapper.medals = (List) nb5Var.l(UserMedal.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return userMedalWrapper;
        }

        public void serialize(UserMedalWrapper userMedalWrapper, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userMedalWrapper.version;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<UserMedal> list = userMedalWrapper.medals;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, UserMedal.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserMedalWrapper> JSON_ADAPTER = new ObjectJsonAdapter<UserMedalWrapper>() { // from class: com.p1.mobile.putong.data.UserMedalWrapper.2
        public Class getDataClass() {
            return UserMedalWrapper.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserMedalWrapper mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserMedalWrapper userMedalWrapper, JsonGenerator jsonGenerator) throws IOException {
            String str = userMedalWrapper.version;
            if (str != null) {
                jsonGenerator.writeStringField("version", str);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserMedalWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserMedalWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserMedalWrapper new_() {
        UserMedalWrapper userMedalWrapper = new UserMedalWrapper();
        userMedalWrapper.nullCheck();
        return userMedalWrapper;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserMedalWrapper m19195clone() {
        UserMedalWrapper userMedalWrapper = new UserMedalWrapper();
        userMedalWrapper.version = this.version;
        List<UserMedal> list = this.medals;
        if (list != null) {
            userMedalWrapper.medals = ValueObject.util_map(list, new w9j() { // from class: l.j6k0
                public final Object call(Object obj) {
                    return ((UserMedal) obj).m19192clone();
                }
            });
        }
        List<UserMedal> list2 = this.singleRoomMedals;
        if (list2 != null) {
            userMedalWrapper.singleRoomMedals = ValueObject.util_map(list2, new w9j() { // from class: l.k6k0
                public final Object call(Object obj) {
                    return ((UserMedal) obj).m19192clone();
                }
            });
        }
        List<UserMedal> list3 = this.multiRoomMedals;
        if (list3 != null) {
            userMedalWrapper.multiRoomMedals = ValueObject.util_map(list3, new w9j() { // from class: l.l6k0
                public final Object call(Object obj) {
                    return ((UserMedal) obj).m19192clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
