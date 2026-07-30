package p003l;

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
import com.p000p1.mobile.putong.core.data.WechatMicroProgramLaunchInfo;
import com.p000p1.mobile.putong.core.data.WechatNotifySetting;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.cwf0;
import l.g70;
import l.i0e;
import l.l5j0;
import l.mqi0;
import l.p4c0;
import l.qib0;
import l.uc80;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pmp0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public View f6874f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f6875g;

    /* JADX INFO: renamed from: h */
    public ImageView f6876h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f6877i;

    /* JADX INFO: renamed from: j */
    public TextView f6878j;

    /* JADX INFO: renamed from: k */
    public TextView f6879k;

    /* JADX INFO: renamed from: l */
    public Act f6880l;

    /* JADX INFO: renamed from: m */
    public cwf0 f6881m;

    /* JADX INFO: renamed from: n */
    public BottomSheetBehavior f6882n;

    /* JADX INFO: renamed from: o */
    public WechatNotifySetting f6883o;

    /* JADX INFO: renamed from: p */
    public final BottomSheetBehavior.BottomSheetCallback f6884p;

    public pmp0(@NonNull Context context) {
        super(context);
        this.f6884p = new C3405a();
        m8773G(context);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m8770C(View view) {
    }

    /* JADX INFO: renamed from: F */
    private String m8772F() {
        return "p_offline_message";
    }

    /* JADX INFO: renamed from: G */
    private void m8773G(Context context) {
        this.f6880l = xdl0.D(context);
        setContentView(m8782E(LayoutInflater.from(context), null));
        setCancelable(false);
    }

    /* JADX INFO: renamed from: H */
    private void m8774H() {
        if (NullChecker.a(this.f6883o)) {
            TextView textView = this.f6878j;
            Locale locale = Locale.CHINESE;
            int i = this.f6883o.msgCnt;
            textView.setText(String.format(locale, "在你离开期间有%s条新消息", i > 99 ? "99+" : String.valueOf(i)));
        }
        qib0.G.L0(this.f6877i, "https://auto.tancdn.com/v1/raw/a43d2362-81b1-471b-bbce-c82629ccde9614.webp");
        xdl0.E0(this.f6876h, new View.OnClickListener() { // from class: l.mmp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6361a.m8775I(view);
            }
        });
        xdl0.E0(this.f6875g, new View.OnClickListener() { // from class: l.nmp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pmp0.m8770C(view);
            }
        });
        xdl0.E0(this.f6879k, new View.OnClickListener() { // from class: l.omp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6688a.m8776J(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m8775I(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m8776J(View view) {
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo;
        zvf0.r("e_open_wechat_notification", m8772F());
        if (NullChecker.a(this.f6883o) && (wechatMicroProgramLaunchInfo = this.f6883o.wechatLaunch) != null) {
            g70.INSTANCE.a(wechatMicroProgramLaunchInfo.userName, wechatMicroProgramLaunchInfo.path);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m8777K(DialogInterface dialogInterface) {
        i0e.e(this.f6881m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m8778L(DialogInterface dialogInterface) {
        CoreModule.c.e0.l5.put(Long.valueOf(mqi0.o()));
        CoreModule.c.e0.m5.a(1);
        CoreModule.c.e0.la();
        zvf0.x("e_open_wechat_notification", m8772F());
    }

    /* JADX INFO: renamed from: E */
    public View m8782E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qmp0.m9026b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M */
    public void m8783M(WechatNotifySetting wechatNotifySetting) {
        this.f6883o = wechatNotifySetting;
    }

    /* JADX INFO: renamed from: h */
    public boolean m8784h(uc80 uc80Var) {
        return super.h(uc80Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f6882n = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f6882n.setBottomSheetCallback(this.f6884p);
        m8774H();
        if (this.f6881m == null) {
            this.f6881m = i0e.c(m8772F(), CityTopGreetDialog.class.getSimpleName());
        }
        i0e.f(this.f6881m);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kmp0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f5675a.m8777K(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.lmp0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f6171a.m8778L(dialogInterface);
            }
        });
        super/*android.app.Dialog*/.show();
    }

    /* JADX INFO: renamed from: l.pmp0$a */
    public class C3405a extends BottomSheetBehavior.BottomSheetCallback {
        public C3405a() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                pmp0.this.f6882n.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
