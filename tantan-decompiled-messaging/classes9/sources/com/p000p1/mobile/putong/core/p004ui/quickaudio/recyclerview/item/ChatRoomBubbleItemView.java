package com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p000p1.mobile.putong.core.p004ui.statussquare.CoreStatusSquareTabFrag;
import com.p1.mobile.putong.data.Emotion;
import com.p1.mobile.putong.ui.square.AbsBubbleItemView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.b25;
import l.e30;
import l.t100;
import l.vbe;
import l.vcl0;
import l.vwb;
import l.xdl0;
import p006l.bkb0;
import p006l.qib0;
import v.VDraweeView;
import v.VLinear;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ChatRoomBubbleItemView extends BaseBubbleItemView {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f5211d;

    /* JADX INFO: renamed from: e */
    public VRelative f5212e;

    /* JADX INFO: renamed from: f */
    public VLinear f5213f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f5214g;

    /* JADX INFO: renamed from: h */
    public TextView f5215h;

    /* JADX INFO: renamed from: i */
    public TextView f5216i;

    /* JADX INFO: renamed from: j */
    public Space f5217j;

    /* JADX INFO: renamed from: k */
    public View f5218k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f5219l;

    /* JADX INFO: renamed from: m */
    public View f5220m;

    public ChatRoomBubbleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m7915k(e30 e30Var, View view) {
        if (this.f5211d.getScaleY() >= 0.5f && NullChecker.a(e30Var)) {
            e30Var.call(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    private void m7916m() {
        Emotion emotion = ((AbsBubbleItemView) this).a.i;
        if (emotion == null || vwb.J(emotion.backgroundColor) || vwb.J(emotion.iconColor)) {
            return;
        }
        SVGALoader.with(xdl0.D(getContext())).from(emotion.emojiUrl).autoPlay(true).repeatCount(AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO).into(this.f5214g);
        this.f5216i.setMaxLines(2);
        try {
            String str = (String) emotion.backgroundColor.get(0);
            String str2 = (String) emotion.iconColor.get(0);
            this.f5215h.setText(CoreStatusSquareTabFrag.f6137Y);
            this.f5216i.setTextColor(Color.parseColor("#000000"));
            this.f5215h.setTextColor(Color.parseColor("#000000"));
            this.f5216i.setText(emotion.text);
            this.f5212e.setBackgroundDrawable(vbe.a(emotion.backgroundColor));
            vcl0.b(this.f5212e, t100.t);
            this.f5220m.setBackgroundColor(Color.parseColor(str));
            vcl0.b(this.f5220m, t100.h);
            this.f5213f.setBackgroundColor(Color.parseColor(str2));
            vcl0.b(this.f5213f, t100.r);
            xdl0.M(this.f5219l, true);
            xdl0.M(this.f5218k, true);
            if (!vwb.J(emotion.userAvatars) && emotion.userAvatars.size() > 0) {
                bkb0 bkb0Var = qib0.f19782G;
                VDraweeView vDraweeView = this.f5219l;
                String str3 = (String) emotion.userAvatars.get(0);
                int i = t100.s;
                bkb0Var.m12738I0(vDraweeView, str3, i, i);
            }
            this.f5218k.setBackgroundColor(Color.parseColor(str));
            vcl0.b(this.f5218k, t100.s);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    private void setContentAlpha(Float f) {
        if (f.floatValue() < 0.0f) {
            return;
        }
        this.f5213f.setAlpha(f.floatValue());
        this.f5216i.setAlpha(f.floatValue());
        this.f5219l.setAlpha(f.floatValue());
    }

    /* JADX INFO: renamed from: c */
    public void m7917c(boolean z) {
        if (m7897h(this.f5215h)) {
            xdl0.M0(this.f5215h, z);
        }
        xdl0.M0(this.f5217j, z);
        xdl0.M0(this.f5218k, z);
        xdl0.M0(this.f5219l, z);
        if (m7897h(this.f5213f)) {
            xdl0.M0(this.f5213f, z);
        }
        if (m7897h(this.f5216i)) {
            xdl0.M0(this.f5216i, z);
        }
        xdl0.M0(this.f5220m, z);
    }

    /* JADX INFO: renamed from: e */
    public void m7918e(float f) {
        ConstraintLayout constraintLayout = this.f5211d;
        constraintLayout.setPivotX(constraintLayout.getWidth() / 2.0f);
        this.f5211d.setPivotY(0.0f);
        this.f5211d.setScaleX(f);
        this.f5211d.setScaleY(f);
        setContentAlpha(Float.valueOf((float) ((((double) f) - 0.5d) * 2.0d)));
        int i = t100.L;
        vcl0.b(this.f5212e, i - ((int) ((i - t100.t) * f)));
    }

    public View getAnimLayout() {
        return this.f5211d;
    }

    /* JADX INFO: renamed from: j */
    public final void m7919j(View view) {
        b25.a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public void m7920l(final e30<BaseBubbleItemView> e30Var) {
        if (((AbsBubbleItemView) this).a == null) {
            return;
        }
        xdl0.M(this.f5214g, true);
        xdl0.M(this.f5215h, true);
        m7916m();
        xdl0.E0(this.f5211d, new View.OnClickListener() { // from class: l.a25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8065a.m7915k(e30Var, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7919j(this);
    }

    public ChatRoomBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChatRoomBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
