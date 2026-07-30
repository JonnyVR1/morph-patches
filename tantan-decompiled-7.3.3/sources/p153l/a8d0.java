package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p051p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p051p1.mobile.putong.core.data.QuickChatOneside;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class a8d0 extends spl0 {

    /* JADX INFO: renamed from: e */
    public static a8d0 f68911e;

    /* JADX INFO: renamed from: b */
    public QuickChatCardWrapper f68912b;

    /* JADX INFO: renamed from: c */
    public QuickChatCardWrapper f68913c;

    /* JADX INFO: renamed from: d */
    public kcg0 f68914d;

    /* JADX INFO: renamed from: A0 */
    public static boolean m96416A0() {
        return pzi0.m174439D(CoreModule.f18264c.f20300D0.f20872U.get().longValue()) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9()) && CoreModule.f18264c.f20381e0.m116600p9().isFemale() && CoreModule.f18264c.f20300D0.f20873V.get().intValue() >= m96436u0();
    }

    /* JADX INFO: renamed from: E0 */
    public static void m96417E0() {
        if (pzi0.m174439D(CoreModule.f18264c.f20300D0.f20872U.get().longValue())) {
            vxd0 vxd0Var = CoreModule.f18264c.f20300D0.f20873V;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        } else {
            CoreModule.f18264c.f20300D0.f20872U.put(Long.valueOf(pzi0.m174454o()));
            CoreModule.f18264c.f20300D0.f20873V.put(1);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static void m96418F0() {
        f68911e = null;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m96422f0(x20 x20Var, boolean z, Act act, QuickChatCardInfo quickChatCardInfo, String str, uxj0 uxj0Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        if (z) {
            act.startActivity(MessagesAct.m50132q2(act, quickChatCardInfo.userID, false, false, false, false, null, 7, str));
        } else {
            C8772a.m51449l0(act, CoreModule.f18264c.f20381e0.m116503Pa(quickChatCardInfo.userID));
        }
        CoreModule.f18264c.f20297C0.m146425v4();
        OnlineMatchManager.m51326z().m51353a0(quickChatCardInfo.userID);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m96425i0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ Boolean m96428l0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m96430n0(NewMainAct newMainAct, QuickChatCardInfo quickChatCardInfo) {
        if (NullChecker.m82486a(quickChatCardInfo)) {
            t4j.m189282h("poll and get quickchat");
            m96437x0().m96438B0(newMainAct, new QuickChatCardWrapper(quickChatCardInfo));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m96431o0(x20 x20Var, boolean z, Act act, QuickChatCardInfo quickChatCardInfo, String str, uxj0 uxj0Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        if (z) {
            act.startActivity(MessagesAct.m50132q2(act, quickChatCardInfo.userID, false, false, false, false, null, 7, str));
        } else {
            C8772a.m51449l0(act, CoreModule.f18264c.f20381e0.m116503Pa(quickChatCardInfo.userID));
        }
        CoreModule.f18264c.f20297C0.m146425v4();
        OnlineMatchManager.m51326z().m51353a0(quickChatCardInfo.userID);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ C22421c m96432p0(QuickChatCardInfo quickChatCardInfo, QuickChatOneside quickChatOneside) {
        if (!TextUtils.isEmpty(quickChatOneside.tracker)) {
            C8772a.m51435e0(quickChatCardInfo.userID, quickChatOneside.tracker);
        }
        return CoreModule.f18264c.f20381e0.m116616t9(quickChatCardInfo.userID);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m96433q0(Act act, QuickChatCardInfo quickChatCardInfo, boolean z, boolean z2, String str) {
        m96434r0(act, quickChatCardInfo, z, z2, str, null);
    }

    /* JADX INFO: renamed from: r0 */
    public static void m96434r0(final Act act, final QuickChatCardInfo quickChatCardInfo, final boolean z, final boolean z2, final String str, @Nullable final x20 x20Var) {
        act.duringCreated(new pcj() { // from class: l.s7d0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                QuickChatCardInfo quickChatCardInfo2 = quickChatCardInfo;
                return CoreModule.f18264c.f20300D0.m35850j4(quickChatCardInfo2.secretKey, z).filter(new qcj() { // from class: l.o7d0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return a8d0.m96428l0((Boolean) obj);
                    }
                }).switchMap(new qcj() { // from class: l.p7d0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreModule.f18264c.f20381e0.m116616t9(quickChatCardInfo2.userID);
                    }
                }).switchMap(new qcj() { // from class: l.q7d0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreModule.f18264c.f20384f0.m33905ap(quickChatCardInfo2.userID);
                    }
                });
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.t7d0
            @Override // p153l.y20
            public final void call(Object obj) {
                a8d0.m96431o0(x20Var, z2, act, quickChatCardInfo, str, (uxj0) obj);
            }
        }, new y20() { // from class: l.u7d0
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20297C0.m146425v4();
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static void m96435s0(final Act act, final QuickChatCardInfo quickChatCardInfo, final boolean z, final boolean z2, final String str, @Nullable final x20 x20Var) {
        act.duringCreated(new pcj() { // from class: l.v7d0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                QuickChatCardInfo quickChatCardInfo2 = quickChatCardInfo;
                return CoreModule.f18264c.f20300D0.m35848h4(quickChatCardInfo2.secretKey, z, quickChatCardInfo2.biz.toString(), quickChatCardInfo2.stage).filter(new qcj() { // from class: l.z7d0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.m82486a((QuickChatOneside) obj));
                    }
                }).switchMap(new qcj() { // from class: l.m7d0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return a8d0.m96432p0(quickChatCardInfo2, (QuickChatOneside) obj);
                    }
                }).switchMap(new qcj() { // from class: l.n7d0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreModule.f18264c.f20384f0.m33905ap(quickChatCardInfo2.userID);
                    }
                });
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.w7d0
            @Override // p153l.y20
            public final void call(Object obj) {
                a8d0.m96422f0(x20Var, z2, act, quickChatCardInfo, str, (uxj0) obj);
            }
        }, new y20() { // from class: l.x7d0
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20297C0.m146425v4();
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public static int m96436u0() {
        try {
            return RemoteConfig.m80481x().m80518y("quickchat_show_limit_female");
        } catch (Exception unused) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static a8d0 m96437x0() {
        if (f68911e == null) {
            synchronized (a8d0.class) {
                try {
                    if (f68911e == null) {
                        f68911e = new a8d0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f68911e;
    }

    /* JADX INFO: renamed from: B0 */
    public void m96438B0(NewMainAct newMainAct, final QuickChatCardWrapper quickChatCardWrapper) {
        CoreSuggested.UserInfo userInfo;
        if (quickChatCardWrapper.isPeiLiao() || !m96416A0() || !NullChecker.m82486a(quickChatCardWrapper.getBroadcastCard()) || quickChatCardWrapper.getBroadcastCard().isAudioBroadcast) {
            PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
            final VirtualCardType virtualCardType = VirtualCardType.OnlineMatchBroadcastCard;
            if (quickChatCardWrapper.isPeiLiao()) {
                virtualCardType = VirtualCardType.OnlineMatchBroadcastPeiLiaoCard;
            } else if (quickChatCardWrapper.cardType == 2 && NullChecker.m82486a(quickChatCardWrapper.getBroadcastCard()) && quickChatCardWrapper.getBroadcastCard().isAudioBroadcast) {
                virtualCardType = VirtualCardType.QuickAudioBroadcastCard;
            }
            if (!NullChecker.m82486a(partialListOptM222761e)) {
                userInfo = null;
            } else if (upm.m197125V(partialListOptM222761e) && !quickChatCardWrapper.isPeiLiao()) {
                return;
            } else {
                userInfo = (CoreSuggested.UserInfo) jyb.m147529r(partialListOptM222761e.loaded, new qcj() { // from class: l.y7d0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        CoreSuggested.UserInfo userInfo2 = (CoreSuggested.UserInfo) obj;
                        return Boolean.valueOf(userInfo2.virtualCardType == virtualCardType && userInfo2.quickChatCardWrapper.cardType == quickChatCardWrapper.cardType);
                    }
                });
            }
            if (userInfo == null) {
                if (!quickChatCardWrapper.isPeiLiao()) {
                    m96417E0();
                }
                int i = quickChatCardWrapper.cardType;
                if (i == 1) {
                    this.f68912b = quickChatCardWrapper;
                } else if (i == 2) {
                    this.f68913c = quickChatCardWrapper;
                    OnlineMatchManager.m51326z().m51375w();
                }
                CoreSuggested.UserInfo userInfo2 = new CoreSuggested.UserInfo();
                userInfo2.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                userInfo2.extraInfo = quickChatCardWrapper.userId;
                userInfo2.virtualCardType = virtualCardType;
                userInfo2.quickChatCardWrapper = quickChatCardWrapper;
                if (quickChatCardWrapper.isPeiLiao()) {
                    CoreModule.f18264c.f20405m0.m32009H8(jyb.m147507f0(quickChatCardWrapper.userId));
                } else {
                    CoreModule.f18264c.f20405m0.m32009H8(jyb.m147507f0(quickChatCardWrapper.userId));
                }
                if (newMainAct.m40816g6() || (m96447z0(partialListOptM222761e) && quickChatCardWrapper.cardType == 1)) {
                    t4j.m189282h("insertQuick card real to 1 " + quickChatCardWrapper.cardType);
                    CoreModule.f18264c.f20405m0.m32157w6(userInfo2, 1);
                } else {
                    userInfo2.preSwipedDirection = SwipeDirection.LEFT;
                    t4j.m189282h("insertQuick card real to 0 " + quickChatCardWrapper.cardType);
                    CoreModule.f18264c.f20405m0.m32157w6(userInfo2, 0);
                }
                if (quickChatCardWrapper.isPeiLiao()) {
                    quickChatCardWrapper.markAsConsumed();
                    return;
                }
                m96442H0(quickChatCardWrapper);
                m96441G0(quickChatCardWrapper);
                newMainAct.m40811d7();
                l51.m152888H(CoreModule.f18263b, quickChatCardWrapper.consumeRunnable(), Constants.INBOX_V2_THROTTLE_WINDOW_MS);
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m96439C0(QuickChatCardWrapper quickChatCardWrapper) {
        return NullChecker.m82486a(quickChatCardWrapper) && NullChecker.m82486a(quickChatCardWrapper.getBroadcastCard()) && quickChatCardWrapper.getBroadcastCard().isMaleQuickChatRing;
    }

    /* JADX INFO: renamed from: D0 */
    public void m96440D0(final NewMainAct newMainAct) {
        kcg0 kcg0Var = this.f68914d;
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            this.f68914d = newMainAct.duringCreated(CoreModule.f18264c.f20300D0.m35828A4()).subscribe(psd0.m173597H(new y20() { // from class: l.l7d0
                @Override // p153l.y20
                public final void call(Object obj) {
                    a8d0.m96430n0(newMainAct, (QuickChatCardInfo) obj);
                }
            }, new y20() { // from class: l.r7d0
                @Override // p153l.y20
                public final void call(Object obj) {
                    a8d0.m96425i0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m96441G0(QuickChatCardWrapper quickChatCardWrapper) {
        if (quickChatCardWrapper.cardType == 2 && quickChatCardWrapper.getBroadcastCard().isBell) {
            CoreModule.f18264c.f20300D0.m35841N4(quickChatCardWrapper.getBroadcastCard().tracker);
        } else if (quickChatCardWrapper.cardType == 2 && quickChatCardWrapper.getBroadcastCard().isSpeedMatch) {
            CoreModule.f18264c.f20300D0.m35841N4(quickChatCardWrapper.getBroadcastCard().tracker);
        } else {
            CoreModule.f18264c.f20300D0.m35843P4("", quickChatCardWrapper.userId);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m96442H0(QuickChatCardWrapper quickChatCardWrapper) {
        HashMap map = new HashMap();
        map.put("other_user_id", quickChatCardWrapper.userId);
        map.put("quickchat_card_type", quickChatCardWrapper.cardType == 1 ? "fixed" : "radio");
        map.put("quickchat_which_number", CoreModule.f18264c.f20381e0.f89095P0.get());
        if (quickChatCardWrapper.cardType == 2) {
            map.put("radio_type", quickChatCardWrapper.getBroadcastCard().radioType);
            map.put("is_quickchatbell", Boolean.valueOf(quickChatCardWrapper.getBroadcastCard().isBell));
        }
        map.put("user_action", m96446y0(quickChatCardWrapper));
        map.put("which_content", m96444v0(quickChatCardWrapper));
        map.put("quickchat_male_ring", Integer.valueOf(m96439C0(quickChatCardWrapper) ? 1 : 0));
        i4g0.m138527y("e_card_quickchat", "p_suggest_users_home_view", map);
    }

    /* JADX INFO: renamed from: t0 */
    public void m96443t0(String str) {
        if (NullChecker.m82486a(this.f68912b) && str.equals(this.f68912b.userId)) {
            this.f68912b.consume();
        } else if (NullChecker.m82486a(this.f68913c) && str.equals(this.f68913c.userId)) {
            this.f68913c.consume();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final String m96444v0(QuickChatCardWrapper quickChatCardWrapper) {
        if (!NullChecker.m82486a(quickChatCardWrapper.getUser())) {
            return "nothing";
        }
        if (TextUtils.isEmpty(quickChatCardWrapper.getUser().description)) {
            return !jyb.m147479J(quickChatCardWrapper.getUser().profile.tags) ? com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL : "nothing";
        }
        return "sign";
    }

    /* JADX INFO: renamed from: w0 */
    public QuickChatCardWrapper m96445w0(int i) {
        if (i == 1 && NullChecker.m82486a(this.f68912b) && !this.f68912b.isConsumed()) {
            return this.f68912b;
        }
        if (i == 2 && NullChecker.m82486a(this.f68913c) && !this.f68913c.isConsumed()) {
            return this.f68913c;
        }
        return null;
    }

    /* JADX INFO: renamed from: y0 */
    public final String m96446y0(QuickChatCardWrapper quickChatCardWrapper) {
        if (TEnum.equals(quickChatCardWrapper.rsStateReceiverToSender, "superliked")) {
            return "superlike";
        }
        return TEnum.equals(quickChatCardWrapper.rsStateReceiverToSender, "liked") ? "like" : "normal";
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m96447z0(PartialListOpt<CoreSuggested.UserInfo> partialListOpt) {
        return partialListOpt != null && partialListOpt.loaded.size() > 0 && partialListOpt.loaded.get(0).isPassiveQuickChat();
    }
}
