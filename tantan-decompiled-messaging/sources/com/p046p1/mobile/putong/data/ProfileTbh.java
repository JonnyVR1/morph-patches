package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class ProfileTbh extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profiletbh";

    @ProtobufIndex(index = 4)
    public double createdTime;

    @ProtobufIndex(index = 1)
    public int friends;

    @ProtobufIndex(index = 3)
    public int receivedVotedPolls;

    @ProtobufIndex(index = 2)
    public int receivedVotes;
    public static ProtobufAdapter<ProfileTbh> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileTbh>() { // from class: com.p1.mobile.putong.data.ProfileTbh.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileTbh profileTbh) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, profileTbh.friends) + CodedOutputByteBufferNano.m17226h(2, profileTbh.receivedVotes) + CodedOutputByteBufferNano.m17226h(3, profileTbh.receivedVotedPolls) + CodedOutputByteBufferNano.m17222d(4, profileTbh.createdTime);
            profileTbh.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileTbh parse(nb5 nb5Var) throws IOException {
            ProfileTbh profileTbh = new ProfileTbh();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    profileTbh.friends = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    profileTbh.receivedVotes = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    profileTbh.receivedVotedPolls = nb5Var.m158741j();
                } else {
                    if (iM158752u != 33) {
                        return profileTbh;
                    }
                    profileTbh.createdTime = nb5Var.m158739h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileTbh profileTbh, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, profileTbh.friends);
            codedOutputByteBufferNano.m17250G(2, profileTbh.receivedVotes);
            codedOutputByteBufferNano.m17250G(3, profileTbh.receivedVotedPolls);
            codedOutputByteBufferNano.m17246C(4, profileTbh.createdTime);
        }
    };
    public static JsonAdapter<ProfileTbh> JSON_ADAPTER = new ObjectJsonAdapter<ProfileTbh>() { // from class: com.p1.mobile.putong.data.ProfileTbh.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileTbh.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileTbh newInstance() {
            return new ProfileTbh();
        }

        public boolean parseField(ProfileTbh profileTbh, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "receivedVotedPolls":
                    profileTbh.receivedVotedPolls = jsonParser.getValueAsInt();
                    return true;
                case "friends":
                    profileTbh.friends = jsonParser.getValueAsInt();
                    return true;
                case "createdTime":
                    profileTbh.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "receivedVotes":
                    profileTbh.receivedVotes = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileTbh profileTbh, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "receivedVotedPolls":
                case "friends":
                case "createdTime":
                case "receivedVotes":
                    return true;
                default:
                    return super.parseFieldCheck(profileTbh, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileTbh profileTbh, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("friends", profileTbh.friends);
            jsonGenerator.writeNumberField("receivedVotes", profileTbh.receivedVotes);
            jsonGenerator.writeNumberField("receivedVotedPolls", profileTbh.receivedVotedPolls);
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(profileTbh.createdTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileTbh) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileTbh) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileTbh new_() {
        ProfileTbh profileTbh = new ProfileTbh();
        profileTbh.nullCheck();
        return profileTbh;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileTbh mo223809clone() {
        ProfileTbh profileTbh = new ProfileTbh();
        profileTbh.friends = this.friends;
        profileTbh.receivedVotes = this.receivedVotes;
        profileTbh.receivedVotedPolls = this.receivedVotedPolls;
        profileTbh.createdTime = this.createdTime;
        return profileTbh;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileTbh)) {
            return false;
        }
        ProfileTbh profileTbh = (ProfileTbh) obj;
        return this.friends == profileTbh.friends && this.receivedVotes == profileTbh.receivedVotes && this.receivedVotedPolls == profileTbh.receivedVotedPolls && this.createdTime == profileTbh.createdTime;
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
        int i2 = (((((i * 41) + this.friends) * 41) + this.receivedVotes) * 41) + this.receivedVotedPolls;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
