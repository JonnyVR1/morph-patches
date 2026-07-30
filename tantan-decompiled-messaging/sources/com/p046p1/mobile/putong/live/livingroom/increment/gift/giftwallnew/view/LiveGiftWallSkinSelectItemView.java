package com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallCategory;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallSkin;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p149l.fms;
import p149l.hxs;
import p149l.nos;
import p149l.vwb;
import p149l.w8u;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftWallSkinSelectItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f49744d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49745e;

    /* JADX INFO: renamed from: f */
    public TextView f49746f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49747g;

    public LiveGiftWallSkinSelectItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m73674l0(View view) {
        nos.m160417a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public void m73675m0(final int i, @NotNull final BLiveNewGiftWallGift bLiveNewGiftWallGift, @NotNull BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem, final fms fmsVar) {
        int i2 = i - 1;
        xdl0.m208345M0(this, bLiveNewGiftWallGift.skins.size() > i2);
        if (bLiveNewGiftWallGift.skins.size() > i2) {
            final BLiveNewGiftWallSkin bLiveNewGiftWallSkin = bLiveNewGiftWallGift.skins.get(i2);
            this.f49746f.setText(w8u.m202216s(bLiveNewGiftWallSkin.name, 5));
            hxs.m133406s("context_livingAct", this.f49744d, bLiveNewGiftWallSkin.icon);
            final BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) vwb.m200346r(bLiveNewGiftWallDetailInfoItem.users, new w9j() { // from class: l.jos
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveNewGiftWallUser) obj).f44416id, bLiveNewGiftWallSkin.namedUserId));
                }
            });
            xdl0.m208344M(this.f49745e, NullChecker.m81303a(bLiveNewGiftWallUser));
            if (NullChecker.m81303a(bLiveNewGiftWallUser)) {
                xdl0.m208329E0(this.f49745e, new View.OnClickListener() { // from class: l.kos
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        fmsVar.m122248t0(bLiveNewGiftWallUser);
                    }
                });
                hxs.m133406s("context_livingAct", this.f49745e, bLiveNewGiftWallUser.avatar);
            }
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.los
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fmsVar.m122215D0(i, bLiveNewGiftWallGift);
                }
            });
            BLiveNewGiftWallCategory bLiveNewGiftWallCategory = (BLiveNewGiftWallCategory) vwb.m200346r(bLiveNewGiftWallDetailInfoItem.categories, new w9j() { // from class: l.mos
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveNewGiftWallCategory) obj).f44410id, bLiveNewGiftWallSkin.categoryId));
                }
            });
            if (!bLiveNewGiftWallSkin.isSkin || bLiveNewGiftWallCategory == null) {
                xdl0.m208344M(this.f49747g, false);
            } else {
                xdl0.m208344M(this.f49747g, true);
                hxs.m133406s("context_livingAct", this.f49747g, bLiveNewGiftWallCategory.icon);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73674l0(this);
    }

    public LiveGiftWallSkinSelectItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftWallSkinSelectItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
