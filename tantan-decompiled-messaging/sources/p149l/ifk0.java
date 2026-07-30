package p149l;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class ifk0 extends d1q<RelativeLayout> {

    /* JADX INFO: renamed from: a */
    public final String f113030a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCall f113031b;

    /* JADX INFO: renamed from: c */
    public mqv<User> f113032c;

    /* JADX INFO: renamed from: d */
    public e30<ifk0> f113033d;

    /* JADX INFO: renamed from: e */
    public e30<String> f113034e;

    public ifk0(BLiveVoiceCall bLiveVoiceCall, mqv<User> mqvVar) {
        this.f113030a = bLiveVoiceCall.f44485id;
        this.f113031b = bLiveVoiceCall;
        this.f113032c = mqvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m135940K(View view) {
        this.f113033d.call(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m135941L(View view) {
        this.f113034e.call(this.f113031b.user);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:12:0x0119  */
    /* JADX WARN: Code duplicated, block: B:15:0x0126  */
    /* JADX WARN: Code duplicated, block: B:17:0x0177  */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0126, please report this as an issue */
    @Override // p149l.d1q
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo70566u(RelativeLayout relativeLayout) {
        TextView textView;
        User user;
        super.mo70566u(relativeLayout);
        VDraweeView vDraweeView = (VDraweeView) relativeLayout.findViewById(g5c0.f100803S2);
        TextView textView2 = (TextView) relativeLayout.findViewById(g5c0.f101026p7);
        TextView textView3 = (TextView) relativeLayout.findViewById(g5c0.f100990l7);
        TextView textView4 = (TextView) relativeLayout.findViewById(g5c0.f101044r7);
        ImageView imageView = (ImageView) relativeLayout.findViewById(g5c0.f100794R2);
        FrameLayout frameLayout = (FrameLayout) relativeLayout.findViewById(g5c0.f100703H1);
        TextView textView5 = (TextView) relativeLayout.findViewById(g5c0.f100890b7);
        TextView textView6 = (TextView) relativeLayout.findViewById(g5c0.f100646A7);
        TextView textView7 = (TextView) relativeLayout.findViewById(g5c0.f100930f7);
        wk3.m203644c(vDraweeView, this.f113032c, new w9j() { // from class: l.ffk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().profileSmall().formatted();
            }
        });
        textView2.setText(this.f113032c.f135304a.name);
        imageView.clearAnimation();
        xdl0.m208344M(textView4, false);
        xdl0.m208344M(imageView, false);
        xdl0.m208344M(textView3, false);
        frameLayout.setBackgroundResource(i3c0.f111125p7);
        if (!alk0.m97314m(this.f113031b)) {
            if (alk0.m97313l(this.f113031b)) {
                xdl0.m208344M(imageView, true);
                textView = textView7;
                ObjectAnimator objectAnimator = (ObjectAnimator) bt0.m103743p(imageView, BLiveGiftItem.TYPE_ROTATION, 0L, 600L, new LinearInterpolator(), 0.0f, 360.0f);
                objectAnimator.setRepeatCount(-1);
                objectAnimator.start();
            }
            xdl0.m208329E0(textView4, new View.OnClickListener() { // from class: l.gfk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f102401a.m135940K(view);
                }
            });
            xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.hfk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f107493a.m135941L(view);
                }
            });
            deu.m111400c(this.f113032c.f135304a, textView5);
            xdl0.m208344M(textView5, true);
            user = this.f113032c.f135304a;
            if (user.profile != null) {
                textView6.setText(i0g0.m133869j0(user.profile.zodiac));
                textView6.setBackgroundDrawable(fce.m120425b(i0g0.m133871l0(this.f113032c.f135304a.profile.zodiac), t100.m186890d(2.0f)));
                xdl0.m208344M(textView6, true);
            } else {
                xdl0.m208344M(textView6, false);
            }
            if (this.f113032c.f135304a.location != null) {
                xdl0.m208344M(textView, false);
                return;
            }
            TextView textView8 = textView;
            xdl0.m208344M(textView8, true);
            textView8.setText(this.f113032c.f135304a.location.region.city + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i0g0.m133876p(this.f113032c.f135304a.location.distance, true));
            textView8.setBackgroundDrawable(fce.m120425b(relativeLayout.getContext().getResources().getColor(h1c0.f105411v), (float) t100.m186890d(2.0f)));
        }
        xdl0.m208344M(textView4, true);
        textView4.setText(R$string.f46578B);
        textView4.setTextColor(Color.parseColor("#ffffff"));
        textView = textView7;
        xdl0.m208329E0(textView4, new View.OnClickListener() { // from class: l.gfk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102401a.m135940K(view);
            }
        });
        xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.hfk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107493a.m135941L(view);
            }
        });
        deu.m111400c(this.f113032c.f135304a, textView5);
        xdl0.m208344M(textView5, true);
        user = this.f113032c.f135304a;
        if (user.profile != null) {
            textView6.setText(i0g0.m133869j0(user.profile.zodiac));
            textView6.setBackgroundDrawable(fce.m120425b(i0g0.m133871l0(this.f113032c.f135304a.profile.zodiac), t100.m186890d(2.0f)));
            xdl0.m208344M(textView6, true);
        } else {
            xdl0.m208344M(textView6, false);
        }
        if (this.f113032c.f135304a.location != null) {
            xdl0.m208344M(textView, false);
            return;
        }
        TextView textView9 = textView;
        xdl0.m208344M(textView9, true);
        textView9.setText(this.f113032c.f135304a.location.region.city + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i0g0.m133876p(this.f113032c.f135304a.location.distance, true));
        textView9.setBackgroundDrawable(fce.m120425b(relativeLayout.getContext().getResources().getColor(h1c0.f105411v), (float) t100.m186890d(2.0f)));
    }

    /* JADX INFO: renamed from: O */
    public ifk0 m135943O(e30<ifk0> e30Var) {
        this.f113033d = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public ifk0 m135944P(e30<String> e30Var) {
        this.f113034e = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public void m135945Q(BLiveVoiceCall bLiveVoiceCall) {
        this.f113031b = bLiveVoiceCall;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f167971B;
    }
}
