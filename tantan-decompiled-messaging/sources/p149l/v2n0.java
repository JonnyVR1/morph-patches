package p149l;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes5.dex */
public class v2n0 extends d1q<TextView> {

    /* JADX INFO: renamed from: a */
    public boolean f179589a;

    public v2n0(boolean z) {
        this.f179589a = z;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(TextView textView) {
        super.mo70566u(textView);
        xdl0.m208368c0(textView, t100.f167261j);
        xdl0.m208374f0(textView, t100.f167268q);
        if (!this.f179589a) {
            textView.setText(R$string.f46650E5);
            textView.setCompoundDrawables(null, null, null, null);
        } else {
            textView.setText(R$string.f46678Fb);
            Drawable drawable = textView.getContext().getDrawable(i3c0.f110647A9);
            drawable.setBounds(0, 0, t100.m186890d(22.0f), t100.m186890d(22.0f));
            textView.setCompoundDrawables(drawable, null, null, null);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m196809I(boolean z) {
        this.f179589a = z;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168244X8;
    }
}
