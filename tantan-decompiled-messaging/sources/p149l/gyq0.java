package p149l;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class gyq0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f105034a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Intent f105035b;

    public gyq0(Context context, Intent intent) {
        this.f105034a = context;
        this.f105035b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f105034a.startActivity(this.f105035b);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
