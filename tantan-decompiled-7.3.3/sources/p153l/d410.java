package p153l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.piplineext.codec.MoMoRtcPushFilter;
import com.momo.pub.MomoPipelineModuleRegister;

/* JADX INFO: loaded from: classes8.dex */
public class d410 extends f410 {
    /* JADX INFO: renamed from: h */
    public static MomoCodec m114071h(Context context, MomoPipeline momoPipeline, g510 g510Var, q210.InterfaceC19500a interfaceC19500a, uow uowVar) {
        return new tc0(context, g510Var, interfaceC19500a, uowVar);
    }

    /* JADX INFO: renamed from: i */
    public static MomoCodec m114072i(Context context, MomoPipeline momoPipeline, g510 g510Var, q210.InterfaceC19500a interfaceC19500a, uow uowVar, String str) {
        return new tc0(context, g510Var, interfaceC19500a, uowVar, str);
    }

    @RequiresApi(api = 14)
    /* JADX INFO: renamed from: j */
    public static eh0 m114073j(@NonNull Context context, String str, q210.InterfaceC19500a interfaceC19500a, int i, boolean z, brx brxVar) {
        return new eh0(context, str, interfaceC19500a, i, z, brxVar);
    }

    /* JADX INFO: renamed from: k */
    public static MomoCodec m114074k(Context context, MomoPipeline momoPipeline, g510 g510Var, q210.InterfaceC19500a interfaceC19500a, uow uowVar) {
        return new MoMoRtcPushFilter(context, g510Var, interfaceC19500a, uowVar);
    }

    /* JADX INFO: renamed from: l */
    public static MomoCodec m114075l(Context context, MomoPipeline momoPipeline, g510 g510Var, q210.InterfaceC19500a interfaceC19500a, uow uowVar, String str) {
        return new MoMoRtcPushFilter(context, g510Var, interfaceC19500a, uowVar, str);
    }

    /* JADX INFO: renamed from: m */
    public static MomoPipelineModuleRegister m114076m(Activity activity, brx brxVar) {
        arx.m99789d().m99799k(activity, brxVar);
        return new h410(activity);
    }

    /* JADX INFO: renamed from: n */
    public static MomoPipelineModuleRegister m114077n(Context context, brx brxVar) {
        arx.m99789d().m99799k(context, brxVar);
        return new h410(context);
    }

    /* JADX INFO: renamed from: o */
    public static c410 m114078o(@NonNull uow uowVar) {
        return new e410(uowVar);
    }

    /* JADX INFO: renamed from: p */
    public static MomoCodec m114079p(Context context, MomoPipeline momoPipeline, g510 g510Var, q210.InterfaceC19500a interfaceC19500a, uow uowVar) {
        return new xmp0(context, g510Var, interfaceC19500a, uowVar);
    }

    /* JADX INFO: renamed from: q */
    public static MomoCodec m114080q(Context context, MomoPipeline momoPipeline, g510 g510Var, q210.InterfaceC19500a interfaceC19500a, uow uowVar, String str) {
        return new xmp0(context, g510Var, interfaceC19500a, uowVar, str);
    }
}
