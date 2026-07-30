package com.p051p1.mobile.putong.core.p058ui.messages;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.messages.NewOnlineMatchSuccessItem;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.a840;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gt0;
import p153l.gta;
import p153l.qzz;
import p153l.uqb0;
import p153l.ux6;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class NewOnlineMatchSuccessItem extends LinearLayout {

    /* JADX INFO: renamed from: j */
    public static final ItemCountdownLikeSuccess.InterpolatorC8650a f32516j = new ItemCountdownLikeSuccess.InterpolatorC8650a(0.15f);

    /* JADX INFO: renamed from: a */
    public NewOnlineMatchSuccessItem f32517a;

    /* JADX INFO: renamed from: b */
    public VFrame f32518b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f32519c;

    /* JADX INFO: renamed from: d */
    public VFrame f32520d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f32521e;

    /* JADX INFO: renamed from: f */
    public TextView f32522f;

    /* JADX INFO: renamed from: g */
    public TextView f32523g;

    /* JADX INFO: renamed from: h */
    public qzz f32524h;

    /* JADX INFO: renamed from: i */
    public int f32525i;

    public NewOnlineMatchSuccessItem(Context context) {
        super(context);
        this.f32525i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m50168a() {
    }

    /* JADX INFO: renamed from: d */
    public final void m50171d(View view) {
        a840.m96413a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m50172e() {
        bnl0.m105525M0(this.f32519c, true);
        bnl0.m105525M0(this.f32521e, true);
    }

    /* JADX INFO: renamed from: f */
    public final void m50173f() {
        VFrame vFrame = this.f32518b;
        vFrame.setPivotX((vFrame.getWidth() / 3) * 2);
        VFrame vFrame2 = this.f32518b;
        vFrame2.setPivotY(vFrame2.getHeight() * 2);
        VFrame vFrame3 = this.f32520d;
        vFrame3.setPivotX(vFrame3.getWidth() / 3);
        VFrame vFrame4 = this.f32520d;
        vFrame4.setPivotY(vFrame4.getHeight() * 2);
        VFrame vFrame5 = this.f32518b;
        long j = this.f32525i;
        ItemCountdownLikeSuccess.InterpolatorC8650a interpolatorC8650a = f32516j;
        Property property = View.ROTATION;
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(vFrame5, property, 0L, j, interpolatorC8650a, -6.0f, 0.0f), gt0.m132166l(this.f32520d, property, 0L, this.f32525i, interpolatorC8650a, 6.0f, 0.0f));
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.y740
            @Override // java.lang.Runnable
            public final void run() {
                this.f197740a.m50172e();
            }
        });
        animatorM132180z.start();
        this.f32524h.m178899J1(new x20() { // from class: l.z740
            @Override // p153l.x20
            public final void call() {
                NewOnlineMatchSuccessItem.m50168a();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m50174g(qzz qzzVar, User user, User user2) {
        this.f32524h = qzzVar;
        if (user.isBannedNew() || user.isAccountCancellation()) {
            uqb0.f180374G.m127138Y0(this.f32519c, CoreModule.m30933P().m143412i().mo180398T0());
        } else {
            uqb0.f180374G.m127115L0(this.f32519c, ux6.m198403a(user).profileSmall().formatted());
        }
        uqb0.f180374G.m127115L0(this.f32521e, ux6.m198404b(user2).profileSmall().formatted());
        if (qzzVar.m178902L0()) {
            bnl0.m105525M0(this.f32519c, false);
            bnl0.m105525M0(this.f32521e, false);
            post(new Runnable() { // from class: l.x740
                @Override // java.lang.Runnable
                public final void run() {
                    this.f192669a.m50173f();
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50171d(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32522f.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32523g.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public NewOnlineMatchSuccessItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32525i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }

    public NewOnlineMatchSuccessItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32525i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }
}
