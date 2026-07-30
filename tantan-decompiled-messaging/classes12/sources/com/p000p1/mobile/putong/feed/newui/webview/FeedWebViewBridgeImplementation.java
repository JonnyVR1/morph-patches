package com.p000p1.mobile.putong.feed.newui.webview;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import java.util.List;
import l.boq;
import l.ef2;
import l.liq;
import l.vwb;
import l.w2e0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedWebViewBridgeImplementation extends ef2 {
    /* JADX INFO: renamed from: c */
    public final String m7651c(String str, w2e0 w2e0Var) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : w2e0Var.f().keySet()) {
            if (!"url".equals(str2)) {
                builderBuildUpon.appendQueryParameter(str2, (String) w2e0Var.f().get(str2));
            }
        }
        return builderBuildUpon.build().toString();
    }

    @liq(key = "openMomentDetail")
    public void openMomentDetail(@NonNull boq boqVar, String str, String str2) {
        Intent intentM5932b = MomentDetailAct.C2150a.m5931a(boqVar.c()).m5936f("feedwebview").m5943m(str).m5944n(str2).m5950t(true).m5932b();
        if (intentM5932b == null) {
            return;
        }
        boqVar.c().startActivity(intentM5932b);
    }

    @liq(key = "openWebViewFeed")
    public void openWebViewFeed(@NonNull boq boqVar, String str, String str2, String str3, String str4) {
        w2e0 w2e0VarD = new w2e0.a(boqVar.c(), str2).d();
        FeedWebViewAct.m7650a2(boqVar.c(), str, m7651c((String) w2e0VarD.f().get("url"), w2e0VarD), str3, str4);
    }

    @liq(key = "setFdWebviewPageID", uiThread = true)
    public void setWebviewPageID(@NonNull boq boqVar, String str, String[] strArr) {
        List listT0 = boqVar.c().getSupportFragmentManager().t0();
        if (vwb.J(listT0) || !(listT0.get(0) instanceof FeedWebViewFrag)) {
            return;
        }
        ((FeedWebViewFrag) listT0.get(0)).m7662W4(str, strArr);
    }
}
