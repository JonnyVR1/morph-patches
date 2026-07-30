package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ChatGroupStatus;
import com.p051p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p051p1.mobile.putong.data.AppealMaterial;
import com.p051p1.mobile.putong.data.AppealPostData;
import com.p051p1.mobile.putong.data.FaceidLiveData;
import com.p051p1.mobile.putong.data.IdCard;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.network.ApiExcep;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class py0 extends ar2<wy0> {

    /* JADX INFO: renamed from: a */
    public FaceidLiveData f154607a;

    /* JADX INFO: renamed from: b */
    public String f154608b;

    /* JADX INFO: renamed from: c */
    public String f154609c;

    /* JADX INFO: renamed from: d */
    public PhoneNumber f154610d;

    /* JADX INFO: renamed from: e */
    public String f154611e;

    /* JADX INFO: renamed from: f */
    public ArrayList<Media> f154612f;

    public py0(ner nerVar) {
        super(nerVar);
        this.f154612f = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m174261l0(Bundle bundle) {
        ((wy0) this.viewModel).m208476r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.my0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139309a.m174261l0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final void m174262i0(String str) {
        if (TextUtils.equals(str, "jailed")) {
            ((wy0) this.viewModel).getAct().progressDismiss();
            Intent intentM37175a2 = AppealProgressAct.m37175a2(((wy0) this.viewModel).getAct(), false);
            intentM37175a2.putExtra("project_type_extra", "forbid_chat_appeal");
            ((wy0) this.viewModel).getAct().startActivity(intentM37175a2);
            ((wy0) this.viewModel).getAct().m68056e2();
            return;
        }
        if (TextUtils.equals(str, "content")) {
            ((wy0) this.viewModel).getAct().progressDismiss();
            ((wy0) this.viewModel).getAct().startActivity(AppealProgressAct.m37175a2(((wy0) this.viewModel).getAct(), false));
            ((wy0) this.viewModel).getAct().m68056e2();
            return;
        }
        sfj0.m185607n("e_verification_scanface_submit_appeal", "p_appeal_reason", sfj0.C20032a.m185615h("sdk_name", yc2.m215118e().m215123f()), sfj0.C20032a.m185615h("verification_result_code", "0"), sfj0.C20032a.m185615h("verification_type", yc2.m215118e().m215124g()));
        yc2.m215118e().m215127j(IdCard.new_());
        ((wy0) this.viewModel).getAct().progressDismiss();
        ((wy0) this.viewModel).getAct().startActivity(AppealProgressAct.m37174Z1(((wy0) this.viewModel).getAct()));
        ((wy0) this.viewModel).getAct().m68056e2();
    }

    /* JADX INFO: renamed from: j0 */
    public final String m174263j0(boolean z) {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        boolean z2 = hostAddress.indexOf(58) < 0;
                        if (z) {
                            if (z2) {
                                return hostAddress;
                            }
                        } else if (!z2) {
                            int iIndexOf = hostAddress.indexOf(37);
                            return iIndexOf < 0 ? hostAddress.toUpperCase() : hostAddress.substring(0, iIndexOf).toUpperCase();
                        }
                    }
                }
            }
            return "";
        } catch (NullPointerException | SocketException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m174264k0(FaceidLiveData faceidLiveData, String str, PhoneNumber phoneNumber, String str2, String str3) {
        this.f154607a = faceidLiveData;
        this.f154608b = str;
        this.f154610d = phoneNumber;
        this.f154609c = str2;
        this.f154611e = str3;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m174265m0(AppealPostData appealPostData, uxj0 uxj0Var) {
        m174262i0(appealPostData.reason);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m174266n0(AppealPostData appealPostData, Throwable th) {
        if (TextUtils.equals(appealPostData.reason, "jailed") || TextUtils.equals(appealPostData.reason, "content")) {
            ((wy0) this.viewModel).getAct().progressDismiss();
        } else if (th instanceof ApiExcep) {
            sfj0.m185607n("e_verification_scanface_submit_appeal", "p_appeal_reason", sfj0.C20032a.m185615h("sdk_name", yc2.m215118e().m215123f()), sfj0.C20032a.m185615h("verification_result_code", String.valueOf(((ApiExcep) th).response.m138673q())), sfj0.C20032a.m185615h("verification_type", yc2.m215118e().m215124g()));
        }
        ((wy0) this.viewModel).getAct().progressDismiss();
    }

    /* JADX INFO: renamed from: o0 */
    public void m174267o0(List<Media> list) {
        this.f154612f.addAll(jyb.m147522n(list, new qcj() { // from class: l.ly0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj) instanceof Picture);
            }
        }));
        ((wy0) this.viewModel).m208475n();
    }

    /* JADX INFO: renamed from: p0 */
    public void m174268p0(@NotNull AppealMaterial appealMaterial) {
        final AppealPostData appealPostDataNew_ = AppealPostData.new_();
        appealPostDataNew_.provider = this.f154609c;
        appealPostDataNew_.providerData = this.f154607a;
        appealPostDataNew_.reason = ChatGroupStatus.banned;
        appealPostDataNew_.f39570ip = m174263j0(true);
        if (TextUtils.equals("idCard", this.f154608b)) {
            appealPostDataNew_.idCard = yc2.m215118e().m215122d();
        } else if (TextUtils.equals(SchemeKey.chatAppeal, this.f154608b)) {
            appealPostDataNew_.reason = "jailed";
        } else if (TextUtils.equals("content", this.f154608b)) {
            appealPostDataNew_.reason = "content";
            appealPostDataNew_.appeal_type = "content";
            appealPostDataNew_.ticketId = this.f154611e;
        }
        appealPostDataNew_.smsPhone = this.f154610d;
        appealPostDataNew_.verificationMethod = this.f154608b;
        appealPostDataNew_.material = appealMaterial;
        ((wy0) this.viewModel).getAct().progress(R$string.f19595qp);
        duringCreated(CoreModule.f18264c.f20381e0.m116637ya(appealPostDataNew_, this.f154612f)).subscribe(psd0.m173597H(new y20() { // from class: l.ny0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144282a.m174265m0(appealPostDataNew_, (uxj0) obj);
            }
        }, new y20() { // from class: l.oy0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149728a.m174266n0(appealPostDataNew_, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
