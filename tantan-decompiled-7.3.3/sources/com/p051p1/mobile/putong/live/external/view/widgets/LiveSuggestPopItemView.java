package com.p051p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveSuggestPopItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.izs;
import p153l.lcu;
import p153l.nbc0;
import p153l.tbs;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R*\u0010?\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/view/widgets/LiveSuggestPopItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSet", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "data", "", "isCheck", "k0", "(Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;Z)V", "j0", "(Z)V", "Landroid/view/View;", OMSTemplateModeType.view, "i0", "(Landroid/view/View;)V", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Lv/VImage;", "e", "Lv/VImage;", "get_check", "()Lv/VImage;", "set_check", "(Lv/VImage;)V", "_check", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "get_name", "()Landroid/widget/TextView;", "set_name", "(Landroid/widget/TextView;)V", "_name", "g", "get_number", "set_number", "_number", "Lkotlin/Function0;", "h", "Lkotlin/jvm/functions/Function0;", "getFollowClickAction", "()Lkotlin/jvm/functions/Function0;", "setFollowClickAction", "(Lkotlin/jvm/functions/Function0;)V", "followClickAction", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveSuggestPopItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _check;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _name;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _number;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> followClickAction;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveSuggestPopItemView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m72100h0(LiveSuggestPopItemView liveSuggestPopItemView, View view) {
        Function0<Unit> function0 = liveSuggestPopItemView.followClickAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Nullable
    public final Function0<Unit> getFollowClickAction() {
        return this.followClickAction;
    }

    @NotNull
    public final VImage get_check() {
        VImage vImage = this._check;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_check");
        return null;
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_image");
        return null;
    }

    @NotNull
    public final TextView get_name() {
        TextView textView = this._name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_name");
        return null;
    }

    @NotNull
    public final TextView get_number() {
        TextView textView = this._number;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_number");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m72101i0(View view) {
        lcu.m153692a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m72102j0(boolean isCheck) {
        get_check().setImageResource(isCheck ? nbc0.f141151d : nbc0.f141148c);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m72103k0(@NotNull BLiveAnchors data, boolean isCheck) {
        data.getClass();
        izs.m142868s("context_square", get_image(), data.avatar.url);
        get_name().setText(data.userName);
        get_number().setText(data.followerCount + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((Object) tbs.f172988a.getText(R$string.f45779v)));
        get_check().setImageResource(isCheck ? nbc0.f141151d : nbc0.f141148c);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.kcu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveSuggestPopItemView.m72100h0(this.f125099a, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72101i0(this);
    }

    public final void setFollowClickAction(@Nullable Function0<Unit> function0) {
        this.followClickAction = function0;
    }

    public final void set_check(@NotNull VImage vImage) {
        vImage.getClass();
        this._check = vImage;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_name(@NotNull TextView textView) {
        textView.getClass();
        this._name = textView;
    }

    public final void set_number(@NotNull TextView textView) {
        textView.getClass();
        this._number = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveSuggestPopItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSuggestPopItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
