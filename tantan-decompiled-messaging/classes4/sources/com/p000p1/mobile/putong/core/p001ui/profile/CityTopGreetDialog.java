package com.p000p1.mobile.putong.core.p001ui.profile;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.p001ui.profile.CityTopGreetDialog;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.CityCentreConfig;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.safety.IllegalPictureException;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.e30;
import l.i0e;
import l.j65;
import l.j760;
import l.jo0;
import l.l5j0;
import l.lsi0;
import l.lsx;
import l.mkd0;
import l.p4c0;
import l.qib0;
import l.szb0;
import l.t100;
import l.vwb;
import l.w9j;
import l.x19;
import l.xaj0;
import l.xdl0;
import l.y19;
import l.ya5;
import l.yij0;
import l.zqx;
import l.zvf0;
import rx.c;
import v.VDraweeView;
import v.VEditText;
import v.VFrame;
import v.VIcon;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class CityTopGreetDialog extends l5j0 {

    /* JADX INFO: renamed from: A */
    public c4g0 f727A;

    /* JADX INFO: renamed from: B */
    public CityCentreConfig f728B;

    /* JADX INFO: renamed from: C */
    public List<Media> f729C;

    /* JADX INFO: renamed from: D */
    public boolean f730D;

    /* JADX INFO: renamed from: E */
    public BottomSheetBehavior.BottomSheetCallback f731E;

    /* JADX INFO: renamed from: f */
    public FrameLayout f732f;

    /* JADX INFO: renamed from: g */
    public View f733g;

    /* JADX INFO: renamed from: h */
    public ConstraintLayout f734h;

    /* JADX INFO: renamed from: i */
    public TextView f735i;

    /* JADX INFO: renamed from: j */
    public VEditText f736j;

    /* JADX INFO: renamed from: k */
    public VFrame f737k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f738l;

    /* JADX INFO: renamed from: m */
    public VImage f739m;

    /* JADX INFO: renamed from: n */
    public VFrame f740n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f741o;

    /* JADX INFO: renamed from: p */
    public VImage f742p;

    /* JADX INFO: renamed from: q */
    public VIcon f743q;

    /* JADX INFO: renamed from: r */
    public VLinear f744r;

    /* JADX INFO: renamed from: s */
    public VText f745s;

    /* JADX INFO: renamed from: t */
    public cwf0 f746t;

    /* JADX INFO: renamed from: u */
    public BottomSheetBehavior f747u;

    /* JADX INFO: renamed from: v */
    public int f748v;

    /* JADX INFO: renamed from: w */
    public int f749w;

    /* JADX INFO: renamed from: x */
    public Act f750x;

    /* JADX INFO: renamed from: y */
    public String f751y;

    /* JADX INFO: renamed from: z */
    public User f752z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog$a */
    public class C0042a implements TextWatcher {
        public C0042a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == 0 && CityTopGreetDialog.this.f735i.isEnabled()) {
                CityTopGreetDialog.this.f735i.setEnabled(false);
                CityTopGreetDialog.this.f736j.setTypeface(Typeface.DEFAULT);
            } else {
                if (editable.length() <= 0 || CityTopGreetDialog.this.f735i.isEnabled()) {
                    return;
                }
                CityTopGreetDialog.this.f735i.setEnabled(true);
                CityTopGreetDialog.this.f736j.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog$b */
    public class C0043b extends BottomSheetBehavior.BottomSheetCallback {
        public C0043b() {
        }

        public void onSlide(@NonNull View view, float f) {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                CityTopGreetDialog.this.f747u.setState(3);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog$c */
    public static class C0044c {

        /* JADX INFO: renamed from: a */
        public Act f755a;

        /* JADX INFO: renamed from: b */
        public String f756b;

        /* JADX INFO: renamed from: c */
        public cwf0 f757c;

        /* JADX INFO: renamed from: d */
        public User f758d;

        public C0044c(Act act) {
            this.f755a = act;
        }

        /* JADX INFO: renamed from: a */
        public CityTopGreetDialog m996a() {
            CityTopGreetDialog cityTopGreetDialog = new CityTopGreetDialog(this.f755a);
            cityTopGreetDialog.m938C0(this.f758d);
            cityTopGreetDialog.m977B0(this.f756b, this.f757c);
            return cityTopGreetDialog;
        }

        /* JADX INFO: renamed from: b */
        public C0044c m997b(User user) {
            this.f758d = user;
            return this;
        }
    }

    public CityTopGreetDialog(@NonNull Context context) {
        super(context);
        this.f729C = new ArrayList();
        this.f731E = new C0043b();
        m963f0(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public void m938C0(User user) {
        this.f752z = user;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m939D(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static void m940D0(Act act, final d30 d30Var) {
        PermissionHelper.c().r(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}).w(false).o(new d30() { // from class: l.v55
            public final void call() {
                CityTopGreetDialog.m939D(d30Var);
            }
        }).i(act);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ boolean m944H(e30 e30Var, int i, int i2, Intent intent) {
        if (i2 == -1 && NullChecker.a(intent)) {
            e30Var.call((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h));
        }
        return i2 == -1 && NullChecker.a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public c<xaj0<List<Media>, List<String>, String>> m961Z(final List<Media> list) {
        return (!vwb.J(list) && (list.get(0) instanceof Picture) && qib0.R.c()) ? qib0.R.b(Uri.parse(list.get(0).url).getPath()).map(new w9j() { // from class: l.y55
            public final Object call(Object obj) {
                xaj0 xaj0Var = (xaj0) obj;
                return xaj0.a(list, ((Boolean) xaj0Var.a).booleanValue() ? (List) xaj0Var.b : null, !TextUtils.isEmpty((CharSequence) xaj0Var.c) ? (String) xaj0Var.c : "");
            }
        }) : c.just(xaj0.a(list, new ArrayList<String>() { // from class: com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog.2
        }, ""));
    }

    /* JADX INFO: renamed from: d0 */
    private static boolean m962d0() {
        return PermissionHelper.b(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    /* JADX INFO: renamed from: f0 */
    private void m963f0(Context context) {
        this.f750x = (Act) context;
        setContentView(m980Y(LayoutInflater.from(context), null));
        this.f728B = y19.i();
    }

    /* JADX INFO: renamed from: g0 */
    private void m964g0() {
        if (NullChecker.a(this.f752z)) {
            qib0.G.H0(this.f741o, this.f752z.fp().profile480(), t100.d(80.0f), t100.d(80.0f));
        }
        xdl0.E0(this.f743q, new View.OnClickListener() { // from class: l.x55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22119a.m965h0(view);
            }
        });
        xdl0.E0(this.f734h, new View.OnClickListener() { // from class: l.b65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8001a.m966i0(view);
            }
        });
        xdl0.E0(this.f744r, new View.OnClickListener() { // from class: l.c65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8493a.m967j0(view);
            }
        });
        xdl0.E0(this.f738l, new View.OnClickListener() { // from class: l.d65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9069a.m968k0(view);
            }
        });
        xdl0.E0(this.f739m, new View.OnClickListener() { // from class: l.e65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9584a.m969l0(view);
            }
        });
        xdl0.E0(this.f735i, new View.OnClickListener() { // from class: l.f65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10132a.m970m0(view);
            }
        });
        this.f745s.setTypeface(Typeface.DEFAULT_BOLD);
        this.f736j.setMaxLength(50);
        this.f736j.addTextChangedListener(new C0042a());
        m992u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m965h0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m966i0(View view) {
        m984e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m967j0(View view) {
        m972x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m968k0(View view) {
        m972x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m969l0(View view) {
        m981a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m970m0(View view) {
        m994w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public void m972x0() {
        zvf0.r("e_greet_to_city_c_pic", m982b0());
        if (m962d0() || zqx.k()) {
            m979F0(new e30() { // from class: l.h65
                public final void call(Object obj) {
                    this.f11894a.m986o0((List) obj);
                }
            });
        } else {
            m940D0(this.f750x, new d30() { // from class: l.g65
                public final void call() {
                    this.f11279a.m972x0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: z0 */
    private c<Message> m975z0(String str, List<Media> list, List<String> list2, String str2) {
        final Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("picture");
        messageNew_.media = list;
        if (!vwb.J(list2)) {
            messageNew_.riskTags = list2;
        }
        if (!TextUtils.isEmpty(str2)) {
            messageNew_.localExtraInfo = str2;
        }
        return m976A0(str).switchMap(new w9j() { // from class: l.w55
            public final Object call(Object obj) {
                return this.f21460a.m990s0(messageNew_, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public final c<Message> m976A0(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        return CoreModule.c.r0.u6(((DbObject) this.f752z).id, Channel.get("city_c"), messageNew_, (String) null, new d30() { // from class: l.a65
            public final void call() {
                this.f7414a.m993v0();
            }
        });
    }

    /* JADX INFO: renamed from: B0 */
    public final void m977B0(String str, cwf0 cwf0Var) {
        this.f751y = str;
        this.f746t = cwf0Var;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m978E0() {
        this.f750x.progress("发送中...");
    }

    /* JADX INFO: renamed from: F0 */
    public final void m979F0(final e30<List<Media>> e30Var) {
        this.f750x.startActivityForResult(MediaPickerAct.X1(this.f750x, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withMinPickCount(1).showPreviewEditBtn(false).build()).withSubmitButtonTitle(this.f750x.getString(R.string.a9)).needClickPreview(true).withFromType(14).build()), new a.a() { // from class: l.z55
            /* JADX INFO: renamed from: a */
            public final boolean m27092a(int i, int i2, Intent intent) {
                return CityTopGreetDialog.m944H(e30Var, i, i2, intent);
            }
        });
        this.f750x.overridePendingTransition(szb0.e, szb0.a);
    }

    /* JADX INFO: renamed from: Y */
    public View m980Y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j65.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m981a0() {
        xdl0.M(this.f740n, true);
        xdl0.X(this.f745s, t100.d(22.0f));
        xdl0.M(this.f737k, false);
        xdl0.M(this.f744r, true);
        this.f729C.clear();
    }

    @NonNull
    /* JADX INFO: renamed from: b0 */
    public String m982b0() {
        return TextUtils.isEmpty(this.f751y) ? "p_greet_to_city_c" : this.f751y;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m983c0(final View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int iMax = Math.max(this.f748v, iHeight);
        this.f748v = iMax;
        if (this.f749w == iHeight) {
            return;
        }
        this.f749w = iHeight;
        if (iHeight < iMax - 200) {
            view.post(new Runnable() { // from class: l.u55
                @Override // java.lang.Runnable
                public final void run() {
                    view.setTranslationY(-t100.K);
                }
            });
        } else {
            view.setTranslationY(0.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public void m984e0() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f750x.getSystemService("input_method");
        if (!inputMethodManager.isActive() || getCurrentFocus() == null || getCurrentFocus().getWindowToken() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m985n0() {
        FrameLayout frameLayout = this.f732f;
        if (frameLayout != null) {
            m983c0(frameLayout);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m986o0(List list) {
        this.f729C.clear();
        this.f729C.addAll(list);
        xdl0.X(this.f745s, t100.d(48.0f));
        xdl0.M(this.f744r, false);
        xdl0.M(this.f737k, true);
        xdl0.M(this.f740n, false);
        qib0.G.I0(this.f738l, this.f729C.get(0).url, t100.d(106.0f), t100.d(106.0f));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m987p0(Throwable th) {
        this.f750x.progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                lsi0.y("对方账号异常");
                return;
            } else {
                if (i != 40046) {
                    yij0.D(th);
                    return;
                }
                CoreModule.c.f0.ap(((DbObject) this.f752z).id);
                CoreModule.c.r0.s0.onNext(((DbObject) this.f752z).id);
                dismiss();
                return;
            }
        }
        if (!(th instanceof TantanException.Client.TantanForbidden)) {
            if (th instanceof IllegalPictureException) {
                lsi0.y("照片含有违规内容，请更换后再试");
                return;
            } else {
                yij0.D(th);
                return;
            }
        }
        TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
        int i2 = tantanForbidden.code;
        if (i2 == 40325 || i2 == 40339) {
            lsi0.y(CoreModule.b.getString(com.tantan.core.base.R.string.o));
            return;
        }
        if (x19.e(tantanForbidden)) {
            lsi0.y("对方同意配对后可发送消息，请耐心等待");
        } else if (x19.d(tantanForbidden)) {
            lsi0.y(tantanForbidden.message);
        } else {
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ c m988q0(String str, xaj0 xaj0Var) {
        return m975z0(str, (List) xaj0Var.a, (List) xaj0Var.b, (String) xaj0Var.c);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m989r0(Message message) {
        this.f750x.progressDismiss();
        CoreModule.c.r0.s0.onNext(((DbObject) this.f752z).id);
        lsi0.y("招呼已发送，对方回复即可配对");
        dismiss();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ c m990s0(Message message, Message message2) {
        return this.f730D ? CoreModule.c.f0.Dn(((DbObject) this.f752z).id, message, (Sticker) null) : CoreModule.c.r0.u6(((DbObject) this.f752z).id, Channel.get("city_c"), message, (String) null, (d30) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f747u = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f747u.setBottomSheetCallback(this.f731E);
        m964g0();
        if (this.f746t == null) {
            this.f746t = i0e.c(m982b0(), CityTopGreetDialog.class.getSimpleName());
        }
        i0e.f(this.f746t);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.m55
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f15237a.m991t0(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m991t0(DialogInterface dialogInterface) {
        i0e.e(this.f746t);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m992u0() {
        this.f732f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.s55
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f18798a.m985n0();
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m993v0() {
        this.f730D = true;
        CoreModule.P().i().D4(this.f750x, this.f752z, 0);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m994w0() {
        if (NullChecker.a(this.f736j.getText()) && this.f736j.getText().length() < 10) {
            lsi0.y(String.format(Locale.getDefault(), "为了表示交友诚意，招呼内容不能低于%d字", 10));
            zvf0.u("e_greet_to_city_c_confirm", m982b0(), new j760[]{vwb.Y("greet_result", 3)});
            return;
        }
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            if (userP9.isJailed()) {
                CoreModule.K().startJailedDialogLikeAct();
                return;
            } else if (userP9.isNameFake()) {
                CoreModule.P().i().A(this.f750x);
                return;
            }
        }
        zvf0.u("e_greet_to_city_c_confirm", m982b0(), new j760[]{vwb.Y("greet_result", Integer.valueOf(vwb.J(this.f729C) ? 1 : 2))});
        mkd0.z(this.f727A);
        this.f727A = m995y0(this.f736j.getText().toString(), this.f729C);
    }

    /* JADX INFO: renamed from: y0 */
    public c4g0 m995y0(final String str, List<Media> list) {
        return duringCreated(vwb.J(list) ? m976A0(str) : new lsx(list, false).flatMap(new w9j() { // from class: l.i65
            public final Object call(Object obj) {
                return this.f13064a.m961Z((List) obj);
            }
        }).observeOn(jo0.a()).last().compose(mkd0.Q()).flatMap(new w9j() { // from class: l.n55
            public final Object call(Object obj) {
                xaj0 xaj0Var = (xaj0) obj;
                return ya5.K((List) xaj0Var.a, "greeting", (String) null, UploadSource.get("chat")).map(new w9j() { // from class: l.t55
                    public final Object call(Object obj2) {
                        xaj0 xaj0Var2 = xaj0Var;
                        return xaj0.a((List) obj2, (List) xaj0Var2.b, (String) xaj0Var2.c);
                    }
                });
            }
        }).compose(mkd0.C()).switchMap(new w9j() { // from class: l.o55
            public final Object call(Object obj) {
                return this.f16366a.m988q0(str, (xaj0) obj);
            }
        })).doOnSubscribe(new d30() { // from class: l.p55
            public final void call() {
                this.f17005a.m978E0();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.q55
            public final void call(Object obj) {
                this.f17811a.m989r0((Message) obj);
            }
        }, new e30() { // from class: l.r55
            public final void call(Object obj) {
                this.f18364a.m987p0((Throwable) obj);
            }
        }));
    }
}
