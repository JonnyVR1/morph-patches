package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes9.dex */
public class i5k extends owl {
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m138727r(Act act, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        nae0.m162083m(act, Uri.parse(str));
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(final Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        act.duringCreated(x8o.m209747b(abe0Var.m96740c())).subscribe(dhw.m115829h(new y20() { // from class: l.h5k
            @Override // p153l.y20
            public final void call(Object obj) {
                i5k.m138727r(act, (String) obj);
            }
        }));
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return SchemeKey.liveBannerCustom.equals(str);
    }
}
