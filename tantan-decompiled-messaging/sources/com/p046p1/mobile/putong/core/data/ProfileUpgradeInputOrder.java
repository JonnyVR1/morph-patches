package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ProfileUpgradeInputOrder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profileupgradeinputorder";

    @NonNull
    @ProtobufIndex(index = 1)
    public ProfileInputOrder exp1v1;

    @NonNull
    @ProtobufIndex(index = 2)
    public ProfileInputOrder exp1v2;

    @NonNull
    @ProtobufIndex(index = 3)
    public ProfileInputOrder exp1v3;

    @NonNull
    @ProtobufIndex(index = 4)
    public ProfileInputOrder exp2v1;

    @NonNull
    @ProtobufIndex(index = 5)
    public ProfileInputOrder exp2v2;

    @NonNull
    @ProtobufIndex(index = 6)
    public ProfileInputOrder exp2v3;

    @NonNull
    @ProtobufIndex(index = 7)
    public ProfileInputOrder exp3v1;

    @NonNull
    @ProtobufIndex(index = 8)
    public ProfileInputOrder exp3v2;

    @NonNull
    @ProtobufIndex(index = 9)
    public ProfileInputOrder exp3v3;
    public static ProtobufAdapter<ProfileUpgradeInputOrder> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileUpgradeInputOrder>() { // from class: com.p1.mobile.putong.core.data.ProfileUpgradeInputOrder.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileUpgradeInputOrder profileUpgradeInputOrder) {
            ProfileInputOrder profileInputOrder = profileUpgradeInputOrder.exp1v1;
            int iM17230l = profileInputOrder != null ? CodedOutputByteBufferNano.m17230l(1, profileInputOrder, ProfileInputOrder.PROTOBUF_ADAPTER) : 0;
            ProfileInputOrder profileInputOrder2 = profileUpgradeInputOrder.exp1v2;
            if (profileInputOrder2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, profileInputOrder2, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder3 = profileUpgradeInputOrder.exp1v3;
            if (profileInputOrder3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, profileInputOrder3, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder4 = profileUpgradeInputOrder.exp2v1;
            if (profileInputOrder4 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, profileInputOrder4, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder5 = profileUpgradeInputOrder.exp2v2;
            if (profileInputOrder5 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(5, profileInputOrder5, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder6 = profileUpgradeInputOrder.exp2v3;
            if (profileInputOrder6 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(6, profileInputOrder6, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder7 = profileUpgradeInputOrder.exp3v1;
            if (profileInputOrder7 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(7, profileInputOrder7, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder8 = profileUpgradeInputOrder.exp3v2;
            if (profileInputOrder8 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(8, profileInputOrder8, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder9 = profileUpgradeInputOrder.exp3v3;
            if (profileInputOrder9 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(9, profileInputOrder9, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            profileUpgradeInputOrder.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileUpgradeInputOrder parse(nb5 nb5Var) throws IOException {
            ProfileUpgradeInputOrder profileUpgradeInputOrder = new ProfileUpgradeInputOrder();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (profileUpgradeInputOrder.exp1v1 == null) {
                        profileUpgradeInputOrder.exp1v1 = ProfileInputOrder.new_();
                    }
                    if (profileUpgradeInputOrder.exp1v2 == null) {
                        profileUpgradeInputOrder.exp1v2 = ProfileInputOrder.new_();
                    }
                    if (profileUpgradeInputOrder.exp1v3 == null) {
                        profileUpgradeInputOrder.exp1v3 = ProfileInputOrder.new_();
                    }
                    if (profileUpgradeInputOrder.exp2v1 == null) {
                        profileUpgradeInputOrder.exp2v1 = ProfileInputOrder.new_();
                    }
                    if (profileUpgradeInputOrder.exp2v2 == null) {
                        profileUpgradeInputOrder.exp2v2 = ProfileInputOrder.new_();
                    }
                    if (profileUpgradeInputOrder.exp2v3 == null) {
                        profileUpgradeInputOrder.exp2v3 = ProfileInputOrder.new_();
                    }
                    if (profileUpgradeInputOrder.exp3v1 == null) {
                        profileUpgradeInputOrder.exp3v1 = ProfileInputOrder.new_();
                    }
                    if (profileUpgradeInputOrder.exp3v2 == null) {
                        profileUpgradeInputOrder.exp3v2 = ProfileInputOrder.new_();
                    }
                    if (profileUpgradeInputOrder.exp3v3 != null) {
                        break;
                    }
                    profileUpgradeInputOrder.exp3v3 = ProfileInputOrder.new_();
                    break;
                }
                if (iM158752u == 10) {
                    profileUpgradeInputOrder.exp1v1 = (ProfileInputOrder) nb5Var.m158743l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    profileUpgradeInputOrder.exp1v2 = (ProfileInputOrder) nb5Var.m158743l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    profileUpgradeInputOrder.exp1v3 = (ProfileInputOrder) nb5Var.m158743l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    profileUpgradeInputOrder.exp2v1 = (ProfileInputOrder) nb5Var.m158743l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else if (iM158752u == 42) {
                    profileUpgradeInputOrder.exp2v2 = (ProfileInputOrder) nb5Var.m158743l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else if (iM158752u == 50) {
                    profileUpgradeInputOrder.exp2v3 = (ProfileInputOrder) nb5Var.m158743l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else if (iM158752u == 58) {
                    profileUpgradeInputOrder.exp3v1 = (ProfileInputOrder) nb5Var.m158743l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else if (iM158752u == 66) {
                    profileUpgradeInputOrder.exp3v2 = (ProfileInputOrder) nb5Var.m158743l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 74) {
                        if (profileUpgradeInputOrder.exp1v1 == null) {
                            profileUpgradeInputOrder.exp1v1 = ProfileInputOrder.new_();
                        }
                        if (profileUpgradeInputOrder.exp1v2 == null) {
                            profileUpgradeInputOrder.exp1v2 = ProfileInputOrder.new_();
                        }
                        if (profileUpgradeInputOrder.exp1v3 == null) {
                            profileUpgradeInputOrder.exp1v3 = ProfileInputOrder.new_();
                        }
                        if (profileUpgradeInputOrder.exp2v1 == null) {
                            profileUpgradeInputOrder.exp2v1 = ProfileInputOrder.new_();
                        }
                        if (profileUpgradeInputOrder.exp2v2 == null) {
                            profileUpgradeInputOrder.exp2v2 = ProfileInputOrder.new_();
                        }
                        if (profileUpgradeInputOrder.exp2v3 == null) {
                            profileUpgradeInputOrder.exp2v3 = ProfileInputOrder.new_();
                        }
                        if (profileUpgradeInputOrder.exp3v1 == null) {
                            profileUpgradeInputOrder.exp3v1 = ProfileInputOrder.new_();
                        }
                        if (profileUpgradeInputOrder.exp3v2 == null) {
                            profileUpgradeInputOrder.exp3v2 = ProfileInputOrder.new_();
                        }
                        if (profileUpgradeInputOrder.exp3v3 != null) {
                            break;
                        }
                        profileUpgradeInputOrder.exp3v3 = ProfileInputOrder.new_();
                        return profileUpgradeInputOrder;
                    }
                    profileUpgradeInputOrder.exp3v3 = (ProfileInputOrder) nb5Var.m158743l(ProfileInputOrder.PROTOBUF_ADAPTER);
                }
            }
            return profileUpgradeInputOrder;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileUpgradeInputOrder profileUpgradeInputOrder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ProfileInputOrder profileInputOrder = profileUpgradeInputOrder.exp1v1;
            if (profileInputOrder != null) {
                codedOutputByteBufferNano.m17254K(1, profileInputOrder, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder2 = profileUpgradeInputOrder.exp1v2;
            if (profileInputOrder2 != null) {
                codedOutputByteBufferNano.m17254K(2, profileInputOrder2, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder3 = profileUpgradeInputOrder.exp1v3;
            if (profileInputOrder3 != null) {
                codedOutputByteBufferNano.m17254K(3, profileInputOrder3, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder4 = profileUpgradeInputOrder.exp2v1;
            if (profileInputOrder4 != null) {
                codedOutputByteBufferNano.m17254K(4, profileInputOrder4, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder5 = profileUpgradeInputOrder.exp2v2;
            if (profileInputOrder5 != null) {
                codedOutputByteBufferNano.m17254K(5, profileInputOrder5, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder6 = profileUpgradeInputOrder.exp2v3;
            if (profileInputOrder6 != null) {
                codedOutputByteBufferNano.m17254K(6, profileInputOrder6, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder7 = profileUpgradeInputOrder.exp3v1;
            if (profileInputOrder7 != null) {
                codedOutputByteBufferNano.m17254K(7, profileInputOrder7, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder8 = profileUpgradeInputOrder.exp3v2;
            if (profileInputOrder8 != null) {
                codedOutputByteBufferNano.m17254K(8, profileInputOrder8, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder9 = profileUpgradeInputOrder.exp3v3;
            if (profileInputOrder9 != null) {
                codedOutputByteBufferNano.m17254K(9, profileInputOrder9, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ProfileUpgradeInputOrder> JSON_ADAPTER = new ObjectJsonAdapter<ProfileUpgradeInputOrder>() { // from class: com.p1.mobile.putong.core.data.ProfileUpgradeInputOrder.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileUpgradeInputOrder.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileUpgradeInputOrder newInstance() {
            return new ProfileUpgradeInputOrder();
        }

        public boolean parseField(ProfileUpgradeInputOrder profileUpgradeInputOrder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "exp1v1":
                    profileUpgradeInputOrder.exp1v1 = ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp1v2":
                    profileUpgradeInputOrder.exp1v2 = ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp1v3":
                    profileUpgradeInputOrder.exp1v3 = ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp2v1":
                    profileUpgradeInputOrder.exp2v1 = ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp2v2":
                    profileUpgradeInputOrder.exp2v2 = ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp2v3":
                    profileUpgradeInputOrder.exp2v3 = ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp3v1":
                    profileUpgradeInputOrder.exp3v1 = ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp3v2":
                    profileUpgradeInputOrder.exp3v2 = ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp3v3":
                    profileUpgradeInputOrder.exp3v3 = ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileUpgradeInputOrder profileUpgradeInputOrder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "exp1v1":
                case "exp1v2":
                case "exp1v3":
                case "exp2v1":
                case "exp2v2":
                case "exp2v3":
                case "exp3v1":
                case "exp3v2":
                case "exp3v3":
                    return true;
                default:
                    return super.parseFieldCheck(profileUpgradeInputOrder, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileUpgradeInputOrder profileUpgradeInputOrder, JsonGenerator jsonGenerator) throws IOException {
            if (profileUpgradeInputOrder.exp1v1 != null) {
                jsonGenerator.writeFieldName("exp1v1");
                ProfileInputOrder.JSON_ADAPTER.serialize(profileUpgradeInputOrder.exp1v1, jsonGenerator, true);
            }
            if (profileUpgradeInputOrder.exp1v2 != null) {
                jsonGenerator.writeFieldName("exp1v2");
                ProfileInputOrder.JSON_ADAPTER.serialize(profileUpgradeInputOrder.exp1v2, jsonGenerator, true);
            }
            if (profileUpgradeInputOrder.exp1v3 != null) {
                jsonGenerator.writeFieldName("exp1v3");
                ProfileInputOrder.JSON_ADAPTER.serialize(profileUpgradeInputOrder.exp1v3, jsonGenerator, true);
            }
            if (profileUpgradeInputOrder.exp2v1 != null) {
                jsonGenerator.writeFieldName("exp2v1");
                ProfileInputOrder.JSON_ADAPTER.serialize(profileUpgradeInputOrder.exp2v1, jsonGenerator, true);
            }
            if (profileUpgradeInputOrder.exp2v2 != null) {
                jsonGenerator.writeFieldName("exp2v2");
                ProfileInputOrder.JSON_ADAPTER.serialize(profileUpgradeInputOrder.exp2v2, jsonGenerator, true);
            }
            if (profileUpgradeInputOrder.exp2v3 != null) {
                jsonGenerator.writeFieldName("exp2v3");
                ProfileInputOrder.JSON_ADAPTER.serialize(profileUpgradeInputOrder.exp2v3, jsonGenerator, true);
            }
            if (profileUpgradeInputOrder.exp3v1 != null) {
                jsonGenerator.writeFieldName("exp3v1");
                ProfileInputOrder.JSON_ADAPTER.serialize(profileUpgradeInputOrder.exp3v1, jsonGenerator, true);
            }
            if (profileUpgradeInputOrder.exp3v2 != null) {
                jsonGenerator.writeFieldName("exp3v2");
                ProfileInputOrder.JSON_ADAPTER.serialize(profileUpgradeInputOrder.exp3v2, jsonGenerator, true);
            }
            if (profileUpgradeInputOrder.exp3v3 != null) {
                jsonGenerator.writeFieldName("exp3v3");
                ProfileInputOrder.JSON_ADAPTER.serialize(profileUpgradeInputOrder.exp3v3, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileUpgradeInputOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileUpgradeInputOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileUpgradeInputOrder new_() {
        ProfileUpgradeInputOrder profileUpgradeInputOrder = new ProfileUpgradeInputOrder();
        profileUpgradeInputOrder.nullCheck();
        return profileUpgradeInputOrder;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileUpgradeInputOrder mo223809clone() {
        ProfileUpgradeInputOrder profileUpgradeInputOrder = new ProfileUpgradeInputOrder();
        ProfileInputOrder profileInputOrder = this.exp1v1;
        if (profileInputOrder != null) {
            profileUpgradeInputOrder.exp1v1 = profileInputOrder.mo223809clone();
        }
        ProfileInputOrder profileInputOrder2 = this.exp1v2;
        if (profileInputOrder2 != null) {
            profileUpgradeInputOrder.exp1v2 = profileInputOrder2.mo223809clone();
        }
        ProfileInputOrder profileInputOrder3 = this.exp1v3;
        if (profileInputOrder3 != null) {
            profileUpgradeInputOrder.exp1v3 = profileInputOrder3.mo223809clone();
        }
        ProfileInputOrder profileInputOrder4 = this.exp2v1;
        if (profileInputOrder4 != null) {
            profileUpgradeInputOrder.exp2v1 = profileInputOrder4.mo223809clone();
        }
        ProfileInputOrder profileInputOrder5 = this.exp2v2;
        if (profileInputOrder5 != null) {
            profileUpgradeInputOrder.exp2v2 = profileInputOrder5.mo223809clone();
        }
        ProfileInputOrder profileInputOrder6 = this.exp2v3;
        if (profileInputOrder6 != null) {
            profileUpgradeInputOrder.exp2v3 = profileInputOrder6.mo223809clone();
        }
        ProfileInputOrder profileInputOrder7 = this.exp3v1;
        if (profileInputOrder7 != null) {
            profileUpgradeInputOrder.exp3v1 = profileInputOrder7.mo223809clone();
        }
        ProfileInputOrder profileInputOrder8 = this.exp3v2;
        if (profileInputOrder8 != null) {
            profileUpgradeInputOrder.exp3v2 = profileInputOrder8.mo223809clone();
        }
        ProfileInputOrder profileInputOrder9 = this.exp3v3;
        if (profileInputOrder9 != null) {
            profileUpgradeInputOrder.exp3v3 = profileInputOrder9.mo223809clone();
        }
        return profileUpgradeInputOrder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileUpgradeInputOrder)) {
            return false;
        }
        ProfileUpgradeInputOrder profileUpgradeInputOrder = (ProfileUpgradeInputOrder) obj;
        return ValueObject.util_equals(this.exp1v1, profileUpgradeInputOrder.exp1v1) && ValueObject.util_equals(this.exp1v2, profileUpgradeInputOrder.exp1v2) && ValueObject.util_equals(this.exp1v3, profileUpgradeInputOrder.exp1v3) && ValueObject.util_equals(this.exp2v1, profileUpgradeInputOrder.exp2v1) && ValueObject.util_equals(this.exp2v2, profileUpgradeInputOrder.exp2v2) && ValueObject.util_equals(this.exp2v3, profileUpgradeInputOrder.exp2v3) && ValueObject.util_equals(this.exp3v1, profileUpgradeInputOrder.exp3v1) && ValueObject.util_equals(this.exp3v2, profileUpgradeInputOrder.exp3v2) && ValueObject.util_equals(this.exp3v3, profileUpgradeInputOrder.exp3v3);
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
        ProfileInputOrder profileInputOrder = this.exp1v1;
        int iHashCode = (i2 + (profileInputOrder != null ? profileInputOrder.hashCode() : 0)) * 41;
        ProfileInputOrder profileInputOrder2 = this.exp1v2;
        int iHashCode2 = (iHashCode + (profileInputOrder2 != null ? profileInputOrder2.hashCode() : 0)) * 41;
        ProfileInputOrder profileInputOrder3 = this.exp1v3;
        int iHashCode3 = (iHashCode2 + (profileInputOrder3 != null ? profileInputOrder3.hashCode() : 0)) * 41;
        ProfileInputOrder profileInputOrder4 = this.exp2v1;
        int iHashCode4 = (iHashCode3 + (profileInputOrder4 != null ? profileInputOrder4.hashCode() : 0)) * 41;
        ProfileInputOrder profileInputOrder5 = this.exp2v2;
        int iHashCode5 = (iHashCode4 + (profileInputOrder5 != null ? profileInputOrder5.hashCode() : 0)) * 41;
        ProfileInputOrder profileInputOrder6 = this.exp2v3;
        int iHashCode6 = (iHashCode5 + (profileInputOrder6 != null ? profileInputOrder6.hashCode() : 0)) * 41;
        ProfileInputOrder profileInputOrder7 = this.exp3v1;
        int iHashCode7 = (iHashCode6 + (profileInputOrder7 != null ? profileInputOrder7.hashCode() : 0)) * 41;
        ProfileInputOrder profileInputOrder8 = this.exp3v2;
        int iHashCode8 = (iHashCode7 + (profileInputOrder8 != null ? profileInputOrder8.hashCode() : 0)) * 41;
        ProfileInputOrder profileInputOrder9 = this.exp3v3;
        int iHashCode9 = iHashCode8 + (profileInputOrder9 != null ? profileInputOrder9.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.exp1v1 == null) {
            this.exp1v1 = ProfileInputOrder.new_();
        }
        if (this.exp1v2 == null) {
            this.exp1v2 = ProfileInputOrder.new_();
        }
        if (this.exp1v3 == null) {
            this.exp1v3 = ProfileInputOrder.new_();
        }
        if (this.exp2v1 == null) {
            this.exp2v1 = ProfileInputOrder.new_();
        }
        if (this.exp2v2 == null) {
            this.exp2v2 = ProfileInputOrder.new_();
        }
        if (this.exp2v3 == null) {
            this.exp2v3 = ProfileInputOrder.new_();
        }
        if (this.exp3v1 == null) {
            this.exp3v1 = ProfileInputOrder.new_();
        }
        if (this.exp3v2 == null) {
            this.exp3v2 = ProfileInputOrder.new_();
        }
        if (this.exp3v3 == null) {
            this.exp3v3 = ProfileInputOrder.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
