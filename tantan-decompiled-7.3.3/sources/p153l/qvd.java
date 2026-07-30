package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
public class qvd {

    /* JADX INFO: renamed from: a */
    public boolean f159732a;

    /* JADX INFO: renamed from: b */
    public String f159733b = "position index illegal";

    /* JADX INFO: renamed from: c */
    public String f159734c = "position has already a diff call";

    /* JADX INFO: renamed from: d */
    public BLiveCall f159735d = null;

    /* JADX INFO: renamed from: e */
    public int f159736e = 1;

    /* JADX INFO: renamed from: f */
    public C22507a<qvd> f159737f = C22507a.m222758b();

    /* JADX INFO: renamed from: g */
    public j2s f159738g = new j2s(new ArrayList(), new ArrayList());

    /* JADX INFO: renamed from: h */
    public BLiveCall[] f159739h = new BLiveCall[3];

    public qvd(boolean z) {
        this.f159732a = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m178258a(BLiveCall bLiveCall, BLiveCall bLiveCall2) {
        int i = bLiveCall.position;
        int i2 = bLiveCall2.position;
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 0 : -1;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m178259b(ArrayList arrayList, BLiveCall bLiveCall) {
        if (bLiveCall != null) {
            arrayList.add(bLiveCall);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m178260c(y34 y34Var) {
        BLiveCall bLiveCall = y34Var.f197301a;
        h64 h64Var = y34Var.f197302b;
        if (m178275r(bLiveCall.getDeputyViewPos())) {
            m178278u(this.f159733b);
            return;
        }
        if (this.f159739h[bLiveCall.getDeputyViewPos()] != null) {
            this.f159738g.m143260t(this.f159739h[bLiveCall.getDeputyViewPos()]);
        }
        this.f159739h[bLiveCall.getDeputyViewPos()] = bLiveCall;
        this.f159738g.m143248h(bLiveCall, h64Var);
        m178279v(4, bLiveCall);
    }

    /* JADX INFO: renamed from: d */
    public BLiveCall m178261d(int i) {
        return this.f159739h[i];
    }

    /* JADX INFO: renamed from: e */
    public BLiveCall m178262e(String str) {
        int i = 0;
        while (true) {
            BLiveCall[] bLiveCallArr = this.f159739h;
            if (i >= bLiveCallArr.length) {
                return null;
            }
            BLiveCall bLiveCall = bLiveCallArr[i];
            if (bLiveCall != null && TextUtils.equals(bLiveCall.f45190id, str)) {
                return this.f159739h[i];
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: f */
    public BLiveCall m178263f(String str) {
        return this.f159738g.m143250j(str);
    }

    /* JADX INFO: renamed from: g */
    public h64 m178264g(Integer num) {
        if (this.f159739h[num.intValue()] != null) {
            return this.f159738g.m143251k(this.f159739h[num.intValue()].user);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public BLiveCall m178265h() {
        for (BLiveCall bLiveCall : this.f159738g.m143253m()) {
            if (u54.m194528h(bLiveCall)) {
                return bLiveCall;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public BLiveCall m178266i() {
        for (BLiveCall bLiveCall : this.f159738g.m143253m()) {
            if (u54.m194534n(bLiveCall) || u54.m194533m(bLiveCall)) {
                return bLiveCall;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public C22421c<qvd> m178267j() {
        return this.f159737f.asObservable();
    }

    /* JADX INFO: renamed from: k */
    public BLiveCall m178268k(int i) {
        if (m178275r(i)) {
            return null;
        }
        return this.f159739h[i];
    }

    /* JADX INFO: renamed from: l */
    public List<BLiveCall> m178269l() {
        final ArrayList arrayList = new ArrayList();
        jyb.m147470A(this.f159739h, new y20() { // from class: l.ovd
            @Override // p153l.y20
            public final void call(Object obj) {
                qvd.m178259b(arrayList, (BLiveCall) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public j2s m178270m() {
        return this.f159738g;
    }

    /* JADX INFO: renamed from: n */
    public List<BLiveCall> m178271n() {
        ArrayList arrayList = new ArrayList(this.f159738g.m143254n());
        Collections.sort(arrayList, new Comparator() { // from class: l.pvd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return qvd.m178258a((BLiveCall) obj, (BLiveCall) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public boolean m178272o() {
        return this.f159735d != null;
    }

    /* JADX INFO: renamed from: q */
    public final BLiveCall m178274q(BLiveCall bLiveCall, BLiveCall bLiveCall2) {
        bLiveCall2.f45190id = bLiveCall.f45190id;
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
    public final boolean m178275r(int i) {
        return i < 0 || i > 2;
    }

    /* JADX INFO: renamed from: s */
    public void m178276s() {
        this.f159738g.m143259s();
    }

    /* JADX INFO: renamed from: t */
    public void m178277t(String str) {
        int i = 0;
        while (true) {
            BLiveCall[] bLiveCallArr = this.f159739h;
            if (i >= bLiveCallArr.length) {
                break;
            }
            BLiveCall bLiveCall = bLiveCallArr[i];
            if (bLiveCall != null && TextUtils.equals(str, bLiveCall.f45190id)) {
                this.f159739h[i] = null;
            }
            i++;
        }
        BLiveCall bLiveCallM143249i = this.f159738g.m143249i(str);
        if (bLiveCallM143249i != null) {
            this.f159738g.m143260t(bLiveCallM143249i);
            m178279v(3, bLiveCallM143249i);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m178278u(String str) {
        CrashHelper.m82479c(new IllegalArgumentException(str));
    }

    /* JADX INFO: renamed from: v */
    public final void m178279v(int i, BLiveCall bLiveCall) {
        if (i != 1 && bLiveCall == null) {
            m178273p("op is " + i + ", opdata is null");
        }
        this.f159736e = i;
        this.f159735d = bLiveCall;
        m178273p("send data");
        this.f159737f.onNext(this);
    }

    /* JADX INFO: renamed from: w */
    public void m178280w(@NonNull BLiveCall bLiveCall) {
        if (m178275r(bLiveCall.getDeputyViewPos())) {
            m178278u(this.f159733b);
        }
        BLiveCall bLiveCallM178274q = m178274q(bLiveCall, this.f159739h[bLiveCall.getDeputyViewPos()]);
        this.f159739h[bLiveCall.getDeputyViewPos()] = bLiveCallM178274q;
        this.f159738g.m143262v(bLiveCallM178274q);
        m178279v(2, bLiveCallM178274q);
    }

    /* JADX INFO: renamed from: x */
    public void m178281x(j2s j2sVar) {
        List<BLiveCall> listM143253m = j2sVar.m143253m();
        Arrays.fill(this.f159739h, (Object) null);
        for (BLiveCall bLiveCall : listM143253m) {
            int deputyViewPos = bLiveCall.getDeputyViewPos();
            if (m178275r(deputyViewPos)) {
                m178278u(this.f159733b);
                return;
            }
            this.f159739h[deputyViewPos] = bLiveCall;
        }
        this.f159738g = j2sVar;
        m178279v(1, null);
    }

    /* JADX INFO: renamed from: p */
    public void m178273p(String str) {
    }
}
