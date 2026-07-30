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
public class ProfileUpgradeGuideText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profileupgradeguidetext";

    @NonNull
    @ProtobufIndex(index = 1)
    public ProfileGuideInputHint input;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String titleBlow;
    public static ProtobufAdapter<ProfileUpgradeGuideText> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileUpgradeGuideText>() { // from class: com.p1.mobile.putong.core.data.ProfileUpgradeGuideText.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileUpgradeGuideText profileUpgradeGuideText) {
            ProfileGuideInputHint profileGuideInputHint = profileUpgradeGuideText.input;
            int iL = profileGuideInputHint != null ? CodedOutputByteBufferNano.l(1, profileGuideInputHint, ProfileGuideInputHint.PROTOBUF_ADAPTER) : 0;
            String str = profileUpgradeGuideText.titleBlow;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) profileUpgradeGuideText).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileUpgradeGuideText m15033parse(nb5 nb5Var) throws IOException {
            ProfileUpgradeGuideText profileUpgradeGuideText = new ProfileUpgradeGuideText();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileUpgradeGuideText.input == null) {
                        profileUpgradeGuideText.input = ProfileGuideInputHint.new_();
                    }
                    if (profileUpgradeGuideText.titleBlow != null) {
                        break;
                    }
                    profileUpgradeGuideText.titleBlow = "";
                    break;
                }
                if (iU == 10) {
                    profileUpgradeGuideText.input = (ProfileGuideInputHint) nb5Var.l(ProfileGuideInputHint.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (profileUpgradeGuideText.input == null) {
                            profileUpgradeGuideText.input = ProfileGuideInputHint.new_();
                        }
                        if (profileUpgradeGuideText.titleBlow != null) {
                            break;
                        }
                        profileUpgradeGuideText.titleBlow = "";
                        return profileUpgradeGuideText;
                    }
                    profileUpgradeGuideText.titleBlow = nb5Var.s();
                }
            }
            return profileUpgradeGuideText;
        }

        public void serialize(ProfileUpgradeGuideText profileUpgradeGuideText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ProfileGuideInputHint profileGuideInputHint = profileUpgradeGuideText.input;
            if (profileGuideInputHint != null) {
                codedOutputByteBufferNano.K(1, profileGuideInputHint, ProfileGuideInputHint.PROTOBUF_ADAPTER);
            }
            String str = profileUpgradeGuideText.titleBlow;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<ProfileUpgradeGuideText> JSON_ADAPTER = new ObjectJsonAdapter<ProfileUpgradeGuideText>() { // from class: com.p1.mobile.putong.core.data.ProfileUpgradeGuideText.2
        public Class getDataClass() {
            return ProfileUpgradeGuideText.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileUpgradeGuideText m15034newInstance() {
            return new ProfileUpgradeGuideText();
        }

        public boolean parseField(ProfileUpgradeGuideText profileUpgradeGuideText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("titleBlow")) {
                profileUpgradeGuideText.titleBlow = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("input")) {
                return false;
            }
            profileUpgradeGuideText.input = (ProfileGuideInputHint) ProfileGuideInputHint.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ProfileUpgradeGuideText profileUpgradeGuideText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("titleBlow") || str.equals("input")) {
                return true;
            }
            return super.parseFieldCheck(profileUpgradeGuideText, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ProfileUpgradeGuideText profileUpgradeGuideText, JsonGenerator jsonGenerator) throws IOException {
            if (profileUpgradeGuideText.input != null) {
                jsonGenerator.writeFieldName("input");
                ProfileGuideInputHint.JSON_ADAPTER.serialize(profileUpgradeGuideText.input, jsonGenerator, true);
            }
            String str = profileUpgradeGuideText.titleBlow;
            if (str != null) {
                jsonGenerator.writeStringField("titleBlow", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileUpgradeGuideText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileUpgradeGuideText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileUpgradeGuideText new_() {
        ProfileUpgradeGuideText profileUpgradeGuideText = new ProfileUpgradeGuideText();
        profileUpgradeGuideText.nullCheck();
        return profileUpgradeGuideText;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileUpgradeGuideText m15032clone() {
        ProfileUpgradeGuideText profileUpgradeGuideText = new ProfileUpgradeGuideText();
        ProfileGuideInputHint profileGuideInputHint = this.input;
        if (profileGuideInputHint != null) {
            profileUpgradeGuideText.input = profileGuideInputHint.m14972clone();
        }
        profileUpgradeGuideText.titleBlow = this.titleBlow;
        return profileUpgradeGuideText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileUpgradeGuideText)) {
            return false;
        }
        ProfileUpgradeGuideText profileUpgradeGuideText = (ProfileUpgradeGuideText) obj;
        return ValueObject.util_equals(this.input, profileUpgradeGuideText.input) && ValueObject.util_equals(this.titleBlow, profileUpgradeGuideText.titleBlow);
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
        ProfileGuideInputHint profileGuideInputHint = this.input;
        int iHashCode = (i2 + (profileGuideInputHint != null ? profileGuideInputHint.hashCode() : 0)) * 41;
        String str = this.titleBlow;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.input == null) {
            this.input = ProfileGuideInputHint.new_();
        }
        if (this.titleBlow == null) {
            this.titleBlow = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
