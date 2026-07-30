package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.List;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes5.dex */
public class bik0 {

    /* JADX INFO: renamed from: b */
    public C22392a<C15867a> f75766b;

    /* JADX INFO: renamed from: c */
    public C15868b f75767c;

    /* JADX INFO: renamed from: e */
    public int f75769e;

    /* JADX INFO: renamed from: d */
    public final HashMap<Integer, BLiveVoiceCall> f75768d = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public boolean f75770f = false;

    /* JADX INFO: renamed from: g */
    public final String f75771g = "position index illegal";

    /* JADX INFO: renamed from: a */
    public w3o0 f75765a = new w3o0();

    /* JADX INFO: renamed from: l.bik0$b */
    public static class C15868b {

        /* JADX INFO: renamed from: a */
        public bik0 f75774a;

        /* JADX INFO: renamed from: b */
        public void m102080b(aqm0 aqm0Var) {
            bik0 bik0Var = this.f75774a;
            if (bik0Var != null) {
                bik0Var.m102055d(aqm0Var);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m102081c(BLiveVoiceCall bLiveVoiceCall) {
            bik0 bik0Var = this.f75774a;
            if (bik0Var != null) {
                bik0Var.m102060i(bLiveVoiceCall);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m102082d(BLiveVoiceCall bLiveVoiceCall) {
            bik0 bik0Var = this.f75774a;
            if (bik0Var != null) {
                bik0Var.m102074w(bLiveVoiceCall.f44485id);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m102083e(w3o0 w3o0Var) {
            bik0 bik0Var = this.f75774a;
            if (bik0Var != null) {
                bik0Var.m102048A(w3o0Var);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m102084f(BLiveVoiceCall bLiveVoiceCall) {
            bik0 bik0Var = this.f75774a;
            if (bik0Var != null) {
                bik0Var.m102049B(bLiveVoiceCall);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m102048A(w3o0 w3o0Var) {
        if (m102054G(w3o0Var)) {
            this.f75765a = w3o0Var;
            this.f75766b.onNext(new C15867a(1));
        }
    }

    /* JADX INFO: renamed from: B */
    public void m102049B(BLiveVoiceCall bLiveVoiceCall) {
        BLiveVoiceCall bLiveVoiceCallM201349B = this.f75765a.m201349B(bLiveVoiceCall.f44485id);
        if (this.f75770f) {
            m102051D(bLiveVoiceCall, bLiveVoiceCallM201349B);
        } else {
            m102052E(bLiveVoiceCall, bLiveVoiceCallM201349B);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m102050C(BLiveVoiceCall bLiveVoiceCall) {
        this.f75765a.m201369V(bLiveVoiceCall);
        this.f75766b.onNext(new C15867a(2, bLiveVoiceCall));
    }

    /* JADX INFO: renamed from: D */
    public final void m102051D(BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2) {
        if (m102072u(bLiveVoiceCall.position)) {
            m102076y(bLiveVoiceCall, "position index illegal");
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
        m102071t(bLiveVoiceCall, bLiveVoiceCall2);
        m102053F(bLiveVoiceCall2, null);
        this.f75766b.onNext(new C15867a(2, bLiveVoiceCall2));
    }

    /* JADX INFO: renamed from: E */
    public final void m102052E(BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2) {
        if (bLiveVoiceCall2 == null) {
            mqv<i54> mqvVarM201351D = this.f75765a.m201351D(bLiveVoiceCall.user);
            if (mqvVarM201351D == null) {
                return;
            }
            this.f75765a.m201373x(bLiveVoiceCall, mqvVarM201351D);
            this.f75766b.onNext(new C15867a(4, bLiveVoiceCall));
            return;
        }
        if (bLiveVoiceCall2.equals(bLiveVoiceCall)) {
            return;
        }
        m102071t(bLiveVoiceCall, bLiveVoiceCall2);
        this.f75765a.m201369V(bLiveVoiceCall);
        this.f75766b.onNext(new C15867a(2, bLiveVoiceCall2));
    }

    /* JADX INFO: renamed from: F */
    public final void m102053F(BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar) {
        this.f75768d.put(Integer.valueOf(bLiveVoiceCall.position), bLiveVoiceCall);
        w3o0 w3o0Var = this.f75765a;
        if (mqvVar == null) {
            w3o0Var.m201369V(bLiveVoiceCall);
        } else {
            w3o0Var.m201373x(bLiveVoiceCall, mqvVar);
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m102054G(w3o0 w3o0Var) {
        if (!this.f75770f) {
            return true;
        }
        this.f75768d.clear();
        for (BLiveVoiceCall bLiveVoiceCall : w3o0Var.m201352E()) {
            int i = bLiveVoiceCall.position;
            if (m102072u(i)) {
                m102076y(bLiveVoiceCall, "position index illegal");
                return false;
            }
            this.f75768d.put(Integer.valueOf(i), bLiveVoiceCall);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m102055d(aqm0 aqm0Var) {
        BLiveVoiceCall bLiveVoiceCall = aqm0Var.f71175a;
        mqv<i54> mqvVar = aqm0Var.f71176b;
        if (mqvVar == null || TextUtils.isEmpty(mqvVar.f135304a.f111520a) || TextUtils.isEmpty(mqvVar.f135304a.f111521b)) {
            return;
        }
        if (!this.f75770f) {
            m102057f(bLiveVoiceCall, mqvVar);
        } else if (m102072u(bLiveVoiceCall.position)) {
            m102076y(bLiveVoiceCall, "position index illegal");
        } else {
            m102056e(bLiveVoiceCall, mqvVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m102056e(BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar) {
        BLiveVoiceCall bLiveVoiceCallM201349B = this.f75765a.m201349B(bLiveVoiceCall.f44485id);
        if (bLiveVoiceCallM201349B == null) {
            m102053F(bLiveVoiceCall, mqvVar);
            this.f75766b.onNext(new C15867a(4, bLiveVoiceCall));
        } else {
            if (bLiveVoiceCallM201349B.equals(bLiveVoiceCall)) {
                return;
            }
            m102071t(bLiveVoiceCall, bLiveVoiceCallM201349B);
            m102053F(bLiveVoiceCallM201349B, mqvVar);
            this.f75766b.onNext(new C15867a(2, bLiveVoiceCallM201349B));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m102057f(BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar) {
        BLiveVoiceCall bLiveVoiceCallM201349B = this.f75765a.m201349B(bLiveVoiceCall.f44485id);
        if (bLiveVoiceCallM201349B == null) {
            this.f75765a.m201373x(bLiveVoiceCall, mqvVar);
            this.f75766b.onNext(new C15867a(4, bLiveVoiceCall));
        } else {
            if (bLiveVoiceCallM201349B.equals(bLiveVoiceCall)) {
                return;
            }
            m102071t(bLiveVoiceCall, bLiveVoiceCallM201349B);
            this.f75765a.m201369V(bLiveVoiceCallM201349B);
            this.f75766b.onNext(new C15867a(2, bLiveVoiceCallM201349B));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m102058g(mqv<i54> mqvVar, String str) {
        if (this.f75765a.m201354G(mqvVar.f135304a.f111520a) == null) {
            this.f75765a.m201374y(mqvVar, str);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m102059h(C15868b c15868b) {
        this.f75767c = c15868b;
        if (c15868b != null) {
            c15868b.f75774a = this;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m102060i(BLiveVoiceCall bLiveVoiceCall) {
        BLiveVoiceCall bLiveVoiceCallM201349B = this.f75765a.m201349B(bLiveVoiceCall.f44485id);
        if (m102072u(bLiveVoiceCall.position)) {
            m102076y(bLiveVoiceCall, "position index illegal");
            return;
        }
        if (bLiveVoiceCallM201349B == null) {
            return;
        }
        long j = bLiveVoiceCall.userRecvRewardPoint;
        long j2 = bLiveVoiceCallM201349B.userRecvRewardPoint;
        if (j < j2) {
            bLiveVoiceCall.userRecvRewardPoint = j2;
        }
        long j3 = bLiveVoiceCall.popularity;
        long j4 = bLiveVoiceCallM201349B.popularity;
        if (j3 < j4) {
            bLiveVoiceCall.popularity = j4;
        }
        long j5 = bLiveVoiceCall.contribution;
        long j6 = bLiveVoiceCallM201349B.contribution;
        if (j5 < j6) {
            bLiveVoiceCall.contribution = j6;
        }
        if (bLiveVoiceCallM201349B.equals(bLiveVoiceCall)) {
            return;
        }
        bLiveVoiceCall.intendPosition = bLiveVoiceCallM201349B.position;
        m102071t(bLiveVoiceCall, bLiveVoiceCallM201349B);
        this.f75768d.remove(Integer.valueOf(bLiveVoiceCall.intendPosition));
        this.f75768d.put(Integer.valueOf(bLiveVoiceCall.position), bLiveVoiceCall);
        this.f75765a.m201369V(bLiveVoiceCall);
        this.f75766b.onNext(new C15867a(5, bLiveVoiceCall));
    }

    /* JADX INFO: renamed from: j */
    public BLiveVoiceCall m102061j(String str) {
        return this.f75765a.m201349B(str);
    }

    /* JADX INFO: renamed from: k */
    public BLiveVoiceCall m102062k(int i) {
        return this.f75768d.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: l */
    public BLiveVoiceCall m102063l(String str) {
        return this.f75765a.m201350C(str);
    }

    /* JADX INFO: renamed from: m */
    public mqv<i54> m102064m(String str) {
        return this.f75765a.m201351D(str);
    }

    /* JADX INFO: renamed from: n */
    public i54 m102065n(String str) {
        mqv<i54> mqvVarM102064m = m102064m(str);
        if (mqvVarM102064m == null) {
            return null;
        }
        return mqvVarM102064m.f135304a;
    }

    /* JADX INFO: renamed from: o */
    public mqv<i54> m102066o(Integer num) {
        BLiveVoiceCall bLiveVoiceCall = this.f75768d.get(num);
        if (bLiveVoiceCall != null) {
            return this.f75765a.m201351D(bLiveVoiceCall.user);
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public List<BLiveVoiceCall> m102067p() {
        return this.f75765a.m201352E();
    }

    /* JADX INFO: renamed from: q */
    public List<BLiveMember> m102068q() {
        return this.f75765a.m201353F();
    }

    /* JADX INFO: renamed from: r */
    public w3o0 m102069r() {
        return this.f75765a;
    }

    /* JADX INFO: renamed from: s */
    public List<BLiveVoiceCall> m102070s() {
        return this.f75765a.m201356I();
    }

    /* JADX INFO: renamed from: t */
    public final BLiveVoiceCall m102071t(BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2) {
        bLiveVoiceCall2.f44485id = bLiveVoiceCall.f44485id;
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
    public final boolean m102072u(int i) {
        return i < 0 || i >= this.f75769e;
    }

    /* JADX INFO: renamed from: v */
    public void m102073v(int i) {
        this.f75769e = i;
        this.f75768d.clear();
        w3o0 w3o0Var = new w3o0();
        this.f75765a = w3o0Var;
        w3o0Var.m201372Y(false);
        this.f75770f = true;
    }

    /* JADX INFO: renamed from: w */
    public final void m102074w(String str) {
        BLiveVoiceCall bLiveVoiceCallM201349B = this.f75765a.m201349B(str);
        if (bLiveVoiceCallM201349B == null) {
            return;
        }
        this.f75765a.m201366S(bLiveVoiceCallM201349B);
        this.f75766b.onNext(new C15867a(3, bLiveVoiceCallM201349B));
        if (this.f75770f) {
            this.f75768d.remove(Integer.valueOf(bLiveVoiceCallM201349B.position));
        }
    }

    /* JADX INFO: renamed from: x */
    public void m102075x(String str) {
        this.f75765a.m201367T(str);
    }

    /* JADX INFO: renamed from: y */
    public final void m102076y(BLiveVoiceCall bLiveVoiceCall, String str) {
        bLiveVoiceCall.toString();
        CrashHelper.m81297d(new IllegalArgumentException(str + ("position:" + bLiveVoiceCall.position + "count:" + this.f75769e)), 10000);
    }

    /* JADX INFO: renamed from: z */
    public void m102077z(C22392a<C15867a> c22392a) {
        this.f75766b = c22392a;
    }

    /* JADX INFO: renamed from: l.bik0$a */
    public static class C15867a {

        /* JADX INFO: renamed from: a */
        public BLiveVoiceCall f75772a;

        /* JADX INFO: renamed from: b */
        public int f75773b;

        public C15867a(int i) {
            this.f75773b = i;
            this.f75772a = null;
        }

        /* JADX INFO: renamed from: a */
        public boolean m102078a() {
            return this.f75772a != null;
        }

        public C15867a(int i, BLiveVoiceCall bLiveVoiceCall) {
            this.f75773b = i;
            this.f75772a = bLiveVoiceCall;
        }
    }
}
