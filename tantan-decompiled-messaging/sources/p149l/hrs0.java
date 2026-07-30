package p149l;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

/* JADX INFO: loaded from: classes6.dex */
public final class hrs0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f109258a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f109259b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jrs0 f109260c;

    public hrs0(jrs0 jrs0Var, String str, String str2) {
        this.f109258a = str;
        this.f109259b = str2;
        this.f109260c = jrs0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f109260c.f119439d.getSystemService("download");
        try {
            String str = this.f109258a;
            String str2 = this.f109259b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            vny0.m199080r();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f109260c.m156080c("Could not store picture.");
        }
    }
}
