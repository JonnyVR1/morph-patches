package com.p046p1.mobile.putong.feed.newui.webview;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import java.util.List;
import p149l.boq;
import p149l.ef2;
import p149l.liq;
import p149l.vwb;
import p149l.w2e0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedWebViewBridgeImplementation extends ef2 {
    /* JADX INFO: renamed from: c */
    public final String m66484c(String str, w2e0 w2e0Var) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : w2e0Var.m201098f().keySet()) {
            if (!"url".equals(str2)) {
                builderBuildUpon.appendQueryParameter(str2, w2e0Var.m201098f().get(str2));
            }
        }
        return builderBuildUpon.build().toString();
    }

    @liq(key = "openMomentDetail")
    public void openMomentDetail(@NonNull boq boqVar, String str, String str2) {
        Intent intentM64835b = MomentDetailAct.C11306a.m64834a(boqVar.mo102961c()).m64839f("feedwebview").m64846m(str).m64847n(str2).m64853t(true).m64835b();
        if (intentM64835b == null) {
            return;
        }
        boqVar.mo102961c().startActivity(intentM64835b);
    }

    @liq(key = "openWebViewFeed")
    public void openWebViewFeed(@NonNull boq boqVar, String str, String str2, String str3, String str4) {
        w2e0 w2e0VarM201103d = new w2e0.C20787a(boqVar.mo102961c(), str2).m201103d();
        FeedWebViewAct.m66483a2(boqVar.mo102961c(), str, m66484c(w2e0VarM201103d.m201098f().get("url"), w2e0VarM201103d), str3, str4);
    }

    @liq(key = "setFdWebviewPageID", uiThread = true)
    public void setWebviewPageID(@NonNull boq boqVar, String str, String[] strArr) {
        List<Fragment> listM2589t0 = boqVar.mo102961c().getSupportFragmentManager().m2589t0();
        if (vwb.m200296J(listM2589t0) || !(listM2589t0.get(0) instanceof FeedWebViewFrag)) {
            return;
        }
        ((FeedWebViewFrag) listM2589t0.get(0)).m66493W4(str, strArr);
    }
}
