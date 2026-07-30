package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.loveletter.LoveLetterAct;
import com.p000p1.mobile.putong.core.newui.loveletter.LoveLetterEditAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreGiftInfo;
import com.p1.mobile.putong.core.data.CoreGiftPriority;
import com.p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p1.mobile.putong.core.data.LoveLetterMessageInfo;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import l.e30;
import l.hpd0;
import l.mkd0;
import l.roj0;
import l.tpd0;
import l.upa;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hbw {

    /* JADX INFO: renamed from: l */
    public static hbw f13947l;

    /* JADX INFO: renamed from: a */
    public zpd0 f13948a = new zpd0("loveLetterLastShowEntryTipsTime" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public hpd0 f13949b;

    /* JADX INFO: renamed from: c */
    public zpd0 f13950c;

    /* JADX INFO: renamed from: d */
    public hpd0 f13951d;

    /* JADX INFO: renamed from: e */
    public hpd0 f13952e;

    /* JADX INFO: renamed from: f */
    public zpd0 f13953f;

    /* JADX INFO: renamed from: g */
    public zpd0 f13954g;

    /* JADX INFO: renamed from: h */
    public tpd0 f13955h;

    /* JADX INFO: renamed from: i */
    public hpd0 f13956i;

    /* JADX INFO: renamed from: j */
    public boolean f13957j;

    /* JADX INFO: renamed from: k */
    public CoreGiftInfo f13958k;

    public hbw() {
        String str = "loveLetterIsShowingDot" + CoreModule.H().userId();
        Boolean bool = Boolean.FALSE;
        this.f13949b = new hpd0(str, bool);
        this.f13950c = new zpd0("loveLetterShowDotTime" + CoreModule.H().userId(), 0L);
        this.f13951d = new hpd0("loveLetterHasShowReplyBubble" + CoreModule.H().userId(), bool);
        this.f13952e = new hpd0("loveLetterHasShownFunctionGuideAnim" + CoreModule.H().userId(), bool);
        this.f13953f = new zpd0("loveLetterLastMessageCreateTime" + CoreModule.H().userId(), 0L);
        this.f13954g = new zpd0("lastMessageAnimGuideShowTime" + CoreModule.H().userId(), 0L);
        this.f13955h = new tpd0("messageAnimGuideShowCount" + CoreModule.H().userId(), 0);
        this.f13956i = new hpd0("hasReportLoveLetterEntryShown" + CoreModule.H().userId(), bool);
        this.f13957j = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15502b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static hbw m15503e() {
        if (f13947l == null) {
            synchronized (hbw.class) {
                try {
                    if (f13947l == null) {
                        f13947l = new hbw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13947l;
    }

    /* JADX INFO: renamed from: g */
    public static void m15504g(Act act, String str) {
        LoveLetterEntryInfo loveLetterEntryInfo = (LoveLetterEntryInfo) CoreModule.c.e0.U1.e();
        if (TextUtils.isEmpty(str) || !(loveLetterEntryInfo == null || loveLetterEntryInfo.message == null)) {
            act.startActivity(LoveLetterAct.m3615Z1(act));
        } else {
            act.startActivity(LoveLetterEditAct.m3634g2(act, str));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m15505j() {
        f13947l = null;
    }

    /* JADX INFO: renamed from: c */
    public void m15506c() {
        this.f13952e.clear();
        this.f13953f.clear();
        this.f13954g.clear();
        this.f13955h.clear();
        this.f13951d.clear();
        this.f13950c.clear();
        this.f13949b.clear();
        this.f13948a.clear();
    }

    /* JADX INFO: renamed from: d */
    public CoreGiftInfo m15507d() {
        if (this.f13958k == null) {
            CoreGiftInfo coreGiftInfo = new CoreGiftInfo();
            this.f13958k = coreGiftInfo;
            coreGiftInfo.dynamicGift = true;
            ((DbObject) coreGiftInfo).id = "love_letter_guide";
            coreGiftInfo.priority = CoreGiftPriority.get("IMMEDIATE");
            boolean zF0 = upa.F0();
            CoreGiftInfo coreGiftInfo2 = this.f13958k;
            if (zF0) {
                coreGiftInfo2.dynamicURL = "https://auto.tancdn.com/v1/raw/091eed82-d22f-4928-8d2a-f202bf1ad20714.zip";
                coreGiftInfo2.dynamicMD5 = "c1fe8ceea87ca5def6eb33a55af48688";
            } else {
                coreGiftInfo2.dynamicURL = "https://auto.tancdn.com/v1/raw/efff1ffe-71ea-4f63-9bcb-94f145b0857314.zip";
                coreGiftInfo2.dynamicMD5 = "dbaf96bee00bffb767b682c0d4d0d768";
            }
        }
        return this.f13958k;
    }

    /* JADX INFO: renamed from: f */
    public int m15508f() {
        LoveLetterEntryInfo loveLetterEntryInfo = (LoveLetterEntryInfo) CoreModule.c.e0.U1.e();
        if (loveLetterEntryInfo != null) {
            return loveLetterEntryInfo.count;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public Boolean m15509h() {
        LoveLetterMessageInfo loveLetterMessageInfo;
        LoveLetterEntryInfo loveLetterEntryInfo = (LoveLetterEntryInfo) CoreModule.c.e0.U1.e();
        return Boolean.valueOf(loveLetterEntryInfo != null && loveLetterEntryInfo.count == 0 && (loveLetterMessageInfo = loveLetterEntryInfo.message) != null && TEnum.equals(loveLetterMessageInfo.state, "replied") && ((Boolean) this.f13951d.get()).booleanValue());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m15510i(roj0 roj0Var) {
        this.f13956i.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: k */
    public void m15511k() {
        if (((Boolean) this.f13956i.get()).booleanValue()) {
            return;
        }
        CoreModule.c.e0.ia().subscribe(mkd0.H(new e30() { // from class: l.fbw
            public final void call(Object obj) {
                this.f12910a.m15510i((roj0) obj);
            }
        }, new e30() { // from class: l.gbw
            public final void call(Object obj) {
                hbw.m15502b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public boolean m15512l(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (loveLetterEntryInfo.count > 0 && ((Long) this.f13950c.get()).longValue() == 0) {
            this.f13949b.put(Boolean.TRUE);
            this.f13950c.put(Long.valueOf(mqi0.m18550o()));
        }
        return ((Boolean) this.f13949b.get()).booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public boolean m15513m(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (loveLetterEntryInfo == null || loveLetterEntryInfo.count <= 0) {
            return false;
        }
        return ((Long) this.f13948a.get()).longValue() == 0 || mqi0.m18533B(3, ((Long) this.f13948a.get()).longValue());
    }

    /* JADX INFO: renamed from: n */
    public boolean m15514n(LoveLetterEntryInfo loveLetterEntryInfo) {
        LoveLetterMessageInfo loveLetterMessageInfo;
        return (loveLetterEntryInfo == null || (loveLetterMessageInfo = loveLetterEntryInfo.message) == null || !TEnum.equals(loveLetterMessageInfo.state, "replied") || ((Boolean) this.f13951d.get()).booleanValue()) ? false : true;
    }
}
