package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.LiveVoiceInternalSquareFrag;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.p066me.LiveMyVoiceRoomPageFrag;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes9.dex */
public class h3g0 {
    /* JADX INFO: renamed from: a */
    public static void m133482a(Context context, String str) {
        Act.C4450r c4450rForeground_ = Act.foreground_();
        if (c4450rForeground_ != null && c4450rForeground_.f16062a != null) {
            Activity activity = Act.foreground_().f16062a.get();
            boolean z = activity instanceof LiveIndependentSettingAct;
            if (z) {
                LiveIndependentSettingAct liveIndependentSettingAct = (LiveIndependentSettingAct) activity;
                if (TextUtils.equals(liveIndependentSettingAct.f47014c, "voice_internal_square_page")) {
                    Fragment fragmentM2558i0 = liveIndependentSettingAct.getSupportFragmentManager().m2558i0("voice_internal_square_page");
                    if (fragmentM2558i0 instanceof LiveVoiceInternalSquareFrag) {
                        ((LiveVoiceInternalSquareFrag) fragmentM2558i0).m71055O4(str);
                        return;
                    }
                    return;
                }
            }
            if (z && (((LiveIndependentSettingAct) activity).getSupportFragmentManager().m2558i0("live_internal_my_room_frag") instanceof LiveMyVoiceRoomPageFrag)) {
                activity.finish();
                Bundle bundle = new Bundle();
                bundle.putString("tab_id", str);
                Intent intentM71882Z1 = LiveIndependentSettingAct.m71882Z1(context, "voice_internal_square_page", bundle);
                intentM71882Z1.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                context.startActivity(intentM71882Z1);
                return;
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("tab_id", str);
        context.startActivity(LiveIndependentSettingAct.m71882Z1(context, "voice_internal_square_page", bundle2));
    }
}
