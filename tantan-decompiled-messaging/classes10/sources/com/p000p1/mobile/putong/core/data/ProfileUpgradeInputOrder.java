package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ProfileUpgradeInputOrder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profileupgradeinputorder";

    @NonNull
    @ProtobufIndex(index = 1)
    public ProfileInputOrder exp1v1;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ProfileInputOrder exp1v2;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public ProfileInputOrder exp1v3;

    @NonNull
    @ProtobufIndex(index = 4)
    public ProfileInputOrder exp2v1;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileUpgradeInputOrder profileUpgradeInputOrder) {
            ProfileInputOrder profileInputOrder = profileUpgradeInputOrder.exp1v1;
            int iL = profileInputOrder != null ? CodedOutputByteBufferNano.l(1, profileInputOrder, ProfileInputOrder.PROTOBUF_ADAPTER) : 0;
            ProfileInputOrder profileInputOrder2 = profileUpgradeInputOrder.exp1v2;
            if (profileInputOrder2 != null) {
                iL += CodedOutputByteBufferNano.l(2, profileInputOrder2, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder3 = profileUpgradeInputOrder.exp1v3;
            if (profileInputOrder3 != null) {
                iL += CodedOutputByteBufferNano.l(3, profileInputOrder3, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder4 = profileUpgradeInputOrder.exp2v1;
            if (profileInputOrder4 != null) {
                iL += CodedOutputByteBufferNano.l(4, profileInputOrder4, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder5 = profileUpgradeInputOrder.exp2v2;
            if (profileInputOrder5 != null) {
                iL += CodedOutputByteBufferNano.l(5, profileInputOrder5, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder6 = profileUpgradeInputOrder.exp2v3;
            if (profileInputOrder6 != null) {
                iL += CodedOutputByteBufferNano.l(6, profileInputOrder6, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder7 = profileUpgradeInputOrder.exp3v1;
            if (profileInputOrder7 != null) {
                iL += CodedOutputByteBufferNano.l(7, profileInputOrder7, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder8 = profileUpgradeInputOrder.exp3v2;
            if (profileInputOrder8 != null) {
                iL += CodedOutputByteBufferNano.l(8, profileInputOrder8, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder9 = profileUpgradeInputOrder.exp3v3;
            if (profileInputOrder9 != null) {
                iL += CodedOutputByteBufferNano.l(9, profileInputOrder9, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ((MessageNano) profileUpgradeInputOrder).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileUpgradeInputOrder m15037parse(nb5 nb5Var) throws IOException {
            ProfileUpgradeInputOrder profileUpgradeInputOrder = new ProfileUpgradeInputOrder();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    profileUpgradeInputOrder.exp1v1 = (ProfileInputOrder) nb5Var.l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    profileUpgradeInputOrder.exp1v2 = (ProfileInputOrder) nb5Var.l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    profileUpgradeInputOrder.exp1v3 = (ProfileInputOrder) nb5Var.l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    profileUpgradeInputOrder.exp2v1 = (ProfileInputOrder) nb5Var.l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    profileUpgradeInputOrder.exp2v2 = (ProfileInputOrder) nb5Var.l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else if (iU == 50) {
                    profileUpgradeInputOrder.exp2v3 = (ProfileInputOrder) nb5Var.l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else if (iU == 58) {
                    profileUpgradeInputOrder.exp3v1 = (ProfileInputOrder) nb5Var.l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else if (iU == 66) {
                    profileUpgradeInputOrder.exp3v2 = (ProfileInputOrder) nb5Var.l(ProfileInputOrder.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 74) {
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
                    profileUpgradeInputOrder.exp3v3 = (ProfileInputOrder) nb5Var.l(ProfileInputOrder.PROTOBUF_ADAPTER);
                }
            }
            return profileUpgradeInputOrder;
        }

        public void serialize(ProfileUpgradeInputOrder profileUpgradeInputOrder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ProfileInputOrder profileInputOrder = profileUpgradeInputOrder.exp1v1;
            if (profileInputOrder != null) {
                codedOutputByteBufferNano.K(1, profileInputOrder, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder2 = profileUpgradeInputOrder.exp1v2;
            if (profileInputOrder2 != null) {
                codedOutputByteBufferNano.K(2, profileInputOrder2, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder3 = profileUpgradeInputOrder.exp1v3;
            if (profileInputOrder3 != null) {
                codedOutputByteBufferNano.K(3, profileInputOrder3, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder4 = profileUpgradeInputOrder.exp2v1;
            if (profileInputOrder4 != null) {
                codedOutputByteBufferNano.K(4, profileInputOrder4, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder5 = profileUpgradeInputOrder.exp2v2;
            if (profileInputOrder5 != null) {
                codedOutputByteBufferNano.K(5, profileInputOrder5, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder6 = profileUpgradeInputOrder.exp2v3;
            if (profileInputOrder6 != null) {
                codedOutputByteBufferNano.K(6, profileInputOrder6, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder7 = profileUpgradeInputOrder.exp3v1;
            if (profileInputOrder7 != null) {
                codedOutputByteBufferNano.K(7, profileInputOrder7, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder8 = profileUpgradeInputOrder.exp3v2;
            if (profileInputOrder8 != null) {
                codedOutputByteBufferNano.K(8, profileInputOrder8, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileInputOrder profileInputOrder9 = profileUpgradeInputOrder.exp3v3;
            if (profileInputOrder9 != null) {
                codedOutputByteBufferNano.K(9, profileInputOrder9, ProfileInputOrder.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ProfileUpgradeInputOrder> JSON_ADAPTER = new ObjectJsonAdapter<ProfileUpgradeInputOrder>() { // from class: com.p1.mobile.putong.core.data.ProfileUpgradeInputOrder.2
        public Class getDataClass() {
            return ProfileUpgradeInputOrder.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileUpgradeInputOrder m15038newInstance() {
            return new ProfileUpgradeInputOrder();
        }

        public boolean parseField(ProfileUpgradeInputOrder profileUpgradeInputOrder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "exp1v1":
                    profileUpgradeInputOrder.exp1v1 = (ProfileInputOrder) ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp1v2":
                    profileUpgradeInputOrder.exp1v2 = (ProfileInputOrder) ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp1v3":
                    profileUpgradeInputOrder.exp1v3 = (ProfileInputOrder) ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp2v1":
                    profileUpgradeInputOrder.exp2v1 = (ProfileInputOrder) ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp2v2":
                    profileUpgradeInputOrder.exp2v2 = (ProfileInputOrder) ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp2v3":
                    profileUpgradeInputOrder.exp2v3 = (ProfileInputOrder) ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp3v1":
                    profileUpgradeInputOrder.exp3v1 = (ProfileInputOrder) ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp3v2":
                    profileUpgradeInputOrder.exp3v2 = (ProfileInputOrder) ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exp3v3":
                    profileUpgradeInputOrder.exp3v3 = (ProfileInputOrder) ProfileInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileUpgradeInputOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileUpgradeInputOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileUpgradeInputOrder new_() {
        ProfileUpgradeInputOrder profileUpgradeInputOrder = new ProfileUpgradeInputOrder();
        profileUpgradeInputOrder.nullCheck();
        return profileUpgradeInputOrder;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileUpgradeInputOrder m15036clone() {
        ProfileUpgradeInputOrder profileUpgradeInputOrder = new ProfileUpgradeInputOrder();
        ProfileInputOrder profileInputOrder = this.exp1v1;
        if (profileInputOrder != null) {
            profileUpgradeInputOrder.exp1v1 = profileInputOrder.m14976clone();
        }
        ProfileInputOrder profileInputOrder2 = this.exp1v2;
        if (profileInputOrder2 != null) {
            profileUpgradeInputOrder.exp1v2 = profileInputOrder2.m14976clone();
        }
        ProfileInputOrder profileInputOrder3 = this.exp1v3;
        if (profileInputOrder3 != null) {
            profileUpgradeInputOrder.exp1v3 = profileInputOrder3.m14976clone();
        }
        ProfileInputOrder profileInputOrder4 = this.exp2v1;
        if (profileInputOrder4 != null) {
            profileUpgradeInputOrder.exp2v1 = profileInputOrder4.m14976clone();
        }
        ProfileInputOrder profileInputOrder5 = this.exp2v2;
        if (profileInputOrder5 != null) {
            profileUpgradeInputOrder.exp2v2 = profileInputOrder5.m14976clone();
        }
        ProfileInputOrder profileInputOrder6 = this.exp2v3;
        if (profileInputOrder6 != null) {
            profileUpgradeInputOrder.exp2v3 = profileInputOrder6.m14976clone();
        }
        ProfileInputOrder profileInputOrder7 = this.exp3v1;
        if (profileInputOrder7 != null) {
            profileUpgradeInputOrder.exp3v1 = profileInputOrder7.m14976clone();
        }
        ProfileInputOrder profileInputOrder8 = this.exp3v2;
        if (profileInputOrder8 != null) {
            profileUpgradeInputOrder.exp3v2 = profileInputOrder8.m14976clone();
        }
        ProfileInputOrder profileInputOrder9 = this.exp3v3;
        if (profileInputOrder9 != null) {
            profileUpgradeInputOrder.exp3v3 = profileInputOrder9.m14976clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode9;
        return iHashCode9;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
