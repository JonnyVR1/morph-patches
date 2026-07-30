package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class sqh extends fph {

    /* JADX INFO: renamed from: L */
    public static String f170174L = "p_poi_lighten_pop";

    /* JADX INFO: renamed from: l.sqh$a */
    public static class C20134a {

        /* JADX INFO: renamed from: a */
        public Act f170175a;

        /* JADX INFO: renamed from: b */
        public PoiGuidePopWindow f170176b;

        /* JADX INFO: renamed from: c */
        public boolean f170177c;

        /* JADX INFO: renamed from: d */
        public uul f170178d;

        /* JADX INFO: renamed from: a */
        public sqh m187545a() {
            sqh sqhVar = new sqh(this.f170175a);
            sqhVar.m126626g0(this.f170177c);
            sqhVar.m126627h0(this.f170176b);
            sqhVar.m126625f0(this.f170178d);
            return sqhVar;
        }

        /* JADX INFO: renamed from: b */
        public C20134a m187546b(Act act) {
            this.f170175a = act;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C20134a m187547c(uul uulVar) {
            this.f170178d = uulVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C20134a m187548d(boolean z) {
            this.f170177c = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C20134a m187549e(PoiGuidePopWindow poiGuidePopWindow) {
            this.f170176b = poiGuidePopWindow;
            return this;
        }
    }

    public sqh(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.fph
    /* JADX INFO: renamed from: J */
    public String mo99686J() {
        return f170174L;
    }

    @Override // p153l.fph
    /* JADX INFO: renamed from: R */
    public void mo99687R() {
        bnl0.m105524M(this.f100147h, false);
        bnl0.m105509E0(this.f100162w, new View.OnClickListener() { // from class: l.qqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159003a.m187544m0(view);
            }
        });
    }

    @Override // p153l.fph
    /* JADX INFO: renamed from: d0 */
    public void mo99688d0() {
        MessageLocation messageLocation = this.f100132C;
        if (messageLocation == null) {
            return;
        }
        String str = String.format(this.f100134E.subTitle, messageLocation.name);
        this.f100137H = str;
        this.f100160u.setHint(str);
    }

    @Override // p153l.fph, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m187543l0(String str) {
        m126609H(str);
        dismiss();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m187544m0(View view) {
        final String string = NullChecker.m82486a(this.f100160u.getText()) ? this.f100160u.getText().toString() : null;
        if (!TextUtils.isEmpty(string)) {
            m126608G(string, DetectCategoryType.get("moment"), "moment", null, new x20() { // from class: l.rqh
                @Override // p153l.x20
                public final void call() {
                    this.f164484a.m187543l0(string);
                }
            });
        } else if (TextUtils.isEmpty(this.f100137H)) {
            o1j0.m165651y("请输入您此刻的想法");
        } else {
            m126609H(this.f100137H);
            dismiss();
        }
    }

    @Override // p153l.fph, android.app.Dialog
    public void show() {
        super.show();
    }
}
