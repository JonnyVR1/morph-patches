package p153l;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class m7r0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f135099a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Intent f135100b;

    public m7r0(Context context, Intent intent) {
        this.f135099a = context;
        this.f135100b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f135099a.startActivity(this.f135100b);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
