package com.p051p1.mobile.putong.core.p058ui.nightclub.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.AutoVDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.lr40;
import p153l.qa00;
import p153l.qnp0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000eR\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u0010-\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\"\u00101\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$¨\u00062"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/nightclub/view/NightClubDlgView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "b", "Lv/AutoVDraweeView;", "Lv/AutoVDraweeView;", "get_background", "()Lv/AutoVDraweeView;", "set_background", "(Lv/AutoVDraweeView;)V", "_background", "get_match_image", "set_match_image", "_match_image", "Lv/VText;", "c", "Lv/VText;", "get_pop_title", "()Lv/VText;", "set_pop_title", "(Lv/VText;)V", "_pop_title", Constants.INAPP_DATA_TAG, "get_pop_content", "set_pop_content", "_pop_content", "e", "get_pop_confirm", "set_pop_confirm", "_pop_confirm", "f", "get_pop_cancel", "set_pop_cancel", "_pop_cancel", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class NightClubDlgView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public AutoVDraweeView _background;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public AutoVDraweeView _match_image;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _pop_title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _pop_content;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _pop_confirm;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _pop_cancel;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NightClubDlgView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m51297a(View view) {
        lr40.m155578a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m51298b() {
        bnl0.m105507D0(bnl0.m105592y0() - qa00.f156294G, this);
        qnp0.m177261d1(this, qa00.f156328o);
        get_match_image().m224133x("https://auto.tancdn.com/v1/images/eyJpZCI6IlJHNEtJQ1VVUERWTUc0SFI1RTVVN0JZSkZLVzNHRzE0IiwidyI6NzYxLCJoIjo1NjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjg5MzEyOTM4NjgyMjkwOTc5fQ.png", 1);
        get_background().setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6Ijc0V1JPNkpHN1IzRU9ZWUFLT0JPUFRVWjdRSVE0VzE0IiwidyI6OTMzLCJoIjoxMTY3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzAxNTQ3Njc1MjE5Nzc2NzQ0NX0.png");
    }

    @NotNull
    public final AutoVDraweeView get_background() {
        AutoVDraweeView autoVDraweeView = this._background;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.m88391r("_background");
        return null;
    }

    @NotNull
    public final AutoVDraweeView get_match_image() {
        AutoVDraweeView autoVDraweeView = this._match_image;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.m88391r("_match_image");
        return null;
    }

    @NotNull
    public final VText get_pop_cancel() {
        VText vText = this._pop_cancel;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pop_cancel");
        return null;
    }

    @NotNull
    public final VText get_pop_confirm() {
        VText vText = this._pop_confirm;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pop_confirm");
        return null;
    }

    @NotNull
    public final VText get_pop_content() {
        VText vText = this._pop_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pop_content");
        return null;
    }

    @NotNull
    public final VText get_pop_title() {
        VText vText = this._pop_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pop_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51297a(this);
        m51298b();
    }

    public final void set_background(@NotNull AutoVDraweeView autoVDraweeView) {
        autoVDraweeView.getClass();
        this._background = autoVDraweeView;
    }

    public final void set_match_image(@NotNull AutoVDraweeView autoVDraweeView) {
        autoVDraweeView.getClass();
        this._match_image = autoVDraweeView;
    }

    public final void set_pop_cancel(@NotNull VText vText) {
        vText.getClass();
        this._pop_cancel = vText;
    }

    public final void set_pop_confirm(@NotNull VText vText) {
        vText.getClass();
        this._pop_confirm = vText;
    }

    public final void set_pop_content(@NotNull VText vText) {
        vText.getClass();
        this._pop_content = vText;
    }

    public final void set_pop_title(@NotNull VText vText) {
        vText.getClass();
        this._pop_title = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NightClubDlgView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NightClubDlgView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
