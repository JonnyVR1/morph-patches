package tech.sud.runtime.component.p143b;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;

/* JADX INFO: renamed from: tech.sud.runtime.component.b.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22521a {

    /* JADX INFO: renamed from: a */
    private Context f208476a;

    /* JADX INFO: renamed from: b */
    private final ArrayList<String> f208477b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private AlertDialog f208478c = null;

    public C22521a(Context context) {
        this.f208476a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m222857b() {
        if (this.f208477b.isEmpty() || this.f208476a == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f208476a);
        builder.setMessage(this.f208477b.get(0));
        this.f208477b.remove(0);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: tech.sud.runtime.component.b.a.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialogShow = builder.show();
        this.f208478c = alertDialogShow;
        alertDialogShow.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: tech.sud.runtime.component.b.a.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                C22521a.this.f208478c = null;
                C22521a.this.m222857b();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m222859a(String str) {
        this.f208477b.add(str);
        if (this.f208478c == null) {
            m222857b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m222858a() {
        this.f208477b.clear();
        AlertDialog alertDialog = this.f208478c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }
}
