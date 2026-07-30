package p149l;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.base.data.BLivePosition;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.GiftSticker;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerResManager;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.RoomStickerContainer;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public class xdd0 extends h4t<am40, RoomStickerContainer> implements l3m {

    /* JADX INFO: renamed from: i */
    public InterfaceC12736c f192379i;

    /* JADX INFO: renamed from: j */
    public boolean f192380j;

    /* JADX INFO: renamed from: k */
    public C22393b<roj0> f192381k;

    public xdd0(bsm bsmVar, RoomStickerContainer roomStickerContainer) {
        super(bsmVar);
        this.f192381k = C22393b.m221521b();
        mo51532C(roomStickerContainer);
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m208294Y3(Throwable th) {
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m208296a4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m208299e4(Integer num) {
        ((RoomStickerContainer) this.viewModel).m72373e(num.intValue());
    }

    /* JADX INFO: renamed from: n4 */
    private void m208300n4() {
        InterfaceC12736c interfaceC12736c = this.f192379i;
        if (interfaceC12736c != null) {
            ((RoomStickerContainer) this.viewModel).m72375i(interfaceC12736c);
            this.f192379i = null;
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().ChatViewRightChangeEvent.chatRightChange().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.wdd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185780a.m208299e4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public final BLiveAddStickerResult m208301d4(final BLiveAddStickerResult bLiveAddStickerResult) {
        BLiveStickerMetaDataItem bLiveStickerMetaDataItemM72366x = LiveStickerResManager.m72347w().m72366x(bLiveAddStickerResult.templateId);
        if (bLiveStickerMetaDataItemM72366x != null && bLiveStickerMetaDataItemM72366x.version == bLiveAddStickerResult.version && LiveStickerResManager.m72347w().m72348A(bLiveStickerMetaDataItemM72366x)) {
            bLiveStickerMetaDataItemM72366x.fillResult(bLiveAddStickerResult);
            return bLiveAddStickerResult;
        }
        if (bLiveStickerMetaDataItemM72366x == null || bLiveStickerMetaDataItemM72366x.version != bLiveAddStickerResult.version || LiveStickerResManager.m72347w().m72348A(bLiveStickerMetaDataItemM72366x)) {
            duringCreated(LivingNormalApiProvider.m71367V7(bLiveAddStickerResult.templateId)).subscribe(ffw.m121194e(new e30() { // from class: l.fdd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f97028a.m208302f4(bLiveAddStickerResult, (List) obj);
                }
            }, new e30() { // from class: l.gdd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    xdd0.m208296a4((Throwable) obj);
                }
            }));
            return null;
        }
        bLiveStickerMetaDataItemM72366x.fillResult(bLiveAddStickerResult);
        m208311p4(bLiveAddStickerResult);
        return null;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m208302f4(final BLiveAddStickerResult bLiveAddStickerResult, List list) {
        if (list != null) {
            C22306c.from(list).doOnNext(new e30() { // from class: l.kdd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    BLiveStickerMetaDataItem bLiveStickerMetaDataItem = (BLiveStickerMetaDataItem) obj;
                    LiveStickerResManager.m72347w().m72360M(bLiveStickerMetaDataItem.f44442id, bLiveStickerMetaDataItem);
                }
            }).filter(new w9j() { // from class: l.ldd0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(bLiveAddStickerResult.templateId, ((BLiveStickerMetaDataItem) obj).f44442id));
                }
            }).map(new w9j() { // from class: l.mdd0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveStickerMetaDataItem) obj).fillResult(bLiveAddStickerResult);
                }
            }).subscribe(ffw.m121193d(new e30() { // from class: l.ndd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f138278a.m208311p4((BLiveAddStickerResult) obj);
                }
            }));
            this.f192380j = true;
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m208303g4(BLiveAddStickerResult bLiveAddStickerResult) {
        InterfaceC12736c interfaceC12736cM72370b = ((RoomStickerContainer) this.viewModel).m72370b(bLiveAddStickerResult);
        this.f192379i = interfaceC12736cM72370b;
        m208312q4(bLiveAddStickerResult, interfaceC12736cM72370b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ Boolean m208304h4(BLiveAddStickerResult bLiveAddStickerResult) {
        List<String> list = ((am40) m206027E2()).m170393A2().mo165469j().liveStickerIds;
        return Boolean.valueOf(!vwb.m200296J(list) && list.contains(bLiveAddStickerResult.f44329id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ Boolean m208305i4(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        return Boolean.valueOf(TextUtils.equals(liveStickerChangeMsg.getRoomId(), ((am40) m206027E2()).m149818o()));
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m208306j4(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        List<LongLinkLiveMessage.LiveSticker> liveStickersList = liveStickerChangeMsg.getLiveStickersList();
        if (vwb.m200296J(liveStickersList)) {
            m208300n4();
            return;
        }
        LongLinkLiveMessage.LiveSticker liveSticker = liveStickersList.get(0);
        BLiveAddStickerResult bLiveAddStickerResultNew_ = BLiveAddStickerResult.new_();
        bLiveAddStickerResultNew_.f44329id = liveSticker.getId();
        bLiveAddStickerResultNew_.templateId = liveSticker.getTemplateId();
        bLiveAddStickerResultNew_.version = liveSticker.getVersion();
        bLiveAddStickerResultNew_.content = liveSticker.getContent();
        BLivePosition bLivePositionNew_ = BLivePosition.new_();
        bLivePositionNew_.f44430x = liveSticker.getPosition().getX();
        bLivePositionNew_.f44431y = liveSticker.getPosition().getY();
        bLiveAddStickerResultNew_.position = bLivePositionNew_;
        bLiveAddStickerResultNew_.giftIcon = liveSticker.getGiftIcon();
        bLiveAddStickerResultNew_.giftId = liveSticker.getGiftId();
        m208309m4(bLiveAddStickerResultNew_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ C22306c m208307k4(roj0 roj0Var) {
        return duringCreated(LivingNormalApiProvider.m71571s4(((am40) m206027E2()).m149818o()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m208308l4(Boolean bool) {
        xdl0.m208344M((View) this.viewModel, bool.booleanValue());
    }

    @Override // p149l.l3m
    /* JADX INFO: renamed from: m1 */
    public void mo105734m1() {
        if (this.f192380j) {
            LiveStickerResManager.m72347w().m72361N();
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final void m208309m4(BLiveAddStickerResult bLiveAddStickerResult) {
        BLiveAddStickerResult bLiveAddStickerResultM208301d4;
        m208300n4();
        if (r610.m177979N(this) || bLiveAddStickerResult == null || (bLiveAddStickerResultM208301d4 = m208301d4(bLiveAddStickerResult)) == null) {
            return;
        }
        m208310o4(bLiveAddStickerResultM208301d4);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m208300n4();
    }

    /* JADX INFO: renamed from: o4 */
    public final void m208310o4(final BLiveAddStickerResult bLiveAddStickerResult) {
        m208300n4();
        e51.m114742G(new Runnable() { // from class: l.hdd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f107231a.m208303g4(bLiveAddStickerResult);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public final void m208311p4(BLiveAddStickerResult bLiveAddStickerResult) {
        C22306c<T> c22306cDuringCreated = duringCreated((C22306c) LiveStickerResManager.m72347w().m72357J(bLiveAddStickerResult).filter(new w9j() { // from class: l.idd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LiveStickerResManager.m72347w().m72368z((BLiveAddStickerResult) ((Pair) obj).first));
            }
        }).map(new w9j() { // from class: l.jdd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }));
        C22393b<roj0> c22393b = this.f192381k;
        Objects.requireNonNull(c22393b);
        c22306cDuringCreated.subscribe(ffw.m121193d(new d7u(c22393b)));
    }

    /* JADX INFO: renamed from: q4 */
    public final void m208312q4(BLiveAddStickerResult bLiveAddStickerResult, InterfaceC12736c interfaceC12736c) {
        BLiveStickerMetaDataItem bLiveStickerMetaDataItemM72366x;
        if (!(interfaceC12736c instanceof GiftSticker) || (bLiveStickerMetaDataItemM72366x = LiveStickerResManager.m72347w().m72366x(bLiveAddStickerResult.templateId)) == null) {
            return;
        }
        GiftSticker giftSticker = (GiftSticker) interfaceC12736c;
        giftSticker.setGiftPosition(bLiveStickerMetaDataItemM72366x.giftCfg.position);
        giftSticker.m72252k0(bLiveAddStickerResult.giftIcon, bLiveStickerMetaDataItemM72366x.giftCfg.backgroundUrl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().StickerEvent.changeVisible().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.edd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90602a.m208308l4((Boolean) obj);
            }
        }));
        duringCreated(((am40) m206027E2()).m132073K0().filter(new w9j() { // from class: l.pdd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f148294a.m208304h4((BLiveAddStickerResult) obj);
            }
        })).subscribe(ffw.m121193d(new e30() { // from class: l.qdd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153905a.m208309m4((BLiveAddStickerResult) obj);
            }
        }));
        duringCreated(((am40) m206027E2()).m132075L0().filter(new w9j() { // from class: l.rdd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158909a.m208305i4((LongLinkLiveMessage.LiveStickerChangeMsg) obj);
            }
        })).subscribe(ffw.m121193d(new e30() { // from class: l.sdd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163833a.m208306j4((LongLinkLiveMessage.LiveStickerChangeMsg) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(ConnectivityReceiver.m81290m().skip(1).filter(new w9j() { // from class: l.tdd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).map(new w9j() { // from class: l.udd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).observeOn(jo0.m142408a()));
        C22393b<roj0> c22393b = this.f192381k;
        Objects.requireNonNull(c22393b);
        c22306cDuringCreated.subscribe(ffw.m121193d(new d7u(c22393b)));
        duringCreated((C22306c) this.f192381k.flatMap(new w9j() { // from class: l.vdd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181077a.m208307k4((roj0) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.qdd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153905a.m208309m4((BLiveAddStickerResult) obj);
            }
        }, new e30() { // from class: l.odd0
            @Override // p149l.e30
            public final void call(Object obj) {
                xdd0.m208294Y3((Throwable) obj);
            }
        }));
    }
}
