package p007l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class a8h extends z7h {

    /* JADX INFO: renamed from: m */
    public ImageView f5655m;

    /* JADX INFO: renamed from: n */
    public TextView f5656n;

    /* JADX INFO: renamed from: o */
    public TextView f5657o;

    /* JADX INFO: renamed from: p */
    public View f5658p;

    @Override // p007l.z7h
    /* JADX INFO: renamed from: c */
    public boolean mo8458c() {
        super.mo8458c();
        if (NullChecker.b(this.f14375b)) {
            View[] viewArr = this.f14375b;
            if (viewArr.length > 3) {
                View view = viewArr[1];
                View view2 = viewArr[2];
                View view3 = viewArr[3];
                View view4 = viewArr[4];
                if (view instanceof ImageView) {
                    this.f5655m = (ImageView) view;
                }
                if (view2 instanceof TextView) {
                    this.f5657o = (TextView) view2;
                }
                if (view3 instanceof TextView) {
                    this.f5656n = (TextView) view3;
                }
                if (NullChecker.a(view4)) {
                    this.f5658p = view4;
                }
                m8459l();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m8459l() {
        if (NullChecker.a(this.f5655m)) {
            this.f5655m.setImageResource(f3c0.f7774c2);
        }
        if (NullChecker.a(this.f5656n)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5656n.getLayoutParams();
            marginLayoutParams.leftMargin = t100.d(10.0f);
            this.f5656n.setLayoutParams(marginLayoutParams);
        }
        if (NullChecker.a(this.f5657o)) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f5657o.getLayoutParams();
            marginLayoutParams2.leftMargin = t100.d(10.0f);
            this.f5657o.setLayoutParams(marginLayoutParams2);
            this.f5657o.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.a(this.f5658p)) {
            this.f5658p.setBackground(null);
        }
    }
}
