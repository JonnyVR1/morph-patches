package p028v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p003l.bnc0;
import p003l.bqd;
import p003l.cqd;
import p003l.df50;
import p003l.dqd;
import p003l.ef50;
import p003l.enc0;
import p003l.fnc0;
import p003l.hnc0;
import p003l.me50;
import p028v.smart_refresh.SmartRefreshLayout;
import p028v.smart_refresh.footer.TTRefreshFooter;
import p028v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VPullDownRefreshLayout extends SmartRefreshLayout implements hnc0 {

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$a */
    public class C1349a implements df50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ df50 f12898a;

        public C1349a(df50 df50Var) {
            this.f12898a = df50Var;
        }

        @Override // p003l.df50
        /* JADX INFO: renamed from: w2 */
        public void mo2880w2(@NonNull hnc0 hnc0Var) {
            this.f12898a.mo2880w2(VPullDownRefreshLayout.this);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$b */
    public class C1350b implements me50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ me50 f12900a;

        public C1350b(me50 me50Var) {
            this.f12900a = me50Var;
        }

        @Override // p003l.me50
        /* JADX INFO: renamed from: a */
        public void mo2874a(@NonNull hnc0 hnc0Var) {
            this.f12900a.mo2874a(VPullDownRefreshLayout.this);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$c */
    public class C1351c implements ef50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ef50 f12902a;

        public C1351c(ef50 ef50Var) {
            this.f12902a = ef50Var;
        }

        @Override // p003l.me50
        /* JADX INFO: renamed from: a */
        public void mo2874a(@NonNull hnc0 hnc0Var) {
            this.f12902a.mo2874a(VPullDownRefreshLayout.this);
        }

        @Override // p003l.df50
        /* JADX INFO: renamed from: w2 */
        public void mo2880w2(@NonNull hnc0 hnc0Var) {
            this.f12902a.mo2880w2(VPullDownRefreshLayout.this);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$d */
    public class C1352d implements cqd {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cqd f12904a;

        public C1352d(cqd cqdVar) {
            this.f12904a = cqdVar;
        }

        @Override // p003l.cqd
        @NonNull
        /* JADX INFO: renamed from: a */
        public fnc0 mo3416a(@NonNull Context context, @NonNull hnc0 hnc0Var) {
            return hnc0Var != null ? this.f12904a.mo3416a(context, hnc0Var) : new TTRefreshHeader(context);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$e */
    public class C1353e implements bqd {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bqd f12905a;

        public C1353e(bqd bqdVar) {
            this.f12905a = bqdVar;
        }

        @Override // p003l.bqd
        @NonNull
        /* JADX INFO: renamed from: a */
        public enc0 mo3162a(@NonNull Context context, @NonNull hnc0 hnc0Var) {
            return hnc0Var != null ? this.f12905a.mo3162a(context, hnc0Var) : new TTRefreshFooter(context);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$f */
    public class C1354f implements dqd {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dqd f12906a;

        public C1354f(dqd dqdVar) {
            this.f12906a = dqdVar;
        }

        @Override // p003l.dqd
        /* JADX INFO: renamed from: a */
        public void mo3628a(@NonNull Context context, @NonNull hnc0 hnc0Var) {
            if (hnc0Var != null) {
                this.f12906a.mo3628a(context, hnc0Var);
            }
        }
    }

    public VPullDownRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12265K(2.0f);
        m12264J(2.0f);
        mo11645S(new TTRefreshHeader(context));
        mo11643Q(new TTRefreshFooter(context));
    }

    public static void setDefaultRefreshFooterCreator(@NonNull bqd bqdVar) {
        SmartRefreshLayout.setDefaultRefreshFooterCreator(new C1353e(bqdVar));
    }

    public static void setDefaultRefreshHeaderCreator(@NonNull cqd cqdVar) {
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new C1352d(cqdVar));
    }

    public static void setDefaultRefreshInitializer(@NonNull dqd dqdVar) {
        SmartRefreshLayout.setDefaultRefreshInitializer(new C1354f(dqdVar));
    }

    @Override // p028v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: M */
    public hnc0 mo11640M(me50 me50Var) {
        super.mo11640M(new C1350b(me50Var));
        return this;
    }

    @Override // p028v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: O */
    public hnc0 mo11641O(df50 df50Var) {
        super.mo11641O(new C1349a(df50Var));
        return this;
    }

    @Override // p028v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: P */
    public hnc0 mo11642P(ef50 ef50Var) {
        super.mo11642P(new C1351c(ef50Var));
        return this;
    }

    @Override // p028v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: Q */
    public hnc0 mo11643Q(@NonNull enc0 enc0Var) {
        return mo11644R(enc0Var, -1, -2);
    }

    @Override // p028v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: R */
    public hnc0 mo11644R(@NonNull enc0 enc0Var, int i, int i2) {
        super.mo11644R(enc0Var, i, i2);
        return this;
    }

    @Override // p028v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: S */
    public hnc0 mo11645S(@NonNull fnc0 fnc0Var) {
        return mo11646T(fnc0Var, -1, -2);
    }

    @Override // p028v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: T */
    public hnc0 mo11646T(@NonNull fnc0 fnc0Var, int i, int i2) {
        super.mo11646T(fnc0Var, i, i2);
        return this;
    }

    @Override // p028v.smart_refresh.SmartRefreshLayout
    @Nullable
    public enc0 getRefreshFooter() {
        bnc0 bnc0Var = this.f13598Y0;
        if (bnc0Var instanceof enc0) {
            return (enc0) bnc0Var;
        }
        return null;
    }

    @Override // p028v.smart_refresh.SmartRefreshLayout
    @Nullable
    public fnc0 getRefreshHeader() {
        bnc0 bnc0Var = this.f13597X0;
        if (bnc0Var instanceof fnc0) {
            return (fnc0) bnc0Var;
        }
        return null;
    }

    public VPullDownRefreshLayout(Context context) {
        this(context, null);
    }
}
