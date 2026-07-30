package p149l;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import java.util.concurrent.atomic.AtomicInteger;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class f7e implements s7m<a7e> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f96239a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f96240b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f96241c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f96242d;

    /* JADX INFO: renamed from: e */
    public a7e f96243e;

    /* JADX INFO: renamed from: f */
    public Animator f96244f;

    /* JADX INFO: renamed from: g */
    public Animator f96245g;

    /* JADX INFO: renamed from: h */
    public bql f96246h;

    /* JADX INFO: renamed from: i */
    public boolean f96247i = false;

    /* JADX INFO: renamed from: l.f7e$a */
    public class C16771a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicInteger f96248a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LongLinkLiveDownBox.LiveAccessChannel f96249b;

        public C16771a(AtomicInteger atomicInteger, LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
            this.f96248a = atomicInteger;
            this.f96249b = liveAccessChannel;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            this.f96248a.incrementAndGet();
            if (this.f96248a.get() == 2) {
                f7e.this.m119799p(this.f96249b);
            }
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View m119792f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g7e.m124689b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(a7e a7eVar) {
        this.f96243e = a7eVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m119794j() {
        if (this.f96243e.m144510w2() != null) {
            this.f96243e.m144510w2().m144506C2(this.f96243e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m119796l(final LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel, View view) {
        if (this.f96243e == null) {
            return;
        }
        Animator animatorMo103384b = this.f96246h.mo103384b();
        this.f96245g = animatorMo103384b;
        if (animatorMo103384b != null) {
            Animator animator = this.f96244f;
            if (animator != null) {
                animator.pause();
            }
            this.f96245g.start();
            bt0.m103733f(this.f96245g, new Runnable() { // from class: l.e7e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89701a.m119795k(liveAccessChannel);
                }
            });
        } else {
            m119795k(liveAccessChannel);
        }
        k6e.m144577a(this.f96243e.mo77274R2(), this.f96243e.m206027E2(), liveAccessChannel.getSource());
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m119797m(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        C16771a c16771a = new C16771a(new AtomicInteger(), liveAccessChannel);
        hxs.m133410w("context_livingAct", this.f96241c, liveAccessChannel.getOuterIcon(), c16771a);
        hxs.m133410w("context_livingAct", this.f96240b, liveAccessChannel.getInnerIcon(), c16771a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [l.ho2] */
    /* JADX INFO: renamed from: p */
    public final void m119799p(final LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        if (this.f96247i) {
            return;
        }
        w6e w6eVar = new w6e(liveAccessChannel, this.f96241c, this.f96240b, this.f96242d, this.f96239a);
        this.f96246h = w6eVar;
        Animator animatorMo103383a = w6eVar.mo103383a();
        this.f96244f = animatorMo103383a;
        bt0.m103733f(animatorMo103383a, new Runnable() { // from class: l.c7e
            @Override // java.lang.Runnable
            public final void run() {
                this.f79610a.m119794j();
            }
        });
        this.f96244f.start();
        xdl0.m208329E0(this.f96239a, new View.OnClickListener() { // from class: l.d7e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84736a.m119796l(liveAccessChannel, view);
            }
        });
        k6e.m144578b(this.f96243e.mo77274R2(), this.f96243e.m206027E2(), liveAccessChannel.getSource());
    }

    /* JADX INFO: renamed from: q */
    public void m119800q() {
        bql bqlVar = this.f96246h;
        if (bqlVar != null) {
            bqlVar.reset();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m119801s(final LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel, Act act) {
        if (liveAccessChannel == null || liveAccessChannel.getOuterIcon().isEmpty() || liveAccessChannel.getInnerIcon().isEmpty()) {
            return;
        }
        this.f96247i = false;
        if (this.f96239a == null) {
            m119792f(act.inflater(), null);
        }
        this.f96239a.setLayoutParams(new FrameLayout.LayoutParams(t100.m186890d(102.0f), t100.m186890d(97.0f)));
        this.f96239a.setTranslationY(-xdl0.m208408w0());
        this.f96243e.m193995L3(this.f96239a);
        this.f96239a.post(new Runnable() { // from class: l.b7e
            @Override // java.lang.Runnable
            public final void run() {
                this.f73963a.m119797m(liveAccessChannel);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m119802u() {
        this.f96247i = true;
        Animator animator = this.f96245g;
        if (animator != null) {
            animator.removeAllListeners();
            this.f96245g.cancel();
        }
        Animator animator2 = this.f96244f;
        if (animator2 != null) {
            animator2.removeAllListeners();
            this.f96244f.cancel();
        }
        this.f96243e.m193999R3(this.f96239a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void m119795k(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        boolean zIsVoiceRoom = this.f96243e.m206027E2().mo149817n().isVoiceRoom();
        a7e a7eVar = this.f96243e;
        if (zIsVoiceRoom) {
            a7eVar.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(23500).m206701e(liveAccessChannel.getJumpSchema()).m206699c());
        } else {
            a7eVar.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(23500).m206701e(liveAccessChannel.getJumpSchema()).m206699c());
        }
        Animator animator = this.f96244f;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
