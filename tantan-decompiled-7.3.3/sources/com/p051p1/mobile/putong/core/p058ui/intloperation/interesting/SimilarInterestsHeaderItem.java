package com.p051p1.mobile.putong.core.p058ui.intloperation.interesting;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.SimilarInterestsItemLanguagesData;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.tnf0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102¨\u00068"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/interesting/SimilarInterestsHeaderItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/SimilarInterestsItemLanguagesData;", "baseData", "", "descColor", "i0", "(Lcom/p1/mobile/putong/core/data/SimilarInterestsItemLanguagesData;Ljava/lang/String;)V", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/intloperation/interesting/SimilarInterestsHeaderItem;", "get_root_layout", "()Lcom/p1/mobile/putong/core/ui/intloperation/interesting/SimilarInterestsHeaderItem;", "set_root_layout", "(Lcom/p1/mobile/putong/core/ui/intloperation/interesting/SimilarInterestsHeaderItem;)V", "_root_layout", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "get_title_img", "()Lv/VDraweeView;", "set_title_img", "(Lv/VDraweeView;)V", "_title_img", "f", "get_avatar", "set_avatar", "_avatar", "Lv/VText;", "g", "Lv/VText;", "get_avatar_desc", "()Lv/VText;", "set_avatar_desc", "(Lv/VText;)V", "_avatar_desc", "h", "get_desc", "set_desc", "_desc", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class SimilarInterestsHeaderItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public SimilarInterestsHeaderItem _root_layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _title_img;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _avatar;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _avatar_desc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _desc;

    public SimilarInterestsHeaderItem(@Nullable Context context) {
        super(context);
    }

    @NotNull
    public final VDraweeView get_avatar() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_avatar");
        return null;
    }

    @NotNull
    public final VText get_avatar_desc() {
        VText vText = this._avatar_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_avatar_desc");
        return null;
    }

    @NotNull
    public final VText get_desc() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    public final SimilarInterestsHeaderItem get_root_layout() {
        SimilarInterestsHeaderItem similarInterestsHeaderItem = this._root_layout;
        if (similarInterestsHeaderItem != null) {
            return similarInterestsHeaderItem;
        }
        Intrinsics.m88391r("_root_layout");
        return null;
    }

    @NotNull
    public final VDraweeView get_title_img() {
        VDraweeView vDraweeView = this._title_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_title_img");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m47495h0(View view) {
        tnf0.m191884a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m47496i0(@NotNull SimilarInterestsItemLanguagesData baseData, @NotNull String descColor) {
        baseData.getClass();
        descColor.getClass();
        if (!TextUtils.isEmpty(baseData.avatar)) {
            bnl0.m105524M(get_avatar(), true);
            uqb0.f180374G.m127115L0(get_avatar(), baseData.avatar);
            if (!TextUtils.isEmpty(baseData.avatarTitle)) {
                bnl0.m105524M(get_avatar_desc(), true);
                get_avatar_desc().setText(baseData.avatarTitle);
                get_avatar_desc().setTextColor(Color.parseColor(descColor));
            }
        }
        uqb0.f180374G.m127115L0(get_title_img(), baseData.titleIcon);
        try {
            get_desc().setTextColor(Color.parseColor(descColor));
            get_desc().setText(baseData.desc);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47495h0(this);
    }

    public final void set_avatar(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._avatar = vDraweeView;
    }

    public final void set_avatar_desc(@NotNull VText vText) {
        vText.getClass();
        this._avatar_desc = vText;
    }

    public final void set_desc(@NotNull VText vText) {
        vText.getClass();
        this._desc = vText;
    }

    public final void set_root_layout(@NotNull SimilarInterestsHeaderItem similarInterestsHeaderItem) {
        similarInterestsHeaderItem.getClass();
        this._root_layout = similarInterestsHeaderItem;
    }

    public final void set_title_img(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._title_img = vDraweeView;
    }

    public SimilarInterestsHeaderItem(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimilarInterestsHeaderItem(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
