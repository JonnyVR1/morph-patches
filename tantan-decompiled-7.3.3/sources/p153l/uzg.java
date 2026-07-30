package p153l;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class uzg implements rzg<String> {
    @Override // p153l.rzg
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo183746a(String str, a0h.C15613a c15613a, Dialog dialog) {
        dialog.addContentView(m198832d(str, c15613a, dialog), new ViewGroup.LayoutParams(-1, c15613a.f67715c));
    }

    /* JADX INFO: renamed from: d */
    public final View m198832d(String str, a0h.C15613a c15613a, final Dialog dialog) {
        View viewInflate = LayoutInflater.from(c15613a.f67718f).inflate(tec0.f173568R0, (ViewGroup) null);
        ((VText) viewInflate.findViewById(hdc0.f108816A)).setText(str);
        ((VText) viewInflate.findViewById(hdc0.f108846K)).setOnClickListener(new View.OnClickListener() { // from class: l.tzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.hide();
            }
        });
        return viewInflate;
    }
}
