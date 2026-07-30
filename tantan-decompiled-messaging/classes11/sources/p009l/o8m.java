package p009l;

import com.p1.mobile.putong.core.CoreModule;
import l.hpd0;
import l.tpd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class o8m {

    /* JADX INFO: renamed from: j */
    public static o8m f17871j;

    /* JADX INFO: renamed from: a */
    public tpd0 f17872a = new tpd0("iceBreakQuestionCardTodayInsertCount" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public zpd0 f17873b = new zpd0("iceBreakQuestionCardLastInsertTime" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public tpd0 f17874c = new tpd0("iceBreakQuestionCardIgnoreCount" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: d */
    public zpd0 f17875d = new zpd0("iceBreakQuestionCardLastIgnoreTime" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public zpd0 f17876e = new zpd0("iceBreakQuestionDialogLastShowTime" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public tpd0 f17877f = new tpd0("iceBreakQuestionDialogIgnoreCount" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: g */
    public zpd0 f17878g = new zpd0("iceBreakQuestionDialogLastIgnoreTime" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public hpd0 f17879h = new hpd0("iceBreakQuestionSideEntryClickedSV" + CoreModule.H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: i */
    public boolean f17880i = false;

    /* JADX INFO: renamed from: a */
    public static o8m m19650a() {
        if (f17871j == null) {
            synchronized (o8m.class) {
                try {
                    if (f17871j == null) {
                        f17871j = new o8m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17871j;
    }

    /* JADX INFO: renamed from: b */
    public static String m19651b() {
        return juk.m17221e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/chat-assistant3/index.html?speed=true&_bid=1004893&hideNavigationBar=1&hideNotch=1#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/chat-assistant3/index.html?speed=true&_bid=1004893&hideNavigationBar=1&hideNotch=1#/";
    }

    /* JADX INFO: renamed from: c */
    public static void m19652c() {
        f17871j = null;
    }

    /* JADX INFO: renamed from: d */
    public void m19653d() {
        this.f17874c.put(0);
        this.f17875d.put(0L);
    }

    /* JADX INFO: renamed from: e */
    public void m19654e() {
        this.f17877f.put(0);
        this.f17878g.put(0L);
    }

    /* JADX INFO: renamed from: f */
    public void m19655f() {
        this.f17876e.put(Long.valueOf(mqi0.m18550o()));
        this.f17877f.a(1);
        this.f17878g.put(Long.valueOf(mqi0.m18550o()));
    }
}
