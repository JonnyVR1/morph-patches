package p153l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p051p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p051p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.common.utils.ThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p135ec.Tnaf;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class yh2<T extends oo2> extends i6t<T, ChatListView> {

    /* JADX INFO: renamed from: i */
    public List<LiveMessage> f199895i;

    /* JADX INFO: renamed from: j */
    public List<LiveMessage> f199896j;

    /* JADX INFO: renamed from: k */
    public pf60<Long, LiveMessage> f199897k;

    /* JADX INFO: renamed from: l */
    public pf60<Long, LiveMessage> f199898l;

    /* JADX INFO: renamed from: m */
    public zh2 f199899m;

    /* JADX INFO: renamed from: n */
    public List<LiveMessage> f199900n;

    /* JADX WARN: Type inference failed for: r3v2, types: [l.oo2] */
    public yh2(dum<T> dumVar, ChatListView chatListView) {
        super(dumVar);
        this.f199895i = new ArrayList();
        this.f199896j = new ArrayList();
        this.f199900n = new ArrayList();
        mo52715C(chatListView);
        m153103z2(new igk0(dumVar, ((ChatListView) this.viewModel).f49760e));
        if (m213810E2().mo118362A0().equals("live")) {
            m153103z2(new n3j0(dumVar, ((ChatListView) this.viewModel).f49756a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.oo2] */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m215888C4(Long l2) {
        boolean z;
        if (mo130935s4()) {
            List<LiveMessage> listM113045b = m213810E2().m168494Y().m113045b();
            boolean z2 = true;
            if (jyb.m147479J(listM113045b)) {
                z = false;
            } else {
                jyb.m147537z(listM113045b, new y20() { // from class: l.xh2
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f194264a.m215926l4((LiveMessage) obj);
                    }
                });
                z = true;
            }
            if (this.f199896j.isEmpty()) {
                z2 = z;
            } else {
                jyb.m147537z(this.f199896j, new y20() { // from class: l.xh2
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f194264a.m215926l4((LiveMessage) obj);
                    }
                });
                this.f199896j.clear();
            }
            if (z2) {
                mo112200I4();
                ((ChatListView) this.viewModel).setNewData(this.f199895i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m215889E4(vxj0 vxj0Var) {
        ((ChatListView) this.viewModel).m73866E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m215890F4(vxj0 vxj0Var) {
        ((ChatListView) this.viewModel).m73871J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m215891G4(Boolean bool) {
        ((ChatListView) this.viewModel).getLiveDragonListViewHelper().m171376f(bool.booleanValue());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ Boolean m215894L3(gvn0 gvn0Var, LiveMessage liveMessage) {
        LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
        return Boolean.valueOf(extInfo != null && TextUtils.equals(extInfo.applyCallId, gvn0Var.m132565f()));
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m215896N3(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            o1j0.m165649w(R$string.f47448C);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m215905X3(Throwable th) {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ C22421c m215910A4(String str, User user) {
        wrv wrvVar = zrv.f205799a;
        return duringCreated((C22421c<T>) wrvVar.m207662d(wrvVar.m207631D0(), user, true, mo130934q4(), m213810E2().m202191k(), m213810E2().m202194o(), mo78457R2(), str));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2] */
    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m215911B4(a5s a5sVar, boolean z, LiveMessage liveMessage, Followship followship) {
        a5sVar.mo96250h(false);
        if (z || TextUtils.equals(liveMessage.extInfo.followUserId, m213810E2().m168526j0())) {
            m213810E2().m168482U(followship);
        }
        ((ChatListView) this.viewModel).m73874M(liveMessage);
        o1j0.m165649w(R$string.f47651L4);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m215912D4(Followship followship) {
        if (!TEnum.equals(followship.state, FollowshipStatus.following) && !TEnum.equals(followship.state, "matched")) {
            m215925j4("fansClub", null);
        } else {
            m215925j4("follow", null);
            m215925j4("voiceFollow", null);
        }
    }

    /* JADX INFO: renamed from: J4 */
    public void mo112201J4(LiveMessage liveMessage) {
        i35.m138273i(liveMessage, mo78457R2());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: K4 */
    public void mo103883K4(a5s a5sVar, View view, String str, LiveMessage liveMessage) {
        LiveMessage.ExtInfo extInfo;
        LiveMessage.ExtInfo extInfo2;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2114315087:
                if (str.equals("shootGame")) {
                    b = 0;
                }
                break;
            case -2027005156:
                if (str.equals("followUser")) {
                    b = 1;
                }
                break;
            case -1486547118:
                if (str.equals("surpriseGiftBox")) {
                    b = 2;
                }
                break;
            case -1268958287:
                if (str.equals("follow")) {
                    b = 3;
                }
                break;
            case -1223031722:
                if (str.equals("jumpToSendMessage")) {
                    b = 4;
                }
                break;
            case -1200445331:
                if (str.equals("jumpToMagicFinger")) {
                    b = 5;
                }
                break;
            case -1129324522:
                if (str.equals("multiCallApprove")) {
                    b = 6;
                }
                break;
            case -1073880144:
                if (str.equals(BLiveButtonType.callApply)) {
                    b = 7;
                }
                break;
            case -557027030:
                if (str.equals("jumpToFansbasePanel")) {
                    b = 8;
                }
                break;
            case -555375149:
                if (str.equals("jumpToVote")) {
                    b = 9;
                }
                break;
            case -448862865:
                if (str.equals("schemaJump")) {
                    b = 10;
                }
                break;
            case -13617214:
                if (str.equals("jumpTopRoom")) {
                    b = 11;
                }
                break;
            case 3172656:
                if (str.equals("gift")) {
                    b = 12;
                }
                break;
            case 132752491:
                if (str.equals("createChatGroup")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 379676359:
                if (str.equals("jumpToSetting")) {
                    b = 14;
                }
                break;
            case 747272788:
                if (str.equals("approveChatGroupApply")) {
                    b = 15;
                }
                break;
            case 1299381879:
                if (str.equals("multiCallApply")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 1931713706:
                if (str.equals("joinLotteryGiftRedPacket")) {
                    b = 17;
                }
                break;
        }
        switch (b) {
            case 0:
                m215916P4(swk.m188326b(a5sVar.m96244b()));
                i35.m138270f(mo78457R2());
                break;
            case 1:
                if (liveMessage != null && (extInfo = liveMessage.extInfo) != null && extInfo.followUserId != null) {
                    m215927n4(liveMessage, a5sVar, false);
                    break;
                }
                break;
            case 2:
                m215929r4(liveMessage.extInfo.scheme);
                break;
            case 3:
                mo103885m4();
                break;
            case 4:
                zrv.f205799a.m207661c0();
                act().startActivity(zrv.f205799a.m207707z0(act(), liveMessage.extInfo.toUserId, false, false));
                break;
            case 5:
                m213811F2().BottomEvent.showDialog().mo199273j(BLiveButtonType.get(BLiveButtonType.magicGesture));
                break;
            case 6:
                m215918c4(liveMessage, liveMessage.extInfo.applyCallId, a5sVar);
                break;
            case 7:
                m213811F2().CallEvent.anchorCallAudience().m199277p();
                break;
            case 8:
                m213811F2().FansGroupEvent.showFansGroupPanel().mo199273j(Boolean.FALSE);
                break;
            case 9:
                m213811F2().LiveBridgeImplEvent.showVoteResultDialog().mo199273j(liveMessage.extInfo.voteRecordId);
                a5sVar.mo96250h(false);
                ((ChatListView) this.viewModel).m73874M(liveMessage);
                break;
            case 10:
                m215929r4(liveMessage.h5Url);
                String str2 = liveMessage.traceJson;
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    m215915N4(liveMessage.traceJson);
                    break;
                }
                break;
            case 11:
                if (liveMessage != null && (extInfo2 = liveMessage.extInfo) != null) {
                    m215930u4(extInfo2.roomId, extInfo2.liveId, "jumpTopRoom");
                    break;
                }
                break;
            case 12:
                m215913L4();
                break;
            case 13:
                m213811F2().LiveVoiceChatGroupEvent.openCreateGroupDialog().mo199273j(Boolean.TRUE);
                break;
            case 14:
                m213811F2().BottomEvent.openSettingDialog().m199277p();
                break;
            case 15:
                m213811F2().LiveVoiceChatGroupEvent.approveChatGroupApply().mo199273j(liveMessage.extInfo);
                break;
            case 16:
                m215921f4(liveMessage, a5sVar);
                break;
            case 17:
                m215929r4(liveMessage.extInfo.scheme);
                i35.m138269e(mo78457R2());
                break;
        }
    }

    /* JADX INFO: renamed from: L4 */
    public void m215913L4() {
        m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156159i(100));
    }

    /* JADX INFO: renamed from: N4 */
    public final void m215915N4(String str) {
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
            i4g0.m138521s(strOptString2, strOptString, map);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: P4 */
    public void m215916P4(px50 px50Var) {
        m213811F2().OpenH5Event.open().mo199273j(px50Var);
    }

    /* JADX INFO: renamed from: Q4 */
    public void m215917Q4(LiveUserInfo liveUserInfo, long j, boolean z) {
        j35.m143325j(this, liveUserInfo, j, z);
    }

    /* JADX INFO: renamed from: c4 */
    public void m215918c4(final LiveMessage liveMessage, String str, final a5s a5sVar) {
        duringCreated((C22421c<T>) LivingNormalApiProvider.m72420H3(str, cd10.f81095w)).doOnNext(new y20() { // from class: l.kh2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126684a.m215932w4(a5sVar, liveMessage, (BLiveMultiCall) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.lh2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132064a.m215931v4((BLiveMultiCall) obj);
            }
        }, new z2e0()));
    }

    /* JADX INFO: renamed from: d4 */
    public void m215919d4(LiveMessage liveMessage) {
        if (NullChecker.m82486a(liveMessage)) {
            this.f199896j.add(liveMessage);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m215920e4(LiveMessage liveMessage) {
        if (liveMessage != null) {
            this.f199896j.add(liveMessage);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m215921f4(LiveMessage liveMessage, a5s a5sVar) {
        if (bf10.m103796B(this) != null) {
            o1j0.m165651y(xau.m209910t(R$string.f47717O7));
            return;
        }
        m213811F2().MultiCallEvent.openApplyDlg().mo199273j(2);
        a5sVar.mo96250h(false);
        ((ChatListView) this.viewModel).m73874M(liveMessage);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: g4 */
    public final boolean m215922g4(gvn0 gvn0Var) {
        BLiveAbsData bLiveAbsDataM168538n0 = m213810E2().m168538n0();
        return bLiveAbsDataM168538n0 != null && gvn0Var.m132560a(y6s.m214494b(bLiveAbsDataM168538n0.liveMode));
    }

    /* JADX INFO: renamed from: h4 */
    public void m215923h4(final gvn0 gvn0Var) {
        if (m215922g4(gvn0Var)) {
            m215925j4("voiceCallApply", new qcj() { // from class: l.oh2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return yh2.m215894L3(gvn0Var, (LiveMessage) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public final void m215935z4(final String str, final qcj<LiveMessage, Boolean> qcjVar) {
        tz40.m193649h(str);
        this.f199900n.clear();
        jyb.m147537z(this.f199895i, new y20() { // from class: l.fh2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99003a.m215933x4(str, qcjVar, (LiveMessage) obj);
            }
        });
        if (!this.f199900n.isEmpty()) {
            jyb.m147537z(this.f199900n, new y20() { // from class: l.gh2
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f104063a.m215934y4((LiveMessage) obj);
                }
            });
        }
        ((ChatListView) this.viewModel).m73872K(this.f199895i, true);
    }

    /* JADX INFO: renamed from: j4 */
    public void m215925j4(final String str, final qcj<LiveMessage, Boolean> qcjVar) {
        ThreadUtil.m82497i(new Runnable() { // from class: l.wh2
            @Override // java.lang.Runnable
            public final void run() {
                this.f189079a.m215935z4(str, qcjVar);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public final List<LiveMessage> m215926l4(LiveMessage liveMessage) {
        this.f199895i = mo215928o4().mo168854b(new bkj0<>(liveMessage, this.f199895i, ((ChatListView) this.viewModel).getChatRecyclerViewVisiblePosition()));
        mo112201J4(liveMessage);
        return this.f199895i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: m4 */
    public void mo103885m4() {
        m213810E2().m168511e0(false, mo78457R2(), "liveMessage", new x20() { // from class: l.mh2
            @Override // p153l.x20
            public final void call() {
                o1j0.m165649w(R$string.f47651L4);
            }
        });
        j35.m143326k(this);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        ((ChatListView) this.viewModel).m73888y();
        this.f199895i.clear();
        this.f199896j.clear();
        this.f199897k = null;
        this.f199898l = null;
        this.f199900n.clear();
    }

    /* JADX INFO: renamed from: n4 */
    public void m215927n4(final LiveMessage liveMessage, final a5s a5sVar, final boolean z) {
        final String str = z ? "audio_message" : "liveMessage";
        if (z) {
            j35.m143328m(this, liveMessage);
        } else {
            j35.m143327l(this, liveMessage);
        }
        duringCreated((C22421c<T>) LivingNormalApiProvider.m72757s7(liveMessage.extInfo.followUserId, m213810E2().m202191k())).flatMap(new qcj() { // from class: l.hh2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f109471a.m215910A4(str, (User) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.ih2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114858a.m215911B4(a5sVar, z, liveMessage, (Followship) obj);
            }
        }, new y20() { // from class: l.jh2
            @Override // p153l.y20
            public final void call(Object obj) {
                yh2.m215896N3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2] */
    /* JADX INFO: renamed from: o4 */
    public zh2 mo215928o4() {
        if (this.f199899m == null) {
            this.f199899m = (zh2) vr4.m202472a(jyb.m147507f0(new o2f(), new m90(m213815L2(), m213810E2().mo146094F0() == 2), new atc0(), new v3c(), new b5f0(), new o1f()));
        }
        return this.f199899m;
    }

    /* JADX INFO: renamed from: p4 */
    public String mo130933p4() {
        return j35.f118151a;
    }

    /* JADX INFO: renamed from: q4 */
    public String mo130934q4() {
        return "liveRoom";
    }

    /* JADX INFO: renamed from: r4 */
    public void m215929r4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(100).m103154e(str).m103152c());
    }

    /* JADX INFO: renamed from: s4 */
    public boolean mo130935s4() {
        return true;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((ChatListView) this.viewModel).m73885r();
        init();
        m138858H3(m213810E2().m168521h2(1, TimeUnit.SECONDS)).subscribe(dhw.m115826e(new y20() { // from class: l.eh2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93998a.m215888C4((Long) obj);
            }
        }, new y20() { // from class: l.ph2
            @Override // p153l.y20
            public final void call(Object obj) {
                yh2.m215905X3((Throwable) obj);
            }
        }));
        duringCreated((C22421c<T>) m213810E2().m168549t0()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.qh2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157501a.m215912D4((Followship) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().ChatEvent.refreshChatList().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.rh2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163071a.m215889E4((vxj0) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().ChatEvent.scrollToEnd().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.sh2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168575a.m215890F4((vxj0) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().ChatEvent.addNotificationItem().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.th2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174224a.m215920e4((LiveMessage) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().ChatEvent.addDragonInfoMsg().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.uh2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178983a.m215919d4((LiveMessage) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().ChatEvent.openDragonPushMsg().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.vh2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184073a.m215891G4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public boolean mo112221t4() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l.oo2] */
    /* JADX INFO: renamed from: u4 */
    public void m215930u4(String str, String str2, String str3) {
        if (m213815L2()) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47647L0));
        } else {
            m213811F2().JumpRoomEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74214t(m213810E2().mo160117o0()).m74212r(m213810E2().m202191k()).m74213s(m213810E2().mo183435j().room.f45267id).m74211q(m213810E2().m168532l0().name).m74216v(str2).m74217w(str).m74215u(str3).m74208n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m74207m());
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m215931v4(BLiveMultiCall bLiveMultiCall) {
        m213811F2().MultiCallEvent.addWatchList().mo199273j(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m215932w4(a5s a5sVar, LiveMessage liveMessage, BLiveMultiCall bLiveMultiCall) {
        a5sVar.mo96250h(false);
        ((ChatListView) this.viewModel).m73874M(liveMessage);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m215933x4(final String str, qcj qcjVar, LiveMessage liveMessage) {
        if (str.equals("follow") && tz40.m193647f(liveMessage)) {
            this.f199900n.add(liveMessage);
            return;
        }
        if (str.equals("fansClub") && tz40.m193646e(liveMessage)) {
            this.f199900n.add(liveMessage);
            return;
        }
        if ((qcjVar == null || ((Boolean) qcjVar.call(liveMessage)).booleanValue()) && !jyb.m147479J(liveMessage.spanList)) {
            SpannableStringBuilder spannableStringBuilder = liveMessage.spanList.get(0);
            rmd0 rmd0Var = (rmd0) jyb.m147530s((rmd0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), rmd0.class), new qcj() { // from class: l.nh2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((rmd0) obj).m182061a().equals(str));
                }
            });
            if (rmd0Var != null) {
                rmd0Var.setVisible(false);
                ((ChatListView) this.viewModel).m73874M(liveMessage);
            }
            mo112211k4(str, liveMessage);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m215934y4(LiveMessage liveMessage) {
        this.f199895i.remove(liveMessage);
    }

    /* JADX INFO: renamed from: I4 */
    public void mo112200I4() {
    }

    /* JADX INFO: renamed from: M4 */
    public void mo215914M4() {
    }

    public void init() {
    }

    /* JADX INFO: renamed from: O4 */
    public void mo103884O4(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: H4 */
    public void mo112199H4(IChatItemLongClickArea iChatItemLongClickArea, LiveMessage liveMessage) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo112211k4(String str, LiveMessage liveMessage) {
    }
}
