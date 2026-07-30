package com.p051p1.mobile.putong.core.p058ui.growth.fakebyconv;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.fake.C7997b;
import com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p051p1.mobile.putong.core.p058ui.growth.fakebyconv.MsgTabFakeBubbleRoot;
import java.util.ArrayList;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.a0g;
import p153l.bnl0;
import p153l.d46;
import p153l.e46;
import p153l.i4g0;
import p153l.kcg0;
import p153l.ks90;
import p153l.n810;
import p153l.psd0;
import p153l.qtk;
import p153l.uqb0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class MsgTabFakeBubbleRoot extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f30359a;

    /* JADX INFO: renamed from: b */
    public VImage f30360b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f30361c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f30362d;

    /* JADX INFO: renamed from: e */
    public ImageView f30363e;

    /* JADX INFO: renamed from: f */
    public VText f30364f;

    /* JADX INFO: renamed from: g */
    public VText f30365g;

    /* JADX INFO: renamed from: h */
    public VText f30366h;

    /* JADX INFO: renamed from: i */
    public VText f30367i;

    /* JADX INFO: renamed from: j */
    public kcg0 f30368j;

    public MsgTabFakeBubbleRoot(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m47135a(View view) {
    }

    private Act getAct() {
        return (Act) bnl0.m105508E(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m47142h(View view) {
        n810.m161890a(this, view);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void m47149o() {
        FakeHoldFragment.m37398z4(21862, a0g.m95349E(getAct()), new FakeHoldFragment.InterfaceC7995a() { // from class: l.k810
            @Override // com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7995a
            /* JADX INFO: renamed from: a */
            public final void mo37400a(ArrayList arrayList, String str) {
                this.f124349a.m47145k(arrayList, str);
            }
        }).m37399A4(getAct().getSupportFragmentManager());
    }

    /* JADX INFO: renamed from: j */
    public void m47144j() {
        m47151q();
        this.f30368j = getAct().duringCreated((C22421c) C7997b.m37423r().m37437q(), false).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.m810
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135143a.m47146l((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m47145k(ArrayList arrayList, String str) {
        qtk.m177983L0(getAct(), arrayList);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m47146l(uxj0 uxj0Var) {
        m47152r();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m47147m(View view) {
        m47152r();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m47148n(View view) {
        m47149o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f30368j);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47142h(this);
        bnl0.m105542Z(this.f30359a);
        bnl0.m105509E0(this.f30359a, new View.OnClickListener() { // from class: l.g810
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MsgTabFakeBubbleRoot.m47135a(view);
            }
        });
        bnl0.m105509E0(this.f30360b, new View.OnClickListener() { // from class: l.h810
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108203a.m47147m(view);
            }
        });
        bnl0.m105509E0(this.f30367i, new View.OnClickListener() { // from class: l.i810
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113318a.m47148n(view);
            }
        });
        bnl0.m105509E0(this.f30366h, new View.OnClickListener() { // from class: l.j810
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118745a.m47150p(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m47150p(View view) {
        i4g0.m138520r("e_fake_alert_popup_example", "p_fake_alert_popup_view");
        ks90.m151153e(getAct(), CoreModule.f18264c.f20381e0.m116600p9().gender, new Runnable() { // from class: l.l810
            @Override // java.lang.Runnable
            public final void run() {
                this.f130406a.m47149o();
            }
        }, null);
    }

    /* JADX INFO: renamed from: q */
    public void m47151q() {
        uqb0.f180374G.m127115L0(this.f30362d, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url);
        e46 e46Var = new e46();
        e46Var.m119384f("请更换真实头像", new d46("请更换真实头像", -872415232));
        this.f30364f.setText(e46Var.m119386h());
        e46 e46Var2 = new e46();
        e46Var2.m119379a("探探是一个真实头像社区，请上传", 1711276032);
        e46Var2.m119384f("本人的、看得清脸的头像，", new d46("本人的、看得清脸的头像，", -872415232));
        e46Var2.m119383e("让缘分快速找到你", 1711276032);
        this.f30365g.setText(e46Var2.m119386h());
    }

    /* JADX INFO: renamed from: r */
    public final void m47152r() {
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        psd0.m173633z(this.f30368j);
    }

    public MsgTabFakeBubbleRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MsgTabFakeBubbleRoot(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
