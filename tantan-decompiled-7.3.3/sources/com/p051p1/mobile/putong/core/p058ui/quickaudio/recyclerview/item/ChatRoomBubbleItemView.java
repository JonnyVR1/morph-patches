package com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.SquareDataWrapper;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p051p1.mobile.putong.core.p058ui.statussquare.CoreStatusSquareTabFrag;
import com.p051p1.mobile.putong.data.Emotion;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRelative;
import p153l.a35;
import p153l.bnl0;
import p153l.fsb0;
import p153l.jyb;
import p153l.qa00;
import p153l.uqb0;
import p153l.y20;
import p153l.zce;
import p153l.zll0;

/* JADX INFO: loaded from: classes12.dex */
public class ChatRoomBubbleItemView extends BaseBubbleItemView {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f36278d;

    /* JADX INFO: renamed from: e */
    public VRelative f36279e;

    /* JADX INFO: renamed from: f */
    public VLinear f36280f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f36281g;

    /* JADX INFO: renamed from: h */
    public TextView f36282h;

    /* JADX INFO: renamed from: i */
    public TextView f36283i;

    /* JADX INFO: renamed from: j */
    public Space f36284j;

    /* JADX INFO: renamed from: k */
    public View f36285k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f36286l;

    /* JADX INFO: renamed from: m */
    public View f36287m;

    public ChatRoomBubbleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m55755k(y20 y20Var, View view) {
        if (this.f36278d.getScaleY() >= 0.5f && NullChecker.m82486a(y20Var)) {
            y20Var.call(this);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m55756m() {
        Emotion emotion = ((SquareDataWrapper) this.f55586a).f33512i;
        if (emotion == null || jyb.m147479J(emotion.backgroundColor) || jyb.m147479J(emotion.iconColor)) {
            return;
        }
        SVGALoader.with(bnl0.m105506D(getContext())).from(emotion.emojiUrl).autoPlay(true).repeatCount(1000).into(this.f36281g);
        this.f36283i.setMaxLines(2);
        try {
            String str = emotion.backgroundColor.get(0);
            String str2 = emotion.iconColor.get(0);
            this.f36282h.setText(CoreStatusSquareTabFrag.f37204Y);
            this.f36283i.setTextColor(Color.parseColor(Constants.BLACK));
            this.f36282h.setTextColor(Color.parseColor(Constants.BLACK));
            this.f36283i.setText(emotion.text);
            this.f36279e.setBackgroundDrawable(zce.m219236a(emotion.backgroundColor));
            zll0.m220293b(this.f36279e, qa00.f156333t);
            this.f36287m.setBackgroundColor(Color.parseColor(str));
            zll0.m220293b(this.f36287m, qa00.f156321h);
            this.f36280f.setBackgroundColor(Color.parseColor(str2));
            zll0.m220293b(this.f36280f, qa00.f156331r);
            bnl0.m105524M(this.f36286l, true);
            bnl0.m105524M(this.f36285k, true);
            if (!jyb.m147479J(emotion.userAvatars) && emotion.userAvatars.size() > 0) {
                fsb0 fsb0Var = uqb0.f180374G;
                VDraweeView vDraweeView = this.f36286l;
                String str3 = emotion.userAvatars.get(0);
                int i = qa00.f156332s;
                fsb0Var.m127109I0(vDraweeView, str3, i, i);
            }
            this.f36285k.setBackgroundColor(Color.parseColor(str));
            zll0.m220293b(this.f36285k, qa00.f156332s);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    private void setContentAlpha(Float f) {
        if (f.floatValue() < 0.0f) {
            return;
        }
        this.f36280f.setAlpha(f.floatValue());
        this.f36283i.setAlpha(f.floatValue());
        this.f36286l.setAlpha(f.floatValue());
    }

    @Override // com.p051p1.mobile.putong.p070ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: c */
    public void mo55746c(boolean z) {
        if (m55737h(this.f36282h)) {
            bnl0.m105525M0(this.f36282h, z);
        }
        bnl0.m105525M0(this.f36284j, z);
        bnl0.m105525M0(this.f36285k, z);
        bnl0.m105525M0(this.f36286l, z);
        if (m55737h(this.f36280f)) {
            bnl0.m105525M0(this.f36280f, z);
        }
        if (m55737h(this.f36283i)) {
            bnl0.m105525M0(this.f36283i, z);
        }
        bnl0.m105525M0(this.f36287m, z);
    }

    @Override // com.p051p1.mobile.putong.p070ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: e */
    public void mo55747e(float f) {
        ConstraintLayout constraintLayout = this.f36278d;
        constraintLayout.setPivotX(constraintLayout.getWidth() / 2.0f);
        this.f36278d.setPivotY(0.0f);
        this.f36278d.setScaleX(f);
        this.f36278d.setScaleY(f);
        setContentAlpha(Float.valueOf((float) ((((double) f) - 0.5d) * 2.0d)));
        int i = qa00.f156299L;
        zll0.m220293b(this.f36279e, i - ((int) ((i - qa00.f156333t) * f)));
    }

    @Override // com.p051p1.mobile.putong.p070ui.square.AbsBubbleItemView
    public View getAnimLayout() {
        return this.f36278d;
    }

    /* JADX INFO: renamed from: j */
    public final void m55757j(View view) {
        a35.m95769a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public void m55758l(final y20<BaseBubbleItemView> y20Var) {
        if (this.f55586a == 0) {
            return;
        }
        bnl0.m105524M(this.f36281g, true);
        bnl0.m105524M(this.f36282h, true);
        m55756m();
        bnl0.m105509E0(this.f36278d, new View.OnClickListener() { // from class: l.z25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202631a.m55755k(y20Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55757j(this);
    }

    public ChatRoomBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChatRoomBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
