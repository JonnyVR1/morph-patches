package p149l;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class aa40 extends szd {

    /* JADX INFO: renamed from: j */
    public InterfaceC15554a f68272j;

    /* JADX INFO: renamed from: l.aa40$a */
    public interface InterfaceC15554a {
        void onClick(String str);
    }

    public aa40(Act act) {
        super(act, false, v7c0.f180369p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m95526G(View view) {
        dismiss();
        if (NullChecker.m81303a(this.f68272j)) {
            this.f68272j.onClick("action_add");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m95527H(View view) {
        dismiss();
        if (NullChecker.m81303a(this.f68272j)) {
            this.f68272j.onClick("action_notadd");
        }
    }

    /* JADX INFO: renamed from: I */
    public void m95528I(InterfaceC15554a interfaceC15554a) {
        this.f68272j = interfaceC15554a;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = o7r.m163037a(getContext()).inflate(f6c0.f95776f8, (ViewGroup) null);
        setContentView(viewInflate);
        xdl0.m208329E0(viewInflate.findViewById(u4c0.f174524w), new View.OnClickListener() { // from class: l.y940
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196933a.m95526G(view);
            }
        });
        xdl0.m208329E0(viewInflate.findViewById(u4c0.f174014R8), new View.OnClickListener() { // from class: l.z940
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202268a.m95527H(view);
            }
        });
    }
}
