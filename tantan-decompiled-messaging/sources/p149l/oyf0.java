package p149l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuTip;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuTipContent;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class oyf0 extends dac0<BLiveStormDanmakuTip> {

    /* JADX INFO: renamed from: c */
    public iyf0 f146321c;

    /* JADX INFO: renamed from: d */
    public List<BLiveStormDanmakuTip> f146322d;

    public oyf0(iyf0 iyf0Var, List<BLiveStormDanmakuTip> list) {
        this.f146321c = iyf0Var;
        this.f146322d = list;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m166661E(SpannableStringBuilder spannableStringBuilder, BLiveStormDanmakuTipContent bLiveStormDanmakuTipContent) {
        String str = "{" + bLiveStormDanmakuTipContent.key + "}";
        int iIndexOf = spannableStringBuilder.toString().indexOf(str);
        if (iIndexOf >= 0) {
            spannableStringBuilder.replace(iIndexOf, str.length() + iIndexOf, (CharSequence) bLiveStormDanmakuTipContent.value);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(bLiveStormDanmakuTipContent.color)), iIndexOf, bLiveStormDanmakuTipContent.value.length() + iIndexOf, 34);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (vwb.m200296J(this.f146322d)) {
            return 0;
        }
        return this.f146322d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        VText vText = new VText(viewGroup.getContext());
        vText.setTextSize(13.0f);
        int i2 = t100.f167262k;
        vText.setPadding(i2, 0, i2, 0);
        vText.setGravity(17);
        vText.setLayoutParams(new RecyclerView.C0578p(-2, t100.f167276y));
        vText.setTextColor(-1);
        vText.setMaxLines(1);
        return vText;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveStormDanmakuTip bLiveStormDanmakuTip, int i, final int i2) {
        bLiveStormDanmakuTip.toJson();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.f167262k);
        if (i2 == this.f146321c.m138972S3()) {
            gradientDrawable.setStroke(t100.f167255d, Color.parseColor(bLiveStormDanmakuTip.borderColor));
        } else {
            gradientDrawable.setColor(150994943);
        }
        view.setBackground(gradientDrawable);
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bLiveStormDanmakuTip.text);
        if (!vwb.m200296J(bLiveStormDanmakuTip.fields)) {
            vwb.m200354z(bLiveStormDanmakuTip.fields, new e30() { // from class: l.myf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    oyf0.m166661E(spannableStringBuilder, (BLiveStormDanmakuTipContent) obj);
                }
            });
        }
        ((TextView) view).setText(spannableStringBuilder);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.nyf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f141107a.m166665I(i2, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveStormDanmakuTip getItem(int i) {
        return this.f146322d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m166665I(int i, View view) {
        this.f146321c.m138978X3(i);
    }
}
