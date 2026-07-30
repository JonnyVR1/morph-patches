package p153l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class p9h extends o9h {

    /* JADX INFO: renamed from: m */
    public ImageView f151155m;

    /* JADX INFO: renamed from: n */
    public TextView f151156n;

    /* JADX INFO: renamed from: o */
    public TextView f151157o;

    /* JADX INFO: renamed from: p */
    public View f151158p;

    @Override // p153l.o9h
    /* JADX INFO: renamed from: c */
    public boolean mo166720c() {
        super.mo166720c();
        if (NullChecker.m82487b(this.f129981b)) {
            View[] viewArr = this.f129981b;
            if (viewArr.length > 3) {
                View view = viewArr[1];
                View view2 = viewArr[2];
                View view3 = viewArr[3];
                View view4 = viewArr[4];
                if (view instanceof ImageView) {
                    this.f151155m = (ImageView) view;
                }
                if (view2 instanceof TextView) {
                    this.f151157o = (TextView) view2;
                }
                if (view3 instanceof TextView) {
                    this.f151156n = (TextView) view3;
                }
                if (NullChecker.m82486a(view4)) {
                    this.f151158p = view4;
                }
                m171361l();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m171361l() {
        if (NullChecker.m82486a(this.f151155m)) {
            this.f151155m.setImageResource(lbc0.f131009c2);
        }
        if (NullChecker.m82486a(this.f151156n)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f151156n.getLayoutParams();
            marginLayoutParams.leftMargin = qa00.m175859d(10.0f);
            this.f151156n.setLayoutParams(marginLayoutParams);
        }
        if (NullChecker.m82486a(this.f151157o)) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f151157o.getLayoutParams();
            marginLayoutParams2.leftMargin = qa00.m175859d(10.0f);
            this.f151157o.setLayoutParams(marginLayoutParams2);
            this.f151157o.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.m82486a(this.f151158p)) {
            this.f151158p.setBackground(null);
        }
    }
}
