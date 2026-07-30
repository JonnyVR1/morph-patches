package com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.view;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.view.VoiceConversationsEntryAvatarView;
import com.p046p1.mobile.putong.live.external.voice.entry.LiveEntryAvatarBorderView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.bt0;
import p149l.c4g0;
import p149l.e30;
import p149l.f5c0;
import p149l.ffw;
import p149l.hxs;
import p149l.jig;
import p149l.jo0;
import p149l.mkd0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceConversationsEntryAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final List<String> f45526a;

    /* JADX INFO: renamed from: b */
    public final List<LiveEntryAvatarBorderView> f45527b;

    /* JADX INFO: renamed from: c */
    public c4g0 f45528c;

    /* JADX INFO: renamed from: d */
    public final float[] f45529d;

    /* JADX INFO: renamed from: e */
    public Animator f45530e;

    /* JADX INFO: renamed from: f */
    public int f45531f;

    /* JADX INFO: renamed from: g */
    public int f45532g;

    /* JADX INFO: renamed from: h */
    public Path f45533h;

    /* JADX INFO: renamed from: i */
    public Path f45534i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.virtualVoice.square.view.VoiceConversationsEntryAvatarView$a */
    public class C12537a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f45535a;

        public C12537a(int i) {
            this.f45535a = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            VoiceConversationsEntryAvatarView.this.m69908j();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveEntryAvatarBorderView liveEntryAvatarBorderView = (LiveEntryAvatarBorderView) VoiceConversationsEntryAvatarView.this.f45527b.get(0);
            int i = t100.f167264m;
            liveEntryAvatarBorderView.setTranslationX(i);
            ((LiveEntryAvatarBorderView) VoiceConversationsEntryAvatarView.this.f45527b.get(0)).setTranslationY(-i);
            LiveEntryAvatarBorderView liveEntryAvatarBorderView2 = (LiveEntryAvatarBorderView) VoiceConversationsEntryAvatarView.this.f45527b.remove(0);
            liveEntryAvatarBorderView2.setZ(-1.0f);
            VoiceConversationsEntryAvatarView.this.f45527b.add(liveEntryAvatarBorderView2);
            VoiceConversationsEntryAvatarView.this.f45526a.add((String) VoiceConversationsEntryAvatarView.this.f45526a.remove(0));
            hxs.m133407t("context_common", liveEntryAvatarBorderView2, (String) VoiceConversationsEntryAvatarView.this.f45526a.get(VoiceConversationsEntryAvatarView.this.f45527b.size() % VoiceConversationsEntryAvatarView.this.f45526a.size()), this.f45535a);
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
        this.f45526a = new ArrayList();
        this.f45527b = new ArrayList();
        this.f45529d = new float[]{1.0f, 1.0f, 0.0f};
        this.f45533h = new Path();
        this.f45534i = new Path();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m69899a(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m69904f(Act act, ArrayList arrayList, Throwable th) {
        try {
            m69910l(act, arrayList);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m69905g(Long l2) {
        m69907i();
    }

    /* JADX INFO: renamed from: h */
    public boolean m69906h() {
        return this.f45526a.isEmpty();
    }

    /* JADX INFO: renamed from: i */
    public final void m69907i() {
        int i = t100.f167252a;
        jig jigVar = new jig();
        int i2 = t100.f167271t;
        ArrayList arrayList = new ArrayList();
        LiveEntryAvatarBorderView liveEntryAvatarBorderView = this.f45527b.get(0);
        liveEntryAvatarBorderView.setZ(30.0f);
        int i3 = t100.f167256e;
        Animator animatorM103753z = bt0.m103753z(bt0.m103743p(liveEntryAvatarBorderView, "translationX", 0L, 250L, jigVar, 0.0f, -i3), bt0.m103743p(liveEntryAvatarBorderView, "translationY", 0L, 250L, jigVar, 0.0f, i3), bt0.m103743p(liveEntryAvatarBorderView, "alpha", 0L, 250L, jigVar, 1.0f, 0.0f));
        LiveEntryAvatarBorderView liveEntryAvatarBorderView2 = this.f45527b.get(1);
        liveEntryAvatarBorderView2.setZ(20.0f);
        int i4 = t100.f167261j;
        arrayList.add(bt0.m103753z(bt0.m103743p(liveEntryAvatarBorderView2, "translationX", 0L, 500L, jigVar, i4, 0.0f), bt0.m103743p(liveEntryAvatarBorderView2, "translationY", 0L, 500L, jigVar, -i4, 0.0f)));
        LiveEntryAvatarBorderView liveEntryAvatarBorderView3 = this.f45527b.get(2);
        liveEntryAvatarBorderView3.setZ(10.0f);
        int i5 = t100.f167264m;
        arrayList.add(bt0.m103753z(bt0.m103743p(liveEntryAvatarBorderView3, "translationX", 250L, 250L, jigVar, i5, i4), bt0.m103743p(liveEntryAvatarBorderView3, "translationY", 250L, 250L, jigVar, -i5, -i4), bt0.m103743p(liveEntryAvatarBorderView3, "alpha", 100L, 400L, jigVar, 0.0f, 1.0f)));
        arrayList.add(animatorM103753z);
        Animator[] animatorArr = new Animator[3];
        arrayList.toArray(animatorArr);
        Animator animator = this.f45530e;
        if (animator != null) {
            animator.removeAllListeners();
            this.f45530e.cancel();
        }
        Animator animatorM103753z2 = bt0.m103753z(animatorArr);
        this.f45530e = animatorM103753z2;
        animatorM103753z2.addListener(new C12537a(i2));
        this.f45530e.start();
    }

    /* JADX INFO: renamed from: j */
    public void m69908j() {
        xdl0.m208344M(this, false);
        mkd0.m154992z(this.f45528c);
        Animator animator = this.f45530e;
        if (animator != null) {
            animator.removeAllListeners();
            this.f45530e.cancel();
        }
        this.f45527b.get(0).setTranslationX(0.0f);
        this.f45527b.get(0).setTranslationY(0.0f);
        this.f45527b.get(0).setAlpha(this.f45529d[0]);
        LiveEntryAvatarBorderView liveEntryAvatarBorderView = this.f45527b.get(1);
        int i = t100.f167261j;
        liveEntryAvatarBorderView.setTranslationX(i);
        this.f45527b.get(1).setTranslationY(-i);
        this.f45527b.get(1).setAlpha(this.f45529d[1]);
        LiveEntryAvatarBorderView liveEntryAvatarBorderView2 = this.f45527b.get(2);
        int i2 = t100.f167264m;
        liveEntryAvatarBorderView2.setTranslationX(i2);
        this.f45527b.get(2).setTranslationY(-i2);
        this.f45527b.get(2).setAlpha(this.f45529d[2]);
    }

    /* JADX INFO: renamed from: k */
    public void m69909k(int i, int i2) {
        this.f45531f = i;
        this.f45532g = i2;
    }

    /* JADX INFO: renamed from: l */
    public void m69910l(final Act act, final ArrayList<String> arrayList) {
        if (act == null) {
            return;
        }
        xdl0.m208344M(this, true);
        this.f45526a.clear();
        this.f45526a.addAll(arrayList);
        int i = t100.f167271t;
        for (int i2 = 0; i2 < this.f45527b.size(); i2++) {
            LiveEntryAvatarBorderView liveEntryAvatarBorderView = this.f45527b.get(i2);
            liveEntryAvatarBorderView.m70943u(this.f45531f, this.f45532g);
            liveEntryAvatarBorderView.setZ(100 - i2);
            List<String> list = this.f45526a;
            hxs.m133407t("context_common", liveEntryAvatarBorderView, list.get(i2 % list.size()), i);
        }
        this.f45528c = act.duringCreated(C22306c.interval(3L, 5L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).doOnError(new e30() { // from class: l.r1n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157297a.m69904f(act, arrayList, (Throwable) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.s1n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161917a.m69905g((Long) obj);
            }
        }, new e30() { // from class: l.t1n0
            @Override // p149l.e30
            public final void call(Object obj) {
                VoiceConversationsEntryAvatarView.m69899a((Throwable) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f45528c);
        Animator animator = this.f45530e;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setWillNotDraw(false);
        this.f45527b.clear();
        this.f45527b.add((LiveEntryAvatarBorderView) findViewById(f5c0.f95144t));
        this.f45527b.add((LiveEntryAvatarBorderView) findViewById(f5c0.f95148u));
        this.f45527b.add((LiveEntryAvatarBorderView) findViewById(f5c0.f95152v));
        m69908j();
    }

    public VoiceConversationsEntryAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45526a = new ArrayList();
        this.f45527b = new ArrayList();
        this.f45529d = new float[]{1.0f, 1.0f, 0.0f};
        this.f45533h = new Path();
        this.f45534i = new Path();
    }

    public VoiceConversationsEntryAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45526a = new ArrayList();
        this.f45527b = new ArrayList();
        this.f45529d = new float[]{1.0f, 1.0f, 0.0f};
        this.f45533h = new Path();
        this.f45534i = new Path();
    }
}
