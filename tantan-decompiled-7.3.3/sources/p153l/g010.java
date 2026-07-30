package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentDetailAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentView;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfilePreviewAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfileTextAct;
import p151v.VFrame;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class g010 implements iam<c010> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f101583a;

    /* JADX INFO: renamed from: b */
    public VScroll f101584b;

    /* JADX INFO: renamed from: c */
    public VText f101585c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f101586d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f101587e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f101588f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f101589g;

    /* JADX INFO: renamed from: h */
    public ImageView f101590h;

    /* JADX INFO: renamed from: i */
    public VFrame f101591i;

    /* JADX INFO: renamed from: j */
    public VText f101592j;

    /* JADX INFO: renamed from: k */
    public c010 f101593k;

    /* JADX INFO: renamed from: l */
    public MomentsInProfileTextAct f101594l;

    /* JADX INFO: renamed from: l.g010$a */
    public class C17106a implements VScroll.InterfaceC22681a {
        public C17106a() {
        }

        @Override // p151v.VScroll.InterfaceC22681a
        /* JADX INFO: renamed from: a */
        public void mo44202a(VScroll vScroll, int i, int i2, int i3, int i4) {
            g010 g010Var = g010.this;
            bnl0.m105525M0(g010Var.f101586d, i2 < (g010Var.f101585c.getHeight() - g010.this.f101584b.getHeight()) - qa00.m175859d(4.0f));
        }
    }

    public g010(MomentsInProfileTextAct momentsInProfileTextAct) {
        this.f101594l = momentsInProfileTextAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f101594l;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f101594l;
    }

    /* JADX INFO: renamed from: d */
    public View m128376d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h010.m133145b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(c010 c010Var) {
        this.f101593k = c010Var;
    }

    /* JADX INFO: renamed from: f */
    public void m128378f(final Moment moment, int i) {
        act().setTitle(pzi0.m174456q().format(Double.valueOf(moment.createdTime)));
        this.f101585c.setText(moment.value);
        boolean zEquals = TEnum.equals(moment.status(), "normal");
        FrameLayout frameLayout = this.f101589g;
        if (zEquals) {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.d010
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f84521a.m128379i(moment, view);
                }
            });
            this.f101591i.setOnClickListener(new View.OnClickListener() { // from class: l.e010
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f91404a.m128380j(moment, view);
                }
            });
            bnl0.m105591y(this.f101589g, true);
            bnl0.m105591y(this.f101591i, true);
        } else {
            bnl0.m105591y(frameLayout, false);
            bnl0.m105591y(this.f101591i, false);
        }
        int i2 = lbc0.f131017d2;
        ImageView imageView = this.f101590h;
        if (!moment.haveLiked) {
            i2 = lbc0.f131109o6;
        }
        imageView.setImageResource(i2);
        MomentsInProfilePreviewAct.m68128q3(moment, this.f101588f, i, this.f101592j, this.f101594l.f44789c);
        this.f101585c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.f010
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f96645a.m128381k(moment, view);
            }
        });
        if (uqb0.f180396b0.f170325b.isCurrentMessageBlock(moment.owner)) {
            bnl0.m105524M(this.f101588f, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m128379i(Moment moment, View view) {
        MomentView.m67920h0(moment, this.f101590h, true);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m128376d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m128380j(Moment moment, View view) {
        MomentsInProfileTextAct momentsInProfileTextAct = this.f101594l;
        momentsInProfileTextAct.startActivity(MomentDetailAct.m67843X1(momentsInProfileTextAct, moment.f56859id, moment.owner, true, false));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m128381k(Moment moment, View view) {
        w1e.m204398b(act(), moment.value);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m128382r() {
        this.f101586d.setBackgroundDrawable(this.f101593k.m107295n0());
        this.f101584b.m224439d(new C17106a());
        bnl0.m105525M0(this.f101587e, this.f101593k.m107296o0() || this.f101593k.m107297p0());
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
