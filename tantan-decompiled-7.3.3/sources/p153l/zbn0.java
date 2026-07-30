package p153l;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes5.dex */
public class zbn0 extends d3q<TextView> {

    /* JADX INFO: renamed from: a */
    public boolean f203689a;

    public zbn0(boolean z) {
        this.f203689a = z;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(TextView textView) {
        super.mo71749u(textView);
        bnl0.m105548c0(textView, qa00.f156323j);
        bnl0.m105554f0(textView, qa00.f156330q);
        if (!this.f203689a) {
            textView.setText(R$string.f47498E5);
            textView.setCompoundDrawables(null, null, null, null);
        } else {
            textView.setText(R$string.f47526Fb);
            Drawable drawable = textView.getContext().getDrawable(obc0.f145975A9);
            drawable.setBounds(0, 0, qa00.m175859d(22.0f), qa00.m175859d(22.0f));
            textView.setCompoundDrawables(drawable, null, null, null);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m219200I(boolean z) {
        this.f203689a = z;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198976X8;
    }
}
