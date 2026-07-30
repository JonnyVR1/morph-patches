package org.spongycastle.crypto.agreement.jpake;

import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.util.Arrays;
import p153l.qg50;
import p153l.wg3;
import p153l.xtq0;

/* JADX INFO: loaded from: classes3.dex */
public class JPAKEParticipant {
    public static final int STATE_INITIALIZED = 0;
    public static final int STATE_KEY_CALCULATED = 50;
    public static final int STATE_ROUND_1_CREATED = 10;
    public static final int STATE_ROUND_1_VALIDATED = 20;
    public static final int STATE_ROUND_2_CREATED = 30;
    public static final int STATE_ROUND_2_VALIDATED = 40;
    public static final int STATE_ROUND_3_CREATED = 60;
    public static final int STATE_ROUND_3_VALIDATED = 70;

    /* JADX INFO: renamed from: b */
    private BigInteger f207251b;
    private final Digest digest;

    /* JADX INFO: renamed from: g */
    private final BigInteger f207252g;
    private BigInteger gx1;
    private BigInteger gx2;
    private BigInteger gx3;
    private BigInteger gx4;

    /* JADX INFO: renamed from: p */
    private final BigInteger f207253p;
    private final String participantId;
    private String partnerParticipantId;
    private char[] password;

    /* JADX INFO: renamed from: q */
    private final BigInteger f207254q;
    private final SecureRandom random;
    private int state;

    /* JADX INFO: renamed from: x1 */
    private BigInteger f207255x1;

    /* JADX INFO: renamed from: x2 */
    private BigInteger f207256x2;

    public JPAKEParticipant(String str, char[] cArr, JPAKEPrimeOrderGroup jPAKEPrimeOrderGroup, Digest digest, SecureRandom secureRandom) {
        JPAKEUtil.validateNotNull(str, "participantId");
        JPAKEUtil.validateNotNull(cArr, SignInGrantType.password);
        JPAKEUtil.validateNotNull(jPAKEPrimeOrderGroup, "p");
        JPAKEUtil.validateNotNull(digest, "digest");
        JPAKEUtil.validateNotNull(secureRandom, BLivePkCategory.random);
        if (cArr.length == 0) {
            wg3.m206174a("Password must not be empty.");
            throw null;
        }
        this.participantId = str;
        this.password = Arrays.copyOf(cArr, cArr.length);
        this.f207253p = jPAKEPrimeOrderGroup.getP();
        this.f207254q = jPAKEPrimeOrderGroup.getQ();
        this.f207252g = jPAKEPrimeOrderGroup.getG();
        this.digest = digest;
        this.random = secureRandom;
        this.state = 0;
    }

    public BigInteger calculateKeyingMaterial() {
        int i = this.state;
        if (i >= 50) {
            qg50.m176437a("Key already calculated for ", this.participantId);
            return null;
        }
        if (i < 40) {
            qg50.m176437a("Round2 payload must be validated prior to creating key for ", this.participantId);
            return null;
        }
        BigInteger bigIntegerCalculateS = JPAKEUtil.calculateS(this.password);
        Arrays.fill(this.password, (char) 0);
        this.password = null;
        BigInteger bigIntegerCalculateKeyingMaterial = JPAKEUtil.calculateKeyingMaterial(this.f207253p, this.f207254q, this.gx4, this.f207256x2, bigIntegerCalculateS, this.f207251b);
        this.f207255x1 = null;
        this.f207256x2 = null;
        this.f207251b = null;
        this.state = 50;
        return bigIntegerCalculateKeyingMaterial;
    }

    public JPAKERound1Payload createRound1PayloadToSend() {
        if (this.state >= 10) {
            qg50.m176437a("Round1 payload already created for ", this.participantId);
            return null;
        }
        this.f207255x1 = JPAKEUtil.generateX1(this.f207254q, this.random);
        this.f207256x2 = JPAKEUtil.generateX2(this.f207254q, this.random);
        this.gx1 = JPAKEUtil.calculateGx(this.f207253p, this.f207252g, this.f207255x1);
        this.gx2 = JPAKEUtil.calculateGx(this.f207253p, this.f207252g, this.f207256x2);
        BigInteger[] bigIntegerArrCalculateZeroKnowledgeProof = JPAKEUtil.calculateZeroKnowledgeProof(this.f207253p, this.f207254q, this.f207252g, this.gx1, this.f207255x1, this.participantId, this.digest, this.random);
        BigInteger[] bigIntegerArrCalculateZeroKnowledgeProof2 = JPAKEUtil.calculateZeroKnowledgeProof(this.f207253p, this.f207254q, this.f207252g, this.gx2, this.f207256x2, this.participantId, this.digest, this.random);
        this.state = 10;
        return new JPAKERound1Payload(this.participantId, this.gx1, this.gx2, bigIntegerArrCalculateZeroKnowledgeProof, bigIntegerArrCalculateZeroKnowledgeProof2);
    }

