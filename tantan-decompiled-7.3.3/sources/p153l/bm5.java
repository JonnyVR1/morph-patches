package p153l;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class bm5 extends pej0 {

    /* JADX INFO: renamed from: f */
    public int f77256f;

    /* JADX INFO: renamed from: g */
    public Context f77257g;

    /* JADX INFO: renamed from: h */
    public View f77258h;

    /* JADX INFO: renamed from: i */
    public TextView f77259i;

    /* JADX INFO: renamed from: j */
    public TextView f77260j;

    /* JADX INFO: renamed from: k */
    public TextView f77261k;

    /* JADX INFO: renamed from: l */
    public TextView f77262l;

    /* JADX INFO: renamed from: m */
    public ImageView f77263m;

    /* JADX INFO: renamed from: n */
    public ImageView f77264n;

    /* JADX INFO: renamed from: o */
    public View.OnClickListener f77265o;

    /* JADX INFO: renamed from: p */
    public l4g0 f77266p;

    /* JADX INFO: renamed from: l.bm5$a */
    public class ViewOnClickListenerC16040a implements View.OnClickListener {
        public ViewOnClickListenerC16040a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (bm5.this.f77256f == 5) {
                i4g0.m138520r("e_delete_account_policy_close", "p_delete_account_policy");
            }
            bm5.this.dismiss();
        }
    }

    public bm5(@NonNull @NotNull Context context, int i) {
        super(context, zfc0.f204118d);
        this.f77256f = i;
        this.f77257g = context;
        setCancelable(false);
        this.f77266p = new l4g0(this.f77256f == 5 ? "p_delete_account_policy" : "p_verification_policy_popup", getClass().getName());
    }

    /* JADX INFO: renamed from: E */
    private void m104988E() {
        final Window window = getWindow();
        if (NullChecker.m82486a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(ycc0.f198492y);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(cbc0.f80751T);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C16041b(bottomSheetBehaviorFrom));
        }
        l51.m152887G(new Runnable() { // from class: l.am5
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(zfc0.f204119e);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static String m104989F(int i) {
        return (i == 3 || i == 4) ? "security_force_verification" : "";
    }

    /* JADX INFO: renamed from: G */
    public static String m104990G(int i) {
        if (i == 1) {
            return "avatar_verification";
        }
        if (i == 2) {
            return "id_verification";
        }
        if (i == 3) {
            return "avatar_ability";
        }
        return i == 4 ? "id_ability" : "";
    }

    /* JADX INFO: renamed from: H */
    private void m104991H() {
        this.f77258h = LayoutInflater.from(this.f77257g).inflate(jec0.f120469o, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = qa00.m175859d(10.0f);
        setContentView(this.f77258h, layoutParams);
        this.f77261k = (TextView) this.f77258h.findViewById(ycc0.f198487v0);
        this.f77262l = (TextView) this.f77258h.findViewById(ycc0.f198483t0);
        this.f77259i = (TextView) this.f77258h.findViewById(ycc0.f198489w0);
        this.f77260j = (TextView) this.f77258h.findViewById(ycc0.f198485u0);
        this.f77263m = (ImageView) this.f77258h.findViewById(ycc0.f198428M);
        this.f77264n = (ImageView) this.f77258h.findViewById(ycc0.f198484u);
        this.f77263m.setOnClickListener(new ViewOnClickListenerC16040a());
        this.f77262l.setOnClickListener(new View.OnClickListener() { // from class: l.yl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200527a.m104993J(view);
            }
        });
        this.f77261k.setOnClickListener(new View.OnClickListener() { // from class: l.zl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204880a.m104994K(view);
            }
        });
        m105000L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m104992I() {
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m104993J(View view) {
        if (this.f77256f == 5) {
            i4g0.m138520r("e_delete_account_policy_disagree", "p_delete_account_policy");
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m104994K(View view) {
        if (this.f77256f == 5) {
            i4g0.m138520r("e_delete_account_policy_agree", "p_delete_account_policy");
        } else {
            i4g0.m138520r("e_verification_policy_popup_agree", "p_verification_policy_popup");
        }
        View.OnClickListener onClickListener = this.f77265o;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: M */
    private void m104995M() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: D */
    public void m104999D(View.OnClickListener onClickListener) {
        this.f77265o = onClickListener;
    }

    /* JADX INFO: renamed from: L */
    public final void m105000L() {
        Resources resources = this.f77257g.getResources();
        StringBuilder sb = new StringBuilder();
        int i = this.f77256f;
        if (i == 1) {
            this.f77259i.setText(R$string.f18128a3);
            sb.append(resources.getString(R$string.f18063K2));
            sb.append(SignParameters.NEW_LINE);
            sb.append(resources.getString(R$string.f18091R2));
            sb.append("https://privacy.qq.com/document/preview/4661fcc5ceb04a4f878a5874c86b34a2\n");
            sb.append(resources.getString(R$string.f18071M2));
            sb.append("https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n");
            sb.append(resources.getString(R$string.f18079O2));
            sb.append("\n\n");
            sb.append(resources.getString(R$string.f18087Q2));
            sb.append("https://cosmos.immomo.com/\n\n");
            sb.append(resources.getString(R$string.f18099T2));
            sb.append("https://www.volcengine.com/docs/6973/152875\n\n");
            sb.append(resources.getString(R$string.f18067L2));
        } else if (i == 2) {
            this.f77259i.setText(R$string.f18133b3);
            sb.append(resources.getString(R$string.f18103U2));
            sb.append(SignParameters.NEW_LINE);
            sb.append(resources.getString(R$string.f18091R2));
            sb.append("https://privacy.qq.com/document/preview/4661fcc5ceb04a4f878a5874c86b34a2\n");
            sb.append(resources.getString(R$string.f18071M2));
            sb.append("https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n");
            sb.append(resources.getString(R$string.f18107V2));
            sb.append("\n\n");
            sb.append(resources.getString(R$string.f18087Q2));
            sb.append("https://cosmos.immomo.com/\n\n");
            sb.append(resources.getString(R$string.f18099T2));
            sb.append("https://www.volcengine.com/docs/6973/152875\n\n");
            sb.append(resources.getString(R$string.f18067L2));
        } else if (i == 3) {
            this.f77259i.setText(R$string.f18123Z2);
            sb.append(resources.getString(R$string.f18083P2));
            sb.append(SignParameters.NEW_LINE);
            sb.append(resources.getString(R$string.f18095S2));
            sb.append("https://miniprogram-kyc.tencentcloudapi.com/s/h5/protocolTencent.html\n");
            sb.append(resources.getString(R$string.f18075N2));
            sb.append("https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n");
            sb.append(resources.getString(R$string.f18079O2));
        } else if (i == 4) {
            this.f77259i.setText(R$string.f18133b3);
            sb.append(resources.getString(R$string.f18111W2));
            sb.append(SignParameters.NEW_LINE);
            sb.append(resources.getString(R$string.f18119Y2));
            sb.append("https://miniprogram-kyc.tencentcloudapi.com/s/h5/protocolTencent.html\n");
            sb.append(resources.getString(R$string.f18115X2));
            sb.append("https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n");
            sb.append(resources.getString(R$string.f18107V2));
        } else if (i == 5) {
            this.f77259i.setText("探探账号注销协议");
            sb.append("在您注销探探账号之前，请充分阅读、理解并同意本协议：\n\n1.【特别提示】注销探探账号为不可恢复的操作，账号注销后您无法登录、使用本探探账号，也无法找本探探账号中及与账号相关的任何内容或信息（即时您使用相同的手机号码或第三方账户再次注册或授权登录并使用探探），包括但不限于：\n您已提交的真实身份信息、账号中填写的个人信息、交易记录、绑定的银行卡、探探好友关系等信息；\n您的配对信息、发布的动态、点赞、评论、转发、互动、关注、粉丝等内容数据；\n与本探探账户绑定的手机号码/微信号码等将会解绑；\n通过使用探探服务获得的资产或虚拟权益等财产性利益（包括不限于探探钱包余额、直播收益、虚拟礼物收益、尚未到期或尚未使用完毕的会员服务及增值服务等），您可以选择提现、使用完毕付费服务后进行注销或同意放弃后进行注销。其中探探币不可提现，您可以进行消费后再进行注销，如直接注销则视为您同意放弃，将无法继续使用。您理解并同意，您放弃的前述财产性利益探探无法协助您恢复也无法找回账号相关的任何内容或信息。\n2.若您是App Store自动续费用户您应在本账户注销前前往iTunes商店内手动取消续费服务，若您是其他自动续费用户则本账户注销后将自动关闭续费服务；\n3.探探账号注销将导致探探根据《用户协议》及《隐私政策》等约定终止为您提供服务，双方权利义务终止，注销完成后，探探将根据法律法规的要求删除您的所有信息或将其匿名化处理（法律法规另有规定的除外）；\n4. 在您的探探账号注销期限，若您的账号涉及争议纠纷，包括但不限于：投诉、举报、诉讼、仲裁、司法税务或行政等国家权力机关的调查等，您理解并同意，探探将有权暂停您的账户的注销程序直至争议纠纷解决；\n5.注销本探探账号并不代表本探探账号注销前的账号行为和相关责任的到豁免或减轻。\n");
            this.f77264n.setImageResource(cbc0.f80747P);
        }
        this.f77260j.setText(sb.toString());
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f77266p.m152776k();
        this.f77266p.m152775j();
        if (this.f77256f != 5) {
            i4g0.m138520r("e_verification_policy_popup_disagree", "p_verification_policy_popup");
        }
        getWindow().setWindowAnimations(zfc0.f204116b);
        l51.m152887G(new Runnable() { // from class: l.xl5
            @Override // java.lang.Runnable
            public final void run() {
                this.f194859a.m104992I();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        dismiss();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m104991H();
        m104995M();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f77266p.m152781p(jyb.m147494Y("verification_type", m104990G(this.f77256f)), jyb.m147494Y("verification_scene", m104989F(this.f77256f)));
        this.f77266p.m152768c();
        this.f77266p.m152783r();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f77258h.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m104988E();
    }

    public bm5(@NonNull @NotNull Context context) {
        this(context, 1);
    }

    /* JADX INFO: renamed from: l.bm5$b */
    public class C16041b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f77268a;

        public C16041b(BottomSheetBehavior bottomSheetBehavior) {
            this.f77268a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f77268a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                bm5.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
