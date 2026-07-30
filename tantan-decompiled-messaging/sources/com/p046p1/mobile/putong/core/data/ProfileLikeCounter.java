package com.p046p1.mobile.putong.core.data;

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
public class ProfileLikeCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikecounter";

    @ProtobufIndex(index = 4)
    public boolean canLike;

    @ProtobufIndex(index = 3)
    public boolean hasNew;

    @ProtobufIndex(index = 2)
    public int receive;

    @ProtobufIndex(index = 1)
    public int sendTo;
    public static ProtobufAdapter<ProfileLikeCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikeCounter>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileLikeCounter profileLikeCounter) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, profileLikeCounter.sendTo) + CodedOutputByteBufferNano.m17226h(2, profileLikeCounter.receive) + CodedOutputByteBufferNano.m17220b(3, profileLikeCounter.hasNew) + CodedOutputByteBufferNano.m17220b(4, profileLikeCounter.canLike);
            profileLikeCounter.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileLikeCounter parse(nb5 nb5Var) throws IOException {
            ProfileLikeCounter profileLikeCounter = new ProfileLikeCounter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    profileLikeCounter.sendTo = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    profileLikeCounter.receive = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    profileLikeCounter.hasNew = nb5Var.m158738g();
                } else {
                    if (iM158752u != 32) {
                        return profileLikeCounter;
                    }
                    profileLikeCounter.canLike = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileLikeCounter profileLikeCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, profileLikeCounter.sendTo);
            codedOutputByteBufferNano.m17250G(2, profileLikeCounter.receive);
            codedOutputByteBufferNano.m17244A(3, profileLikeCounter.hasNew);
            codedOutputByteBufferNano.m17244A(4, profileLikeCounter.canLike);
        }
    };
    public static JsonAdapter<ProfileLikeCounter> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikeCounter>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileLikeCounter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileLikeCounter newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileLikeCounter profileLikeCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("sendTo", profileLikeCounter.sendTo);
            jsonGenerator.writeNumberField("receive", profileLikeCounter.receive);
            jsonGenerator.writeBooleanField("hasNew", profileLikeCounter.hasNew);
            jsonGenerator.writeBooleanField("canLike", profileLikeCounter.canLike);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikeCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikeCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikeCounter new_() {
        ProfileLikeCounter profileLikeCounter = new ProfileLikeCounter();
        profileLikeCounter.nullCheck();
        return profileLikeCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileLikeCounter mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + this.sendTo) * 41) + this.receive) * 41) + (this.hasNew ? 1231 : 1237)) * 41) + (this.canLike ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
