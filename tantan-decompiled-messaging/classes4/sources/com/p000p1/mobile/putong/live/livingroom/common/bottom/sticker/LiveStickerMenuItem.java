package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p1.mobile.putong.live.base.view.RatioLayout;
import java.io.File;
import l.e30;
import l.ffw;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.x5u;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveStickerMenuItem extends RatioLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f4741a;

    /* JADX INFO: renamed from: b */
    public BLiveStickerMetaDataItem f4742b;

    public LiveStickerMenuItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m5800c(View view) {
        x5u.m25691a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public void m5801d(boolean z) {
        if (z) {
            setRatio(2.03f);
            xdl0.n(this, t100.d(22.0f), t100.d(14.0f), t100.d(22.0f), t100.d(14.0f));
        } else {
            setRatio(2.31f);
            xdl0.n(this, t100.d(16.0f), t100.d(12.0f), t100.d(16.0f), t100.d(12.0f));
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m5802e(BLiveStickerMetaDataItem bLiveStickerMetaDataItem, Pair pair) {
        if (TextUtils.equals(((BLiveStickerMetaDataItem) pair.first).id, this.f4742b.id) && LiveStickerResManager.m5824w().m5825A(bLiveStickerMetaDataItem)) {
            hxs.t("context_livingAct", this.f4741a, Uri.fromFile(new File(LiveStickerResManager.m5824w().m5842v(bLiveStickerMetaDataItem.url))).toString(), t100.S);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public void m5803f(final BLiveStickerMetaDataItem bLiveStickerMetaDataItem, C0326d c0326d) {
        this.f4742b = bLiveStickerMetaDataItem;
        setSelected(bLiveStickerMetaDataItem.isSelected);
        if (!LiveStickerResManager.m5824w().m5825A(bLiveStickerMetaDataItem)) {
            c0326d.duringCreated(LiveStickerResManager.m5824w().m5835K(bLiveStickerMetaDataItem)).subscribe(ffw.d(new e30() { // from class: l.w5u
                public final void call(Object obj) {
                    this.f21476a.m5802e(bLiveStickerMetaDataItem, (Pair) obj);
                }
            }));
        } else {
            hxs.t("context_livingAct", this.f4741a, Uri.fromFile(new File(LiveStickerResManager.m5824w().m5842v(bLiveStickerMetaDataItem.url))).toString(), t100.S);
        }
    }

    public BLiveStickerMetaDataItem getBindingItem() {
        return this.f4742b;
    }

    public BLiveStickerMetaDataItem getItem() {
        return this.f4742b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5800c(this);
    }

    public LiveStickerMenuItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveStickerMenuItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
