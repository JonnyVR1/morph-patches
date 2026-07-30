package com.p000p1.mobile.putong.core.data;

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
public class UserPicHideIndex extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userpichideindex";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int female_hide_index;

    @ProtobufIndex(index = 1)
    public int male_hide_index;
    public static ProtobufAdapter<UserPicHideIndex> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserPicHideIndex>() { // from class: com.p1.mobile.putong.core.data.UserPicHideIndex.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserPicHideIndex userPicHideIndex) {
            int iH = CodedOutputByteBufferNano.h(1, userPicHideIndex.male_hide_index) + CodedOutputByteBufferNano.h(2, userPicHideIndex.female_hide_index);
            ((MessageNano) userPicHideIndex).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserPicHideIndex m16148parse(nb5 nb5Var) throws IOException {
            UserPicHideIndex userPicHideIndex = new UserPicHideIndex();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    userPicHideIndex.male_hide_index = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return userPicHideIndex;
                    }
                    userPicHideIndex.female_hide_index = nb5Var.j();
                }
            }
        }

        public void serialize(UserPicHideIndex userPicHideIndex, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, userPicHideIndex.male_hide_index);
            codedOutputByteBufferNano.G(2, userPicHideIndex.female_hide_index);
        }
    };
    public static JsonAdapter<UserPicHideIndex> JSON_ADAPTER = new ObjectJsonAdapter<UserPicHideIndex>() { // from class: com.p1.mobile.putong.core.data.UserPicHideIndex.2
        public Class getDataClass() {
            return UserPicHideIndex.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserPicHideIndex m16149newInstance() {
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

        public void serializeFields(UserPicHideIndex userPicHideIndex, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("male_hide_index", userPicHideIndex.male_hide_index);
            jsonGenerator.writeNumberField("female_hide_index", userPicHideIndex.female_hide_index);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserPicHideIndex) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserPicHideIndex) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserPicHideIndex new_() {
        UserPicHideIndex userPicHideIndex = new UserPicHideIndex();
        userPicHideIndex.nullCheck();
        return userPicHideIndex;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserPicHideIndex m16147clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.male_hide_index) * 41) + this.female_hide_index;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
