package com.p000p1.mobile.putong.core.newui.messages.recommend.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout;
import com.p000p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout;
import com.p000p1.mobile.putong.core.newui.view.ShimmerOptLayout;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import l.bt0;
import l.e30;
import l.jc30;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.sw6;
import l.t100;
import l.upa;
import l.xdl0;
import p009l.pi6;
import p009l.rd6;
import v.VDraweeView;
import v.VFrame;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewMatchItemLayout extends FrameLayout {

    /* JADX INFO: renamed from: k */
    public static String f4706k = "";

    /* JADX INFO: renamed from: a */
    public VDraweeView f4707a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4708b;

    /* JADX INFO: renamed from: c */
    public VFrame f4709c;

    /* JADX INFO: renamed from: d */
    public VImage f4710d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f4711e;

    /* JADX INFO: renamed from: f */
    public ShimmerOptLayout f4712f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f4713g;

    /* JADX INFO: renamed from: h */
    public int f4714h;

    /* JADX INFO: renamed from: i */
    public VDraweeView[] f4715i;

    /* JADX INFO: renamed from: j */
    public ValueAnimator f4716j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout$a */
    public class C0348a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f4717a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f4718b;

        public C0348a(int i, int i2) {
            this.f4717a = i;
            this.f4718b = i2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            NewMatchItemLayout newMatchItemLayout = NewMatchItemLayout.this;
            newMatchItemLayout.m6702p(newMatchItemLayout.f4715i[this.f4717a], fFloatValue);
            NewMatchItemLayout newMatchItemLayout2 = NewMatchItemLayout.this;
            newMatchItemLayout2.m6702p(newMatchItemLayout2.f4715i[this.f4718b], 1.0f - fFloatValue);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout$b */
    public class C0349b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGAnimationView f4720a;

        public C0349b(SVGAnimationView sVGAnimationView) {
            this.f4720a = sVGAnimationView;
        }

        public void onFinished() {
            super.onFinished();
            this.f4720a.setAlpha(0.0f);
        }
    }

    public NewMatchItemLayout(@NonNull Context context) {
        super(context);
        this.f4714h = 0;
        this.f4715i = new VDraweeView[2];
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m6687a(int i, int i2, Intent intent) {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static void m6693i() {
        f4706k = "";
    }

    /* JADX INFO: renamed from: k */
    public static Picture.ImageUri m6694k(User user) {
        return sw6.b(user).profile180();
    }

    /* JADX INFO: renamed from: g */
    public final void m6695g(View view) {
        jc30.a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public PutongAct m6696h() {
        return getContext();
    }

    /* JADX INFO: renamed from: j */
    public final void m6697j(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(o6j0.a.h("moments_user_id", str));
        o6j0.c("e_new_match_notification", "p_messages_view", (o6j0.a[]) arrayList.toArray(new o6j0.a[arrayList.size()]));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(o6j0.a.h("other_user_id", str));
        arrayList2.add(o6j0.a.h("no_chat_entrance_type", "new_match"));
        o6j0.c("e_nochat_match_entrance", "p_messages_view", (o6j0.a[]) arrayList2.toArray(new o6j0.a[arrayList2.size()]));
        getContext().startActivityForResult(MessagesAct.k2(getContext(), str, false, false, 26), new a.a() { // from class: l.ic30
            /* JADX INFO: renamed from: a */
            public final boolean m16315a(int i, int i2, Intent intent) {
                return NewMatchItemLayout.m6687a(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m6699m(ConversationHeadRecommendLayout.C0279c c0279c, View view) {
        m6697j(c0279c.f3555d);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m6700n() {
        this.f4712f.m8033b();
    }

    /* JADX INFO: renamed from: o */
    public void m6701o(ConversationHeadRecommendLayout.C0278b c0278b, final ConversationHeadRecommendLayout.C0279c c0279c, final SVGAnimationView sVGAnimationView) {
        c0278b.c(m6696h(), CoreModule.c.e0.Ka(c0279c.f3555d)).subscribe(mkd0.G(new e30() { // from class: l.fc30
            public final void call(Object obj) {
                this.f12913a.m6698l(sVGAnimationView, (User) obj);
            }
        }));
        xdl0.E0(this, new View.OnClickListener() { // from class: l.gc30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13429a.m6699m(c0279c, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6695g(this);
        VDraweeView[] vDraweeViewArr = this.f4715i;
        vDraweeViewArr[0] = this.f4707a;
        vDraweeViewArr[1] = this.f4708b;
        ShimmerOptLayout.C0419b c0419b = new ShimmerOptLayout.C0419b(new int[]{16777215, -1291845633, 16777215}, new float[]{0.0f, 0.5f, 1.0f});
        c0419b.m8051n(15.0f).m8053p(t100.d(30.0f)).m8049l(1200L).m8052o(1);
        this.f4712f.setShimmerConfig(c0419b);
        if (upa.d3()) {
            xdl0.C0(this, t100.d(96.0f));
            xdl0.X(this.f4707a, t100.d(16.0f));
            xdl0.X(this.f4708b, t100.d(16.0f));
            xdl0.X(this.f4709c, t100.d(54.0f));
        }
        if (upa.z()) {
            int i = pi6.f18601Q;
            xdl0.D0(t100.g + i, new View[]{this});
            xdl0.C0(this, t100.R);
            VDraweeView vDraweeView = this.f4707a;
            int i2 = t100.m;
            xdl0.X(vDraweeView, i2);
            xdl0.X(this.f4708b, i2);
            rd6.m21523v(i, this.f4707a);
            rd6.m21523v(i, this.f4708b);
            xdl0.X(this.f4709c, t100.d(65.0f));
            this.f4713g.setTextColor(-16777216);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m6702p(View view, float f) {
        view.setAlpha(f);
        view.setScaleX(f);
        view.setScaleY(f);
    }

    /* JADX INFO: renamed from: q */
    public final void m6703q(SVGAnimationView sVGAnimationView) {
        sVGAnimationView.setAlpha(1.0f);
        SVGALoader.with(m6696h()).from("https://auto.tancdn.com/v1/raw/a551cbdf-edb0-4613-bdae-86bb8bf034e814.svga").animListener(new C0349b(sVGAnimationView)).repeatCount(1).into(sVGAnimationView);
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m6698l(User user, SVGAnimationView sVGAnimationView) {
        if (TextUtils.isEmpty(f4706k)) {
            qib0.G.Q0(this.f4715i[this.f4714h], m6694k(user));
            m6702p(this.f4715i[this.f4714h], 1.0f);
            int i = (this.f4714h + 1) % 2;
            this.f4714h = i;
            m6702p(this.f4715i[i], 0.0f);
            m6703q(sVGAnimationView);
            m6706t(((DbObject) user).id);
        } else if (!TextUtils.equals(f4706k, ((DbObject) user).id)) {
            m6706t(((DbObject) user).id);
            qib0.G.Q0(this.f4715i[this.f4714h], m6694k(user));
            m6705s(this.f4714h);
            this.f4714h = (this.f4714h + 1) % 2;
        }
        f4706k = ((DbObject) user).id;
        this.f4713g.setText(user.name);
    }

    /* JADX INFO: renamed from: s */
    public final void m6705s(int i) {
        this.f4715i[i].setAlpha(0.0f);
        this.f4715i[i].setScaleX(0.0f);
        this.f4715i[i].setScaleY(0.0f);
        int i2 = (i + 1) % 2;
        ValueAnimator valueAnimator = this.f4716j;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f4716j.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4716j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(370L);
        this.f4716j.addUpdateListener(new C0348a(i, i2));
        bt0.f(this.f4716j, new Runnable() { // from class: l.hc30
            @Override // java.lang.Runnable
            public final void run() {
                this.f13959a.m6700n();
            }
        });
        this.f4716j.start();
    }

    /* JADX INFO: renamed from: t */
    public final void m6706t(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(o6j0.a.h("moments_user_id", str));
        o6j0.h("e_new_match_notification", "p_messages_view", (o6j0.a[]) arrayList.toArray(new o6j0.a[arrayList.size()]));
        if (TextUtils.isEmpty("new_match")) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(o6j0.a.h("other_user_id", str));
        arrayList2.add(o6j0.a.h("no_chat_entrance_type", "new_match"));
        o6j0.h("e_nochat_match_entrance", "p_messages_view", (o6j0.a[]) arrayList2.toArray(new o6j0.a[arrayList2.size()]));
    }

    public NewMatchItemLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4714h = 0;
        this.f4715i = new VDraweeView[2];
    }

    public NewMatchItemLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4714h = 0;
        this.f4715i = new VDraweeView[2];
    }
}
