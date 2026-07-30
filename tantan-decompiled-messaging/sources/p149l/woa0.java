package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import org.jetbrains.annotations.NotNull;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class woa0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public FrameLayout f187392u;

    /* JADX INFO: renamed from: v */
    public ImageView f187393v;

    /* JADX INFO: renamed from: w */
    public VText f187394w;

    /* JADX INFO: renamed from: x */
    public TextView f187395x;

    /* JADX INFO: renamed from: y */
    public VText f187396y;

    /* JADX INFO: renamed from: z */
    public SVGAnimationView f187397z;

    /* JADX INFO: renamed from: l.woa0$a */
    public class C20925a extends AnimListener {
        public C20925a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            xdl0.m208344M(woa0.this.f187397z, false);
        }
    }

    public woa0(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m204797T() {
        SVGALoader.with(mo52800O().act()).from("https://auto.tancdn.com/v1/raw/ba9d515d-34e5-43a5-9928-68c07e4b4bcc10.pdf").autoPlay(true).repeatCount(1).animListener(new C20925a()).into(this.f187397z);
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return m131825w();
    }

    /* JADX INFO: renamed from: S */
    public View m204798S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xoa0.m210256b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public void m204799U() {
        this.f187394w.setText("黑金会员");
        this.f187395x.setText("尊享探探全平台权益");
        xdl0.m208344M(this.f187396y, false);
    }

    /* JADX INFO: renamed from: V */
    public void m204800V() {
        this.f187394w.setText("黑金会员");
        this.f187395x.setText("尊享探探全平台权益");
        xdl0.m208344M(this.f187396y, false);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        zvf0.m220402x("e_diamond_profile_entrance", OMSDialogPositon.p_suggest_user_profile_info_view);
        this.f187393v.setImageResource(x2c0.f189580Nh);
        if (ew40.m118398j() && mo52800O().mo51069K2().isMe()) {
            m204799U();
        } else {
            m204800V();
        }
        e51.m114743H(mo52800O().act(), new Runnable() { // from class: l.voa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f182377a.m204797T();
            }
        }, 600L);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        mo52800O().mo51069K2();
        return false;
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m204798S(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
    }
}
