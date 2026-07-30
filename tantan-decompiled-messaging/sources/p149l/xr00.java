package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentDetailAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentView;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfilePreviewAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfileTextAct;
import p147v.VFrame;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class xr00 implements s7m<tr00> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f194064a;

    /* JADX INFO: renamed from: b */
    public VScroll f194065b;

    /* JADX INFO: renamed from: c */
    public VText f194066c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f194067d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f194068e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f194069f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f194070g;

    /* JADX INFO: renamed from: h */
    public ImageView f194071h;

    /* JADX INFO: renamed from: i */
    public VFrame f194072i;

    /* JADX INFO: renamed from: j */
    public VText f194073j;

    /* JADX INFO: renamed from: k */
    public tr00 f194074k;

    /* JADX INFO: renamed from: l */
    public MomentsInProfileTextAct f194075l;

    /* JADX INFO: renamed from: l.xr00$a */
    public class C21203a implements VScroll.InterfaceC22566a {
        public C21203a() {
        }

        @Override // p147v.VScroll.InterfaceC22566a
        /* JADX INFO: renamed from: a */
        public void mo43191a(VScroll vScroll, int i, int i2, int i3, int i4) {
            xr00 xr00Var = xr00.this;
            xdl0.m208345M0(xr00Var.f194067d, i2 < (xr00Var.f194066c.getHeight() - xr00.this.f194065b.getHeight()) - t100.m186890d(4.0f));
        }
    }

    public xr00(MomentsInProfileTextAct momentsInProfileTextAct) {
        this.f194075l = momentsInProfileTextAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f194075l;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f194075l;
    }

    /* JADX INFO: renamed from: d */
    public View m210621d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yr00.m215768b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(tr00 tr00Var) {
        this.f194074k = tr00Var;
    }

    /* JADX INFO: renamed from: f */
    public void m210623f(final Moment moment, int i) {
        act().setTitle(mqi0.m155946q().format(Double.valueOf(moment.createdTime)));
        this.f194066c.setText(moment.value);
        boolean zEquals = TEnum.equals(moment.status(), "normal");
        FrameLayout frameLayout = this.f194070g;
        if (zEquals) {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.ur00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f177799a.m210624i(moment, view);
                }
            });
            this.f194072i.setOnClickListener(new View.OnClickListener() { // from class: l.vr00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182689a.m210625j(moment, view);
                }
            });
            xdl0.m208411y(this.f194070g, true);
            xdl0.m208411y(this.f194072i, true);
        } else {
            xdl0.m208411y(frameLayout, false);
            xdl0.m208411y(this.f194072i, false);
        }
        int i2 = f3c0.f94499d2;
        ImageView imageView = this.f194071h;
        if (!moment.haveLiked) {
            i2 = f3c0.f94591o6;
        }
        imageView.setImageResource(i2);
        MomentsInProfilePreviewAct.m66943o3(moment, this.f194069f, i, this.f194073j, this.f194075l.f43941c);
        this.f194066c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.wr00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f187749a.m210626k(moment, view);
            }
        });
        if (qib0.f154713b0.f139231b.isCurrentMessageBlock(moment.owner)) {
            xdl0.m208344M(this.f194069f, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m210624i(Moment moment, View view) {
        MomentView.m66737h0(moment, this.f194071h, true);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m210621d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m210625j(Moment moment, View view) {
        MomentsInProfileTextAct momentsInProfileTextAct = this.f194075l;
        momentsInProfileTextAct.startActivity(MomentDetailAct.m66660V1(momentsInProfileTextAct, moment.f56011id, moment.owner, true, false));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m210626k(Moment moment, View view) {
        i0e.m133793b(act(), moment.value);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m210627r() {
        this.f194067d.setBackgroundDrawable(this.f194074k.m190360n0());
        this.f194065b.m223193d(new C21203a());
        xdl0.m208345M0(this.f194068e, this.f194074k.m190361o0() || this.f194074k.m190362p0());
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
