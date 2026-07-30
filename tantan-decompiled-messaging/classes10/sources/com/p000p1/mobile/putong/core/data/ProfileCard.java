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
public class ProfileCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilecard";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String eventlog;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @NonNull
    @ProtobufIndex(index = 4)
    public String url;
    public static ProtobufAdapter<ProfileCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileCard>() { // from class: com.p1.mobile.putong.core.data.ProfileCard.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileCard profileCard) {
            String str = profileCard.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = profileCard.subTitle;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = profileCard.buttonText;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = profileCard.url;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = profileCard.eventlog;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            ((MessageNano) profileCard).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileCard m14921parse(nb5 nb5Var) throws IOException {
            ProfileCard profileCard = new ProfileCard();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    profileCard.title = nb5Var.s();
                } else if (iU == 18) {
                    profileCard.subTitle = nb5Var.s();
                } else if (iU == 26) {
                    profileCard.buttonText = nb5Var.s();
                } else if (iU == 34) {
                    profileCard.url = nb5Var.s();
                } else {
                    if (iU != 42) {
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
                    profileCard.eventlog = nb5Var.s();
                }
            }
            return profileCard;
        }

        public void serialize(ProfileCard profileCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profileCard.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = profileCard.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = profileCard.buttonText;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = profileCard.url;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = profileCard.eventlog;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
        }
    };
    public static JsonAdapter<ProfileCard> JSON_ADAPTER = new ObjectJsonAdapter<ProfileCard>() { // from class: com.p1.mobile.putong.core.data.ProfileCard.2
        public Class getDataClass() {
            return ProfileCard.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileCard m14922newInstance() {
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

        public void serializeFields(ProfileCard profileCard, JsonGenerator jsonGenerator) throws IOException {
            String str = profileCard.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileCard new_() {
        ProfileCard profileCard = new ProfileCard();
        profileCard.nullCheck();
        return profileCard;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileCard m14920clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
