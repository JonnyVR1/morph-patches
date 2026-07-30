package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.MultiContentVoiceCall;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ej10 {
    /* JADX INFO: renamed from: a */
    public static void m6298a(MultiContentVoiceCall multiContentVoiceCall, View view) {
        multiContentVoiceCall.a = (MultiContentVoiceCall) view;
        ViewGroup viewGroup = (ViewGroup) view;
        multiContentVoiceCall.b = viewGroup.getChildAt(0);
        multiContentVoiceCall.c = viewGroup.getChildAt(1);
    }
}
