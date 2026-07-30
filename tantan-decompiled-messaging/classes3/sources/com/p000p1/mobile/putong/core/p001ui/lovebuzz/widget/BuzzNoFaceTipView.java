package com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.mqi0;
import l.o7r;
import l.t100;
import l.to3;
import l.xdl0;
import l.y2c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001e\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\r¢\u0006\u0004\b \u0010\u000fJ\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\u000fJ\u000f\u0010\"\u001a\u00020\rH\u0014¢\u0006\u0004\b\"\u0010\u000fR\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010,\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u0014\u0010.\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-¨\u0006/"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "Landroid/widget/LinearLayout;", "Lcom/p1/mobile/putong/core/api/c0$c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "c", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "key", "", "currentTime", "beginTime", "endTime", "registerTime", "u", "(Ljava/lang/String;JJJJ)V", "d", "b", "onDetachedFromWindow", "Lv/VText;", "Lv/VText;", "get_no_face_title", "()Lv/VText;", "set_no_face_title", "(Lv/VText;)V", "_no_face_title", "get_no_face_content", "set_no_face_content", "_no_face_content", "Ljava/lang/String;", "MEDIA_BUZZ_NO_FACE_LINT_KEY", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BuzzNoFaceTipView extends LinearLayout implements c0.c {

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
        this.MEDIA_BUZZ_NO_FACE_LINT_KEY = "media_buzz_no_face_lint_key" + mqi0.o();
        LayoutInflater layoutInflaterA = o7r.a(getContext());
        layoutInflaterA.getClass();
        m167a(layoutInflaterA, this);
        m166c();
    }

    /* JADX INFO: renamed from: c */
    private final void m166c() {
        setOrientation(1);
        setBackgroundResource(y2c0.f0);
        int i = t100.v;
        setPadding(i, i, i, i);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m167a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = to3.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: b */
    public final void m168b() {
        if (xdl0.O0(this) && !CoreModule.c.t1.p(this.MEDIA_BUZZ_NO_FACE_LINT_KEY)) {
            xdl0.M(this, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m169d() {
        xdl0.M(this, true);
        CoreModule.c.t1.u(this.MEDIA_BUZZ_NO_FACE_LINT_KEY);
        c0.a aVar = new c0.a();
        aVar.g(this.MEDIA_BUZZ_NO_FACE_LINT_KEY).a(true).f(mqi0.o() + 3000).d(this);
        CoreModule.c.t1.r(aVar);
    }

    @NotNull
    public final VText get_no_face_content() {
        VText vText = this._no_face_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_no_face_content");
        return null;
    }

    @NotNull
    public final VText get_no_face_title() {
        VText vText = this._no_face_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_no_face_title");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.c.t1.u(this.MEDIA_BUZZ_NO_FACE_LINT_KEY);
    }

    public final void set_no_face_content(@NotNull VText vText) {
        vText.getClass();
        this._no_face_content = vText;
    }

    public final void set_no_face_title(@NotNull VText vText) {
        vText.getClass();
        this._no_face_title = vText;
    }

    /* JADX INFO: renamed from: u */
    public void m170u(@Nullable String key, long currentTime, long beginTime, long endTime, long registerTime) {
        if (endTime - currentTime > 0 || !BuzzMediaCallManager.INSTANCE.T()) {
            return;
        }
        CoreModule.c.t1.u(this.MEDIA_BUZZ_NO_FACE_LINT_KEY);
        m168b();
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
