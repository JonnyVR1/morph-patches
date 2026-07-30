package p149l;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(18)
public class k6q0 implements l6q0 {

    /* JADX INFO: renamed from: a */
    public final WindowId f121499a;

    public k6q0(@NonNull View view) {
        this.f121499a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof k6q0) && ((k6q0) obj).f121499a.equals(this.f121499a);
    }

    public int hashCode() {
        return this.f121499a.hashCode();
    }
}
