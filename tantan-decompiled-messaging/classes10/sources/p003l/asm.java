package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class asm {
    /* JADX INFO: renamed from: a */
    public static View m5624a(Context context, @LayoutRes int i, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(i, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public static View m5625b(Context context, @LayoutRes int i, ViewGroup viewGroup, boolean z) {
        return LayoutInflater.from(context).inflate(i, viewGroup, z);
    }
}
