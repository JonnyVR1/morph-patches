package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.CoreGiftPriority;
import com.p046p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p046p1.mobile.putong.core.data.LoveLetterMessageInfo;
import com.p046p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p046p1.mobile.putong.core.newui.loveletter.LoveLetterAct;
import com.p046p1.mobile.putong.core.newui.loveletter.LoveLetterEditAct;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class hbw {

    /* JADX INFO: renamed from: l */
    public static hbw f106967l;

    /* JADX INFO: renamed from: a */
    public zpd0 f106968a = new zpd0("loveLetterLastShowEntryTipsTime" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public hpd0 f106969b;

    /* JADX INFO: renamed from: c */
    public zpd0 f106970c;

    /* JADX INFO: renamed from: d */
    public hpd0 f106971d;

    /* JADX INFO: renamed from: e */
    public hpd0 f106972e;

    /* JADX INFO: renamed from: f */
    public zpd0 f106973f;

    /* JADX INFO: renamed from: g */
    public zpd0 f106974g;

    /* JADX INFO: renamed from: h */
    public tpd0 f106975h;

    /* JADX INFO: renamed from: i */
    public hpd0 f106976i;

    /* JADX INFO: renamed from: j */
    public boolean f106977j;

    /* JADX INFO: renamed from: k */
    public CoreGiftInfo f106978k;

    public hbw() {
        String str = "loveLetterIsShowingDot" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f106969b = new hpd0(str, bool);
        this.f106970c = new zpd0("loveLetterShowDotTime" + CoreModule.m29931H().userId(), 0L);
        this.f106971d = new hpd0("loveLetterHasShowReplyBubble" + CoreModule.m29931H().userId(), bool);
        this.f106972e = new hpd0("loveLetterHasShownFunctionGuideAnim" + CoreModule.m29931H().userId(), bool);
        this.f106973f = new zpd0("loveLetterLastMessageCreateTime" + CoreModule.m29931H().userId(), 0L);
        this.f106974g = new zpd0("lastMessageAnimGuideShowTime" + CoreModule.m29931H().userId(), 0L);
        this.f106975h = new tpd0("messageAnimGuideShowCount" + CoreModule.m29931H().userId(), 0);
        this.f106976i = new hpd0("hasReportLoveLetterEntryShown" + CoreModule.m29931H().userId(), bool);
        this.f106977j = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m130338b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static hbw m130339e() {
        if (f106967l == null) {
            synchronized (hbw.class) {
                try {
                    if (f106967l == null) {
                        f106967l = new hbw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f106967l;
    }

    /* JADX INFO: renamed from: g */
    public static void m130340g(Act act, String str) {
        LoveLetterEntryInfo loveLetterEntryInfoM221515e = CoreModule.f17545c.f19639e0.f149279U1.m221515e();
        if (TextUtils.isEmpty(str) || !(loveLetterEntryInfoM221515e == null || loveLetterEntryInfoM221515e.message == null)) {
            act.startActivity(LoveLetterAct.m39546Z1(act));
        } else {
            act.startActivity(LoveLetterEditAct.m39563g2(act, str));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m130341j() {
        f106967l = null;
    }

    /* JADX INFO: renamed from: c */
    public void m130342c() {
        this.f106972e.clear();
        this.f106973f.clear();
        this.f106974g.clear();
        this.f106975h.clear();
        this.f106971d.clear();
        this.f106970c.clear();
        this.f106969b.clear();
        this.f106968a.clear();
    }

    /* JADX INFO: renamed from: d */
    public CoreGiftInfo m130343d() {
        if (this.f106978k == null) {
            CoreGiftInfo coreGiftInfo = new CoreGiftInfo();
            this.f106978k = coreGiftInfo;
            coreGiftInfo.dynamicGift = true;
            coreGiftInfo.f56011id = "love_letter_guide";
            coreGiftInfo.priority = CoreGiftPriority.get("IMMEDIATE");
            boolean zM194632F0 = upa.m194632F0();
            CoreGiftInfo coreGiftInfo2 = this.f106978k;
            if (zM194632F0) {
                coreGiftInfo2.dynamicURL = "https://auto.tancdn.com/v1/raw/091eed82-d22f-4928-8d2a-f202bf1ad20714.zip";
                coreGiftInfo2.dynamicMD5 = "c1fe8ceea87ca5def6eb33a55af48688";
            } else {
                coreGiftInfo2.dynamicURL = "https://auto.tancdn.com/v1/raw/efff1ffe-71ea-4f63-9bcb-94f145b0857314.zip";
                coreGiftInfo2.dynamicMD5 = "dbaf96bee00bffb767b682c0d4d0d768";
            }
        }
        return this.f106978k;
    }

    /* JADX INFO: renamed from: f */
    public int m130344f() {
        LoveLetterEntryInfo loveLetterEntryInfoM221515e = CoreModule.f17545c.f19639e0.f149279U1.m221515e();
        if (loveLetterEntryInfoM221515e != null) {
            return loveLetterEntryInfoM221515e.count;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public Boolean m130345h() {
        LoveLetterMessageInfo loveLetterMessageInfo;
        LoveLetterEntryInfo loveLetterEntryInfoM221515e = CoreModule.f17545c.f19639e0.f149279U1.m221515e();
        return Boolean.valueOf(loveLetterEntryInfoM221515e != null && loveLetterEntryInfoM221515e.count == 0 && (loveLetterMessageInfo = loveLetterEntryInfoM221515e.message) != null && TEnum.equals(loveLetterMessageInfo.state, LoveLetterMessageState.replied) && this.f106971d.get().booleanValue());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m130346i(roj0 roj0Var) {
        this.f106976i.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: k */
    public void m130347k() {
        if (this.f106976i.get().booleanValue()) {
            return;
        }
        CoreModule.f17545c.f19639e0.m169500ia().subscribe(mkd0.m154956H(new e30() { // from class: l.fbw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96755a.m130346i((roj0) obj);
            }
        }, new e30() { // from class: l.gbw
            @Override // p149l.e30
            public final void call(Object obj) {
                hbw.m130338b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public boolean m130348l(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (loveLetterEntryInfo.count > 0 && this.f106970c.get().longValue() == 0) {
            this.f106969b.put(Boolean.TRUE);
            this.f106970c.put(Long.valueOf(mqi0.m155944o()));
        }
        return this.f106969b.get().booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public boolean m130349m(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (loveLetterEntryInfo == null || loveLetterEntryInfo.count <= 0) {
            return false;
        }
        return this.f106968a.get().longValue() == 0 || mqi0.m155927B(3, this.f106968a.get().longValue());
    }

    /* JADX INFO: renamed from: n */
    public boolean m130350n(LoveLetterEntryInfo loveLetterEntryInfo) {
        LoveLetterMessageInfo loveLetterMessageInfo;
        return (loveLetterEntryInfo == null || (loveLetterMessageInfo = loveLetterEntryInfo.message) == null || !TEnum.equals(loveLetterMessageInfo.state, LoveLetterMessageState.replied) || this.f106971d.get().booleanValue()) ? false : true;
    }
}
