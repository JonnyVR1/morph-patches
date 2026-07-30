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
public class ProfileUpgradeInterest extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profileupgradeinterest";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String f140id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String url;
    public static ProtobufAdapter<ProfileUpgradeInterest> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileUpgradeInterest>() { // from class: com.p1.mobile.putong.core.data.ProfileUpgradeInterest.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileUpgradeInterest profileUpgradeInterest) {
            String str = profileUpgradeInterest.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = profileUpgradeInterest.url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = profileUpgradeInterest.f140id;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) profileUpgradeInterest).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileUpgradeInterest m15041parse(nb5 nb5Var) throws IOException {
            ProfileUpgradeInterest profileUpgradeInterest = new ProfileUpgradeInterest();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileUpgradeInterest.name == null) {
                        profileUpgradeInterest.name = "";
                    }
                    if (profileUpgradeInterest.url == null) {
                        profileUpgradeInterest.url = "";
                    }
                    if (profileUpgradeInterest.f140id != null) {
                        break;
                    }
                    profileUpgradeInterest.f140id = "";
                    break;
                }
                if (iU == 10) {
                    profileUpgradeInterest.name = nb5Var.s();
                } else if (iU == 18) {
                    profileUpgradeInterest.url = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (profileUpgradeInterest.name == null) {
                            profileUpgradeInterest.name = "";
                        }
                        if (profileUpgradeInterest.url == null) {
                            profileUpgradeInterest.url = "";
                        }
                        if (profileUpgradeInterest.f140id != null) {
                            break;
                        }
                        profileUpgradeInterest.f140id = "";
                        return profileUpgradeInterest;
                    }
                    profileUpgradeInterest.f140id = nb5Var.s();
                }
            }
            return profileUpgradeInterest;
        }

        public void serialize(ProfileUpgradeInterest profileUpgradeInterest, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileUpgradeInterest.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = profileUpgradeInterest.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = profileUpgradeInterest.f140id;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<ProfileUpgradeInterest> JSON_ADAPTER = new ObjectJsonAdapter<ProfileUpgradeInterest>() { // from class: com.p1.mobile.putong.core.data.ProfileUpgradeInterest.2
        public Class getDataClass() {
            return ProfileUpgradeInterest.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileUpgradeInterest m15042newInstance() {
            return new ProfileUpgradeInterest();
        }

        public boolean parseField(ProfileUpgradeInterest profileUpgradeInterest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    profileUpgradeInterest.f140id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    profileUpgradeInterest.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    profileUpgradeInterest.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileUpgradeInterest profileUpgradeInterest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "url":
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(profileUpgradeInterest, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ProfileUpgradeInterest profileUpgradeInterest, JsonGenerator jsonGenerator) throws IOException {
            String str = profileUpgradeInterest.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = profileUpgradeInterest.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = profileUpgradeInterest.f140id;
            if (str3 != null) {
                jsonGenerator.writeStringField("id", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileUpgradeInterest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileUpgradeInterest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileUpgradeInterest new_() {
        ProfileUpgradeInterest profileUpgradeInterest = new ProfileUpgradeInterest();
        profileUpgradeInterest.nullCheck();
        return profileUpgradeInterest;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileUpgradeInterest m15040clone() {
        ProfileUpgradeInterest profileUpgradeInterest = new ProfileUpgradeInterest();
        profileUpgradeInterest.name = this.name;
        profileUpgradeInterest.url = this.url;
        profileUpgradeInterest.f140id = this.f140id;
        return profileUpgradeInterest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileUpgradeInterest)) {
            return false;
        }
        ProfileUpgradeInterest profileUpgradeInterest = (ProfileUpgradeInterest) obj;
        return ValueObject.util_equals(this.name, profileUpgradeInterest.name) && ValueObject.util_equals(this.url, profileUpgradeInterest.url) && ValueObject.util_equals(this.f140id, profileUpgradeInterest.f140id);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.f140id;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.f140id == null) {
            this.f140id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
