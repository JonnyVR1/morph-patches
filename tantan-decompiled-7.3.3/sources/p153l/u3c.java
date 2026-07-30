package p153l;

import com.p051p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.List;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22508b;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class u3c<D extends oo2> extends i6t<D, DanmakuViewPort> {

    /* JADX INFO: renamed from: i */
    public final y2c f177330i;

    /* JADX INFO: renamed from: j */
    public final C22508b<uxj0> f177331j;

    /* JADX INFO: renamed from: k */
    public boolean f177332k;

    public u3c(dum<D> dumVar, DanmakuViewPort danmakuViewPort) {
        super(dumVar);
        this.f177330i = new y2c();
        this.f177331j = C22508b.m222767b();
        mo52715C(danmakuViewPort);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m194347Y3(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f177332k = zBooleanValue;
        if (zBooleanValue) {
            return;
        }
        this.f177331j.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m194348d4(vxj0 vxj0Var) {
        m194359i4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m113231o2(m213810E2().m168545q1().m98289h(), false).observeOn(Schedulers.computation()).subscribe(dhw.m115825d(new y20() { // from class: l.n3c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139961a.m194350X3((LongLinkLiveDanmakuMessage.BulletCommentInfo) obj);
            }
        }));
        duringCreated(C22421c.merge(m213811F2().GiftTraysEvent.onAnimationStateChange().m199270g().filter(new qcj() { // from class: l.o3c
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }), m213811F2().GiftTraysEvent.playGiftLayer().m199270g().map(new qcj() { // from class: l.p3c
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }))).subscribe(dhw.m115825d(new y20() { // from class: l.q3c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155436a.m194347Y3((Boolean) obj);
            }
        }));
        duringCreated(this.f177331j).onBackpressureBuffer().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.r3c
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161027a.m194351Z3((uxj0) obj);
            }
        }).map(new qcj() { // from class: l.s3c
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f165991a.m194352a4((uxj0) obj);
            }
        }).filter(new t3c()).doOnError(new y20() { // from class: l.i3c
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.j3c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118174a.m194353b4((LongLinkLiveDanmakuMessage.BulletCommentInfo) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().ChatEvent.onDanmakuSendSuccess().m199270g()).observeOn(Schedulers.computation()).subscribe(dhw.m115825d(new y20() { // from class: l.k3c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123707a.m194354c4((z2c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public int[] m194349W3() {
        return ((m213810E2() instanceof rwn0) || this.f177332k) ? new int[]{3} : new int[]{1, 2, 3};
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m194350X3(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        this.f177330i.m214050a(bulletCommentInfo);
        this.f177331j.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Boolean m194351Z3(uxj0 uxj0Var) {
        return Boolean.valueOf(((DanmakuViewPort) this.viewModel).m73786e(m194349W3()));
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ LongLinkLiveDanmakuMessage.BulletCommentInfo m194352a4(uxj0 uxj0Var) {
        return this.f177330i.m214054e();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m194353b4(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        ((DanmakuViewPort) this.viewModel).m73789j(bulletCommentInfo, m194349W3());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m194354c4(z2c z2cVar) {
        LongLinkLiveDanmakuMessage.FakeUserMask fakeUserMaskBuild = LongLinkLiveDanmakuMessage.FakeUserMask.newBuilder().setAvatarConfig(LongLinkLiveDanmakuMessage.FakeUserAvatarConfig.newBuilder().setFrameConfig(LongLinkLiveDanmakuMessage.FakeUserPictureConfig.newBuilder().setStaticUrl(z2cVar.f202671a.avatarConfig.frameConfig.staticUrl).setDynamicUrl(z2cVar.f202671a.avatarConfig.frameConfig.dynamicUrl))).setAvatar(z2cVar.f202671a.avatar).setName(z2cVar.f202671a.name).setUserId(z2cVar.f202671a.userId).setFakeType(LongLinkLiveDanmakuMessage.FakeType.valueOf(z2cVar.f202671a.fakeType)).build();
        LongLinkLiveDanmakuMessage.BulletCommentStyle.Builder builderNewBuilder = LongLinkLiveDanmakuMessage.BulletCommentStyle.newBuilder();
        List<String> list = z2cVar.f202672b.style.backgroundColors;
        if (list != null) {
            builderNewBuilder.addAllBackgroundColors(list);
        }
        List<String> list2 = z2cVar.f202672b.style.borderColors;
        if (list2 != null) {
            builderNewBuilder.addAllBorderColors(list2);
        }
        this.f177330i.m214050a(LongLinkLiveDanmakuMessage.BulletCommentInfo.newBuilder().addMasks(fakeUserMaskBuild).setVideoLiveBulletComment(LongLinkLiveDanmakuMessage.VideoLiveBulletComment.newBuilder().setUserHierarchy(z2cVar.f202672b.userHierarchy).setContent(z2cVar.f202672b.content).setIconUrl(z2cVar.f202672b.iconUrl).setPriority(-1L).setType(z2cVar.f202672b.type).setStyle(builderNewBuilder.setBorderColor(z2cVar.f202672b.style.borderColor).setOpacity(z2cVar.f202672b.style.opacity).setBackgroundUrl(z2cVar.f202672b.style.backgroundUrl).build()).setPayAmount(z2cVar.f202672b.payAmount).build()).build());
        this.f177331j.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m194355e4(c0r c0rVar) {
        ((DanmakuViewPort) this.viewModel).setTranslationY(-c0rVar.f79292b);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m194356f4(t610 t610Var) {
        MotionType motionType = t610Var.f172284b;
        if (motionType == MotionType.pk || motionType == MotionType.multi_call) {
            m194359i4();
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m194357g4() {
        this.f177331j.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: h4 */
    public void m194358h4(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        String userId = bulletCommentInfo.getMasks(0).getUserId();
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(1200).userId(userId).setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, userId, 100)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, userId, 100)).setScene("live").setSource("chat").trackFrom("liveMessage").build());
        i4g0.m138523u("e_live_bullet_chat", mo78457R2(), jyb.m147494Y("anchor_id", m213810E2().m168532l0().f56859id), jyb.m147494Y("bullet_price", Long.valueOf(bulletCommentInfo.getVideoLiveBulletComment().getPayAmount())), jyb.m147494Y("bullet_type", bulletCommentInfo.getVideoLiveBulletComment().getType()), jyb.m147494Y("bullet_user_id", userId), jyb.m147494Y("live_id", m213810E2().m202191k()));
    }

    /* JADX INFO: renamed from: i4 */
    public void m194359i4() {
        if (this.f196918e.f90824j.m209549M3() == MotionType.multi_call) {
            ((DanmakuViewPort) this.viewModel).setTranslationY(-qa00.m175859d(62.0f));
            return;
        }
        MotionType motionTypeM209549M3 = this.f196918e.f90824j.m209549M3();
        MotionType motionType = MotionType.pk;
        V v2 = this.viewModel;
        if (motionTypeM209549M3 == motionType) {
            ((DanmakuViewPort) v2).setTranslationY(-qa00.m175859d(136.0f));
        } else {
            ((DanmakuViewPort) v2).setTranslationY(0.0f);
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f177330i.m214051b();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c) m213811F2().MotionEvent.motionSwitch().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.h3c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107636a.m194356f4((t610) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().ChatEvent.onChatInputDialogDismiss().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.l3c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129858a.m194348d4((vxj0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().ChatEvent.keyboardDetectorChange().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.m3c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134659a.m194355e4((c0r) obj);
            }
        }));
        m194359i4();
    }
}
