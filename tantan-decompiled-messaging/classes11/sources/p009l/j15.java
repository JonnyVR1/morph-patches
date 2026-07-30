package p009l;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatPartnerConfig;
import com.p1.mobile.putong.core.data.ChatPartnerScene;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.Emotion;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.StateEmotion;
import com.p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import l.e30;
import l.l5j0;
import l.mkd0;
import l.uc80;
import l.upa;
import l.vwb;
import l.w9j;
import l.wc80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class j15 {

    /* JADX INFO: renamed from: a */
    public static boolean f14895a = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16824a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16825b(ChatPartnerScene chatPartnerScene, DialogInterface dialogInterface) {
        CoreModule.c.e0.S6(chatPartnerScene);
        CoreModule.c.e0.t4.put(Long.valueOf(mqi0.m18550o()));
        if (chatPartnerScene == ChatPartnerScene.MESSAGE_PAGE_PASSIVE) {
            CoreModule.c.e0.u4.a(1);
        } else if (chatPartnerScene == ChatPartnerScene.ONLINE_SQUARE_PASSIVE) {
            CoreModule.c.e0.v4.a(1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m16827d(final ChatPartnerScene chatPartnerScene, Act act, Envelope envelope) {
        if (envelope.meta.code == 200) {
            if (chatPartnerScene != ChatPartnerScene.MESSAGE_PAGE_PASSIVE || (!wc80.e().k() && !act.isDialogShowing() && (act instanceof NewMainAct) && ((NewMainAct) act).m3890f6(TabName.Msg))) {
                CoreData moduleData = envelope.data.getModuleData(CoreData.class);
                if (!NullChecker.a(moduleData) || !NullChecker.a(moduleData.chatPartners) || vwb.J(moduleData.chatPartners.texts) || vwb.J(moduleData.chatPartners.users)) {
                    return;
                }
                l5j0 uz4Var = new uz4(act, moduleData.chatPartners);
                uz4Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.h15
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        j15.m16825b(chatPartnerScene, dialogInterface);
                    }
                });
                if (a.p().I()) {
                    a.p().C(CorePopLevel.CHAT_PARTNER, act, uz4Var, 20000);
                } else {
                    wc80.e().q(uc80.a(uz4Var));
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m16828e(long j, long j2) {
        Date date = new Date(j2);
        Date date2 = new Date(j);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return (int) ((calendar2.getTime().getTime() - calendar.getTime().getTime()) / 86400000);
    }

    /* JADX INFO: renamed from: f */
    public static Emotion m16829f(final String str) {
        String strYq = CoreModule.N().yq();
        if (TextUtils.isEmpty(strYq)) {
            return null;
        }
        Iterator it = JsonParseHelper.parseList(strYq, StateEmotion.JSON_ADAPTER).iterator();
        while (it.hasNext()) {
            Emotion emotion = (Emotion) vwb.r(((StateEmotion) it.next()).emotions, new w9j() { // from class: l.i15
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Emotion) obj).text, str));
                }
            });
            if (NullChecker.a(emotion)) {
                return emotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m16830g(ChatPartnerScene chatPartnerScene) {
        long jLongValue = ((Long) CoreModule.c.e0.t4.get()).longValue();
        ChatPartnerConfig chatPartnerConfigM = upa.M();
        int i = chatPartnerConfigM == null ? 1 : chatPartnerConfigM.messageLimit;
        int i2 = chatPartnerConfigM == null ? 2 : chatPartnerConfigM.squareLimit;
        int i3 = chatPartnerConfigM == null ? 0 : chatPartnerConfigM.perday;
        if (!mqi0.m18534C(jLongValue, mqi0.m18550o())) {
            CoreModule.c.e0.u4.clear();
            CoreModule.c.e0.v4.clear();
        }
        int iM16828e = m16828e(mqi0.m18550o(), jLongValue);
        if (iM16828e > 0 && iM16828e <= i3) {
            return false;
        }
        if (chatPartnerScene != ChatPartnerScene.MESSAGE_PAGE_PASSIVE || ((Integer) CoreModule.c.e0.u4.get()).intValue() < i) {
            return (chatPartnerScene != ChatPartnerScene.ONLINE_SQUARE_PASSIVE || ((Integer) CoreModule.c.e0.v4.get()).intValue() < i2) && mqi0.m18550o() - ((Long) CoreModule.c.e0.s4.get()).longValue() >= 3600000 && !zch0.m25654a().m25658e();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static void m16831h(final Act act, final ChatPartnerScene chatPartnerScene) {
        if (act == null || chatPartnerScene == null) {
            return;
        }
        CoreModule.c.e0.s4.put(Long.valueOf(mqi0.m18550o()));
        act.duringCreated(CoreModule.c.e0.l7(chatPartnerScene)).take(1).subscribe(mkd0.H(new e30() { // from class: l.f15
            public final void call(Object obj) {
                j15.m16827d(chatPartnerScene, act, (Envelope) obj);
            }
        }, new e30() { // from class: l.g15
            public final void call(Object obj) {
                j15.m16824a((Throwable) obj);
            }
        }));
    }
}
