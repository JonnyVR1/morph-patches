package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class hne0 {

    /* JADX INFO: renamed from: a */
    public final uoe0 f110732a;

    /* JADX INFO: renamed from: l.hne0$a */
    public static class C17513a {

        /* JADX INFO: renamed from: a */
        public String f110733a;

        /* JADX INFO: renamed from: b */
        public BLiveGiftItem f110734b;

        /* JADX INFO: renamed from: c */
        public y20<BLiveGivenGiftBrief> f110735c;

        /* JADX INFO: renamed from: d */
        public y20<Throwable> f110736d;

        /* JADX INFO: renamed from: e */
        public y20<Integer> f110737e;

        /* JADX INFO: renamed from: f */
        public boolean f110738f;

        /* JADX INFO: renamed from: g */
        public String f110739g;

        /* JADX INFO: renamed from: i */
        public String f110741i;

        /* JADX INFO: renamed from: j */
        public String f110742j;

        /* JADX INFO: renamed from: k */
        public uoe0 f110743k;

        /* JADX INFO: renamed from: l */
        public String f110744l;

        /* JADX INFO: renamed from: m */
        @NonNull
        public BLiveTraceServerData f110745m;

        /* JADX INFO: renamed from: p */
        public String f110748p;

        /* JADX INFO: renamed from: q */
        public String f110749q;

        /* JADX INFO: renamed from: r */
        public String f110750r;

        /* JADX INFO: renamed from: s */
        public coj f110751s;

        /* JADX INFO: renamed from: t */
        public String f110752t;

        /* JADX INFO: renamed from: u */
        public String f110753u;

        /* JADX INFO: renamed from: v */
        public String f110754v;

        /* JADX INFO: renamed from: h */
        public int f110740h = 1;

        /* JADX INFO: renamed from: n */
        public boolean f110746n = true;

        /* JADX INFO: renamed from: o */
        public boolean f110747o = false;

        /* JADX INFO: renamed from: A */
        public C17513a m136079A(boolean z) {
            this.f110746n = z;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C17513a m136080B(String str) {
            this.f110744l = str;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C17513a m136081C(String str) {
            this.f110749q = str;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C17513a m136082D(String str) {
            this.f110748p = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public hne0 m136083t() {
            return new hne0(this);
        }

        /* JADX INFO: renamed from: u */
        public C17513a m136084u(String str, @NotNull final aiv.C15716a.a aVar, int i, String str2, String str3, @NonNull BLiveTraceServerData bLiveTraceServerData) {
            this.f110739g = str;
            Objects.requireNonNull(aVar);
            this.f110735c = new zn5(aVar);
            this.f110736d = new y20() { // from class: l.dne0
                @Override // p153l.y20
                public final void call(Object obj) {
                    aVar.mo68351c();
                }
            };
            this.f110737e = new y20() { // from class: l.ene0
                @Override // p153l.y20
                public final void call(Object obj) {
                    aVar.mo68350b();
                }
            };
            this.f110741i = str2;
            this.f110742j = str3;
            this.f110740h = i;
            this.f110745m = bLiveTraceServerData;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C17513a m136085v(String str, @NotNull final aiv.C15716a.a aVar, int i, String str2, String str3, @NonNull BLiveTraceServerData bLiveTraceServerData, String str4, String str5) {
            this.f110739g = str;
            Objects.requireNonNull(aVar);
            this.f110735c = new zn5(aVar);
            this.f110736d = new y20() { // from class: l.fne0
                @Override // p153l.y20
                public final void call(Object obj) {
                    aVar.mo68351c();
                }
            };
            this.f110737e = new y20() { // from class: l.gne0
                @Override // p153l.y20
                public final void call(Object obj) {
                    aVar.mo68350b();
                }
            };
            this.f110741i = str2;
            this.f110742j = str3;
            this.f110740h = i;
            this.f110745m = bLiveTraceServerData;
            this.f110753u = str4;
            this.f110733a = str5;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public hne0 m136086w(BLiveGiftItem bLiveGiftItem, @NotNull y20<BLiveGivenGiftBrief> y20Var, @NotNull y20<Throwable> y20Var2, @NotNull y20<Integer> y20Var3, boolean z, int i, @NonNull BLiveTraceServerData bLiveTraceServerData) {
            this.f110734b = bLiveGiftItem;
            this.f110735c = y20Var;
            this.f110736d = y20Var2;
            this.f110737e = y20Var3;
            this.f110738f = z;
            this.f110740h = i;
            this.f110745m = bLiveTraceServerData;
            return m136083t();
        }

        /* JADX INFO: renamed from: x */
        public hne0 m136087x(coj cojVar, String str, BLiveGiftItem bLiveGiftItem, @NotNull y20<BLiveGivenGiftBrief> y20Var, @NotNull y20<Throwable> y20Var2, @NotNull y20<Integer> y20Var3, boolean z, int i, @NonNull BLiveTraceServerData bLiveTraceServerData) {
            this.f110751s = cojVar;
            this.f110752t = str;
            this.f110734b = bLiveGiftItem;
            this.f110735c = y20Var;
            this.f110736d = y20Var2;
            this.f110737e = y20Var3;
            this.f110738f = z;
            this.f110740h = i;
            this.f110745m = bLiveTraceServerData;
            if (cojVar != null) {
                this.f110733a = cojVar.f82891g;
            }
            return m136083t();
        }

        /* JADX INFO: renamed from: y */
        public hne0 m136088y(uoe0 uoe0Var) {
            this.f110743k = uoe0Var;
            return m136083t();
        }

        /* JADX INFO: renamed from: z */
        public C17513a m136089z(coj cojVar) {
            this.f110751s = cojVar;
            return this;
        }
    }

    public hne0(C17513a c17513a) {
        if (c17513a.f110743k != null) {
            this.f110732a = c17513a.f110743k;
            return;
        }
        uoe0 uoe0VarM196974d = uoe0.m196974d(c17513a.f110739g, c17513a.f110734b, c17513a.f110735c, c17513a.f110736d, c17513a.f110737e, c17513a.f110738f, c17513a.f110740h, c17513a.f110733a, null, c17513a.f110745m);
        this.f110732a = uoe0VarM196974d;
        uoe0VarM196974d.f180073u = c17513a.f110741i;
        uoe0VarM196974d.f180072t = c17513a.f110742j;
        uoe0VarM196974d.f180038A = c17513a.f110744l;
        uoe0VarM196974d.f180040C = c17513a.f110746n;
        uoe0VarM196974d.f180041D = c17513a.f110747o;
        uoe0VarM196974d.f180063k = c17513a.f110748p;
        uoe0VarM196974d.f180062j = c17513a.f110750r;
        uoe0VarM196974d.f180050M = c17513a.f110754v;
        uoe0VarM196974d.f180064l = c17513a.f110749q;
        if (c17513a.f110751s != null && c17513a.f110752t != null) {
            uoe0VarM196974d.f180065m = new cqj.C16337a().m111924e(c17513a.f110751s, c17513a.f110752t).m111923d();
        }
        uoe0VarM196974d.f180049L = c17513a.f110753u;
    }
}
