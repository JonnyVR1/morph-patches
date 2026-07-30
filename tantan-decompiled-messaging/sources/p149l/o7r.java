package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes11.dex */
public class o7r {
    /* JADX INFO: renamed from: a */
    public static LayoutInflater m163037a(Context context) {
        if (context == null) {
            return null;
        }
        return context instanceof Act ? ((Act) context).inflater() : LayoutInflater.from(context);
    }
}
