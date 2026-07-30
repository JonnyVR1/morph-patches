package com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallCategory;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallSkin;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.tantanapp.common.utils.NullChecker;
import l.hxs;
import l.vwb;
import l.w8u;
import l.w9j;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import p002l.fms;
import p002l.nos;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGiftWallSkinSelectItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f5786d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f5787e;

    /* JADX INFO: renamed from: f */
    public TextView f5788f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f5789g;

    public LiveGiftWallSkinSelectItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m7222l0(View view) {
        nos.m18881a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public void m7223m0(final int i, @NotNull final BLiveNewGiftWallGift bLiveNewGiftWallGift, @NotNull BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem, final fms fmsVar) {
        int i2 = i - 1;
        xdl0.M0(this, bLiveNewGiftWallGift.skins.size() > i2);
        if (bLiveNewGiftWallGift.skins.size() > i2) {
            final BLiveNewGiftWallSkin bLiveNewGiftWallSkin = (BLiveNewGiftWallSkin) bLiveNewGiftWallGift.skins.get(i2);
            this.f5788f.setText(w8u.s(bLiveNewGiftWallSkin.name, 5));
            hxs.s("context_livingAct", this.f5786d, bLiveNewGiftWallSkin.icon);
            final BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) vwb.r(bLiveNewGiftWallDetailInfoItem.users, new w9j() { // from class: l.jos
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveNewGiftWallUser) obj).id, bLiveNewGiftWallSkin.namedUserId));
                }
            });
            xdl0.M(this.f5787e, NullChecker.a(bLiveNewGiftWallUser));
            if (NullChecker.a(bLiveNewGiftWallUser)) {
                xdl0.E0(this.f5787e, new View.OnClickListener() { // from class: l.kos
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        fmsVar.m13366t0(bLiveNewGiftWallUser);
                    }
                });
                hxs.s("context_livingAct", this.f5787e, bLiveNewGiftWallUser.avatar);
            }
            xdl0.E0(this, new View.OnClickListener() { // from class: l.los
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fmsVar.m13333D0(i, bLiveNewGiftWallGift);
                }
            });
            BLiveNewGiftWallCategory bLiveNewGiftWallCategory = (BLiveNewGiftWallCategory) vwb.r(bLiveNewGiftWallDetailInfoItem.categories, new w9j() { // from class: l.mos
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveNewGiftWallCategory) obj).id, bLiveNewGiftWallSkin.categoryId));
                }
            });
            if (!bLiveNewGiftWallSkin.isSkin || bLiveNewGiftWallCategory == null) {
                xdl0.M(this.f5789g, false);
            } else {
                xdl0.M(this.f5789g, true);
                hxs.s("context_livingAct", this.f5789g, bLiveNewGiftWallCategory.icon);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7222l0(this);
    }

    public LiveGiftWallSkinSelectItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftWallSkinSelectItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
