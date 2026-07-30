package p149l;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import java.util.ArrayList;
import java.util.List;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zl90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public boolean f203607u;

    /* JADX INFO: renamed from: v */
    public VRelative f203608v;

    /* JADX INFO: renamed from: w */
    public VText f203609w;

    public zl90(@NonNull a1m a1mVar, final mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f203607u = false;
        m131821p().creates(new e30() { // from class: l.ul90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177023a.m219270Y(mcrVar, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m219267a0(View view) {
        zvf0.m220399u("e_picture_fake_button", mo52800O().pageId(), vwb.m200311Y("pic_show_from", "profile_banner"));
        vpx vpxVar = new vpx();
        vpxVar.f182531a = 1;
        vpxVar.f182533c = false;
        vpxVar.f182532b = false;
        vpxVar.f182534d = true;
        vpxVar.f182536f = MediaPickerAct.f30623D;
        vpxVar.f182535e = "profile";
        vpxVar.f182537g = false;
        vpxVar.f182538h = true;
        vpxVar.f182539i = CoreModule.f17545c.f19639e0.m169527p9().gender;
        vpxVar.f182541k = true;
        mo52800O().mo94570k0(com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct.m78919X1(mo52800O().getContext(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).build()), new C4317a.a() { // from class: l.yl90
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f198871a.m219271Z(i, i2, intent);
            }
        });
        mo52800O().act().overridePendingTransition(rzb0.f161653y, 0);
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    /* JADX INFO: renamed from: W */
    public View m219268W(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return am90.m97531b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m219269X(List list) {
        boolean z = this.f203607u;
        if (CoreModule.f17545c.f19639e0.m169464Z7()) {
            this.f203607u = true;
            zvf0.m220368A("e_picture_fake_button", mo52800O().pageId(), vwb.m200311Y("pic_show_from", "profile_banner"));
        } else {
            this.f203607u = false;
        }
        if (z != this.f203607u) {
            mo52800O().mo51067J3();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m219270Y(mcr mcrVar, Bundle bundle) {
        if ((TextUtils.equals("preview_card", mo52800O().from()) && mo52800O().mo51075P1()) || mo52800O().mo51119m0() || !mo52800O().mo51075P1()) {
            return;
        }
        mcrVar.duringCreated(CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.wl90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.xl90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193400a.m219269X((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean m219271Z(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return false;
        }
        ark.m98433L0(mo52800O().act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h));
        CoreModule.f17545c.f19639e0.m169395H7();
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public void m219272b0() {
        boolean zM200928a = w1g.m200928a();
        VText vText = this.f203609w;
        if (zM200928a) {
            vText.setText(CoreModule.m29936Q().mo67285sj());
        } else {
            vText.setText(R$string.f18993v4);
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f203609w.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        if ((TextUtils.equals("preview_card", mo52800O().from()) && mo52800O().mo51075P1()) || !mo52800O().mo51075P1() || mo52800O().mo51119m0()) {
            return false;
        }
        return this.f203607u;
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m219268W(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m219272b0();
        this.f203608v.setOnClickListener(new View.OnClickListener() { // from class: l.vl90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181924a.m219267a0(view);
            }
        });
    }
}
