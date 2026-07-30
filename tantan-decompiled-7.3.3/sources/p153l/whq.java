package p153l;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class whq extends ajq {

    /* JADX INFO: renamed from: l.whq$a */
    public class C21123a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f189184a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f189185b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f189186c;

        public C21123a(boolean z, String str, String str2) {
            this.f189184a = z;
            this.f189185b = str;
            this.f189186c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f189184a) {
                i4g0.m138495D("e_official_pic_video_handle", this.f189185b, new pf60("ext_data", this.f189186c));
            }
            VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
            if (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.idCard)) {
                if (TEnum.equals(verificationCenterM32615k4.idCard.status, "pending")) {
                    o1j0.m165649w(R$string.f21743j3);
                    return;
                } else if (TEnum.equals(verificationCenterM32615k4.idCard.status, "verified")) {
                    o1j0.m165649w(R$string.f21734i3);
                    return;
                }
            }
            Context context = view.getContext();
            context.startActivity(CoreModule.m30933P().m143412i().mo180549v3(context, "tantan_verification"));
            i4g0.m138520r("e_id_verification_reverify_assistant_link", OMSDialogPositon.p_chat_view);
        }
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo98010b(URI uri, boolean z, String str, String str2) {
        return new C21123a(z, str2, str);
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: c */
    public String mo98011c() {
        return "<a href = \"tantan://identity.*\">.*</a>";
    }
}
