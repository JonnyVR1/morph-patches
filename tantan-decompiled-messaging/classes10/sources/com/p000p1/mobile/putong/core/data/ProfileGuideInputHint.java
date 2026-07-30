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
public class ProfileGuideInputHint extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profileguideinputhint";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String company;

    @NonNull
    @ProtobufIndex(index = 7)
    public String description;

    @NonNull
    @ProtobufIndex(index = 6)
    public String hobby;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String major;

    @NonNull
    @ProtobufIndex(index = 4)
    public String recent;

    @NonNull
    @ProtobufIndex(index = 1)
    public String school;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String together;
    public static ProtobufAdapter<ProfileGuideInputHint> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGuideInputHint>() { // from class: com.p1.mobile.putong.core.data.ProfileGuideInputHint.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileGuideInputHint profileGuideInputHint) {
            String str = profileGuideInputHint.school;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = profileGuideInputHint.major;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = profileGuideInputHint.company;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = profileGuideInputHint.recent;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = profileGuideInputHint.together;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = profileGuideInputHint.hobby;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = profileGuideInputHint.description;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            ((MessageNano) profileGuideInputHint).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileGuideInputHint m14973parse(nb5 nb5Var) throws IOException {
            ProfileGuideInputHint profileGuideInputHint = new ProfileGuideInputHint();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileGuideInputHint.school == null) {
                        profileGuideInputHint.school = "";
                    }
                    if (profileGuideInputHint.major == null) {
                        profileGuideInputHint.major = "";
                    }
                    if (profileGuideInputHint.company == null) {
                        profileGuideInputHint.company = "";
                    }
                    if (profileGuideInputHint.recent == null) {
                        profileGuideInputHint.recent = "";
                    }
                    if (profileGuideInputHint.together == null) {
                        profileGuideInputHint.together = "";
                    }
                    if (profileGuideInputHint.hobby == null) {
                        profileGuideInputHint.hobby = "";
                    }
                    if (profileGuideInputHint.description != null) {
                        break;
                    }
                    profileGuideInputHint.description = "";
                    break;
                }
                if (iU == 10) {
                    profileGuideInputHint.school = nb5Var.s();
                } else if (iU == 18) {
                    profileGuideInputHint.major = nb5Var.s();
                } else if (iU == 26) {
                    profileGuideInputHint.company = nb5Var.s();
                } else if (iU == 34) {
                    profileGuideInputHint.recent = nb5Var.s();
                } else if (iU == 42) {
                    profileGuideInputHint.together = nb5Var.s();
                } else if (iU == 50) {
                    profileGuideInputHint.hobby = nb5Var.s();
                } else {
                    if (iU != 58) {
                        if (profileGuideInputHint.school == null) {
                            profileGuideInputHint.school = "";
                        }
                        if (profileGuideInputHint.major == null) {
                            profileGuideInputHint.major = "";
                        }
                        if (profileGuideInputHint.company == null) {
                            profileGuideInputHint.company = "";
                        }
                        if (profileGuideInputHint.recent == null) {
                            profileGuideInputHint.recent = "";
                        }
                        if (profileGuideInputHint.together == null) {
                            profileGuideInputHint.together = "";
                        }
                        if (profileGuideInputHint.hobby == null) {
                            profileGuideInputHint.hobby = "";
                        }
                        if (profileGuideInputHint.description != null) {
                            break;
                        }
                        profileGuideInputHint.description = "";
                        return profileGuideInputHint;
                    }
                    profileGuideInputHint.description = nb5Var.s();
                }
            }
            return profileGuideInputHint;
        }

        public void serialize(ProfileGuideInputHint profileGuideInputHint, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileGuideInputHint.school;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = profileGuideInputHint.major;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = profileGuideInputHint.company;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = profileGuideInputHint.recent;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = profileGuideInputHint.together;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = profileGuideInputHint.hobby;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = profileGuideInputHint.description;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
        }
    };
    public static JsonAdapter<ProfileGuideInputHint> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGuideInputHint>() { // from class: com.p1.mobile.putong.core.data.ProfileGuideInputHint.2
        public Class getDataClass() {
            return ProfileGuideInputHint.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileGuideInputHint m14974newInstance() {
            return new ProfileGuideInputHint();
        }

        public boolean parseField(ProfileGuideInputHint profileGuideInputHint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    profileGuideInputHint.description = jsonParser.getValueAsString();
                    return true;
                case "together":
                    profileGuideInputHint.together = jsonParser.getValueAsString();
                    return true;
                case "recent":
                    profileGuideInputHint.recent = jsonParser.getValueAsString();
                    return true;
                case "school":
                    profileGuideInputHint.school = jsonParser.getValueAsString();
                    return true;
                case "hobby":
                    profileGuideInputHint.hobby = jsonParser.getValueAsString();
                    return true;
                case "major":
                    profileGuideInputHint.major = jsonParser.getValueAsString();
                    return true;
                case "company":
                    profileGuideInputHint.company = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileGuideInputHint profileGuideInputHint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "together":
                case "recent":
                case "school":
                case "hobby":
                case "major":
                case "company":
                    return true;
                default:
                    return super.parseFieldCheck(profileGuideInputHint, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ProfileGuideInputHint profileGuideInputHint, JsonGenerator jsonGenerator) throws IOException {
            String str = profileGuideInputHint.school;
            if (str != null) {
                jsonGenerator.writeStringField("school", str);
            }
            String str2 = profileGuideInputHint.major;
            if (str2 != null) {
                jsonGenerator.writeStringField("major", str2);
            }
            String str3 = profileGuideInputHint.company;
            if (str3 != null) {
                jsonGenerator.writeStringField(ProfileLikeCategoryType.company, str3);
            }
            String str4 = profileGuideInputHint.recent;
            if (str4 != null) {
                jsonGenerator.writeStringField("recent", str4);
            }
            String str5 = profileGuideInputHint.together;
            if (str5 != null) {
                jsonGenerator.writeStringField("together", str5);
            }
            String str6 = profileGuideInputHint.hobby;
            if (str6 != null) {
                jsonGenerator.writeStringField("hobby", str6);
            }
            String str7 = profileGuideInputHint.description;
            if (str7 != null) {
                jsonGenerator.writeStringField("description", str7);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGuideInputHint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGuideInputHint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileGuideInputHint new_() {
        ProfileGuideInputHint profileGuideInputHint = new ProfileGuideInputHint();
        profileGuideInputHint.nullCheck();
        return profileGuideInputHint;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileGuideInputHint m14972clone() {
        ProfileGuideInputHint profileGuideInputHint = new ProfileGuideInputHint();
        profileGuideInputHint.school = this.school;
        profileGuideInputHint.major = this.major;
        profileGuideInputHint.company = this.company;
        profileGuideInputHint.recent = this.recent;
        profileGuideInputHint.together = this.together;
        profileGuideInputHint.hobby = this.hobby;
        profileGuideInputHint.description = this.description;
        return profileGuideInputHint;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileGuideInputHint)) {
            return false;
        }
        ProfileGuideInputHint profileGuideInputHint = (ProfileGuideInputHint) obj;
        return ValueObject.util_equals(this.school, profileGuideInputHint.school) && ValueObject.util_equals(this.major, profileGuideInputHint.major) && ValueObject.util_equals(this.company, profileGuideInputHint.company) && ValueObject.util_equals(this.recent, profileGuideInputHint.recent) && ValueObject.util_equals(this.together, profileGuideInputHint.together) && ValueObject.util_equals(this.hobby, profileGuideInputHint.hobby) && ValueObject.util_equals(this.description, profileGuideInputHint.description);
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
        String str = this.school;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.major;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.company;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.recent;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.together;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.hobby;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.description;
        int iHashCode7 = iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.school == null) {
            this.school = "";
        }
        if (this.major == null) {
            this.major = "";
        }
        if (this.company == null) {
            this.company = "";
        }
        if (this.recent == null) {
            this.recent = "";
        }
        if (this.together == null) {
            this.together = "";
        }
        if (this.hobby == null) {
            this.hobby = "";
        }
        if (this.description == null) {
            this.description = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
