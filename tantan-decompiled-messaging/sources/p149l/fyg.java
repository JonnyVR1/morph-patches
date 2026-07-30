package p149l;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class fyg implements cyg<String> {
    @Override // p149l.cyg
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo109309a(String str, lyg.C18354a c18354a, Dialog dialog) {
        dialog.addContentView(m123765d(str, c18354a, dialog), new ViewGroup.LayoutParams(-1, c18354a.f130566c));
    }

    /* JADX INFO: renamed from: d */
    public final View m123765d(String str, lyg.C18354a c18354a, final Dialog dialog) {
        View viewInflate = LayoutInflater.from(c18354a.f130569f).inflate(o6c0.f142099R0, (ViewGroup) null);
        ((VText) viewInflate.findViewById(b5c0.f73463A)).setText(str);
        ((VText) viewInflate.findViewById(b5c0.f73493K)).setOnClickListener(new View.OnClickListener() { // from class: l.eyg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.hide();
            }
        });
        return viewInflate;
    }
}
