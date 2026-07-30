package p149l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class a8h extends z7h {

    /* JADX INFO: renamed from: m */
    public ImageView f68044m;

    /* JADX INFO: renamed from: n */
    public TextView f68045n;

    /* JADX INFO: renamed from: o */
    public TextView f68046o;

    /* JADX INFO: renamed from: p */
    public View f68047p;

    @Override // p149l.z7h
    /* JADX INFO: renamed from: c */
    public boolean mo95345c() {
        super.mo95345c();
        if (NullChecker.m81304b(this.f184242b)) {
            View[] viewArr = this.f184242b;
            if (viewArr.length > 3) {
                View view = viewArr[1];
                View view2 = viewArr[2];
                View view3 = viewArr[3];
                View view4 = viewArr[4];
                if (view instanceof ImageView) {
                    this.f68044m = (ImageView) view;
                }
                if (view2 instanceof TextView) {
                    this.f68046o = (TextView) view2;
                }
                if (view3 instanceof TextView) {
                    this.f68045n = (TextView) view3;
                }
                if (NullChecker.m81303a(view4)) {
                    this.f68047p = view4;
                }
                m95346l();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m95346l() {
        if (NullChecker.m81303a(this.f68044m)) {
            this.f68044m.setImageResource(f3c0.f94491c2);
        }
        if (NullChecker.m81303a(this.f68045n)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f68045n.getLayoutParams();
            marginLayoutParams.leftMargin = t100.m186890d(10.0f);
            this.f68045n.setLayoutParams(marginLayoutParams);
        }
        if (NullChecker.m81303a(this.f68046o)) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f68046o.getLayoutParams();
            marginLayoutParams2.leftMargin = t100.m186890d(10.0f);
            this.f68046o.setLayoutParams(marginLayoutParams2);
            this.f68046o.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.m81303a(this.f68047p)) {
            this.f68047p.setBackground(null);
        }
    }
}
