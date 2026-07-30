package com.p046p1.mobile.putong.core.p053ui.messages;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemLoveBuzzUnlockSuccess;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bt0;
import p149l.d30;
import p149l.d6q;
import p149l.qib0;
import p149l.rw6;
import p149l.tqz;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLoveBuzzUnlockSuccess extends LinearLayout {

    /* JADX INFO: renamed from: f */
    public static final InterpolatorC8495a f31115f = new InterpolatorC8495a(0.15f);

    /* JADX INFO: renamed from: a */
    public ItemLoveBuzzUnlockSuccess f31116a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31117b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31118c;

    /* JADX INFO: renamed from: d */
    public VText f31119d;

    /* JADX INFO: renamed from: e */
    public tqz f31120e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemLoveBuzzUnlockSuccess$a */
    public static class InterpolatorC8495a implements Interpolator {

        /* JADX INFO: renamed from: a */
        public float f31121a;

        public InterpolatorC8495a(float f) {
            this.f31121a = f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            double dPow = Math.pow(2.0d, (-10.0f) * f);
            float f2 = this.f31121a;
            return (float) ((dPow * Math.sin((((double) (f - (f2 / 4.0f))) * 6.283185307179586d) / ((double) f2))) + 1.0d);
        }
    }

    public ItemLoveBuzzUnlockSuccess(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m48297c() {
    }

    /* JADX INFO: renamed from: d */
    public final void m48298d(View view) {
        d6q.m110188a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m48299e() {
        xdl0.m208345M0(this.f31117b, true);
        xdl0.m208345M0(this.f31118c, true);
    }

    /* JADX INFO: renamed from: f */
    public final void m48300f() {
        VDraweeView vDraweeView = this.f31117b;
        vDraweeView.setPivotX((vDraweeView.getWidth() / 3) * 2);
        VDraweeView vDraweeView2 = this.f31117b;
        vDraweeView2.setPivotY(vDraweeView2.getHeight() * 2);
        VDraweeView vDraweeView3 = this.f31118c;
        vDraweeView3.setPivotX(vDraweeView3.getWidth() / 3);
        VDraweeView vDraweeView4 = this.f31118c;
        vDraweeView4.setPivotY(vDraweeView4.getHeight() * 2);
        VDraweeView vDraweeView5 = this.f31117b;
        InterpolatorC8495a interpolatorC8495a = f31115f;
        Property property = View.ROTATION;
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(vDraweeView5, property, 0L, 1500L, interpolatorC8495a, -6.0f, 0.0f), bt0.m103739l(this.f31118c, property, 0L, 1500L, interpolatorC8495a, 6.0f, 0.0f));
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.b6q
            @Override // java.lang.Runnable
            public final void run() {
                this.f73867a.m48299e();
            }
        });
        animatorM103753z.start();
        this.f31120e.m190258J1(new d30() { // from class: l.c6q
            @Override // p149l.d30
            public final void call() {
                ItemLoveBuzzUnlockSuccess.m48297c();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m48301g(tqz tqzVar, User user, User user2, Conversation conversation) {
        this.f31120e = tqzVar;
        if (user.isBannedNew() || user.isAccountCancellation()) {
            qib0.f154691G.m102354Y0(this.f31117b, CoreModule.f17554l.m94658i().mo158306T0());
        } else {
            qib0.f154691G.m102331L0(this.f31117b, rw6.m181385a(user).profileSmall().formatted());
        }
        if (CoreModule.m29935P().m94652b().mo35105Wr(conversation)) {
            this.f31119d.setText(R$string.f20720B3);
        }
        qib0.f154691G.m102331L0(this.f31118c, rw6.m181386b(user2).profileSmall().formatted());
        if (tqzVar.m190261L0()) {
            xdl0.m208345M0(this.f31117b, false);
            xdl0.m208345M0(this.f31118c, false);
            this.f31120e.m190336w0();
            post(new Runnable() { // from class: l.a6q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67790a.m48300f();
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48298d(this);
    }

    public ItemLoveBuzzUnlockSuccess(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLoveBuzzUnlockSuccess(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
