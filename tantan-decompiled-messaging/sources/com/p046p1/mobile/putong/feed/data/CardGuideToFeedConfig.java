package com.p046p1.mobile.putong.feed.data;

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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class CardGuideToFeedConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardguidetofeedconfig";

    @NonNull
    @ProtobufIndex(index = 5)
    public String disLikeFollowTypeTipsFemal;

    @NonNull
    @ProtobufIndex(index = 7)
    public String disLikeFollowTypeTipsMale;

    @NonNull
    @ProtobufIndex(index = 13)
    public String disLikeLikeTypeTipsFemal;

    @NonNull
    @ProtobufIndex(index = 15)
    public String disLikeLikeTypeTipsMale;

    @ProtobufIndex(index = 1)
    public int disLikeNewUserLimite;

    @NonNull
    @ProtobufIndex(index = 9)
    public String disLikeNoFollowTypeTipsFemal;

    @NonNull
    @ProtobufIndex(index = 11)
    public String disLikeNoFollowTypeTipsMale;

    @ProtobufIndex(index = 3)
    public int disLikeSwipeCountLimite;
    public boolean isAvailable;

    @NonNull
    @ProtobufIndex(index = 6)
    public String misMatchFollowTypeTipsFemal;

    @NonNull
    @ProtobufIndex(index = 8)
    public String misMatchFollowTypeTipsMale;

    @NonNull
    @ProtobufIndex(index = 14)
    public String misMatchLikeTypeTipsFemal;

    @NonNull
    @ProtobufIndex(index = 16)
    public String misMatchLikeTypeTipsMale;

    @ProtobufIndex(index = 2)
    public int misMatchNewUserLimite;

    @NonNull
    @ProtobufIndex(index = 10)
    public String misMatchNoFollowTypeTipsFemal;

    @NonNull
    @ProtobufIndex(index = 12)
    public String misMatchNoFollowTypeTipsMale;

    @ProtobufIndex(index = 4)
    public int misMatchSwipeCountLimite;
    public static ProtobufAdapter<CardGuideToFeedConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardGuideToFeedConfig>() { // from class: com.p1.mobile.putong.feed.data.CardGuideToFeedConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardGuideToFeedConfig cardGuideToFeedConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, cardGuideToFeedConfig.disLikeNewUserLimite) + CodedOutputByteBufferNano.m17226h(2, cardGuideToFeedConfig.misMatchNewUserLimite) + CodedOutputByteBufferNano.m17226h(3, cardGuideToFeedConfig.disLikeSwipeCountLimite) + CodedOutputByteBufferNano.m17226h(4, cardGuideToFeedConfig.misMatchSwipeCountLimite);
            String str = cardGuideToFeedConfig.disLikeFollowTypeTipsFemal;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str);
            }
            String str2 = cardGuideToFeedConfig.misMatchFollowTypeTipsFemal;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(6, str2);
            }
            String str3 = cardGuideToFeedConfig.disLikeFollowTypeTipsMale;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(7, str3);
            }
            String str4 = cardGuideToFeedConfig.misMatchFollowTypeTipsMale;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(8, str4);
            }
            String str5 = cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal;
            if (str5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(9, str5);
            }
            String str6 = cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal;
            if (str6 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(10, str6);
            }
            String str7 = cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale;
            if (str7 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(11, str7);
            }
            String str8 = cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale;
            if (str8 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(12, str8);
            }
            String str9 = cardGuideToFeedConfig.disLikeLikeTypeTipsFemal;
            if (str9 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(13, str9);
            }
            String str10 = cardGuideToFeedConfig.misMatchLikeTypeTipsFemal;
            if (str10 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(14, str10);
            }
            String str11 = cardGuideToFeedConfig.disLikeLikeTypeTipsMale;
            if (str11 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(15, str11);
            }
            String str12 = cardGuideToFeedConfig.misMatchLikeTypeTipsMale;
            if (str12 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(16, str12);
            }
            cardGuideToFeedConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardGuideToFeedConfig parse(nb5 nb5Var) throws IOException {
            CardGuideToFeedConfig cardGuideToFeedConfig = new CardGuideToFeedConfig();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (cardGuideToFeedConfig.disLikeFollowTypeTipsFemal == null) {
                            cardGuideToFeedConfig.disLikeFollowTypeTipsFemal = "";
                        }
                        if (cardGuideToFeedConfig.misMatchFollowTypeTipsFemal == null) {
                            cardGuideToFeedConfig.misMatchFollowTypeTipsFemal = "";
                        }
                        if (cardGuideToFeedConfig.disLikeFollowTypeTipsMale == null) {
                            cardGuideToFeedConfig.disLikeFollowTypeTipsMale = "";
                        }
                        if (cardGuideToFeedConfig.misMatchFollowTypeTipsMale == null) {
                            cardGuideToFeedConfig.misMatchFollowTypeTipsMale = "";
                        }
                        if (cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal == null) {
                            cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal = "";
                        }
                        if (cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal == null) {
                            cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal = "";
                        }
                        if (cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale == null) {
                            cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale = "";
                        }
                        if (cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale == null) {
                            cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale = "";
                        }
                        if (cardGuideToFeedConfig.disLikeLikeTypeTipsFemal == null) {
                            cardGuideToFeedConfig.disLikeLikeTypeTipsFemal = "";
                        }
                        if (cardGuideToFeedConfig.misMatchLikeTypeTipsFemal == null) {
                            cardGuideToFeedConfig.misMatchLikeTypeTipsFemal = "";
                        }
                        if (cardGuideToFeedConfig.disLikeLikeTypeTipsMale == null) {
                            cardGuideToFeedConfig.disLikeLikeTypeTipsMale = "";
                        }
                        if (cardGuideToFeedConfig.misMatchLikeTypeTipsMale == null) {
                            cardGuideToFeedConfig.misMatchLikeTypeTipsMale = "";
                        }
                        break;
                    case 8:
                        cardGuideToFeedConfig.disLikeNewUserLimite = nb5Var.m158741j();
                        continue;
                    case 16:
                        cardGuideToFeedConfig.misMatchNewUserLimite = nb5Var.m158741j();
                        continue;
                    case 24:
                        cardGuideToFeedConfig.disLikeSwipeCountLimite = nb5Var.m158741j();
                        continue;
                    case 32:
                        cardGuideToFeedConfig.misMatchSwipeCountLimite = nb5Var.m158741j();
                        continue;
                    case 42:
                        cardGuideToFeedConfig.disLikeFollowTypeTipsFemal = nb5Var.m158750s();
                        continue;
                    case 50:
                        cardGuideToFeedConfig.misMatchFollowTypeTipsFemal = nb5Var.m158750s();
                        continue;
                    case 58:
                        cardGuideToFeedConfig.disLikeFollowTypeTipsMale = nb5Var.m158750s();
                        continue;
                    case 66:
                        cardGuideToFeedConfig.misMatchFollowTypeTipsMale = nb5Var.m158750s();
                        continue;
                    case 74:
                        cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal = nb5Var.m158750s();
                        continue;
                    case 90:
                        cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale = nb5Var.m158750s();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale = nb5Var.m158750s();
                        continue;
                    case 106:
                        cardGuideToFeedConfig.disLikeLikeTypeTipsFemal = nb5Var.m158750s();
                        continue;
                    case 114:
                        cardGuideToFeedConfig.misMatchLikeTypeTipsFemal = nb5Var.m158750s();
                        continue;
                    case 122:
                        cardGuideToFeedConfig.disLikeLikeTypeTipsMale = nb5Var.m158750s();
                        continue;
                    case 130:
                        cardGuideToFeedConfig.misMatchLikeTypeTipsMale = nb5Var.m158750s();
                        continue;
                    default:
                        if (cardGuideToFeedConfig.disLikeFollowTypeTipsFemal == null) {
                            cardGuideToFeedConfig.disLikeFollowTypeTipsFemal = "";
                        }
                        if (cardGuideToFeedConfig.misMatchFollowTypeTipsFemal == null) {
                            cardGuideToFeedConfig.misMatchFollowTypeTipsFemal = "";
                        }
                        if (cardGuideToFeedConfig.disLikeFollowTypeTipsMale == null) {
                            cardGuideToFeedConfig.disLikeFollowTypeTipsMale = "";
                        }
                        if (cardGuideToFeedConfig.misMatchFollowTypeTipsMale == null) {
                            cardGuideToFeedConfig.misMatchFollowTypeTipsMale = "";
                        }
                        if (cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal == null) {
                            cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal = "";
                        }
                        if (cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal == null) {
                            cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal = "";
                        }
                        if (cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale == null) {
                            cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale = "";
                        }
                        if (cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale == null) {
                            cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale = "";
                        }
                        if (cardGuideToFeedConfig.disLikeLikeTypeTipsFemal == null) {
                            cardGuideToFeedConfig.disLikeLikeTypeTipsFemal = "";
                        }
                        if (cardGuideToFeedConfig.misMatchLikeTypeTipsFemal == null) {
                            cardGuideToFeedConfig.misMatchLikeTypeTipsFemal = "";
                        }
                        if (cardGuideToFeedConfig.disLikeLikeTypeTipsMale == null) {
                            cardGuideToFeedConfig.disLikeLikeTypeTipsMale = "";
                        }
                        if (cardGuideToFeedConfig.misMatchLikeTypeTipsMale == null) {
                            cardGuideToFeedConfig.misMatchLikeTypeTipsMale = "";
                            return cardGuideToFeedConfig;
                        }
                        break;
                }
            }
            return cardGuideToFeedConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardGuideToFeedConfig cardGuideToFeedConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, cardGuideToFeedConfig.disLikeNewUserLimite);
            codedOutputByteBufferNano.m17250G(2, cardGuideToFeedConfig.misMatchNewUserLimite);
            codedOutputByteBufferNano.m17250G(3, cardGuideToFeedConfig.disLikeSwipeCountLimite);
            codedOutputByteBufferNano.m17250G(4, cardGuideToFeedConfig.misMatchSwipeCountLimite);
            String str = cardGuideToFeedConfig.disLikeFollowTypeTipsFemal;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(5, str);
            }
            String str2 = cardGuideToFeedConfig.misMatchFollowTypeTipsFemal;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(6, str2);
            }
            String str3 = cardGuideToFeedConfig.disLikeFollowTypeTipsMale;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(7, str3);
            }
            String str4 = cardGuideToFeedConfig.misMatchFollowTypeTipsMale;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(8, str4);
            }
            String str5 = cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(9, str5);
            }
            String str6 = cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(10, str6);
            }
            String str7 = cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(11, str7);
            }
            String str8 = cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(12, str8);
            }
            String str9 = cardGuideToFeedConfig.disLikeLikeTypeTipsFemal;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(13, str9);
            }
            String str10 = cardGuideToFeedConfig.misMatchLikeTypeTipsFemal;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(14, str10);
            }
            String str11 = cardGuideToFeedConfig.disLikeLikeTypeTipsMale;
            if (str11 != null) {
                codedOutputByteBufferNano.m17261R(15, str11);
            }
            String str12 = cardGuideToFeedConfig.misMatchLikeTypeTipsMale;
            if (str12 != null) {
                codedOutputByteBufferNano.m17261R(16, str12);
            }
        }
    };
    public static JsonAdapter<CardGuideToFeedConfig> JSON_ADAPTER = new ObjectJsonAdapter<CardGuideToFeedConfig>() { // from class: com.p1.mobile.putong.feed.data.CardGuideToFeedConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardGuideToFeedConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardGuideToFeedConfig newInstance() {
            return new CardGuideToFeedConfig();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(CardGuideToFeedConfig cardGuideToFeedConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1780810288:
                    if (str.equals("disLikeNoFollowTypeTipsFemal")) {
                        b = 0;
                    }
                    break;
                case -1724877560:
                    if (str.equals("misMatchFollowTypeTipsFemal")) {
                        b = 1;
                    }
                    break;
                case -1556189756:
                    if (str.equals("disLikeSwipeCountLimite")) {
                        b = 2;
                    }
                    break;
                case -1025267874:
                    if (str.equals("misMatchFollowTypeTipsMale")) {
                        b = 3;
                    }
                    break;
                case -974612217:
                    if (str.equals("misMatchNoFollowTypeTipsFemal")) {
                        b = 4;
                    }
                    break;
                case -801398987:
                    if (str.equals("disLikeFollowTypeTipsMale")) {
                        b = 5;
                    }
                    break;
                case -651711036:
                    if (str.equals("misMatchLikeTypeTipsMale")) {
                        b = 6;
                    }
                    break;
                case -556796313:
                    if (str.equals("misMatchNewUserLimite")) {
                        b = 7;
                    }
                    break;
                case -90950608:
                    if (str.equals("disLikeNewUserLimite")) {
                        b = 8;
                    }
                    break;
                case 245860223:
                    if (str.equals("misMatchNoFollowTypeTipsMale")) {
                        b = 9;
                    }
                    break;
                case 318353243:
                    if (str.equals("disLikeLikeTypeTipsMale")) {
                        b = 10;
                    }
                    break;
                case 635495830:
                    if (str.equals("disLikeNoFollowTypeTipsMale")) {
                        b = 11;
                    }
                    break;
                case 920090641:
                    if (str.equals("disLikeFollowTypeTipsFemal")) {
                        b = 12;
                    }
                    break;
                case 1265449826:
                    if (str.equals("misMatchLikeTypeTipsFemal")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1272671403:
                    if (str.equals("disLikeLikeTypeTipsFemal")) {
                        b = 14;
                    }
                    break;
                case 1768713261:
                    if (str.equals("misMatchSwipeCountLimite")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal = jsonParser.getValueAsString();
                    return true;
                case 1:
                    cardGuideToFeedConfig.misMatchFollowTypeTipsFemal = jsonParser.getValueAsString();
                    return true;
                case 2:
                    cardGuideToFeedConfig.disLikeSwipeCountLimite = jsonParser.getValueAsInt();
                    return true;
                case 3:
                    cardGuideToFeedConfig.misMatchFollowTypeTipsMale = jsonParser.getValueAsString();
                    return true;
                case 4:
                    cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal = jsonParser.getValueAsString();
                    return true;
                case 5:
                    cardGuideToFeedConfig.disLikeFollowTypeTipsMale = jsonParser.getValueAsString();
                    return true;
                case 6:
                    cardGuideToFeedConfig.misMatchLikeTypeTipsMale = jsonParser.getValueAsString();
                    return true;
                case 7:
                    cardGuideToFeedConfig.misMatchNewUserLimite = jsonParser.getValueAsInt();
                    return true;
                case 8:
                    cardGuideToFeedConfig.disLikeNewUserLimite = jsonParser.getValueAsInt();
                    return true;
                case 9:
                    cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale = jsonParser.getValueAsString();
                    return true;
                case 10:
                    cardGuideToFeedConfig.disLikeLikeTypeTipsMale = jsonParser.getValueAsString();
                    return true;
                case 11:
                    cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale = jsonParser.getValueAsString();
                    return true;
                case 12:
                    cardGuideToFeedConfig.disLikeFollowTypeTipsFemal = jsonParser.getValueAsString();
                    return true;
                case 13:
                    cardGuideToFeedConfig.misMatchLikeTypeTipsFemal = jsonParser.getValueAsString();
                    return true;
                case 14:
                    cardGuideToFeedConfig.disLikeLikeTypeTipsFemal = jsonParser.getValueAsString();
                    return true;
                case 15:
                    cardGuideToFeedConfig.misMatchSwipeCountLimite = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(CardGuideToFeedConfig cardGuideToFeedConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1780810288:
                    if (str.equals("disLikeNoFollowTypeTipsFemal")) {
                        b = 0;
                    }
                    break;
                case -1724877560:
                    if (str.equals("misMatchFollowTypeTipsFemal")) {
                        b = 1;
                    }
                    break;
                case -1556189756:
                    if (str.equals("disLikeSwipeCountLimite")) {
                        b = 2;
                    }
                    break;
                case -1025267874:
                    if (str.equals("misMatchFollowTypeTipsMale")) {
                        b = 3;
                    }
                    break;
                case -974612217:
                    if (str.equals("misMatchNoFollowTypeTipsFemal")) {
                        b = 4;
                    }
                    break;
                case -801398987:
                    if (str.equals("disLikeFollowTypeTipsMale")) {
                        b = 5;
                    }
                    break;
                case -651711036:
                    if (str.equals("misMatchLikeTypeTipsMale")) {
                        b = 6;
                    }
                    break;
                case -556796313:
                    if (str.equals("misMatchNewUserLimite")) {
                        b = 7;
                    }
                    break;
                case -90950608:
                    if (str.equals("disLikeNewUserLimite")) {
                        b = 8;
                    }
                    break;
                case 245860223:
                    if (str.equals("misMatchNoFollowTypeTipsMale")) {
                        b = 9;
                    }
                    break;
                case 318353243:
                    if (str.equals("disLikeLikeTypeTipsMale")) {
                        b = 10;
                    }
                    break;
                case 635495830:
                    if (str.equals("disLikeNoFollowTypeTipsMale")) {
                        b = 11;
                    }
                    break;
                case 920090641:
                    if (str.equals("disLikeFollowTypeTipsFemal")) {
                        b = 12;
                    }
                    break;
                case 1265449826:
                    if (str.equals("misMatchLikeTypeTipsFemal")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1272671403:
                    if (str.equals("disLikeLikeTypeTipsFemal")) {
                        b = 14;
                    }
                    break;
                case 1768713261:
                    if (str.equals("misMatchSwipeCountLimite")) {
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
                    return super.parseFieldCheck(cardGuideToFeedConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CardGuideToFeedConfig cardGuideToFeedConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("disLikeNewUserLimite", cardGuideToFeedConfig.disLikeNewUserLimite);
            jsonGenerator.writeNumberField("misMatchNewUserLimite", cardGuideToFeedConfig.misMatchNewUserLimite);
            jsonGenerator.writeNumberField("disLikeSwipeCountLimite", cardGuideToFeedConfig.disLikeSwipeCountLimite);
            jsonGenerator.writeNumberField("misMatchSwipeCountLimite", cardGuideToFeedConfig.misMatchSwipeCountLimite);
            String str = cardGuideToFeedConfig.disLikeFollowTypeTipsFemal;
            if (str != null) {
                jsonGenerator.writeStringField("disLikeFollowTypeTipsFemal", str);
            }
            String str2 = cardGuideToFeedConfig.misMatchFollowTypeTipsFemal;
            if (str2 != null) {
                jsonGenerator.writeStringField("misMatchFollowTypeTipsFemal", str2);
            }
            String str3 = cardGuideToFeedConfig.disLikeFollowTypeTipsMale;
            if (str3 != null) {
                jsonGenerator.writeStringField("disLikeFollowTypeTipsMale", str3);
            }
            String str4 = cardGuideToFeedConfig.misMatchFollowTypeTipsMale;
            if (str4 != null) {
                jsonGenerator.writeStringField("misMatchFollowTypeTipsMale", str4);
            }
            String str5 = cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal;
            if (str5 != null) {
                jsonGenerator.writeStringField("disLikeNoFollowTypeTipsFemal", str5);
            }
            String str6 = cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal;
            if (str6 != null) {
                jsonGenerator.writeStringField("misMatchNoFollowTypeTipsFemal", str6);
            }
            String str7 = cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale;
            if (str7 != null) {
                jsonGenerator.writeStringField("disLikeNoFollowTypeTipsMale", str7);
            }
            String str8 = cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale;
            if (str8 != null) {
                jsonGenerator.writeStringField("misMatchNoFollowTypeTipsMale", str8);
            }
            String str9 = cardGuideToFeedConfig.disLikeLikeTypeTipsFemal;
            if (str9 != null) {
                jsonGenerator.writeStringField("disLikeLikeTypeTipsFemal", str9);
            }
            String str10 = cardGuideToFeedConfig.misMatchLikeTypeTipsFemal;
            if (str10 != null) {
                jsonGenerator.writeStringField("misMatchLikeTypeTipsFemal", str10);
            }
            String str11 = cardGuideToFeedConfig.disLikeLikeTypeTipsMale;
            if (str11 != null) {
                jsonGenerator.writeStringField("disLikeLikeTypeTipsMale", str11);
            }
            String str12 = cardGuideToFeedConfig.misMatchLikeTypeTipsMale;
            if (str12 != null) {
                jsonGenerator.writeStringField("misMatchLikeTypeTipsMale", str12);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardGuideToFeedConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardGuideToFeedConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardGuideToFeedConfig new_() {
        CardGuideToFeedConfig cardGuideToFeedConfig = new CardGuideToFeedConfig();
        cardGuideToFeedConfig.nullCheck();
        return cardGuideToFeedConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardGuideToFeedConfig mo223809clone() {
        CardGuideToFeedConfig cardGuideToFeedConfig = new CardGuideToFeedConfig();
        cardGuideToFeedConfig.disLikeNewUserLimite = this.disLikeNewUserLimite;
        cardGuideToFeedConfig.misMatchNewUserLimite = this.misMatchNewUserLimite;
        cardGuideToFeedConfig.disLikeSwipeCountLimite = this.disLikeSwipeCountLimite;
        cardGuideToFeedConfig.misMatchSwipeCountLimite = this.misMatchSwipeCountLimite;
        cardGuideToFeedConfig.disLikeFollowTypeTipsFemal = this.disLikeFollowTypeTipsFemal;
        cardGuideToFeedConfig.misMatchFollowTypeTipsFemal = this.misMatchFollowTypeTipsFemal;
        cardGuideToFeedConfig.disLikeFollowTypeTipsMale = this.disLikeFollowTypeTipsMale;
        cardGuideToFeedConfig.misMatchFollowTypeTipsMale = this.misMatchFollowTypeTipsMale;
        cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal = this.disLikeNoFollowTypeTipsFemal;
        cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal = this.misMatchNoFollowTypeTipsFemal;
        cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale = this.disLikeNoFollowTypeTipsMale;
        cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale = this.misMatchNoFollowTypeTipsMale;
        cardGuideToFeedConfig.disLikeLikeTypeTipsFemal = this.disLikeLikeTypeTipsFemal;
        cardGuideToFeedConfig.misMatchLikeTypeTipsFemal = this.misMatchLikeTypeTipsFemal;
        cardGuideToFeedConfig.disLikeLikeTypeTipsMale = this.disLikeLikeTypeTipsMale;
        cardGuideToFeedConfig.misMatchLikeTypeTipsMale = this.misMatchLikeTypeTipsMale;
        return cardGuideToFeedConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardGuideToFeedConfig)) {
            return false;
        }
        CardGuideToFeedConfig cardGuideToFeedConfig = (CardGuideToFeedConfig) obj;
        return this.disLikeNewUserLimite == cardGuideToFeedConfig.disLikeNewUserLimite && this.misMatchNewUserLimite == cardGuideToFeedConfig.misMatchNewUserLimite && this.disLikeSwipeCountLimite == cardGuideToFeedConfig.disLikeSwipeCountLimite && this.misMatchSwipeCountLimite == cardGuideToFeedConfig.misMatchSwipeCountLimite && ValueObject.util_equals(this.disLikeFollowTypeTipsFemal, cardGuideToFeedConfig.disLikeFollowTypeTipsFemal) && ValueObject.util_equals(this.misMatchFollowTypeTipsFemal, cardGuideToFeedConfig.misMatchFollowTypeTipsFemal) && ValueObject.util_equals(this.disLikeFollowTypeTipsMale, cardGuideToFeedConfig.disLikeFollowTypeTipsMale) && ValueObject.util_equals(this.misMatchFollowTypeTipsMale, cardGuideToFeedConfig.misMatchFollowTypeTipsMale) && ValueObject.util_equals(this.disLikeNoFollowTypeTipsFemal, cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal) && ValueObject.util_equals(this.misMatchNoFollowTypeTipsFemal, cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal) && ValueObject.util_equals(this.disLikeNoFollowTypeTipsMale, cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale) && ValueObject.util_equals(this.misMatchNoFollowTypeTipsMale, cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale) && ValueObject.util_equals(this.disLikeLikeTypeTipsFemal, cardGuideToFeedConfig.disLikeLikeTypeTipsFemal) && ValueObject.util_equals(this.misMatchLikeTypeTipsFemal, cardGuideToFeedConfig.misMatchLikeTypeTipsFemal) && ValueObject.util_equals(this.disLikeLikeTypeTipsMale, cardGuideToFeedConfig.disLikeLikeTypeTipsMale) && ValueObject.util_equals(this.misMatchLikeTypeTipsMale, cardGuideToFeedConfig.misMatchLikeTypeTipsMale);
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
        int i2 = ((((((((i * 41) + this.disLikeNewUserLimite) * 41) + this.misMatchNewUserLimite) * 41) + this.disLikeSwipeCountLimite) * 41) + this.misMatchSwipeCountLimite) * 41;
        String str = this.disLikeFollowTypeTipsFemal;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.misMatchFollowTypeTipsFemal;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.disLikeFollowTypeTipsMale;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.misMatchFollowTypeTipsMale;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.disLikeNoFollowTypeTipsFemal;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.misMatchNoFollowTypeTipsFemal;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.disLikeNoFollowTypeTipsMale;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.misMatchNoFollowTypeTipsMale;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.disLikeLikeTypeTipsFemal;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.misMatchLikeTypeTipsFemal;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.disLikeLikeTypeTipsMale;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.misMatchLikeTypeTipsMale;
        int iHashCode12 = iHashCode11 + (str12 != null ? str12.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.disLikeFollowTypeTipsFemal == null) {
            this.disLikeFollowTypeTipsFemal = "";
        }
        if (this.misMatchFollowTypeTipsFemal == null) {
            this.misMatchFollowTypeTipsFemal = "";
        }
        if (this.disLikeFollowTypeTipsMale == null) {
            this.disLikeFollowTypeTipsMale = "";
        }
        if (this.misMatchFollowTypeTipsMale == null) {
            this.misMatchFollowTypeTipsMale = "";
        }
        if (this.disLikeNoFollowTypeTipsFemal == null) {
            this.disLikeNoFollowTypeTipsFemal = "";
        }
        if (this.misMatchNoFollowTypeTipsFemal == null) {
            this.misMatchNoFollowTypeTipsFemal = "";
        }
        if (this.disLikeNoFollowTypeTipsMale == null) {
            this.disLikeNoFollowTypeTipsMale = "";
        }
        if (this.misMatchNoFollowTypeTipsMale == null) {
            this.misMatchNoFollowTypeTipsMale = "";
        }
        if (this.disLikeLikeTypeTipsFemal == null) {
            this.disLikeLikeTypeTipsFemal = "";
        }
        if (this.misMatchLikeTypeTipsFemal == null) {
            this.misMatchLikeTypeTipsFemal = "";
        }
        if (this.disLikeLikeTypeTipsMale == null) {
            this.disLikeLikeTypeTipsMale = "";
        }
        if (this.misMatchLikeTypeTipsMale == null) {
            this.misMatchLikeTypeTipsMale = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
