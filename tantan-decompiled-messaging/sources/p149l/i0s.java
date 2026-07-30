package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class i0s {

    /* JADX INFO: renamed from: a */
    public List<BLiveCall> f110374a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, BLiveCall> f110375b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, i54> f110376c;

    public i0s(List<BLiveCall> list, List<User> list2) {
        this.f110375b = new HashMap<>();
        this.f110376c = new HashMap<>();
        this.f110374a = list == null ? new ArrayList<>() : list;
        vwb.m200354z(list2, new e30() { // from class: l.c0s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78172a.m133921o((User) obj);
            }
        });
        m133927u();
        vwb.m200354z(this.f110374a, new e30() { // from class: l.d0s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83211a.m133922p((BLiveCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public void m133914h(BLiveCall bLiveCall, i54 i54Var) {
        this.f110374a.add(bLiveCall);
        this.f110376c.put(bLiveCall.user, i54Var);
        this.f110375b.put(bLiveCall.f44342id, bLiveCall);
    }

    /* JADX INFO: renamed from: i */
    public BLiveCall m133915i(String str) {
        return this.f110375b.get(str);
    }

    /* JADX INFO: renamed from: j */
    public BLiveCall m133916j(final String str) {
        return (BLiveCall) vwb.m200346r(this.f110374a, new w9j() { // from class: l.b0s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveCall) obj).user, str));
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public i54 m133917k(String str) {
        return this.f110376c.get(str);
    }

    /* JADX INFO: renamed from: l */
    public int m133918l() {
        return vwb.m200339n(this.f110374a, new w9j() { // from class: l.h0s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveCall bLiveCall = (BLiveCall) obj;
                return Boolean.valueOf((v44.m196940h(bLiveCall) || v44.m196941i(bLiveCall)) ? false : true);
            }
        }).size();
    }

    /* JADX INFO: renamed from: m */
    public List<BLiveCall> m133919m() {
        if (this.f110374a == null) {
            this.f110374a = new ArrayList();
        }
        return this.f110374a;
    }

    /* JADX INFO: renamed from: n */
    public Collection<BLiveCall> m133920n() {
        return this.f110375b.values();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m133921o(User user) {
        this.f110376c.put(user.f56011id, new i54(user.f56011id, user.name, user.m60124fp().profileSmall().formatted()));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m133922p(BLiveCall bLiveCall) {
        this.f110375b.put(bLiveCall.f44342id, bLiveCall);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m133923q(List list, i0s i0sVar, BLiveCall bLiveCall) {
        if (list.contains(bLiveCall.state)) {
            this.f110374a.add(bLiveCall);
            this.f110375b.put(bLiveCall.f44342id, bLiveCall);
            i54 i54VarM133917k = i0sVar.m133917k(bLiveCall.user);
            if (i54VarM133917k != null) {
                this.f110376c.put(bLiveCall.user, i54VarM133917k);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m133924r(BLiveCall bLiveCall) {
        i54 i54Var = this.f110376c.get(bLiveCall.user);
        if (i54Var != null) {
            bLiveCall.userName = i54Var.f111521b;
            bLiveCall.userPicture = i54Var.f111522c;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m133925s() {
        this.f110375b.clear();
    }

    /* JADX INFO: renamed from: t */
    public void m133926t(final BLiveCall bLiveCall) {
        vwb.m200320d0(this.f110374a, new w9j() { // from class: l.f0s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveCall) obj).f44342id, bLiveCall.f44342id));
            }
        });
        this.f110376c.remove(bLiveCall.user);
        this.f110375b.remove(bLiveCall.f44342id);
    }

    /* JADX INFO: renamed from: u */
    public final void m133927u() {
        vwb.m200354z(this.f110374a, new e30() { // from class: l.e0s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88669a.m133924r((BLiveCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void m133928v(BLiveCall bLiveCall) {
        this.f110374a.remove(m133915i(bLiveCall.f44342id));
        this.f110374a.add(bLiveCall);
        this.f110375b.put(bLiveCall.f44342id, bLiveCall);
    }

    public i0s(final i0s i0sVar, String... strArr) {
        this.f110375b = new HashMap<>();
        this.f110376c = new HashMap<>();
        this.f110374a = new ArrayList();
        final List listAsList = Arrays.asList(strArr);
        vwb.m200354z(i0sVar.m133919m(), new e30() { // from class: l.g0s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100079a.m133923q(listAsList, i0sVar, (BLiveCall) obj);
            }
        });
    }
}
