package com.p051p1.mobile.putong.live.external.view.widgets;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSquareButton;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p051p1.mobile.putong.live.external.view.widgets.VirtualVoiceSquareTopBtnView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.i4g0;
import p153l.izs;
import p153l.jyb;
import p153l.nae0;
import p153l.nbc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\fR\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001d¨\u0006\u001e"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/view/widgets/VirtualVoiceSquareTopBtnView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSquareButton;", "btnConfig", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSquareButton;)V", "", "type", "", "c", "(Ljava/lang/String;)Z", "show", "e", "(Z)V", "b", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "iconView", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "redDotView", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSquareButton;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VirtualVoiceSquareTopBtnView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public VDraweeView iconView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public ImageView redDotView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public BLiveVoiceSquareButton btnConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VirtualVoiceSquareTopBtnView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        VDraweeView vDraweeView = new VDraweeView(context);
        this.iconView = vDraweeView;
        vDraweeView.setLayoutParams(new FrameLayout.LayoutParams(qa00.m175859d(32.0f), qa00.m175859d(32.0f)));
        addView(this.iconView);
        this.redDotView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(8.0f), qa00.m175859d(8.0f));
        layoutParams.gravity = 5;
        layoutParams.topMargin = qa00.m175859d(3.0f);
        layoutParams.rightMargin = qa00.m175859d(3.0f);
        this.redDotView.setImageResource(nbc0.f141200t0);
        this.redDotView.setLayoutParams(layoutParams);
        this.redDotView.setVisibility(8);
        addView(this.redDotView);
    }

    /* JADX INFO: renamed from: a */
    public static void m72114a(VirtualVoiceSquareTopBtnView virtualVoiceSquareTopBtnView, BLiveVoiceSquareButton bLiveVoiceSquareButton, View view) {
        virtualVoiceSquareTopBtnView.m72115b(bLiveVoiceSquareButton);
    }

    /* JADX INFO: renamed from: b */
    public final void m72115b(BLiveVoiceSquareButton btnConfig) {
        i4g0.m138523u("e_audio_top_menu", "p_audio_explore_recommend", jyb.m147494Y("button_type", btnConfig.type));
        if (!TextUtils.isEmpty(btnConfig.schema)) {
            Context context = getContext();
            context.getClass();
            nae0.m162083m((Activity) context, Uri.parse(btnConfig.schema));
        } else {
            String str = btnConfig.type;
            if (str.hashCode() == -906336856 && str.equals(FirebaseAnalytics.Event.SEARCH)) {
                LiveIndependentSettingAct.m71884c2(getContext(), "live_internal_voice_search");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m72116c(@NotNull String type) {
        type.getClass();
        BLiveVoiceSquareButton bLiveVoiceSquareButton = this.btnConfig;
        return TextUtils.equals(type, bLiveVoiceSquareButton != null ? bLiveVoiceSquareButton.type : null);
    }

    /* JADX INFO: renamed from: d */
    public final void m72117d(@NotNull final BLiveVoiceSquareButton btnConfig) {
        btnConfig.getClass();
        this.btnConfig = btnConfig;
        izs.m142868s("context_common", this.iconView, btnConfig.iconUrl);
        m72118e(btnConfig.showRedDot);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.edm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualVoiceSquareTopBtnView.m72114a(this.f93555a, btnConfig, view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m72118e(boolean show) {
        this.redDotView.setVisibility(show ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public VirtualVoiceSquareTopBtnView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ VirtualVoiceSquareTopBtnView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
