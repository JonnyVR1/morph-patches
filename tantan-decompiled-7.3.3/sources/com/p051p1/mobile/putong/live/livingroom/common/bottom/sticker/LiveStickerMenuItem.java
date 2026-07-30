package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p051p1.mobile.putong.live.base.view.RatioLayout;
import java.io.File;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.dhw;
import p153l.izs;
import p153l.qa00;
import p153l.y20;
import p153l.y7u;

/* JADX INFO: loaded from: classes4.dex */
public class LiveStickerMenuItem extends RatioLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f49547a;

    /* JADX INFO: renamed from: b */
    public BLiveStickerMetaDataItem f49548b;

    public LiveStickerMenuItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m73506c(View view) {
        y7u.m214605a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m73507d(boolean z) {
        if (z) {
            setRatio(2.03f);
            bnl0.m105569n(this, qa00.m175859d(22.0f), qa00.m175859d(14.0f), qa00.m175859d(22.0f), qa00.m175859d(14.0f));
        } else {
            setRatio(2.31f);
            bnl0.m105569n(this, qa00.m175859d(16.0f), qa00.m175859d(12.0f), qa00.m175859d(16.0f), qa00.m175859d(12.0f));
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m73508e(BLiveStickerMetaDataItem bLiveStickerMetaDataItem, Pair pair) {
        if (TextUtils.equals(((BLiveStickerMetaDataItem) pair.first).f45290id, this.f49548b.f45290id) && LiveStickerResManager.m73530w().m73531A(bLiveStickerMetaDataItem)) {
            izs.m142869t("context_livingAct", this.f49547a, Uri.fromFile(new File(LiveStickerResManager.m73530w().m73548v(bLiveStickerMetaDataItem.url))).toString(), qa00.f156306S);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m73509f(final BLiveStickerMetaDataItem bLiveStickerMetaDataItem, C12900d c12900d) {
        this.f49548b = bLiveStickerMetaDataItem;
        setSelected(bLiveStickerMetaDataItem.isSelected);
        if (!LiveStickerResManager.m73530w().m73531A(bLiveStickerMetaDataItem)) {
            c12900d.duringCreated(LiveStickerResManager.m73530w().m73541K(bLiveStickerMetaDataItem)).subscribe(dhw.m115825d(new y20() { // from class: l.x7u
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f192754a.m73508e(bLiveStickerMetaDataItem, (Pair) obj);
                }
            }));
        } else {
            izs.m142869t("context_livingAct", this.f49547a, Uri.fromFile(new File(LiveStickerResManager.m73530w().m73548v(bLiveStickerMetaDataItem.url))).toString(), qa00.f156306S);
        }
    }

    public BLiveStickerMetaDataItem getBindingItem() {
        return this.f49548b;
    }

    public BLiveStickerMetaDataItem getItem() {
        return this.f49548b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73506c(this);
    }

    public LiveStickerMenuItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveStickerMenuItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