    public JPAKERound2Payload createRound2PayloadToSend() {
        int i = this.state;
        if (i >= 30) {
            qg50.m176437a("Round2 payload already created for ", this.participantId);
            return null;
        }
        if (i < 20) {
            qg50.m176437a("Round1 payload must be validated prior to creating Round2 payload for ", this.participantId);
            return null;
        }
        BigInteger bigIntegerCalculateGA = JPAKEUtil.calculateGA(this.f207253p, this.gx1, this.gx3, this.gx4);
        BigInteger bigIntegerCalculateX2s = JPAKEUtil.calculateX2s(this.f207254q, this.f207256x2, JPAKEUtil.calculateS(this.password));
        BigInteger bigIntegerCalculateA = JPAKEUtil.calculateA(this.f207253p, this.f207254q, bigIntegerCalculateGA, bigIntegerCalculateX2s);
        BigInteger[] bigIntegerArrCalculateZeroKnowledgeProof = JPAKEUtil.calculateZeroKnowledgeProof(this.f207253p, this.f207254q, bigIntegerCalculateGA, bigIntegerCalculateA, bigIntegerCalculateX2s, this.participantId, this.digest, this.random);
        this.state = 30;
        return new JPAKERound2Payload(this.participantId, bigIntegerCalculateA, bigIntegerArrCalculateZeroKnowledgeProof);
    }

    public JPAKERound3Payload createRound3PayloadToSend(BigInteger bigInteger) {
        int i = this.state;
        if (i >= 60) {
            qg50.m176437a("Round3 payload already created for ", this.participantId);
            return null;
        }
        String str = this.participantId;
        if (i < 50) {
            xtq0.m213103a("Keying material must be calculated prior to creating Round3 payload for ", str);
            return null;
        }
        BigInteger bigIntegerCalculateMacTag = JPAKEUtil.calculateMacTag(str, this.partnerParticipantId, this.gx1, this.gx2, this.gx3, this.gx4, bigInteger, this.digest);
        this.state = 60;
        return new JPAKERound3Payload(this.participantId, bigIntegerCalculateMacTag);
    }

    public int getState() {
        return this.state;
    }

    public void validateRound1PayloadReceived(JPAKERound1Payload jPAKERound1Payload) throws CryptoException {
        if (this.state >= 20) {
            qg50.m176437a("Validation already attempted for round1 payload for", this.participantId);
            return;
        }
        this.partnerParticipantId = jPAKERound1Payload.getParticipantId();
        this.gx3 = jPAKERound1Payload.getGx1();
        this.gx4 = jPAKERound1Payload.getGx2();
        BigInteger[] knowledgeProofForX1 = jPAKERound1Payload.getKnowledgeProofForX1();
        BigInteger[] knowledgeProofForX2 = jPAKERound1Payload.getKnowledgeProofForX2();
        JPAKEUtil.validateParticipantIdsDiffer(this.participantId, jPAKERound1Payload.getParticipantId());
        JPAKEUtil.validateGx4(this.gx4);
        JPAKEUtil.validateZeroKnowledgeProof(this.f207253p, this.f207254q, this.f207252g, this.gx3, knowledgeProofForX1, jPAKERound1Payload.getParticipantId(), this.digest);
        JPAKEUtil.validateZeroKnowledgeProof(this.f207253p, this.f207254q, this.f207252g, this.gx4, knowledgeProofForX2, jPAKERound1Payload.getParticipantId(), this.digest);
        this.state = 20;
    }

    public void validateRound2PayloadReceived(JPAKERound2Payload jPAKERound2Payload) throws CryptoException {
        int i = this.state;
        if (i >= 40) {
            qg50.m176437a("Validation already attempted for round2 payload for", this.participantId);
            return;
        }
        if (i < 20) {
            qg50.m176437a("Round1 payload must be validated prior to validating Round2 payload for ", this.participantId);
            return;
        }
        BigInteger bigIntegerCalculateGA = JPAKEUtil.calculateGA(this.f207253p, this.gx3, this.gx1, this.gx2);
        this.f207251b = jPAKERound2Payload.getA();
        BigInteger[] knowledgeProofForX2s = jPAKERound2Payload.getKnowledgeProofForX2s();
        JPAKEUtil.validateParticipantIdsDiffer(this.participantId, jPAKERound2Payload.getParticipantId());
        JPAKEUtil.validateParticipantIdsEqual(this.partnerParticipantId, jPAKERound2Payload.getParticipantId());
        JPAKEUtil.validateGa(bigIntegerCalculateGA);
        JPAKEUtil.validateZeroKnowledgeProof(this.f207253p, this.f207254q, bigIntegerCalculateGA, this.f207251b, knowledgeProofForX2s, jPAKERound2Payload.getParticipantId(), this.digest);
        this.state = 40;
    }

    public void validateRound3PayloadReceived(JPAKERound3Payload jPAKERound3Payload, BigInteger bigInteger) throws CryptoException {
        int i = this.state;
        if (i >= 70) {
            qg50.m176437a("Validation already attempted for round3 payload for", this.participantId);
            return;
        }
        String str = this.participantId;
        if (i < 50) {
            xtq0.m213103a("Keying material must be calculated validated prior to validating Round3 payload for ", str);
            return;
        }
        JPAKEUtil.validateParticipantIdsDiffer(str, jPAKERound3Payload.getParticipantId());
        JPAKEUtil.validateParticipantIdsEqual(this.partnerParticipantId, jPAKERound3Payload.getParticipantId());
        JPAKEUtil.validateMacTag(this.participantId, this.partnerParticipantId, this.gx1, this.gx2, this.gx3, this.gx4, bigInteger, this.digest, jPAKERound3Payload.getMacTag());
        this.gx1 = null;
        this.gx2 = null;
        this.gx3 = null;
        this.gx4 = null;
        this.state = 70;
    }

    public JPAKEParticipant(String str, char[] cArr, JPAKEPrimeOrderGroup jPAKEPrimeOrderGroup) {
        this(str, cArr, jPAKEPrimeOrderGroup, new SHA256Digest(), new SecureRandom());
    }

    public JPAKEParticipant(String str, char[] cArr) {
        this(str, cArr, JPAKEPrimeOrderGroups.NIST_3072);
    }
}
