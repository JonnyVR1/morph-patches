package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.C0323a;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerMenuItem;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import java.util.List;
import java.util.Objects;
import l.e30;
import l.f64;
import l.ffw;
import l.k480;
import l.lql;
import l.lsi0;
import l.r610;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.ypv;
import p002l.bsm;
import p002l.byr;
import p002l.dxf0;
import p002l.ho2;
import p002l.pat;
import p002l.rwf0;
import p002l.t6c0;
import p002l.ywf0;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0323a extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public C0200a f4763i;

    /* JADX INFO: renamed from: j */
    public C0200a f4764j;

    /* JADX INFO: renamed from: k */
    public boolean f4765k;

    /* JADX INFO: renamed from: l */
    public LiveCustomStickerPickView f4766l;

    /* JADX INFO: renamed from: m */
    public String f4767m;

    public C0323a(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m5868U3(LiveStickerPickView liveStickerPickView, C0326d c0326d, List list) {
        liveStickerPickView.m5805b(vwb.m(list, new w9j() { // from class: l.h6u
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveStickerMetaDataItem) obj).category.equals("gift"));
            }
        }));
        c0326d.m5964J(vwb.n(list, new w9j() { // from class: l.i6u
            public final Object call(Object obj) {
                return Boolean.valueOf(!((BLiveStickerMetaDataItem) obj).category.equals("gift"));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m5873f4(BLiveButtonType bLiveButtonType) {
        m5885k4();
    }

    /* JADX INFO: renamed from: T */
    public void m5874T() {
        super.T();
        duringCreated((c) m25548F2().BottomEvent.showDialog().g()).filter(new w9j() { // from class: l.a6u
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((BLiveButtonType) obj, "sticker"));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.j6u
            public final void call(Object obj) {
                this.f13613a.m5873f4((BLiveButtonType) obj);
            }
        }));
        duringCreated((c) m25548F2().StickerEvent.openGiftStickerDialog().g()).subscribe(ffw.d(new e30() { // from class: l.k6u
            public final void call(Object obj) {
                this.f14223a.m5884j4((String) obj);
            }
        }));
        m14188d3(ywf0.class, new w9j() { // from class: l.l6u
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f14700a.m5880e4((ywf0) obj));
            }
        });
        duringCreated(((c) m14184F3(new rwf0(3200))).filter(new w9j() { // from class: l.m6u
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        })).subscribe(ffw.d(new e30() { // from class: l.n6u
            public final void call(Object obj) {
                this.f15848a.m5881g4((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m5875Z3(BLiveStickerMetaDataItem bLiveStickerMetaDataItem, String str) {
        C0200a c0200a;
        BLiveAddStickerResult bLiveAddStickerResultNew_ = BLiveAddStickerResult.new_();
        bLiveAddStickerResultNew_.animationUrl = bLiveStickerMetaDataItem.animationUrl;
        bLiveAddStickerResultNew_.category = bLiveStickerMetaDataItem.category;
        bLiveAddStickerResultNew_.content = TextUtils.isEmpty(this.f4767m) ? bLiveStickerMetaDataItem.defaultContent : this.f4767m;
        bLiveAddStickerResultNew_.templateId = bLiveStickerMetaDataItem.id;
        bLiveAddStickerResultNew_.position = bLiveStickerMetaDataItem.defaultPosition;
        bLiveAddStickerResultNew_.url = bLiveStickerMetaDataItem.url;
        bLiveAddStickerResultNew_.version = bLiveStickerMetaDataItem.version;
        bLiveAddStickerResultNew_.maxCount = bLiveStickerMetaDataItem.maxWordCount;
        bLiveAddStickerResultNew_.fontSize = bLiveStickerMetaDataItem.fontSize;
        bLiveAddStickerResultNew_.color = bLiveStickerMetaDataItem.color;
        bLiveAddStickerResultNew_.boldText = bLiveStickerMetaDataItem.boldText;
        bLiveAddStickerResultNew_.stretchRange = bLiveStickerMetaDataItem.stretchRange;
        bLiveAddStickerResultNew_.contentArea = bLiveStickerMetaDataItem.contentArea;
        if (!TextUtils.isEmpty(str) && (c0200a = this.f4764j) != null) {
            bLiveAddStickerResultNew_.giftId = str;
            c0200a.dismiss();
        }
        m25548F2().StickerEvent.addSticker().j(bLiveAddStickerResultNew_);
        C0200a c0200a2 = this.f4763i;
        if (c0200a2 != null) {
            c0200a2.dismiss();
        }
    }

    /* JADX INFO: renamed from: a4 */
    public void m5876a4(LiveStickerMenuItem liveStickerMenuItem) {
        m5875Z3(liveStickerMenuItem.getBindingItem(), "");
    }

    /* JADX INFO: renamed from: b4 */
    public final C0200a m5877b4(String str) {
        this.f4767m = str;
        this.f4766l = (LiveCustomStickerPickView) act().inflater().inflate(t6c0.f19677S5, (ViewGroup) null);
        byr byrVar = new byr(this, this.f4766l);
        this.f4766l.m5743j(byrVar, this);
        duringCreated(((c) m14184F3(new rwf0(3200))).filter(new w9j() { // from class: l.o6u
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        })).subscribe(ffw.h(new e30() { // from class: l.p6u
            public final void call(Object obj) {
                this.f17028a.m5882h4((List) obj);
            }
        }));
        c cVarDuringCreated = duringCreated(LivingNormalApiProvider.m4712T4().filter(new w9j() { // from class: l.q6u
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }));
        final LiveCustomStickerPickView liveCustomStickerPickView = this.f4766l;
        Objects.requireNonNull(liveCustomStickerPickView);
        cVarDuringCreated.subscribe(ffw.h(new e30() { // from class: l.r6u
            public final void call(Object obj) {
                liveCustomStickerPickView.setGiftList((List) obj);
            }
        }));
        return byrVar;
    }

    /* JADX INFO: renamed from: c4 */
    public final C0200a m5878c4() {
        final LiveStickerPickView liveStickerPickView = (LiveStickerPickView) act().inflater().inflate(t6c0.f19737X5, (ViewGroup) null);
        final byr byrVar = new byr(this, liveStickerPickView);
        liveStickerPickView.f4743a.setOnClickListener(new View.OnClickListener() { // from class: l.b6u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byrVar.dismiss();
            }
        });
        xdl0.E0(liveStickerPickView.f4747e, new View.OnClickListener() { // from class: l.c6u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8515a.m5883i4(view);
            }
        });
        liveStickerPickView.f4752j.setLayoutManager(new GridLayoutManager(act(), 2));
        liveStickerPickView.f4744b.setMaxHeight(t100.d(609.0f));
        liveStickerPickView.f4744b.setMinHeight(t100.d(371.0f));
        liveStickerPickView.f4752j.addItemDecoration(new dxf0(2, t100.d(12.0f), t100.d(12.0f), t100.d(12.0f), false));
        final C0326d c0326d = new C0326d(act(), false);
        c0326d.m5963I(new C0326d.a() { // from class: l.d6u
            @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.C0326d.a
            /* JADX INFO: renamed from: a */
            public final void mo5965a(LiveStickerMenuItem liveStickerMenuItem) {
                this.f9082a.m5876a4(liveStickerMenuItem);
            }
        });
        liveStickerPickView.f4752j.setAdapter(c0326d);
        duringCreated(((c) m14184F3(new rwf0(3200))).filter(new w9j() { // from class: l.e6u
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        })).subscribe(ffw.d(new e30() { // from class: l.f6u
            public final void call(Object obj) {
                C0323a.m5868U3(liveStickerPickView, c0326d, (List) obj);
            }
        }));
        return byrVar;
    }

    /* JADX INFO: renamed from: d4 */
    public void m5879d4(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, int i) {
        LiveCustomStickerPickView liveCustomStickerPickView = this.f4766l;
        if (liveCustomStickerPickView != null) {
            liveCustomStickerPickView.m5748o(bLiveStickerTemplatesGiftItem, i);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public boolean m5880e4(lql lqlVar) {
        return this.f4765k;
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m5881g4(List list) {
        this.f4765k = true;
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m5882h4(List list) {
        this.f4766l.setStickerList(vwb.n(list, new w9j() { // from class: l.g6u
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveStickerMetaDataItem) obj).category.equals("gift"));
            }
        }));
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m5883i4(View view) {
        m5884j4("");
    }

    /* JADX INFO: renamed from: j4 */
    public final void m5884j4(String str) {
        if (this.f4764j == null) {
            this.f4764j = m5877b4(str);
        }
        this.f4764j.show();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5885k4() {
        if (((Boolean) m14184F3(new k480(3200))).booleanValue()) {
            lsi0.y(ypv.e.getString(R$string.f3265f));
            return;
        }
        if (((Boolean) m14184F3(new f64(800))).booleanValue()) {
            lsi0.w(R$string.f3376k1);
        } else {
            if (r610.N(this)) {
                lsi0.w(R$string.f3493p8);
                return;
            }
            if (this.f4763i == null) {
                this.f4763i = m5878c4();
            }
            this.f4763i.show();
        }
    }
}
