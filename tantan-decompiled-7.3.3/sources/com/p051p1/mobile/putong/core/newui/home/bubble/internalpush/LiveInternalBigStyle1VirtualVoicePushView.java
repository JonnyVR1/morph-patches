package com.p051p1.mobile.putong.core.newui.home.bubble.internalpush;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.data.PushMessage;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import java.util.Map;
import p151v.AutoVDraweeView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.b0n;
import p153l.b0t;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gt0;
import p153l.qa00;
import p153l.qnp0;
import p153l.uqb0;
import p153l.zzm;

/* JADX INFO: loaded from: classes11.dex */
public class LiveInternalBigStyle1VirtualVoicePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: s */
    public static final int f22893s = qa00.f156319f;

    /* JADX INFO: renamed from: c */
    public FrameLayout f22894c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f22895d;

    /* JADX INFO: renamed from: e */
    public TextView f22896e;

    /* JADX INFO: renamed from: f */
    public VImage f22897f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f22898g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f22899h;

    /* JADX INFO: renamed from: i */
    public ConstraintLayout f22900i;

    /* JADX INFO: renamed from: j */
    public AutoVDraweeView f22901j;

    /* JADX INFO: renamed from: k */
    public AutoVDraweeView f22902k;

    /* JADX INFO: renamed from: l */
    public TextView f22903l;

    /* JADX INFO: renamed from: m */
    public VText f22904m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f22905n;

    /* JADX INFO: renamed from: o */
    public VButton f22906o;

    /* JADX INFO: renamed from: p */
    public float f22907p;

    /* JADX INFO: renamed from: q */
    public b0n f22908q;

    /* JADX INFO: renamed from: r */
    public String f22909r;

    public LiveInternalBigStyle1VirtualVoicePushView(@NonNull Context context) {
        super(context);
        this.f22909r = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc3MkI0SlNYMzZTUVBFNlpNS1AyT1VYVkNKTzZUSDExIiwidyI6MTQzNiwiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTAwODU2NzkzODk0MTIyMjk4MX0.png";
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo38833a() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo38834b(PushMessage pushMessage, Act act) {
        Map<String, String> map = pushMessage.messageCustomMap;
        this.f22905n.setEllipsize(TextUtils.TruncateAt.END);
        this.f22904m.setText(map.get("title"));
        this.f22905n.setText(map.get("content"));
        if (!TextUtils.isEmpty(map.get("tag1"))) {
            this.f22896e.setText(map.get("tag1"));
        }
        bnl0.m105524M(this.f22900i, false);
        if (!TextUtils.isEmpty(map.get("subTitle"))) {
            bnl0.m105524M(this.f22900i, true);
            qnp0.m177261d1(this.f22900i, qa00.m175859d(6.0f));
            this.f22903l.setText(map.get("subTitle"));
            String str = map.get("subTitleIcon");
            if (!TextUtils.isEmpty(str)) {
                this.f22902k.setImageUrl(str);
            }
            String str2 = map.get("subTitleBgImage");
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            AutoVDraweeView autoVDraweeView = this.f22901j;
            if (zIsEmpty) {
                autoVDraweeView.setImageResource(dbc0.f86818a9);
            } else {
                autoVDraweeView.setImageUrl(str2);
            }
        }
        if (!TextUtils.isEmpty(map.get("buttonText"))) {
            this.f22906o.setText(map.get("buttonText"));
        }
        if (TextUtils.isEmpty(map.get("bgImg"))) {
            uqb0.f180374G.m127115L0(this.f22895d, this.f22909r);
        } else {
            uqb0.f180374G.m127115L0(this.f22895d, map.get("bgImg"));
        }
        if (!TextUtils.isEmpty(map.get("image"))) {
            bnl0.m105524M(this.f22899h, true);
            this.f22899h.setImageUrl(map.get("image"));
            this.f22899h.setOnClickListener(new View.OnClickListener() { // from class: l.yzs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f202220a.m38836g(view);
                }
            });
            if (!TextUtils.isEmpty(map.get("big_pic_url"))) {
                bnl0.m105524M(this.f22898g, true);
                this.f22898g.loadAnimWithListener(map.get("big_pic_url"), -1, null, true);
            }
        }
        this.f22906o.setOnClickListener(new View.OnClickListener() { // from class: l.zzs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206736a.m38837h(view);
            }
        });
        bnl0.m105509E0(this.f22897f, new View.OnClickListener() { // from class: l.a0t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67747a.m38838i(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m38835f(View view) {
        b0t.m101356a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m38836g(View view) {
        zzm zzmVar;
        b0n b0nVar = this.f22908q;
        if (b0nVar == null || (zzmVar = b0nVar.f67729a) == null) {
            return;
        }
        zzmVar.m222272J();
        this.f22908q.mo38889f();
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorM132171q = gt0.m132171q(this, "translationY", 0.0f, -this.f22894c.getLayoutParams().height);
        animatorM132171q.setDuration(400L);
        return animatorM132171q;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorM132171q = gt0.m132171q(this, "translationY", (-this.f22894c.getLayoutParams().height) - getTranslationY(), 0.0f);
        animatorM132171q.setDuration(400L);
        return animatorM132171q;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m38837h(View view) {
        zzm zzmVar;
        b0n b0nVar = this.f22908q;
        if (b0nVar == null || (zzmVar = b0nVar.f67729a) == null) {
            return;
        }
        zzmVar.m222272J();
        this.f22908q.mo38889f();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m38838i(View view) {
        this.f22990b.call();
    }

    /* JADX INFO: renamed from: j */
    public LiveInternalPushBaseView m38839j(b0n b0nVar) {
        this.f22908q = b0nVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38835f(this);
        bnl0.m105550d0(this, qa00.m175859d(24.0f));
        bnl0.m105552e0(this, qa00.m175859d(24.0f));
        bnl0.m105554f0(this, qa00.m175859d(50.0f));
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8319s(qa00.f156328o);
        this.f22895d.getHierarchy().m207045H(roundingParams);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22907p = motionEvent.getRawY();
        } else if (action == 2 && this.f22907p - motionEvent.getRawY() > f22893s) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f22989a == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if ((action != 1 && action != 3) || this.f22907p - motionEvent.getRawY() <= f22893s) {
            return super.onTouchEvent(motionEvent);
        }
        this.f22989a.call();
        this.f22989a = null;
        return true;
    }

    public LiveInternalBigStyle1VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22909r = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc3MkI0SlNYMzZTUVBFNlpNS1AyT1VYVkNKTzZUSDExIiwidyI6MTQzNiwiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTAwODU2NzkzODk0MTIyMjk4MX0.png";
    }

    public LiveInternalBigStyle1VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22909r = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc3MkI0SlNYMzZTUVBFNlpNS1AyT1VYVkNKTzZUSDExIiwidyI6MTQzNiwiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTAwODU2NzkzODk0MTIyMjk4MX0.png";
    }
}
