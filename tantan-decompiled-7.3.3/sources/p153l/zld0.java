package p153l;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.base.data.BLivePosition;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.GiftSticker;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerResManager;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.RoomStickerContainer;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public class zld0 extends i6t<ou40, RoomStickerContainer> implements c6m {

    /* JADX INFO: renamed from: i */
    public InterfaceC12899c f204911i;

    /* JADX INFO: renamed from: j */
    public boolean f204912j;

    /* JADX INFO: renamed from: k */
    public C22508b<uxj0> f204913k;

    public zld0(dum dumVar, RoomStickerContainer roomStickerContainer) {
        super(dumVar);
        this.f204913k = C22508b.m222767b();
        mo52715C(roomStickerContainer);
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m220198Y3(Throwable th) {
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m220200a4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m220203e4(Integer num) {
        ((RoomStickerContainer) this.viewModel).m73556e(num.intValue());
    }

    /* JADX INFO: renamed from: n4 */
    private void m220204n4() {
        InterfaceC12899c interfaceC12899c = this.f204911i;
        if (interfaceC12899c != null) {
            ((RoomStickerContainer) this.viewModel).m73558i(interfaceC12899c);
            this.f204911i = null;
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().ChatViewRightChangeEvent.chatRightChange().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.yld0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200549a.m220203e4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public final BLiveAddStickerResult m220205d4(final BLiveAddStickerResult bLiveAddStickerResult) {
        BLiveStickerMetaDataItem bLiveStickerMetaDataItemM73549x = LiveStickerResManager.m73530w().m73549x(bLiveAddStickerResult.templateId);
        if (bLiveStickerMetaDataItemM73549x != null && bLiveStickerMetaDataItemM73549x.version == bLiveAddStickerResult.version && LiveStickerResManager.m73530w().m73531A(bLiveStickerMetaDataItemM73549x)) {
            bLiveStickerMetaDataItemM73549x.fillResult(bLiveAddStickerResult);
            return bLiveAddStickerResult;
        }
        if (bLiveStickerMetaDataItemM73549x == null || bLiveStickerMetaDataItemM73549x.version != bLiveAddStickerResult.version || LiveStickerResManager.m73530w().m73531A(bLiveStickerMetaDataItemM73549x)) {
            duringCreated(LivingNormalApiProvider.m72550V7(bLiveAddStickerResult.templateId)).subscribe(dhw.m115826e(new y20() { // from class: l.hld0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110496a.m220206f4(bLiveAddStickerResult, (List) obj);
                }
            }, new y20() { // from class: l.ild0
                @Override // p153l.y20
                public final void call(Object obj) {
                    zld0.m220200a4((Throwable) obj);
                }
            }));
            return null;
        }
        bLiveStickerMetaDataItemM73549x.fillResult(bLiveAddStickerResult);
        m220215p4(bLiveAddStickerResult);
        return null;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m220206f4(final BLiveAddStickerResult bLiveAddStickerResult, List list) {
        if (list != null) {
            C22421c.from(list).doOnNext(new y20() { // from class: l.mld0
                @Override // p153l.y20
                public final void call(Object obj) {
                    BLiveStickerMetaDataItem bLiveStickerMetaDataItem = (BLiveStickerMetaDataItem) obj;
                    LiveStickerResManager.m73530w().m73543M(bLiveStickerMetaDataItem.f45290id, bLiveStickerMetaDataItem);
                }
            }).filter(new qcj() { // from class: l.nld0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(bLiveAddStickerResult.templateId, ((BLiveStickerMetaDataItem) obj).f45290id));
                }
            }).map(new qcj() { // from class: l.old0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveStickerMetaDataItem) obj).fillResult(bLiveAddStickerResult);
                }
            }).subscribe(dhw.m115825d(new y20() { // from class: l.pld0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f153021a.m220215p4((BLiveAddStickerResult) obj);
                }
            }));
            this.f204912j = true;
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m220207g4(BLiveAddStickerResult bLiveAddStickerResult) {
        InterfaceC12899c interfaceC12899cM73553b = ((RoomStickerContainer) this.viewModel).m73553b(bLiveAddStickerResult);
        this.f204911i = interfaceC12899cM73553b;
        m220216q4(bLiveAddStickerResult, interfaceC12899cM73553b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ Boolean m220208h4(BLiveAddStickerResult bLiveAddStickerResult) {
        List<String> list = ((ou40) m213810E2()).m118363A2().mo122891j().liveStickerIds;
        return Boolean.valueOf(!jyb.m147479J(list) && list.contains(bLiveAddStickerResult.f45177id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ Boolean m220209i4(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        return Boolean.valueOf(TextUtils.equals(liveStickerChangeMsg.getRoomId(), ((ou40) m213810E2()).m202194o()));
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m220210j4(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        List<LongLinkLiveMessage.LiveSticker> liveStickersList = liveStickerChangeMsg.getLiveStickersList();
        if (jyb.m147479J(liveStickersList)) {
            m220204n4();
            return;
        }
        LongLinkLiveMessage.LiveSticker liveSticker = liveStickersList.get(0);
        BLiveAddStickerResult bLiveAddStickerResultNew_ = BLiveAddStickerResult.new_();
        bLiveAddStickerResultNew_.f45177id = liveSticker.getId();
        bLiveAddStickerResultNew_.templateId = liveSticker.getTemplateId();
        bLiveAddStickerResultNew_.version = liveSticker.getVersion();
        bLiveAddStickerResultNew_.content = liveSticker.getContent();
        BLivePosition bLivePositionNew_ = BLivePosition.new_();
        bLivePositionNew_.f45278x = liveSticker.getPosition().getX();
        bLivePositionNew_.f45279y = liveSticker.getPosition().getY();
        bLiveAddStickerResultNew_.position = bLivePositionNew_;
        bLiveAddStickerResultNew_.giftIcon = liveSticker.getGiftIcon();
        bLiveAddStickerResultNew_.giftId = liveSticker.getGiftId();
        m220213m4(bLiveAddStickerResultNew_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ C22421c m220211k4(uxj0 uxj0Var) {
        return duringCreated(LivingNormalApiProvider.m72754s4(((ou40) m213810E2()).m202194o()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m220212l4(Boolean bool) {
        bnl0.m105524M((View) this.viewModel, bool.booleanValue());
    }

    @Override // p153l.c6m
    /* JADX INFO: renamed from: m1 */
    public void mo108170m1() {
        if (this.f204912j) {
            LiveStickerResManager.m73530w().m73544N();
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final void m220213m4(BLiveAddStickerResult bLiveAddStickerResult) {
        BLiveAddStickerResult bLiveAddStickerResultM220205d4;
        m220204n4();
        if (bf10.m103808N(this) || bLiveAddStickerResult == null || (bLiveAddStickerResultM220205d4 = m220205d4(bLiveAddStickerResult)) == null) {
            return;
        }
        m220214o4(bLiveAddStickerResultM220205d4);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m220204n4();
    }

    /* JADX INFO: renamed from: o4 */
    public final void m220214o4(final BLiveAddStickerResult bLiveAddStickerResult) {
        m220204n4();
        l51.m152887G(new Runnable() { // from class: l.jld0
            @Override // java.lang.Runnable
            public final void run() {
                this.f121547a.m220207g4(bLiveAddStickerResult);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public final void m220215p4(BLiveAddStickerResult bLiveAddStickerResult) {
        C22421c<T> c22421cDuringCreated = duringCreated((C22421c) LiveStickerResManager.m73530w().m73540J(bLiveAddStickerResult).filter(new qcj() { // from class: l.kld0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LiveStickerResManager.m73530w().m73551z((BLiveAddStickerResult) ((Pair) obj).first));
            }
        }).map(new qcj() { // from class: l.lld0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }));
        C22508b<uxj0> c22508b = this.f204913k;
        Objects.requireNonNull(c22508b);
        c22421cDuringCreated.subscribe(dhw.m115825d(new e9u(c22508b)));
    }

    /* JADX INFO: renamed from: q4 */
    public final void m220216q4(BLiveAddStickerResult bLiveAddStickerResult, InterfaceC12899c interfaceC12899c) {
        BLiveStickerMetaDataItem bLiveStickerMetaDataItemM73549x;
        if (!(interfaceC12899c instanceof GiftSticker) || (bLiveStickerMetaDataItemM73549x = LiveStickerResManager.m73530w().m73549x(bLiveAddStickerResult.templateId)) == null) {
            return;
        }
        GiftSticker giftSticker = (GiftSticker) interfaceC12899c;
        giftSticker.setGiftPosition(bLiveStickerMetaDataItemM73549x.giftCfg.position);
        giftSticker.m73435k0(bLiveAddStickerResult.giftIcon, bLiveStickerMetaDataItemM73549x.giftCfg.backgroundUrl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().StickerEvent.changeVisible().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.gld0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104839a.m220212l4((Boolean) obj);
            }
        }));
        duringCreated(((ou40) m213810E2()).m168462K0().filter(new qcj() { // from class: l.rld0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163716a.m220208h4((BLiveAddStickerResult) obj);
            }
        })).subscribe(dhw.m115825d(new y20() { // from class: l.sld0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169367a.m220213m4((BLiveAddStickerResult) obj);
            }
        }));
        duringCreated(((ou40) m213810E2()).m168463L0().filter(new qcj() { // from class: l.tld0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f174810a.m220209i4((LongLinkLiveMessage.LiveStickerChangeMsg) obj);
            }
        })).subscribe(dhw.m115825d(new y20() { // from class: l.uld0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179504a.m220210j4((LongLinkLiveMessage.LiveStickerChangeMsg) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(ConnectivityReceiver.m82473m().skip(1).filter(new qcj() { // from class: l.vld0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).map(new qcj() { // from class: l.wld0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).observeOn(fo0.m126432a()));
        C22508b<uxj0> c22508b = this.f204913k;
        Objects.requireNonNull(c22508b);
        c22421cDuringCreated.subscribe(dhw.m115825d(new e9u(c22508b)));
        duringCreated((C22421c) this.f204913k.flatMap(new qcj() { // from class: l.xld0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f194946a.m220211k4((uxj0) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.sld0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169367a.m220213m4((BLiveAddStickerResult) obj);
            }
        }, new y20() { // from class: l.qld0
            @Override // p153l.y20
            public final void call(Object obj) {
                zld0.m220198Y3((Throwable) obj);
            }
        }));
    }
}
