package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class GrowthMesUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthmesuser";

    @NonNull
    @ProtobufIndex(index = 3)
    public String avatar;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20408id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<GrowthMesUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthMesUser>() { // from class: com.p1.mobile.putong.core.data.GrowthMesUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GrowthMesUser growthMesUser) {
            String str = growthMesUser.f20408id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = growthMesUser.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = growthMesUser.avatar;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            growthMesUser.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GrowthMesUser parse(nb5 nb5Var) throws IOException {
            GrowthMesUser growthMesUser = new GrowthMesUser();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (growthMesUser.f20408id == null) {
                        growthMesUser.f20408id = "";
                    }
                    if (growthMesUser.name == null) {
                        growthMesUser.name = "";
                    }
                    if (growthMesUser.avatar != null) {
                        break;
                    }
                    growthMesUser.avatar = "";
                    break;
                }
                if (iM158752u == 10) {
                    growthMesUser.f20408id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    growthMesUser.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (growthMesUser.f20408id == null) {
                            growthMesUser.f20408id = "";
                        }
                        if (growthMesUser.name == null) {
                            growthMesUser.name = "";
                        }
                        if (growthMesUser.avatar != null) {
                            break;
                        }
                        growthMesUser.avatar = "";
                        return growthMesUser;
                    }
                    growthMesUser.avatar = nb5Var.m158750s();
                }
            }
            return growthMesUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GrowthMesUser growthMesUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = growthMesUser.f20408id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = growthMesUser.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = growthMesUser.avatar;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<GrowthMesUser> JSON_ADAPTER = new ObjectJsonAdapter<GrowthMesUser>() { // from class: com.p1.mobile.putong.core.data.GrowthMesUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GrowthMesUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GrowthMesUser newInstance() {
            return new GrowthMesUser();
        }

        public boolean parseField(GrowthMesUser growthMesUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    growthMesUser.avatar = jsonParser.getValueAsString();
                    return true;
                case "id":
                    growthMesUser.f20408id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    growthMesUser.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GrowthMesUser growthMesUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "avatar":
                    return true;
                case "id":
                    return false;
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(growthMesUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GrowthMesUser growthMesUser, JsonGenerator jsonGenerator) throws IOException {
            String str = growthMesUser.f20408id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = growthMesUser.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = growthMesUser.avatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatar", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthMesUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthMesUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthMesUser new_() {
        GrowthMesUser growthMesUser = new GrowthMesUser();
        growthMesUser.nullCheck();
        return growthMesUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GrowthMesUser mo223809clone() {
        GrowthMesUser growthMesUser = new GrowthMesUser();
        growthMesUser.f20408id = this.f20408id;
        growthMesUser.name = this.name;
        growthMesUser.avatar = this.avatar;
        return growthMesUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GrowthMesUser)) {
            return false;
        }
        GrowthMesUser growthMesUser = (GrowthMesUser) obj;
        return ValueObject.util_equals(this.f20408id, growthMesUser.f20408id) && ValueObject.util_equals(this.name, growthMesUser.name) && ValueObject.util_equals(this.avatar, growthMesUser.avatar);
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
        String str = this.f20408id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.avatar;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20408id == null) {
            this.f20408id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
