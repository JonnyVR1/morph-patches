package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.WechatMicroProgramLaunchInfo;
import com.p046p1.mobile.putong.core.data.WechatNotifySetting;
import com.p046p1.mobile.putong.core.p053ui.profile.CityTopGreetDialog;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class pmp0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public View f150247f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f150248g;

    /* JADX INFO: renamed from: h */
    public ImageView f150249h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f150250i;

    /* JADX INFO: renamed from: j */
    public TextView f150251j;

    /* JADX INFO: renamed from: k */
    public TextView f150252k;

    /* JADX INFO: renamed from: l */
    public Act f150253l;

    /* JADX INFO: renamed from: m */
    public cwf0 f150254m;

    /* JADX INFO: renamed from: n */
    public BottomSheetBehavior f150255n;

    /* JADX INFO: renamed from: o */
    public WechatNotifySetting f150256o;

    /* JADX INFO: renamed from: p */
    public final BottomSheetBehavior.BottomSheetCallback f150257p;

    public pmp0(@NonNull Context context) {
        super(context);
        this.f150257p = new C19282a();
        m170351G(context);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m170348C(View view) {
    }

    /* JADX INFO: renamed from: F */
    private String m170350F() {
        return "p_offline_message";
    }

    /* JADX INFO: renamed from: G */
    private void m170351G(Context context) {
        this.f150253l = (Act) xdl0.m208326D(context);
        setContentView(m170360E(LayoutInflater.from(context), null));
        setCancelable(false);
    }

    /* JADX INFO: renamed from: H */
    private void m170352H() {
        if (NullChecker.m81303a(this.f150256o)) {
            TextView textView = this.f150251j;
            Locale locale = Locale.CHINESE;
            int i = this.f150256o.msgCnt;
            textView.setText(String.format(locale, "在你离开期间有%s条新消息", i > 99 ? "99+" : String.valueOf(i)));
        }
        qib0.f154691G.m102331L0(this.f150250i, "https://auto.tancdn.com/v1/raw/a43d2362-81b1-471b-bbce-c82629ccde9614.webp");
        xdl0.m208329E0(this.f150249h, new View.OnClickListener() { // from class: l.mmp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134683a.m170353I(view);
            }
        });
        xdl0.m208329E0(this.f150248g, new View.OnClickListener() { // from class: l.nmp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pmp0.m170348C(view);
            }
        });
        xdl0.m208329E0(this.f150252k, new View.OnClickListener() { // from class: l.omp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144677a.m170354J(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m170353I(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m170354J(View view) {
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo;
        zvf0.m220396r("e_open_wechat_notification", m170350F());
        if (NullChecker.m81303a(this.f150256o) && (wechatMicroProgramLaunchInfo = this.f150256o.wechatLaunch) != null) {
            g70.INSTANCE.m124682a(wechatMicroProgramLaunchInfo.userName, wechatMicroProgramLaunchInfo.path);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m170355K(DialogInterface dialogInterface) {
        i0e.m133796e(this.f150254m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m170356L(DialogInterface dialogInterface) {
        CoreModule.f17545c.f19639e0.f149418l5.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19639e0.f149426m5.m189988a(1);
        CoreModule.f17545c.f19639e0.m169512la();
        zvf0.m220402x("e_open_wechat_notification", m170350F());
    }

    /* JADX INFO: renamed from: E */
    public View m170360E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qmp0.m175577b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M */
    public void m170361M(WechatNotifySetting wechatNotifySetting) {
        this.f150256o = wechatNotifySetting;
    }

    @Override // p149l.l5j0, p149l.l0m
    /* JADX INFO: renamed from: h */
    public boolean mo20867h(uc80 uc80Var) {
        return super.mo20867h(uc80Var);
    }

    @Override // android.app.Dialog
    public void show() {
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f150255n = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f150255n.setBottomSheetCallback(this.f150257p);
        m170352H();
        if (this.f150254m == null) {
            this.f150254m = i0e.m133794c(m170350F(), CityTopGreetDialog.class.getSimpleName());
        }
        i0e.m133797f(this.f150254m);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kmp0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f123819a.m170355K(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.lmp0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f128815a.m170356L(dialogInterface);
            }
        });
        super.show();
    }

    /* JADX INFO: renamed from: l.pmp0$a */
    public class C19282a extends BottomSheetBehavior.BottomSheetCallback {
        public C19282a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                pmp0.this.f150255n.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
