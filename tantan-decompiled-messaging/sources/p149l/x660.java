package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes13.dex */
public abstract class x660<T extends View> {
    /* JADX INFO: renamed from: a */
    public T m207167a(Context context, ViewGroup viewGroup) {
        return (T) LayoutInflater.from(context).inflate(mo94433b(), viewGroup, false);
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo94433b();
}
