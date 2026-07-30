package com.p051p1.mobile.putong.feed.newui.webview;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import java.util.List;
import p153l.abe0;
import p153l.aqq;
import p153l.jyb;
import p153l.lf2;
import p153l.lkq;

/* JADX INFO: loaded from: classes13.dex */
public class FeedWebViewBridgeImplementation extends lf2 {
    /* JADX INFO: renamed from: c */
    public final String m67667c(String str, abe0 abe0Var) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : abe0Var.m96743f().keySet()) {
            if (!"url".equals(str2)) {
                builderBuildUpon.appendQueryParameter(str2, abe0Var.m96743f().get(str2));
            }
        }
        return builderBuildUpon.build().toString();
    }

    @lkq(key = "openMomentDetail")
    public void openMomentDetail(@NonNull aqq aqqVar, String str, String str2) {
        Intent intentM66018b = MomentDetailAct.C11469a.m66017a(aqqVar.mo99543c()).m66022f("feedwebview").m66029m(str).m66030n(str2).m66036t(true).m66018b();
        if (intentM66018b == null) {
            return;
        }
        aqqVar.mo99543c().startActivity(intentM66018b);
    }

    @lkq(key = "openWebViewFeed")
    public void openWebViewFeed(@NonNull aqq aqqVar, String str, String str2, String str3, String str4) {
        abe0 abe0VarM96748d = new abe0.C15681a(aqqVar.mo99543c(), str2).m96748d();
        FeedWebViewAct.m67666b2(aqqVar.mo99543c(), str, m67667c(abe0VarM96748d.m96743f().get("url"), abe0VarM96748d), str3, str4);
    }

    @lkq(key = "setFdWebviewPageID", uiThread = true)
    public void setWebviewPageID(@NonNull aqq aqqVar, String str, String[] strArr) {
        List<Fragment> listM2590t0 = aqqVar.mo99543c().getSupportFragmentManager().m2590t0();
        if (jyb.m147479J(listM2590t0) || !(listM2590t0.get(0) instanceof FeedWebViewFrag)) {
            return;
        }
        ((FeedWebViewFrag) listM2590t0.get(0)).m67676W4(str, strArr);
    }
}
