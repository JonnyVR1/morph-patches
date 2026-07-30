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
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import p151v.AutoVDraweeView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.a0n;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gt0;
import p153l.k0t;
import p153l.qa00;
import p153l.uqb0;
import p153l.zzm;

/* JADX INFO: loaded from: classes11.dex */
public class LiveInternalBigStyle4VirtualVoicePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: m */
    public static final int f22939m = qa00.f156319f;

    /* JADX INFO: renamed from: c */
    public FrameLayout f22940c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f22941d;

    /* JADX INFO: renamed from: e */
    public VImage f22942e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f22943f;

    /* JADX INFO: renamed from: g */
    public VText f22944g;

    /* JADX INFO: renamed from: h */
    public VText f22945h;

    /* JADX INFO: renamed from: i */
    public VText f22946i;

    /* JADX INFO: renamed from: j */
    public VButton f22947j;

    /* JADX INFO: renamed from: k */
    public float f22948k;

    /* JADX INFO: renamed from: l */
    public a0n f22949l;

    public LiveInternalBigStyle4VirtualVoicePushView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m38854f(View view) {
        this.f22990b.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m38855g(View view) {
        zzm zzmVar;
        a0n a0nVar = this.f22949l;
        if (a0nVar == null || (zzmVar = a0nVar.f67729a) == null) {
            return;
        }
        zzmVar.m222272J();
        this.f22949l.mo38889f();
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo38833a() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo38834b(PushMessage pushMessage, Act act) {
        int i;
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f22946i.setEllipsize(TextUtils.TruncateAt.END);
        this.f22944g.setText(pushMessageCustom.title);
        this.f22946i.setText(pushMessageCustom.content);
        boolean zIsEmpty = TextUtils.isEmpty(pushMessageCustom.subTitle);
        VText vText = this.f22945h;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
        } else {
            byte b = 1;
            bnl0.m105524M(vText, true);
            this.f22945h.setText(pushMessageCustom.subTitle);
            String str = pushMessageCustom.state;
            if (str != null) {
                str.getClass();
                switch (str.hashCode()) {
                    case -1718391333:
                        b = !str.equals("super_like") ? (byte) -1 : (byte) 0;
                        break;
                    case -600094315:
                        if (!str.equals("friends")) {
                            b = -1;
                        }
                        break;
                    case 102974381:
                        b = !str.equals("liked") ? (byte) -1 : (byte) 2;
                        break;
                    case 765915793:
                        b = !str.equals(FollowshipStatus.following) ? (byte) -1 : (byte) 3;
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        i = dbc0.f86949e9;
                        break;
                    case 1:
                        i = dbc0.f86884c9;
                        break;
                    case 2:
                        i = dbc0.f86917d9;
                        break;
                    case 3:
                        i = dbc0.f86851b9;
                        break;
                    default:
                        i = 0;
                        break;
                }
            } else {
                i = 0;
            }
            this.f22945h.setCompoundDrawablePadding(qa00.f156316c);
            this.f22945h.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        }
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f22947j.setText(pushMessageCustom.buttonText);
        }
        uqb0.f180374G.m127115L0(this.f22941d, "https://static.tancdn.com/pe-webplatform/N_ecHA8oYXuERuDq5O45dXsa.webp");
        if (!TextUtils.isEmpty(pushMessageCustom.image)) {
            this.f22943f.setImageUrl(pushMessageCustom.image);
        }
        bnl0.m105509E0(this.f22942e, new View.OnClickListener() { // from class: l.i0t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112450a.m38854f(view);
            }
        });
        this.f22947j.setOnClickListener(new View.OnClickListener() { // from class: l.j0t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117849a.m38855g(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m38856e(View view) {
        k0t.m147837a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorM132171q = gt0.m132171q(this, "translationY", 0.0f, -this.f22940c.getLayoutParams().height);
        animatorM132171q.setDuration(400L);
        return animatorM132171q;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorM132171q = gt0.m132171q(this, "translationY", (-this.f22940c.getLayoutParams().height) - getTranslationY(), 0.0f);
        animatorM132171q.setDuration(400L);
        return animatorM132171q;
    }

    /* JADX INFO: renamed from: h */
    public LiveInternalPushBaseView m38857h(a0n<?> a0nVar) {
        this.f22949l = a0nVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38856e(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22948k = motionEvent.getRawY();
        } else if (action == 2 && this.f22948k - motionEvent.getRawY() > f22939m) {
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
        if ((action != 1 && action != 3) || this.f22948k - motionEvent.getRawY() <= f22939m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f22989a.call();
        this.f22989a = null;
        return true;
    }

    public LiveInternalBigStyle4VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalBigStyle4VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
