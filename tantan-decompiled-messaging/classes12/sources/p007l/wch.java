package p007l;

import android.content.Intent;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.qib0;
import l.wc40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class wch implements vch {
    @Override // p007l.vch
    /* JADX INFO: renamed from: a */
    public void mo15419a(Act act, String str, MusicContent musicContent, e30<Intent> e30Var) {
        if (wc40.f()) {
            oe40.m12550O(act, musicContent, str);
        } else {
            e30Var.call(InstaLikePickerAct.m3238E2(act, 9, true, false));
        }
    }

    @Override // p007l.vch
    /* JADX INFO: renamed from: b */
    public void mo15420b(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, e30<Intent> e30Var, String str4) {
        if (wc40.f()) {
            qib0.b0.d.mo1224Nr(act, arrayList, z, str, str2, str3, str4);
        } else {
            e30Var.call(InstaLikePickerAct.m3238E2(act, 9, true, false));
        }
    }

    @Override // p007l.vch
    /* JADX INFO: renamed from: c */
    public void mo15421c(Act act, int i, e30<Intent> e30Var) {
        if (wc40.f()) {
            oe40.m12565b0(act, i);
        } else {
            e30Var.call(InstaLikePickerAct.m3238E2(act, i, false, false));
        }
    }

    @Override // p007l.vch
    /* JADX INFO: renamed from: d */
    public void mo15422d(Act act, e30<Intent> e30Var) {
        mo15424f(act, null, e30Var);
    }

    @Override // p007l.vch
    /* JADX INFO: renamed from: e */
    public void mo15423e(Act act, boolean z, String str, String str2, String str3, e30<Intent> e30Var, String str4, String str5) {
        if (wc40.f()) {
            qib0.b0.d.mo1295le(act, z, str, str2, str3, str4, str5);
        } else {
            e30Var.call(InstaLikePickerAct.m3238E2(act, 9, true, false));
        }
    }

    @Override // p007l.vch
    /* JADX INFO: renamed from: f */
    public void mo15424f(Act act, MusicContent musicContent, e30<Intent> e30Var) {
        if (wc40.f()) {
            oe40.m12549N(act, musicContent);
        } else {
            e30Var.call(InstaLikePickerAct.m3238E2(act, 9, true, false));
        }
    }

    @Override // p007l.vch
    /* JADX INFO: renamed from: g */
    public void mo15425g(Act act, int i, e30<Intent> e30Var, e30<Intent> e30Var2) {
        if (wc40.f()) {
            oe40.m12569d0(act, i, true, e30Var);
            return;
        }
        Intent intentM3238E2 = InstaLikePickerAct.m3238E2(act, i, false, false);
        if (NullChecker.a(e30Var)) {
            e30Var.call(intentM3238E2);
        }
        e30Var2.call(intentM3238E2);
    }
}
