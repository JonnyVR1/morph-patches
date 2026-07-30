package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ProfileBasicTagItem;
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
public class ProfileBasicTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilebasictag";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String action;

    @NonNull
    @ProtobufIndex(index = 1)
    public String groupName;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<ProfileBasicTagItem> items;
    public static ProtobufAdapter<ProfileBasicTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileBasicTag>() { // from class: com.p1.mobile.putong.core.data.ProfileBasicTag.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileBasicTag profileBasicTag) {
            String str = profileBasicTag.groupName;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = profileBasicTag.action;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<ProfileBasicTagItem> list = profileBasicTag.items;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProfileBasicTagItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) profileBasicTag).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileBasicTag m14913parse(nb5 nb5Var) throws IOException {
            ProfileBasicTag profileBasicTag = new ProfileBasicTag();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileBasicTag.groupName == null) {
                        profileBasicTag.groupName = "";
                    }
                    if (profileBasicTag.action != null) {
                        break;
                    }
                    profileBasicTag.action = "";
                    break;
                }
                if (iU == 10) {
                    profileBasicTag.groupName = nb5Var.s();
                } else if (iU == 18) {
                    profileBasicTag.action = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (profileBasicTag.groupName == null) {
                            profileBasicTag.groupName = "";
                        }
                        if (profileBasicTag.action != null) {
                            break;
                        }
                        profileBasicTag.action = "";
                        return profileBasicTag;
                    }
                    profileBasicTag.items = (List) nb5Var.l(ProfileBasicTagItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileBasicTag;
        }

        public void serialize(ProfileBasicTag profileBasicTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileBasicTag.groupName;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = profileBasicTag.action;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<ProfileBasicTagItem> list = profileBasicTag.items;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProfileBasicTagItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileBasicTag> JSON_ADAPTER = new ObjectJsonAdapter<ProfileBasicTag>() { // from class: com.p1.mobile.putong.core.data.ProfileBasicTag.2
        public Class getDataClass() {
            return ProfileBasicTag.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileBasicTag m14914newInstance() {
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
                jsonGenerator.writeFieldName("items");
                JsonAdapter.serializeArray(profileBasicTag.items, jsonGenerator, ProfileBasicTagItem.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileBasicTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileBasicTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileBasicTag new_() {
        ProfileBasicTag profileBasicTag = new ProfileBasicTag();
        profileBasicTag.nullCheck();
        return profileBasicTag;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileBasicTag m14912clone() {
        ProfileBasicTag profileBasicTag = new ProfileBasicTag();
        profileBasicTag.groupName = this.groupName;
        profileBasicTag.action = this.action;
        List<ProfileBasicTagItem> list = this.items;
        if (list != null) {
            profileBasicTag.items = ValueObject.util_map(list, new w9j() { // from class: l.bh90
                public final Object call(Object obj) {
                    return ((ProfileBasicTagItem) obj).m14916clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.groupName == null) {
            this.groupName = "";
        }
        if (this.action == null) {
            this.action = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
