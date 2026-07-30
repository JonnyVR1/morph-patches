package com.p046p1.mobile.putong.live.livingroom.common.chat;

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
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.bs5;
import p149l.c4g0;
import p149l.e30;
import p149l.ex4;
import p149l.hs4;
import p149l.hxs;
import p149l.ipn;
import p149l.m25;
import p149l.nol;
import p149l.pol;
import p149l.r0n0;
import p149l.t100;
import p149l.vdt;
import p149l.vwb;
import p149l.x4s;
import p149l.xdl0;
import p149l.z2s;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceChatItem extends FrameLayout implements pol, IChatItemLongClickArea {

    /* JADX INFO: renamed from: l */
    public static final int f48755l = Color.parseColor("#33000000");

    /* JADX INFO: renamed from: m */
    public static final int f48756m = Color.parseColor("#4D000000");

    /* JADX INFO: renamed from: n */
    public static final int f48757n = t100.m186890d(1.5f);

    /* JADX INFO: renamed from: o */
    public static final int f48758o = t100.m186890d(12.0f);

    /* JADX INFO: renamed from: a */
    public VoiceChatItem f48759a;

    /* JADX INFO: renamed from: b */
    public VLinear f48760b;

    /* JADX INFO: renamed from: c */
    public VText f48761c;

    /* JADX INFO: renamed from: d */
    public View f48762d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f48763e;

    /* JADX INFO: renamed from: f */
    public IChatItemLongClickArea.LongClickArea f48764f;

    /* JADX INFO: renamed from: g */
    public List<c4g0> f48765g;

    /* JADX INFO: renamed from: h */
    public SpannableStringBuilder f48766h;

    /* JADX INFO: renamed from: i */
    public LiveMessage f48767i;

    /* JADX INFO: renamed from: j */
    public int f48768j;

    /* JADX INFO: renamed from: k */
    public bs5 f48769k;

    public VoiceChatItem(Context context) {
        super(context);
        this.f48765g = null;
        this.f48768j = 0;
        this.f48769k = new bs5();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m72507b(View view, MotionEvent motionEvent) {
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
            CrashHelper.m81296c(e);
        }
        if (clickableSpanArr.length == 0) {
            return false;
        }
        clickableSpanArr[0].onClick(textView);
        return true;
    }

    /* JADX INFO: renamed from: f */
    private void m72508f(LiveMessage liveMessage, nol nolVar) {
        int iM186890d = t100.m186890d(14.0f);
        int i = this.f48768j;
        if (i == 0) {
            m72512j(liveMessage, iM186890d, nolVar);
        } else if (i == 1) {
            setVoiceContentConfig(nolVar);
        } else {
            if (i != 2) {
                return;
            }
            m72517l(nolVar);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m72509g(SpannableStringBuilder spannableStringBuilder, final nol nolVar, final LiveMessage liveMessage) {
        z2s[] z2sVarArr = (z2s[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z2s.class);
        if (z2sVarArr.length > 0) {
            m72513k();
            vwb.m200287A(z2sVarArr, new e30() { // from class: l.b0n0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((z2s) obj).mo207185d(nolVar, liveMessage);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    private void m72510h(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig) {
        LongLinkChatMessage.LiveCornerConfig cornerConfig = liveChatShadingConfig.getCornerConfig();
        if (cornerConfig == null) {
            xdl0.m208359W(this.f48761c, 0);
            return;
        }
        if (TextUtils.isEmpty(cornerConfig.getPictureUrl())) {
            xdl0.m208359W(this.f48761c, 0);
            return;
        }
        m72515d(true);
        xdl0.m208344M(this.f48763e, true);
        hxs.m133409v("context_livingAct", this.f48763e, liveChatShadingConfig.getCornerConfig().getPictureUrl(), xdl0.m208407w(30.0f), xdl0.m208407w(30.0f), false, false, ipn.m137564a(), null);
        long position = cornerConfig.getPosition();
        ViewGroup.LayoutParams layoutParams = this.f48763e.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (position == 1) {
                layoutParams2.gravity = BadgeDrawable.TOP_END;
            } else if (position == 2) {
                layoutParams2.gravity = 8388629;
            } else if (position == 3) {
                layoutParams2.gravity = BadgeDrawable.BOTTOM_END;
            }
            layoutParams.width = t100.m186890d(30.0f);
            layoutParams.height = t100.m186890d(30.0f);
            this.f48763e.setLayoutParams(layoutParams2);
            xdl0.m208359W(this.f48761c, t100.m186890d(15.0f));
        }
    }

    /* JADX INFO: renamed from: i */
    private void m72511i(LiveMessage liveMessage, int i) {
        if (liveMessage.hasChatShadeConfig()) {
            setVipBackgroundWithCorner(liveMessage.chatShadeConfig);
        } else {
            setCommonBackgroundWithCorner(t100.m186890d(10.0f));
        }
    }

    /* JADX INFO: renamed from: j */
    private void m72512j(LiveMessage liveMessage, int i, nol nolVar) {
        this.f48761c.setMinHeight(t100.m186890d(38.0f));
        m72511i(liveMessage, i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: k */
    private void m72513k() {
        this.f48761c.setOnTouchListener(new View.OnTouchListener() { // from class: l.c0n0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return VoiceChatItem.m72507b(view, motionEvent);
            }
        });
    }

    private void setCommonBackgroundWithCorner(int i) {
        float f = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(!vdt.m198092b(3) ? f48756m : f48755l);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        this.f48761c.setBackground(shapeDrawable);
        xdl0.m208359W(this.f48761c, 0);
    }

    private void setVipBackgroundWithCorner(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig) {
        this.f48761c.setBackground(m25.m152658h(liveChatShadingConfig, this, t100.f167260i));
        m72510h(liveChatShadingConfig);
    }

    private void setVoiceContentConfig(nol nolVar) {
        m72517l(nolVar);
        m72511i(this.f48767i, t100.m186890d(10.0f));
    }

    @Override // p149l.pol
    /* JADX INFO: renamed from: M */
    public void mo72494M() {
        if (this.f48766h == null) {
            return;
        }
        this.f48769k.m103657c();
        this.f48761c.setBackground(null);
        this.f48761c.setText("");
        ex4.m118569t(this.f48766h, this.f48761c);
    }

    /* JADX INFO: renamed from: c */
    public final void m72514c(View view) {
        r0n0.m177406a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m72515d(boolean z) {
        if (this.f48768j == 0) {
            this.f48761c.setMinHeight(t100.m186890d(this.f48767i.hasChatShadeConfig() ? 22.0f : 24.0f));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m72516e(nol nolVar, LiveMessage liveMessage, SpannableStringBuilder spannableStringBuilder, int i) {
        if (liveMessage == null) {
            return;
        }
        this.f48766h = spannableStringBuilder;
        this.f48767i = liveMessage;
        this.f48768j = i;
        xdl0.m208344M(this.f48763e, false);
        m72515d(false);
        VText vText = this.f48761c;
        int i2 = t100.f167230E;
        ex4.m118574y(spannableStringBuilder, vText, nolVar, i2);
        hs4 adapter = nolVar.getAdapter();
        List<c4g0> listM118545A = ex4.m118545A(spannableStringBuilder, adapter, this.f48761c, adapter.act(), i2);
        this.f48765g = listM118545A;
        if (!vwb.m200296J(listM118545A)) {
            Iterator<c4g0> it = this.f48765g.iterator();
            while (it.hasNext()) {
                this.f48769k.m103655a(it.next());
            }
        }
        m72509g(spannableStringBuilder, nolVar, liveMessage);
        this.f48761c.setText(spannableStringBuilder);
        ex4.m118571v(nolVar, liveMessage, this);
        m72508f(liveMessage, nolVar);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea
    @NonNull
    public View getClickTarget() {
        return this;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea
    @Nullable
    public IChatItemLongClickArea.LongClickArea getLongClickArea() {
        return this.f48764f;
    }

    /* JADX INFO: renamed from: l */
    public final void m72517l(nol nolVar) {
        if (this.f48768j == 1) {
            this.f48761c.setMinWidth(t100.m186890d(32.0f));
            boolean zM207012b = x4s.m207012b(nolVar.getLiveMode());
            VText vText = this.f48761c;
            if (zM207012b) {
                vText.setTextColor(Color.parseColor("#ccffffff"));
            } else {
                vText.setTextColor(-1);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72514c(this);
    }

    public void setLongClickArea(@Nullable IChatItemLongClickArea.LongClickArea longClickArea) {
        this.f48764f = longClickArea;
    }

    public VoiceChatItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48765g = null;
        this.f48768j = 0;
        this.f48769k = new bs5();
    }

    public VoiceChatItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48765g = null;
        this.f48768j = 0;
        this.f48769k = new bs5();
    }
}
