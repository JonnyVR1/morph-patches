package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;

/* JADX INFO: loaded from: classes10.dex */
public class asm {
    /* JADX INFO: renamed from: a */
    public static View m98599a(Context context, @LayoutRes int i, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(i, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public static View m98600b(Context context, @LayoutRes int i, ViewGroup viewGroup, boolean z) {
        return LayoutInflater.from(context).inflate(i, viewGroup, z);
    }
}
