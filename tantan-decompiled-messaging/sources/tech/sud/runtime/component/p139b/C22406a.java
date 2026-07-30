package tech.sud.runtime.component.p139b;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;

/* JADX INFO: renamed from: tech.sud.runtime.component.b.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22406a {

    /* JADX INFO: renamed from: a */
    private Context f207554a;

    /* JADX INFO: renamed from: b */
    private final ArrayList<String> f207555b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private AlertDialog f207556c = null;

    public C22406a(Context context) {
        this.f207554a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m221611b() {
        if (this.f207555b.isEmpty() || this.f207554a == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f207554a);
        builder.setMessage(this.f207555b.get(0));
        this.f207555b.remove(0);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: tech.sud.runtime.component.b.a.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialogShow = builder.show();
        this.f207556c = alertDialogShow;
        alertDialogShow.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: tech.sud.runtime.component.b.a.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                C22406a.this.f207556c = null;
                C22406a.this.m221611b();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m221613a(String str) {
        this.f207555b.add(str);
        if (this.f207556c == null) {
            m221611b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221612a() {
        this.f207555b.clear();
        AlertDialog alertDialog = this.f207556c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }
}
