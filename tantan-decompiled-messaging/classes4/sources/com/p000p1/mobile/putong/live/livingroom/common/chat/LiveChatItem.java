package com.p000p1.mobile.putong.live.livingroom.common.chat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.putong.live.livingroom.view.AutoRefreshTextView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.List;
import l.bs5;
import l.c4g0;
import l.e30;
import l.hxs;
import l.t100;
import l.uep0;
import l.vdt;
import l.vwb;
import l.xdl0;
import p002l.ex4;
import p002l.k25;
import p002l.k2s;
import p002l.m25;
import p002l.nol;
import p002l.pol;
import p002l.wrj;
import p002l.z2s;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveChatItem extends FrameLayout implements pol {

    /* JADX INFO: renamed from: i */
    public static final int f4787i = Color.parseColor("#34000000");

    /* JADX INFO: renamed from: j */
    public static final int f4788j = Color.parseColor("#4D000000");

    /* JADX INFO: renamed from: a */
    public LiveChatItem f4789a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f4790b;

    /* JADX INFO: renamed from: c */
    public AutoRefreshTextView f4791c;

    /* JADX INFO: renamed from: d */
    public View f4792d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4793e;

    /* JADX INFO: renamed from: f */
    public SpannableStringBuilder f4794f;

    /* JADX INFO: renamed from: g */
    public int f4795g;

    /* JADX INFO: renamed from: h */
    public bs5 f4796h;

    public LiveChatItem(Context context) {
        super(context);
        this.f4795g = 0;
        this.f4796h = new bs5();
    }

    /* JADX INFO: renamed from: d */
    private Act m5985d() {
        return xdl0.E(this);
    }

    private void setCommonBackgroundWithCorner(int i) {
        float f = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(!vdt.b(2) ? f4788j : f4787i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        this.f4791c.setBackground(shapeDrawable);
    }

    private void setVipBackgroundWithCorner(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig) {
        this.f4791c.setBackground(m25.m17669a(liveChatShadingConfig, this, t100.i));
        m5993j(liveChatShadingConfig);
    }

    @Override // p002l.pol
    /* JADX INFO: renamed from: M */
    public void mo5986M() {
        if (this.f4794f == null) {
            return;
        }
        this.f4796h.c();
        this.f4791c.setBackground(null);
        this.f4791c.setText("");
        ex4.m12826t(this.f4794f, this.f4791c);
    }

    /* JADX INFO: renamed from: c */
    public final void m5987c(View view) {
        k2s.m16478a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m5988e(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        TextView textView = (TextView) view;
        CharSequence text = textView.getText();
        if (action == 1) {
            if (text instanceof Spanned) {
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
                    CrashHelper.c(e);
                }
                if (clickableSpanArr.length != 0) {
                    clickableSpanArr[0].onClick(textView);
                } else if (hasOnClickListeners()) {
                    performClick();
                }
            } else if (hasOnClickListeners()) {
                performClick();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m5989f(nol nolVar, LiveMessage liveMessage, SpannableStringBuilder spannableStringBuilder, int i) {
        if (liveMessage == null) {
            return;
        }
        this.f4794f = spannableStringBuilder;
        this.f4795g = i;
        xdl0.M(this.f4793e, false);
        xdl0.M(this.f4792d, false);
        m5992i(nolVar, liveMessage.isOpenGradientFlow());
        m5991h(spannableStringBuilder, nolVar, liveMessage);
        ex4.m12828v(nolVar, liveMessage, this);
        m5990g(liveMessage, nolVar);
        if (liveMessage.isGiftMessage()) {
            wrj.m25426t(liveMessage);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5990g(LiveMessage liveMessage, nol nolVar) {
        int i = t100.i;
        int i2 = this.f4795g;
        if (i2 == 0) {
            m5995l(liveMessage, i, nolVar);
        } else if (i2 == 1 || i2 == 2) {
            m5997n();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5991h(SpannableStringBuilder spannableStringBuilder, final nol nolVar, final LiveMessage liveMessage) {
        z2s[] z2sVarArr = (z2s[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z2s.class);
        if (z2sVarArr.length <= 0) {
            setPadding(getPaddingLeft(), getPaddingTop(), t100.d(8.0f), getPaddingBottom());
            return;
        }
        m5996m();
        vwb.A(z2sVarArr, new e30() { // from class: l.i2s
            public final void call(Object obj) {
                ((z2s) obj).mo25699d(nolVar, liveMessage);
            }
        });
        setPadding(getPaddingLeft(), getPaddingTop(), t100.d(4.0f), getPaddingBottom());
    }

    /* JADX INFO: renamed from: i */
    public final void m5992i(nol nolVar, boolean z) {
        this.f4791c.setRefresh(z);
        SpannableStringBuilder spannableStringBuilder = this.f4794f;
        AutoRefreshTextView autoRefreshTextView = this.f4791c;
        int i = t100.E;
        ex4.m12831y(spannableStringBuilder, autoRefreshTextView, nolVar, i);
        ex4.m12830x(this.f4794f, this.f4791c, nolVar, m5985d());
        List<c4g0> listM12802A = ex4.m12802A(this.f4794f, nolVar.getAdapter(), this.f4791c, nolVar.getAdapter().act(), i);
        if (!vwb.J(listM12802A)) {
            Iterator<c4g0> it = listM12802A.iterator();
            while (it.hasNext()) {
                this.f4796h.a(it.next());
            }
        }
        this.f4791c.setText(this.f4794f);
    }

    /* JADX INFO: renamed from: j */
    public final void m5993j(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig) {
        LongLinkChatMessage.LiveCornerConfig cornerConfig = liveChatShadingConfig.getCornerConfig();
        if (cornerConfig == null || TextUtils.isEmpty(cornerConfig.getPictureUrl())) {
            return;
        }
        xdl0.M(this.f4792d, true);
        xdl0.M(this.f4793e, true);
        hxs.s("context_livingAct", this.f4793e, liveChatShadingConfig.getCornerConfig().getPictureUrl());
        long position = cornerConfig.getPosition();
        ViewGroup.LayoutParams layoutParams = this.f4793e.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (position == 1) {
                layoutParams2.gravity = 8388661;
            } else if (position == 2) {
                layoutParams2.gravity = 8388629;
            } else if (position == 3) {
                layoutParams2.gravity = 8388693;
            }
            this.f4793e.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5994k(LiveMessage liveMessage, int i) {
        if (liveMessage.hasChatShadeConfig()) {
            setVipBackgroundWithCorner(liveMessage.chatShadeConfig);
        } else {
            setCommonBackgroundWithCorner(i);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5995l(LiveMessage liveMessage, int i, nol nolVar) {
        m5994k(liveMessage, i);
        if (k25.m16473i(nolVar.getChatScene())) {
            uep0.C(this.f4790b, new Rect(0, t100.d(4.0f), 0, t100.d(4.0f)));
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: m */
    public final void m5996m() {
        this.f4791c.setOnTouchListener(new View.OnTouchListener() { // from class: l.j2s
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f13539a.m5988e(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m5997n() {
        this.f4791c.setPadding(0, 0, 0, 0);
        xdl0.M(this.f4792d, false);
        if ((this.f4791c.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && this.f4795g == 1) {
            this.f4791c.setMinWidth(t100.d(32.0f));
            this.f4791c.setTextColor(-1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5987c(this);
    }

    public LiveChatItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4795g = 0;
        this.f4796h = new bs5();
    }

    public LiveChatItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4795g = 0;
        this.f4796h = new bs5();
    }
}
