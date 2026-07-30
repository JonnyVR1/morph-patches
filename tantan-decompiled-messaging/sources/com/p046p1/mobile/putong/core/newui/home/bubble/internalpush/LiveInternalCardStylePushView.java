package com.p046p1.mobile.putong.core.newui.home.bubble.internalpush;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p046p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.e30;
import p149l.nvc0;
import p149l.oys;
import p149l.pym;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;
import p149l.zxm;

/* JADX INFO: loaded from: classes11.dex */
public class LiveInternalCardStylePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: m */
    public static final int f22208m = t100.f167257f;

    /* JADX INFO: renamed from: c */
    public FrameLayout f22209c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f22210d;

    /* JADX INFO: renamed from: e */
    public VImage f22211e;

    /* JADX INFO: renamed from: f */
    public LiveHaloAvatar f22212f;

    /* JADX INFO: renamed from: g */
    public VText f22213g;

    /* JADX INFO: renamed from: h */
    public VText f22214h;

    /* JADX INFO: renamed from: i */
    public VButton f22215i;

    /* JADX INFO: renamed from: j */
    public float f22216j;

    /* JADX INFO: renamed from: k */
    public pym f22217k;

    /* JADX INFO: renamed from: l */
    public String f22218l;

    public LiveInternalCardStylePushView(@NonNull Context context) {
        super(context);
        this.f22218l = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZCVzNXMklTQklLU0ZIMzNNNkxIWDcyN09GQVlIQTE0IiwidyI6MTA3NywiaCI6NjQ4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ0OTU5NjEzMDA1OTg3OTY4fQ.png";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m37859i(View view) {
        zxm zxmVar;
        pym pymVar = this.f22217k;
        if (pymVar == null || (zxmVar = pymVar.f72298a) == null) {
            return;
        }
        zxmVar.m220844J();
        this.f22217k.mo37886f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m37860j(View view) {
        zxm zxmVar;
        pym pymVar = this.f22217k;
        if (pymVar == null || (zxmVar = pymVar.f72298a) == null) {
            return;
        }
        zxmVar.m220844J();
        this.f22217k.mo37886f();
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo37830a() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo37831b(PushMessage pushMessage, Act act) {
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f22214h.setEllipsize(TextUtils.TruncateAt.END);
        this.f22213g.setText(pushMessageCustom.title);
        this.f22214h.setText(pushMessageCustom.content);
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f22215i.setText(pushMessageCustom.buttonText);
        }
        qib0.f154691G.m102331L0(this.f22210d, this.f22218l);
        if (!TextUtils.isEmpty(pushMessageCustom.image)) {
            xdl0.m208344M(this.f22212f, true);
            this.f22212f.setHaloZoomRatio(1.6f);
            qib0.f154691G.m102318F(qib0.f154691G.m184724n(pushMessageCustom.image).m8607O(new nvc0(this.f22212f.getAvatarSize(), this.f22212f.getAvatarSize())).m8614a(), new e30() { // from class: l.kys
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f125333a.m37862h((Bitmap) obj);
                }
            });
        }
        this.f22215i.setOnClickListener(new View.OnClickListener() { // from class: l.lys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130600a.m37859i(view);
            }
        });
        this.f22212f.setOnClickListener(new View.OnClickListener() { // from class: l.mys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136325a.m37860j(view);
            }
        });
        xdl0.m208329E0(this.f22211e, new View.OnClickListener() { // from class: l.nys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141154a.m37863k(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m37861g(View view) {
        oys.m166694a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorM103744q = bt0.m103744q(this, "translationY", 0.0f, -this.f22209c.getLayoutParams().height);
        animatorM103744q.setDuration(400L);
        return animatorM103744q;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorM103744q = bt0.m103744q(this, "translationY", (-this.f22209c.getLayoutParams().height) - getTranslationY(), 0.0f);
        animatorM103744q.setDuration(400L);
        return animatorM103744q;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m37862h(Bitmap bitmap) {
        this.f22212f.setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m37863k(View view) {
        this.f22248b.call();
    }

    /* JADX INFO: renamed from: l */
    public LiveInternalPushBaseView m37864l(pym pymVar) {
        this.f22217k = pymVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37861g(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22216j = motionEvent.getRawY();
        } else if (action == 2 && this.f22216j - motionEvent.getRawY() > f22208m) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f22247a == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if ((action != 1 && action != 3) || this.f22216j - motionEvent.getRawY() <= f22208m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f22247a.call();
        this.f22247a = null;
        return true;
    }

    public LiveInternalCardStylePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22218l = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZCVzNXMklTQklLU0ZIMzNNNkxIWDcyN09GQVlIQTE0IiwidyI6MTA3NywiaCI6NjQ4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ0OTU5NjEzMDA1OTg3OTY4fQ.png";
    }

    public LiveInternalCardStylePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22218l = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZCVzNXMklTQklLU0ZIMzNNNkxIWDcyN09GQVlIQTE0IiwidyI6MTA3NywiaCI6NjQ4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ0OTU5NjEzMDA1OTg3OTY4fQ.png";
    }
}
