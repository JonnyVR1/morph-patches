package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
public class ProfileExtensionMarriage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profileextensionmarriage";

    @NonNull
    @ProtobufIndex(index = 7)
    public List<String> babyWilling;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> bridePrice;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> declaration;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> expectedTime;

    @NonNull
    @ProtobufIndex(index = 14)
    public List<String> lifeMoment;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> mateAddress;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> mateAge;

    @NonNull
    @ProtobufIndex(index = 13)
    public List<String> mateDescription;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<String> mateHeight;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<String> mateHometown;

    @NonNull
    @ProtobufIndex(index = 15)
    public List<String> mateIncome;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> mateQualification;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<String> mateStatus;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<String> mateWeight;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public List<String> prologue;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> status;
    public static ProtobufAdapter<ProfileExtensionMarriage> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileExtensionMarriage>() { // from class: com.p1.mobile.putong.data.ProfileExtensionMarriage.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileExtensionMarriage profileExtensionMarriage) {
            List<String> list = profileExtensionMarriage.declaration;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = profileExtensionMarriage.expectedTime;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = profileExtensionMarriage.status;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = profileExtensionMarriage.mateAge;
            if (list4 != null) {
                iL += CodedOutputByteBufferNano.l(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = profileExtensionMarriage.mateQualification;
            if (list5 != null) {
                iL += CodedOutputByteBufferNano.l(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = profileExtensionMarriage.mateAddress;
            if (list6 != null) {
                iL += CodedOutputByteBufferNano.l(6, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list7 = profileExtensionMarriage.babyWilling;
            if (list7 != null) {
                iL += CodedOutputByteBufferNano.l(7, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list8 = profileExtensionMarriage.bridePrice;
            if (list8 != null) {
                iL += CodedOutputByteBufferNano.l(8, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list9 = profileExtensionMarriage.mateStatus;
            if (list9 != null) {
                iL += CodedOutputByteBufferNano.l(9, list9, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list10 = profileExtensionMarriage.mateHeight;
            if (list10 != null) {
                iL += CodedOutputByteBufferNano.l(10, list10, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list11 = profileExtensionMarriage.mateWeight;
            if (list11 != null) {
                iL += CodedOutputByteBufferNano.l(11, list11, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list12 = profileExtensionMarriage.mateHometown;
            if (list12 != null) {
                iL += CodedOutputByteBufferNano.l(12, list12, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list13 = profileExtensionMarriage.mateDescription;
            if (list13 != null) {
                iL += CodedOutputByteBufferNano.l(13, list13, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list14 = profileExtensionMarriage.lifeMoment;
            if (list14 != null) {
                iL += CodedOutputByteBufferNano.l(14, list14, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list15 = profileExtensionMarriage.mateIncome;
            if (list15 != null) {
                iL += CodedOutputByteBufferNano.l(15, list15, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list16 = profileExtensionMarriage.prologue;
            if (list16 != null) {
                iL += CodedOutputByteBufferNano.l(16, list16, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) profileExtensionMarriage).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileExtensionMarriage m18844parse(nb5 nb5Var) throws IOException {
            ProfileExtensionMarriage profileExtensionMarriage = new ProfileExtensionMarriage();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (profileExtensionMarriage.declaration == null) {
                            profileExtensionMarriage.declaration = new ArrayList();
                        }
                        if (profileExtensionMarriage.expectedTime == null) {
                            profileExtensionMarriage.expectedTime = new ArrayList();
                        }
                        if (profileExtensionMarriage.status == null) {
                            profileExtensionMarriage.status = new ArrayList();
                        }
                        if (profileExtensionMarriage.babyWilling == null) {
                            profileExtensionMarriage.babyWilling = new ArrayList();
                        }
                        if (profileExtensionMarriage.bridePrice == null) {
                            profileExtensionMarriage.bridePrice = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateAge == null) {
                            profileExtensionMarriage.mateAge = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateQualification == null) {
                            profileExtensionMarriage.mateQualification = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateAddress == null) {
                            profileExtensionMarriage.mateAddress = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateStatus == null) {
                            profileExtensionMarriage.mateStatus = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateHeight == null) {
                            profileExtensionMarriage.mateHeight = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateWeight == null) {
                            profileExtensionMarriage.mateWeight = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateHometown == null) {
                            profileExtensionMarriage.mateHometown = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateDescription == null) {
                            profileExtensionMarriage.mateDescription = new ArrayList();
                        }
                        if (profileExtensionMarriage.lifeMoment == null) {
                            profileExtensionMarriage.lifeMoment = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateIncome == null) {
                            profileExtensionMarriage.mateIncome = new ArrayList();
                        }
                        if (profileExtensionMarriage.prologue == null) {
                            profileExtensionMarriage.prologue = new ArrayList();
                        }
                        break;
                    case 10:
                        profileExtensionMarriage.declaration = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 18:
                        profileExtensionMarriage.expectedTime = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 26:
                        profileExtensionMarriage.status = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        profileExtensionMarriage.mateAge = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 42:
                        profileExtensionMarriage.mateQualification = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        profileExtensionMarriage.mateAddress = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        profileExtensionMarriage.babyWilling = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 66:
                        profileExtensionMarriage.bridePrice = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        profileExtensionMarriage.mateStatus = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 82:
                        profileExtensionMarriage.mateHeight = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        profileExtensionMarriage.mateWeight = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 98:
                        profileExtensionMarriage.mateHometown = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 106:
                        profileExtensionMarriage.mateDescription = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 114:
                        profileExtensionMarriage.lifeMoment = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 122:
                        profileExtensionMarriage.mateIncome = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 130:
                        profileExtensionMarriage.prologue = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (profileExtensionMarriage.declaration == null) {
                            profileExtensionMarriage.declaration = new ArrayList();
                        }
                        if (profileExtensionMarriage.expectedTime == null) {
                            profileExtensionMarriage.expectedTime = new ArrayList();
                        }
                        if (profileExtensionMarriage.status == null) {
                            profileExtensionMarriage.status = new ArrayList();
                        }
                        if (profileExtensionMarriage.babyWilling == null) {
                            profileExtensionMarriage.babyWilling = new ArrayList();
                        }
                        if (profileExtensionMarriage.bridePrice == null) {
                            profileExtensionMarriage.bridePrice = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateAge == null) {
                            profileExtensionMarriage.mateAge = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateQualification == null) {
                            profileExtensionMarriage.mateQualification = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateAddress == null) {
                            profileExtensionMarriage.mateAddress = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateStatus == null) {
                            profileExtensionMarriage.mateStatus = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateHeight == null) {
                            profileExtensionMarriage.mateHeight = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateWeight == null) {
                            profileExtensionMarriage.mateWeight = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateHometown == null) {
                            profileExtensionMarriage.mateHometown = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateDescription == null) {
                            profileExtensionMarriage.mateDescription = new ArrayList();
                        }
                        if (profileExtensionMarriage.lifeMoment == null) {
                            profileExtensionMarriage.lifeMoment = new ArrayList();
                        }
                        if (profileExtensionMarriage.mateIncome == null) {
                            profileExtensionMarriage.mateIncome = new ArrayList();
                        }
                        if (profileExtensionMarriage.prologue == null) {
                            profileExtensionMarriage.prologue = new ArrayList();
                            return profileExtensionMarriage;
                        }
                        break;
                }
            }
            return profileExtensionMarriage;
        }

        public void serialize(ProfileExtensionMarriage profileExtensionMarriage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = profileExtensionMarriage.declaration;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = profileExtensionMarriage.expectedTime;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = profileExtensionMarriage.status;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = profileExtensionMarriage.mateAge;
            if (list4 != null) {
                codedOutputByteBufferNano.K(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = profileExtensionMarriage.mateQualification;
            if (list5 != null) {
                codedOutputByteBufferNano.K(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = profileExtensionMarriage.mateAddress;
            if (list6 != null) {
                codedOutputByteBufferNano.K(6, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list7 = profileExtensionMarriage.babyWilling;
            if (list7 != null) {
                codedOutputByteBufferNano.K(7, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list8 = profileExtensionMarriage.bridePrice;
            if (list8 != null) {
                codedOutputByteBufferNano.K(8, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list9 = profileExtensionMarriage.mateStatus;
            if (list9 != null) {
                codedOutputByteBufferNano.K(9, list9, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list10 = profileExtensionMarriage.mateHeight;
            if (list10 != null) {
                codedOutputByteBufferNano.K(10, list10, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list11 = profileExtensionMarriage.mateWeight;
            if (list11 != null) {
                codedOutputByteBufferNano.K(11, list11, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list12 = profileExtensionMarriage.mateHometown;
            if (list12 != null) {
                codedOutputByteBufferNano.K(12, list12, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list13 = profileExtensionMarriage.mateDescription;
            if (list13 != null) {
                codedOutputByteBufferNano.K(13, list13, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list14 = profileExtensionMarriage.lifeMoment;
            if (list14 != null) {
                codedOutputByteBufferNano.K(14, list14, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list15 = profileExtensionMarriage.mateIncome;
            if (list15 != null) {
                codedOutputByteBufferNano.K(15, list15, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list16 = profileExtensionMarriage.prologue;
            if (list16 != null) {
                codedOutputByteBufferNano.K(16, list16, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileExtensionMarriage> JSON_ADAPTER = new ObjectJsonAdapter<ProfileExtensionMarriage>() { // from class: com.p1.mobile.putong.data.ProfileExtensionMarriage.2
        public Class getDataClass() {
            return ProfileExtensionMarriage.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ProfileExtensionMarriage mo17830newInstance() {
            return new ProfileExtensionMarriage();
        }

        public boolean parseField(ProfileExtensionMarriage profileExtensionMarriage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bridePrice":
                    profileExtensionMarriage.bridePrice = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "declaration":
                    profileExtensionMarriage.declaration = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mateHeight":
                    profileExtensionMarriage.mateHeight = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mateIncome":
                    profileExtensionMarriage.mateIncome = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "lifeMoment":
                    profileExtensionMarriage.lifeMoment = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mateQualification":
                    profileExtensionMarriage.mateQualification = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mateStatus":
                    profileExtensionMarriage.mateStatus = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mateWeight":
                    profileExtensionMarriage.mateWeight = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "prologue":
                    profileExtensionMarriage.prologue = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mateHometown":
                    profileExtensionMarriage.mateHometown = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    profileExtensionMarriage.status = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mateDescription":
                    profileExtensionMarriage.mateDescription = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "expectedTime":
                    profileExtensionMarriage.expectedTime = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "babyWilling":
                    profileExtensionMarriage.babyWilling = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mateAge":
                    profileExtensionMarriage.mateAge = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mateAddress":
                    profileExtensionMarriage.mateAddress = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileExtensionMarriage profileExtensionMarriage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bridePrice":
                case "declaration":
                case "mateHeight":
                case "mateIncome":
                case "lifeMoment":
                case "mateQualification":
                case "mateStatus":
                case "mateWeight":
                case "prologue":
                case "mateHometown":
                case "status":
                case "mateDescription":
                case "expectedTime":
                case "babyWilling":
                case "mateAge":
                case "mateAddress":
                    return true;
                default:
                    return super.parseFieldCheck(profileExtensionMarriage, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileExtensionMarriage profileExtensionMarriage, JsonGenerator jsonGenerator) throws IOException {
            if (profileExtensionMarriage.declaration != null) {
                jsonGenerator.writeFieldName("declaration");
                JsonAdapter.serializeArray(profileExtensionMarriage.declaration, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.expectedTime != null) {
                jsonGenerator.writeFieldName("expectedTime");
                JsonAdapter.serializeArray(profileExtensionMarriage.expectedTime, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.status != null) {
                jsonGenerator.writeFieldName("status");
                JsonAdapter.serializeArray(profileExtensionMarriage.status, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.babyWilling != null) {
                jsonGenerator.writeFieldName("babyWilling");
                JsonAdapter.serializeArray(profileExtensionMarriage.babyWilling, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.bridePrice != null) {
                jsonGenerator.writeFieldName("bridePrice");
                JsonAdapter.serializeArray(profileExtensionMarriage.bridePrice, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.mateAge != null) {
                jsonGenerator.writeFieldName("mateAge");
                JsonAdapter.serializeArray(profileExtensionMarriage.mateAge, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.mateQualification != null) {
                jsonGenerator.writeFieldName("mateQualification");
                JsonAdapter.serializeArray(profileExtensionMarriage.mateQualification, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.mateAddress != null) {
                jsonGenerator.writeFieldName("mateAddress");
                JsonAdapter.serializeArray(profileExtensionMarriage.mateAddress, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.mateStatus != null) {
                jsonGenerator.writeFieldName("mateStatus");
                JsonAdapter.serializeArray(profileExtensionMarriage.mateStatus, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.mateHeight != null) {
                jsonGenerator.writeFieldName("mateHeight");
                JsonAdapter.serializeArray(profileExtensionMarriage.mateHeight, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.mateWeight != null) {
                jsonGenerator.writeFieldName("mateWeight");
                JsonAdapter.serializeArray(profileExtensionMarriage.mateWeight, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.mateHometown != null) {
                jsonGenerator.writeFieldName("mateHometown");
                JsonAdapter.serializeArray(profileExtensionMarriage.mateHometown, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.mateDescription != null) {
                jsonGenerator.writeFieldName("mateDescription");
                JsonAdapter.serializeArray(profileExtensionMarriage.mateDescription, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.lifeMoment != null) {
                jsonGenerator.writeFieldName("lifeMoment");
                JsonAdapter.serializeArray(profileExtensionMarriage.lifeMoment, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.mateIncome != null) {
                jsonGenerator.writeFieldName("mateIncome");
                JsonAdapter.serializeArray(profileExtensionMarriage.mateIncome, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileExtensionMarriage.prologue != null) {
                jsonGenerator.writeFieldName("prologue");
                JsonAdapter.serializeArray(profileExtensionMarriage.prologue, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileExtensionMarriage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileExtensionMarriage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m948a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m949b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m950c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m951d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m952e(String str) {
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m953f(String str) {
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m954k(String str) {
        return str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m955l(String str) {
        return str;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m956m(String str) {
        return str;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m957n(String str) {
        return str;
    }

    public static ProfileExtensionMarriage new_() {
        ProfileExtensionMarriage profileExtensionMarriage = new ProfileExtensionMarriage();
        profileExtensionMarriage.nullCheck();
        return profileExtensionMarriage;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m958o(String str) {
        return str;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m959p(String str) {
        return str;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m960q(String str) {
        return str;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m961r(String str) {
        return str;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m962s(String str) {
        return str;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m963t(String str) {
        return str;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileExtensionMarriage m18843clone() {
        ProfileExtensionMarriage profileExtensionMarriage = new ProfileExtensionMarriage();
        List<String> list = this.declaration;
        if (list != null) {
            profileExtensionMarriage.declaration = ValueObject.util_map(list, new w9j() { // from class: l.el90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m959p((String) obj);
                }
            });
        }
        List<String> list2 = this.expectedTime;
        if (list2 != null) {
            profileExtensionMarriage.expectedTime = ValueObject.util_map(list2, new w9j() { // from class: l.rl90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m957n((String) obj);
                }
            });
        }
        List<String> list3 = this.status;
        if (list3 != null) {
            profileExtensionMarriage.status = ValueObject.util_map(list3, new w9j() { // from class: l.sl90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m962s((String) obj);
                }
            });
        }
        List<String> list4 = this.babyWilling;
        if (list4 != null) {
            profileExtensionMarriage.babyWilling = ValueObject.util_map(list4, new w9j() { // from class: l.tl90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m955l((String) obj);
                }
            });
        }
        List<String> list5 = this.bridePrice;
        if (list5 != null) {
            profileExtensionMarriage.bridePrice = ValueObject.util_map(list5, new w9j() { // from class: l.fl90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m949b((String) obj);
                }
            });
        }
        List<String> list6 = this.mateAge;
        if (list6 != null) {
            profileExtensionMarriage.mateAge = ValueObject.util_map(list6, new w9j() { // from class: l.gl90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m961r((String) obj);
                }
            });
        }
        List<String> list7 = this.mateQualification;
        if (list7 != null) {
            profileExtensionMarriage.mateQualification = ValueObject.util_map(list7, new w9j() { // from class: l.hl90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m950c((String) obj);
                }
            });
        }
        List<String> list8 = this.mateAddress;
        if (list8 != null) {
            profileExtensionMarriage.mateAddress = ValueObject.util_map(list8, new w9j() { // from class: l.il90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m954k((String) obj);
                }
            });
        }
        List<String> list9 = this.mateStatus;
        if (list9 != null) {
            profileExtensionMarriage.mateStatus = ValueObject.util_map(list9, new w9j() { // from class: l.jl90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m956m((String) obj);
                }
            });
        }
        List<String> list10 = this.mateHeight;
        if (list10 != null) {
            profileExtensionMarriage.mateHeight = ValueObject.util_map(list10, new w9j() { // from class: l.kl90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m948a((String) obj);
                }
            });
        }
        List<String> list11 = this.mateWeight;
        if (list11 != null) {
            profileExtensionMarriage.mateWeight = ValueObject.util_map(list11, new w9j() { // from class: l.ll90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m951d((String) obj);
                }
            });
        }
        List<String> list12 = this.mateHometown;
        if (list12 != null) {
            profileExtensionMarriage.mateHometown = ValueObject.util_map(list12, new w9j() { // from class: l.ml90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m958o((String) obj);
                }
            });
        }
        List<String> list13 = this.mateDescription;
        if (list13 != null) {
            profileExtensionMarriage.mateDescription = ValueObject.util_map(list13, new w9j() { // from class: l.nl90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m960q((String) obj);
                }
            });
        }
        List<String> list14 = this.lifeMoment;
        if (list14 != null) {
            profileExtensionMarriage.lifeMoment = ValueObject.util_map(list14, new w9j() { // from class: l.ol90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m953f((String) obj);
                }
            });
        }
        List<String> list15 = this.mateIncome;
        if (list15 != null) {
            profileExtensionMarriage.mateIncome = ValueObject.util_map(list15, new w9j() { // from class: l.pl90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m963t((String) obj);
                }
            });
        }
        List<String> list16 = this.prologue;
        if (list16 != null) {
            profileExtensionMarriage.prologue = ValueObject.util_map(list16, new w9j() { // from class: l.ql90
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m952e((String) obj);
                }
            });
        }
        return profileExtensionMarriage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileExtensionMarriage)) {
            return false;
        }
        ProfileExtensionMarriage profileExtensionMarriage = (ProfileExtensionMarriage) obj;
        return ValueObject.util_equals(this.declaration, profileExtensionMarriage.declaration) && ValueObject.util_equals(this.expectedTime, profileExtensionMarriage.expectedTime) && ValueObject.util_equals(this.status, profileExtensionMarriage.status) && ValueObject.util_equals(this.babyWilling, profileExtensionMarriage.babyWilling) && ValueObject.util_equals(this.bridePrice, profileExtensionMarriage.bridePrice) && ValueObject.util_equals(this.mateAge, profileExtensionMarriage.mateAge) && ValueObject.util_equals(this.mateQualification, profileExtensionMarriage.mateQualification) && ValueObject.util_equals(this.mateAddress, profileExtensionMarriage.mateAddress) && ValueObject.util_equals(this.mateStatus, profileExtensionMarriage.mateStatus) && ValueObject.util_equals(this.mateHeight, profileExtensionMarriage.mateHeight) && ValueObject.util_equals(this.mateWeight, profileExtensionMarriage.mateWeight) && ValueObject.util_equals(this.mateHometown, profileExtensionMarriage.mateHometown) && ValueObject.util_equals(this.mateDescription, profileExtensionMarriage.mateDescription) && ValueObject.util_equals(this.lifeMoment, profileExtensionMarriage.lifeMoment) && ValueObject.util_equals(this.mateIncome, profileExtensionMarriage.mateIncome) && ValueObject.util_equals(this.prologue, profileExtensionMarriage.prologue);
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
        List<String> list = this.declaration;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.expectedTime;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.status;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<String> list4 = this.babyWilling;
        int iHashCode4 = (iHashCode3 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<String> list5 = this.bridePrice;
        int iHashCode5 = (iHashCode4 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<String> list6 = this.mateAge;
        int iHashCode6 = (iHashCode5 + (list6 != null ? list6.hashCode() : 0)) * 41;
        List<String> list7 = this.mateQualification;
        int iHashCode7 = (iHashCode6 + (list7 != null ? list7.hashCode() : 0)) * 41;
        List<String> list8 = this.mateAddress;
        int iHashCode8 = (iHashCode7 + (list8 != null ? list8.hashCode() : 0)) * 41;
        List<String> list9 = this.mateStatus;
        int iHashCode9 = (iHashCode8 + (list9 != null ? list9.hashCode() : 0)) * 41;
        List<String> list10 = this.mateHeight;
        int iHashCode10 = (iHashCode9 + (list10 != null ? list10.hashCode() : 0)) * 41;
        List<String> list11 = this.mateWeight;
        int iHashCode11 = (iHashCode10 + (list11 != null ? list11.hashCode() : 0)) * 41;
        List<String> list12 = this.mateHometown;
        int iHashCode12 = (iHashCode11 + (list12 != null ? list12.hashCode() : 0)) * 41;
        List<String> list13 = this.mateDescription;
        int iHashCode13 = (iHashCode12 + (list13 != null ? list13.hashCode() : 0)) * 41;
        List<String> list14 = this.lifeMoment;
        int iHashCode14 = (iHashCode13 + (list14 != null ? list14.hashCode() : 0)) * 41;
        List<String> list15 = this.mateIncome;
        int iHashCode15 = (iHashCode14 + (list15 != null ? list15.hashCode() : 0)) * 41;
        List<String> list16 = this.prologue;
        int iHashCode16 = iHashCode15 + (list16 != null ? list16.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode16;
        return iHashCode16;
    }

    public void nullCheck() {
        if (this.declaration == null) {
            this.declaration = new ArrayList();
        }
        if (this.expectedTime == null) {
            this.expectedTime = new ArrayList();
        }
        if (this.status == null) {
            this.status = new ArrayList();
        }
        if (this.babyWilling == null) {
            this.babyWilling = new ArrayList();
        }
        if (this.bridePrice == null) {
            this.bridePrice = new ArrayList();
        }
        if (this.mateAge == null) {
            this.mateAge = new ArrayList();
        }
        if (this.mateQualification == null) {
            this.mateQualification = new ArrayList();
        }
        if (this.mateAddress == null) {
            this.mateAddress = new ArrayList();
        }
        if (this.mateStatus == null) {
            this.mateStatus = new ArrayList();
        }
        if (this.mateHeight == null) {
            this.mateHeight = new ArrayList();
        }
        if (this.mateWeight == null) {
            this.mateWeight = new ArrayList();
        }
        if (this.mateHometown == null) {
            this.mateHometown = new ArrayList();
        }
        if (this.mateDescription == null) {
            this.mateDescription = new ArrayList();
        }
        if (this.lifeMoment == null) {
            this.lifeMoment = new ArrayList();
        }
        if (this.mateIncome == null) {
            this.mateIncome = new ArrayList();
        }
        if (this.prologue == null) {
            this.prologue = new ArrayList();
        }
    }

    public ProfileExtensionMarriage subtract(ProfileExtensionMarriage profileExtensionMarriage) {
        ProfileExtensionMarriage profileExtensionMarriage2 = new ProfileExtensionMarriage();
        if (!ValueObject.util_equals(this.declaration, profileExtensionMarriage.declaration)) {
            profileExtensionMarriage2.declaration = this.declaration;
        }
        if (!ValueObject.util_equals(this.expectedTime, profileExtensionMarriage.expectedTime)) {
            profileExtensionMarriage2.expectedTime = this.expectedTime;
        }
        if (!ValueObject.util_equals(this.status, profileExtensionMarriage.status)) {
            profileExtensionMarriage2.status = this.status;
        }
        if (!ValueObject.util_equals(this.babyWilling, profileExtensionMarriage.babyWilling)) {
            profileExtensionMarriage2.babyWilling = this.babyWilling;
        }
        if (!ValueObject.util_equals(this.bridePrice, profileExtensionMarriage.bridePrice)) {
            profileExtensionMarriage2.bridePrice = this.bridePrice;
        }
        if (!ValueObject.util_equals(this.mateAge, profileExtensionMarriage.mateAge)) {
            profileExtensionMarriage2.mateAge = this.mateAge;
        }
        if (!ValueObject.util_equals(this.mateQualification, profileExtensionMarriage.mateQualification)) {
            profileExtensionMarriage2.mateQualification = this.mateQualification;
        }
        if (!ValueObject.util_equals(this.mateAddress, profileExtensionMarriage.mateAddress)) {
            profileExtensionMarriage2.mateAddress = this.mateAddress;
        }
        if (!ValueObject.util_equals(this.mateStatus, profileExtensionMarriage.mateStatus)) {
            profileExtensionMarriage2.mateStatus = this.mateStatus;
        }
        if (!ValueObject.util_equals(this.mateHeight, profileExtensionMarriage.mateHeight)) {
            profileExtensionMarriage2.mateHeight = this.mateHeight;
        }
        if (!ValueObject.util_equals(this.mateWeight, profileExtensionMarriage.mateWeight)) {
            profileExtensionMarriage2.mateWeight = this.mateWeight;
        }
        if (!ValueObject.util_equals(this.mateHometown, profileExtensionMarriage.mateHometown)) {
            profileExtensionMarriage2.mateHometown = this.mateHometown;
        }
        if (!ValueObject.util_equals(this.mateDescription, profileExtensionMarriage.mateDescription)) {
            profileExtensionMarriage2.mateDescription = this.mateDescription;
        }
        if (!ValueObject.util_equals(this.lifeMoment, profileExtensionMarriage.lifeMoment)) {
            profileExtensionMarriage2.lifeMoment = this.lifeMoment;
        }
        if (!ValueObject.util_equals(this.mateIncome, profileExtensionMarriage.mateIncome)) {
            profileExtensionMarriage2.mateIncome = this.mateIncome;
        }
        if (!ValueObject.util_equals(this.prologue, profileExtensionMarriage.prologue)) {
            profileExtensionMarriage2.prologue = this.prologue;
        }
        if (profileExtensionMarriage2.equals(new ProfileExtensionMarriage())) {
            return null;
        }
        return profileExtensionMarriage2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
