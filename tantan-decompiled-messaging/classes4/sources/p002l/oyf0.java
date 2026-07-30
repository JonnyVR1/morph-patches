package p002l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.live.base.data.BLiveStormDanmakuTip;
import com.p1.mobile.putong.live.base.data.BLiveStormDanmakuTipContent;
import java.util.List;
import l.dac0;
import l.e30;
import l.t100;
import l.vwb;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oyf0 extends dac0<BLiveStormDanmakuTip> {

    /* JADX INFO: renamed from: c */
    public iyf0 f16908c;

    /* JADX INFO: renamed from: d */
    public List<BLiveStormDanmakuTip> f16909d;

    public oyf0(iyf0 iyf0Var, List<BLiveStormDanmakuTip> list) {
        this.f16908c = iyf0Var;
        this.f16909d = list;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m19898E(SpannableStringBuilder spannableStringBuilder, BLiveStormDanmakuTipContent bLiveStormDanmakuTipContent) {
        String str = "{" + bLiveStormDanmakuTipContent.key + "}";
        int iIndexOf = spannableStringBuilder.toString().indexOf(str);
        if (iIndexOf >= 0) {
            spannableStringBuilder.replace(iIndexOf, str.length() + iIndexOf, (CharSequence) bLiveStormDanmakuTipContent.value);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(bLiveStormDanmakuTipContent.color)), iIndexOf, bLiveStormDanmakuTipContent.value.length() + iIndexOf, 34);
        }
    }

    /* JADX INFO: renamed from: C */
    public int m19901C() {
        if (vwb.J(this.f16909d)) {
            return 0;
        }
        return this.f16909d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m19902D(ViewGroup viewGroup, int i) {
        VText vText = new VText(viewGroup.getContext());
        vText.setTextSize(13.0f);
        int i2 = t100.k;
        vText.setPadding(i2, 0, i2, 0);
        vText.setGravity(17);
        vText.setLayoutParams(new RecyclerView.p(-2, t100.y));
        vText.setTextColor(-1);
        vText.setMaxLines(1);
        return vText;
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m19900A(View view, BLiveStormDanmakuTip bLiveStormDanmakuTip, int i, final int i2) {
        bLiveStormDanmakuTip.toJson();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.k);
        if (i2 == this.f16908c.m15515S3()) {
            gradientDrawable.setStroke(t100.d, Color.parseColor(bLiveStormDanmakuTip.borderColor));
        } else {
            gradientDrawable.setColor(150994943);
        }
        view.setBackground(gradientDrawable);
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bLiveStormDanmakuTip.text);
        if (!vwb.J(bLiveStormDanmakuTip.fields)) {
            vwb.z(bLiveStormDanmakuTip.fields, new e30() { // from class: l.myf0
                public final void call(Object obj) {
                    oyf0.m19898E(spannableStringBuilder, (BLiveStormDanmakuTipContent) obj);
                }
            });
        }
        ((TextView) view).setText(spannableStringBuilder);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.nyf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f16307a.m19905I(i2, view2);
            }
        });
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveStormDanmakuTip getItem(int i) {
        return this.f16909d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m19905I(int i, View view) {
        this.f16908c.m15521X3(i);
    }
}
