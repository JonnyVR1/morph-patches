package p149l;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c8w0 extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public d8w0 f79822a;

    /* JADX INFO: renamed from: b */
    public final r7w0 f79823b;

    public c8w0(r7w0 r7w0Var) {
        this.f79823b = r7w0Var;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        d8w0 d8w0Var = this.f79822a;
        if (d8w0Var != null) {
            d8w0Var.m110394a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m105824b(d8w0 d8w0Var) {
        this.f79822a = d8w0Var;
    }
}
