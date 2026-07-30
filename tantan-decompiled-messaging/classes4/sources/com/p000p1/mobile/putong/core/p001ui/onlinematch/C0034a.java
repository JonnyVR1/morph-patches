package com.p000p1.mobile.putong.core.p001ui.onlinematch;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.CompoundButton;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.p001ui.onlinematch.C0034a;
import com.p000p1.mobile.putong.core.p001ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.v;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.QuickChatBellData;
import com.p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.eqh0;
import l.fpb0;
import l.hpd0;
import l.i0e;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.o6j0;
import l.p7r;
import l.qib0;
import l.qqi0;
import l.roj0;
import l.sqb0;
import l.swh0;
import l.upa;
import l.uqd0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.x7y;
import l.xzc0;
import l.y1j;
import p002l.kk50;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0034a {

    /* JADX INFO: renamed from: a */
    public static String f487a = "0";

    /* JADX INFO: renamed from: b */
    public static long f488b;

    /* JADX INFO: renamed from: c */
    public static long f489c;

    /* JADX INFO: renamed from: d */
    public static int f490d;

    /* JADX INFO: renamed from: e */
    public static final Map<Integer, j760<Integer, Integer>> f491e = new HashMap(24);

    /* JADX INFO: renamed from: f */
    public static boolean f492f = false;

    /* JADX INFO: renamed from: g */
    public static List<String> f493g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public static p7r<List<String>> f494h = p7r.c(new v9j() { // from class: l.lk50
        public final Object call() {
            return vwb.f0(new String[]{"主动打开话题，发友好信号", "热情的hi，跟新话题更配哦", "聊轻松的话题，聊天更愉快", "收获好感，从介绍自己开始", "用语音打招呼，会更有诚意", "聊聊最近的热搜话题吧", "聊聊你们的共同点吧", "尝试寻找你们的共同话题吧", "试试能聊起来的开放式问题", "像老朋友一样，开始聊天吧", "新奇的招呼语，更易有反馈", "只发表情，不是好的开场白", "分享一个有趣的事情给Ta吧"});
        }
    });

    /* JADX INFO: renamed from: i */
    public static p7r<List<String>> f495i = p7r.c(new v9j() { // from class: l.wk50
        public final Object call() {
            return vwb.f0(new String[]{"不停的提问，会降低好感哦", "不问隐私，会显得更有礼貌", "切忌刷屏，用心聊天吧", "封闭式聊天,不易打开话题", "主动一些,会赢得更多好感", "分享一个你最近的趣事吧", "多看资料,多聊共同点", "完善资料卡，有助于交友哦", "多赞美，聊天气氛更和谐", "秒回能让你收获好感", "分享你资料里没有的信息吧", "大方说出自己的优点吧", "阳光开朗的男孩人设不会错", "热情回复，会让聊天更愉哦", "不要一味表达，多听Ta说话", "少用套路，多点真诚", "一直说和一直不说都不礼貌"});
        }
    });

    /* JADX INFO: renamed from: j */
    public static p7r<List<String>> f496j = p7r.c(new v9j() { // from class: l.xk50
        public final Object call() {
            return vwb.f0(new String[]{"积极回应，别错过对的人哦", "多聊天，锻炼你的社交力吧", "真诚表达，不做聊天终结者", "尽量少用冷漠的单字回应哦", "真诚的聊天，比外表更重要", "享受聊天，每个人都很有趣", "主动一些，会赢得更多好感", "一直说和一直不说都不礼貌", "大方说出自己的优点吧", "少用套路，多点真诚", "完善资料卡，有助于交友哦"});
        }
    });

    /* JADX INFO: renamed from: A */
    public static boolean m648A() {
        return mqi0.D(((Long) CoreModule.c.e0.O0.get()).longValue()) && ((Long) CoreModule.c.e0.P0.get()).longValue() >= ((long) m667T());
    }

    /* JADX INFO: renamed from: B */
    public static String m649B(long j) {
        int i = Integer.parseInt(new SimpleDateFormat("Mdd").format(new Date(j)));
        if (i >= 121 && i <= 219) {
            return CoreModule.b.getString(R.string.ct);
        }
        if (i >= 220 && i <= 320) {
            return CoreModule.b.getString(R.string.ct);
        }
        if (i >= 321 && i <= 420) {
            return CoreModule.b.getString(R.string.dt);
        }
        if (i >= 421 && i <= 521) {
            return CoreModule.b.getString(R.string.mt);
        }
        if (i >= 522 && i <= 621) {
            return CoreModule.b.getString(R.string.gt);
        }
        if (i >= 622 && i <= 722) {
            return CoreModule.b.getString(R.string.et);
        }
        if (i >= 723 && i <= 823) {
            return CoreModule.b.getString(R.string.ht);
        }
        if (i >= 824 && i <= 923) {
            return CoreModule.b.getString(R.string.nt);
        }
        if (i >= 924 && i <= 1023) {
            return CoreModule.b.getString(R.string.jt);
        }
        if (i < 1024 || i > 1122) {
            return (i < 1123 || i > 1221) ? CoreModule.b.getString(R.string.ft) : CoreModule.b.getString(R.string.kt);
        }
        return CoreModule.b.getString(R.string.lt);
    }

    /* JADX INFO: renamed from: C */
    public static String m650C(int i, String str) {
        if (i <= 20000 || !NullChecker.a(CoreModule.c.e0.na())) {
            return i >= 1000 ? String.format("%skm", new DecimalFormat("0.0").format(i / 1000.0f)) : String.format("%sm", Integer.valueOf(i));
        }
        return (TextUtils.isEmpty(str) || !str.equals(CoreModule.c.e0.na().location.region.city)) ? "" : str;
    }

    /* JADX INFO: renamed from: D */
    public static void m651D(Act act, OnlineMatchPushUser onlineMatchPushUser, boolean z, d30 d30Var, boolean z2, String str) {
        m652E(act, onlineMatchPushUser, z, d30Var, z2, str, true, null);
    }

    /* JADX INFO: renamed from: E */
    public static void m652E(final Act act, final OnlineMatchPushUser onlineMatchPushUser, boolean z, d30 d30Var, final boolean z2, final String str, final boolean z3, final e30<Boolean> e30Var) {
        final c cVarG4;
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        if (onlineMatchPushUser.isBell) {
            cVarG4 = CoreModule.c.D0.i4(onlineMatchPushUser.tracker, onlineMatchPushUser.isGreet ? "answer" : "greet", z ? "coin" : "privilege", onlineMatchPushUser.isMaleQuickChatRing, onlineMatchPushUser.userId).doOnNext(new e30() { // from class: l.mk50
                public final void call(Object obj) {
                    C0034a.m688h(onlineMatchPushUser, (Optional) obj);
                }
            }).map(new w9j() { // from class: l.nk50
                public final Object call(Object obj) {
                    return roj0.a;
                }
            });
        } else if (onlineMatchPushUser.isSpeedMatch) {
            cVarG4 = CoreModule.c.D0.k4(onlineMatchPushUser.tracker, z ? "coin" : "privilege");
        } else {
            if (!TextUtils.isEmpty(onlineMatchPushUser.secretKey)) {
                QuickChatCardInfo quickChatCardInfo = new QuickChatCardInfo();
                quickChatCardInfo.secretKey = onlineMatchPushUser.secretKey;
                quickChatCardInfo.userID = onlineMatchPushUser.userId;
                xzc0.q0(act, quickChatCardInfo, z, true, str);
                return;
            }
            cVarG4 = CoreModule.c.D0.g4(onlineMatchPushUser.action, z);
        }
        act.duringCreated(new v9j() { // from class: l.ok50
            public final Object call() {
                c cVar = cVarG4;
                OnlineMatchPushUser onlineMatchPushUser2 = onlineMatchPushUser;
                return cVar.flatMap(new w9j() { // from class: l.rk50
                    public final Object call(Object obj) {
                        return CoreModule.c.e0.t9(onlineMatchPushUser2.userId);
                    }
                }).flatMap(new w9j() { // from class: l.sk50
                    public final Object call(Object obj) {
                        return CoreModule.c.f0.ap(onlineMatchPushUser2.userId);
                    }
                }).switchMap(new w9j() { // from class: l.tk50
                    public final Object call(Object obj) {
                        return CoreModule.c.e0.Ka(onlineMatchPushUser2.userId);
                    }
                }).map(new w9j() { // from class: l.uk50
                    public final Object call(Object obj) {
                        return C0034a.m684f(onlineMatchPushUser2, (User) obj);
                    }
                });
            }
        }).take(1).subscribe(mkd0.H(new e30() { // from class: l.pk50
            public final void call(Object obj) {
                C0034a.m700n(onlineMatchPushUser, e30Var, z3, z2, act, str, (User) obj);
            }
        }, new e30() { // from class: l.qk50
            public final void call(Object obj) {
                C0034a.m692j(e30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public static String m653F(Calendar calendar) {
        int i = 1;
        int i2 = calendar.get(1);
        if (i2 >= 2000) {
            return CoreModule.b.getString(R.string.I2);
        }
        if (i2 >= 1995) {
            return CoreModule.b.getString(R.string.M2);
        }
        if (i2 >= 1990) {
            return CoreModule.b.getString(R.string.L2);
        }
        if (i2 >= 1980) {
            return CoreModule.b.getString(R.string.K2);
        }
        if (i2 >= 1970) {
            return CoreModule.b.getString(R.string.J2);
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(mqi0.o());
        int i3 = calendar2.get(1);
        int i4 = calendar2.get(2);
        int i5 = calendar2.get(5);
        int i6 = calendar.get(2);
        int i7 = calendar.get(5);
        int i8 = i3 - i2;
        if (i4 >= i6 && (i4 != i6 || i5 >= i7)) {
            i = 0;
        }
        return CoreModule.b.getString(R.string.N2, Integer.valueOf(i8 - i));
    }

    /* JADX INFO: renamed from: G */
    public static String m654G(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -i);
        return m653F(calendar);
    }

    /* JADX INFO: renamed from: H */
    public static String m655H(User user) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.o());
        int iIntValue = calendar.get(1) - user.age.intValue();
        if (iIntValue >= 2000) {
            return CoreModule.b.getString(R.string.I2);
        }
        if (iIntValue >= 1995) {
            return CoreModule.b.getString(R.string.M2);
        }
        if (iIntValue >= 1990) {
            return CoreModule.b.getString(R.string.L2);
        }
        if (iIntValue >= 1980) {
            return CoreModule.b.getString(R.string.K2);
        }
        return iIntValue >= 1970 ? CoreModule.b.getString(R.string.J2) : CoreModule.b.getString(R.string.N2, user.age);
    }

    /* JADX INFO: renamed from: I */
    public static int m656I() {
        return m677b0() + CoreModule.c.H1.H3();
    }

    /* JADX INFO: renamed from: J */
    public static String m657J(double d) {
        long jO = (long) ((d - mqi0.o()) / 1000.0d);
        long j = jO / 3600;
        long j2 = (jO / 60) % 60;
        long j3 = jO % 60;
        if (jO >= 60) {
            return qqi0.j(j) + ":" + qqi0.j(j2);
        }
        if (j3 < 0) {
            j3 = 0;
        }
        return qqi0.j(j3) + "s";
    }

    /* JADX INFO: renamed from: K */
    public static long m658K() {
        return f489c;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m659L(String str) {
        return ((Boolean) new hpd0("MATCH_UNLOCK_LIMIT_TIPS_" + str + "_" + CoreModule.H().userId(), Boolean.FALSE).get()).booleanValue();
    }

    /* JADX INFO: renamed from: M */
    public static String m660M(String str) {
        return (String) new uqd0("MATCH_UNLOCK_25_" + str + "_" + CoreModule.H().userId(), "").get();
    }

    /* JADX INFO: renamed from: N */
    public static String m661N(String str) {
        return (String) new uqd0("MATCH_UNLOCK_50_" + str + "_" + CoreModule.H().userId(), "").get();
    }

    /* JADX INFO: renamed from: O */
    public static String m662O(String str) {
        return (String) new uqd0("MATCH_UNLOCK_75_" + str + "_" + CoreModule.H().userId(), "").get();
    }

    /* JADX INFO: renamed from: P */
    public static String m663P(String str) {
        return (String) new uqd0("ONLINE_MATCH_" + str + "_" + CoreModule.H().userId(), "").get();
    }

    /* JADX INFO: renamed from: Q */
    public static int m664Q() {
        int iNextInt;
        int iNextInt2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(qib0.H.guessedCurrentServerTime());
        int i = calendar.get(11);
        Random random = new Random();
        if (i >= 1 && i < 6) {
            iNextInt2 = random.nextInt(16) + 5;
        } else if (i >= 6 && i < 8) {
            iNextInt2 = random.nextInt(36) + 15;
        } else if (i < 8 || i >= 10) {
            if (i >= 10 && i < 18) {
                iNextInt = random.nextInt(101);
            } else if (i >= 18 && i < 23) {
                iNextInt2 = random.nextInt(101) + 100;
            } else if (i >= 23 || i < 1) {
                iNextInt = random.nextInt(101);
            } else {
                iNextInt2 = 0;
            }
            iNextInt2 = iNextInt + 50;
        } else {
            iNextInt2 = random.nextInt(61) + 20;
        }
        f490d = iNextInt2;
        return iNextInt2;
    }

    /* JADX INFO: renamed from: R */
    public static String m665R(String str) {
        return (String) new uqd0("QUICKCHAT_BELL_" + str + "_" + CoreModule.H().userId(), "").get();
    }

    /* JADX INFO: renamed from: S */
    public static int m666S() {
        UserPrivilege userPrivilegeW4 = CoreModule.c.C0.w4(SummarizedPrivilegesId.get("quickchatSpeedUpNum"));
        if (NullChecker.a(userPrivilegeW4)) {
            return userPrivilegeW4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: T */
    public static int m667T() {
        return RemoteConfig.x().z("showQuickChatCardSwipedCount", 2);
    }

    /* JADX INFO: renamed from: U */
    public static boolean m668U() {
        UserPrivilege userPrivilegeW4 = CoreModule.c.C0.w4(SummarizedPrivilegesId.get("quickchatMembership"));
        return NullChecker.a(userPrivilegeW4) && userPrivilegeW4.content.expiredTime >= qib0.H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: V */
    public static boolean m669V() {
        if (!m670W()) {
            return false;
        }
        UserPrivilege userPrivilegeW4 = CoreModule.c.C0.w4(SummarizedPrivilegesId.get("quickchatMembership"));
        return userPrivilegeW4 == null || userPrivilegeW4.content.expiredTime < qib0.H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: W */
    public static boolean m670W() {
        return TEnum.equals(CoreModule.c.e0.na().gender, "male");
    }

    /* JADX INFO: renamed from: X */
    public static boolean m671X(String str, String str2) {
        return TextUtils.equals(m663P(str), str2);
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m672Y(String str, String str2) {
        return TextUtils.equals(m660M(str), str2);
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m673Z(String str, String str2) {
        return TextUtils.equals(m661N(str), str2);
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m675a0(String str, String str2) {
        return TextUtils.equals(m662O(str), str2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m676b(dd80 dd80Var, Act act) {
        o6j0.c("e_quickchat_nochat_popup_quit", "p_quickchat_nochat_popup", new o6j0.a[]{o6j0.a.h("is_choose", dd80Var.K() ? "true" : "false")});
        act.finish();
    }

    /* JADX INFO: renamed from: b0 */
    public static int m677b0() {
        UserPrivilege userPrivilegeW4 = CoreModule.c.C0.w4(SummarizedPrivilegesId.get("quickchatNumber"));
        if (NullChecker.a(userPrivilegeW4) && NullChecker.b(userPrivilegeW4.content)) {
            return userPrivilegeW4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m679c0(String str) {
        new hpd0("MATCH_UNLOCK_LIMIT_TIPS_" + str + "_" + CoreModule.H().userId(), Boolean.FALSE).put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m680d(dd80 dd80Var, cwf0 cwf0Var, DialogInterface dialogInterface) {
        OnlineMatchManager.m574z().f433o.put(Boolean.valueOf(!dd80Var.K()));
        cwf0Var.k();
    }

    /* JADX INFO: renamed from: d0 */
    public static void m681d0(String str) {
        new hpd0("MATCH_UNLOCK_SHOW_LIMIT_" + str + "_" + CoreModule.H().userId(), Boolean.FALSE).put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m682e(boolean[] zArr, d30 d30Var, x7y x7yVar) {
        zArr[0] = true;
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static void m683e0(String str, String str2) {
        new uqd0("QUICKCHAT_BELL_" + str + "_" + CoreModule.H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ User m684f(OnlineMatchPushUser onlineMatchPushUser, User user) {
        v.Z.onNext(onlineMatchPushUser.userId);
        return user;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m685f0(String str, String str2) {
        new uqd0("MATCH_UNLOCK_25_" + str + "_" + CoreModule.H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m686g(PurchaseType purchaseType, boolean[] zArr, d30 d30Var, x7y x7yVar) {
        swh0.M1(purchaseType);
        zArr[0] = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: g0 */
    public static void m687g0(String str, String str2) {
        new uqd0("MATCH_UNLOCK_50_" + str + "_" + CoreModule.H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m688h(OnlineMatchPushUser onlineMatchPushUser, Optional optional) {
        if (optional.isPresent()) {
            m683e0(onlineMatchPushUser.userId, ((QuickChatBellData) optional.get()).greetTracker);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m689h0(String str, String str2) {
        new uqd0("MATCH_UNLOCK_75_" + str + "_" + CoreModule.H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m691i0(String str, String str2) {
        new uqd0("ONLINE_MATCH_" + str + "_" + CoreModule.H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m692j(e30 e30Var, Throwable th) {
        CoreModule.c.C0.u4();
        if ((th instanceof TantanException.Client.TantanForbidden) && m711v((TantanException.Client.TantanForbidden) th)) {
            lsi0.j("该用户已提前退出闪聊，请重新发起吧~");
        } else {
            lsi0.j("网络异常，请稍后再重试");
        }
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static void m693j0(long j) {
        if (j > 0) {
            f488b = j;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m695k0(final Act act) {
        final cwf0 cwf0VarC = i0e.c("p_quickchat_nochat_popup", Dialog.class.getName());
        final dd80 dd80VarO = new dd80.a(act).y0("给好友发句消息吧").t0("双方都不说话，会话将可能会消失哦").b0("继续聊天").W(act.getString(R.string.Oo)).k0("不再提示").S(x2c0.zi).P(true).M(true).O();
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yk50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C0034a.m680d(dd80VarO, cwf0VarC, dialogInterface);
            }
        });
        dd80VarO.W(new Runnable() { // from class: l.zk50
            @Override // java.lang.Runnable
            public final void run() {
                o6j0.c("e_quickchat_nochat_popup_continue", "p_quickchat_nochat_popup", new o6j0.a[]{o6j0.a.h("is_choose", dd80VarO.K() ? "true" : "false")});
            }
        });
        dd80VarO.V(new Runnable() { // from class: l.al50
            @Override // java.lang.Runnable
            public final void run() {
                C0034a.m676b(dd80VarO, act);
            }
        });
        dd80VarO.show();
        cwf0VarC.i();
        cwf0VarC.l();
    }

    /* JADX INFO: renamed from: l0 */
    public static Dialog m697l0(final Act act, final User user) {
        act.getWindow().getDecorView().post(new Runnable() { // from class: l.vk50
            @Override // java.lang.Runnable
            public final void run() {
                jci.m15870r(act, user);
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public static Dialog m699m0(OnlineMatchMatchUser onlineMatchMatchUser) {
        C0036c.INSTANCE.m733a().m731k();
        OnlineMatchManager.m574z().f416I.onNext(new j760("match_success", onlineMatchMatchUser));
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m700n(OnlineMatchPushUser onlineMatchPushUser, e30 e30Var, boolean z, boolean z2, Act act, String str, User user) {
        if (onlineMatchPushUser.isBell && (user.unilateralBlock() || user.isBanned())) {
            lsi0.j(String.format("%s已提前退出闪聊", user.isFemale() ? "她" : "他"));
            return;
        }
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.TRUE);
        }
        if (z) {
            if (z2) {
                m697l0(act, CoreModule.c.e0.Pa(onlineMatchPushUser.userId));
            } else {
                act.startActivity(MessagesAct.p2(act, onlineMatchPushUser.userId, false, false, false, false, (Intent) null, 7, str));
            }
        }
        CoreModule.c.C0.u4();
        OnlineMatchManager.m574z().m601a0(onlineMatchPushUser.userId);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m701n0(Act act, OnlineMatchPushUser onlineMatchPushUser) {
        y1j.h("get quick chat broadcase");
        if (!f492f || xzc0.x0().w0(2) == null) {
            if (fpb0.c()) {
                fpb0.b();
            }
            if (onlineMatchPushUser == null) {
                return;
            }
            boolean z = act instanceof NewMainAct;
            if ((z && !onlineMatchPushUser.isSquareDataWrapper && ((m648A() || onlineMatchPushUser.isMaleQuickChatRing) && ((!OnlineMatchManager.m574z().m583I() || onlineMatchPushUser.isMaleQuickChatRing) && !CoreModule.c.e0.p9().isFemale() && ((NewMainAct) act).d6()))) || (z && onlineMatchPushUser.isAudioBroadcast && ((NewMainAct) act).d6())) {
                if (CoreModule.c.m0.r6() != null && CoreModule.c.m0.r6().id.equals("VirtualCard") && (CoreModule.c.m0.r6().virtualCardType == VirtualCardType.UndoGuideCard || CoreModule.c.m0.r6().virtualCardType == VirtualCardType.SuperlikeGuideCard)) {
                    return;
                }
                if (onlineMatchPushUser.isAudioBroadcast && (sqb0.O().U(true) || OnlineMatchManager.m574z().m586L() || sqb0.O().Y())) {
                    return;
                }
                OnlineMatchManager.m574z().f416I.onNext(new j760("notify_normal_state", (Object) null));
                if (!onlineMatchPushUser.isAudioBroadcast) {
                    OnlineMatchManager.m574z().m581G();
                }
                xzc0.x0().B0((NewMainAct) act, new QuickChatCardWrapper(onlineMatchPushUser));
                if (onlineMatchPushUser.isAudioBroadcast) {
                    OnlineMatchManager.m574z().m623w();
                    return;
                }
                return;
            }
            if (onlineMatchPushUser.isAudioBroadcast) {
                if (sqb0.O().U(true) || OnlineMatchManager.m574z().m586L() || sqb0.O().Y() || !z) {
                    return;
                }
                OnlineMatchManager.m574z().f416I.onNext(new j760("notify_normal_state", (Object) null));
                fpb0.e(act, true, onlineMatchPushUser);
                OnlineMatchManager.m574z().m623w();
                return;
            }
            if (onlineMatchPushUser.isSquareDataWrapper) {
                if (!mqi0.D(((Long) OnlineMatchManager.m574z().f438t.get()).longValue())) {
                    OnlineMatchManager.m574z().f437s.put(0);
                }
                if (((Integer) OnlineMatchManager.m574z().f437s.get()).intValue() <= 2 && mqi0.w(((Long) OnlineMatchManager.m574z().f438t.get()).longValue(), 1)) {
                    C0036c.INSTANCE.m733a().m731k();
                    OnlineMatchManager.m574z().f416I.onNext(new j760("tickets_broadcast", onlineMatchPushUser));
                    OnlineMatchManager.m574z().m623w();
                    OnlineMatchManager.m574z().f438t.put(Long.valueOf(mqi0.o()));
                    OnlineMatchManager.m574z().f437s.a(1);
                    return;
                }
                return;
            }
            if (((Boolean) CoreModule.c.D0.T.get()).booleanValue()) {
                return;
            }
            C0036c.INSTANCE.m733a().m731k();
            OnlineMatchManager.m574z().f416I.onNext(new j760("tickets_broadcast", onlineMatchPushUser));
            OnlineMatchManager.m574z().m623w();
            if (onlineMatchPushUser.isBell) {
                CoreModule.c.D0.N4(onlineMatchPushUser.tracker);
            } else if (onlineMatchPushUser.isSpeedMatch) {
                CoreModule.c.D0.O4(onlineMatchPushUser.tracker);
            } else {
                CoreModule.c.D0.P4("", onlineMatchPushUser.userId);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m703o0(Act act, final PurchaseType purchaseType, final d30 d30Var, final d30 d30Var2) {
        int iF5 = CoreModule.c.H0.f5();
        final boolean[] zArr = {true};
        cwf0 cwf0VarN1 = swh0.N1(purchaseType);
        x7y x7yVarT = new x7y.a(act).D(upa.L1() ? kk50.m16660d() : act.string(R.string.nk)).C(i0g0.N(act.getString(R.string.Bp, String.format(Locale.getDefault(), " %d ", Integer.valueOf(iF5))), Color.parseColor("#FE7E1D"), eqh0.c(2)).append((CharSequence) "\r\n").append((CharSequence) (upa.L1() ? "次数用完了，可以用探探币购买更多" : act.getString(R.string.Y1)))).r("https://auto.tancdn.com/v1/raw/a55966de-3b5d-45e5-9c7f-3560d6843d0b10.pdf", 1).s(x2c0.wn).x(act.string(R.string.Cp), new e30() { // from class: l.bl50
            public final void call(Object obj) {
                C0034a.m686g(purchaseType, zArr, d30Var, (x7y) obj);
            }
        }).v(act.string(R.string.c), new e30() { // from class: l.cl50
            public final void call(Object obj) {
                C0034a.m682e(zArr, d30Var2, (x7y) obj);
            }
        }).z(swh0.p0().D0()).w(R.string.Hl, new CompoundButton.OnCheckedChangeListener() { // from class: l.dl50
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                swh0.p0().Q0(z);
            }
        }).B(new DialogInterface.OnDismissListener() { // from class: l.el50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C0034a.m706q(zArr, d30Var2, dialogInterface);
            }
        }).t();
        x7yVarT.m(cwf0VarN1);
        x7yVarT.n();
    }

    /* JADX INFO: renamed from: p0 */
    public static PurchaseType m705p0() {
        return m669V() ? PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS : PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m706q(boolean[] zArr, d30 d30Var, DialogInterface dialogInterface) {
        if (zArr[0] && NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: u */
    public static int m710u() {
        Map<Integer, j760<Integer, Integer>> map = f491e;
        if (map.size() <= 0) {
            map.put(0, j760.a(245343, 364407));
            map.put(1, j760.a(154798, 273424));
            map.put(2, j760.a(98051, 172516));
            map.put(3, j760.a(67436, 109274));
            map.put(4, j760.a(60514, 75154));
            map.put(5, j760.a(89238, 168132));
            map.put(6, j760.a(150864, 225861));
            map.put(7, j760.a(202664, 282610));
            map.put(8, j760.a(233726, 314674));
            map.put(9, j760.a(260244, 341204));
            map.put(10, j760.a(312600, 344165));
            map.put(11, j760.a(315313, 359447));
            map.put(12, j760.a(299799, 348716));
            map.put(13, j760.a(319482, 353898));
            map.put(14, j760.a(320448, 357251));
            map.put(15, j760.a(313687, 351974));
            map.put(16, j760.a(322467, 361595));
            map.put(17, j760.a(301887, 353800));
            map.put(18, j760.a(301887, 345889));
            map.put(19, j760.a(316892, 364215));
            map.put(20, j760.a(333682, 408928));
            map.put(21, j760.a(374647, 440661));
            map.put(22, j760.a(398675, 447884));
            map.put(23, j760.a(386207, 364407));
        }
        j760<Integer, Integer> j760Var = map.get(Integer.valueOf(Calendar.getInstance().get(11)));
        return (int) ((((double) (((Integer) j760Var.b).intValue() - ((Integer) j760Var.a).intValue())) * Math.random()) + ((double) ((Integer) j760Var.a).intValue()));
    }

    /* JADX INFO: renamed from: v */
    public static boolean m711v(TantanException.Client.TantanForbidden tantanForbidden) {
        switch (tantanForbidden.subCode) {
            case 602105:
            case 602109:
            case 602506:
            case 603402:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m712w(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri) {
        m714y(simpleDraweeView, imageUri, 0, true);
    }

    /* JADX INFO: renamed from: x */
    public static void m713x(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i) {
        m714y(simpleDraweeView, imageUri, i, false);
    }

    /* JADX INFO: renamed from: y */
    public static void m714y(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i, boolean z) {
        if (i == 100) {
            qib0.G.Q0(simpleDraweeView, imageUri);
            return;
        }
        j760<Integer, Integer> j760VarM715z = m715z(i);
        if (((Integer) j760VarM715z.a).intValue() <= 0 || ((Integer) j760VarM715z.b).intValue() <= 0) {
            qib0.G.Q0(simpleDraweeView, imageUri);
        } else {
            qib0.G.O(simpleDraweeView, imageUri.formatted(), ((Integer) j760VarM715z.a).intValue(), ((Integer) j760VarM715z.b).intValue());
        }
    }

    /* JADX INFO: renamed from: z */
    public static j760<Integer, Integer> m715z(int i) {
        return j760.a(8, Integer.valueOf((100 - i) / 3));
    }
}
