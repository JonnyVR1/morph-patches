package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.putong.core.data.QuickChatOneside;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.snm;
import l.tpd0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.y1j;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xzc0 extends ogl0 {

    /* JADX INFO: renamed from: e */
    public static xzc0 f27819e;

    /* JADX INFO: renamed from: b */
    public QuickChatCardWrapper f27820b;

    /* JADX INFO: renamed from: c */
    public QuickChatCardWrapper f27821c;

    /* JADX INFO: renamed from: d */
    public c4g0 f27822d;

    /* JADX INFO: renamed from: A0 */
    public static boolean m27699A0() {
        return mqi0.D(((Long) CoreModule.f1534c.f3547D0.f4119U.get()).longValue()) && NullChecker.a(CoreModule.f1534c.f3628e0.m21490p9()) && CoreModule.f1534c.f3628e0.m21490p9().isFemale() && ((Integer) CoreModule.f1534c.f3547D0.f4120V.get()).intValue() >= m27719u0();
    }

    /* JADX INFO: renamed from: E0 */
    public static void m27700E0() {
        if (mqi0.D(((Long) CoreModule.f1534c.f3547D0.f4119U.get()).longValue())) {
            tpd0 tpd0Var = CoreModule.f1534c.f3547D0.f4120V;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        } else {
            CoreModule.f1534c.f3547D0.f4119U.put(Long.valueOf(mqi0.o()));
            CoreModule.f1534c.f3547D0.f4120V.put(1);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static void m27701F0() {
        f27819e = null;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m27705f0(d30 d30Var, boolean z, Act act, QuickChatCardInfo quickChatCardInfo, String str, roj0 roj0Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        if (z) {
            act.startActivity(MessagesAct.p2(act, quickChatCardInfo.userID, false, false, false, false, (Intent) null, 7, str));
        } else {
            a.l0(act, CoreModule.f1534c.f3628e0.m21393Pa(quickChatCardInfo.userID));
        }
        CoreModule.f1534c.f3544C0.m27420u4();
        OnlineMatchManager.z().a0(quickChatCardInfo.userID);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m27708i0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ Boolean m27711l0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m27713n0(NewMainAct newMainAct, QuickChatCardInfo quickChatCardInfo) {
        if (NullChecker.a(quickChatCardInfo)) {
            y1j.h("poll and get quickchat");
            m27720x0().m27721B0(newMainAct, new QuickChatCardWrapper(quickChatCardInfo));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m27714o0(d30 d30Var, boolean z, Act act, QuickChatCardInfo quickChatCardInfo, String str, roj0 roj0Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        if (z) {
            act.startActivity(MessagesAct.p2(act, quickChatCardInfo.userID, false, false, false, false, (Intent) null, 7, str));
        } else {
            a.l0(act, CoreModule.f1534c.f3628e0.m21393Pa(quickChatCardInfo.userID));
        }
        CoreModule.f1534c.f3544C0.m27420u4();
        OnlineMatchManager.z().a0(quickChatCardInfo.userID);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ c m27715p0(QuickChatCardInfo quickChatCardInfo, QuickChatOneside quickChatOneside) {
        if (!TextUtils.isEmpty(quickChatOneside.tracker)) {
            a.e0(quickChatCardInfo.userID, quickChatOneside.tracker);
        }
        return CoreModule.f1534c.f3628e0.m21506t9(quickChatCardInfo.userID);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m27716q0(Act act, QuickChatCardInfo quickChatCardInfo, boolean z, boolean z2, String str) {
        m27717r0(act, quickChatCardInfo, z, z2, str, null);
    }

    /* JADX INFO: renamed from: r0 */
    public static void m27717r0(final Act act, final QuickChatCardInfo quickChatCardInfo, final boolean z, final boolean z2, final String str, @Nullable final d30 d30Var) {
        act.duringCreated(new v9j() { // from class: l.pzc0
            public final Object call() {
                QuickChatCardInfo quickChatCardInfo2 = quickChatCardInfo;
                return CoreModule.f1534c.f3547D0.m6784j4(quickChatCardInfo2.secretKey, z).filter(new w9j() { // from class: l.lzc0
                    public final Object call(Object obj) {
                        return xzc0.m27711l0((Boolean) obj);
                    }
                }).switchMap(new w9j() { // from class: l.mzc0
                    public final Object call(Object obj) {
                        return CoreModule.f1534c.f3628e0.m21506t9(quickChatCardInfo2.userID);
                    }
                }).switchMap(new w9j() { // from class: l.nzc0
                    public final Object call(Object obj) {
                        return CoreModule.f1534c.f3631f0.m4832ap(quickChatCardInfo2.userID);
                    }
                });
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.qzc0
            public final void call(Object obj) {
                xzc0.m27714o0(d30Var, z2, act, quickChatCardInfo, str, (roj0) obj);
            }
        }, new e30() { // from class: l.rzc0
            public final void call(Object obj) {
                CoreModule.f1534c.f3544C0.m27420u4();
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static void m27718s0(final Act act, final QuickChatCardInfo quickChatCardInfo, final boolean z, final boolean z2, final String str, @Nullable final d30 d30Var) {
        act.duringCreated(new v9j() { // from class: l.szc0
            public final Object call() {
                QuickChatCardInfo quickChatCardInfo2 = quickChatCardInfo;
                return CoreModule.f1534c.f3547D0.m6782h4(quickChatCardInfo2.secretKey, z, quickChatCardInfo2.biz.toString(), quickChatCardInfo2.stage).filter(new w9j() { // from class: l.wzc0
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.a((QuickChatOneside) obj));
                    }
                }).switchMap(new w9j() { // from class: l.jzc0
                    public final Object call(Object obj) {
                        return xzc0.m27715p0(quickChatCardInfo2, (QuickChatOneside) obj);
                    }
                }).switchMap(new w9j() { // from class: l.kzc0
                    public final Object call(Object obj) {
                        return CoreModule.f1534c.f3631f0.m4832ap(quickChatCardInfo2.userID);
                    }
                });
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.tzc0
            public final void call(Object obj) {
                xzc0.m27705f0(d30Var, z2, act, quickChatCardInfo, str, (roj0) obj);
            }
        }, new e30() { // from class: l.uzc0
            public final void call(Object obj) {
                CoreModule.f1534c.f3544C0.m27420u4();
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public static int m27719u0() {
        try {
            return RemoteConfig.x().y("quickchat_show_limit_female");
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static xzc0 m27720x0() {
        if (f27819e == null) {
            synchronized (xzc0.class) {
                try {
                    if (f27819e == null) {
                        f27819e = new xzc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f27819e;
    }

    /* JADX INFO: renamed from: B0 */
    public void m27721B0(NewMainAct newMainAct, final QuickChatCardWrapper quickChatCardWrapper) {
        CoreSuggested.UserInfo userInfo;
        if (quickChatCardWrapper.isPeiLiao() || !m27699A0() || !NullChecker.a(quickChatCardWrapper.getBroadcastCard()) || quickChatCardWrapper.getBroadcastCard().isAudioBroadcast) {
            PartialListOpt<CoreSuggested.UserInfo> partialListOpt = (PartialListOpt) CoreModule.f1534c.f3652m0.f3383a0.e();
            final VirtualCardType virtualCardType = VirtualCardType.OnlineMatchBroadcastCard;
            if (quickChatCardWrapper.isPeiLiao()) {
                virtualCardType = VirtualCardType.OnlineMatchBroadcastPeiLiaoCard;
            } else if (quickChatCardWrapper.cardType == 2 && NullChecker.a(quickChatCardWrapper.getBroadcastCard()) && quickChatCardWrapper.getBroadcastCard().isAudioBroadcast) {
                virtualCardType = VirtualCardType.QuickAudioBroadcastCard;
            }
            if (!NullChecker.a(partialListOpt)) {
                userInfo = null;
            } else if (snm.V(partialListOpt) && !quickChatCardWrapper.isPeiLiao()) {
                return;
            } else {
                userInfo = (CoreSuggested.UserInfo) vwb.r(partialListOpt.loaded, new w9j() { // from class: l.vzc0
                    public final Object call(Object obj) {
                        CoreSuggested.UserInfo userInfo2 = (CoreSuggested.UserInfo) obj;
                        return Boolean.valueOf(userInfo2.virtualCardType == virtualCardType && userInfo2.quickChatCardWrapper.cardType == quickChatCardWrapper.cardType);
                    }
                });
            }
            if (userInfo == null) {
                if (!quickChatCardWrapper.isPeiLiao()) {
                    m27700E0();
                }
                int i = quickChatCardWrapper.cardType;
                if (i == 1) {
                    this.f27820b = quickChatCardWrapper;
                } else if (i == 2) {
                    this.f27821c = quickChatCardWrapper;
                    OnlineMatchManager.z().w();
                }
                CoreSuggested.UserInfo userInfo2 = new CoreSuggested.UserInfo();
                userInfo2.f3461id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                userInfo2.extraInfo = quickChatCardWrapper.userId;
                userInfo2.virtualCardType = virtualCardType;
                userInfo2.quickChatCardWrapper = quickChatCardWrapper;
                if (quickChatCardWrapper.isPeiLiao()) {
                    CoreModule.f1534c.f3652m0.m2936H8(vwb.f0(new String[]{quickChatCardWrapper.userId}));
                } else {
                    CoreModule.f1534c.f3652m0.m2936H8(vwb.f0(new String[]{quickChatCardWrapper.userId}));
                }
                if (newMainAct.c6() || (m27730z0(partialListOpt) && quickChatCardWrapper.cardType == 1)) {
                    y1j.h("insertQuick card real to 1 " + quickChatCardWrapper.cardType);
                    CoreModule.f1534c.f3652m0.m3084w6(userInfo2, 1);
                } else {
                    userInfo2.preSwipedDirection = SwipeDirection.LEFT;
                    y1j.h("insertQuick card real to 0 " + quickChatCardWrapper.cardType);
                    CoreModule.f1534c.f3652m0.m3084w6(userInfo2, 0);
                }
                if (quickChatCardWrapper.isPeiLiao()) {
                    quickChatCardWrapper.markAsConsumed();
                    return;
                }
                m27725H0(quickChatCardWrapper);
                m27724G0(quickChatCardWrapper);
                newMainAct.X6();
                e51.H(CoreModule.f1533b, quickChatCardWrapper.consumeRunnable(), 300000L);
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m27722C0(QuickChatCardWrapper quickChatCardWrapper) {
        return NullChecker.a(quickChatCardWrapper) && NullChecker.a(quickChatCardWrapper.getBroadcastCard()) && quickChatCardWrapper.getBroadcastCard().isMaleQuickChatRing;
    }

    /* JADX INFO: renamed from: D0 */
    public void m27723D0(final NewMainAct newMainAct) {
        c4g0 c4g0Var = this.f27822d;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f27822d = newMainAct.duringCreated(CoreModule.f1534c.f3547D0.m6762A4()).subscribe(mkd0.H(new e30() { // from class: l.izc0
                public final void call(Object obj) {
                    xzc0.m27713n0(newMainAct, (QuickChatCardInfo) obj);
                }
            }, new e30() { // from class: l.ozc0
                public final void call(Object obj) {
                    xzc0.m27708i0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m27724G0(QuickChatCardWrapper quickChatCardWrapper) {
        if (quickChatCardWrapper.cardType == 2 && quickChatCardWrapper.getBroadcastCard().isBell) {
            CoreModule.f1534c.f3547D0.m6775N4(quickChatCardWrapper.getBroadcastCard().tracker);
        } else if (quickChatCardWrapper.cardType == 2 && quickChatCardWrapper.getBroadcastCard().isSpeedMatch) {
            CoreModule.f1534c.f3547D0.m6775N4(quickChatCardWrapper.getBroadcastCard().tracker);
        } else {
            CoreModule.f1534c.f3547D0.m6777P4("", quickChatCardWrapper.userId);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m27725H0(QuickChatCardWrapper quickChatCardWrapper) {
        HashMap map = new HashMap();
        map.put("other_user_id", quickChatCardWrapper.userId);
        map.put("quickchat_card_type", quickChatCardWrapper.cardType == 1 ? "fixed" : "radio");
        map.put("quickchat_which_number", CoreModule.f1534c.f3628e0.f18850P0.get());
        if (quickChatCardWrapper.cardType == 2) {
            map.put("radio_type", quickChatCardWrapper.getBroadcastCard().radioType);
            map.put("is_quickchatbell", Boolean.valueOf(quickChatCardWrapper.getBroadcastCard().isBell));
        }
        map.put("user_action", m27729y0(quickChatCardWrapper));
        map.put("which_content", m27727v0(quickChatCardWrapper));
        map.put("quickchat_male_ring", Integer.valueOf(m27722C0(quickChatCardWrapper) ? 1 : 0));
        zvf0.y("e_card_quickchat", "p_suggest_users_home_view", map);
    }

    /* JADX INFO: renamed from: t0 */
    public void m27726t0(String str) {
        if (NullChecker.a(this.f27820b) && str.equals(this.f27820b.userId)) {
            this.f27820b.consume();
        } else if (NullChecker.a(this.f27821c) && str.equals(this.f27821c.userId)) {
            this.f27821c.consume();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final String m27727v0(QuickChatCardWrapper quickChatCardWrapper) {
        if (!NullChecker.a(quickChatCardWrapper.getUser())) {
            return "nothing";
        }
        if (TextUtils.isEmpty(quickChatCardWrapper.getUser().description)) {
            return !vwb.J(quickChatCardWrapper.getUser().profile.tags) ? "label" : "nothing";
        }
        return "sign";
    }

    /* JADX INFO: renamed from: w0 */
    public QuickChatCardWrapper m27728w0(int i) {
        if (i == 1 && NullChecker.a(this.f27820b) && !this.f27820b.isConsumed()) {
            return this.f27820b;
        }
        if (i == 2 && NullChecker.a(this.f27821c) && !this.f27821c.isConsumed()) {
            return this.f27821c;
        }
        return null;
    }

    /* JADX INFO: renamed from: y0 */
    public final String m27729y0(QuickChatCardWrapper quickChatCardWrapper) {
        if (TEnum.equals(quickChatCardWrapper.rsStateReceiverToSender, "superliked")) {
            return "superlike";
        }
        return TEnum.equals(quickChatCardWrapper.rsStateReceiverToSender, "liked") ? "like" : "normal";
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m27730z0(PartialListOpt<CoreSuggested.UserInfo> partialListOpt) {
        return partialListOpt != null && partialListOpt.loaded.size() > 0 && ((CoreSuggested.UserInfo) partialListOpt.loaded.get(0)).isPassiveQuickChat();
    }
}
