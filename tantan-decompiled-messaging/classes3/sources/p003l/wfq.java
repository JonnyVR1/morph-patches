package p003l;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.net.URI;
import l.ahq;
import l.j760;
import l.lsi0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class wfq extends ahq {

    /* JADX INFO: renamed from: l.wfq$a */
    public class C0617a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f8543a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8544b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f8545c;

        public C0617a(boolean z, String str, String str2) {
            this.f8543a = z;
            this.f8544b = str;
            this.f8545c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f8543a) {
                zvf0.D("e_official_pic_video_handle", this.f8544b, new j760[]{new j760("ext_data", this.f8545c)});
            }
            VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
            if (NullChecker.a(verificationCenterK4) && NullChecker.a(verificationCenterK4.idCard)) {
                if (TEnum.equals(verificationCenterK4.idCard.status, "pending")) {
                    lsi0.w(R.string.j3);
                    return;
                } else if (TEnum.equals(verificationCenterK4.idCard.status, "verified")) {
                    lsi0.w(R.string.i3);
                    return;
                }
            }
            Context context = view.getContext();
            context.startActivity(CoreModule.P().i().v3(context, "tantan_verification"));
            zvf0.r("e_id_verification_reverify_assistant_link", "p_chat_view");
        }
    }

    /* JADX INFO: renamed from: b */
    public ClickableSpan m8556b(URI uri, boolean z, String str, String str2) {
        return new C0617a(z, str2, str);
    }

    /* JADX INFO: renamed from: c */
    public String m8557c() {
        return "<a href = \"tantan://identity.*\">.*</a>";
    }
}
