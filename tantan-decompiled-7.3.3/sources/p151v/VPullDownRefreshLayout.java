package p151v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.smart_refresh.SmartRefreshLayout;
import p151v.smart_refresh.footer.TTRefreshFooter;
import p151v.smart_refresh.header.TTRefreshHeader;
import p153l.gvc0;
import p153l.jn50;
import p153l.jvc0;
import p153l.kn50;
import p153l.kvc0;
import p153l.mvc0;
import p153l.srd;
import p153l.tm50;
import p153l.trd;
import p153l.urd;

/* JADX INFO: loaded from: classes3.dex */
public class VPullDownRefreshLayout extends SmartRefreshLayout implements mvc0 {

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$a */
    public class C22671a implements jn50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jn50 f210195a;

        public C22671a(jn50 jn50Var) {
            this.f210195a = jn50Var;
        }

        @Override // p153l.jn50
        /* JADX INFO: renamed from: w2 */
        public void mo59137w2(@NonNull mvc0 mvc0Var) {
            this.f210195a.mo59137w2(VPullDownRefreshLayout.this);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$b */
    public class C22672b implements tm50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ tm50 f210197a;

        public C22672b(tm50 tm50Var) {
            this.f210197a = tm50Var;
        }

        @Override // p153l.tm50
        /* JADX INFO: renamed from: a */
        public void mo79018a(@NonNull mvc0 mvc0Var) {
            this.f210197a.mo79018a(VPullDownRefreshLayout.this);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$c */
    public class C22673c implements kn50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kn50 f210199a;

        public C22673c(kn50 kn50Var) {
            this.f210199a = kn50Var;
        }

        @Override // p153l.tm50
        /* JADX INFO: renamed from: a */
        public void mo79018a(@NonNull mvc0 mvc0Var) {
            this.f210199a.mo79018a(VPullDownRefreshLayout.this);
        }

        @Override // p153l.jn50
        /* JADX INFO: renamed from: w2 */
        public void mo59137w2(@NonNull mvc0 mvc0Var) {
            this.f210199a.mo59137w2(VPullDownRefreshLayout.this);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$d */
    public class C22674d implements trd {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ trd f210201a;

        public C22674d(trd trdVar) {
            this.f210201a = trdVar;
        }

        @Override // p153l.trd
        @NonNull
        /* JADX INFO: renamed from: a */
        public kvc0 mo192470a(@NonNull Context context, @NonNull mvc0 mvc0Var) {
            return mvc0Var != null ? this.f210201a.mo192470a(context, mvc0Var) : new TTRefreshHeader(context);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$e */
    public class C22675e implements srd {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ srd f210202a;

        public C22675e(srd srdVar) {
            this.f210202a = srdVar;
        }

        @Override // p153l.srd
        @NonNull
        /* JADX INFO: renamed from: a */
        public jvc0 mo187594a(@NonNull Context context, @NonNull mvc0 mvc0Var) {
            return mvc0Var != null ? this.f210202a.mo187594a(context, mvc0Var) : new TTRefreshFooter(context);
        }
    }

    /* JADX INFO: renamed from: v.VPullDownRefreshLayout$f */
    public class C22676f implements urd {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ urd f210203a;

        public C22676f(urd urdVar) {
            this.f210203a = urdVar;
        }

        @Override // p153l.urd
        /* JADX INFO: renamed from: a */
        public void mo197503a(@NonNull Context context, @NonNull mvc0 mvc0Var) {
            if (mvc0Var != null) {
                this.f210203a.mo197503a(context, mvc0Var);
            }
        }
    }

    public VPullDownRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m225005K(2.0f);
        m225004J(2.0f);
        mo224409S(new TTRefreshHeader(context));
        mo224407Q(new TTRefreshFooter(context));
    }

    public static void setDefaultRefreshFooterCreator(@NonNull srd srdVar) {
        SmartRefreshLayout.setDefaultRefreshFooterCreator(new C22675e(srdVar));
    }

    public static void setDefaultRefreshHeaderCreator(@NonNull trd trdVar) {
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new C22674d(trdVar));
    }

    public static void setDefaultRefreshInitializer(@NonNull urd urdVar) {
        SmartRefreshLayout.setDefaultRefreshInitializer(new C22676f(urdVar));
    }

    @Override // p151v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: M */
    public mvc0 mo224404M(tm50 tm50Var) {
        super.mo224404M(new C22672b(tm50Var));
        return this;
    }

    @Override // p151v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: O */
    public mvc0 mo224405O(jn50 jn50Var) {
        super.mo224405O(new C22671a(jn50Var));
        return this;
    }

    @Override // p151v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: P */
    public mvc0 mo224406P(kn50 kn50Var) {
        super.mo224406P(new C22673c(kn50Var));
        return this;
    }

    @Override // p151v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: Q */
    public mvc0 mo224407Q(@NonNull jvc0 jvc0Var) {
        return mo224408R(jvc0Var, -1, -2);
    }

    @Override // p151v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: R */
    public mvc0 mo224408R(@NonNull jvc0 jvc0Var, int i, int i2) {
        super.mo224408R(jvc0Var, i, i2);
        return this;
    }

    @Override // p151v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: S */
    public mvc0 mo224409S(@NonNull kvc0 kvc0Var) {
        return mo224410T(kvc0Var, -1, -2);
    }

    @Override // p151v.smart_refresh.SmartRefreshLayout
    /* JADX INFO: renamed from: T */
    public mvc0 mo224410T(@NonNull kvc0 kvc0Var, int i, int i2) {
        super.mo224410T(kvc0Var, i, i2);
        return this;
    }

    @Override // p151v.smart_refresh.SmartRefreshLayout
    @Nullable
    public jvc0 getRefreshFooter() {
        gvc0 gvc0Var = this.f210895Y0;
        if (gvc0Var instanceof jvc0) {
            return (jvc0) gvc0Var;
        }
        return null;
    }

    @Override // p151v.smart_refresh.SmartRefreshLayout
    @Nullable
    public kvc0 getRefreshHeader() {
        gvc0 gvc0Var = this.f210894X0;
        if (gvc0Var instanceof kvc0) {
            return (kvc0) gvc0Var;
        }
        return null;
    }

    public VPullDownRefreshLayout(Context context) {
        this(context, null);
    }
}
