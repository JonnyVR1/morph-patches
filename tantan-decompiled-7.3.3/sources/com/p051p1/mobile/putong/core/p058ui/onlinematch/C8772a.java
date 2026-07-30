package com.p051p1.mobile.putong.core.p058ui.onlinematch;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.CompoundButton;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.common.base.Optional;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4907v;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.QuickChatBellData;
import com.p051p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p051p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
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
import p137rx.C22421c;
import p153l.a5i0;
import p153l.a8d0;
import p153l.dbc0;
import p153l.gra;
import p153l.jl80;
import p153l.jxb0;
import p153l.jxd0;
import p153l.l4g0;
import p153l.lyh0;
import p153l.o1j0;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qcj;
import p153l.qs50;
import p153l.r9r;
import p153l.sfj0;
import p153l.t4j;
import p153l.tzi0;
import p153l.ugy;
import p153l.uqb0;
import p153l.uxj0;
import p153l.w1e;
import p153l.wyb0;
import p153l.wyd0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.a */
/* JADX INFO: loaded from: classes4.dex */
public class C8772a {

    /* JADX INFO: renamed from: a */
    public static String f33513a = "0";

    /* JADX INFO: renamed from: b */
    public static long f33514b;

    /* JADX INFO: renamed from: c */
    public static long f33515c;

    /* JADX INFO: renamed from: d */
    public static int f33516d;

    /* JADX INFO: renamed from: e */
    public static final Map<Integer, pf60<Integer, Integer>> f33517e = new HashMap(24);

    /* JADX INFO: renamed from: f */
    public static boolean f33518f = false;

