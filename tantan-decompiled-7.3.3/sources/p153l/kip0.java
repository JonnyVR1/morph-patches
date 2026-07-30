package p153l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleUser;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010\u0016J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u000bJ\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010\u000bJ\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010\u000bJ\u0017\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u001dH\u0016¢\u0006\u0004\b,\u0010 J\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u001dH\u0016¢\u0006\u0004\b.\u0010 J\u0017\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u001dH\u0016¢\u0006\u0004\b0\u0010 J\u0015\u00102\u001a\u00020\t2\u0006\u00101\u001a\u00020\r¢\u0006\u0004\b2\u0010\u0010J\u0017\u00103\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b3\u0010\u0016J\r\u00104\u001a\u00020\t¢\u0006\u0004\b4\u0010\u000bJ\r\u00105\u001a\u00020\t¢\u0006\u0004\b5\u0010\u000bJ\r\u00106\u001a\u00020\t¢\u0006\u0004\b6\u0010\u000bJ\u000f\u00107\u001a\u00020\tH\u0016¢\u0006\u0004\b7\u0010\u000bJ\u000f\u00108\u001a\u00020\u001dH\u0016¢\u0006\u0004\b8\u00109¨\u0006:"}, m88121d2 = {"Ll/kip0;", "Ll/y8s;", "Ll/rwn0;", "Ll/nhp0;", "Ll/wgp0;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "A4", "()V", "w4", "", "userId", "B4", "(Ljava/lang/String;)V", "q4", Constants.KEY_T, "Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;", "roomInfo", "d1", "(Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;)V", "v4", "F", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceVirtualRoomSettleUser;", "userInfo", "B1", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceVirtualRoomSettleUser;)V", "", "isPersonal", "g2", "(Z)V", "isFreeSettle", "J1", "i0", "(Ljava/lang/String;)Z", "d0", "currentRoomInfo", "u4", "R", "z4", "y4", "b", "Q", "open", "E0", "checked", "y0", "type", "x4", "t4", "r4", "p4", "o4", "h1", "h2", "()Z", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class kip0 extends y8s<rwn0, nhp0> implements wgp0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kip0(@NotNull dum<? extends rwn0> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: B4 */
    private final void m149921B4(String userId) {
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(7011).showShadow().userId(userId).setSource("settleUserList").setFromIdentity(csq.m112227a(this, mo104749j3(), userId, 7011)).setTo(csq.m112230d(this, mo104749j3(), userId, 7011)).setScene("settleUserList").trackFrom("settleUserList").build());
    }

    /* JADX INFO: renamed from: S3 */
    public static void m149922S3(Throwable th) {
    }

    /* JADX INFO: renamed from: T3 */
    public static void m149923T3(kip0 kip0Var, boolean z, BLiveExtraResponse bLiveExtraResponse) {
        ((nhp0) kip0Var.viewModel).m163170z0(z);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m149925V3(kip0 kip0Var, String str) {
        kip0Var.m149965w4();
    }

    /* JADX INFO: renamed from: W3 */
    public static Unit m149926W3(kip0 kip0Var, View view) {
        view.getClass();
        ((nhp0) kip0Var.viewModel).mo73021p();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static void m149927X3(kip0 kip0Var, boolean z, uxj0 uxj0Var) {
        ((nhp0) kip0Var.viewModel).m163143K0(z);
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m149928Y3(kip0 kip0Var, View view) {
        kip0Var.m149960q4();
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m149929Z3(kip0 kip0Var, LongLinkVirtualVoice.VoiceSettleMessage voiceSettleMessage) {
        kip0Var.m149965w4();
    }

    /* JADX INFO: renamed from: a4 */
    public static void m149930a4(kip0 kip0Var, String str, ArrayList arrayList) {
        ((nhp0) kip0Var.viewModel).m163141I0(str);
    }

    /* JADX INFO: renamed from: b4 */
    public static void m149931b4(kip0 kip0Var, String str) {
        kip0Var.m149965w4();
    }

    /* JADX INFO: renamed from: c4 */
    public static void m149932c4(kip0 kip0Var, boolean z, BLiveExtraResponse bLiveExtraResponse) {
        ((nhp0) kip0Var.viewModel).m163169y0(z);
    }

    /* JADX INFO: renamed from: d4 */
    public static void m149933d4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public static Boolean m149934e4(C4470c c4470c) {
        return Boolean.valueOf(Intrinsics.m88377d(c4470c, C4470c.f16267i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public static void m149935f4(kip0 kip0Var, uxj0 uxj0Var) {
        ((rwn0) kip0Var.m213810E2()).mo183440n().freeCall = false;
        ((nhp0) kip0Var.viewModel).m163140H0(false);
    }

    /* JADX INFO: renamed from: g4 */
    public static Boolean m149936g4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h4 */
    public static void m149937h4(kip0 kip0Var, BLiveExtraResponse bLiveExtraResponse) {
        nhp0 nhp0Var = (nhp0) kip0Var.viewModel;
        BLiveExtraData bLiveExtraData = bLiveExtraResponse.data;
        bLiveExtraData.getClass();
        nhp0Var.m163168p0(bLiveExtraData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public static void m149938i4(final kip0 kip0Var, View view) {
        kip0Var.duringCreated(VoiceRoomApiProvider.openFreeCall(((rwn0) kip0Var.m213810E2()).m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.bip0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149944s4(this.f76904a, (uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public static void m149939j4(kip0 kip0Var, vxj0 vxj0Var) {
        kip0Var.m149945A4();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m149940k4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public static void m149941l4(kip0 kip0Var) {
        kip0Var.m149945A4();
    }

    /* JADX INFO: renamed from: m4 */
    public static void m149942m4(kip0 kip0Var, C4470c c4470c) {
        kip0Var.m149965w4();
    }

    /* JADX INFO: renamed from: n4 */
    public static void m149943n4(kip0 kip0Var, String str) {
        nhp0 nhp0Var = (nhp0) kip0Var.viewModel;
        str.getClass();
        nhp0Var.m163142J0(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public static final void m149944s4(kip0 kip0Var, uxj0 uxj0Var) {
        ((rwn0) kip0Var.m213810E2()).mo183440n().freeCall = true;
        ((nhp0) kip0Var.viewModel).m163140H0(true);
    }

    /* JADX INFO: renamed from: A4 */
    public final void m149945A4() {
        if (this.viewModel == 0) {
            Act act = this.f196919f;
            act.getClass();
            nhp0 nhp0Var = new nhp0(act, this);
            this.viewModel = nhp0Var;
            nhp0Var.mo22064i1(this);
        }
        ((nhp0) this.viewModel).m73017E();
        m149965w4();
        t3m0.m189108v(this);
        czq.m113347c(((nhp0) this.viewModel).m163162j0(), new Function1() { // from class: l.jip0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kip0.m149926W3(this.f121112a, (View) obj);
            }
        });
    }

    @Override // p153l.wgp0
    /* JADX INFO: renamed from: B1 */
    public void mo149946B1(@NotNull BLiveVoiceVirtualRoomSettleUser userInfo) {
        userInfo.getClass();
        String str = userInfo.userId;
        str.getClass();
        m149921B4(str);
    }

    @Override // p153l.wgp0
    /* JADX INFO: renamed from: E0 */
    public void mo149947E0(boolean open) {
        if (open) {
            new th0.C20312a(this.f196919f).m191160s("设置上麦免审").m191150i(R$string.f47465Cg).m191157p(n9c0.f140855p0).m191159r("确认").m191156o(new View.OnClickListener() { // from class: l.shp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kip0.m149938i4(this.f168737a, view);
                }
            }).m191145d(n9c0.f140804X0).m191147f("取消").m191142a().m191141g();
            return;
        }
        dum<? extends T> dumVar = this.f196918e;
        dumVar.getClass();
        if (f2m0.m123632b(dumVar)) {
            new th0.C20312a(act()).m191151j("关闭后，将会影响游戏参与人数，请谨慎关闭").m191158q(R$string.f48271o2).m191156o(new View.OnClickListener() { // from class: l.thp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kip0.m149928Y3(this.f174402a, view);
                }
            }).m191146e(R$string.f47690N1).m191142a().m191141g();
        } else {
            m149960q4();
        }
    }

    @Override // p153l.wgp0
    /* JADX INFO: renamed from: F */
    public void mo149948F(@NotNull BLiveExtraData roomInfo) {
        roomInfo.getClass();
        m213811F2().MemberManagerEvent.showMemberManagerDialogWithOnePage().mo199273j(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.wgp0
    /* JADX INFO: renamed from: J1 */
    public void mo149949J1(final boolean isFreeSettle) {
        String strM202194o = ((rwn0) m213810E2()).m202194o();
        strM202194o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.setVirtualRoomFreeSettle(strM202194o, isFreeSettle)).subscribe(dhw.m115826e(new y20() { // from class: l.uhp0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149932c4(this.f179047a, isFreeSettle, (BLiveExtraResponse) obj);
            }
        }, new y20() { // from class: l.vhp0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149933d4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.wgp0
    /* JADX INFO: renamed from: Q */
    public void mo149950Q(boolean b) {
        ((ifv) zrv.m221194l(htd0.f111523e)).f114700i.put(Boolean.valueOf(b));
    }

    @Override // p153l.wgp0
    /* JADX INFO: renamed from: R */
    public void mo149951R() {
        m213811F2().VirtualRoomInfoEvent.showVoiceRoomLevelDetail().m199277p();
    }

    @Override // p153l.wgp0
    /* JADX INFO: renamed from: d0 */
    public boolean mo149952d0(@NotNull String userId) {
        userId.getClass();
        return i9o0.m139139j(this, userId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.wgp0
    /* JADX INFO: renamed from: d1 */
    public void mo149953d1(@NotNull BLiveExtraData roomInfo) {
        roomInfo.getClass();
        moo0 moo0Var = new moo0("title", roomInfo);
        if (((rwn0) m213810E2()).mo118373p() || i9o0.m139137h(this)) {
            if (BLiveVoiceRoomProfile.isStatePending(roomInfo.voiceRoomProfile.titleStatus)) {
                o1j0.m165651y("资料正在审核中");
            } else {
                m213811F2().VoiceTopicEvent.showVoiceVirtualEditTitleDialog().mo199273j(moo0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.wgp0
    /* JADX INFO: renamed from: g2 */
    public void mo149954g2(final boolean isPersonal) {
        String strM202194o = ((rwn0) m213810E2()).m202194o();
        strM202194o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.setVirtualRoomPersonal(strM202194o, isPersonal)).subscribe(dhw.m115826e(new y20() { // from class: l.whp0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149923T3(this.f189182a, isPersonal, (BLiveExtraResponse) obj);
            }
        }, new y20() { // from class: l.xhp0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149940k4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.wgp0
    /* JADX INFO: renamed from: h1 */
    public void mo149955h1() {
        i4g0.m138523u("e_audio_member_invite_settle_button", "p_audio_room_profile", new pf60("anchorId", ((rwn0) m213810E2()).m168526j0()), new pf60("roomId", ((rwn0) m213810E2()).m202194o()));
        m213811F2().VoiceVirtualLiveEvent.openSharePanelDialogWithScene().mo199273j("inviteSettle");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.wgp0
    /* JADX INFO: renamed from: h2 */
    public boolean mo149956h2() {
        return Intrinsics.m88377d("virtualAvatar", ((rwn0) m213810E2()).mo183435j().liveMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.wgp0
    /* JADX INFO: renamed from: i0 */
    public boolean mo149957i0(@NotNull String userId) {
        userId.getClass();
        return Intrinsics.m88377d(userId, ((rwn0) m213810E2()).m168532l0().f56859id);
    }

    /* JADX INFO: renamed from: o4 */
    public final void m149958o4() {
        t3m0.m189107u(this);
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(7012).m103154e("tantanapp://voice-live/room/settleGuide").m103152c());
    }

    /* JADX INFO: renamed from: p4 */
    public final void m149959p4() {
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(7012).m103154e("tantanapp://voice-live/room/cancelenrollmen").m103152c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public final void m149960q4() {
        duringCreated(VoiceRoomApiProvider.closeFreeCall(((rwn0) m213810E2()).m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.yhp0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149935f4(this.f199981a, (uxj0) obj);
            }
        }, new y20() { // from class: l.aip0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149922S3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public final void m149961r4() {
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(7012).m103154e("tantanapp://voice-live/room/deleteroom").m103152c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VirtualRoomInfoEvent.showVirtualRoomInfoDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ohp0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149939j4(this.f147472a, (vxj0) obj);
            }
        }));
        duringCreated(m213811F2().VirtualRoomInfoEvent.updateRoomInfoDialogTitle().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.zhp0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149925V3(this.f204443a, (String) obj);
            }
        }));
        duringCreated(m213811F2().VirtualRoomInfoEvent.updateRoomInfoDialogNotice().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.cip0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149931b4(this.f81971a, (String) obj);
            }
        }));
        m138863h3(m213811F2().VirtualRoomInfoEvent.updateRoomCategory(), new y20() { // from class: l.dip0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149943n4(this.f88697a, (String) obj);
            }
        });
        duringCreated(((rwn0) m213810E2()).m168545q1().m98255T0()).subscribe(dhw.m115829h(new y20() { // from class: l.eip0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149929Z3(this.f94187a, (LongLinkVirtualVoice.VoiceSettleMessage) obj);
            }
        }));
        C22421c<C4470c> c22421cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.fip0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kip0.m149934e4((C4470c) obj);
            }
        };
        c22421cLifecycle.filter(new qcj() { // from class: l.gip0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return kip0.m149936g4(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.hip0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149942m4(this.f110043a, (C4470c) obj);
            }
        }));
        if (!((rwn0) m213810E2()).mo146597M2() || i9o0.m139133d(this)) {
            return;
        }
        l51.m152888H(m213812H2().getContext(), new Runnable() { // from class: l.iip0
            @Override // java.lang.Runnable
            public final void run() {
                kip0.m149941l4(this.f115117a);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: t4 */
    public void m149962t4(@NotNull BLiveExtraData roomInfo) {
        roomInfo.getClass();
        m213811F2().VirtualRoomInfoEvent.showVoiceCategoryDialog().m199277p();
    }

    /* JADX INFO: renamed from: u4 */
    public void m149963u4(@NotNull BLiveExtraData currentRoomInfo) {
        currentRoomInfo.getClass();
        m213811F2().VirtualRoomInfoEvent.showVoiceRoomHeatDialog().mo199273j(currentRoomInfo.voiceRoomProfile);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public void m149964v4(@NotNull BLiveExtraData roomInfo) {
        roomInfo.getClass();
        moo0 moo0Var = new moo0("notice", roomInfo);
        if (!((rwn0) m213810E2()).mo118373p() && !i9o0.m139137h(this)) {
            m213811F2().VirtualRoomInfoEvent.showVirtualNoticePreviewDialog().mo199273j(moo0Var);
        } else if (BLiveVoiceRoomProfile.isStatePending(roomInfo.voiceRoomProfile.announcementStatus)) {
            o1j0.m165651y("资料正在审核中");
        } else {
            m213811F2().TopNoticeEvent.openEditNoticeDialog2().mo199273j(moo0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final void m149965w4() {
        V v2 = this.viewModel;
        if (v2 == 0 || !((nhp0) v2).isShowing()) {
            return;
        }
        String strM202194o = ((rwn0) m213810E2()).m202194o();
        strM202194o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.getVirtualVoiceRoomInfo(strM202194o)).subscribe(dhw.m115829h(new y20() { // from class: l.php0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149937h4(this.f152465a, (BLiveExtraResponse) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final void m149966x4(@NotNull final String type) {
        type.getClass();
        String strM202194o = ((rwn0) m213810E2()).m202194o();
        strM202194o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.messageReminds(strM202194o, type)).subscribe(dhw.m115829h(new y20() { // from class: l.qhp0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149930a4(this.f157744a, type, (ArrayList) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.wgp0
    /* JADX INFO: renamed from: y0 */
    public void mo149967y0(final boolean checked) {
        String strM202194o = ((rwn0) m213810E2()).m202194o();
        strM202194o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.setTopChat(strM202194o, checked)).subscribe(dhw.m115829h(new y20() { // from class: l.rhp0
            @Override // p153l.y20
            public final void call(Object obj) {
                kip0.m149927X3(this.f163189a, checked, (uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y4 */
    public final void m149968y4() {
        zrv.f205799a.m207675j0(this.f196919f);
    }

    /* JADX INFO: renamed from: z4 */
    public final void m149969z4() {
        m213811F2().VoiceVirtualLiveEvent.showChangeBgDialog().m199277p();
    }
}
