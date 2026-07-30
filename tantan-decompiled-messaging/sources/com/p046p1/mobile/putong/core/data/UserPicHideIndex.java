package com.p046p1.mobile.putong.core.data;

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
public class UserPicHideIndex extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userpichideindex";

    @ProtobufIndex(index = 2)
    public int female_hide_index;

    @ProtobufIndex(index = 1)
    public int male_hide_index;
    public static ProtobufAdapter<UserPicHideIndex> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserPicHideIndex>() { // from class: com.p1.mobile.putong.core.data.UserPicHideIndex.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserPicHideIndex userPicHideIndex) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, userPicHideIndex.male_hide_index) + CodedOutputByteBufferNano.m17226h(2, userPicHideIndex.female_hide_index);
            userPicHideIndex.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserPicHideIndex parse(nb5 nb5Var) throws IOException {
            UserPicHideIndex userPicHideIndex = new UserPicHideIndex();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    userPicHideIndex.male_hide_index = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return userPicHideIndex;
                    }
                    userPicHideIndex.female_hide_index = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserPicHideIndex userPicHideIndex, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, userPicHideIndex.male_hide_index);
            codedOutputByteBufferNano.m17250G(2, userPicHideIndex.female_hide_index);
        }
    };
    public static JsonAdapter<UserPicHideIndex> JSON_ADAPTER = new ObjectJsonAdapter<UserPicHideIndex>() { // from class: com.p1.mobile.putong.core.data.UserPicHideIndex.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserPicHideIndex.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserPicHideIndex newInstance() {
            return new UserPicHideIndex();
        }

        public boolean parseField(UserPicHideIndex userPicHideIndex, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("male_hide_index")) {
                userPicHideIndex.male_hide_index = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("female_hide_index")) {
                return false;
            }
            userPicHideIndex.female_hide_index = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(UserPicHideIndex userPicHideIndex, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("male_hide_index") || str.equals("female_hide_index")) {
                return true;
            }
            return super.parseFieldCheck(userPicHideIndex, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserPicHideIndex userPicHideIndex, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("male_hide_index", userPicHideIndex.male_hide_index);
            jsonGenerator.writeNumberField("female_hide_index", userPicHideIndex.female_hide_index);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserPicHideIndex) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserPicHideIndex) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserPicHideIndex new_() {
        UserPicHideIndex userPicHideIndex = new UserPicHideIndex();
        userPicHideIndex.nullCheck();
        return userPicHideIndex;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserPicHideIndex mo223809clone() {
        UserPicHideIndex userPicHideIndex = new UserPicHideIndex();
        userPicHideIndex.male_hide_index = this.male_hide_index;
        userPicHideIndex.female_hide_index = this.female_hide_index;
        return userPicHideIndex;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserPicHideIndex)) {
            return false;
        }
        UserPicHideIndex userPicHideIndex = (UserPicHideIndex) obj;
        return this.male_hide_index == userPicHideIndex.male_hide_index && this.female_hide_index == userPicHideIndex.female_hide_index;
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
        int i2 = (((i * 41) + this.male_hide_index) * 41) + this.female_hide_index;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
