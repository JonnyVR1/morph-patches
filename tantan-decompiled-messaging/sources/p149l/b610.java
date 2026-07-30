package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes5.dex */
public class b610 {

    /* JADX INFO: renamed from: a */
    public String f73727a;

    /* JADX INFO: renamed from: b */
    public boolean f73728b;

    /* JADX INFO: renamed from: e */
    public int f73731e;

    /* JADX INFO: renamed from: h */
    public C15814a f73734h;

    /* JADX INFO: renamed from: i */
    public String f73735i;

    /* JADX INFO: renamed from: c */
    public BLiveMultiCall f73729c = null;

    /* JADX INFO: renamed from: d */
    public int f73730d = 1;

    /* JADX INFO: renamed from: f */
    public final C22392a<b610> f73732f = C22392a.m221512b();

    /* JADX INFO: renamed from: g */
    public final HashMap<String, BLiveMultiCall> f73733g = new HashMap<>();

    /* JADX INFO: renamed from: l.b610$a */
    public static class C15814a {

        /* JADX INFO: renamed from: a */
        public b610 f73736a;

        /* JADX INFO: renamed from: b */
        public void m100382b(BLiveMultiCall bLiveMultiCall) {
            b610 b610Var = this.f73736a;
            if (b610Var != null) {
                b610Var.m100366l(bLiveMultiCall);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m100383c(BLiveMultiCall bLiveMultiCall) {
            b610 b610Var = this.f73736a;
            if (b610Var != null) {
                b610Var.m100360A(bLiveMultiCall.f44400id);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m100384d(List<BLiveMultiCall> list) {
            b610 b610Var = this.f73736a;
            if (b610Var != null) {
                b610Var.m100364E(list);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m100385e(BLiveMultiCall bLiveMultiCall) {
            b610 b610Var = this.f73736a;
            if (b610Var != null) {
                b610Var.m100365F(bLiveMultiCall);
            }
        }
    }

    public b610(C15814a c15814a, String str, String str2) {
        this.f73727a = null;
        this.f73731e = new je10(str2).f117456a;
        this.f73735i = str2;
        if (TextUtils.isEmpty(this.f73727a)) {
            this.f73727a = str;
        } else {
            yi10.m214879a("anchor set current order " + this.f73727a + " new order = " + str);
        }
        m100367m(c15814a);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveMultiCall m100349a(BLiveMultiCall bLiveMultiCall) {
        return bLiveMultiCall;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m100350b(BLiveMultiCall bLiveMultiCall, BLiveMultiCall bLiveMultiCall2) {
        int i = bLiveMultiCall.position;
        int i2 = bLiveMultiCall2.position;
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 0 : -1;
    }

    /* JADX INFO: renamed from: A */
    public final void m100360A(String str) {
        BLiveMultiCall bLiveMultiCallRemove = this.f73733g.remove(str);
        if (bLiveMultiCallRemove != null) {
            m100361B(3, bLiveMultiCallRemove);
            yi10.m214880b("remove call", bLiveMultiCallRemove, this.f73733g);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m100361B(int i, BLiveMultiCall bLiveMultiCall) {
        Objects.toString(bLiveMultiCall);
        if (i != 1 && bLiveMultiCall == null) {
            yi10.m214879a("illegal sendData");
            return;
        }
        this.f73730d = i;
        this.f73729c = bLiveMultiCall;
        this.f73732f.onNext(this);
    }

    /* JADX INFO: renamed from: C */
    public void m100362C(int i) {
        yi10.m214879a("setdeputycount " + i);
        this.f73731e = i;
    }

    /* JADX INFO: renamed from: D */
    public void m100363D(String str) {
        this.f73735i = str;
    }

    /* JADX INFO: renamed from: E */
    public final void m100364E(List<BLiveMultiCall> list) {
        this.f73733g.clear();
        this.f73733g.putAll(vwb.m200319d(list, new w9j() { // from class: l.z510
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveMultiCall) obj).f44400id;
            }
        }, new w9j() { // from class: l.a610
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return b610.m100349a((BLiveMultiCall) obj);
            }
        }));
        m100361B(1, null);
        yi10.m214880b("update all call ", null, this.f73733g);
    }

    /* JADX INFO: renamed from: F */
    public final void m100365F(@NonNull BLiveMultiCall bLiveMultiCall) {
        if (this.f73733g.get(bLiveMultiCall.f44400id) != null) {
            this.f73733g.put(bLiveMultiCall.f44400id, bLiveMultiCall);
            m100361B(2, bLiveMultiCall);
            yi10.m214880b("update single call ", bLiveMultiCall, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m100366l(BLiveMultiCall bLiveMultiCall) {
        this.f73733g.put(bLiveMultiCall.f44400id, bLiveMultiCall);
        yi10.m214880b("add Call ", bLiveMultiCall, this.f73733g);
        m100361B(4, bLiveMultiCall);
    }

    /* JADX INFO: renamed from: m */
    public void m100367m(C15814a c15814a) {
        if (this.f73734h != null) {
            String str = s410.f162235a;
            return;
        }
        this.f73734h = c15814a;
        if (c15814a != null) {
            c15814a.f73736a = this;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m100368n(String str) {
        if (TextUtils.isEmpty(this.f73727a)) {
            this.f73727a = str;
            return;
        }
        yi10.m214879a("audience set current order " + this.f73727a + " new order = " + str);
    }

    /* JADX INFO: renamed from: o */
    public void m100369o() {
        this.f73735i = null;
    }

    /* JADX INFO: renamed from: p */
    public C22306c<b610> m100370p() {
        return this.f73732f.asObservable();
    }

    /* JADX INFO: renamed from: q */
    public BLiveMultiCall m100371q(final String str) {
        return (BLiveMultiCall) vwb.m200346r(this.f73733g.values(), new w9j() { // from class: l.y510
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLiveMultiCall) obj).f44400id));
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public BLiveMultiCall m100372r(final int i) {
        return (BLiveMultiCall) vwb.m200346r(this.f73733g.values(), new w9j() { // from class: l.w510
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(i == ((BLiveMultiCall) obj).position);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public BLiveMultiCall m100373s(final String str) {
        return (BLiveMultiCall) vwb.m200346r(this.f73733g.values(), new w9j() { // from class: l.v510
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLiveMultiCall) obj).userId));
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public int m100374t() {
        return this.f73731e;
    }

    /* JADX INFO: renamed from: u */
    public String m100375u() {
        return (this.f73735i == null || m100373s(ypv.f199493a.m199309D0()) != null) ? r610.m178015u(this.f73731e, m100380z()) : this.f73735i;
    }

    /* JADX INFO: renamed from: v */
    public List<BLiveMultiCall> m100376v() {
        return new ArrayList(this.f73733g.values());
    }

    /* JADX INFO: renamed from: w */
    public String m100377w() {
        return this.f73727a;
    }

    /* JADX INFO: renamed from: x */
    public List<BLiveMultiCall> m100378x() {
        ArrayList arrayList = new ArrayList(this.f73733g.values());
        Collections.sort(arrayList, new Comparator() { // from class: l.x510
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b610.m100350b((BLiveMultiCall) obj, (BLiveMultiCall) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public int m100379y(String str) {
        BLiveMultiCall bLiveMultiCallM100373s = m100373s(str);
        if (bLiveMultiCallM100373s != null) {
            return bLiveMultiCallM100373s.position;
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public boolean m100380z() {
        return vwb.m200346r(this.f73733g.values(), new w9j() { // from class: l.u510
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveMultiCall) obj).isLeadRole);
            }
        }) != null;
    }
}
