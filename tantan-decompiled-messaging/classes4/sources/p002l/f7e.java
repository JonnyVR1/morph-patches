package p002l;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import java.util.concurrent.atomic.AtomicInteger;
import l.bt0;
import l.hxs;
import l.ngm;
import l.s7m;
import l.t100;
import l.xdl0;
import l.ym2;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class f7e implements s7m<a7e> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f10165a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f10166b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f10167c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f10168d;

    /* JADX INFO: renamed from: e */
    public a7e f10169e;

    /* JADX INFO: renamed from: f */
    public Animator f10170f;

    /* JADX INFO: renamed from: g */
    public Animator f10171g;

    /* JADX INFO: renamed from: h */
    public bql f10172h;

    /* JADX INFO: renamed from: i */
    public boolean f10173i = false;

    /* JADX INFO: renamed from: l.f7e$a */
    public class C0558a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicInteger f10174a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LongLinkLiveDownBox.LiveAccessChannel f10175b;

        public C0558a(AtomicInteger atomicInteger, LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
            this.f10174a = atomicInteger;
            this.f10175b = liveAccessChannel;
        }

        /* JADX INFO: renamed from: h */
        public void m12988h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            this.f10174a.incrementAndGet();
            if (this.f10174a.get() == 2) {
                f7e.this.m12983p(this.f10175b);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12974C0() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View m12975f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g7e.m13649b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m12977i1(a7e a7eVar) {
        this.f10169e = a7eVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m12978j() {
        if (this.f10169e.w2() != null) {
            this.f10169e.w2().C2(this.f10169e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m12980l(final LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel, View view) {
        if (this.f10169e == null) {
            return;
        }
        Animator animatorMo10552b = this.f10172h.mo10552b();
        this.f10171g = animatorMo10552b;
        if (animatorMo10552b != null) {
            Animator animator = this.f10170f;
            if (animator != null) {
                animator.pause();
            }
            this.f10171g.start();
            bt0.f(this.f10171g, new Runnable() { // from class: l.e7e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9611a.m12979k(liveAccessChannel);
                }
            });
        } else {
            m12979k(liveAccessChannel);
        }
        k6e.m16501a(this.f10169e.mo21430R2(), this.f10169e.m25547E2(), liveAccessChannel.getSource());
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m12981m(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        C0558a c0558a = new C0558a(new AtomicInteger(), liveAccessChannel);
        hxs.w("context_livingAct", this.f10167c, liveAccessChannel.getOuterIcon(), c0558a);
        hxs.w("context_livingAct", this.f10166b, liveAccessChannel.getInnerIcon(), c0558a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [l.ho2] */
    /* JADX INFO: renamed from: p */
    public final void m12983p(final LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        if (this.f10173i) {
            return;
        }
        w6e w6eVar = new w6e(liveAccessChannel, this.f10167c, this.f10166b, this.f10168d, this.f10165a);
        this.f10172h = w6eVar;
        Animator animatorMo10551a = w6eVar.mo10551a();
        this.f10170f = animatorMo10551a;
        bt0.f(animatorMo10551a, new Runnable() { // from class: l.c7e
            @Override // java.lang.Runnable
            public final void run() {
                this.f8523a.m12978j();
            }
        });
        this.f10170f.start();
        xdl0.E0(this.f10165a, new View.OnClickListener() { // from class: l.d7e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9086a.m12980l(liveAccessChannel, view);
            }
        });
        k6e.m16502b(this.f10169e.mo21430R2(), this.f10169e.m25547E2(), liveAccessChannel.getSource());
    }

    /* JADX INFO: renamed from: q */
    public void m12984q() {
        bql bqlVar = this.f10172h;
        if (bqlVar != null) {
            bqlVar.reset();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m12985s(final LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel, Act act) {
        if (liveAccessChannel == null || liveAccessChannel.getOuterIcon().isEmpty() || liveAccessChannel.getInnerIcon().isEmpty()) {
            return;
        }
        this.f10173i = false;
        if (this.f10165a == null) {
            m12975f(act.inflater(), null);
        }
        this.f10165a.setLayoutParams(new FrameLayout.LayoutParams(t100.d(102.0f), t100.d(97.0f)));
        this.f10165a.setTranslationY(-xdl0.w0());
        this.f10169e.m23501L3(this.f10165a);
        this.f10165a.post(new Runnable() { // from class: l.b7e
            @Override // java.lang.Runnable
            public final void run() {
                this.f8017a.m12981m(liveAccessChannel);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m12986u() {
        this.f10173i = true;
        Animator animator = this.f10171g;
        if (animator != null) {
            animator.removeAllListeners();
            this.f10171g.cancel();
        }
        Animator animator2 = this.f10170f;
        if (animator2 != null) {
            animator2.removeAllListeners();
            this.f10170f.cancel();
        }
        this.f10169e.m23505R3(this.f10165a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void m12979k(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        boolean zIsVoiceRoom = this.f10169e.m25547E2().m17238n().isVoiceRoom();
        a7e a7eVar = this.f10169e;
        if (zIsVoiceRoom) {
            a7eVar.m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(23500).m25610e(liveAccessChannel.getJumpSchema()).m25608c());
        } else {
            a7eVar.m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(23500).m25610e(liveAccessChannel.getJumpSchema()).m25608c());
        }
        Animator animator = this.f10170f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void destroy() {
    }
}
