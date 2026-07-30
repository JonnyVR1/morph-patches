package com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view;

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
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.dhw;
import p153l.fo0;
import p153l.gt0;
import p153l.it0;
import p153l.izs;
import p153l.kcg0;
import p153l.mdc0;
import p153l.psd0;
import p153l.qa00;
import p153l.xjg;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceAuctionAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final List<String> f53813a;

    /* JADX INFO: renamed from: b */
    public final List<VDraweeView> f53814b;

    /* JADX INFO: renamed from: c */
    public kcg0 f53815c;

    /* JADX INFO: renamed from: d */
    public final float[] f53816d;

    /* JADX INFO: renamed from: e */
    public Animator f53817e;

    /* JADX INFO: renamed from: f */
    public float f53818f;

    /* JADX INFO: renamed from: g */
    public String f53819g;

    /* JADX INFO: renamed from: h */
    public Path f53820h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.auction.view.VoiceAuctionAvatarView$a */
    public class C13157a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f53821a;

        public C13157a(int i) {
            this.f53821a = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            VoiceAuctionAvatarView.this.m79116i();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VDraweeView vDraweeView = (VDraweeView) VoiceAuctionAvatarView.this.f53814b.get(0);
            int i = qa00.f156320g;
            vDraweeView.setTranslationX(-i);
            ((VDraweeView) VoiceAuctionAvatarView.this.f53814b.get(0)).setTranslationY(-i);
            VDraweeView vDraweeView2 = (VDraweeView) VoiceAuctionAvatarView.this.f53814b.remove(0);
            vDraweeView2.setZ(-1.0f);
            VoiceAuctionAvatarView.this.f53814b.add(vDraweeView2);
            VoiceAuctionAvatarView.this.f53813a.add((String) VoiceAuctionAvatarView.this.f53813a.remove(0));
            izs.m142869t("context_common", vDraweeView2, (String) VoiceAuctionAvatarView.this.f53813a.get(VoiceAuctionAvatarView.this.f53814b.size() % VoiceAuctionAvatarView.this.f53813a.size()), this.f53821a);
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
        this.f53813a = new ArrayList();
        this.f53814b = new ArrayList();
        this.f53816d = new float[]{1.0f, 1.0f, 0.0f};
        this.f53820h = new Path();
    }

    /* JADX INFO: renamed from: e */
    public String m79112e() {
        return this.f53819g;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m79113f(Act act, List list, Throwable th) {
        try {
            m79117j(act, list, this.f53819g, this.f53818f);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m79114g(Long l2) {
        m79115h();
    }

    /* JADX INFO: renamed from: h */
    public final void m79115h() {
        int i = qa00.f156314a;
        xjg xjgVar = new xjg();
        int i2 = qa00.f156289B;
        VDraweeView vDraweeView = this.f53814b.get(0);
        vDraweeView.setZ(30.0f);
        int i3 = qa00.f156317d;
        Animator animatorM132180z = gt0.m132180z(gt0.m132170p(vDraweeView, "translationX", 0L, 250L, xjgVar, 0.0f, i3), gt0.m132170p(vDraweeView, "translationY", 0L, 250L, xjgVar, 0.0f, i3), gt0.m132170p(vDraweeView, "alpha", 0L, 250L, xjgVar, 1.0f, 0.0f));
        VDraweeView vDraweeView2 = this.f53814b.get(1);
        vDraweeView2.setZ(20.0f);
        Animator animatorM132180z2 = gt0.m132180z(gt0.m132170p(vDraweeView2, "translationX", 0L, 500L, xjgVar, -i3, 0.0f), gt0.m132170p(vDraweeView2, "translationY", 0L, 500L, xjgVar, -i3, 0.0f));
        VDraweeView vDraweeView3 = this.f53814b.get(2);
        vDraweeView3.setZ(10.0f);
        int i4 = qa00.f156320g;
        Animator animatorM132180z3 = gt0.m132180z(gt0.m132170p(vDraweeView3, "translationX", 250L, 250L, xjgVar, -i4, -i3), gt0.m132170p(vDraweeView3, "translationY", 250L, 250L, xjgVar, -i4, -i3), gt0.m132170p(vDraweeView3, "alpha", 100L, 400L, xjgVar, 0.0f, 1.0f));
        it0.m142009C(this.f53817e);
        Animator animatorM132180z4 = gt0.m132180z(animatorM132180z, animatorM132180z2, animatorM132180z3);
        this.f53817e = animatorM132180z4;
        animatorM132180z4.addListener(new C13157a(i2));
        this.f53817e.start();
    }

    /* JADX INFO: renamed from: i */
    public void m79116i() {
        bnl0.m105524M(this, false);
        psd0.m173633z(this.f53815c);
        it0.m142009C(this.f53817e);
        this.f53814b.get(0).setTranslationX(0.0f);
        this.f53814b.get(0).setTranslationY(0.0f);
        this.f53814b.get(0).setAlpha(this.f53816d[0]);
        VDraweeView vDraweeView = this.f53814b.get(1);
        int i = qa00.f156317d;
        vDraweeView.setTranslationX(-i);
        this.f53814b.get(1).setTranslationY(-i);
        this.f53814b.get(1).setAlpha(this.f53816d[1]);
        VDraweeView vDraweeView2 = this.f53814b.get(2);
        int i2 = qa00.f156320g;
        vDraweeView2.setTranslationX(-i2);
        this.f53814b.get(2).setTranslationY(-i2);
        this.f53814b.get(2).setAlpha(this.f53816d[2]);
    }

    /* JADX INFO: renamed from: j */
    public void m79117j(final Act act, final List<String> list, String str, float f) {
        if (act == null) {
            return;
        }
        if (NullChecker.m82486a(str) && TextUtils.equals(str, this.f53819g)) {
            return;
        }
        this.f53819g = str;
        m79116i();
        bnl0.m105524M(this, true);
        this.f53818f = f;
        this.f53813a.clear();
        this.f53813a.addAll(list);
        int i = qa00.f156289B;
        int size = this.f53813a.size();
        if (size == 1) {
            this.f53814b.get(1).setVisibility(4);
            this.f53814b.get(2).setVisibility(4);
            this.f53814b.get(0).setVisibility(0);
            izs.m142869t("context_single_room", this.f53814b.get(0), this.f53813a.get(0), i);
            return;
        }
        if (size > 0) {
            for (int i2 = 0; i2 < this.f53814b.size(); i2++) {
                VDraweeView vDraweeView = this.f53814b.get(i2);
                vDraweeView.setVisibility(0);
                vDraweeView.setZ(100 - i2);
                List<String> list2 = this.f53813a;
                izs.m142869t("context_single_room", vDraweeView, list2.get(i2 % list2.size()), i);
            }
            this.f53815c = act.duringCreated(C22421c.interval(3L, 3L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).doOnError(new y20() { // from class: l.gom0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f105313a.m79113f(act, list, (Throwable) obj);
                }
            }).subscribe(dhw.m115829h(new y20() { // from class: l.hom0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110938a.m79114g((Long) obj);
                }
            }));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f53815c);
        Animator animator = this.f53817e;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f53818f > 0.0f) {
            this.f53820h.addCircle(getWidth() - qa00.f156317d, getHeight() - (getHeight() / 4), getHeight() / 4, Path.Direction.CCW);
            canvas.clipPath(this.f53820h, Region.Op.DIFFERENCE);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setWillNotDraw(false);
        this.f53814b.clear();
        this.f53814b.add((VDraweeView) findViewById(mdc0.f136326w));
        this.f53814b.add((VDraweeView) findViewById(mdc0.f136335x));
        this.f53814b.add((VDraweeView) findViewById(mdc0.f136344y));
        m79116i();
    }

    public VoiceAuctionAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53813a = new ArrayList();
        this.f53814b = new ArrayList();
        this.f53816d = new float[]{1.0f, 1.0f, 0.0f};
        this.f53820h = new Path();
    }

    public VoiceAuctionAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53813a = new ArrayList();
        this.f53814b = new ArrayList();
        this.f53816d = new float[]{1.0f, 1.0f, 0.0f};
        this.f53820h = new Path();
    }
}
