package p153l;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

/* JADX INFO: loaded from: classes6.dex */
public final class n0t0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f139667a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f139668b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p0t0 f139669c;

    public n0t0(p0t0 p0t0Var, String str, String str2) {
        this.f139667a = str;
        this.f139668b = str2;
        this.f139669c = p0t0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f139669c.f150097d.getSystemService("download");
        try {
            String str = this.f139667a;
            String str2 = this.f139668b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            bxy0.m106934r();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f139669c.m183979c("Could not store picture.");
        }
    }
}
