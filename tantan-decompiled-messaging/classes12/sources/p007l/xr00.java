package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentDetailAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentView;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfilePreviewAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfileTextAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.data.DbObject;
import l.i0e;
import l.mqi0;
import l.qib0;
import l.s7m;
import l.t100;
import l.xdl0;
import v.VFrame;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xr00 implements s7m<tr00> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f15074a;

    /* JADX INFO: renamed from: b */
    public VScroll f15075b;

    /* JADX INFO: renamed from: c */
    public VText f15076c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f15077d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f15078e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f15079f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f15080g;

    /* JADX INFO: renamed from: h */
    public ImageView f15081h;

    /* JADX INFO: renamed from: i */
    public VFrame f15082i;

    /* JADX INFO: renamed from: j */
    public VText f15083j;

    /* JADX INFO: renamed from: k */
    public tr00 f15084k;

    /* JADX INFO: renamed from: l */
    public MomentsInProfileTextAct f15085l;

    /* JADX INFO: renamed from: l.xr00$a */
    public class C2533a implements VScroll.a {
        public C2533a() {
        }

        /* JADX INFO: renamed from: a */
        public void m16815a(VScroll vScroll, int i, int i2, int i3, int i4) {
            xr00 xr00Var = xr00.this;
            xdl0.M0(xr00Var.f15077d, i2 < (xr00Var.f15076c.getHeight() - xr00.this.f15075b.getHeight()) - t100.d(4.0f));
        }
    }

    public xr00(MomentsInProfileTextAct momentsInProfileTextAct) {
        this.f15085l = momentsInProfileTextAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m16806C0() {
        return this.f15085l;
    }

    @Nullable
    public Act act() {
        return this.f15085l;
    }

    /* JADX INFO: renamed from: d */
    public View m16807d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yr00.m17193b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m16811i1(tr00 tr00Var) {
        this.f15084k = tr00Var;
    }

    /* JADX INFO: renamed from: f */
    public void m16809f(final Moment moment, int i) {
        act().setTitle(mqi0.q().format(Double.valueOf(moment.createdTime)));
        this.f15076c.setText(moment.value);
        boolean zEquals = TEnum.equals(moment.status(), "normal");
        FrameLayout frameLayout = this.f15080g;
        if (zEquals) {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.ur00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13918a.m16810i(moment, view);
                }
            });
            this.f15082i.setOnClickListener(new View.OnClickListener() { // from class: l.vr00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14282a.m16812j(moment, view);
                }
            });
            xdl0.y(this.f15080g, true);
            xdl0.y(this.f15082i, true);
        } else {
            xdl0.y(frameLayout, false);
            xdl0.y(this.f15082i, false);
        }
        int i2 = f3c0.f7782d2;
        ImageView imageView = this.f15081h;
        if (!moment.haveLiked) {
            i2 = f3c0.f7874o6;
        }
        imageView.setImageResource(i2);
        MomentsInProfilePreviewAct.m8141o3(moment, this.f15079f, i, this.f15083j, this.f15085l.f5402c);
        this.f15076c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.wr00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f14663a.m16813k(moment, view);
            }
        });
        if (qib0.b0.b.isCurrentMessageBlock(moment.owner)) {
            xdl0.M(this.f15079f, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m16810i(Moment moment, View view) {
        MomentView.m7928h0(moment, this.f15081h, true);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m16807d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m16812j(Moment moment, View view) {
        PutongAct putongAct = this.f15085l;
        putongAct.startActivity(MomentDetailAct.m7851V1(putongAct, ((DbObject) moment).id, moment.owner, true, false));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m16813k(Moment moment, View view) {
        i0e.b(act(), moment.value);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m16814r() {
        this.f15077d.setBackgroundDrawable(this.f15084k.m14612n0());
        this.f15075b.d(new C2533a());
        xdl0.M0(this.f15078e, this.f15084k.m14613o0() || this.f15084k.m14614p0());
    }

    public void destroy() {
    }
}
