package p153l;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import java.util.concurrent.atomic.AtomicInteger;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class u8e implements iam<p8e> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f178025a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f178026b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f178027c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f178028d;

    /* JADX INFO: renamed from: e */
    public p8e f178029e;

    /* JADX INFO: renamed from: f */
    public Animator f178030f;

    /* JADX INFO: renamed from: g */
    public Animator f178031g;

    /* JADX INFO: renamed from: h */
    public osl f178032h;

    /* JADX INFO: renamed from: i */
    public boolean f178033i = false;

    /* JADX INFO: renamed from: l.u8e$a */
    public class C20524a extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicInteger f178034a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LongLinkLiveDownBox.LiveAccessChannel f178035b;

        public C20524a(AtomicInteger atomicInteger, LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
            this.f178034a = atomicInteger;
            this.f178035b = liveAccessChannel;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            this.f178034a.incrementAndGet();
            if (this.f178034a.get() == 2) {
                u8e.this.m195029p(this.f178035b);
            }
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View m195022f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v8e.m200299b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(p8e p8eVar) {
        this.f178029e = p8eVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m195024j() {
        if (this.f178029e.m153101w2() != null) {
            this.f178029e.m153101w2().m153097C2(this.f178029e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2] */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m195026l(final LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel, View view) {
        if (this.f178029e == null) {
            return;
        }
        Animator animatorMo153212b = this.f178032h.mo153212b();
        this.f178031g = animatorMo153212b;
        if (animatorMo153212b != null) {
            Animator animator = this.f178030f;
            if (animator != null) {
                animator.pause();
            }
            this.f178031g.start();
            gt0.m132160f(this.f178031g, new Runnable() { // from class: l.t8e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f172525a.m195025k(liveAccessChannel);
                }
            });
        } else {
            m195025k(liveAccessChannel);
        }
        z7e.m218883a(this.f178029e.mo78457R2(), this.f178029e.m213810E2(), liveAccessChannel.getSource());
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m195027m(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        C20524a c20524a = new C20524a(new AtomicInteger(), liveAccessChannel);
        izs.m142872w("context_livingAct", this.f178027c, liveAccessChannel.getOuterIcon(), c20524a);
        izs.m142872w("context_livingAct", this.f178026b, liveAccessChannel.getInnerIcon(), c20524a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [l.oo2] */
    /* JADX INFO: renamed from: p */
    public final void m195029p(final LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        if (this.f178033i) {
            return;
        }
        l8e l8eVar = new l8e(liveAccessChannel, this.f178027c, this.f178026b, this.f178028d, this.f178025a);
        this.f178032h = l8eVar;
        Animator animatorMo153211a = l8eVar.mo153211a();
        this.f178030f = animatorMo153211a;
        gt0.m132160f(animatorMo153211a, new Runnable() { // from class: l.r8e
            @Override // java.lang.Runnable
            public final void run() {
                this.f161700a.m195024j();
            }
        });
        this.f178030f.start();
        bnl0.m105509E0(this.f178025a, new View.OnClickListener() { // from class: l.s8e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166814a.m195026l(liveAccessChannel, view);
            }
        });
        z7e.m218884b(this.f178029e.mo78457R2(), this.f178029e.m213810E2(), liveAccessChannel.getSource());
    }

    /* JADX INFO: renamed from: q */
    public void m195030q() {
        osl oslVar = this.f178032h;
        if (oslVar != null) {
            oslVar.reset();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m195031s(final LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel, Act act) {
        if (liveAccessChannel == null || liveAccessChannel.getOuterIcon().isEmpty() || liveAccessChannel.getInnerIcon().isEmpty()) {
            return;
        }
        this.f178033i = false;
        if (this.f178025a == null) {
            m195022f(act.inflater(), null);
        }
        this.f178025a.setLayoutParams(new FrameLayout.LayoutParams(qa00.m175859d(102.0f), qa00.m175859d(97.0f)));
        this.f178025a.setTranslationY(-bnl0.m105588w0());
        this.f178029e.m110323L3(this.f178025a);
        this.f178025a.post(new Runnable() { // from class: l.q8e
            @Override // java.lang.Runnable
            public final void run() {
                this.f156104a.m195027m(liveAccessChannel);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m195032u() {
        this.f178033i = true;
        Animator animator = this.f178031g;
        if (animator != null) {
            animator.removeAllListeners();
            this.f178031g.cancel();
        }
        Animator animator2 = this.f178030f;
        if (animator2 != null) {
            animator2.removeAllListeners();
            this.f178030f.cancel();
        }
        this.f178029e.m110328R3(this.f178025a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void m195025k(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        boolean zIsVoiceRoom = this.f178029e.m213810E2().mo183440n().isVoiceRoom();
        p8e p8eVar = this.f178029e;
        if (zIsVoiceRoom) {
            p8eVar.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(23500).m103154e(liveAccessChannel.getJumpSchema()).m103152c());
        } else {
            p8eVar.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(23500).m103154e(liveAccessChannel.getJumpSchema()).m103152c());
        }
        Animator animator = this.f178030f;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
