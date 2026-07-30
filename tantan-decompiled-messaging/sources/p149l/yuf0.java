package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.LiveVoiceInternalSquareFrag;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.p061me.LiveMyVoiceRoomPageFrag;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes13.dex */
public class yuf0 {
    /* JADX INFO: renamed from: a */
    public static void m216111a(Context context, String str) {
        Act.C4299r c4299rForeground_ = Act.foreground_();
        if (c4299rForeground_ != null && c4299rForeground_.f15343a != null) {
            Activity activity = Act.foreground_().f15343a.get();
            boolean z = activity instanceof LiveIndependentSettingAct;
            if (z) {
                LiveIndependentSettingAct liveIndependentSettingAct = (LiveIndependentSettingAct) activity;
                if (TextUtils.equals(liveIndependentSettingAct.f46166c, "voice_internal_square_page")) {
                    Fragment fragmentM2557i0 = liveIndependentSettingAct.getSupportFragmentManager().m2557i0("voice_internal_square_page");
                    if (fragmentM2557i0 instanceof LiveVoiceInternalSquareFrag) {
                        ((LiveVoiceInternalSquareFrag) fragmentM2557i0).m69872O4(str);
                        return;
                    }
                    return;
                }
            }
            if (z && (((LiveIndependentSettingAct) activity).getSupportFragmentManager().m2557i0("live_internal_my_room_frag") instanceof LiveMyVoiceRoomPageFrag)) {
                activity.finish();
                Bundle bundle = new Bundle();
                bundle.putString("tab_id", str);
                Intent intentM70699Y1 = LiveIndependentSettingAct.m70699Y1(context, "voice_internal_square_page", bundle);
                intentM70699Y1.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                context.startActivity(intentM70699Y1);
                return;
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("tab_id", str);
        context.startActivity(LiveIndependentSettingAct.m70699Y1(context, "voice_internal_square_page", bundle2));
    }
}
