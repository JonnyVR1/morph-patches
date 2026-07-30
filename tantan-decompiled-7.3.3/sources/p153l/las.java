package p153l;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoomEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveUserWealthHierarchy;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class las<V extends oo2> extends i6t<oo2, LiveEnterRoomView> {

    /* JADX INFO: renamed from: i */
    public ArrayList<BLiveEnterRoom> f130732i;

    public las(dum dumVar, LiveEnterRoomView liveEnterRoomView) {
        super(dumVar);
        this.f130732i = new ArrayList<>();
        mo52715C(liveEnterRoomView);
    }

    /* JADX INFO: renamed from: S3 */
    public static String m153528S3(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : cpj.m111768D(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m153529U3(Long l2) {
        this.f130732i.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m153530V3(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m153533R3();
            return;
        }
        if (c4470c == (m213815L2() ? C4470c.f16269k : C4470c.f16268j)) {
            this.f130732i.clear();
            ((LiveEnterRoomView) this.viewModel).m75363i();
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m153531O3(BLiveEnterRoom bLiveEnterRoom) {
        this.f130732i.add(bLiveEnterRoom);
        m153533R3();
    }

    /* JADX INFO: renamed from: P3 */
    public final void m153532P3(final BLiveEnterRoom bLiveEnterRoom) {
        muj.m160178U(bLiveEnterRoom);
        if (((jfv) zrv.m221194l(htd0.f111520b)).m144719f()) {
            bLiveEnterRoom.enterVersion = 0L;
            m153531O3(bLiveEnterRoom);
            return;
        }
        String mixResId = bLiveEnterRoom.getMixResId();
        if (TextUtils.isEmpty(mixResId) || wqe.m207507b(mixResId, new y20() { // from class: l.kas
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124713a.m153535W3(bLiveEnterRoom, (BLiveEffect) obj);
            }
        }) != null) {
            m153531O3(bLiveEnterRoom);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m153533R3() {
        if (((LiveEnterRoomView) this.viewModel).m75361d() || this.f130732i.size() <= 0) {
            return;
        }
        BLiveEnterRoom bLiveEnterRoomRemove = this.f130732i.remove(0);
        ((LiveEnterRoomView) this.viewModel).m75362e(bLiveEnterRoomRemove.enterVersion, bLiveEnterRoomRemove);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138858H3(m213810E2().m168521h2(zrv.m221193k().m203666l4(), TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.fas
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98007a.m153529U3((Long) obj);
            }
        }));
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.gas
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103023a.m153530V3((C4470c) obj);
            }
        }));
        m138874u3(new qcj() { // from class: l.has
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((aj1) obj).m98340z();
            }
        }).m138881b(new y20() { // from class: l.ias
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113615a.m153534T3((BLiveEnterRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final void m153534T3(BLiveEnterRoom bLiveEnterRoom) {
        m153532P3(bLiveEnterRoom);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m153535W3(BLiveEnterRoom bLiveEnterRoom, BLiveEffect bLiveEffect) {
        m153531O3(bLiveEnterRoom);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m153536X3(BLiveEnterRoomEffect bLiveEnterRoomEffect) {
        if (bLiveEnterRoomEffect == null) {
            return;
        }
        BLiveEnterRoom bLiveEnterRoomNew_ = BLiveEnterRoom.new_();
        bLiveEnterRoomNew_.uid = bLiveEnterRoomEffect.userId;
        bLiveEnterRoomNew_.roomId = bLiveEnterRoomEffect.roomId;
        BLiveUserWealthHierarchy bLiveUserWealthHierarchy = bLiveEnterRoomEffect.hierarchys.wealthHierarchy;
        bLiveEnterRoomNew_.userGrade = bLiveUserWealthHierarchy.grade;
        bLiveEnterRoomNew_.userGradeIcon = bLiveUserWealthHierarchy.icon;
        bLiveEnterRoomNew_.userName = bLiveEnterRoomEffect.userName;
        bLiveEnterRoomNew_.userImage = bLiveEnterRoomEffect.userImage;
        bLiveEnterRoomNew_.userNameColor = bLiveEnterRoomEffect.userNameColor;
        bLiveEnterRoomNew_.userNameGradientColors = bLiveEnterRoomEffect.userNameGradientColors;
        bLiveEnterRoomNew_.contentText = m153528S3(bLiveEnterRoomEffect.text, bLiveEnterRoomEffect.internalText);
        bLiveEnterRoomNew_.contentTextColor = bLiveEnterRoomEffect.textColor;
        bLiveEnterRoomNew_.bgUrl = bLiveEnterRoomEffect.backgroundUrl;
        bLiveEnterRoomNew_.floatBgUrl = bLiveEnterRoomEffect.floatingUrl;
        String str = bLiveEnterRoomEffect.effectId;
        bLiveEnterRoomNew_.effectId = str;
        bLiveEnterRoomNew_.resourceId = bLiveEnterRoomEffect.resourceId;
        bLiveEnterRoomNew_.showDuration = bLiveEnterRoomEffect.showDuration;
        bLiveEnterRoomNew_.isWealthHierarchy = bLiveEnterRoomEffect.isWealthHierarchy;
        bLiveEnterRoomNew_.avatarGradientDirection = bLiveEnterRoomEffect.avatarGradientDirection;
        bLiveEnterRoomNew_.avatarGradients = bLiveEnterRoomEffect.avatarGradients;
        bLiveEnterRoomNew_.backgroundGradientDirection = bLiveEnterRoomEffect.backgroundGradientDirection;
        bLiveEnterRoomNew_.backgroundGradients = bLiveEnterRoomEffect.backgroundGradients;
        bLiveEnterRoomNew_.enterRoomEffectId = str;
        bLiveEnterRoomNew_.backgroundUrlEndMargin = bLiveEnterRoomEffect.backgroundUrlEndMargin;
        bLiveEnterRoomNew_.fixedBackgroundUrl = bLiveEnterRoomEffect.fixedBackgroundUrl;
        bLiveEnterRoomNew_.animationSizeType = bLiveEnterRoomEffect.animationSizeType;
        bLiveEnterRoomNew_.enterVersion = bLiveEnterRoomEffect.enterVersion;
        bLiveEnterRoomNew_.newFloatingUrl = bLiveEnterRoomEffect.newFloatingUrl;
        bLiveEnterRoomNew_.newResourceId = bLiveEnterRoomEffect.newResourceId;
        bLiveEnterRoomNew_.videoEffectExtras = bLiveEnterRoomEffect.videoEffectExtras;
        bLiveEnterRoomNew_.dynamicEffectExtends = bLiveEnterRoomEffect.dynamicEffectExtends;
        m153534T3(bLiveEnterRoomNew_);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.oo2] */
    /* JADX INFO: renamed from: Y3 */
    public void m153537Y3(String str) {
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).userId(str).setSource("gift").setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).setScene("live").trackFrom("giftBanner").build());
    }

    /* JADX INFO: renamed from: Z3 */
    public void m153538Z3(View view) {
        ((LiveEnterRoomView) this.viewModel).m75363i();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        ((LiveEnterRoomView) this.viewModel).m75363i();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2, l.vp20] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (m213815L2()) {
            return;
        }
        duringCreated(aiv.m98054N0(m213810E2().mo183440n().f45172id, m213810E2().mo183435j().f45171id, m213810E2().mo118362A0(), m213810E2().mo183435j().liveMode)).subscribe(dhw.m115829h(new y20() { // from class: l.jas
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f119010a.m153536X3((BLiveEnterRoomEffect) obj);
            }
        }));
    }
}
