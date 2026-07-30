package p153l;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class leh implements keh {
    @Override // p153l.keh
    /* JADX INFO: renamed from: a */
    public void mo149319a(Act act, String str, MusicContent musicContent, y20<Intent> y20Var) {
        if (kl40.m150348f()) {
            cn40.m111363O(act, musicContent, str);
        } else {
            y20Var.call(InstaLikePickerAct.m63440F2(act, 9, true, false));
        }
    }

    @Override // p153l.keh
    /* JADX INFO: renamed from: b */
    public void mo149320b(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, y20<Intent> y20Var, String str4) {
        if (kl40.m150348f()) {
            uqb0.f180396b0.f170327d.mo61482Nr(act, arrayList, z, str, str2, str3, str4);
        } else {
            y20Var.call(InstaLikePickerAct.m63440F2(act, 9, true, false));
        }
    }

    @Override // p153l.keh
    /* JADX INFO: renamed from: c */
    public void mo149321c(Act act, int i, y20<Intent> y20Var) {
        if (kl40.m150348f()) {
            cn40.m111378b0(act, i);
        } else {
            y20Var.call(InstaLikePickerAct.m63440F2(act, i, false, false));
        }
    }

    @Override // p153l.keh
    /* JADX INFO: renamed from: d */
    public void mo149322d(Act act, y20<Intent> y20Var) {
        mo149324f(act, null, y20Var);
    }

    @Override // p153l.keh
    /* JADX INFO: renamed from: e */
    public void mo149323e(Act act, boolean z, String str, String str2, String str3, y20<Intent> y20Var, String str4, String str5) {
        if (kl40.m150348f()) {
            uqb0.f180396b0.f170327d.mo61553le(act, z, str, str2, str3, str4, str5);
        } else {
            y20Var.call(InstaLikePickerAct.m63440F2(act, 9, true, false));
        }
    }

    @Override // p153l.keh
    /* JADX INFO: renamed from: f */
    public void mo149324f(Act act, MusicContent musicContent, y20<Intent> y20Var) {
        if (kl40.m150348f()) {
            cn40.m111362N(act, musicContent);
        } else {
            y20Var.call(InstaLikePickerAct.m63440F2(act, 9, true, false));
        }
    }

    @Override // p153l.keh
    /* JADX INFO: renamed from: g */
    public void mo149325g(Act act, int i, y20<Intent> y20Var, y20<Intent> y20Var2) {
        if (kl40.m150348f()) {
            cn40.m111382d0(act, i, true, y20Var);
            return;
        }
        Intent intentM63440F2 = InstaLikePickerAct.m63440F2(act, i, false, false);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(intentM63440F2);
        }
        y20Var2.call(intentM63440F2);
    }
}
