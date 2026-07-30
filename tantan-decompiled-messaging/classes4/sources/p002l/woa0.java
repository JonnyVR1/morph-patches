package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.e51;
import l.ew40;
import l.mcr;
import l.x2c0;
import l.xdl0;
import l.xoa0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class woa0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public FrameLayout f21888u;

    /* JADX INFO: renamed from: v */
    public ImageView f21889v;

    /* JADX INFO: renamed from: w */
    public VText f21890w;

    /* JADX INFO: renamed from: x */
    public TextView f21891x;

    /* JADX INFO: renamed from: y */
    public VText f21892y;

    /* JADX INFO: renamed from: z */
    public SVGAnimationView f21893z;

    /* JADX INFO: renamed from: l.woa0$a */
    public class C0888a extends AnimListener {
        public C0888a() {
        }

        public void onFinished() {
            xdl0.M(woa0.this.f21893z, false);
        }
    }

    public woa0(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m25263T() {
        SVGALoader.with(mo3351O().act()).from("https://auto.tancdn.com/v1/raw/ba9d515d-34e5-43a5-9928-68c07e4b4bcc10.pdf").autoPlay(true).repeatCount(1).animListener(new C0888a()).into(this.f21893z);
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return m14465w();
    }

    /* JADX INFO: renamed from: S */
    public View m25264S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xoa0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public void m25265U() {
        this.f21890w.setText("黑金会员");
        this.f21891x.setText("尊享探探全平台权益");
        xdl0.M(this.f21892y, false);
    }

    /* JADX INFO: renamed from: V */
    public void m25266V() {
        this.f21890w.setText("黑金会员");
        this.f21891x.setText("尊享探探全平台权益");
        xdl0.M(this.f21892y, false);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        zvf0.x("e_diamond_profile_entrance", "p_suggest_user_profile_info_view");
        this.f21889v.setImageResource(x2c0.Nh);
        if (ew40.j() && mo3351O().mo1517K2().isMe()) {
            m25265U();
        } else {
            m25266V();
        }
        e51.H(mo3351O().act(), new Runnable() { // from class: l.voa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21249a.m25263T();
            }
        }, 600L);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        mo3351O().mo1517K2();
        return false;
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m25264S(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
    }
}
