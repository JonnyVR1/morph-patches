package com.p046p1.mobile.putong.live.livingroom.virtual.giftwalllocal.medallabel;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItem;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.cgx;
import p149l.e30;
import p149l.h1c0;
import p149l.hxs;
import p149l.kvc0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class MedalLabelItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f52327d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f52328e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f52329f;

    /* JADX INFO: renamed from: g */
    public VText f52330g;

    /* JADX INFO: renamed from: h */
    public TextView f52331h;

    /* JADX INFO: renamed from: i */
    public VText f52332i;

    /* JADX INFO: renamed from: j */
    public VLinear f52333j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f52334k;

    /* JADX INFO: renamed from: l */
    public VText f52335l;

    /* JADX INFO: renamed from: m */
    public VText f52336m;

    /* JADX INFO: renamed from: n */
    public VLinear f52337n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f52338o;

    /* JADX INFO: renamed from: p */
    public VText f52339p;

    /* JADX INFO: renamed from: q */
    public VText f52340q;

    /* JADX INFO: renamed from: r */
    public VLinear f52341r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f52342s;

    /* JADX INFO: renamed from: t */
    public VText f52343t;

    /* JADX INFO: renamed from: u */
    public VText f52344u;

    /* JADX INFO: renamed from: v */
    public VLinear f52345v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f52346w;

    /* JADX INFO: renamed from: x */
    public VText f52347x;

    /* JADX INFO: renamed from: y */
    public VText f52348y;

    /* JADX INFO: renamed from: z */
    public int f52349z;

    public MedalLabelItemView(Context context) {
        super(context);
        this.f52349z = kvc0.m147358g("#ffffff");
    }

    /* JADX INFO: renamed from: n0 */
    public final void m76983n0(View view) {
        cgx.m106843a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m76984o0(BLiveVoiceGiftItem bLiveVoiceGiftItem, boolean z, VDraweeView vDraweeView, VText vText, VText vText2) {
        String str;
        hxs.m133406s("context_single_room", vDraweeView, bLiveVoiceGiftItem.icon);
        vText.setText(bLiveVoiceGiftItem.name);
        if (bLiveVoiceGiftItem.unlocked) {
            str = BaseSei.f13930X + bLiveVoiceGiftItem.amount + "";
        } else {
            str = "未获得";
        }
        vText2.setText(str);
        if (z) {
            vText.setTextColor(this.f52349z);
            vText2.setTextColor(this.f52349z);
            vDraweeView.setColorFilter((ColorFilter) null);
            vDraweeView.setAlpha(1.0f);
            return;
        }
        if (bLiveVoiceGiftItem.unlocked) {
            vText.setTextColor(kvc0.m147352a(h1c0.f105395p1));
            vText2.setTextColor(kvc0.m147352a(h1c0.f105395p1));
            vDraweeView.setColorFilter((ColorFilter) null);
            vDraweeView.setAlpha(1.0f);
            return;
        }
        vText.setTextColor(kvc0.m147352a(h1c0.f105389n1));
        vText2.setTextColor(kvc0.m147352a(h1c0.f105389n1));
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        vDraweeView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        vDraweeView.setAlpha(0.7f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76983n0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m76985p0(final BLiveVoiceMedalWallItem bLiveVoiceMedalWallItem, boolean z, final e30<BLiveVoiceGiftItem> e30Var) {
        GradientDrawable gradientDrawableM147354c = z ? kvc0.m147354c(bLiveVoiceMedalWallItem.cardColor, 8) : kvc0.m147354c("#08ffffff", 8);
        if (bLiveVoiceMedalWallItem.gifts.isEmpty()) {
            return;
        }
        if (bLiveVoiceMedalWallItem.gifts.get(0) != null) {
            m76984o0(bLiveVoiceMedalWallItem.gifts.get(0), z, this.f52334k, this.f52335l, this.f52336m);
            xdl0.m208329E0(this.f52333j, new View.OnClickListener() { // from class: l.yfx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e30Var.call(bLiveVoiceMedalWallItem.gifts.get(0));
                }
            });
            this.f52333j.setBackgroundDrawable(gradientDrawableM147354c);
        }
        if (bLiveVoiceMedalWallItem.gifts.get(1) != null) {
            m76984o0(bLiveVoiceMedalWallItem.gifts.get(1), z, this.f52338o, this.f52339p, this.f52340q);
            xdl0.m208329E0(this.f52337n, new View.OnClickListener() { // from class: l.zfx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e30Var.call(bLiveVoiceMedalWallItem.gifts.get(1));
                }
            });
            this.f52337n.setBackgroundDrawable(gradientDrawableM147354c);
        }
        if (bLiveVoiceMedalWallItem.gifts.get(2) != null) {
            m76984o0(bLiveVoiceMedalWallItem.gifts.get(2), z, this.f52342s, this.f52343t, this.f52344u);
            xdl0.m208329E0(this.f52341r, new View.OnClickListener() { // from class: l.agx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e30Var.call(bLiveVoiceMedalWallItem.gifts.get(2));
                }
            });
            this.f52341r.setBackgroundDrawable(gradientDrawableM147354c);
        }
        if (bLiveVoiceMedalWallItem.gifts.get(3) != null) {
            m76984o0(bLiveVoiceMedalWallItem.gifts.get(3), z, this.f52346w, this.f52347x, this.f52348y);
            xdl0.m208329E0(this.f52345v, new View.OnClickListener() { // from class: l.bgx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e30Var.call(bLiveVoiceMedalWallItem.gifts.get(3));
                }
            });
            this.f52345v.setBackgroundDrawable(gradientDrawableM147354c);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m76986q0(final BLiveVoiceMedalWallItem bLiveVoiceMedalWallItem, final e30<String> e30Var) {
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceMedalWallItem.status);
        VText vText = this.f52330g;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
        }
        xdl0.m208344M(vText, true);
        String str = bLiveVoiceMedalWallItem.status;
        str.getClass();
        switch (str) {
            case "locked":
                this.f52330g.setText("未点亮");
                this.f52330g.setTextColor(kvc0.m147352a(h1c0.f105386m1));
                xdl0.m208329E0(this.f52330g, null);
                break;
            case "rewarded":
                xdl0.m208329E0(this.f52330g, null);
                this.f52330g.setText("已领取");
                this.f52330g.setTextColor(kvc0.m147358g(kvc0.m147361j(this.f52349z, "66")));
                break;
            case "unlocked":
                this.f52330g.setText("领取");
                this.f52330g.setTextColor(this.f52349z);
                xdl0.m208329E0(this.f52330g, new View.OnClickListener() { // from class: l.xfx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        e30Var.call(bLiveVoiceMedalWallItem.f44506id + "");
                    }
                });
                break;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m76987r0(final BLiveVoiceMedalWallItem bLiveVoiceMedalWallItem, e30<String> e30Var, e30<BLiveVoiceGiftItem> e30Var2, final e30<String> e30Var3) {
        hxs.m133406s("context_single_room", this.f52327d, bLiveVoiceMedalWallItem.bgPicUrl);
        if (!TextUtils.isEmpty(bLiveVoiceMedalWallItem.headerUrl.staticUrl)) {
            xdl0.m208344M(this.f52328e, true);
            xdl0.m208344M(this.f52329f, false);
            hxs.m133406s("context_single_room", this.f52328e, bLiveVoiceMedalWallItem.headerUrl.staticUrl);
        } else if (!TextUtils.isEmpty(bLiveVoiceMedalWallItem.headerUrl.dynamicUrl)) {
            xdl0.m208344M(this.f52328e, false);
            xdl0.m208344M(this.f52329f, true);
            this.f52329f.m68500j(bLiveVoiceMedalWallItem.headerUrl.dynamicUrl, -1);
        }
        this.f52349z = kvc0.m147358g(bLiveVoiceMedalWallItem.textColor);
        this.f52331h.setText(bLiveVoiceMedalWallItem.title);
        this.f52332i.setText(bLiveVoiceMedalWallItem.subTitle);
        boolean z = bLiveVoiceMedalWallItem.status.equals("unlocked") || bLiveVoiceMedalWallItem.status.equals("rewarded") || bLiveVoiceMedalWallItem.status.equals("");
        if (z) {
            this.f52328e.setColorFilter((ColorFilter) null);
            this.f52328e.setAlpha(1.0f);
            this.f52331h.setTextColor(this.f52349z);
            this.f52332i.setTextColor(kvc0.m147358g(kvc0.m147361j(this.f52349z, "80")));
        } else {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.f52328e.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.f52328e.setAlpha(0.7f);
            this.f52331h.setTextColor(kvc0.m147352a(h1c0.f105416w1));
            this.f52332i.setTextColor(kvc0.m147352a(h1c0.f105389n1));
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.wfx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var3.call(bLiveVoiceMedalWallItem.status);
            }
        });
        m76986q0(bLiveVoiceMedalWallItem, e30Var);
        m76985p0(bLiveVoiceMedalWallItem, z, e30Var2);
    }

    public MedalLabelItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52349z = kvc0.m147358g("#ffffff");
    }

    public MedalLabelItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52349z = kvc0.m147358g("#ffffff");
    }
}
