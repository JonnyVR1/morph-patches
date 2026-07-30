package p153l;

import android.content.Context;
import com.momo.mcamera.mask.MaskStore;

/* JADX INFO: loaded from: classes13.dex */
public class xxh0 {

    /* JADX INFO: renamed from: b */
    public static xxh0 f196639b = new xxh0();

    /* JADX INFO: renamed from: a */
    public MaskStore f196640a = MaskStore.getInstance();

    /* JADX INFO: renamed from: a */
    public static xxh0 m213524a() {
        return f196639b;
    }

    /* JADX INFO: renamed from: b */
    public wxh0 m213525b(Context context, String str) {
        return new wxh0(this.f196640a.getMask(context, str));
    }
}
