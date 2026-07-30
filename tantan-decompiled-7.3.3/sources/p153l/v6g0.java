package p153l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuTip;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuTipContent;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class v6g0 extends jic0<BLiveStormDanmakuTip> {

    /* JADX INFO: renamed from: c */
    public p6g0 f182639c;

    /* JADX INFO: renamed from: d */
    public List<BLiveStormDanmakuTip> f182640d;

    public v6g0(p6g0 p6g0Var, List<BLiveStormDanmakuTip> list) {
        this.f182639c = p6g0Var;
        this.f182640d = list;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m200051E(SpannableStringBuilder spannableStringBuilder, BLiveStormDanmakuTipContent bLiveStormDanmakuTipContent) {
        String str = "{" + bLiveStormDanmakuTipContent.key + "}";
        int iIndexOf = spannableStringBuilder.toString().indexOf(str);
        if (iIndexOf >= 0) {
            spannableStringBuilder.replace(iIndexOf, str.length() + iIndexOf, (CharSequence) bLiveStormDanmakuTipContent.value);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(bLiveStormDanmakuTipContent.color)), iIndexOf, bLiveStormDanmakuTipContent.value.length() + iIndexOf, 34);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (jyb.m147479J(this.f182640d)) {
            return 0;
        }
        return this.f182640d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        VText vText = new VText(viewGroup.getContext());
        vText.setTextSize(13.0f);
        int i2 = qa00.f156324k;
        vText.setPadding(i2, 0, i2, 0);
        vText.setGravity(17);
        vText.setLayoutParams(new RecyclerView.C0580p(-2, qa00.f156338y));
        vText.setTextColor(-1);
        vText.setMaxLines(1);
        return vText;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveStormDanmakuTip bLiveStormDanmakuTip, int i, final int i2) {
        bLiveStormDanmakuTip.toJson();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(qa00.f156324k);
        if (i2 == this.f182639c.m170877S3()) {
            gradientDrawable.setStroke(qa00.f156317d, Color.parseColor(bLiveStormDanmakuTip.borderColor));
        } else {
            gradientDrawable.setColor(150994943);
        }
        view.setBackground(gradientDrawable);
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bLiveStormDanmakuTip.text);
        if (!jyb.m147479J(bLiveStormDanmakuTip.fields)) {
            jyb.m147537z(bLiveStormDanmakuTip.fields, new y20() { // from class: l.t6g0
                @Override // p153l.y20
                public final void call(Object obj) {
                    v6g0.m200051E(spannableStringBuilder, (BLiveStormDanmakuTipContent) obj);
                }
            });
        }
        ((TextView) view).setText(spannableStringBuilder);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.u6g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f177774a.m200055I(i2, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveStormDanmakuTip getItem(int i) {
        return this.f182640d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m200055I(int i, View view) {
        this.f182639c.m170882X3(i);
    }
}
