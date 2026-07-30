package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.IdealTag;
import com.p000p1.mobile.putong.data.ProfileExtensionBasic;
import com.p000p1.mobile.putong.data.Purpose;
import com.p000p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.MomentMessageType;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ProfileExtensionBasic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profileextensionbasic";

    @Nullable
    @ProtobufIndex(index = 1)
    public List<String> aboutMe;

    @NonNull
    @ProtobufIndex(index = 15)
    public List<String> address;

    @Nullable
    @ProtobufIndex(index = 10)
    public List<String> city;

    @Nullable
    @ProtobufIndex(index = 8)
    public List<String> country;

    @Nullable
    @ProtobufIndex(index = 13)
    public List<String> ethnicity;

    @NonNull
    @ProtobufIndex(index = 17)
    public List<String> facialFeature;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public List<String> familyBackground;

    @Nullable
    @ProtobufIndex(index = 6)
    public List<Purpose> friendPurpose;

    @Nullable
    @ProtobufIndex(index = 3)
    public List<String> hobby;

    @Nullable
    @ProtobufIndex(index = 19)
    public List<IdealTag> ideal;

    @Nullable
    public List<String> idealType;

    @Nullable
    @ProtobufIndex(index = 7)
    public List<String> interest;

    @Nullable
    @ProtobufIndex(index = 21)
    public List<String> intlFriendPurpose;

    @Nullable
    @ProtobufIndex(index = 22)
    public List<String> intlFriendPurposeV2;

    @Nullable
    @ProtobufIndex(index = 14)
    public List<String> language;

    @Nullable
    @ProtobufIndex(index = 18)
    public List<String> mbti;

    @Nullable
    @ProtobufIndex(index = 9)
    public List<String> province;

    @Nullable
    @ProtobufIndex(index = 12)
    public List<String> qualification;

    @Nullable
    @ProtobufIndex(index = 4)
    public List<String> recent;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<String> tickle;

    @Nullable
    @ProtobufIndex(index = 5)
    public List<String> together;

    @Nullable
    @ProtobufIndex(index = 20)
    public List<String> unideal;
    public static ProtobufAdapter<ProfileExtensionBasic> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileExtensionBasic>() { // from class: com.p1.mobile.putong.data.ProfileExtensionBasic.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileExtensionBasic profileExtensionBasic) {
            List<String> list = profileExtensionBasic.aboutMe;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = profileExtensionBasic.tickle;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = profileExtensionBasic.hobby;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = profileExtensionBasic.recent;
            if (list4 != null) {
                iL += CodedOutputByteBufferNano.l(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = profileExtensionBasic.together;
            if (list5 != null) {
                iL += CodedOutputByteBufferNano.l(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Purpose> list6 = profileExtensionBasic.friendPurpose;
            if (list6 != null) {
                iL += CodedOutputByteBufferNano.l(6, Purpose.covertToOldEnumList(list6), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list7 = profileExtensionBasic.interest;
            if (list7 != null) {
                iL += CodedOutputByteBufferNano.l(7, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list8 = profileExtensionBasic.country;
            if (list8 != null) {
                iL += CodedOutputByteBufferNano.l(8, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list9 = profileExtensionBasic.province;
            if (list9 != null) {
                iL += CodedOutputByteBufferNano.l(9, list9, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list10 = profileExtensionBasic.city;
            if (list10 != null) {
                iL += CodedOutputByteBufferNano.l(10, list10, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Purpose> list11 = profileExtensionBasic.friendPurpose;
            if (list11 != null) {
                iL += CodedOutputByteBufferNano.l(11, list11, Purpose.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list12 = profileExtensionBasic.qualification;
            if (list12 != null) {
                iL += CodedOutputByteBufferNano.l(12, list12, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list13 = profileExtensionBasic.ethnicity;
            if (list13 != null) {
                iL += CodedOutputByteBufferNano.l(13, list13, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list14 = profileExtensionBasic.language;
            if (list14 != null) {
                iL += CodedOutputByteBufferNano.l(14, list14, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list15 = profileExtensionBasic.address;
            if (list15 != null) {
                iL += CodedOutputByteBufferNano.l(15, list15, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list16 = profileExtensionBasic.familyBackground;
            if (list16 != null) {
                iL += CodedOutputByteBufferNano.l(16, list16, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list17 = profileExtensionBasic.facialFeature;
            if (list17 != null) {
                iL += CodedOutputByteBufferNano.l(17, list17, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list18 = profileExtensionBasic.mbti;
            if (list18 != null) {
                iL += CodedOutputByteBufferNano.l(18, list18, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list19 = profileExtensionBasic.ideal;
            if (list19 != null) {
                iL += CodedOutputByteBufferNano.l(19, list19, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list20 = profileExtensionBasic.unideal;
            if (list20 != null) {
                iL += CodedOutputByteBufferNano.l(20, list20, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list21 = profileExtensionBasic.intlFriendPurpose;
            if (list21 != null) {
                iL += CodedOutputByteBufferNano.l(21, list21, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list22 = profileExtensionBasic.intlFriendPurposeV2;
            if (list22 != null) {
                iL += CodedOutputByteBufferNano.l(22, list22, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) profileExtensionBasic).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileExtensionBasic m18841parse(nb5 nb5Var) throws IOException {
            ProfileExtensionBasic profileExtensionBasic = new ProfileExtensionBasic();
            List list = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (profileExtensionBasic.friendPurpose == null && list != null) {
                            profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list);
                        }
                        if (profileExtensionBasic.address == null) {
                            profileExtensionBasic.address = new ArrayList();
                        }
                        if (profileExtensionBasic.familyBackground == null) {
                            profileExtensionBasic.familyBackground = new ArrayList();
                        }
                        if (profileExtensionBasic.facialFeature == null) {
                            profileExtensionBasic.facialFeature = new ArrayList();
                        }
                        break;
                    case 10:
                        profileExtensionBasic.aboutMe = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 18:
                        profileExtensionBasic.tickle = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 26:
                        profileExtensionBasic.hobby = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        profileExtensionBasic.recent = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 42:
                        profileExtensionBasic.together = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        list = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        profileExtensionBasic.interest = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 66:
                        profileExtensionBasic.country = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        profileExtensionBasic.province = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 82:
                        profileExtensionBasic.city = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        profileExtensionBasic.friendPurpose = (List) nb5Var.l(Purpose.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 98:
                        profileExtensionBasic.qualification = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 106:
                        profileExtensionBasic.ethnicity = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 114:
                        profileExtensionBasic.language = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 122:
                        profileExtensionBasic.address = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 130:
                        profileExtensionBasic.familyBackground = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 138:
                        profileExtensionBasic.facialFeature = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 146:
                        profileExtensionBasic.mbti = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 154:
                        profileExtensionBasic.ideal = (List) nb5Var.l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 162:
                        profileExtensionBasic.unideal = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 170:
                        profileExtensionBasic.intlFriendPurpose = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 178:
                        profileExtensionBasic.intlFriendPurposeV2 = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (profileExtensionBasic.friendPurpose == null && list != null) {
                            profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list);
                        }
                        if (profileExtensionBasic.address == null) {
                            profileExtensionBasic.address = new ArrayList();
                        }
                        if (profileExtensionBasic.familyBackground == null) {
                            profileExtensionBasic.familyBackground = new ArrayList();
                        }
                        if (profileExtensionBasic.facialFeature == null) {
                            profileExtensionBasic.facialFeature = new ArrayList();
                            return profileExtensionBasic;
                        }
                        break;
                }
            }
            return profileExtensionBasic;
        }

        public void serialize(ProfileExtensionBasic profileExtensionBasic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = profileExtensionBasic.aboutMe;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = profileExtensionBasic.tickle;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = profileExtensionBasic.hobby;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = profileExtensionBasic.recent;
            if (list4 != null) {
                codedOutputByteBufferNano.K(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = profileExtensionBasic.together;
            if (list5 != null) {
                codedOutputByteBufferNano.K(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Purpose> list6 = profileExtensionBasic.friendPurpose;
            if (list6 != null) {
                codedOutputByteBufferNano.K(6, Purpose.covertToOldEnumList(list6), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list7 = profileExtensionBasic.interest;
            if (list7 != null) {
                codedOutputByteBufferNano.K(7, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list8 = profileExtensionBasic.country;
            if (list8 != null) {
                codedOutputByteBufferNano.K(8, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list9 = profileExtensionBasic.province;
            if (list9 != null) {
                codedOutputByteBufferNano.K(9, list9, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list10 = profileExtensionBasic.city;
            if (list10 != null) {
                codedOutputByteBufferNano.K(10, list10, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Purpose> list11 = profileExtensionBasic.friendPurpose;
            if (list11 != null) {
                codedOutputByteBufferNano.K(11, list11, Purpose.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list12 = profileExtensionBasic.qualification;
            if (list12 != null) {
                codedOutputByteBufferNano.K(12, list12, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list13 = profileExtensionBasic.ethnicity;
            if (list13 != null) {
                codedOutputByteBufferNano.K(13, list13, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list14 = profileExtensionBasic.language;
            if (list14 != null) {
                codedOutputByteBufferNano.K(14, list14, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list15 = profileExtensionBasic.address;
            if (list15 != null) {
                codedOutputByteBufferNano.K(15, list15, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list16 = profileExtensionBasic.familyBackground;
            if (list16 != null) {
                codedOutputByteBufferNano.K(16, list16, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list17 = profileExtensionBasic.facialFeature;
            if (list17 != null) {
                codedOutputByteBufferNano.K(17, list17, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list18 = profileExtensionBasic.mbti;
            if (list18 != null) {
                codedOutputByteBufferNano.K(18, list18, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list19 = profileExtensionBasic.ideal;
            if (list19 != null) {
                codedOutputByteBufferNano.K(19, list19, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list20 = profileExtensionBasic.unideal;
            if (list20 != null) {
                codedOutputByteBufferNano.K(20, list20, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list21 = profileExtensionBasic.intlFriendPurpose;
            if (list21 != null) {
                codedOutputByteBufferNano.K(21, list21, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list22 = profileExtensionBasic.intlFriendPurposeV2;
            if (list22 != null) {
                codedOutputByteBufferNano.K(22, list22, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileExtensionBasic> JSON_ADAPTER = new ObjectJsonAdapter<ProfileExtensionBasic>() { // from class: com.p1.mobile.putong.data.ProfileExtensionBasic.2
        public Class getDataClass() {
            return ProfileExtensionBasic.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ProfileExtensionBasic mo17830newInstance() {
            return new ProfileExtensionBasic();
        }

        public boolean parseField(ProfileExtensionBasic profileExtensionBasic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "friendPurpose":
                    profileExtensionBasic.friendPurpose = JsonAdapter.parseArray(jsonParser, Purpose.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "language":
                    profileExtensionBasic.language = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "familyBackground":
                    profileExtensionBasic.familyBackground = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "together":
                    profileExtensionBasic.together = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "aboutMe":
                    profileExtensionBasic.aboutMe = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "intlFriendPurpose":
                    profileExtensionBasic.intlFriendPurpose = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "address":
                    profileExtensionBasic.address = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "province":
                    profileExtensionBasic.province = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "recent":
                    profileExtensionBasic.recent = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "tickle":
                    profileExtensionBasic.tickle = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "ethnicity":
                    profileExtensionBasic.ethnicity = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "qualification":
                    profileExtensionBasic.qualification = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "facialFeature":
                    profileExtensionBasic.facialFeature = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "idealType":
                    profileExtensionBasic.idealType = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "unideal":
                    profileExtensionBasic.unideal = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "city":
                    profileExtensionBasic.city = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mbti":
                    profileExtensionBasic.mbti = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "hobby":
                    profileExtensionBasic.hobby = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "intlFriendPurposeV2":
                    profileExtensionBasic.intlFriendPurposeV2 = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "interest":
                    profileExtensionBasic.interest = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "country":
                    profileExtensionBasic.country = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileExtensionBasic profileExtensionBasic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "friendPurpose":
                case "language":
                case "familyBackground":
                case "together":
                case "aboutMe":
                case "intlFriendPurpose":
                case "address":
                case "province":
                case "recent":
                case "tickle":
                case "ethnicity":
                case "qualification":
                case "facialFeature":
                case "idealType":
                case "unideal":
                case "city":
                case "mbti":
                case "hobby":
                case "intlFriendPurposeV2":
                case "interest":
                case "country":
                    return true;
                default:
                    return super.parseFieldCheck(profileExtensionBasic, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileExtensionBasic profileExtensionBasic, JsonGenerator jsonGenerator) throws IOException {
            if (profileExtensionBasic.aboutMe != null) {
                jsonGenerator.writeFieldName("aboutMe");
                JsonAdapter.serializeArray(profileExtensionBasic.aboutMe, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.tickle != null) {
                jsonGenerator.writeFieldName(MomentMessageType.tickle);
                JsonAdapter.serializeArray(profileExtensionBasic.tickle, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.hobby != null) {
                jsonGenerator.writeFieldName("hobby");
                JsonAdapter.serializeArray(profileExtensionBasic.hobby, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.recent != null) {
                jsonGenerator.writeFieldName("recent");
                JsonAdapter.serializeArray(profileExtensionBasic.recent, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.together != null) {
                jsonGenerator.writeFieldName("together");
                JsonAdapter.serializeArray(profileExtensionBasic.together, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.friendPurpose != null) {
                jsonGenerator.writeFieldName("friendPurpose");
                JsonAdapter.serializeArray(profileExtensionBasic.friendPurpose, jsonGenerator, Purpose.JSON_ADAPTER);
            }
            if (profileExtensionBasic.interest != null) {
                jsonGenerator.writeFieldName(Interest.TYPE);
                JsonAdapter.serializeArray(profileExtensionBasic.interest, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.country != null) {
                jsonGenerator.writeFieldName("country");
                JsonAdapter.serializeArray(profileExtensionBasic.country, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.province != null) {
                jsonGenerator.writeFieldName("province");
                JsonAdapter.serializeArray(profileExtensionBasic.province, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.city != null) {
                jsonGenerator.writeFieldName("city");
                JsonAdapter.serializeArray(profileExtensionBasic.city, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.qualification != null) {
                jsonGenerator.writeFieldName("qualification");
                JsonAdapter.serializeArray(profileExtensionBasic.qualification, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.ethnicity != null) {
                jsonGenerator.writeFieldName("ethnicity");
                JsonAdapter.serializeArray(profileExtensionBasic.ethnicity, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.language != null) {
                jsonGenerator.writeFieldName("language");
                JsonAdapter.serializeArray(profileExtensionBasic.language, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.address != null) {
                jsonGenerator.writeFieldName("address");
                JsonAdapter.serializeArray(profileExtensionBasic.address, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.familyBackground != null) {
                jsonGenerator.writeFieldName("familyBackground");
                JsonAdapter.serializeArray(profileExtensionBasic.familyBackground, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.facialFeature != null) {
                jsonGenerator.writeFieldName("facialFeature");
                JsonAdapter.serializeArray(profileExtensionBasic.facialFeature, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.mbti != null) {
                jsonGenerator.writeFieldName("mbti");
                JsonAdapter.serializeArray(profileExtensionBasic.mbti, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.idealType != null) {
                jsonGenerator.writeFieldName("idealType");
                JsonAdapter.serializeArray(profileExtensionBasic.idealType, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.unideal != null) {
                jsonGenerator.writeFieldName("unideal");
                JsonAdapter.serializeArray(profileExtensionBasic.unideal, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.intlFriendPurpose != null) {
                jsonGenerator.writeFieldName("intlFriendPurpose");
                JsonAdapter.serializeArray(profileExtensionBasic.intlFriendPurpose, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionBasic.intlFriendPurposeV2 != null) {
                jsonGenerator.writeFieldName("intlFriendPurposeV2");
                JsonAdapter.serializeArray(profileExtensionBasic.intlFriendPurposeV2, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileExtensionBasic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileExtensionBasic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m926A(String str) {
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m927a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m928b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m930d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m931e(String str) {
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m932f(String str) {
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m933k(String str) {
        return str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m934l(String str) {
        return str;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m935m(String str) {
        return str;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Purpose m936n(Purpose purpose) {
        return purpose;
    }

    public static ProfileExtensionBasic new_() {
        ProfileExtensionBasic profileExtensionBasic = new ProfileExtensionBasic();
        profileExtensionBasic.nullCheck();
        return profileExtensionBasic;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m937o(String str) {
        return str;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m938p(String str) {
        return str;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m939q(String str) {
        return str;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m940r(String str) {
        return str;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m941s(String str) {
        return str;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m942t(String str) {
        return str;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m943u(String str) {
        return str;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m944w(String str) {
        return str;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m945x(String str) {
        return str;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m946y(String str) {
        return str;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ String m947z(String str) {
        return str;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileExtensionBasic m18840clone() {
        ProfileExtensionBasic profileExtensionBasic = new ProfileExtensionBasic();
        List<String> list = this.aboutMe;
        if (list != null) {
            profileExtensionBasic.aboutMe = ValueObject.util_map(list, new w9j() { // from class: l.ik90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m947z((String) obj);
                }
            });
        }
        List<String> list2 = this.tickle;
        if (list2 != null) {
            profileExtensionBasic.tickle = ValueObject.util_map(list2, new w9j() { // from class: l.kk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m941s((String) obj);
                }
            });
        }
        List<String> list3 = this.hobby;
        if (list3 != null) {
            profileExtensionBasic.hobby = ValueObject.util_map(list3, new w9j() { // from class: l.nk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m935m((String) obj);
                }
            });
        }
        List<String> list4 = this.recent;
        if (list4 != null) {
            profileExtensionBasic.recent = ValueObject.util_map(list4, new w9j() { // from class: l.ok90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m927a((String) obj);
                }
            });
        }
        List<String> list5 = this.together;
        if (list5 != null) {
            profileExtensionBasic.together = ValueObject.util_map(list5, new w9j() { // from class: l.pk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m938p((String) obj);
                }
            });
        }
        List<Purpose> list6 = this.friendPurpose;
        if (list6 != null) {
            profileExtensionBasic.friendPurpose = ValueObject.util_map(list6, new w9j() { // from class: l.qk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m936n((Purpose) obj);
                }
            });
        }
        List<String> list7 = this.interest;
        if (list7 != null) {
            profileExtensionBasic.interest = ValueObject.util_map(list7, new w9j() { // from class: l.rk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m943u((String) obj);
                }
            });
        }
        List<String> list8 = this.country;
        if (list8 != null) {
            profileExtensionBasic.country = ValueObject.util_map(list8, new w9j() { // from class: l.sk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m945x((String) obj);
                }
            });
        }
        List<String> list9 = this.province;
        if (list9 != null) {
            profileExtensionBasic.province = ValueObject.util_map(list9, new w9j() { // from class: l.uk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m932f((String) obj);
                }
            });
        }
        List<String> list10 = this.city;
        if (list10 != null) {
            profileExtensionBasic.city = ValueObject.util_map(list10, new w9j() { // from class: l.vk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m933k((String) obj);
                }
            });
        }
        List<String> list11 = this.qualification;
        if (list11 != null) {
            profileExtensionBasic.qualification = ValueObject.util_map(list11, new w9j() { // from class: l.tk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m931e((String) obj);
                }
            });
        }
        List<String> list12 = this.ethnicity;
        if (list12 != null) {
            profileExtensionBasic.ethnicity = ValueObject.util_map(list12, new w9j() { // from class: l.wk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m946y((String) obj);
                }
            });
        }
        List<String> list13 = this.language;
        if (list13 != null) {
            profileExtensionBasic.language = ValueObject.util_map(list13, new w9j() { // from class: l.xk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m930d((String) obj);
                }
            });
        }
        List<String> list14 = this.address;
        if (list14 != null) {
            profileExtensionBasic.address = ValueObject.util_map(list14, new w9j() { // from class: l.yk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m937o((String) obj);
                }
            });
        }
        List<String> list15 = this.familyBackground;
        if (list15 != null) {
            profileExtensionBasic.familyBackground = ValueObject.util_map(list15, new w9j() { // from class: l.zk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m944w((String) obj);
                }
            });
        }
        List<String> list16 = this.facialFeature;
        if (list16 != null) {
            profileExtensionBasic.facialFeature = ValueObject.util_map(list16, new w9j() { // from class: l.al90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m942t((String) obj);
                }
            });
        }
        List<String> list17 = this.mbti;
        if (list17 != null) {
            profileExtensionBasic.mbti = ValueObject.util_map(list17, new w9j() { // from class: l.bl90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m928b((String) obj);
                }
            });
        }
        List<IdealTag> list18 = this.ideal;
        if (list18 != null) {
            profileExtensionBasic.ideal = ValueObject.util_map(list18, new w9j() { // from class: l.cl90
                public final Object call(Object obj) {
                    return ((IdealTag) obj).m18213clone();
                }
            });
        }
        List<String> list19 = this.idealType;
        if (list19 != null) {
            profileExtensionBasic.idealType = ValueObject.util_map(list19, new w9j() { // from class: l.dl90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m934l((String) obj);
                }
            });
        }
        List<String> list20 = this.unideal;
        if (list20 != null) {
            profileExtensionBasic.unideal = ValueObject.util_map(list20, new w9j() { // from class: l.jk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m939q((String) obj);
                }
            });
        }
        List<String> list21 = this.intlFriendPurpose;
        if (list21 != null) {
            profileExtensionBasic.intlFriendPurpose = ValueObject.util_map(list21, new w9j() { // from class: l.lk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m940r((String) obj);
                }
            });
        }
        List<String> list22 = this.intlFriendPurposeV2;
        if (list22 != null) {
            profileExtensionBasic.intlFriendPurposeV2 = ValueObject.util_map(list22, new w9j() { // from class: l.mk90
                public final Object call(Object obj) {
                    return ProfileExtensionBasic.m926A((String) obj);
                }
            });
        }
        return profileExtensionBasic;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileExtensionBasic)) {
            return false;
        }
        ProfileExtensionBasic profileExtensionBasic = (ProfileExtensionBasic) obj;
        return ValueObject.util_equals(this.aboutMe, profileExtensionBasic.aboutMe) && ValueObject.util_equals(this.tickle, profileExtensionBasic.tickle) && ValueObject.util_equals(this.hobby, profileExtensionBasic.hobby) && ValueObject.util_equals(this.recent, profileExtensionBasic.recent) && ValueObject.util_equals(this.together, profileExtensionBasic.together) && ValueObject.util_equals(this.friendPurpose, profileExtensionBasic.friendPurpose) && ValueObject.util_equals(this.interest, profileExtensionBasic.interest) && ValueObject.util_equals(this.country, profileExtensionBasic.country) && ValueObject.util_equals(this.province, profileExtensionBasic.province) && ValueObject.util_equals(this.city, profileExtensionBasic.city) && ValueObject.util_equals(this.qualification, profileExtensionBasic.qualification) && ValueObject.util_equals(this.ethnicity, profileExtensionBasic.ethnicity) && ValueObject.util_equals(this.language, profileExtensionBasic.language) && ValueObject.util_equals(this.address, profileExtensionBasic.address) && ValueObject.util_equals(this.familyBackground, profileExtensionBasic.familyBackground) && ValueObject.util_equals(this.facialFeature, profileExtensionBasic.facialFeature) && ValueObject.util_equals(this.mbti, profileExtensionBasic.mbti) && ValueObject.util_equals(this.ideal, profileExtensionBasic.ideal) && ValueObject.util_equals(this.idealType, profileExtensionBasic.idealType) && ValueObject.util_equals(this.unideal, profileExtensionBasic.unideal) && ValueObject.util_equals(this.intlFriendPurpose, profileExtensionBasic.intlFriendPurpose) && ValueObject.util_equals(this.intlFriendPurposeV2, profileExtensionBasic.intlFriendPurposeV2);
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
        List<String> list = this.aboutMe;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.tickle;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.hobby;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<String> list4 = this.recent;
        int iHashCode4 = (iHashCode3 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<String> list5 = this.together;
        int iHashCode5 = (iHashCode4 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<Purpose> list6 = this.friendPurpose;
        int iHashCode6 = (iHashCode5 + (list6 != null ? list6.hashCode() : 0)) * 41;
        List<String> list7 = this.interest;
        int iHashCode7 = (iHashCode6 + (list7 != null ? list7.hashCode() : 0)) * 41;
        List<String> list8 = this.country;
        int iHashCode8 = (iHashCode7 + (list8 != null ? list8.hashCode() : 0)) * 41;
        List<String> list9 = this.province;
        int iHashCode9 = (iHashCode8 + (list9 != null ? list9.hashCode() : 0)) * 41;
        List<String> list10 = this.city;
        int iHashCode10 = (iHashCode9 + (list10 != null ? list10.hashCode() : 0)) * 41;
        List<String> list11 = this.qualification;
        int iHashCode11 = (iHashCode10 + (list11 != null ? list11.hashCode() : 0)) * 41;
        List<String> list12 = this.ethnicity;
        int iHashCode12 = (iHashCode11 + (list12 != null ? list12.hashCode() : 0)) * 41;
        List<String> list13 = this.language;
        int iHashCode13 = (iHashCode12 + (list13 != null ? list13.hashCode() : 0)) * 41;
        List<String> list14 = this.address;
        int iHashCode14 = (iHashCode13 + (list14 != null ? list14.hashCode() : 0)) * 41;
        List<String> list15 = this.familyBackground;
        int iHashCode15 = (iHashCode14 + (list15 != null ? list15.hashCode() : 0)) * 41;
        List<String> list16 = this.facialFeature;
        int iHashCode16 = (iHashCode15 + (list16 != null ? list16.hashCode() : 0)) * 41;
        List<String> list17 = this.mbti;
        int iHashCode17 = (iHashCode16 + (list17 != null ? list17.hashCode() : 0)) * 41;
        List<IdealTag> list18 = this.ideal;
        int iHashCode18 = (iHashCode17 + (list18 != null ? list18.hashCode() : 0)) * 41;
        List<String> list19 = this.idealType;
        int iHashCode19 = (iHashCode18 + (list19 != null ? list19.hashCode() : 0)) * 41;
        List<String> list20 = this.unideal;
        int iHashCode20 = (iHashCode19 + (list20 != null ? list20.hashCode() : 0)) * 41;
        List<String> list21 = this.intlFriendPurpose;
        int iHashCode21 = (iHashCode20 + (list21 != null ? list21.hashCode() : 0)) * 41;
        List<String> list22 = this.intlFriendPurposeV2;
        int iHashCode22 = iHashCode21 + (list22 != null ? list22.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode22;
        return iHashCode22;
    }

    public void nullCheck() {
        if (this.address == null) {
            this.address = new ArrayList();
        }
        if (this.familyBackground == null) {
            this.familyBackground = new ArrayList();
        }
        if (this.facialFeature == null) {
            this.facialFeature = new ArrayList();
        }
    }

    public ProfileExtensionBasic subtract(ProfileExtensionBasic profileExtensionBasic) {
        ProfileExtensionBasic profileExtensionBasic2 = new ProfileExtensionBasic();
        if (!ValueObject.util_equals(this.aboutMe, profileExtensionBasic.aboutMe)) {
            profileExtensionBasic2.aboutMe = this.aboutMe;
        }
        if (!ValueObject.util_equals(this.tickle, profileExtensionBasic.tickle)) {
            profileExtensionBasic2.tickle = this.tickle;
        }
        if (!ValueObject.util_equals(this.hobby, profileExtensionBasic.hobby)) {
            profileExtensionBasic2.hobby = this.hobby;
        }
        if (!ValueObject.util_equals(this.recent, profileExtensionBasic.recent)) {
            profileExtensionBasic2.recent = this.recent;
        }
        if (!ValueObject.util_equals(this.together, profileExtensionBasic.together)) {
            profileExtensionBasic2.together = this.together;
        }
        if (!ValueObject.util_equals(this.friendPurpose, profileExtensionBasic.friendPurpose)) {
            profileExtensionBasic2.friendPurpose = this.friendPurpose;
        }
        if (!ValueObject.util_equals(this.interest, profileExtensionBasic.interest)) {
            profileExtensionBasic2.interest = this.interest;
        }
        if (!ValueObject.util_equals(this.country, profileExtensionBasic.country)) {
            profileExtensionBasic2.country = this.country;
        }
        if (!ValueObject.util_equals(this.province, profileExtensionBasic.province)) {
            profileExtensionBasic2.province = this.province;
        }
        if (!ValueObject.util_equals(this.city, profileExtensionBasic.city)) {
            profileExtensionBasic2.city = this.city;
        }
        if (!ValueObject.util_equals(this.qualification, profileExtensionBasic.qualification)) {
            profileExtensionBasic2.qualification = this.qualification;
        }
        if (!ValueObject.util_equals(this.ethnicity, profileExtensionBasic.ethnicity)) {
            profileExtensionBasic2.ethnicity = this.ethnicity;
        }
        if (!ValueObject.util_equals(this.language, profileExtensionBasic.language)) {
            profileExtensionBasic2.language = this.language;
        }
        if (!ValueObject.util_equals(this.address, profileExtensionBasic.address)) {
            profileExtensionBasic2.address = this.address;
        }
        if (!ValueObject.util_equals(this.familyBackground, profileExtensionBasic.familyBackground)) {
            profileExtensionBasic2.familyBackground = this.familyBackground;
        }
        if (!ValueObject.util_equals(this.facialFeature, profileExtensionBasic.facialFeature)) {
            profileExtensionBasic2.facialFeature = this.facialFeature;
        }
        if (!ValueObject.util_equals(this.mbti, profileExtensionBasic.mbti)) {
            profileExtensionBasic2.mbti = this.mbti;
        }
        if (!ValueObject.util_equals(this.idealType, profileExtensionBasic.idealType)) {
            profileExtensionBasic2.idealType = this.idealType;
        }
        if (!ValueObject.util_equals(this.unideal, profileExtensionBasic.unideal)) {
            profileExtensionBasic2.unideal = this.unideal;
        }
        if (!ValueObject.util_equals(this.intlFriendPurpose, profileExtensionBasic.intlFriendPurpose)) {
            profileExtensionBasic2.intlFriendPurpose = this.intlFriendPurpose;
        }
        if (!ValueObject.util_equals(this.intlFriendPurposeV2, profileExtensionBasic.intlFriendPurposeV2)) {
            profileExtensionBasic2.intlFriendPurposeV2 = this.intlFriendPurposeV2;
        }
        if (profileExtensionBasic2.equals(new ProfileExtensionBasic())) {
            return null;
        }
        return profileExtensionBasic2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
