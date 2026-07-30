package p149l;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public class iel0 extends rel0 {

    /* JADX INFO: renamed from: c */
    public static boolean f112810c = true;

    @Override // p149l.rel0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b */
    public float mo135712b(@NonNull View view) {
        if (f112810c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f112810c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p149l.rel0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: e */
    public void mo135714e(@NonNull View view, float f) {
        if (f112810c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f112810c = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // p149l.rel0
    /* JADX INFO: renamed from: a */
    public void mo135711a(@NonNull View view) {
    }

    @Override // p149l.rel0
    /* JADX INFO: renamed from: c */
    public void mo135713c(@NonNull View view) {
    }
}
