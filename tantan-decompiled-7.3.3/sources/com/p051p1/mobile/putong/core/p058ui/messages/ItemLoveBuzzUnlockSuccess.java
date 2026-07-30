package com.p051p1.mobile.putong.core.p058ui.messages;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemLoveBuzzUnlockSuccess;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.d8q;
import p153l.gt0;
import p153l.qzz;
import p153l.uqb0;
import p153l.ux6;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLoveBuzzUnlockSuccess extends LinearLayout {

    /* JADX INFO: renamed from: f */
    public static final InterpolatorC8658a f31963f = new InterpolatorC8658a(0.15f);

    /* JADX INFO: renamed from: a */
    public ItemLoveBuzzUnlockSuccess f31964a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31965b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31966c;

    /* JADX INFO: renamed from: d */
    public VText f31967d;

    /* JADX INFO: renamed from: e */
    public qzz f31968e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemLoveBuzzUnlockSuccess$a */
    public static class InterpolatorC8658a implements Interpolator {

        /* JADX INFO: renamed from: a */
        public float f31969a;

        public InterpolatorC8658a(float f) {
            this.f31969a = f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            double dPow = Math.pow(2.0d, (-10.0f) * f);
            float f2 = this.f31969a;
            return (float) ((dPow * Math.sin((((double) (f - (f2 / 4.0f))) * 6.283185307179586d) / ((double) f2))) + 1.0d);
        }
    }

    public ItemLoveBuzzUnlockSuccess(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m49480c() {
    }

    /* JADX INFO: renamed from: d */
    public final void m49481d(View view) {
        d8q.m114920a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m49482e() {
        bnl0.m105525M0(this.f31965b, true);
        bnl0.m105525M0(this.f31966c, true);
    }

    /* JADX INFO: renamed from: f */
    public final void m49483f() {
        VDraweeView vDraweeView = this.f31965b;
        vDraweeView.setPivotX((vDraweeView.getWidth() / 3) * 2);
        VDraweeView vDraweeView2 = this.f31965b;
        vDraweeView2.setPivotY(vDraweeView2.getHeight() * 2);
        VDraweeView vDraweeView3 = this.f31966c;
        vDraweeView3.setPivotX(vDraweeView3.getWidth() / 3);
        VDraweeView vDraweeView4 = this.f31966c;
        vDraweeView4.setPivotY(vDraweeView4.getHeight() * 2);
        VDraweeView vDraweeView5 = this.f31965b;
        InterpolatorC8658a interpolatorC8658a = f31963f;
        Property property = View.ROTATION;
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(vDraweeView5, property, 0L, 1500L, interpolatorC8658a, -6.0f, 0.0f), gt0.m132166l(this.f31966c, property, 0L, 1500L, interpolatorC8658a, 6.0f, 0.0f));
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.b8q
            @Override // java.lang.Runnable
            public final void run() {
                this.f75464a.m49482e();
            }
        });
        animatorM132180z.start();
        this.f31968e.m178899J1(new x20() { // from class: l.c8q
            @Override // p153l.x20
            public final void call() {
                ItemLoveBuzzUnlockSuccess.m49480c();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m49484g(qzz qzzVar, User user, User user2, Conversation conversation) {
        this.f31968e = qzzVar;
        if (user.isBannedNew() || user.isAccountCancellation()) {
            uqb0.f180374G.m127138Y0(this.f31965b, CoreModule.f18273l.m143412i().mo180398T0());
        } else {
            uqb0.f180374G.m127115L0(this.f31965b, ux6.m198403a(user).profileSmall().formatted());
        }
        if (CoreModule.m30933P().m143406b().mo36108Wr(conversation)) {
            this.f31967d.setText(R$string.f21462B3);
        }
        uqb0.f180374G.m127115L0(this.f31966c, ux6.m198404b(user2).profileSmall().formatted());
        if (qzzVar.m178902L0()) {
            bnl0.m105525M0(this.f31965b, false);
            bnl0.m105525M0(this.f31966c, false);
            this.f31968e.m178981w0();
            post(new Runnable() { // from class: l.a8q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68938a.m49483f();
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49481d(this);
    }

    public ItemLoveBuzzUnlockSuccess(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLoveBuzzUnlockSuccess(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
