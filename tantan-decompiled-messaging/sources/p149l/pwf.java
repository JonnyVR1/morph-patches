package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class pwf extends l5j0 {

    /* JADX INFO: renamed from: f */
    public Act f151561f;

    /* JADX INFO: renamed from: g */
    public View f151562g;

    /* JADX INFO: renamed from: h */
    public cwf0 f151563h;

    public pwf(@NonNull @NotNull Act act) {
        super(act, v7c0.f180358e);
        this.f151561f = act;
        setCancelable(false);
        this.f151563h = new cwf0("p_fake_avatar_star_appeal_policy", getClass().getName());
    }

    /* JADX INFO: renamed from: E */
    private void m171740E() {
        this.f151562g = o7r.m163037a(this.f151561f).inflate(f6c0.f95834j, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.m186890d(10.0f);
        setContentView(this.f151562g, layoutParams);
        TextView textView = (TextView) this.f151562g.findViewById(u4c0.f173867Ie);
        TextView textView2 = (TextView) this.f151562g.findViewById(u4c0.f174590ze);
        TextView textView3 = (TextView) this.f151562g.findViewById(u4c0.f173799Ee);
        TextView textView4 = (TextView) this.f151562g.findViewById(u4c0.f174556xe);
        ImageView imageView = (ImageView) this.f151562g.findViewById(u4c0.f174582z6);
        textView.setText(R$string.f17871K4);
        textView2.setText(this.f151561f.getString(R$string.f17841J4) + SignParameters.NEW_LINE + this.f151561f.getString(R$string.f18406bs) + "https://miniprogram-kyc.tencentcloudapi.com/s/h5/protocolTencent.html\n" + this.f151561f.getString(R$string.f18314Yr) + "https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n" + this.f151561f.getString(R$string.f18344Zr) + "\n\n" + this.f151561f.getString(R$string.f18375as) + "https://cosmos.immomo.com/\n\n" + this.f151561f.getString(R$string.f18284Xr));
        textView3.setText(R$string.f18254Wr);
        xdl0.m208329E0(textView3, new View.OnClickListener() { // from class: l.kwf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124981a.m171741G(view);
            }
        });
        textView4.setText(R$string.f18591hs);
        xdl0.m208329E0(textView4, new View.OnClickListener() { // from class: l.lwf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130266a.m171742H(view);
            }
        });
        xdl0.m208329E0(imageView, new View.OnClickListener() { // from class: l.mwf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136049a.m171743I(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m171741G(View view) {
        if (!Network.isConnected(CoreModule.f17544b)) {
            lsi0.m151595y("网络错误");
            return;
        }
        zvf0.m220396r("e_fake_avatar_star_appeal_policy_agree", "p_fake_avatar_star_appeal_policy");
        PhoneNumber phoneNumberNew_ = PhoneNumber.new_();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9) && NullChecker.m81303a(userM169527p9.settings)) {
            phoneNumberNew_ = userM169527p9.settings.phoneNumber;
        }
        tvf.m190737o(phoneNumberNew_);
        tvf.m190730h(this.f151561f, "fakeBatch");
        m101651T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m171742H(View view) {
        zvf0.m220396r("e_fake_avatar_star_appeal_policy_no", "p_fake_avatar_star_appeal_policy");
        m101651T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m171743I(View view) {
        m101651T();
    }

    /* JADX INFO: renamed from: D */
    public final void m171747D() {
        final Window window = getWindow();
        if (NullChecker.m81303a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.f174391o2);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(x2c0.f189686R);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C19352a(bottomSheetBehaviorFrom));
        }
        e51.m114742G(new Runnable() { // from class: l.owf
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(v7c0.f180359f);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m171748F() {
        super.m101651T();
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    /* JADX INFO: renamed from: dismiss */
    public void m101651T() {
        this.f151563h.m109035k();
        this.f151563h.m109034j();
        getWindow().setWindowAnimations(v7c0.f180354a);
        e51.m114742G(new Runnable() { // from class: l.nwf
            @Override // java.lang.Runnable
            public final void run() {
                this.f140944a.m171748F();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        m101651T();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m171740E();
        getWindow().setLayout(-1, -1);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f151563h.m109027c();
        this.f151563h.m109042r();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f151562g.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m171747D();
    }

    /* JADX INFO: renamed from: l.pwf$a */
    public class C19352a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f151564a;

        public C19352a(BottomSheetBehavior bottomSheetBehavior) {
            this.f151564a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f151564a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                pwf.this.m101651T();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
