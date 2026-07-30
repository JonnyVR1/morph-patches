package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AbstractC0618v;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerMenuItem;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;
import java.util.List;
import p151v.VImage;
import p151v.VPager;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.f8s;
import p153l.h5g0;
import p153l.jyb;
import p153l.jyj;
import p153l.lyj;
import p153l.n5g0;
import p153l.qa00;
import p153l.qcj;

/* JADX INFO: loaded from: classes4.dex */
public class LiveCustomStickerPickView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f49487a;

    /* JADX INFO: renamed from: b */
    public VText f49488b;

    /* JADX INFO: renamed from: c */
    public VImage f49489c;

    /* JADX INFO: renamed from: d */
    public View f49490d;

    /* JADX INFO: renamed from: e */
    public TextView f49491e;

    /* JADX INFO: renamed from: f */
    public VPager f49492f;

    /* JADX INFO: renamed from: g */
    public GiftDialogIndicator f49493g;

    /* JADX INFO: renamed from: h */
    public TextView f49494h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f49495i;

    /* JADX INFO: renamed from: j */
    public TextView f49496j;

    /* JADX INFO: renamed from: k */
    public List<BLiveStickerMetaDataItem> f49497k;

    /* JADX INFO: renamed from: l */
    public C12900d f49498l;

    /* JADX INFO: renamed from: m */
    public List<BLiveStickerTemplatesGiftItem> f49499m;

    /* JADX INFO: renamed from: n */
    public lyj f49500n;

    /* JADX INFO: renamed from: o */
    public BLiveStickerMetaDataItem f49501o;

    /* JADX INFO: renamed from: p */
    public BLiveStickerTemplatesGiftItem f49502p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveCustomStickerPickView$a */
    public class C12892a implements ViewPager.InterfaceC0718j {
        public C12892a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            LiveCustomStickerPickView.this.f49493g.setCurrentItem(i);
        }
    }

    public LiveCustomStickerPickView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: g */
    public final void m73450g(View view) {
        f8s.m124553a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m73451h(C12897a c12897a) {
        lyj lyjVar = new lyj(c12897a);
        this.f49500n = lyjVar;
        this.f49492f.setAdapter(lyjVar);
        this.f49493g.setViewPager(this.f49492f);
        this.f49492f.m4187d(new C12892a());
    }

    /* JADX INFO: renamed from: i */
    public final void m73452i(C12897a c12897a) {
        this.f49495i.setLayoutManager(new GridLayoutManager(c12897a.act(), 2));
        this.f49495i.addItemDecoration(new n5g0(2, qa00.m175859d(20.0f), qa00.m175859d(12.0f), qa00.m175859d(12.0f), true));
        if (this.f49495i.getItemAnimator() != null) {
            ((AbstractC0618v) this.f49495i.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        C12900d c12900d = new C12900d(c12897a.act(), true);
        this.f49498l = c12900d;
        c12900d.m73658I(new C12900d.a() { // from class: l.e8s
            @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.C12900d.a
            /* JADX INFO: renamed from: a */
            public final void mo73660a(LiveStickerMenuItem liveStickerMenuItem) {
                this.f92558a.m73454k(liveStickerMenuItem);
            }
        });
        this.f49495i.setAdapter(this.f49498l);
    }

    /* JADX INFO: renamed from: j */
    public void m73453j(final DialogC12774a dialogC12774a, final C12897a c12897a) {
        this.f49487a.setOnClickListener(new View.OnClickListener() { // from class: l.b8s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogC12774a.dismiss();
            }
        });
        bnl0.m105509E0(this.f49489c, new View.OnClickListener() { // from class: l.c8s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogC12774a.dismiss();
            }
        });
        m73452i(c12897a);
        m73451h(c12897a);
        bnl0.m105509E0(this.f49496j, new View.OnClickListener() { // from class: l.d8s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85679a.m73455l(c12897a, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m73454k(LiveStickerMenuItem liveStickerMenuItem) {
        m73457n(liveStickerMenuItem.getItem());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m73455l(C12897a c12897a, View view) {
        BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem;
        BLiveStickerMetaDataItem bLiveStickerMetaDataItem = this.f49501o;
        if (bLiveStickerMetaDataItem == null || (bLiveStickerTemplatesGiftItem = this.f49502p) == null) {
            return;
        }
        c12897a.m73575Z3(bLiveStickerMetaDataItem, bLiveStickerTemplatesGiftItem.giftId);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Boolean m73456m(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        return Boolean.valueOf(TextUtils.equals(this.f49502p.giftId, bLiveStickerTemplatesGiftItem.giftId));
    }

    /* JADX INFO: renamed from: n */
    public final void m73457n(BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        BLiveStickerMetaDataItem bLiveStickerMetaDataItem2 = this.f49501o;
        if ((bLiveStickerMetaDataItem2 == null || bLiveStickerMetaDataItem == null || !bLiveStickerMetaDataItem2.f45290id.equals(bLiveStickerMetaDataItem.f45290id)) && bLiveStickerMetaDataItem != null) {
            for (int i = 0; i < this.f49497k.size(); i++) {
                if (bLiveStickerMetaDataItem.f45290id.equals(this.f49497k.get(i).f45290id)) {
                    this.f49497k.get(i).isSelected = true;
                    this.f49498l.notifyItemChanged(i);
                }
                BLiveStickerMetaDataItem bLiveStickerMetaDataItem3 = this.f49501o;
                if (bLiveStickerMetaDataItem3 != null && bLiveStickerMetaDataItem3.f45290id.equals(this.f49497k.get(i).f45290id)) {
                    this.f49497k.get(i).isSelected = false;
                    this.f49498l.notifyItemChanged(i);
                }
            }
            this.f49501o = bLiveStickerMetaDataItem;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m73458o(final BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, int i) {
        BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem2 = this.f49502p;
        if ((bLiveStickerTemplatesGiftItem2 == null || bLiveStickerTemplatesGiftItem == null || !bLiveStickerTemplatesGiftItem2.giftId.equals(bLiveStickerTemplatesGiftItem.giftId)) && bLiveStickerTemplatesGiftItem != null) {
            BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem3 = (BLiveStickerTemplatesGiftItem) jyb.m147529r(this.f49499m, new qcj() { // from class: l.z7s
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(bLiveStickerTemplatesGiftItem.giftId, ((BLiveStickerTemplatesGiftItem) obj).giftId));
                }
            });
            jyj jyjVarM133659b = h5g0.m133659b(this.f49500n, this.f49499m, bLiveStickerTemplatesGiftItem);
            if (bLiveStickerTemplatesGiftItem3 != null && jyjVarM133659b != null) {
                bLiveStickerTemplatesGiftItem3.isSelected = true;
                jyjVarM133659b.notifyItemChanged(i);
            }
            BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem4 = (BLiveStickerTemplatesGiftItem) jyb.m147529r(this.f49499m, new qcj() { // from class: l.a8s
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f68943a.m73456m((BLiveStickerTemplatesGiftItem) obj);
                }
            });
            jyj jyjVarM133659b2 = h5g0.m133659b(this.f49500n, this.f49499m, this.f49502p);
            int iM133658a = h5g0.m133658a(this.f49499m, this.f49502p);
            if (bLiveStickerTemplatesGiftItem4 != null && jyjVarM133659b2 != null) {
                bLiveStickerTemplatesGiftItem4.isSelected = false;
                jyjVarM133659b2.notifyItemChanged(iM133658a);
            }
            this.f49502p = bLiveStickerTemplatesGiftItem;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73450g(this);
    }

    public void setGiftList(List<BLiveStickerTemplatesGiftItem> list) {
        this.f49499m = list;
        int iM133661d = h5g0.m133661d(list);
        bnl0.m105524M(this.f49493g, iM133661d >= 2);
        this.f49492f.setOffscreenPageLimit(iM133661d);
        if (!jyb.m147479J(this.f49499m)) {
            this.f49499m.get(0).isSelected = true;
            this.f49502p = this.f49499m.get(0);
        }
        if (this.f49498l != null) {
            this.f49500n.m156294r(h5g0.m133660c(list));
        }
    }

    public void setStickerList(List<BLiveStickerMetaDataItem> list) {
        this.f49497k = list;
        if (!jyb.m147479J(list)) {
            this.f49497k.get(0).isSelected = true;
            this.f49501o = this.f49497k.get(0);
        }
        C12900d c12900d = this.f49498l;
        if (c12900d != null) {
            c12900d.m73659J(list);
        }
    }

    public LiveCustomStickerPickView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LiveCustomStickerPickView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
