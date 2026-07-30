package p149l;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class wch implements vch {
    @Override // p149l.vch
    /* JADX INFO: renamed from: a */
    public void mo197762a(Act act, String str, MusicContent musicContent, e30<Intent> e30Var) {
        if (wc40.m202629f()) {
            oe40.m163813O(act, musicContent, str);
        } else {
            e30Var.call(InstaLikePickerAct.m62256E2(act, 9, true, false));
        }
    }

    @Override // p149l.vch
    /* JADX INFO: renamed from: b */
    public void mo197763b(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, e30<Intent> e30Var, String str4) {
        if (wc40.m202629f()) {
            qib0.f154713b0.f139233d.mo60298Nr(act, arrayList, z, str, str2, str3, str4);
        } else {
            e30Var.call(InstaLikePickerAct.m62256E2(act, 9, true, false));
        }
    }

    @Override // p149l.vch
    /* JADX INFO: renamed from: c */
    public void mo197764c(Act act, int i, e30<Intent> e30Var) {
        if (wc40.m202629f()) {
            oe40.m163828b0(act, i);
        } else {
            e30Var.call(InstaLikePickerAct.m62256E2(act, i, false, false));
        }
    }

    @Override // p149l.vch
    /* JADX INFO: renamed from: d */
    public void mo197765d(Act act, e30<Intent> e30Var) {
        mo197767f(act, null, e30Var);
    }

    @Override // p149l.vch
    /* JADX INFO: renamed from: e */
    public void mo197766e(Act act, boolean z, String str, String str2, String str3, e30<Intent> e30Var, String str4, String str5) {
        if (wc40.m202629f()) {
            qib0.f154713b0.f139233d.mo60369le(act, z, str, str2, str3, str4, str5);
        } else {
            e30Var.call(InstaLikePickerAct.m62256E2(act, 9, true, false));
        }
    }

    @Override // p149l.vch
    /* JADX INFO: renamed from: f */
    public void mo197767f(Act act, MusicContent musicContent, e30<Intent> e30Var) {
        if (wc40.m202629f()) {
            oe40.m163812N(act, musicContent);
        } else {
            e30Var.call(InstaLikePickerAct.m62256E2(act, 9, true, false));
        }
    }

    @Override // p149l.vch
    /* JADX INFO: renamed from: g */
    public void mo197768g(Act act, int i, e30<Intent> e30Var, e30<Intent> e30Var2) {
        if (wc40.m202629f()) {
            oe40.m163832d0(act, i, true, e30Var);
            return;
        }
        Intent intentM62256E2 = InstaLikePickerAct.m62256E2(act, i, false, false);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(intentM62256E2);
        }
        e30Var2.call(intentM62256E2);
    }
}
