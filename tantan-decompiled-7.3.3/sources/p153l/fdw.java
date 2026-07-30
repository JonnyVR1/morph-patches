package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.CoreGiftPriority;
import com.p051p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p051p1.mobile.putong.core.data.LoveLetterMessageInfo;
import com.p051p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p051p1.mobile.putong.core.newui.loveletter.LoveLetterAct;
import com.p051p1.mobile.putong.core.newui.loveletter.LoveLetterEditAct;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class fdw {

    /* JADX INFO: renamed from: l */
    public static fdw f98511l;

    /* JADX INFO: renamed from: a */
    public byd0 f98512a = new byd0("loveLetterLastShowEntryTipsTime" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public jxd0 f98513b;

    /* JADX INFO: renamed from: c */
    public byd0 f98514c;

    /* JADX INFO: renamed from: d */
    public jxd0 f98515d;

    /* JADX INFO: renamed from: e */
    public jxd0 f98516e;

    /* JADX INFO: renamed from: f */
    public byd0 f98517f;

    /* JADX INFO: renamed from: g */
    public byd0 f98518g;

    /* JADX INFO: renamed from: h */
    public vxd0 f98519h;

    /* JADX INFO: renamed from: i */
    public jxd0 f98520i;

    /* JADX INFO: renamed from: j */
    public boolean f98521j;

    /* JADX INFO: renamed from: k */
    public CoreGiftInfo f98522k;

    public fdw() {
        String str = "loveLetterIsShowingDot" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f98513b = new jxd0(str, bool);
        this.f98514c = new byd0("loveLetterShowDotTime" + CoreModule.m30929H().userId(), 0L);
        this.f98515d = new jxd0("loveLetterHasShowReplyBubble" + CoreModule.m30929H().userId(), bool);
        this.f98516e = new jxd0("loveLetterHasShownFunctionGuideAnim" + CoreModule.m30929H().userId(), bool);
        this.f98517f = new byd0("loveLetterLastMessageCreateTime" + CoreModule.m30929H().userId(), 0L);
        this.f98518g = new byd0("lastMessageAnimGuideShowTime" + CoreModule.m30929H().userId(), 0L);
        this.f98519h = new vxd0("messageAnimGuideShowCount" + CoreModule.m30929H().userId(), 0);
        this.f98520i = new jxd0("hasReportLoveLetterEntryShown" + CoreModule.m30929H().userId(), bool);
        this.f98521j = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m125138b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static fdw m125139e() {
        if (f98511l == null) {
            synchronized (fdw.class) {
                try {
                    if (f98511l == null) {
                        f98511l = new fdw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f98511l;
    }

    /* JADX INFO: renamed from: g */
    public static void m125140g(Act act, String str) {
        LoveLetterEntryInfo loveLetterEntryInfoM222761e = CoreModule.f18264c.f20381e0.f89136U1.m222761e();
        if (TextUtils.isEmpty(str) || !(loveLetterEntryInfoM222761e == null || loveLetterEntryInfoM222761e.message == null)) {
            act.startActivity(LoveLetterAct.m40549a2(act));
        } else {
            act.startActivity(LoveLetterEditAct.m40566h2(act, str));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m125141j() {
        f98511l = null;
    }

    /* JADX INFO: renamed from: c */
    public void m125142c() {
        this.f98516e.clear();
        this.f98517f.clear();
        this.f98518g.clear();
        this.f98519h.clear();
        this.f98515d.clear();
        this.f98514c.clear();
        this.f98513b.clear();
        this.f98512a.clear();
    }

    /* JADX INFO: renamed from: d */
    public CoreGiftInfo m125143d() {
        if (this.f98522k == null) {
            CoreGiftInfo coreGiftInfo = new CoreGiftInfo();
            this.f98522k = coreGiftInfo;
            coreGiftInfo.dynamicGift = true;
            coreGiftInfo.f56859id = "love_letter_guide";
            coreGiftInfo.priority = CoreGiftPriority.get("IMMEDIATE");
            boolean zM131563F0 = gra.m131563F0();
            CoreGiftInfo coreGiftInfo2 = this.f98522k;
            if (zM131563F0) {
                coreGiftInfo2.dynamicURL = "https://auto.tancdn.com/v1/raw/091eed82-d22f-4928-8d2a-f202bf1ad20714.zip";
                coreGiftInfo2.dynamicMD5 = "c1fe8ceea87ca5def6eb33a55af48688";
            } else {
                coreGiftInfo2.dynamicURL = "https://auto.tancdn.com/v1/raw/efff1ffe-71ea-4f63-9bcb-94f145b0857314.zip";
                coreGiftInfo2.dynamicMD5 = "dbaf96bee00bffb767b682c0d4d0d768";
            }
        }
        return this.f98522k;
    }

    /* JADX INFO: renamed from: f */
    public int m125144f() {
        LoveLetterEntryInfo loveLetterEntryInfoM222761e = CoreModule.f18264c.f20381e0.f89136U1.m222761e();
        if (loveLetterEntryInfoM222761e != null) {
            return loveLetterEntryInfoM222761e.count;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public Boolean m125145h() {
        LoveLetterMessageInfo loveLetterMessageInfo;
        LoveLetterEntryInfo loveLetterEntryInfoM222761e = CoreModule.f18264c.f20381e0.f89136U1.m222761e();
        return Boolean.valueOf(loveLetterEntryInfoM222761e != null && loveLetterEntryInfoM222761e.count == 0 && (loveLetterMessageInfo = loveLetterEntryInfoM222761e.message) != null && TEnum.equals(loveLetterMessageInfo.state, LoveLetterMessageState.replied) && this.f98515d.get().booleanValue());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m125146i(uxj0 uxj0Var) {
        this.f98520i.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: k */
    public void m125147k() {
        if (this.f98520i.get().booleanValue()) {
            return;
        }
        CoreModule.f18264c.f20381e0.m116573ia().subscribe(psd0.m173597H(new y20() { // from class: l.ddw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87968a.m125146i((uxj0) obj);
            }
        }, new y20() { // from class: l.edw
            @Override // p153l.y20
            public final void call(Object obj) {
                fdw.m125138b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public boolean m125148l(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (loveLetterEntryInfo.count > 0 && this.f98514c.get().longValue() == 0) {
            this.f98513b.put(Boolean.TRUE);
            this.f98514c.put(Long.valueOf(pzi0.m174454o()));
        }
        return this.f98513b.get().booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public boolean m125149m(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (loveLetterEntryInfo == null || loveLetterEntryInfo.count <= 0) {
            return false;
        }
        return this.f98512a.get().longValue() == 0 || pzi0.m174437B(3, this.f98512a.get().longValue());
    }

    /* JADX INFO: renamed from: n */
    public boolean m125150n(LoveLetterEntryInfo loveLetterEntryInfo) {
        LoveLetterMessageInfo loveLetterMessageInfo;
        return (loveLetterEntryInfo == null || (loveLetterMessageInfo = loveLetterEntryInfo.message) == null || !TEnum.equals(loveLetterMessageInfo.state, LoveLetterMessageState.replied) || this.f98515d.get().booleanValue()) ? false : true;
    }
}
