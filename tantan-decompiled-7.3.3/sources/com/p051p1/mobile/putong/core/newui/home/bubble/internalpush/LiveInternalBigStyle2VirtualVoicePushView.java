package com.p051p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import p151v.AutoVDraweeView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.c0n;
import p153l.dbc0;
import p153l.e0t;
import p153l.gt0;
import p153l.qa00;
import p153l.uqb0;
import p153l.zzm;

/* JADX INFO: loaded from: classes11.dex */
public class LiveInternalBigStyle2VirtualVoicePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: m */
    public static final int f22910m = qa00.f156319f;

    /* JADX INFO: renamed from: c */
    public FrameLayout f22911c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f22912d;

    /* JADX INFO: renamed from: e */
    public VImage f22913e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f22914f;

    /* JADX INFO: renamed from: g */
    public VText f22915g;

    /* JADX INFO: renamed from: h */
    public VText f22916h;

    /* JADX INFO: renamed from: i */
    public VText f22917i;

    /* JADX INFO: renamed from: j */
    public VButton f22918j;

    /* JADX INFO: renamed from: k */
    public float f22919k;

    /* JADX INFO: renamed from: l */
    public c0n f22920l;

    public LiveInternalBigStyle2VirtualVoicePushView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m38842f(View view) {
        this.f22990b.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m38843g(View view) {
        zzm zzmVar;
        c0n c0nVar = this.f22920l;
        if (c0nVar == null || (zzmVar = c0nVar.f67729a) == null) {
            return;
        }
        zzmVar.m222272J();
        this.f22920l.mo38889f();
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo38833a() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo38834b(PushMessage pushMessage, Act act) {
        int i;
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f22917i.setEllipsize(TextUtils.TruncateAt.END);
        this.f22915g.setText(pushMessageCustom.title);
        this.f22917i.setText(pushMessageCustom.content);
        this.f22916h.setText(pushMessageCustom.subTitle);
        String str = pushMessageCustom.state;
        if (str != null) {
            str.getClass();
            switch (str) {
                case "super_like":
                    i = dbc0.f86949e9;
                    break;
                case "friends":
                    i = dbc0.f86884c9;
                    break;
                case "liked":
                    i = dbc0.f86917d9;
                    break;
                case "following":
                    i = dbc0.f86851b9;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 0;
        }
        this.f22916h.setCompoundDrawablePadding(qa00.f156316c);
        this.f22916h.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f22918j.setText(pushMessageCustom.buttonText);
        }
        uqb0.f180374G.m127115L0(this.f22912d, "https://auto.tancdn.com/v1/images/eyJpZCI6IjQyT05ST0FYS1lCUkpEQk83UlM2WVpUTlJNSFlaVDExIiwidyI6MTQzNiwiaCI6NzU2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzMzMjA3Mjk0ODg5MzEyNDE3M30.png");
        if (!TextUtils.isEmpty(pushMessageCustom.image)) {
            this.f22914f.setImageUrl(pushMessageCustom.image);
        }
        bnl0.m105509E0(this.f22913e, new View.OnClickListener() { // from class: l.c0t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79296a.m38842f(view);
            }
        });
        this.f22918j.setOnClickListener(new View.OnClickListener() { // from class: l.d0t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84603a.m38843g(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m38844e(View view) {
        e0t.m118925a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorM132171q = gt0.m132171q(this, "translationY", 0.0f, -this.f22911c.getLayoutParams().height);
        animatorM132171q.setDuration(400L);
        return animatorM132171q;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorM132171q = gt0.m132171q(this, "translationY", (-this.f22911c.getLayoutParams().height) - getTranslationY(), 0.0f);
        animatorM132171q.setDuration(400L);
        return animatorM132171q;
    }

    /* JADX INFO: renamed from: h */
    public LiveInternalPushBaseView m38845h(c0n c0nVar) {
        this.f22920l = c0nVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38844e(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22919k = motionEvent.getRawY();
        } else if (action == 2 && this.f22919k - motionEvent.getRawY() > f22910m) {
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
        if ((action != 1 && action != 3) || this.f22919k - motionEvent.getRawY() <= f22910m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f22989a.call();
        this.f22989a = null;
        return true;
    }

    public LiveInternalBigStyle2VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalBigStyle2VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
