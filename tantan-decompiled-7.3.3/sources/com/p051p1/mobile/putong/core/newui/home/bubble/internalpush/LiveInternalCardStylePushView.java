package com.p051p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p051p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.p0n;
import p153l.p0t;
import p153l.q3d0;
import p153l.qa00;
import p153l.uqb0;
import p153l.y20;
import p153l.zzm;

/* JADX INFO: loaded from: classes11.dex */
public class LiveInternalCardStylePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: m */
    public static final int f22950m = qa00.f156319f;

    /* JADX INFO: renamed from: c */
    public FrameLayout f22951c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f22952d;

    /* JADX INFO: renamed from: e */
    public VImage f22953e;

    /* JADX INFO: renamed from: f */
    public LiveHaloAvatar f22954f;

    /* JADX INFO: renamed from: g */
    public VText f22955g;

    /* JADX INFO: renamed from: h */
    public VText f22956h;

    /* JADX INFO: renamed from: i */
    public VButton f22957i;

    /* JADX INFO: renamed from: j */
    public float f22958j;

    /* JADX INFO: renamed from: k */
    public p0n f22959k;

    /* JADX INFO: renamed from: l */
    public String f22960l;

    public LiveInternalCardStylePushView(@NonNull Context context) {
        super(context);
        this.f22960l = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZCVzNXMklTQklLU0ZIMzNNNkxIWDcyN09GQVlIQTE0IiwidyI6MTA3NywiaCI6NjQ4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ0OTU5NjEzMDA1OTg3OTY4fQ.png";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m38862i(View view) {
        zzm zzmVar;
        p0n p0nVar = this.f22959k;
        if (p0nVar == null || (zzmVar = p0nVar.f67729a) == null) {
            return;
        }
        zzmVar.m222272J();
        this.f22959k.mo38889f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m38863j(View view) {
        zzm zzmVar;
        p0n p0nVar = this.f22959k;
        if (p0nVar == null || (zzmVar = p0nVar.f67729a) == null) {
            return;
        }
        zzmVar.m222272J();
        this.f22959k.mo38889f();
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo38833a() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo38834b(PushMessage pushMessage, Act act) {
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f22956h.setEllipsize(TextUtils.TruncateAt.END);
        this.f22955g.setText(pushMessageCustom.title);
        this.f22956h.setText(pushMessageCustom.content);
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f22957i.setText(pushMessageCustom.buttonText);
        }
        uqb0.f180374G.m127115L0(this.f22952d, this.f22960l);
        if (!TextUtils.isEmpty(pushMessageCustom.image)) {
            bnl0.m105524M(this.f22954f, true);
            this.f22954f.setHaloZoomRatio(1.6f);
            uqb0.f180374G.m127102F(uqb0.f180374G.m98797n(pushMessageCustom.image).m8661O(new q3d0(this.f22954f.getAvatarSize(), this.f22954f.getAvatarSize())).m8668a(), new y20() { // from class: l.l0t
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f129588a.m38865h((Bitmap) obj);
                }
            });
        }
        this.f22957i.setOnClickListener(new View.OnClickListener() { // from class: l.m0t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134333a.m38862i(view);
            }
        });
        this.f22954f.setOnClickListener(new View.OnClickListener() { // from class: l.n0t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139666a.m38863j(view);
            }
        });
        bnl0.m105509E0(this.f22953e, new View.OnClickListener() { // from class: l.o0t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144574a.m38866k(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m38864g(View view) {
        p0t.m170180a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorM132171q = gt0.m132171q(this, "translationY", 0.0f, -this.f22951c.getLayoutParams().height);
        animatorM132171q.setDuration(400L);
        return animatorM132171q;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorM132171q = gt0.m132171q(this, "translationY", (-this.f22951c.getLayoutParams().height) - getTranslationY(), 0.0f);
        animatorM132171q.setDuration(400L);
        return animatorM132171q;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m38865h(Bitmap bitmap) {
        this.f22954f.setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m38866k(View view) {
        this.f22990b.call();
    }

    /* JADX INFO: renamed from: l */
    public LiveInternalPushBaseView m38867l(p0n p0nVar) {
        this.f22959k = p0nVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38864g(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22958j = motionEvent.getRawY();
        } else if (action == 2 && this.f22958j - motionEvent.getRawY() > f22950m) {
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
        if ((action != 1 && action != 3) || this.f22958j - motionEvent.getRawY() <= f22950m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f22989a.call();
        this.f22989a = null;
        return true;
    }

    public LiveInternalCardStylePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22960l = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZCVzNXMklTQklLU0ZIMzNNNkxIWDcyN09GQVlIQTE0IiwidyI6MTA3NywiaCI6NjQ4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ0OTU5NjEzMDA1OTg3OTY4fQ.png";
    }

    public LiveInternalCardStylePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22960l = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZCVzNXMklTQklLU0ZIMzNNNkxIWDcyN09GQVlIQTE0IiwidyI6MTA3NywiaCI6NjQ4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ0OTU5NjEzMDA1OTg3OTY4fQ.png";
    }
}
