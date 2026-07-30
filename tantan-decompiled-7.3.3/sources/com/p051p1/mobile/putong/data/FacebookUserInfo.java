package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
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
public class FacebookUserInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "facebookuserinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String birthdate;

    @NonNull
    @ProtobufIndex(index = 3)
    public String gender;

    @NonNull
    @ProtobufIndex(index = 5)
    public FacebookInfoIdWithName hometown;

    @NonNull
    @ProtobufIndex(index = 6)
    public FacebookInfoIdWithName location;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public FacebookPicture picture;
    public static ProtobufAdapter<FacebookUserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FacebookUserInfo>() { // from class: com.p1.mobile.putong.data.FacebookUserInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FacebookUserInfo facebookUserInfo) {
            String str = facebookUserInfo.name;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = facebookUserInfo.birthdate;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = facebookUserInfo.gender;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            FacebookPicture facebookPicture = facebookUserInfo.picture;
            if (facebookPicture != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, facebookPicture, FacebookPicture.PROTOBUF_ADAPTER);
            }
            FacebookInfoIdWithName facebookInfoIdWithName = facebookUserInfo.hometown;
            if (facebookInfoIdWithName != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, facebookInfoIdWithName, FacebookInfoIdWithName.PROTOBUF_ADAPTER);
            }
            FacebookInfoIdWithName facebookInfoIdWithName2 = facebookUserInfo.location;
            if (facebookInfoIdWithName2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, facebookInfoIdWithName2, FacebookInfoIdWithName.PROTOBUF_ADAPTER);
            }
            facebookUserInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FacebookUserInfo parse(nc5 nc5Var) throws IOException {
            FacebookUserInfo facebookUserInfo = new FacebookUserInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (facebookUserInfo.name == null) {
                        facebookUserInfo.name = "";
                    }
                    if (facebookUserInfo.birthdate == null) {
                        facebookUserInfo.birthdate = "";
                    }
                    if (facebookUserInfo.gender == null) {
                        facebookUserInfo.gender = "";
                    }
                    if (facebookUserInfo.picture == null) {
                        facebookUserInfo.picture = FacebookPicture.new_();
                    }
                    if (facebookUserInfo.hometown == null) {
                        facebookUserInfo.hometown = FacebookInfoIdWithName.new_();
                    }
                    if (facebookUserInfo.location != null) {
                        break;
                    }
                    facebookUserInfo.location = FacebookInfoIdWithName.new_();
                    break;
                }
                if (iM162497u == 10) {
                    facebookUserInfo.name = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    facebookUserInfo.birthdate = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    facebookUserInfo.gender = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    facebookUserInfo.picture = (FacebookPicture) nc5Var.m162488l(FacebookPicture.PROTOBUF_ADAPTER);
                } else if (iM162497u == 42) {
                    facebookUserInfo.hometown = (FacebookInfoIdWithName) nc5Var.m162488l(FacebookInfoIdWithName.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 50) {
                        if (facebookUserInfo.name == null) {
                            facebookUserInfo.name = "";
                        }
                        if (facebookUserInfo.birthdate == null) {
                            facebookUserInfo.birthdate = "";
                        }
                        if (facebookUserInfo.gender == null) {
                            facebookUserInfo.gender = "";
                        }
                        if (facebookUserInfo.picture == null) {
                            facebookUserInfo.picture = FacebookPicture.new_();
                        }
                        if (facebookUserInfo.hometown == null) {
                            facebookUserInfo.hometown = FacebookInfoIdWithName.new_();
                        }
                        if (facebookUserInfo.location != null) {
                            break;
                        }
                        facebookUserInfo.location = FacebookInfoIdWithName.new_();
                        return facebookUserInfo;
                    }
                    facebookUserInfo.location = (FacebookInfoIdWithName) nc5Var.m162488l(FacebookInfoIdWithName.PROTOBUF_ADAPTER);
                }
            }
            return facebookUserInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FacebookUserInfo facebookUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = facebookUserInfo.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = facebookUserInfo.birthdate;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = facebookUserInfo.gender;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            FacebookPicture facebookPicture = facebookUserInfo.picture;
            if (facebookPicture != null) {
                codedOutputByteBufferNano.m17309K(4, facebookPicture, FacebookPicture.PROTOBUF_ADAPTER);
            }
            FacebookInfoIdWithName facebookInfoIdWithName = facebookUserInfo.hometown;
            if (facebookInfoIdWithName != null) {
                codedOutputByteBufferNano.m17309K(5, facebookInfoIdWithName, FacebookInfoIdWithName.PROTOBUF_ADAPTER);
            }
            FacebookInfoIdWithName facebookInfoIdWithName2 = facebookUserInfo.location;
            if (facebookInfoIdWithName2 != null) {
                codedOutputByteBufferNano.m17309K(6, facebookInfoIdWithName2, FacebookInfoIdWithName.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FacebookUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<FacebookUserInfo>() { // from class: com.p1.mobile.putong.data.FacebookUserInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FacebookUserInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FacebookUserInfo newInstance() {
            return new FacebookUserInfo();
        }

        public boolean parseField(FacebookUserInfo facebookUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gender":
                    facebookUserInfo.gender = jsonParser.getValueAsString();
                    return true;
                case "birthdate":
                    facebookUserInfo.birthdate = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    facebookUserInfo.picture = FacebookPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "hometown":
                    facebookUserInfo.hometown = FacebookInfoIdWithName.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    facebookUserInfo.name = jsonParser.getValueAsString();
                    return true;
                case "location":
                    facebookUserInfo.location = FacebookInfoIdWithName.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FacebookUserInfo facebookUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "gender":
                case "birthdate":
                case "picture":
                case "hometown":
                case "name":
                case "location":
                    return true;
                default:
                    return super.parseFieldCheck(facebookUserInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FacebookUserInfo facebookUserInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = facebookUserInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = facebookUserInfo.birthdate;
            if (str2 != null) {
                jsonGenerator.writeStringField("birthdate", str2);
            }
            String str3 = facebookUserInfo.gender;
            if (str3 != null) {
                jsonGenerator.writeStringField("gender", str3);
            }
            if (facebookUserInfo.picture != null) {
                jsonGenerator.writeFieldName("picture");
                FacebookPicture.JSON_ADAPTER.serialize(facebookUserInfo.picture, jsonGenerator, true);
            }
            if (facebookUserInfo.hometown != null) {
                jsonGenerator.writeFieldName(ProfileLikeCategoryType.hometown);
                FacebookInfoIdWithName.JSON_ADAPTER.serialize(facebookUserInfo.hometown, jsonGenerator, true);
            }
            if (facebookUserInfo.location != null) {
                jsonGenerator.writeFieldName("location");
                FacebookInfoIdWithName.JSON_ADAPTER.serialize(facebookUserInfo.location, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FacebookUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FacebookUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FacebookUserInfo new_() {
        FacebookUserInfo facebookUserInfo = new FacebookUserInfo();
        facebookUserInfo.nullCheck();
        return facebookUserInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FacebookUserInfo mo225055clone() {
        FacebookUserInfo facebookUserInfo = new FacebookUserInfo();
        facebookUserInfo.name = this.name;
        facebookUserInfo.birthdate = this.birthdate;
        facebookUserInfo.gender = this.gender;
        FacebookPicture facebookPicture = this.picture;
        if (facebookPicture != null) {
            facebookUserInfo.picture = facebookPicture.mo225055clone();
        }
        FacebookInfoIdWithName facebookInfoIdWithName = this.hometown;
        if (facebookInfoIdWithName != null) {
            facebookUserInfo.hometown = facebookInfoIdWithName.mo225055clone();
        }
        FacebookInfoIdWithName facebookInfoIdWithName2 = this.location;
        if (facebookInfoIdWithName2 != null) {
            facebookUserInfo.location = facebookInfoIdWithName2.mo225055clone();
        }
        return facebookUserInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FacebookUserInfo)) {
            return false;
        }
        FacebookUserInfo facebookUserInfo = (FacebookUserInfo) obj;
        return ValueObject.util_equals(this.name, facebookUserInfo.name) && ValueObject.util_equals(this.birthdate, facebookUserInfo.birthdate) && ValueObject.util_equals(this.gender, facebookUserInfo.gender) && ValueObject.util_equals(this.picture, facebookUserInfo.picture) && ValueObject.util_equals(this.hometown, facebookUserInfo.hometown) && ValueObject.util_equals(this.location, facebookUserInfo.location);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.birthdate;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.gender;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        FacebookPicture facebookPicture = this.picture;
        int iHashCode4 = (iHashCode3 + (facebookPicture != null ? facebookPicture.hashCode() : 0)) * 41;
        FacebookInfoIdWithName facebookInfoIdWithName = this.hometown;
        int iHashCode5 = (iHashCode4 + (facebookInfoIdWithName != null ? facebookInfoIdWithName.hashCode() : 0)) * 41;
        FacebookInfoIdWithName facebookInfoIdWithName2 = this.location;
        int iHashCode6 = iHashCode5 + (facebookInfoIdWithName2 != null ? facebookInfoIdWithName2.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.birthdate == null) {
            this.birthdate = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.picture == null) {
            this.picture = FacebookPicture.new_();
        }
        if (this.hometown == null) {
            this.hometown = FacebookInfoIdWithName.new_();
        }
        if (this.location == null) {
            this.location = FacebookInfoIdWithName.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
