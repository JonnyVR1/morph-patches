package p149l;

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
import com.p046p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class yk5 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public int f198711f;

    /* JADX INFO: renamed from: g */
    public Context f198712g;

    /* JADX INFO: renamed from: h */
    public View f198713h;

    /* JADX INFO: renamed from: i */
    public TextView f198714i;

    /* JADX INFO: renamed from: j */
    public TextView f198715j;

    /* JADX INFO: renamed from: k */
    public TextView f198716k;

    /* JADX INFO: renamed from: l */
    public TextView f198717l;

    /* JADX INFO: renamed from: m */
    public ImageView f198718m;

    /* JADX INFO: renamed from: n */
    public ImageView f198719n;

    /* JADX INFO: renamed from: o */
    public View.OnClickListener f198720o;

    /* JADX INFO: renamed from: p */
    public cwf0 f198721p;

    /* JADX INFO: renamed from: l.yk5$a */
    public class ViewOnClickListenerC21423a implements View.OnClickListener {
        public ViewOnClickListenerC21423a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (yk5.this.f198711f == 5) {
                zvf0.m220396r("e_delete_account_policy_close", "p_delete_account_policy");
            }
            yk5.this.dismiss();
        }
    }

    public yk5(@NonNull @NotNull Context context, int i) {
        super(context, u7c0.f174986d);
        this.f198711f = i;
        this.f198712g = context;
        setCancelable(false);
        this.f198721p = new cwf0(this.f198711f == 5 ? "p_delete_account_policy" : "p_verification_policy_popup", getClass().getName());
    }

    /* JADX INFO: renamed from: E */
    private void m215107E() {
        final Window window = getWindow();
        if (NullChecker.m81303a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(s4c0.f162371y);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(w2c0.f184155T);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C21424b(bottomSheetBehaviorFrom));
        }
        e51.m114742G(new Runnable() { // from class: l.xk5
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(u7c0.f174987e);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static String m215108F(int i) {
        return (i == 3 || i == 4) ? "security_force_verification" : "";
    }

    /* JADX INFO: renamed from: G */
    public static String m215109G(int i) {
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
    private void m215110H() {
        this.f198713h = LayoutInflater.from(this.f198712g).inflate(e6c0.f89556o, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.m186890d(10.0f);
        setContentView(this.f198713h, layoutParams);
        this.f198716k = (TextView) this.f198713h.findViewById(s4c0.f162366v0);
        this.f198717l = (TextView) this.f198713h.findViewById(s4c0.f162362t0);
        this.f198714i = (TextView) this.f198713h.findViewById(s4c0.f162368w0);
        this.f198715j = (TextView) this.f198713h.findViewById(s4c0.f162364u0);
        this.f198718m = (ImageView) this.f198713h.findViewById(s4c0.f162307M);
        this.f198719n = (ImageView) this.f198713h.findViewById(s4c0.f162363u);
        this.f198718m.setOnClickListener(new ViewOnClickListenerC21423a());
        this.f198717l.setOnClickListener(new View.OnClickListener() { // from class: l.vk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181766a.m215112J(view);
            }
        });
        this.f198716k.setOnClickListener(new View.OnClickListener() { // from class: l.wk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186725a.m215113K(view);
            }
        });
        m215119L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m215111I() {
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m215112J(View view) {
        if (this.f198711f == 5) {
            zvf0.m220396r("e_delete_account_policy_disagree", "p_delete_account_policy");
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m215113K(View view) {
        if (this.f198711f == 5) {
            zvf0.m220396r("e_delete_account_policy_agree", "p_delete_account_policy");
        } else {
            zvf0.m220396r("e_verification_policy_popup_agree", "p_verification_policy_popup");
        }
        View.OnClickListener onClickListener = this.f198720o;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: M */
    private void m215114M() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: D */
    public void m215118D(View.OnClickListener onClickListener) {
        this.f198720o = onClickListener;
    }

    /* JADX INFO: renamed from: L */
    public final void m215119L() {
        Resources resources = this.f198712g.getResources();
        StringBuilder sb = new StringBuilder();
        int i = this.f198711f;
        if (i == 1) {
            this.f198714i.setText(R$string.f17409a3);
            sb.append(resources.getString(R$string.f17344K2));
            sb.append(SignParameters.NEW_LINE);
            sb.append(resources.getString(R$string.f17372R2));
            sb.append("https://privacy.qq.com/document/preview/4661fcc5ceb04a4f878a5874c86b34a2\n");
            sb.append(resources.getString(R$string.f17352M2));
            sb.append("https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n");
            sb.append(resources.getString(R$string.f17360O2));
            sb.append("\n\n");
            sb.append(resources.getString(R$string.f17368Q2));
            sb.append("https://cosmos.immomo.com/\n\n");
            sb.append(resources.getString(R$string.f17380T2));
            sb.append("https://www.volcengine.com/docs/6973/152875\n\n");
            sb.append(resources.getString(R$string.f17348L2));
        } else if (i == 2) {
            this.f198714i.setText(R$string.f17414b3);
            sb.append(resources.getString(R$string.f17384U2));
            sb.append(SignParameters.NEW_LINE);
            sb.append(resources.getString(R$string.f17372R2));
            sb.append("https://privacy.qq.com/document/preview/4661fcc5ceb04a4f878a5874c86b34a2\n");
            sb.append(resources.getString(R$string.f17352M2));
            sb.append("https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n");
            sb.append(resources.getString(R$string.f17388V2));
            sb.append("\n\n");
            sb.append(resources.getString(R$string.f17368Q2));
            sb.append("https://cosmos.immomo.com/\n\n");
            sb.append(resources.getString(R$string.f17380T2));
            sb.append("https://www.volcengine.com/docs/6973/152875\n\n");
            sb.append(resources.getString(R$string.f17348L2));
        } else if (i == 3) {
            this.f198714i.setText(R$string.f17404Z2);
            sb.append(resources.getString(R$string.f17364P2));
            sb.append(SignParameters.NEW_LINE);
            sb.append(resources.getString(R$string.f17376S2));
            sb.append("https://miniprogram-kyc.tencentcloudapi.com/s/h5/protocolTencent.html\n");
            sb.append(resources.getString(R$string.f17356N2));
            sb.append("https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n");
            sb.append(resources.getString(R$string.f17360O2));
        } else if (i == 4) {
            this.f198714i.setText(R$string.f17414b3);
            sb.append(resources.getString(R$string.f17392W2));
            sb.append(SignParameters.NEW_LINE);
            sb.append(resources.getString(R$string.f17400Y2));
            sb.append("https://miniprogram-kyc.tencentcloudapi.com/s/h5/protocolTencent.html\n");
            sb.append(resources.getString(R$string.f17396X2));
            sb.append("https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n");
            sb.append(resources.getString(R$string.f17388V2));
        } else if (i == 5) {
            this.f198714i.setText("探探账号注销协议");
            sb.append("在您注销探探账号之前，请充分阅读、理解并同意本协议：\n\n1.【特别提示】注销探探账号为不可恢复的操作，账号注销后您无法登录、使用本探探账号，也无法找本探探账号中及与账号相关的任何内容或信息（即时您使用相同的手机号码或第三方账户再次注册或授权登录并使用探探），包括但不限于：\n您已提交的真实身份信息、账号中填写的个人信息、交易记录、绑定的银行卡、探探好友关系等信息；\n您的配对信息、发布的动态、点赞、评论、转发、互动、关注、粉丝等内容数据；\n与本探探账户绑定的手机号码/微信号码等将会解绑；\n通过使用探探服务获得的资产或虚拟权益等财产性利益（包括不限于探探钱包余额、直播收益、虚拟礼物收益、尚未到期或尚未使用完毕的会员服务及增值服务等），您可以选择提现、使用完毕付费服务后进行注销或同意放弃后进行注销。其中探探币不可提现，您可以进行消费后再进行注销，如直接注销则视为您同意放弃，将无法继续使用。您理解并同意，您放弃的前述财产性利益探探无法协助您恢复也无法找回账号相关的任何内容或信息。\n2.若您是App Store自动续费用户您应在本账户注销前前往iTunes商店内手动取消续费服务，若您是其他自动续费用户则本账户注销后将自动关闭续费服务；\n3.探探账号注销将导致探探根据《用户协议》及《隐私政策》等约定终止为您提供服务，双方权利义务终止，注销完成后，探探将根据法律法规的要求删除您的所有信息或将其匿名化处理（法律法规另有规定的除外）；\n4. 在您的探探账号注销期限，若您的账号涉及争议纠纷，包括但不限于：投诉、举报、诉讼、仲裁、司法税务或行政等国家权力机关的调查等，您理解并同意，探探将有权暂停您的账户的注销程序直至争议纠纷解决；\n5.注销本探探账号并不代表本探探账号注销前的账号行为和相关责任的到豁免或减轻。\n");
            this.f198719n.setImageResource(w2c0.f184151P);
        }
        this.f198715j.setText(sb.toString());
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f198721p.m109035k();
        this.f198721p.m109034j();
        if (this.f198711f != 5) {
            zvf0.m220396r("e_verification_policy_popup_disagree", "p_verification_policy_popup");
        }
        getWindow().setWindowAnimations(u7c0.f174984b);
        e51.m114742G(new Runnable() { // from class: l.uk5
            @Override // java.lang.Runnable
            public final void run() {
                this.f176905a.m215111I();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        dismiss();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m215110H();
        m215114M();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f198721p.m109040p(vwb.m200311Y("verification_type", m215109G(this.f198711f)), vwb.m200311Y("verification_scene", m215108F(this.f198711f)));
        this.f198721p.m109027c();
        this.f198721p.m109042r();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f198713h.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m215107E();
    }

    public yk5(@NonNull @NotNull Context context) {
        this(context, 1);
    }

    /* JADX INFO: renamed from: l.yk5$b */
    public class C21424b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f198723a;

        public C21424b(BottomSheetBehavior bottomSheetBehavior) {
            this.f198723a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f198723a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                yk5.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
