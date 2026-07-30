package p153l;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.VerifyReason;
import p151v.VMaterialEdit;

/* JADX INFO: loaded from: classes9.dex */
public class si60 extends ar2<vi60> {
    public si60(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m186003e0(VMaterialEdit vMaterialEdit, CharSequence charSequence) {
        if (charSequence.length() > 0) {
            vMaterialEdit.setError(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m186008n0(Bundle bundle) {
        ((vi60) this.viewModel).m201331r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.ni60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142096a.m186008n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public View.OnClickListener m186009j0(final VMaterialEdit vMaterialEdit) {
        return new View.OnClickListener() { // from class: l.pi60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152516a.m186012m0(vMaterialEdit, view);
            }
        };
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m186010k0(Boolean bool) {
        act().progressDismiss();
        if (bool.booleanValue()) {
            act().startActivity(CoreModule.m30929H().phoneVerificationActArgs(act(), VerifyReason.get(VerifyReason.change_phone)));
            act().lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m186011l0(VMaterialEdit vMaterialEdit, Throwable th) {
        act().progressDismiss();
        if (ive0.m142292f() && Build.VERSION.SDK_INT >= 27 && (th instanceof TantanException.Client.AccountService)) {
            vMaterialEdit.setError(CoreModule.m30929H().mo29174wj(th));
        } else {
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m186012m0(final VMaterialEdit vMaterialEdit, View view) {
        if (vMaterialEdit.getText().length() <= 0) {
            vMaterialEdit.setError(act().string(R$string.f28550D3));
        } else {
            act().progress(R$string.f28619R0);
            CoreModule.f18264c.f20369a0.m188263G3(vMaterialEdit.getText().toString()).subscribe(psd0.m173597H(new y20() { // from class: l.qi60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f157804a.m186010k0((Boolean) obj);
                }
            }, new y20() { // from class: l.ri60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f163340a.m186011l0(vMaterialEdit, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m186013o0(final VMaterialEdit vMaterialEdit) {
        vMaterialEdit.m224373H().subscribe(psd0.m173596G(new y20() { // from class: l.oi60
            @Override // p153l.y20
            public final void call(Object obj) {
                si60.m186003e0(vMaterialEdit, (CharSequence) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
