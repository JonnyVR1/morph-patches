package p002l;

import androidx.annotation.NonNull;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import java.util.Objects;
import l.e30;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cfe0 {

    /* JADX INFO: renamed from: a */
    public final pge0 f8625a;

    /* JADX INFO: renamed from: l.cfe0$a */
    public static class C0512a {

        /* JADX INFO: renamed from: a */
        public String f8626a;

        /* JADX INFO: renamed from: b */
        public BLiveGiftItem f8627b;

        /* JADX INFO: renamed from: c */
        public e30<BLiveGivenGiftBrief> f8628c;

        /* JADX INFO: renamed from: d */
        public e30<Throwable> f8629d;

        /* JADX INFO: renamed from: e */
        public e30<Integer> f8630e;

        /* JADX INFO: renamed from: f */
        public boolean f8631f;

        /* JADX INFO: renamed from: g */
        public String f8632g;

        /* JADX INFO: renamed from: i */
        public String f8634i;

        /* JADX INFO: renamed from: j */
        public String f8635j;

        /* JADX INFO: renamed from: k */
        public pge0 f8636k;

        /* JADX INFO: renamed from: l */
        public String f8637l;

        /* JADX INFO: renamed from: m */
        @NonNull
        public BLiveTraceServerData f8638m;

        /* JADX INFO: renamed from: p */
        public String f8641p;

        /* JADX INFO: renamed from: q */
        public String f8642q;

        /* JADX INFO: renamed from: r */
        public String f8643r;

        /* JADX INFO: renamed from: s */
        public mlj f8644s;

        /* JADX INFO: renamed from: t */
        public String f8645t;

        /* JADX INFO: renamed from: u */
        public String f8646u;

        /* JADX INFO: renamed from: v */
        public String f8647v;

        /* JADX INFO: renamed from: h */
        public int f8633h = 1;

        /* JADX INFO: renamed from: n */
        public boolean f8639n = true;

        /* JADX INFO: renamed from: o */
        public boolean f8640o = false;

        /* JADX INFO: renamed from: A */
        public C0512a m10978A(boolean z) {
            this.f8639n = z;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C0512a m10979B(String str) {
            this.f8637l = str;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C0512a m10980C(String str) {
            this.f8642q = str;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C0512a m10981D(String str) {
            this.f8641p = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public cfe0 m10982t() {
            return new cfe0(this);
        }

        /* JADX INFO: renamed from: u */
        public C0512a m10983u(String str, @NotNull final zfv.C0940a.a aVar, int i, String str2, String str3, @NonNull BLiveTraceServerData bLiveTraceServerData) {
            this.f8632g = str;
            Objects.requireNonNull(aVar);
            this.f8628c = new vm5(aVar);
            this.f8629d = new e30() { // from class: l.yee0
                public final void call(Object obj) {
                    aVar.mo5857c();
                }
            };
            this.f8630e = new e30() { // from class: l.zee0
                public final void call(Object obj) {
                    aVar.mo5856b();
                }
            };
            this.f8634i = str2;
            this.f8635j = str3;
            this.f8633h = i;
            this.f8638m = bLiveTraceServerData;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C0512a m10984v(String str, @NotNull final zfv.C0940a.a aVar, int i, String str2, String str3, @NonNull BLiveTraceServerData bLiveTraceServerData, String str4, String str5) {
            this.f8632g = str;
            Objects.requireNonNull(aVar);
            this.f8628c = new vm5(aVar);
            this.f8629d = new e30() { // from class: l.afe0
                public final void call(Object obj) {
                    aVar.mo5857c();
                }
            };
            this.f8630e = new e30() { // from class: l.bfe0
                public final void call(Object obj) {
                    aVar.mo5856b();
                }
            };
            this.f8634i = str2;
            this.f8635j = str3;
            this.f8633h = i;
            this.f8638m = bLiveTraceServerData;
            this.f8646u = str4;
            this.f8626a = str5;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public cfe0 m10985w(BLiveGiftItem bLiveGiftItem, @NotNull e30<BLiveGivenGiftBrief> e30Var, @NotNull e30<Throwable> e30Var2, @NotNull e30<Integer> e30Var3, boolean z, int i, @NonNull BLiveTraceServerData bLiveTraceServerData) {
            this.f8627b = bLiveGiftItem;
            this.f8628c = e30Var;
            this.f8629d = e30Var2;
            this.f8630e = e30Var3;
            this.f8631f = z;
            this.f8633h = i;
            this.f8638m = bLiveTraceServerData;
            return m10982t();
        }

        /* JADX INFO: renamed from: x */
        public cfe0 m10986x(mlj mljVar, String str, BLiveGiftItem bLiveGiftItem, @NotNull e30<BLiveGivenGiftBrief> e30Var, @NotNull e30<Throwable> e30Var2, @NotNull e30<Integer> e30Var3, boolean z, int i, @NonNull BLiveTraceServerData bLiveTraceServerData) {
            this.f8644s = mljVar;
            this.f8645t = str;
            this.f8627b = bLiveGiftItem;
            this.f8628c = e30Var;
            this.f8629d = e30Var2;
            this.f8630e = e30Var3;
            this.f8631f = z;
            this.f8633h = i;
            this.f8638m = bLiveTraceServerData;
            if (mljVar != null) {
                this.f8626a = mljVar.f15448g;
            }
            return m10982t();
        }

        /* JADX INFO: renamed from: y */
        public cfe0 m10987y(pge0 pge0Var) {
            this.f8636k = pge0Var;
            return m10982t();
        }

        /* JADX INFO: renamed from: z */
        public C0512a m10988z(mlj mljVar) {
            this.f8644s = mljVar;
            return this;
        }
    }

    public cfe0(C0512a c0512a) {
        if (c0512a.f8636k != null) {
            this.f8625a = c0512a.f8636k;
            return;
        }
        pge0 pge0VarM20240d = pge0.m20240d(c0512a.f8632g, c0512a.f8627b, c0512a.f8628c, c0512a.f8629d, c0512a.f8630e, c0512a.f8631f, c0512a.f8633h, c0512a.f8626a, null, c0512a.f8638m);
        this.f8625a = pge0VarM20240d;
        pge0VarM20240d.f17296u = c0512a.f8634i;
        pge0VarM20240d.f17295t = c0512a.f8635j;
        pge0VarM20240d.f17261A = c0512a.f8637l;
        pge0VarM20240d.f17263C = c0512a.f8639n;
        pge0VarM20240d.f17264D = c0512a.f8640o;
        pge0VarM20240d.f17286k = c0512a.f8641p;
        pge0VarM20240d.f17285j = c0512a.f8643r;
        pge0VarM20240d.f17273M = c0512a.f8647v;
        pge0VarM20240d.f17287l = c0512a.f8642q;
        if (c0512a.f8644s != null && c0512a.f8645t != null) {
            pge0VarM20240d.f17288m = new mnj.C0680a().m18101e(c0512a.f8644s, c0512a.f8645t).m18100d();
        }
        pge0VarM20240d.f17272L = c0512a.f8646u;
    }
}
