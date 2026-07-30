package com.p051p1.mobile.putong.live.livingroom.common.chat;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.view.AutoRefreshTextView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.List;
import p151v.VDraweeView;
import p153l.a5s;
import p153l.arl;
import p153l.bnl0;
import p153l.dy4;
import p153l.ft5;
import p153l.izs;
import p153l.j35;
import p153l.jyb;
import p153l.kcg0;
import p153l.l35;
import p153l.l4s;
import p153l.muj;
import p153l.qa00;
import p153l.wft;
import p153l.y20;
import p153l.ynp0;
import p153l.yql;

/* JADX INFO: loaded from: classes4.dex */
public class LiveChatItem extends FrameLayout implements arl {

    /* JADX INFO: renamed from: i */
    public static final int f49593i = Color.parseColor("#34000000");

    /* JADX INFO: renamed from: j */
    public static final int f49594j = Color.parseColor("#4D000000");

    /* JADX INFO: renamed from: a */
    public LiveChatItem f49595a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f49596b;

    /* JADX INFO: renamed from: c */
    public AutoRefreshTextView f49597c;

    /* JADX INFO: renamed from: d */
    public View f49598d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49599e;

    /* JADX INFO: renamed from: f */
    public SpannableStringBuilder f49600f;

    /* JADX INFO: renamed from: g */
    public int f49601g;

    /* JADX INFO: renamed from: h */
    public ft5 f49602h;

    public LiveChatItem(Context context) {
        super(context);
        this.f49601g = 0;
        this.f49602h = new ft5();
    }

    /* JADX INFO: renamed from: d */
    private Act m73676d() {
        return (Act) bnl0.m105508E(this);
    }

    private void setCommonBackgroundWithCorner(int i) {
        float f = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(!wft.m206159b(2) ? f49594j : f49593i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        this.f49597c.setBackground(shapeDrawable);
    }

    private void setVipBackgroundWithCorner(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig) {
        this.f49597c.setBackground(l35.m152669a(liveChatShadingConfig, this, qa00.f156322i));
        m73684j(liveChatShadingConfig);
    }

    @Override // p153l.arl
    /* JADX INFO: renamed from: M */
    public void mo73677M() {
        if (this.f49600f == null) {
            return;
        }
        this.f49602h.m127299c();
        this.f49597c.setBackground(null);
        this.f49597c.setText("");
        dy4.m118610t(this.f49600f, this.f49597c);
    }

    /* JADX INFO: renamed from: c */
    public final void m73678c(View view) {
        l4s.m152838a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m73679e(View view, MotionEvent motionEvent) {
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
                    CrashHelper.m82479c(e);
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
    public void m73680f(yql yqlVar, LiveMessage liveMessage, SpannableStringBuilder spannableStringBuilder, int i) {
        if (liveMessage == null) {
            return;
        }
        this.f49600f = spannableStringBuilder;
        this.f49601g = i;
        bnl0.m105524M(this.f49599e, false);
        bnl0.m105524M(this.f49598d, false);
        m73683i(yqlVar, liveMessage.isOpenGradientFlow());
        m73682h(spannableStringBuilder, yqlVar, liveMessage);
        dy4.m118612v(yqlVar, liveMessage, this);
        m73681g(liveMessage, yqlVar);
        if (liveMessage.isGiftMessage()) {
            muj.m160218t(liveMessage);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m73681g(LiveMessage liveMessage, yql yqlVar) {
        int i = qa00.f156322i;
        int i2 = this.f49601g;
        if (i2 == 0) {
            m73686l(liveMessage, i, yqlVar);
        } else if (i2 == 1 || i2 == 2) {
            m73688n();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m73682h(SpannableStringBuilder spannableStringBuilder, final yql yqlVar, final LiveMessage liveMessage) {
        a5s[] a5sVarArr = (a5s[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a5s.class);
        if (a5sVarArr.length <= 0) {
            setPadding(getPaddingLeft(), getPaddingTop(), qa00.m175859d(8.0f), getPaddingBottom());
            return;
        }
        m73687m();
        jyb.m147470A(a5sVarArr, new y20() { // from class: l.j4s
            @Override // p153l.y20
            public final void call(Object obj) {
                ((a5s) obj).mo96246d(yqlVar, liveMessage);
            }
        });
        setPadding(getPaddingLeft(), getPaddingTop(), qa00.m175859d(4.0f), getPaddingBottom());
    }

    /* JADX INFO: renamed from: i */
    public final void m73683i(yql yqlVar, boolean z) {
        this.f49597c.setRefresh(z);
        SpannableStringBuilder spannableStringBuilder = this.f49600f;
        AutoRefreshTextView autoRefreshTextView = this.f49597c;
        int i = qa00.f156292E;
        dy4.m118615y(spannableStringBuilder, autoRefreshTextView, yqlVar, i);
        dy4.m118614x(this.f49600f, this.f49597c, yqlVar, m73676d());
        List<kcg0> listM118586A = dy4.m118586A(this.f49600f, yqlVar.getAdapter(), this.f49597c, yqlVar.getAdapter().act(), i);
        if (!jyb.m147479J(listM118586A)) {
            Iterator<kcg0> it = listM118586A.iterator();
            while (it.hasNext()) {
                this.f49602h.m127297a(it.next());
            }
        }
        this.f49597c.setText(this.f49600f);
    }

    /* JADX INFO: renamed from: j */
    public final void m73684j(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig) {
        LongLinkChatMessage.LiveCornerConfig cornerConfig = liveChatShadingConfig.getCornerConfig();
        if (cornerConfig == null || TextUtils.isEmpty(cornerConfig.getPictureUrl())) {
            return;
        }
        bnl0.m105524M(this.f49598d, true);
        bnl0.m105524M(this.f49599e, true);
        izs.m142868s("context_livingAct", this.f49599e, liveChatShadingConfig.getCornerConfig().getPictureUrl());
        long position = cornerConfig.getPosition();
        ViewGroup.LayoutParams layoutParams = this.f49599e.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (position == 1) {
                layoutParams2.gravity = BadgeDrawable.TOP_END;
            } else if (position == 2) {
                layoutParams2.gravity = 8388629;
            } else if (position == 3) {
                layoutParams2.gravity = BadgeDrawable.BOTTOM_END;
            }
            this.f49599e.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m73685k(LiveMessage liveMessage, int i) {
        if (liveMessage.hasChatShadeConfig()) {
            setVipBackgroundWithCorner(liveMessage.chatShadeConfig);
        } else {
            setCommonBackgroundWithCorner(i);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m73686l(LiveMessage liveMessage, int i, yql yqlVar) {
        m73685k(liveMessage, i);
        if (j35.m143324i(yqlVar.getChatScene())) {
            ynp0.m216918C(this.f49596b, new Rect(0, qa00.m175859d(4.0f), 0, qa00.m175859d(4.0f)));
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: m */
    public final void m73687m() {
        this.f49597c.setOnTouchListener(new View.OnTouchListener() { // from class: l.k4s
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f123919a.m73679e(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m73688n() {
        this.f49597c.setPadding(0, 0, 0, 0);
        bnl0.m105524M(this.f49598d, false);
        if ((this.f49597c.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && this.f49601g == 1) {
            this.f49597c.setMinWidth(qa00.m175859d(32.0f));
            this.f49597c.setTextColor(-1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73678c(this);
    }

    public LiveChatItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49601g = 0;
        this.f49602h = new ft5();
    }

    public LiveChatItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49601g = 0;
        this.f49602h = new ft5();
    }
}
