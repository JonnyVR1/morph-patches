package com.p000p1.mobile.putong.core.p002ui.intloperation.interesting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.p1.mobile.putong.core.data.SimilarInterestsItemStatusData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.qib0;
import l.sff0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$¨\u0006*"}, d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/interesting/SimilarInterestsItemView;", "Lcom/google/android/material/card/MaterialCardView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/SimilarInterestsItemStatusData;", "similarInterestsItemStatusData", "e", "(Lcom/p1/mobile/putong/core/data/SimilarInterestsItemStatusData;)V", "Landroid/view/View;", "view", "b", "(Landroid/view/View;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_setting_img", "()Lv/VDraweeView;", "set_setting_img", "(Lv/VDraweeView;)V", "_setting_img", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_setting_content_title", "()Landroid/widget/TextView;", "set_setting_content_title", "(Landroid/widget/TextView;)V", "_setting_content_title", "c", "get_setting_content_desc", "set_setting_content_desc", "_setting_content_desc", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimilarInterestsItemView extends MaterialCardView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _setting_img;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _setting_content_title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _setting_content_desc;

    public SimilarInterestsItemView(@Nullable Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m8402b(View view) {
        sff0.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m8403e(@NotNull SimilarInterestsItemStatusData similarInterestsItemStatusData) {
        similarInterestsItemStatusData.getClass();
        qib0.G.L0(get_setting_img(), similarInterestsItemStatusData.icon);
        get_setting_content_title().setText(similarInterestsItemStatusData.title);
        get_setting_content_desc().setText(similarInterestsItemStatusData.subTitle);
    }

    @NotNull
    public final TextView get_setting_content_desc() {
        TextView textView = this._setting_content_desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_setting_content_desc");
        return null;
    }

    @NotNull
    public final TextView get_setting_content_title() {
        TextView textView = this._setting_content_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_setting_content_title");
        return null;
    }

    @NotNull
    public final VDraweeView get_setting_img() {
        VDraweeView vDraweeView = this._setting_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_setting_img");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8402b(this);
    }

    public final void set_setting_content_desc(@NotNull TextView textView) {
        textView.getClass();
        this._setting_content_desc = textView;
    }

    public final void set_setting_content_title(@NotNull TextView textView) {
        textView.getClass();
        this._setting_content_title = textView;
    }

    public final void set_setting_img(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._setting_img = vDraweeView;
    }

    public SimilarInterestsItemView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimilarInterestsItemView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
