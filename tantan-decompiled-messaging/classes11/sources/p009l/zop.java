package p009l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBackgroundPriceGradient;
import com.p1.mobile.putong.live.livingroom.R;
import l.app;
import l.byr;
import l.hxs;
import l.mmf0;
import l.t100;
import l.t6c0;
import l.u6n;
import l.xdl0;
import l.ym2;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zop extends byr {

    /* JADX INFO: renamed from: A */
    public LinearLayout f23812A;

    /* JADX INFO: renamed from: B */
    public ImageView f23813B;

    /* JADX INFO: renamed from: C */
    public TextView f23814C;

    /* JADX INFO: renamed from: D */
    public TextView f23815D;

    /* JADX INFO: renamed from: E */
    public rpp f23816E;

    /* JADX INFO: renamed from: F */
    public int f23817F;

    /* JADX INFO: renamed from: x */
    public View f23818x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f23819y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f23820z;

    public zop(rpp rppVar) {
        super(rppVar, rppVar.act().inflater().inflate(t6c0.i9, (ViewGroup) null));
        this.f23817F = 0;
        m25904q0(R());
        this.f23816E = rppVar;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m25904q0(View view) {
        app.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final SpannableStringBuilder m25905r0(BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient) {
        return mmf0.a(getContext(), bLiveVoiceBackgroundPriceGradient.expiredDuration + " ").a(getContext().getString(R.string.Si)).a("\n").d(1.0f).a(bLiveVoiceBackgroundPriceGradient.price + " ").a(getContext().getString(u6n.a() ? R.string.Ak : R.string.Qi)).d(0.85f).b();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m25906s0(View view) {
        Integer num = (Integer) view.getTag();
        if (this.f23817F != num.intValue()) {
            this.f23812A.getChildAt(this.f23817F).setSelected(false);
            this.f23817F = num.intValue();
            view.setSelected(true);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m25907t0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m25908u0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, View view) {
        if (this.f23817F < bLiveVoiceBackGroundPics.priceGradient.size()) {
            this.f23816E.m21774V3(bLiveVoiceBackGroundPics.id, (BLiveVoiceBackgroundPriceGradient) bLiveVoiceBackGroundPics.priceGradient.get(this.f23817F), this.f23813B.isSelected());
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m25909v0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        int iMin = Math.min(bLiveVoiceBackGroundPics.priceGradient.size(), this.f23812A.getChildCount());
        int i = 0;
        while (i < iMin) {
            View childAt = this.f23812A.getChildAt(i);
            childAt.setTag(Integer.valueOf(i));
            if (childAt instanceof TextView) {
                ((TextView) childAt).setText(m25905r0((BLiveVoiceBackgroundPriceGradient) bLiveVoiceBackGroundPics.priceGradient.get(i)));
                childAt.setSelected(i == this.f23817F);
            }
            xdl0.E0(childAt, new View.OnClickListener() { // from class: l.yop
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23188a.m25906s0(view);
                }
            });
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    public void m25910w0(final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        show();
        this.f23813B.setSelected(true);
        if (!TextUtils.isEmpty(bLiveVoiceBackGroundPics.url)) {
            hxs.v("context_livingAct", this.f23820z, bLiveVoiceBackGroundPics.thumbnailUrl, t100.d(107.0f), t100.d(132.0f), true, false, true, (ym2) null);
        }
        m25909v0(bLiveVoiceBackGroundPics);
        xdl0.E0(this.f23818x, new View.OnClickListener() { // from class: l.vop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21714a.m25907t0(view);
            }
        });
        xdl0.E0(this.f23814C, new View.OnClickListener() { // from class: l.wop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22256a.m25908u0(bLiveVoiceBackGroundPics, view);
            }
        });
        xdl0.E0(this.f23813B, new View.OnClickListener() { // from class: l.xop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.setSelected(!view.isSelected());
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getString(R.string.Ui));
        sb.append("\n");
        sb.append(getContext().getString(R.string.Vi));
        sb.append("\n");
        sb.append(getContext().getString(R.string.Wi));
        this.f23815D.setText(sb);
    }
}
