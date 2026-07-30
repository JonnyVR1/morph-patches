package p149l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.piplineext.codec.MoMoRtcPushFilter;
import com.momo.pub.MomoPipelineModuleRegister;

/* JADX INFO: loaded from: classes7.dex */
public class vv00 extends xv00 {
    /* JADX INFO: renamed from: h */
    public static MomoCodec m200144h(Context context, MomoPipeline momoPipeline, yw00 yw00Var, hu00.InterfaceC17392a interfaceC17392a, vlw vlwVar) {
        return new xc0(context, yw00Var, interfaceC17392a, vlwVar);
    }

    /* JADX INFO: renamed from: i */
    public static MomoCodec m200145i(Context context, MomoPipeline momoPipeline, yw00 yw00Var, hu00.InterfaceC17392a interfaceC17392a, vlw vlwVar, String str) {
        return new xc0(context, yw00Var, interfaceC17392a, vlwVar, str);
    }

    @RequiresApi(api = 14)
    /* JADX INFO: renamed from: j */
    public static ih0 m200146j(@NonNull Context context, String str, hu00.InterfaceC17392a interfaceC17392a, int i, boolean z, eix eixVar) {
        return new ih0(context, str, interfaceC17392a, i, z, eixVar);
    }

    /* JADX INFO: renamed from: k */
    public static MomoCodec m200147k(Context context, MomoPipeline momoPipeline, yw00 yw00Var, hu00.InterfaceC17392a interfaceC17392a, vlw vlwVar) {
        return new MoMoRtcPushFilter(context, yw00Var, interfaceC17392a, vlwVar);
    }

    /* JADX INFO: renamed from: l */
    public static MomoCodec m200148l(Context context, MomoPipeline momoPipeline, yw00 yw00Var, hu00.InterfaceC17392a interfaceC17392a, vlw vlwVar, String str) {
        return new MoMoRtcPushFilter(context, yw00Var, interfaceC17392a, vlwVar, str);
    }

    /* JADX INFO: renamed from: m */
    public static MomoPipelineModuleRegister m200149m(Activity activity, eix eixVar) {
        dix.m111940d().m111950k(activity, eixVar);
        return new zv00(activity);
    }

    /* JADX INFO: renamed from: n */
    public static MomoPipelineModuleRegister m200150n(Context context, eix eixVar) {
        dix.m111940d().m111950k(context, eixVar);
        return new zv00(context);
    }

    /* JADX INFO: renamed from: o */
    public static uv00 m200151o(@NonNull vlw vlwVar) {
        return new wv00(vlwVar);
    }

    /* JADX INFO: renamed from: p */
    public static MomoCodec m200152p(Context context, MomoPipeline momoPipeline, yw00 yw00Var, hu00.InterfaceC17392a interfaceC17392a, vlw vlwVar) {
        return new tdp0(context, yw00Var, interfaceC17392a, vlwVar);
    }

    /* JADX INFO: renamed from: q */
    public static MomoCodec m200153q(Context context, MomoPipeline momoPipeline, yw00 yw00Var, hu00.InterfaceC17392a interfaceC17392a, vlw vlwVar, String str) {
        return new tdp0(context, yw00Var, interfaceC17392a, vlwVar, str);
    }
}
