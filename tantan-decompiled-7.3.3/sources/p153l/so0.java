package p153l;

import android.graphics.Bitmap;
import com.tantan.library.svga.compose.SVGAVideoEntity;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class so0 {

    /* JADX INFO: renamed from: a */
    public int f169820a;

    /* JADX INFO: renamed from: b */
    public int f169821b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, Bitmap> f169822c;

    /* JADX INFO: renamed from: d */
    public cp0 f169823d;

    /* JADX INFO: renamed from: a */
    public static so0 m187041a(SVGAVideoEntity sVGAVideoEntity) {
        so0 so0Var = new so0();
        so0Var.f169820a = sVGAVideoEntity.getFps();
        so0Var.f169821b = sVGAVideoEntity.getFrames();
        so0Var.f169822c = sVGAVideoEntity.getImageMap();
        so0Var.f169823d = cp0.m111726a(sVGAVideoEntity.getVideoSize());
        return so0Var;
    }

    /* JADX INFO: renamed from: b */
    public cp0 m187042b() {
        return this.f169823d;
    }
}
