package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p046p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p046p1.mobile.putong.core.data.QuickChatOneside;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class xzc0 extends ogl0 {

    /* JADX INFO: renamed from: e */
    public static xzc0 f195187e;

    /* JADX INFO: renamed from: b */
    public QuickChatCardWrapper f195188b;

    /* JADX INFO: renamed from: c */
    public QuickChatCardWrapper f195189c;

    /* JADX INFO: renamed from: d */
    public c4g0 f195190d;

    /* JADX INFO: renamed from: A0 */
    public static boolean m211953A0() {
        return mqi0.m155929D(CoreModule.f17545c.f19558D0.f20130U.get().longValue()) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9()) && CoreModule.f17545c.f19639e0.m169527p9().isFemale() && CoreModule.f17545c.f19558D0.f20131V.get().intValue() >= m211973u0();
    }

    /* JADX INFO: renamed from: E0 */
    public static void m211954E0() {
        if (mqi0.m155929D(CoreModule.f17545c.f19558D0.f20130U.get().longValue())) {
            tpd0 tpd0Var = CoreModule.f17545c.f19558D0.f20131V;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        } else {
            CoreModule.f17545c.f19558D0.f20130U.put(Long.valueOf(mqi0.m155944o()));
            CoreModule.f17545c.f19558D0.f20131V.put(1);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static void m211955F0() {
        f195187e = null;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m211959f0(d30 d30Var, boolean z, Act act, QuickChatCardInfo quickChatCardInfo, String str, roj0 roj0Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        if (z) {
            act.startActivity(MessagesAct.m48949p2(act, quickChatCardInfo.userID, false, false, false, false, null, 7, str));
        } else {
            C8609a.m50266l0(act, CoreModule.f17545c.f19639e0.m169430Pa(quickChatCardInfo.userID));
        }
        CoreModule.f17545c.f19555C0.m210112u4();
        OnlineMatchManager.m50143z().m50170a0(quickChatCardInfo.userID);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m211962i0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ Boolean m211965l0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m211967n0(NewMainAct newMainAct, QuickChatCardInfo quickChatCardInfo) {
        if (NullChecker.m81303a(quickChatCardInfo)) {
            y1j.m212199h("poll and get quickchat");
            m211974x0().m211975B0(newMainAct, new QuickChatCardWrapper(quickChatCardInfo));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m211968o0(d30 d30Var, boolean z, Act act, QuickChatCardInfo quickChatCardInfo, String str, roj0 roj0Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        if (z) {
            act.startActivity(MessagesAct.m48949p2(act, quickChatCardInfo.userID, false, false, false, false, null, 7, str));
        } else {
            C8609a.m50266l0(act, CoreModule.f17545c.f19639e0.m169430Pa(quickChatCardInfo.userID));
        }
        CoreModule.f17545c.f19555C0.m210112u4();
        OnlineMatchManager.m50143z().m50170a0(quickChatCardInfo.userID);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ C22306c m211969p0(QuickChatCardInfo quickChatCardInfo, QuickChatOneside quickChatOneside) {
        if (!TextUtils.isEmpty(quickChatOneside.tracker)) {
            C8609a.m50252e0(quickChatCardInfo.userID, quickChatOneside.tracker);
        }
        return CoreModule.f17545c.f19639e0.m169543t9(quickChatCardInfo.userID);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m211970q0(Act act, QuickChatCardInfo quickChatCardInfo, boolean z, boolean z2, String str) {
        m211971r0(act, quickChatCardInfo, z, z2, str, null);
    }

    /* JADX INFO: renamed from: r0 */
    public static void m211971r0(final Act act, final QuickChatCardInfo quickChatCardInfo, final boolean z, final boolean z2, final String str, @Nullable final d30 d30Var) {
        act.duringCreated(new v9j() { // from class: l.pzc0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                QuickChatCardInfo quickChatCardInfo2 = quickChatCardInfo;
                return CoreModule.f17545c.f19558D0.m34847j4(quickChatCardInfo2.secretKey, z).filter(new w9j() { // from class: l.lzc0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return xzc0.m211965l0((Boolean) obj);
                    }
                }).switchMap(new w9j() { // from class: l.mzc0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreModule.f17545c.f19639e0.m169543t9(quickChatCardInfo2.userID);
                    }
                }).switchMap(new w9j() { // from class: l.nzc0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreModule.f17545c.f19642f0.m32902ap(quickChatCardInfo2.userID);
                    }
                });
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.qzc0
            @Override // p149l.e30
            public final void call(Object obj) {
                xzc0.m211968o0(d30Var, z2, act, quickChatCardInfo, str, (roj0) obj);
            }
        }, new e30() { // from class: l.rzc0
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19555C0.m210112u4();
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static void m211972s0(final Act act, final QuickChatCardInfo quickChatCardInfo, final boolean z, final boolean z2, final String str, @Nullable final d30 d30Var) {
        act.duringCreated(new v9j() { // from class: l.szc0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                QuickChatCardInfo quickChatCardInfo2 = quickChatCardInfo;
                return CoreModule.f17545c.f19558D0.m34845h4(quickChatCardInfo2.secretKey, z, quickChatCardInfo2.biz.toString(), quickChatCardInfo2.stage).filter(new w9j() { // from class: l.wzc0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.m81303a((QuickChatOneside) obj));
                    }
                }).switchMap(new w9j() { // from class: l.jzc0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return xzc0.m211969p0(quickChatCardInfo2, (QuickChatOneside) obj);
                    }
                }).switchMap(new w9j() { // from class: l.kzc0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreModule.f17545c.f19642f0.m32902ap(quickChatCardInfo2.userID);
                    }
                });
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.tzc0
            @Override // p149l.e30
            public final void call(Object obj) {
                xzc0.m211959f0(d30Var, z2, act, quickChatCardInfo, str, (roj0) obj);
            }
        }, new e30() { // from class: l.uzc0
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19555C0.m210112u4();
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public static int m211973u0() {
        try {
            return RemoteConfig.m79298x().m79335y("quickchat_show_limit_female");
        } catch (Exception unused) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static xzc0 m211974x0() {
        if (f195187e == null) {
            synchronized (xzc0.class) {
                try {
                    if (f195187e == null) {
                        f195187e = new xzc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f195187e;
    }

    /* JADX INFO: renamed from: B0 */
    public void m211975B0(NewMainAct newMainAct, final QuickChatCardWrapper quickChatCardWrapper) {
        CoreSuggested.UserInfo userInfo;
        if (quickChatCardWrapper.isPeiLiao() || !m211953A0() || !NullChecker.m81303a(quickChatCardWrapper.getBroadcastCard()) || quickChatCardWrapper.getBroadcastCard().isAudioBroadcast) {
            PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
            final VirtualCardType virtualCardType = VirtualCardType.OnlineMatchBroadcastCard;
            if (quickChatCardWrapper.isPeiLiao()) {
                virtualCardType = VirtualCardType.OnlineMatchBroadcastPeiLiaoCard;
            } else if (quickChatCardWrapper.cardType == 2 && NullChecker.m81303a(quickChatCardWrapper.getBroadcastCard()) && quickChatCardWrapper.getBroadcastCard().isAudioBroadcast) {
                virtualCardType = VirtualCardType.QuickAudioBroadcastCard;
            }
            if (!NullChecker.m81303a(partialListOptM221515e)) {
                userInfo = null;
            } else if (snm.m185091V(partialListOptM221515e) && !quickChatCardWrapper.isPeiLiao()) {
                return;
            } else {
                userInfo = (CoreSuggested.UserInfo) vwb.m200346r(partialListOptM221515e.loaded, new w9j() { // from class: l.vzc0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        CoreSuggested.UserInfo userInfo2 = (CoreSuggested.UserInfo) obj;
                        return Boolean.valueOf(userInfo2.virtualCardType == virtualCardType && userInfo2.quickChatCardWrapper.cardType == quickChatCardWrapper.cardType);
                    }
                });
            }
            if (userInfo == null) {
                if (!quickChatCardWrapper.isPeiLiao()) {
                    m211954E0();
                }
                int i = quickChatCardWrapper.cardType;
                if (i == 1) {
                    this.f195188b = quickChatCardWrapper;
                } else if (i == 2) {
                    this.f195189c = quickChatCardWrapper;
                    OnlineMatchManager.m50143z().m50192w();
                }
                CoreSuggested.UserInfo userInfo2 = new CoreSuggested.UserInfo();
                userInfo2.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                userInfo2.extraInfo = quickChatCardWrapper.userId;
                userInfo2.virtualCardType = virtualCardType;
                userInfo2.quickChatCardWrapper = quickChatCardWrapper;
                if (quickChatCardWrapper.isPeiLiao()) {
                    CoreModule.f17545c.f19663m0.m31006H8(vwb.m200324f0(quickChatCardWrapper.userId));
                } else {
                    CoreModule.f17545c.f19663m0.m31006H8(vwb.m200324f0(quickChatCardWrapper.userId));
                }
                if (newMainAct.m39808c6() || (m211984z0(partialListOptM221515e) && quickChatCardWrapper.cardType == 1)) {
                    y1j.m212199h("insertQuick card real to 1 " + quickChatCardWrapper.cardType);
                    CoreModule.f17545c.f19663m0.m31154w6(userInfo2, 1);
                } else {
                    userInfo2.preSwipedDirection = SwipeDirection.LEFT;
                    y1j.m212199h("insertQuick card real to 0 " + quickChatCardWrapper.cardType);
                    CoreModule.f17545c.f19663m0.m31154w6(userInfo2, 0);
                }
                if (quickChatCardWrapper.isPeiLiao()) {
                    quickChatCardWrapper.markAsConsumed();
                    return;
                }
                m211979H0(quickChatCardWrapper);
                m211978G0(quickChatCardWrapper);
                newMainAct.m39798X6();
                e51.m114743H(CoreModule.f17544b, quickChatCardWrapper.consumeRunnable(), Constants.INBOX_V2_THROTTLE_WINDOW_MS);
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m211976C0(QuickChatCardWrapper quickChatCardWrapper) {
        return NullChecker.m81303a(quickChatCardWrapper) && NullChecker.m81303a(quickChatCardWrapper.getBroadcastCard()) && quickChatCardWrapper.getBroadcastCard().isMaleQuickChatRing;
    }

    /* JADX INFO: renamed from: D0 */
    public void m211977D0(final NewMainAct newMainAct) {
        c4g0 c4g0Var = this.f195190d;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f195190d = newMainAct.duringCreated(CoreModule.f17545c.f19558D0.m34825A4()).subscribe(mkd0.m154956H(new e30() { // from class: l.izc0
                @Override // p149l.e30
                public final void call(Object obj) {
                    xzc0.m211967n0(newMainAct, (QuickChatCardInfo) obj);
                }
            }, new e30() { // from class: l.ozc0
                @Override // p149l.e30
                public final void call(Object obj) {
                    xzc0.m211962i0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m211978G0(QuickChatCardWrapper quickChatCardWrapper) {
        if (quickChatCardWrapper.cardType == 2 && quickChatCardWrapper.getBroadcastCard().isBell) {
            CoreModule.f17545c.f19558D0.m34838N4(quickChatCardWrapper.getBroadcastCard().tracker);
        } else if (quickChatCardWrapper.cardType == 2 && quickChatCardWrapper.getBroadcastCard().isSpeedMatch) {
            CoreModule.f17545c.f19558D0.m34838N4(quickChatCardWrapper.getBroadcastCard().tracker);
        } else {
            CoreModule.f17545c.f19558D0.m34840P4("", quickChatCardWrapper.userId);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m211979H0(QuickChatCardWrapper quickChatCardWrapper) {
        HashMap map = new HashMap();
        map.put("other_user_id", quickChatCardWrapper.userId);
        map.put("quickchat_card_type", quickChatCardWrapper.cardType == 1 ? "fixed" : "radio");
        map.put("quickchat_which_number", CoreModule.f17545c.f19639e0.f149238P0.get());
        if (quickChatCardWrapper.cardType == 2) {
            map.put("radio_type", quickChatCardWrapper.getBroadcastCard().radioType);
            map.put("is_quickchatbell", Boolean.valueOf(quickChatCardWrapper.getBroadcastCard().isBell));
        }
        map.put("user_action", m211983y0(quickChatCardWrapper));
        map.put("which_content", m211981v0(quickChatCardWrapper));
        map.put("quickchat_male_ring", Integer.valueOf(m211976C0(quickChatCardWrapper) ? 1 : 0));
        zvf0.m220403y("e_card_quickchat", "p_suggest_users_home_view", map);
    }

    /* JADX INFO: renamed from: t0 */
    public void m211980t0(String str) {
        if (NullChecker.m81303a(this.f195188b) && str.equals(this.f195188b.userId)) {
            this.f195188b.consume();
        } else if (NullChecker.m81303a(this.f195189c) && str.equals(this.f195189c.userId)) {
            this.f195189c.consume();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final String m211981v0(QuickChatCardWrapper quickChatCardWrapper) {
        if (!NullChecker.m81303a(quickChatCardWrapper.getUser())) {
            return "nothing";
        }
        if (TextUtils.isEmpty(quickChatCardWrapper.getUser().description)) {
            return !vwb.m200296J(quickChatCardWrapper.getUser().profile.tags) ? com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL : "nothing";
        }
        return "sign";
    }

    /* JADX INFO: renamed from: w0 */
    public QuickChatCardWrapper m211982w0(int i) {
        if (i == 1 && NullChecker.m81303a(this.f195188b) && !this.f195188b.isConsumed()) {
            return this.f195188b;
        }
        if (i == 2 && NullChecker.m81303a(this.f195189c) && !this.f195189c.isConsumed()) {
            return this.f195189c;
        }
        return null;
    }

    /* JADX INFO: renamed from: y0 */
    public final String m211983y0(QuickChatCardWrapper quickChatCardWrapper) {
        if (TEnum.equals(quickChatCardWrapper.rsStateReceiverToSender, "superliked")) {
            return "superlike";
        }
        return TEnum.equals(quickChatCardWrapper.rsStateReceiverToSender, "liked") ? "like" : "normal";
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m211984z0(PartialListOpt<CoreSuggested.UserInfo> partialListOpt) {
        return partialListOpt != null && partialListOpt.loaded.size() > 0 && partialListOpt.loaded.get(0).isPassiveQuickChat();
    }
}
