package p149l;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdw;

/* JADX INFO: loaded from: classes6.dex */
public final class nou0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f139879e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f139880f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Context f139881g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Bundle f139882h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ tpu0 f139883i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nou0(tpu0 tpu0Var, String str, String str2, Context context, Bundle bundle) {
        super(tpu0Var);
        this.f139879e = str;
        this.f139880f = str2;
        this.f139881g = context;
        this.f139882h = bundle;
        this.f139883i = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f139883i.m190031P(this.f139879e, this.f139880f)) {
                str3 = this.f139880f;
                str2 = this.f139879e;
                str = this.f139883i.f171510a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.f139881g);
            tpu0 tpu0Var = this.f139883i;
            tpu0Var.f171518i = tpu0Var.m190048g(this.f139881g, true);
            if (this.f139883i.f171518i == null) {
                String unused = this.f139883i.f171510a;
                return;
            }
            int iM12474a = DynamiteModule.m12474a(this.f139881g, ModuleDescriptor.MODULE_ID);
            int iM12475c = DynamiteModule.m12475c(this.f139881g, ModuleDescriptor.MODULE_ID);
            ((j7u0) Preconditions.checkNotNull(this.f139883i.f171518i)).initialize(s050.m181848Y2(this.f139881g), new zzdw(106000L, Math.max(iM12474a, iM12475c), iM12475c < iM12474a, str, str2, str3, this.f139882h, xix0.m209682a(this.f139881g)), this.f171519a);
        } catch (Exception e) {
            this.f139883i.m190055q(e, true, false);
        }
    }
}
