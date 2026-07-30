package p153l;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class ook0 extends d3q<RelativeLayout> {

    /* JADX INFO: renamed from: a */
    public final String f148373a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCall f148374b;

    /* JADX INFO: renamed from: c */
    public nsv<User> f148375c;

    /* JADX INFO: renamed from: d */
    public y20<ook0> f148376d;

    /* JADX INFO: renamed from: e */
    public y20<String> f148377e;

    public ook0(BLiveVoiceCall bLiveVoiceCall, nsv<User> nsvVar) {
        this.f148373a = bLiveVoiceCall.f45333id;
        this.f148374b = bLiveVoiceCall;
        this.f148375c = nsvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m168588K(View view) {
        this.f148376d.call(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m168589L(View view) {
        this.f148377e.call(this.f148374b.user);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:12:0x0119  */
    /* JADX WARN: Code duplicated, block: B:15:0x0126  */
    /* JADX WARN: Code duplicated, block: B:17:0x0177  */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0126, please report this as an issue */
    @Override // p153l.d3q
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo71749u(RelativeLayout relativeLayout) {
        TextView textView;
        User user;
        super.mo71749u(relativeLayout);
        VDraweeView vDraweeView = (VDraweeView) relativeLayout.findViewById(mdc0.f136048S2);
        TextView textView2 = (TextView) relativeLayout.findViewById(mdc0.f136271p7);
        TextView textView3 = (TextView) relativeLayout.findViewById(mdc0.f136235l7);
        TextView textView4 = (TextView) relativeLayout.findViewById(mdc0.f136289r7);
        ImageView imageView = (ImageView) relativeLayout.findViewById(mdc0.f136039R2);
        FrameLayout frameLayout = (FrameLayout) relativeLayout.findViewById(mdc0.f135948H1);
        TextView textView5 = (TextView) relativeLayout.findViewById(mdc0.f136135b7);
        TextView textView6 = (TextView) relativeLayout.findViewById(mdc0.f135891A7);
        TextView textView7 = (TextView) relativeLayout.findViewById(mdc0.f136175f7);
        ql3.m176985c(vDraweeView, this.f148375c, new qcj() { // from class: l.lok0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().profileSmall().formatted();
            }
        });
        textView2.setText(this.f148375c.f143542a.name);
        imageView.clearAnimation();
        bnl0.m105524M(textView4, false);
        bnl0.m105524M(imageView, false);
        bnl0.m105524M(textView3, false);
        frameLayout.setBackgroundResource(obc0.f146453p7);
        if (!guk0.m132334m(this.f148374b)) {
            if (guk0.m132333l(this.f148374b)) {
                bnl0.m105524M(imageView, true);
                textView = textView7;
                ObjectAnimator objectAnimator = (ObjectAnimator) gt0.m132170p(imageView, BLiveGiftItem.TYPE_ROTATION, 0L, 600L, new LinearInterpolator(), 0.0f, 360.0f);
                objectAnimator.setRepeatCount(-1);
                objectAnimator.start();
            }
            bnl0.m105509E0(textView4, new View.OnClickListener() { // from class: l.mok0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f137837a.m168588K(view);
                }
            });
            bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.nok0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f142993a.m168589L(view);
                }
            });
            egu.m120808c(this.f148375c.f143542a, textView5);
            bnl0.m105524M(textView5, true);
            user = this.f148375c.f143542a;
            if (user.profile != null) {
                textView6.setText(q8g0.m175804j0(user.profile.zodiac));
                textView6.setBackgroundDrawable(jde.m144406b(q8g0.m175806l0(this.f148375c.f143542a.profile.zodiac), qa00.m175859d(2.0f)));
                bnl0.m105524M(textView6, true);
            } else {
                bnl0.m105524M(textView6, false);
            }
            if (this.f148375c.f143542a.location != null) {
                bnl0.m105524M(textView, false);
                return;
            }
            TextView textView8 = textView;
            bnl0.m105524M(textView8, true);
            textView8.setText(this.f148375c.f143542a.location.region.city + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + q8g0.m175811p(this.f148375c.f143542a.location.distance, true));
            textView8.setBackgroundDrawable(jde.m144406b(relativeLayout.getContext().getResources().getColor(n9c0.f140872v), (float) qa00.m175859d(2.0f)));
        }
        bnl0.m105524M(textView4, true);
        textView4.setText(R$string.f47426B);
        textView4.setTextColor(Color.parseColor("#ffffff"));
        textView = textView7;
        bnl0.m105509E0(textView4, new View.OnClickListener() { // from class: l.mok0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137837a.m168588K(view);
            }
        });
        bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.nok0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142993a.m168589L(view);
            }
        });
        egu.m120808c(this.f148375c.f143542a, textView5);
        bnl0.m105524M(textView5, true);
        user = this.f148375c.f143542a;
        if (user.profile != null) {
            textView6.setText(q8g0.m175804j0(user.profile.zodiac));
            textView6.setBackgroundDrawable(jde.m144406b(q8g0.m175806l0(this.f148375c.f143542a.profile.zodiac), qa00.m175859d(2.0f)));
            bnl0.m105524M(textView6, true);
        } else {
            bnl0.m105524M(textView6, false);
        }
        if (this.f148375c.f143542a.location != null) {
            bnl0.m105524M(textView, false);
            return;
        }
        TextView textView9 = textView;
        bnl0.m105524M(textView9, true);
        textView9.setText(this.f148375c.f143542a.location.region.city + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + q8g0.m175811p(this.f148375c.f143542a.location.distance, true));
        textView9.setBackgroundDrawable(jde.m144406b(relativeLayout.getContext().getResources().getColor(n9c0.f140872v), (float) qa00.m175859d(2.0f)));
    }

    /* JADX INFO: renamed from: O */
    public ook0 m168591O(y20<ook0> y20Var) {
        this.f148376d = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public ook0 m168592P(y20<String> y20Var) {
        this.f148377e = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public void m168593Q(BLiveVoiceCall bLiveVoiceCall) {
        this.f148374b = bLiveVoiceCall;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198703B;
    }
}
