package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.WechatMicroProgramLaunchInfo;
import com.p051p1.mobile.putong.core.data.WechatNotifySetting;
import com.p051p1.mobile.putong.core.p058ui.profile.CityTopGreetDialog;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes2.dex */
public class tvp0 extends pej0 {

    /* JADX INFO: renamed from: f */
    public View f176276f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f176277g;

    /* JADX INFO: renamed from: h */
    public ImageView f176278h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f176279i;

    /* JADX INFO: renamed from: j */
    public TextView f176280j;

    /* JADX INFO: renamed from: k */
    public TextView f176281k;

    /* JADX INFO: renamed from: l */
    public Act f176282l;

    /* JADX INFO: renamed from: m */
    public l4g0 f176283m;

    /* JADX INFO: renamed from: n */
    public BottomSheetBehavior f176284n;

    /* JADX INFO: renamed from: o */
    public WechatNotifySetting f176285o;

    /* JADX INFO: renamed from: p */
    public final BottomSheetBehavior.BottomSheetCallback f176286p;

    public tvp0(@NonNull Context context) {
        super(context);
        this.f176286p = new C20410a();
        m192820G(context);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m192817C(View view) {
    }

    /* JADX INFO: renamed from: F */
    private String m192819F() {
        return "p_offline_message";
    }

    /* JADX INFO: renamed from: G */
    private void m192820G(Context context) {
        this.f176282l = (Act) bnl0.m105506D(context);
        setContentView(m192829E(LayoutInflater.from(context), null));
        setCancelable(false);
    }

    /* JADX INFO: renamed from: H */
    private void m192821H() {
        if (NullChecker.m82486a(this.f176285o)) {
            TextView textView = this.f176280j;
            Locale locale = Locale.CHINESE;
            int i = this.f176285o.msgCnt;
            textView.setText(String.format(locale, "在你离开期间有%s条新消息", i > 99 ? "99+" : String.valueOf(i)));
        }
        uqb0.f180374G.m127115L0(this.f176279i, "https://auto.tancdn.com/v1/raw/a43d2362-81b1-471b-bbce-c82629ccde9614.webp");
        bnl0.m105509E0(this.f176278h, new View.OnClickListener() { // from class: l.qvp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159793a.m192822I(view);
            }
        });
        bnl0.m105509E0(this.f176277g, new View.OnClickListener() { // from class: l.rvp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tvp0.m192817C(view);
            }
        });
        bnl0.m105509E0(this.f176281k, new View.OnClickListener() { // from class: l.svp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170865a.m192823J(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m192822I(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m192823J(View view) {
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo;
        i4g0.m138520r("e_open_wechat_notification", m192819F());
        if (NullChecker.m82486a(this.f176285o) && (wechatMicroProgramLaunchInfo = this.f176285o.wechatLaunch) != null) {
            c70.INSTANCE.m108261a(wechatMicroProgramLaunchInfo.userName, wechatMicroProgramLaunchInfo.path);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m192824K(DialogInterface dialogInterface) {
        w1e.m204401e(this.f176283m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m192825L(DialogInterface dialogInterface) {
        CoreModule.f18264c.f20381e0.f89275l5.put(Long.valueOf(pzi0.m174454o()));
        CoreModule.f18264c.f20381e0.f89283m5.m203841a(1);
        CoreModule.f18264c.f20381e0.m116585la();
        i4g0.m138526x("e_open_wechat_notification", m192819F());
    }

    /* JADX INFO: renamed from: E */
    public View m192829E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uvp0.m198303b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M */
    public void m192830M(WechatNotifySetting wechatNotifySetting) {
        this.f176285o = wechatNotifySetting;
    }

    @Override // p153l.pej0, p153l.f3m
    /* JADX INFO: renamed from: h */
    public boolean mo21866h(al80 al80Var) {
        return super.mo21866h(al80Var);
    }

    @Override // android.app.Dialog
    public void show() {
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f176284n = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f176284n.setBottomSheetCallback(this.f176286p);
        m192821H();
        if (this.f176283m == null) {
            this.f176283m = w1e.m204399c(m192819F(), CityTopGreetDialog.class.getSimpleName());
        }
        w1e.m204402f(this.f176283m);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ovp0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f149294a.m192824K(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.pvp0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f154314a.m192825L(dialogInterface);
            }
        });
        super.show();
    }

    /* JADX INFO: renamed from: l.tvp0$a */
    public class C20410a extends BottomSheetBehavior.BottomSheetCallback {
        public C20410a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                tvp0.this.f176284n.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
