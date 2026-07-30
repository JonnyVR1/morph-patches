package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.CreditScoreTaskType;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUserFamilyCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bliveuserfamilycard";

    @NonNull
    @ProtobufIndex(index = 10)
    public String bgEndColor;

    @NonNull
    @ProtobufIndex(index = 5)
    public String bgPic;

    @NonNull
    @ProtobufIndex(index = 9)
    public String bgStartColor;

    @NonNull
    @ProtobufIndex(index = 6)
    public String familyPic;

    @NonNull
    @ProtobufIndex(index = 1)
    public String pic;

    @NonNull
    @ProtobufIndex(index = 4)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 3)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 8)
    public String subTitleColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    @NonNull
    @ProtobufIndex(index = 7)
    public String titleColor;
    public static ProtobufAdapter<BLiveUserFamilyCard> PROTOBUF_ADAPTER = new C12195a();
    public static JsonAdapter<BLiveUserFamilyCard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserFamilyCard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserFamilyCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserFamilyCard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserFamilyCard newInstance() {
            return new BLiveUserFamilyCard();
        }

        public boolean parseField(BLiveUserFamilyCard bLiveUserFamilyCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    bLiveUserFamilyCard.subTitle = jsonParser.getValueAsString();
                    return true;
                case "titleColor":
                    bLiveUserFamilyCard.titleColor = jsonParser.getValueAsString();
                    return true;
                case "bgEndColor":
                    bLiveUserFamilyCard.bgEndColor = jsonParser.getValueAsString();
                    return true;
                case "familyPic":
                    bLiveUserFamilyCard.familyPic = jsonParser.getValueAsString();
                    return true;
                case "subTitleColor":
                    bLiveUserFamilyCard.subTitleColor = jsonParser.getValueAsString();
                    return true;
                case "schema":
                    bLiveUserFamilyCard.schema = jsonParser.getValueAsString();
                    return true;
                case "bgStartColor":
                    bLiveUserFamilyCard.bgStartColor = jsonParser.getValueAsString();
                    return true;
                case "pic":
                    bLiveUserFamilyCard.pic = jsonParser.getValueAsString();
                    return true;
                case "bgPic":
                    bLiveUserFamilyCard.bgPic = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveUserFamilyCard.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserFamilyCard bLiveUserFamilyCard, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserFamilyCard.pic;
            if (str != null) {
                jsonGenerator.writeStringField(CreditScoreTaskType.pic, str);
            }
            String str2 = bLiveUserFamilyCard.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveUserFamilyCard.subTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subTitle", str3);
            }
            String str4 = bLiveUserFamilyCard.schema;
            if (str4 != null) {
                jsonGenerator.writeStringField("schema", str4);
            }
            String str5 = bLiveUserFamilyCard.bgPic;
            if (str5 != null) {
                jsonGenerator.writeStringField("bgPic", str5);
            }
            String str6 = bLiveUserFamilyCard.familyPic;
            if (str6 != null) {
                jsonGenerator.writeStringField("familyPic", str6);
            }
            String str7 = bLiveUserFamilyCard.titleColor;
            if (str7 != null) {
                jsonGenerator.writeStringField("titleColor", str7);
            }
            String str8 = bLiveUserFamilyCard.subTitleColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("subTitleColor", str8);
            }
            String str9 = bLiveUserFamilyCard.bgStartColor;
            if (str9 != null) {
                jsonGenerator.writeStringField("bgStartColor", str9);
            }
            String str10 = bLiveUserFamilyCard.bgEndColor;
            if (str10 != null) {
                jsonGenerator.writeStringField("bgEndColor", str10);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserFamilyCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveUserFamilyCard$a */
    public class C12195a extends MessageNanoAdapter<BLiveUserFamilyCard> {
        public C12195a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveUserFamilyCard bLiveUserFamilyCard) {
            String str = bLiveUserFamilyCard.pic;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = bLiveUserFamilyCard.title;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = bLiveUserFamilyCard.subTitle;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = bLiveUserFamilyCard.schema;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = bLiveUserFamilyCard.bgPic;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = bLiveUserFamilyCard.familyPic;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = bLiveUserFamilyCard.titleColor;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            String str8 = bLiveUserFamilyCard.subTitleColor;
            if (str8 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(8, str8);
            }
            String str9 = bLiveUserFamilyCard.bgStartColor;
            if (str9 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(9, str9);
            }
            String str10 = bLiveUserFamilyCard.bgEndColor;
            if (str10 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(10, str10);
            }
            bLiveUserFamilyCard.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveUserFamilyCard parse(nb5 nb5Var) throws IOException {
            BLiveUserFamilyCard bLiveUserFamilyCard = new BLiveUserFamilyCard();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (bLiveUserFamilyCard.pic == null) {
                            bLiveUserFamilyCard.pic = "";
                        }
                        if (bLiveUserFamilyCard.title == null) {
                            bLiveUserFamilyCard.title = "";
                        }
                        if (bLiveUserFamilyCard.subTitle == null) {
                            bLiveUserFamilyCard.subTitle = "";
                        }
                        if (bLiveUserFamilyCard.schema == null) {
                            bLiveUserFamilyCard.schema = "";
                        }
                        if (bLiveUserFamilyCard.bgPic == null) {
                            bLiveUserFamilyCard.bgPic = "";
                        }
                        if (bLiveUserFamilyCard.familyPic == null) {
                            bLiveUserFamilyCard.familyPic = "";
                        }
                        if (bLiveUserFamilyCard.titleColor == null) {
                            bLiveUserFamilyCard.titleColor = "";
                        }
                        if (bLiveUserFamilyCard.subTitleColor == null) {
                            bLiveUserFamilyCard.subTitleColor = "";
                        }
                        if (bLiveUserFamilyCard.bgStartColor == null) {
                            bLiveUserFamilyCard.bgStartColor = "";
                        }
                        if (bLiveUserFamilyCard.bgEndColor == null) {
                            bLiveUserFamilyCard.bgEndColor = "";
                        }
                        break;
                    case 10:
                        bLiveUserFamilyCard.pic = nb5Var.m158750s();
                        continue;
                    case 18:
                        bLiveUserFamilyCard.title = nb5Var.m158750s();
                        continue;
                    case 26:
                        bLiveUserFamilyCard.subTitle = nb5Var.m158750s();
                        continue;
                    case 34:
                        bLiveUserFamilyCard.schema = nb5Var.m158750s();
                        continue;
                    case 42:
                        bLiveUserFamilyCard.bgPic = nb5Var.m158750s();
                        continue;
                    case 50:
                        bLiveUserFamilyCard.familyPic = nb5Var.m158750s();
                        continue;
                    case 58:
                        bLiveUserFamilyCard.titleColor = nb5Var.m158750s();
                        continue;
                    case 66:
                        bLiveUserFamilyCard.subTitleColor = nb5Var.m158750s();
                        continue;
                    case 74:
                        bLiveUserFamilyCard.bgStartColor = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        bLiveUserFamilyCard.bgEndColor = nb5Var.m158750s();
                        continue;
                    default:
                        if (bLiveUserFamilyCard.pic == null) {
                            bLiveUserFamilyCard.pic = "";
                        }
                        if (bLiveUserFamilyCard.title == null) {
                            bLiveUserFamilyCard.title = "";
                        }
                        if (bLiveUserFamilyCard.subTitle == null) {
                            bLiveUserFamilyCard.subTitle = "";
                        }
                        if (bLiveUserFamilyCard.schema == null) {
                            bLiveUserFamilyCard.schema = "";
                        }
                        if (bLiveUserFamilyCard.bgPic == null) {
                            bLiveUserFamilyCard.bgPic = "";
                        }
                        if (bLiveUserFamilyCard.familyPic == null) {
                            bLiveUserFamilyCard.familyPic = "";
                        }
                        if (bLiveUserFamilyCard.titleColor == null) {
                            bLiveUserFamilyCard.titleColor = "";
                        }
                        if (bLiveUserFamilyCard.subTitleColor == null) {
                            bLiveUserFamilyCard.subTitleColor = "";
                        }
                        if (bLiveUserFamilyCard.bgStartColor == null) {
                            bLiveUserFamilyCard.bgStartColor = "";
                        }
                        if (bLiveUserFamilyCard.bgEndColor == null) {
                            bLiveUserFamilyCard.bgEndColor = "";
                            return bLiveUserFamilyCard;
                        }
                        break;
                }
            }
            return bLiveUserFamilyCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveUserFamilyCard bLiveUserFamilyCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveUserFamilyCard.pic;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = bLiveUserFamilyCard.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = bLiveUserFamilyCard.subTitle;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = bLiveUserFamilyCard.schema;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = bLiveUserFamilyCard.bgPic;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = bLiveUserFamilyCard.familyPic;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = bLiveUserFamilyCard.titleColor;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
            String str8 = bLiveUserFamilyCard.subTitleColor;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(8, str8);
            }
            String str9 = bLiveUserFamilyCard.bgStartColor;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(9, str9);
            }
            String str10 = bLiveUserFamilyCard.bgEndColor;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(10, str10);
            }
        }
    }

    public static BLiveUserFamilyCard new_() {
        BLiveUserFamilyCard bLiveUserFamilyCard = new BLiveUserFamilyCard();
        bLiveUserFamilyCard.nullCheck();
        return bLiveUserFamilyCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserFamilyCard mo223809clone() {
        BLiveUserFamilyCard bLiveUserFamilyCard = new BLiveUserFamilyCard();
        bLiveUserFamilyCard.pic = this.pic;
        bLiveUserFamilyCard.title = this.title;
        bLiveUserFamilyCard.subTitle = this.subTitle;
        bLiveUserFamilyCard.schema = this.schema;
        bLiveUserFamilyCard.bgPic = this.bgPic;
        bLiveUserFamilyCard.familyPic = this.familyPic;
        bLiveUserFamilyCard.titleColor = this.titleColor;
        bLiveUserFamilyCard.subTitleColor = this.subTitleColor;
        bLiveUserFamilyCard.bgStartColor = this.bgStartColor;
        bLiveUserFamilyCard.bgEndColor = this.bgEndColor;
        return bLiveUserFamilyCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserFamilyCard)) {
            return false;
        }
        BLiveUserFamilyCard bLiveUserFamilyCard = (BLiveUserFamilyCard) obj;
        return ValueObject.util_equals(this.pic, bLiveUserFamilyCard.pic) && ValueObject.util_equals(this.title, bLiveUserFamilyCard.title) && ValueObject.util_equals(this.subTitle, bLiveUserFamilyCard.subTitle) && ValueObject.util_equals(this.schema, bLiveUserFamilyCard.schema) && ValueObject.util_equals(this.bgPic, bLiveUserFamilyCard.bgPic) && ValueObject.util_equals(this.familyPic, bLiveUserFamilyCard.familyPic) && ValueObject.util_equals(this.titleColor, bLiveUserFamilyCard.titleColor) && ValueObject.util_equals(this.subTitleColor, bLiveUserFamilyCard.subTitleColor) && ValueObject.util_equals(this.bgStartColor, bLiveUserFamilyCard.bgStartColor) && ValueObject.util_equals(this.bgEndColor, bLiveUserFamilyCard.bgEndColor);
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
        String str = this.pic;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.schema;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.bgPic;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.familyPic;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.titleColor;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.subTitleColor;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.bgStartColor;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.bgEndColor;
        int iHashCode10 = iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.pic == null) {
            this.pic = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.bgPic == null) {
            this.bgPic = "";
        }
        if (this.familyPic == null) {
            this.familyPic = "";
        }
        if (this.titleColor == null) {
            this.titleColor = "";
        }
        if (this.subTitleColor == null) {
            this.subTitleColor = "";
        }
        if (this.bgStartColor == null) {
            this.bgStartColor = "";
        }
        if (this.bgEndColor == null) {
            this.bgEndColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
