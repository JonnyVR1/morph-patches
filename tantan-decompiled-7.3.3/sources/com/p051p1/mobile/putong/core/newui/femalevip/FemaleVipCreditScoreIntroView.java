package com.p051p1.mobile.putong.core.newui.femalevip;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.tei;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001aR\"\u0010*\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\"\u0010.\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\u001a¨\u0006/"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/femalevip/FemaleVipCreditScoreIntroView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "", "title", "content", FirebaseAnalytics.Param.SCORE, "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Lv/VText;", "Lv/VText;", "get_score_title", "()Lv/VText;", "set_score_title", "(Lv/VText;)V", "_score_title", "Lv/VImage;", "Lv/VImage;", "get_score_lock_ic", "()Lv/VImage;", "set_score_lock_ic", "(Lv/VImage;)V", "_score_lock_ic", "c", "get_score_num", "set_score_num", "_score_num", Constants.INAPP_DATA_TAG, "get_title", "set_title", "_title", "e", "get_subtitle", "set_subtitle", "_subtitle", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class FemaleVipCreditScoreIntroView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _score_title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _score_lock_ic;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _score_num;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _subtitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public FemaleVipCreditScoreIntroView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m37452a(View view) {
        tei.m190706a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m37453b(@Nullable String title, @Nullable String content, @Nullable String score) {
        get_score_title().setText("分数");
        if (TextUtils.isEmpty(score)) {
            bnl0.m105525M0(get_score_num(), false);
            bnl0.m105525M0(get_score_lock_ic(), true);
        } else {
            get_score_num().setText(score);
            bnl0.m105525M0(get_score_num(), true);
            bnl0.m105525M0(get_score_lock_ic(), false);
        }
        get_title().setText(title);
        get_subtitle().setText(content);
    }

    @NotNull
    public final VImage get_score_lock_ic() {
        VImage vImage = this._score_lock_ic;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_score_lock_ic");
        return null;
    }

    @NotNull
    public final VText get_score_num() {
        VText vText = this._score_num;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_score_num");
        return null;
    }

    @NotNull
    public final VText get_score_title() {
        VText vText = this._score_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_score_title");
        return null;
    }

    @NotNull
    public final VText get_subtitle() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_subtitle");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37452a(this);
    }

    public final void set_score_lock_ic(@NotNull VImage vImage) {
        vImage.getClass();
        this._score_lock_ic = vImage;
    }

    public final void set_score_num(@NotNull VText vText) {
        vText.getClass();
        this._score_num = vText;
    }

    public final void set_score_title(@NotNull VText vText) {
        vText.getClass();
        this._score_title = vText;
    }

    public final void set_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._subtitle = vText;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FemaleVipCreditScoreIntroView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ FemaleVipCreditScoreIntroView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
