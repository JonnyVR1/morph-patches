package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class UserLiveHierarchy extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "userlivehierarchy";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public UserLiveGradeData anchorHierarchy;

    @NonNull
    @ProtobufIndex(index = 1)
    public UserLiveGradeData hierarchy;
    public static ProtobufAdapter<UserLiveHierarchy> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserLiveHierarchy>() { // from class: com.p1.mobile.putong.core.data.UserLiveHierarchy.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserLiveHierarchy userLiveHierarchy) {
            UserLiveGradeData userLiveGradeData = userLiveHierarchy.hierarchy;
            int iL = userLiveGradeData != null ? CodedOutputByteBufferNano.l(1, userLiveGradeData, UserLiveGradeData.PROTOBUF_ADAPTER) : 0;
            UserLiveGradeData userLiveGradeData2 = userLiveHierarchy.anchorHierarchy;
            if (userLiveGradeData2 != null) {
                iL += CodedOutputByteBufferNano.l(2, userLiveGradeData2, UserLiveGradeData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) userLiveHierarchy).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserLiveHierarchy m16136parse(nb5 nb5Var) throws IOException {
            UserLiveHierarchy userLiveHierarchy = new UserLiveHierarchy();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userLiveHierarchy.hierarchy == null) {
                        userLiveHierarchy.hierarchy = UserLiveGradeData.new_();
                    }
                    if (userLiveHierarchy.anchorHierarchy != null) {
                        break;
                    }
                    userLiveHierarchy.anchorHierarchy = UserLiveGradeData.new_();
                    break;
                }
                if (iU == 10) {
                    userLiveHierarchy.hierarchy = (UserLiveGradeData) nb5Var.l(UserLiveGradeData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (userLiveHierarchy.hierarchy == null) {
                            userLiveHierarchy.hierarchy = UserLiveGradeData.new_();
                        }
                        if (userLiveHierarchy.anchorHierarchy != null) {
                            break;
                        }
                        userLiveHierarchy.anchorHierarchy = UserLiveGradeData.new_();
                        return userLiveHierarchy;
                    }
                    userLiveHierarchy.anchorHierarchy = (UserLiveGradeData) nb5Var.l(UserLiveGradeData.PROTOBUF_ADAPTER);
                }
            }
            return userLiveHierarchy;
        }

        public void serialize(UserLiveHierarchy userLiveHierarchy, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            UserLiveGradeData userLiveGradeData = userLiveHierarchy.hierarchy;
            if (userLiveGradeData != null) {
                codedOutputByteBufferNano.K(1, userLiveGradeData, UserLiveGradeData.PROTOBUF_ADAPTER);
            }
            UserLiveGradeData userLiveGradeData2 = userLiveHierarchy.anchorHierarchy;
            if (userLiveGradeData2 != null) {
                codedOutputByteBufferNano.K(2, userLiveGradeData2, UserLiveGradeData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserLiveHierarchy> JSON_ADAPTER = new ObjectJsonAdapter<UserLiveHierarchy>() { // from class: com.p1.mobile.putong.core.data.UserLiveHierarchy.2
        public Class getDataClass() {
            return UserLiveHierarchy.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserLiveHierarchy m16137newInstance() {
            return new UserLiveHierarchy();
        }

        public boolean parseField(UserLiveHierarchy userLiveHierarchy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("anchorHierarchy")) {
                userLiveHierarchy.anchorHierarchy = (UserLiveGradeData) UserLiveGradeData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("hierarchy")) {
                return false;
            }
            userLiveHierarchy.hierarchy = (UserLiveGradeData) UserLiveGradeData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UserLiveHierarchy userLiveHierarchy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("anchorHierarchy") || str.equals("hierarchy")) {
                return true;
            }
            return super.parseFieldCheck(userLiveHierarchy, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserLiveHierarchy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserLiveHierarchy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserLiveHierarchy new_() {
        UserLiveHierarchy userLiveHierarchy = new UserLiveHierarchy();
        userLiveHierarchy.nullCheck();
        return userLiveHierarchy;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserLiveHierarchy m16135clone() {
        UserLiveHierarchy userLiveHierarchy = new UserLiveHierarchy();
        UserLiveGradeData userLiveGradeData = this.hierarchy;
        if (userLiveGradeData != null) {
            userLiveHierarchy.hierarchy = userLiveGradeData.m16131clone();
        }
        UserLiveGradeData userLiveGradeData2 = this.anchorHierarchy;
        if (userLiveGradeData2 != null) {
            userLiveHierarchy.anchorHierarchy = userLiveGradeData2.m16131clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        UserLiveGradeData userLiveGradeData = this.hierarchy;
        int iHashCode2 = (iHashCode + (userLiveGradeData != null ? userLiveGradeData.hashCode() : 0)) * 41;
        UserLiveGradeData userLiveGradeData2 = this.anchorHierarchy;
        int iHashCode3 = iHashCode2 + (userLiveGradeData2 != null ? userLiveGradeData2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.hierarchy == null) {
            this.hierarchy = UserLiveGradeData.new_();
        }
        if (this.anchorHierarchy == null) {
            this.anchorHierarchy = UserLiveGradeData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
