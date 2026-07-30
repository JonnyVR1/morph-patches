package p153l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackgroundPriceGradient;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class zqp extends c0s {

    /* JADX INFO: renamed from: A */
    public LinearLayout f205638A;

    /* JADX INFO: renamed from: B */
    public ImageView f205639B;

    /* JADX INFO: renamed from: C */
    public TextView f205640C;

    /* JADX INFO: renamed from: D */
    public TextView f205641D;

    /* JADX INFO: renamed from: E */
    public rrp f205642E;

    /* JADX INFO: renamed from: F */
    public int f205643F;

    /* JADX INFO: renamed from: x */
    public View f205644x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f205645y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f205646z;

    public zqp(rrp rrpVar) {
        super(rrpVar, rrpVar.act().inflater().inflate(yec0.f199117i9, (ViewGroup) null));
        this.f205643F = 0;
        m221028q0(m72943R());
        this.f205642E = rrpVar;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m221028q0(View view) {
        arp.m99765a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public final SpannableStringBuilder m221029r0(BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient) {
        return vuf0.m202788a(getContext(), bLiveVoiceBackgroundPriceGradient.expiredDuration + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).m202789a(getContext().getString(R$string.f47812Si)).m202789a(SignParameters.NEW_LINE).m202792d(1.0f).m202789a(bLiveVoiceBackgroundPriceGradient.price + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).m202789a(getContext().getString(u8n.m195065a() ? R$string.f47425Ak : R$string.f47770Qi)).m202792d(0.85f).m202790b();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m221030s0(View view) {
        Integer num = (Integer) view.getTag();
        if (this.f205643F != num.intValue()) {
            this.f205638A.getChildAt(this.f205643F).setSelected(false);
            this.f205643F = num.intValue();
            view.setSelected(true);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m221031t0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m221032u0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, View view) {
        if (this.f205643F < bLiveVoiceBackGroundPics.priceGradient.size()) {
            this.f205642E.m182802V3(bLiveVoiceBackGroundPics.f45331id, bLiveVoiceBackGroundPics.priceGradient.get(this.f205643F), this.f205639B.isSelected());
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m221033v0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        int iMin = Math.min(bLiveVoiceBackGroundPics.priceGradient.size(), this.f205638A.getChildCount());
        int i = 0;
        while (i < iMin) {
            View childAt = this.f205638A.getChildAt(i);
            childAt.setTag(Integer.valueOf(i));
            if (childAt instanceof TextView) {
                ((TextView) childAt).setText(m221029r0(bLiveVoiceBackGroundPics.priceGradient.get(i)));
                childAt.setSelected(i == this.f205643F);
            }
            bnl0.m105509E0(childAt, new View.OnClickListener() { // from class: l.yqp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f201232a.m221030s0(view);
                }
            });
            i++;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m221034w0(final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        show();
        this.f205639B.setSelected(true);
        if (!TextUtils.isEmpty(bLiveVoiceBackGroundPics.url)) {
            izs.m142871v("context_livingAct", this.f205646z, bLiveVoiceBackGroundPics.thumbnailUrl, qa00.m175859d(107.0f), qa00.m175859d(132.0f), true, false, true, null);
        }
        m221033v0(bLiveVoiceBackGroundPics);
        bnl0.m105509E0(this.f205644x, new View.OnClickListener() { // from class: l.vqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185387a.m221031t0(view);
            }
        });
        bnl0.m105509E0(this.f205640C, new View.OnClickListener() { // from class: l.wqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190424a.m221032u0(bLiveVoiceBackGroundPics, view);
            }
        });
        bnl0.m105509E0(this.f205639B, new View.OnClickListener() { // from class: l.xqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.setSelected(!view.isSelected());
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getString(R$string.f47854Ui));
        sb.append(SignParameters.NEW_LINE);
        sb.append(getContext().getString(R$string.f47875Vi));
        sb.append(SignParameters.NEW_LINE);
        sb.append(getContext().getString(R$string.f47896Wi));
        this.f205641D.setText(sb);
    }
}
