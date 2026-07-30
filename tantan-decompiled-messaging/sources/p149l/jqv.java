package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;

/* JADX INFO: loaded from: classes12.dex */
public class jqv {
    /* JADX INFO: renamed from: a */
    public static void m142854a(String str, String str2, String str3) {
        zvf0.m220399u("e_live_room_enter", str, vwb.m200311Y("liveId", str2), vwb.m200311Y("anchorId", str3), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("liveRecommendCategory", "NA"), vwb.m200311Y("live_status", "on"), vwb.m200311Y("module", OMSTemplateModeType.page));
    }

    /* JADX INFO: renamed from: b */
    public static void m142855b(String str, String str2, String str3) {
        zvf0.m220368A("e_live_room_enter", str, vwb.m200311Y("liveId", str2), vwb.m200311Y("anchorId", str3), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("liveRecommendCategory", "NA"), vwb.m200311Y("live_status", "on"), vwb.m200311Y("module", OMSTemplateModeType.page));
    }
}
