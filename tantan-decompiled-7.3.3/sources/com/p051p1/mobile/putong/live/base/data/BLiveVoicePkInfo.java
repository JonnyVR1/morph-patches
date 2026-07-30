package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePkPoint;
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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoicePkInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivevoicepkinfo";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 10)
    public long endMill;

    @NonNull
    @ProtobufIndex(index = 13)
    public String leftBigUrl;

    @NonNull
    @ProtobufIndex(index = 7)
    public String leftUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String leftUserAvatar;

    @NonNull
    @ProtobufIndex(index = 4)
    public String leftUserId;

    @NonNull
    @ProtobufIndex(index = 11)
    public String mvpBg;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<BLiveVoicePkPoint> onCallPoints;

    @NonNull
    @ProtobufIndex(index = 2)
    public String pkId;

    @NonNull
    @ProtobufIndex(index = 14)
    public String rightBigUrl;

    @NonNull
    @ProtobufIndex(index = 8)
    public String rightUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public String rightUserAvatar;

    @NonNull
    @ProtobufIndex(index = 6)
    public String rightUserId;

    @NonNull
    @ProtobufIndex(index = 9)
    public String schema;
    public static ProtobufAdapter<BLiveVoicePkInfo> PROTOBUF_ADAPTER = new C12509a();
    public static JsonAdapter<BLiveVoicePkInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoicePkInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoicePkInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoicePkInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoicePkInfo newInstance() {
            return new BLiveVoicePkInfo();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoicePkInfo bLiveVoicePkInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2120853203:
                    if (str.equals("leftUserId")) {
                        b = 0;
                    }
                    break;
                case -1607451753:
                    if (str.equals("endMill")) {
                        b = 1;
                    }
                    break;
                case -1564429205:
                    if (str.equals("leftUserAvatar")) {
                        b = 2;
                    }
                    break;
                case -1436088909:
                    if (str.equals("rightUrl")) {
                        b = 3;
                    }
                    break;
                case -1298848381:
                    if (str.equals("enable")) {
                        b = 4;
                    }
                    break;
                case -907987551:
                    if (str.equals("schema")) {
                        b = 5;
                    }
                    break;
                case -907781749:
                    if (str.equals("rightBigUrl")) {
                        b = 6;
                    }
                    break;
                case -354625662:
                    if (str.equals("rightUserId")) {
                        b = 7;
                    }
                    break;
                case -314179520:
                    if (str.equals("rightUserAvatar")) {
                        b = 8;
                    }
                    break;
                case 3441782:
                    if (str.equals("pkId")) {
                        b = 9;
                    }
                    break;
                case 55434216:
                    if (str.equals("leftUrl")) {
                        b = 10;
                    }
                    break;
                case 104288908:
                    if (str.equals("mvpBg")) {
                        b = 11;
                    }
                    break;
                case 543384608:
                    if (str.equals("onCallPoints")) {
                        b = 12;
                    }
                    break;
                case 1620958006:
                    if (str.equals("leftBigUrl")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoicePkInfo.leftUserId = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveVoicePkInfo.endMill = jsonParser.getValueAsLong();
                    return true;
                case 2:
                    bLiveVoicePkInfo.leftUserAvatar = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveVoicePkInfo.rightUrl = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveVoicePkInfo.enable = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    bLiveVoicePkInfo.schema = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveVoicePkInfo.rightBigUrl = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveVoicePkInfo.rightUserId = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveVoicePkInfo.rightUserAvatar = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveVoicePkInfo.pkId = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveVoicePkInfo.leftUrl = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveVoicePkInfo.mvpBg = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveVoicePkInfo.onCallPoints = JsonAdapter.parseArray(jsonParser, BLiveVoicePkPoint.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    bLiveVoicePkInfo.leftBigUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoicePkInfo bLiveVoicePkInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", bLiveVoicePkInfo.enable);
            String str = bLiveVoicePkInfo.pkId;
            if (str != null) {
                jsonGenerator.writeStringField("pkId", str);
            }
            String str2 = bLiveVoicePkInfo.leftUserAvatar;
            if (str2 != null) {
                jsonGenerator.writeStringField("leftUserAvatar", str2);
            }
            String str3 = bLiveVoicePkInfo.leftUserId;
            if (str3 != null) {
                jsonGenerator.writeStringField("leftUserId", str3);
            }
            String str4 = bLiveVoicePkInfo.rightUserAvatar;
            if (str4 != null) {
                jsonGenerator.writeStringField("rightUserAvatar", str4);
            }
            String str5 = bLiveVoicePkInfo.rightUserId;
            if (str5 != null) {
                jsonGenerator.writeStringField("rightUserId", str5);
            }
            String str6 = bLiveVoicePkInfo.leftUrl;
            if (str6 != null) {
                jsonGenerator.writeStringField("leftUrl", str6);
            }
            String str7 = bLiveVoicePkInfo.leftBigUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("leftBigUrl", str7);
            }
            String str8 = bLiveVoicePkInfo.rightUrl;
            if (str8 != null) {
                jsonGenerator.writeStringField("rightUrl", str8);
            }
            String str9 = bLiveVoicePkInfo.rightBigUrl;
            if (str9 != null) {
                jsonGenerator.writeStringField("rightBigUrl", str9);
            }
            String str10 = bLiveVoicePkInfo.schema;
            if (str10 != null) {
                jsonGenerator.writeStringField("schema", str10);
            }
            jsonGenerator.writeNumberField("endMill", bLiveVoicePkInfo.endMill);
            String str11 = bLiveVoicePkInfo.mvpBg;
            if (str11 != null) {
                jsonGenerator.writeStringField("mvpBg", str11);
            }
            if (bLiveVoicePkInfo.onCallPoints != null) {
                jsonGenerator.writeFieldName("onCallPoints");
                JsonAdapter.serializeArray(bLiveVoicePkInfo.onCallPoints, jsonGenerator, BLiveVoicePkPoint.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoicePkInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoicePkInfo$a */
    public class C12509a extends MessageNanoAdapter<BLiveVoicePkInfo> {
        public C12509a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveVoicePkInfo bLiveVoicePkInfo) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, bLiveVoicePkInfo.enable);
            String str = bLiveVoicePkInfo.pkId;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = bLiveVoicePkInfo.leftUserAvatar;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = bLiveVoicePkInfo.leftUserId;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = bLiveVoicePkInfo.rightUserAvatar;
            if (str4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            String str5 = bLiveVoicePkInfo.rightUserId;
            if (str5 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(6, str5);
            }
            String str6 = bLiveVoicePkInfo.leftUrl;
            if (str6 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(7, str6);
            }
            String str7 = bLiveVoicePkInfo.rightUrl;
            if (str7 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(8, str7);
            }
            String str8 = bLiveVoicePkInfo.schema;
            if (str8 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(9, str8);
            }
            int iM17283j = iM17275b + CodedOutputByteBufferNano.m17283j(10, bLiveVoicePkInfo.endMill);
            String str9 = bLiveVoicePkInfo.mvpBg;
            if (str9 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(11, str9);
            }
            List<BLiveVoicePkPoint> list = bLiveVoicePkInfo.onCallPoints;
            if (list != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(12, list, BLiveVoicePkPoint.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str10 = bLiveVoicePkInfo.leftBigUrl;
            if (str10 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(13, str10);
            }
            String str11 = bLiveVoicePkInfo.rightBigUrl;
            if (str11 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(14, str11);
            }
            bLiveVoicePkInfo.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveVoicePkInfo parse(nc5 nc5Var) throws IOException {
            BLiveVoicePkInfo bLiveVoicePkInfo = new BLiveVoicePkInfo();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (bLiveVoicePkInfo.pkId == null) {
                            bLiveVoicePkInfo.pkId = "";
                        }
                        if (bLiveVoicePkInfo.leftUserAvatar == null) {
                            bLiveVoicePkInfo.leftUserAvatar = "";
                        }
                        if (bLiveVoicePkInfo.leftUserId == null) {
                            bLiveVoicePkInfo.leftUserId = "";
                        }
                        if (bLiveVoicePkInfo.rightUserAvatar == null) {
                            bLiveVoicePkInfo.rightUserAvatar = "";
                        }
                        if (bLiveVoicePkInfo.rightUserId == null) {
                            bLiveVoicePkInfo.rightUserId = "";
                        }
                        if (bLiveVoicePkInfo.leftUrl == null) {
                            bLiveVoicePkInfo.leftUrl = "";
                        }
                        if (bLiveVoicePkInfo.leftBigUrl == null) {
                            bLiveVoicePkInfo.leftBigUrl = "";
                        }
                        if (bLiveVoicePkInfo.rightUrl == null) {
                            bLiveVoicePkInfo.rightUrl = "";
                        }
                        if (bLiveVoicePkInfo.rightBigUrl == null) {
                            bLiveVoicePkInfo.rightBigUrl = "";
                        }
                        if (bLiveVoicePkInfo.schema == null) {
                            bLiveVoicePkInfo.schema = "";
                        }
                        if (bLiveVoicePkInfo.mvpBg == null) {
                            bLiveVoicePkInfo.mvpBg = "";
                        }
                        if (bLiveVoicePkInfo.onCallPoints == null) {
                            bLiveVoicePkInfo.onCallPoints = new ArrayList();
                        }
                        break;
                    case 8:
                        bLiveVoicePkInfo.enable = nc5Var.m162483g();
                        continue;
                    case 18:
                        bLiveVoicePkInfo.pkId = nc5Var.m162495s();
                        continue;
                    case 26:
                        bLiveVoicePkInfo.leftUserAvatar = nc5Var.m162495s();
                        continue;
                    case 34:
                        bLiveVoicePkInfo.leftUserId = nc5Var.m162495s();
                        continue;
                    case 42:
                        bLiveVoicePkInfo.rightUserAvatar = nc5Var.m162495s();
                        continue;
                    case 50:
                        bLiveVoicePkInfo.rightUserId = nc5Var.m162495s();
                        continue;
                    case 58:
                        bLiveVoicePkInfo.leftUrl = nc5Var.m162495s();
                        continue;
                    case 66:
                        bLiveVoicePkInfo.rightUrl = nc5Var.m162495s();
                        continue;
                    case 74:
                        bLiveVoicePkInfo.schema = nc5Var.m162495s();
                        continue;
                    case 80:
                        bLiveVoicePkInfo.endMill = nc5Var.m162487k();
                        continue;
                    case 90:
                        bLiveVoicePkInfo.mvpBg = nc5Var.m162495s();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        bLiveVoicePkInfo.onCallPoints = (List) nc5Var.m162488l(BLiveVoicePkPoint.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 106:
                        bLiveVoicePkInfo.leftBigUrl = nc5Var.m162495s();
                        continue;
                    case 114:
                        bLiveVoicePkInfo.rightBigUrl = nc5Var.m162495s();
                        continue;
                    default:
                        if (bLiveVoicePkInfo.pkId == null) {
                            bLiveVoicePkInfo.pkId = "";
                        }
                        if (bLiveVoicePkInfo.leftUserAvatar == null) {
                            bLiveVoicePkInfo.leftUserAvatar = "";
                        }
                        if (bLiveVoicePkInfo.leftUserId == null) {
                            bLiveVoicePkInfo.leftUserId = "";
                        }
                        if (bLiveVoicePkInfo.rightUserAvatar == null) {
                            bLiveVoicePkInfo.rightUserAvatar = "";
                        }
                        if (bLiveVoicePkInfo.rightUserId == null) {
                            bLiveVoicePkInfo.rightUserId = "";
                        }
                        if (bLiveVoicePkInfo.leftUrl == null) {
                            bLiveVoicePkInfo.leftUrl = "";
                        }
                        if (bLiveVoicePkInfo.leftBigUrl == null) {
                            bLiveVoicePkInfo.leftBigUrl = "";
                        }
                        if (bLiveVoicePkInfo.rightUrl == null) {
                            bLiveVoicePkInfo.rightUrl = "";
                        }
                        if (bLiveVoicePkInfo.rightBigUrl == null) {
                            bLiveVoicePkInfo.rightBigUrl = "";
                        }
                        if (bLiveVoicePkInfo.schema == null) {
                            bLiveVoicePkInfo.schema = "";
                        }
                        if (bLiveVoicePkInfo.mvpBg == null) {
                            bLiveVoicePkInfo.mvpBg = "";
                        }
                        if (bLiveVoicePkInfo.onCallPoints == null) {
                            bLiveVoicePkInfo.onCallPoints = new ArrayList();
                            return bLiveVoicePkInfo;
                        }
                        break;
                }
            }
            return bLiveVoicePkInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveVoicePkInfo bLiveVoicePkInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, bLiveVoicePkInfo.enable);
            String str = bLiveVoicePkInfo.pkId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = bLiveVoicePkInfo.leftUserAvatar;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = bLiveVoicePkInfo.leftUserId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = bLiveVoicePkInfo.rightUserAvatar;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            String str5 = bLiveVoicePkInfo.rightUserId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(6, str5);
            }
            String str6 = bLiveVoicePkInfo.leftUrl;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(7, str6);
            }
            String str7 = bLiveVoicePkInfo.rightUrl;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(8, str7);
            }
            String str8 = bLiveVoicePkInfo.schema;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(9, str8);
            }
            codedOutputByteBufferNano.m17307I(10, bLiveVoicePkInfo.endMill);
            String str9 = bLiveVoicePkInfo.mvpBg;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(11, str9);
            }
            List<BLiveVoicePkPoint> list = bLiveVoicePkInfo.onCallPoints;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(12, list, BLiveVoicePkPoint.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str10 = bLiveVoicePkInfo.leftBigUrl;
            if (str10 != null) {
                codedOutputByteBufferNano.m17316R(13, str10);
            }
            String str11 = bLiveVoicePkInfo.rightBigUrl;
            if (str11 != null) {
                codedOutputByteBufferNano.m17316R(14, str11);
            }
        }
    }

    public static BLiveVoicePkInfo new_() {
        BLiveVoicePkInfo bLiveVoicePkInfo = new BLiveVoicePkInfo();
        bLiveVoicePkInfo.nullCheck();
        return bLiveVoicePkInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoicePkInfo mo225055clone() {
        BLiveVoicePkInfo bLiveVoicePkInfo = new BLiveVoicePkInfo();
        bLiveVoicePkInfo.enable = this.enable;
        bLiveVoicePkInfo.pkId = this.pkId;
        bLiveVoicePkInfo.leftUserAvatar = this.leftUserAvatar;
        bLiveVoicePkInfo.leftUserId = this.leftUserId;
        bLiveVoicePkInfo.rightUserAvatar = this.rightUserAvatar;
        bLiveVoicePkInfo.rightUserId = this.rightUserId;
        bLiveVoicePkInfo.leftUrl = this.leftUrl;
        bLiveVoicePkInfo.leftBigUrl = this.leftBigUrl;
        bLiveVoicePkInfo.rightUrl = this.rightUrl;
        bLiveVoicePkInfo.rightBigUrl = this.rightBigUrl;
        bLiveVoicePkInfo.schema = this.schema;
        bLiveVoicePkInfo.endMill = this.endMill;
        bLiveVoicePkInfo.mvpBg = this.mvpBg;
        List<BLiveVoicePkPoint> list = this.onCallPoints;
        if (list != null) {
            bLiveVoicePkInfo.onCallPoints = ValueObject.util_map(list, new qcj() { // from class: l.n92
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoicePkPoint) obj).mo225055clone();
                }
            });
        }
        return bLiveVoicePkInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoicePkInfo)) {
            return false;
        }
        BLiveVoicePkInfo bLiveVoicePkInfo = (BLiveVoicePkInfo) obj;
        return this.enable == bLiveVoicePkInfo.enable && ValueObject.util_equals(this.pkId, bLiveVoicePkInfo.pkId) && ValueObject.util_equals(this.leftUserAvatar, bLiveVoicePkInfo.leftUserAvatar) && ValueObject.util_equals(this.leftUserId, bLiveVoicePkInfo.leftUserId) && ValueObject.util_equals(this.rightUserAvatar, bLiveVoicePkInfo.rightUserAvatar) && ValueObject.util_equals(this.rightUserId, bLiveVoicePkInfo.rightUserId) && ValueObject.util_equals(this.leftUrl, bLiveVoicePkInfo.leftUrl) && ValueObject.util_equals(this.leftBigUrl, bLiveVoicePkInfo.leftBigUrl) && ValueObject.util_equals(this.rightUrl, bLiveVoicePkInfo.rightUrl) && ValueObject.util_equals(this.rightBigUrl, bLiveVoicePkInfo.rightBigUrl) && ValueObject.util_equals(this.schema, bLiveVoicePkInfo.schema) && this.endMill == bLiveVoicePkInfo.endMill && ValueObject.util_equals(this.mvpBg, bLiveVoicePkInfo.mvpBg) && ValueObject.util_equals(this.onCallPoints, bLiveVoicePkInfo.onCallPoints);
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
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.pkId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.leftUserAvatar;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.leftUserId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.rightUserAvatar;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.rightUserId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.leftUrl;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.leftBigUrl;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.rightUrl;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.rightBigUrl;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.schema;
        int iHashCode10 = str10 != null ? str10.hashCode() : 0;
        long j = this.endMill;
        int i3 = (((iHashCode9 + iHashCode10) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str11 = this.mvpBg;
        int iHashCode11 = (i3 + (str11 != null ? str11.hashCode() : 0)) * 41;
        List<BLiveVoicePkPoint> list = this.onCallPoints;
        int iHashCode12 = iHashCode11 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.pkId == null) {
            this.pkId = "";
        }
        if (this.leftUserAvatar == null) {
            this.leftUserAvatar = "";
        }
        if (this.leftUserId == null) {
            this.leftUserId = "";
        }
        if (this.rightUserAvatar == null) {
            this.rightUserAvatar = "";
        }
        if (this.rightUserId == null) {
            this.rightUserId = "";
        }
        if (this.leftUrl == null) {
            this.leftUrl = "";
        }
        if (this.leftBigUrl == null) {
            this.leftBigUrl = "";
        }
        if (this.rightUrl == null) {
            this.rightUrl = "";
        }
        if (this.rightBigUrl == null) {
            this.rightBigUrl = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.mvpBg == null) {
            this.mvpBg = "";
        }
        if (this.onCallPoints == null) {
            this.onCallPoints = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
