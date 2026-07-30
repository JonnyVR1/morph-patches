package p009l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.AppealMaterial;
import com.p1.mobile.putong.data.AppealPostData;
import com.p1.mobile.putong.data.FaceidLiveData;
import com.p1.mobile.putong.data.IdCard;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.network.ApiExcep;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.roj0;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class iy0 extends jq2<py0> {

    /* JADX INFO: renamed from: a */
    public FaceidLiveData f14851a;

    /* JADX INFO: renamed from: b */
    public String f14852b;

    /* JADX INFO: renamed from: c */
    public String f14853c;

    /* JADX INFO: renamed from: d */
    public PhoneNumber f14854d;

    /* JADX INFO: renamed from: e */
    public String f14855e;

    /* JADX INFO: renamed from: f */
    public ArrayList<Media> f14856f;

    public iy0(mcr mcrVar) {
        super(mcrVar);
        this.f14856f = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m16793l0(Bundle bundle) {
        ((py0) ((jq2) this).viewModel).m20767r();
    }

    /* JADX INFO: renamed from: a0 */
    public void m16794a0() {
        super.a0();
        creates(new e30() { // from class: l.fy0
            public final void call(Object obj) {
                this.f13216a.m16793l0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final void m16795i0(String str) {
        if (TextUtils.equals(str, "jailed")) {
            ((py0) ((jq2) this).viewModel).act().progressDismiss();
            Intent intentM71Z1 = AppealProgressAct.m71Z1(((py0) ((jq2) this).viewModel).act(), false);
            intentM71Z1.putExtra("project_type_extra", "forbid_chat_appeal");
            ((py0) ((jq2) this).viewModel).act().startActivity(intentM71Z1);
            ((py0) ((jq2) this).viewModel).act().finish();
            return;
        }
        if (TextUtils.equals(str, "content")) {
            ((py0) ((jq2) this).viewModel).act().progressDismiss();
            ((py0) ((jq2) this).viewModel).act().startActivity(AppealProgressAct.m71Z1(((py0) ((jq2) this).viewModel).act(), false));
            ((py0) ((jq2) this).viewModel).act().finish();
            return;
        }
        o6j0.n("e_verification_scanface_submit_appeal", "p_appeal_reason", new o6j0.a[]{o6j0.a.h("sdk_name", rc2.m21492e().m21497f()), o6j0.a.h("verification_result_code", "0"), o6j0.a.h("verification_type", rc2.m21492e().m21498g())});
        rc2.m21492e().m21501j(IdCard.new_());
        ((py0) ((jq2) this).viewModel).act().progressDismiss();
        ((py0) ((jq2) this).viewModel).act().startActivity(AppealProgressAct.m70Y1(((py0) ((jq2) this).viewModel).act()));
        ((py0) ((jq2) this).viewModel).act().finish();
    }

    /* JADX INFO: renamed from: j0 */
    public final String m16796j0(boolean z) {
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
    public void m16797k0(FaceidLiveData faceidLiveData, String str, PhoneNumber phoneNumber, String str2, String str3) {
        this.f14851a = faceidLiveData;
        this.f14852b = str;
        this.f14854d = phoneNumber;
        this.f14853c = str2;
        this.f14855e = str3;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m16798m0(AppealPostData appealPostData, roj0 roj0Var) {
        m16795i0(appealPostData.reason);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m16799n0(AppealPostData appealPostData, Throwable th) {
        if (TextUtils.equals(appealPostData.reason, "jailed") || TextUtils.equals(appealPostData.reason, "content")) {
            ((py0) ((jq2) this).viewModel).act().progressDismiss();
        } else if (th instanceof ApiExcep) {
            o6j0.n("e_verification_scanface_submit_appeal", "p_appeal_reason", new o6j0.a[]{o6j0.a.h("sdk_name", rc2.m21492e().m21497f()), o6j0.a.h("verification_result_code", String.valueOf(((ApiExcep) th).response.q())), o6j0.a.h("verification_type", rc2.m21492e().m21498g())});
        }
        ((py0) ((jq2) this).viewModel).act().progressDismiss();
    }

    /* JADX INFO: renamed from: o0 */
    public void m16800o0(List<Media> list) {
        this.f14856f.addAll(vwb.n(list, new w9j() { // from class: l.ey0
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj) instanceof Picture);
            }
        }));
        ((py0) ((jq2) this).viewModel).m20766n();
    }

    /* JADX INFO: renamed from: p0 */
    public void m16801p0(@NotNull AppealMaterial appealMaterial) {
        final AppealPostData appealPostDataNew_ = AppealPostData.new_();
        appealPostDataNew_.provider = this.f14853c;
        appealPostDataNew_.providerData = this.f14851a;
        appealPostDataNew_.reason = "banned";
        appealPostDataNew_.ip = m16796j0(true);
        if (TextUtils.equals("idCard", this.f14852b)) {
            appealPostDataNew_.idCard = rc2.m21492e().m21496d();
        } else if (TextUtils.equals("chatAppeal", this.f14852b)) {
            appealPostDataNew_.reason = "jailed";
        } else if (TextUtils.equals("content", this.f14852b)) {
            appealPostDataNew_.reason = "content";
            appealPostDataNew_.appeal_type = "content";
            appealPostDataNew_.ticketId = this.f14855e;
        }
        appealPostDataNew_.smsPhone = this.f14854d;
        appealPostDataNew_.verificationMethod = this.f14852b;
        appealPostDataNew_.material = appealMaterial;
        ((py0) ((jq2) this).viewModel).act().progress(R.string.Uo);
        duringCreated(CoreModule.c.e0.ya(appealPostDataNew_, this.f14856f)).subscribe(mkd0.H(new e30() { // from class: l.gy0
            public final void call(Object obj) {
                this.f13807a.m16798m0(appealPostDataNew_, (roj0) obj);
            }
        }, new e30() { // from class: l.hy0
            public final void call(Object obj) {
                this.f14285a.m16799n0(appealPostDataNew_, (Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
