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
public class ProfileLike extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelike";

    @ProtobufIndex(index = 2)
    public int count;

    @ProtobufIndex(index = 1)
    public int remaining;

    @ProtobufIndex(index = 3)
    public int total;
    public static ProtobufAdapter<ProfileLike> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLike>() { // from class: com.p1.mobile.putong.data.ProfileLike.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileLike profileLike) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, profileLike.remaining) + CodedOutputByteBufferNano.m17226h(2, profileLike.count) + CodedOutputByteBufferNano.m17226h(3, profileLike.total);
            profileLike.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileLike parse(nb5 nb5Var) throws IOException {
            ProfileLike profileLike = new ProfileLike();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    profileLike.remaining = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    profileLike.count = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return profileLike;
                    }
                    profileLike.total = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileLike profileLike, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, profileLike.remaining);
            codedOutputByteBufferNano.m17250G(2, profileLike.count);
            codedOutputByteBufferNano.m17250G(3, profileLike.total);
        }
    };
    public static JsonAdapter<ProfileLike> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLike>() { // from class: com.p1.mobile.putong.data.ProfileLike.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileLike.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileLike newInstance() {
            return new ProfileLike();
        }

        public boolean parseField(ProfileLike profileLike, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "count":
                    profileLike.count = jsonParser.getValueAsInt();
                    return true;
                case "total":
                    profileLike.total = jsonParser.getValueAsInt();
                    return true;
                case "remaining":
                    profileLike.remaining = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileLike profileLike, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "count":
                case "total":
                case "remaining":
                    return true;
                default:
                    return super.parseFieldCheck(profileLike, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileLike profileLike, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", profileLike.remaining);
            jsonGenerator.writeNumberField("count", profileLike.count);
            jsonGenerator.writeNumberField("total", profileLike.total);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLike) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLike) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLike new_() {
        ProfileLike profileLike = new ProfileLike();
        profileLike.nullCheck();
        return profileLike;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileLike mo223809clone() {
        ProfileLike profileLike = new ProfileLike();
        profileLike.remaining = this.remaining;
        profileLike.count = this.count;
        profileLike.total = this.total;
        return profileLike;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileLike)) {
            return false;
        }
        ProfileLike profileLike = (ProfileLike) obj;
        return this.remaining == profileLike.remaining && this.count == profileLike.count && this.total == profileLike.total;
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
        int i2 = (((((i * 41) + this.remaining) * 41) + this.count) * 41) + this.total;
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
