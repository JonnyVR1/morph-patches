package p007l;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.VerifyReason;
import l.bne0;
import l.e30;
import l.yij0;
import v.VMaterialEdit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class na60 extends jq2<qa60> {
    public na60(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m9968e0(VMaterialEdit vMaterialEdit, CharSequence charSequence) {
        if (charSequence.length() > 0) {
            vMaterialEdit.setError((CharSequence) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m9973n0(Bundle bundle) {
        ((qa60) this.viewModel).m10308r();
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo8872a0() {
        creates(new e30() { // from class: l.ia60
            public final void call(Object obj) {
                this.f2877a.m9973n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public View.OnClickListener m9974j0(final VMaterialEdit vMaterialEdit) {
        return new View.OnClickListener() { // from class: l.ka60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3052a.m9977m0(vMaterialEdit, view);
            }
        };
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m9975k0(Boolean bool) {
        act().progressDismiss();
        if (bool.booleanValue()) {
            act().startActivity(CoreModule.H().phoneVerificationActArgs(act(), VerifyReason.get("change-phone")));
            act().lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m9976l0(VMaterialEdit vMaterialEdit, Throwable th) {
        act().progressDismiss();
        if (bne0.f() && Build.VERSION.SDK_INT >= 27 && (th instanceof TantanException.Client.AccountService)) {
            vMaterialEdit.setError(CoreModule.H().wj(th));
        } else {
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m9977m0(final VMaterialEdit vMaterialEdit, View view) {
        if (vMaterialEdit.getText().length() <= 0) {
            vMaterialEdit.setError(act().string(R.string.D3));
        } else {
            act().progress(R.string.R0);
            CoreModule.c.a0.G3(vMaterialEdit.getText().toString()).subscribe(mkd0.m9875H(new e30() { // from class: l.la60
                public final void call(Object obj) {
                    this.f3215a.m9975k0((Boolean) obj);
                }
            }, new e30() { // from class: l.ma60
                public final void call(Object obj) {
                    this.f3293a.m9976l0(vMaterialEdit, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m9978o0(final VMaterialEdit vMaterialEdit) {
        vMaterialEdit.H().subscribe(mkd0.m9874G(new e30() { // from class: l.ja60
            public final void call(Object obj) {
                na60.m9968e0(vMaterialEdit, (CharSequence) obj);
            }
        }));
    }

    @Override // p007l.q0m
    public void destroy() {
    }
}
