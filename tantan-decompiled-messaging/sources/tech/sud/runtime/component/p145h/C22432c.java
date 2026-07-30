package tech.sud.runtime.component.p145h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: tech.sud.runtime.component.h.c */
/* JADX INFO: loaded from: classes3.dex */
public class C22432c {
    /* JADX INFO: renamed from: a */
    public static Activity m221843a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
