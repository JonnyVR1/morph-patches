package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CardGuideToFeedConfig cardGuideToFeedConfig) {
            int iH = CodedOutputByteBufferNano.h(1, cardGuideToFeedConfig.disLikeNewUserLimite) + CodedOutputByteBufferNano.h(2, cardGuideToFeedConfig.misMatchNewUserLimite) + CodedOutputByteBufferNano.h(3, cardGuideToFeedConfig.disLikeSwipeCountLimite) + CodedOutputByteBufferNano.h(4, cardGuideToFeedConfig.misMatchSwipeCountLimite);
            String str = cardGuideToFeedConfig.disLikeFollowTypeTipsFemal;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(5, str);
            }
            String str2 = cardGuideToFeedConfig.misMatchFollowTypeTipsFemal;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(6, str2);
            }
            String str3 = cardGuideToFeedConfig.disLikeFollowTypeTipsMale;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(7, str3);
            }
            String str4 = cardGuideToFeedConfig.misMatchFollowTypeTipsMale;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(8, str4);
            }
            String str5 = cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(9, str5);
            }
            String str6 = cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(10, str6);
            }
            String str7 = cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale;
            if (str7 != null) {
                iH += CodedOutputByteBufferNano.o(11, str7);
            }
            String str8 = cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale;
            if (str8 != null) {
                iH += CodedOutputByteBufferNano.o(12, str8);
            }
            String str9 = cardGuideToFeedConfig.disLikeLikeTypeTipsFemal;
            if (str9 != null) {
                iH += CodedOutputByteBufferNano.o(13, str9);
            }
            String str10 = cardGuideToFeedConfig.misMatchLikeTypeTipsFemal;
            if (str10 != null) {
                iH += CodedOutputByteBufferNano.o(14, str10);
            }
            String str11 = cardGuideToFeedConfig.disLikeLikeTypeTipsMale;
            if (str11 != null) {
                iH += CodedOutputByteBufferNano.o(15, str11);
            }
            String str12 = cardGuideToFeedConfig.misMatchLikeTypeTipsMale;
            if (str12 != null) {
                iH += CodedOutputByteBufferNano.o(16, str12);
            }
            ((MessageNano) cardGuideToFeedConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CardGuideToFeedConfig m19455parse(nb5 nb5Var) throws IOException {
            CardGuideToFeedConfig cardGuideToFeedConfig = new CardGuideToFeedConfig();
            while (true) {
                switch (nb5Var.u()) {
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
                        cardGuideToFeedConfig.disLikeNewUserLimite = nb5Var.j();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP /* 16 */:
                        cardGuideToFeedConfig.misMatchNewUserLimite = nb5Var.j();
                        continue;
                    case 24:
                        cardGuideToFeedConfig.disLikeSwipeCountLimite = nb5Var.j();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.USB_HEADSET /* 32 */:
                        cardGuideToFeedConfig.misMatchSwipeCountLimite = nb5Var.j();
                        continue;
                    case 42:
                        cardGuideToFeedConfig.disLikeFollowTypeTipsFemal = nb5Var.s();
                        continue;
                    case 50:
                        cardGuideToFeedConfig.misMatchFollowTypeTipsFemal = nb5Var.s();
                        continue;
                    case 58:
                        cardGuideToFeedConfig.disLikeFollowTypeTipsMale = nb5Var.s();
                        continue;
                    case 66:
                        cardGuideToFeedConfig.misMatchFollowTypeTipsMale = nb5Var.s();
                        continue;
                    case 74:
                        cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal = nb5Var.s();
                        continue;
                    case 82:
                        cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal = nb5Var.s();
                        continue;
                    case 90:
                        cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale = nb5Var.s();
                        continue;
                    case 98:
                        cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale = nb5Var.s();
                        continue;
                    case 106:
                        cardGuideToFeedConfig.disLikeLikeTypeTipsFemal = nb5Var.s();
                        continue;
                    case 114:
                        cardGuideToFeedConfig.misMatchLikeTypeTipsFemal = nb5Var.s();
                        continue;
                    case 122:
                        cardGuideToFeedConfig.disLikeLikeTypeTipsMale = nb5Var.s();
                        continue;
                    case 130:
                        cardGuideToFeedConfig.misMatchLikeTypeTipsMale = nb5Var.s();
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

        public void serialize(CardGuideToFeedConfig cardGuideToFeedConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, cardGuideToFeedConfig.disLikeNewUserLimite);
            codedOutputByteBufferNano.G(2, cardGuideToFeedConfig.misMatchNewUserLimite);
            codedOutputByteBufferNano.G(3, cardGuideToFeedConfig.disLikeSwipeCountLimite);
            codedOutputByteBufferNano.G(4, cardGuideToFeedConfig.misMatchSwipeCountLimite);
            String str = cardGuideToFeedConfig.disLikeFollowTypeTipsFemal;
            if (str != null) {
                codedOutputByteBufferNano.R(5, str);
            }
            String str2 = cardGuideToFeedConfig.misMatchFollowTypeTipsFemal;
            if (str2 != null) {
                codedOutputByteBufferNano.R(6, str2);
            }
            String str3 = cardGuideToFeedConfig.disLikeFollowTypeTipsMale;
            if (str3 != null) {
                codedOutputByteBufferNano.R(7, str3);
            }
            String str4 = cardGuideToFeedConfig.misMatchFollowTypeTipsMale;
            if (str4 != null) {
                codedOutputByteBufferNano.R(8, str4);
            }
            String str5 = cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal;
            if (str5 != null) {
                codedOutputByteBufferNano.R(9, str5);
            }
            String str6 = cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal;
            if (str6 != null) {
                codedOutputByteBufferNano.R(10, str6);
            }
            String str7 = cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale;
            if (str7 != null) {
                codedOutputByteBufferNano.R(11, str7);
            }
            String str8 = cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale;
            if (str8 != null) {
                codedOutputByteBufferNano.R(12, str8);
            }
            String str9 = cardGuideToFeedConfig.disLikeLikeTypeTipsFemal;
            if (str9 != null) {
                codedOutputByteBufferNano.R(13, str9);
            }
            String str10 = cardGuideToFeedConfig.misMatchLikeTypeTipsFemal;
            if (str10 != null) {
                codedOutputByteBufferNano.R(14, str10);
            }
            String str11 = cardGuideToFeedConfig.disLikeLikeTypeTipsMale;
            if (str11 != null) {
                codedOutputByteBufferNano.R(15, str11);
            }
            String str12 = cardGuideToFeedConfig.misMatchLikeTypeTipsMale;
            if (str12 != null) {
                codedOutputByteBufferNano.R(16, str12);
            }
        }
    };
    public static JsonAdapter<CardGuideToFeedConfig> JSON_ADAPTER = new ObjectJsonAdapter<CardGuideToFeedConfig>() { // from class: com.p1.mobile.putong.feed.data.CardGuideToFeedConfig.2
        public Class getDataClass() {
            return CardGuideToFeedConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CardGuideToFeedConfig mo17830newInstance() {
            return new CardGuideToFeedConfig();
        }

        public boolean parseField(CardGuideToFeedConfig cardGuideToFeedConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "disLikeNoFollowTypeTipsFemal":
                    cardGuideToFeedConfig.disLikeNoFollowTypeTipsFemal = jsonParser.getValueAsString();
                    return true;
                case "misMatchFollowTypeTipsFemal":
                    cardGuideToFeedConfig.misMatchFollowTypeTipsFemal = jsonParser.getValueAsString();
                    return true;
                case "disLikeSwipeCountLimite":
                    cardGuideToFeedConfig.disLikeSwipeCountLimite = jsonParser.getValueAsInt();
                    return true;
                case "misMatchFollowTypeTipsMale":
                    cardGuideToFeedConfig.misMatchFollowTypeTipsMale = jsonParser.getValueAsString();
                    return true;
                case "misMatchNoFollowTypeTipsFemal":
                    cardGuideToFeedConfig.misMatchNoFollowTypeTipsFemal = jsonParser.getValueAsString();
                    return true;
                case "disLikeFollowTypeTipsMale":
                    cardGuideToFeedConfig.disLikeFollowTypeTipsMale = jsonParser.getValueAsString();
                    return true;
                case "misMatchLikeTypeTipsMale":
                    cardGuideToFeedConfig.misMatchLikeTypeTipsMale = jsonParser.getValueAsString();
                    return true;
                case "misMatchNewUserLimite":
                    cardGuideToFeedConfig.misMatchNewUserLimite = jsonParser.getValueAsInt();
                    return true;
                case "disLikeNewUserLimite":
                    cardGuideToFeedConfig.disLikeNewUserLimite = jsonParser.getValueAsInt();
                    return true;
                case "misMatchNoFollowTypeTipsMale":
                    cardGuideToFeedConfig.misMatchNoFollowTypeTipsMale = jsonParser.getValueAsString();
                    return true;
                case "disLikeLikeTypeTipsMale":
                    cardGuideToFeedConfig.disLikeLikeTypeTipsMale = jsonParser.getValueAsString();
                    return true;
                case "disLikeNoFollowTypeTipsMale":
                    cardGuideToFeedConfig.disLikeNoFollowTypeTipsMale = jsonParser.getValueAsString();
                    return true;
                case "disLikeFollowTypeTipsFemal":
                    cardGuideToFeedConfig.disLikeFollowTypeTipsFemal = jsonParser.getValueAsString();
                    return true;
                case "misMatchLikeTypeTipsFemal":
                    cardGuideToFeedConfig.misMatchLikeTypeTipsFemal = jsonParser.getValueAsString();
                    return true;
                case "disLikeLikeTypeTipsFemal":
                    cardGuideToFeedConfig.disLikeLikeTypeTipsFemal = jsonParser.getValueAsString();
                    return true;
                case "misMatchSwipeCountLimite":
                    cardGuideToFeedConfig.misMatchSwipeCountLimite = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CardGuideToFeedConfig cardGuideToFeedConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "disLikeNoFollowTypeTipsFemal":
                case "misMatchFollowTypeTipsFemal":
                case "disLikeSwipeCountLimite":
                case "misMatchFollowTypeTipsMale":
                case "misMatchNoFollowTypeTipsFemal":
                case "disLikeFollowTypeTipsMale":
                case "misMatchLikeTypeTipsMale":
                case "misMatchNewUserLimite":
                case "disLikeNewUserLimite":
                case "misMatchNoFollowTypeTipsMale":
                case "disLikeLikeTypeTipsMale":
                case "disLikeNoFollowTypeTipsMale":
                case "disLikeFollowTypeTipsFemal":
                case "misMatchLikeTypeTipsFemal":
                case "disLikeLikeTypeTipsFemal":
                case "misMatchSwipeCountLimite":
                    return true;
                default:
                    return super.parseFieldCheck(cardGuideToFeedConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardGuideToFeedConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardGuideToFeedConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardGuideToFeedConfig new_() {
        CardGuideToFeedConfig cardGuideToFeedConfig = new CardGuideToFeedConfig();
        cardGuideToFeedConfig.nullCheck();
        return cardGuideToFeedConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CardGuideToFeedConfig m19454clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode12;
        return iHashCode12;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
