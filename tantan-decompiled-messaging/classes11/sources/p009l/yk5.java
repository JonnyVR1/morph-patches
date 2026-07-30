package p009l;

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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.e51;
import l.e6c0;
import l.j760;
import l.l5j0;
import l.s4c0;
import l.t100;
import l.u7c0;
import l.vwb;
import l.w2c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yk5 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public int f23114f;

    /* JADX INFO: renamed from: g */
    public Context f23115g;

    /* JADX INFO: renamed from: h */
    public View f23116h;

    /* JADX INFO: renamed from: i */
    public TextView f23117i;

    /* JADX INFO: renamed from: j */
    public TextView f23118j;

    /* JADX INFO: renamed from: k */
    public TextView f23119k;

    /* JADX INFO: renamed from: l */
    public TextView f23120l;

    /* JADX INFO: renamed from: m */
    public ImageView f23121m;

    /* JADX INFO: renamed from: n */
    public ImageView f23122n;

    /* JADX INFO: renamed from: o */
    public View.OnClickListener f23123o;

    /* JADX INFO: renamed from: p */
    public cwf0 f23124p;

    /* JADX INFO: renamed from: l.yk5$a */
    public class ViewOnClickListenerC1332a implements View.OnClickListener {
        public ViewOnClickListenerC1332a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (yk5.this.f23114f == 5) {
                zvf0.r("e_delete_account_policy_close", "p_delete_account_policy");
            }
            yk5.this.dismiss();
        }
    }

    public yk5(@NonNull @NotNull Context context, int i) {
        super(context, u7c0.d);
        this.f23114f = i;
        this.f23115g = context;
        setCancelable(false);
        this.f23124p = new cwf0(this.f23114f == 5 ? "p_delete_account_policy" : "p_verification_policy_popup", getClass().getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    private void m25432E() {
        final Window window = getWindow();
        if (NullChecker.a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(s4c0.y);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(w2c0.T);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C1333b(bottomSheetBehaviorFrom));
        }
        e51.G(new Runnable() { // from class: l.xk5
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(u7c0.e);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static String m25433F(int i) {
        return (i == 3 || i == 4) ? "security_force_verification" : "";
    }

    /* JADX INFO: renamed from: G */
    public static String m25434G(int i) {
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
    private void m25435H() {
        this.f23116h = LayoutInflater.from(this.f23115g).inflate(e6c0.o, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.d(10.0f);
        setContentView(this.f23116h, layoutParams);
        this.f23119k = (TextView) this.f23116h.findViewById(s4c0.v0);
        this.f23120l = (TextView) this.f23116h.findViewById(s4c0.t0);
        this.f23117i = (TextView) this.f23116h.findViewById(s4c0.w0);
        this.f23118j = (TextView) this.f23116h.findViewById(s4c0.u0);
        this.f23121m = (ImageView) this.f23116h.findViewById(s4c0.M);
        this.f23122n = (ImageView) this.f23116h.findViewById(s4c0.u);
        this.f23121m.setOnClickListener(new ViewOnClickListenerC1332a());
        this.f23120l.setOnClickListener(new View.OnClickListener() { // from class: l.vk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21631a.m25437J(view);
            }
        });
        this.f23119k.setOnClickListener(new View.OnClickListener() { // from class: l.wk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22169a.m25438K(view);
            }
        });
        m25444L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m25436I() {
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m25437J(View view) {
        if (this.f23114f == 5) {
            zvf0.r("e_delete_account_policy_disagree", "p_delete_account_policy");
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m25438K(View view) {
        if (this.f23114f == 5) {
            zvf0.r("e_delete_account_policy_agree", "p_delete_account_policy");
        } else {
            zvf0.r("e_verification_policy_popup_agree", "p_verification_policy_popup");
        }
        View.OnClickListener onClickListener = this.f23123o;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    private void m25439M() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: D */
    public void m25443D(View.OnClickListener onClickListener) {
        this.f23123o = onClickListener;
    }

    /* JADX INFO: renamed from: L */
    public final void m25444L() {
        Resources resources = this.f23115g.getResources();
        StringBuilder sb = new StringBuilder();
        int i = this.f23114f;
        if (i == 1) {
            this.f23117i.setText(com.p1.mobile.putong.common.R.string.a3);
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.K2));
            sb.append("\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.R2));
            sb.append("https://privacy.qq.com/document/preview/4661fcc5ceb04a4f878a5874c86b34a2\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.M2));
            sb.append("https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.O2));
            sb.append("\n\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.Q2));
            sb.append("https://cosmos.immomo.com/\n\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.T2));
            sb.append("https://www.volcengine.com/docs/6973/152875\n\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.L2));
        } else if (i == 2) {
            this.f23117i.setText(com.p1.mobile.putong.common.R.string.b3);
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.U2));
            sb.append("\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.R2));
            sb.append("https://privacy.qq.com/document/preview/4661fcc5ceb04a4f878a5874c86b34a2\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.M2));
            sb.append("https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.V2));
            sb.append("\n\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.Q2));
            sb.append("https://cosmos.immomo.com/\n\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.T2));
            sb.append("https://www.volcengine.com/docs/6973/152875\n\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.L2));
        } else if (i == 3) {
            this.f23117i.setText(com.p1.mobile.putong.common.R.string.Z2);
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.P2));
            sb.append("\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.S2));
            sb.append("https://miniprogram-kyc.tencentcloudapi.com/s/h5/protocolTencent.html\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.N2));
            sb.append("https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.O2));
        } else if (i == 4) {
            this.f23117i.setText(com.p1.mobile.putong.common.R.string.b3);
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.W2));
            sb.append("\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.Y2));
            sb.append("https://miniprogram-kyc.tencentcloudapi.com/s/h5/protocolTencent.html\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.X2));
            sb.append("https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202107281509_18386.html?spm=a2c4g.11186623.0.0.37c330e5LyeciZ\n\n");
            sb.append(resources.getString(com.p1.mobile.putong.common.R.string.V2));
        } else if (i == 5) {
            this.f23117i.setText("探探账号注销协议");
            sb.append("在您注销探探账号之前，请充分阅读、理解并同意本协议：\n\n1.【特别提示】注销探探账号为不可恢复的操作，账号注销后您无法登录、使用本探探账号，也无法找本探探账号中及与账号相关的任何内容或信息（即时您使用相同的手机号码或第三方账户再次注册或授权登录并使用探探），包括但不限于：\n您已提交的真实身份信息、账号中填写的个人信息、交易记录、绑定的银行卡、探探好友关系等信息；\n您的配对信息、发布的动态、点赞、评论、转发、互动、关注、粉丝等内容数据；\n与本探探账户绑定的手机号码/微信号码等将会解绑；\n通过使用探探服务获得的资产或虚拟权益等财产性利益（包括不限于探探钱包余额、直播收益、虚拟礼物收益、尚未到期或尚未使用完毕的会员服务及增值服务等），您可以选择提现、使用完毕付费服务后进行注销或同意放弃后进行注销。其中探探币不可提现，您可以进行消费后再进行注销，如直接注销则视为您同意放弃，将无法继续使用。您理解并同意，您放弃的前述财产性利益探探无法协助您恢复也无法找回账号相关的任何内容或信息。\n2.若您是App Store自动续费用户您应在本账户注销前前往iTunes商店内手动取消续费服务，若您是其他自动续费用户则本账户注销后将自动关闭续费服务；\n3.探探账号注销将导致探探根据《用户协议》及《隐私政策》等约定终止为您提供服务，双方权利义务终止，注销完成后，探探将根据法律法规的要求删除您的所有信息或将其匿名化处理（法律法规另有规定的除外）；\n4. 在您的探探账号注销期限，若您的账号涉及争议纠纷，包括但不限于：投诉、举报、诉讼、仲裁、司法税务或行政等国家权力机关的调查等，您理解并同意，探探将有权暂停您的账户的注销程序直至争议纠纷解决；\n5.注销本探探账号并不代表本探探账号注销前的账号行为和相关责任的到豁免或减轻。\n");
            this.f23122n.setImageResource(w2c0.P);
        }
        this.f23118j.setText(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        this.f23124p.k();
        this.f23124p.j();
        if (this.f23114f != 5) {
            zvf0.r("e_verification_policy_popup_disagree", "p_verification_policy_popup");
        }
        getWindow().setWindowAnimations(u7c0.b);
        e51.G(new Runnable() { // from class: l.uk5
            @Override // java.lang.Runnable
            public final void run() {
                this.f21234a.m25436I();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        super/*android.app.Dialog*/.onBackPressed();
        dismiss();
    }

    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        m25435H();
        m25439M();
    }

    public void onStart() {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onStart();
        this.f23124p.p(new j760[]{vwb.Y("verification_type", m25434G(this.f23114f)), vwb.Y("verification_scene", m25433F(this.f23114f))});
        this.f23124p.c();
        this.f23124p.r();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) this.f23116h.getParent());
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m25432E();
    }

    public yk5(@NonNull @NotNull Context context) {
        this(context, 1);
    }

    /* JADX INFO: renamed from: l.yk5$b */
    public class C1333b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f23126a;

        public C1333b(BottomSheetBehavior bottomSheetBehavior) {
            this.f23126a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f23126a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                yk5.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
