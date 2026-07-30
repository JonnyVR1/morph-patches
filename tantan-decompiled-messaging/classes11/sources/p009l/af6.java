package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.Tag;
import java.util.ArrayList;
import l.d30;
import l.e51;
import l.hpd0;
import l.j760;
import l.q2z;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class af6 {

    /* JADX INFO: renamed from: a */
    public static hpd0 f9461a;

    /* JADX INFO: renamed from: b */
    public static hpd0 f9462b;

    static {
        Boolean bool = Boolean.FALSE;
        f9461a = new hpd0("show_heartbeat_debug_item", bool);
        f9462b = new hpd0("show_chatemoji_debug_item", bool);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11367b(Act act) {
        OnlineMatchManager.z().I.onNext(vwb.Y("match_timeout", (Object) null));
        e51.H(act, new Runnable() { // from class: l.ke6
            @Override // java.lang.Runnable
            public final void run() {
                af6.m11387v();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Tag m11371f(String str) {
        return new Tag((String) null, str);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m11373h() {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.isSpeedMatch = false;
        onlineMatchMatchUser.userId = CoreModule.H().userId();
        onlineMatchMatchUser.user = CoreModule.K().me_();
        a.m0(onlineMatchMatchUser);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m11374i(Act act) {
        m11387v();
        e51.H(act, new Runnable() { // from class: l.oe6
            @Override // java.lang.Runnable
            public final void run() {
                OnlineMatchManager.z().I.onNext(vwb.Y("match_timeout", (Object) null));
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m11375j(ArrayList arrayList, final Act act) {
        arrayList.clear();
        arrayList.add(vwb.Y("推送心动信号：", new d30() { // from class: l.se6
            public final void call() {
                af6.m11387v();
            }
        }));
        arrayList.add(vwb.Y("打开关闭debug入口：" + f9461a.get(), new d30() { // from class: l.te6
            public final void call() {
                af6.m11380o();
            }
        }));
        arrayList.add(vwb.Y("闪聊成功：", new d30() { // from class: l.ue6
            public final void call() {
                af6.m11373h();
            }
        }));
        arrayList.add(vwb.Y("闪聊成功-- 推送心动信号", new d30() { // from class: l.ve6
            public final void call() {
                af6.m11379n(act);
            }
        }));
        arrayList.add(vwb.Y("推送心动信号-- 闪聊成功", new d30() { // from class: l.we6
            public final void call() {
                af6.m11378m(act);
            }
        }));
        arrayList.add(vwb.Y("插入广播", new d30() { // from class: l.xe6
            public final void call() {
                af6.m11386u();
            }
        }));
        arrayList.add(vwb.Y("推送心动信号--插入广播", new d30() { // from class: l.ye6
            public final void call() {
                af6.m11383r(act);
            }
        }));
        arrayList.add(vwb.Y("插入广播--推送心动信号", new d30() { // from class: l.ze6
            public final void call() {
                af6.m11377l(act);
            }
        }));
        arrayList.add(vwb.Y("推送心动信号--超时", new d30() { // from class: l.ie6
            public final void call() {
                af6.m11374i(act);
            }
        }));
        arrayList.add(vwb.Y("超时--推送心动信号", new d30() { // from class: l.je6
            public final void call() {
                af6.m11367b(act);
            }
        }));
        act.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m11376k() {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.userId = CoreModule.H().userId();
        onlineMatchMatchUser.user = CoreModule.K().me_();
        a.m0(onlineMatchMatchUser);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m11377l(Act act) {
        m11386u();
        e51.H(act, new Runnable() { // from class: l.me6
            @Override // java.lang.Runnable
            public final void run() {
                af6.m11387v();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m11378m(Act act) {
        m11387v();
        e51.H(act, new Runnable() { // from class: l.pe6
            @Override // java.lang.Runnable
            public final void run() {
                af6.m11376k();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m11379n(Act act) {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.userId = CoreModule.H().userId();
        onlineMatchMatchUser.user = CoreModule.K().me_();
        a.m0(onlineMatchMatchUser);
        e51.H(act, new Runnable() { // from class: l.ne6
            @Override // java.lang.Runnable
            public final void run() {
                af6.m11387v();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m11380o() {
        hpd0 hpd0Var = f9461a;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m11382q() {
        hpd0 hpd0Var = f9461a;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m11383r(Act act) {
        m11387v();
        e51.H(act, new Runnable() { // from class: l.le6
            @Override // java.lang.Runnable
            public final void run() {
                af6.m11386u();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: t */
    public static ArrayList<j760<String, d30>> m11385t(final Act act, ws6 ws6Var) {
        final ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        arrayList.add(vwb.Y("心动信号", new d30() { // from class: l.he6
            public final void call() {
                af6.m11375j(arrayList, act);
            }
        }));
        arrayList.add(vwb.Y("打开关闭chatEmoji debug入口：" + f9461a.get(), new d30() { // from class: l.re6
            public final void call() {
                af6.m11382q();
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public static void m11386u() {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.c.e0.p9().fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = "10";
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = vwb.R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new w9j() { // from class: l.qe6
            public final Object call(Object obj) {
                return af6.m11371f((String) obj);
            }
        });
        c cVar = CoreModule.c;
        onlineMatchPushUser.user = cVar.e0.Pa(((CoreSuggested.UserInfo) ((PartialListOpt) cVar.m0.a0.e()).loaded.get(1)).id);
        OnlineMatchManager.z().I.onNext(new j760("tickets_broadcast", onlineMatchPushUser));
    }

    /* JADX INFO: renamed from: v */
    public static void m11387v() {
        PushMessageCustom pushMessageCustomNew_ = PushMessageCustom.new_();
        pushMessageCustomNew_.userId = CoreModule.H().userId();
        CoreModule.c.H1.W3(pushMessageCustomNew_, false);
    }

    /* JADX INFO: renamed from: w */
    public static void m11388w(Conversation conversation) {
        q2z.C2(conversation, true, true, 0L);
    }

    /* JADX INFO: renamed from: x */
    public static void m11389x(Conversation conversation) {
        q2z.D2(conversation);
    }
}
