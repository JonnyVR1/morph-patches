package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerMenuItem;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;
import com.p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import java.util.List;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import p002l.dxf0;
import p002l.e6s;
import p002l.tvj;
import p002l.vvj;
import p002l.xwf0;
import v.VImage;
import v.VPager;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveCustomStickerPickView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f4681a;

    /* JADX INFO: renamed from: b */
    public VText f4682b;

    /* JADX INFO: renamed from: c */
    public VImage f4683c;

    /* JADX INFO: renamed from: d */
    public View f4684d;

    /* JADX INFO: renamed from: e */
    public TextView f4685e;

    /* JADX INFO: renamed from: f */
    public VPager f4686f;

    /* JADX INFO: renamed from: g */
    public GiftDialogIndicator f4687g;

    /* JADX INFO: renamed from: h */
    public TextView f4688h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f4689i;

    /* JADX INFO: renamed from: j */
    public TextView f4690j;

    /* JADX INFO: renamed from: k */
    public List<BLiveStickerMetaDataItem> f4691k;

    /* JADX INFO: renamed from: l */
    public C0326d f4692l;

    /* JADX INFO: renamed from: m */
    public List<BLiveStickerTemplatesGiftItem> f4693m;

    /* JADX INFO: renamed from: n */
    public vvj f4694n;

    /* JADX INFO: renamed from: o */
    public BLiveStickerMetaDataItem f4695o;

    /* JADX INFO: renamed from: p */
    public BLiveStickerTemplatesGiftItem f4696p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveCustomStickerPickView$a */
    public class C0318a implements ViewPager.j {
        public C0318a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            LiveCustomStickerPickView.this.f4687g.setCurrentItem(i);
        }
    }

    public LiveCustomStickerPickView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: g */
    public final void m5740g(View view) {
        e6s.m12249a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m5741h(C0323a c0323a) {
        vvj vvjVar = new vvj(c0323a);
        this.f4694n = vvjVar;
        this.f4686f.setAdapter(vvjVar);
        this.f4687g.setViewPager(this.f4686f);
        this.f4686f.d(new C0318a());
    }

    /* JADX INFO: renamed from: i */
    public final void m5742i(C0323a c0323a) {
        this.f4689i.setLayoutManager(new GridLayoutManager(c0323a.act(), 2));
        this.f4689i.addItemDecoration(new dxf0(2, t100.d(20.0f), t100.d(12.0f), t100.d(12.0f), true));
        if (this.f4689i.getItemAnimator() != null) {
            this.f4689i.getItemAnimator().setSupportsChangeAnimations(false);
        }
        C0326d c0326d = new C0326d(c0323a.act(), true);
        this.f4692l = c0326d;
        c0326d.m5963I(new C0326d.a() { // from class: l.d6s
            @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.C0326d.a
            /* JADX INFO: renamed from: a */
            public final void mo5965a(LiveStickerMenuItem liveStickerMenuItem) {
                this.f9080a.m5744k(liveStickerMenuItem);
            }
        });
        this.f4689i.setAdapter(this.f4692l);
    }

    /* JADX INFO: renamed from: j */
    public void m5743j(final C0200a c0200a, final C0323a c0323a) {
        this.f4681a.setOnClickListener(new View.OnClickListener() { // from class: l.a6s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0200a.dismiss();
            }
        });
        xdl0.E0(this.f4683c, new View.OnClickListener() { // from class: l.b6s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0200a.dismiss();
            }
        });
        m5742i(c0323a);
        m5741h(c0323a);
        xdl0.E0(this.f4690j, new View.OnClickListener() { // from class: l.c6s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8510a.m5745l(c0323a, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m5744k(LiveStickerMenuItem liveStickerMenuItem) {
        m5747n(liveStickerMenuItem.getItem());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m5745l(C0323a c0323a, View view) {
        BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem;
        BLiveStickerMetaDataItem bLiveStickerMetaDataItem = this.f4695o;
        if (bLiveStickerMetaDataItem == null || (bLiveStickerTemplatesGiftItem = this.f4696p) == null) {
            return;
        }
        c0323a.m5875Z3(bLiveStickerMetaDataItem, bLiveStickerTemplatesGiftItem.giftId);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Boolean m5746m(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        return Boolean.valueOf(TextUtils.equals(this.f4696p.giftId, bLiveStickerTemplatesGiftItem.giftId));
    }

    /* JADX INFO: renamed from: n */
    public final void m5747n(BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        BLiveStickerMetaDataItem bLiveStickerMetaDataItem2 = this.f4695o;
        if ((bLiveStickerMetaDataItem2 == null || bLiveStickerMetaDataItem == null || !bLiveStickerMetaDataItem2.id.equals(bLiveStickerMetaDataItem.id)) && bLiveStickerMetaDataItem != null) {
            for (int i = 0; i < this.f4691k.size(); i++) {
                if (bLiveStickerMetaDataItem.id.equals(this.f4691k.get(i).id)) {
                    this.f4691k.get(i).isSelected = true;
                    this.f4692l.notifyItemChanged(i);
                }
                BLiveStickerMetaDataItem bLiveStickerMetaDataItem3 = this.f4695o;
                if (bLiveStickerMetaDataItem3 != null && bLiveStickerMetaDataItem3.id.equals(this.f4691k.get(i).id)) {
                    this.f4691k.get(i).isSelected = false;
                    this.f4692l.notifyItemChanged(i);
                }
            }
            this.f4695o = bLiveStickerMetaDataItem;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m5748o(final BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, int i) {
        BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem2 = this.f4696p;
        if ((bLiveStickerTemplatesGiftItem2 == null || bLiveStickerTemplatesGiftItem == null || !bLiveStickerTemplatesGiftItem2.giftId.equals(bLiveStickerTemplatesGiftItem.giftId)) && bLiveStickerTemplatesGiftItem != null) {
            BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem3 = (BLiveStickerTemplatesGiftItem) vwb.r(this.f4693m, new w9j() { // from class: l.y5s
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(bLiveStickerTemplatesGiftItem.giftId, ((BLiveStickerTemplatesGiftItem) obj).giftId));
                }
            });
            tvj tvjVarM26153b = xwf0.m26153b(this.f4694n, this.f4693m, bLiveStickerTemplatesGiftItem);
            if (bLiveStickerTemplatesGiftItem3 != null && tvjVarM26153b != null) {
                bLiveStickerTemplatesGiftItem3.isSelected = true;
                tvjVarM26153b.notifyItemChanged(i);
            }
            BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem4 = (BLiveStickerTemplatesGiftItem) vwb.r(this.f4693m, new w9j() { // from class: l.z5s
                public final Object call(Object obj) {
                    return this.f23261a.m5746m((BLiveStickerTemplatesGiftItem) obj);
                }
            });
            tvj tvjVarM26153b2 = xwf0.m26153b(this.f4694n, this.f4693m, this.f4696p);
            int iM26152a = xwf0.m26152a(this.f4693m, this.f4696p);
            if (bLiveStickerTemplatesGiftItem4 != null && tvjVarM26153b2 != null) {
                bLiveStickerTemplatesGiftItem4.isSelected = false;
                tvjVarM26153b2.notifyItemChanged(iM26152a);
            }
            this.f4696p = bLiveStickerTemplatesGiftItem;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5740g(this);
    }

    public void setGiftList(List<BLiveStickerTemplatesGiftItem> list) {
        this.f4693m = list;
        int iM26155d = xwf0.m26155d(list);
        xdl0.M(this.f4687g, iM26155d >= 2);
        this.f4686f.setOffscreenPageLimit(iM26155d);
        if (!vwb.J(this.f4693m)) {
            this.f4693m.get(0).isSelected = true;
            this.f4696p = this.f4693m.get(0);
        }
        if (this.f4692l != null) {
            this.f4694n.m24178r(xwf0.m26154c(list));
        }
    }

    public void setStickerList(List<BLiveStickerMetaDataItem> list) {
        this.f4691k = list;
        if (!vwb.J(list)) {
            this.f4691k.get(0).isSelected = true;
            this.f4695o = this.f4691k.get(0);
        }
        C0326d c0326d = this.f4692l;
        if (c0326d != null) {
            c0326d.m5964J(list);
        }
    }

    public LiveCustomStickerPickView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LiveCustomStickerPickView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
