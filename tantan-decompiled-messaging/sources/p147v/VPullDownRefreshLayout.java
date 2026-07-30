package p147v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.smart_refresh.SmartRefreshLayout;
import p147v.smart_refresh.footer.TTRefreshFooter;
import p147v.smart_refresh.header.TTRefreshHeader;
import p149l.bnc0;
import p149l.bqd;
import p149l.cqd;
import p149l.df50;
import p149l.dqd;
import p149l.ef50;
import p149l.enc0;
import p149l.fnc0;
import p149l.hnc0;
import p149l.me50;

/* JADX INFO: loaded from: classes3.dex */
public class VPullDownRefreshLayout extends SmartRefreshLayout implements hnc0 {

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$a */
    public class C22556a implements df50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ df50 f209273a;

        public C22556a(df50 df50Var) {
            this.f209273a = df50Var;
        }

        @Override // p149l.df50
        /* JADX INFO: renamed from: w2 */
        public void mo57954w2(@NonNull hnc0 hnc0Var) {
            this.f209273a.mo57954w2(VPullDownRefreshLayout.this);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$b */
    public class C22557b implements me50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ me50 f209275a;

        public C22557b(me50 me50Var) {
            this.f209275a = me50Var;
        }

        @Override // p149l.me50
        /* JADX INFO: renamed from: a */
        public void mo77835a(@NonNull hnc0 hnc0Var) {
            this.f209275a.mo77835a(VPullDownRefreshLayout.this);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$c */
    public class C22558c implements ef50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ef50 f209277a;

        public C22558c(ef50 ef50Var) {
            this.f209277a = ef50Var;
        }

        @Override // p149l.me50
        /* JADX INFO: renamed from: a */
        public void mo77835a(@NonNull hnc0 hnc0Var) {
            this.f209277a.mo77835a(VPullDownRefreshLayout.this);
        }

        @Override // p149l.df50
        /* JADX INFO: renamed from: w2 */
        public void mo57954w2(@NonNull hnc0 hnc0Var) {
            this.f209277a.mo57954w2(VPullDownRefreshLayout.this);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$d */
    public class C22559d implements cqd {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cqd f209279a;

        public C22559d(cqd cqdVar) {
            this.f209279a = cqdVar;
        }

        @Override // p149l.cqd
        @NonNull
        /* JADX INFO: renamed from: a */
        public fnc0 mo108247a(@NonNull Context context, @NonNull hnc0 hnc0Var) {
            return hnc0Var != null ? this.f209279a.mo108247a(context, hnc0Var) : new TTRefreshHeader(context);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$e */
    public class C22560e implements bqd {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bqd f209280a;

        public C22560e(bqd bqdVar) {
            this.f209280a = bqdVar;
        }

        @Override // p149l.bqd
        @NonNull
        /* JADX INFO: renamed from: a */
        public enc0 mo103366a(@NonNull Context context, @NonNull hnc0 hnc0Var) {
            return hnc0Var != null ? this.f209280a.mo103366a(context, hnc0Var) : new TTRefreshFooter(context);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$f */
    public class C22561f implements dqd {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dqd f209281a;

        public C22561f(dqd dqdVar) {
            this.f209281a = dqdVar;
        }

        @Override // p149l.dqd
        /* JADX INFO: renamed from: a */
        public void mo112999a(@NonNull Context context, @NonNull hnc0 hnc0Var) {
            if (hnc0Var != null) {
                this.f209281a.mo112999a(context, hnc0Var);
            }
        }
    }

    public VPullDownRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223759K(2.0f);
        m223758J(2.0f);
        mo223163S(new TTRefreshHeader(context));
        mo223161Q(new TTRefreshFooter(context));
    }

    public static void setDefaultRefreshFooterCreator(@NonNull bqd bqdVar) {
        SmartRefreshLayout.setDefaultRefreshFooterCreator(new C22560e(bqdVar));
    }

    public static void setDefaultRefreshHeaderCreator(@NonNull cqd cqdVar) {
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new C22559d(cqdVar));
    }

    public static void setDefaultRefreshInitializer(@NonNull dqd dqdVar) {
        SmartRefreshLayout.setDefaultRefreshInitializer(new C22561f(dqdVar));
    }

    @Override // p147v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: M */
    public hnc0 mo223158M(me50 me50Var) {
        super.mo223158M(new C22557b(me50Var));
        return this;
    }

    @Override // p147v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: O */
    public hnc0 mo223159O(df50 df50Var) {
        super.mo223159O(new C22556a(df50Var));
        return this;
    }

    @Override // p147v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: P */
    public hnc0 mo223160P(ef50 ef50Var) {
        super.mo223160P(new C22558c(ef50Var));
        return this;
    }

    @Override // p147v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: Q */
    public hnc0 mo223161Q(@NonNull enc0 enc0Var) {
        return mo223162R(enc0Var, -1, -2);
    }

    @Override // p147v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: R */
    public hnc0 mo223162R(@NonNull enc0 enc0Var, int i, int i2) {
        super.mo223162R(enc0Var, i, i2);
        return this;
    }

    @Override // p147v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: S */
    public hnc0 mo223163S(@NonNull fnc0 fnc0Var) {
        return mo223164T(fnc0Var, -1, -2);
    }

    @Override // p147v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: T */
    public hnc0 mo223164T(@NonNull fnc0 fnc0Var, int i, int i2) {
        super.mo223164T(fnc0Var, i, i2);
        return this;
    }

    @Override // p147v.smart_refresh.SmartRefreshLayout
    @Nullable
    public enc0 getRefreshFooter() {
        bnc0 bnc0Var = this.f209973Y0;
        if (bnc0Var instanceof enc0) {
            return (enc0) bnc0Var;
        }
        return null;
    }

    @Override // p147v.smart_refresh.SmartRefreshLayout
    @Nullable
    public fnc0 getRefreshHeader() {
        bnc0 bnc0Var = this.f209972X0;
        if (bnc0Var instanceof fnc0) {
            return (fnc0) bnc0Var;
        }
        return null;
    }

    public VPullDownRefreshLayout(Context context) {
        this(context, null);
    }
}
