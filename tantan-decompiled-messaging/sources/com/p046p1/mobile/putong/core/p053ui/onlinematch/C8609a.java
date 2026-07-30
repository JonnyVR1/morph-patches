package com.p046p1.mobile.putong.core.p053ui.onlinematch;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.CompoundButton;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.common.base.Optional;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4756v;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.QuickChatBellData;
import com.p046p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p046p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
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
import p133rx.C22306c;
import p149l.cwf0;
import p149l.d30;
import p149l.dd80;
import p149l.e30;
import p149l.eqh0;
import p149l.fpb0;
import p149l.hpd0;
import p149l.i0e;
import p149l.i0g0;
import p149l.j760;
import p149l.kk50;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.p7r;
import p149l.qib0;
import p149l.qqi0;
import p149l.roj0;
import p149l.sqb0;
import p149l.swh0;
import p149l.upa;
import p149l.uqd0;
import p149l.v9j;
import p149l.w9j;
import p149l.x2c0;
import p149l.x7y;
import p149l.xzc0;
import p149l.y1j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.a */
/* JADX INFO: loaded from: classes4.dex */
public class C8609a {

    /* JADX INFO: renamed from: a */
    public static String f32665a = "0";

    /* JADX INFO: renamed from: b */
    public static long f32666b;

    /* JADX INFO: renamed from: c */
    public static long f32667c;

    /* JADX INFO: renamed from: d */
    public static int f32668d;

    /* JADX INFO: renamed from: e */
    public static final Map<Integer, j760<Integer, Integer>> f32669e = new HashMap(24);

    /* JADX INFO: renamed from: f */
    public static boolean f32670f = false;

