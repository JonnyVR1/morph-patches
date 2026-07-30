package com.p046p1.mobile.putong.core.newui.messages.recommend.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout;
import com.p046p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout;
import com.p046p1.mobile.putong.core.newui.view.ShimmerOptLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p149l.bt0;
import p149l.e30;
import p149l.jc30;
import p149l.mkd0;
import p149l.o6j0;
import p149l.pi6;
import p149l.qib0;
import p149l.rd6;
import p149l.sw6;
import p149l.t100;
import p149l.upa;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class NewMatchItemLayout extends FrameLayout {

    /* JADX INFO: renamed from: k */
    public static String f25928k = "";

    /* JADX INFO: renamed from: a */
    public VDraweeView f25929a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f25930b;

    /* JADX INFO: renamed from: c */
    public VFrame f25931c;

    /* JADX INFO: renamed from: d */
    public VImage f25932d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f25933e;

    /* JADX INFO: renamed from: f */
    public ShimmerOptLayout f25934f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f25935g;

    /* JADX INFO: renamed from: h */
    public int f25936h;

    /* JADX INFO: renamed from: i */
    public VDraweeView[] f25937i;

    /* JADX INFO: renamed from: j */
    public ValueAnimator f25938j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout$a */
    public class C8184a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25939a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25940b;

        public C8184a(int i, int i2) {
            this.f25939a = i;
            this.f25940b = i2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            NewMatchItemLayout newMatchItemLayout = NewMatchItemLayout.this;
            newMatchItemLayout.m42543p(newMatchItemLayout.f25937i[this.f25939a], fFloatValue);
            NewMatchItemLayout newMatchItemLayout2 = NewMatchItemLayout.this;
            newMatchItemLayout2.m42543p(newMatchItemLayout2.f25937i[this.f25940b], 1.0f - fFloatValue);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout$b */
    public class C8185b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGAnimationView f25942a;

        public C8185b(SVGAnimationView sVGAnimationView) {
            this.f25942a = sVGAnimationView;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            this.f25942a.setAlpha(0.0f);
        }
    }

    public NewMatchItemLayout(@NonNull Context context) {
        super(context);
        this.f25936h = 0;
        this.f25937i = new VDraweeView[2];
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m42528a(int i, int i2, Intent intent) {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static void m42534i() {
        f25928k = "";
    }

    /* JADX INFO: renamed from: k */
    public static Picture.ImageUri m42535k(User user) {
        return sw6.m186127b(user).profile180();
    }

    /* JADX INFO: renamed from: g */
    public final void m42536g(View view) {
        jc30.m140867a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public PutongAct m42537h() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: j */
    public final void m42538j(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(o6j0.C18854a.m162878h("moments_user_id", str));
        o6j0.m162859c("e_new_match_notification", OMSDialogPositon.p_messages_view, (o6j0.C18854a[]) arrayList.toArray(new o6j0.C18854a[arrayList.size()]));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(o6j0.C18854a.m162878h("other_user_id", str));
        arrayList2.add(o6j0.C18854a.m162878h("no_chat_entrance_type", "new_match"));
        o6j0.m162859c("e_nochat_match_entrance", OMSDialogPositon.p_messages_view, (o6j0.C18854a[]) arrayList2.toArray(new o6j0.C18854a[arrayList2.size()]));
        ((Act) getContext()).startActivityForResult(MessagesAct.m48944k2(getContext(), str, false, false, 26), new C4317a.a() { // from class: l.ic30
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return NewMatchItemLayout.m42528a(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m42540m(ConversationHeadRecommendLayout.C8115c c8115c, View view) {
        m42538j(c8115c.f24777d);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m42541n() {
        this.f25934f.m43769b();
    }

    /* JADX INFO: renamed from: o */
    public void m42542o(ConversationHeadRecommendLayout.C8114b c8114b, final ConversationHeadRecommendLayout.C8115c c8115c, final SVGAnimationView sVGAnimationView) {
        c8114b.mo67374c(m42537h(), CoreModule.f17545c.f19639e0.m169410Ka(c8115c.f24777d)).subscribe(mkd0.m154955G(new e30() { // from class: l.fc30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96764a.m42539l(sVGAnimationView, (User) obj);
            }
        }));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.gc30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101984a.m42540m(c8115c, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42536g(this);
        VDraweeView[] vDraweeViewArr = this.f25937i;
        vDraweeViewArr[0] = this.f25929a;
        vDraweeViewArr[1] = this.f25930b;
        ShimmerOptLayout.C8255b c8255b = new ShimmerOptLayout.C8255b(new int[]{16777215, -1291845633, 16777215}, new float[]{0.0f, 0.5f, 1.0f});
        c8255b.m43787n(15.0f).m43789p(t100.m186890d(30.0f)).m43785l(1200L).m43788o(1);
        this.f25934f.setShimmerConfig(c8255b);
        if (upa.m194741d3()) {
            xdl0.m208325C0(this, t100.m186890d(96.0f));
            xdl0.m208360X(this.f25929a, t100.m186890d(16.0f));
            xdl0.m208360X(this.f25930b, t100.m186890d(16.0f));
            xdl0.m208360X(this.f25931c, t100.m186890d(54.0f));
        }
        if (upa.m194847z()) {
            int i = pi6.f149080Q;
            xdl0.m208327D0(t100.f167258g + i, this);
            xdl0.m208325C0(this, t100.f167243R);
            VDraweeView vDraweeView = this.f25929a;
            int i2 = t100.f167264m;
            xdl0.m208360X(vDraweeView, i2);
            xdl0.m208360X(this.f25930b, i2);
            rd6.m178882v(i, this.f25929a);
            rd6.m178882v(i, this.f25930b);
            xdl0.m208360X(this.f25931c, t100.m186890d(65.0f));
            this.f25935g.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m42543p(View view, float f) {
        view.setAlpha(f);
        view.setScaleX(f);
        view.setScaleY(f);
    }

    /* JADX INFO: renamed from: q */
    public final void m42544q(SVGAnimationView sVGAnimationView) {
        sVGAnimationView.setAlpha(1.0f);
        SVGALoader.with(m42537h()).from("https://auto.tancdn.com/v1/raw/a551cbdf-edb0-4613-bdae-86bb8bf034e814.svga").animListener(new C8185b(sVGAnimationView)).repeatCount(1).into(sVGAnimationView);
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m42539l(User user, SVGAnimationView sVGAnimationView) {
        if (TextUtils.isEmpty(f25928k)) {
            qib0.f154691G.m102341Q0(this.f25937i[this.f25936h], m42535k(user));
            m42543p(this.f25937i[this.f25936h], 1.0f);
            int i = (this.f25936h + 1) % 2;
            this.f25936h = i;
            m42543p(this.f25937i[i], 0.0f);
            m42544q(sVGAnimationView);
            m42547t(user.f56011id);
        } else if (!TextUtils.equals(f25928k, user.f56011id)) {
            m42547t(user.f56011id);
            qib0.f154691G.m102341Q0(this.f25937i[this.f25936h], m42535k(user));
            m42546s(this.f25936h);
            this.f25936h = (this.f25936h + 1) % 2;
        }
        f25928k = user.f56011id;
        this.f25935g.setText(user.name);
    }

    /* JADX INFO: renamed from: s */
    public final void m42546s(int i) {
        this.f25937i[i].setAlpha(0.0f);
        this.f25937i[i].setScaleX(0.0f);
        this.f25937i[i].setScaleY(0.0f);
        int i2 = (i + 1) % 2;
        ValueAnimator valueAnimator = this.f25938j;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f25938j.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f25938j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(370L);
        this.f25938j.addUpdateListener(new C8184a(i, i2));
        bt0.m103733f(this.f25938j, new Runnable() { // from class: l.hc30
            @Override // java.lang.Runnable
            public final void run() {
                this.f107007a.m42541n();
            }
        });
        this.f25938j.start();
    }

    /* JADX INFO: renamed from: t */
    public final void m42547t(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(o6j0.C18854a.m162878h("moments_user_id", str));
        o6j0.m162864h("e_new_match_notification", OMSDialogPositon.p_messages_view, (o6j0.C18854a[]) arrayList.toArray(new o6j0.C18854a[arrayList.size()]));
        if (TextUtils.isEmpty("new_match")) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(o6j0.C18854a.m162878h("other_user_id", str));
        arrayList2.add(o6j0.C18854a.m162878h("no_chat_entrance_type", "new_match"));
        o6j0.m162864h("e_nochat_match_entrance", OMSDialogPositon.p_messages_view, (o6j0.C18854a[]) arrayList2.toArray(new o6j0.C18854a[arrayList2.size()]));
    }

    public NewMatchItemLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25936h = 0;
        this.f25937i = new VDraweeView[2];
    }

    public NewMatchItemLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25936h = 0;
        this.f25937i = new VDraweeView[2];
    }
}
