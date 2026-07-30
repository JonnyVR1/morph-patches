package com.p046p1.mobile.putong.core.p053ui.growth.fakebyconv;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.fake.C7846b;
import com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p046p1.mobile.putong.core.p053ui.growth.fakebyconv.MsgTabFakeBubbleRoot;
import java.util.ArrayList;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.ark;
import p149l.c4g0;
import p149l.d010;
import p149l.e30;
import p149l.gk90;
import p149l.mkd0;
import p149l.myf;
import p149l.qib0;
import p149l.roj0;
import p149l.xdl0;
import p149l.y26;
import p149l.z26;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class MsgTabFakeBubbleRoot extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f29511a;

    /* JADX INFO: renamed from: b */
    public VImage f29512b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f29513c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f29514d;

    /* JADX INFO: renamed from: e */
    public ImageView f29515e;

    /* JADX INFO: renamed from: f */
    public VText f29516f;

    /* JADX INFO: renamed from: g */
    public VText f29517g;

    /* JADX INFO: renamed from: h */
    public VText f29518h;

    /* JADX INFO: renamed from: i */
    public VText f29519i;

    /* JADX INFO: renamed from: j */
    public c4g0 f29520j;

    public MsgTabFakeBubbleRoot(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m45952a(View view) {
    }

    private Act getAct() {
        return (Act) xdl0.m208328E(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m45959h(View view) {
        d010.m109452a(this, view);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void m45966o() {
        FakeHoldFragment.m36395z4(21862, myf.m157025E(getAct()), new FakeHoldFragment.InterfaceC7844a() { // from class: l.a010
            @Override // com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7844a
            /* JADX INFO: renamed from: a */
            public final void mo36397a(ArrayList arrayList, String str) {
                this.f67003a.m45962k(arrayList, str);
            }
        }).m36396A4(getAct().getSupportFragmentManager());
    }

    /* JADX INFO: renamed from: j */
    public void m45961j() {
        m45968q();
        this.f29520j = getAct().duringCreated((C22306c) C7846b.m36420r().m36434q(), false).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.c010
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78100a.m45963l((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m45962k(ArrayList arrayList, String str) {
        ark.m98433L0(getAct(), arrayList);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m45963l(roj0 roj0Var) {
        m45969r();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m45964m(View view) {
        m45969r();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m45965n(View view) {
        m45966o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f29520j);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45959h(this);
        xdl0.m208362Z(this.f29511a);
        xdl0.m208329E0(this.f29511a, new View.OnClickListener() { // from class: l.wz00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MsgTabFakeBubbleRoot.m45952a(view);
            }
        });
        xdl0.m208329E0(this.f29512b, new View.OnClickListener() { // from class: l.xz00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195148a.m45964m(view);
            }
        });
        xdl0.m208329E0(this.f29519i, new View.OnClickListener() { // from class: l.yz00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200841a.m45965n(view);
            }
        });
        xdl0.m208329E0(this.f29518h, new View.OnClickListener() { // from class: l.zz00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205773a.m45967p(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m45967p(View view) {
        zvf0.m220396r("e_fake_alert_popup_example", "p_fake_alert_popup_view");
        gk90.m126611e(getAct(), CoreModule.f17545c.f19639e0.m169527p9().gender, new Runnable() { // from class: l.b010
            @Override // java.lang.Runnable
            public final void run() {
                this.f72402a.m45966o();
            }
        }, null);
    }

    /* JADX INFO: renamed from: q */
    public void m45968q() {
        qib0.f154691G.m102331L0(this.f29514d, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url);
        z26 z26Var = new z26();
        z26Var.m216874f("请更换真实头像", new y26("请更换真实头像", -872415232));
        this.f29516f.setText(z26Var.m216876h());
        z26 z26Var2 = new z26();
        z26Var2.m216869a("探探是一个真实头像社区，请上传", 1711276032);
        z26Var2.m216874f("本人的、看得清脸的头像，", new y26("本人的、看得清脸的头像，", -872415232));
        z26Var2.m216873e("让缘分快速找到你", 1711276032);
        this.f29517g.setText(z26Var2.m216876h());
    }

    /* JADX INFO: renamed from: r */
    public final void m45969r() {
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        mkd0.m154992z(this.f29520j);
    }

    public MsgTabFakeBubbleRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MsgTabFakeBubbleRoot(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
