package com.p000p1.mobile.putong.core.p001ui.growth.fakebyconv;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.growth.fakebyconv.MsgTabFakeBubbleRoot;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p1.mobile.putong.core.newui.fake.b;
import com.p1.mobile.putong.data.Media;
import java.util.ArrayList;
import l.c4g0;
import l.e30;
import l.mkd0;
import l.myf;
import l.qib0;
import l.roj0;
import l.xdl0;
import l.y26;
import l.z26;
import l.zvf0;
import p003l.ark;
import p003l.d010;
import p003l.gk90;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MsgTabFakeBubbleRoot extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f1905a;

    /* JADX INFO: renamed from: b */
    public VImage f1906b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f1907c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f1908d;

    /* JADX INFO: renamed from: e */
    public ImageView f1909e;

    /* JADX INFO: renamed from: f */
    public VText f1910f;

    /* JADX INFO: renamed from: g */
    public VText f1911g;

    /* JADX INFO: renamed from: h */
    public VText f1912h;

    /* JADX INFO: renamed from: i */
    public VText f1913i;

    /* JADX INFO: renamed from: j */
    public c4g0 f1914j;

    public MsgTabFakeBubbleRoot(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3305a(View view) {
    }

    private Act getAct() {
        return xdl0.E(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m3312h(View view) {
        d010.m6029a(this, view);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void m3319o() {
        FakeHoldFragment.z4(21862, myf.E(getAct()), new FakeHoldFragment.a() { // from class: l.a010
            /* JADX INFO: renamed from: a */
            public final void m5266a(ArrayList arrayList, String str) {
                this.f2659a.m3315k(arrayList, str);
            }
        }).A4(getAct().getSupportFragmentManager());
    }

    /* JADX INFO: renamed from: j */
    public void m3314j() {
        m3321q();
        this.f1914j = getAct().duringCreated(b.r().q(), false).take(1).subscribe(mkd0.G(new e30() { // from class: l.c010
            public final void call(Object obj) {
                this.f3493a.m3316l((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m3315k(ArrayList arrayList, String str) {
        ark.m5540L0(getAct(), arrayList);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m3316l(roj0 roj0Var) {
        m3322r();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m3317m(View view) {
        m3322r();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m3318n(View view) {
        m3319o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.z(this.f1914j);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3312h(this);
        xdl0.Z(new View[]{this.f1905a});
        xdl0.E0(this.f1905a, new View.OnClickListener() { // from class: l.wz00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MsgTabFakeBubbleRoot.m3305a(view);
            }
        });
        xdl0.E0(this.f1906b, new View.OnClickListener() { // from class: l.xz00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8617a.m3317m(view);
            }
        });
        xdl0.E0(this.f1913i, new View.OnClickListener() { // from class: l.yz00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9154a.m3318n(view);
            }
        });
        xdl0.E0(this.f1912h, new View.OnClickListener() { // from class: l.zz00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9341a.m3320p(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m3320p(View view) {
        zvf0.r("e_fake_alert_popup_example", "p_fake_alert_popup_view");
        gk90.m6717e(getAct(), CoreModule.c.e0.p9().gender, new Runnable() { // from class: l.b010
            @Override // java.lang.Runnable
            public final void run() {
                this.f2908a.m3319o();
            }
        }, null);
    }

    /* JADX INFO: renamed from: q */
    public void m3321q() {
        qib0.G.L0(this.f1908d, ((Media) CoreModule.c.e0.p9().fp()).url);
        z26 z26Var = new z26();
        z26Var.f("请更换真实头像", new y26("请更换真实头像", -872415232));
        this.f1910f.setText(z26Var.h());
        z26 z26Var2 = new z26();
        z26Var2.a("探探是一个真实头像社区，请上传", 1711276032);
        z26Var2.f("本人的、看得清脸的头像，", new y26("本人的、看得清脸的头像，", -872415232));
        z26Var2.e("让缘分快速找到你", 1711276032);
        this.f1911g.setText(z26Var2.h());
    }

    /* JADX INFO: renamed from: r */
    public final void m3322r() {
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        mkd0.z(this.f1914j);
    }

    public MsgTabFakeBubbleRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MsgTabFakeBubbleRoot(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
