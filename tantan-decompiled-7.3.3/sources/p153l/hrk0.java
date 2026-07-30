package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.List;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
public class hrk0 {

    /* JADX INFO: renamed from: b */
    public C22507a<C17564a> f111353b;

    /* JADX INFO: renamed from: c */
    public C17565b f111354c;

    /* JADX INFO: renamed from: e */
    public int f111356e;

    /* JADX INFO: renamed from: d */
    public final HashMap<Integer, BLiveVoiceCall> f111355d = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public boolean f111357f = false;

    /* JADX INFO: renamed from: g */
    public final String f111358g = "position index illegal";

    /* JADX INFO: renamed from: a */
    public ado0 f111352a = new ado0();

    /* JADX INFO: renamed from: l.hrk0$b */
    public static class C17565b {

        /* JADX INFO: renamed from: a */
        public hrk0 f111361a;

        /* JADX INFO: renamed from: b */
        public void m136890b(ezm0 ezm0Var) {
            hrk0 hrk0Var = this.f111361a;
            if (hrk0Var != null) {
                hrk0Var.m136865d(ezm0Var);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m136891c(BLiveVoiceCall bLiveVoiceCall) {
            hrk0 hrk0Var = this.f111361a;
            if (hrk0Var != null) {
                hrk0Var.m136870i(bLiveVoiceCall);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m136892d(BLiveVoiceCall bLiveVoiceCall) {
            hrk0 hrk0Var = this.f111361a;
            if (hrk0Var != null) {
                hrk0Var.m136884w(bLiveVoiceCall.f45333id);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m136893e(ado0 ado0Var) {
            hrk0 hrk0Var = this.f111361a;
            if (hrk0Var != null) {
                hrk0Var.m136858A(ado0Var);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m136894f(BLiveVoiceCall bLiveVoiceCall) {
            hrk0 hrk0Var = this.f111361a;
            if (hrk0Var != null) {
                hrk0Var.m136859B(bLiveVoiceCall);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m136858A(ado0 ado0Var) {
        if (m136864G(ado0Var)) {
            this.f111352a = ado0Var;
            this.f111353b.onNext(new C17564a(1));
        }
    }

    /* JADX INFO: renamed from: B */
    public void m136859B(BLiveVoiceCall bLiveVoiceCall) {
        BLiveVoiceCall bLiveVoiceCallM97106B = this.f111352a.m97106B(bLiveVoiceCall.f45333id);
        if (this.f111357f) {
            m136861D(bLiveVoiceCall, bLiveVoiceCallM97106B);
        } else {
            m136862E(bLiveVoiceCall, bLiveVoiceCallM97106B);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m136860C(BLiveVoiceCall bLiveVoiceCall) {
        this.f111352a.m97126V(bLiveVoiceCall);
        this.f111353b.onNext(new C17564a(2, bLiveVoiceCall));
    }

    /* JADX INFO: renamed from: D */
    public final void m136861D(BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2) {
        if (m136882u(bLiveVoiceCall.position)) {
            m136886y(bLiveVoiceCall, "position index illegal");
            return;
        }
        if (bLiveVoiceCall2 == null) {
            return;
        }
        long j = bLiveVoiceCall.userRecvRewardPoint;
        long j2 = bLiveVoiceCall2.userRecvRewardPoint;
        if (j < j2) {
            bLiveVoiceCall.userRecvRewardPoint = j2;
        }
        long j3 = bLiveVoiceCall.popularity;
        long j4 = bLiveVoiceCall2.popularity;
        if (j3 < j4) {
            bLiveVoiceCall.popularity = j4;
        }
        long j5 = bLiveVoiceCall.contribution;
        long j6 = bLiveVoiceCall2.contribution;
        if (j5 < j6) {
            bLiveVoiceCall.contribution = j6;
        }
        if (bLiveVoiceCall2.equals(bLiveVoiceCall)) {
            return;
        }
        m136881t(bLiveVoiceCall, bLiveVoiceCall2);
        m136863F(bLiveVoiceCall2, null);
        this.f111353b.onNext(new C17564a(2, bLiveVoiceCall2));
    }

    /* JADX INFO: renamed from: E */
    public final void m136862E(BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2) {
        if (bLiveVoiceCall2 == null) {
            nsv<h64> nsvVarM97108D = this.f111352a.m97108D(bLiveVoiceCall.user);
            if (nsvVarM97108D == null) {
                return;
            }
            this.f111352a.m97130x(bLiveVoiceCall, nsvVarM97108D);
            this.f111353b.onNext(new C17564a(4, bLiveVoiceCall));
            return;
        }
        if (bLiveVoiceCall2.equals(bLiveVoiceCall)) {
            return;
        }
        m136881t(bLiveVoiceCall, bLiveVoiceCall2);
        this.f111352a.m97126V(bLiveVoiceCall);
        this.f111353b.onNext(new C17564a(2, bLiveVoiceCall2));
    }

    /* JADX INFO: renamed from: F */
    public final void m136863F(BLiveVoiceCall bLiveVoiceCall, nsv<h64> nsvVar) {
        this.f111355d.put(Integer.valueOf(bLiveVoiceCall.position), bLiveVoiceCall);
        ado0 ado0Var = this.f111352a;
        if (nsvVar == null) {
            ado0Var.m97126V(bLiveVoiceCall);
        } else {
            ado0Var.m97130x(bLiveVoiceCall, nsvVar);
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m136864G(ado0 ado0Var) {
        if (!this.f111357f) {
            return true;
        }
        this.f111355d.clear();
        for (BLiveVoiceCall bLiveVoiceCall : ado0Var.m97109E()) {
            int i = bLiveVoiceCall.position;
            if (m136882u(i)) {
                m136886y(bLiveVoiceCall, "position index illegal");
                return false;
            }
            this.f111355d.put(Integer.valueOf(i), bLiveVoiceCall);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m136865d(ezm0 ezm0Var) {
        BLiveVoiceCall bLiveVoiceCall = ezm0Var.f96607a;
        nsv<h64> nsvVar = ezm0Var.f96608b;
        if (nsvVar == null || TextUtils.isEmpty(nsvVar.f143542a.f107997a) || TextUtils.isEmpty(nsvVar.f143542a.f107998b)) {
            return;
        }
        if (!this.f111357f) {
            m136867f(bLiveVoiceCall, nsvVar);
        } else if (m136882u(bLiveVoiceCall.position)) {
            m136886y(bLiveVoiceCall, "position index illegal");
        } else {
            m136866e(bLiveVoiceCall, nsvVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m136866e(BLiveVoiceCall bLiveVoiceCall, nsv<h64> nsvVar) {
        BLiveVoiceCall bLiveVoiceCallM97106B = this.f111352a.m97106B(bLiveVoiceCall.f45333id);
        if (bLiveVoiceCallM97106B == null) {
            m136863F(bLiveVoiceCall, nsvVar);
            this.f111353b.onNext(new C17564a(4, bLiveVoiceCall));
        } else {
            if (bLiveVoiceCallM97106B.equals(bLiveVoiceCall)) {
                return;
            }
            m136881t(bLiveVoiceCall, bLiveVoiceCallM97106B);
            m136863F(bLiveVoiceCallM97106B, nsvVar);
            this.f111353b.onNext(new C17564a(2, bLiveVoiceCallM97106B));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m136867f(BLiveVoiceCall bLiveVoiceCall, nsv<h64> nsvVar) {
        BLiveVoiceCall bLiveVoiceCallM97106B = this.f111352a.m97106B(bLiveVoiceCall.f45333id);
        if (bLiveVoiceCallM97106B == null) {
            this.f111352a.m97130x(bLiveVoiceCall, nsvVar);
            this.f111353b.onNext(new C17564a(4, bLiveVoiceCall));
        } else {
            if (bLiveVoiceCallM97106B.equals(bLiveVoiceCall)) {
                return;
            }
            m136881t(bLiveVoiceCall, bLiveVoiceCallM97106B);
            this.f111352a.m97126V(bLiveVoiceCallM97106B);
            this.f111353b.onNext(new C17564a(2, bLiveVoiceCallM97106B));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m136868g(nsv<h64> nsvVar, String str) {
        if (this.f111352a.m97111G(nsvVar.f143542a.f107997a) == null) {
            this.f111352a.m97131y(nsvVar, str);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m136869h(C17565b c17565b) {
        this.f111354c = c17565b;
        if (c17565b != null) {
            c17565b.f111361a = this;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m136870i(BLiveVoiceCall bLiveVoiceCall) {
        BLiveVoiceCall bLiveVoiceCallM97106B = this.f111352a.m97106B(bLiveVoiceCall.f45333id);
        if (m136882u(bLiveVoiceCall.position)) {
            m136886y(bLiveVoiceCall, "position index illegal");
            return;
        }
        if (bLiveVoiceCallM97106B == null) {
            return;
        }
        long j = bLiveVoiceCall.userRecvRewardPoint;
        long j2 = bLiveVoiceCallM97106B.userRecvRewardPoint;
        if (j < j2) {
            bLiveVoiceCall.userRecvRewardPoint = j2;
        }
        long j3 = bLiveVoiceCall.popularity;
        long j4 = bLiveVoiceCallM97106B.popularity;
        if (j3 < j4) {
            bLiveVoiceCall.popularity = j4;
        }
        long j5 = bLiveVoiceCall.contribution;
        long j6 = bLiveVoiceCallM97106B.contribution;
        if (j5 < j6) {
            bLiveVoiceCall.contribution = j6;
        }
        if (bLiveVoiceCallM97106B.equals(bLiveVoiceCall)) {
            return;
        }
        bLiveVoiceCall.intendPosition = bLiveVoiceCallM97106B.position;
        m136881t(bLiveVoiceCall, bLiveVoiceCallM97106B);
        this.f111355d.remove(Integer.valueOf(bLiveVoiceCall.intendPosition));
        this.f111355d.put(Integer.valueOf(bLiveVoiceCall.position), bLiveVoiceCall);
        this.f111352a.m97126V(bLiveVoiceCall);
        this.f111353b.onNext(new C17564a(5, bLiveVoiceCall));
    }

    /* JADX INFO: renamed from: j */
    public BLiveVoiceCall m136871j(String str) {
        return this.f111352a.m97106B(str);
    }

    /* JADX INFO: renamed from: k */
    public BLiveVoiceCall m136872k(int i) {
        return this.f111355d.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: l */
    public BLiveVoiceCall m136873l(String str) {
        return this.f111352a.m97107C(str);
    }

    /* JADX INFO: renamed from: m */
    public nsv<h64> m136874m(String str) {
        return this.f111352a.m97108D(str);
    }

    /* JADX INFO: renamed from: n */
    public h64 m136875n(String str) {
        nsv<h64> nsvVarM136874m = m136874m(str);
        if (nsvVarM136874m == null) {
            return null;
        }
        return nsvVarM136874m.f143542a;
    }

    /* JADX INFO: renamed from: o */
    public nsv<h64> m136876o(Integer num) {
        BLiveVoiceCall bLiveVoiceCall = this.f111355d.get(num);
        if (bLiveVoiceCall != null) {
            return this.f111352a.m97108D(bLiveVoiceCall.user);
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public List<BLiveVoiceCall> m136877p() {
        return this.f111352a.m97109E();
    }

    /* JADX INFO: renamed from: q */
    public List<BLiveMember> m136878q() {
        return this.f111352a.m97110F();
    }

    /* JADX INFO: renamed from: r */
    public ado0 m136879r() {
        return this.f111352a;
    }

    /* JADX INFO: renamed from: s */
    public List<BLiveVoiceCall> m136880s() {
        return this.f111352a.m97113I();
    }

    /* JADX INFO: renamed from: t */
    public final BLiveVoiceCall m136881t(BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2) {
        bLiveVoiceCall2.f45333id = bLiveVoiceCall.f45333id;
        bLiveVoiceCall2.voiceLiveId = bLiveVoiceCall.voiceLiveId;
        bLiveVoiceCall2.state = bLiveVoiceCall.state;
        bLiveVoiceCall2.source = bLiveVoiceCall.source;
        bLiveVoiceCall2.user = bLiveVoiceCall.user;
        bLiveVoiceCall2.anchor = bLiveVoiceCall.anchor;
        bLiveVoiceCall2.userSendRewardPoint = bLiveVoiceCall.userSendRewardPoint;
        bLiveVoiceCall2.userRecvRewardPoint = bLiveVoiceCall.userRecvRewardPoint;
        bLiveVoiceCall2.intendPosition = bLiveVoiceCall.intendPosition;
        bLiveVoiceCall2.position = bLiveVoiceCall.position;
        bLiveVoiceCall2.mutedByUser = bLiveVoiceCall.mutedByUser;
        bLiveVoiceCall2.mutedByAnchor = bLiveVoiceCall.mutedByAnchor;
        bLiveVoiceCall2.isAway = bLiveVoiceCall.isAway;
        bLiveVoiceCall2.inviteId = bLiveVoiceCall.inviteId;
        if (!TextUtils.isEmpty(bLiveVoiceCall.userName)) {
            bLiveVoiceCall2.userName = bLiveVoiceCall.userName;
        }
        if (!TextUtils.isEmpty(bLiveVoiceCall.anchorUserName)) {
            bLiveVoiceCall2.anchorUserName = bLiveVoiceCall.anchorUserName;
        }
        if (!TextUtils.isEmpty(bLiveVoiceCall.userPicture)) {
            bLiveVoiceCall2.userPicture = bLiveVoiceCall.userPicture;
        }
        if (!TextUtils.isEmpty(bLiveVoiceCall.anchorPicture)) {
            bLiveVoiceCall2.anchorPicture = bLiveVoiceCall.anchorPicture;
        }
        bLiveVoiceCall2.hangupReason = bLiveVoiceCall.hangupReason;
        bLiveVoiceCall2.role = bLiveVoiceCall.role;
        bLiveVoiceCall2.awayReason = bLiveVoiceCall.awayReason;
        bLiveVoiceCall2.popularity = bLiveVoiceCall.popularity;
        bLiveVoiceCall2.contribution = bLiveVoiceCall.contribution;
        return bLiveVoiceCall2;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m136882u(int i) {
        return i < 0 || i >= this.f111356e;
    }

    /* JADX INFO: renamed from: v */
    public void m136883v(int i) {
        this.f111356e = i;
        this.f111355d.clear();
        ado0 ado0Var = new ado0();
        this.f111352a = ado0Var;
        ado0Var.m97129Y(false);
        this.f111357f = true;
    }

    /* JADX INFO: renamed from: w */
    public final void m136884w(String str) {
        BLiveVoiceCall bLiveVoiceCallM97106B = this.f111352a.m97106B(str);
        if (bLiveVoiceCallM97106B == null) {
            return;
        }
        this.f111352a.m97123S(bLiveVoiceCallM97106B);
        this.f111353b.onNext(new C17564a(3, bLiveVoiceCallM97106B));
        if (this.f111357f) {
            this.f111355d.remove(Integer.valueOf(bLiveVoiceCallM97106B.position));
        }
    }

    /* JADX INFO: renamed from: x */
    public void m136885x(String str) {
        this.f111352a.m97124T(str);
    }

    /* JADX INFO: renamed from: y */
    public final void m136886y(BLiveVoiceCall bLiveVoiceCall, String str) {
        bLiveVoiceCall.toString();
        CrashHelper.m82480d(new IllegalArgumentException(str + ("position:" + bLiveVoiceCall.position + "count:" + this.f111356e)), 10000);
    }

    /* JADX INFO: renamed from: z */
    public void m136887z(C22507a<C17564a> c22507a) {
        this.f111353b = c22507a;
    }

    /* JADX INFO: renamed from: l.hrk0$a */
    public static class C17564a {

        /* JADX INFO: renamed from: a */
        public BLiveVoiceCall f111359a;

        /* JADX INFO: renamed from: b */
        public int f111360b;

        public C17564a(int i) {
            this.f111360b = i;
            this.f111359a = null;
        }

        /* JADX INFO: renamed from: a */
        public boolean m136888a() {
            return this.f111359a != null;
        }

        public C17564a(int i, BLiveVoiceCall bLiveVoiceCall) {
            this.f111360b = i;
            this.f111359a = bLiveVoiceCall;
        }
    }
}
