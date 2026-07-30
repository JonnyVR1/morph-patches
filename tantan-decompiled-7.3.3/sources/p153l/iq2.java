package p153l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageProfileSettingAct;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iq2 implements iam<f400> {

    /* JADX INFO: renamed from: a */
    public MessageProfileSettingAct f116326a;

    /* JADX INFO: renamed from: b */
    public f400 f116327b;

    public iq2(MessageProfileSettingAct messageProfileSettingAct) {
        this.f116326a = messageProfileSettingAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b */
    public void mo22064i1(f400 f400Var) {
        this.f116327b = f400Var;
    }

    /* JADX INFO: renamed from: c */
    public boolean m141555c(User user, Conversation conversation) {
        return this.f116327b.m123841C0() || this.f116327b.m123842D0();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo50442d(User user, int i);

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m141556e(int i, int i2, Intent intent) {
        if (i2 == -1 && NullChecker.m82486a(intent)) {
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selected_image");
            if (!jyb.m147479J(arrayList)) {
                this.f116327b.m123848N0((Picture) arrayList.get(0));
                this.f116326a.m68056e2();
            }
        }
        return i2 == -1 && NullChecker.m82486a(intent);
    }

    /* JADX INFO: renamed from: f */
    public boolean m141557f(User user) {
        return gta.m132210e().m132214d().mo34811c() && user.onlineMatch() && user.onlineMatchLocked();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo50444k(User user);

    /* JADX INFO: renamed from: l */
    public abstract void mo50445l(boolean z);

    /* JADX INFO: renamed from: n */
    public void m141558n() {
        this.f116326a.startActivityForResult(MediaPickerAct.m80102Y1(this.f116326a, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(4).build()), new C4468a.a() { // from class: l.hq2
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f111067a.m141556e(i, i2, intent);
            }
        });
        this.f116326a.overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo50446p(boolean z);

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: j */
    public void mo50443j() {
    }

    /* JADX INFO: renamed from: i */
    public void mo50504i(boolean z) {
    }

    /* JADX INFO: renamed from: m */
    public void mo50505m(boolean z) {
    }
}
