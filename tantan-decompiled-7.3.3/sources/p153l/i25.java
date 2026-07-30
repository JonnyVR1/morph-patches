package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatPartnerConfig;
import com.p051p1.mobile.putong.core.data.ChatPartnerScene;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.StateEmotion;
import com.p051p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class i25 {

    /* JADX INFO: renamed from: a */
    public static boolean f112582a = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m138160a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m138161b(ChatPartnerScene chatPartnerScene, DialogInterface dialogInterface) {
        CoreModule.f18264c.f20381e0.m116512S6(chatPartnerScene);
        CoreModule.f18264c.f20381e0.f89333t4.put(Long.valueOf(pzi0.m174454o()));
        if (chatPartnerScene == ChatPartnerScene.MESSAGE_PAGE_PASSIVE) {
            CoreModule.f18264c.f20381e0.f89340u4.m203841a(1);
        } else if (chatPartnerScene == ChatPartnerScene.ONLINE_SQUARE_PASSIVE) {
            CoreModule.f18264c.f20381e0.f89347v4.m203841a(1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m138163d(final ChatPartnerScene chatPartnerScene, Act act, Envelope envelope) {
        if (envelope.meta.code == 200) {
            if (chatPartnerScene != ChatPartnerScene.MESSAGE_PAGE_PASSIVE || (!cl80.m110426e().m110433k() && !act.isDialogShowing() && (act instanceof NewMainAct) && ((NewMainAct) act).m40822j6(TabName.Msg))) {
                CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
                if (!NullChecker.m82486a(coreData) || !NullChecker.m82486a(coreData.chatPartners) || jyb.m147479J(coreData.chatPartners.texts) || jyb.m147479J(coreData.chatPartners.users)) {
                    return;
                }
                t05 t05Var = new t05(act, coreData.chatPartners);
                t05Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.g25
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        i25.m138161b(chatPartnerScene, dialogInterface);
                    }
                });
                if (C4522a.m22099p().m22107I()) {
                    C4522a.m22099p().m22102C(CorePopLevel.CHAT_PARTNER, act, t05Var, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                } else {
                    cl80.m110426e().m110439q(al80.m98641a(t05Var));
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m138164e(long j, long j2) {
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
    public static Emotion m138165f(final String str) {
        String strMo61589yq = CoreModule.m30932N().mo61589yq();
        if (TextUtils.isEmpty(strMo61589yq)) {
            return null;
        }
        Iterator it = JsonParseHelper.parseList(strMo61589yq, StateEmotion.JSON_ADAPTER).iterator();
        while (it.hasNext()) {
            Emotion emotion = (Emotion) jyb.m147529r(((StateEmotion) it.next()).emotions, new qcj() { // from class: l.h25
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Emotion) obj).text, str));
                }
            });
            if (NullChecker.m82486a(emotion)) {
                return emotion;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m138166g(ChatPartnerScene chatPartnerScene) {
        long jLongValue = CoreModule.f18264c.f20381e0.f89333t4.get().longValue();
        ChatPartnerConfig chatPartnerConfigM131597M = gra.m131597M();
        int i = chatPartnerConfigM131597M == null ? 1 : chatPartnerConfigM131597M.messageLimit;
        int i2 = chatPartnerConfigM131597M == null ? 2 : chatPartnerConfigM131597M.squareLimit;
        int i3 = chatPartnerConfigM131597M == null ? 0 : chatPartnerConfigM131597M.perday;
        if (!pzi0.m174438C(jLongValue, pzi0.m174454o())) {
            CoreModule.f18264c.f20381e0.f89340u4.clear();
            CoreModule.f18264c.f20381e0.f89347v4.clear();
        }
        int iM138164e = m138164e(pzi0.m174454o(), jLongValue);
        if (iM138164e > 0 && iM138164e <= i3) {
            return false;
        }
        if (chatPartnerScene != ChatPartnerScene.MESSAGE_PAGE_PASSIVE || CoreModule.f18264c.f20381e0.f89340u4.get().intValue() < i) {
            return (chatPartnerScene != ChatPartnerScene.ONLINE_SQUARE_PASSIVE || CoreModule.f18264c.f20381e0.f89347v4.get().intValue() < i2) && pzi0.m174454o() - CoreModule.f18264c.f20381e0.f89326s4.get().longValue() >= 3600000 && !hlh0.m135741a().m135745e();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static void m138167h(final Act act, final ChatPartnerScene chatPartnerScene) {
        if (act == null || chatPartnerScene == null) {
            return;
        }
        CoreModule.f18264c.f20381e0.f89326s4.put(Long.valueOf(pzi0.m174454o()));
        act.duringCreated(CoreModule.f18264c.f20381e0.m116582l7(chatPartnerScene)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.e25
            @Override // p153l.y20
            public final void call(Object obj) {
                i25.m138163d(chatPartnerScene, act, (Envelope) obj);
            }
        }, new y20() { // from class: l.f25
            @Override // p153l.y20
            public final void call(Object obj) {
                i25.m138160a((Throwable) obj);
            }
        }));
    }
}
