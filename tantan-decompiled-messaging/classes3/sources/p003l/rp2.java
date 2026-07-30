package p003l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageProfileSettingAct;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.ivz;
import l.s7m;
import l.szb0;
import l.ura;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class rp2 implements s7m<ivz> {

    /* JADX INFO: renamed from: a */
    public MessageProfileSettingAct f7031a;

    /* JADX INFO: renamed from: b */
    public ivz f7032b;

    public rp2(MessageProfileSettingAct messageProfileSettingAct) {
        this.f7031a = messageProfileSettingAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo2385C0() {
        return null;
    }

    @Override // 
    /* JADX INFO: renamed from: b */
    public void mo2388i1(ivz ivzVar) {
        this.f7032b = ivzVar;
    }

    /* JADX INFO: renamed from: c */
    public boolean m7362c(User user, Conversation conversation) {
        return this.f7032b.C0() || this.f7032b.D0();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2387d(User user, int i);

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m7363e(int i, int i2, Intent intent) {
        if (i2 == -1 && NullChecker.a(intent)) {
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selected_image");
            if (!vwb.J(arrayList)) {
                this.f7032b.N0((Picture) arrayList.get(0));
                this.f7031a.finish();
            }
        }
        return i2 == -1 && NullChecker.a(intent);
    }

    /* JADX INFO: renamed from: f */
    public boolean m7364f(User user) {
        return ura.e().d().c() && user.onlineMatch() && user.onlineMatchLocked();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo2390k(User user);

    /* JADX INFO: renamed from: l */
    public abstract void mo2391l(boolean z);

    /* JADX INFO: renamed from: n */
    public void m7365n() {
        this.f7031a.startActivityForResult(MediaPickerAct.X1(this.f7031a, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(4).build()), new a.a() { // from class: l.qp2
            /* JADX INFO: renamed from: a */
            public final boolean m7025a(int i, int i2, Intent intent) {
                return this.f6663a.m7363e(i, i2, intent);
            }
        });
        this.f7031a.overridePendingTransition(szb0.e, szb0.a);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo2392p(boolean z);

    public void destroy() {
    }

    /* JADX INFO: renamed from: j */
    public void mo2389j() {
    }

    /* JADX INFO: renamed from: i */
    public void mo2450i(boolean z) {
    }

    /* JADX INFO: renamed from: m */
    public void mo2451m(boolean z) {
    }
}
