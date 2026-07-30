package com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.hvc0;
import p149l.mqi0;
import p149l.v9w;
import p149l.xdl0;
import p149l.y2c0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ9\u0010\u0018\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u000fJ\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0013H\u0003¢\u0006\u0004\b$\u0010%R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010/\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\"\u00102\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010'\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R\u0014\u00104\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00103¨\u00065"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzWarnView;", "Landroid/widget/LinearLayout;", "Lcom/p1/mobile/putong/core/api/c0$c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "c", "()V", "onFinishInflate", "", Constants.KEY_KEY, "", "currentTime", "beginTime", "endTime", "registerTime", "u", "(Ljava/lang/String;JJJJ)V", "b", "Landroid/view/View$OnClickListener;", "onClickListener", "setClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "lastTime", Constants.INAPP_DATA_TAG, "(J)V", "Lv/VText;", "Lv/VText;", "get_pop_title", "()Lv/VText;", "set_pop_title", "(Lv/VText;)V", "_pop_title", "get_pop_content", "set_pop_content", "_pop_content", "get_pop_confirm", "set_pop_confirm", "_pop_confirm", "Ljava/lang/String;", "MEDIA_BUZZ_WARN_KEY", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LoveBuzzWarnView extends LinearLayout implements RunnableC4733c0.c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _pop_title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _pop_content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _pop_confirm;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String MEDIA_BUZZ_WARN_KEY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoveBuzzWarnView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.MEDIA_BUZZ_WARN_KEY = "media_buzz_warn_key" + mqi0.m155944o();
    }

    /* JADX INFO: renamed from: c */
    private final void m47216c() {
        m47219d(3999L);
        CoreModule.f17545c.f19685t1.m31516u(this.MEDIA_BUZZ_WARN_KEY);
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        aVar.m31523g(this.MEDIA_BUZZ_WARN_KEY).m31517a(true).m31522f(mqi0.m155944o() + 3999).m31520d(this);
        CoreModule.f17545c.f19685t1.m31513r(aVar);
        get_pop_confirm().setEnabled(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m47217a(View view) {
        v9w.m197606a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m47218b() {
        CoreModule.f17545c.f19685t1.m31516u(this.MEDIA_BUZZ_WARN_KEY);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: d */
    public final void m47219d(long lastTime) {
        get_pop_confirm().setText(hvc0.m133156c(R$string.f20203Z0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + (lastTime / 1000) + BLiveStormDanmakuGiftResourceType.f44446s);
    }

    @NotNull
    public final VText get_pop_confirm() {
        VText vText = this._pop_confirm;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_pop_confirm");
        return null;
    }

    @NotNull
    public final VText get_pop_content() {
        VText vText = this._pop_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_pop_content");
        return null;
    }

    @NotNull
    public final VText get_pop_title() {
        VText vText = this._pop_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_pop_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47217a(this);
        m47216c();
    }

    public final void setClickListener(@NotNull View.OnClickListener onClickListener) {
        onClickListener.getClass();
        xdl0.m208329E0(get_pop_confirm(), onClickListener);
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

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(@Nullable String key, long currentTime, long beginTime, long endTime, long registerTime) {
        long j = endTime - currentTime;
        if (TextUtils.equals(key, this.MEDIA_BUZZ_WARN_KEY)) {
            m47219d(j);
        }
        if (j <= 0) {
            CoreModule.f17545c.f19685t1.m31516u(this.MEDIA_BUZZ_WARN_KEY);
            get_pop_confirm().setBackgroundResource(y2c0.f195572n);
            get_pop_confirm().setText(hvc0.m133156c(R$string.f20203Z0));
            get_pop_confirm().setEnabled(true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoveBuzzWarnView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoveBuzzWarnView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
