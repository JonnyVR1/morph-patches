package p149l;

import com.immomo.svgaplayer.setting.SVGAAdapterContainer;

/* JADX INFO: loaded from: classes13.dex */
public class l5h0 {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f126172a;

    /* JADX INFO: renamed from: a */
    public static void m148643a() {
        if (f126172a) {
            return;
        }
        f126172a = true;
        qld0 qld0Var = new qld0();
        SVGAAdapterContainer.Companion companion = SVGAAdapterContainer.INSTANCE;
        companion.setMSVGAResLoadAdapter(new mld0(qld0Var));
        companion.setMSVGAThreadAdapter(new pld0(qld0Var));
    }
}
