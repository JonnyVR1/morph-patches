package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.base.data.BLivePosition;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerMetaData;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.C12898b;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerResManager;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.b5g0;
import p153l.bnl0;
import p153l.dhw;
import p153l.dum;
import p153l.e9u;
import p153l.fo0;
import p153l.htd0;
import p153l.i6t;
import p153l.jfv;
import p153l.jyb;
import p153l.mbt;
import p153l.mu40;
import p153l.o1j0;
import p153l.qcj;
import p153l.rcj;
import p153l.uxj0;
import p153l.wft;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.b */
/* JADX INFO: loaded from: classes4.dex */
public class C12898b extends i6t<mu40, LiveStickerContainer> {

    /* JADX INFO: renamed from: i */
    public List<BLiveStickerMetaDataItem> f49574i;

    /* JADX INFO: renamed from: j */
    public C22507a<List<BLiveStickerMetaDataItem>> f49575j;

    /* JADX INFO: renamed from: k */
    public C22508b<uxj0> f49576k;

    /* JADX INFO: renamed from: l */
    public boolean f49577l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.b$a */
    public class a implements LiveStickerContainer.InterfaceC12895b {
        public a() {
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer.InterfaceC12895b
        /* JADX INFO: renamed from: a */
        public void mo73500a(InterfaceC12899c interfaceC12899c) {
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer.InterfaceC12895b
        /* JADX INFO: renamed from: b */
        public void mo73501b(InterfaceC12899c interfaceC12899c) {
            C12898b.this.f49577l = true;
            C12898b.this.m73597U4(true);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer.InterfaceC12895b
        /* JADX INFO: renamed from: c */
        public void mo73502c(InterfaceC12899c interfaceC12899c, boolean z) {
            C12898b.this.m73597U4(false);
            C12898b c12898b = C12898b.this;
            if (z) {
                c12898b.m73650x4(interfaceC12899c, false);
            } else {
                c12898b.m73644R4(1, interfaceC12899c);
            }
            C12898b.this.f49577l = false;
        }
    }

    public C12898b(dum dumVar, LiveStickerContainer liveStickerContainer) {
        super(dumVar);
        this.f49575j = C22507a.m222758b();
        this.f49576k = C22508b.m222767b();
        mo52715C(liveStickerContainer);
        init();
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m73587K3(List list) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m73590N3(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m73591O3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public void m73597U4(boolean z) {
        ((LiveStickerContainer) this.viewModel).setMaskVisibility(z);
        m213811F2().StickerEvent.setMaskVisibility().mo199273j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: V4 */
    private void m73599V4(final BLiveAddStickerResult bLiveAddStickerResult) {
        if (!LiveStickerResManager.m73530w().m73551z(bLiveAddStickerResult)) {
            duringCreated((C22421c) LiveStickerResManager.m73530w().m73540J(bLiveAddStickerResult).filter(new qcj() { // from class: l.l9u
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(LiveStickerResManager.m73530w().m73551z((BLiveAddStickerResult) ((Pair) obj).first));
                }
            }).map(new qcj() { // from class: l.m9u
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C12898b.m73618o4((Pair) obj);
                }
            })).subscribe(dhw.m115825d(new y20() { // from class: l.n9u
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140952a.m73638L4(bLiveAddStickerResult, (BLiveAddStickerResult) obj);
                }
            }));
        } else {
            ((LiveStickerContainer) this.viewModel).m73490m(bLiveAddStickerResult);
            m73647W4(bLiveAddStickerResult);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m73600W3(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ C22421c m73603Z3(BLiveStickerMetaData bLiveStickerMetaData) {
        return LiveStickerResManager.m73530w().m73538H(bLiveStickerMetaData.Version) ? LiveStickerResManager.m73530w().m73547u(bLiveStickerMetaData.Url, bLiveStickerMetaData.Version) : C22421c.just(uxj0.f181467a);
    }

    private void init() {
        ((LiveStickerContainer) this.viewModel).setOnDragListener(new a());
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ BLiveAddStickerResult m73618o4(Pair pair) {
        return (BLiveAddStickerResult) pair.first;
    }

    /* JADX INFO: renamed from: y4 */
    private BLiveAddStickerResult m73626y4(BLiveAddStickerResult bLiveAddStickerResult) {
        List<BLiveStickerMetaDataItem> list = this.f49574i;
        if (list == null || bLiveAddStickerResult == null) {
            return null;
        }
        for (BLiveStickerMetaDataItem bLiveStickerMetaDataItem : list) {
            if (TextUtils.equals(bLiveStickerMetaDataItem.f45290id, bLiveAddStickerResult.templateId)) {
                bLiveStickerMetaDataItem.fillResult(bLiveAddStickerResult);
                return bLiveAddStickerResult;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A4 */
    public final BLiveStickerMetaDataItem m73627A4(String str) {
        List<BLiveStickerMetaDataItem> list = this.f49574i;
        if (list == null) {
            return null;
        }
        for (BLiveStickerMetaDataItem bLiveStickerMetaDataItem : list) {
            if (TextUtils.equals(bLiveStickerMetaDataItem.f45290id, str)) {
                return bLiveStickerMetaDataItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m73628B4(BLiveAddStickerResult bLiveAddStickerResult) {
        InterfaceC12899c currentSticker = ((LiveStickerContainer) this.viewModel).getCurrentSticker();
        if (currentSticker == null || !TextUtils.equals(currentSticker.getTemplateId(), bLiveAddStickerResult.templateId)) {
            return;
        }
        currentSticker.setCustomId(bLiveAddStickerResult.f45177id);
        if (currentSticker instanceof GiftSticker) {
            m73647W4(bLiveAddStickerResult);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m73629C4(Throwable th) {
        this.f49576k.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m73630D4(List list) {
        this.f49574i = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ C22421c m73631E4(uxj0 uxj0Var) {
        return ((mu40) m213810E2()).m118363A2().m122890f().filter(new qcj() { // from class: l.j9u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty(((BLiveRoom) obj).f45172id));
            }
        });
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m73632F4(List list, final BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        BLiveStickerMetaDataItem bLiveStickerMetaDataItem2 = (BLiveStickerMetaDataItem) jyb.m147529r(this.f49574i, new qcj() { // from class: l.t9u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveStickerMetaDataItem) obj).f45290id, bLiveStickerMetaDataItem.f45290id));
            }
        });
        if (bLiveStickerMetaDataItem2 != null) {
            list.add(bLiveStickerMetaDataItem2);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ List m73633G4(List list) {
        final ArrayList arrayList = new ArrayList(list.size());
        jyb.m147537z(list, new y20() { // from class: l.k9u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124575a.m73632F4(arrayList, (BLiveStickerMetaDataItem) obj);
            }
        });
        this.f49575j.m137019l(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m73634H4(uxj0 uxj0Var) {
        m73645S4();
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m73635I4(Integer num) {
        ((LiveStickerContainer) this.viewModel).m73493q(num.intValue());
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m73636J4(Throwable th) {
        this.f49576k.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m73637K4(BLiveAddStickerResult bLiveAddStickerResult) {
        BLiveAddStickerResult bLiveAddStickerResultM73626y4;
        ((LiveStickerContainer) this.viewModel).m73486J();
        if (bLiveAddStickerResult == null || (bLiveAddStickerResultM73626y4 = m73626y4(bLiveAddStickerResult)) == null) {
            return;
        }
        m73599V4(bLiveAddStickerResultM73626y4);
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m73638L4(BLiveAddStickerResult bLiveAddStickerResult, BLiveAddStickerResult bLiveAddStickerResult2) {
        ((LiveStickerContainer) this.viewModel).m73490m(bLiveAddStickerResult);
        m73647W4(bLiveAddStickerResult);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ C22421c m73639M4(b5g0 b5g0Var) {
        return m73651z4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m73640N4(Boolean bool) {
        bnl0.m105524M((View) this.viewModel, bool.booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m73641O4(uxj0 uxj0Var) {
        List<String> list = ((mu40) m213810E2()).m118363A2().mo122891j().liveStickerIds;
        if (jyb.m147479J(list)) {
            return;
        }
        BLiveAddStickerResult bLiveAddStickerResultM144721h = ((jfv) zrv.m221194l(htd0.f111520b)).m144721h(list.get(0));
        if (bLiveAddStickerResultM144721h == null || m73626y4(bLiveAddStickerResultM144721h) == null) {
            return;
        }
        m73599V4(bLiveAddStickerResultM144721h);
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m73642P4(LiveControlMessage liveControlMessage) {
        InterfaceC12899c currentSticker = ((LiveStickerContainer) this.viewModel).getCurrentSticker();
        if (currentSticker == null) {
            return;
        }
        if (TextUtils.equals(liveControlMessage.type, "sticker_modify_result_reject")) {
            BLiveStickerMetaDataItem bLiveStickerMetaDataItemM73627A4 = m73627A4(currentSticker.getTemplateId());
            if (bLiveStickerMetaDataItemM73627A4 == null) {
                ((LiveStickerContainer) this.viewModel).m73486J();
            } else if (wft.m206159b(2)) {
                ((LiveStickerContainer) this.viewModel).m73483G(bLiveStickerMetaDataItemM73627A4.defaultContent);
            } else {
                this.f49576k.m137019l(uxj0.f181467a);
            }
        }
        o1j0.m165651y(liveControlMessage.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m73643Q4(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        if (!TextUtils.equals(liveStickerChangeMsg.getRoomId(), ((mu40) m213810E2()).m202194o()) || this.f49577l) {
            return;
        }
        List<LongLinkLiveMessage.LiveSticker> liveStickersList = liveStickerChangeMsg.getLiveStickersList();
        if (jyb.m147479J(liveStickersList)) {
            ((LiveStickerContainer) this.viewModel).m73486J();
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
        BLiveAddStickerResult bLiveAddStickerResultM73626y4 = m73626y4(bLiveAddStickerResultNew_);
        if (bLiveAddStickerResultM73626y4 != null) {
            m73599V4(bLiveAddStickerResultM73626y4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R4 */
    public final void m73644R4(int i, InterfaceC12899c interfaceC12899c) {
        Pair<Float, Float> position = interfaceC12899c.getPosition();
        String content = interfaceC12899c.getContent();
        String category = interfaceC12899c.getCategory();
        String templateId = interfaceC12899c.getTemplateId();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templateId", (Object) templateId);
        jSONObject.put("category", (Object) category);
        jSONObject.put("content", (Object) content);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(BaseSei.f14624X, position.first);
        jSONObject2.put(BaseSei.f14625Y, position.second);
        jSONObject.put("position", (Object) jSONObject2);
        jSONObject.put("changeType", (Object) Integer.valueOf(i));
        LivingNormalApiProvider.m72738q6(((mu40) m213810E2()).m202194o(), interfaceC12899c.getCustomId(), jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public final void m73645S4() {
        duringCreated(LivingNormalApiProvider.m72754s4(((mu40) m213810E2()).m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.h9u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108434a.m73637K4((BLiveAddStickerResult) obj);
            }
        }, new y20() { // from class: l.i9u
            @Override // p153l.y20
            public final void call(Object obj) {
                C12898b.m73591O3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(LivingNormalApiProvider.m72719o5().flatMap(new qcj() { // from class: l.u8u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C12898b.m73603Z3((BLiveStickerMetaData) obj);
            }
        }).flatMap(new qcj() { // from class: l.x8u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveStickerResManager.m73530w().m73539I();
            }
        }).doOnNext(new y20() { // from class: l.y8u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198042a.m73630D4((List) obj);
            }
        }).map(new qcj() { // from class: l.z8u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).flatMap(new qcj() { // from class: l.a9u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f69078a.m73631E4((uxj0) obj);
            }
        }).flatMap(new qcj() { // from class: l.b9u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72521S5(((BLiveRoom) obj).f45172id);
            }
        }).map(new qcj() { // from class: l.c9u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f80525a.m73633G4((List) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.d9u
            @Override // p153l.y20
            public final void call(Object obj) {
                C12898b.m73587K3((List) obj);
            }
        }, new y20() { // from class: l.f9u
            @Override // p153l.y20
            public final void call(Object obj) {
                C12898b.m73590N3((Throwable) obj);
            }
        }));
        duringCreated(this.f49576k).subscribe(dhw.m115829h(new y20() { // from class: l.g9u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102884a.m73634H4((uxj0) obj);
            }
        }));
        duringCreated(m213811F2().StickerEvent.addSticker().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.v8u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182894a.m73649w4((BLiveAddStickerResult) obj);
            }
        }));
        duringCreated(m213811F2().ChatViewRightChangeEvent.chatRightChange().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.w8u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187932a.m73635I4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T4 */
    public void m73646T4(String str) {
        InterfaceC12899c interfaceC12899cM73483G = ((LiveStickerContainer) this.viewModel).m73483G(str);
        if (interfaceC12899cM73483G != null) {
            m73644R4(2, interfaceC12899cM73483G);
        }
        ((LiveStickerContainer) this.viewModel).m73495u();
    }

    /* JADX INFO: renamed from: W4 */
    public final void m73647W4(final BLiveAddStickerResult bLiveAddStickerResult) {
        InterfaceC12899c currentSticker = ((LiveStickerContainer) this.viewModel).getCurrentSticker();
        if (currentSticker instanceof GiftSticker) {
            BLiveStickerMetaDataItem bLiveStickerMetaDataItem = (BLiveStickerMetaDataItem) jyb.m147529r(this.f49574i, new qcj() { // from class: l.s9u
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(bLiveAddStickerResult.templateId.equals(((BLiveStickerMetaDataItem) obj).f45290id));
                }
            });
            GiftSticker giftSticker = (GiftSticker) currentSticker;
            giftSticker.setGiftPosition(bLiveStickerMetaDataItem.giftCfg.position);
            giftSticker.m73435k0(bLiveAddStickerResult.giftIcon, bLiveStickerMetaDataItem.giftCfg.backgroundUrl);
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        ((jfv) zrv.m221194l(htd0.f111520b)).m144716c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138860d3(b5g0.class, new qcj() { // from class: l.t8u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f172574a.m73639M4((b5g0) obj);
            }
        });
        duringCreated(m213811F2().StickerEvent.changeVisible().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.p9u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151184a.m73640N4((Boolean) obj);
            }
        }));
        duringCreated(C22421c.zip(((mu40) m213810E2()).m202192l().filter(new mbt()).take(1), m73651z4(), new rcj() { // from class: l.w9u
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return uxj0.f181467a;
            }
        })).subscribe(dhw.m115825d(new y20() { // from class: l.x9u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192965a.m73641O4((uxj0) obj);
            }
        }));
        duringCreated(((mu40) m213810E2()).m168539n1().filter(new qcj() { // from class: l.y9u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                LiveControlMessage liveControlMessage = (LiveControlMessage) obj;
                return Boolean.valueOf(TextUtils.equals(liveControlMessage.type, "sticker_modify_result_submit") || TextUtils.equals(liveControlMessage.type, "sticker_modify_result_approve") || TextUtils.equals(liveControlMessage.type, "sticker_modify_result_reject"));
            }
        })).subscribe(dhw.m115825d(new y20() { // from class: l.z9u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203511a.m73642P4((LiveControlMessage) obj);
            }
        }));
        duringCreated(((mu40) m213810E2()).m168463L0()).subscribe(dhw.m115825d(new y20() { // from class: l.aau
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69172a.m73643Q4((LongLinkLiveMessage.LiveStickerChangeMsg) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(ConnectivityReceiver.m82473m().skip(1).filter(new qcj() { // from class: l.bau
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).map(new qcj() { // from class: l.cau
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).observeOn(fo0.m126432a()));
        C22508b<uxj0> c22508b = this.f49576k;
        Objects.requireNonNull(c22508b);
        c22421cDuringCreated.subscribe(dhw.m115825d(new e9u(c22508b)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public void m73649w4(BLiveAddStickerResult bLiveAddStickerResult) {
        InterfaceC12899c currentSticker = ((LiveStickerContainer) this.viewModel).getCurrentSticker();
        if (currentSticker != null) {
            m73650x4(currentSticker, true);
        }
        InterfaceC12899c interfaceC12899cM73490m = ((LiveStickerContainer) this.viewModel).m73490m(bLiveAddStickerResult);
        String strM202194o = ((mu40) m213810E2()).m202194o();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templateId", (Object) bLiveAddStickerResult.templateId);
        jSONObject.put("category", (Object) bLiveAddStickerResult.category);
        jSONObject.put("content", (Object) interfaceC12899cM73490m.getContent());
        if (!TextUtils.isEmpty(bLiveAddStickerResult.giftId)) {
            jSONObject.put("giftId", (Object) bLiveAddStickerResult.giftId);
        }
        JSONObject jSONObject2 = new JSONObject();
        Pair<Float, Float> position = interfaceC12899cM73490m.getPosition();
        jSONObject2.put(BaseSei.f14624X, position.first);
        jSONObject2.put(BaseSei.f14625Y, position.second);
        jSONObject.put("position", (Object) jSONObject2);
        duringCreated(LivingNormalApiProvider.m72816z3(strM202194o, jSONObject).filter(new qcj() { // from class: l.o9u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveAddStickerResult) obj) != null);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.q9u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156265a.m73628B4((BLiveAddStickerResult) obj);
            }
        }, new y20() { // from class: l.r9u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161870a.m73629C4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final void m73650x4(InterfaceC12899c interfaceC12899c, boolean z) {
        if (interfaceC12899c != null) {
            LivingNormalApiProvider.m72673j4(((mu40) m213810E2()).m202194o(), interfaceC12899c.getCustomId(), z).subscribe(dhw.m115826e(new y20() { // from class: l.u9u
                @Override // p153l.y20
                public final void call(Object obj) {
                    C12898b.m73600W3((uxj0) obj);
                }
            }, new y20() { // from class: l.v9u
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f183044a.m73636J4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final C22421c<List<BLiveStickerMetaDataItem>> m73651z4() {
        return this.f49575j.asObservable();
    }
}
