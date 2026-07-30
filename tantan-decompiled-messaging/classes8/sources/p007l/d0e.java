package p007l;

import android.app.Dialog;
import androidx.annotation.NonNull;
import com.p003p1.mobile.android.app.C0231c;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface d0e {
    @NonNull
    c<C0231c> lifecycle();

    void onDialogAttachToWindow(Dialog dialog);

    void onDialogDetachFromWindow(Dialog dialog);
}
