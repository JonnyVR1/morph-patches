package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p046p1.mobile.putong.live.base.view.RatioLayout;
import java.io.File;
import p147v.VDraweeView;
import p149l.e30;
import p149l.ffw;
import p149l.hxs;
import p149l.t100;
import p149l.x5u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveStickerMenuItem extends RatioLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f48699a;

    /* JADX INFO: renamed from: b */
    public BLiveStickerMetaDataItem f48700b;

    public LiveStickerMenuItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m72323c(View view) {
        x5u.m207146a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m72324d(boolean z) {
        if (z) {
            setRatio(2.03f);
            xdl0.m208389n(this, t100.m186890d(22.0f), t100.m186890d(14.0f), t100.m186890d(22.0f), t100.m186890d(14.0f));
        } else {
            setRatio(2.31f);
            xdl0.m208389n(this, t100.m186890d(16.0f), t100.m186890d(12.0f), t100.m186890d(16.0f), t100.m186890d(12.0f));
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m72325e(BLiveStickerMetaDataItem bLiveStickerMetaDataItem, Pair pair) {
        if (TextUtils.equals(((BLiveStickerMetaDataItem) pair.first).f44442id, this.f48700b.f44442id) && LiveStickerResManager.m72347w().m72348A(bLiveStickerMetaDataItem)) {
            hxs.m133407t("context_livingAct", this.f48699a, Uri.fromFile(new File(LiveStickerResManager.m72347w().m72365v(bLiveStickerMetaDataItem.url))).toString(), t100.f167244S);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m72326f(final BLiveStickerMetaDataItem bLiveStickerMetaDataItem, C12737d c12737d) {
        this.f48700b = bLiveStickerMetaDataItem;
        setSelected(bLiveStickerMetaDataItem.isSelected);
        if (!LiveStickerResManager.m72347w().m72348A(bLiveStickerMetaDataItem)) {
            c12737d.duringCreated(LiveStickerResManager.m72347w().m72358K(bLiveStickerMetaDataItem)).subscribe(ffw.m121193d(new e30() { // from class: l.w5u
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f184762a.m72325e(bLiveStickerMetaDataItem, (Pair) obj);
                }
            }));
        } else {
            hxs.m133407t("context_livingAct", this.f48699a, Uri.fromFile(new File(LiveStickerResManager.m72347w().m72365v(bLiveStickerMetaDataItem.url))).toString(), t100.f167244S);
        }
    }

    public BLiveStickerMetaDataItem getBindingItem() {
        return this.f48700b;
    }

    public BLiveStickerMetaDataItem getItem() {
        return this.f48700b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72323c(this);
    }

    public LiveStickerMenuItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveStickerMenuItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
