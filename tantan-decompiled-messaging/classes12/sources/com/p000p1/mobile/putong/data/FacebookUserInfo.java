package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FacebookUserInfo facebookUserInfo) {
            String str = facebookUserInfo.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = facebookUserInfo.birthdate;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = facebookUserInfo.gender;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            FacebookPicture facebookPicture = facebookUserInfo.picture;
            if (facebookPicture != null) {
                iO += CodedOutputByteBufferNano.l(4, facebookPicture, FacebookPicture.PROTOBUF_ADAPTER);
            }
            FacebookInfoIdWithName facebookInfoIdWithName = facebookUserInfo.hometown;
            if (facebookInfoIdWithName != null) {
                iO += CodedOutputByteBufferNano.l(5, facebookInfoIdWithName, FacebookInfoIdWithName.PROTOBUF_ADAPTER);
            }
            FacebookInfoIdWithName facebookInfoIdWithName2 = facebookUserInfo.location;
            if (facebookInfoIdWithName2 != null) {
                iO += CodedOutputByteBufferNano.l(6, facebookInfoIdWithName2, FacebookInfoIdWithName.PROTOBUF_ADAPTER);
            }
            ((MessageNano) facebookUserInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FacebookUserInfo m18085parse(nb5 nb5Var) throws IOException {
            FacebookUserInfo facebookUserInfo = new FacebookUserInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    facebookUserInfo.name = nb5Var.s();
                } else if (iU == 18) {
                    facebookUserInfo.birthdate = nb5Var.s();
                } else if (iU == 26) {
                    facebookUserInfo.gender = nb5Var.s();
                } else if (iU == 34) {
                    facebookUserInfo.picture = (FacebookPicture) nb5Var.l(FacebookPicture.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    facebookUserInfo.hometown = (FacebookInfoIdWithName) nb5Var.l(FacebookInfoIdWithName.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
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
                    facebookUserInfo.location = (FacebookInfoIdWithName) nb5Var.l(FacebookInfoIdWithName.PROTOBUF_ADAPTER);
                }
            }
            return facebookUserInfo;
        }

        public void serialize(FacebookUserInfo facebookUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = facebookUserInfo.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = facebookUserInfo.birthdate;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = facebookUserInfo.gender;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            FacebookPicture facebookPicture = facebookUserInfo.picture;
            if (facebookPicture != null) {
                codedOutputByteBufferNano.K(4, facebookPicture, FacebookPicture.PROTOBUF_ADAPTER);
            }
            FacebookInfoIdWithName facebookInfoIdWithName = facebookUserInfo.hometown;
            if (facebookInfoIdWithName != null) {
                codedOutputByteBufferNano.K(5, facebookInfoIdWithName, FacebookInfoIdWithName.PROTOBUF_ADAPTER);
            }
            FacebookInfoIdWithName facebookInfoIdWithName2 = facebookUserInfo.location;
            if (facebookInfoIdWithName2 != null) {
                codedOutputByteBufferNano.K(6, facebookInfoIdWithName2, FacebookInfoIdWithName.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FacebookUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<FacebookUserInfo>() { // from class: com.p1.mobile.putong.data.FacebookUserInfo.2
        public Class getDataClass() {
            return FacebookUserInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FacebookUserInfo mo17830newInstance() {
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
                    facebookUserInfo.picture = (FacebookPicture) FacebookPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "hometown":
                    facebookUserInfo.hometown = (FacebookInfoIdWithName) FacebookInfoIdWithName.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    facebookUserInfo.name = jsonParser.getValueAsString();
                    return true;
                case "location":
                    facebookUserInfo.location = (FacebookInfoIdWithName) FacebookInfoIdWithName.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FacebookUserInfo facebookUserInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = facebookUserInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
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
                jsonGenerator.writeFieldName("hometown");
                FacebookInfoIdWithName.JSON_ADAPTER.serialize(facebookUserInfo.hometown, jsonGenerator, true);
            }
            if (facebookUserInfo.location != null) {
                jsonGenerator.writeFieldName("location");
                FacebookInfoIdWithName.JSON_ADAPTER.serialize(facebookUserInfo.location, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FacebookUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FacebookUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FacebookUserInfo new_() {
        FacebookUserInfo facebookUserInfo = new FacebookUserInfo();
        facebookUserInfo.nullCheck();
        return facebookUserInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FacebookUserInfo m18084clone() {
        FacebookUserInfo facebookUserInfo = new FacebookUserInfo();
        facebookUserInfo.name = this.name;
        facebookUserInfo.birthdate = this.birthdate;
        facebookUserInfo.gender = this.gender;
        FacebookPicture facebookPicture = this.picture;
        if (facebookPicture != null) {
            facebookUserInfo.picture = facebookPicture.m18078clone();
        }
        FacebookInfoIdWithName facebookInfoIdWithName = this.hometown;
        if (facebookInfoIdWithName != null) {
            facebookUserInfo.hometown = facebookInfoIdWithName.m18075clone();
        }
        FacebookInfoIdWithName facebookInfoIdWithName2 = this.location;
        if (facebookInfoIdWithName2 != null) {
            facebookUserInfo.location = facebookInfoIdWithName2.m18075clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
