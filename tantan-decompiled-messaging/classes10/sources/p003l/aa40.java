package p003l;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.f6c0;
import l.o7r;
import l.szd;
import l.u4c0;
import l.v7c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class aa40 extends szd {

    /* JADX INFO: renamed from: j */
    public InterfaceC3278a f2749j;

    /* JADX INFO: renamed from: l.aa40$a */
    public interface InterfaceC3278a {
        void onClick(String str);
    }

    public aa40(Act act) {
        super(act, false, v7c0.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m5309G(View view) {
        dismiss();
        if (NullChecker.a(this.f2749j)) {
            this.f2749j.onClick("action_add");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m5310H(View view) {
        dismiss();
        if (NullChecker.a(this.f2749j)) {
            this.f2749j.onClick("action_notadd");
        }
    }

    /* JADX INFO: renamed from: I */
    public void m5311I(InterfaceC3278a interfaceC3278a) {
        this.f2749j = interfaceC3278a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        View viewInflate = o7r.a(getContext()).inflate(f6c0.f8, (ViewGroup) null);
        setContentView(viewInflate);
        xdl0.E0(viewInflate.findViewById(u4c0.w), new View.OnClickListener() { // from class: l.y940
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9008a.m5309G(view);
            }
        });
        xdl0.E0(viewInflate.findViewById(u4c0.R8), new View.OnClickListener() { // from class: l.z940
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9206a.m5310H(view);
            }
        });
    }
}
