package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
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
import java.util.List;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
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

    @ProtobufIndex(index = 5)
    public boolean isTextBuzzExhausted;

    @ProtobufIndex(index = 9)
    public boolean matched;

    @ProtobufIndex(index = 2)
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

    @ProtobufIndex(index = 3)
    public boolean textBuzzToggle;

    @ProtobufIndex(index = 10)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LoveBuzzData loveBuzzData) {
            String str = loveBuzzData.userId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, loveBuzzData.mcc) + CodedOutputByteBufferNano.m17220b(3, loveBuzzData.textBuzzToggle);
            String str2 = loveBuzzData.conversationId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(5, loveBuzzData.isTextBuzzExhausted) + CodedOutputByteBufferNano.m17220b(6, loveBuzzData.isBoosted) + CodedOutputByteBufferNano.m17226h(7, loveBuzzData.remainingVoiceBuzz) + CodedOutputByteBufferNano.m17226h(8, loveBuzzData.remainingProlongCount) + CodedOutputByteBufferNano.m17220b(9, loveBuzzData.matched) + CodedOutputByteBufferNano.m17226h(10, loveBuzzData.totalDuration) + CodedOutputByteBufferNano.m17226h(11, loveBuzzData.prolongDuration);
            String str3 = loveBuzzData.voiceBuzzRTCVendor;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(12, str3);
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(13, loveBuzzData.isTextBuzzBoosted) + CodedOutputByteBufferNano.m17226h(14, loveBuzzData.remainingVideoBuzz);
            String str4 = loveBuzzData.videoBuzzRTCVendor;
            if (str4 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(15, str4);
            }
            List<String> list = loveBuzzData.enabledBuzz;
            if (list != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(16, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h = iM17220b2 + CodedOutputByteBufferNano.m17226h(17, loveBuzzData.remainingTextBuzz) + CodedOutputByteBufferNano.m17226h(18, loveBuzzData.textBuzzPairFailHintTimeout) + CodedOutputByteBufferNano.m17226h(19, loveBuzzData.voiceBuzzPairFailHintTimeout) + CodedOutputByteBufferNano.m17226h(20, loveBuzzData.videoBuzzPairFailHintTimeout) + CodedOutputByteBufferNano.m17220b(21, loveBuzzData.voiceBuzzToggle) + CodedOutputByteBufferNano.m17220b(22, loveBuzzData.videoBuzzToggle);
            List<String> list2 = loveBuzzData.showedPassiveModeBuzz;
            if (list2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(23, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(24, loveBuzzData.voiceBuzzConnectTimeout) + CodedOutputByteBufferNano.m17226h(25, loveBuzzData.videoBuzzConnectTimeout) + CodedOutputByteBufferNano.m17226h(26, loveBuzzData.voiceBuzzReactTimeout) + CodedOutputByteBufferNano.m17226h(27, loveBuzzData.videoBuzzReactTimeout) + CodedOutputByteBufferNano.m17226h(28, loveBuzzData.voiceBuzzWaitingTimeout) + CodedOutputByteBufferNano.m17226h(29, loveBuzzData.videoBuzzWaitingTimeout);
            RemainingBonus remainingBonus = loveBuzzData.remainingBonus;
            if (remainingBonus != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(30, remainingBonus, RemainingBonus.PROTOBUF_ADAPTER);
            }
            RateLimited rateLimited = loveBuzzData.rateLimited;
            if (rateLimited != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(31, rateLimited, RateLimited.PROTOBUF_ADAPTER);
            }
            BonusThreshold bonusThreshold = loveBuzzData.bonusThreshold;
            if (bonusThreshold != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(32, bonusThreshold, BonusThreshold.PROTOBUF_ADAPTER);
            }
            int iM17220b3 = iM17226h2 + CodedOutputByteBufferNano.m17220b(33, loveBuzzData.memojiBuzzToggle) + CodedOutputByteBufferNano.m17226h(34, loveBuzzData.memojiBuzzConnectTimeout) + CodedOutputByteBufferNano.m17226h(35, loveBuzzData.memojiBuzzPairFailHintTimeout) + CodedOutputByteBufferNano.m17226h(36, loveBuzzData.memojiBuzzReactTimeout) + CodedOutputByteBufferNano.m17226h(37, loveBuzzData.memojiBuzzWaitingTimeout) + CodedOutputByteBufferNano.m17226h(38, loveBuzzData.remainingMemojiBuzz);
            String str5 = loveBuzzData.memojiBuzzRTCVendor;
            if (str5 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17233o(39, str5);
            }
            List<Integer> list3 = loveBuzzData.allowedMCCSwitchList;
            if (list3 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(40, list3, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            BuzzResolution buzzResolution = loveBuzzData.recommendResolution;
            if (buzzResolution != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(41, buzzResolution, BuzzResolution.PROTOBUF_ADAPTER);
            }
            List<String> list4 = loveBuzzData.bonusEnabledBuzz;
            if (list4 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(42, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17220b4 = iM17220b3 + CodedOutputByteBufferNano.m17220b(43, loveBuzzData.potentialPremium);
            loveBuzzData.cachedSize = iM17220b4;
            return iM17220b4;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LoveBuzzData parse(nb5 nb5Var) throws IOException {
            LoveBuzzData loveBuzzData = new LoveBuzzData();
            while (true) {
                switch (nb5Var.m158752u()) {
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
                    case 10:
                        loveBuzzData.userId = nb5Var.m158750s();
                        continue;
                    case 16:
                        loveBuzzData.mcc = nb5Var.m158741j();
                        continue;
                    case 24:
                        loveBuzzData.textBuzzToggle = nb5Var.m158738g();
                        continue;
                    case 34:
                        loveBuzzData.conversationId = nb5Var.m158750s();
                        continue;
                    case 40:
                        loveBuzzData.isTextBuzzExhausted = nb5Var.m158738g();
                        continue;
                    case 48:
                        loveBuzzData.isBoosted = nb5Var.m158738g();
                        continue;
                    case 56:
                        loveBuzzData.remainingVoiceBuzz = nb5Var.m158741j();
                        continue;
                    case 64:
                        loveBuzzData.remainingProlongCount = nb5Var.m158741j();
                        continue;
                    case 72:
                        loveBuzzData.matched = nb5Var.m158738g();
                        continue;
                    case 80:
                        loveBuzzData.totalDuration = nb5Var.m158741j();
                        continue;
                    case 88:
                        loveBuzzData.prolongDuration = nb5Var.m158741j();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        loveBuzzData.voiceBuzzRTCVendor = nb5Var.m158750s();
                        continue;
                    case 104:
                        loveBuzzData.isTextBuzzBoosted = nb5Var.m158738g();
                        continue;
                    case 112:
                        loveBuzzData.remainingVideoBuzz = nb5Var.m158741j();
                        continue;
                    case 122:
                        loveBuzzData.videoBuzzRTCVendor = nb5Var.m158750s();
                        continue;
                    case 130:
                        loveBuzzData.enabledBuzz = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                        loveBuzzData.remainingTextBuzz = nb5Var.m158741j();
                        continue;
                    case 144:
                        loveBuzzData.textBuzzPairFailHintTimeout = nb5Var.m158741j();
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                        loveBuzzData.voiceBuzzPairFailHintTimeout = nb5Var.m158741j();
                        continue;
                    case 160:
                        loveBuzzData.videoBuzzPairFailHintTimeout = nb5Var.m158741j();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                        loveBuzzData.voiceBuzzToggle = nb5Var.m158738g();
                        continue;
                    case 176:
                        loveBuzzData.videoBuzzToggle = nb5Var.m158738g();
                        continue;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                        loveBuzzData.showedPassiveModeBuzz = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 192:
                        loveBuzzData.voiceBuzzConnectTimeout = nb5Var.m158741j();
                        continue;
                    case 200:
                        loveBuzzData.videoBuzzConnectTimeout = nb5Var.m158741j();
                        continue;
                    case 208:
                        loveBuzzData.voiceBuzzReactTimeout = nb5Var.m158741j();
                        continue;
                    case 216:
                        loveBuzzData.videoBuzzReactTimeout = nb5Var.m158741j();
                        continue;
                    case 224:
                        loveBuzzData.voiceBuzzWaitingTimeout = nb5Var.m158741j();
                        continue;
                    case 232:
                        loveBuzzData.videoBuzzWaitingTimeout = nb5Var.m158741j();
                        continue;
                    case 242:
                        loveBuzzData.remainingBonus = (RemainingBonus) nb5Var.m158743l(RemainingBonus.PROTOBUF_ADAPTER);
                        continue;
                    case 250:
                        loveBuzzData.rateLimited = (RateLimited) nb5Var.m158743l(RateLimited.PROTOBUF_ADAPTER);
                        continue;
                    case 258:
                        loveBuzzData.bonusThreshold = (BonusThreshold) nb5Var.m158743l(BonusThreshold.PROTOBUF_ADAPTER);
                        continue;
                    case 264:
                        loveBuzzData.memojiBuzzToggle = nb5Var.m158738g();
                        continue;
                    case 272:
                        loveBuzzData.memojiBuzzConnectTimeout = nb5Var.m158741j();
                        continue;
                    case 280:
                        loveBuzzData.memojiBuzzPairFailHintTimeout = nb5Var.m158741j();
                        continue;
                    case 288:
                        loveBuzzData.memojiBuzzReactTimeout = nb5Var.m158741j();
                        continue;
                    case 296:
                        loveBuzzData.memojiBuzzWaitingTimeout = nb5Var.m158741j();
                        continue;
                    case HttpStatus.NOT_MODIFIED_304 /* 304 */:
                        loveBuzzData.remainingMemojiBuzz = nb5Var.m158741j();
                        continue;
                    case 314:
                        loveBuzzData.memojiBuzzRTCVendor = nb5Var.m158750s();
                        continue;
                    case 322:
                        loveBuzzData.allowedMCCSwitchList = (List) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 330:
                        loveBuzzData.recommendResolution = (BuzzResolution) nb5Var.m158743l(BuzzResolution.PROTOBUF_ADAPTER);
                        continue;
                    case 338:
                        loveBuzzData.bonusEnabledBuzz = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 344:
                        loveBuzzData.potentialPremium = nb5Var.m158738g();
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LoveBuzzData loveBuzzData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = loveBuzzData.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, loveBuzzData.mcc);
            codedOutputByteBufferNano.m17244A(3, loveBuzzData.textBuzzToggle);
            String str2 = loveBuzzData.conversationId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
            codedOutputByteBufferNano.m17244A(5, loveBuzzData.isTextBuzzExhausted);
            codedOutputByteBufferNano.m17244A(6, loveBuzzData.isBoosted);
            codedOutputByteBufferNano.m17250G(7, loveBuzzData.remainingVoiceBuzz);
            codedOutputByteBufferNano.m17250G(8, loveBuzzData.remainingProlongCount);
            codedOutputByteBufferNano.m17244A(9, loveBuzzData.matched);
            codedOutputByteBufferNano.m17250G(10, loveBuzzData.totalDuration);
            codedOutputByteBufferNano.m17250G(11, loveBuzzData.prolongDuration);
            String str3 = loveBuzzData.voiceBuzzRTCVendor;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(12, str3);
            }
            codedOutputByteBufferNano.m17244A(13, loveBuzzData.isTextBuzzBoosted);
            codedOutputByteBufferNano.m17250G(14, loveBuzzData.remainingVideoBuzz);
            String str4 = loveBuzzData.videoBuzzRTCVendor;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(15, str4);
            }
            List<String> list = loveBuzzData.enabledBuzz;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(16, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(17, loveBuzzData.remainingTextBuzz);
            codedOutputByteBufferNano.m17250G(18, loveBuzzData.textBuzzPairFailHintTimeout);
            codedOutputByteBufferNano.m17250G(19, loveBuzzData.voiceBuzzPairFailHintTimeout);
            codedOutputByteBufferNano.m17250G(20, loveBuzzData.videoBuzzPairFailHintTimeout);
            codedOutputByteBufferNano.m17244A(21, loveBuzzData.voiceBuzzToggle);
            codedOutputByteBufferNano.m17244A(22, loveBuzzData.videoBuzzToggle);
            List<String> list2 = loveBuzzData.showedPassiveModeBuzz;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(23, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(24, loveBuzzData.voiceBuzzConnectTimeout);
            codedOutputByteBufferNano.m17250G(25, loveBuzzData.videoBuzzConnectTimeout);
            codedOutputByteBufferNano.m17250G(26, loveBuzzData.voiceBuzzReactTimeout);
            codedOutputByteBufferNano.m17250G(27, loveBuzzData.videoBuzzReactTimeout);
            codedOutputByteBufferNano.m17250G(28, loveBuzzData.voiceBuzzWaitingTimeout);
            codedOutputByteBufferNano.m17250G(29, loveBuzzData.videoBuzzWaitingTimeout);
            RemainingBonus remainingBonus = loveBuzzData.remainingBonus;
            if (remainingBonus != null) {
                codedOutputByteBufferNano.m17254K(30, remainingBonus, RemainingBonus.PROTOBUF_ADAPTER);
            }
            RateLimited rateLimited = loveBuzzData.rateLimited;
            if (rateLimited != null) {
                codedOutputByteBufferNano.m17254K(31, rateLimited, RateLimited.PROTOBUF_ADAPTER);
            }
            BonusThreshold bonusThreshold = loveBuzzData.bonusThreshold;
            if (bonusThreshold != null) {
                codedOutputByteBufferNano.m17254K(32, bonusThreshold, BonusThreshold.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(33, loveBuzzData.memojiBuzzToggle);
            codedOutputByteBufferNano.m17250G(34, loveBuzzData.memojiBuzzConnectTimeout);
            codedOutputByteBufferNano.m17250G(35, loveBuzzData.memojiBuzzPairFailHintTimeout);
            codedOutputByteBufferNano.m17250G(36, loveBuzzData.memojiBuzzReactTimeout);
            codedOutputByteBufferNano.m17250G(37, loveBuzzData.memojiBuzzWaitingTimeout);
            codedOutputByteBufferNano.m17250G(38, loveBuzzData.remainingMemojiBuzz);
            String str5 = loveBuzzData.memojiBuzzRTCVendor;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(39, str5);
            }
            List<Integer> list3 = loveBuzzData.allowedMCCSwitchList;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(40, list3, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            BuzzResolution buzzResolution = loveBuzzData.recommendResolution;
            if (buzzResolution != null) {
                codedOutputByteBufferNano.m17254K(41, buzzResolution, BuzzResolution.PROTOBUF_ADAPTER);
            }
            List<String> list4 = loveBuzzData.bonusEnabledBuzz;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(42, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(43, loveBuzzData.potentialPremium);
        }
    };
    public static JsonAdapter<LoveBuzzData> JSON_ADAPTER = new ObjectJsonAdapter<LoveBuzzData>() { // from class: com.p1.mobile.putong.core.data.LoveBuzzData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LoveBuzzData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LoveBuzzData newInstance() {
            return new LoveBuzzData();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(LoveBuzzData loveBuzzData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2063141379:
                    if (str.equals("memojiBuzzRTCVendor")) {
                        b = 0;
                    }
                    break;
                case -1965553416:
                    if (str.equals("totalDuration")) {
                        b = 1;
                    }
                    break;
                case -1947071647:
                    if (str.equals("showedPassiveModeBuzz")) {
                        b = 2;
                    }
                    break;
                case -1879532268:
                    if (str.equals("textBuzzToggle")) {
                        b = 3;
                    }
                    break;
                case -1804662532:
                    if (str.equals("remainingProlongCount")) {
                        b = 4;
                    }
                    break;
                case -1758920517:
                    if (str.equals("videoBuzzRTCVendor")) {
                        b = 5;
                    }
                    break;
                case -1719505603:
                    if (str.equals("voiceBuzzPairFailHintTimeout")) {
                        b = 6;
                    }
                    break;
                case -1676095234:
                    if (str.equals("conversationId")) {
                        b = 7;
                    }
                    break;
                case -1425684044:
                    if (str.equals("enabledBuzz")) {
                        b = 8;
                    }
                    break;
                case -990122750:
                    if (str.equals("remainingMemojiBuzz")) {
                        b = 9;
                    }
                    break;
                case -972428136:
                    if (str.equals("remainingVideoBuzz")) {
                        b = 10;
                    }
                    break;
                case -910790273:
                    if (str.equals("isTextBuzzExhausted")) {
                        b = 11;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 12;
                    }
                    break;
                case -801000231:
                    if (str.equals("voiceBuzzWaitingTimeout")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -580246814:
                    if (str.equals("videoBuzzToggle")) {
                        b = 14;
                    }
                    break;
                case -514843912:
                    if (str.equals("isBoosted")) {
                        b = 15;
                    }
                    break;
                case -496674795:
                    if (str.equals("bonusEnabledBuzz")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -433677512:
                    if (str.equals("isTextBuzzBoosted")) {
                        b = 17;
                    }
                    break;
                case -254167335:
                    if (str.equals("voiceBuzzToggle")) {
                        b = 18;
                    }
                    break;
                case -175302756:
                    if (str.equals("voiceBuzzConnectTimeout")) {
                        b = 19;
                    }
                    break;
                case -96400416:
                    if (str.equals("memojiBuzzWaitingTimeout")) {
                        b = 20;
                    }
                    break;
                case 107917:
                    if (str.equals("mcc")) {
                        b = 21;
                    }
                    break;
                case 323285655:
                    if (str.equals("allowedMCCSwitchList")) {
                        b = 22;
                    }
                    break;
                case 350459660:
                    if (str.equals("bonusThreshold")) {
                        b = 23;
                    }
                    break;
                case 416126932:
                    if (str.equals("videoBuzzPairFailHintTimeout")) {
                        b = 24;
                    }
                    break;
                case 529297059:
                    if (str.equals("memojiBuzzConnectTimeout")) {
                        b = 25;
                    }
                    break;
                case 840861988:
                    if (str.equals("matched")) {
                        b = 26;
                    }
                    break;
                case 962638503:
                    if (str.equals("voiceBuzzReactTimeout")) {
                        b = 27;
                    }
                    break;
                case 970556879:
                    if (str.equals("remainingVoiceBuzz")) {
                        b = 28;
                    }
                    break;
                case 973646472:
                    if (str.equals("recommendResolution")) {
                        b = 29;
                    }
                    break;
                case 1108215778:
                    if (str.equals("videoBuzzWaitingTimeout")) {
                        b = 30;
                    }
                    break;
                case 1239634781:
                    if (str.equals("prolongDuration")) {
                        b = 31;
                    }
                    break;
                case 1281801954:
                    if (str.equals("textBuzzPairFailHintTimeout")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1334321006:
                    if (str.equals("memojiBuzzReactTimeout")) {
                        b = 33;
                    }
                    break;
                case 1361693641:
                    if (str.equals("remainingBonus")) {
                        b = 34;
                    }
                    break;
                case 1483956886:
                    if (str.equals("memojiBuzzPairFailHintTimeout")) {
                        b = 35;
                    }
                    break;
                case 1553782116:
                    if (str.equals("voiceBuzzRTCVendor")) {
                        b = 36;
                    }
                    break;
                case 1553885622:
                    if (str.equals("remainingTextBuzz")) {
                        b = 37;
                    }
                    break;
                case 1630012640:
                    if (str.equals("memojiBuzzToggle")) {
                        b = 38;
                    }
                    break;
                case 1634003033:
                    if (str.equals("potentialPremium")) {
                        b = 39;
                    }
                    break;
                case 1733913253:
                    if (str.equals("videoBuzzConnectTimeout")) {
                        b = 40;
                    }
                    break;
                case 1983669402:
                    if (str.equals("rateLimited")) {
                        b = 41;
                    }
                    break;
                case 1997026288:
                    if (str.equals("videoBuzzReactTimeout")) {
                        b = 42;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    loveBuzzData.memojiBuzzRTCVendor = jsonParser.getValueAsString();
                    return true;
                case 1:
                    loveBuzzData.totalDuration = jsonParser.getValueAsInt();
                    return true;
                case 2:
                    loveBuzzData.showedPassiveModeBuzz = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    loveBuzzData.textBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case 4:
                    loveBuzzData.remainingProlongCount = jsonParser.getValueAsInt();
                    return true;
                case 5:
                    loveBuzzData.videoBuzzRTCVendor = jsonParser.getValueAsString();
                    return true;
                case 6:
                    loveBuzzData.voiceBuzzPairFailHintTimeout = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    loveBuzzData.conversationId = jsonParser.getValueAsString();
                    return true;
                case 8:
                    loveBuzzData.enabledBuzz = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    loveBuzzData.remainingMemojiBuzz = jsonParser.getValueAsInt();
                    return true;
                case 10:
                    loveBuzzData.remainingVideoBuzz = jsonParser.getValueAsInt();
                    return true;
                case 11:
                    loveBuzzData.isTextBuzzExhausted = jsonParser.getValueAsBoolean();
                    return true;
                case 12:
                    loveBuzzData.userId = jsonParser.getValueAsString();
                    return true;
                case 13:
                    loveBuzzData.voiceBuzzWaitingTimeout = jsonParser.getValueAsInt();
                    return true;
                case 14:
                    loveBuzzData.videoBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case 15:
                    loveBuzzData.isBoosted = jsonParser.getValueAsBoolean();
                    return true;
                case 16:
                    loveBuzzData.bonusEnabledBuzz = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    loveBuzzData.isTextBuzzBoosted = jsonParser.getValueAsBoolean();
                    return true;
                case 18:
                    loveBuzzData.voiceBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case 19:
                    loveBuzzData.voiceBuzzConnectTimeout = jsonParser.getValueAsInt();
                    return true;
                case 20:
                    loveBuzzData.memojiBuzzWaitingTimeout = jsonParser.getValueAsInt();
                    return true;
                case 21:
                    loveBuzzData.mcc = jsonParser.getValueAsInt();
                    return true;
                case 22:
                    loveBuzzData.allowedMCCSwitchList = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 23:
                    loveBuzzData.bonusThreshold = BonusThreshold.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    loveBuzzData.videoBuzzPairFailHintTimeout = jsonParser.getValueAsInt();
                    return true;
                case 25:
                    loveBuzzData.memojiBuzzConnectTimeout = jsonParser.getValueAsInt();
                    return true;
                case 26:
                    loveBuzzData.matched = jsonParser.getValueAsBoolean();
                    return true;
                case 27:
                    loveBuzzData.voiceBuzzReactTimeout = jsonParser.getValueAsInt();
                    return true;
                case 28:
                    loveBuzzData.remainingVoiceBuzz = jsonParser.getValueAsInt();
                    return true;
                case 29:
                    loveBuzzData.recommendResolution = BuzzResolution.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 30:
                    loveBuzzData.videoBuzzWaitingTimeout = jsonParser.getValueAsInt();
                    return true;
                case 31:
                    loveBuzzData.prolongDuration = jsonParser.getValueAsInt();
                    return true;
                case 32:
                    loveBuzzData.textBuzzPairFailHintTimeout = jsonParser.getValueAsInt();
                    return true;
                case 33:
                    loveBuzzData.memojiBuzzReactTimeout = jsonParser.getValueAsInt();
                    return true;
                case 34:
                    loveBuzzData.remainingBonus = RemainingBonus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 35:
                    loveBuzzData.memojiBuzzPairFailHintTimeout = jsonParser.getValueAsInt();
                    return true;
                case 36:
                    loveBuzzData.voiceBuzzRTCVendor = jsonParser.getValueAsString();
                    return true;
                case 37:
                    loveBuzzData.remainingTextBuzz = jsonParser.getValueAsInt();
                    return true;
                case 38:
                    loveBuzzData.memojiBuzzToggle = jsonParser.getValueAsBoolean();
                    return true;
                case 39:
                    loveBuzzData.potentialPremium = jsonParser.getValueAsBoolean();
                    return true;
                case 40:
                    loveBuzzData.videoBuzzConnectTimeout = jsonParser.getValueAsInt();
                    return true;
                case 41:
                    loveBuzzData.rateLimited = RateLimited.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 42:
                    loveBuzzData.videoBuzzReactTimeout = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(LoveBuzzData loveBuzzData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2063141379:
                    if (str.equals("memojiBuzzRTCVendor")) {
                        b = 0;
                    }
                    break;
                case -1965553416:
                    if (str.equals("totalDuration")) {
                        b = 1;
                    }
                    break;
                case -1947071647:
                    if (str.equals("showedPassiveModeBuzz")) {
                        b = 2;
                    }
                    break;
                case -1879532268:
                    if (str.equals("textBuzzToggle")) {
                        b = 3;
                    }
                    break;
                case -1804662532:
                    if (str.equals("remainingProlongCount")) {
                        b = 4;
                    }
                    break;
                case -1758920517:
                    if (str.equals("videoBuzzRTCVendor")) {
                        b = 5;
                    }
                    break;
                case -1719505603:
                    if (str.equals("voiceBuzzPairFailHintTimeout")) {
                        b = 6;
                    }
                    break;
                case -1676095234:
                    if (str.equals("conversationId")) {
                        b = 7;
                    }
                    break;
                case -1425684044:
                    if (str.equals("enabledBuzz")) {
                        b = 8;
                    }
                    break;
                case -990122750:
                    if (str.equals("remainingMemojiBuzz")) {
                        b = 9;
                    }
                    break;
                case -972428136:
                    if (str.equals("remainingVideoBuzz")) {
                        b = 10;
                    }
                    break;
                case -910790273:
                    if (str.equals("isTextBuzzExhausted")) {
                        b = 11;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 12;
                    }
                    break;
                case -801000231:
                    if (str.equals("voiceBuzzWaitingTimeout")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -580246814:
                    if (str.equals("videoBuzzToggle")) {
                        b = 14;
                    }
                    break;
                case -514843912:
                    if (str.equals("isBoosted")) {
                        b = 15;
                    }
                    break;
                case -496674795:
                    if (str.equals("bonusEnabledBuzz")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -433677512:
                    if (str.equals("isTextBuzzBoosted")) {
                        b = 17;
                    }
                    break;
                case -254167335:
                    if (str.equals("voiceBuzzToggle")) {
                        b = 18;
                    }
                    break;
                case -175302756:
                    if (str.equals("voiceBuzzConnectTimeout")) {
                        b = 19;
                    }
                    break;
                case -96400416:
                    if (str.equals("memojiBuzzWaitingTimeout")) {
                        b = 20;
                    }
                    break;
                case 107917:
                    if (str.equals("mcc")) {
                        b = 21;
                    }
                    break;
                case 323285655:
                    if (str.equals("allowedMCCSwitchList")) {
                        b = 22;
                    }
                    break;
                case 350459660:
                    if (str.equals("bonusThreshold")) {
                        b = 23;
                    }
                    break;
                case 416126932:
                    if (str.equals("videoBuzzPairFailHintTimeout")) {
                        b = 24;
                    }
                    break;
                case 529297059:
                    if (str.equals("memojiBuzzConnectTimeout")) {
                        b = 25;
                    }
                    break;
                case 840861988:
                    if (str.equals("matched")) {
                        b = 26;
                    }
                    break;
                case 962638503:
                    if (str.equals("voiceBuzzReactTimeout")) {
                        b = 27;
                    }
                    break;
                case 970556879:
                    if (str.equals("remainingVoiceBuzz")) {
                        b = 28;
                    }
                    break;
                case 973646472:
                    if (str.equals("recommendResolution")) {
                        b = 29;
                    }
                    break;
                case 1108215778:
                    if (str.equals("videoBuzzWaitingTimeout")) {
                        b = 30;
                    }
                    break;
                case 1239634781:
                    if (str.equals("prolongDuration")) {
                        b = 31;
                    }
                    break;
                case 1281801954:
                    if (str.equals("textBuzzPairFailHintTimeout")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1334321006:
                    if (str.equals("memojiBuzzReactTimeout")) {
                        b = 33;
                    }
                    break;
                case 1361693641:
                    if (str.equals("remainingBonus")) {
                        b = 34;
                    }
                    break;
                case 1483956886:
                    if (str.equals("memojiBuzzPairFailHintTimeout")) {
                        b = 35;
                    }
                    break;
                case 1553782116:
                    if (str.equals("voiceBuzzRTCVendor")) {
                        b = 36;
                    }
                    break;
                case 1553885622:
                    if (str.equals("remainingTextBuzz")) {
                        b = 37;
                    }
                    break;
                case 1630012640:
                    if (str.equals("memojiBuzzToggle")) {
                        b = 38;
                    }
                    break;
                case 1634003033:
                    if (str.equals("potentialPremium")) {
                        b = 39;
                    }
                    break;
                case 1733913253:
                    if (str.equals("videoBuzzConnectTimeout")) {
                        b = 40;
                    }
                    break;
                case 1983669402:
                    if (str.equals("rateLimited")) {
                        b = 41;
                    }
                    break;
                case 1997026288:
                    if (str.equals("videoBuzzReactTimeout")) {
                        b = 42;
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
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                    return true;
                default:
                    return super.parseFieldCheck(loveBuzzData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveBuzzData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveBuzzData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35654a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35655b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m35656c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Integer m35657d(Integer num) {
        return num;
    }

    public static LoveBuzzData new_() {
        LoveBuzzData loveBuzzData = new LoveBuzzData();
        loveBuzzData.nullCheck();
        return loveBuzzData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LoveBuzzData mo223809clone() {
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
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LoveBuzzData.m35655b((String) obj);
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
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LoveBuzzData.m35656c((String) obj);
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
            loveBuzzData.remainingBonus = remainingBonus.mo223809clone();
        }
        RateLimited rateLimited = this.rateLimited;
        if (rateLimited != null) {
            loveBuzzData.rateLimited = rateLimited.mo223809clone();
        }
        BonusThreshold bonusThreshold = this.bonusThreshold;
        if (bonusThreshold != null) {
            loveBuzzData.bonusThreshold = bonusThreshold.mo223809clone();
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
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LoveBuzzData.m35657d((Integer) obj);
                }
            });
        }
        BuzzResolution buzzResolution = this.recommendResolution;
        if (buzzResolution != null) {
            loveBuzzData.recommendResolution = buzzResolution.mo223809clone();
        }
        List<String> list4 = this.bonusEnabledBuzz;
        if (list4 != null) {
            loveBuzzData.bonusEnabledBuzz = ValueObject.util_map(list4, new w9j() { // from class: l.v4w
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LoveBuzzData.m35654a((String) obj);
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
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
