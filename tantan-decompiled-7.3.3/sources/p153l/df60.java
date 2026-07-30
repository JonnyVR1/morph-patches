package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes9.dex */
public abstract class df60<T extends View> {
    /* JADX INFO: renamed from: a */
    public T m115505a(Context context, ViewGroup viewGroup) {
        return (T) LayoutInflater.from(context).inflate(mo115506b(), viewGroup, false);
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo115506b();
}
