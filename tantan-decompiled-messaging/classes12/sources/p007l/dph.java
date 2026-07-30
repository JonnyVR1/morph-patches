package p007l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.lsi0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dph extends qnh {

    /* JADX INFO: renamed from: L */
    public static String f7021L = "p_poi_lighten_pop";

    /* JADX INFO: renamed from: l.dph$a */
    public static class C2363a {

        /* JADX INFO: renamed from: a */
        public Act f7022a;

        /* JADX INFO: renamed from: b */
        public PoiGuidePopWindow f7023b;

        /* JADX INFO: renamed from: c */
        public boolean f7024c;

        /* JADX INFO: renamed from: d */
        public gsl f7025d;

        /* JADX INFO: renamed from: a */
        public dph m9546a() {
            dph dphVar = new dph(this.f7022a);
            dphVar.m13673g0(this.f7024c);
            dphVar.m13674h0(this.f7023b);
            dphVar.m13672f0(this.f7025d);
            return dphVar;
        }

        /* JADX INFO: renamed from: b */
        public C2363a m9547b(Act act) {
            this.f7022a = act;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C2363a m9548c(gsl gslVar) {
            this.f7025d = gslVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2363a m9549d(boolean z) {
            this.f7024c = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C2363a m9550e(PoiGuidePopWindow poiGuidePopWindow) {
            this.f7023b = poiGuidePopWindow;
            return this;
        }
    }

    public dph(@NonNull Context context) {
        super(context);
    }

    @Override // p007l.qnh
    /* JADX INFO: renamed from: J */
    public String mo9541J() {
        return f7021L;
    }

    @Override // p007l.qnh
    /* JADX INFO: renamed from: R */
    public void mo9542R() {
        xdl0.M(this.f12313h, false);
        xdl0.E0(this.f12328w, new View.OnClickListener() { // from class: l.bph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6400a.m9545m0(view);
            }
        });
    }

    @Override // p007l.qnh
    /* JADX INFO: renamed from: d0 */
    public void mo9543d0() {
        MessageLocation messageLocation = this.f12298C;
        if (messageLocation == null) {
            return;
        }
        String str = String.format(this.f12300E.subTitle, messageLocation.name);
        this.f12303H = str;
        this.f12326u.setHint(str);
    }

    @Override // p007l.qnh
    public void dismiss() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m9544l0(String str) {
        m13656H(str);
        dismiss();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m9545m0(View view) {
        final String string = NullChecker.a(this.f12326u.getText()) ? this.f12326u.getText().toString() : null;
        if (!TextUtils.isEmpty(string)) {
            m13655G(string, DetectCategoryType.get("moment"), "moment", null, new d30() { // from class: l.cph
                public final void call() {
                    this.f6703a.m9544l0(string);
                }
            });
        } else if (TextUtils.isEmpty(this.f12303H)) {
            lsi0.y("请输入您此刻的想法");
        } else {
            m13656H(this.f12303H);
            dismiss();
        }
    }

    @Override // p007l.qnh
    public void show() {
        super.show();
    }
}
