package p153l;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.immomo.momosec.device.oaid.OAIDException;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class e350 implements d1m {

    /* JADX INFO: renamed from: a */
    private final Context f91928a;

    public e350(Context context) {
        this.f91928a = context;
    }

    @Override // p153l.d1m
    @SuppressLint({"AnnotateVersionCheck"})
    /* JADX INFO: renamed from: a */
    public boolean mo106874a() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: b */
    public void mo106875b(pul pulVar) {
        if (this.f91928a == null || pulVar == null) {
            return;
        }
        if (!mo106874a()) {
            jmw.m146176a(qmw.m177151a(new byte[]{127, 8, 93, 78, 65, 21, 69, 22, 65, 88, 19, 18, 67, 70, 112, 89, 5, 20, 95, 15, 85, 23, 80, 86, 30, 86, 17, 86, 15, 2, Tnaf.POW_2_WIDTH, 7, 83, 88, 23, 3, Tnaf.POW_2_WIDTH, 0, 94, 69, 65, 40, 69, 4, 88, 86}));
            pulVar.mo173889b(new OAIDException(qmw.m177151a(new byte[]{127, 8, 93, 78, 65, 21, 69, 22, 65, 88, 19, 18, 67, 70, 112, 89, 5, 20, 95, 15, 85, 23, 80, 86, 30, 86, 17, 86, 15, 2, Tnaf.POW_2_WIDTH, 7, 83, 88, 23, 3, Tnaf.POW_2_WIDTH, 0, 94, 69, 65, 40, 69, 4, 88, 86})));
            return;
        }
        try {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f91928a.getContentResolver().acquireContentProviderClient(Uri.parse(qmw.m177151a(new byte[]{83, 9, 95, 67, 4, 8, 68, 92, 30, 24, 2, 8, 30, 8, 68, 85, 8, 7, 30, 15, 85, 82, 15, 18, 89, 18, 72, 24, 8, 2, 85, 8, 69, 94, 21, 31})));
            if (contentProviderClientAcquireContentProviderClient != null) {
                Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call(qmw.m177151a(new byte[]{87, 3, 69, 120, HttpTokens.SPACE, 47, 116}), null, null);
                contentProviderClientAcquireContentProviderClient.close();
                if (bundleCall == null) {
                    throw new OAIDException(qmw.m177151a(new byte[]{127, 39, 120, 115, 65, 23, 69, 3, 67, 78, 65, 0, 81, 15, 93, 82, 5, 92, Tnaf.POW_2_WIDTH, 4, 68, 89, 5, 10, 85, 70, 88, 68, 65, 8, 69, 10, 93}));
                }
                String string = bundleCall.getInt(qmw.m177151a(new byte[]{83, 9, 85, 82}), -1) == 0 ? bundleCall.getString(qmw.m177151a(new byte[]{89, 2})) : null;
                if (string == null || string.length() == 0) {
                    throw new OAIDException(qmw.m177151a(new byte[]{127, 39, 120, 115, 65, 23, 69, 3, 67, 78, 65, 0, 81, 15, 93, 82, 5, 92, Tnaf.POW_2_WIDTH}) + bundleCall.getString(qmw.m177151a(new byte[]{93, 3, 66, 68, 0, 1, 85})));
                }
                jmw.m146176a(qmw.m177151a(new byte[]{127, 39, 120, 115, 65, 23, 69, 3, 67, 78, 65, 21, 69, 5, 82, 82, 18, 21, 10, 70}) + string);
                pulVar.mo173888a(string);
            }
        } catch (Exception e) {
            pulVar.mo173889b(e);
        }
    }
}
