package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class j2s {

    /* JADX INFO: renamed from: a */
    public List<BLiveCall> f118086a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, BLiveCall> f118087b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, h64> f118088c;

    public j2s(List<BLiveCall> list, List<User> list2) {
        this.f118087b = new HashMap<>();
        this.f118088c = new HashMap<>();
        this.f118086a = list == null ? new ArrayList<>() : list;
        jyb.m147537z(list2, new y20() { // from class: l.d2s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84816a.m143255o((User) obj);
            }
        });
        m143261u();
        jyb.m147537z(this.f118086a, new y20() { // from class: l.e2s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91839a.m143256p((BLiveCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public void m143248h(BLiveCall bLiveCall, h64 h64Var) {
        this.f118086a.add(bLiveCall);
        this.f118088c.put(bLiveCall.user, h64Var);
        this.f118087b.put(bLiveCall.f45190id, bLiveCall);
    }

    /* JADX INFO: renamed from: i */
    public BLiveCall m143249i(String str) {
        return this.f118087b.get(str);
    }

    /* JADX INFO: renamed from: j */
    public BLiveCall m143250j(final String str) {
        return (BLiveCall) jyb.m147529r(this.f118086a, new qcj() { // from class: l.c2s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveCall) obj).user, str));
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public h64 m143251k(String str) {
        return this.f118088c.get(str);
    }

    /* JADX INFO: renamed from: l */
    public int m143252l() {
        return jyb.m147522n(this.f118086a, new qcj() { // from class: l.i2s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveCall bLiveCall = (BLiveCall) obj;
                return Boolean.valueOf((u54.m194528h(bLiveCall) || u54.m194529i(bLiveCall)) ? false : true);
            }
        }).size();
    }

    /* JADX INFO: renamed from: m */
    public List<BLiveCall> m143253m() {
        if (this.f118086a == null) {
            this.f118086a = new ArrayList();
        }
        return this.f118086a;
    }

    /* JADX INFO: renamed from: n */
    public Collection<BLiveCall> m143254n() {
        return this.f118087b.values();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m143255o(User user) {
        this.f118088c.put(user.f56859id, new h64(user.f56859id, user.name, user.m61308fp().profileSmall().formatted()));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m143256p(BLiveCall bLiveCall) {
        this.f118087b.put(bLiveCall.f45190id, bLiveCall);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m143257q(List list, j2s j2sVar, BLiveCall bLiveCall) {
        if (list.contains(bLiveCall.state)) {
            this.f118086a.add(bLiveCall);
            this.f118087b.put(bLiveCall.f45190id, bLiveCall);
            h64 h64VarM143251k = j2sVar.m143251k(bLiveCall.user);
            if (h64VarM143251k != null) {
                this.f118088c.put(bLiveCall.user, h64VarM143251k);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m143258r(BLiveCall bLiveCall) {
        h64 h64Var = this.f118088c.get(bLiveCall.user);
        if (h64Var != null) {
            bLiveCall.userName = h64Var.f107998b;
            bLiveCall.userPicture = h64Var.f107999c;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m143259s() {
        this.f118087b.clear();
    }

    /* JADX INFO: renamed from: t */
    public void m143260t(final BLiveCall bLiveCall) {
        jyb.m147503d0(this.f118086a, new qcj() { // from class: l.g2s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveCall) obj).f45190id, bLiveCall.f45190id));
            }
        });
        this.f118088c.remove(bLiveCall.user);
        this.f118087b.remove(bLiveCall.f45190id);
    }

    /* JADX INFO: renamed from: u */
    public final void m143261u() {
        jyb.m147537z(this.f118086a, new y20() { // from class: l.f2s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96913a.m143258r((BLiveCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void m143262v(BLiveCall bLiveCall) {
        this.f118086a.remove(m143249i(bLiveCall.f45190id));
        this.f118086a.add(bLiveCall);
        this.f118087b.put(bLiveCall.f45190id, bLiveCall);
    }

    public j2s(final j2s j2sVar, String... strArr) {
        this.f118087b = new HashMap<>();
        this.f118088c = new HashMap<>();
        this.f118086a = new ArrayList();
        final List listAsList = Arrays.asList(strArr);
        jyb.m147537z(j2sVar.m143253m(), new y20() { // from class: l.h2s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107582a.m143257q(listAsList, j2sVar, (BLiveCall) obj);
            }
        });
    }
}
