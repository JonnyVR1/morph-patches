package com.p000p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileLike profileLike) {
            int iH = CodedOutputByteBufferNano.h(1, profileLike.remaining) + CodedOutputByteBufferNano.h(2, profileLike.count) + CodedOutputByteBufferNano.h(3, profileLike.total);
            ((MessageNano) profileLike).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileLike m18847parse(nb5 nb5Var) throws IOException {
            ProfileLike profileLike = new ProfileLike();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    profileLike.remaining = nb5Var.j();
                } else if (iU == 16) {
                    profileLike.count = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return profileLike;
                    }
                    profileLike.total = nb5Var.j();
                }
            }
        }

        public void serialize(ProfileLike profileLike, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, profileLike.remaining);
            codedOutputByteBufferNano.G(2, profileLike.count);
            codedOutputByteBufferNano.G(3, profileLike.total);
        }
    };
    public static JsonAdapter<ProfileLike> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLike>() { // from class: com.p1.mobile.putong.data.ProfileLike.2
        public Class getDataClass() {
            return ProfileLike.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ProfileLike mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileLike profileLike, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", profileLike.remaining);
            jsonGenerator.writeNumberField("count", profileLike.count);
            jsonGenerator.writeNumberField("total", profileLike.total);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLike) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLike) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLike new_() {
        ProfileLike profileLike = new ProfileLike();
        profileLike.nullCheck();
        return profileLike;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileLike m18846clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.remaining) * 41) + this.count) * 41) + this.total;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
