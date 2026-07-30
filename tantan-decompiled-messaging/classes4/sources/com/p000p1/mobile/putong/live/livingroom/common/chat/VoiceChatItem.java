package com.p000p1.mobile.putong.live.livingroom.common.chat;

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
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.List;
import l.bs5;
import l.c4g0;
import l.e30;
import l.hxs;
import l.ipn;
import l.t100;
import l.vdt;
import l.vwb;
import l.x4s;
import l.xdl0;
import l.ym2;
import p002l.ex4;
import p002l.hs4;
import p002l.m25;
import p002l.nol;
import p002l.pol;
import p002l.r0n0;
import p002l.z2s;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class VoiceChatItem extends FrameLayout implements pol, IChatItemLongClickArea {

    /* JADX INFO: renamed from: l */
    public static final int f4797l = Color.parseColor("#33000000");

    /* JADX INFO: renamed from: m */
    public static final int f4798m = Color.parseColor("#4D000000");

    /* JADX INFO: renamed from: n */
    public static final int f4799n = t100.d(1.5f);

    /* JADX INFO: renamed from: o */
    public static final int f4800o = t100.d(12.0f);

    /* JADX INFO: renamed from: a */
    public VoiceChatItem f4801a;

    /* JADX INFO: renamed from: b */
    public VLinear f4802b;

    /* JADX INFO: renamed from: c */
    public VText f4803c;

    /* JADX INFO: renamed from: d */
    public View f4804d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4805e;

    /* JADX INFO: renamed from: f */
    public IChatItemLongClickArea.LongClickArea f4806f;

    /* JADX INFO: renamed from: g */
    public List<c4g0> f4807g;

    /* JADX INFO: renamed from: h */
    public SpannableStringBuilder f4808h;

    /* JADX INFO: renamed from: i */
    public LiveMessage f4809i;

    /* JADX INFO: renamed from: j */
    public int f4810j;

    /* JADX INFO: renamed from: k */
    public bs5 f4811k;

    public VoiceChatItem(Context context) {
        super(context);
        this.f4807g = null;
        this.f4810j = 0;
        this.f4811k = new bs5();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m5999b(View view, MotionEvent motionEvent) {
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
            CrashHelper.c(e);
        }
        if (clickableSpanArr.length == 0) {
            return false;
        }
        clickableSpanArr[0].onClick(textView);
        return true;
    }

    /* JADX INFO: renamed from: f */
    private void m6000f(LiveMessage liveMessage, nol nolVar) {
        int iD = t100.d(14.0f);
        int i = this.f4810j;
        if (i == 0) {
            m6004j(liveMessage, iD, nolVar);
        } else if (i == 1) {
            setVoiceContentConfig(nolVar);
        } else {
            if (i != 2) {
                return;
            }
            m6009l(nolVar);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m6001g(SpannableStringBuilder spannableStringBuilder, final nol nolVar, final LiveMessage liveMessage) {
        z2s[] z2sVarArr = (z2s[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z2s.class);
        if (z2sVarArr.length > 0) {
            m6005k();
            vwb.A(z2sVarArr, new e30() { // from class: l.b0n0
                public final void call(Object obj) {
                    ((z2s) obj).mo25699d(nolVar, liveMessage);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    private void m6002h(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig) {
        LongLinkChatMessage.LiveCornerConfig cornerConfig = liveChatShadingConfig.getCornerConfig();
        if (cornerConfig == null) {
            xdl0.W(this.f4803c, 0);
            return;
        }
        if (TextUtils.isEmpty(cornerConfig.getPictureUrl())) {
            xdl0.W(this.f4803c, 0);
            return;
        }
        m6007d(true);
        xdl0.M(this.f4805e, true);
        hxs.v("context_livingAct", this.f4805e, liveChatShadingConfig.getCornerConfig().getPictureUrl(), xdl0.w(30.0f), xdl0.w(30.0f), false, false, ipn.a(), (ym2) null);
        long position = cornerConfig.getPosition();
        ViewGroup.LayoutParams layoutParams = this.f4805e.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (position == 1) {
                layoutParams2.gravity = 8388661;
            } else if (position == 2) {
                layoutParams2.gravity = 8388629;
            } else if (position == 3) {
                layoutParams2.gravity = 8388693;
            }
            layoutParams.width = t100.d(30.0f);
            layoutParams.height = t100.d(30.0f);
            this.f4805e.setLayoutParams(layoutParams2);
            xdl0.W(this.f4803c, t100.d(15.0f));
        }
    }

    /* JADX INFO: renamed from: i */
    private void m6003i(LiveMessage liveMessage, int i) {
        if (liveMessage.hasChatShadeConfig()) {
            setVipBackgroundWithCorner(liveMessage.chatShadeConfig);
        } else {
            setCommonBackgroundWithCorner(t100.d(10.0f));
        }
    }

    /* JADX INFO: renamed from: j */
    private void m6004j(LiveMessage liveMessage, int i, nol nolVar) {
        this.f4803c.setMinHeight(t100.d(38.0f));
        m6003i(liveMessage, i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: k */
    private void m6005k() {
        this.f4803c.setOnTouchListener(new View.OnTouchListener() { // from class: l.c0n0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return VoiceChatItem.m5999b(view, motionEvent);
            }
        });
    }

    private void setCommonBackgroundWithCorner(int i) {
        float f = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(!vdt.b(3) ? f4798m : f4797l);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        this.f4803c.setBackground(shapeDrawable);
        xdl0.W(this.f4803c, 0);
    }

    private void setVipBackgroundWithCorner(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig) {
        this.f4803c.setBackground(m25.m17676h(liveChatShadingConfig, this, t100.i));
        m6002h(liveChatShadingConfig);
    }

    private void setVoiceContentConfig(nol nolVar) {
        m6009l(nolVar);
        m6003i(this.f4809i, t100.d(10.0f));
    }

    @Override // p002l.pol
    /* JADX INFO: renamed from: M */
    public void mo5986M() {
        if (this.f4808h == null) {
            return;
        }
        this.f4811k.c();
        this.f4803c.setBackground(null);
        this.f4803c.setText("");
        ex4.m12826t(this.f4808h, this.f4803c);
    }

    /* JADX INFO: renamed from: c */
    public final void m6006c(View view) {
        r0n0.m21710a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m6007d(boolean z) {
        if (this.f4810j == 0) {
            this.f4803c.setMinHeight(t100.d(this.f4809i.hasChatShadeConfig() ? 22.0f : 24.0f));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m6008e(nol nolVar, LiveMessage liveMessage, SpannableStringBuilder spannableStringBuilder, int i) {
        if (liveMessage == null) {
            return;
        }
        this.f4808h = spannableStringBuilder;
        this.f4809i = liveMessage;
        this.f4810j = i;
        xdl0.M(this.f4805e, false);
        m6007d(false);
        VText vText = this.f4803c;
        int i2 = t100.E;
        ex4.m12831y(spannableStringBuilder, vText, nolVar, i2);
        hs4 adapter = nolVar.getAdapter();
        List<c4g0> listM12802A = ex4.m12802A(spannableStringBuilder, adapter, this.f4803c, adapter.act(), i2);
        this.f4807g = listM12802A;
        if (!vwb.J(listM12802A)) {
            Iterator<c4g0> it = this.f4807g.iterator();
            while (it.hasNext()) {
                this.f4811k.a(it.next());
            }
        }
        m6001g(spannableStringBuilder, nolVar, liveMessage);
        this.f4803c.setText(spannableStringBuilder);
        ex4.m12828v(nolVar, liveMessage, this);
        m6000f(liveMessage, nolVar);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea
    @NonNull
    public View getClickTarget() {
        return this;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea
    @Nullable
    public IChatItemLongClickArea.LongClickArea getLongClickArea() {
        return this.f4806f;
    }

    /* JADX INFO: renamed from: l */
    public final void m6009l(nol nolVar) {
        if (this.f4810j == 1) {
            this.f4803c.setMinWidth(t100.d(32.0f));
            boolean zB = x4s.b(nolVar.getLiveMode());
            VText vText = this.f4803c;
            if (zB) {
                vText.setTextColor(Color.parseColor("#ccffffff"));
            } else {
                vText.setTextColor(-1);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6006c(this);
    }

    public void setLongClickArea(@Nullable IChatItemLongClickArea.LongClickArea longClickArea) {
        this.f4806f = longClickArea;
    }

    public VoiceChatItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4807g = null;
        this.f4810j = 0;
        this.f4811k = new bs5();
    }

    public VoiceChatItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4807g = null;
        this.f4810j = 0;
        this.f4811k = new bs5();
    }
}
