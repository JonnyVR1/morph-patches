package p009l;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.e51;
import l.f6c0;
import l.l5j0;
import l.lsi0;
import l.t100;
import l.tvf;
import l.u4c0;
import l.v7c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pwf extends l5j0 {

    /* JADX INFO: renamed from: f */
    public Act f18938f;

    /* JADX INFO: renamed from: g */
    public View f18939g;

    /* JADX INFO: renamed from: h */
    public cwf0 f18940h;

    public pwf(@NonNull @NotNull Act act) {
        super(act, v7c0.e);
        this.f18938f = act;
        setCancelable(false);
        this.f18940h = new cwf0("p_fake_avatar_star_appeal_policy", getClass().getName());
    }

    /* JADX INFO: renamed from: E */
    private void m20735E() {
        this.f18939g = o7r.m19649a(this.f18938f).inflate(f6c0.j, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.d(10.0f);
        setContentView(this.f18939g, layoutParams);
        TextView textView = (TextView) this.f18939g.findViewById(u4c0.Ie);
        TextView textView2 = (TextView) this.f18939g.findViewById(u4c0.ze);
        TextView textView3 = (TextView) this.f18939g.findViewById(u4c0.Ee);
        TextView textView4 = (TextView) this.f18939g.findViewById(u4c0.xe);
        ImageView imageView = (ImageView) this.f18939g.findViewById(u4c0.z6);
        textView.setText(R.string.K4);
        textView2.setText(this.f18938f.getString(R.string.J4) + "\n" + this.f18938f.getString(R.string.bs) + "https://miniprogram-kyc.tencentcloudapi.com/s/h5/protocolTencent.html\n" + this.f18938f.getString(R.string.Yr) + "https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n" + this.f18938f.getString(R.string.Zr) + "\n\n" + this.f18938f.getString(R.string.as) + "https://cosmos.immomo.com/\n\n" + this.f18938f.getString(R.string.Xr));
        textView3.setText(R.string.Wr);
        xdl0.E0(textView3, new View.OnClickListener() { // from class: l.kwf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15868a.m20736G(view);
            }
        });
        textView4.setText(R.string.hs);
        xdl0.E0(textView4, new View.OnClickListener() { // from class: l.lwf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16430a.m20737H(view);
            }
        });
        xdl0.E0(imageView, new View.OnClickListener() { // from class: l.mwf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17126a.m20738I(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m20736G(View view) {
        if (!Network.isConnected(CoreModule.b)) {
            lsi0.y("网络错误");
            return;
        }
        zvf0.r("e_fake_avatar_star_appeal_policy_agree", "p_fake_avatar_star_appeal_policy");
        PhoneNumber phoneNumberNew_ = PhoneNumber.new_();
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9) && NullChecker.a(userP9.settings)) {
            phoneNumberNew_ = userP9.settings.phoneNumber;
        }
        tvf.o(phoneNumberNew_);
        tvf.h(this.f18938f, "fakeBatch");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m20737H(View view) {
        zvf0.r("e_fake_avatar_star_appeal_policy_no", "p_fake_avatar_star_appeal_policy");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m20738I(View view) {
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final void m20742D() {
        final Window window = getWindow();
        if (NullChecker.a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(android.R.id.content).findViewById(u4c0.o2);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(x2c0.R);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C1132a(bottomSheetBehaviorFrom));
        }
        e51.G(new Runnable() { // from class: l.owf
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(v7c0.f);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m20743F() {
        super.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        this.f18940h.k();
        this.f18940h.j();
        getWindow().setWindowAnimations(v7c0.a);
        e51.G(new Runnable() { // from class: l.nwf
            @Override // java.lang.Runnable
            public final void run() {
                this.f17752a.m20743F();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        super/*android.app.Dialog*/.onBackPressed();
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        m20735E();
        getWindow().setLayout(-1, -1);
    }

    public void onStart() {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onStart();
        this.f18940h.c();
        this.f18940h.r();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f18939g.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m20742D();
    }

    /* JADX INFO: renamed from: l.pwf$a */
    public class C1132a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f18941a;

        public C1132a(BottomSheetBehavior bottomSheetBehavior) {
            this.f18941a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f18941a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                pwf.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
