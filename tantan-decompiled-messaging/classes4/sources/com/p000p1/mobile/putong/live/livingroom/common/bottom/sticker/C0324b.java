package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.C0324b;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerResManager;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p1.mobile.putong.live.base.data.BLivePosition;
import com.p1.mobile.putong.live.base.data.BLiveRoom;
import com.p1.mobile.putong.live.base.data.BLiveStickerMetaData;
import com.p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.bwr;
import l.e30;
import l.ffw;
import l.fld0;
import l.idv;
import l.jo0;
import l.lsi0;
import l.roj0;
import l.vdt;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xdl0;
import l.ypv;
import p002l.bsm;
import p002l.d7u;
import p002l.h4t;
import p002l.l9t;
import p002l.rwf0;
import p002l.yl40;
import rx.c;
import rx.subjects.b;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0324b extends h4t<yl40, LiveStickerContainer> {

    /* JADX INFO: renamed from: i */
    public List<BLiveStickerMetaDataItem> f4768i;

    /* JADX INFO: renamed from: j */
    public rx.subjects.a<List<BLiveStickerMetaDataItem>> f4769j;

    /* JADX INFO: renamed from: k */
    public b<roj0> f4770k;

    /* JADX INFO: renamed from: l */
    public boolean f4771l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.b$a */
    public class a implements LiveStickerContainer.InterfaceC0321b {
        public a() {
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer.InterfaceC0321b
        /* JADX INFO: renamed from: a */
        public void mo5792a(InterfaceC0325c interfaceC0325c) {
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer.InterfaceC0321b
        /* JADX INFO: renamed from: b */
        public void mo5793b(InterfaceC0325c interfaceC0325c) {
            C0324b.this.f4771l = true;
            C0324b.this.m5897U4(true);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer.InterfaceC0321b
        /* JADX INFO: renamed from: c */
        public void mo5794c(InterfaceC0325c interfaceC0325c, boolean z) {
            C0324b.this.m5897U4(false);
            C0324b c0324b = C0324b.this;
            if (z) {
                c0324b.m5952x4(interfaceC0325c, false);
            } else {
                c0324b.m5944R4(1, interfaceC0325c);
            }
            C0324b.this.f4771l = false;
        }
    }

    public C0324b(bsm bsmVar, LiveStickerContainer liveStickerContainer) {
        super(bsmVar);
        this.f4769j = rx.subjects.a.b();
        this.f4770k = b.b();
        C(liveStickerContainer);
        init();
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m5887K3(List list) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m5890N3(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m5891O3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public void m5897U4(boolean z) {
        ((LiveStickerContainer) ((bwr) this).viewModel).setMaskVisibility(z);
        m25548F2().StickerEvent.setMaskVisibility().j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: V4 */
    private void m5899V4(final BLiveAddStickerResult bLiveAddStickerResult) {
        if (!LiveStickerResManager.m5824w().m5845z(bLiveAddStickerResult)) {
            duringCreated(LiveStickerResManager.m5824w().m5834J(bLiveAddStickerResult).filter(new w9j() { // from class: l.k7u
                public final Object call(Object obj) {
                    return Boolean.valueOf(LiveStickerResManager.m5824w().m5845z((BLiveAddStickerResult) ((Pair) obj).first));
                }
            }).map(new w9j() { // from class: l.l7u
                public final Object call(Object obj) {
                    return C0324b.m5918o4((Pair) obj);
                }
            })).subscribe(ffw.d(new e30() { // from class: l.m7u
                public final void call(Object obj) {
                    this.f15267a.m5938L4(bLiveAddStickerResult, (BLiveAddStickerResult) obj);
                }
            }));
        } else {
            ((LiveStickerContainer) ((bwr) this).viewModel).m5782m(bLiveAddStickerResult);
            m5948W4(bLiveAddStickerResult);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m5900W3(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ c m5903Z3(BLiveStickerMetaData bLiveStickerMetaData) {
        return LiveStickerResManager.m5824w().m5832H(bLiveStickerMetaData.Version) ? LiveStickerResManager.m5824w().m5841u(bLiveStickerMetaData.Url, bLiveStickerMetaData.Version) : c.just(roj0.a);
    }

    private void init() {
        ((LiveStickerContainer) ((bwr) this).viewModel).setOnDragListener(new a());
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ BLiveAddStickerResult m5918o4(Pair pair) {
        return (BLiveAddStickerResult) pair.first;
    }

    /* JADX INFO: renamed from: y4 */
    private BLiveAddStickerResult m5926y4(BLiveAddStickerResult bLiveAddStickerResult) {
        List<BLiveStickerMetaDataItem> list = this.f4768i;
        if (list == null || bLiveAddStickerResult == null) {
            return null;
        }
        for (BLiveStickerMetaDataItem bLiveStickerMetaDataItem : list) {
            if (TextUtils.equals(bLiveStickerMetaDataItem.id, bLiveAddStickerResult.templateId)) {
                bLiveStickerMetaDataItem.fillResult(bLiveAddStickerResult);
                return bLiveAddStickerResult;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A4 */
    public final BLiveStickerMetaDataItem m5927A4(String str) {
        List<BLiveStickerMetaDataItem> list = this.f4768i;
        if (list == null) {
            return null;
        }
        for (BLiveStickerMetaDataItem bLiveStickerMetaDataItem : list) {
            if (TextUtils.equals(bLiveStickerMetaDataItem.id, str)) {
                return bLiveStickerMetaDataItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m5928B4(BLiveAddStickerResult bLiveAddStickerResult) {
        InterfaceC0325c currentSticker = ((LiveStickerContainer) ((bwr) this).viewModel).getCurrentSticker();
        if (currentSticker == null || !TextUtils.equals(currentSticker.getTemplateId(), bLiveAddStickerResult.templateId)) {
            return;
        }
        currentSticker.setCustomId(bLiveAddStickerResult.id);
        if (currentSticker instanceof GiftSticker) {
            m5948W4(bLiveAddStickerResult);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m5929C4(Throwable th) {
        this.f4770k.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m5930D4(List list) {
        this.f4768i = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ c m5931E4(roj0 roj0Var) {
        return ((yl40) m25547E2()).m20501A2().m21485f().filter(new w9j() { // from class: l.i7u
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty(((BLiveAbsRoom) ((BLiveRoom) obj)).id));
            }
        });
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m5932F4(List list, final BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        BLiveStickerMetaDataItem bLiveStickerMetaDataItem2 = (BLiveStickerMetaDataItem) vwb.r(this.f4768i, new w9j() { // from class: l.s7u
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveStickerMetaDataItem) obj).id, bLiveStickerMetaDataItem.id));
            }
        });
        if (bLiveStickerMetaDataItem2 != null) {
            list.add(bLiveStickerMetaDataItem2);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ List m5933G4(List list) {
        final ArrayList arrayList = new ArrayList(list.size());
        vwb.z(list, new e30() { // from class: l.j7u
            public final void call(Object obj) {
                this.f13624a.m5932F4(arrayList, (BLiveStickerMetaDataItem) obj);
            }
        });
        this.f4769j.onNext(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m5934H4(roj0 roj0Var) {
        m5945S4();
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m5935I4(Integer num) {
        ((LiveStickerContainer) ((bwr) this).viewModel).m5785q(num.intValue());
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m5936J4(Throwable th) {
        this.f4770k.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m5937K4(BLiveAddStickerResult bLiveAddStickerResult) {
        BLiveAddStickerResult bLiveAddStickerResultM5926y4;
        ((LiveStickerContainer) ((bwr) this).viewModel).m5777J();
        if (bLiveAddStickerResult == null || (bLiveAddStickerResultM5926y4 = m5926y4(bLiveAddStickerResult)) == null) {
            return;
        }
        m5899V4(bLiveAddStickerResultM5926y4);
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m5938L4(BLiveAddStickerResult bLiveAddStickerResult, BLiveAddStickerResult bLiveAddStickerResult2) {
        ((LiveStickerContainer) ((bwr) this).viewModel).m5782m(bLiveAddStickerResult);
        m5948W4(bLiveAddStickerResult);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ c m5939M4(rwf0 rwf0Var) {
        return m5953z4();
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m5940N4(Boolean bool) {
        xdl0.M(((bwr) this).viewModel, bool.booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m5941O4(roj0 roj0Var) {
        List list = ((yl40) m25547E2()).m20501A2().mo19689j().liveStickerIds;
        if (vwb.J(list)) {
            return;
        }
        BLiveAddStickerResult bLiveAddStickerResultH = ((idv) ypv.l(fld0.b)).h((String) list.get(0));
        if (bLiveAddStickerResultH == null || m5926y4(bLiveAddStickerResultH) == null) {
            return;
        }
        m5899V4(bLiveAddStickerResultH);
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m5942P4(LiveControlMessage liveControlMessage) {
        InterfaceC0325c currentSticker = ((LiveStickerContainer) ((bwr) this).viewModel).getCurrentSticker();
        if (currentSticker == null) {
            return;
        }
        if (TextUtils.equals(liveControlMessage.type, "sticker_modify_result_reject")) {
            BLiveStickerMetaDataItem bLiveStickerMetaDataItemM5927A4 = m5927A4(currentSticker.getTemplateId());
            if (bLiveStickerMetaDataItemM5927A4 == null) {
                ((LiveStickerContainer) ((bwr) this).viewModel).m5777J();
            } else if (vdt.b(2)) {
                ((LiveStickerContainer) ((bwr) this).viewModel).m5774G(bLiveStickerMetaDataItemM5927A4.defaultContent);
            } else {
                this.f4770k.onNext(roj0.a);
            }
        }
        lsi0.y(liveControlMessage.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m5943Q4(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        if (!TextUtils.equals(liveStickerChangeMsg.getRoomId(), ((yl40) m25547E2()).m17239o()) || this.f4771l) {
            return;
        }
        List liveStickersList = liveStickerChangeMsg.getLiveStickersList();
        if (vwb.J(liveStickersList)) {
            ((LiveStickerContainer) ((bwr) this).viewModel).m5777J();
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
        BLiveAddStickerResult bLiveAddStickerResultM5926y4 = m5926y4(bLiveAddStickerResultNew_);
        if (bLiveAddStickerResultM5926y4 != null) {
            m5899V4(bLiveAddStickerResultM5926y4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R4 */
    public final void m5944R4(int i, InterfaceC0325c interfaceC0325c) {
        Pair<Float, Float> position = interfaceC0325c.getPosition();
        String content = interfaceC0325c.getContent();
        String category = interfaceC0325c.getCategory();
        String templateId = interfaceC0325c.getTemplateId();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templateId", templateId);
        jSONObject.put("category", category);
        jSONObject.put("content", content);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("x", position.first);
        jSONObject2.put("y", position.second);
        jSONObject.put("position", jSONObject2);
        jSONObject.put("changeType", Integer.valueOf(i));
        LivingNormalApiProvider.m4921q6(((yl40) m25547E2()).m17239o(), interfaceC0325c.getCustomId(), jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public final void m5945S4() {
        duringCreated(LivingNormalApiProvider.m4937s4(((yl40) m25547E2()).m17239o())).subscribe(ffw.e(new e30() { // from class: l.g7u
            public final void call(Object obj) {
                this.f11304a.m5937K4((BLiveAddStickerResult) obj);
            }
        }, new e30() { // from class: l.h7u
            public final void call(Object obj) {
                C0324b.m5891O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m5946T() {
        super.T();
        duringCreated(LivingNormalApiProvider.m4902o5().flatMap(new w9j() { // from class: l.t6u
            public final Object call(Object obj) {
                return C0324b.m5903Z3((BLiveStickerMetaData) obj);
            }
        }).flatMap(new w9j() { // from class: l.w6u
            public final Object call(Object obj) {
                return LiveStickerResManager.m5824w().m5833I();
            }
        }).doOnNext(new e30() { // from class: l.x6u
            public final void call(Object obj) {
                this.f22149a.m5930D4((List) obj);
            }
        }).map(new w9j() { // from class: l.y6u
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).flatMap(new w9j() { // from class: l.z6u
            public final Object call(Object obj) {
                return this.f23284a.m5931E4((roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.a7u
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4704S5(((BLiveAbsRoom) ((BLiveRoom) obj)).id);
            }
        }).map(new w9j() { // from class: l.b7u
            public final Object call(Object obj) {
                return this.f8028a.m5933G4((List) obj);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.c7u
            public final void call(Object obj) {
                C0324b.m5887K3((List) obj);
            }
        }, new e30() { // from class: l.e7u
            public final void call(Object obj) {
                C0324b.m5890N3((Throwable) obj);
            }
        }));
        duringCreated(this.f4770k).subscribe(ffw.h(new e30() { // from class: l.f7u
            public final void call(Object obj) {
                this.f10183a.m5934H4((roj0) obj);
            }
        }));
        duringCreated((c) m25548F2().StickerEvent.addSticker().g()).subscribe(ffw.h(new e30() { // from class: l.u6u
            public final void call(Object obj) {
                this.f20511a.m5951w4((BLiveAddStickerResult) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatViewRightChangeEvent.chatRightChange().g()).subscribe(ffw.h(new e30() { // from class: l.v6u
            public final void call(Object obj) {
                this.f21021a.m5935I4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T4 */
    public void m5947T4(String str) {
        InterfaceC0325c interfaceC0325cM5774G = ((LiveStickerContainer) ((bwr) this).viewModel).m5774G(str);
        if (interfaceC0325cM5774G != null) {
            m5944R4(2, interfaceC0325cM5774G);
        }
        ((LiveStickerContainer) ((bwr) this).viewModel).m5787u();
    }

    /* JADX INFO: renamed from: W4 */
    public final void m5948W4(final BLiveAddStickerResult bLiveAddStickerResult) {
        InterfaceC0325c currentSticker = ((LiveStickerContainer) ((bwr) this).viewModel).getCurrentSticker();
        if (currentSticker instanceof GiftSticker) {
            BLiveStickerMetaDataItem bLiveStickerMetaDataItem = (BLiveStickerMetaDataItem) vwb.r(this.f4768i, new w9j() { // from class: l.r7u
                public final Object call(Object obj) {
                    return Boolean.valueOf(bLiveAddStickerResult.templateId.equals(((BLiveStickerMetaDataItem) obj).id));
                }
            });
            GiftSticker giftSticker = (GiftSticker) currentSticker;
            giftSticker.setGiftPosition(bLiveStickerMetaDataItem.giftCfg.position);
            giftSticker.m5725k0(bLiveAddStickerResult.giftIcon, bLiveStickerMetaDataItem.giftCfg.backgroundUrl);
        }
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        ((idv) ypv.l(fld0.b)).c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m5950t() {
        super.t();
        m14188d3(rwf0.class, new w9j() { // from class: l.s6u
            public final Object call(Object obj) {
                return this.f18814a.m5939M4((rwf0) obj);
            }
        });
        duringCreated((c) m25548F2().StickerEvent.changeVisible().g()).subscribe(ffw.d(new e30() { // from class: l.o7u
            public final void call(Object obj) {
                this.f16424a.m5940N4((Boolean) obj);
            }
        }));
        duringCreated(c.zip(((yl40) m25547E2()).m17236l().filter(new l9t()).take(1), m5953z4(), new x9j() { // from class: l.v7u
            public final Object call(Object obj, Object obj2) {
                return roj0.a;
            }
        })).subscribe(ffw.d(new e30() { // from class: l.w7u
            public final void call(Object obj) {
                this.f21551a.m5941O4((roj0) obj);
            }
        }));
        duringCreated(((yl40) m25547E2()).m14589n1().filter(new w9j() { // from class: l.x7u
            public final Object call(Object obj) {
                LiveControlMessage liveControlMessage = (LiveControlMessage) obj;
                return Boolean.valueOf(TextUtils.equals(liveControlMessage.type, "sticker_modify_result_submit") || TextUtils.equals(liveControlMessage.type, "sticker_modify_result_approve") || TextUtils.equals(liveControlMessage.type, "sticker_modify_result_reject"));
            }
        })).subscribe(ffw.d(new e30() { // from class: l.y7u
            public final void call(Object obj) {
                this.f22735a.m5942P4((LiveControlMessage) obj);
            }
        }));
        duringCreated(((yl40) m25547E2()).m14511L0()).subscribe(ffw.d(new e30() { // from class: l.z7u
            public final void call(Object obj) {
                this.f23301a.m5943Q4((LongLinkLiveMessage.LiveStickerChangeMsg) obj);
            }
        }));
        c cVarDuringCreated = duringCreated(ConnectivityReceiver.m().skip(1).filter(new w9j() { // from class: l.a8u
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).map(new w9j() { // from class: l.b8u
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).observeOn(jo0.a()));
        b<roj0> bVar = this.f4770k;
        Objects.requireNonNull(bVar);
        cVarDuringCreated.subscribe(ffw.d(new d7u(bVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public void m5951w4(BLiveAddStickerResult bLiveAddStickerResult) {
        InterfaceC0325c currentSticker = ((LiveStickerContainer) ((bwr) this).viewModel).getCurrentSticker();
        if (currentSticker != null) {
            m5952x4(currentSticker, true);
        }
        InterfaceC0325c interfaceC0325cM5782m = ((LiveStickerContainer) ((bwr) this).viewModel).m5782m(bLiveAddStickerResult);
        String strM17239o = ((yl40) m25547E2()).m17239o();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templateId", bLiveAddStickerResult.templateId);
        jSONObject.put("category", bLiveAddStickerResult.category);
        jSONObject.put("content", interfaceC0325cM5782m.getContent());
        if (!TextUtils.isEmpty(bLiveAddStickerResult.giftId)) {
            jSONObject.put("giftId", bLiveAddStickerResult.giftId);
        }
        JSONObject jSONObject2 = new JSONObject();
        Pair<Float, Float> position = interfaceC0325cM5782m.getPosition();
        jSONObject2.put("x", position.first);
        jSONObject2.put("y", position.second);
        jSONObject.put("position", jSONObject2);
        duringCreated(LivingNormalApiProvider.m4999z3(strM17239o, jSONObject).filter(new w9j() { // from class: l.n7u
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveAddStickerResult) obj) != null);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.p7u
            public final void call(Object obj) {
                this.f17054a.m5928B4((BLiveAddStickerResult) obj);
            }
        }, new e30() { // from class: l.q7u
            public final void call(Object obj) {
                this.f17850a.m5929C4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final void m5952x4(InterfaceC0325c interfaceC0325c, boolean z) {
        if (interfaceC0325c != null) {
            LivingNormalApiProvider.m4856j4(((yl40) m25547E2()).m17239o(), interfaceC0325c.getCustomId(), z).subscribe(ffw.e(new e30() { // from class: l.t7u
                public final void call(Object obj) {
                    C0324b.m5900W3((roj0) obj);
                }
            }, new e30() { // from class: l.u7u
                public final void call(Object obj) {
                    this.f20535a.m5936J4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final c<List<BLiveStickerMetaDataItem>> m5953z4() {
        return this.f4769j.asObservable();
    }
}
