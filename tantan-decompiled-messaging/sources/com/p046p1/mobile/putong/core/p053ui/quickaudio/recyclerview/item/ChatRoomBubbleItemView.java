package com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.SquareDataWrapper;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p046p1.mobile.putong.core.p053ui.statussquare.CoreStatusSquareTabFrag;
import com.p046p1.mobile.putong.data.Emotion;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRelative;
import p149l.b25;
import p149l.bkb0;
import p149l.e30;
import p149l.qib0;
import p149l.t100;
import p149l.vbe;
import p149l.vcl0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class ChatRoomBubbleItemView extends BaseBubbleItemView {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f35430d;

    /* JADX INFO: renamed from: e */
    public VRelative f35431e;

    /* JADX INFO: renamed from: f */
    public VLinear f35432f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f35433g;

    /* JADX INFO: renamed from: h */
    public TextView f35434h;

    /* JADX INFO: renamed from: i */
    public TextView f35435i;

    /* JADX INFO: renamed from: j */
    public Space f35436j;

    /* JADX INFO: renamed from: k */
    public View f35437k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f35438l;

    /* JADX INFO: renamed from: m */
    public View f35439m;

    public ChatRoomBubbleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m54572k(e30 e30Var, View view) {
        if (this.f35430d.getScaleY() >= 0.5f && NullChecker.m81303a(e30Var)) {
            e30Var.call(this);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m54573m() {
        Emotion emotion = ((SquareDataWrapper) this.f54738a).f32664i;
        if (emotion == null || vwb.m200296J(emotion.backgroundColor) || vwb.m200296J(emotion.iconColor)) {
            return;
        }
        SVGALoader.with(xdl0.m208326D(getContext())).from(emotion.emojiUrl).autoPlay(true).repeatCount(1000).into(this.f35433g);
        this.f35435i.setMaxLines(2);
        try {
            String str = emotion.backgroundColor.get(0);
            String str2 = emotion.iconColor.get(0);
            this.f35434h.setText(CoreStatusSquareTabFrag.f36356Y);
            this.f35435i.setTextColor(Color.parseColor(Constants.BLACK));
            this.f35434h.setTextColor(Color.parseColor(Constants.BLACK));
            this.f35435i.setText(emotion.text);
            this.f35431e.setBackgroundDrawable(vbe.m197707a(emotion.backgroundColor));
            vcl0.m197906b(this.f35431e, t100.f167271t);
            this.f35439m.setBackgroundColor(Color.parseColor(str));
            vcl0.m197906b(this.f35439m, t100.f167259h);
            this.f35432f.setBackgroundColor(Color.parseColor(str2));
            vcl0.m197906b(this.f35432f, t100.f167269r);
            xdl0.m208344M(this.f35438l, true);
            xdl0.m208344M(this.f35437k, true);
            if (!vwb.m200296J(emotion.userAvatars) && emotion.userAvatars.size() > 0) {
                bkb0 bkb0Var = qib0.f154691G;
                VDraweeView vDraweeView = this.f35438l;
                String str3 = emotion.userAvatars.get(0);
                int i = t100.f167270s;
                bkb0Var.m102325I0(vDraweeView, str3, i, i);
            }
            this.f35437k.setBackgroundColor(Color.parseColor(str));
            vcl0.m197906b(this.f35437k, t100.f167270s);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    private void setContentAlpha(Float f) {
        if (f.floatValue() < 0.0f) {
            return;
        }
        this.f35432f.setAlpha(f.floatValue());
        this.f35435i.setAlpha(f.floatValue());
        this.f35438l.setAlpha(f.floatValue());
    }

    @Override // com.p046p1.mobile.putong.p065ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: c */
    public void mo54563c(boolean z) {
        if (m54554h(this.f35434h)) {
            xdl0.m208345M0(this.f35434h, z);
        }
        xdl0.m208345M0(this.f35436j, z);
        xdl0.m208345M0(this.f35437k, z);
        xdl0.m208345M0(this.f35438l, z);
        if (m54554h(this.f35432f)) {
            xdl0.m208345M0(this.f35432f, z);
        }
        if (m54554h(this.f35435i)) {
            xdl0.m208345M0(this.f35435i, z);
        }
        xdl0.m208345M0(this.f35439m, z);
    }

    @Override // com.p046p1.mobile.putong.p065ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: e */
    public void mo54564e(float f) {
        ConstraintLayout constraintLayout = this.f35430d;
        constraintLayout.setPivotX(constraintLayout.getWidth() / 2.0f);
        this.f35430d.setPivotY(0.0f);
        this.f35430d.setScaleX(f);
        this.f35430d.setScaleY(f);
        setContentAlpha(Float.valueOf((float) ((((double) f) - 0.5d) * 2.0d)));
        int i = t100.f167237L;
        vcl0.m197906b(this.f35431e, i - ((int) ((i - t100.f167271t) * f)));
    }

    @Override // com.p046p1.mobile.putong.p065ui.square.AbsBubbleItemView
    public View getAnimLayout() {
        return this.f35430d;
    }

    /* JADX INFO: renamed from: j */
    public final void m54574j(View view) {
        b25.m99897a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public void m54575l(final e30<BaseBubbleItemView> e30Var) {
        if (this.f54738a == 0) {
            return;
        }
        xdl0.m208344M(this.f35433g, true);
        xdl0.m208344M(this.f35434h, true);
        m54573m();
        xdl0.m208329E0(this.f35430d, new View.OnClickListener() { // from class: l.a25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67227a.m54572k(e30Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54574j(this);
    }

    public ChatRoomBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChatRoomBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
