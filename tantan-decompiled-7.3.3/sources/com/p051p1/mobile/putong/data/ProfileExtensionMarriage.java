package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.ProfileExtensionMarriage;
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
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
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
    @ProtobufIndex(index = 16)
    public List<String> prologue;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> status;
    public static ProtobufAdapter<ProfileExtensionMarriage> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileExtensionMarriage>() { // from class: com.p1.mobile.putong.data.ProfileExtensionMarriage.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileExtensionMarriage profileExtensionMarriage) {
            List<String> list = profileExtensionMarriage.declaration;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = profileExtensionMarriage.expectedTime;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = profileExtensionMarriage.status;
            if (list3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = profileExtensionMarriage.mateAge;
            if (list4 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = profileExtensionMarriage.mateQualification;
            if (list5 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = profileExtensionMarriage.mateAddress;
            if (list6 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(6, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list7 = profileExtensionMarriage.babyWilling;
            if (list7 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(7, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list8 = profileExtensionMarriage.bridePrice;
            if (list8 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(8, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list9 = profileExtensionMarriage.mateStatus;
            if (list9 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(9, list9, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list10 = profileExtensionMarriage.mateHeight;
            if (list10 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(10, list10, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list11 = profileExtensionMarriage.mateWeight;
            if (list11 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(11, list11, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list12 = profileExtensionMarriage.mateHometown;
            if (list12 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(12, list12, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list13 = profileExtensionMarriage.mateDescription;
            if (list13 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(13, list13, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list14 = profileExtensionMarriage.lifeMoment;
            if (list14 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(14, list14, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list15 = profileExtensionMarriage.mateIncome;
            if (list15 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(15, list15, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list16 = profileExtensionMarriage.prologue;
            if (list16 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(16, list16, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            profileExtensionMarriage.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileExtensionMarriage parse(nc5 nc5Var) throws IOException {
            ProfileExtensionMarriage profileExtensionMarriage = new ProfileExtensionMarriage();
            while (true) {
                switch (nc5Var.m162497u()) {
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
                        profileExtensionMarriage.declaration = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 18:
                        profileExtensionMarriage.expectedTime = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 26:
                        profileExtensionMarriage.status = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        profileExtensionMarriage.mateAge = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 42:
                        profileExtensionMarriage.mateQualification = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        profileExtensionMarriage.mateAddress = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        profileExtensionMarriage.babyWilling = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 66:
                        profileExtensionMarriage.bridePrice = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        profileExtensionMarriage.mateStatus = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        profileExtensionMarriage.mateHeight = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        profileExtensionMarriage.mateWeight = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        profileExtensionMarriage.mateHometown = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 106:
                        profileExtensionMarriage.mateDescription = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 114:
                        profileExtensionMarriage.lifeMoment = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 122:
                        profileExtensionMarriage.mateIncome = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 130:
                        profileExtensionMarriage.prologue = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileExtensionMarriage profileExtensionMarriage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = profileExtensionMarriage.declaration;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = profileExtensionMarriage.expectedTime;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = profileExtensionMarriage.status;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = profileExtensionMarriage.mateAge;
            if (list4 != null) {
                codedOutputByteBufferNano.m17309K(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = profileExtensionMarriage.mateQualification;
            if (list5 != null) {
                codedOutputByteBufferNano.m17309K(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = profileExtensionMarriage.mateAddress;
            if (list6 != null) {
                codedOutputByteBufferNano.m17309K(6, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list7 = profileExtensionMarriage.babyWilling;
            if (list7 != null) {
                codedOutputByteBufferNano.m17309K(7, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list8 = profileExtensionMarriage.bridePrice;
            if (list8 != null) {
                codedOutputByteBufferNano.m17309K(8, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list9 = profileExtensionMarriage.mateStatus;
            if (list9 != null) {
                codedOutputByteBufferNano.m17309K(9, list9, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list10 = profileExtensionMarriage.mateHeight;
            if (list10 != null) {
                codedOutputByteBufferNano.m17309K(10, list10, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list11 = profileExtensionMarriage.mateWeight;
            if (list11 != null) {
                codedOutputByteBufferNano.m17309K(11, list11, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list12 = profileExtensionMarriage.mateHometown;
            if (list12 != null) {
                codedOutputByteBufferNano.m17309K(12, list12, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list13 = profileExtensionMarriage.mateDescription;
            if (list13 != null) {
                codedOutputByteBufferNano.m17309K(13, list13, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list14 = profileExtensionMarriage.lifeMoment;
            if (list14 != null) {
                codedOutputByteBufferNano.m17309K(14, list14, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list15 = profileExtensionMarriage.mateIncome;
            if (list15 != null) {
                codedOutputByteBufferNano.m17309K(15, list15, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list16 = profileExtensionMarriage.prologue;
            if (list16 != null) {
                codedOutputByteBufferNano.m17309K(16, list16, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileExtensionMarriage> JSON_ADAPTER = new ObjectJsonAdapter<ProfileExtensionMarriage>() { // from class: com.p1.mobile.putong.data.ProfileExtensionMarriage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileExtensionMarriage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileExtensionMarriage newInstance() {
            return new ProfileExtensionMarriage();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(ProfileExtensionMarriage profileExtensionMarriage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2133360369:
                    if (str.equals("bridePrice")) {
                        b = 0;
                    }
                    break;
                case -2028505734:
                    if (str.equals("declaration")) {
                        b = 1;
                    }
                    break;
                case -1565627252:
                    if (str.equals("mateHeight")) {
                        b = 2;
                    }
                    break;
                case -1528857330:
                    if (str.equals("mateIncome")) {
                        b = 3;
                    }
                    break;
                case -1420890084:
                    if (str.equals("lifeMoment")) {
                        b = 4;
                    }
                    break;
                case -1367140630:
                    if (str.equals("mateQualification")) {
                        b = 5;
                    }
                    break;
                case -1237079209:
                    if (str.equals("mateStatus")) {
                        b = 6;
                    }
                    break;
                case -1136189987:
                    if (str.equals("mateWeight")) {
                        b = 7;
                    }
                    break;
                case -996548025:
                    if (str.equals("prologue")) {
                        b = 8;
                    }
                    break;
                case -931107306:
                    if (str.equals("mateHometown")) {
                        b = 9;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 10;
                    }
                    break;
                case -259391561:
                    if (str.equals("mateDescription")) {
                        b = 11;
                    }
                    break;
                case 164950437:
                    if (str.equals("expectedTime")) {
                        b = 12;
                    }
                    break;
                case 512791834:
                    if (str.equals("babyWilling")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 840884154:
                    if (str.equals("mateAge")) {
                        b = 14;
                    }
                    break;
                case 1054682415:
                    if (str.equals("mateAddress")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    profileExtensionMarriage.bridePrice = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    profileExtensionMarriage.declaration = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    profileExtensionMarriage.mateHeight = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    profileExtensionMarriage.mateIncome = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    profileExtensionMarriage.lifeMoment = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    profileExtensionMarriage.mateQualification = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    profileExtensionMarriage.mateStatus = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    profileExtensionMarriage.mateWeight = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    profileExtensionMarriage.prologue = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    profileExtensionMarriage.mateHometown = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    profileExtensionMarriage.status = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    profileExtensionMarriage.mateDescription = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    profileExtensionMarriage.expectedTime = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    profileExtensionMarriage.babyWilling = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    profileExtensionMarriage.mateAge = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    profileExtensionMarriage.mateAddress = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(ProfileExtensionMarriage profileExtensionMarriage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2133360369:
                    if (str.equals("bridePrice")) {
                        b = 0;
                    }
                    break;
                case -2028505734:
                    if (str.equals("declaration")) {
                        b = 1;
                    }
                    break;
                case -1565627252:
                    if (str.equals("mateHeight")) {
                        b = 2;
                    }
                    break;
                case -1528857330:
                    if (str.equals("mateIncome")) {
                        b = 3;
                    }
                    break;
                case -1420890084:
                    if (str.equals("lifeMoment")) {
                        b = 4;
                    }
                    break;
                case -1367140630:
                    if (str.equals("mateQualification")) {
                        b = 5;
                    }
                    break;
                case -1237079209:
                    if (str.equals("mateStatus")) {
                        b = 6;
                    }
                    break;
                case -1136189987:
                    if (str.equals("mateWeight")) {
                        b = 7;
                    }
                    break;
                case -996548025:
                    if (str.equals("prologue")) {
                        b = 8;
                    }
                    break;
                case -931107306:
                    if (str.equals("mateHometown")) {
                        b = 9;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 10;
                    }
                    break;
                case -259391561:
                    if (str.equals("mateDescription")) {
                        b = 11;
                    }
                    break;
                case 164950437:
                    if (str.equals("expectedTime")) {
                        b = 12;
                    }
                    break;
                case 512791834:
                    if (str.equals("babyWilling")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 840884154:
                    if (str.equals("mateAge")) {
                        b = 14;
                    }
                    break;
                case 1054682415:
                    if (str.equals("mateAddress")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                default:
                    return super.parseFieldCheck(profileExtensionMarriage, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileExtensionMarriage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileExtensionMarriage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61214a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m61215b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m61216c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m61217d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m61218e(String str) {
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m61219f(String str) {
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m61220k(String str) {
        return str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m61221l(String str) {
        return str;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m61222m(String str) {
        return str;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m61223n(String str) {
        return str;
    }

    public static ProfileExtensionMarriage new_() {
        ProfileExtensionMarriage profileExtensionMarriage = new ProfileExtensionMarriage();
        profileExtensionMarriage.nullCheck();
        return profileExtensionMarriage;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m61224o(String str) {
        return str;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m61225p(String str) {
        return str;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m61226q(String str) {
        return str;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m61227r(String str) {
        return str;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m61228s(String str) {
        return str;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m61229t(String str) {
        return str;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileExtensionMarriage mo225055clone() {
        ProfileExtensionMarriage profileExtensionMarriage = new ProfileExtensionMarriage();
        List<String> list = this.declaration;
        if (list != null) {
            profileExtensionMarriage.declaration = ValueObject.util_map(list, new qcj() { // from class: l.it90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61225p((String) obj);
                }
            });
        }
        List<String> list2 = this.expectedTime;
        if (list2 != null) {
            profileExtensionMarriage.expectedTime = ValueObject.util_map(list2, new qcj() { // from class: l.vt90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61223n((String) obj);
                }
            });
        }
        List<String> list3 = this.status;
        if (list3 != null) {
            profileExtensionMarriage.status = ValueObject.util_map(list3, new qcj() { // from class: l.wt90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61228s((String) obj);
                }
            });
        }
        List<String> list4 = this.babyWilling;
        if (list4 != null) {
            profileExtensionMarriage.babyWilling = ValueObject.util_map(list4, new qcj() { // from class: l.xt90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61221l((String) obj);
                }
            });
        }
        List<String> list5 = this.bridePrice;
        if (list5 != null) {
            profileExtensionMarriage.bridePrice = ValueObject.util_map(list5, new qcj() { // from class: l.jt90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61215b((String) obj);
                }
            });
        }
        List<String> list6 = this.mateAge;
        if (list6 != null) {
            profileExtensionMarriage.mateAge = ValueObject.util_map(list6, new qcj() { // from class: l.kt90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61227r((String) obj);
                }
            });
        }
        List<String> list7 = this.mateQualification;
        if (list7 != null) {
            profileExtensionMarriage.mateQualification = ValueObject.util_map(list7, new qcj() { // from class: l.lt90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61216c((String) obj);
                }
            });
        }
        List<String> list8 = this.mateAddress;
        if (list8 != null) {
            profileExtensionMarriage.mateAddress = ValueObject.util_map(list8, new qcj() { // from class: l.mt90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61220k((String) obj);
                }
            });
        }
        List<String> list9 = this.mateStatus;
        if (list9 != null) {
            profileExtensionMarriage.mateStatus = ValueObject.util_map(list9, new qcj() { // from class: l.nt90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61222m((String) obj);
                }
            });
        }
        List<String> list10 = this.mateHeight;
        if (list10 != null) {
            profileExtensionMarriage.mateHeight = ValueObject.util_map(list10, new qcj() { // from class: l.ot90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61214a((String) obj);
                }
            });
        }
        List<String> list11 = this.mateWeight;
        if (list11 != null) {
            profileExtensionMarriage.mateWeight = ValueObject.util_map(list11, new qcj() { // from class: l.pt90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61217d((String) obj);
                }
            });
        }
        List<String> list12 = this.mateHometown;
        if (list12 != null) {
            profileExtensionMarriage.mateHometown = ValueObject.util_map(list12, new qcj() { // from class: l.qt90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61224o((String) obj);
                }
            });
        }
        List<String> list13 = this.mateDescription;
        if (list13 != null) {
            profileExtensionMarriage.mateDescription = ValueObject.util_map(list13, new qcj() { // from class: l.rt90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61226q((String) obj);
                }
            });
        }
        List<String> list14 = this.lifeMoment;
        if (list14 != null) {
            profileExtensionMarriage.lifeMoment = ValueObject.util_map(list14, new qcj() { // from class: l.st90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61219f((String) obj);
                }
            });
        }
        List<String> list15 = this.mateIncome;
        if (list15 != null) {
            profileExtensionMarriage.mateIncome = ValueObject.util_map(list15, new qcj() { // from class: l.tt90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61229t((String) obj);
                }
            });
        }
        List<String> list16 = this.prologue;
        if (list16 != null) {
            profileExtensionMarriage.prologue = ValueObject.util_map(list16, new qcj() { // from class: l.ut90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileExtensionMarriage.m61218e((String) obj);
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
        this.hashCode = iHashCode16;
        return iHashCode16;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
