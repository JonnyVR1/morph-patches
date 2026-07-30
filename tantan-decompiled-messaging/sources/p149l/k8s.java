package p149l;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoomEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveUserWealthHierarchy;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class k8s<V extends ho2> extends h4t<ho2, LiveEnterRoomView> {

    /* JADX INFO: renamed from: i */
    public ArrayList<BLiveEnterRoom> f121849i;

    public k8s(bsm bsmVar, LiveEnterRoomView liveEnterRoomView) {
        super(bsmVar);
        this.f121849i = new ArrayList<>();
        mo51532C(liveEnterRoomView);
    }

    /* JADX INFO: renamed from: S3 */
    public static String m144958S3(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : mmj.m155401D(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m144959U3(Long l2) {
        this.f121849i.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m144960V3(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m144963R3();
            return;
        }
        if (c4319c == (m206032L2() ? C4319c.f15550k : C4319c.f15549j)) {
            this.f121849i.clear();
            ((LiveEnterRoomView) this.viewModel).m74180i();
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m144961O3(BLiveEnterRoom bLiveEnterRoom) {
        this.f121849i.add(bLiveEnterRoom);
        m144963R3();
    }

    /* JADX INFO: renamed from: P3 */
    public final void m144962P3(final BLiveEnterRoom bLiveEnterRoom) {
        wrj.m205214U(bLiveEnterRoom);
        if (((idv) ypv.m215673l(fld0.f98147b)).m135634f()) {
            bLiveEnterRoom.enterVersion = 0L;
            m144961O3(bLiveEnterRoom);
            return;
        }
        String mixResId = bLiveEnterRoom.getMixResId();
        if (TextUtils.isEmpty(mixResId) || spe.m185363b(mixResId, new e30() { // from class: l.j8s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116783a.m144965W3(bLiveEnterRoom, (BLiveEffect) obj);
            }
        }) != null) {
            m144961O3(bLiveEnterRoom);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m144963R3() {
        if (((LiveEnterRoomView) this.viewModel).m74178d() || this.f121849i.size() <= 0) {
            return;
        }
        BLiveEnterRoom bLiveEnterRoomRemove = this.f121849i.remove(0);
        ((LiveEnterRoomView) this.viewModel).m74179e(bLiveEnterRoomRemove.enterVersion, bLiveEnterRoomRemove);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129299H3(m206027E2().m132135h2(ypv.m215672k().m195879l4(), TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.e8s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89859a.m144959U3((Long) obj);
            }
        }));
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.f8s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96400a.m144960V3((C4319c) obj);
            }
        }));
        m129315u3(new w9j() { // from class: l.g8s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((ti1) obj).m189158z();
            }
        }).m129322b(new e30() { // from class: l.h8s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106462a.m144964T3((BLiveEnterRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final void m144964T3(BLiveEnterRoom bLiveEnterRoom) {
        m144962P3(bLiveEnterRoom);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m144965W3(BLiveEnterRoom bLiveEnterRoom, BLiveEffect bLiveEffect) {
        m144961O3(bLiveEnterRoom);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m144966X3(BLiveEnterRoomEffect bLiveEnterRoomEffect) {
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
        bLiveEnterRoomNew_.contentText = m144958S3(bLiveEnterRoomEffect.text, bLiveEnterRoomEffect.internalText);
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
        m144964T3(bLiveEnterRoomNew_);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.ho2] */
    /* JADX INFO: renamed from: Y3 */
    public void m144967Y3(String str) {
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).userId(str).setSource("gift").setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).setScene("live").trackFrom("giftBanner").build());
    }

    /* JADX INFO: renamed from: Z3 */
    public void m144968Z3(View view) {
        ((LiveEnterRoomView) this.viewModel).m74180i();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        ((LiveEnterRoomView) this.viewModel).m74180i();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2, l.lh20] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (m206032L2()) {
            return;
        }
        duringCreated(zfv.m218520N0(m206027E2().mo149817n().f44324id, m206027E2().mo149813j().f44323id, m206027E2().mo132054A0(), m206027E2().mo149813j().liveMode)).subscribe(ffw.m121197h(new e30() { // from class: l.i8s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112064a.m144966X3((BLiveEnterRoomEffect) obj);
            }
        }));
    }
}
