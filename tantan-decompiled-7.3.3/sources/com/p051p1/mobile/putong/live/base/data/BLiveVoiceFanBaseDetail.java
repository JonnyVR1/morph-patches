package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFanBaseRight;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFanBaseTask;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceFanBaseDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceFanBaseDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceFanBaseDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceFanBaseDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceFanBaseDetail newInstance() {
            return new BLiveVoiceFanBaseDetail();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1565881260:
                    if (str.equals("fontColor")) {
                        b = 0;
                    }
                    break;
                case -1405959847:
                    if (str.equals("avatar")) {
                        b = 1;
                    }
                    break;
                case -1351542332:
                    if (str.equals("rulePageUrl")) {
                        b = 2;
                    }
                    break;
                case -1349163075:
                    if (str.equals("curExp")) {
                        b = 3;
                    }
                    break;
                case -931102249:
                    if (str.equals("rights")) {
                        b = 4;
                    }
                    break;
                case -622508480:
                    if (str.equals("weekRank")) {
                        b = 5;
                    }
                    break;
                case -576286036:
                    if (str.equals("medalColor")) {
                        b = 6;
                    }
                    break;
                case -572513504:
                    if (str.equals("medalGrade")) {
                        b = 7;
                    }
                    break;
                case -511266546:
                    if (str.equals("fullExp")) {
                        b = 8;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 9;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = 10;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 11;
                    }
                    break;
                case 93653765:
                    if (str.equals("bgPic")) {
                        b = 12;
                    }
                    break;
                case 110132110:
                    if (str.equals("tasks")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1078154500:
                    if (str.equals("userAvatar")) {
                        b = 14;
                    }
                    break;
                case 1165862965:
                    if (str.equals("joinGiftId")) {
                        b = 15;
                    }
                    break;
                case 1195860863:
                    if (str.equals("viewType")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1278874475:
                    if (str.equals("accompanyNum")) {
                        b = 17;
                    }
                    break;
                case 1342204556:
                    if (str.equals("memberNum")) {
                        b = 18;
                    }
                    break;
                case 1596350968:
                    if (str.equals("rankRulePageUrl")) {
                        b = 19;
                    }
                    break;
                case 1921387042:
                    if (str.equals("medalName")) {
                        b = 20;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoiceFanBaseDetail.fontColor = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveVoiceFanBaseDetail.avatar = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveVoiceFanBaseDetail.rulePageUrl = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveVoiceFanBaseDetail.curExp = jsonParser.getValueAsLong();
                    return true;
                case 4:
                    bLiveVoiceFanBaseDetail.rights = JsonAdapter.parseArray(jsonParser, BLiveVoiceFanBaseRight.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveVoiceFanBaseDetail.weekRank = jsonParser.getValueAsInt();
                    return true;
                case 6:
                    bLiveVoiceFanBaseDetail.medalColor = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveVoiceFanBaseDetail.medalGrade = jsonParser.getValueAsInt();
                    return true;
                case 8:
                    bLiveVoiceFanBaseDetail.fullExp = jsonParser.getValueAsLong();
                    return true;
                case 9:
                    bLiveVoiceFanBaseDetail.userName = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveVoiceFanBaseDetail.icon = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveVoiceFanBaseDetail.name = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveVoiceFanBaseDetail.bgPic = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveVoiceFanBaseDetail.tasks = JsonAdapter.parseArray(jsonParser, BLiveVoiceFanBaseTask.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    bLiveVoiceFanBaseDetail.userAvatar = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveVoiceFanBaseDetail.joinGiftId = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveVoiceFanBaseDetail.viewType = jsonParser.getValueAsInt();
                    return true;
                case 17:
                    bLiveVoiceFanBaseDetail.accompanyNum = jsonParser.getValueAsInt();
                    return true;
                case 18:
                    bLiveVoiceFanBaseDetail.memberNum = jsonParser.getValueAsInt();
                    return true;
                case 19:
                    bLiveVoiceFanBaseDetail.rankRulePageUrl = jsonParser.getValueAsString();
                    return true;
                case 20:
                    bLiveVoiceFanBaseDetail.medalName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("viewType", bLiveVoiceFanBaseDetail.viewType);
            String str = bLiveVoiceFanBaseDetail.avatar;
            if (str != null) {
                jsonGenerator.writeStringField("avatar", str);
            }
            String str2 = bLiveVoiceFanBaseDetail.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            jsonGenerator.writeNumberField("memberNum", bLiveVoiceFanBaseDetail.memberNum);
            String str3 = bLiveVoiceFanBaseDetail.joinGiftId;
            if (str3 != null) {
                jsonGenerator.writeStringField("joinGiftId", str3);
            }
            jsonGenerator.writeNumberField("medalGrade", bLiveVoiceFanBaseDetail.medalGrade);
            String str4 = bLiveVoiceFanBaseDetail.medalColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("medalColor", str4);
            }
            String str5 = bLiveVoiceFanBaseDetail.medalName;
            if (str5 != null) {
                jsonGenerator.writeStringField("medalName", str5);
            }
            String str6 = bLiveVoiceFanBaseDetail.icon;
            if (str6 != null) {
                jsonGenerator.writeStringField("icon", str6);
            }
            jsonGenerator.writeNumberField("accompanyNum", bLiveVoiceFanBaseDetail.accompanyNum);
            jsonGenerator.writeNumberField("weekRank", bLiveVoiceFanBaseDetail.weekRank);
            String str7 = bLiveVoiceFanBaseDetail.userAvatar;
            if (str7 != null) {
                jsonGenerator.writeStringField("userAvatar", str7);
            }
            String str8 = bLiveVoiceFanBaseDetail.userName;
            if (str8 != null) {
                jsonGenerator.writeStringField("userName", str8);
            }
            jsonGenerator.writeNumberField("curExp", bLiveVoiceFanBaseDetail.curExp);
            jsonGenerator.writeNumberField("fullExp", bLiveVoiceFanBaseDetail.fullExp);
            String str9 = bLiveVoiceFanBaseDetail.rulePageUrl;
            if (str9 != null) {
                jsonGenerator.writeStringField("rulePageUrl", str9);
            }
            String str10 = bLiveVoiceFanBaseDetail.rankRulePageUrl;
            if (str10 != null) {
                jsonGenerator.writeStringField("rankRulePageUrl", str10);
            }
            if (bLiveVoiceFanBaseDetail.tasks != null) {
                jsonGenerator.writeFieldName("tasks");
                JsonAdapter.serializeArray(bLiveVoiceFanBaseDetail.tasks, jsonGenerator, BLiveVoiceFanBaseTask.JSON_ADAPTER);
            }
            if (bLiveVoiceFanBaseDetail.rights != null) {
                jsonGenerator.writeFieldName("rights");
                JsonAdapter.serializeArray(bLiveVoiceFanBaseDetail.rights, jsonGenerator, BLiveVoiceFanBaseRight.JSON_ADAPTER);
            }
            String str11 = bLiveVoiceFanBaseDetail.fontColor;
            if (str11 != null) {
                jsonGenerator.writeStringField("fontColor", str11);
            }
            String str12 = bLiveVoiceFanBaseDetail.bgPic;
            if (str12 != null) {
                jsonGenerator.writeStringField("bgPic", str12);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceFanBaseDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicefanbasedetail";

    @ProtobufIndex(index = 10)
    public int accompanyNum;

    @NonNull
    @ProtobufIndex(index = 2)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 21)
    public String bgPic;

    @ProtobufIndex(index = 14)
    public long curExp;

    @NonNull
    @ProtobufIndex(index = 20)
    public String fontColor;

    @ProtobufIndex(index = 15)
    public long fullExp;

    @NonNull
    @ProtobufIndex(index = 9)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 5)
    public String joinGiftId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String medalColor;

    @ProtobufIndex(index = 6)
    public int medalGrade;

    @NonNull
    @ProtobufIndex(index = 8)
    public String medalName;

    @ProtobufIndex(index = 4)
    public int memberNum;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @NonNull
    @ProtobufIndex(index = 17)
    public String rankRulePageUrl;

    @NonNull
    @ProtobufIndex(index = 19)
    public List<BLiveVoiceFanBaseRight> rights;

    @NonNull
    @ProtobufIndex(index = 16)
    public String rulePageUrl;

    @NonNull
    @ProtobufIndex(index = 18)
    public List<BLiveVoiceFanBaseTask> tasks;

    @NonNull
    @ProtobufIndex(index = 12)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 13)
    public String userName;

    @ProtobufIndex(index = 1)
    public int viewType;

    @ProtobufIndex(index = 11)
    public int weekRank;

    public static BLiveVoiceFanBaseDetail new_() {
        BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail = new BLiveVoiceFanBaseDetail();
        bLiveVoiceFanBaseDetail.nullCheck();
        return bLiveVoiceFanBaseDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceFanBaseDetail mo225055clone() {
        BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail = new BLiveVoiceFanBaseDetail();
        bLiveVoiceFanBaseDetail.viewType = this.viewType;
        bLiveVoiceFanBaseDetail.avatar = this.avatar;
        bLiveVoiceFanBaseDetail.name = this.name;
        bLiveVoiceFanBaseDetail.memberNum = this.memberNum;
        bLiveVoiceFanBaseDetail.joinGiftId = this.joinGiftId;
        bLiveVoiceFanBaseDetail.medalGrade = this.medalGrade;
        bLiveVoiceFanBaseDetail.medalColor = this.medalColor;
        bLiveVoiceFanBaseDetail.medalName = this.medalName;
        bLiveVoiceFanBaseDetail.icon = this.icon;
        bLiveVoiceFanBaseDetail.accompanyNum = this.accompanyNum;
        bLiveVoiceFanBaseDetail.weekRank = this.weekRank;
        bLiveVoiceFanBaseDetail.userAvatar = this.userAvatar;
        bLiveVoiceFanBaseDetail.userName = this.userName;
        bLiveVoiceFanBaseDetail.curExp = this.curExp;
        bLiveVoiceFanBaseDetail.fullExp = this.fullExp;
        bLiveVoiceFanBaseDetail.rulePageUrl = this.rulePageUrl;
        bLiveVoiceFanBaseDetail.rankRulePageUrl = this.rankRulePageUrl;
        List<BLiveVoiceFanBaseTask> list = this.tasks;
        if (list != null) {
            bLiveVoiceFanBaseDetail.tasks = ValueObject.util_map(list, new qcj() { // from class: l.w82
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceFanBaseTask) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceFanBaseRight> list2 = this.rights;
        if (list2 != null) {
            bLiveVoiceFanBaseDetail.rights = ValueObject.util_map(list2, new qcj() { // from class: l.x82
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceFanBaseRight) obj).mo225055clone();
                }
            });
        }
        bLiveVoiceFanBaseDetail.fontColor = this.fontColor;
        bLiveVoiceFanBaseDetail.bgPic = this.bgPic;
        return bLiveVoiceFanBaseDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceFanBaseDetail)) {
            return false;
        }
        BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail = (BLiveVoiceFanBaseDetail) obj;
        return this.viewType == bLiveVoiceFanBaseDetail.viewType && ValueObject.util_equals(this.avatar, bLiveVoiceFanBaseDetail.avatar) && ValueObject.util_equals(this.name, bLiveVoiceFanBaseDetail.name) && this.memberNum == bLiveVoiceFanBaseDetail.memberNum && ValueObject.util_equals(this.joinGiftId, bLiveVoiceFanBaseDetail.joinGiftId) && this.medalGrade == bLiveVoiceFanBaseDetail.medalGrade && ValueObject.util_equals(this.medalColor, bLiveVoiceFanBaseDetail.medalColor) && ValueObject.util_equals(this.medalName, bLiveVoiceFanBaseDetail.medalName) && ValueObject.util_equals(this.icon, bLiveVoiceFanBaseDetail.icon) && this.accompanyNum == bLiveVoiceFanBaseDetail.accompanyNum && this.weekRank == bLiveVoiceFanBaseDetail.weekRank && ValueObject.util_equals(this.userAvatar, bLiveVoiceFanBaseDetail.userAvatar) && ValueObject.util_equals(this.userName, bLiveVoiceFanBaseDetail.userName) && this.curExp == bLiveVoiceFanBaseDetail.curExp && this.fullExp == bLiveVoiceFanBaseDetail.fullExp && ValueObject.util_equals(this.rulePageUrl, bLiveVoiceFanBaseDetail.rulePageUrl) && ValueObject.util_equals(this.rankRulePageUrl, bLiveVoiceFanBaseDetail.rankRulePageUrl) && ValueObject.util_equals(this.tasks, bLiveVoiceFanBaseDetail.tasks) && ValueObject.util_equals(this.rights, bLiveVoiceFanBaseDetail.rights) && ValueObject.util_equals(this.fontColor, bLiveVoiceFanBaseDetail.fontColor) && ValueObject.util_equals(this.bgPic, bLiveVoiceFanBaseDetail.bgPic);
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
        int i2 = ((i * 41) + this.viewType) * 41;
        String str = this.avatar;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.memberNum) * 41;
        String str3 = this.joinGiftId;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.medalGrade) * 41;
        String str4 = this.medalColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.medalName;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.icon;
        int iHashCode6 = (((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.accompanyNum) * 41) + this.weekRank) * 41;
        String str7 = this.userAvatar;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.userName;
        int iHashCode8 = str8 != null ? str8.hashCode() : 0;
        long j = this.curExp;
        int i3 = (((iHashCode7 + iHashCode8) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.fullExp;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str9 = this.rulePageUrl;
        int iHashCode9 = (i4 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.rankRulePageUrl;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        List<BLiveVoiceFanBaseTask> list = this.tasks;
        int iHashCode11 = (iHashCode10 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveVoiceFanBaseRight> list2 = this.rights;
        int iHashCode12 = (iHashCode11 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str11 = this.fontColor;
        int iHashCode13 = (iHashCode12 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.bgPic;
        int iHashCode14 = iHashCode13 + (str12 != null ? str12.hashCode() : 0);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.joinGiftId == null) {
            this.joinGiftId = "";
        }
        if (this.medalColor == null) {
            this.medalColor = "";
        }
        if (this.medalName == null) {
            this.medalName = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.rulePageUrl == null) {
            this.rulePageUrl = "";
        }
        if (this.rankRulePageUrl == null) {
            this.rankRulePageUrl = "";
        }
        if (this.tasks == null) {
            this.tasks = new ArrayList();
        }
        if (this.rights == null) {
            this.rights = new ArrayList();
        }
        if (this.fontColor == null) {
            this.fontColor = "";
        }
        if (this.bgPic == null) {
            this.bgPic = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
