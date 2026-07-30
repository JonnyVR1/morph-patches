package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.TagCategories;
import com.p000p1.mobile.putong.core.data.UserTagData;
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
public class UserTagsData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usertagsdata";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean clickable;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<TagCategories> tagCategories;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<UserTagData> tags;
    public static ProtobufAdapter<UserTagsData> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserTagsData>() { // from class: com.p1.mobile.putong.core.data.UserTagsData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserTagsData userTagsData) {
            List<UserTagData> list = userTagsData.tags;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<TagCategories> list2 = userTagsData.tagCategories;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iB = iL + CodedOutputByteBufferNano.b(3, userTagsData.clickable);
            ((MessageNano) userTagsData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserTagsData m16196parse(nb5 nb5Var) throws IOException {
            UserTagsData userTagsData = new UserTagsData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userTagsData.tags == null) {
                        userTagsData.tags = new ArrayList();
                    }
                    if (userTagsData.tagCategories != null) {
                        break;
                    }
                    userTagsData.tagCategories = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    userTagsData.tags = (List) nb5Var.l(UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    userTagsData.tagCategories = (List) nb5Var.l(TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 24) {
                        if (userTagsData.tags == null) {
                            userTagsData.tags = new ArrayList();
                        }
                        if (userTagsData.tagCategories != null) {
                            break;
                        }
                        userTagsData.tagCategories = new ArrayList();
                        return userTagsData;
                    }
                    userTagsData.clickable = nb5Var.g();
                }
            }
            return userTagsData;
        }

        public void serialize(UserTagsData userTagsData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<UserTagData> list = userTagsData.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TagCategories> list2 = userTagsData.tagCategories;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(3, userTagsData.clickable);
        }
    };
    public static JsonAdapter<UserTagsData> JSON_ADAPTER = new ObjectJsonAdapter<UserTagsData>() { // from class: com.p1.mobile.putong.core.data.UserTagsData.2
        public Class getDataClass() {
            return UserTagsData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserTagsData m16197newInstance() {
            return new UserTagsData();
        }

        public boolean parseField(UserTagsData userTagsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "clickable":
                    userTagsData.clickable = jsonParser.getValueAsBoolean();
                    return true;
                case "tagCategories":
                    userTagsData.tagCategories = JsonAdapter.parseArray(jsonParser, TagCategories.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "tags":
                    userTagsData.tags = JsonAdapter.parseArray(jsonParser, UserTagData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserTagsData userTagsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "clickable":
                case "tagCategories":
                case "tags":
                    return true;
                default:
                    return super.parseFieldCheck(userTagsData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(UserTagsData userTagsData, JsonGenerator jsonGenerator) throws IOException {
            if (userTagsData.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(userTagsData.tags, jsonGenerator, UserTagData.JSON_ADAPTER);
            }
            if (userTagsData.tagCategories != null) {
                jsonGenerator.writeFieldName("tagCategories");
                JsonAdapter.serializeArray(userTagsData.tagCategories, jsonGenerator, TagCategories.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("clickable", userTagsData.clickable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserTagsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserTagsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserTagsData new_() {
        UserTagsData userTagsData = new UserTagsData();
        userTagsData.nullCheck();
        return userTagsData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserTagsData m16195clone() {
        UserTagsData userTagsData = new UserTagsData();
        List<UserTagData> list = this.tags;
        if (list != null) {
            userTagsData.tags = ValueObject.util_map(list, new w9j() { // from class: l.aak0
                public final Object call(Object obj) {
                    return ((UserTagData) obj).m16187clone();
                }
            });
        }
        List<TagCategories> list2 = this.tagCategories;
        if (list2 != null) {
            userTagsData.tagCategories = ValueObject.util_map(list2, new w9j() { // from class: l.bak0
                public final Object call(Object obj) {
                    return ((TagCategories) obj).m15901clone();
                }
            });
        }
        userTagsData.clickable = this.clickable;
        return userTagsData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserTagsData)) {
            return false;
        }
        UserTagsData userTagsData = (UserTagsData) obj;
        return ValueObject.util_equals(this.tags, userTagsData.tags) && ValueObject.util_equals(this.tagCategories, userTagsData.tagCategories) && this.clickable == userTagsData.clickable;
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
        List<UserTagData> list = this.tags;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<TagCategories> list2 = this.tagCategories;
        int iHashCode2 = ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41) + (this.clickable ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.tagCategories == null) {
            this.tagCategories = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
