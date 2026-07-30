package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.Tag;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class dg6 {

    /* JADX INFO: renamed from: a */
    public static jxd0 f88262a;

    /* JADX INFO: renamed from: b */
    public static jxd0 f88263b;

    static {
        Boolean bool = Boolean.FALSE;
        f88262a = new jxd0("show_heartbeat_debug_item", bool);
        f88263b = new jxd0("show_chatemoji_debug_item", bool);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m115607b(Act act) {
        OnlineMatchManager.m51326z().f33442I.m137019l(jyb.m147494Y("match_timeout", null));
        l51.m152888H(act, new Runnable() { // from class: l.nf6
            @Override // java.lang.Runnable
            public final void run() {
                dg6.m115627v();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Tag m115611f(String str) {
        return new Tag(null, str);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m115613h() {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.isSpeedMatch = false;
        onlineMatchMatchUser.userId = CoreModule.m30929H().userId();
        onlineMatchMatchUser.user = CoreModule.m30930K().me_();
        C8772a.m51451m0(onlineMatchMatchUser);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m115614i(Act act) {
        m115627v();
        l51.m152888H(act, new Runnable() { // from class: l.rf6
            @Override // java.lang.Runnable
            public final void run() {
                OnlineMatchManager.m51326z().f33442I.m137019l(jyb.m147494Y("match_timeout", null));
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m115615j(ArrayList arrayList, final Act act) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("推送心动信号：", new x20() { // from class: l.vf6
            @Override // p153l.x20
            public final void call() {
                dg6.m115627v();
            }
        }));
        arrayList.add(jyb.m147494Y("打开关闭debug入口：" + f88262a.get(), new x20() { // from class: l.wf6
            @Override // p153l.x20
            public final void call() {
                dg6.m115620o();
            }
        }));
        arrayList.add(jyb.m147494Y("闪聊成功：", new x20() { // from class: l.xf6
            @Override // p153l.x20
            public final void call() {
                dg6.m115613h();
            }
        }));
        arrayList.add(jyb.m147494Y("闪聊成功-- 推送心动信号", new x20() { // from class: l.yf6
            @Override // p153l.x20
            public final void call() {
                dg6.m115619n(act);
            }
        }));
        arrayList.add(jyb.m147494Y("推送心动信号-- 闪聊成功", new x20() { // from class: l.zf6
            @Override // p153l.x20
            public final void call() {
                dg6.m115618m(act);
            }
        }));
        arrayList.add(jyb.m147494Y("插入广播", new x20() { // from class: l.ag6
            @Override // p153l.x20
            public final void call() {
                dg6.m115626u();
            }
        }));
        arrayList.add(jyb.m147494Y("推送心动信号--插入广播", new x20() { // from class: l.bg6
            @Override // p153l.x20
            public final void call() {
                dg6.m115623r(act);
            }
        }));
        arrayList.add(jyb.m147494Y("插入广播--推送心动信号", new x20() { // from class: l.cg6
            @Override // p153l.x20
            public final void call() {
                dg6.m115617l(act);
            }
        }));
        arrayList.add(jyb.m147494Y("推送心动信号--超时", new x20() { // from class: l.lf6
            @Override // p153l.x20
            public final void call() {
                dg6.m115614i(act);
            }
        }));
        arrayList.add(jyb.m147494Y("超时--推送心动信号", new x20() { // from class: l.mf6
            @Override // p153l.x20
            public final void call() {
                dg6.m115607b(act);
            }
        }));
        act.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m115616k() {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.userId = CoreModule.m30929H().userId();
        onlineMatchMatchUser.user = CoreModule.m30930K().me_();
        C8772a.m51451m0(onlineMatchMatchUser);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m115617l(Act act) {
        m115626u();
        l51.m152888H(act, new Runnable() { // from class: l.pf6
            @Override // java.lang.Runnable
            public final void run() {
                dg6.m115627v();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m115618m(Act act) {
        m115627v();
        l51.m152888H(act, new Runnable() { // from class: l.sf6
            @Override // java.lang.Runnable
            public final void run() {
                dg6.m115616k();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m115619n(Act act) {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.userId = CoreModule.m30929H().userId();
        onlineMatchMatchUser.user = CoreModule.m30930K().me_();
        C8772a.m51451m0(onlineMatchMatchUser);
        l51.m152888H(act, new Runnable() { // from class: l.qf6
            @Override // java.lang.Runnable
            public final void run() {
                dg6.m115627v();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m115620o() {
        jxd0 jxd0Var = f88262a;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m115622q() {
        jxd0 jxd0Var = f88262a;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m115623r(Act act) {
        m115627v();
        l51.m152888H(act, new Runnable() { // from class: l.of6
            @Override // java.lang.Runnable
            public final void run() {
                dg6.m115626u();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: t */
    public static ArrayList<pf60<String, x20>> m115625t(final Act act, zt6 zt6Var) {
        final ArrayList<pf60<String, x20>> arrayList = new ArrayList<>();
        arrayList.add(jyb.m147494Y("心动信号", new x20() { // from class: l.kf6
            @Override // p153l.x20
            public final void call() {
                dg6.m115615j(arrayList, act);
            }
        }));
        arrayList.add(jyb.m147494Y("打开关闭chatEmoji debug入口：" + f88262a.get(), new x20() { // from class: l.uf6
            @Override // p153l.x20
            public final void call() {
                dg6.m115622q();
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public static void m115626u() {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = jyb.m147487R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new qcj() { // from class: l.tf6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dg6.m115611f((String) obj);
            }
        });
        C4883c c4883c = CoreModule.f18264c;
        onlineMatchPushUser.user = c4883c.f20381e0.m116503Pa(c4883c.f20405m0.f20136a0.m222761e().loaded.get(1).f20214id);
        OnlineMatchManager.m51326z().f33442I.m137019l(new pf60<>("tickets_broadcast", onlineMatchPushUser));
    }

    /* JADX INFO: renamed from: v */
    public static void m115627v() {
        PushMessageCustom pushMessageCustomNew_ = PushMessageCustom.new_();
        pushMessageCustomNew_.userId = CoreModule.m30929H().userId();
        CoreModule.f18264c.f20313H1.m123917W3(pushMessageCustomNew_, false);
    }

    /* JADX INFO: renamed from: w */
    public static void m115628w(Conversation conversation) {
        nbz.m162287C2(conversation, true, true, 0L);
    }

    /* JADX INFO: renamed from: x */
    public static void m115629x(Conversation conversation) {
        nbz.m162291D2(conversation);
    }
}
