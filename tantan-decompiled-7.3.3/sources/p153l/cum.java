package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;

/* JADX INFO: loaded from: classes12.dex */
public class cum {
    /* JADX INFO: renamed from: a */
    public static View m112692a(Context context, @LayoutRes int i, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(i, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public static View m112693b(Context context, @LayoutRes int i, ViewGroup viewGroup, boolean z) {
        return LayoutInflater.from(context).inflate(i, viewGroup, z);
    }
}
