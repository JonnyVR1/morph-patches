package com.p051p1.mobile.putong.core.newui.messages.recommend.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout;
import com.p051p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout;
import com.p051p1.mobile.putong.core.newui.view.ShimmerOptLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p153l.bnl0;
import p153l.gra;
import p153l.gt0;
import p153l.psd0;
import p153l.qa00;
import p153l.sfj0;
import p153l.sj6;
import p153l.ue6;
import p153l.uqb0;
import p153l.vx6;
import p153l.xk30;
import p153l.y20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class NewMatchItemLayout extends FrameLayout {

    /* JADX INFO: renamed from: k */
    public static String f26670k = "";

    /* JADX INFO: renamed from: a */
    public VDraweeView f26671a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f26672b;

    /* JADX INFO: renamed from: c */
    public VFrame f26673c;

    /* JADX INFO: renamed from: d */
    public VImage f26674d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f26675e;

    /* JADX INFO: renamed from: f */
    public ShimmerOptLayout f26676f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f26677g;

    /* JADX INFO: renamed from: h */
    public int f26678h;

    /* JADX INFO: renamed from: i */
    public VDraweeView[] f26679i;

    /* JADX INFO: renamed from: j */
    public ValueAnimator f26680j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout$a */
    public class C8335a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f26681a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f26682b;

        public C8335a(int i, int i2) {
            this.f26681a = i;
            this.f26682b = i2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            NewMatchItemLayout newMatchItemLayout = NewMatchItemLayout.this;
            newMatchItemLayout.m43554p(newMatchItemLayout.f26679i[this.f26681a], fFloatValue);
            NewMatchItemLayout newMatchItemLayout2 = NewMatchItemLayout.this;
            newMatchItemLayout2.m43554p(newMatchItemLayout2.f26679i[this.f26682b], 1.0f - fFloatValue);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout$b */
    public class C8336b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGAnimationView f26684a;

        public C8336b(SVGAnimationView sVGAnimationView) {
            this.f26684a = sVGAnimationView;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            this.f26684a.setAlpha(0.0f);
        }
    }

    public NewMatchItemLayout(@NonNull Context context) {
        super(context);
        this.f26678h = 0;
        this.f26679i = new VDraweeView[2];
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m43539a(int i, int i2, Intent intent) {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static void m43545i() {
        f26670k = "";
    }

    /* JADX INFO: renamed from: k */
    public static Picture.ImageUri m43546k(User user) {
        return vx6.m203838b(user).profile180();
    }

    /* JADX INFO: renamed from: g */
    public final void m43547g(View view) {
        xk30.m211340a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public PutongAct m43548h() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: j */
    public final void m43549j(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(sfj0.C20032a.m185615h("moments_user_id", str));
        sfj0.m185596c("e_new_match_notification", OMSDialogPositon.p_messages_view, (sfj0.C20032a[]) arrayList.toArray(new sfj0.C20032a[arrayList.size()]));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(sfj0.C20032a.m185615h("other_user_id", str));
        arrayList2.add(sfj0.C20032a.m185615h("no_chat_entrance_type", "new_match"));
        sfj0.m185596c("e_nochat_match_entrance", OMSDialogPositon.p_messages_view, (sfj0.C20032a[]) arrayList2.toArray(new sfj0.C20032a[arrayList2.size()]));
        ((Act) getContext()).startActivityForResult(MessagesAct.m50127l2(getContext(), str, false, false, 26), new C4468a.a() { // from class: l.wk30
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return NewMatchItemLayout.m43539a(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m43551m(ConversationHeadRecommendLayout.C8266c c8266c, View view) {
        m43549j(c8266c.f25519d);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m43552n() {
        this.f26676f.m44955b();
    }

    /* JADX INFO: renamed from: o */
    public void m43553o(ConversationHeadRecommendLayout.C8265b c8265b, final ConversationHeadRecommendLayout.C8266c c8266c, final SVGAnimationView sVGAnimationView) {
        c8265b.mo68557c(m43548h(), CoreModule.f18264c.f20381e0.m116483Ka(c8266c.f25519d)).subscribe(psd0.m173596G(new y20() { // from class: l.tk30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174648a.m43550l(sVGAnimationView, (User) obj);
            }
        }));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.uk30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179358a.m43551m(c8266c, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43547g(this);
        VDraweeView[] vDraweeViewArr = this.f26679i;
        vDraweeViewArr[0] = this.f26671a;
        vDraweeViewArr[1] = this.f26672b;
        ShimmerOptLayout.C8418b c8418b = new ShimmerOptLayout.C8418b(new int[]{16777215, -1291845633, 16777215}, new float[]{0.0f, 0.5f, 1.0f});
        c8418b.m44973n(15.0f).m44975p(qa00.m175859d(30.0f)).m44971l(1200L).m44974o(1);
        this.f26676f.setShimmerConfig(c8418b);
        if (gra.m131672d3()) {
            bnl0.m105505C0(this, qa00.m175859d(96.0f));
            bnl0.m105540X(this.f26671a, qa00.m175859d(16.0f));
            bnl0.m105540X(this.f26672b, qa00.m175859d(16.0f));
            bnl0.m105540X(this.f26673c, qa00.m175859d(54.0f));
        }
        if (gra.m131778z()) {
            int i = sj6.f168905Q;
            bnl0.m105507D0(qa00.f156320g + i, this);
            bnl0.m105505C0(this, qa00.f156305R);
            VDraweeView vDraweeView = this.f26671a;
            int i2 = qa00.f156326m;
            bnl0.m105540X(vDraweeView, i2);
            bnl0.m105540X(this.f26672b, i2);
            ue6.m195676v(i, this.f26671a);
            ue6.m195676v(i, this.f26672b);
            bnl0.m105540X(this.f26673c, qa00.m175859d(65.0f));
            this.f26677g.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m43554p(View view, float f) {
        view.setAlpha(f);
        view.setScaleX(f);
        view.setScaleY(f);
    }

    /* JADX INFO: renamed from: q */
    public final void m43555q(SVGAnimationView sVGAnimationView) {
        sVGAnimationView.setAlpha(1.0f);
        SVGALoader.with(m43548h()).from("https://auto.tancdn.com/v1/raw/a551cbdf-edb0-4613-bdae-86bb8bf034e814.svga").animListener(new C8336b(sVGAnimationView)).repeatCount(1).into(sVGAnimationView);
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m43550l(User user, SVGAnimationView sVGAnimationView) {
        if (TextUtils.isEmpty(f26670k)) {
            uqb0.f180374G.m127125Q0(this.f26679i[this.f26678h], m43546k(user));
            m43554p(this.f26679i[this.f26678h], 1.0f);
            int i = (this.f26678h + 1) % 2;
            this.f26678h = i;
            m43554p(this.f26679i[i], 0.0f);
            m43555q(sVGAnimationView);
            m43558t(user.f56859id);
        } else if (!TextUtils.equals(f26670k, user.f56859id)) {
            m43558t(user.f56859id);
            uqb0.f180374G.m127125Q0(this.f26679i[this.f26678h], m43546k(user));
            m43557s(this.f26678h);
            this.f26678h = (this.f26678h + 1) % 2;
        }
        f26670k = user.f56859id;
        this.f26677g.setText(user.name);
    }

    /* JADX INFO: renamed from: s */
    public final void m43557s(int i) {
        this.f26679i[i].setAlpha(0.0f);
        this.f26679i[i].setScaleX(0.0f);
        this.f26679i[i].setScaleY(0.0f);
        int i2 = (i + 1) % 2;
        ValueAnimator valueAnimator = this.f26680j;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f26680j.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f26680j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(370L);
        this.f26680j.addUpdateListener(new C8335a(i, i2));
        gt0.m132160f(this.f26680j, new Runnable() { // from class: l.vk30
            @Override // java.lang.Runnable
            public final void run() {
                this.f184456a.m43552n();
            }
        });
        this.f26680j.start();
    }

    /* JADX INFO: renamed from: t */
    public final void m43558t(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(sfj0.C20032a.m185615h("moments_user_id", str));
        sfj0.m185601h("e_new_match_notification", OMSDialogPositon.p_messages_view, (sfj0.C20032a[]) arrayList.toArray(new sfj0.C20032a[arrayList.size()]));
        if (TextUtils.isEmpty("new_match")) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(sfj0.C20032a.m185615h("other_user_id", str));
        arrayList2.add(sfj0.C20032a.m185615h("no_chat_entrance_type", "new_match"));
        sfj0.m185601h("e_nochat_match_entrance", OMSDialogPositon.p_messages_view, (sfj0.C20032a[]) arrayList2.toArray(new sfj0.C20032a[arrayList2.size()]));
    }

    public NewMatchItemLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26678h = 0;
        this.f26679i = new VDraweeView[2];
    }

    public NewMatchItemLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26678h = 0;
        this.f26679i = new VDraweeView[2];
    }
}
