package com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.view;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.view.VoiceConversationsEntryAvatarView;
import com.p051p1.mobile.putong.live.external.voice.entry.LiveEntryAvatarBorderView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.bnl0;
import p153l.dhw;
import p153l.fo0;
import p153l.gt0;
import p153l.izs;
import p153l.kcg0;
import p153l.ldc0;
import p153l.psd0;
import p153l.qa00;
import p153l.xjg;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class VoiceConversationsEntryAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final List<String> f46374a;

    /* JADX INFO: renamed from: b */
    public final List<LiveEntryAvatarBorderView> f46375b;

    /* JADX INFO: renamed from: c */
    public kcg0 f46376c;

    /* JADX INFO: renamed from: d */
    public final float[] f46377d;

    /* JADX INFO: renamed from: e */
    public Animator f46378e;

    /* JADX INFO: renamed from: f */
    public int f46379f;

    /* JADX INFO: renamed from: g */
    public int f46380g;

    /* JADX INFO: renamed from: h */
    public Path f46381h;

    /* JADX INFO: renamed from: i */
    public Path f46382i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.virtualVoice.square.view.VoiceConversationsEntryAvatarView$a */
    public class C12700a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f46383a;

        public C12700a(int i) {
            this.f46383a = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            VoiceConversationsEntryAvatarView.this.m71091j();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveEntryAvatarBorderView liveEntryAvatarBorderView = (LiveEntryAvatarBorderView) VoiceConversationsEntryAvatarView.this.f46375b.get(0);
            int i = qa00.f156326m;
            liveEntryAvatarBorderView.setTranslationX(i);
            ((LiveEntryAvatarBorderView) VoiceConversationsEntryAvatarView.this.f46375b.get(0)).setTranslationY(-i);
            LiveEntryAvatarBorderView liveEntryAvatarBorderView2 = (LiveEntryAvatarBorderView) VoiceConversationsEntryAvatarView.this.f46375b.remove(0);
            liveEntryAvatarBorderView2.setZ(-1.0f);
            VoiceConversationsEntryAvatarView.this.f46375b.add(liveEntryAvatarBorderView2);
            VoiceConversationsEntryAvatarView.this.f46374a.add((String) VoiceConversationsEntryAvatarView.this.f46374a.remove(0));
            izs.m142869t("context_common", liveEntryAvatarBorderView2, (String) VoiceConversationsEntryAvatarView.this.f46374a.get(VoiceConversationsEntryAvatarView.this.f46375b.size() % VoiceConversationsEntryAvatarView.this.f46374a.size()), this.f46383a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public VoiceConversationsEntryAvatarView(@NonNull Context context) {
        super(context);
        this.f46374a = new ArrayList();
        this.f46375b = new ArrayList();
        this.f46377d = new float[]{1.0f, 1.0f, 0.0f};
        this.f46381h = new Path();
        this.f46382i = new Path();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m71082a(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m71087f(Act act, ArrayList arrayList, Throwable th) {
        try {
            m71093l(act, arrayList);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m71088g(Long l2) {
        m71090i();
    }

    /* JADX INFO: renamed from: h */
    public boolean m71089h() {
        return this.f46374a.isEmpty();
    }

    /* JADX INFO: renamed from: i */
    public final void m71090i() {
        int i = qa00.f156314a;
        xjg xjgVar = new xjg();
        int i2 = qa00.f156333t;
        ArrayList arrayList = new ArrayList();
        LiveEntryAvatarBorderView liveEntryAvatarBorderView = this.f46375b.get(0);
        liveEntryAvatarBorderView.setZ(30.0f);
        int i3 = qa00.f156318e;
        Animator animatorM132180z = gt0.m132180z(gt0.m132170p(liveEntryAvatarBorderView, "translationX", 0L, 250L, xjgVar, 0.0f, -i3), gt0.m132170p(liveEntryAvatarBorderView, "translationY", 0L, 250L, xjgVar, 0.0f, i3), gt0.m132170p(liveEntryAvatarBorderView, "alpha", 0L, 250L, xjgVar, 1.0f, 0.0f));
        LiveEntryAvatarBorderView liveEntryAvatarBorderView2 = this.f46375b.get(1);
        liveEntryAvatarBorderView2.setZ(20.0f);
        int i4 = qa00.f156323j;
        arrayList.add(gt0.m132180z(gt0.m132170p(liveEntryAvatarBorderView2, "translationX", 0L, 500L, xjgVar, i4, 0.0f), gt0.m132170p(liveEntryAvatarBorderView2, "translationY", 0L, 500L, xjgVar, -i4, 0.0f)));
        LiveEntryAvatarBorderView liveEntryAvatarBorderView3 = this.f46375b.get(2);
        liveEntryAvatarBorderView3.setZ(10.0f);
        int i5 = qa00.f156326m;
        arrayList.add(gt0.m132180z(gt0.m132170p(liveEntryAvatarBorderView3, "translationX", 250L, 250L, xjgVar, i5, i4), gt0.m132170p(liveEntryAvatarBorderView3, "translationY", 250L, 250L, xjgVar, -i5, -i4), gt0.m132170p(liveEntryAvatarBorderView3, "alpha", 100L, 400L, xjgVar, 0.0f, 1.0f)));
        arrayList.add(animatorM132180z);
        Animator[] animatorArr = new Animator[3];
        arrayList.toArray(animatorArr);
        Animator animator = this.f46378e;
        if (animator != null) {
            animator.removeAllListeners();
            this.f46378e.cancel();
        }
        Animator animatorM132180z2 = gt0.m132180z(animatorArr);
        this.f46378e = animatorM132180z2;
        animatorM132180z2.addListener(new C12700a(i2));
        this.f46378e.start();
    }

    /* JADX INFO: renamed from: j */
    public void m71091j() {
        bnl0.m105524M(this, false);
        psd0.m173633z(this.f46376c);
        Animator animator = this.f46378e;
        if (animator != null) {
            animator.removeAllListeners();
            this.f46378e.cancel();
        }
        this.f46375b.get(0).setTranslationX(0.0f);
        this.f46375b.get(0).setTranslationY(0.0f);
        this.f46375b.get(0).setAlpha(this.f46377d[0]);
        LiveEntryAvatarBorderView liveEntryAvatarBorderView = this.f46375b.get(1);
        int i = qa00.f156323j;
        liveEntryAvatarBorderView.setTranslationX(i);
        this.f46375b.get(1).setTranslationY(-i);
        this.f46375b.get(1).setAlpha(this.f46377d[1]);
        LiveEntryAvatarBorderView liveEntryAvatarBorderView2 = this.f46375b.get(2);
        int i2 = qa00.f156326m;
        liveEntryAvatarBorderView2.setTranslationX(i2);
        this.f46375b.get(2).setTranslationY(-i2);
        this.f46375b.get(2).setAlpha(this.f46377d[2]);
    }

    /* JADX INFO: renamed from: k */
    public void m71092k(int i, int i2) {
        this.f46379f = i;
        this.f46380g = i2;
    }

    /* JADX INFO: renamed from: l */
    public void m71093l(final Act act, final ArrayList<String> arrayList) {
        if (act == null) {
            return;
        }
        bnl0.m105524M(this, true);
        this.f46374a.clear();
        this.f46374a.addAll(arrayList);
        int i = qa00.f156333t;
        for (int i2 = 0; i2 < this.f46375b.size(); i2++) {
            LiveEntryAvatarBorderView liveEntryAvatarBorderView = this.f46375b.get(i2);
            liveEntryAvatarBorderView.m72126u(this.f46379f, this.f46380g);
            liveEntryAvatarBorderView.setZ(100 - i2);
            List<String> list = this.f46374a;
            izs.m142869t("context_common", liveEntryAvatarBorderView, list.get(i2 % list.size()), i);
        }
        this.f46376c = act.duringCreated(C22421c.interval(3L, 5L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).doOnError(new y20() { // from class: l.van0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183132a.m71087f(act, arrayList, (Throwable) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.wan0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188143a.m71088g((Long) obj);
            }
        }, new y20() { // from class: l.xan0
            @Override // p153l.y20
            public final void call(Object obj) {
                VoiceConversationsEntryAvatarView.m71082a((Throwable) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f46376c);
        Animator animator = this.f46378e;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setWillNotDraw(false);
        this.f46375b.clear();
        this.f46375b.add((LiveEntryAvatarBorderView) findViewById(ldc0.f131601t));
        this.f46375b.add((LiveEntryAvatarBorderView) findViewById(ldc0.f131605u));
        this.f46375b.add((LiveEntryAvatarBorderView) findViewById(ldc0.f131609v));
        m71091j();
    }

    public VoiceConversationsEntryAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46374a = new ArrayList();
        this.f46375b = new ArrayList();
        this.f46377d = new float[]{1.0f, 1.0f, 0.0f};
        this.f46381h = new Path();
        this.f46382i = new Path();
    }

    public VoiceConversationsEntryAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46374a = new ArrayList();
        this.f46375b = new ArrayList();
        this.f46377d = new float[]{1.0f, 1.0f, 0.0f};
        this.f46381h = new Path();
        this.f46382i = new Path();
    }
}
