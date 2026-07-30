package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.LoveBuzzData;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class LoveBuzzData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lovebuzzdata";

    @NonNull
    @ProtobufIndex(index = 40)
    public List<Integer> allowedMCCSwitchList;

    @NonNull
    @ProtobufIndex(index = 42)
    public List<String> bonusEnabledBuzz;

    @NonNull
    @ProtobufIndex(index = 32)
    public BonusThreshold bonusThreshold;

    @NonNull
    @ProtobufIndex(index = 4)
    public String conversationId;

    @NonNull
    @ProtobufIndex(index = 16)
    public List<String> enabledBuzz;

    @ProtobufIndex(index = 6)
    public boolean isBoosted;

    @ProtobufIndex(index = 13)
    public boolean isTextBuzzBoosted;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean isTextBuzzExhausted;

    @ProtobufIndex(index = 9)
    public boolean matched;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int mcc;

    @ProtobufIndex(index = 34)
    public int memojiBuzzConnectTimeout;

    @ProtobufIndex(index = 35)
    public int memojiBuzzPairFailHintTimeout;

    @NonNull
    @ProtobufIndex(index = 39)
    public String memojiBuzzRTCVendor;

    @ProtobufIndex(index = 36)
    public int memojiBuzzReactTimeout;

    @ProtobufIndex(index = 33)
    public boolean memojiBuzzToggle;

    @ProtobufIndex(index = 37)
    public int memojiBuzzWaitingTimeout;

    @ProtobufIndex(index = 43)
    public boolean potentialPremium;

    @ProtobufIndex(index = 11)
    public int prolongDuration;

    @NonNull
    @ProtobufIndex(index = 31)
    public RateLimited rateLimited;

    @NonNull
    @ProtobufIndex(index = 41)
    public BuzzResolution recommendResolution;

    @NonNull
    @ProtobufIndex(index = 30)
    public RemainingBonus remainingBonus;

    @ProtobufIndex(index = 38)
    public int remainingMemojiBuzz;

    @ProtobufIndex(index = 8)
    public int remainingProlongCount;

    @ProtobufIndex(index = 17)
    public int remainingTextBuzz;

    @ProtobufIndex(index = 14)
    public int remainingVideoBuzz;

    @ProtobufIndex(index = 7)
    public int remainingVoiceBuzz;

    @NonNull
    @ProtobufIndex(index = 23)
    public List<String> showedPassiveModeBuzz;

    @ProtobufIndex(index = 18)
    public int textBuzzPairFailHintTimeout;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean textBuzzToggle;

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public int totalDuration;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @ProtobufIndex(index = 25)
    public int videoBuzzConnectTimeout;

    @ProtobufIndex(index = 20)
    public int videoBuzzPairFailHintTimeout;

    @NonNull
    @ProtobufIndex(index = 15)
    public String videoBuzzRTCVendor;

    @ProtobufIndex(index = 27)
    public int videoBuzzReactTimeout;

    @ProtobufIndex(index = 22)
    public boolean videoBuzzToggle;

    @ProtobufIndex(index = 29)
    public int videoBuzzWaitingTimeout;

    @ProtobufIndex(index = 24)
    public int voiceBuzzConnectTimeout;

    @ProtobufIndex(index = 19)
    public int voiceBuzzPairFailHintTimeout;

    @NonNull
    @ProtobufIndex(index = 12)
    public String voiceBuzzRTCVendor;

    @ProtobufIndex(index = 26)
    public int voiceBuzzReactTimeout;

    @ProtobufIndex(index = 21)
    public boolean voiceBuzzToggle;

    @ProtobufIndex(index = 28)
    public int voiceBuzzWaitingTimeout;
    public static ProtobufAdapter<LoveBuzzData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveBuzzData>() { // from class: com.p1.mobile.putong.core.data.LoveBuzzData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LoveBuzzData loveBuzzData) {
            String str = loveBuzzData.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, loveBuzzData.mcc) + CodedOutputByteBufferNano.b(3, loveBuzzData.textBuzzToggle);
            String str2 = loveBuzzData.conversationId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(4, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(5, loveBuzzData.isTextBuzzExhausted) + CodedOutputByteBufferNano.b(6, loveBuzzData.isBoosted) + CodedOutputByteBufferNano.h(7, loveBuzzData.remainingVoiceBuzz) + CodedOutputByteBufferNano.h(8, loveBuzzData.remainingProlongCount) + CodedOutputByteBufferNano.b(9, loveBuzzData.matched) + CodedOutputByteBufferNano.h(10, loveBuzzData.totalDuration) + CodedOutputByteBufferNano.h(11, loveBuzzData.prolongDuration);
            String str3 = loveBuzzData.voiceBuzzRTCVendor;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(12, str3);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(13, loveBuzzData.isTextBuzzBoosted) + CodedOutputByteBufferNano.h(14, loveBuzzData.remainingVideoBuzz);
            String str4 = loveBuzzData.videoBuzzRTCVendor;
            if (str4 != null) {
                iB2 += CodedOutputByteBufferNano.o(15, str4);
            }
            List<String> list = loveBuzzData.enabledBuzz;
            if (list != null) {
                iB2 += CodedOutputByteBufferNano.l(16, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iB2 + CodedOutputByteBufferNano.h(17, loveBuzzData.remainingTextBuzz) + CodedOutputByteBufferNano.h(18, loveBuzzData.textBuzzPairFailHintTimeout) + CodedOutputByteBufferNano.h(19, loveBuzzData.voiceBuzzPairFailHintTimeout) + CodedOutputByteBufferNano.h(20, loveBuzzData.videoBuzzPairFailHintTimeout) + CodedOutputByteBufferNano.b(21, loveBuzzData.voiceBuzzToggle) + CodedOutputByteBufferNano.b(22, loveBuzzData.videoBuzzToggle);
            List<String> list2 = loveBuzzData.showedPassiveModeBuzz;
            if (list2 != null) {
                iH += CodedOutputByteBufferNano.l(23, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(24, loveBuzzData.voiceBuzzConnectTimeout) + CodedOutputByteBufferNano.h(25, loveBuzzData.videoBuzzConnectTimeout) + CodedOutputByteBufferNano.h(26, loveBuzzData.voiceBuzzReactTimeout) + CodedOutputByteBufferNano.h(27, loveBuzzData.videoBuzzReactTimeout) + CodedOutputByteBufferNano.h(28, loveBuzzData.voiceBuzzWaitingTimeout) + CodedOutputByteBufferNano.h(29, loveBuzzData.videoBuzzWaitingTimeout);
            RemainingBonus remainingBonus = loveBuzzData.remainingBonus;
            if (remainingBonus != null) {
                iH2 += CodedOutputByteBufferNano.l(30, remainingBonus, RemainingBonus.PROTOBUF_ADAPTER);
            }
            RateLimited rateLimited = loveBuzzData.rateLimited;
            if (rateLimited != null) {
                iH2 += CodedOutputByteBufferNano.l(31, rateLimited, RateLimited.PROTOBUF_ADAPTER);
            }
            BonusThreshold bonusThreshold = loveBuzzData.bonusThreshold;
            if (bonusThreshold != null) {
                iH2 += CodedOutputByteBufferNano.l(32, bonusThreshold, BonusThreshold.PROTOBUF_ADAPTER);
            }
            int iB3 = iH2 + CodedOutputByteBufferNano.b(33, loveBuzzData.memojiBuzzToggle) + CodedOutputByteBufferNano.h(34, loveBuzzData.memojiBuzzConnectTimeout) + CodedOutputByteBufferNano.h(35, loveBuzzData.memojiBuzzPairFailHintTimeout) + CodedOutputByteBufferNano.h(36, loveBuzzData.memojiBuzzReactTimeout) + CodedOutputByteBufferNano.h(37, loveBuzzData.memojiBuzzWaitingTimeout) + CodedOutputByteBufferNano.h(38, loveBuzzData.remainingMemojiBuzz);
            String str5 = loveBuzzData.memojiBuzzRTCVendor;
            if (str5 != null) {
                iB3 += CodedOutputByteBufferNano.o(39, str5);
            }
            List<Integer> list3 = loveBuzzData.allowedMCCSwitchList;
            if (list3 != null) {
                iB3 += CodedOutputByteBufferNano.l(40, list3, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            BuzzResolution buzzResolution = loveBuzzData.recommendResolution;
            if (buzzResolution != null) {
                iB3 += CodedOutputByteBufferNano.l(41, buzzResolution, BuzzResolution.PROTOBUF_ADAPTER);
            }
            List<String> list4 = loveBuzzData.bonusEnabledBuzz;
            if (list4 != null) {
                iB3 += CodedOutputByteBufferNano.l(42, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iB4 = iB3 + CodedOutputByteBufferNano.b(43, loveBuzzData.potentialPremium);
            ((MessageNano) loveBuzzData).cachedSize = iB4;
            return iB4;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LoveBuzzData m13981parse(nb5 nb5Var) throws IOException {
            LoveBuzzData loveBuzzData = new LoveBuzzData();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (loveBuzzData.userId == null) {
                            loveBuzzData.userId = "";
                        }
                        if (loveBuzzData.conversationId == null) {
                            loveBuzzData.conversationId = "";
                        }
                        if (loveBuzzData.voiceBuzzRTCVendor == null) {
                            loveBuzzData.voiceBuzzRTCVendor = "";
                        }
                        if (loveBuzzData.videoBuzzRTCVendor == null) {
                            loveBuzzData.videoBuzzRTCVendor = "";
                        }
                        if (loveBuzzData.enabledBuzz == null) {
                            loveBuzzData.enabledBuzz = new ArrayList();
                        }
                        if (loveBuzzData.showedPassiveModeBuzz == null) {
                            loveBuzzData.showedPassiveModeBuzz = new ArrayList();
                        }
                        if (loveBuzzData.remainingBonus == null) {
                            loveBuzzData.remainingBonus = RemainingBonus.new_();
                        }
                        if (loveBuzzData.rateLimited == null) {
                            loveBuzzData.rateLimited = RateLimited.new_();
                        }
                        if (loveBuzzData.bonusThreshold == null) {
                            loveBuzzData.bonusThreshold = BonusThreshold.new_();
                        }
                        if (loveBuzzData.memojiBuzzRTCVendor == null) {
                            loveBuzzData.memojiBuzzRTCVendor = "";
                        }
                        if (loveBuzzData.allowedMCCSwitchList == null) {
                            loveBuzzData.allowedMCCSwitchList = new ArrayList();
                        }
                        if (loveBuzzData.recommendResolution == null) {
                            loveBuzzData.recommendResolution = BuzzResolution.new_();
                        }
                        if (loveBuzzData.bonusEnabledBuzz == null) {
                            loveBuzzData.bonusEnabledBuzz = new ArrayList();
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        loveBuzzData.userId = nb5Var.s();
                        continue;
                    case 16:
                        loveBuzzData.mcc = nb5Var.j();
                        continue;
                    case 24:
                        loveBuzzData.textBuzzToggle = nb5Var.g();
                        continue;
                    case 34:
                        loveBuzzData.conversationId = nb5Var.s();
                        continue;
                    case 40:
                        loveBuzzData.isTextBuzzExhausted = nb5Var.g();
                        continue;
                    case 48:
                        loveBuzzData.isBoosted = nb5Var.g();
                        continue;
                    case 56:
                        loveBuzzData.remainingVoiceBuzz = nb5Var.j();
                        continue;
                    case 64:
                        loveBuzzData.remainingProlongCount = nb5Var.j();
                        continue;
                    case 72:
                        loveBuzzData.matched = nb5Var.g();
                        continue;
                    case 80:
                        loveBuzzData.totalDuration = nb5Var.j();
                        continue;
                    case 88:
                        loveBuzzData.prolongDuration = nb5Var.j();
                        continue;
                    case 98:
                        loveBuzzData.voiceBuzzRTCVendor = nb5Var.s();
                        continue;
                    case 104:
                        loveBuzzData.isTextBuzzBoosted = nb5Var.g();
                        continue;
                    case 112:
                        loveBuzzData.remainingVideoBuzz = nb5Var.j();
                        continue;
                    case 122:
                        loveBuzzData.videoBuzzRTCVendor = nb5Var.s();
                        continue;
                    case 130:
                        loveBuzzData.enabledBuzz = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 136:
                        loveBuzzData.remainingTextBuzz = nb5Var.j();
                        continue;
                    case 144:
                        loveBuzzData.textBuzzPairFailHintTimeout = nb5Var.j();
                        continue;
                    case 152:
                        loveBuzzData.voiceBuzzPairFailHintTimeout = nb5Var.j();
                        continue;
                    case 160:
                        loveBuzzData.videoBuzzPairFailHintTimeout = nb5Var.j();
                        continue;
                    case 168:
                        loveBuzzData.voiceBuzzToggle = nb5Var.g();
                        continue;
                    case 176:
                        loveBuzzData.videoBuzzToggle = nb5Var.g();
                        continue;
                    case 186:
                        loveBuzzData.showedPassiveModeBuzz = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 192:
                        loveBuzzData.voiceBuzzConnectTimeout = nb5Var.j();
                        continue;
                    case 200:
                        loveBuzzData.videoBuzzConnectTimeout = nb5Var.j();
                        continue;
                    case 208:
                        loveBuzzData.voiceBuzzReactTimeout = nb5Var.j();
                        continue;
                    case 216:
                        loveBuzzData.videoBuzzReactTimeout = nb5Var.j();
                        continue;
                    case 224:
                        loveBuzzData.voiceBuzzWaitingTimeout = nb5Var.j();
                        continue;
                    case 232:
                        loveBuzzData.videoBuzzWaitingTimeout = nb5Var.j();
                        continue;
                    case 242:
                        loveBuzzData.remainingBonus = (RemainingBonus) nb5Var.l(RemainingBonus.PROTOBUF_ADAPTER);
                        continue;
                    case 250:
                        loveBuzzData.rateLimited = (RateLimited) nb5Var.l(RateLimited.PROTOBUF_ADAPTER);
                        continue;
                    case 258:
                        loveBuzzData.bonusThreshold = (BonusThreshold) nb5Var.l(BonusThreshold.PROTOBUF_ADAPTER);
                        continue;
                    case 264:
                        loveBuzzData.memojiBuzzToggle = nb5Var.g();
                        continue;
                    case 272:
                        loveBuzzData.memojiBuzzConnectTimeout = nb5Var.j();
                        continue;
                    case 280:
                        loveBuzzData.memojiBuzzPairFailHintTimeout = nb5Var.j();
                        continue;
                    case 288:
                        loveBuzzData.memojiBuzzReactTimeout = nb5Var.j();
                        continue;
                    case 296:
                        loveBuzzData.memojiBuzzWaitingTimeout = nb5Var.j();
                        continue;
                    case 304:
                        loveBuzzData.remainingMemojiBuzz = nb5Var.j();
                        continue;
                    case 314:
                        loveBuzzData.memojiBuzzRTCVendor = nb5Var.s();
                        continue;
                    case 322:
                        loveBuzzData.allowedMCCSwitchList = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 330:
                        loveBuzzData.recommendResolution = (BuzzResolution) nb5Var.l(BuzzResolution.PROTOBUF_ADAPTER);
                        continue;
                    case 338:
                        loveBuzzData.bonusEnabledBuzz = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 344:
                        loveBuzzData.potentialPremium = nb5Var.g();
                        continue;
                    default:
                        if (loveBuzzData.userId == null) {
                            loveBuzzData.userId = "";
                        }
                        if (loveBuzzData.conversationId == null) {
                            loveBuzzData.conversationId = "";
                        }
                        if (loveBuzzData.voiceBuzzRTCVendor == null) {
                            loveBuzzData.voiceBuzzRTCVendor = "";
                        }
                        if (loveBuzzData.videoBuzzRTCVendor == null) {
                            loveBuzzData.videoBuzzRTCVendor = "";
                        }
                        if (loveBuzzData.enabledBuzz == null) {
                            loveBuzzData.enabledBuzz = new ArrayList();
                        }
                        if (loveBuzzData.showedPassiveModeBuzz == null) {
                            loveBuzzData.showedPassiveModeBuzz = new ArrayList();
                        }
                        if (loveBuzzData.remainingBonus == null) {
                            loveBuzzData.remainingBonus = RemainingBonus.new_();
                        }
                        if (loveBuzzData.rateLimited == null) {
                            loveBuzzData.rateLimited = RateLimited.new_();
                        }
                        if (loveBuzzData.bonusThreshold == null) {
                            loveBuzzData.bonusThreshold = BonusThreshold.new_();
                        }
                        if (loveBuzzData.memojiBuzzRTCVendor == null) {
                            loveBuzzData.memojiBuzzRTCVendor = "";
                        }
                        if (loveBuzzData.allowedMCCSwitchList == null) {
                            loveBuzzData.allowedMCCSwitchList = new ArrayList();
                        }
                        if (loveBuzzData.recommendResolution == null) {
                            loveBuzzData.recommendResolution = BuzzResolution.new_();
                        }
                        if (loveBuzzData.bonusEnabledBuzz == null) {
                            loveBuzzData.bonusEnabledBuzz = new ArrayList();
                            return loveBuzzData;
                        }
                        break;
                }
            }
            return loveBuzzData;
        }

        public void serialize(LoveBuzzData loveBuzzData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = loveBuzzData.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, loveBuzzData.mcc);
            codedOutputByteBufferNano.A(3, loveBuzzData.textBuzzToggle);
            String str2 = loveBuzzData.conversationId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            codedOutputByteBufferNano.A(5, loveBuzzData.isTextBuzzExhausted);
            codedOutputByteBufferNano.A(6, loveBuzzData.isBoosted);
            codedOutputByteBufferNano.G(7, loveBuzzData.remainingVoiceBuzz);
            codedOutputByteBufferNano.G(8, loveBuzzData.remainingProlongCount);
            codedOutputByteBufferNano.A(9, loveBuzzData.matched);
            codedOutputByteBufferNano.G(10, loveBuzzData.totalDuration);
            codedOutputByteBufferNano.G(11, loveBuzzData.prolongDuration);
            String str3 = loveBuzzData.voiceBuzzRTCVendor;
            if (str3 != null) {
                codedOutputByteBufferNano.R(12, str3);
            }
            codedOutputByteBufferNano.A(13, loveBuzzData.isTextBuzzBoosted);
            codedOutputByteBufferNano.G(14, loveBuzzData.remainingVideoBuzz);
            String str4 = loveBuzzData.videoBuzzRTCVendor;
            if (str4 != null) {
                codedOutputByteBufferNano.R(15, str4);
            }
            List<String> list = loveBuzzData.enabledBuzz;
            if (list != null) {
                codedOutputByteBufferNano.K(16, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(17, loveBuzzData.remainingTextBuzz);
            codedOutputByteBufferNano.G(18, loveBuzzData.textBuzzPairFailHintTimeout);
            codedOutputByteBufferNano.G(19, loveBuzzData.voiceBuzzPairFailHintTimeout);
            codedOutputByteBufferNano.G(20, loveBuzzData.videoBuzzPairFailHintTimeout);
            codedOutputByteBufferNano.A(21, loveBuzzData.voiceBuzzToggle);
            codedOutputByteBufferNano.A(22, loveBuzzData.videoBuzzToggle);
            List<String> list2 = loveBuzzData.showedPassiveModeBuzz;
            if (list2 != null) {
                codedOutputByteBufferNano.K(23, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(24, loveBuzzData.voiceBuzzConnectTimeout);
            codedOutputByteBufferNano.G(25, loveBuzzData.videoBuzzConnectTimeout);
            codedOutputByteBufferNano.G(26, loveBuzzData.voiceBuzzReactTimeout);
            codedOutputByteBufferNano.G(27, loveBuzzData.videoBuzzReactTimeout);
            codedOutputByteBufferNano.G(28, loveBuzzData.voiceBuzzWaitingTimeout);
            codedOutputByteBufferNano.G(29, loveBuzzData.videoBuzzWaitingTimeout);
            RemainingBonus remainingBonus = loveBuzzData.remainingBonus;
            if (remainingBonus != null) {
                codedOutputByteBufferNano.K(30, remainingBonus, RemainingBonus.PROTOBUF_ADAPTER);
            }
            RateLimited rateLimited = loveBuzzData.rateLimited;
            if (rateLimited != null) {
                codedOutputByteBufferNano.K(31, rateLimited, RateLimited.PROTOBUF_ADAPTER);
            }
            BonusThreshold bonusThreshold = loveBuzzData.bonusThreshold;
            if (bonusThreshold != null) {
                codedOutputByteBufferNano.K(32, bonusThreshold, BonusThreshold.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(33, loveBuzzData.memojiBuzzToggle);
            codedOutputByteBufferNano.G(34, loveBuzzData.memojiBuzzConnectTimeout);
            codedOutputByteBufferNano.G(35, loveBuzzData.memojiBuzzPairFailHintTimeout);
            codedOutputByteBufferNano.G(36, loveBuzzData.memojiBuzzReactTimeout);
            codedOutputByteBufferNano.G(37, loveBuzzData.memojiBuzzWaitingTimeout);
            codedOutputByteBufferNano.G(38, loveBuzzData.remainingMemojiBuzz);
            String str5 = loveBuzzData.memojiBuzzRTCVendor;
            if (str5 != null) {
                codedOutputByteBufferNano.R(39, str5);
            }
            List<Integer> list3 = loveBuzzData.allowedMCCSwitchList;
            if (list3 != null) {
                codedOutputByteBufferNano.K(40, list3, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            BuzzResolution buzzResolution = loveBuzzData.recommendResolution;
            if (buzzResolution != null) {
                codedOutputByteBufferNano.K(41, buzzResolution, BuzzResolution.PROTOBUF_ADAPTER);
            }
            List<String> list4 = loveBuzzData.bonusEnabledBuzz;
            if (list4 != null) {
                codedOutputByteBufferNano.K(42, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(43, loveBuzzData.potentialPremium);
        }
    };
    public static JsonAdapter<LoveBuzzData> JSON_ADAPTER = new ObjectJsonAdapter<LoveBuzzData>() { // from class: com.p1.mobile.putong.core.data.LoveBuzzData.2
        public Class getDataClass() {
            return LoveBuzzData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LoveBuzzData m13982newInstance() {
            return new LoveBuzzData();
        }

        public boolean parseField(LoveBuzzData loveBuzzData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "memojiBuzzRTCVendor":
                    loveBuzzData.memojiBuzzRTCVendor = jsonParser.getValueAsString();
                    return true;
                case "totalDuration":
                    loveBuzzData.totalDuration = jsonParser.getValueAsInt();
                    return true;
                case "showedPassiveModeBuzz":
                    loveBuzzData.showedPassiveModeBuzz = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "textBuzzToggle":
                    loveBuzzData.textBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case "remainingProlongCount":
                    loveBuzzData.remainingProlongCount = jsonParser.getValueAsInt();
                    return true;
                case "videoBuzzRTCVendor":
                    loveBuzzData.videoBuzzRTCVendor = jsonParser.getValueAsString();
                    return true;
                case "voiceBuzzPairFailHintTimeout":
                    loveBuzzData.voiceBuzzPairFailHintTimeout = jsonParser.getValueAsInt();
                    return true;
                case "conversationId":
                    loveBuzzData.conversationId = jsonParser.getValueAsString();
                    return true;
                case "enabledBuzz":
                    loveBuzzData.enabledBuzz = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "remainingMemojiBuzz":
                    loveBuzzData.remainingMemojiBuzz = jsonParser.getValueAsInt();
                    return true;
                case "remainingVideoBuzz":
                    loveBuzzData.remainingVideoBuzz = jsonParser.getValueAsInt();
                    return true;
                case "isTextBuzzExhausted":
                    loveBuzzData.isTextBuzzExhausted = jsonParser.getValueAsBoolean();
                    return true;
                case "userId":
                    loveBuzzData.userId = jsonParser.getValueAsString();
                    return true;
                case "voiceBuzzWaitingTimeout":
                    loveBuzzData.voiceBuzzWaitingTimeout = jsonParser.getValueAsInt();
                    return true;
                case "videoBuzzToggle":
                    loveBuzzData.videoBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case "isBoosted":
                    loveBuzzData.isBoosted = jsonParser.getValueAsBoolean();
                    return true;
                case "bonusEnabledBuzz":
                    loveBuzzData.bonusEnabledBuzz = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "isTextBuzzBoosted":
                    loveBuzzData.isTextBuzzBoosted = jsonParser.getValueAsBoolean();
                    return true;
                case "voiceBuzzToggle":
                    loveBuzzData.voiceBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case "voiceBuzzConnectTimeout":
                    loveBuzzData.voiceBuzzConnectTimeout = jsonParser.getValueAsInt();
                    return true;
                case "memojiBuzzWaitingTimeout":
                    loveBuzzData.memojiBuzzWaitingTimeout = jsonParser.getValueAsInt();
                    return true;
                case "mcc":
                    loveBuzzData.mcc = jsonParser.getValueAsInt();
                    return true;
                case "allowedMCCSwitchList":
                    loveBuzzData.allowedMCCSwitchList = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "bonusThreshold":
                    loveBuzzData.bonusThreshold = (BonusThreshold) BonusThreshold.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "videoBuzzPairFailHintTimeout":
                    loveBuzzData.videoBuzzPairFailHintTimeout = jsonParser.getValueAsInt();
                    return true;
                case "memojiBuzzConnectTimeout":
                    loveBuzzData.memojiBuzzConnectTimeout = jsonParser.getValueAsInt();
                    return true;
                case "matched":
                    loveBuzzData.matched = jsonParser.getValueAsBoolean();
                    return true;
                case "voiceBuzzReactTimeout":
                    loveBuzzData.voiceBuzzReactTimeout = jsonParser.getValueAsInt();
                    return true;
                case "remainingVoiceBuzz":
                    loveBuzzData.remainingVoiceBuzz = jsonParser.getValueAsInt();
                    return true;
                case "recommendResolution":
                    loveBuzzData.recommendResolution = (BuzzResolution) BuzzResolution.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "videoBuzzWaitingTimeout":
                    loveBuzzData.videoBuzzWaitingTimeout = jsonParser.getValueAsInt();
                    return true;
                case "prolongDuration":
                    loveBuzzData.prolongDuration = jsonParser.getValueAsInt();
                    return true;
                case "textBuzzPairFailHintTimeout":
                    loveBuzzData.textBuzzPairFailHintTimeout = jsonParser.getValueAsInt();
                    return true;
                case "memojiBuzzReactTimeout":
                    loveBuzzData.memojiBuzzReactTimeout = jsonParser.getValueAsInt();
                    return true;
                case "remainingBonus":
                    loveBuzzData.remainingBonus = (RemainingBonus) RemainingBonus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "memojiBuzzPairFailHintTimeout":
                    loveBuzzData.memojiBuzzPairFailHintTimeout = jsonParser.getValueAsInt();
                    return true;
                case "voiceBuzzRTCVendor":
                    loveBuzzData.voiceBuzzRTCVendor = jsonParser.getValueAsString();
                    return true;
                case "remainingTextBuzz":
                    loveBuzzData.remainingTextBuzz = jsonParser.getValueAsInt();
                    return true;
                case "memojiBuzzToggle":
                    loveBuzzData.memojiBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case "potentialPremium":
                    loveBuzzData.potentialPremium = jsonParser.getValueAsBoolean();
                    return true;
                case "videoBuzzConnectTimeout":
                    loveBuzzData.videoBuzzConnectTimeout = jsonParser.getValueAsInt();
                    return true;
                case "rateLimited":
                    loveBuzzData.rateLimited = (RateLimited) RateLimited.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "videoBuzzReactTimeout":
                    loveBuzzData.videoBuzzReactTimeout = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LoveBuzzData loveBuzzData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "memojiBuzzRTCVendor":
                case "totalDuration":
                case "showedPassiveModeBuzz":
                case "textBuzzToggle":
                case "remainingProlongCount":
                case "videoBuzzRTCVendor":
                case "voiceBuzzPairFailHintTimeout":
                case "conversationId":
                case "enabledBuzz":
                case "remainingMemojiBuzz":
                case "remainingVideoBuzz":
                case "isTextBuzzExhausted":
                case "userId":
                case "voiceBuzzWaitingTimeout":
                case "videoBuzzToggle":
                case "isBoosted":
                case "bonusEnabledBuzz":
                case "isTextBuzzBoosted":
                case "voiceBuzzToggle":
                case "voiceBuzzConnectTimeout":
                case "memojiBuzzWaitingTimeout":
                case "mcc":
                case "allowedMCCSwitchList":
                case "bonusThreshold":
                case "videoBuzzPairFailHintTimeout":
                case "memojiBuzzConnectTimeout":
                case "matched":
                case "voiceBuzzReactTimeout":
                case "remainingVoiceBuzz":
                case "recommendResolution":
                case "videoBuzzWaitingTimeout":
                case "prolongDuration":
                case "textBuzzPairFailHintTimeout":
                case "memojiBuzzReactTimeout":
                case "remainingBonus":
                case "memojiBuzzPairFailHintTimeout":
                case "voiceBuzzRTCVendor":
                case "remainingTextBuzz":
                case "memojiBuzzToggle":
                case "potentialPremium":
                case "videoBuzzConnectTimeout":
                case "rateLimited":
                case "videoBuzzReactTimeout":
                    return true;
                default:
                    return super.parseFieldCheck(loveBuzzData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(LoveBuzzData loveBuzzData, JsonGenerator jsonGenerator) throws IOException {
            String str = loveBuzzData.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("mcc", loveBuzzData.mcc);
            jsonGenerator.writeBooleanField("textBuzzToggle", loveBuzzData.textBuzzToggle);
            String str2 = loveBuzzData.conversationId;
            if (str2 != null) {
                jsonGenerator.writeStringField("conversationId", str2);
            }
            jsonGenerator.writeBooleanField("isTextBuzzExhausted", loveBuzzData.isTextBuzzExhausted);
            jsonGenerator.writeBooleanField("isBoosted", loveBuzzData.isBoosted);
            jsonGenerator.writeNumberField("remainingVoiceBuzz", loveBuzzData.remainingVoiceBuzz);
            jsonGenerator.writeNumberField("remainingProlongCount", loveBuzzData.remainingProlongCount);
            jsonGenerator.writeBooleanField("matched", loveBuzzData.matched);
            jsonGenerator.writeNumberField("totalDuration", loveBuzzData.totalDuration);
            jsonGenerator.writeNumberField("prolongDuration", loveBuzzData.prolongDuration);
            String str3 = loveBuzzData.voiceBuzzRTCVendor;
            if (str3 != null) {
                jsonGenerator.writeStringField("voiceBuzzRTCVendor", str3);
            }
            jsonGenerator.writeBooleanField("isTextBuzzBoosted", loveBuzzData.isTextBuzzBoosted);
            jsonGenerator.writeNumberField("remainingVideoBuzz", loveBuzzData.remainingVideoBuzz);
            String str4 = loveBuzzData.videoBuzzRTCVendor;
            if (str4 != null) {
                jsonGenerator.writeStringField("videoBuzzRTCVendor", str4);
            }
            if (loveBuzzData.enabledBuzz != null) {
                jsonGenerator.writeFieldName("enabledBuzz");
                JsonAdapter.serializeArray(loveBuzzData.enabledBuzz, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("remainingTextBuzz", loveBuzzData.remainingTextBuzz);
            jsonGenerator.writeNumberField("textBuzzPairFailHintTimeout", loveBuzzData.textBuzzPairFailHintTimeout);
            jsonGenerator.writeNumberField("voiceBuzzPairFailHintTimeout", loveBuzzData.voiceBuzzPairFailHintTimeout);
            jsonGenerator.writeNumberField("videoBuzzPairFailHintTimeout", loveBuzzData.videoBuzzPairFailHintTimeout);
            jsonGenerator.writeBooleanField("voiceBuzzToggle", loveBuzzData.voiceBuzzToggle);
            jsonGenerator.writeBooleanField("videoBuzzToggle", loveBuzzData.videoBuzzToggle);
            if (loveBuzzData.showedPassiveModeBuzz != null) {
                jsonGenerator.writeFieldName("showedPassiveModeBuzz");
                JsonAdapter.serializeArray(loveBuzzData.showedPassiveModeBuzz, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("voiceBuzzConnectTimeout", loveBuzzData.voiceBuzzConnectTimeout);
            jsonGenerator.writeNumberField("videoBuzzConnectTimeout", loveBuzzData.videoBuzzConnectTimeout);
            jsonGenerator.writeNumberField("voiceBuzzReactTimeout", loveBuzzData.voiceBuzzReactTimeout);
            jsonGenerator.writeNumberField("videoBuzzReactTimeout", loveBuzzData.videoBuzzReactTimeout);
            jsonGenerator.writeNumberField("voiceBuzzWaitingTimeout", loveBuzzData.voiceBuzzWaitingTimeout);
            jsonGenerator.writeNumberField("videoBuzzWaitingTimeout", loveBuzzData.videoBuzzWaitingTimeout);
            if (loveBuzzData.remainingBonus != null) {
                jsonGenerator.writeFieldName("remainingBonus");
                RemainingBonus.JSON_ADAPTER.serialize(loveBuzzData.remainingBonus, jsonGenerator, true);
            }
            if (loveBuzzData.rateLimited != null) {
                jsonGenerator.writeFieldName("rateLimited");
                RateLimited.JSON_ADAPTER.serialize(loveBuzzData.rateLimited, jsonGenerator, true);
            }
            if (loveBuzzData.bonusThreshold != null) {
                jsonGenerator.writeFieldName("bonusThreshold");
                BonusThreshold.JSON_ADAPTER.serialize(loveBuzzData.bonusThreshold, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("memojiBuzzToggle", loveBuzzData.memojiBuzzToggle);
            jsonGenerator.writeNumberField("memojiBuzzConnectTimeout", loveBuzzData.memojiBuzzConnectTimeout);
            jsonGenerator.writeNumberField("memojiBuzzPairFailHintTimeout", loveBuzzData.memojiBuzzPairFailHintTimeout);
            jsonGenerator.writeNumberField("memojiBuzzReactTimeout", loveBuzzData.memojiBuzzReactTimeout);
            jsonGenerator.writeNumberField("memojiBuzzWaitingTimeout", loveBuzzData.memojiBuzzWaitingTimeout);
            jsonGenerator.writeNumberField("remainingMemojiBuzz", loveBuzzData.remainingMemojiBuzz);
            String str5 = loveBuzzData.memojiBuzzRTCVendor;
            if (str5 != null) {
                jsonGenerator.writeStringField("memojiBuzzRTCVendor", str5);
            }
            if (loveBuzzData.allowedMCCSwitchList != null) {
                jsonGenerator.writeFieldName("allowedMCCSwitchList");
                JsonAdapter.serializeArray(loveBuzzData.allowedMCCSwitchList, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (loveBuzzData.recommendResolution != null) {
                jsonGenerator.writeFieldName("recommendResolution");
                BuzzResolution.JSON_ADAPTER.serialize(loveBuzzData.recommendResolution, jsonGenerator, true);
            }
            if (loveBuzzData.bonusEnabledBuzz != null) {
                jsonGenerator.writeFieldName("bonusEnabledBuzz");
                JsonAdapter.serializeArray(loveBuzzData.bonusEnabledBuzz, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeBooleanField("potentialPremium", loveBuzzData.potentialPremium);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveBuzzData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveBuzzData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m456a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m457b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m458c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Integer m459d(Integer num) {
        return num;
    }

    public static LoveBuzzData new_() {
        LoveBuzzData loveBuzzData = new LoveBuzzData();
        loveBuzzData.nullCheck();
        return loveBuzzData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LoveBuzzData m13980clone() {
        LoveBuzzData loveBuzzData = new LoveBuzzData();
        loveBuzzData.userId = this.userId;
        loveBuzzData.mcc = this.mcc;
        loveBuzzData.textBuzzToggle = this.textBuzzToggle;
        loveBuzzData.conversationId = this.conversationId;
        loveBuzzData.isTextBuzzExhausted = this.isTextBuzzExhausted;
        loveBuzzData.isBoosted = this.isBoosted;
        loveBuzzData.remainingVoiceBuzz = this.remainingVoiceBuzz;
        loveBuzzData.remainingProlongCount = this.remainingProlongCount;
        loveBuzzData.matched = this.matched;
        loveBuzzData.totalDuration = this.totalDuration;
        loveBuzzData.prolongDuration = this.prolongDuration;
        loveBuzzData.voiceBuzzRTCVendor = this.voiceBuzzRTCVendor;
        loveBuzzData.isTextBuzzBoosted = this.isTextBuzzBoosted;
        loveBuzzData.remainingVideoBuzz = this.remainingVideoBuzz;
        loveBuzzData.videoBuzzRTCVendor = this.videoBuzzRTCVendor;
        List<String> list = this.enabledBuzz;
        if (list != null) {
            loveBuzzData.enabledBuzz = ValueObject.util_map(list, new w9j() { // from class: l.s4w
                public final Object call(Object obj) {
                    return LoveBuzzData.m457b((String) obj);
                }
            });
        }
        loveBuzzData.remainingTextBuzz = this.remainingTextBuzz;
        loveBuzzData.textBuzzPairFailHintTimeout = this.textBuzzPairFailHintTimeout;
        loveBuzzData.voiceBuzzPairFailHintTimeout = this.voiceBuzzPairFailHintTimeout;
        loveBuzzData.videoBuzzPairFailHintTimeout = this.videoBuzzPairFailHintTimeout;
        loveBuzzData.voiceBuzzToggle = this.voiceBuzzToggle;
        loveBuzzData.videoBuzzToggle = this.videoBuzzToggle;
        List<String> list2 = this.showedPassiveModeBuzz;
        if (list2 != null) {
            loveBuzzData.showedPassiveModeBuzz = ValueObject.util_map(list2, new w9j() { // from class: l.t4w
                public final Object call(Object obj) {
                    return LoveBuzzData.m458c((String) obj);
                }
            });
        }
        loveBuzzData.voiceBuzzConnectTimeout = this.voiceBuzzConnectTimeout;
        loveBuzzData.videoBuzzConnectTimeout = this.videoBuzzConnectTimeout;
        loveBuzzData.voiceBuzzReactTimeout = this.voiceBuzzReactTimeout;
        loveBuzzData.videoBuzzReactTimeout = this.videoBuzzReactTimeout;
        loveBuzzData.voiceBuzzWaitingTimeout = this.voiceBuzzWaitingTimeout;
        loveBuzzData.videoBuzzWaitingTimeout = this.videoBuzzWaitingTimeout;
        RemainingBonus remainingBonus = this.remainingBonus;
        if (remainingBonus != null) {
            loveBuzzData.remainingBonus = remainingBonus.m15382clone();
        }
        RateLimited rateLimited = this.rateLimited;
        if (rateLimited != null) {
            loveBuzzData.rateLimited = rateLimited.m15224clone();
        }
        BonusThreshold bonusThreshold = this.bonusThreshold;
        if (bonusThreshold != null) {
            loveBuzzData.bonusThreshold = bonusThreshold.m11774clone();
        }
        loveBuzzData.memojiBuzzToggle = this.memojiBuzzToggle;
        loveBuzzData.memojiBuzzConnectTimeout = this.memojiBuzzConnectTimeout;
        loveBuzzData.memojiBuzzPairFailHintTimeout = this.memojiBuzzPairFailHintTimeout;
        loveBuzzData.memojiBuzzReactTimeout = this.memojiBuzzReactTimeout;
        loveBuzzData.memojiBuzzWaitingTimeout = this.memojiBuzzWaitingTimeout;
        loveBuzzData.remainingMemojiBuzz = this.remainingMemojiBuzz;
        loveBuzzData.memojiBuzzRTCVendor = this.memojiBuzzRTCVendor;
        List<Integer> list3 = this.allowedMCCSwitchList;
        if (list3 != null) {
            loveBuzzData.allowedMCCSwitchList = ValueObject.util_map(list3, new w9j() { // from class: l.u4w
                public final Object call(Object obj) {
                    return LoveBuzzData.m459d((Integer) obj);
                }
            });
        }
        BuzzResolution buzzResolution = this.recommendResolution;
        if (buzzResolution != null) {
            loveBuzzData.recommendResolution = buzzResolution.m11838clone();
        }
        List<String> list4 = this.bonusEnabledBuzz;
        if (list4 != null) {
            loveBuzzData.bonusEnabledBuzz = ValueObject.util_map(list4, new w9j() { // from class: l.v4w
                public final Object call(Object obj) {
                    return LoveBuzzData.m456a((String) obj);
                }
            });
        }
        loveBuzzData.potentialPremium = this.potentialPremium;
        return loveBuzzData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoveBuzzData)) {
            return false;
        }
        LoveBuzzData loveBuzzData = (LoveBuzzData) obj;
        return ValueObject.util_equals(this.userId, loveBuzzData.userId) && this.mcc == loveBuzzData.mcc && this.textBuzzToggle == loveBuzzData.textBuzzToggle && ValueObject.util_equals(this.conversationId, loveBuzzData.conversationId) && this.isTextBuzzExhausted == loveBuzzData.isTextBuzzExhausted && this.isBoosted == loveBuzzData.isBoosted && this.remainingVoiceBuzz == loveBuzzData.remainingVoiceBuzz && this.remainingProlongCount == loveBuzzData.remainingProlongCount && this.matched == loveBuzzData.matched && this.totalDuration == loveBuzzData.totalDuration && this.prolongDuration == loveBuzzData.prolongDuration && ValueObject.util_equals(this.voiceBuzzRTCVendor, loveBuzzData.voiceBuzzRTCVendor) && this.isTextBuzzBoosted == loveBuzzData.isTextBuzzBoosted && this.remainingVideoBuzz == loveBuzzData.remainingVideoBuzz && ValueObject.util_equals(this.videoBuzzRTCVendor, loveBuzzData.videoBuzzRTCVendor) && ValueObject.util_equals(this.enabledBuzz, loveBuzzData.enabledBuzz) && this.remainingTextBuzz == loveBuzzData.remainingTextBuzz && this.textBuzzPairFailHintTimeout == loveBuzzData.textBuzzPairFailHintTimeout && this.voiceBuzzPairFailHintTimeout == loveBuzzData.voiceBuzzPairFailHintTimeout && this.videoBuzzPairFailHintTimeout == loveBuzzData.videoBuzzPairFailHintTimeout && this.voiceBuzzToggle == loveBuzzData.voiceBuzzToggle && this.videoBuzzToggle == loveBuzzData.videoBuzzToggle && ValueObject.util_equals(this.showedPassiveModeBuzz, loveBuzzData.showedPassiveModeBuzz) && this.voiceBuzzConnectTimeout == loveBuzzData.voiceBuzzConnectTimeout && this.videoBuzzConnectTimeout == loveBuzzData.videoBuzzConnectTimeout && this.voiceBuzzReactTimeout == loveBuzzData.voiceBuzzReactTimeout && this.videoBuzzReactTimeout == loveBuzzData.videoBuzzReactTimeout && this.voiceBuzzWaitingTimeout == loveBuzzData.voiceBuzzWaitingTimeout && this.videoBuzzWaitingTimeout == loveBuzzData.videoBuzzWaitingTimeout && ValueObject.util_equals(this.remainingBonus, loveBuzzData.remainingBonus) && ValueObject.util_equals(this.rateLimited, loveBuzzData.rateLimited) && ValueObject.util_equals(this.bonusThreshold, loveBuzzData.bonusThreshold) && this.memojiBuzzToggle == loveBuzzData.memojiBuzzToggle && this.memojiBuzzConnectTimeout == loveBuzzData.memojiBuzzConnectTimeout && this.memojiBuzzPairFailHintTimeout == loveBuzzData.memojiBuzzPairFailHintTimeout && this.memojiBuzzReactTimeout == loveBuzzData.memojiBuzzReactTimeout && this.memojiBuzzWaitingTimeout == loveBuzzData.memojiBuzzWaitingTimeout && this.remainingMemojiBuzz == loveBuzzData.remainingMemojiBuzz && ValueObject.util_equals(this.memojiBuzzRTCVendor, loveBuzzData.memojiBuzzRTCVendor) && ValueObject.util_equals(this.allowedMCCSwitchList, loveBuzzData.allowedMCCSwitchList) && ValueObject.util_equals(this.recommendResolution, loveBuzzData.recommendResolution) && ValueObject.util_equals(this.bonusEnabledBuzz, loveBuzzData.bonusEnabledBuzz) && this.potentialPremium == loveBuzzData.potentialPremium;
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
        String str = this.userId;
        int iHashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.mcc) * 41) + (this.textBuzzToggle ? 1231 : 1237)) * 41;
        String str2 = this.conversationId;
        int iHashCode2 = (((((((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isTextBuzzExhausted ? 1231 : 1237)) * 41) + (this.isBoosted ? 1231 : 1237)) * 41) + this.remainingVoiceBuzz) * 41) + this.remainingProlongCount) * 41) + (this.matched ? 1231 : 1237)) * 41) + this.totalDuration) * 41) + this.prolongDuration) * 41;
        String str3 = this.voiceBuzzRTCVendor;
        int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.isTextBuzzBoosted ? 1231 : 1237)) * 41) + this.remainingVideoBuzz) * 41;
        String str4 = this.videoBuzzRTCVendor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list = this.enabledBuzz;
        int iHashCode5 = (((((((((((((iHashCode4 + (list != null ? list.hashCode() : 0)) * 41) + this.remainingTextBuzz) * 41) + this.textBuzzPairFailHintTimeout) * 41) + this.voiceBuzzPairFailHintTimeout) * 41) + this.videoBuzzPairFailHintTimeout) * 41) + (this.voiceBuzzToggle ? 1231 : 1237)) * 41) + (this.videoBuzzToggle ? 1231 : 1237)) * 41;
        List<String> list2 = this.showedPassiveModeBuzz;
        int iHashCode6 = (((((((((((((iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 41) + this.voiceBuzzConnectTimeout) * 41) + this.videoBuzzConnectTimeout) * 41) + this.voiceBuzzReactTimeout) * 41) + this.videoBuzzReactTimeout) * 41) + this.voiceBuzzWaitingTimeout) * 41) + this.videoBuzzWaitingTimeout) * 41;
        RemainingBonus remainingBonus = this.remainingBonus;
        int iHashCode7 = (iHashCode6 + (remainingBonus != null ? remainingBonus.hashCode() : 0)) * 41;
        RateLimited rateLimited = this.rateLimited;
        int iHashCode8 = (iHashCode7 + (rateLimited != null ? rateLimited.hashCode() : 0)) * 41;
        BonusThreshold bonusThreshold = this.bonusThreshold;
        int iHashCode9 = (((((((((((((iHashCode8 + (bonusThreshold != null ? bonusThreshold.hashCode() : 0)) * 41) + (this.memojiBuzzToggle ? 1231 : 1237)) * 41) + this.memojiBuzzConnectTimeout) * 41) + this.memojiBuzzPairFailHintTimeout) * 41) + this.memojiBuzzReactTimeout) * 41) + this.memojiBuzzWaitingTimeout) * 41) + this.remainingMemojiBuzz) * 41;
        String str5 = this.memojiBuzzRTCVendor;
        int iHashCode10 = (iHashCode9 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<Integer> list3 = this.allowedMCCSwitchList;
        int iHashCode11 = (iHashCode10 + (list3 != null ? list3.hashCode() : 0)) * 41;
        BuzzResolution buzzResolution = this.recommendResolution;
        int iHashCode12 = (iHashCode11 + (buzzResolution != null ? buzzResolution.hashCode() : 0)) * 41;
        List<String> list4 = this.bonusEnabledBuzz;
        int iHashCode13 = ((iHashCode12 + (list4 != null ? list4.hashCode() : 0)) * 41) + (this.potentialPremium ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode13;
        return iHashCode13;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.conversationId == null) {
            this.conversationId = "";
        }
        if (this.voiceBuzzRTCVendor == null) {
            this.voiceBuzzRTCVendor = "";
        }
        if (this.videoBuzzRTCVendor == null) {
            this.videoBuzzRTCVendor = "";
        }
        if (this.enabledBuzz == null) {
            this.enabledBuzz = new ArrayList();
        }
        if (this.showedPassiveModeBuzz == null) {
            this.showedPassiveModeBuzz = new ArrayList();
        }
        if (this.remainingBonus == null) {
            this.remainingBonus = RemainingBonus.new_();
        }
        if (this.rateLimited == null) {
            this.rateLimited = RateLimited.new_();
        }
        if (this.bonusThreshold == null) {
            this.bonusThreshold = BonusThreshold.new_();
        }
        if (this.memojiBuzzRTCVendor == null) {
            this.memojiBuzzRTCVendor = "";
        }
        if (this.allowedMCCSwitchList == null) {
            this.allowedMCCSwitchList = new ArrayList();
        }
        if (this.recommendResolution == null) {
            this.recommendResolution = BuzzResolution.new_();
        }
        if (this.bonusEnabledBuzz == null) {
            this.bonusEnabledBuzz = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
