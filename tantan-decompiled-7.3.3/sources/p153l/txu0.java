package p153l;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdw;

/* JADX INFO: loaded from: classes6.dex */
public final class txu0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f176607e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f176608f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Context f176609g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Bundle f176610h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ zyu0 f176611i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txu0(zyu0 zyu0Var, String str, String str2, Context context, Bundle bundle) {
        super(zyu0Var);
        this.f176607e = str;
        this.f176608f = str2;
        this.f176609g = context;
        this.f176610h = bundle;
        this.f176611i = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f176611i.m222174P(this.f176607e, this.f176608f)) {
                str3 = this.f176608f;
                str2 = this.f176607e;
                str = this.f176611i.f206636a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.f176609g);
            zyu0 zyu0Var = this.f176611i;
            zyu0Var.f206644i = zyu0Var.m222191g(this.f176609g, true);
            if (this.f176611i.f206644i == null) {
                String unused = this.f176611i.f206636a;
                return;
            }
            int iM12528a = DynamiteModule.m12528a(this.f176609g, ModuleDescriptor.MODULE_ID);
            int iM12529c = DynamiteModule.m12529c(this.f176609g, ModuleDescriptor.MODULE_ID);
            ((pgu0) Preconditions.checkNotNull(this.f176611i.f206644i)).initialize(h950.m134038Y2(this.f176609g), new zzdw(106000L, Math.max(iM12528a, iM12529c), iM12529c < iM12528a, str, str2, str3, this.f176610h, dsx0.m117784a(this.f176609g)), this.f206645a);
        } catch (Exception e) {
            this.f176611i.m222198q(e, true, false);
        }
    }
}