    /* JADX INFO: renamed from: g */
    public static List<String> f33519g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public static r9r<List<String>> f33520h = r9r.m180653c(new pcj() { // from class: l.rs50
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return jyb.m147507f0("主动打开话题，发友好信号", "热情的hi，跟新话题更配哦", "聊轻松的话题，聊天更愉快", "收获好感，从介绍自己开始", "用语音打招呼，会更有诚意", "聊聊最近的热搜话题吧", "聊聊你们的共同点吧", "尝试寻找你们的共同话题吧", "试试能聊起来的开放式问题", "像老朋友一样，开始聊天吧", "新奇的招呼语，更易有反馈", "只发表情，不是好的开场白", "分享一个有趣的事情给Ta吧");
        }
    });

    /* JADX INFO: renamed from: i */
    public static r9r<List<String>> f33521i = r9r.m180653c(new pcj() { // from class: l.ct50
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return jyb.m147507f0("不停的提问，会降低好感哦", "不问隐私，会显得更有礼貌", "切忌刷屏，用心聊天吧", "封闭式聊天,不易打开话题", "主动一些,会赢得更多好感", "分享一个你最近的趣事吧", "多看资料,多聊共同点", "完善资料卡，有助于交友哦", "多赞美，聊天气氛更和谐", "秒回能让你收获好感", "分享你资料里没有的信息吧", "大方说出自己的优点吧", "阳光开朗的男孩人设不会错", "热情回复，会让聊天更愉哦", "不要一味表达，多听Ta说话", "少用套路，多点真诚", "一直说和一直不说都不礼貌");
        }
    });

    /* JADX INFO: renamed from: j */
    public static r9r<List<String>> f33522j = r9r.m180653c(new pcj() { // from class: l.dt50
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return jyb.m147507f0("积极回应，别错过对的人哦", "多聊天，锻炼你的社交力吧", "真诚表达，不做聊天终结者", "尽量少用冷漠的单字回应哦", "真诚的聊天，比外表更重要", "享受聊天，每个人都很有趣", "主动一些，会赢得更多好感", "一直说和一直不说都不礼貌", "大方说出自己的优点吧", "少用套路，多点真诚", "完善资料卡，有助于交友哦");
        }
    });

    /* JADX INFO: renamed from: A */
    public static boolean m51400A() {
        return pzi0.m174439D(CoreModule.f18264c.f20381e0.f89088O0.get().longValue()) && CoreModule.f18264c.f20381e0.f89095P0.get().longValue() >= ((long) m51419T());
    }

    /* JADX INFO: renamed from: B */
    public static String m51401B(long j) {
        int i = Integer.parseInt(new SimpleDateFormat("Mdd").format(new Date(j)));
        if (i >= 121 && i <= 219) {
            return CoreModule.f18263b.getString(R$string.f19878zt);
        }
        if (i >= 220 && i <= 320) {
            return CoreModule.f18263b.getString(R$string.f19878zt);
        }
        if (i >= 321 && i <= 420) {
            return CoreModule.f18263b.getString(R$string.f18315At);
        }
        if (i >= 421 && i <= 521) {
            return CoreModule.f18263b.getString(R$string.f18563It);
        }
        if (i >= 522 && i <= 621) {
            return CoreModule.f18263b.getString(R$string.f18408Dt);
        }
        if (i >= 622 && i <= 722) {
            return CoreModule.f18263b.getString(R$string.f18346Bt);
        }
        if (i >= 723 && i <= 823) {
            return CoreModule.f18263b.getString(R$string.f18439Et);
        }
        if (i >= 824 && i <= 923) {
            return CoreModule.f18263b.getString(R$string.f18594Jt);
        }
        if (i >= 924 && i <= 1023) {
            return CoreModule.f18263b.getString(R$string.f18470Ft);
        }
        if (i < 1024 || i > 1122) {
            return (i < 1123 || i > 1221) ? CoreModule.f18263b.getString(R$string.f18377Ct) : CoreModule.f18263b.getString(R$string.f18501Gt);
        }
        return CoreModule.f18263b.getString(R$string.f18532Ht);
    }

    /* JADX INFO: renamed from: C */
    public static String m51402C(int i, String str) {
        if (i <= 20000 || !NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116593na())) {
            return i >= 1000 ? String.format("%skm", new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(i / 1000.0f)) : String.format("%sm", Integer.valueOf(i));
        }
        return (TextUtils.isEmpty(str) || !str.equals(CoreModule.f18264c.f20381e0.m116593na().location.region.city)) ? "" : str;
    }

    /* JADX INFO: renamed from: D */
    public static void m51403D(Act act, OnlineMatchPushUser onlineMatchPushUser, boolean z, x20 x20Var, boolean z2, String str) {
        m51404E(act, onlineMatchPushUser, z, x20Var, z2, str, true, null);
    }

    /* JADX INFO: renamed from: E */
    public static void m51404E(final Act act, final OnlineMatchPushUser onlineMatchPushUser, boolean z, x20 x20Var, final boolean z2, final String str, final boolean z3, final y20<Boolean> y20Var) {
        final C22421c<uxj0> c22421cM35847g4;
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        if (onlineMatchPushUser.isBell) {
            c22421cM35847g4 = CoreModule.f18264c.f20300D0.m35849i4(onlineMatchPushUser.tracker, onlineMatchPushUser.isGreet ? Answer.TYPE : "greet", z ? "coin" : "privilege", onlineMatchPushUser.isMaleQuickChatRing, onlineMatchPushUser.userId).doOnNext(new y20() { // from class: l.ss50
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8772a.m51440h(onlineMatchPushUser, (Optional) obj);
                }
            }).map(new qcj() { // from class: l.ts50
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return uxj0.f181467a;
                }
            });
        } else if (onlineMatchPushUser.isSpeedMatch) {
            c22421cM35847g4 = CoreModule.f18264c.f20300D0.m35851k4(onlineMatchPushUser.tracker, z ? "coin" : "privilege");
        } else {
            if (!TextUtils.isEmpty(onlineMatchPushUser.secretKey)) {
                QuickChatCardInfo quickChatCardInfo = new QuickChatCardInfo();
                quickChatCardInfo.secretKey = onlineMatchPushUser.secretKey;
                quickChatCardInfo.userID = onlineMatchPushUser.userId;
                a8d0.m96433q0(act, quickChatCardInfo, z, true, str);
                return;
            }
            c22421cM35847g4 = CoreModule.f18264c.f20300D0.m35847g4(onlineMatchPushUser.action, z);
        }
        act.duringCreated(new pcj() { // from class: l.us50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                C22421c c22421c = c22421cM35847g4;
                OnlineMatchPushUser onlineMatchPushUser2 = onlineMatchPushUser;
                return c22421c.flatMap(new qcj() { // from class: l.xs50
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreModule.f18264c.f20381e0.m116616t9(onlineMatchPushUser2.userId);
                    }
                }).flatMap(new qcj() { // from class: l.ys50
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreModule.f18264c.f20384f0.m33905ap(onlineMatchPushUser2.userId);
                    }
                }).switchMap(new qcj() { // from class: l.zs50
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreModule.f18264c.f20381e0.m116483Ka(onlineMatchPushUser2.userId);
                    }
                }).map(new qcj() { // from class: l.at50
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C8772a.m51436f(onlineMatchPushUser2, (User) obj);
                    }
                });
            }
        }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.vs50
            @Override // p153l.y20
            public final void call(Object obj) {
                C8772a.m51452n(onlineMatchPushUser, y20Var, z3, z2, act, str, (User) obj);
            }
        }, new y20() { // from class: l.ws50
            @Override // p153l.y20
            public final void call(Object obj) {
                C8772a.m51444j(y20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public static String m51405F(Calendar calendar) {
        int i = 1;
        int i2 = calendar.get(1);
        if (i2 >= 2000) {
            return CoreModule.f18263b.getString(R$string.f18598K2);
        }
        if (i2 >= 1995) {
            return CoreModule.f18263b.getString(R$string.f18719O2);
        }
        if (i2 >= 1990) {
            return CoreModule.f18263b.getString(R$string.f18689N2);
        }
        if (i2 >= 1980) {
            return CoreModule.f18263b.getString(R$string.f18659M2);
        }
        if (i2 >= 1970) {
            return CoreModule.f18263b.getString(R$string.f18629L2);
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(pzi0.m174454o());
        int i3 = calendar2.get(1);
        int i4 = calendar2.get(2);
        int i5 = calendar2.get(5);
        int i6 = calendar.get(2);
        int i7 = calendar.get(5);
        int i8 = i3 - i2;
        if (i4 >= i6 && (i4 != i6 || i5 >= i7)) {
            i = 0;
        }
        return CoreModule.f18263b.getString(R$string.f18749P2, Integer.valueOf(i8 - i));
    }

    /* JADX INFO: renamed from: G */
    public static String m51406G(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -i);
        return m51405F(calendar);
    }

    /* JADX INFO: renamed from: H */
    public static String m51407H(User user) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(pzi0.m174454o());
        int iIntValue = calendar.get(1) - user.age.intValue();
        if (iIntValue >= 2000) {
            return CoreModule.f18263b.getString(R$string.f18598K2);
        }
        if (iIntValue >= 1995) {
            return CoreModule.f18263b.getString(R$string.f18719O2);
        }
        if (iIntValue >= 1990) {
            return CoreModule.f18263b.getString(R$string.f18689N2);
        }
        if (iIntValue >= 1980) {
            return CoreModule.f18263b.getString(R$string.f18659M2);
        }
        return iIntValue >= 1970 ? CoreModule.f18263b.getString(R$string.f18629L2) : CoreModule.f18263b.getString(R$string.f18749P2, user.age);
    }

    /* JADX INFO: renamed from: I */
    public static int m51408I() {
        return m51429b0() + CoreModule.f18264c.f20313H1.m123902H3();
    }

    /* JADX INFO: renamed from: J */
    public static String m51409J(double d) {
        long jM174454o = (long) ((d - pzi0.m174454o()) / 1000.0d);
        long j = jM174454o / 3600;
        long j2 = (jM174454o / 60) % 60;
        long j3 = jM174454o % 60;
        if (jM174454o >= 60) {
            return tzi0.m193672j(j) + ":" + tzi0.m193672j(j2);
        }
        if (j3 < 0) {
            j3 = 0;
        }
        return tzi0.m193672j(j3) + BLiveStormDanmakuGiftResourceType.f45294s;
    }

    /* JADX INFO: renamed from: K */
    public static long m51410K() {
        return f33515c;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m51411L(String str) {
        return new jxd0("MATCH_UNLOCK_LIMIT_TIPS_" + str + "_" + CoreModule.m30929H().userId(), Boolean.FALSE).get().booleanValue();
    }

    /* JADX INFO: renamed from: M */
    public static String m51412M(String str) {
        return new wyd0("MATCH_UNLOCK_25_" + str + "_" + CoreModule.m30929H().userId(), "").get();
    }

    /* JADX INFO: renamed from: N */
    public static String m51413N(String str) {
        return new wyd0("MATCH_UNLOCK_50_" + str + "_" + CoreModule.m30929H().userId(), "").get();
    }

    /* JADX INFO: renamed from: O */
    public static String m51414O(String str) {
        return new wyd0("MATCH_UNLOCK_75_" + str + "_" + CoreModule.m30929H().userId(), "").get();
    }

    /* JADX INFO: renamed from: P */
    public static String m51415P(String str) {
        return new wyd0("ONLINE_MATCH_" + str + "_" + CoreModule.m30929H().userId(), "").get();
    }

    /* JADX INFO: renamed from: Q */
    public static int m51416Q() {
        int iNextInt;
        int iNextInt2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(uqb0.f180376H.guessedCurrentServerTime());
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
        f33516d = iNextInt2;
        return iNextInt2;
    }

    /* JADX INFO: renamed from: R */
    public static String m51417R(String str) {
        return new wyd0("QUICKCHAT_BELL_" + str + "_" + CoreModule.m30929H().userId(), "").get();
    }

    /* JADX INFO: renamed from: S */
    public static int m51418S() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNum));
        if (NullChecker.m82486a(userPrivilegeM146426x4)) {
            return userPrivilegeM146426x4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: T */
    public static int m51419T() {
        return RemoteConfig.m80481x().m80519z("showQuickChatCardSwipedCount", 2);
    }

    /* JADX INFO: renamed from: U */
    public static boolean m51420U() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("quickchatMembership"));
        return NullChecker.m82486a(userPrivilegeM146426x4) && userPrivilegeM146426x4.content.expiredTime >= uqb0.f180376H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: V */
    public static boolean m51421V() {
        if (!m51422W()) {
            return false;
        }
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("quickchatMembership"));
        return userPrivilegeM146426x4 == null || userPrivilegeM146426x4.content.expiredTime < uqb0.f180376H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: W */
    public static boolean m51422W() {
        return TEnum.equals(CoreModule.f18264c.f20381e0.m116593na().gender, "male");
    }

    /* JADX INFO: renamed from: X */
    public static boolean m51423X(String str, String str2) {
        return TextUtils.equals(m51415P(str), str2);
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m51424Y(String str, String str2) {
        return TextUtils.equals(m51412M(str), str2);
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m51425Z(String str, String str2) {
        return TextUtils.equals(m51413N(str), str2);
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m51427a0(String str, String str2) {
        return TextUtils.equals(m51414O(str), str2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m51428b(jl80 jl80Var, Act act) {
        sfj0.m185596c("e_quickchat_nochat_popup_quit", "p_quickchat_nochat_popup", sfj0.C20032a.m185615h("is_choose", jl80Var.m145965K() ? "true" : "false"));
        act.m68056e2();
    }

    /* JADX INFO: renamed from: b0 */
    public static int m51429b0() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("quickchatNumber"));
        if (NullChecker.m82486a(userPrivilegeM146426x4) && NullChecker.m82487b(userPrivilegeM146426x4.content)) {
            return userPrivilegeM146426x4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m51431c0(String str) {
        new jxd0("MATCH_UNLOCK_LIMIT_TIPS_" + str + "_" + CoreModule.m30929H().userId(), Boolean.FALSE).put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m51432d(jl80 jl80Var, l4g0 l4g0Var, DialogInterface dialogInterface) {
        OnlineMatchManager.m51326z().f33459o.put(Boolean.valueOf(!jl80Var.m145965K()));
        l4g0Var.m152776k();
    }

    /* JADX INFO: renamed from: d0 */
    public static void m51433d0(String str) {
        new jxd0("MATCH_UNLOCK_SHOW_LIMIT_" + str + "_" + CoreModule.m30929H().userId(), Boolean.FALSE).put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m51434e(boolean[] zArr, x20 x20Var, ugy ugyVar) {
        zArr[0] = true;
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static void m51435e0(String str, String str2) {
        new wyd0("QUICKCHAT_BELL_" + str + "_" + CoreModule.m30929H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ User m51436f(OnlineMatchPushUser onlineMatchPushUser, User user) {
        C4907v.f20864Z.m137019l(onlineMatchPushUser.userId);
        return user;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m51437f0(String str, String str2) {
        new wyd0("MATCH_UNLOCK_25_" + str + "_" + CoreModule.m30929H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m51438g(PurchaseType purchaseType, boolean[] zArr, x20 x20Var, ugy ugyVar) {
        a5i0.m96110M1(purchaseType);
        zArr[0] = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: g0 */
    public static void m51439g0(String str, String str2) {
        new wyd0("MATCH_UNLOCK_50_" + str + "_" + CoreModule.m30929H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m51440h(OnlineMatchPushUser onlineMatchPushUser, Optional optional) {
        if (optional.isPresent()) {
            m51435e0(onlineMatchPushUser.userId, ((QuickChatBellData) optional.get()).greetTracker);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m51441h0(String str, String str2) {
        new wyd0("MATCH_UNLOCK_75_" + str + "_" + CoreModule.m30929H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m51443i0(String str, String str2) {
        new wyd0("ONLINE_MATCH_" + str + "_" + CoreModule.m30929H().userId(), "").put(str2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m51444j(y20 y20Var, Throwable th) {
        CoreModule.f18264c.f20297C0.m146425v4();
        if ((th instanceof TantanException.Client.TantanForbidden) && m51463v((TantanException.Client.TantanForbidden) th)) {
            o1j0.m165636j("该用户已提前退出闪聊，请重新发起吧~");
        } else {
            o1j0.m165636j("网络异常，请稍后再重试");
        }
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static void m51445j0(long j) {
        if (j > 0) {
            f33514b = j;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m51447k0(final Act act) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_quickchat_nochat_popup", Dialog.class.getName());
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146056y0("给好友发句消息吧").m146051t0("双方都不说话，会话将可能会消失哦").m146033b0("继续聊天").m146028W(act.getString(R$string.f19409kp)).m146042k0("不再提示").m146024S(dbc0.f87254nj).m146021P(true).m146018M(true).m146020O();
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.et50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C8772a.m51432d(jl80VarM146020O, l4g0VarM204399c, dialogInterface);
            }
        });
        jl80VarM146020O.m145975W(new Runnable() { // from class: l.ft50
            @Override // java.lang.Runnable
            public final void run() {
                sfj0.m185596c("e_quickchat_nochat_popup_continue", "p_quickchat_nochat_popup", sfj0.C20032a.m185615h("is_choose", jl80VarM146020O.m145965K() ? "true" : "false"));
            }
        });
        jl80VarM146020O.m145974V(new Runnable() { // from class: l.gt50
            @Override // java.lang.Runnable
            public final void run() {
                C8772a.m51428b(jl80VarM146020O, act);
            }
        });
        jl80VarM146020O.show();
        l4g0VarM204399c.m152774i();
        l4g0VarM204399c.m152777l();
    }

    /* JADX INFO: renamed from: l0 */
    public static Dialog m51449l0(final Act act, final User user) {
        act.getWindow().getDecorView().post(new Runnable() { // from class: l.bt50
            @Override // java.lang.Runnable
            public final void run() {
                ydi.m215235r(act, user);
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public static Dialog m51451m0(OnlineMatchMatchUser onlineMatchMatchUser) {
        C8774c.INSTANCE.m51485a().m51483k();
        OnlineMatchManager.m51326z().f33442I.m137019l(new pf60<>("match_success", onlineMatchMatchUser));
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m51452n(OnlineMatchPushUser onlineMatchPushUser, y20 y20Var, boolean z, boolean z2, Act act, String str, User user) {
        if (onlineMatchPushUser.isBell && (user.unilateralBlock() || user.isBanned())) {
            o1j0.m165636j(String.format("%s已提前退出闪聊", user.isFemale() ? "她" : "他"));
            return;
        }
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.TRUE);
        }
        if (z) {
            if (z2) {
                m51449l0(act, CoreModule.f18264c.f20381e0.m116503Pa(onlineMatchPushUser.userId));
            } else {
                act.startActivity(MessagesAct.m50132q2(act, onlineMatchPushUser.userId, false, false, false, false, null, 7, str));
            }
        }
        CoreModule.f18264c.f20297C0.m146425v4();
        OnlineMatchManager.m51326z().m51353a0(onlineMatchPushUser.userId);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m51453n0(Act act, OnlineMatchPushUser onlineMatchPushUser) {
        t4j.m189282h("get quick chat broadcase");
        if (!f33518f || a8d0.m96437x0().m96445w0(2) == null) {
            if (jxb0.m147336c()) {
                jxb0.m147335b();
            }
            if (onlineMatchPushUser == null) {
                return;
            }
            boolean z = act instanceof NewMainAct;
            if ((z && !onlineMatchPushUser.isSquareDataWrapper && ((m51400A() || onlineMatchPushUser.isMaleQuickChatRing) && ((!OnlineMatchManager.m51326z().m51335I() || onlineMatchPushUser.isMaleQuickChatRing) && !CoreModule.f18264c.f20381e0.m116600p9().isFemale() && ((NewMainAct) act).m40818h6()))) || (z && onlineMatchPushUser.isAudioBroadcast && ((NewMainAct) act).m40818h6())) {
                if (CoreModule.f18264c.f20405m0.m32143r6() != null && CoreModule.f18264c.f20405m0.m32143r6().f20214id.equals(CoreSuggested.UserInfo.VIRTUAL_CARD) && (CoreModule.f18264c.f20405m0.m32143r6().virtualCardType == VirtualCardType.UndoGuideCard || CoreModule.f18264c.f20405m0.m32143r6().virtualCardType == VirtualCardType.SuperlikeGuideCard)) {
                    return;
                }
                if (onlineMatchPushUser.isAudioBroadcast && (wyb0.m208493O().m208546U(true) || OnlineMatchManager.m51326z().m51338L() || wyb0.m208493O().m208549Y())) {
                    return;
                }
                OnlineMatchManager.m51326z().f33442I.m137019l(new pf60<>("notify_normal_state", null));
                if (!onlineMatchPushUser.isAudioBroadcast) {
                    OnlineMatchManager.m51326z().m51333G();
                }
                a8d0.m96437x0().m96438B0((NewMainAct) act, new QuickChatCardWrapper(onlineMatchPushUser));
                if (onlineMatchPushUser.isAudioBroadcast) {
                    OnlineMatchManager.m51326z().m51375w();
                    return;
                }
                return;
            }
            if (onlineMatchPushUser.isAudioBroadcast) {
                if (wyb0.m208493O().m208546U(true) || OnlineMatchManager.m51326z().m51338L() || wyb0.m208493O().m208549Y() || !z) {
                    return;
                }
                OnlineMatchManager.m51326z().f33442I.m137019l(new pf60<>("notify_normal_state", null));
                jxb0.m147338e(act, true, onlineMatchPushUser);
                OnlineMatchManager.m51326z().m51375w();
                return;
            }
            if (onlineMatchPushUser.isSquareDataWrapper) {
                if (!pzi0.m174439D(OnlineMatchManager.m51326z().f33464t.get().longValue())) {
                    OnlineMatchManager.m51326z().f33463s.put(0);
                }
                if (OnlineMatchManager.m51326z().f33463s.get().intValue() <= 2 && pzi0.m174462w(OnlineMatchManager.m51326z().f33464t.get().longValue(), 1)) {
                    C8774c.INSTANCE.m51485a().m51483k();
                    OnlineMatchManager.m51326z().f33442I.m137019l(new pf60<>("tickets_broadcast", onlineMatchPushUser));
                    OnlineMatchManager.m51326z().m51375w();
                    OnlineMatchManager.m51326z().f33464t.put(Long.valueOf(pzi0.m174454o()));
                    OnlineMatchManager.m51326z().f33463s.m203841a(1);
                    return;
                }
                return;
            }
            if (CoreModule.f18264c.f20300D0.f20871T.get().booleanValue()) {
                return;
            }
            C8774c.INSTANCE.m51485a().m51483k();
            OnlineMatchManager.m51326z().f33442I.m137019l(new pf60<>("tickets_broadcast", onlineMatchPushUser));
            OnlineMatchManager.m51326z().m51375w();
            if (onlineMatchPushUser.isBell) {
                CoreModule.f18264c.f20300D0.m35841N4(onlineMatchPushUser.tracker);
            } else if (onlineMatchPushUser.isSpeedMatch) {
                CoreModule.f18264c.f20300D0.m35842O4(onlineMatchPushUser.tracker);
            } else {
                CoreModule.f18264c.f20300D0.m35843P4("", onlineMatchPushUser.userId);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m51455o0(Act act, final PurchaseType purchaseType, final x20 x20Var, final x20 x20Var2) {
        int iM155442f5 = CoreModule.f18264c.f20312H0.m155442f5();
        final boolean[] zArr = {true};
        l4g0 l4g0VarM96112N1 = a5i0.m96112N1(purchaseType);
        ugy ugyVarM195998t = new ugy.C20573a(act).m195995D(gra.m131594L1() ? qs50.m177728d() : act.string(R$string.f18585Jk)).m195994C(q8g0.m175782N(act.getString(R$string.f18982Wp, String.format(Locale.getDefault(), " %d ", Integer.valueOf(iM155442f5))), Color.parseColor("#FE7E1D"), lyh0.m156283c(2)).append((CharSequence) "\r\n").append((CharSequence) (gra.m131594L1() ? "次数用完了，可以用探探币购买更多" : act.getString(R$string.f19018Y1)))).m195996r("https://auto.tancdn.com/v1/raw/a55966de-3b5d-45e5-9c7f-3560d6843d0b10.pdf", 1).m195997s(dbc0.f87193lo).m196002x(act.string(R$string.f19012Xp), new y20() { // from class: l.ht50
            @Override // p153l.y20
            public final void call(Object obj) {
                C8772a.m51438g(purchaseType, zArr, x20Var, (ugy) obj);
            }
        }).m196000v(act.string(R$string.f19138c), new y20() { // from class: l.it50
            @Override // p153l.y20
            public final void call(Object obj) {
                C8772a.m51434e(zArr, x20Var2, (ugy) obj);
            }
        }).m196004z(a5i0.m96160p0().m96189D0()).m196001w(R$string.f19192dm, new CompoundButton.OnCheckedChangeListener() { // from class: l.jt50
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                a5i0.m96160p0().m96200Q0(z);
            }
        }).m195993B(new DialogInterface.OnDismissListener() { // from class: l.kt50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C8772a.m51458q(zArr, x20Var2, dialogInterface);
            }
        }).m195998t();
        ugyVarM195998t.m195973m(l4g0VarM96112N1);
        ugyVarM195998t.m195974n();
    }

    /* JADX INFO: renamed from: p0 */
    public static PurchaseType m51457p0() {
        return m51421V() ? PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS : PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m51458q(boolean[] zArr, x20 x20Var, DialogInterface dialogInterface) {
        if (zArr[0] && NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: u */
    public static int m51462u() {
        Map<Integer, pf60<Integer, Integer>> map = f33517e;
        if (map.size() <= 0) {
            map.put(0, pf60.m172085a(245343, 364407));
            map.put(1, pf60.m172085a(154798, 273424));
            map.put(2, pf60.m172085a(98051, 172516));
            map.put(3, pf60.m172085a(67436, 109274));
            map.put(4, pf60.m172085a(60514, 75154));
            map.put(5, pf60.m172085a(89238, 168132));
            map.put(6, pf60.m172085a(150864, 225861));
            map.put(7, pf60.m172085a(202664, 282610));
            map.put(8, pf60.m172085a(233726, 314674));
            map.put(9, pf60.m172085a(260244, 341204));
            map.put(10, pf60.m172085a(312600, 344165));
            map.put(11, pf60.m172085a(315313, 359447));
            map.put(12, pf60.m172085a(299799, 348716));
            map.put(13, pf60.m172085a(319482, 353898));
            map.put(14, pf60.m172085a(320448, 357251));
            map.put(15, pf60.m172085a(313687, 351974));
            map.put(16, pf60.m172085a(322467, 361595));
            map.put(17, pf60.m172085a(301887, 353800));
            map.put(18, pf60.m172085a(301887, 345889));
            map.put(19, pf60.m172085a(316892, 364215));
            map.put(20, pf60.m172085a(333682, 408928));
            map.put(21, pf60.m172085a(374647, 440661));
            map.put(22, pf60.m172085a(398675, 447884));
            map.put(23, pf60.m172085a(386207, 364407));
        }
        pf60<Integer, Integer> pf60Var = map.get(Integer.valueOf(Calendar.getInstance().get(11)));
        return (int) ((((double) (pf60Var.f152157b.intValue() - pf60Var.f152156a.intValue())) * Math.random()) + ((double) pf60Var.f152156a.intValue()));
    }

    /* JADX INFO: renamed from: v */
    public static boolean m51463v(TantanException.Client.TantanForbidden tantanForbidden) {
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
    public static void m51464w(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri) {
        m51466y(simpleDraweeView, imageUri, 0, true);
    }

    /* JADX INFO: renamed from: x */
    public static void m51465x(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i) {
        m51466y(simpleDraweeView, imageUri, i, false);
    }

    /* JADX INFO: renamed from: y */
    public static void m51466y(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i, boolean z) {
        if (i == 100) {
            uqb0.f180374G.m127125Q0(simpleDraweeView, imageUri);
            return;
        }
        pf60<Integer, Integer> pf60VarM51467z = m51467z(i);
        if (pf60VarM51467z.f152156a.intValue() <= 0 || pf60VarM51467z.f152157b.intValue() <= 0) {
            uqb0.f180374G.m127125Q0(simpleDraweeView, imageUri);
        } else {
            uqb0.f180374G.m127120O(simpleDraweeView, imageUri.formatted(), pf60VarM51467z.f152156a.intValue(), pf60VarM51467z.f152157b.intValue());
        }
    }

    /* JADX INFO: renamed from: z */
    public static pf60<Integer, Integer> m51467z(int i) {
        return pf60.m172085a(8, Integer.valueOf((100 - i) / 3));
    }
}
