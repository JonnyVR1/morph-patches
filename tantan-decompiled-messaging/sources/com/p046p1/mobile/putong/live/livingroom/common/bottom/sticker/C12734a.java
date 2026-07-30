package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.C12734a;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerMenuItem;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;
import p149l.bsm;
import p149l.byr;
import p149l.dxf0;
import p149l.e30;
import p149l.f64;
import p149l.ffw;
import p149l.ho2;
import p149l.k480;
import p149l.lql;
import p149l.lsi0;
import p149l.pat;
import p149l.r610;
import p149l.rwf0;
import p149l.t100;
import p149l.t6c0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.ypv;
import p149l.ywf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.a */
/* JADX INFO: loaded from: classes4.dex */
public class C12734a extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public DialogC12611a f48721i;

    /* JADX INFO: renamed from: j */
    public DialogC12611a f48722j;

    /* JADX INFO: renamed from: k */
    public boolean f48723k;

    /* JADX INFO: renamed from: l */
    public LiveCustomStickerPickView f48724l;

    /* JADX INFO: renamed from: m */
    public String f48725m;

    public C12734a(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m72386U3(LiveStickerPickView liveStickerPickView, C12737d c12737d, List list) {
        liveStickerPickView.m72328b(vwb.m200337m(list, new w9j() { // from class: l.h6u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveStickerMetaDataItem) obj).category.equals("gift"));
            }
        }));
        c12737d.m72476J(vwb.m200339n(list, new w9j() { // from class: l.i6u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((BLiveStickerMetaDataItem) obj).category.equals("gift"));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m72391f4(BLiveButtonType bLiveButtonType) {
        m72402k4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().BottomEvent.showDialog().m172460g()).filter(new w9j() { // from class: l.a6u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((BLiveButtonType) obj, "sticker"));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.j6u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116539a.m72391f4((BLiveButtonType) obj);
            }
        }));
        duringCreated(m206028F2().StickerEvent.openGiftStickerDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.k6u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121503a.m72401j4((String) obj);
            }
        }));
        m129301d3(ywf0.class, new w9j() { // from class: l.l6u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f126669a.m72397e4((ywf0) obj));
            }
        });
        duringCreated(((C22306c) m129297F3(new rwf0(3200))).filter(new w9j() { // from class: l.m6u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        })).subscribe(ffw.m121193d(new e30() { // from class: l.n6u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137445a.m72398g4((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m72392Z3(BLiveStickerMetaDataItem bLiveStickerMetaDataItem, String str) {
        DialogC12611a dialogC12611a;
        BLiveAddStickerResult bLiveAddStickerResultNew_ = BLiveAddStickerResult.new_();
        bLiveAddStickerResultNew_.animationUrl = bLiveStickerMetaDataItem.animationUrl;
        bLiveAddStickerResultNew_.category = bLiveStickerMetaDataItem.category;
        bLiveAddStickerResultNew_.content = TextUtils.isEmpty(this.f48725m) ? bLiveStickerMetaDataItem.defaultContent : this.f48725m;
        bLiveAddStickerResultNew_.templateId = bLiveStickerMetaDataItem.f44442id;
        bLiveAddStickerResultNew_.position = bLiveStickerMetaDataItem.defaultPosition;
        bLiveAddStickerResultNew_.url = bLiveStickerMetaDataItem.url;
        bLiveAddStickerResultNew_.version = bLiveStickerMetaDataItem.version;
        bLiveAddStickerResultNew_.maxCount = bLiveStickerMetaDataItem.maxWordCount;
        bLiveAddStickerResultNew_.fontSize = bLiveStickerMetaDataItem.fontSize;
        bLiveAddStickerResultNew_.color = bLiveStickerMetaDataItem.color;
        bLiveAddStickerResultNew_.boldText = bLiveStickerMetaDataItem.boldText;
        bLiveAddStickerResultNew_.stretchRange = bLiveStickerMetaDataItem.stretchRange;
        bLiveAddStickerResultNew_.contentArea = bLiveStickerMetaDataItem.contentArea;
        if (!TextUtils.isEmpty(str) && (dialogC12611a = this.f48722j) != null) {
            bLiveAddStickerResultNew_.giftId = str;
            dialogC12611a.dismiss();
        }
        m206028F2().StickerEvent.addSticker().mo172463j(bLiveAddStickerResultNew_);
        DialogC12611a dialogC12611a2 = this.f48721i;
        if (dialogC12611a2 != null) {
            dialogC12611a2.dismiss();
        }
    }

    /* JADX INFO: renamed from: a4 */
    public void m72393a4(LiveStickerMenuItem liveStickerMenuItem) {
        m72392Z3(liveStickerMenuItem.getBindingItem(), "");
    }

    /* JADX INFO: renamed from: b4 */
    public final DialogC12611a m72394b4(String str) {
        this.f48725m = str;
        this.f48724l = (LiveCustomStickerPickView) act().inflater().inflate(t6c0.f168181S5, (ViewGroup) null);
        byr byrVar = new byr(this, this.f48724l);
        this.f48724l.m72270j(byrVar, this);
        duringCreated(((C22306c) m129297F3(new rwf0(3200))).filter(new w9j() { // from class: l.o6u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        })).subscribe(ffw.m121197h(new e30() { // from class: l.p6u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147445a.m72399h4((List) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(LivingNormalApiProvider.m71346T4().filter(new w9j() { // from class: l.q6u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }));
        final LiveCustomStickerPickView liveCustomStickerPickView = this.f48724l;
        Objects.requireNonNull(liveCustomStickerPickView);
        c22306cDuringCreated.subscribe(ffw.m121197h(new e30() { // from class: l.r6u
            @Override // p149l.e30
            public final void call(Object obj) {
                liveCustomStickerPickView.setGiftList((List) obj);
            }
        }));
        return byrVar;
    }

    /* JADX INFO: renamed from: c4 */
    public final DialogC12611a m72395c4() {
        final LiveStickerPickView liveStickerPickView = (LiveStickerPickView) act().inflater().inflate(t6c0.f168241X5, (ViewGroup) null);
        final byr byrVar = new byr(this, liveStickerPickView);
        liveStickerPickView.f48701a.setOnClickListener(new View.OnClickListener() { // from class: l.b6u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byrVar.dismiss();
            }
        });
        xdl0.m208329E0(liveStickerPickView.f48705e, new View.OnClickListener() { // from class: l.c6u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79573a.m72400i4(view);
            }
        });
        liveStickerPickView.f48710j.setLayoutManager(new GridLayoutManager(act(), 2));
        liveStickerPickView.f48702b.setMaxHeight(t100.m186890d(609.0f));
        liveStickerPickView.f48702b.setMinHeight(t100.m186890d(371.0f));
        liveStickerPickView.f48710j.addItemDecoration(new dxf0(2, t100.m186890d(12.0f), t100.m186890d(12.0f), t100.m186890d(12.0f), false));
        final C12737d c12737d = new C12737d(act(), false);
        c12737d.m72475I(new C12737d.a() { // from class: l.d6u
            @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.C12737d.a
            /* JADX INFO: renamed from: a */
            public final void mo72477a(LiveStickerMenuItem liveStickerMenuItem) {
                this.f84665a.m72393a4(liveStickerMenuItem);
            }
        });
        liveStickerPickView.f48710j.setAdapter(c12737d);
        duringCreated(((C22306c) m129297F3(new rwf0(3200))).filter(new w9j() { // from class: l.e6u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        })).subscribe(ffw.m121193d(new e30() { // from class: l.f6u
            @Override // p149l.e30
            public final void call(Object obj) {
                C12734a.m72386U3(liveStickerPickView, c12737d, (List) obj);
            }
        }));
        return byrVar;
    }

    /* JADX INFO: renamed from: d4 */
    public void m72396d4(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, int i) {
        LiveCustomStickerPickView liveCustomStickerPickView = this.f48724l;
        if (liveCustomStickerPickView != null) {
            liveCustomStickerPickView.m72275o(bLiveStickerTemplatesGiftItem, i);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public boolean m72397e4(lql lqlVar) {
        return this.f48723k;
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m72398g4(List list) {
        this.f48723k = true;
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m72399h4(List list) {
        this.f48724l.setStickerList(vwb.m200339n(list, new w9j() { // from class: l.g6u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveStickerMetaDataItem) obj).category.equals("gift"));
            }
        }));
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m72400i4(View view) {
        m72401j4("");
    }

    /* JADX INFO: renamed from: j4 */
    public final void m72401j4(String str) {
        if (this.f48722j == null) {
            this.f48722j = m72394b4(str);
        }
        this.f48722j.show();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72402k4() {
        if (((Boolean) m129297F3(new k480(3200))).booleanValue()) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f47223f));
            return;
        }
        if (((Boolean) m129297F3(new f64(800))).booleanValue()) {
            lsi0.m151593w(R$string.f47334k1);
        } else {
            if (r610.m177979N(this)) {
                lsi0.m151593w(R$string.f47451p8);
                return;
            }
            if (this.f48721i == null) {
                this.f48721i = m72395c4();
            }
            this.f48721i.show();
        }
    }
}
