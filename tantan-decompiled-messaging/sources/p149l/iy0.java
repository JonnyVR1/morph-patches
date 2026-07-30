package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ChatGroupStatus;
import com.p046p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p046p1.mobile.putong.data.AppealMaterial;
import com.p046p1.mobile.putong.data.AppealPostData;
import com.p046p1.mobile.putong.data.FaceidLiveData;
import com.p046p1.mobile.putong.data.IdCard;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.SchemeKey;
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
public class iy0 extends jq2<py0> {

    /* JADX INFO: renamed from: a */
    public FaceidLiveData f115413a;

    /* JADX INFO: renamed from: b */
    public String f115414b;

    /* JADX INFO: renamed from: c */
    public String f115415c;

    /* JADX INFO: renamed from: d */
    public PhoneNumber f115416d;

    /* JADX INFO: renamed from: e */
    public String f115417e;

    /* JADX INFO: renamed from: f */
    public ArrayList<Media> f115418f;

    public iy0(mcr mcrVar) {
        super(mcrVar);
        this.f115418f = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m138905l0(Bundle bundle) {
        ((py0) this.viewModel).m171984r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.fy0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99823a.m138905l0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final void m138906i0(String str) {
        if (TextUtils.equals(str, "jailed")) {
            ((py0) this.viewModel).getAct().progressDismiss();
            Intent intentM36172Z1 = AppealProgressAct.m36172Z1(((py0) this.viewModel).getAct(), false);
            intentM36172Z1.putExtra("project_type_extra", "forbid_chat_appeal");
            ((py0) this.viewModel).getAct().startActivity(intentM36172Z1);
            ((py0) this.viewModel).getAct().m66873d2();
            return;
        }
        if (TextUtils.equals(str, "content")) {
            ((py0) this.viewModel).getAct().progressDismiss();
            ((py0) this.viewModel).getAct().startActivity(AppealProgressAct.m36172Z1(((py0) this.viewModel).getAct(), false));
            ((py0) this.viewModel).getAct().m66873d2();
            return;
        }
        o6j0.m162870n("e_verification_scanface_submit_appeal", "p_appeal_reason", o6j0.C18854a.m162878h("sdk_name", rc2.m178723e().m178728f()), o6j0.C18854a.m162878h("verification_result_code", "0"), o6j0.C18854a.m162878h("verification_type", rc2.m178723e().m178729g()));
        rc2.m178723e().m178732j(IdCard.new_());
        ((py0) this.viewModel).getAct().progressDismiss();
        ((py0) this.viewModel).getAct().startActivity(AppealProgressAct.m36171Y1(((py0) this.viewModel).getAct()));
        ((py0) this.viewModel).getAct().m66873d2();
    }

    /* JADX INFO: renamed from: j0 */
    public final String m138907j0(boolean z) {
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
    public void m138908k0(FaceidLiveData faceidLiveData, String str, PhoneNumber phoneNumber, String str2, String str3) {
        this.f115413a = faceidLiveData;
        this.f115414b = str;
        this.f115416d = phoneNumber;
        this.f115415c = str2;
        this.f115417e = str3;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m138909m0(AppealPostData appealPostData, roj0 roj0Var) {
        m138906i0(appealPostData.reason);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m138910n0(AppealPostData appealPostData, Throwable th) {
        if (TextUtils.equals(appealPostData.reason, "jailed") || TextUtils.equals(appealPostData.reason, "content")) {
            ((py0) this.viewModel).getAct().progressDismiss();
        } else if (th instanceof ApiExcep) {
            o6j0.m162870n("e_verification_scanface_submit_appeal", "p_appeal_reason", o6j0.C18854a.m162878h("sdk_name", rc2.m178723e().m178728f()), o6j0.C18854a.m162878h("verification_result_code", String.valueOf(((ApiExcep) th).response.m118609q())), o6j0.C18854a.m162878h("verification_type", rc2.m178723e().m178729g()));
        }
        ((py0) this.viewModel).getAct().progressDismiss();
    }

    /* JADX INFO: renamed from: o0 */
    public void m138911o0(List<Media> list) {
        this.f115418f.addAll(vwb.m200339n(list, new w9j() { // from class: l.ey0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj) instanceof Picture);
            }
        }));
        ((py0) this.viewModel).m171983n();
    }

    /* JADX INFO: renamed from: p0 */
    public void m138912p0(@NotNull AppealMaterial appealMaterial) {
        final AppealPostData appealPostDataNew_ = AppealPostData.new_();
        appealPostDataNew_.provider = this.f115415c;
        appealPostDataNew_.providerData = this.f115413a;
        appealPostDataNew_.reason = ChatGroupStatus.banned;
        appealPostDataNew_.f38722ip = m138907j0(true);
        if (TextUtils.equals("idCard", this.f115414b)) {
            appealPostDataNew_.idCard = rc2.m178723e().m178727d();
        } else if (TextUtils.equals(SchemeKey.chatAppeal, this.f115414b)) {
            appealPostDataNew_.reason = "jailed";
        } else if (TextUtils.equals("content", this.f115414b)) {
            appealPostDataNew_.reason = "content";
            appealPostDataNew_.appeal_type = "content";
            appealPostDataNew_.ticketId = this.f115417e;
        }
        appealPostDataNew_.smsPhone = this.f115416d;
        appealPostDataNew_.verificationMethod = this.f115414b;
        appealPostDataNew_.material = appealMaterial;
        ((py0) this.viewModel).getAct().progress(R$string.f18191Uo);
        duringCreated(CoreModule.f17545c.f19639e0.m169564ya(appealPostDataNew_, this.f115418f)).subscribe(mkd0.m154956H(new e30() { // from class: l.gy0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104959a.m138909m0(appealPostDataNew_, (roj0) obj);
            }
        }, new e30() { // from class: l.hy0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110005a.m138910n0(appealPostDataNew_, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
