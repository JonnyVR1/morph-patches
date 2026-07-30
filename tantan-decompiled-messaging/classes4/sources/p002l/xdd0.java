package p002l;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.GiftSticker;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerResManager;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.RoomStickerContainer;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p1.mobile.putong.live.base.data.BLivePosition;
import com.p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.List;
import java.util.Objects;
import l.bwr;
import l.e30;
import l.e51;
import l.ffw;
import l.jo0;
import l.l3m;
import l.r610;
import l.roj0;
import l.vwb;
import l.w9j;
import l.xdl0;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xdd0 extends h4t<am40, RoomStickerContainer> implements l3m {

    /* JADX INFO: renamed from: i */
    public InterfaceC0325c f22238i;

    /* JADX INFO: renamed from: j */
    public boolean f22239j;

    /* JADX INFO: renamed from: k */
    public b<roj0> f22240k;

    public xdd0(bsm bsmVar, RoomStickerContainer roomStickerContainer) {
        super(bsmVar);
        this.f22240k = b.b();
        C(roomStickerContainer);
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m25875Y3(Throwable th) {
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m25877a4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m25880e4(Integer num) {
        ((RoomStickerContainer) ((bwr) this).viewModel).m5851e(num.intValue());
    }

    /* JADX INFO: renamed from: n4 */
    private void m25881n4() {
        InterfaceC0325c interfaceC0325c = this.f22238i;
        if (interfaceC0325c != null) {
            ((RoomStickerContainer) ((bwr) this).viewModel).m5853i(interfaceC0325c);
            this.f22238i = null;
        }
    }

    /* JADX INFO: renamed from: T */
    public void m25882T() {
        super.T();
        duringCreated((c) m25548F2().ChatViewRightChangeEvent.chatRightChange().g()).subscribe(ffw.d(new e30() { // from class: l.wdd0
            public final void call(Object obj) {
                this.f21658a.m25880e4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public final BLiveAddStickerResult m25883d4(final BLiveAddStickerResult bLiveAddStickerResult) {
        BLiveStickerMetaDataItem bLiveStickerMetaDataItemM5843x = LiveStickerResManager.m5824w().m5843x(bLiveAddStickerResult.templateId);
        if (bLiveStickerMetaDataItemM5843x != null && bLiveStickerMetaDataItemM5843x.version == bLiveAddStickerResult.version && LiveStickerResManager.m5824w().m5825A(bLiveStickerMetaDataItemM5843x)) {
            bLiveStickerMetaDataItemM5843x.fillResult(bLiveAddStickerResult);
            return bLiveAddStickerResult;
        }
        if (bLiveStickerMetaDataItemM5843x == null || bLiveStickerMetaDataItemM5843x.version != bLiveAddStickerResult.version || LiveStickerResManager.m5824w().m5825A(bLiveStickerMetaDataItemM5843x)) {
            duringCreated(LivingNormalApiProvider.m4733V7(bLiveAddStickerResult.templateId)).subscribe(ffw.e(new e30() { // from class: l.fdd0
                public final void call(Object obj) {
                    this.f10293a.m25884f4(bLiveAddStickerResult, (List) obj);
                }
            }, new e30() { // from class: l.gdd0
                public final void call(Object obj) {
                    xdd0.m25877a4((Throwable) obj);
                }
            }));
            return null;
        }
        bLiveStickerMetaDataItemM5843x.fillResult(bLiveAddStickerResult);
        m25894p4(bLiveAddStickerResult);
        return null;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m25884f4(final BLiveAddStickerResult bLiveAddStickerResult, List list) {
        if (list != null) {
            c.from(list).doOnNext(new e30() { // from class: l.kdd0
                public final void call(Object obj) {
                    BLiveStickerMetaDataItem bLiveStickerMetaDataItem = (BLiveStickerMetaDataItem) obj;
                    LiveStickerResManager.m5824w().m5837M(bLiveStickerMetaDataItem.id, bLiveStickerMetaDataItem);
                }
            }).filter(new w9j() { // from class: l.ldd0
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(bLiveAddStickerResult.templateId, ((BLiveStickerMetaDataItem) obj).id));
                }
            }).map(new w9j() { // from class: l.mdd0
                public final Object call(Object obj) {
                    return ((BLiveStickerMetaDataItem) obj).fillResult(bLiveAddStickerResult);
                }
            }).subscribe(ffw.d(new e30() { // from class: l.ndd0
                public final void call(Object obj) {
                    this.f15960a.m25894p4((BLiveAddStickerResult) obj);
                }
            }));
            this.f22239j = true;
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m25885g4(BLiveAddStickerResult bLiveAddStickerResult) {
        InterfaceC0325c interfaceC0325cM5848b = ((RoomStickerContainer) ((bwr) this).viewModel).m5848b(bLiveAddStickerResult);
        this.f22238i = interfaceC0325cM5848b;
        m25895q4(bLiveAddStickerResult, interfaceC0325cM5848b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ Boolean m25886h4(BLiveAddStickerResult bLiveAddStickerResult) {
        List list = ((am40) m25547E2()).m20501A2().mo19689j().liveStickerIds;
        return Boolean.valueOf(!vwb.J(list) && list.contains(bLiveAddStickerResult.id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ Boolean m25887i4(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        return Boolean.valueOf(TextUtils.equals(liveStickerChangeMsg.getRoomId(), ((am40) m25547E2()).m17239o()));
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m25888j4(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        List liveStickersList = liveStickerChangeMsg.getLiveStickersList();
        if (vwb.J(liveStickersList)) {
            m25881n4();
            return;
        }
        LongLinkLiveMessage.LiveSticker liveSticker = (LongLinkLiveMessage.LiveSticker) liveStickersList.get(0);
        BLiveAddStickerResult bLiveAddStickerResultNew_ = BLiveAddStickerResult.new_();
        bLiveAddStickerResultNew_.id = liveSticker.getId();
        bLiveAddStickerResultNew_.templateId = liveSticker.getTemplateId();
        bLiveAddStickerResultNew_.version = liveSticker.getVersion();
        bLiveAddStickerResultNew_.content = liveSticker.getContent();
        BLivePosition bLivePositionNew_ = BLivePosition.new_();
        bLivePositionNew_.x = liveSticker.getPosition().getX();
        bLivePositionNew_.y = liveSticker.getPosition().getY();
        bLiveAddStickerResultNew_.position = bLivePositionNew_;
        bLiveAddStickerResultNew_.giftIcon = liveSticker.getGiftIcon();
        bLiveAddStickerResultNew_.giftId = liveSticker.getGiftId();
        m25892m4(bLiveAddStickerResultNew_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ c m25889k4(roj0 roj0Var) {
        return duringCreated(LivingNormalApiProvider.m4937s4(((am40) m25547E2()).m17239o()));
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m25890l4(Boolean bool) {
        xdl0.M(((bwr) this).viewModel, bool.booleanValue());
    }

    /* JADX INFO: renamed from: m1 */
    public void m25891m1() {
        if (this.f22239j) {
            LiveStickerResManager.m5824w().m5838N();
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final void m25892m4(BLiveAddStickerResult bLiveAddStickerResult) {
        BLiveAddStickerResult bLiveAddStickerResultM25883d4;
        m25881n4();
        if (r610.N(this) || bLiveAddStickerResult == null || (bLiveAddStickerResultM25883d4 = m25883d4(bLiveAddStickerResult)) == null) {
            return;
        }
        m25893o4(bLiveAddStickerResultM25883d4);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        m25881n4();
    }

    /* JADX INFO: renamed from: o4 */
    public final void m25893o4(final BLiveAddStickerResult bLiveAddStickerResult) {
        m25881n4();
        e51.G(new Runnable() { // from class: l.hdd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11993a.m25885g4(bLiveAddStickerResult);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public final void m25894p4(BLiveAddStickerResult bLiveAddStickerResult) {
        c cVarDuringCreated = duringCreated(LiveStickerResManager.m5824w().m5834J(bLiveAddStickerResult).filter(new w9j() { // from class: l.idd0
            public final Object call(Object obj) {
                return Boolean.valueOf(LiveStickerResManager.m5824w().m5845z((BLiveAddStickerResult) ((Pair) obj).first));
            }
        }).map(new w9j() { // from class: l.jdd0
            public final Object call(Object obj) {
                return roj0.a;
            }
        }));
        b<roj0> bVar = this.f22240k;
        Objects.requireNonNull(bVar);
        cVarDuringCreated.subscribe(ffw.d(new d7u(bVar)));
    }

    /* JADX INFO: renamed from: q4 */
    public final void m25895q4(BLiveAddStickerResult bLiveAddStickerResult, InterfaceC0325c interfaceC0325c) {
        BLiveStickerMetaDataItem bLiveStickerMetaDataItemM5843x;
        if (!(interfaceC0325c instanceof GiftSticker) || (bLiveStickerMetaDataItemM5843x = LiveStickerResManager.m5824w().m5843x(bLiveAddStickerResult.templateId)) == null) {
            return;
        }
        GiftSticker giftSticker = (GiftSticker) interfaceC0325c;
        giftSticker.setGiftPosition(bLiveStickerMetaDataItemM5843x.giftCfg.position);
        giftSticker.m5725k0(bLiveAddStickerResult.giftIcon, bLiveStickerMetaDataItemM5843x.giftCfg.backgroundUrl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m25896t() {
        super.t();
        duringCreated((c) m25548F2().StickerEvent.changeVisible().g()).subscribe(ffw.d(new e30() { // from class: l.edd0
            public final void call(Object obj) {
                this.f9679a.m25890l4((Boolean) obj);
            }
        }));
        duringCreated(((am40) m25547E2()).m14509K0().filter(new w9j() { // from class: l.pdd0
            public final Object call(Object obj) {
                return this.f17206a.m25886h4((BLiveAddStickerResult) obj);
            }
        })).subscribe(ffw.d(new e30() { // from class: l.qdd0
            public final void call(Object obj) {
                this.f17941a.m25892m4((BLiveAddStickerResult) obj);
            }
        }));
        duringCreated(((am40) m25547E2()).m14511L0().filter(new w9j() { // from class: l.rdd0
            public final Object call(Object obj) {
                return this.f18480a.m25887i4((LongLinkLiveMessage.LiveStickerChangeMsg) obj);
            }
        })).subscribe(ffw.d(new e30() { // from class: l.sdd0
            public final void call(Object obj) {
                this.f18933a.m25888j4((LongLinkLiveMessage.LiveStickerChangeMsg) obj);
            }
        }));
        c cVarDuringCreated = duringCreated(ConnectivityReceiver.m().skip(1).filter(new w9j() { // from class: l.tdd0
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).map(new w9j() { // from class: l.udd0
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).observeOn(jo0.a()));
        b<roj0> bVar = this.f22240k;
        Objects.requireNonNull(bVar);
        cVarDuringCreated.subscribe(ffw.d(new d7u(bVar)));
        duringCreated(this.f22240k.flatMap(new w9j() { // from class: l.vdd0
            public final Object call(Object obj) {
                return this.f21088a.m25889k4((roj0) obj);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.qdd0
            public final void call(Object obj) {
                this.f17941a.m25892m4((BLiveAddStickerResult) obj);
            }
        }, new e30() { // from class: l.odd0
            public final void call(Object obj) {
                xdd0.m25875Y3((Throwable) obj);
            }
        }));
    }
}
