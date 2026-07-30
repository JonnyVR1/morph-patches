package p149l;

import android.graphics.Bitmap;
import com.tantan.library.svga.compose.SVGAVideoEntity;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class wo0 {

    /* JADX INFO: renamed from: a */
    public int f187370a;

    /* JADX INFO: renamed from: b */
    public int f187371b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, Bitmap> f187372c;

    /* JADX INFO: renamed from: d */
    public gp0 f187373d;

    /* JADX INFO: renamed from: a */
    public static wo0 m204794a(SVGAVideoEntity sVGAVideoEntity) {
        wo0 wo0Var = new wo0();
        wo0Var.f187370a = sVGAVideoEntity.getFps();
        wo0Var.f187371b = sVGAVideoEntity.getFrames();
        wo0Var.f187372c = sVGAVideoEntity.getImageMap();
        wo0Var.f187373d = gp0.m127322a(sVGAVideoEntity.getVideoSize());
        return wo0Var;
    }

    /* JADX INFO: renamed from: b */
    public gp0 m204795b() {
        return this.f187373d;
    }
}
