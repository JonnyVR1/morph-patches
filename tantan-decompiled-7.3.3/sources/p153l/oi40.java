package p153l;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes2.dex */
public class oi40 extends g1e {

    /* JADX INFO: renamed from: j */
    public InterfaceC19141a f147510j;

    /* JADX INFO: renamed from: l.oi40$a */
    public interface InterfaceC19141a {
        void onClick(String str);
    }

    public oi40(Act act) {
        super(act, false, agc0.f71130p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m167768G(View view) {
        dismiss();
        if (NullChecker.m82486a(this.f147510j)) {
            this.f147510j.onClick("action_add");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m167769H(View view) {
        dismiss();
        if (NullChecker.m82486a(this.f147510j)) {
            this.f147510j.onClick("action_notadd");
        }
    }

    /* JADX INFO: renamed from: I */
    public void m167770I(InterfaceC19141a interfaceC19141a) {
        this.f147510j = interfaceC19141a;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = p9r.m171370a(getContext()).inflate(kec0.f125948m8, (ViewGroup) null);
        setContentView(viewInflate);
        bnl0.m105509E0(viewInflate.findViewById(adc0.f70615w), new View.OnClickListener() { // from class: l.mi40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136927a.m167768G(view);
            }
        });
        bnl0.m105509E0(viewInflate.findViewById(adc0.f70136T8), new View.OnClickListener() { // from class: l.ni40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142090a.m167769H(view);
            }
        });
    }
}
