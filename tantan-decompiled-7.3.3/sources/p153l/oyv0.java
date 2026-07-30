package p153l;

import android.view.View;
import com.google.android.gms.ads.internal.overlay.BinderC2096b;

/* JADX INFO: loaded from: classes6.dex */
public final class oyv0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BinderC2096b f149828a;

    public oyv0(BinderC2096b binderC2096b) {
        this.f149828a = binderC2096b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BinderC2096b binderC2096b = this.f149828a;
        binderC2096b.f9741v = 2;
        binderC2096b.f9720a.finish();
    }
}