    /* JADX INFO: renamed from: g */
    public static List<String> f32671g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public static p7r<List<String>> f32672h = p7r.m167767c(new v9j() { // from class: l.lk50
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return vwb.m200324f0("主动打开话题，发友好信号", "热情的hi，跟新话题更配哦", "聊轻松的话题，聊天更愉快", "收获好感，从介绍自己开始", "用语音打招呼，会更有诚意", "聊聊最近的热搜话题吧", "聊聊你们的共同点吧", "尝试寻找你们的共同话题吧", "试试能聊起来的开放式问题", "像老朋友一样，开始聊天吧", "新奇的招呼语，更易有反馈", "只发表情，不是好的开场白", "分享一个有趣的事情给Ta吧");
        }
    });

    /* JADX INFO: renamed from: i */
    public static p7r<List<String>> f32673i = p7r.m167767c(new v9j() { // from class: l.wk50
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return vwb.m200324f0("不停的提问，会降低好感哦", "不问隐私，会显得更有礼貌", "切忌刷屏，用心聊天吧", "封闭式聊天,不易打开话题", "主动一些,会赢得更多好感", "分享一个你最近的趣事吧", "多看资料,多聊共同点", "完善资料卡，有助于交友哦", "多赞美，聊天气氛更和谐", "秒回能让你收获好感", "分享你资料里没有的信息吧", "大方说出自己的优点吧", "阳光开朗的男孩人设不会错", "热情回复，会让聊天更愉哦", "不要一味表达，多听Ta说话", "少用套路，多点真诚", "一直说和一直不说都不礼貌");
        }
    });

    /* JADX INFO: renamed from: j */
    public static p7r<List<String>> f32674j = p7r.m167767c(new v9j() { // from class: l.xk50
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return vwb.m200324f0("积极回应，别错过对的人哦", "多聊天，锻炼你的社交力吧", "真诚表达，不做聊天终结者", "尽量少用冷漠的单字回应哦", "真诚的聊天，比外表更重要", "享受聊天，每个人都很有趣", "主动一些，会赢得更多好感", "一直说和一直不说都不礼貌", "大方说出自己的优点吧", "少用套路，多点真诚", "完善资料卡，有助于交友哦");
        }
    });

    /* JADX INFO: renamed from: A */
    public static boolean m50217A() {
        return mqi0.m155929D(CoreModule.f17545c.f19639e0.f149231O0.get().longValue()) && CoreModule.f17545c.f19639e0.f149238P0.get().longValue() >= ((long) m50236T());
    }

    /* JADX INFO: renamed from: B */
    public static String m50218B(long j) {
        int i = Integer.parseInt(new SimpleDateFormat("Mdd").format(new Date(j)));
        if (i >= 121 && i <= 219) {
            return CoreModule.f17544b.getString(R$string.f18438ct);
        }
        if (i >= 220 && i <= 320) {
            return CoreModule.f17544b.getString(R$string.f18438ct);
        }
        if (i >= 321 && i <= 420) {
            return CoreModule.f17544b.getString(R$string.f18468dt);
        }
        if (i >= 421 && i <= 521) {
            return CoreModule.f17544b.getString(R$string.f18745mt);
        }
        if (i >= 522 && i <= 621) {
            return CoreModule.f17544b.getString(R$string.f18561gt);
        }
        if (i >= 622 && i <= 722) {
            return CoreModule.f17544b.getString(R$string.f18499et);
        }
        if (i >= 723 && i <= 823) {
            return CoreModule.f17544b.getString(R$string.f18592ht);
        }
        if (i >= 824 && i <= 923) {
            return CoreModule.f17544b.getString(R$string.f18776nt);
        }
        if (i >= 924 && i <= 1023) {
            return CoreModule.f17544b.getString(R$string.f18652jt);
        }
        if (i < 1024 || i > 1122) {
            return (i < 1123 || i > 1221) ? CoreModule.f17544b.getString(R$string.f18530ft) : CoreModule.f17544b.getString(R$string.f18683kt);
        }
        return CoreModule.f17544b.getString(R$string.f18714lt);
    }

    /* JADX INFO: renamed from: C */
    public static String m50219C(int i, String str) {
        if (i <= 20000 || !NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169520na())) {
            return i >= 1000 ? String.format("%skm", new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(i / 1000.0f)) : String.format("%sm", Integer.valueOf(i));
        }
        return (TextUtils.isEmpty(str) || !str.equals(CoreModule.f17545c.f19639e0.m169520na().location.region.city)) ? "" : str;
    }

    /* JADX INFO: renamed from: D */
    public static void m50220D(Act act, OnlineMatchPushUser onlineMatchPushUser, boolean z, d30 d30Var, boolean z2, String str) {
        m50221E(act, onlineMatchPushUser, z, d30Var, z2, str, true, null);
    }

    /* JADX INFO: renamed from: E */
    public static void m50221E(final Act act, final OnlineMatchPushUser onlineMatchPushUser, boolean z, d30 d30Var, final boolean z2, final String str, final boolean z3, final e30<Boolean> e30Var) {
        final C22306c<roj0> c22306cM34844g4;
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        if (onlineMatchPushUser.isBell) {
            c22306cM34844g4 = CoreModule.f17545c.f19558D0.m34846i4(onlineMatchPushUser.tracker, onlineMatchPushUser.isGreet ? Answer.TYPE : "greet", z ? "coin" : "privilege", onlineMatchPushUser.isMaleQuickChatRing, onlineMatchPushUser.userId).doOnNext(new e30() { // from class: l.mk50
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8609a.m50257h(onlineMatchPushUser, (Optional) obj);
                }
            }).map(new w9j() { // from class: l.nk50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return roj0.f160388a;
                }
            });
        } else if (onlineMatchPushUser.isSpeedMatch) {
            c22306cM34844g4 = CoreModule.f17545c.f19558D0.m34848k4(onlineMatchPushUser.tracker, z ? "coin" : "privilege");
        } else {
            if (!TextUtils.isEmpty(onlineMatchPushUser.secretKey)) {
                QuickChatCardInfo quickChatCardInfo = new QuickChatCardInfo();
                quickChatCardInfo.secretKey = onlineMatchPushUser.secretKey;
                quickChatCardInfo.userID = onlineMatchPushUser.userId;
                xzc0.m211970q0(act, quickChatCardInfo, z, true, str);
                return;
            }
            c22306cM34844g4 = CoreModule.f17545c.f19558D0.m34844g4(onlineMatchPushUser.action, z);
        }
        act.duringCreated(new v9j() { // from class: l.ok50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                C22306c c22306c = c22306cM34844g4;
                OnlineMatchPushUser onlineMatchPushUser2 = onlineMatchPushUser;
                return c22306c.flatMap(new w9j() { // from class: l.rk50
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreModule.f17545c.f19639e0.m169543t9(onlineMatchPushUser2.userId);
                    }
                }).flatMap(new w9j() { // from class: l.sk50
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreModule.f17545c.f19642f0.m32902ap(onlineMatchPushUser2.userId);
                    }
                }).switchMap(new w9j() { // from class: l.tk50
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreModule.f17545c.f19639e0.m169410Ka(onlineMatchPushUser2.userId);
                    }
                }).map(new w9j() { // from class: l.uk50
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C8609a.m50253f(onlineMatchPushUser2, (User) obj);
                    }
                });
            }
        }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.pk50
            @Override // p149l.e30
            public final void call(Object obj) {
                C8609a.m50269n(onlineMatchPushUser, e30Var, z3, z2, act, str, (User) obj);
            }
        }, new e30() { // from class: l.qk50
            @Override // p149l.e30
            public final void call(Object obj) {
                C8609a.m50261j(e30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public static String m50222F(Calendar calendar) {
        int i = 1;
        int i2 = calendar.get(1);
        if (i2 >= 2000) {
            return CoreModule.f17544b.getString(R$string.f17809I2);
        }
        if (i2 >= 1995) {
            return CoreModule.f17544b.getString(R$string.f17929M2);
        }
        if (i2 >= 1990) {
            return CoreModule.f17544b.getString(R$string.f17899L2);
        }
        if (i2 >= 1980) {
            return CoreModule.f17544b.getString(R$string.f17869K2);
        }
        if (i2 >= 1970) {
            return CoreModule.f17544b.getString(R$string.f17839J2);
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(mqi0.m155944o());
        int i3 = calendar2.get(1);
        int i4 = calendar2.get(2);
        int i5 = calendar2.get(5);
        int i6 = calendar.get(2);
        int i7 = calendar.get(5);
        int i8 = i3 - i2;
        if (i4 >= i6 && (i4 != i6 || i5 >= i7)) {
            i = 0;
        }
        return CoreModule.f17544b.getString(R$string.f17959N2, Integer.valueOf(i8 - i));
    }

    /* JADX INFO: renamed from: G */
    public static String m50223G(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -i);
        return m50222F(calendar);
    }

    /* JADX INFO: renamed from: H */
    public static String m50224H(User user) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.m155944o());
        int iIntValue = calendar.get(1) - user.age.intValue();
        if (iIntValue >= 2000) {
            return CoreModule.f17544b.getString(R$string.f17809I2);
        }
        if (iIntValue >= 1995) {
            return CoreModule.f17544b.getString(R$string.f17929M2);
        }
        if (iIntValue >= 1990) {
            return CoreModule.f17544b.getString(R$string.f17899L2);
        }
        if (iIntValue >= 1980) {
            return CoreModule.f17544b.getString(R$string.f17869K2);
        }
        return iIntValue >= 1970 ? CoreModule.f17544b.getString(R$string.f17839J2) : CoreModule.f17544b.getString(R$string.f17959N2, user.age);
    }

    /* JADX INFO: renamed from: I */
    public static int m50225I() {
        return m50246b0() + CoreModule.f17545c.f19571H1.m201049H3();
    }

    /* JADX INFO: renamed from: J */
    public static String m50226J(double d) {
        long jM155944o = (long) ((d - mqi0.m155944o()) / 1000.0d);
        long j = jM155944o / 3600;
        long j2 = (jM155944o / 60) % 60;
        long j3 = jM155944o % 60;
        if (jM155944o >= 60) {
            return qqi0.m175942j(j) + ":" + qqi0.m175942j(j2);
        }
        if (j3 < 0) {
            j3 = 0;
        }
        return qqi0.m175942j(j3) + BLiveStormDanmakuGiftResourceType.f44446s;
    }

    /* JADX INFO: renamed from: K */
    public static long m50227K() {
        return f32667c;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m50228L(String str) {
        return new hpd0("MATCH_UNLOCK_LIMIT_TIPS_" + str + "_" + CoreModule.m29931H().userId(), Boolean.FALSE).get().booleanValue();
    }

    /* JADX INFO: renamed from: M */
    public static String m50229M(String str) {
        return new uqd0("MATCH_UNLOCK_25_" + str + "_" + CoreModule.m29931H().userId(), "").get();
    }

    /* JADX INFO: renamed from: N */
    public static String m50230N(String str) {
        return new uqd0("MATCH_UNLOCK_50_" + str + "_" + CoreModule.m29931H().userId(), "").get();
    }

    /* JADX INFO: renamed from: O */
    public static String m50231O(String str) {
        return new uqd0("MATCH_UNLOCK_75_" + str + "_" + CoreModule.m29931H().userId(), "").get();
    }

    /* JADX INFO: renamed from: P */
    public static String m50232P(String str) {
        return new uqd0("ONLINE_MATCH_" + str + "_" + CoreModule.m29931H().userId(), "").get();
    }

    /* JADX INFO: renamed from: Q */
    public static int m50233Q() {
        int iNextInt;
        int iNextInt2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(qib0.f154693H.guessedCurrentServerTime());
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
        f32668d = iNextInt2;
        return iNextInt2;
    }

    /* JADX INFO: renamed from: R */
    public static String m50234R(String str) {
        return new uqd0("QUICKCHAT_BELL_" + str + "_" + CoreModule.m29931H().userId(), "").get();
    }

    /* JADX INFO: renamed from: S */
    public static int m50235S() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNum));
        if (NullChecker.m81303a(userPrivilegeM210113w4)) {
            return userPrivilegeM210113w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: T */
    public static int m50236T() {
        return RemoteConfig.m79298x().m79336z("showQuickChatCardSwipedCount", 2);
    }

    /* JADX INFO: renamed from: U */
    public static boolean m50237U() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("quickchatMembership"));
        return NullChecker.m81303a(userPrivilegeM210113w4) && userPrivilegeM210113w4.content.expiredTime >= qib0.f154693H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: V */
    public static boolean m50238V() {
        if (!m50239W()) {
            return false;
        }
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("quickchatMembership"));
        return userPrivilegeM210113w4 == null || userPrivilegeM210113w4.content.expiredTime < qib0.f154693H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: W */
    public static boolean m50239W() {
        return TEnum.equals(CoreModule.f17545c.f19639e0.m169520na().gender, "male");
    }

    /* JADX INFO: renamed from: X */
    public static boolean m50240X(String str, String str2) {
        return TextUtils.equals(m50232P(str), str2);
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m50241Y(String str, String str2) {
        return TextUtils.equals(m50229M(str), str2);
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m50242Z(String str, String str2) {
        return TextUtils.equals(m50230N(str), str2);
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m50244a0(String str, String str2) {
        return TextUtils.equals(m50231O(str), str2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m50245b(dd80 dd80Var, Act act) {
        o6j0.m162859c("e_quickchat_nochat_popup_quit", "p_quickchat_nochat_popup", o6j0.C18854a.m162878h("is_choose", dd80Var.m110905K() ? "true" : "false"));
        act.m66873d2();
    }

    /* JADX INFO: renamed from: b0 */
    public static int m50246b0() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("quickchatNumber"));
        if (NullChecker.m81303a(userPrivilegeM210113w4) && NullChecker.m81304b(userPrivilegeM210113w4.content)) {
            return userPrivilegeM210113w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m50248c0(String str) {
        new hpd0("MATCH_UNLOCK_LIMIT_TIPS_" + str + "_" + CoreModule.m29931H().userId(), Boolean.FALSE).put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m50249d(dd80 dd80Var, cwf0 cwf0Var, DialogInterface dialogInterface) {
        OnlineMatchManager.m50143z().f32611o.put(Boolean.valueOf(!dd80Var.m110905K()));
        cwf0Var.m109035k();
    }

    /* JADX INFO: renamed from: d0 */
    public static void m50250d0(String str) {
        new hpd0("MATCH_UNLOCK_SHOW_LIMIT_" + str + "_" + CoreModule.m29931H().userId(), Boolean.FALSE).put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m50251e(boolean[] zArr, d30 d30Var, x7y x7yVar) {
        zArr[0] = true;
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static void m50252e0(String str, String str2) {
        new uqd0("QUICKCHAT_BELL_" + str + "_" + CoreModule.m29931H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ User m50253f(OnlineMatchPushUser onlineMatchPushUser, User user) {
        C4756v.f20122Z.m132487l(onlineMatchPushUser.userId);
        return user;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m50254f0(String str, String str2) {
        new uqd0("MATCH_UNLOCK_25_" + str + "_" + CoreModule.m29931H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m50255g(PurchaseType purchaseType, boolean[] zArr, d30 d30Var, x7y x7yVar) {
        swh0.m186205M1(purchaseType);
        zArr[0] = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: g0 */
    public static void m50256g0(String str, String str2) {
        new uqd0("MATCH_UNLOCK_50_" + str + "_" + CoreModule.m29931H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m50257h(OnlineMatchPushUser onlineMatchPushUser, Optional optional) {
        if (optional.isPresent()) {
            m50252e0(onlineMatchPushUser.userId, ((QuickChatBellData) optional.get()).greetTracker);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m50258h0(String str, String str2) {
        new uqd0("MATCH_UNLOCK_75_" + str + "_" + CoreModule.m29931H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m50260i0(String str, String str2) {
        new uqd0("ONLINE_MATCH_" + str + "_" + CoreModule.m29931H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m50261j(e30 e30Var, Throwable th) {
        CoreModule.f17545c.f19555C0.m210112u4();
        if ((th instanceof TantanException.Client.TantanForbidden) && m50280v((TantanException.Client.TantanForbidden) th)) {
            lsi0.m151580j("该用户已提前退出闪聊，请重新发起吧~");
        } else {
            lsi0.m151580j("网络异常，请稍后再重试");
        }
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static void m50262j0(long j) {
        if (j > 0) {
            f32666b = j;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m50264k0(final Act act) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_quickchat_nochat_popup", Dialog.class.getName());
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110996y0("给好友发句消息吧").m110991t0("双方都不说话，会话将可能会消失哦").m110973b0("继续聊天").m110968W(act.getString(R$string.f18011Oo)).m110982k0("不再提示").m110964S(x2c0.f190781zi).m110961P(true).m110958M(true).m110960O();
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yk50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C8609a.m50249d(dd80VarM110960O, cwf0VarM133794c, dialogInterface);
            }
        });
        dd80VarM110960O.m110915W(new Runnable() { // from class: l.zk50
            @Override // java.lang.Runnable
            public final void run() {
                o6j0.m162859c("e_quickchat_nochat_popup_continue", "p_quickchat_nochat_popup", o6j0.C18854a.m162878h("is_choose", dd80VarM110960O.m110905K() ? "true" : "false"));
            }
        });
        dd80VarM110960O.m110914V(new Runnable() { // from class: l.al50
            @Override // java.lang.Runnable
            public final void run() {
                C8609a.m50245b(dd80VarM110960O, act);
            }
        });
        dd80VarM110960O.show();
        cwf0VarM133794c.m109033i();
        cwf0VarM133794c.m109036l();
    }

    /* JADX INFO: renamed from: l0 */
    public static Dialog m50266l0(final Act act, final User user) {
        act.getWindow().getDecorView().post(new Runnable() { // from class: l.vk50
            @Override // java.lang.Runnable
            public final void run() {
                jci.m140942r(act, user);
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public static Dialog m50268m0(OnlineMatchMatchUser onlineMatchMatchUser) {
        C8611c.INSTANCE.m50302a().m50300k();
        OnlineMatchManager.m50143z().f32594I.m132487l(new j760<>("match_success", onlineMatchMatchUser));
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m50269n(OnlineMatchPushUser onlineMatchPushUser, e30 e30Var, boolean z, boolean z2, Act act, String str, User user) {
        if (onlineMatchPushUser.isBell && (user.unilateralBlock() || user.isBanned())) {
            lsi0.m151580j(String.format("%s已提前退出闪聊", user.isFemale() ? "她" : "他"));
            return;
        }
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.TRUE);
        }
        if (z) {
            if (z2) {
                m50266l0(act, CoreModule.f17545c.f19639e0.m169430Pa(onlineMatchPushUser.userId));
            } else {
                act.startActivity(MessagesAct.m48949p2(act, onlineMatchPushUser.userId, false, false, false, false, null, 7, str));
            }
        }
        CoreModule.f17545c.f19555C0.m210112u4();
        OnlineMatchManager.m50143z().m50170a0(onlineMatchPushUser.userId);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m50270n0(Act act, OnlineMatchPushUser onlineMatchPushUser) {
        y1j.m212199h("get quick chat broadcase");
        if (!f32670f || xzc0.m211974x0().m211982w0(2) == null) {
            if (fpb0.m122586c()) {
                fpb0.m122585b();
            }
            if (onlineMatchPushUser == null) {
                return;
            }
            boolean z = act instanceof NewMainAct;
            if ((z && !onlineMatchPushUser.isSquareDataWrapper && ((m50217A() || onlineMatchPushUser.isMaleQuickChatRing) && ((!OnlineMatchManager.m50143z().m50152I() || onlineMatchPushUser.isMaleQuickChatRing) && !CoreModule.f17545c.f19639e0.m169527p9().isFemale() && ((NewMainAct) act).m39810d6()))) || (z && onlineMatchPushUser.isAudioBroadcast && ((NewMainAct) act).m39810d6())) {
                if (CoreModule.f17545c.f19663m0.m31140r6() != null && CoreModule.f17545c.f19663m0.m31140r6().f19472id.equals(CoreSuggested.UserInfo.VIRTUAL_CARD) && (CoreModule.f17545c.f19663m0.m31140r6().virtualCardType == VirtualCardType.UndoGuideCard || CoreModule.f17545c.f19663m0.m31140r6().virtualCardType == VirtualCardType.SuperlikeGuideCard)) {
                    return;
                }
                if (onlineMatchPushUser.isAudioBroadcast && (sqb0.m185498O().m185551U(true) || OnlineMatchManager.m50143z().m50155L() || sqb0.m185498O().m185554Y())) {
                    return;
                }
                OnlineMatchManager.m50143z().f32594I.m132487l(new j760<>("notify_normal_state", null));
                if (!onlineMatchPushUser.isAudioBroadcast) {
                    OnlineMatchManager.m50143z().m50150G();
                }
                xzc0.m211974x0().m211975B0((NewMainAct) act, new QuickChatCardWrapper(onlineMatchPushUser));
                if (onlineMatchPushUser.isAudioBroadcast) {
                    OnlineMatchManager.m50143z().m50192w();
                    return;
                }
                return;
            }
            if (onlineMatchPushUser.isAudioBroadcast) {
                if (sqb0.m185498O().m185551U(true) || OnlineMatchManager.m50143z().m50155L() || sqb0.m185498O().m185554Y() || !z) {
                    return;
                }
                OnlineMatchManager.m50143z().f32594I.m132487l(new j760<>("notify_normal_state", null));
                fpb0.m122588e(act, true, onlineMatchPushUser);
                OnlineMatchManager.m50143z().m50192w();
                return;
            }
            if (onlineMatchPushUser.isSquareDataWrapper) {
                if (!mqi0.m155929D(OnlineMatchManager.m50143z().f32616t.get().longValue())) {
                    OnlineMatchManager.m50143z().f32615s.put(0);
                }
                if (OnlineMatchManager.m50143z().f32615s.get().intValue() <= 2 && mqi0.m155952w(OnlineMatchManager.m50143z().f32616t.get().longValue(), 1)) {
                    C8611c.INSTANCE.m50302a().m50300k();
                    OnlineMatchManager.m50143z().f32594I.m132487l(new j760<>("tickets_broadcast", onlineMatchPushUser));
                    OnlineMatchManager.m50143z().m50192w();
                    OnlineMatchManager.m50143z().f32616t.put(Long.valueOf(mqi0.m155944o()));
                    OnlineMatchManager.m50143z().f32615s.m189988a(1);
                    return;
                }
                return;
            }
            if (CoreModule.f17545c.f19558D0.f20129T.get().booleanValue()) {
                return;
            }
            C8611c.INSTANCE.m50302a().m50300k();
            OnlineMatchManager.m50143z().f32594I.m132487l(new j760<>("tickets_broadcast", onlineMatchPushUser));
            OnlineMatchManager.m50143z().m50192w();
            if (onlineMatchPushUser.isBell) {
                CoreModule.f17545c.f19558D0.m34838N4(onlineMatchPushUser.tracker);
            } else if (onlineMatchPushUser.isSpeedMatch) {
                CoreModule.f17545c.f19558D0.m34839O4(onlineMatchPushUser.tracker);
            } else {
                CoreModule.f17545c.f19558D0.m34840P4("", onlineMatchPushUser.userId);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m50272o0(Act act, final PurchaseType purchaseType, final d30 d30Var, final d30 d30Var2) {
        int iM210354f5 = CoreModule.f17545c.f19570H0.m210354f5();
        final boolean[] zArr = {true};
        cwf0 cwf0VarM186207N1 = swh0.m186207N1(purchaseType);
        x7y x7yVarM207348t = new x7y.C21039a(act).m207345D(upa.m194663L1() ? kk50.m146312d() : act.string(R$string.f18767nk)).m207344C(i0g0.m133847N(act.getString(R$string.f17622Bp, String.format(Locale.getDefault(), " %d ", Integer.valueOf(iM210354f5))), Color.parseColor("#FE7E1D"), eqh0.m117752c(2)).append((CharSequence) "\r\n").append((CharSequence) (upa.m194663L1() ? "次数用完了，可以用探探币购买更多" : act.getString(R$string.f18288Y1)))).m207346r("https://auto.tancdn.com/v1/raw/a55966de-3b5d-45e5-9c7f-3560d6843d0b10.pdf", 1).m207347s(x2c0.f190690wn).m207352x(act.string(R$string.f17652Cp), new e30() { // from class: l.bl50
            @Override // p149l.e30
            public final void call(Object obj) {
                C8609a.m50255g(purchaseType, zArr, d30Var, (x7y) obj);
            }
        }).m207350v(act.string(R$string.f18408c), new e30() { // from class: l.cl50
            @Override // p149l.e30
            public final void call(Object obj) {
                C8609a.m50251e(zArr, d30Var2, (x7y) obj);
            }
        }).m207354z(swh0.m186255p0().m186284D0()).m207351w(R$string.f17798Hl, new CompoundButton.OnCheckedChangeListener() { // from class: l.dl50
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                swh0.m186255p0().m186295Q0(z);
            }
        }).m207343B(new DialogInterface.OnDismissListener() { // from class: l.el50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C8609a.m50275q(zArr, d30Var2, dialogInterface);
            }
        }).m207348t();
        x7yVarM207348t.m207323m(cwf0VarM186207N1);
        x7yVarM207348t.m207324n();
    }

    /* JADX INFO: renamed from: p0 */
    public static PurchaseType m50274p0() {
        return m50238V() ? PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS : PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m50275q(boolean[] zArr, d30 d30Var, DialogInterface dialogInterface) {
        if (zArr[0] && NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: u */
    public static int m50279u() {
        Map<Integer, j760<Integer, Integer>> map = f32669e;
        if (map.size() <= 0) {
            map.put(0, j760.m140076a(245343, 364407));
            map.put(1, j760.m140076a(154798, 273424));
            map.put(2, j760.m140076a(98051, 172516));
            map.put(3, j760.m140076a(67436, 109274));
            map.put(4, j760.m140076a(60514, 75154));
            map.put(5, j760.m140076a(89238, 168132));
            map.put(6, j760.m140076a(150864, 225861));
            map.put(7, j760.m140076a(202664, 282610));
            map.put(8, j760.m140076a(233726, 314674));
            map.put(9, j760.m140076a(260244, 341204));
            map.put(10, j760.m140076a(312600, 344165));
            map.put(11, j760.m140076a(315313, 359447));
            map.put(12, j760.m140076a(299799, 348716));
            map.put(13, j760.m140076a(319482, 353898));
            map.put(14, j760.m140076a(320448, 357251));
            map.put(15, j760.m140076a(313687, 351974));
            map.put(16, j760.m140076a(322467, 361595));
            map.put(17, j760.m140076a(301887, 353800));
            map.put(18, j760.m140076a(301887, 345889));
            map.put(19, j760.m140076a(316892, 364215));
            map.put(20, j760.m140076a(333682, 408928));
            map.put(21, j760.m140076a(374647, 440661));
            map.put(22, j760.m140076a(398675, 447884));
            map.put(23, j760.m140076a(386207, 364407));
        }
        j760<Integer, Integer> j760Var = map.get(Integer.valueOf(Calendar.getInstance().get(11)));
        return (int) ((((double) (j760Var.f116565b.intValue() - j760Var.f116564a.intValue())) * Math.random()) + ((double) j760Var.f116564a.intValue()));
    }

    /* JADX INFO: renamed from: v */
    public static boolean m50280v(TantanException.Client.TantanForbidden tantanForbidden) {
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
    public static void m50281w(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri) {
        m50283y(simpleDraweeView, imageUri, 0, true);
    }

    /* JADX INFO: renamed from: x */
    public static void m50282x(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i) {
        m50283y(simpleDraweeView, imageUri, i, false);
    }

    /* JADX INFO: renamed from: y */
    public static void m50283y(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i, boolean z) {
        if (i == 100) {
            qib0.f154691G.m102341Q0(simpleDraweeView, imageUri);
            return;
        }
        j760<Integer, Integer> j760VarM50284z = m50284z(i);
        if (j760VarM50284z.f116564a.intValue() <= 0 || j760VarM50284z.f116565b.intValue() <= 0) {
            qib0.f154691G.m102341Q0(simpleDraweeView, imageUri);
        } else {
            qib0.f154691G.m102336O(simpleDraweeView, imageUri.formatted(), j760VarM50284z.f116564a.intValue(), j760VarM50284z.f116565b.intValue());
        }
    }

    /* JADX INFO: renamed from: z */
    public static j760<Integer, Integer> m50284z(int i) {
        return j760.m140076a(8, Integer.valueOf((100 - i) / 3));
    }
}
