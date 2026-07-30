package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
public class le10 {

    /* JADX INFO: renamed from: a */
    public String f131690a;

    /* JADX INFO: renamed from: b */
    public boolean f131691b;

    /* JADX INFO: renamed from: e */
    public int f131694e;

    /* JADX INFO: renamed from: h */
    public C18382a f131697h;

    /* JADX INFO: renamed from: i */
    public String f131698i;

    /* JADX INFO: renamed from: c */
    public BLiveMultiCall f131692c = null;

    /* JADX INFO: renamed from: d */
    public int f131693d = 1;

    /* JADX INFO: renamed from: f */
    public final C22507a<le10> f131695f = C22507a.m222758b();

    /* JADX INFO: renamed from: g */
    public final HashMap<String, BLiveMultiCall> f131696g = new HashMap<>();

    /* JADX INFO: renamed from: l.le10$a */
    public static class C18382a {

        /* JADX INFO: renamed from: a */
        public le10 f131699a;

        /* JADX INFO: renamed from: b */
        public void m153860b(BLiveMultiCall bLiveMultiCall) {
            le10 le10Var = this.f131699a;
            if (le10Var != null) {
                le10Var.m153844l(bLiveMultiCall);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m153861c(BLiveMultiCall bLiveMultiCall) {
            le10 le10Var = this.f131699a;
            if (le10Var != null) {
                le10Var.m153838A(bLiveMultiCall.f45248id);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m153862d(List<BLiveMultiCall> list) {
            le10 le10Var = this.f131699a;
            if (le10Var != null) {
                le10Var.m153842E(list);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m153863e(BLiveMultiCall bLiveMultiCall) {
            le10 le10Var = this.f131699a;
            if (le10Var != null) {
                le10Var.m153843F(bLiveMultiCall);
            }
        }
    }

    public le10(C18382a c18382a, String str, String str2) {
        this.f131690a = null;
        this.f131694e = new tm10(str2).f174877a;
        this.f131698i = str2;
        if (TextUtils.isEmpty(this.f131690a)) {
            this.f131690a = str;
        } else {
            ir10.m141746a("anchor set current order " + this.f131690a + " new order = " + str);
        }
        m153845m(c18382a);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveMultiCall m153827a(BLiveMultiCall bLiveMultiCall) {
        return bLiveMultiCall;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m153828b(BLiveMultiCall bLiveMultiCall, BLiveMultiCall bLiveMultiCall2) {
        int i = bLiveMultiCall.position;
        int i2 = bLiveMultiCall2.position;
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 0 : -1;
    }

    /* JADX INFO: renamed from: A */
    public final void m153838A(String str) {
        BLiveMultiCall bLiveMultiCallRemove = this.f131696g.remove(str);
        if (bLiveMultiCallRemove != null) {
            m153839B(3, bLiveMultiCallRemove);
            ir10.m141747b("remove call", bLiveMultiCallRemove, this.f131696g);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m153839B(int i, BLiveMultiCall bLiveMultiCall) {
        Objects.toString(bLiveMultiCall);
        if (i != 1 && bLiveMultiCall == null) {
            ir10.m141746a("illegal sendData");
            return;
        }
        this.f131693d = i;
        this.f131692c = bLiveMultiCall;
        this.f131695f.onNext(this);
    }

    /* JADX INFO: renamed from: C */
    public void m153840C(int i) {
        ir10.m141746a("setdeputycount " + i);
        this.f131694e = i;
    }

    /* JADX INFO: renamed from: D */
    public void m153841D(String str) {
        this.f131698i = str;
    }

    /* JADX INFO: renamed from: E */
    public final void m153842E(List<BLiveMultiCall> list) {
        this.f131696g.clear();
        this.f131696g.putAll(jyb.m147502d(list, new qcj() { // from class: l.je10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveMultiCall) obj).f45248id;
            }
        }, new qcj() { // from class: l.ke10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return le10.m153827a((BLiveMultiCall) obj);
            }
        }));
        m153839B(1, null);
        ir10.m141747b("update all call ", null, this.f131696g);
    }

    /* JADX INFO: renamed from: F */
    public final void m153843F(@NonNull BLiveMultiCall bLiveMultiCall) {
        if (this.f131696g.get(bLiveMultiCall.f45248id) != null) {
            this.f131696g.put(bLiveMultiCall.f45248id, bLiveMultiCall);
            m153839B(2, bLiveMultiCall);
            ir10.m141747b("update single call ", bLiveMultiCall, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m153844l(BLiveMultiCall bLiveMultiCall) {
        this.f131696g.put(bLiveMultiCall.f45248id, bLiveMultiCall);
        ir10.m141747b("add Call ", bLiveMultiCall, this.f131696g);
        m153839B(4, bLiveMultiCall);
    }

    /* JADX INFO: renamed from: m */
    public void m153845m(C18382a c18382a) {
        if (this.f131697h != null) {
            String str = cd10.f81073a;
            return;
        }
        this.f131697h = c18382a;
        if (c18382a != null) {
            c18382a.f131699a = this;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m153846n(String str) {
        if (TextUtils.isEmpty(this.f131690a)) {
            this.f131690a = str;
            return;
        }
        ir10.m141746a("audience set current order " + this.f131690a + " new order = " + str);
    }

    /* JADX INFO: renamed from: o */
    public void m153847o() {
        this.f131698i = null;
    }

    /* JADX INFO: renamed from: p */
    public C22421c<le10> m153848p() {
        return this.f131695f.asObservable();
    }

    /* JADX INFO: renamed from: q */
    public BLiveMultiCall m153849q(final String str) {
        return (BLiveMultiCall) jyb.m147529r(this.f131696g.values(), new qcj() { // from class: l.ie10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLiveMultiCall) obj).f45248id));
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public BLiveMultiCall m153850r(final int i) {
        return (BLiveMultiCall) jyb.m147529r(this.f131696g.values(), new qcj() { // from class: l.ge10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(i == ((BLiveMultiCall) obj).position);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public BLiveMultiCall m153851s(final String str) {
        return (BLiveMultiCall) jyb.m147529r(this.f131696g.values(), new qcj() { // from class: l.fe10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLiveMultiCall) obj).userId));
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public int m153852t() {
        return this.f131694e;
    }

    /* JADX INFO: renamed from: u */
    public String m153853u() {
        return (this.f131698i == null || m153851s(zrv.f205799a.m207631D0()) != null) ? bf10.m103844u(this.f131694e, m153858z()) : this.f131698i;
    }

    /* JADX INFO: renamed from: v */
    public List<BLiveMultiCall> m153854v() {
        return new ArrayList(this.f131696g.values());
    }

    /* JADX INFO: renamed from: w */
    public String m153855w() {
        return this.f131690a;
    }

    /* JADX INFO: renamed from: x */
    public List<BLiveMultiCall> m153856x() {
        ArrayList arrayList = new ArrayList(this.f131696g.values());
        Collections.sort(arrayList, new Comparator() { // from class: l.he10
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return le10.m153828b((BLiveMultiCall) obj, (BLiveMultiCall) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public int m153857y(String str) {
        BLiveMultiCall bLiveMultiCallM153851s = m153851s(str);
        if (bLiveMultiCallM153851s != null) {
            return bLiveMultiCallM153851s.position;
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public boolean m153858z() {
        return jyb.m147529r(this.f131696g.values(), new qcj() { // from class: l.ee10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveMultiCall) obj).isLeadRole);
            }
        }) != null;
    }
}
