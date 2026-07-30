package p153l;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(18)
public class pfq0 implements qfq0 {

    /* JADX INFO: renamed from: a */
    public final WindowId f152201a;

    public pfq0(@NonNull View view) {
        this.f152201a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof pfq0) && ((pfq0) obj).f152201a.equals(this.f152201a);
    }

    public int hashCode() {
        return this.f152201a.hashCode();
    }
}
