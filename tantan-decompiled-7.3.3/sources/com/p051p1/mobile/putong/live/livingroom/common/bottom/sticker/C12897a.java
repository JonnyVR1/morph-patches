package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.C12897a;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerMenuItem;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;
import p153l.b5g0;
import p153l.bf10;
import p153l.bnl0;
import p153l.c0s;
import p153l.dhw;
import p153l.dum;
import p153l.e74;
import p153l.i5g0;
import p153l.jyb;
import p153l.n5g0;
import p153l.o1j0;
import p153l.oo2;
import p153l.qa00;
import p153l.qc80;
import p153l.qcj;
import p153l.qct;
import p153l.xsl;
import p153l.y20;
import p153l.yec0;
import p153l.zrv;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.a */
/* JADX INFO: loaded from: classes4.dex */
public class C12897a extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public DialogC12774a f49569i;

    /* JADX INFO: renamed from: j */
    public DialogC12774a f49570j;

    /* JADX INFO: renamed from: k */
    public boolean f49571k;

    /* JADX INFO: renamed from: l */
    public LiveCustomStickerPickView f49572l;

    /* JADX INFO: renamed from: m */
    public String f49573m;

    public C12897a(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m73569U3(LiveStickerPickView liveStickerPickView, C12900d c12900d, List list) {
        liveStickerPickView.m73511b(jyb.m147520m(list, new qcj() { // from class: l.i8u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveStickerMetaDataItem) obj).category.equals("gift"));
            }
        }));
        c12900d.m73659J(jyb.m147522n(list, new qcj() { // from class: l.j8u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((BLiveStickerMetaDataItem) obj).category.equals("gift"));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m73574f4(BLiveButtonType bLiveButtonType) {
        m73585k4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().BottomEvent.showDialog().m199270g()).filter(new qcj() { // from class: l.b8u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((BLiveButtonType) obj, "sticker"));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.k8u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124418a.m73574f4((BLiveButtonType) obj);
            }
        }));
        duringCreated(m213811F2().StickerEvent.openGiftStickerDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.l8u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130514a.m73584j4((String) obj);
            }
        }));
        m138860d3(i5g0.class, new qcj() { // from class: l.m8u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f135293a.m73580e4((i5g0) obj));
            }
        });
        duringCreated(((C22421c) m138856F3(new b5g0(3200))).filter(new qcj() { // from class: l.n8u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        })).subscribe(dhw.m115825d(new y20() { // from class: l.o8u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145469a.m73581g4((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m73575Z3(BLiveStickerMetaDataItem bLiveStickerMetaDataItem, String str) {
        DialogC12774a dialogC12774a;
        BLiveAddStickerResult bLiveAddStickerResultNew_ = BLiveAddStickerResult.new_();
        bLiveAddStickerResultNew_.animationUrl = bLiveStickerMetaDataItem.animationUrl;
        bLiveAddStickerResultNew_.category = bLiveStickerMetaDataItem.category;
        bLiveAddStickerResultNew_.content = TextUtils.isEmpty(this.f49573m) ? bLiveStickerMetaDataItem.defaultContent : this.f49573m;
        bLiveAddStickerResultNew_.templateId = bLiveStickerMetaDataItem.f45290id;
        bLiveAddStickerResultNew_.position = bLiveStickerMetaDataItem.defaultPosition;
        bLiveAddStickerResultNew_.url = bLiveStickerMetaDataItem.url;
        bLiveAddStickerResultNew_.version = bLiveStickerMetaDataItem.version;
        bLiveAddStickerResultNew_.maxCount = bLiveStickerMetaDataItem.maxWordCount;
        bLiveAddStickerResultNew_.fontSize = bLiveStickerMetaDataItem.fontSize;
        bLiveAddStickerResultNew_.color = bLiveStickerMetaDataItem.color;
        bLiveAddStickerResultNew_.boldText = bLiveStickerMetaDataItem.boldText;
        bLiveAddStickerResultNew_.stretchRange = bLiveStickerMetaDataItem.stretchRange;
        bLiveAddStickerResultNew_.contentArea = bLiveStickerMetaDataItem.contentArea;
        if (!TextUtils.isEmpty(str) && (dialogC12774a = this.f49570j) != null) {
            bLiveAddStickerResultNew_.giftId = str;
            dialogC12774a.dismiss();
        }
        m213811F2().StickerEvent.addSticker().mo199273j(bLiveAddStickerResultNew_);
        DialogC12774a dialogC12774a2 = this.f49569i;
        if (dialogC12774a2 != null) {
            dialogC12774a2.dismiss();
        }
    }

    /* JADX INFO: renamed from: a4 */
    public void m73576a4(LiveStickerMenuItem liveStickerMenuItem) {
        m73575Z3(liveStickerMenuItem.getBindingItem(), "");
    }

    /* JADX INFO: renamed from: b4 */
    public final DialogC12774a m73577b4(String str) {
        this.f49573m = str;
        this.f49572l = (LiveCustomStickerPickView) act().inflater().inflate(yec0.f198913S5, (ViewGroup) null);
        c0s c0sVar = new c0s(this, this.f49572l);
        this.f49572l.m73453j(c0sVar, this);
        duringCreated(((C22421c) m138856F3(new b5g0(3200))).filter(new qcj() { // from class: l.p8u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        })).subscribe(dhw.m115829h(new y20() { // from class: l.q8u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156163a.m73582h4((List) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(LivingNormalApiProvider.m72529T4().filter(new qcj() { // from class: l.r8u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }));
        final LiveCustomStickerPickView liveCustomStickerPickView = this.f49572l;
        Objects.requireNonNull(liveCustomStickerPickView);
        c22421cDuringCreated.subscribe(dhw.m115829h(new y20() { // from class: l.s8u
            @Override // p153l.y20
            public final void call(Object obj) {
                liveCustomStickerPickView.setGiftList((List) obj);
            }
        }));
        return c0sVar;
    }

    /* JADX INFO: renamed from: c4 */
    public final DialogC12774a m73578c4() {
        final LiveStickerPickView liveStickerPickView = (LiveStickerPickView) act().inflater().inflate(yec0.f198973X5, (ViewGroup) null);
        final c0s c0sVar = new c0s(this, liveStickerPickView);
        liveStickerPickView.f49549a.setOnClickListener(new View.OnClickListener() { // from class: l.c8u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0sVar.dismiss();
            }
        });
        bnl0.m105509E0(liveStickerPickView.f49553e, new View.OnClickListener() { // from class: l.d8u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85689a.m73583i4(view);
            }
        });
        liveStickerPickView.f49558j.setLayoutManager(new GridLayoutManager(act(), 2));
        liveStickerPickView.f49550b.setMaxHeight(qa00.m175859d(609.0f));
        liveStickerPickView.f49550b.setMinHeight(qa00.m175859d(371.0f));
        liveStickerPickView.f49558j.addItemDecoration(new n5g0(2, qa00.m175859d(12.0f), qa00.m175859d(12.0f), qa00.m175859d(12.0f), false));
        final C12900d c12900d = new C12900d(act(), false);
        c12900d.m73658I(new C12900d.a() { // from class: l.e8u
            @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.C12900d.a
            /* JADX INFO: renamed from: a */
            public final void mo73660a(LiveStickerMenuItem liveStickerMenuItem) {
                this.f92566a.m73576a4(liveStickerMenuItem);
            }
        });
        liveStickerPickView.f49558j.setAdapter(c12900d);
        duringCreated(((C22421c) m138856F3(new b5g0(3200))).filter(new qcj() { // from class: l.f8u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        })).subscribe(dhw.m115825d(new y20() { // from class: l.g8u
            @Override // p153l.y20
            public final void call(Object obj) {
                C12897a.m73569U3(liveStickerPickView, c12900d, (List) obj);
            }
        }));
        return c0sVar;
    }

    /* JADX INFO: renamed from: d4 */
    public void m73579d4(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, int i) {
        LiveCustomStickerPickView liveCustomStickerPickView = this.f49572l;
        if (liveCustomStickerPickView != null) {
            liveCustomStickerPickView.m73458o(bLiveStickerTemplatesGiftItem, i);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public boolean m73580e4(xsl xslVar) {
        return this.f49571k;
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m73581g4(List list) {
        this.f49571k = true;
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m73582h4(List list) {
        this.f49572l.setStickerList(jyb.m147522n(list, new qcj() { // from class: l.h8u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveStickerMetaDataItem) obj).category.equals("gift"));
            }
        }));
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m73583i4(View view) {
        m73584j4("");
    }

    /* JADX INFO: renamed from: j4 */
    public final void m73584j4(String str) {
        if (this.f49570j == null) {
            this.f49570j = m73577b4(str);
        }
        this.f49570j.show();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73585k4() {
        if (((Boolean) m138856F3(new qc80(3200))).booleanValue()) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f48071f));
            return;
        }
        if (((Boolean) m138856F3(new e74(800))).booleanValue()) {
            o1j0.m165649w(R$string.f48182k1);
        } else {
            if (bf10.m103808N(this)) {
                o1j0.m165649w(R$string.f48299p8);
                return;
            }
            if (this.f49569i == null) {
                this.f49569i = m73578c4();
            }
            this.f49569i.show();
        }
    }
}
