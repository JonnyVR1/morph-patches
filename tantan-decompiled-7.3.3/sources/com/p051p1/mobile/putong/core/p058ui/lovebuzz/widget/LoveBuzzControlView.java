package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VText;
import p153l.d6w;
import p153l.lhc0;
import p153l.p9r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "id", "", Constants.INAPP_DATA_TAG, "(I)V", "c", "b", "(Landroid/util/AttributeSet;)V", "Lv/VImage;", "Lv/VImage;", "get_control_icon", "()Lv/VImage;", "set_control_icon", "(Lv/VImage;)V", "_control_icon", "Lv/VText;", "Lv/VText;", "get_control_desc", "()Lv/VText;", "set_control_desc", "(Lv/VText;)V", "_control_desc", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LoveBuzzControlView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VImage _control_icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _control_desc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoveBuzzControlView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m48371a(layoutInflaterM171370a, this);
        m48372b(attributeSet);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m48371a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM114548b = d6w.m114548b(this, inflater, parent);
        viewM114548b.getClass();
        return viewM114548b;
    }

    /* JADX INFO: renamed from: b */
    public final void m48372b(AttributeSet attrs) {
        setOrientation(1);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, lhc0.f132082a);
            typedArrayObtainStyledAttributes.getClass();
            float dimension = typedArrayObtainStyledAttributes.getDimension(lhc0.f132086e, 0.0f);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(lhc0.f132085d, 0.0f);
            ViewGroup.LayoutParams layoutParams = get_control_icon().getLayoutParams();
            if (dimension > 0.0f) {
                layoutParams.width = (int) dimension;
            }
            if (dimension2 > 0.0f) {
                layoutParams.height = (int) dimension2;
            }
            if (dimension > 0.0f || dimension2 > 0.0f) {
                get_control_icon().setLayoutParams(layoutParams);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(lhc0.f132083b, -1);
            if (resourceId > 0) {
                get_control_icon().setBackgroundResource(resourceId);
            }
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(lhc0.f132084c, -1);
            if (resourceId2 > 0) {
                get_control_desc().setText(getContext().getString(resourceId2));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m48373c(@StringRes int id) {
        get_control_desc().setText(id);
    }

    /* JADX INFO: renamed from: d */
    public final void m48374d(@DrawableRes int id) {
        get_control_icon().setBackgroundResource(id);
    }

    @NotNull
    public final VText get_control_desc() {
        VText vText = this._control_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_control_desc");
        return null;
    }

    @NotNull
    public final VImage get_control_icon() {
        VImage vImage = this._control_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_control_icon");
        return null;
    }

    public final void set_control_desc(@NotNull VText vText) {
        vText.getClass();
        this._control_desc = vText;
    }

    public final void set_control_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._control_icon = vImage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoveBuzzControlView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
        m48372b(attributeSet);
    }
}
