package p149l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackgroundPriceGradient;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class zop extends byr {

    /* JADX INFO: renamed from: A */
    public LinearLayout f204139A;

    /* JADX INFO: renamed from: B */
    public ImageView f204140B;

    /* JADX INFO: renamed from: C */
    public TextView f204141C;

    /* JADX INFO: renamed from: D */
    public TextView f204142D;

    /* JADX INFO: renamed from: E */
    public rpp f204143E;

    /* JADX INFO: renamed from: F */
    public int f204144F;

    /* JADX INFO: renamed from: x */
    public View f204145x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f204146y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f204147z;

    public zop(rpp rppVar) {
        super(rppVar, rppVar.act().inflater().inflate(t6c0.f168385i9, (ViewGroup) null));
        this.f204144F = 0;
        m219582q0(m71760R());
        this.f204143E = rppVar;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m219582q0(View view) {
        app.m98168a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public final SpannableStringBuilder m219583r0(BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient) {
        return mmf0.m155392a(getContext(), bLiveVoiceBackgroundPriceGradient.expiredDuration + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).m155393a(getContext().getString(R$string.f46964Si)).m155393a(SignParameters.NEW_LINE).m155396d(1.0f).m155393a(bLiveVoiceBackgroundPriceGradient.price + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).m155393a(getContext().getString(u6n.m192015a() ? R$string.f46577Ak : R$string.f46922Qi)).m155396d(0.85f).m155394b();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m219584s0(View view) {
        Integer num = (Integer) view.getTag();
        if (this.f204144F != num.intValue()) {
            this.f204139A.getChildAt(this.f204144F).setSelected(false);
            this.f204144F = num.intValue();
            view.setSelected(true);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m219585t0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m219586u0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, View view) {
        if (this.f204144F < bLiveVoiceBackGroundPics.priceGradient.size()) {
            this.f204143E.m180384V3(bLiveVoiceBackGroundPics.f44483id, bLiveVoiceBackGroundPics.priceGradient.get(this.f204144F), this.f204140B.isSelected());
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m219587v0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        int iMin = Math.min(bLiveVoiceBackGroundPics.priceGradient.size(), this.f204139A.getChildCount());
        int i = 0;
        while (i < iMin) {
            View childAt = this.f204139A.getChildAt(i);
            childAt.setTag(Integer.valueOf(i));
            if (childAt instanceof TextView) {
                ((TextView) childAt).setText(m219583r0(bLiveVoiceBackGroundPics.priceGradient.get(i)));
                childAt.setSelected(i == this.f204144F);
            }
            xdl0.m208329E0(childAt, new View.OnClickListener() { // from class: l.yop
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f199316a.m219584s0(view);
                }
            });
            i++;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m219588w0(final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        show();
        this.f204140B.setSelected(true);
        if (!TextUtils.isEmpty(bLiveVoiceBackGroundPics.url)) {
            hxs.m133409v("context_livingAct", this.f204147z, bLiveVoiceBackGroundPics.thumbnailUrl, t100.m186890d(107.0f), t100.m186890d(132.0f), true, false, true, null);
        }
        m219587v0(bLiveVoiceBackGroundPics);
        xdl0.m208329E0(this.f204145x, new View.OnClickListener() { // from class: l.vop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182409a.m219585t0(view);
            }
        });
        xdl0.m208329E0(this.f204141C, new View.OnClickListener() { // from class: l.wop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187456a.m219586u0(bLiveVoiceBackGroundPics, view);
            }
        });
        xdl0.m208329E0(this.f204140B, new View.OnClickListener() { // from class: l.xop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.setSelected(!view.isSelected());
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getString(R$string.f47006Ui));
        sb.append(SignParameters.NEW_LINE);
        sb.append(getContext().getString(R$string.f47027Vi));
        sb.append(SignParameters.NEW_LINE);
        sb.append(getContext().getString(R$string.f47048Wi));
        this.f204142D.setText(sb);
    }
}
