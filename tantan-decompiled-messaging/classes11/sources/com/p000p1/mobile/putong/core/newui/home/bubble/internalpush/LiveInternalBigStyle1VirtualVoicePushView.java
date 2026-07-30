package com.p000p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.PushMessage;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.util.Map;
import l.ays;
import l.bt0;
import l.mep0;
import l.qib0;
import l.t100;
import l.x2c0;
import l.xdl0;
import p009l.bym;
import p009l.zxm;
import v.AutoVDraweeView;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LiveInternalBigStyle1VirtualVoicePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: s */
    public static final int f929s = t100.f;

    /* JADX INFO: renamed from: c */
    public FrameLayout f930c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f931d;

    /* JADX INFO: renamed from: e */
    public TextView f932e;

    /* JADX INFO: renamed from: f */
    public VImage f933f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f934g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f935h;

    /* JADX INFO: renamed from: i */
    public ConstraintLayout f936i;

    /* JADX INFO: renamed from: j */
    public AutoVDraweeView f937j;

    /* JADX INFO: renamed from: k */
    public AutoVDraweeView f938k;

    /* JADX INFO: renamed from: l */
    public TextView f939l;

    /* JADX INFO: renamed from: m */
    public VText f940m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f941n;

    /* JADX INFO: renamed from: o */
    public VButton f942o;

    /* JADX INFO: renamed from: p */
    public float f943p;

    /* JADX INFO: renamed from: q */
    public bym f944q;

    /* JADX INFO: renamed from: r */
    public String f945r;

    public LiveInternalBigStyle1VirtualVoicePushView(@NonNull Context context) {
        super(context);
        this.f945r = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc3MkI0SlNYMzZTUVBFNlpNS1AyT1VYVkNKTzZUSDExIiwidyI6MTQzNiwiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTAwODU2NzkzODk0MTIyMjk4MX0.png";
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo1801a() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo1802b(PushMessage pushMessage, Act act) {
        Map map = pushMessage.messageCustomMap;
        this.f941n.setEllipsize(TextUtils.TruncateAt.END);
        this.f940m.setText((CharSequence) map.get("title"));
        this.f941n.setText((CharSequence) map.get("content"));
        if (!TextUtils.isEmpty((CharSequence) map.get("tag1"))) {
            this.f932e.setText((CharSequence) map.get("tag1"));
        }
        xdl0.M(this.f936i, false);
        if (!TextUtils.isEmpty((CharSequence) map.get("subTitle"))) {
            xdl0.M(this.f936i, true);
            mep0.d1(this.f936i, t100.d(6.0f));
            this.f939l.setText((CharSequence) map.get("subTitle"));
            String str = (String) map.get("subTitleIcon");
            if (!TextUtils.isEmpty(str)) {
                this.f938k.setImageUrl(str);
            }
            String str2 = (String) map.get("subTitleBgImage");
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            AutoVDraweeView autoVDraweeView = this.f937j;
            if (zIsEmpty) {
                autoVDraweeView.setImageResource(x2c0.Z8);
            } else {
                autoVDraweeView.setImageUrl(str2);
            }
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("buttonText"))) {
            this.f942o.setText((CharSequence) map.get("buttonText"));
        }
        if (TextUtils.isEmpty((CharSequence) map.get("bgImg"))) {
            qib0.G.L0(this.f931d, this.f945r);
        } else {
            qib0.G.L0(this.f931d, (String) map.get("bgImg"));
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("image"))) {
            xdl0.M(this.f935h, true);
            this.f935h.setImageUrl((String) map.get("image"));
            this.f935h.setOnClickListener(new View.OnClickListener() { // from class: l.xxs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22801a.m1804g(view);
                }
            });
            if (!TextUtils.isEmpty((CharSequence) map.get("big_pic_url"))) {
                xdl0.M(this.f934g, true);
                this.f934g.loadAnimWithListener((String) map.get("big_pic_url"), -1, (AnimListener) null, true);
            }
        }
        this.f942o.setOnClickListener(new View.OnClickListener() { // from class: l.yxs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23282a.m1805h(view);
            }
        });
        xdl0.E0(this.f933f, new View.OnClickListener() { // from class: l.zxs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24033a.m1806i(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m1803f(View view) {
        ays.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1804g(View view) {
        zxm zxmVar;
        bym bymVar = this.f944q;
        if (bymVar == null || (zxmVar = bymVar.f9776a) == null) {
            return;
        }
        zxmVar.m26111J();
        this.f944q.mo1857f();
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorQ = bt0.q(this, "translationY", new float[]{0.0f, -this.f930c.getLayoutParams().height});
        animatorQ.setDuration(400L);
        return animatorQ;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorQ = bt0.q(this, "translationY", new float[]{(-this.f930c.getLayoutParams().height) - getTranslationY(), 0.0f});
        animatorQ.setDuration(400L);
        return animatorQ;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m1805h(View view) {
        zxm zxmVar;
        bym bymVar = this.f944q;
        if (bymVar == null || (zxmVar = bymVar.f9776a) == null) {
            return;
        }
        zxmVar.m26111J();
        this.f944q.mo1857f();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m1806i(View view) {
        this.f1026b.call();
    }

    /* JADX INFO: renamed from: j */
    public LiveInternalPushBaseView m1807j(bym bymVar) {
        this.f944q = bymVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1803f(this);
        xdl0.d0(this, t100.d(24.0f));
        xdl0.e0(this, t100.d(24.0f));
        xdl0.f0(this, t100.d(50.0f));
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.s(t100.o);
        this.f931d.getHierarchy().H(roundingParams);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f943p = motionEvent.getRawY();
        } else if (action == 2 && this.f943p - motionEvent.getRawY() > f929s) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1025a == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if ((action != 1 && action != 3) || this.f943p - motionEvent.getRawY() <= f929s) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1025a.call();
        this.f1025a = null;
        return true;
    }

    public LiveInternalBigStyle1VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f945r = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc3MkI0SlNYMzZTUVBFNlpNS1AyT1VYVkNKTzZUSDExIiwidyI6MTQzNiwiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTAwODU2NzkzODk0MTIyMjk4MX0.png";
    }

    public LiveInternalBigStyle1VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f945r = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc3MkI0SlNYMzZTUVBFNlpNS1AyT1VYVkNKTzZUSDExIiwidyI6MTQzNiwiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTAwODU2NzkzODk0MTIyMjk4MX0.png";
    }
}
