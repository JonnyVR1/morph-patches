package p002l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p1.mobile.putong.live.base.data.BLiveEnterRoomEffect;
import com.p1.mobile.putong.live.base.data.BLiveUserWealthHierarchy;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.e30;
import l.ffw;
import l.fld0;
import l.idv;
import l.ti1;
import l.w9j;
import l.ypv;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class k8s<V extends ho2> extends h4t<ho2, LiveEnterRoomView> {

    /* JADX INFO: renamed from: i */
    public ArrayList<BLiveEnterRoom> f14252i;

    public k8s(bsm bsmVar, LiveEnterRoomView liveEnterRoomView) {
        super(bsmVar);
        this.f14252i = new ArrayList<>();
        C(liveEnterRoomView);
    }

    /* JADX INFO: renamed from: S3 */
    public static String m16556S3(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : mmj.m18043D(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m16557U3(Long l2) {
        this.f14252i.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m16558V3(c cVar) {
        if (cVar == c.i) {
            m16561R3();
            return;
        }
        if (cVar == (m25552L2() ? c.k : c.j)) {
            this.f14252i.clear();
            ((LiveEnterRoomView) ((bwr) this).viewModel).m7746i();
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m16559O3(BLiveEnterRoom bLiveEnterRoom) {
        this.f14252i.add(bLiveEnterRoom);
        m16561R3();
    }

    /* JADX INFO: renamed from: P3 */
    public final void m16560P3(final BLiveEnterRoom bLiveEnterRoom) {
        wrj.m25386U(bLiveEnterRoom);
        if (((idv) ypv.l(fld0.b)).f()) {
            bLiveEnterRoom.enterVersion = 0L;
            m16559O3(bLiveEnterRoom);
            return;
        }
        String mixResId = bLiveEnterRoom.getMixResId();
        if (TextUtils.isEmpty(mixResId) || spe.m22602b(mixResId, new e30() { // from class: l.j8s
            public final void call(Object obj) {
                this.f13640a.m16564W3(bLiveEnterRoom, (BLiveEffect) obj);
            }
        }) != null) {
            m16559O3(bLiveEnterRoom);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m16561R3() {
        if (((LiveEnterRoomView) ((bwr) this).viewModel).m7744d() || this.f14252i.size() <= 0) {
            return;
        }
        BLiveEnterRoom bLiveEnterRoomRemove = this.f14252i.remove(0);
        ((LiveEnterRoomView) ((bwr) this).viewModel).m7745e(bLiveEnterRoomRemove.enterVersion, bLiveEnterRoomRemove);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: T */
    public void m16562T() {
        super.T();
        m14186H3(m25547E2().m14571h2(ypv.k().l4(), TimeUnit.SECONDS)).subscribe(ffw.d(new e30() { // from class: l.e8s
            public final void call(Object obj) {
                this.f9633a.m16557U3((Long) obj);
            }
        }));
        lifecycle().subscribe(ffw.d(new e30() { // from class: l.f8s
            public final void call(Object obj) {
                this.f10192a.m16558V3((c) obj);
            }
        }));
        m14202u3(new w9j() { // from class: l.g8s
            public final Object call(Object obj) {
                return ((ti1) obj).z();
            }
        }).m14209b(new e30() { // from class: l.h8s
            public final void call(Object obj) {
                this.f11942a.m16563T3((BLiveEnterRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final void m16563T3(BLiveEnterRoom bLiveEnterRoom) {
        m16560P3(bLiveEnterRoom);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m16564W3(BLiveEnterRoom bLiveEnterRoom, BLiveEffect bLiveEffect) {
        m16559O3(bLiveEnterRoom);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m16565X3(BLiveEnterRoomEffect bLiveEnterRoomEffect) {
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
        bLiveEnterRoomNew_.contentText = m16556S3(bLiveEnterRoomEffect.text, bLiveEnterRoomEffect.internalText);
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
        m16563T3(bLiveEnterRoomNew_);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.ho2] */
    /* JADX INFO: renamed from: Y3 */
    public void m16566Y3(String str) {
        m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(1500).userId(str).setSource("gift").setFromIdentity(bqq.m10554a(this, ((DbObject) m25547E2().m14582l0()).id, str, 1500)).setTo(bqq.m10557d(this, ((DbObject) m25547E2().m14582l0()).id, str, 1500)).setScene("live").trackFrom("giftBanner").build());
    }

    /* JADX INFO: renamed from: Z3 */
    public void m16567Z3(View view) {
        ((LiveEnterRoomView) ((bwr) this).viewModel).m7746i();
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        ((LiveEnterRoomView) ((bwr) this).viewModel).m7746i();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: t */
    public void m16568t() {
        super.t();
        if (m25552L2()) {
            return;
        }
        duringCreated(zfv.m27223N0(m25547E2().m17238n().id, m25547E2().m17234j().id, m25547E2().mo14489A0(), m25547E2().m17234j().liveMode)).subscribe(ffw.h(new e30() { // from class: l.i8s
            public final void call(Object obj) {
                this.f13107a.m16565X3((BLiveEnterRoomEffect) obj);
            }
        }));
    }
}
