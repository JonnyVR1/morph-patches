package p007l;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class fyg implements cyg<String> {
    @Override // p007l.cyg
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo9254a(String str, lyg.C2422a c2422a, Dialog dialog) {
        dialog.addContentView(m10326d(str, c2422a, dialog), new ViewGroup.LayoutParams(-1, c2422a.f10158c));
    }

    /* JADX INFO: renamed from: d */
    public final View m10326d(String str, lyg.C2422a c2422a, final Dialog dialog) {
        View viewInflate = LayoutInflater.from(c2422a.f10161f).inflate(o6c0.f11118R0, (ViewGroup) null);
        viewInflate.findViewById(b5c0.f5944A).setText(str);
        viewInflate.findViewById(b5c0.f5974K).setOnClickListener(new View.OnClickListener() { // from class: l.eyg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.hide();
            }
        });
        return viewInflate;
    }
}
