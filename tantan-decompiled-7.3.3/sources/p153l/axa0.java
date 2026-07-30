package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import org.jetbrains.annotations.NotNull;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class axa0 extends ep90 {

    /* JADX INFO: renamed from: u */
    public FrameLayout f73829u;

    /* JADX INFO: renamed from: v */
    public ImageView f73830v;

    /* JADX INFO: renamed from: w */
    public VText f73831w;

    /* JADX INFO: renamed from: x */
    public TextView f73832x;

    /* JADX INFO: renamed from: y */
    public VText f73833y;

    /* JADX INFO: renamed from: z */
    public SVGAnimationView f73834z;

    /* JADX INFO: renamed from: l.axa0$a */
    public class C15855a extends AnimListener {
        public C15855a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            bnl0.m105524M(axa0.this.f73834z, false);
        }
    }

    public axa0(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m100768T() {
        SVGALoader.with(mo53983O().act()).from("https://auto.tancdn.com/v1/raw/ba9d515d-34e5-43a5-9928-68c07e4b4bcc10.pdf").autoPlay(true).repeatCount(1).animListener(new C15855a()).into(this.f73834z);
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return m168325w();
    }

    /* JADX INFO: renamed from: S */
    public View m100769S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bxa0.m106871b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public void m100770U() {
        this.f73831w.setText("黑金会员");
        this.f73832x.setText("尊享探探全平台权益");
        bnl0.m105524M(this.f73833y, false);
    }

    /* JADX INFO: renamed from: V */
    public void m100771V() {
        this.f73831w.setText("黑金会员");
        this.f73832x.setText("尊享探探全平台权益");
        bnl0.m105524M(this.f73833y, false);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        i4g0.m138526x("e_diamond_profile_entrance", OMSDialogPositon.p_suggest_user_profile_info_view);
        this.f73830v.setImageResource(dbc0.f86027Bi);
        if (t450.m189175j() && mo53983O().mo52252K2().isMe()) {
            m100770U();
        } else {
            m100771V();
        }
        l51.m152888H(mo53983O().act(), new Runnable() { // from class: l.zwa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f206329a.m100768T();
            }
        }, 600L);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        mo53983O().mo52252K2();
        return false;
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m100769S(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
    }
}
