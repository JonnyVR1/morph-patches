package tech.sud.runtime.component.p020b;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;

/* JADX INFO: renamed from: tech.sud.runtime.component.b.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1199a {

    /* JADX INFO: renamed from: a */
    private Context f11179a;

    /* JADX INFO: renamed from: b */
    private final ArrayList<String> f11180b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private AlertDialog f11181c = null;

    public C1199a(Context context) {
        this.f11179a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m10082b() {
        if (this.f11180b.isEmpty() || this.f11179a == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f11179a);
        builder.setMessage(this.f11180b.get(0));
        this.f11180b.remove(0);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: tech.sud.runtime.component.b.a.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialogShow = builder.show();
        this.f11181c = alertDialogShow;
        alertDialogShow.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: tech.sud.runtime.component.b.a.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                C1199a.this.f11181c = null;
                C1199a.this.m10082b();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m10084a(String str) {
        this.f11180b.add(str);
        if (this.f11181c == null) {
            m10082b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10083a() {
        this.f11180b.clear();
        AlertDialog alertDialog = this.f11181c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }
}
