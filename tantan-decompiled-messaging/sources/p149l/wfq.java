package p149l;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class wfq extends ahq {

    /* JADX INFO: renamed from: l.wfq$a */
    public class C20869a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f186099a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f186100b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f186101c;

        public C20869a(boolean z, String str, String str2) {
            this.f186099a = z;
            this.f186100b = str;
            this.f186101c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f186099a) {
                zvf0.m220371D("e_official_pic_video_handle", this.f186100b, new j760("ext_data", this.f186101c));
            }
            VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
            if (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.idCard)) {
                if (TEnum.equals(verificationCenterM31612k4.idCard.status, "pending")) {
                    lsi0.m151593w(R$string.f21001j3);
                    return;
                } else if (TEnum.equals(verificationCenterM31612k4.idCard.status, "verified")) {
                    lsi0.m151593w(R$string.f20992i3);
                    return;
                }
            }
            Context context = view.getContext();
            context.startActivity(CoreModule.m29935P().m94658i().mo158457v3(context, "tantan_verification"));
            zvf0.m220396r("e_id_verification_reverify_assistant_link", OMSDialogPositon.p_chat_view);
        }
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo96321b(URI uri, boolean z, String str, String str2) {
        return new C20869a(z, str2, str);
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: c */
    public String mo96322c() {
        return "<a href = \"tantan://identity.*\">.*</a>";
    }
}
