package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class dph extends qnh {

    /* JADX INFO: renamed from: L */
    public static String f87274L = "p_poi_lighten_pop";

    /* JADX INFO: renamed from: l.dph$a */
    public static class C16422a {

        /* JADX INFO: renamed from: a */
        public Act f87275a;

        /* JADX INFO: renamed from: b */
        public PoiGuidePopWindow f87276b;

        /* JADX INFO: renamed from: c */
        public boolean f87277c;

        /* JADX INFO: renamed from: d */
        public gsl f87278d;

        /* JADX INFO: renamed from: a */
        public dph m112898a() {
            dph dphVar = new dph(this.f87275a);
            dphVar.m175678g0(this.f87277c);
            dphVar.m175679h0(this.f87276b);
            dphVar.m175677f0(this.f87278d);
            return dphVar;
        }

        /* JADX INFO: renamed from: b */
        public C16422a m112899b(Act act) {
            this.f87275a = act;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C16422a m112900c(gsl gslVar) {
            this.f87278d = gslVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16422a m112901d(boolean z) {
            this.f87277c = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C16422a m112902e(PoiGuidePopWindow poiGuidePopWindow) {
            this.f87276b = poiGuidePopWindow;
            return this;
        }
    }

    public dph(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.qnh
    /* JADX INFO: renamed from: J */
    public String mo112893J() {
        return f87274L;
    }

    @Override // p149l.qnh
    /* JADX INFO: renamed from: R */
    public void mo112894R() {
        xdl0.m208344M(this.f155456h, false);
        xdl0.m208329E0(this.f155471w, new View.OnClickListener() { // from class: l.bph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76626a.m112897m0(view);
            }
        });
    }

    @Override // p149l.qnh
    /* JADX INFO: renamed from: d0 */
    public void mo112895d0() {
        MessageLocation messageLocation = this.f155441C;
        if (messageLocation == null) {
            return;
        }
        String str = String.format(this.f155443E.subTitle, messageLocation.name);
        this.f155446H = str;
        this.f155469u.setHint(str);
    }

    @Override // p149l.qnh, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m112896l0(String str) {
        m175661H(str);
        dismiss();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m112897m0(View view) {
        final String string = NullChecker.m81303a(this.f155469u.getText()) ? this.f155469u.getText().toString() : null;
        if (!TextUtils.isEmpty(string)) {
            m175660G(string, DetectCategoryType.get("moment"), "moment", null, new d30() { // from class: l.cph
                @Override // p149l.d30
                public final void call() {
                    this.f81936a.m112896l0(string);
                }
            });
        } else if (TextUtils.isEmpty(this.f155446H)) {
            lsi0.m151595y("请输入您此刻的想法");
        } else {
            m175661H(this.f155446H);
            dismiss();
        }
    }

    @Override // p149l.qnh, android.app.Dialog
    public void show() {
        super.show();
    }
}
