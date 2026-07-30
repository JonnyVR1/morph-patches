package p149l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageProfileSettingAct;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rp2 implements s7m<ivz> {

    /* JADX INFO: renamed from: a */
    public MessageProfileSettingAct f160469a;

    /* JADX INFO: renamed from: b */
    public ivz f160470b;

    public rp2(MessageProfileSettingAct messageProfileSettingAct) {
        this.f160469a = messageProfileSettingAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b */
    public void mo21065i1(ivz ivzVar) {
        this.f160470b = ivzVar;
    }

    /* JADX INFO: renamed from: c */
    public boolean m180290c(User user, Conversation conversation) {
        return this.f160470b.m138687C0() || this.f160470b.m138688D0();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo49259d(User user, int i);

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m180291e(int i, int i2, Intent intent) {
        if (i2 == -1 && NullChecker.m81303a(intent)) {
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selected_image");
            if (!vwb.m200296J(arrayList)) {
                this.f160470b.m138694N0((Picture) arrayList.get(0));
                this.f160469a.m66873d2();
            }
        }
        return i2 == -1 && NullChecker.m81303a(intent);
    }

    /* JADX INFO: renamed from: f */
    public boolean m180292f(User user) {
        return ura.m195053e().m195057d().mo33808c() && user.onlineMatch() && user.onlineMatchLocked();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo49261k(User user);

    /* JADX INFO: renamed from: l */
    public abstract void mo49262l(boolean z);

    /* JADX INFO: renamed from: n */
    public void m180293n() {
        this.f160469a.startActivityForResult(MediaPickerAct.m78919X1(this.f160469a, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(4).build()), new C4317a.a() { // from class: l.qp2
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f155664a.m180291e(i, i2, intent);
            }
        });
        this.f160469a.overridePendingTransition(szb0.f167030e, szb0.f167026a);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo49263p(boolean z);

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: j */
    public void mo49260j() {
    }

    /* JADX INFO: renamed from: i */
    public void mo49321i(boolean z) {
    }

    /* JADX INFO: renamed from: m */
    public void mo49322m(boolean z) {
    }
}
