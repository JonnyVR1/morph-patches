package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class cfe0 {

    /* JADX INFO: renamed from: a */
    public final pge0 f80589a;

    /* JADX INFO: renamed from: l.cfe0$a */
    public static class C16123a {

        /* JADX INFO: renamed from: a */
        public String f80590a;

        /* JADX INFO: renamed from: b */
        public BLiveGiftItem f80591b;

        /* JADX INFO: renamed from: c */
        public e30<BLiveGivenGiftBrief> f80592c;

        /* JADX INFO: renamed from: d */
        public e30<Throwable> f80593d;

        /* JADX INFO: renamed from: e */
        public e30<Integer> f80594e;

        /* JADX INFO: renamed from: f */
        public boolean f80595f;

        /* JADX INFO: renamed from: g */
        public String f80596g;

        /* JADX INFO: renamed from: i */
        public String f80598i;

        /* JADX INFO: renamed from: j */
        public String f80599j;

        /* JADX INFO: renamed from: k */
        public pge0 f80600k;

        /* JADX INFO: renamed from: l */
        public String f80601l;

        /* JADX INFO: renamed from: m */
        @NonNull
        public BLiveTraceServerData f80602m;

        /* JADX INFO: renamed from: p */
        public String f80605p;

        /* JADX INFO: renamed from: q */
        public String f80606q;

        /* JADX INFO: renamed from: r */
        public String f80607r;

        /* JADX INFO: renamed from: s */
        public mlj f80608s;

        /* JADX INFO: renamed from: t */
        public String f80609t;

        /* JADX INFO: renamed from: u */
        public String f80610u;

        /* JADX INFO: renamed from: v */
        public String f80611v;

        /* JADX INFO: renamed from: h */
        public int f80597h = 1;

        /* JADX INFO: renamed from: n */
        public boolean f80603n = true;

        /* JADX INFO: renamed from: o */
        public boolean f80604o = false;

        /* JADX INFO: renamed from: A */
        public C16123a m106525A(boolean z) {
            this.f80603n = z;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C16123a m106526B(String str) {
            this.f80601l = str;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C16123a m106527C(String str) {
            this.f80606q = str;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C16123a m106528D(String str) {
            this.f80605p = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public cfe0 m106529t() {
            return new cfe0(this);
        }

        /* JADX INFO: renamed from: u */
        public C16123a m106530u(String str, @NotNull final zfv.C21687a.a aVar, int i, String str2, String str3, @NonNull BLiveTraceServerData bLiveTraceServerData) {
            this.f80596g = str;
            Objects.requireNonNull(aVar);
            this.f80592c = new vm5(aVar);
            this.f80593d = new e30() { // from class: l.yee0
                @Override // p149l.e30
                public final void call(Object obj) {
                    aVar.mo67168c();
                }
            };
            this.f80594e = new e30() { // from class: l.zee0
                @Override // p149l.e30
                public final void call(Object obj) {
                    aVar.mo67167b();
                }
            };
            this.f80598i = str2;
            this.f80599j = str3;
            this.f80597h = i;
            this.f80602m = bLiveTraceServerData;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C16123a m106531v(String str, @NotNull final zfv.C21687a.a aVar, int i, String str2, String str3, @NonNull BLiveTraceServerData bLiveTraceServerData, String str4, String str5) {
            this.f80596g = str;
            Objects.requireNonNull(aVar);
            this.f80592c = new vm5(aVar);
            this.f80593d = new e30() { // from class: l.afe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    aVar.mo67168c();
                }
            };
            this.f80594e = new e30() { // from class: l.bfe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    aVar.mo67167b();
                }
            };
            this.f80598i = str2;
            this.f80599j = str3;
            this.f80597h = i;
            this.f80602m = bLiveTraceServerData;
            this.f80610u = str4;
            this.f80590a = str5;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public cfe0 m106532w(BLiveGiftItem bLiveGiftItem, @NotNull e30<BLiveGivenGiftBrief> e30Var, @NotNull e30<Throwable> e30Var2, @NotNull e30<Integer> e30Var3, boolean z, int i, @NonNull BLiveTraceServerData bLiveTraceServerData) {
            this.f80591b = bLiveGiftItem;
            this.f80592c = e30Var;
            this.f80593d = e30Var2;
            this.f80594e = e30Var3;
            this.f80595f = z;
            this.f80597h = i;
            this.f80602m = bLiveTraceServerData;
            return m106529t();
        }

        /* JADX INFO: renamed from: x */
        public cfe0 m106533x(mlj mljVar, String str, BLiveGiftItem bLiveGiftItem, @NotNull e30<BLiveGivenGiftBrief> e30Var, @NotNull e30<Throwable> e30Var2, @NotNull e30<Integer> e30Var3, boolean z, int i, @NonNull BLiveTraceServerData bLiveTraceServerData) {
            this.f80608s = mljVar;
            this.f80609t = str;
            this.f80591b = bLiveGiftItem;
            this.f80592c = e30Var;
            this.f80593d = e30Var2;
            this.f80594e = e30Var3;
            this.f80595f = z;
            this.f80597h = i;
            this.f80602m = bLiveTraceServerData;
            if (mljVar != null) {
                this.f80590a = mljVar.f134446g;
            }
            return m106529t();
        }

        /* JADX INFO: renamed from: y */
        public cfe0 m106534y(pge0 pge0Var) {
            this.f80600k = pge0Var;
            return m106529t();
        }

        /* JADX INFO: renamed from: z */
        public C16123a m106535z(mlj mljVar) {
            this.f80608s = mljVar;
            return this;
        }
    }

    public cfe0(C16123a c16123a) {
        if (c16123a.f80600k != null) {
            this.f80589a = c16123a.f80600k;
            return;
        }
        pge0 pge0VarM168675d = pge0.m168675d(c16123a.f80596g, c16123a.f80591b, c16123a.f80592c, c16123a.f80593d, c16123a.f80594e, c16123a.f80595f, c16123a.f80597h, c16123a.f80590a, null, c16123a.f80602m);
        this.f80589a = pge0VarM168675d;
        pge0VarM168675d.f148672u = c16123a.f80598i;
        pge0VarM168675d.f148671t = c16123a.f80599j;
        pge0VarM168675d.f148637A = c16123a.f80601l;
        pge0VarM168675d.f148639C = c16123a.f80603n;
        pge0VarM168675d.f148640D = c16123a.f80604o;
        pge0VarM168675d.f148662k = c16123a.f80605p;
        pge0VarM168675d.f148661j = c16123a.f80607r;
        pge0VarM168675d.f148649M = c16123a.f80611v;
        pge0VarM168675d.f148663l = c16123a.f80606q;
        if (c16123a.f80608s != null && c16123a.f80609t != null) {
            pge0VarM168675d.f148664m = new mnj.C18509a().m155524e(c16123a.f80608s, c16123a.f80609t).m155523d();
        }
        pge0VarM168675d.f148648L = c16123a.f80610u;
    }
}
