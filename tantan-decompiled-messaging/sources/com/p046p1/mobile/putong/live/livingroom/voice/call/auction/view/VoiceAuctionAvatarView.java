package com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VDraweeView;
import p149l.bt0;
import p149l.c4g0;
import p149l.dt0;
import p149l.e30;
import p149l.ffw;
import p149l.g5c0;
import p149l.hxs;
import p149l.jig;
import p149l.jo0;
import p149l.mkd0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceAuctionAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final List<String> f52965a;

    /* JADX INFO: renamed from: b */
    public final List<VDraweeView> f52966b;

    /* JADX INFO: renamed from: c */
    public c4g0 f52967c;

    /* JADX INFO: renamed from: d */
    public final float[] f52968d;

    /* JADX INFO: renamed from: e */
    public Animator f52969e;

    /* JADX INFO: renamed from: f */
    public float f52970f;

    /* JADX INFO: renamed from: g */
    public String f52971g;

    /* JADX INFO: renamed from: h */
    public Path f52972h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.auction.view.VoiceAuctionAvatarView$a */
    public class C12994a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f52973a;

        public C12994a(int i) {
            this.f52973a = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            VoiceAuctionAvatarView.this.m77933i();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VDraweeView vDraweeView = (VDraweeView) VoiceAuctionAvatarView.this.f52966b.get(0);
            int i = t100.f167258g;
            vDraweeView.setTranslationX(-i);
            ((VDraweeView) VoiceAuctionAvatarView.this.f52966b.get(0)).setTranslationY(-i);
            VDraweeView vDraweeView2 = (VDraweeView) VoiceAuctionAvatarView.this.f52966b.remove(0);
            vDraweeView2.setZ(-1.0f);
            VoiceAuctionAvatarView.this.f52966b.add(vDraweeView2);
            VoiceAuctionAvatarView.this.f52965a.add((String) VoiceAuctionAvatarView.this.f52965a.remove(0));
            hxs.m133407t("context_common", vDraweeView2, (String) VoiceAuctionAvatarView.this.f52965a.get(VoiceAuctionAvatarView.this.f52966b.size() % VoiceAuctionAvatarView.this.f52965a.size()), this.f52973a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public VoiceAuctionAvatarView(@NonNull Context context) {
        super(context);
        this.f52965a = new ArrayList();
        this.f52966b = new ArrayList();
        this.f52968d = new float[]{1.0f, 1.0f, 0.0f};
        this.f52972h = new Path();
    }

    /* JADX INFO: renamed from: e */
    public String m77929e() {
        return this.f52971g;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m77930f(Act act, List list, Throwable th) {
        try {
            m77934j(act, list, this.f52971g, this.f52970f);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m77931g(Long l2) {
        m77932h();
    }

    /* JADX INFO: renamed from: h */
    public final void m77932h() {
        int i = t100.f167252a;
        jig jigVar = new jig();
        int i2 = t100.f167227B;
        VDraweeView vDraweeView = this.f52966b.get(0);
        vDraweeView.setZ(30.0f);
        int i3 = t100.f167255d;
        Animator animatorM103753z = bt0.m103753z(bt0.m103743p(vDraweeView, "translationX", 0L, 250L, jigVar, 0.0f, i3), bt0.m103743p(vDraweeView, "translationY", 0L, 250L, jigVar, 0.0f, i3), bt0.m103743p(vDraweeView, "alpha", 0L, 250L, jigVar, 1.0f, 0.0f));
        VDraweeView vDraweeView2 = this.f52966b.get(1);
        vDraweeView2.setZ(20.0f);
        Animator animatorM103753z2 = bt0.m103753z(bt0.m103743p(vDraweeView2, "translationX", 0L, 500L, jigVar, -i3, 0.0f), bt0.m103743p(vDraweeView2, "translationY", 0L, 500L, jigVar, -i3, 0.0f));
        VDraweeView vDraweeView3 = this.f52966b.get(2);
        vDraweeView3.setZ(10.0f);
        int i4 = t100.f167258g;
        Animator animatorM103753z3 = bt0.m103753z(bt0.m103743p(vDraweeView3, "translationX", 250L, 250L, jigVar, -i4, -i3), bt0.m103743p(vDraweeView3, "translationY", 250L, 250L, jigVar, -i4, -i3), bt0.m103743p(vDraweeView3, "alpha", 100L, 400L, jigVar, 0.0f, 1.0f));
        dt0.m113503C(this.f52969e);
        Animator animatorM103753z4 = bt0.m103753z(animatorM103753z, animatorM103753z2, animatorM103753z3);
        this.f52969e = animatorM103753z4;
        animatorM103753z4.addListener(new C12994a(i2));
        this.f52969e.start();
    }

    /* JADX INFO: renamed from: i */
    public void m77933i() {
        xdl0.m208344M(this, false);
        mkd0.m154992z(this.f52967c);
        dt0.m113503C(this.f52969e);
        this.f52966b.get(0).setTranslationX(0.0f);
        this.f52966b.get(0).setTranslationY(0.0f);
        this.f52966b.get(0).setAlpha(this.f52968d[0]);
        VDraweeView vDraweeView = this.f52966b.get(1);
        int i = t100.f167255d;
        vDraweeView.setTranslationX(-i);
        this.f52966b.get(1).setTranslationY(-i);
        this.f52966b.get(1).setAlpha(this.f52968d[1]);
        VDraweeView vDraweeView2 = this.f52966b.get(2);
        int i2 = t100.f167258g;
        vDraweeView2.setTranslationX(-i2);
        this.f52966b.get(2).setTranslationY(-i2);
        this.f52966b.get(2).setAlpha(this.f52968d[2]);
    }

    /* JADX INFO: renamed from: j */
    public void m77934j(final Act act, final List<String> list, String str, float f) {
        if (act == null) {
            return;
        }
        if (NullChecker.m81303a(str) && TextUtils.equals(str, this.f52971g)) {
            return;
        }
        this.f52971g = str;
        m77933i();
        xdl0.m208344M(this, true);
        this.f52970f = f;
        this.f52965a.clear();
        this.f52965a.addAll(list);
        int i = t100.f167227B;
        int size = this.f52965a.size();
        if (size == 1) {
            this.f52966b.get(1).setVisibility(4);
            this.f52966b.get(2).setVisibility(4);
            this.f52966b.get(0).setVisibility(0);
            hxs.m133407t("context_single_room", this.f52966b.get(0), this.f52965a.get(0), i);
            return;
        }
        if (size > 0) {
            for (int i2 = 0; i2 < this.f52966b.size(); i2++) {
                VDraweeView vDraweeView = this.f52966b.get(i2);
                vDraweeView.setVisibility(0);
                vDraweeView.setZ(100 - i2);
                List<String> list2 = this.f52965a;
                hxs.m133407t("context_single_room", vDraweeView, list2.get(i2 % list2.size()), i);
            }
            this.f52967c = act.duringCreated(C22306c.interval(3L, 3L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).doOnError(new e30() { // from class: l.cfm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f80643a.m77930f(act, list, (Throwable) obj);
                }
            }).subscribe(ffw.m121197h(new e30() { // from class: l.dfm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f85964a.m77931g((Long) obj);
                }
            }));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f52967c);
        Animator animator = this.f52969e;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f52970f > 0.0f) {
            this.f52972h.addCircle(getWidth() - t100.f167255d, getHeight() - (getHeight() / 4), getHeight() / 4, Path.Direction.CCW);
            canvas.clipPath(this.f52972h, Region.Op.DIFFERENCE);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setWillNotDraw(false);
        this.f52966b.clear();
        this.f52966b.add((VDraweeView) findViewById(g5c0.f101081w));
        this.f52966b.add((VDraweeView) findViewById(g5c0.f101090x));
        this.f52966b.add((VDraweeView) findViewById(g5c0.f101099y));
        m77933i();
    }

    public VoiceAuctionAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52965a = new ArrayList();
        this.f52966b = new ArrayList();
        this.f52968d = new float[]{1.0f, 1.0f, 0.0f};
        this.f52972h = new Path();
    }

    public VoiceAuctionAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52965a = new ArrayList();
        this.f52966b = new ArrayList();
        this.f52968d = new float[]{1.0f, 1.0f, 0.0f};
        this.f52972h = new Path();
    }
}
