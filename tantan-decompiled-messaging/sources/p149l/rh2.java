package p149l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p046p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
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
import org.spongycastle.math.p131ec.Tnaf;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class rh2<T extends ho2> extends h4t<T, ChatListView> {

    /* JADX INFO: renamed from: i */
    public List<LiveMessage> f159328i;

    /* JADX INFO: renamed from: j */
    public List<LiveMessage> f159329j;

    /* JADX INFO: renamed from: k */
    public j760<Long, LiveMessage> f159330k;

    /* JADX INFO: renamed from: l */
    public j760<Long, LiveMessage> f159331l;

    /* JADX INFO: renamed from: m */
    public sh2 f159332m;

    /* JADX INFO: renamed from: n */
    public List<LiveMessage> f159333n;

    /* JADX WARN: Type inference failed for: r3v2, types: [l.ho2] */
    public rh2(bsm<T> bsmVar, ChatListView chatListView) {
        super(bsmVar);
        this.f159328i = new ArrayList();
        this.f159329j = new ArrayList();
        this.f159333n = new ArrayList();
        mo51532C(chatListView);
        m144512z2(new c7k0(bsmVar, ((ChatListView) this.viewModel).f48912e));
        if (m206027E2().mo132054A0().equals("live")) {
            m144512z2(new jui0(bsmVar, ((ChatListView) this.viewModel).f48908a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ho2] */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m179273C4(Long l2) {
        boolean z;
        if (mo106341s4()) {
            List<LiveMessage> listM171440b = m206027E2().m132108Y().m171440b();
            boolean z2 = true;
            if (vwb.m200296J(listM171440b)) {
                z = false;
            } else {
                vwb.m200354z(listM171440b, new e30() { // from class: l.qh2
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f154422a.m179316l4((LiveMessage) obj);
                    }
                });
                z = true;
            }
            if (this.f159329j.isEmpty()) {
                z2 = z;
            } else {
                vwb.m200354z(this.f159329j, new e30() { // from class: l.qh2
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f154422a.m179316l4((LiveMessage) obj);
                    }
                });
                this.f159329j.clear();
            }
            if (z2) {
                mo179299I4();
                ((ChatListView) this.viewModel).setNewData(this.f159328i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m179274E4(soj0 soj0Var) {
        ((ChatListView) this.viewModel).m72683E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m179275F4(soj0 soj0Var) {
        ((ChatListView) this.viewModel).m72688J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m179276G4(Boolean bool) {
        ((ChatListView) this.viewModel).getLiveDragonListViewHelper().m163047f(bool.booleanValue());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ Boolean m179279L3(cmn0 cmn0Var, LiveMessage liveMessage) {
        LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
        return Boolean.valueOf(extInfo != null && TextUtils.equals(extInfo.applyCallId, cmn0Var.m107678f()));
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m179281N3(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.m151593w(R$string.f46600C);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m179290X3(Throwable th) {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ C22306c m179295A4(String str, User user) {
        vpv vpvVar = ypv.f199493a;
        return duringCreated((C22306c<T>) vpvVar.m199340d(vpvVar.m199309D0(), user, true, mo106340q4(), m206027E2().m149814k(), m206027E2().m149818o(), mo77274R2(), str));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m179296B4(z2s z2sVar, boolean z, LiveMessage liveMessage, Followship followship) {
        z2sVar.mo207186h(false);
        if (z || TextUtils.equals(liveMessage.extInfo.followUserId, m206027E2().m132140j0())) {
            m206027E2().m132096U(followship);
        }
        ((ChatListView) this.viewModel).m72691M(liveMessage);
        lsi0.m151593w(R$string.f46803L4);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m179297D4(Followship followship) {
        if (!TEnum.equals(followship.state, FollowshipStatus.following) && !TEnum.equals(followship.state, "matched")) {
            m179314j4("fansClub", null);
        } else {
            m179314j4("follow", null);
            m179314j4("voiceFollow", null);
        }
    }

    /* JADX INFO: renamed from: J4 */
    public void mo179300J4(LiveMessage liveMessage) {
        j25.m139413i(liveMessage, mo77274R2());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: K4 */
    public void mo152703K4(z2s z2sVar, View view, String str, LiveMessage liveMessage) {
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
                m179305P4(cuk.m108784b(z2sVar.m216987b()));
                j25.m139410f(mo77274R2());
                break;
            case 1:
                if (liveMessage != null && (extInfo = liveMessage.extInfo) != null && extInfo.followUserId != null) {
                    m179318n4(liveMessage, z2sVar, false);
                    break;
                }
                break;
            case 2:
                m179320r4(liveMessage.extInfo.scheme);
                break;
            case 3:
                mo179317m4();
                break;
            case 4:
                ypv.f199493a.m199339c0();
                act().startActivity(ypv.f199493a.m199385z0(act(), liveMessage.extInfo.toUserId, false, false));
                break;
            case 5:
                m206028F2().BottomEvent.showDialog().mo172463j(BLiveButtonType.get(BLiveButtonType.magicGesture));
                break;
            case 6:
                m179307c4(liveMessage, liveMessage.extInfo.applyCallId, z2sVar);
                break;
            case 7:
                m206028F2().CallEvent.anchorCallAudience().m172467p();
                break;
            case 8:
                m206028F2().FansGroupEvent.showFansGroupPanel().mo172463j(Boolean.FALSE);
                break;
            case 9:
                m206028F2().LiveBridgeImplEvent.showVoteResultDialog().mo172463j(liveMessage.extInfo.voteRecordId);
                z2sVar.mo207186h(false);
                ((ChatListView) this.viewModel).m72691M(liveMessage);
                break;
            case 10:
                m179320r4(liveMessage.h5Url);
                String str2 = liveMessage.traceJson;
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    m179303N4(liveMessage.traceJson);
                    break;
                }
                break;
            case 11:
                if (liveMessage != null && (extInfo2 = liveMessage.extInfo) != null) {
                    m179322u4(extInfo2.roomId, extInfo2.liveId, "jumpTopRoom");
                    break;
                }
                break;
            case 12:
                m179301L4();
                break;
            case 13:
                m206028F2().LiveVoiceChatGroupEvent.openCreateGroupDialog().mo172463j(Boolean.TRUE);
                break;
            case 14:
                m206028F2().BottomEvent.openSettingDialog().m172467p();
                break;
            case 15:
                m206028F2().LiveVoiceChatGroupEvent.approveChatGroupApply().mo172463j(liveMessage.extInfo);
                break;
            case 16:
                m179310f4(liveMessage, z2sVar);
                break;
            case 17:
                m179320r4(liveMessage.extInfo.scheme);
                j25.m139409e(mo77274R2());
                break;
        }
    }

    /* JADX INFO: renamed from: L4 */
    public void m179301L4() {
        m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122565i(100));
    }

    /* JADX INFO: renamed from: N4 */
    public final void m179303N4(String str) {
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
            zvf0.m220397s(strOptString2, strOptString, map);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: P4 */
    public void m179305P4(jp50 jp50Var) {
        m206028F2().OpenH5Event.open().mo172463j(jp50Var);
    }

    /* JADX INFO: renamed from: Q4 */
    public void m179306Q4(LiveUserInfo liveUserInfo, long j, boolean z) {
        k25.m144269j(this, liveUserInfo, j, z);
    }

    /* JADX INFO: renamed from: c4 */
    public void m179307c4(final LiveMessage liveMessage, String str, final z2s z2sVar) {
        duringCreated((C22306c<T>) LivingNormalApiProvider.m71237H3(str, s410.f162257w)).doOnNext(new e30() { // from class: l.dh2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86227a.m179324w4(z2sVar, liveMessage, (BLiveMultiCall) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.eh2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91277a.m179323v4((BLiveMultiCall) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: d4 */
    public void m179308d4(LiveMessage liveMessage) {
        if (NullChecker.m81303a(liveMessage)) {
            this.f159329j.add(liveMessage);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m179309e4(LiveMessage liveMessage) {
        if (liveMessage != null) {
            this.f159329j.add(liveMessage);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m179310f4(LiveMessage liveMessage, z2s z2sVar) {
        if (r610.m177967B(this) != null) {
            lsi0.m151595y(w8u.m202217t(R$string.f46869O7));
            return;
        }
        m206028F2().MultiCallEvent.openApplyDlg().mo172463j(2);
        z2sVar.mo207186h(false);
        ((ChatListView) this.viewModel).m72691M(liveMessage);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: g4 */
    public final boolean m179311g4(cmn0 cmn0Var) {
        BLiveAbsData bLiveAbsDataM132152n0 = m206027E2().m132152n0();
        return bLiveAbsDataM132152n0 != null && cmn0Var.m107673a(x4s.m207012b(bLiveAbsDataM132152n0.liveMode));
    }

    /* JADX INFO: renamed from: h4 */
    public void m179312h4(final cmn0 cmn0Var) {
        if (m179311g4(cmn0Var)) {
            m179314j4("voiceCallApply", new w9j() { // from class: l.hh2
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return rh2.m179279L3(cmn0Var, (LiveMessage) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public final void m179327z4(final String str, final w9j<LiveMessage, Boolean> w9jVar) {
        er40.m117820h(str);
        this.f159333n.clear();
        vwb.m200354z(this.f159328i, new e30() { // from class: l.yg2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198112a.m179325x4(str, w9jVar, (LiveMessage) obj);
            }
        });
        if (!this.f159333n.isEmpty()) {
            vwb.m200354z(this.f159333n, new e30() { // from class: l.zg2
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f203003a.m179326y4((LiveMessage) obj);
                }
            });
        }
        ((ChatListView) this.viewModel).m72689K(this.f159328i, true);
    }

    /* JADX INFO: renamed from: j4 */
    public void m179314j4(final String str, final w9j<LiveMessage, Boolean> w9jVar) {
        ThreadUtil.m81314i(new Runnable() { // from class: l.ph2
            @Override // java.lang.Runnable
            public final void run() {
                this.f148862a.m179327z4(str, w9jVar);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public final List<LiveMessage> m179316l4(LiveMessage liveMessage) {
        this.f159328i = mo179319o4().mo159820b(new xaj0<>(liveMessage, this.f159328i, ((ChatListView) this.viewModel).getChatRecyclerViewVisiblePosition()));
        mo179300J4(liveMessage);
        return this.f159328i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: m4 */
    public void mo179317m4() {
        m206027E2().m132125e0(false, mo77274R2(), "liveMessage", new d30() { // from class: l.fh2
            @Override // p149l.d30
            public final void call() {
                lsi0.m151593w(R$string.f46803L4);
            }
        });
        k25.m144270k(this);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        ((ChatListView) this.viewModel).m72705y();
        this.f159328i.clear();
        this.f159329j.clear();
        this.f159330k = null;
        this.f159331l = null;
        this.f159333n.clear();
    }

    /* JADX INFO: renamed from: n4 */
    public void m179318n4(final LiveMessage liveMessage, final z2s z2sVar, final boolean z) {
        final String str = z ? "audio_message" : "liveMessage";
        if (z) {
            k25.m144272m(this, liveMessage);
        } else {
            k25.m144271l(this, liveMessage);
        }
        duringCreated((C22306c<T>) LivingNormalApiProvider.m71574s7(liveMessage.extInfo.followUserId, m206027E2().m149814k())).flatMap(new w9j() { // from class: l.ah2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f69541a.m179295A4(str, (User) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.bh2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75548a.m179296B4(z2sVar, z, liveMessage, (Followship) obj);
            }
        }, new e30() { // from class: l.ch2
            @Override // p149l.e30
            public final void call(Object obj) {
                rh2.m179281N3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX INFO: renamed from: o4 */
    public sh2 mo179319o4() {
        if (this.f159332m == null) {
            this.f159332m = (sh2) wq4.m205013a(vwb.m200324f0(new j1f(), new q90(m206032L2(), m206027E2().mo120451F0() == 2), new tkc0(), new i2c(), new uwe0(), new k0f()));
        }
        return this.f159332m;
    }

    /* JADX INFO: renamed from: p4 */
    public String mo106339p4() {
        return k25.f120690a;
    }

    /* JADX INFO: renamed from: q4 */
    public String mo106340q4() {
        return "liveRoom";
    }

    /* JADX INFO: renamed from: r4 */
    public void m179320r4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(100).m206701e(str).m206699c());
    }

    /* JADX INFO: renamed from: s4 */
    public boolean mo106341s4() {
        return true;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((ChatListView) this.viewModel).m72702r();
        init();
        m129299H3(m206027E2().m132135h2(1, TimeUnit.SECONDS)).subscribe(ffw.m121194e(new e30() { // from class: l.xg2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192732a.m179273C4((Long) obj);
            }
        }, new e30() { // from class: l.ih2
            @Override // p149l.e30
            public final void call(Object obj) {
                rh2.m179290X3((Throwable) obj);
            }
        }));
        duringCreated((C22306c<T>) m206027E2().m132165t0()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.jh2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117867a.m179297D4((Followship) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().ChatEvent.refreshChatList().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.kh2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123114a.m179274E4((soj0) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().ChatEvent.scrollToEnd().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.lh2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128031a.m179275F4((soj0) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().ChatEvent.addNotificationItem().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.mh2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133774a.m179309e4((LiveMessage) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().ChatEvent.addDragonInfoMsg().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.nh2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138943a.m179308d4((LiveMessage) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().ChatEvent.openDragonPushMsg().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.oh2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143943a.m179276G4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public boolean mo179321t4() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l.ho2] */
    /* JADX INFO: renamed from: u4 */
    public void m179322u4(String str, String str2, String str3) {
        if (m206032L2()) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46799L0));
        } else {
            m206028F2().JumpRoomEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73031t(m206027E2().mo132155o0()).m73029r(m206027E2().m149814k()).m73030s(m206027E2().mo149813j().room.f44419id).m73028q(m206027E2().m132146l0().name).m73033v(str2).m73034w(str).m73032u(str3).m73025n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m73024m());
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m179323v4(BLiveMultiCall bLiveMultiCall) {
        m206028F2().MultiCallEvent.addWatchList().mo172463j(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m179324w4(z2s z2sVar, LiveMessage liveMessage, BLiveMultiCall bLiveMultiCall) {
        z2sVar.mo207186h(false);
        ((ChatListView) this.viewModel).m72691M(liveMessage);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m179325x4(final String str, w9j w9jVar, LiveMessage liveMessage) {
        if (str.equals("follow") && er40.m117818f(liveMessage)) {
            this.f159333n.add(liveMessage);
            return;
        }
        if (str.equals("fansClub") && er40.m117817e(liveMessage)) {
            this.f159333n.add(liveMessage);
            return;
        }
        if ((w9jVar == null || ((Boolean) w9jVar.call(liveMessage)).booleanValue()) && !vwb.m200296J(liveMessage.spanList)) {
            SpannableStringBuilder spannableStringBuilder = liveMessage.spanList.get(0);
            ped0 ped0Var = (ped0) vwb.m200347s((ped0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ped0.class), new w9j() { // from class: l.gh2
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((ped0) obj).m168505a().equals(str));
                }
            });
            if (ped0Var != null) {
                ped0Var.setVisible(false);
                ((ChatListView) this.viewModel).m72691M(liveMessage);
            }
            mo179315k4(str, liveMessage);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m179326y4(LiveMessage liveMessage) {
        this.f159328i.remove(liveMessage);
    }

    /* JADX INFO: renamed from: I4 */
    public void mo179299I4() {
    }

    /* JADX INFO: renamed from: M4 */
    public void mo179302M4() {
    }

    public void init() {
    }

    /* JADX INFO: renamed from: O4 */
    public void mo179304O4(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: H4 */
    public void mo179298H4(IChatItemLongClickArea iChatItemLongClickArea, LiveMessage liveMessage) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo179315k4(String str, LiveMessage liveMessage) {
    }
}
