package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.live.base.data.BLiveSchema;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;

/* JADX INFO: loaded from: classes13.dex */
public class t2k extends aul {
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m186995r(Act act, BLiveSchema bLiveSchema) {
        if (l9s.m149072e().signedIn_() && act != null) {
            if (!TextUtils.isEmpty(bLiveSchema.tip)) {
                lsi0.m151595y(bLiveSchema.tip);
            }
            if (TextUtils.isEmpty(bLiveSchema.schema)) {
                return;
            }
            j2e0.m139446m(act, Uri.parse(bLiveSchema.schema));
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(final Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        if (l9s.m149072e().signedIn_()) {
            LiveSquareApi.getLiveSchema("{\"search\":\"" + rwj0.m181411j(w2e0Var, "extra") + "\"}").subscribe(ffw.m121194e(new e30() { // from class: l.r2k
                @Override // p149l.e30
                public final void call(Object obj) {
                    t2k.m186995r(act, (BLiveSchema) obj);
                }
            }, new e30() { // from class: l.s2k
                @Override // p149l.e30
                public final void call(Object obj) {
                    hfw.m130790a("[live]dynamic_schema", "error:" + ((Throwable) obj).getMessage());
                }
            }));
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return SchemeKey.liveDynamic.equals(str);
    }
}
