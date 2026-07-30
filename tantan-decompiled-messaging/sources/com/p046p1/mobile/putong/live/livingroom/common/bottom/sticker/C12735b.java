package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.base.data.BLivePosition;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerMetaData;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.C12735b;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerResManager;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.bsm;
import p149l.d7u;
import p149l.e30;
import p149l.ffw;
import p149l.fld0;
import p149l.h4t;
import p149l.idv;
import p149l.jo0;
import p149l.l9t;
import p149l.lsi0;
import p149l.roj0;
import p149l.rwf0;
import p149l.vdt;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.xdl0;
import p149l.yl40;
import p149l.ypv;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.b */
/* JADX INFO: loaded from: classes4.dex */
public class C12735b extends h4t<yl40, LiveStickerContainer> {

    /* JADX INFO: renamed from: i */
    public List<BLiveStickerMetaDataItem> f48726i;

    /* JADX INFO: renamed from: j */
    public C22392a<List<BLiveStickerMetaDataItem>> f48727j;

    /* JADX INFO: renamed from: k */
    public C22393b<roj0> f48728k;

    /* JADX INFO: renamed from: l */
    public boolean f48729l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.b$a */
    public class a implements LiveStickerContainer.InterfaceC12732b {
        public a() {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer.InterfaceC12732b
        /* JADX INFO: renamed from: a */
        public void mo72317a(InterfaceC12736c interfaceC12736c) {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer.InterfaceC12732b
        /* JADX INFO: renamed from: b */
        public void mo72318b(InterfaceC12736c interfaceC12736c) {
            C12735b.this.f48729l = true;
            C12735b.this.m72414U4(true);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer.InterfaceC12732b
        /* JADX INFO: renamed from: c */
        public void mo72319c(InterfaceC12736c interfaceC12736c, boolean z) {
            C12735b.this.m72414U4(false);
            C12735b c12735b = C12735b.this;
            if (z) {
                c12735b.m72467x4(interfaceC12736c, false);
            } else {
                c12735b.m72461R4(1, interfaceC12736c);
            }
            C12735b.this.f48729l = false;
        }
    }

    public C12735b(bsm bsmVar, LiveStickerContainer liveStickerContainer) {
        super(bsmVar);
        this.f48727j = C22392a.m221512b();
        this.f48728k = C22393b.m221521b();
        mo51532C(liveStickerContainer);
        init();
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m72404K3(List list) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m72407N3(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m72408O3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public void m72414U4(boolean z) {
        ((LiveStickerContainer) this.viewModel).setMaskVisibility(z);
        m206028F2().StickerEvent.setMaskVisibility().mo172463j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: V4 */
    private void m72416V4(final BLiveAddStickerResult bLiveAddStickerResult) {
        if (!LiveStickerResManager.m72347w().m72368z(bLiveAddStickerResult)) {
            duringCreated((C22306c) LiveStickerResManager.m72347w().m72357J(bLiveAddStickerResult).filter(new w9j() { // from class: l.k7u
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(LiveStickerResManager.m72347w().m72368z((BLiveAddStickerResult) ((Pair) obj).first));
                }
            }).map(new w9j() { // from class: l.l7u
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C12735b.m72435o4((Pair) obj);
                }
            })).subscribe(ffw.m121193d(new e30() { // from class: l.m7u
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f132490a.m72455L4(bLiveAddStickerResult, (BLiveAddStickerResult) obj);
                }
            }));
        } else {
            ((LiveStickerContainer) this.viewModel).m72307m(bLiveAddStickerResult);
            m72464W4(bLiveAddStickerResult);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m72417W3(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ C22306c m72420Z3(BLiveStickerMetaData bLiveStickerMetaData) {
        return LiveStickerResManager.m72347w().m72355H(bLiveStickerMetaData.Version) ? LiveStickerResManager.m72347w().m72364u(bLiveStickerMetaData.Url, bLiveStickerMetaData.Version) : C22306c.just(roj0.f160388a);
    }

    private void init() {
        ((LiveStickerContainer) this.viewModel).setOnDragListener(new a());
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ BLiveAddStickerResult m72435o4(Pair pair) {
        return (BLiveAddStickerResult) pair.first;
    }

    /* JADX INFO: renamed from: y4 */
    private BLiveAddStickerResult m72443y4(BLiveAddStickerResult bLiveAddStickerResult) {
        List<BLiveStickerMetaDataItem> list = this.f48726i;
        if (list == null || bLiveAddStickerResult == null) {
            return null;
        }
        for (BLiveStickerMetaDataItem bLiveStickerMetaDataItem : list) {
            if (TextUtils.equals(bLiveStickerMetaDataItem.f44442id, bLiveAddStickerResult.templateId)) {
                bLiveStickerMetaDataItem.fillResult(bLiveAddStickerResult);
                return bLiveAddStickerResult;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A4 */
    public final BLiveStickerMetaDataItem m72444A4(String str) {
        List<BLiveStickerMetaDataItem> list = this.f48726i;
        if (list == null) {
            return null;
        }
        for (BLiveStickerMetaDataItem bLiveStickerMetaDataItem : list) {
            if (TextUtils.equals(bLiveStickerMetaDataItem.f44442id, str)) {
                return bLiveStickerMetaDataItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m72445B4(BLiveAddStickerResult bLiveAddStickerResult) {
        InterfaceC12736c currentSticker = ((LiveStickerContainer) this.viewModel).getCurrentSticker();
        if (currentSticker == null || !TextUtils.equals(currentSticker.getTemplateId(), bLiveAddStickerResult.templateId)) {
            return;
        }
        currentSticker.setCustomId(bLiveAddStickerResult.f44329id);
        if (currentSticker instanceof GiftSticker) {
            m72464W4(bLiveAddStickerResult);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m72446C4(Throwable th) {
        this.f48728k.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m72447D4(List list) {
        this.f48726i = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ C22306c m72448E4(roj0 roj0Var) {
        return ((yl40) m206027E2()).m170393A2().m175588f().filter(new w9j() { // from class: l.i7u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty(((BLiveRoom) obj).f44324id));
            }
        });
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m72449F4(List list, final BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        BLiveStickerMetaDataItem bLiveStickerMetaDataItem2 = (BLiveStickerMetaDataItem) vwb.m200346r(this.f48726i, new w9j() { // from class: l.s7u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveStickerMetaDataItem) obj).f44442id, bLiveStickerMetaDataItem.f44442id));
            }
        });
        if (bLiveStickerMetaDataItem2 != null) {
            list.add(bLiveStickerMetaDataItem2);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ List m72450G4(List list) {
        final ArrayList arrayList = new ArrayList(list.size());
        vwb.m200354z(list, new e30() { // from class: l.j7u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116643a.m72449F4(arrayList, (BLiveStickerMetaDataItem) obj);
            }
        });
        this.f48727j.m132487l(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m72451H4(roj0 roj0Var) {
        m72462S4();
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m72452I4(Integer num) {
        ((LiveStickerContainer) this.viewModel).m72310q(num.intValue());
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m72453J4(Throwable th) {
        this.f48728k.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m72454K4(BLiveAddStickerResult bLiveAddStickerResult) {
        BLiveAddStickerResult bLiveAddStickerResultM72443y4;
        ((LiveStickerContainer) this.viewModel).m72303J();
        if (bLiveAddStickerResult == null || (bLiveAddStickerResultM72443y4 = m72443y4(bLiveAddStickerResult)) == null) {
            return;
        }
        m72416V4(bLiveAddStickerResultM72443y4);
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m72455L4(BLiveAddStickerResult bLiveAddStickerResult, BLiveAddStickerResult bLiveAddStickerResult2) {
        ((LiveStickerContainer) this.viewModel).m72307m(bLiveAddStickerResult);
        m72464W4(bLiveAddStickerResult);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ C22306c m72456M4(rwf0 rwf0Var) {
        return m72468z4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m72457N4(Boolean bool) {
        xdl0.m208344M((View) this.viewModel, bool.booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m72458O4(roj0 roj0Var) {
        List<String> list = ((yl40) m206027E2()).m170393A2().mo165469j().liveStickerIds;
        if (vwb.m200296J(list)) {
            return;
        }
        BLiveAddStickerResult bLiveAddStickerResultM135636h = ((idv) ypv.m215673l(fld0.f98147b)).m135636h(list.get(0));
        if (bLiveAddStickerResultM135636h == null || m72443y4(bLiveAddStickerResultM135636h) == null) {
            return;
        }
        m72416V4(bLiveAddStickerResultM135636h);
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m72459P4(LiveControlMessage liveControlMessage) {
        InterfaceC12736c currentSticker = ((LiveStickerContainer) this.viewModel).getCurrentSticker();
        if (currentSticker == null) {
            return;
        }
        if (TextUtils.equals(liveControlMessage.type, "sticker_modify_result_reject")) {
            BLiveStickerMetaDataItem bLiveStickerMetaDataItemM72444A4 = m72444A4(currentSticker.getTemplateId());
            if (bLiveStickerMetaDataItemM72444A4 == null) {
                ((LiveStickerContainer) this.viewModel).m72303J();
            } else if (vdt.m198092b(2)) {
                ((LiveStickerContainer) this.viewModel).m72300G(bLiveStickerMetaDataItemM72444A4.defaultContent);
            } else {
                this.f48728k.m132487l(roj0.f160388a);
            }
        }
        lsi0.m151595y(liveControlMessage.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m72460Q4(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        if (!TextUtils.equals(liveStickerChangeMsg.getRoomId(), ((yl40) m206027E2()).m149818o()) || this.f48729l) {
            return;
        }
        List<LongLinkLiveMessage.LiveSticker> liveStickersList = liveStickerChangeMsg.getLiveStickersList();
        if (vwb.m200296J(liveStickersList)) {
            ((LiveStickerContainer) this.viewModel).m72303J();
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
        BLiveAddStickerResult bLiveAddStickerResultM72443y4 = m72443y4(bLiveAddStickerResultNew_);
        if (bLiveAddStickerResultM72443y4 != null) {
            m72416V4(bLiveAddStickerResultM72443y4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R4 */
    public final void m72461R4(int i, InterfaceC12736c interfaceC12736c) {
        Pair<Float, Float> position = interfaceC12736c.getPosition();
        String content = interfaceC12736c.getContent();
        String category = interfaceC12736c.getCategory();
        String templateId = interfaceC12736c.getTemplateId();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templateId", (Object) templateId);
        jSONObject.put("category", (Object) category);
        jSONObject.put("content", (Object) content);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(BaseSei.f13930X, position.first);
        jSONObject2.put(BaseSei.f13931Y, position.second);
        jSONObject.put("position", (Object) jSONObject2);
        jSONObject.put("changeType", (Object) Integer.valueOf(i));
        LivingNormalApiProvider.m71555q6(((yl40) m206027E2()).m149818o(), interfaceC12736c.getCustomId(), jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public final void m72462S4() {
        duringCreated(LivingNormalApiProvider.m71571s4(((yl40) m206027E2()).m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.g7u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101436a.m72454K4((BLiveAddStickerResult) obj);
            }
        }, new e30() { // from class: l.h7u
            @Override // p149l.e30
            public final void call(Object obj) {
                C12735b.m72408O3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(LivingNormalApiProvider.m71536o5().flatMap(new w9j() { // from class: l.t6u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C12735b.m72420Z3((BLiveStickerMetaData) obj);
            }
        }).flatMap(new w9j() { // from class: l.w6u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveStickerResManager.m72347w().m72356I();
            }
        }).doOnNext(new e30() { // from class: l.x6u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191286a.m72447D4((List) obj);
            }
        }).map(new w9j() { // from class: l.y6u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).flatMap(new w9j() { // from class: l.z6u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f201959a.m72448E4((roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.a7u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71338S5(((BLiveRoom) obj).f44324id);
            }
        }).map(new w9j() { // from class: l.b7u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f74018a.m72450G4((List) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.c7u
            @Override // p149l.e30
            public final void call(Object obj) {
                C12735b.m72404K3((List) obj);
            }
        }, new e30() { // from class: l.e7u
            @Override // p149l.e30
            public final void call(Object obj) {
                C12735b.m72407N3((Throwable) obj);
            }
        }));
        duringCreated(this.f48728k).subscribe(ffw.m121197h(new e30() { // from class: l.f7u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96284a.m72451H4((roj0) obj);
            }
        }));
        duringCreated(m206028F2().StickerEvent.addSticker().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.u6u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174883a.m72466w4((BLiveAddStickerResult) obj);
            }
        }));
        duringCreated(m206028F2().ChatViewRightChangeEvent.chatRightChange().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.v6u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180226a.m72452I4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T4 */
    public void m72463T4(String str) {
        InterfaceC12736c interfaceC12736cM72300G = ((LiveStickerContainer) this.viewModel).m72300G(str);
        if (interfaceC12736cM72300G != null) {
            m72461R4(2, interfaceC12736cM72300G);
        }
        ((LiveStickerContainer) this.viewModel).m72312u();
    }

    /* JADX INFO: renamed from: W4 */
    public final void m72464W4(final BLiveAddStickerResult bLiveAddStickerResult) {
        InterfaceC12736c currentSticker = ((LiveStickerContainer) this.viewModel).getCurrentSticker();
        if (currentSticker instanceof GiftSticker) {
            BLiveStickerMetaDataItem bLiveStickerMetaDataItem = (BLiveStickerMetaDataItem) vwb.m200346r(this.f48726i, new w9j() { // from class: l.r7u
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(bLiveAddStickerResult.templateId.equals(((BLiveStickerMetaDataItem) obj).f44442id));
                }
            });
            GiftSticker giftSticker = (GiftSticker) currentSticker;
            giftSticker.setGiftPosition(bLiveStickerMetaDataItem.giftCfg.position);
            giftSticker.m72252k0(bLiveAddStickerResult.giftIcon, bLiveStickerMetaDataItem.giftCfg.backgroundUrl);
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        ((idv) ypv.m215673l(fld0.f98147b)).m135631c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129301d3(rwf0.class, new w9j() { // from class: l.s6u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f162853a.m72456M4((rwf0) obj);
            }
        });
        duringCreated(m206028F2().StickerEvent.changeVisible().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.o7u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142544a.m72457N4((Boolean) obj);
            }
        }));
        duringCreated(C22306c.zip(((yl40) m206027E2()).m149815l().filter(new l9t()).take(1), m72468z4(), new x9j() { // from class: l.v7u
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return roj0.f160388a;
            }
        })).subscribe(ffw.m121193d(new e30() { // from class: l.w7u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185098a.m72458O4((roj0) obj);
            }
        }));
        duringCreated(((yl40) m206027E2()).m132153n1().filter(new w9j() { // from class: l.x7u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                LiveControlMessage liveControlMessage = (LiveControlMessage) obj;
                return Boolean.valueOf(TextUtils.equals(liveControlMessage.type, "sticker_modify_result_submit") || TextUtils.equals(liveControlMessage.type, "sticker_modify_result_approve") || TextUtils.equals(liveControlMessage.type, "sticker_modify_result_reject"));
            }
        })).subscribe(ffw.m121193d(new e30() { // from class: l.y7u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196733a.m72459P4((LiveControlMessage) obj);
            }
        }));
        duringCreated(((yl40) m206027E2()).m132075L0()).subscribe(ffw.m121193d(new e30() { // from class: l.z7u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202075a.m72460Q4((LongLinkLiveMessage.LiveStickerChangeMsg) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(ConnectivityReceiver.m81290m().skip(1).filter(new w9j() { // from class: l.a8u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).map(new w9j() { // from class: l.b8u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).observeOn(jo0.m142408a()));
        C22393b<roj0> c22393b = this.f48728k;
        Objects.requireNonNull(c22393b);
        c22306cDuringCreated.subscribe(ffw.m121193d(new d7u(c22393b)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public void m72466w4(BLiveAddStickerResult bLiveAddStickerResult) {
        InterfaceC12736c currentSticker = ((LiveStickerContainer) this.viewModel).getCurrentSticker();
        if (currentSticker != null) {
            m72467x4(currentSticker, true);
        }
        InterfaceC12736c interfaceC12736cM72307m = ((LiveStickerContainer) this.viewModel).m72307m(bLiveAddStickerResult);
        String strM149818o = ((yl40) m206027E2()).m149818o();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templateId", (Object) bLiveAddStickerResult.templateId);
        jSONObject.put("category", (Object) bLiveAddStickerResult.category);
        jSONObject.put("content", (Object) interfaceC12736cM72307m.getContent());
        if (!TextUtils.isEmpty(bLiveAddStickerResult.giftId)) {
            jSONObject.put("giftId", (Object) bLiveAddStickerResult.giftId);
        }
        JSONObject jSONObject2 = new JSONObject();
        Pair<Float, Float> position = interfaceC12736cM72307m.getPosition();
        jSONObject2.put(BaseSei.f13930X, position.first);
        jSONObject2.put(BaseSei.f13931Y, position.second);
        jSONObject.put("position", (Object) jSONObject2);
        duringCreated(LivingNormalApiProvider.m71633z3(strM149818o, jSONObject).filter(new w9j() { // from class: l.n7u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveAddStickerResult) obj) != null);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.p7u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147543a.m72445B4((BLiveAddStickerResult) obj);
            }
        }, new e30() { // from class: l.q7u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153075a.m72446C4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final void m72467x4(InterfaceC12736c interfaceC12736c, boolean z) {
        if (interfaceC12736c != null) {
            LivingNormalApiProvider.m71490j4(((yl40) m206027E2()).m149818o(), interfaceC12736c.getCustomId(), z).subscribe(ffw.m121194e(new e30() { // from class: l.t7u
                @Override // p149l.e30
                public final void call(Object obj) {
                    C12735b.m72417W3((roj0) obj);
                }
            }, new e30() { // from class: l.u7u
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f175072a.m72453J4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final C22306c<List<BLiveStickerMetaDataItem>> m72468z4() {
        return this.f48727j.asObservable();
    }
}
