package com.p000p1.mobile.putong.core.newui.home.bubble.internalpush;

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
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p000p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageCustom;
import l.bt0;
import l.e30;
import l.nvc0;
import l.oys;
import l.qib0;
import l.t100;
import l.xdl0;
import p009l.pym;
import p009l.zxm;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LiveInternalCardStylePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: m */
    public static final int f986m = t100.f;

    /* JADX INFO: renamed from: c */
    public FrameLayout f987c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f988d;

    /* JADX INFO: renamed from: e */
    public VImage f989e;

    /* JADX INFO: renamed from: f */
    public LiveHaloAvatar f990f;

    /* JADX INFO: renamed from: g */
    public VText f991g;

    /* JADX INFO: renamed from: h */
    public VText f992h;

    /* JADX INFO: renamed from: i */
    public VButton f993i;

    /* JADX INFO: renamed from: j */
    public float f994j;

    /* JADX INFO: renamed from: k */
    public pym f995k;

    /* JADX INFO: renamed from: l */
    public String f996l;

    public LiveInternalCardStylePushView(@NonNull Context context) {
        super(context);
        this.f996l = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZCVzNXMklTQklLU0ZIMzNNNkxIWDcyN09GQVlIQTE0IiwidyI6MTA3NywiaCI6NjQ4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ0OTU5NjEzMDA1OTg3OTY4fQ.png";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m1830i(View view) {
        zxm zxmVar;
        pym pymVar = this.f995k;
        if (pymVar == null || (zxmVar = pymVar.f9776a) == null) {
            return;
        }
        zxmVar.m26111J();
        this.f995k.mo1857f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m1831j(View view) {
        zxm zxmVar;
        pym pymVar = this.f995k;
        if (pymVar == null || (zxmVar = pymVar.f9776a) == null) {
            return;
        }
        zxmVar.m26111J();
        this.f995k.mo1857f();
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo1801a() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo1802b(PushMessage pushMessage, Act act) {
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f992h.setEllipsize(TextUtils.TruncateAt.END);
        this.f991g.setText(pushMessageCustom.title);
        this.f992h.setText(pushMessageCustom.content);
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f993i.setText(pushMessageCustom.buttonText);
        }
        qib0.G.L0(this.f988d, this.f996l);
        if (!TextUtils.isEmpty(pushMessageCustom.image)) {
            xdl0.M(this.f990f, true);
            this.f990f.setHaloZoomRatio(1.6f);
            qib0.G.F(qib0.G.n(pushMessageCustom.image).O(new nvc0(this.f990f.getAvatarSize(), this.f990f.getAvatarSize())).a(), new e30() { // from class: l.kys
                public final void call(Object obj) {
                    this.f15884a.m1833h((Bitmap) obj);
                }
            });
        }
        this.f993i.setOnClickListener(new View.OnClickListener() { // from class: l.lys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16450a.m1830i(view);
            }
        });
        this.f990f.setOnClickListener(new View.OnClickListener() { // from class: l.mys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17158a.m1831j(view);
            }
        });
        xdl0.E0(this.f989e, new View.OnClickListener() { // from class: l.nys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17770a.m1834k(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m1832g(View view) {
        oys.a(this, view);
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorQ = bt0.q(this, "translationY", new float[]{0.0f, -this.f987c.getLayoutParams().height});
        animatorQ.setDuration(400L);
        return animatorQ;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorQ = bt0.q(this, "translationY", new float[]{(-this.f987c.getLayoutParams().height) - getTranslationY(), 0.0f});
        animatorQ.setDuration(400L);
        return animatorQ;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m1833h(Bitmap bitmap) {
        this.f990f.setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m1834k(View view) {
        this.f1026b.call();
    }

    /* JADX INFO: renamed from: l */
    public LiveInternalPushBaseView m1835l(pym pymVar) {
        this.f995k = pymVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1832g(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f994j = motionEvent.getRawY();
        } else if (action == 2 && this.f994j - motionEvent.getRawY() > f986m) {
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
        if ((action != 1 && action != 3) || this.f994j - motionEvent.getRawY() <= f986m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1025a.call();
        this.f1025a = null;
        return true;
    }

    public LiveInternalCardStylePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f996l = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZCVzNXMklTQklLU0ZIMzNNNkxIWDcyN09GQVlIQTE0IiwidyI6MTA3NywiaCI6NjQ4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ0OTU5NjEzMDA1OTg3OTY4fQ.png";
    }

    public LiveInternalCardStylePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f996l = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZCVzNXMklTQklLU0ZIMzNNNkxIWDcyN09GQVlIQTE0IiwidyI6MTA3NywiaCI6NjQ4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ0OTU5NjEzMDA1OTg3OTY4fQ.png";
    }
}
