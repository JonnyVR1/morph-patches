package p149l;

import android.os.AsyncTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class biy0 extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rly0 f75848a;

    public /* synthetic */ biy0(rly0 rly0Var, lfy0 lfy0Var) {
        this.f75848a = rly0Var;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            rly0 rly0Var = this.f75848a;
            rly0Var.f160046h = (ptr0) rly0Var.f160041c.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            x2t0.m206870h("", e);
        } catch (ExecutionException e2) {
            e = e2;
            x2t0.m206870h("", e);
        } catch (TimeoutException e3) {
            x2t0.m206870h("", e3);
        }
        return this.f75848a.zzp();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        rly0 rly0Var = this.f75848a;
        String str = (String) obj;
        if (rly0Var.f160044f == null || str == null) {
            return;
        }
        rly0Var.f160044f.loadUrl(str);
    }
}
