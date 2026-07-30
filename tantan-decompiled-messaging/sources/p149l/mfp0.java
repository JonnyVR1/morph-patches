package p149l;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class mfp0 extends d1q<RelativeLayout> {

    /* JADX INFO: renamed from: a */
    public final String f133608a;

    /* JADX INFO: renamed from: b */
    public BLiveCall f133609b;

    /* JADX INFO: renamed from: c */
    public i54 f133610c;

    /* JADX INFO: renamed from: d */
    public e30<mfp0> f133611d;

    /* JADX INFO: renamed from: e */
    public e30<mfp0> f133612e;

    /* JADX INFO: renamed from: f */
    public e30<String> f133613f;

    public mfp0(BLiveCall bLiveCall, i54 i54Var) {
        this.f133608a = bLiveCall.f44342id;
        this.f133609b = bLiveCall;
        this.f133610c = i54Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m154399L(View view) {
        boolean zM196950r = v44.m196950r(this.f133609b);
        BLiveCall bLiveCall = this.f133609b;
        if (zM196950r) {
            if (v44.m196949q(bLiveCall)) {
                return;
            }
            this.f133611d.call(this);
        } else if (v44.m196940h(bLiveCall) || v44.m196941i(this.f133609b)) {
            this.f133612e.call(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m154400N(View view) {
        this.f133613f.call(this.f133609b.user);
    }

    /* JADX INFO: renamed from: J */
    public BLiveCall m154401J() {
        return this.f133609b;
    }

    /* JADX INFO: renamed from: K */
    public i54 m154402K() {
        return this.f133610c;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo70566u(RelativeLayout relativeLayout) {
        super.mo70566u(relativeLayout);
        VDraweeView vDraweeView = (VDraweeView) relativeLayout.findViewById(g5c0.f100803S2);
        TextView textView = (TextView) relativeLayout.findViewById(g5c0.f101026p7);
        TextView textView2 = (TextView) relativeLayout.findViewById(g5c0.f100990l7);
        TextView textView3 = (TextView) relativeLayout.findViewById(g5c0.f101044r7);
        ImageView imageView = (ImageView) relativeLayout.findViewById(g5c0.f100794R2);
        FrameLayout frameLayout = (FrameLayout) relativeLayout.findViewById(g5c0.f100703H1);
        hxs.m133406s("context_single_room", vDraweeView, this.f133610c.f111522c);
        textView.setText(this.f133610c.f111521b);
        imageView.clearAnimation();
        xdl0.m208344M(textView3, false);
        xdl0.m208344M(imageView, false);
        textView2.setText(x8u.m207433c(this.f133609b.userSendRewardPoint) + relativeLayout.getContext().getString(R$string.f47014V5));
        if (v44.m196950r(this.f133609b)) {
            frameLayout.setBackgroundResource(i3c0.f111238z0);
            if (v44.m196948p(this.f133609b)) {
                xdl0.m208344M(textView3, true);
                textView3.setText(R$string.f46578B);
                textView3.setTextColor(-1);
            } else if (v44.m196949q(this.f133609b)) {
                xdl0.m208344M(imageView, true);
                ObjectAnimator objectAnimator = (ObjectAnimator) bt0.m103743p(imageView, BLiveGiftItem.TYPE_ROTATION, 0L, 600L, new LinearInterpolator(), 0.0f, 360.0f);
                objectAnimator.setRepeatCount(-1);
                objectAnimator.start();
            }
        } else if (v44.m196941i(this.f133609b) || v44.m196940h(this.f133609b)) {
            xdl0.m208344M(textView3, true);
            textView3.setText(R$string.f47667z4);
            frameLayout.setBackgroundResource(i3c0.f110693E7);
            textView3.setTextColor(-14606047);
        }
        textView3.setOnClickListener(new View.OnClickListener() { // from class: l.kfp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122957a.m154399L(view);
            }
        });
        xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.lfp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127916a.m154400N(view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public mfp0 m154404P(e30<mfp0> e30Var) {
        this.f133611d = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public mfp0 m154405Q(e30<String> e30Var) {
        this.f133613f = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: R */
    public mfp0 m154406R(e30<mfp0> e30Var) {
        this.f133612e = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: S */
    public void m154407S(BLiveCall bLiveCall) {
        this.f133609b = bLiveCall;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f167971B;
    }
}
