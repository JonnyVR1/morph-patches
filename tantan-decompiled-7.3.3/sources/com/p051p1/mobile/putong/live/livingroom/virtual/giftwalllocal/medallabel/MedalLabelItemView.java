package com.p051p1.mobile.putong.live.livingroom.virtual.giftwalllocal.medallabel;

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
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItem;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.apx;
import p153l.bnl0;
import p153l.izs;
import p153l.n3d0;
import p153l.n9c0;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class MedalLabelItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f53175d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53176e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f53177f;

    /* JADX INFO: renamed from: g */
    public VText f53178g;

    /* JADX INFO: renamed from: h */
    public TextView f53179h;

    /* JADX INFO: renamed from: i */
    public VText f53180i;

    /* JADX INFO: renamed from: j */
    public VLinear f53181j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f53182k;

    /* JADX INFO: renamed from: l */
    public VText f53183l;

    /* JADX INFO: renamed from: m */
    public VText f53184m;

    /* JADX INFO: renamed from: n */
    public VLinear f53185n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f53186o;

    /* JADX INFO: renamed from: p */
    public VText f53187p;

    /* JADX INFO: renamed from: q */
    public VText f53188q;

    /* JADX INFO: renamed from: r */
    public VLinear f53189r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f53190s;

    /* JADX INFO: renamed from: t */
    public VText f53191t;

    /* JADX INFO: renamed from: u */
    public VText f53192u;

    /* JADX INFO: renamed from: v */
    public VLinear f53193v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f53194w;

    /* JADX INFO: renamed from: x */
    public VText f53195x;

    /* JADX INFO: renamed from: y */
    public VText f53196y;

    /* JADX INFO: renamed from: z */
    public int f53197z;

    public MedalLabelItemView(Context context) {
        super(context);
        this.f53197z = n3d0.m161283g("#ffffff");
    }

    /* JADX INFO: renamed from: n0 */
    public final void m78166n0(View view) {
        apx.m99379a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m78167o0(BLiveVoiceGiftItem bLiveVoiceGiftItem, boolean z, VDraweeView vDraweeView, VText vText, VText vText2) {
        String str;
        izs.m142868s("context_single_room", vDraweeView, bLiveVoiceGiftItem.icon);
        vText.setText(bLiveVoiceGiftItem.name);
        if (bLiveVoiceGiftItem.unlocked) {
            str = BaseSei.f14624X + bLiveVoiceGiftItem.amount + "";
        } else {
            str = "未获得";
        }
        vText2.setText(str);
        if (z) {
            vText.setTextColor(this.f53197z);
            vText2.setTextColor(this.f53197z);
            vDraweeView.setColorFilter((ColorFilter) null);
            vDraweeView.setAlpha(1.0f);
            return;
        }
        if (bLiveVoiceGiftItem.unlocked) {
            vText.setTextColor(n3d0.m161277a(n9c0.f140856p1));
            vText2.setTextColor(n3d0.m161277a(n9c0.f140856p1));
            vDraweeView.setColorFilter((ColorFilter) null);
            vDraweeView.setAlpha(1.0f);
            return;
        }
        vText.setTextColor(n3d0.m161277a(n9c0.f140850n1));
        vText2.setTextColor(n3d0.m161277a(n9c0.f140850n1));
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        vDraweeView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        vDraweeView.setAlpha(0.7f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78166n0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m78168p0(final BLiveVoiceMedalWallItem bLiveVoiceMedalWallItem, boolean z, final y20<BLiveVoiceGiftItem> y20Var) {
        GradientDrawable gradientDrawableM161279c = z ? n3d0.m161279c(bLiveVoiceMedalWallItem.cardColor, 8) : n3d0.m161279c("#08ffffff", 8);
        if (bLiveVoiceMedalWallItem.gifts.isEmpty()) {
            return;
        }
        if (bLiveVoiceMedalWallItem.gifts.get(0) != null) {
            m78167o0(bLiveVoiceMedalWallItem.gifts.get(0), z, this.f53182k, this.f53183l, this.f53184m);
            bnl0.m105509E0(this.f53181j, new View.OnClickListener() { // from class: l.wox
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y20Var.call(bLiveVoiceMedalWallItem.gifts.get(0));
                }
            });
            this.f53181j.setBackgroundDrawable(gradientDrawableM161279c);
        }
        if (bLiveVoiceMedalWallItem.gifts.get(1) != null) {
            m78167o0(bLiveVoiceMedalWallItem.gifts.get(1), z, this.f53186o, this.f53187p, this.f53188q);
            bnl0.m105509E0(this.f53185n, new View.OnClickListener() { // from class: l.xox
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y20Var.call(bLiveVoiceMedalWallItem.gifts.get(1));
                }
            });
            this.f53185n.setBackgroundDrawable(gradientDrawableM161279c);
        }
        if (bLiveVoiceMedalWallItem.gifts.get(2) != null) {
            m78167o0(bLiveVoiceMedalWallItem.gifts.get(2), z, this.f53190s, this.f53191t, this.f53192u);
            bnl0.m105509E0(this.f53189r, new View.OnClickListener() { // from class: l.yox
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y20Var.call(bLiveVoiceMedalWallItem.gifts.get(2));
                }
            });
            this.f53189r.setBackgroundDrawable(gradientDrawableM161279c);
        }
        if (bLiveVoiceMedalWallItem.gifts.get(3) != null) {
            m78167o0(bLiveVoiceMedalWallItem.gifts.get(3), z, this.f53194w, this.f53195x, this.f53196y);
            bnl0.m105509E0(this.f53193v, new View.OnClickListener() { // from class: l.zox
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y20Var.call(bLiveVoiceMedalWallItem.gifts.get(3));
                }
            });
            this.f53193v.setBackgroundDrawable(gradientDrawableM161279c);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m78169q0(final BLiveVoiceMedalWallItem bLiveVoiceMedalWallItem, final y20<String> y20Var) {
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceMedalWallItem.status);
        VText vText = this.f53178g;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
        }
        bnl0.m105524M(vText, true);
        String str = bLiveVoiceMedalWallItem.status;
        str.getClass();
        switch (str) {
            case "locked":
                this.f53178g.setText("未点亮");
                this.f53178g.setTextColor(n3d0.m161277a(n9c0.f140847m1));
                bnl0.m105509E0(this.f53178g, null);
                break;
            case "rewarded":
                bnl0.m105509E0(this.f53178g, null);
                this.f53178g.setText("已领取");
                this.f53178g.setTextColor(n3d0.m161283g(n3d0.m161286j(this.f53197z, "66")));
                break;
            case "unlocked":
                this.f53178g.setText("领取");
                this.f53178g.setTextColor(this.f53197z);
                bnl0.m105509E0(this.f53178g, new View.OnClickListener() { // from class: l.vox
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        y20Var.call(bLiveVoiceMedalWallItem.f45354id + "");
                    }
                });
                break;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m78170r0(final BLiveVoiceMedalWallItem bLiveVoiceMedalWallItem, y20<String> y20Var, y20<BLiveVoiceGiftItem> y20Var2, final y20<String> y20Var3) {
        izs.m142868s("context_single_room", this.f53175d, bLiveVoiceMedalWallItem.bgPicUrl);
        if (!TextUtils.isEmpty(bLiveVoiceMedalWallItem.headerUrl.staticUrl)) {
            bnl0.m105524M(this.f53176e, true);
            bnl0.m105524M(this.f53177f, false);
            izs.m142868s("context_single_room", this.f53176e, bLiveVoiceMedalWallItem.headerUrl.staticUrl);
        } else if (!TextUtils.isEmpty(bLiveVoiceMedalWallItem.headerUrl.dynamicUrl)) {
            bnl0.m105524M(this.f53176e, false);
            bnl0.m105524M(this.f53177f, true);
            this.f53177f.m69683j(bLiveVoiceMedalWallItem.headerUrl.dynamicUrl, -1);
        }
        this.f53197z = n3d0.m161283g(bLiveVoiceMedalWallItem.textColor);
        this.f53179h.setText(bLiveVoiceMedalWallItem.title);
        this.f53180i.setText(bLiveVoiceMedalWallItem.subTitle);
        boolean z = bLiveVoiceMedalWallItem.status.equals("unlocked") || bLiveVoiceMedalWallItem.status.equals("rewarded") || bLiveVoiceMedalWallItem.status.equals("");
        if (z) {
            this.f53176e.setColorFilter((ColorFilter) null);
            this.f53176e.setAlpha(1.0f);
            this.f53179h.setTextColor(this.f53197z);
            this.f53180i.setTextColor(n3d0.m161283g(n3d0.m161286j(this.f53197z, "80")));
        } else {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.f53176e.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.f53176e.setAlpha(0.7f);
            this.f53179h.setTextColor(n3d0.m161277a(n9c0.f140877w1));
            this.f53180i.setTextColor(n3d0.m161277a(n9c0.f140850n1));
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.uox
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var3.call(bLiveVoiceMedalWallItem.status);
            }
        });
        m78169q0(bLiveVoiceMedalWallItem, y20Var);
        m78168p0(bLiveVoiceMedalWallItem, z, y20Var2);
    }

    public MedalLabelItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53197z = n3d0.m161283g("#ffffff");
    }

    public MedalLabelItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53197z = n3d0.m161283g("#ffffff");
    }
}
