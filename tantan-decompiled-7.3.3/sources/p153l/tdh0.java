package p153l;

import com.immomo.svgaplayer.setting.SVGAAdapterContainer;

/* JADX INFO: loaded from: classes13.dex */
public class tdh0 {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f173365a;

    /* JADX INFO: renamed from: a */
    public static void m190630a() {
        if (f173365a) {
            return;
        }
        f173365a = true;
        std0 std0Var = new std0();
        SVGAAdapterContainer.Companion companion = SVGAAdapterContainer.INSTANCE;
        companion.setMSVGAResLoadAdapter(new otd0(std0Var));
        companion.setMSVGAThreadAdapter(new rtd0(std0Var));
    }
}
