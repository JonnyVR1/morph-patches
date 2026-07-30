package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.bnl0;
import p153l.ebc0;
import p153l.p9r;
import p153l.pzi0;
import p153l.qa00;
import p153l.tp3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001e\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\r¢\u0006\u0004\b \u0010\u000fJ\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\u000fJ\u000f\u0010\"\u001a\u00020\rH\u0014¢\u0006\u0004\b\"\u0010\u000fR\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010,\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u0014\u0010.\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-¨\u0006/"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "Landroid/widget/LinearLayout;", "Lcom/p1/mobile/putong/core/api/c0$c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "c", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", Constants.KEY_KEY, "", "currentTime", "beginTime", "endTime", "registerTime", "u", "(Ljava/lang/String;JJJJ)V", Constants.INAPP_DATA_TAG, "b", "onDetachedFromWindow", "Lv/VText;", "Lv/VText;", "get_no_face_title", "()Lv/VText;", "set_no_face_title", "(Lv/VText;)V", "_no_face_title", "get_no_face_content", "set_no_face_content", "_no_face_content", "Ljava/lang/String;", "MEDIA_BUZZ_NO_FACE_LINT_KEY", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class BuzzNoFaceTipView extends LinearLayout implements RunnableC4884c0.c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _no_face_title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _no_face_content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String MEDIA_BUZZ_NO_FACE_LINT_KEY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuzzNoFaceTipView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.MEDIA_BUZZ_NO_FACE_LINT_KEY = "media_buzz_no_face_lint_key" + pzi0.m174454o();
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m48325a(layoutInflaterM171370a, this);
        m48324c();
    }

    /* JADX INFO: renamed from: c */
    private final void m48324c() {
        setOrientation(1);
        setBackgroundResource(ebc0.f92879f0);
        int i = qa00.f156335v;
        setPadding(i, i, i, i);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m48325a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM192117b = tp3.m192117b(this, inflater, parent);
        viewM192117b.getClass();
        return viewM192117b;
    }

    /* JADX INFO: renamed from: b */
    public final void m48326b() {
        if (bnl0.m105529O0(this) && !CoreModule.f18264c.f20427t1.m32514p(this.MEDIA_BUZZ_NO_FACE_LINT_KEY)) {
            bnl0.m105524M(this, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m48327d() {
        bnl0.m105524M(this, true);
        CoreModule.f18264c.f20427t1.m32519u(this.MEDIA_BUZZ_NO_FACE_LINT_KEY);
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        aVar.m32526g(this.MEDIA_BUZZ_NO_FACE_LINT_KEY).m32520a(true).m32525f(pzi0.m174454o() + 3000).m32523d(this);
        CoreModule.f18264c.f20427t1.m32516r(aVar);
    }

    @NotNull
    public final VText get_no_face_content() {
        VText vText = this._no_face_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_no_face_content");
        return null;
    }

    @NotNull
    public final VText get_no_face_title() {
        VText vText = this._no_face_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_no_face_title");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f18264c.f20427t1.m32519u(this.MEDIA_BUZZ_NO_FACE_LINT_KEY);
    }

    public final void set_no_face_content(@NotNull VText vText) {
        vText.getClass();
        this._no_face_content = vText;
    }

    public final void set_no_face_title(@NotNull VText vText) {
        vText.getClass();
        this._no_face_title = vText;
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(@Nullable String key, long currentTime, long beginTime, long endTime, long registerTime) {
        if (endTime - currentTime > 0 || !BuzzMediaCallManager.INSTANCE.m48138T()) {
            return;
        }
        CoreModule.f18264c.f20427t1.m32519u(this.MEDIA_BUZZ_NO_FACE_LINT_KEY);
        m48326b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzNoFaceTipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzNoFaceTipView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
