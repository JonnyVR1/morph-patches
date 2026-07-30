package p002l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p000p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p000p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.common.utils.ThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.cmn0;
import l.d30;
import l.e30;
import l.ffw;
import l.j760;
import l.jo0;
import l.lsi0;
import l.r610;
import l.s410;
import l.soj0;
import l.vpv;
import l.vud0;
import l.vwb;
import l.w8u;
import l.w9j;
import l.x4s;
import l.xaj0;
import l.ypv;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rh2<T extends ho2> extends h4t<T, ChatListView> {

    /* JADX INFO: renamed from: i */
    public List<LiveMessage> f18517i;

    /* JADX INFO: renamed from: j */
    public List<LiveMessage> f18518j;

    /* JADX INFO: renamed from: k */
    public j760<Long, LiveMessage> f18519k;

    /* JADX INFO: renamed from: l */
    public j760<Long, LiveMessage> f18520l;

    /* JADX INFO: renamed from: m */
    public sh2 f18521m;

    /* JADX INFO: renamed from: n */
    public List<LiveMessage> f18522n;

    /* JADX WARN: Type inference failed for: r3v2, types: [l.ho2] */
    public rh2(bsm<T> bsmVar, ChatListView chatListView) {
        super(bsmVar);
        this.f18517i = new ArrayList();
        this.f18518j = new ArrayList();
        this.f18522n = new ArrayList();
        C(chatListView);
        z2(new c7k0(bsmVar, ((ChatListView) ((bwr) this).viewModel).f4954e));
        if (m25547E2().mo14489A0().equals("live")) {
            z2(new jui0(bsmVar, ((ChatListView) ((bwr) this).viewModel).f4950a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ho2] */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m21938C4(Long l2) {
        boolean z;
        if (mo10954s4()) {
            List<LiveMessage> listM20685b = m25547E2().m14544Y().m20685b();
            boolean z2 = true;
            if (vwb.J(listM20685b)) {
                z = false;
            } else {
                vwb.z(listM20685b, new e30() { // from class: l.qh2
                    public final void call(Object obj) {
                        this.f17988a.m21981l4((LiveMessage) obj);
                    }
                });
                z = true;
            }
            if (this.f18518j.isEmpty()) {
                z2 = z;
            } else {
                vwb.z(this.f18518j, new e30() { // from class: l.qh2
                    public final void call(Object obj) {
                        this.f17988a.m21981l4((LiveMessage) obj);
                    }
                });
                this.f18518j.clear();
            }
            if (z2) {
                mo21964I4();
                ((ChatListView) ((bwr) this).viewModel).setNewData(this.f18517i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m21939E4(soj0 soj0Var) {
        ((ChatListView) ((bwr) this).viewModel).m6186E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m21940F4(soj0 soj0Var) {
        ((ChatListView) ((bwr) this).viewModel).m6191J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m21941G4(Boolean bool) {
        ((ChatListView) ((bwr) this).viewModel).getLiveDragonListViewHelper().m19276f(bool.booleanValue());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ Boolean m21944L3(cmn0 cmn0Var, LiveMessage liveMessage) {
        LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
        return Boolean.valueOf(extInfo != null && TextUtils.equals(extInfo.applyCallId, cmn0Var.f()));
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m21946N3(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.w(R$string.f2642C);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m21955X3(Throwable th) {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ c m21960A4(String str, User user) {
        vpv vpvVar = ypv.a;
        return duringCreated(vpvVar.d(vpvVar.D0(), user, true, mo10953q4(), m25547E2().m17235k(), m25547E2().m17239o(), mo21430R2(), str));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m21961B4(z2s z2sVar, boolean z, LiveMessage liveMessage, Followship followship) {
        z2sVar.mo25700h(false);
        if (z || TextUtils.equals(liveMessage.extInfo.followUserId, m25547E2().m14576j0())) {
            m25547E2().m14532U(followship);
        }
        ((ChatListView) ((bwr) this).viewModel).m6194M(liveMessage);
        lsi0.w(R$string.f2845L4);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m21962D4(Followship followship) {
        if (!TEnum.equals(followship.state, "following") && !TEnum.equals(followship.state, "matched")) {
            m21979j4("fansClub", null);
        } else {
            m21979j4("follow", null);
            m21979j4("voiceFollow", null);
        }
    }

    /* JADX INFO: renamed from: J4 */
    public void mo21965J4(LiveMessage liveMessage) {
        j25.m15564i(liveMessage, mo21430R2());
    }

    /* JADX INFO: renamed from: K4 */
    public void mo17682K4(z2s z2sVar, View view, String str, LiveMessage liveMessage) {
        LiveMessage.ExtInfo extInfo;
        LiveMessage.ExtInfo extInfo2;
        str.getClass();
        switch (str) {
            case "shootGame":
                m21970P4(cuk.m11379b(z2sVar.m27045b()));
                j25.m15561f(mo21430R2());
                break;
            case "followUser":
                if (liveMessage != null && (extInfo = liveMessage.extInfo) != null && extInfo.followUserId != null) {
                    m21983n4(liveMessage, z2sVar, false);
                    break;
                }
                break;
            case "surpriseGiftBox":
                m21985r4(liveMessage.extInfo.scheme);
                break;
            case "follow":
                mo21982m4();
                break;
            case "jumpToSendMessage":
                ypv.a.c0();
                act().startActivity(ypv.a.z0(act(), liveMessage.extInfo.toUserId, false, false));
                break;
            case "jumpToMagicFinger":
                m25548F2().BottomEvent.showDialog().j(BLiveButtonType.get("magicGesture"));
                break;
            case "multiCallApprove":
                m21972c4(liveMessage, liveMessage.extInfo.applyCallId, z2sVar);
                break;
            case "callApply":
                m25548F2().CallEvent.anchorCallAudience().p();
                break;
            case "jumpToFansbasePanel":
                m25548F2().FansGroupEvent.showFansGroupPanel().j(Boolean.FALSE);
                break;
            case "jumpToVote":
                m25548F2().LiveBridgeImplEvent.showVoteResultDialog().j(liveMessage.extInfo.voteRecordId);
                z2sVar.mo25700h(false);
                ((ChatListView) ((bwr) this).viewModel).m6194M(liveMessage);
                break;
            case "schemaJump":
                m21985r4(liveMessage.h5Url);
                String str2 = liveMessage.traceJson;
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    m21968N4(liveMessage.traceJson);
                    break;
                }
                break;
            case "jumpTopRoom":
                if (liveMessage != null && (extInfo2 = liveMessage.extInfo) != null) {
                    m21987u4(extInfo2.roomId, extInfo2.liveId, "jumpTopRoom");
                    break;
                }
                break;
            case "gift":
                m21966L4();
                break;
            case "createChatGroup":
                m25548F2().LiveVoiceChatGroupEvent.openCreateGroupDialog().j(Boolean.TRUE);
                break;
            case "jumpToSetting":
                m25548F2().BottomEvent.openSettingDialog().p();
                break;
            case "approveChatGroupApply":
                m25548F2().LiveVoiceChatGroupEvent.approveChatGroupApply().j(liveMessage.extInfo);
                break;
            case "multiCallApply":
                m21975f4(liveMessage, z2sVar);
                break;
            case "joinLotteryGiftRedPacket":
                m21985r4(liveMessage.extInfo.scheme);
                j25.m15560e(mo21430R2());
                break;
        }
    }

    /* JADX INFO: renamed from: L4 */
    public void m21966L4() {
        m25548F2().GiftDialogEventGroup.openGiftDialogEvent().j(new fp50().m13445i(100));
    }

    /* JADX INFO: renamed from: N4 */
    public final void m21968N4(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("pid");
            String strOptString2 = jSONObject.optString("eid");
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.equals(next, "pid") && !TextUtils.equals(next, "eid")) {
                    map.put(next, jSONObject.optString(next));
                }
            }
            zvf0.s(strOptString2, strOptString, map);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: P4 */
    public void m21970P4(jp50 jp50Var) {
        m25548F2().OpenH5Event.open().j(jp50Var);
    }

    /* JADX INFO: renamed from: Q4 */
    public void m21971Q4(LiveUserInfo liveUserInfo, long j, boolean z) {
        k25.m16474j(this, liveUserInfo, j, z);
    }

    /* JADX INFO: renamed from: c4 */
    public void m21972c4(final LiveMessage liveMessage, String str, final z2s z2sVar) {
        duringCreated(LivingNormalApiProvider.m4603H3(str, s410.w)).doOnNext(new e30() { // from class: l.dh2
            public final void call(Object obj) {
                this.f9258a.m21989w4(z2sVar, liveMessage, (BLiveMultiCall) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.eh2
            public final void call(Object obj) {
                this.f9773a.m21988v4((BLiveMultiCall) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: d4 */
    public void m21973d4(LiveMessage liveMessage) {
        if (NullChecker.a(liveMessage)) {
            this.f18518j.add(liveMessage);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m21974e4(LiveMessage liveMessage) {
        if (liveMessage != null) {
            this.f18518j.add(liveMessage);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m21975f4(LiveMessage liveMessage, z2s z2sVar) {
        if (r610.B(this) != null) {
            lsi0.y(w8u.t(R$string.f2911O7));
            return;
        }
        m25548F2().MultiCallEvent.openApplyDlg().j(2);
        z2sVar.mo25700h(false);
        ((ChatListView) ((bwr) this).viewModel).m6194M(liveMessage);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: g4 */
    public final boolean m21976g4(cmn0 cmn0Var) {
        BLiveAbsData bLiveAbsDataM14588n0 = m25547E2().m14588n0();
        return bLiveAbsDataM14588n0 != null && cmn0Var.a(x4s.b(bLiveAbsDataM14588n0.liveMode));
    }

    /* JADX INFO: renamed from: h4 */
    public void m21977h4(final cmn0 cmn0Var) {
        if (m21976g4(cmn0Var)) {
            m21979j4("voiceCallApply", new w9j() { // from class: l.hh2
                public final Object call(Object obj) {
                    return rh2.m21944L3(cmn0Var, (LiveMessage) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public final void m21992z4(final String str, final w9j<LiveMessage, Boolean> w9jVar) {
        er40.m12681h(str);
        this.f18522n.clear();
        vwb.z(this.f18517i, new e30() { // from class: l.yg2
            public final void call(Object obj) {
                this.f22852a.m21990x4(str, w9jVar, (LiveMessage) obj);
            }
        });
        if (!this.f18522n.isEmpty()) {
            vwb.z(this.f18522n, new e30() { // from class: l.zg2
                public final void call(Object obj) {
                    this.f23391a.m21991y4((LiveMessage) obj);
                }
            });
        }
        ((ChatListView) ((bwr) this).viewModel).m6192K(this.f18517i, true);
    }

    /* JADX INFO: renamed from: j4 */
    public void m21979j4(final String str, final w9j<LiveMessage, Boolean> w9jVar) {
        ThreadUtil.i(new Runnable() { // from class: l.ph2
            @Override // java.lang.Runnable
            public final void run() {
                this.f17339a.m21992z4(str, w9jVar);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public final List<LiveMessage> m21981l4(LiveMessage liveMessage) {
        this.f18517i = m21984o4().mo18825b(new xaj0<>(liveMessage, this.f18517i, ((ChatListView) ((bwr) this).viewModel).getChatRecyclerViewVisiblePosition()));
        mo21965J4(liveMessage);
        return this.f18517i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: m4 */
    public void mo21982m4() {
        m25547E2().m14561e0(false, mo21430R2(), "liveMessage", new d30() { // from class: l.fh2
            public final void call() {
                lsi0.w(R$string.f2845L4);
            }
        });
        k25.m16475k(this);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        ((ChatListView) ((bwr) this).viewModel).m6209y();
        this.f18517i.clear();
        this.f18518j.clear();
        this.f18519k = null;
        this.f18520l = null;
        this.f18522n.clear();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: n4 */
    public void m21983n4(final LiveMessage liveMessage, final z2s z2sVar, final boolean z) {
        final String str = z ? "audio_message" : "liveMessage";
        if (z) {
            k25.m16477m(this, liveMessage);
        } else {
            k25.m16476l(this, liveMessage);
        }
        duringCreated(LivingNormalApiProvider.m4940s7(liveMessage.extInfo.followUserId, m25547E2().m17235k())).flatMap(new w9j() { // from class: l.ah2
            public final Object call(Object obj) {
                return this.f7607a.m21960A4(str, (User) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.bh2
            public final void call(Object obj) {
                this.f8126a.m21961B4(z2sVar, z, liveMessage, (Followship) obj);
            }
        }, new e30() { // from class: l.ch2
            public final void call(Object obj) {
                rh2.m21946N3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX INFO: renamed from: o4 */
    public sh2 m21984o4() {
        if (this.f18521m == null) {
            this.f18521m = (sh2) wq4.m25288a(vwb.f0(new wq4[]{new j1f(), new q90(m25552L2(), m25547E2().mo14499F0() == 2), new tkc0(), new i2c(), new uwe0(), new k0f()}));
        }
        return this.f18521m;
    }

    /* JADX INFO: renamed from: p4 */
    public String mo10952p4() {
        return k25.f14172a;
    }

    /* JADX INFO: renamed from: q4 */
    public String mo10953q4() {
        return "liveRoom";
    }

    /* JADX INFO: renamed from: r4 */
    public void m21985r4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(100).m25610e(str).m25608c());
    }

    /* JADX INFO: renamed from: s4 */
    public boolean mo10954s4() {
        return true;
    }

    /* JADX INFO: renamed from: t */
    public void mo10955t() {
        super.t();
        ((ChatListView) ((bwr) this).viewModel).m6206r();
        init();
        m14186H3(m25547E2().m14571h2(1, TimeUnit.SECONDS)).subscribe(ffw.e(new e30() { // from class: l.xg2
            public final void call(Object obj) {
                this.f22265a.m21938C4((Long) obj);
            }
        }, new e30() { // from class: l.ih2
            public final void call(Object obj) {
                rh2.m21955X3((Throwable) obj);
            }
        }));
        duringCreated(m25547E2().m14601t0()).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.jh2
            public final void call(Object obj) {
                this.f13771a.m21962D4((Followship) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.refreshChatList().g()).subscribe(ffw.d(new e30() { // from class: l.kh2
            public final void call(Object obj) {
                this.f14326a.m21939E4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.scrollToEnd().g()).subscribe(ffw.d(new e30() { // from class: l.lh2
            public final void call(Object obj) {
                this.f14864a.m21940F4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.addNotificationItem().g()).subscribe(ffw.d(new e30() { // from class: l.mh2
            public final void call(Object obj) {
                this.f15384a.m21974e4((LiveMessage) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.addDragonInfoMsg().g()).subscribe(ffw.d(new e30() { // from class: l.nh2
            public final void call(Object obj) {
                this.f16032a.m21973d4((LiveMessage) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.openDragonPushMsg().g()).subscribe(ffw.d(new e30() { // from class: l.oh2
            public final void call(Object obj) {
                this.f16597a.m21941G4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public boolean mo21986t4() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l.ho2] */
    /* JADX INFO: renamed from: u4 */
    public void m21987u4(String str, String str2, String str3) {
        if (m25552L2()) {
            lsi0.y(ypv.e.getString(R$string.f2841L0));
        } else {
            m25548F2().JumpRoomEvent.jumpRoom().j(new JumpRoomData.C0350a().m6554t(m25547E2().mo14591o0()).m6552r(m25547E2().m17235k()).m6553s(m25547E2().m17234j().room.id).m6551q(m25547E2().m14582l0().name).m6556v(str2).m6557w(str).m6555u(str3).m6548n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m6547m());
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m21988v4(BLiveMultiCall bLiveMultiCall) {
        m25548F2().MultiCallEvent.addWatchList().j(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m21989w4(z2s z2sVar, LiveMessage liveMessage, BLiveMultiCall bLiveMultiCall) {
        z2sVar.mo25700h(false);
        ((ChatListView) ((bwr) this).viewModel).m6194M(liveMessage);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m21990x4(final String str, w9j w9jVar, LiveMessage liveMessage) {
        if (str.equals("follow") && er40.m12679f(liveMessage)) {
            this.f18522n.add(liveMessage);
            return;
        }
        if (str.equals("fansClub") && er40.m12678e(liveMessage)) {
            this.f18522n.add(liveMessage);
            return;
        }
        if ((w9jVar == null || ((Boolean) w9jVar.call(liveMessage)).booleanValue()) && !vwb.J(liveMessage.spanList)) {
            SpannableStringBuilder spannableStringBuilder = liveMessage.spanList.get(0);
            ped0 ped0Var = (ped0) vwb.s((ped0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ped0.class), new w9j() { // from class: l.gh2
                public final Object call(Object obj) {
                    return Boolean.valueOf(((ped0) obj).m20191a().equals(str));
                }
            });
            if (ped0Var != null) {
                ped0Var.setVisible(false);
                ((ChatListView) ((bwr) this).viewModel).m6194M(liveMessage);
            }
            mo21980k4(str, liveMessage);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m21991y4(LiveMessage liveMessage) {
        this.f18517i.remove(liveMessage);
    }

    /* JADX INFO: renamed from: I4 */
    public void mo21964I4() {
    }

    /* JADX INFO: renamed from: M4 */
    public void m21967M4() {
    }

    public void init() {
    }

    /* JADX INFO: renamed from: O4 */
    public void mo21969O4(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: H4 */
    public void mo21963H4(IChatItemLongClickArea iChatItemLongClickArea, LiveMessage liveMessage) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo21980k4(String str, LiveMessage liveMessage) {
    }
}
