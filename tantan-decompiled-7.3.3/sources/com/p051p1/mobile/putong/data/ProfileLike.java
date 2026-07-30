package com.p051p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

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
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, profileLike.remaining) + CodedOutputByteBufferNano.m17281h(2, profileLike.count) + CodedOutputByteBufferNano.m17281h(3, profileLike.total);
            profileLike.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileLike parse(nc5 nc5Var) throws IOException {
            ProfileLike profileLike = new ProfileLike();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    profileLike.remaining = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    profileLike.count = nc5Var.m162486j();
                } else {
                    if (iM162497u != 24) {
                        return profileLike;
                    }
                    profileLike.total = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileLike profileLike, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, profileLike.remaining);
            codedOutputByteBufferNano.m17305G(2, profileLike.count);
            codedOutputByteBufferNano.m17305G(3, profileLike.total);
        }
    };
    public static JsonAdapter<ProfileLike> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLike>() { // from class: com.p1.mobile.putong.data.ProfileLike.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileLike.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileLike profileLike, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", profileLike.remaining);
            jsonGenerator.writeNumberField("count", profileLike.count);
            jsonGenerator.writeNumberField("total", profileLike.total);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLike) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public ProfileLike mo225055clone() {
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
