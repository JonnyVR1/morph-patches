package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.Tag;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class af6 {

    /* JADX INFO: renamed from: a */
    public static hpd0 f69150a;

    /* JADX INFO: renamed from: b */
    public static hpd0 f69151b;

    static {
        Boolean bool = Boolean.FALSE;
        f69150a = new hpd0("show_heartbeat_debug_item", bool);
        f69151b = new hpd0("show_chatemoji_debug_item", bool);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m96189b(Act act) {
        OnlineMatchManager.m50143z().f32594I.m132487l(vwb.m200311Y("match_timeout", null));
        e51.m114743H(act, new Runnable() { // from class: l.ke6
            @Override // java.lang.Runnable
            public final void run() {
                af6.m96209v();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Tag m96193f(String str) {
        return new Tag(null, str);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m96195h() {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.isSpeedMatch = false;
        onlineMatchMatchUser.userId = CoreModule.m29931H().userId();
        onlineMatchMatchUser.user = CoreModule.m29932K().me_();
        C8609a.m50268m0(onlineMatchMatchUser);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m96196i(Act act) {
        m96209v();
        e51.m114743H(act, new Runnable() { // from class: l.oe6
            @Override // java.lang.Runnable
            public final void run() {
                OnlineMatchManager.m50143z().f32594I.m132487l(vwb.m200311Y("match_timeout", null));
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m96197j(ArrayList arrayList, final Act act) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("推送心动信号：", new d30() { // from class: l.se6
            @Override // p149l.d30
            public final void call() {
                af6.m96209v();
            }
        }));
        arrayList.add(vwb.m200311Y("打开关闭debug入口：" + f69150a.get(), new d30() { // from class: l.te6
            @Override // p149l.d30
            public final void call() {
                af6.m96202o();
            }
        }));
        arrayList.add(vwb.m200311Y("闪聊成功：", new d30() { // from class: l.ue6
            @Override // p149l.d30
            public final void call() {
                af6.m96195h();
            }
        }));
        arrayList.add(vwb.m200311Y("闪聊成功-- 推送心动信号", new d30() { // from class: l.ve6
            @Override // p149l.d30
            public final void call() {
                af6.m96201n(act);
            }
        }));
        arrayList.add(vwb.m200311Y("推送心动信号-- 闪聊成功", new d30() { // from class: l.we6
            @Override // p149l.d30
            public final void call() {
                af6.m96200m(act);
            }
        }));
        arrayList.add(vwb.m200311Y("插入广播", new d30() { // from class: l.xe6
            @Override // p149l.d30
            public final void call() {
                af6.m96208u();
            }
        }));
        arrayList.add(vwb.m200311Y("推送心动信号--插入广播", new d30() { // from class: l.ye6
            @Override // p149l.d30
            public final void call() {
                af6.m96205r(act);
            }
        }));
        arrayList.add(vwb.m200311Y("插入广播--推送心动信号", new d30() { // from class: l.ze6
            @Override // p149l.d30
            public final void call() {
                af6.m96199l(act);
            }
        }));
        arrayList.add(vwb.m200311Y("推送心动信号--超时", new d30() { // from class: l.ie6
            @Override // p149l.d30
            public final void call() {
                af6.m96196i(act);
            }
        }));
        arrayList.add(vwb.m200311Y("超时--推送心动信号", new d30() { // from class: l.je6
            @Override // p149l.d30
            public final void call() {
                af6.m96189b(act);
            }
        }));
        act.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m96198k() {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.userId = CoreModule.m29931H().userId();
        onlineMatchMatchUser.user = CoreModule.m29932K().me_();
        C8609a.m50268m0(onlineMatchMatchUser);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m96199l(Act act) {
        m96208u();
        e51.m114743H(act, new Runnable() { // from class: l.me6
            @Override // java.lang.Runnable
            public final void run() {
                af6.m96209v();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m96200m(Act act) {
        m96209v();
        e51.m114743H(act, new Runnable() { // from class: l.pe6
            @Override // java.lang.Runnable
            public final void run() {
                af6.m96198k();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m96201n(Act act) {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.userId = CoreModule.m29931H().userId();
        onlineMatchMatchUser.user = CoreModule.m29932K().me_();
        C8609a.m50268m0(onlineMatchMatchUser);
        e51.m114743H(act, new Runnable() { // from class: l.ne6
            @Override // java.lang.Runnable
            public final void run() {
                af6.m96209v();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m96202o() {
        hpd0 hpd0Var = f69150a;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m96204q() {
        hpd0 hpd0Var = f69150a;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m96205r(Act act) {
        m96209v();
        e51.m114743H(act, new Runnable() { // from class: l.le6
            @Override // java.lang.Runnable
            public final void run() {
                af6.m96208u();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: t */
    public static ArrayList<j760<String, d30>> m96207t(final Act act, ws6 ws6Var) {
        final ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        arrayList.add(vwb.m200311Y("心动信号", new d30() { // from class: l.he6
            @Override // p149l.d30
            public final void call() {
                af6.m96197j(arrayList, act);
            }
        }));
        arrayList.add(vwb.m200311Y("打开关闭chatEmoji debug入口：" + f69150a.get(), new d30() { // from class: l.re6
            @Override // p149l.d30
            public final void call() {
                af6.m96204q();
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public static void m96208u() {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = vwb.m200304R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new w9j() { // from class: l.qe6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return af6.m96193f((String) obj);
            }
        });
        C4732c c4732c = CoreModule.f17545c;
        onlineMatchPushUser.user = c4732c.f19639e0.m169430Pa(c4732c.f19663m0.f19394a0.m221515e().loaded.get(1).f19472id);
        OnlineMatchManager.m50143z().f32594I.m132487l(new j760<>("tickets_broadcast", onlineMatchPushUser));
    }

    /* JADX INFO: renamed from: v */
    public static void m96209v() {
        PushMessageCustom pushMessageCustomNew_ = PushMessageCustom.new_();
        pushMessageCustomNew_.userId = CoreModule.m29931H().userId();
        CoreModule.f17545c.f19571H1.m201064W3(pushMessageCustomNew_, false);
    }

    /* JADX INFO: renamed from: w */
    public static void m96210w(Conversation conversation) {
        q2z.m172544C2(conversation, true, true, 0L);
    }

    /* JADX INFO: renamed from: x */
    public static void m96211x(Conversation conversation) {
        q2z.m172548D2(conversation);
    }
}
