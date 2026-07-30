package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceMemberLb extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivevoicememberlb";

    @NonNull
    @ProtobufIndex(index = 9)
    public String gender;

    @ProtobufIndex(index = 5)
    public int hierarchyGrade;

    @NonNull
    @ProtobufIndex(index = 7)
    public String medalColor;

    @ProtobufIndex(index = 6)
    public int medalGrade;

    @NonNull
    @ProtobufIndex(index = 8)
    public String medalName;

    @ProtobufIndex(index = 1)
    public int rank;

    @ProtobufIndex(index = 10)
    public long score;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userName;
    public static ProtobufAdapter<BLiveVoiceMemberLb> PROTOBUF_ADAPTER = new C12501a();
    public static JsonAdapter<BLiveVoiceMemberLb> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceMemberLb>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceMemberLb.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceMemberLb.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceMemberLb newInstance() {
            return new BLiveVoiceMemberLb();
        }

        public boolean parseField(BLiveVoiceMemberLb bLiveVoiceMemberLb, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gender":
                    bLiveVoiceMemberLb.gender = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVoiceMemberLb.userId = jsonParser.getValueAsString();
                    return true;
                case "medalColor":
                    bLiveVoiceMemberLb.medalColor = jsonParser.getValueAsString();
                    return true;
                case "medalGrade":
                    bLiveVoiceMemberLb.medalGrade = jsonParser.getValueAsInt();
                    return true;
                case "userName":
                    bLiveVoiceMemberLb.userName = jsonParser.getValueAsString();
                    return true;
                case "hierarchyGrade":
                    bLiveVoiceMemberLb.hierarchyGrade = jsonParser.getValueAsInt();
                    return true;
                case "rank":
                    bLiveVoiceMemberLb.rank = jsonParser.getValueAsInt();
                    return true;
                case "score":
                    bLiveVoiceMemberLb.score = jsonParser.getValueAsLong();
                    return true;
                case "userAvatar":
                    bLiveVoiceMemberLb.userAvatar = jsonParser.getValueAsString();
                    return true;
                case "medalName":
                    bLiveVoiceMemberLb.medalName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceMemberLb bLiveVoiceMemberLb, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveVoiceMemberLb.rank);
            String str = bLiveVoiceMemberLb.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveVoiceMemberLb.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveVoiceMemberLb.userAvatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("userAvatar", str3);
            }
            jsonGenerator.writeNumberField("hierarchyGrade", bLiveVoiceMemberLb.hierarchyGrade);
            jsonGenerator.writeNumberField("medalGrade", bLiveVoiceMemberLb.medalGrade);
            String str4 = bLiveVoiceMemberLb.medalColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("medalColor", str4);
            }
            String str5 = bLiveVoiceMemberLb.medalName;
            if (str5 != null) {
                jsonGenerator.writeStringField("medalName", str5);
            }
            String str6 = bLiveVoiceMemberLb.gender;
            if (str6 != null) {
                jsonGenerator.writeStringField("gender", str6);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, bLiveVoiceMemberLb.score);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceMemberLb) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceMemberLb$a */
    public class C12501a extends MessageNanoAdapter<BLiveVoiceMemberLb> {
        public C12501a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveVoiceMemberLb bLiveVoiceMemberLb) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, bLiveVoiceMemberLb.rank);
            String str = bLiveVoiceMemberLb.userId;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = bLiveVoiceMemberLb.userName;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = bLiveVoiceMemberLb.userAvatar;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(5, bLiveVoiceMemberLb.hierarchyGrade) + CodedOutputByteBufferNano.m17281h(6, bLiveVoiceMemberLb.medalGrade);
            String str4 = bLiveVoiceMemberLb.medalColor;
            if (str4 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(7, str4);
            }
            String str5 = bLiveVoiceMemberLb.medalName;
            if (str5 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(8, str5);
            }
            String str6 = bLiveVoiceMemberLb.gender;
            if (str6 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(9, str6);
            }
            int iM17283j = iM17281h2 + CodedOutputByteBufferNano.m17283j(10, bLiveVoiceMemberLb.score);
            bLiveVoiceMemberLb.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceMemberLb parse(nc5 nc5Var) throws IOException {
            BLiveVoiceMemberLb bLiveVoiceMemberLb = new BLiveVoiceMemberLb();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (bLiveVoiceMemberLb.userId == null) {
                            bLiveVoiceMemberLb.userId = "";
                        }
                        if (bLiveVoiceMemberLb.userName == null) {
                            bLiveVoiceMemberLb.userName = "";
                        }
                        if (bLiveVoiceMemberLb.userAvatar == null) {
                            bLiveVoiceMemberLb.userAvatar = "";
                        }
                        if (bLiveVoiceMemberLb.medalColor == null) {
                            bLiveVoiceMemberLb.medalColor = "";
                        }
                        if (bLiveVoiceMemberLb.medalName == null) {
                            bLiveVoiceMemberLb.medalName = "";
                        }
                        if (bLiveVoiceMemberLb.gender == null) {
                            bLiveVoiceMemberLb.gender = "";
                        }
                        break;
                    case 8:
                        bLiveVoiceMemberLb.rank = nc5Var.m162486j();
                        continue;
                    case 18:
                        bLiveVoiceMemberLb.userId = nc5Var.m162495s();
                        continue;
                    case 26:
                        bLiveVoiceMemberLb.userName = nc5Var.m162495s();
                        continue;
                    case 34:
                        bLiveVoiceMemberLb.userAvatar = nc5Var.m162495s();
                        continue;
                    case 40:
                        bLiveVoiceMemberLb.hierarchyGrade = nc5Var.m162486j();
                        continue;
                    case 48:
                        bLiveVoiceMemberLb.medalGrade = nc5Var.m162486j();
                        continue;
                    case 58:
                        bLiveVoiceMemberLb.medalColor = nc5Var.m162495s();
                        continue;
                    case 66:
                        bLiveVoiceMemberLb.medalName = nc5Var.m162495s();
                        continue;
                    case 74:
                        bLiveVoiceMemberLb.gender = nc5Var.m162495s();
                        continue;
                    case 80:
                        bLiveVoiceMemberLb.score = nc5Var.m162487k();
                        continue;
                    default:
                        if (bLiveVoiceMemberLb.userId == null) {
                            bLiveVoiceMemberLb.userId = "";
                        }
                        if (bLiveVoiceMemberLb.userName == null) {
                            bLiveVoiceMemberLb.userName = "";
                        }
                        if (bLiveVoiceMemberLb.userAvatar == null) {
                            bLiveVoiceMemberLb.userAvatar = "";
                        }
                        if (bLiveVoiceMemberLb.medalColor == null) {
                            bLiveVoiceMemberLb.medalColor = "";
                        }
                        if (bLiveVoiceMemberLb.medalName == null) {
                            bLiveVoiceMemberLb.medalName = "";
                        }
                        if (bLiveVoiceMemberLb.gender == null) {
                            bLiveVoiceMemberLb.gender = "";
                            return bLiveVoiceMemberLb;
                        }
                        break;
                }
            }
            return bLiveVoiceMemberLb;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveVoiceMemberLb bLiveVoiceMemberLb, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, bLiveVoiceMemberLb.rank);
            String str = bLiveVoiceMemberLb.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = bLiveVoiceMemberLb.userName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = bLiveVoiceMemberLb.userAvatar;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            codedOutputByteBufferNano.m17305G(5, bLiveVoiceMemberLb.hierarchyGrade);
            codedOutputByteBufferNano.m17305G(6, bLiveVoiceMemberLb.medalGrade);
            String str4 = bLiveVoiceMemberLb.medalColor;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(7, str4);
            }
            String str5 = bLiveVoiceMemberLb.medalName;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(8, str5);
            }
            String str6 = bLiveVoiceMemberLb.gender;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(9, str6);
            }
            codedOutputByteBufferNano.m17307I(10, bLiveVoiceMemberLb.score);
        }
    }

    public static BLiveVoiceMemberLb new_() {
        BLiveVoiceMemberLb bLiveVoiceMemberLb = new BLiveVoiceMemberLb();
        bLiveVoiceMemberLb.nullCheck();
        return bLiveVoiceMemberLb;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceMemberLb mo225055clone() {
        BLiveVoiceMemberLb bLiveVoiceMemberLb = new BLiveVoiceMemberLb();
        bLiveVoiceMemberLb.rank = this.rank;
        bLiveVoiceMemberLb.userId = this.userId;
        bLiveVoiceMemberLb.userName = this.userName;
        bLiveVoiceMemberLb.userAvatar = this.userAvatar;
        bLiveVoiceMemberLb.hierarchyGrade = this.hierarchyGrade;
        bLiveVoiceMemberLb.medalGrade = this.medalGrade;
        bLiveVoiceMemberLb.medalColor = this.medalColor;
        bLiveVoiceMemberLb.medalName = this.medalName;
        bLiveVoiceMemberLb.gender = this.gender;
        bLiveVoiceMemberLb.score = this.score;
        return bLiveVoiceMemberLb;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceMemberLb)) {
            return false;
        }
        BLiveVoiceMemberLb bLiveVoiceMemberLb = (BLiveVoiceMemberLb) obj;
        return this.rank == bLiveVoiceMemberLb.rank && ValueObject.util_equals(this.userId, bLiveVoiceMemberLb.userId) && ValueObject.util_equals(this.userName, bLiveVoiceMemberLb.userName) && ValueObject.util_equals(this.userAvatar, bLiveVoiceMemberLb.userAvatar) && this.hierarchyGrade == bLiveVoiceMemberLb.hierarchyGrade && this.medalGrade == bLiveVoiceMemberLb.medalGrade && ValueObject.util_equals(this.medalColor, bLiveVoiceMemberLb.medalColor) && ValueObject.util_equals(this.medalName, bLiveVoiceMemberLb.medalName) && ValueObject.util_equals(this.gender, bLiveVoiceMemberLb.gender) && this.score == bLiveVoiceMemberLb.score;
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
        int i2 = ((i * 41) + this.rank) * 41;
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userAvatar;
        int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.hierarchyGrade) * 41) + this.medalGrade) * 41;
        String str4 = this.medalColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.medalName;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.gender;
        int iHashCode6 = str6 != null ? str6.hashCode() : 0;
        long j = this.score;
        int i3 = ((iHashCode5 + iHashCode6) * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
        if (this.medalColor == null) {
            this.medalColor = "";
        }
        if (this.medalName == null) {
            this.medalName = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
