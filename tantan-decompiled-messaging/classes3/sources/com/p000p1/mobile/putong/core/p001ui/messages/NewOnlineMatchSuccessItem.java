package com.p000p1.mobile.putong.core.p001ui.messages;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.NewOnlineMatchSuccessItem;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import l.a1c0;
import l.bt0;
import l.mz30;
import l.qib0;
import l.rw6;
import l.ura;
import l.xdl0;
import p003l.d30;
import p003l.tqz;
import p028v.VDraweeView;
import p028v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NewOnlineMatchSuccessItem extends LinearLayout {

    /* JADX INFO: renamed from: j */
    public static final ItemCountdownLikeSuccess.InterpolatorC0070a f1559j = new ItemCountdownLikeSuccess.InterpolatorC0070a(0.15f);

    /* JADX INFO: renamed from: a */
    public NewOnlineMatchSuccessItem f1560a;

    /* JADX INFO: renamed from: b */
    public VFrame f1561b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1562c;

    /* JADX INFO: renamed from: d */
    public VFrame f1563d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f1564e;

    /* JADX INFO: renamed from: f */
    public TextView f1565f;

    /* JADX INFO: renamed from: g */
    public TextView f1566g;

    /* JADX INFO: renamed from: h */
    public tqz f1567h;

    /* JADX INFO: renamed from: i */
    public int f1568i;

    public NewOnlineMatchSuccessItem(Context context) {
        super(context);
        this.f1568i = 1500;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2081a() {
    }

    /* JADX INFO: renamed from: d */
    public final void m2084d(View view) {
        mz30.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m2085e() {
        xdl0.M0(this.f1562c, true);
        xdl0.M0(this.f1564e, true);
    }

    /* JADX INFO: renamed from: f */
    public final void m2086f() {
        VFrame vFrame = this.f1561b;
        vFrame.setPivotX((vFrame.getWidth() / 3) * 2);
        VFrame vFrame2 = this.f1561b;
        vFrame2.setPivotY(vFrame2.getHeight() * 2);
        VFrame vFrame3 = this.f1563d;
        vFrame3.setPivotX(vFrame3.getWidth() / 3);
        VFrame vFrame4 = this.f1563d;
        vFrame4.setPivotY(vFrame4.getHeight() * 2);
        VFrame vFrame5 = this.f1561b;
        long j = this.f1568i;
        ItemCountdownLikeSuccess.InterpolatorC0070a interpolatorC0070a = f1559j;
        Property property = View.ROTATION;
        Animator animatorZ = bt0.z(new Animator[]{bt0.l(vFrame5, property, 0L, j, interpolatorC0070a, new float[]{-6.0f, 0.0f}), bt0.l(this.f1563d, property, 0L, this.f1568i, interpolatorC0070a, new float[]{6.0f, 0.0f})});
        bt0.v(animatorZ, new Runnable() { // from class: l.kz30
            @Override // java.lang.Runnable
            public final void run() {
                this.f5141a.m2085e();
            }
        });
        animatorZ.start();
        this.f1567h.m7883J1(new d30() { // from class: l.lz30
            @Override // p003l.d30
            public final void call() {
                NewOnlineMatchSuccessItem.m2081a();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m2087g(tqz tqzVar, User user, User user2) {
        this.f1567h = tqzVar;
        if (user.isBannedNew() || user.isAccountCancellation()) {
            qib0.G.Y0(this.f1562c, CoreModule.P().i().T0());
        } else {
            qib0.G.L0(this.f1562c, rw6.a(user).profileSmall().formatted());
        }
        qib0.G.L0(this.f1564e, rw6.b(user2).profileSmall().formatted());
        if (tqzVar.m7886L0()) {
            xdl0.M0(this.f1562c, false);
            xdl0.M0(this.f1564e, false);
            post(new Runnable() { // from class: l.jz30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4765a.m2086f();
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2084d(this);
        if (ura.e().d().I4()) {
            this.f1565f.setTextColor(getResources().getColor(a1c0.g));
            this.f1566g.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public NewOnlineMatchSuccessItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1568i = 1500;
    }

    public NewOnlineMatchSuccessItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1568i = 1500;
    }
}
