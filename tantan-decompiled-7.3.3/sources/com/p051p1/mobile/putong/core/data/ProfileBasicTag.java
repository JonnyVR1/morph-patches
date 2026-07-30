package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ProfileBasicTagItem;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class ProfileBasicTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilebasictag";

    @NonNull
    @ProtobufIndex(index = 2)
    public String action;

    @NonNull
    @ProtobufIndex(index = 1)
    public String groupName;

    @Nullable
    @ProtobufIndex(index = 3)
    public List<ProfileBasicTagItem> items;
    public static ProtobufAdapter<ProfileBasicTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileBasicTag>() { // from class: com.p1.mobile.putong.core.data.ProfileBasicTag.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileBasicTag profileBasicTag) {
            String str = profileBasicTag.groupName;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = profileBasicTag.action;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<ProfileBasicTagItem> list = profileBasicTag.items;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, ProfileBasicTagItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            profileBasicTag.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileBasicTag parse(nc5 nc5Var) throws IOException {
            ProfileBasicTag profileBasicTag = new ProfileBasicTag();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (profileBasicTag.groupName == null) {
                        profileBasicTag.groupName = "";
                    }
                    if (profileBasicTag.action != null) {
                        break;
                    }
                    profileBasicTag.action = "";
                    break;
                }
                if (iM162497u == 10) {
                    profileBasicTag.groupName = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    profileBasicTag.action = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (profileBasicTag.groupName == null) {
                            profileBasicTag.groupName = "";
                        }
                        if (profileBasicTag.action != null) {
                            break;
                        }
                        profileBasicTag.action = "";
                        return profileBasicTag;
                    }
                    profileBasicTag.items = (List) nc5Var.m162488l(ProfileBasicTagItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileBasicTag;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileBasicTag profileBasicTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileBasicTag.groupName;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = profileBasicTag.action;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<ProfileBasicTagItem> list = profileBasicTag.items;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProfileBasicTagItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileBasicTag> JSON_ADAPTER = new ObjectJsonAdapter<ProfileBasicTag>() { // from class: com.p1.mobile.putong.core.data.ProfileBasicTag.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileBasicTag.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileBasicTag newInstance() {
            return new ProfileBasicTag();
        }

        public boolean parseField(ProfileBasicTag profileBasicTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "groupName":
                    profileBasicTag.groupName = jsonParser.getValueAsString();
                    return true;
                case "action":
                    profileBasicTag.action = jsonParser.getValueAsString();
                    return true;
                case "items":
                    profileBasicTag.items = JsonAdapter.parseArray(jsonParser, ProfileBasicTagItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileBasicTag profileBasicTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "groupName":
                case "action":
                case "items":
                    return true;
                default:
                    return super.parseFieldCheck(profileBasicTag, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileBasicTag profileBasicTag, JsonGenerator jsonGenerator) throws IOException {
            String str = profileBasicTag.groupName;
            if (str != null) {
                jsonGenerator.writeStringField("groupName", str);
            }
            String str2 = profileBasicTag.action;
            if (str2 != null) {
                jsonGenerator.writeStringField("action", str2);
            }
            if (profileBasicTag.items != null) {
                jsonGenerator.writeFieldName(FirebaseAnalytics.Param.ITEMS);
                JsonAdapter.serializeArray(profileBasicTag.items, jsonGenerator, ProfileBasicTagItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileBasicTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileBasicTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileBasicTag new_() {
        ProfileBasicTag profileBasicTag = new ProfileBasicTag();
        profileBasicTag.nullCheck();
        return profileBasicTag;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileBasicTag mo225055clone() {
        ProfileBasicTag profileBasicTag = new ProfileBasicTag();
        profileBasicTag.groupName = this.groupName;
        profileBasicTag.action = this.action;
        List<ProfileBasicTagItem> list = this.items;
        if (list != null) {
            profileBasicTag.items = ValueObject.util_map(list, new qcj() { // from class: l.fp90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ProfileBasicTagItem) obj).mo225055clone();
                }
            });
        }
        return profileBasicTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileBasicTag)) {
            return false;
        }
        ProfileBasicTag profileBasicTag = (ProfileBasicTag) obj;
        return ValueObject.util_equals(this.groupName, profileBasicTag.groupName) && ValueObject.util_equals(this.action, profileBasicTag.action) && ValueObject.util_equals(this.items, profileBasicTag.items);
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
        String str = this.groupName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<ProfileBasicTagItem> list = this.items;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.groupName == null) {
            this.groupName = "";
        }
        if (this.action == null) {
            this.action = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
