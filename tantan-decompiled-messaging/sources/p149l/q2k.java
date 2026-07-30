package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes13.dex */
public class q2k extends aul {
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m172470r(Act act, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        j2e0.m139446m(act, Uri.parse(str));
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(final Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        act.duringCreated(x6o.m207190b(w2e0Var.m201095c())).subscribe(ffw.m121197h(new e30() { // from class: l.p2k
            @Override // p149l.e30
            public final void call(Object obj) {
                q2k.m172470r(act, (String) obj);
            }
        }));
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return SchemeKey.liveBannerCustom.equals(str);
    }
}
