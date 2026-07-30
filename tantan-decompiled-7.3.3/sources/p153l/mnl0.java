package p153l;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public class mnl0 extends vnl0 {

    /* JADX INFO: renamed from: c */
    public static boolean f137712c = true;

    @Override // p153l.vnl0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b */
    public float mo159189b(@NonNull View view) {
        if (f137712c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f137712c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p153l.vnl0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: e */
    public void mo159191e(@NonNull View view, float f) {
        if (f137712c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f137712c = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // p153l.vnl0
    /* JADX INFO: renamed from: a */
    public void mo159188a(@NonNull View view) {
    }

    @Override // p153l.vnl0
    /* JADX INFO: renamed from: c */
    public void mo159190c(@NonNull View view) {
    }
}
