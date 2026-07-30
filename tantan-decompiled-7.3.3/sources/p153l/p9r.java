package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes10.dex */
public class p9r {
    /* JADX INFO: renamed from: a */
    public static LayoutInflater m171370a(Context context) {
        if (context == null) {
            return null;
        }
        return context instanceof Act ? ((Act) context).inflater() : LayoutInflater.from(context);
    }
}
