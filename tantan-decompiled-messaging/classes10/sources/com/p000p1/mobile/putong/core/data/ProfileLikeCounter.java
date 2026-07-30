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
public class ProfileLikeCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikecounter";

    @ProtobufIndex(index = 4)
    public boolean canLike;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean hasNew;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int receive;

    @ProtobufIndex(index = 1)
    public int sendTo;
    public static ProtobufAdapter<ProfileLikeCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikeCounter>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileLikeCounter profileLikeCounter) {
            int iH = CodedOutputByteBufferNano.h(1, profileLikeCounter.sendTo) + CodedOutputByteBufferNano.h(2, profileLikeCounter.receive) + CodedOutputByteBufferNano.b(3, profileLikeCounter.hasNew) + CodedOutputByteBufferNano.b(4, profileLikeCounter.canLike);
            ((MessageNano) profileLikeCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileLikeCounter m14989parse(nb5 nb5Var) throws IOException {
            ProfileLikeCounter profileLikeCounter = new ProfileLikeCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    profileLikeCounter.sendTo = nb5Var.j();
                } else if (iU == 16) {
                    profileLikeCounter.receive = nb5Var.j();
                } else if (iU == 24) {
                    profileLikeCounter.hasNew = nb5Var.g();
                } else {
                    if (iU != 32) {
                        return profileLikeCounter;
                    }
                    profileLikeCounter.canLike = nb5Var.g();
                }
            }
        }

        public void serialize(ProfileLikeCounter profileLikeCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, profileLikeCounter.sendTo);
            codedOutputByteBufferNano.G(2, profileLikeCounter.receive);
            codedOutputByteBufferNano.A(3, profileLikeCounter.hasNew);
            codedOutputByteBufferNano.A(4, profileLikeCounter.canLike);
        }
    };
    public static JsonAdapter<ProfileLikeCounter> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikeCounter>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeCounter.2
        public Class getDataClass() {
            return ProfileLikeCounter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileLikeCounter m14990newInstance() {
            return new ProfileLikeCounter();
        }

        public boolean parseField(ProfileLikeCounter profileLikeCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hasNew":
                    profileLikeCounter.hasNew = jsonParser.getValueAsBoolean();
                    return true;
                case "sendTo":
                    profileLikeCounter.sendTo = jsonParser.getValueAsInt();
                    return true;
                case "canLike":
                    profileLikeCounter.canLike = jsonParser.getValueAsBoolean();
                    return true;
                case "receive":
                    profileLikeCounter.receive = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileLikeCounter profileLikeCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "hasNew":
                case "sendTo":
                case "canLike":
                case "receive":
                    return true;
                default:
                    return super.parseFieldCheck(profileLikeCounter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ProfileLikeCounter profileLikeCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("sendTo", profileLikeCounter.sendTo);
            jsonGenerator.writeNumberField("receive", profileLikeCounter.receive);
            jsonGenerator.writeBooleanField("hasNew", profileLikeCounter.hasNew);
            jsonGenerator.writeBooleanField("canLike", profileLikeCounter.canLike);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikeCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikeCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikeCounter new_() {
        ProfileLikeCounter profileLikeCounter = new ProfileLikeCounter();
        profileLikeCounter.nullCheck();
        return profileLikeCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileLikeCounter m14988clone() {
        ProfileLikeCounter profileLikeCounter = new ProfileLikeCounter();
        profileLikeCounter.sendTo = this.sendTo;
        profileLikeCounter.receive = this.receive;
        profileLikeCounter.hasNew = this.hasNew;
        profileLikeCounter.canLike = this.canLike;
        return profileLikeCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileLikeCounter)) {
            return false;
        }
        ProfileLikeCounter profileLikeCounter = (ProfileLikeCounter) obj;
        return this.sendTo == profileLikeCounter.sendTo && this.receive == profileLikeCounter.receive && this.hasNew == profileLikeCounter.hasNew && this.canLike == profileLikeCounter.canLike;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + this.sendTo) * 41) + this.receive) * 41) + (this.hasNew ? 1231 : 1237)) * 41) + (this.canLike ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
