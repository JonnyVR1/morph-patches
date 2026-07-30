package p149l;

import android.view.View;
import com.google.android.gms.ads.internal.overlay.BinderC2073b;

/* JADX INFO: loaded from: classes6.dex */
public final class ipv0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BinderC2073b f114352a;

    public ipv0(BinderC2073b binderC2073b) {
        this.f114352a = binderC2073b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BinderC2073b binderC2073b = this.f114352a;
        binderC2073b.f9704v = 2;
        binderC2073b.f9683a.finish();
    }
}
