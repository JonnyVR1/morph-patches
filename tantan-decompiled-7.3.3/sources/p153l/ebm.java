package p153l;

import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class ebm {

    /* JADX INFO: renamed from: j */
    public static ebm f92932j;

    /* JADX INFO: renamed from: a */
    public vxd0 f92933a = new vxd0("iceBreakQuestionCardTodayInsertCount" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public byd0 f92934b = new byd0("iceBreakQuestionCardLastInsertTime" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public vxd0 f92935c = new vxd0("iceBreakQuestionCardIgnoreCount" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: d */
    public byd0 f92936d = new byd0("iceBreakQuestionCardLastIgnoreTime" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public byd0 f92937e = new byd0("iceBreakQuestionDialogLastShowTime" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public vxd0 f92938f = new vxd0("iceBreakQuestionDialogIgnoreCount" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: g */
    public byd0 f92939g = new byd0("iceBreakQuestionDialogLastIgnoreTime" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public jxd0 f92940h = new jxd0("iceBreakQuestionSideEntryClickedSV" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: i */
    public boolean f92941i = false;

    /* JADX INFO: renamed from: a */
    public static ebm m120180a() {
        if (f92932j == null) {
            synchronized (ebm.class) {
                try {
                    if (f92932j == null) {
                        f92932j = new ebm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f92932j;
    }

    /* JADX INFO: renamed from: b */
    public static String m120181b() {
        return zwk.m221905e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/chat-assistant3/index.html?speed=true&_bid=1004893&hideNavigationBar=1&hideNotch=1#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/chat-assistant3/index.html?speed=true&_bid=1004893&hideNavigationBar=1&hideNotch=1#/";
    }

    /* JADX INFO: renamed from: c */
    public static void m120182c() {
        f92932j = null;
    }

    /* JADX INFO: renamed from: d */
    public void m120183d() {
        this.f92935c.put(0);
        this.f92936d.put(0L);
    }

    /* JADX INFO: renamed from: e */
    public void m120184e() {
        this.f92938f.put(0);
        this.f92939g.put(0L);
    }

    /* JADX INFO: renamed from: f */
    public void m120185f() {
        this.f92937e.put(Long.valueOf(pzi0.m174454o()));
        this.f92938f.m203841a(1);
        this.f92939g.put(Long.valueOf(pzi0.m174454o()));
    }
}
