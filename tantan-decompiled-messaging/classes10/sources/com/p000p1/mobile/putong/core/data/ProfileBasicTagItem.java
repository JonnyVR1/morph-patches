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
public class ProfileBasicTagItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilebasictagitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String value;
    public static ProtobufAdapter<ProfileBasicTagItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileBasicTagItem>() { // from class: com.p1.mobile.putong.core.data.ProfileBasicTagItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileBasicTagItem profileBasicTagItem) {
            String str = profileBasicTagItem.key;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = profileBasicTagItem.value;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) profileBasicTagItem).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileBasicTagItem m14917parse(nb5 nb5Var) throws IOException {
            ProfileBasicTagItem profileBasicTagItem = new ProfileBasicTagItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileBasicTagItem.key == null) {
                        profileBasicTagItem.key = "";
                    }
                    if (profileBasicTagItem.value != null) {
                        break;
                    }
                    profileBasicTagItem.value = "";
                    break;
                }
                if (iU == 10) {
                    profileBasicTagItem.key = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (profileBasicTagItem.key == null) {
                            profileBasicTagItem.key = "";
                        }
                        if (profileBasicTagItem.value != null) {
                            break;
                        }
                        profileBasicTagItem.value = "";
                        return profileBasicTagItem;
                    }
                    profileBasicTagItem.value = nb5Var.s();
                }
            }
            return profileBasicTagItem;
        }

        public void serialize(ProfileBasicTagItem profileBasicTagItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileBasicTagItem.key;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = profileBasicTagItem.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<ProfileBasicTagItem> JSON_ADAPTER = new ObjectJsonAdapter<ProfileBasicTagItem>() { // from class: com.p1.mobile.putong.core.data.ProfileBasicTagItem.2
        public Class getDataClass() {
            return ProfileBasicTagItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileBasicTagItem m14918newInstance() {
            return new ProfileBasicTagItem();
        }

        public boolean parseField(ProfileBasicTagItem profileBasicTagItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("key")) {
                profileBasicTagItem.key = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("value")) {
                return false;
            }
            profileBasicTagItem.value = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ProfileBasicTagItem profileBasicTagItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("key") || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(profileBasicTagItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ProfileBasicTagItem profileBasicTagItem, JsonGenerator jsonGenerator) throws IOException {
            String str = profileBasicTagItem.key;
            if (str != null) {
                jsonGenerator.writeStringField("key", str);
            }
            String str2 = profileBasicTagItem.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileBasicTagItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileBasicTagItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileBasicTagItem new_() {
        ProfileBasicTagItem profileBasicTagItem = new ProfileBasicTagItem();
        profileBasicTagItem.nullCheck();
        return profileBasicTagItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileBasicTagItem m14916clone() {
        ProfileBasicTagItem profileBasicTagItem = new ProfileBasicTagItem();
        profileBasicTagItem.key = this.key;
        profileBasicTagItem.value = this.value;
        return profileBasicTagItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileBasicTagItem)) {
            return false;
        }
        ProfileBasicTagItem profileBasicTagItem = (ProfileBasicTagItem) obj;
        return ValueObject.util_equals(this.key, profileBasicTagItem.key) && ValueObject.util_equals(this.value, profileBasicTagItem.value);
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
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
