package p149l;

import com.p046p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.List;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22393b;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class h2c<D extends ho2> extends h4t<D, DanmakuViewPort> {

    /* JADX INFO: renamed from: i */
    public final l1c f105512i;

    /* JADX INFO: renamed from: j */
    public final C22393b<roj0> f105513j;

    /* JADX INFO: renamed from: k */
    public boolean f105514k;

    public h2c(bsm<D> bsmVar, DanmakuViewPort danmakuViewPort) {
        super(bsmVar);
        this.f105512i = new l1c();
        this.f105513j = C22393b.m221521b();
        mo51532C(danmakuViewPort);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m129107Y3(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f105514k = zBooleanValue;
        if (zBooleanValue) {
            return;
        }
        this.f105513j.m132487l(roj0.f160388a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m129108d4(soj0 soj0Var) {
        m129119i4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m104250o2(m206027E2().m132160q1().m189107h(), false).observeOn(Schedulers.computation()).subscribe(ffw.m121193d(new e30() { // from class: l.a2c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67247a.m129110X3((LongLinkLiveDanmakuMessage.BulletCommentInfo) obj);
            }
        }));
        duringCreated(C22306c.merge(m206028F2().GiftTraysEvent.onAnimationStateChange().m172460g().filter(new w9j() { // from class: l.b2c
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }), m206028F2().GiftTraysEvent.playGiftLayer().m172460g().map(new w9j() { // from class: l.c2c
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }))).subscribe(ffw.m121193d(new e30() { // from class: l.d2c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83345a.m129107Y3((Boolean) obj);
            }
        }));
        duringCreated(this.f105513j).onBackpressureBuffer().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.e2c
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88911a.m129111Z3((roj0) obj);
            }
        }).map(new w9j() { // from class: l.f2c
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f94162a.m129112a4((roj0) obj);
            }
        }).filter(new g2c()).doOnError(new e30() { // from class: l.v1c
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.w1c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183988a.m129113b4((LongLinkLiveDanmakuMessage.BulletCommentInfo) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().ChatEvent.onDanmakuSendSuccess().m172460g()).observeOn(Schedulers.computation()).subscribe(ffw.m121193d(new e30() { // from class: l.x1c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f189045a.m129114c4((m1c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public int[] m129109W3() {
        return ((m206027E2() instanceof nnn0) || this.f105514k) ? new int[]{3} : new int[]{1, 2, 3};
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m129110X3(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        this.f105512i.m148152a(bulletCommentInfo);
        this.f105513j.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Boolean m129111Z3(roj0 roj0Var) {
        return Boolean.valueOf(((DanmakuViewPort) this.viewModel).m72603e(m129109W3()));
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ LongLinkLiveDanmakuMessage.BulletCommentInfo m129112a4(roj0 roj0Var) {
        return this.f105512i.m148156e();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m129113b4(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        ((DanmakuViewPort) this.viewModel).m72606j(bulletCommentInfo, m129109W3());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m129114c4(m1c m1cVar) {
        LongLinkLiveDanmakuMessage.FakeUserMask fakeUserMaskBuild = LongLinkLiveDanmakuMessage.FakeUserMask.newBuilder().setAvatarConfig(LongLinkLiveDanmakuMessage.FakeUserAvatarConfig.newBuilder().setFrameConfig(LongLinkLiveDanmakuMessage.FakeUserPictureConfig.newBuilder().setStaticUrl(m1cVar.f130822a.avatarConfig.frameConfig.staticUrl).setDynamicUrl(m1cVar.f130822a.avatarConfig.frameConfig.dynamicUrl))).setAvatar(m1cVar.f130822a.avatar).setName(m1cVar.f130822a.name).setUserId(m1cVar.f130822a.userId).setFakeType(LongLinkLiveDanmakuMessage.FakeType.valueOf(m1cVar.f130822a.fakeType)).build();
        LongLinkLiveDanmakuMessage.BulletCommentStyle.Builder builderNewBuilder = LongLinkLiveDanmakuMessage.BulletCommentStyle.newBuilder();
        List<String> list = m1cVar.f130823b.style.backgroundColors;
        if (list != null) {
            builderNewBuilder.addAllBackgroundColors(list);
        }
        List<String> list2 = m1cVar.f130823b.style.borderColors;
        if (list2 != null) {
            builderNewBuilder.addAllBorderColors(list2);
        }
        this.f105512i.m148152a(LongLinkLiveDanmakuMessage.BulletCommentInfo.newBuilder().addMasks(fakeUserMaskBuild).setVideoLiveBulletComment(LongLinkLiveDanmakuMessage.VideoLiveBulletComment.newBuilder().setUserHierarchy(m1cVar.f130823b.userHierarchy).setContent(m1cVar.f130823b.content).setIconUrl(m1cVar.f130823b.iconUrl).setPriority(-1L).setType(m1cVar.f130823b.type).setStyle(builderNewBuilder.setBorderColor(m1cVar.f130823b.style.borderColor).setOpacity(m1cVar.f130823b.style.opacity).setBackgroundUrl(m1cVar.f130823b.style.backgroundUrl).build()).setPayAmount(m1cVar.f130823b.payAmount).build()).build());
        this.f105513j.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m129115e4(cyq cyqVar) {
        ((DanmakuViewPort) this.viewModel).setTranslationY(-cyqVar.f83024b);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m129116f4(jy00 jy00Var) {
        MotionType motionType = jy00Var.f120275b;
        if (motionType == MotionType.pk || motionType == MotionType.multi_call) {
            m129119i4();
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m129117g4() {
        this.f105513j.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: h4 */
    public void m129118h4(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        String userId = bulletCommentInfo.getMasks(0).getUserId();
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(1200).userId(userId).setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, userId, 100)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, userId, 100)).setScene("live").setSource("chat").trackFrom("liveMessage").build());
        zvf0.m220399u("e_live_bullet_chat", mo77274R2(), vwb.m200311Y("anchor_id", m206027E2().m132146l0().f56011id), vwb.m200311Y("bullet_price", Long.valueOf(bulletCommentInfo.getVideoLiveBulletComment().getPayAmount())), vwb.m200311Y("bullet_type", bulletCommentInfo.getVideoLiveBulletComment().getType()), vwb.m200311Y("bullet_user_id", userId), vwb.m200311Y("live_id", m206027E2().m149814k()));
    }

    /* JADX INFO: renamed from: i4 */
    public void m129119i4() {
        if (this.f188512e.f77104j.m201578M3() == MotionType.multi_call) {
            ((DanmakuViewPort) this.viewModel).setTranslationY(-t100.m186890d(62.0f));
            return;
        }
        MotionType motionTypeM201578M3 = this.f188512e.f77104j.m201578M3();
        MotionType motionType = MotionType.pk;
        V v2 = this.viewModel;
        if (motionTypeM201578M3 == motionType) {
            ((DanmakuViewPort) v2).setTranslationY(-t100.m186890d(136.0f));
        } else {
            ((DanmakuViewPort) v2).setTranslationY(0.0f);
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f105512i.m148153b();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c) m206028F2().MotionEvent.motionSwitch().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.u1c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172986a.m129116f4((jy00) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().ChatEvent.onChatInputDialogDismiss().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.y1c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195400a.m129108d4((soj0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().ChatEvent.keyboardDetectorChange().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.z1c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201063a.m129115e4((cyq) obj);
            }
        }));
        m129119i4();
    }
}
