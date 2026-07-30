package p153l;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class qop0 extends d3q<RelativeLayout> {

    /* JADX INFO: renamed from: a */
    public final String f158745a;

    /* JADX INFO: renamed from: b */
    public BLiveCall f158746b;

    /* JADX INFO: renamed from: c */
    public h64 f158747c;

    /* JADX INFO: renamed from: d */
    public y20<qop0> f158748d;

    /* JADX INFO: renamed from: e */
    public y20<qop0> f158749e;

    /* JADX INFO: renamed from: f */
    public y20<String> f158750f;

    public qop0(BLiveCall bLiveCall, h64 h64Var) {
        this.f158745a = bLiveCall.f45190id;
        this.f158746b = bLiveCall;
        this.f158747c = h64Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m177311L(View view) {
        boolean zM194538r = u54.m194538r(this.f158746b);
        BLiveCall bLiveCall = this.f158746b;
        if (zM194538r) {
            if (u54.m194537q(bLiveCall)) {
                return;
            }
            this.f158748d.call(this);
        } else if (u54.m194528h(bLiveCall) || u54.m194529i(this.f158746b)) {
            this.f158749e.call(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m177312N(View view) {
        this.f158750f.call(this.f158746b.user);
    }

    /* JADX INFO: renamed from: J */
    public BLiveCall m177313J() {
        return this.f158746b;
    }

    /* JADX INFO: renamed from: K */
    public h64 m177314K() {
        return this.f158747c;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo71749u(RelativeLayout relativeLayout) {
        super.mo71749u(relativeLayout);
        VDraweeView vDraweeView = (VDraweeView) relativeLayout.findViewById(mdc0.f136048S2);
        TextView textView = (TextView) relativeLayout.findViewById(mdc0.f136271p7);
        TextView textView2 = (TextView) relativeLayout.findViewById(mdc0.f136235l7);
        TextView textView3 = (TextView) relativeLayout.findViewById(mdc0.f136289r7);
        ImageView imageView = (ImageView) relativeLayout.findViewById(mdc0.f136039R2);
        FrameLayout frameLayout = (FrameLayout) relativeLayout.findViewById(mdc0.f135948H1);
        izs.m142868s("context_single_room", vDraweeView, this.f158747c.f107999c);
        textView.setText(this.f158747c.f107998b);
        imageView.clearAnimation();
        bnl0.m105524M(textView3, false);
        bnl0.m105524M(imageView, false);
        textView2.setText(yau.m214935c(this.f158746b.userSendRewardPoint) + relativeLayout.getContext().getString(R$string.f47862V5));
        if (u54.m194538r(this.f158746b)) {
            frameLayout.setBackgroundResource(obc0.f146566z0);
            if (u54.m194536p(this.f158746b)) {
                bnl0.m105524M(textView3, true);
                textView3.setText(R$string.f47426B);
                textView3.setTextColor(-1);
            } else if (u54.m194537q(this.f158746b)) {
                bnl0.m105524M(imageView, true);
                ObjectAnimator objectAnimator = (ObjectAnimator) gt0.m132170p(imageView, BLiveGiftItem.TYPE_ROTATION, 0L, 600L, new LinearInterpolator(), 0.0f, 360.0f);
                objectAnimator.setRepeatCount(-1);
                objectAnimator.start();
            }
        } else if (u54.m194529i(this.f158746b) || u54.m194528h(this.f158746b)) {
            bnl0.m105524M(textView3, true);
            textView3.setText(R$string.f48515z4);
            frameLayout.setBackgroundResource(obc0.f146021E7);
            textView3.setTextColor(-14606047);
        }
        textView3.setOnClickListener(new View.OnClickListener() { // from class: l.oop0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148389a.m177311L(view);
            }
        });
        bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.pop0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153421a.m177312N(view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public qop0 m177316P(y20<qop0> y20Var) {
        this.f158748d = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public qop0 m177317Q(y20<String> y20Var) {
        this.f158750f = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: R */
    public qop0 m177318R(y20<qop0> y20Var) {
        this.f158749e = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: S */
    public void m177319S(BLiveCall bLiveCall) {
        this.f158746b = bLiveCall;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198703B;
    }
}
