package com.p051p1.mobile.putong.live.livingroom.common.chat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.badge.BadgeDrawable;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.a5s;
import p153l.arl;
import p153l.bnl0;
import p153l.dy4;
import p153l.ft5;
import p153l.gt4;
import p153l.irn;
import p153l.izs;
import p153l.jyb;
import p153l.kcg0;
import p153l.l35;
import p153l.qa00;
import p153l.v9n0;
import p153l.wft;
import p153l.y20;
import p153l.y6s;
import p153l.yql;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceChatItem extends FrameLayout implements arl, IChatItemLongClickArea {

    /* JADX INFO: renamed from: l */
    public static final int f49603l = Color.parseColor("#33000000");

    /* JADX INFO: renamed from: m */
    public static final int f49604m = Color.parseColor("#4D000000");

    /* JADX INFO: renamed from: n */
    public static final int f49605n = qa00.m175859d(1.5f);

    /* JADX INFO: renamed from: o */
    public static final int f49606o = qa00.m175859d(12.0f);

    /* JADX INFO: renamed from: a */
    public VoiceChatItem f49607a;

    /* JADX INFO: renamed from: b */
    public VLinear f49608b;

    /* JADX INFO: renamed from: c */
    public VText f49609c;

    /* JADX INFO: renamed from: d */
    public View f49610d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49611e;

    /* JADX INFO: renamed from: f */
    public IChatItemLongClickArea.LongClickArea f49612f;

    /* JADX INFO: renamed from: g */
    public List<kcg0> f49613g;

    /* JADX INFO: renamed from: h */
    public SpannableStringBuilder f49614h;

    /* JADX INFO: renamed from: i */
    public LiveMessage f49615i;

    /* JADX INFO: renamed from: j */
    public int f49616j;

    /* JADX INFO: renamed from: k */
    public ft5 f49617k;

    public VoiceChatItem(Context context) {
        super(context);
        this.f49613g = null;
        this.f49616j = 0;
        this.f49617k = new ft5();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m73690b(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        TextView textView = (TextView) view;
        CharSequence text = textView.getText();
        if (action != 0 || !(text instanceof Spanned)) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        int scrollY = totalPaddingTop + textView.getScrollY();
        ClickableSpan[] clickableSpanArr = new ClickableSpan[0];
        try {
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        if (clickableSpanArr.length == 0) {
            return false;
        }
        clickableSpanArr[0].onClick(textView);
        return true;
    }

    /* JADX INFO: renamed from: f */
    private void m73691f(LiveMessage liveMessage, yql yqlVar) {
        int iM175859d = qa00.m175859d(14.0f);
        int i = this.f49616j;
        if (i == 0) {
            m73695j(liveMessage, iM175859d, yqlVar);
        } else if (i == 1) {
            setVoiceContentConfig(yqlVar);
        } else {
            if (i != 2) {
                return;
            }
            m73700l(yqlVar);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m73692g(SpannableStringBuilder spannableStringBuilder, final yql yqlVar, final LiveMessage liveMessage) {
        a5s[] a5sVarArr = (a5s[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a5s.class);
        if (a5sVarArr.length > 0) {
            m73696k();
            jyb.m147470A(a5sVarArr, new y20() { // from class: l.f9n0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((a5s) obj).mo96246d(yqlVar, liveMessage);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    private void m73693h(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig) {
        LongLinkChatMessage.LiveCornerConfig cornerConfig = liveChatShadingConfig.getCornerConfig();
        if (cornerConfig == null) {
            bnl0.m105539W(this.f49609c, 0);
            return;
        }
        if (TextUtils.isEmpty(cornerConfig.getPictureUrl())) {
            bnl0.m105539W(this.f49609c, 0);
            return;
        }
        m73698d(true);
        bnl0.m105524M(this.f49611e, true);
        izs.m142871v("context_livingAct", this.f49611e, liveChatShadingConfig.getCornerConfig().getPictureUrl(), bnl0.m105587w(30.0f), bnl0.m105587w(30.0f), false, false, irn.m141839a(), null);
        long position = cornerConfig.getPosition();
        ViewGroup.LayoutParams layoutParams = this.f49611e.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (position == 1) {
                layoutParams2.gravity = BadgeDrawable.TOP_END;
            } else if (position == 2) {
                layoutParams2.gravity = 8388629;
            } else if (position == 3) {
                layoutParams2.gravity = BadgeDrawable.BOTTOM_END;
            }
            layoutParams.width = qa00.m175859d(30.0f);
            layoutParams.height = qa00.m175859d(30.0f);
            this.f49611e.setLayoutParams(layoutParams2);
            bnl0.m105539W(this.f49609c, qa00.m175859d(15.0f));
        }
    }

    /* JADX INFO: renamed from: i */
    private void m73694i(LiveMessage liveMessage, int i) {
        if (liveMessage.hasChatShadeConfig()) {
            setVipBackgroundWithCorner(liveMessage.chatShadeConfig);
        } else {
            setCommonBackgroundWithCorner(qa00.m175859d(10.0f));
        }
    }

    /* JADX INFO: renamed from: j */
    private void m73695j(LiveMessage liveMessage, int i, yql yqlVar) {
        this.f49609c.setMinHeight(qa00.m175859d(38.0f));
        m73694i(liveMessage, i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: k */
    private void m73696k() {
        this.f49609c.setOnTouchListener(new View.OnTouchListener() { // from class: l.g9n0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return VoiceChatItem.m73690b(view, motionEvent);
            }
        });
    }

    private void setCommonBackgroundWithCorner(int i) {
        float f = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(!wft.m206159b(3) ? f49604m : f49603l);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        this.f49609c.setBackground(shapeDrawable);
        bnl0.m105539W(this.f49609c, 0);
    }

    private void setVipBackgroundWithCorner(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig) {
        this.f49609c.setBackground(l35.m152676h(liveChatShadingConfig, this, qa00.f156322i));
        m73693h(liveChatShadingConfig);
    }

    private void setVoiceContentConfig(yql yqlVar) {
        m73700l(yqlVar);
        m73694i(this.f49615i, qa00.m175859d(10.0f));
    }

    @Override // p153l.arl
    /* JADX INFO: renamed from: M */
    public void mo73677M() {
        if (this.f49614h == null) {
            return;
        }
        this.f49617k.m127299c();
        this.f49609c.setBackground(null);
        this.f49609c.setText("");
        dy4.m118610t(this.f49614h, this.f49609c);
    }

    /* JADX INFO: renamed from: c */
    public final void m73697c(View view) {
        v9n0.m200450a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m73698d(boolean z) {
        if (this.f49616j == 0) {
            this.f49609c.setMinHeight(qa00.m175859d(this.f49615i.hasChatShadeConfig() ? 22.0f : 24.0f));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m73699e(yql yqlVar, LiveMessage liveMessage, SpannableStringBuilder spannableStringBuilder, int i) {
        if (liveMessage == null) {
            return;
        }
        this.f49614h = spannableStringBuilder;
        this.f49615i = liveMessage;
        this.f49616j = i;
        bnl0.m105524M(this.f49611e, false);
        m73698d(false);
        VText vText = this.f49609c;
        int i2 = qa00.f156292E;
        dy4.m118615y(spannableStringBuilder, vText, yqlVar, i2);
        gt4 adapter = yqlVar.getAdapter();
        List<kcg0> listM118586A = dy4.m118586A(spannableStringBuilder, adapter, this.f49609c, adapter.act(), i2);
        this.f49613g = listM118586A;
        if (!jyb.m147479J(listM118586A)) {
            Iterator<kcg0> it = this.f49613g.iterator();
            while (it.hasNext()) {
                this.f49617k.m127297a(it.next());
            }
        }
        m73692g(spannableStringBuilder, yqlVar, liveMessage);
        this.f49609c.setText(spannableStringBuilder);
        dy4.m118612v(yqlVar, liveMessage, this);
        m73691f(liveMessage, yqlVar);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea
    @NonNull
    public View getClickTarget() {
        return this;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea
    @Nullable
    public IChatItemLongClickArea.LongClickArea getLongClickArea() {
        return this.f49612f;
    }

    /* JADX INFO: renamed from: l */
    public final void m73700l(yql yqlVar) {
        if (this.f49616j == 1) {
            this.f49609c.setMinWidth(qa00.m175859d(32.0f));
            boolean zM214494b = y6s.m214494b(yqlVar.getLiveMode());
            VText vText = this.f49609c;
            if (zM214494b) {
                vText.setTextColor(Color.parseColor("#ccffffff"));
            } else {
                vText.setTextColor(-1);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73697c(this);
    }

    public void setLongClickArea(@Nullable IChatItemLongClickArea.LongClickArea longClickArea) {
        this.f49612f = longClickArea;
    }

    public VoiceChatItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49613g = null;
        this.f49616j = 0;
        this.f49617k = new ft5();
    }

    public VoiceChatItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49613g = null;
        this.f49616j = 0;
        this.f49617k = new ft5();
    }
}
