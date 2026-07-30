package com.p046p1.mobile.putong.live.livingroom.common.chat;

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
import com.google.android.material.badge.BadgeDrawable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.view.AutoRefreshTextView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.List;
import p147v.VDraweeView;
import p149l.bs5;
import p149l.c4g0;
import p149l.e30;
import p149l.ex4;
import p149l.hxs;
import p149l.k25;
import p149l.k2s;
import p149l.m25;
import p149l.nol;
import p149l.pol;
import p149l.t100;
import p149l.uep0;
import p149l.vdt;
import p149l.vwb;
import p149l.wrj;
import p149l.xdl0;
import p149l.z2s;

/* JADX INFO: loaded from: classes4.dex */
public class LiveChatItem extends FrameLayout implements pol {

    /* JADX INFO: renamed from: i */
    public static final int f48745i = Color.parseColor("#34000000");

    /* JADX INFO: renamed from: j */
    public static final int f48746j = Color.parseColor("#4D000000");

    /* JADX INFO: renamed from: a */
    public LiveChatItem f48747a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f48748b;

    /* JADX INFO: renamed from: c */
    public AutoRefreshTextView f48749c;

    /* JADX INFO: renamed from: d */
    public View f48750d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f48751e;

    /* JADX INFO: renamed from: f */
    public SpannableStringBuilder f48752f;

    /* JADX INFO: renamed from: g */
    public int f48753g;

    /* JADX INFO: renamed from: h */
    public bs5 f48754h;

    public LiveChatItem(Context context) {
        super(context);
        this.f48753g = 0;
        this.f48754h = new bs5();
    }

    /* JADX INFO: renamed from: d */
    private Act m72493d() {
        return (Act) xdl0.m208328E(this);
    }

    private void setCommonBackgroundWithCorner(int i) {
        float f = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(!vdt.m198092b(2) ? f48746j : f48745i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        this.f48749c.setBackground(shapeDrawable);
    }

    private void setVipBackgroundWithCorner(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig) {
        this.f48749c.setBackground(m25.m152651a(liveChatShadingConfig, this, t100.f167260i));
        m72501j(liveChatShadingConfig);
    }

    @Override // p149l.pol
    /* JADX INFO: renamed from: M */
    public void mo72494M() {
        if (this.f48752f == null) {
            return;
        }
        this.f48754h.m103657c();
        this.f48749c.setBackground(null);
        this.f48749c.setText("");
        ex4.m118569t(this.f48752f, this.f48749c);
    }

    /* JADX INFO: renamed from: c */
    public final void m72495c(View view) {
        k2s.m144339a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m72496e(View view, MotionEvent motionEvent) {
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
                    CrashHelper.m81296c(e);
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
    public void m72497f(nol nolVar, LiveMessage liveMessage, SpannableStringBuilder spannableStringBuilder, int i) {
        if (liveMessage == null) {
            return;
        }
        this.f48752f = spannableStringBuilder;
        this.f48753g = i;
        xdl0.m208344M(this.f48751e, false);
        xdl0.m208344M(this.f48750d, false);
        m72500i(nolVar, liveMessage.isOpenGradientFlow());
        m72499h(spannableStringBuilder, nolVar, liveMessage);
        ex4.m118571v(nolVar, liveMessage, this);
        m72498g(liveMessage, nolVar);
        if (liveMessage.isGiftMessage()) {
            wrj.m205254t(liveMessage);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m72498g(LiveMessage liveMessage, nol nolVar) {
        int i = t100.f167260i;
        int i2 = this.f48753g;
        if (i2 == 0) {
            m72503l(liveMessage, i, nolVar);
        } else if (i2 == 1 || i2 == 2) {
            m72505n();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m72499h(SpannableStringBuilder spannableStringBuilder, final nol nolVar, final LiveMessage liveMessage) {
        z2s[] z2sVarArr = (z2s[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z2s.class);
        if (z2sVarArr.length <= 0) {
            setPadding(getPaddingLeft(), getPaddingTop(), t100.m186890d(8.0f), getPaddingBottom());
            return;
        }
        m72504m();
        vwb.m200287A(z2sVarArr, new e30() { // from class: l.i2s
            @Override // p149l.e30
            public final void call(Object obj) {
                ((z2s) obj).mo207185d(nolVar, liveMessage);
            }
        });
        setPadding(getPaddingLeft(), getPaddingTop(), t100.m186890d(4.0f), getPaddingBottom());
    }

    /* JADX INFO: renamed from: i */
    public final void m72500i(nol nolVar, boolean z) {
        this.f48749c.setRefresh(z);
        SpannableStringBuilder spannableStringBuilder = this.f48752f;
        AutoRefreshTextView autoRefreshTextView = this.f48749c;
        int i = t100.f167230E;
        ex4.m118574y(spannableStringBuilder, autoRefreshTextView, nolVar, i);
        ex4.m118573x(this.f48752f, this.f48749c, nolVar, m72493d());
        List<c4g0> listM118545A = ex4.m118545A(this.f48752f, nolVar.getAdapter(), this.f48749c, nolVar.getAdapter().act(), i);
        if (!vwb.m200296J(listM118545A)) {
            Iterator<c4g0> it = listM118545A.iterator();
            while (it.hasNext()) {
                this.f48754h.m103655a(it.next());
            }
        }
        this.f48749c.setText(this.f48752f);
    }

    /* JADX INFO: renamed from: j */
    public final void m72501j(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig) {
        LongLinkChatMessage.LiveCornerConfig cornerConfig = liveChatShadingConfig.getCornerConfig();
        if (cornerConfig == null || TextUtils.isEmpty(cornerConfig.getPictureUrl())) {
            return;
        }
        xdl0.m208344M(this.f48750d, true);
        xdl0.m208344M(this.f48751e, true);
        hxs.m133406s("context_livingAct", this.f48751e, liveChatShadingConfig.getCornerConfig().getPictureUrl());
        long position = cornerConfig.getPosition();
        ViewGroup.LayoutParams layoutParams = this.f48751e.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (position == 1) {
                layoutParams2.gravity = BadgeDrawable.TOP_END;
            } else if (position == 2) {
                layoutParams2.gravity = 8388629;
            } else if (position == 3) {
                layoutParams2.gravity = BadgeDrawable.BOTTOM_END;
            }
            this.f48751e.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m72502k(LiveMessage liveMessage, int i) {
        if (liveMessage.hasChatShadeConfig()) {
            setVipBackgroundWithCorner(liveMessage.chatShadeConfig);
        } else {
            setCommonBackgroundWithCorner(i);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m72503l(LiveMessage liveMessage, int i, nol nolVar) {
        m72502k(liveMessage, i);
        if (k25.m144268i(nolVar.getChatScene())) {
            uep0.m193308C(this.f48748b, new Rect(0, t100.m186890d(4.0f), 0, t100.m186890d(4.0f)));
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: m */
    public final void m72504m() {
        this.f48749c.setOnTouchListener(new View.OnTouchListener() { // from class: l.j2s
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f115950a.m72496e(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m72505n() {
        this.f48749c.setPadding(0, 0, 0, 0);
        xdl0.m208344M(this.f48750d, false);
        if ((this.f48749c.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && this.f48753g == 1) {
            this.f48749c.setMinWidth(t100.m186890d(32.0f));
            this.f48749c.setTextColor(-1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72495c(this);
    }

    public LiveChatItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48753g = 0;
        this.f48754h = new bs5();
    }

    public LiveChatItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48753g = 0;
        this.f48754h = new bs5();
    }
}
