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
public class UserLiveHierarchy extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "userlivehierarchy";

    @NonNull
    @ProtobufIndex(index = 2)
    public UserLiveGradeData anchorHierarchy;

    @NonNull
    @ProtobufIndex(index = 1)
    public UserLiveGradeData hierarchy;
    public static ProtobufAdapter<UserLiveHierarchy> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserLiveHierarchy>() { // from class: com.p1.mobile.putong.core.data.UserLiveHierarchy.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserLiveHierarchy userLiveHierarchy) {
            UserLiveGradeData userLiveGradeData = userLiveHierarchy.hierarchy;
            int iM17230l = userLiveGradeData != null ? CodedOutputByteBufferNano.m17230l(1, userLiveGradeData, UserLiveGradeData.PROTOBUF_ADAPTER) : 0;
            UserLiveGradeData userLiveGradeData2 = userLiveHierarchy.anchorHierarchy;
            if (userLiveGradeData2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, userLiveGradeData2, UserLiveGradeData.PROTOBUF_ADAPTER);
            }
            userLiveHierarchy.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserLiveHierarchy parse(nb5 nb5Var) throws IOException {
            UserLiveHierarchy userLiveHierarchy = new UserLiveHierarchy();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userLiveHierarchy.hierarchy == null) {
                        userLiveHierarchy.hierarchy = UserLiveGradeData.new_();
                    }
                    if (userLiveHierarchy.anchorHierarchy != null) {
                        break;
                    }
                    userLiveHierarchy.anchorHierarchy = UserLiveGradeData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    userLiveHierarchy.hierarchy = (UserLiveGradeData) nb5Var.m158743l(UserLiveGradeData.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (userLiveHierarchy.hierarchy == null) {
                            userLiveHierarchy.hierarchy = UserLiveGradeData.new_();
                        }
                        if (userLiveHierarchy.anchorHierarchy != null) {
                            break;
                        }
                        userLiveHierarchy.anchorHierarchy = UserLiveGradeData.new_();
                        return userLiveHierarchy;
                    }
                    userLiveHierarchy.anchorHierarchy = (UserLiveGradeData) nb5Var.m158743l(UserLiveGradeData.PROTOBUF_ADAPTER);
                }
            }
            return userLiveHierarchy;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserLiveHierarchy userLiveHierarchy, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            UserLiveGradeData userLiveGradeData = userLiveHierarchy.hierarchy;
            if (userLiveGradeData != null) {
                codedOutputByteBufferNano.m17254K(1, userLiveGradeData, UserLiveGradeData.PROTOBUF_ADAPTER);
            }
            UserLiveGradeData userLiveGradeData2 = userLiveHierarchy.anchorHierarchy;
            if (userLiveGradeData2 != null) {
                codedOutputByteBufferNano.m17254K(2, userLiveGradeData2, UserLiveGradeData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserLiveHierarchy> JSON_ADAPTER = new ObjectJsonAdapter<UserLiveHierarchy>() { // from class: com.p1.mobile.putong.core.data.UserLiveHierarchy.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserLiveHierarchy.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserLiveHierarchy newInstance() {
            return new UserLiveHierarchy();
        }

        public boolean parseField(UserLiveHierarchy userLiveHierarchy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("anchorHierarchy")) {
                userLiveHierarchy.anchorHierarchy = UserLiveGradeData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("hierarchy")) {
                return false;
            }
            userLiveHierarchy.hierarchy = UserLiveGradeData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UserLiveHierarchy userLiveHierarchy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("anchorHierarchy") || str.equals("hierarchy")) {
                return true;
            }
            return super.parseFieldCheck(userLiveHierarchy, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserLiveHierarchy userLiveHierarchy, JsonGenerator jsonGenerator) throws IOException {
            if (userLiveHierarchy.hierarchy != null) {
                jsonGenerator.writeFieldName("hierarchy");
                UserLiveGradeData.JSON_ADAPTER.serialize(userLiveHierarchy.hierarchy, jsonGenerator, true);
            }
            if (userLiveHierarchy.anchorHierarchy != null) {
                jsonGenerator.writeFieldName("anchorHierarchy");
                UserLiveGradeData.JSON_ADAPTER.serialize(userLiveHierarchy.anchorHierarchy, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserLiveHierarchy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserLiveHierarchy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserLiveHierarchy new_() {
        UserLiveHierarchy userLiveHierarchy = new UserLiveHierarchy();
        userLiveHierarchy.nullCheck();
        return userLiveHierarchy;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserLiveHierarchy mo223809clone() {
        UserLiveHierarchy userLiveHierarchy = new UserLiveHierarchy();
        UserLiveGradeData userLiveGradeData = this.hierarchy;
        if (userLiveGradeData != null) {
            userLiveHierarchy.hierarchy = userLiveGradeData.mo223809clone();
        }
        UserLiveGradeData userLiveGradeData2 = this.anchorHierarchy;
        if (userLiveGradeData2 != null) {
            userLiveHierarchy.anchorHierarchy = userLiveGradeData2.mo223809clone();
        }
        return userLiveHierarchy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserLiveHierarchy)) {
            return false;
        }
        UserLiveHierarchy userLiveHierarchy = (UserLiveHierarchy) obj;
        return this == obj && ValueObject.util_equals(this.hierarchy, userLiveHierarchy.hierarchy) && ValueObject.util_equals(this.anchorHierarchy, userLiveHierarchy.anchorHierarchy);
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
        int iHashCode = super.hashCode() * 41;
        UserLiveGradeData userLiveGradeData = this.hierarchy;
        int iHashCode2 = (iHashCode + (userLiveGradeData != null ? userLiveGradeData.hashCode() : 0)) * 41;
        UserLiveGradeData userLiveGradeData2 = this.anchorHierarchy;
        int iHashCode3 = iHashCode2 + (userLiveGradeData2 != null ? userLiveGradeData2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.hierarchy == null) {
            this.hierarchy = UserLiveGradeData.new_();
        }
        if (this.anchorHierarchy == null) {
            this.anchorHierarchy = UserLiveGradeData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
