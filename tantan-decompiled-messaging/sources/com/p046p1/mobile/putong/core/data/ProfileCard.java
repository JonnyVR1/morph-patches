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
public class ProfileCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilecard";

    @NonNull
    @ProtobufIndex(index = 3)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 5)
    public String eventlog;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @NonNull
    @ProtobufIndex(index = 4)
    public String url;
    public static ProtobufAdapter<ProfileCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileCard>() { // from class: com.p1.mobile.putong.core.data.ProfileCard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileCard profileCard) {
            String str = profileCard.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = profileCard.subTitle;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = profileCard.buttonText;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = profileCard.url;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = profileCard.eventlog;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            profileCard.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileCard parse(nb5 nb5Var) throws IOException {
            ProfileCard profileCard = new ProfileCard();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (profileCard.title == null) {
                        profileCard.title = "";
                    }
                    if (profileCard.subTitle == null) {
                        profileCard.subTitle = "";
                    }
                    if (profileCard.buttonText == null) {
                        profileCard.buttonText = "";
                    }
                    if (profileCard.url == null) {
                        profileCard.url = "";
                    }
                    if (profileCard.eventlog != null) {
                        break;
                    }
                    profileCard.eventlog = "";
                    break;
                }
                if (iM158752u == 10) {
                    profileCard.title = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    profileCard.subTitle = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    profileCard.buttonText = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    profileCard.url = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (profileCard.title == null) {
                            profileCard.title = "";
                        }
                        if (profileCard.subTitle == null) {
                            profileCard.subTitle = "";
                        }
                        if (profileCard.buttonText == null) {
                            profileCard.buttonText = "";
                        }
                        if (profileCard.url == null) {
                            profileCard.url = "";
                        }
                        if (profileCard.eventlog != null) {
                            break;
                        }
                        profileCard.eventlog = "";
                        return profileCard;
                    }
                    profileCard.eventlog = nb5Var.m158750s();
                }
            }
            return profileCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileCard profileCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileCard.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = profileCard.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = profileCard.buttonText;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = profileCard.url;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = profileCard.eventlog;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
        }
    };
    public static JsonAdapter<ProfileCard> JSON_ADAPTER = new ObjectJsonAdapter<ProfileCard>() { // from class: com.p1.mobile.putong.core.data.ProfileCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileCard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileCard newInstance() {
            return new ProfileCard();
        }

        public boolean parseField(ProfileCard profileCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    profileCard.subTitle = jsonParser.getValueAsString();
                    return true;
                case "url":
                    profileCard.url = jsonParser.getValueAsString();
                    return true;
                case "title":
                    profileCard.title = jsonParser.getValueAsString();
                    return true;
                case "eventlog":
                    profileCard.eventlog = jsonParser.getValueAsString();
                    return true;
                case "buttonText":
                    profileCard.buttonText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileCard profileCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "url":
                case "title":
                case "eventlog":
                case "buttonText":
                    return true;
                default:
                    return super.parseFieldCheck(profileCard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileCard profileCard, JsonGenerator jsonGenerator) throws IOException {
            String str = profileCard.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = profileCard.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = profileCard.buttonText;
            if (str3 != null) {
                jsonGenerator.writeStringField("buttonText", str3);
            }
            String str4 = profileCard.url;
            if (str4 != null) {
                jsonGenerator.writeStringField("url", str4);
            }
            String str5 = profileCard.eventlog;
            if (str5 != null) {
                jsonGenerator.writeStringField("eventlog", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileCard new_() {
        ProfileCard profileCard = new ProfileCard();
        profileCard.nullCheck();
        return profileCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileCard mo223809clone() {
        ProfileCard profileCard = new ProfileCard();
        profileCard.title = this.title;
        profileCard.subTitle = this.subTitle;
        profileCard.buttonText = this.buttonText;
        profileCard.url = this.url;
        profileCard.eventlog = this.eventlog;
        return profileCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileCard)) {
            return false;
        }
        ProfileCard profileCard = (ProfileCard) obj;
        return ValueObject.util_equals(this.title, profileCard.title) && ValueObject.util_equals(this.subTitle, profileCard.subTitle) && ValueObject.util_equals(this.buttonText, profileCard.buttonText) && ValueObject.util_equals(this.url, profileCard.url) && ValueObject.util_equals(this.eventlog, profileCard.eventlog);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.buttonText;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.url;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.eventlog;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.eventlog == null) {
            this.eventlog = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
