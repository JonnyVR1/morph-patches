package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AbstractC0616v;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerMenuItem;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;
import java.util.List;
import p147v.VImage;
import p147v.VPager;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.dxf0;
import p149l.e6s;
import p149l.t100;
import p149l.tvj;
import p149l.vvj;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.xwf0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveCustomStickerPickView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f48639a;

    /* JADX INFO: renamed from: b */
    public VText f48640b;

    /* JADX INFO: renamed from: c */
    public VImage f48641c;

    /* JADX INFO: renamed from: d */
    public View f48642d;

    /* JADX INFO: renamed from: e */
    public TextView f48643e;

    /* JADX INFO: renamed from: f */
    public VPager f48644f;

    /* JADX INFO: renamed from: g */
    public GiftDialogIndicator f48645g;

    /* JADX INFO: renamed from: h */
    public TextView f48646h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f48647i;

    /* JADX INFO: renamed from: j */
    public TextView f48648j;

    /* JADX INFO: renamed from: k */
    public List<BLiveStickerMetaDataItem> f48649k;

    /* JADX INFO: renamed from: l */
    public C12737d f48650l;

    /* JADX INFO: renamed from: m */
    public List<BLiveStickerTemplatesGiftItem> f48651m;

    /* JADX INFO: renamed from: n */
    public vvj f48652n;

    /* JADX INFO: renamed from: o */
    public BLiveStickerMetaDataItem f48653o;

    /* JADX INFO: renamed from: p */
    public BLiveStickerTemplatesGiftItem f48654p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveCustomStickerPickView$a */
    public class C12729a implements ViewPager.InterfaceC0716j {
        public C12729a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            LiveCustomStickerPickView.this.f48645g.setCurrentItem(i);
        }
    }

    public LiveCustomStickerPickView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: g */
    public final void m72267g(View view) {
        e6s.m115112a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m72268h(C12734a c12734a) {
        vvj vvjVar = new vvj(c12734a);
        this.f48652n = vvjVar;
        this.f48644f.setAdapter(vvjVar);
        this.f48645g.setViewPager(this.f48644f);
        this.f48644f.m4185d(new C12729a());
    }

    /* JADX INFO: renamed from: i */
    public final void m72269i(C12734a c12734a) {
        this.f48647i.setLayoutManager(new GridLayoutManager(c12734a.act(), 2));
        this.f48647i.addItemDecoration(new dxf0(2, t100.m186890d(20.0f), t100.m186890d(12.0f), t100.m186890d(12.0f), true));
        if (this.f48647i.getItemAnimator() != null) {
            ((AbstractC0616v) this.f48647i.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        C12737d c12737d = new C12737d(c12734a.act(), true);
        this.f48650l = c12737d;
        c12737d.m72475I(new C12737d.a() { // from class: l.d6s
            @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.C12737d.a
            /* JADX INFO: renamed from: a */
            public final void mo72477a(LiveStickerMenuItem liveStickerMenuItem) {
                this.f84649a.m72271k(liveStickerMenuItem);
            }
        });
        this.f48647i.setAdapter(this.f48650l);
    }

    /* JADX INFO: renamed from: j */
    public void m72270j(final DialogC12611a dialogC12611a, final C12734a c12734a) {
        this.f48639a.setOnClickListener(new View.OnClickListener() { // from class: l.a6s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogC12611a.dismiss();
            }
        });
        xdl0.m208329E0(this.f48641c, new View.OnClickListener() { // from class: l.b6s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogC12611a.dismiss();
            }
        });
        m72269i(c12734a);
        m72268h(c12734a);
        xdl0.m208329E0(this.f48648j, new View.OnClickListener() { // from class: l.c6s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79564a.m72272l(c12734a, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m72271k(LiveStickerMenuItem liveStickerMenuItem) {
        m72274n(liveStickerMenuItem.getItem());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m72272l(C12734a c12734a, View view) {
        BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem;
        BLiveStickerMetaDataItem bLiveStickerMetaDataItem = this.f48653o;
        if (bLiveStickerMetaDataItem == null || (bLiveStickerTemplatesGiftItem = this.f48654p) == null) {
            return;
        }
        c12734a.m72392Z3(bLiveStickerMetaDataItem, bLiveStickerTemplatesGiftItem.giftId);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Boolean m72273m(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        return Boolean.valueOf(TextUtils.equals(this.f48654p.giftId, bLiveStickerTemplatesGiftItem.giftId));
    }

    /* JADX INFO: renamed from: n */
    public final void m72274n(BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        BLiveStickerMetaDataItem bLiveStickerMetaDataItem2 = this.f48653o;
        if ((bLiveStickerMetaDataItem2 == null || bLiveStickerMetaDataItem == null || !bLiveStickerMetaDataItem2.f44442id.equals(bLiveStickerMetaDataItem.f44442id)) && bLiveStickerMetaDataItem != null) {
            for (int i = 0; i < this.f48649k.size(); i++) {
                if (bLiveStickerMetaDataItem.f44442id.equals(this.f48649k.get(i).f44442id)) {
                    this.f48649k.get(i).isSelected = true;
                    this.f48650l.notifyItemChanged(i);
                }
                BLiveStickerMetaDataItem bLiveStickerMetaDataItem3 = this.f48653o;
                if (bLiveStickerMetaDataItem3 != null && bLiveStickerMetaDataItem3.f44442id.equals(this.f48649k.get(i).f44442id)) {
                    this.f48649k.get(i).isSelected = false;
                    this.f48650l.notifyItemChanged(i);
                }
            }
            this.f48653o = bLiveStickerMetaDataItem;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m72275o(final BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, int i) {
        BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem2 = this.f48654p;
        if ((bLiveStickerTemplatesGiftItem2 == null || bLiveStickerTemplatesGiftItem == null || !bLiveStickerTemplatesGiftItem2.giftId.equals(bLiveStickerTemplatesGiftItem.giftId)) && bLiveStickerTemplatesGiftItem != null) {
            BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem3 = (BLiveStickerTemplatesGiftItem) vwb.m200346r(this.f48651m, new w9j() { // from class: l.y5s
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(bLiveStickerTemplatesGiftItem.giftId, ((BLiveStickerTemplatesGiftItem) obj).giftId));
                }
            });
            tvj tvjVarM211333b = xwf0.m211333b(this.f48652n, this.f48651m, bLiveStickerTemplatesGiftItem);
            if (bLiveStickerTemplatesGiftItem3 != null && tvjVarM211333b != null) {
                bLiveStickerTemplatesGiftItem3.isSelected = true;
                tvjVarM211333b.notifyItemChanged(i);
            }
            BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem4 = (BLiveStickerTemplatesGiftItem) vwb.m200346r(this.f48651m, new w9j() { // from class: l.z5s
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f201844a.m72273m((BLiveStickerTemplatesGiftItem) obj);
                }
            });
            tvj tvjVarM211333b2 = xwf0.m211333b(this.f48652n, this.f48651m, this.f48654p);
            int iM211332a = xwf0.m211332a(this.f48651m, this.f48654p);
            if (bLiveStickerTemplatesGiftItem4 != null && tvjVarM211333b2 != null) {
                bLiveStickerTemplatesGiftItem4.isSelected = false;
                tvjVarM211333b2.notifyItemChanged(iM211332a);
            }
            this.f48654p = bLiveStickerTemplatesGiftItem;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72267g(this);
    }

    public void setGiftList(List<BLiveStickerTemplatesGiftItem> list) {
        this.f48651m = list;
        int iM211335d = xwf0.m211335d(list);
        xdl0.m208344M(this.f48645g, iM211335d >= 2);
        this.f48644f.setOffscreenPageLimit(iM211335d);
        if (!vwb.m200296J(this.f48651m)) {
            this.f48651m.get(0).isSelected = true;
            this.f48654p = this.f48651m.get(0);
        }
        if (this.f48650l != null) {
            this.f48652n.m200194r(xwf0.m211334c(list));
        }
    }

    public void setStickerList(List<BLiveStickerMetaDataItem> list) {
        this.f48649k = list;
        if (!vwb.m200296J(list)) {
            this.f48649k.get(0).isSelected = true;
            this.f48653o = this.f48649k.get(0);
        }
        C12737d c12737d = this.f48650l;
        if (c12737d != null) {
            c12737d.m72476J(list);
        }
    }

    public LiveCustomStickerPickView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LiveCustomStickerPickView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
