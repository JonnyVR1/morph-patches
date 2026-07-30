package p149l;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.VerifyReason;
import p147v.VMaterialEdit;

/* JADX INFO: loaded from: classes8.dex */
public class na60 extends jq2<qa60> {
    public na60(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m158581e0(VMaterialEdit vMaterialEdit, CharSequence charSequence) {
        if (charSequence.length() > 0) {
            vMaterialEdit.setError(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m158586n0(Bundle bundle) {
        ((qa60) this.viewModel).m173689r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.ia60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112284a.m158586n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public View.OnClickListener m158587j0(final VMaterialEdit vMaterialEdit) {
        return new View.OnClickListener() { // from class: l.ka60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122097a.m158590m0(vMaterialEdit, view);
            }
        };
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m158588k0(Boolean bool) {
        act().progressDismiss();
        if (bool.booleanValue()) {
            act().startActivity(CoreModule.m29931H().phoneVerificationActArgs(act(), VerifyReason.get(VerifyReason.change_phone)));
            act().lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m158589l0(VMaterialEdit vMaterialEdit, Throwable th) {
        act().progressDismiss();
        if (bne0.m102777f() && Build.VERSION.SDK_INT >= 27 && (th instanceof TantanException.Client.AccountService)) {
            vMaterialEdit.setError(CoreModule.m29931H().mo28175wj(th));
        } else {
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m158590m0(final VMaterialEdit vMaterialEdit, View view) {
        if (vMaterialEdit.getText().length() <= 0) {
            vMaterialEdit.setError(act().string(R$string.f27702D3));
        } else {
            act().progress(R$string.f27771R0);
            CoreModule.f17545c.f19627a0.m171567G3(vMaterialEdit.getText().toString()).subscribe(mkd0.m154956H(new e30() { // from class: l.la60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f127168a.m158588k0((Boolean) obj);
                }
            }, new e30() { // from class: l.ma60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f132835a.m158589l0(vMaterialEdit, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m158591o0(final VMaterialEdit vMaterialEdit) {
        vMaterialEdit.m223127H().subscribe(mkd0.m154955G(new e30() { // from class: l.ja60
            @Override // p149l.e30
            public final void call(Object obj) {
                na60.m158581e0(vMaterialEdit, (CharSequence) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
