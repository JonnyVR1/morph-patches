package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes5.dex */
public class cud {

    /* JADX INFO: renamed from: a */
    public boolean f82554a;

    /* JADX INFO: renamed from: b */
    public String f82555b = "position index illegal";

    /* JADX INFO: renamed from: c */
    public String f82556c = "position has already a diff call";

    /* JADX INFO: renamed from: d */
    public BLiveCall f82557d = null;

    /* JADX INFO: renamed from: e */
    public int f82558e = 1;

    /* JADX INFO: renamed from: f */
    public C22392a<cud> f82559f = C22392a.m221512b();

    /* JADX INFO: renamed from: g */
    public i0s f82560g = new i0s(new ArrayList(), new ArrayList());

    /* JADX INFO: renamed from: h */
    public BLiveCall[] f82561h = new BLiveCall[3];

    public cud(boolean z) {
        this.f82554a = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m108748a(BLiveCall bLiveCall, BLiveCall bLiveCall2) {
        int i = bLiveCall.position;
        int i2 = bLiveCall2.position;
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 0 : -1;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m108749b(ArrayList arrayList, BLiveCall bLiveCall) {
        if (bLiveCall != null) {
            arrayList.add(bLiveCall);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m108750c(z24 z24Var) {
        BLiveCall bLiveCall = z24Var.f201156a;
        i54 i54Var = z24Var.f201157b;
        if (m108765r(bLiveCall.getDeputyViewPos())) {
            m108768u(this.f82555b);
            return;
        }
        if (this.f82561h[bLiveCall.getDeputyViewPos()] != null) {
            this.f82560g.m133926t(this.f82561h[bLiveCall.getDeputyViewPos()]);
        }
        this.f82561h[bLiveCall.getDeputyViewPos()] = bLiveCall;
        this.f82560g.m133914h(bLiveCall, i54Var);
        m108769v(4, bLiveCall);
    }

    /* JADX INFO: renamed from: d */
    public BLiveCall m108751d(int i) {
        return this.f82561h[i];
    }

    /* JADX INFO: renamed from: e */
    public BLiveCall m108752e(String str) {
        int i = 0;
        while (true) {
            BLiveCall[] bLiveCallArr = this.f82561h;
            if (i >= bLiveCallArr.length) {
                return null;
            }
            BLiveCall bLiveCall = bLiveCallArr[i];
            if (bLiveCall != null && TextUtils.equals(bLiveCall.f44342id, str)) {
                return this.f82561h[i];
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: f */
    public BLiveCall m108753f(String str) {
        return this.f82560g.m133916j(str);
    }

    /* JADX INFO: renamed from: g */
    public i54 m108754g(Integer num) {
        if (this.f82561h[num.intValue()] != null) {
            return this.f82560g.m133917k(this.f82561h[num.intValue()].user);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public BLiveCall m108755h() {
        for (BLiveCall bLiveCall : this.f82560g.m133919m()) {
            if (v44.m196940h(bLiveCall)) {
                return bLiveCall;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public BLiveCall m108756i() {
        for (BLiveCall bLiveCall : this.f82560g.m133919m()) {
            if (v44.m196946n(bLiveCall) || v44.m196945m(bLiveCall)) {
                return bLiveCall;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public C22306c<cud> m108757j() {
        return this.f82559f.asObservable();
    }

    /* JADX INFO: renamed from: k */
    public BLiveCall m108758k(int i) {
        if (m108765r(i)) {
            return null;
        }
        return this.f82561h[i];
    }

    /* JADX INFO: renamed from: l */
    public List<BLiveCall> m108759l() {
        final ArrayList arrayList = new ArrayList();
        vwb.m200287A(this.f82561h, new e30() { // from class: l.aud
            @Override // p149l.e30
            public final void call(Object obj) {
                cud.m108749b(arrayList, (BLiveCall) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public i0s m108760m() {
        return this.f82560g;
    }

    /* JADX INFO: renamed from: n */
    public List<BLiveCall> m108761n() {
        ArrayList arrayList = new ArrayList(this.f82560g.m133920n());
        Collections.sort(arrayList, new Comparator() { // from class: l.bud
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return cud.m108748a((BLiveCall) obj, (BLiveCall) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public boolean m108762o() {
        return this.f82557d != null;
    }

    /* JADX INFO: renamed from: q */
    public final BLiveCall m108764q(BLiveCall bLiveCall, BLiveCall bLiveCall2) {
        bLiveCall2.f44342id = bLiveCall.f44342id;
        bLiveCall2.liveId = bLiveCall.liveId;
        bLiveCall2.state = bLiveCall.state;
        bLiveCall2.opState = bLiveCall.opState;
        bLiveCall2.source = bLiveCall.source;
        bLiveCall2.user = bLiveCall.user;
        bLiveCall2.anchor = bLiveCall.anchor;
        bLiveCall2.userSendRewardPoint = bLiveCall.userSendRewardPoint;
        bLiveCall2.userRecvRewardPoint = bLiveCall.userRecvRewardPoint;
        bLiveCall2.intendPosition = bLiveCall.intendPosition;
        bLiveCall2.position = bLiveCall.position;
        bLiveCall2.mutedByUser = bLiveCall.mutedByUser;
        bLiveCall2.mutedByAnchor = bLiveCall.mutedByAnchor;
        bLiveCall2.isAway = bLiveCall.isAway;
        bLiveCall2.inviteId = bLiveCall.inviteId;
        if (!TextUtils.isEmpty(bLiveCall.userName)) {
            bLiveCall2.userName = bLiveCall.userName;
        }
        if (!TextUtils.isEmpty(bLiveCall.anchorUserName)) {
            bLiveCall2.anchorUserName = bLiveCall.anchorUserName;
        }
        if (!TextUtils.isEmpty(bLiveCall.userPicture)) {
            bLiveCall2.userPicture = bLiveCall.userPicture;
        }
        if (!TextUtils.isEmpty(bLiveCall.anchorPicture)) {
            bLiveCall2.anchorPicture = bLiveCall.anchorPicture;
        }
        long j = bLiveCall.videoInviteTime;
        if (j > 0) {
            bLiveCall2.videoInviteTime = j;
        }
        bLiveCall2.hangupReason = bLiveCall.hangupReason;
        return bLiveCall2;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m108765r(int i) {
        return i < 0 || i > 2;
    }

    /* JADX INFO: renamed from: s */
    public void m108766s() {
        this.f82560g.m133925s();
    }

    /* JADX INFO: renamed from: t */
    public void m108767t(String str) {
        int i = 0;
        while (true) {
            BLiveCall[] bLiveCallArr = this.f82561h;
            if (i >= bLiveCallArr.length) {
                break;
            }
            BLiveCall bLiveCall = bLiveCallArr[i];
            if (bLiveCall != null && TextUtils.equals(str, bLiveCall.f44342id)) {
                this.f82561h[i] = null;
            }
            i++;
        }
        BLiveCall bLiveCallM133915i = this.f82560g.m133915i(str);
        if (bLiveCallM133915i != null) {
            this.f82560g.m133926t(bLiveCallM133915i);
            m108769v(3, bLiveCallM133915i);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m108768u(String str) {
        CrashHelper.m81296c(new IllegalArgumentException(str));
    }

    /* JADX INFO: renamed from: v */
    public final void m108769v(int i, BLiveCall bLiveCall) {
        if (i != 1 && bLiveCall == null) {
            m108763p("op is " + i + ", opdata is null");
        }
        this.f82558e = i;
        this.f82557d = bLiveCall;
        m108763p("send data");
        this.f82559f.onNext(this);
    }

    /* JADX INFO: renamed from: w */
    public void m108770w(@NonNull BLiveCall bLiveCall) {
        if (m108765r(bLiveCall.getDeputyViewPos())) {
            m108768u(this.f82555b);
        }
        BLiveCall bLiveCallM108764q = m108764q(bLiveCall, this.f82561h[bLiveCall.getDeputyViewPos()]);
        this.f82561h[bLiveCall.getDeputyViewPos()] = bLiveCallM108764q;
        this.f82560g.m133928v(bLiveCallM108764q);
        m108769v(2, bLiveCallM108764q);
    }

    /* JADX INFO: renamed from: x */
    public void m108771x(i0s i0sVar) {
        List<BLiveCall> listM133919m = i0sVar.m133919m();
        Arrays.fill(this.f82561h, (Object) null);
        for (BLiveCall bLiveCall : listM133919m) {
            int deputyViewPos = bLiveCall.getDeputyViewPos();
            if (m108765r(deputyViewPos)) {
                m108768u(this.f82555b);
                return;
            }
            this.f82561h[deputyViewPos] = bLiveCall;
        }
        this.f82560g = i0sVar;
        m108769v(1, null);
    }

    /* JADX INFO: renamed from: p */
    public void m108763p(String str) {
    }
}
