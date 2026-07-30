package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatPartnerConfig;
import com.p046p1.mobile.putong.core.data.ChatPartnerScene;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.StateEmotion;
import com.p046p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class j15 {

    /* JADX INFO: renamed from: a */
    public static boolean f115737a = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m139221a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m139222b(ChatPartnerScene chatPartnerScene, DialogInterface dialogInterface) {
        CoreModule.f17545c.f19639e0.m169439S6(chatPartnerScene);
        CoreModule.f17545c.f19639e0.f149476t4.put(Long.valueOf(mqi0.m155944o()));
        if (chatPartnerScene == ChatPartnerScene.MESSAGE_PAGE_PASSIVE) {
            CoreModule.f17545c.f19639e0.f149483u4.m189988a(1);
        } else if (chatPartnerScene == ChatPartnerScene.ONLINE_SQUARE_PASSIVE) {
            CoreModule.f17545c.f19639e0.f149490v4.m189988a(1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m139224d(final ChatPartnerScene chatPartnerScene, Act act, Envelope envelope) {
        if (envelope.meta.code == 200) {
            if (chatPartnerScene != ChatPartnerScene.MESSAGE_PAGE_PASSIVE || (!wc80.m202636e().m202643k() && !act.isDialogShowing() && (act instanceof NewMainAct) && ((NewMainAct) act).m39814f6(TabName.Msg))) {
                CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
                if (!NullChecker.m81303a(coreData) || !NullChecker.m81303a(coreData.chatPartners) || vwb.m200296J(coreData.chatPartners.texts) || vwb.m200296J(coreData.chatPartners.users)) {
                    return;
                }
                uz4 uz4Var = new uz4(act, coreData.chatPartners);
                uz4Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.h15
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        j15.m139222b(chatPartnerScene, dialogInterface);
                    }
                });
                if (C4371a.m21100p().m21108I()) {
                    C4371a.m21100p().m21103C(CorePopLevel.CHAT_PARTNER, act, uz4Var, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                } else {
                    wc80.m202636e().m202649q(uc80.m192995a(uz4Var));
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m139225e(long j, long j2) {
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
    public static Emotion m139226f(final String str) {
        String strMo60405yq = CoreModule.m29934N().mo60405yq();
        if (TextUtils.isEmpty(strMo60405yq)) {
            return null;
        }
        Iterator it = JsonParseHelper.parseList(strMo60405yq, StateEmotion.JSON_ADAPTER).iterator();
        while (it.hasNext()) {
            Emotion emotion = (Emotion) vwb.m200346r(((StateEmotion) it.next()).emotions, new w9j() { // from class: l.i15
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Emotion) obj).text, str));
                }
            });
            if (NullChecker.m81303a(emotion)) {
                return emotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m139227g(ChatPartnerScene chatPartnerScene) {
        long jLongValue = CoreModule.f17545c.f19639e0.f149476t4.get().longValue();
        ChatPartnerConfig chatPartnerConfigM194666M = upa.m194666M();
        int i = chatPartnerConfigM194666M == null ? 1 : chatPartnerConfigM194666M.messageLimit;
        int i2 = chatPartnerConfigM194666M == null ? 2 : chatPartnerConfigM194666M.squareLimit;
        int i3 = chatPartnerConfigM194666M == null ? 0 : chatPartnerConfigM194666M.perday;
        if (!mqi0.m155928C(jLongValue, mqi0.m155944o())) {
            CoreModule.f17545c.f19639e0.f149483u4.clear();
            CoreModule.f17545c.f19639e0.f149490v4.clear();
        }
        int iM139225e = m139225e(mqi0.m155944o(), jLongValue);
        if (iM139225e > 0 && iM139225e <= i3) {
            return false;
        }
        if (chatPartnerScene != ChatPartnerScene.MESSAGE_PAGE_PASSIVE || CoreModule.f17545c.f19639e0.f149483u4.get().intValue() < i) {
            return (chatPartnerScene != ChatPartnerScene.ONLINE_SQUARE_PASSIVE || CoreModule.f17545c.f19639e0.f149490v4.get().intValue() < i2) && mqi0.m155944o() - CoreModule.f17545c.f19639e0.f149469s4.get().longValue() >= 3600000 && !zch0.m218024a().m218028e();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static void m139228h(final Act act, final ChatPartnerScene chatPartnerScene) {
        if (act == null || chatPartnerScene == null) {
            return;
        }
        CoreModule.f17545c.f19639e0.f149469s4.put(Long.valueOf(mqi0.m155944o()));
        act.duringCreated(CoreModule.f17545c.f19639e0.m169509l7(chatPartnerScene)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.f15
            @Override // p149l.e30
            public final void call(Object obj) {
                j15.m139224d(chatPartnerScene, act, (Envelope) obj);
            }
        }, new e30() { // from class: l.g15
            @Override // p149l.e30
            public final void call(Object obj) {
                j15.m139221a((Throwable) obj);
            }
        }));
    }
}
