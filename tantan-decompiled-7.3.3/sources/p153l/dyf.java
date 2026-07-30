package p153l;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class dyf extends pej0 {

    /* JADX INFO: renamed from: f */
    public Act f91199f;

    /* JADX INFO: renamed from: g */
    public View f91200g;

    /* JADX INFO: renamed from: h */
    public l4g0 f91201h;

    public dyf(@NonNull @NotNull Act act) {
        super(act, agc0.f71119e);
        this.f91199f = act;
        setCancelable(false);
        this.f91201h = new l4g0("p_fake_avatar_star_appeal_policy", getClass().getName());
    }

    /* JADX INFO: renamed from: E */
    private void m118665E() {
        this.f91200g = p9r.m171370a(this.f91199f).inflate(kec0.f125888j, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = qa00.m175859d(10.0f);
        setContentView(this.f91200g, layoutParams);
        TextView textView = (TextView) this.f91200g.findViewById(adc0.f70006Le);
        TextView textView2 = (TextView) this.f91200g.findViewById(adc0.f69853Ce);
        TextView textView3 = (TextView) this.f91200g.findViewById(adc0.f69938He);
        TextView textView4 = (TextView) this.f91200g.findViewById(adc0.f69819Ae);
        ImageView imageView = (ImageView) this.f91200g.findViewById(adc0.f69828B6);
        textView.setText(R$string.f18661M4);
        textView2.setText(this.f91199f.getString(R$string.f18631L4) + SignParameters.NEW_LINE + this.f91199f.getString(R$string.f19815xs) + "https://miniprogram-kyc.tencentcloudapi.com/s/h5/protocolTencent.html\n" + this.f91199f.getString(R$string.f19722us) + "https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n" + this.f91199f.getString(R$string.f19753vs) + "\n\n" + this.f91199f.getString(R$string.f19784ws) + "https://cosmos.immomo.com/\n\n" + this.f91199f.getString(R$string.f19691ts));
        textView3.setText(R$string.f19660ss);
        bnl0.m105509E0(textView3, new View.OnClickListener() { // from class: l.yxf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201965a.m118666G(view);
            }
        });
        textView4.setText(R$string.f18407Ds);
        bnl0.m105509E0(textView4, new View.OnClickListener() { // from class: l.zxf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206459a.m118667H(view);
            }
        });
        bnl0.m105509E0(imageView, new View.OnClickListener() { // from class: l.ayf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73965a.m118668I(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m118666G(View view) {
        if (!Network.isConnected(CoreModule.f18263b)) {
            o1j0.m165651y("网络错误");
            return;
        }
        i4g0.m138520r("e_fake_avatar_star_appeal_policy_agree", "p_fake_avatar_star_appeal_policy");
        PhoneNumber phoneNumberNew_ = PhoneNumber.new_();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9) && NullChecker.m82486a(userM116600p9.settings)) {
            phoneNumberNew_ = userM116600p9.settings.phoneNumber;
        }
        hxf.m137594o(phoneNumberNew_);
        hxf.m137587h(this.f91199f, "fakeBatch");
        m176562T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m118667H(View view) {
        i4g0.m138520r("e_fake_avatar_star_appeal_policy_no", "p_fake_avatar_star_appeal_policy");
        m176562T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m118668I(View view) {
        m176562T();
    }

    /* JADX INFO: renamed from: D */
    public final void m118672D() {
        final Window window = getWindow();
        if (NullChecker.m82486a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(adc0.f70516q2);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(dbc0.f86552S);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C16657a(bottomSheetBehaviorFrom));
        }
        l51.m152887G(new Runnable() { // from class: l.cyf
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(agc0.f71120f);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m118673F() {
        super.m176562T();
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    /* JADX INFO: renamed from: dismiss */
    public void m176562T() {
        this.f91201h.m152776k();
        this.f91201h.m152775j();
        getWindow().setWindowAnimations(agc0.f71115a);
        l51.m152887G(new Runnable() { // from class: l.byf
            @Override // java.lang.Runnable
            public final void run() {
                this.f79013a.m118673F();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        m176562T();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m118665E();
        getWindow().setLayout(-1, -1);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f91201h.m152768c();
        this.f91201h.m152783r();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f91200g.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m118672D();
    }

    /* JADX INFO: renamed from: l.dyf$a */
    public class C16657a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f91202a;

        public C16657a(BottomSheetBehavior bottomSheetBehavior) {
            this.f91202a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f91202a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                dyf.this.m176562T();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
