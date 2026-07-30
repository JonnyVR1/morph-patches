package p149l;

import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class o8m {

    /* JADX INFO: renamed from: j */
    public static o8m f142647j;

    /* JADX INFO: renamed from: a */
    public tpd0 f142648a = new tpd0("iceBreakQuestionCardTodayInsertCount" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public zpd0 f142649b = new zpd0("iceBreakQuestionCardLastInsertTime" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public tpd0 f142650c = new tpd0("iceBreakQuestionCardIgnoreCount" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: d */
    public zpd0 f142651d = new zpd0("iceBreakQuestionCardLastIgnoreTime" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public zpd0 f142652e = new zpd0("iceBreakQuestionDialogLastShowTime" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public tpd0 f142653f = new tpd0("iceBreakQuestionDialogIgnoreCount" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: g */
    public zpd0 f142654g = new zpd0("iceBreakQuestionDialogLastIgnoreTime" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public hpd0 f142655h = new hpd0("iceBreakQuestionSideEntryClickedSV" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: i */
    public boolean f142656i = false;

    /* JADX INFO: renamed from: a */
    public static o8m m163183a() {
        if (f142647j == null) {
            synchronized (o8m.class) {
                try {
                    if (f142647j == null) {
                        f142647j = new o8m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f142647j;
    }

    /* JADX INFO: renamed from: b */
    public static String m163184b() {
        return juk.m143323e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/chat-assistant3/index.html?speed=true&_bid=1004893&hideNavigationBar=1&hideNotch=1#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/chat-assistant3/index.html?speed=true&_bid=1004893&hideNavigationBar=1&hideNotch=1#/";
    }

    /* JADX INFO: renamed from: c */
    public static void m163185c() {
        f142647j = null;
    }

    /* JADX INFO: renamed from: d */
    public void m163186d() {
        this.f142650c.put(0);
        this.f142651d.put(0L);
    }

    /* JADX INFO: renamed from: e */
    public void m163187e() {
        this.f142653f.put(0);
        this.f142654g.put(0L);
    }

    /* JADX INFO: renamed from: f */
    public void m163188f() {
        this.f142652e.put(Long.valueOf(mqi0.m155944o()));
        this.f142653f.m189988a(1);
        this.f142654g.put(Long.valueOf(mqi0.m155944o()));
    }
}
