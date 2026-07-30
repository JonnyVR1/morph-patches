package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.bwr;
import l.e30;
import l.ffw;
import l.j760;
import l.jo0;
import l.nnn0;
import l.roj0;
import l.s7m;
import l.soj0;
import l.t100;
import l.vwb;
import l.w9j;
import l.zvf0;
import p002l.ho2;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class h2c<D extends ho2> extends h4t<D, DanmakuViewPort> {

    /* JADX INFO: renamed from: i */
    public final l1c f11852i;

    /* JADX INFO: renamed from: j */
    public final b<roj0> f11853j;

    /* JADX INFO: renamed from: k */
    public boolean f11854k;

    public h2c(bsm<D> bsmVar, DanmakuViewPort danmakuViewPort) {
        super(bsmVar);
        this.f11852i = new l1c();
        this.f11853j = b.b();
        C(danmakuViewPort);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m14144Y3(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f11854k = zBooleanValue;
        if (zBooleanValue) {
            return;
        }
        this.f11853j.onNext(roj0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m14145d4(soj0 soj0Var) {
        m14157i4();
    }

    /* JADX INFO: renamed from: T */
    public void m14146T() {
        super.T();
        o2(m25547E2().m14596q1().h(), false).observeOn(Schedulers.computation()).subscribe(ffw.d(new e30() { // from class: l.a2c
            public final void call(Object obj) {
                this.f7352a.m14148X3((LongLinkLiveDanmakuMessage.BulletCommentInfo) obj);
            }
        }));
        duringCreated(c.merge(((c) m25548F2().GiftTraysEvent.onAnimationStateChange().g()).filter(new w9j() { // from class: l.b2c
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }), ((c) m25548F2().GiftTraysEvent.playGiftLayer().g()).map(new w9j() { // from class: l.c2c
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }))).subscribe(ffw.d(new e30() { // from class: l.d2c
            public final void call(Object obj) {
                this.f9047a.m14144Y3((Boolean) obj);
            }
        }));
        duringCreated(this.f11853j).onBackpressureBuffer().observeOn(jo0.a()).filter(new w9j() { // from class: l.e2c
            public final Object call(Object obj) {
                return this.f9555a.m14149Z3((roj0) obj);
            }
        }).map(new w9j() { // from class: l.f2c
            public final Object call(Object obj) {
                return this.f10108a.m14150a4((roj0) obj);
            }
        }).filter(new w9j() { // from class: l.g2c
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((LongLinkLiveDanmakuMessage.BulletCommentInfo) obj));
            }
        }).doOnError(new e30() { // from class: l.v1c
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }).subscribe(ffw.d(new e30() { // from class: l.w1c
            public final void call(Object obj) {
                this.f21413a.m14151b4((LongLinkLiveDanmakuMessage.BulletCommentInfo) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.onDanmakuSendSuccess().g()).observeOn(Schedulers.computation()).subscribe(ffw.d(new e30() { // from class: l.x1c
            public final void call(Object obj) {
                this.f22075a.m14152c4((m1c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public int[] m14147W3() {
        return ((m25547E2() instanceof nnn0) || this.f11854k) ? new int[]{3} : new int[]{1, 2, 3};
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m14148X3(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        this.f11852i.m16929a(bulletCommentInfo);
        this.f11853j.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Boolean m14149Z3(roj0 roj0Var) {
        return Boolean.valueOf(((DanmakuViewPort) ((bwr) this).viewModel).m6102e(m14147W3()));
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ LongLinkLiveDanmakuMessage.BulletCommentInfo m14150a4(roj0 roj0Var) {
        return this.f11852i.m16933e();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m14151b4(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        ((DanmakuViewPort) ((bwr) this).viewModel).m6106j(bulletCommentInfo, m14147W3());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m14152c4(m1c m1cVar) {
        LongLinkLiveDanmakuMessage.FakeUserMask fakeUserMaskBuild = LongLinkLiveDanmakuMessage.FakeUserMask.newBuilder().setAvatarConfig(LongLinkLiveDanmakuMessage.FakeUserAvatarConfig.newBuilder().setFrameConfig(LongLinkLiveDanmakuMessage.FakeUserPictureConfig.newBuilder().setStaticUrl(m1cVar.f15203a.avatarConfig.frameConfig.staticUrl).setDynamicUrl(m1cVar.f15203a.avatarConfig.frameConfig.dynamicUrl))).setAvatar(m1cVar.f15203a.avatar).setName(m1cVar.f15203a.name).setUserId(m1cVar.f15203a.userId).setFakeType(LongLinkLiveDanmakuMessage.FakeType.valueOf(m1cVar.f15203a.fakeType)).build();
        LongLinkLiveDanmakuMessage.BulletCommentStyle.Builder builderNewBuilder = LongLinkLiveDanmakuMessage.BulletCommentStyle.newBuilder();
        List list = m1cVar.f15204b.style.backgroundColors;
        if (list != null) {
            builderNewBuilder.addAllBackgroundColors(list);
        }
        List list2 = m1cVar.f15204b.style.borderColors;
        if (list2 != null) {
            builderNewBuilder.addAllBorderColors(list2);
        }
        this.f11852i.m16929a(LongLinkLiveDanmakuMessage.BulletCommentInfo.newBuilder().addMasks(fakeUserMaskBuild).setVideoLiveBulletComment(LongLinkLiveDanmakuMessage.VideoLiveBulletComment.newBuilder().setUserHierarchy(m1cVar.f15204b.userHierarchy).setContent(m1cVar.f15204b.content).setIconUrl(m1cVar.f15204b.iconUrl).setPriority(-1L).setType(m1cVar.f15204b.type).setStyle(builderNewBuilder.setBorderColor(m1cVar.f15204b.style.borderColor).setOpacity(m1cVar.f15204b.style.opacity).setBackgroundUrl(m1cVar.f15204b.style.backgroundUrl).build()).setPayAmount(m1cVar.f15204b.payAmount).build()).build());
        this.f11853j.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m14153e4(cyq cyqVar) {
        ((DanmakuViewPort) ((bwr) this).viewModel).setTranslationY(-cyqVar.f8987b);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m14154f4(jy00 jy00Var) {
        MotionType motionType = jy00Var.f14129b;
        if (motionType == MotionType.pk || motionType == MotionType.multi_call) {
            m14157i4();
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m14155g4() {
        this.f11853j.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: h4 */
    public void m14156h4(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        String userId = bulletCommentInfo.getMasks(0).getUserId();
        m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(1200).userId(userId).setFromIdentity(bqq.m10554a(this, ((DbObject) m25547E2().m14582l0()).id, userId, 100)).setTo(bqq.m10557d(this, ((DbObject) m25547E2().m14582l0()).id, userId, 100)).setScene("live").setSource("chat").trackFrom("liveMessage").build());
        zvf0.u("e_live_bullet_chat", mo21430R2(), new j760[]{vwb.Y("anchor_id", ((DbObject) m25547E2().m14582l0()).id), vwb.Y("bullet_price", Long.valueOf(bulletCommentInfo.getVideoLiveBulletComment().getPayAmount())), vwb.Y("bullet_type", bulletCommentInfo.getVideoLiveBulletComment().getType()), vwb.Y("bullet_user_id", userId), vwb.Y("live_id", m25547E2().m17235k())});
    }

    /* JADX INFO: renamed from: i4 */
    public void m14157i4() {
        if (this.f22036e.f8341j.m24320M3() == MotionType.multi_call) {
            ((DanmakuViewPort) ((bwr) this).viewModel).setTranslationY(-t100.d(62.0f));
            return;
        }
        MotionType motionTypeM24320M3 = this.f22036e.f8341j.m24320M3();
        MotionType motionType = MotionType.pk;
        s7m s7mVar = ((bwr) this).viewModel;
        if (motionTypeM24320M3 == motionType) {
            ((DanmakuViewPort) s7mVar).setTranslationY(-t100.d(136.0f));
        } else {
            ((DanmakuViewPort) s7mVar).setTranslationY(0.0f);
        }
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f11852i.m16930b();
    }

    /* JADX INFO: renamed from: t */
    public void m14158t() {
        super.t();
        duringCreated((c) m25548F2().MotionEvent.motionSwitch().g()).subscribe(ffw.h(new e30() { // from class: l.u1c
            public final void call(Object obj) {
                this.f20457a.m14154f4((jy00) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.onChatInputDialogDismiss().g()).subscribe(ffw.d(new e30() { // from class: l.y1c
            public final void call(Object obj) {
                this.f22606a.m14145d4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.keyboardDetectorChange().g()).subscribe(ffw.d(new e30() { // from class: l.z1c
            public final void call(Object obj) {
                this.f23179a.m14153e4((cyq) obj);
            }
        }));
        m14157i4();
    }
}
