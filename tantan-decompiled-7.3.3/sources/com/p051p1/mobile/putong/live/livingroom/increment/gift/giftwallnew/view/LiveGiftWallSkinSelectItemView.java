package com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallCategory;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallSkin;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.gos;
import p153l.izs;
import p153l.jyb;
import p153l.oqs;
import p153l.qcj;
import p153l.xau;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftWallSkinSelectItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f50592d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50593e;

    /* JADX INFO: renamed from: f */
    public TextView f50594f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f50595g;

    public LiveGiftWallSkinSelectItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m74857l0(View view) {
        oqs.m168848a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public void m74858m0(final int i, @NotNull final BLiveNewGiftWallGift bLiveNewGiftWallGift, @NotNull BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem, final gos gosVar) {
        int i2 = i - 1;
        bnl0.m105525M0(this, bLiveNewGiftWallGift.skins.size() > i2);
        if (bLiveNewGiftWallGift.skins.size() > i2) {
            final BLiveNewGiftWallSkin bLiveNewGiftWallSkin = bLiveNewGiftWallGift.skins.get(i2);
            this.f50594f.setText(xau.m209909s(bLiveNewGiftWallSkin.name, 5));
            izs.m142868s("context_livingAct", this.f50592d, bLiveNewGiftWallSkin.icon);
            final BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) jyb.m147529r(bLiveNewGiftWallDetailInfoItem.users, new qcj() { // from class: l.kqs
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveNewGiftWallUser) obj).f45264id, bLiveNewGiftWallSkin.namedUserId));
                }
            });
            bnl0.m105524M(this.f50593e, NullChecker.m82486a(bLiveNewGiftWallUser));
            if (NullChecker.m82486a(bLiveNewGiftWallUser)) {
                bnl0.m105509E0(this.f50593e, new View.OnClickListener() { // from class: l.lqs
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        gosVar.m131179t0(bLiveNewGiftWallUser);
                    }
                });
                izs.m142868s("context_livingAct", this.f50593e, bLiveNewGiftWallUser.avatar);
            }
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.mqs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gosVar.m131146D0(i, bLiveNewGiftWallGift);
                }
            });
            BLiveNewGiftWallCategory bLiveNewGiftWallCategory = (BLiveNewGiftWallCategory) jyb.m147529r(bLiveNewGiftWallDetailInfoItem.categories, new qcj() { // from class: l.nqs
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveNewGiftWallCategory) obj).f45258id, bLiveNewGiftWallSkin.categoryId));
                }
            });
            if (!bLiveNewGiftWallSkin.isSkin || bLiveNewGiftWallCategory == null) {
                bnl0.m105524M(this.f50595g, false);
            } else {
                bnl0.m105524M(this.f50595g, true);
                izs.m142868s("context_livingAct", this.f50595g, bLiveNewGiftWallCategory.icon);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74857l0(this);
    }

    public LiveGiftWallSkinSelectItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftWallSkinSelectItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
