package com.p051p1.mobile.putong.core.p058ui.profile;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CityCentreConfig;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.p058ui.profile.CityTopGreetDialog;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.safety.IllegalPictureException;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.bsj0;
import p153l.fo0;
import p153l.g39;
import p153l.h39;
import p153l.i1y;
import p153l.i4g0;
import p153l.jyb;
import p153l.k75;
import p153l.kcg0;
import p153l.l4g0;
import p153l.o1j0;
import p153l.pej0;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.uqb0;
import p153l.vcc0;
import p153l.w1e;
import p153l.wzx;
import p153l.x20;
import p153l.y20;
import p153l.y7c0;

/* JADX INFO: loaded from: classes4.dex */
public class CityTopGreetDialog extends pej0 {

    /* JADX INFO: renamed from: A */
    public kcg0 f33753A;

    /* JADX INFO: renamed from: B */
    public CityCentreConfig f33754B;

    /* JADX INFO: renamed from: C */
    public List<Media> f33755C;

    /* JADX INFO: renamed from: D */
    public boolean f33756D;

    /* JADX INFO: renamed from: E */
    public BottomSheetBehavior.BottomSheetCallback f33757E;

    /* JADX INFO: renamed from: f */
    public FrameLayout f33758f;

    /* JADX INFO: renamed from: g */
    public View f33759g;

    /* JADX INFO: renamed from: h */
    public ConstraintLayout f33760h;

    /* JADX INFO: renamed from: i */
    public TextView f33761i;

    /* JADX INFO: renamed from: j */
    public VEditText f33762j;

    /* JADX INFO: renamed from: k */
    public VFrame f33763k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f33764l;

    /* JADX INFO: renamed from: m */
    public VImage f33765m;

    /* JADX INFO: renamed from: n */
    public VFrame f33766n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f33767o;

    /* JADX INFO: renamed from: p */
    public VImage f33768p;

    /* JADX INFO: renamed from: q */
    public VIcon f33769q;

    /* JADX INFO: renamed from: r */
    public VLinear f33770r;

    /* JADX INFO: renamed from: s */
    public VText f33771s;

    /* JADX INFO: renamed from: t */
    public l4g0 f33772t;

    /* JADX INFO: renamed from: u */
    public BottomSheetBehavior f33773u;

    /* JADX INFO: renamed from: v */
    public int f33774v;

    /* JADX INFO: renamed from: w */
    public int f33775w;

    /* JADX INFO: renamed from: x */
    public Act f33776x;

    /* JADX INFO: renamed from: y */
    public String f33777y;

    /* JADX INFO: renamed from: z */
    public User f33778z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog$a */
    public class C8780a implements TextWatcher {
        public C8780a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == 0 && CityTopGreetDialog.this.f33761i.isEnabled()) {
                CityTopGreetDialog.this.f33761i.setEnabled(false);
                CityTopGreetDialog.this.f33762j.setTypeface(Typeface.DEFAULT);
            } else {
                if (editable.length() <= 0 || CityTopGreetDialog.this.f33761i.isEnabled()) {
                    return;
                }
                CityTopGreetDialog.this.f33761i.setEnabled(true);
                CityTopGreetDialog.this.f33762j.setTypeface(Typeface.DEFAULT_BOLD);
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
    public class C8781b extends BottomSheetBehavior.BottomSheetCallback {
        public C8781b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                CityTopGreetDialog.this.f33773u.setState(3);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog$c */
    public static class C8782c {

        /* JADX INFO: renamed from: a */
        public Act f33781a;

        /* JADX INFO: renamed from: b */
        public String f33782b;

        /* JADX INFO: renamed from: c */
        public l4g0 f33783c;

        /* JADX INFO: renamed from: d */
        public User f33784d;

        public C8782c(Act act) {
            this.f33781a = act;
        }

        /* JADX INFO: renamed from: a */
        public CityTopGreetDialog m51744a() {
            CityTopGreetDialog cityTopGreetDialog = new CityTopGreetDialog(this.f33781a);
            cityTopGreetDialog.m51686C0(this.f33784d);
            cityTopGreetDialog.m51725B0(this.f33782b, this.f33783c);
            return cityTopGreetDialog;
        }

        /* JADX INFO: renamed from: b */
        public C8782c m51745b(User user) {
            this.f33784d = user;
            return this;
        }
    }

    public CityTopGreetDialog(@NonNull Context context) {
        super(context);
        this.f33755C = new ArrayList();
        this.f33757E = new C8781b();
        m51711f0(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public void m51686C0(User user) {
        this.f33778z = user;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m51687D(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static void m51688D0(Act act, final x20 x20Var) {
        PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m81088w(false).m81080o(new x20() { // from class: l.w65
            @Override // p153l.x20
            public final void call() {
                CityTopGreetDialog.m51687D(x20Var);
            }
        }).m81074i(act);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ boolean m51692H(y20 y20Var, int i, int i2, Intent intent) {
        if (i2 == -1 && NullChecker.m82486a(intent)) {
            y20Var.call((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h));
        }
        return i2 == -1 && NullChecker.m82486a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public C22421c<bkj0<List<Media>, List<String>, String>> m51709Z(final List<Media> list) {
        return (!jyb.m147479J(list) && (list.get(0) instanceof Picture) && uqb0.f180386R.m184740c()) ? uqb0.f180386R.m184739b(Uri.parse(list.get(0).url).getPath()).map(new qcj() { // from class: l.z65
            @Override // p153l.qcj
            public final Object call(Object obj) {
                bkj0 bkj0Var = (bkj0) obj;
                return bkj0.m104818a(list, ((Boolean) bkj0Var.f77081a).booleanValue() ? (List) bkj0Var.f77082b : null, !TextUtils.isEmpty((CharSequence) bkj0Var.f77083c) ? (String) bkj0Var.f77083c : "");
            }
        }) : C22421c.just(bkj0.m104818a(list, new ArrayList<String>() { // from class: com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog.2
        }, ""));
    }

    /* JADX INFO: renamed from: d0 */
    private static boolean m51710d0() {
        return PermissionHelper.m81064b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX INFO: renamed from: f0 */
    private void m51711f0(Context context) {
        this.f33776x = (Act) context;
        setContentView(m51728Y(LayoutInflater.from(context), null));
        this.f33754B = h39.m133445i();
    }

    /* JADX INFO: renamed from: g0 */
    private void m51712g0() {
        if (NullChecker.m82486a(this.f33778z)) {
            uqb0.f180374G.m127107H0(this.f33767o, this.f33778z.m61308fp().profile480(), qa00.m175859d(80.0f), qa00.m175859d(80.0f));
        }
        bnl0.m105509E0(this.f33769q, new View.OnClickListener() { // from class: l.y65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197629a.m51713h0(view);
            }
        });
        bnl0.m105509E0(this.f33760h, new View.OnClickListener() { // from class: l.c75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80083a.m51714i0(view);
            }
        });
        bnl0.m105509E0(this.f33770r, new View.OnClickListener() { // from class: l.d75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85456a.m51715j0(view);
            }
        });
        bnl0.m105509E0(this.f33764l, new View.OnClickListener() { // from class: l.e75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92402a.m51716k0(view);
            }
        });
        bnl0.m105509E0(this.f33765m, new View.OnClickListener() { // from class: l.f75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97483a.m51717l0(view);
            }
        });
        bnl0.m105509E0(this.f33761i, new View.OnClickListener() { // from class: l.g75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102509a.m51718m0(view);
            }
        });
        this.f33771s.setTypeface(Typeface.DEFAULT_BOLD);
        this.f33762j.setMaxLength(50);
        this.f33762j.addTextChangedListener(new C8780a());
        m51740u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m51713h0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m51714i0(View view) {
        m51732e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m51715j0(View view) {
        m51720x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m51716k0(View view) {
        m51720x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m51717l0(View view) {
        m51729a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m51718m0(View view) {
        m51742w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public void m51720x0() {
        i4g0.m138520r("e_greet_to_city_c_pic", m51730b0());
        if (m51710d0() || wzx.m208784k()) {
            m51727F0(new y20() { // from class: l.i75
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f113236a.m51734o0((List) obj);
                }
            });
        } else {
            m51688D0(this.f33776x, new x20() { // from class: l.h75
                @Override // p153l.x20
                public final void call() {
                    this.f108092a.m51720x0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: z0 */
    private C22421c<Message> m51723z0(String str, List<Media> list, List<String> list2, String str2) {
        final Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("picture");
        messageNew_.media = list;
        if (!jyb.m147479J(list2)) {
            messageNew_.riskTags = list2;
        }
        if (!TextUtils.isEmpty(str2)) {
            messageNew_.localExtraInfo = str2;
        }
        return m51724A0(str).switchMap(new qcj() { // from class: l.x65
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f192558a.m51738s0(messageNew_, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public final C22421c<Message> m51724A0(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        return CoreModule.f18264c.f20420r0.m35152u6(this.f33778z.f56859id, Channel.get(Channel.city_c), messageNew_, null, new x20() { // from class: l.b75
            @Override // p153l.x20
            public final void call() {
                this.f75253a.m51741v0();
            }
        });
    }

    /* JADX INFO: renamed from: B0 */
    public final void m51725B0(String str, l4g0 l4g0Var) {
        this.f33777y = str;
        this.f33772t = l4g0Var;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m51726E0() {
        this.f33776x.progress("发送中...");
    }

    /* JADX INFO: renamed from: F0 */
    public final void m51727F0(final y20<List<Media>> y20Var) {
        this.f33776x.startActivityForResult(MediaPickerAct.m80102Y1(this.f33776x, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withMinPickCount(1).showPreviewEditBtn(false).build()).withSubmitButtonTitle(this.f33776x.getString(R$string.f19148c9)).needClickPreview(true).withFromType(14).build()), new C4468a.a() { // from class: l.a75
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return CityTopGreetDialog.m51692H(y20Var, i, i2, intent);
            }
        });
        this.f33776x.overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
    }

    /* JADX INFO: renamed from: Y */
    public View m51728Y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k75.m148591b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m51729a0() {
        bnl0.m105524M(this.f33766n, true);
        bnl0.m105540X(this.f33771s, qa00.m175859d(22.0f));
        bnl0.m105524M(this.f33763k, false);
        bnl0.m105524M(this.f33770r, true);
        this.f33755C.clear();
    }

    @NonNull
    /* JADX INFO: renamed from: b0 */
    public String m51730b0() {
        return TextUtils.isEmpty(this.f33777y) ? "p_greet_to_city_c" : this.f33777y;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m51731c0(final View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int iMax = Math.max(this.f33774v, iHeight);
        this.f33774v = iMax;
        if (this.f33775w == iHeight) {
            return;
        }
        this.f33775w = iHeight;
        if (iHeight < iMax + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR) {
            view.post(new Runnable() { // from class: l.v65
                @Override // java.lang.Runnable
                public final void run() {
                    view.setTranslationY(-qa00.f156298K);
                }
            });
        } else {
            view.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m51732e0() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f33776x.getSystemService("input_method");
        if (!inputMethodManager.isActive() || getCurrentFocus() == null || getCurrentFocus().getWindowToken() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m51733n0() {
        FrameLayout frameLayout = this.f33758f;
        if (frameLayout != null) {
            m51731c0(frameLayout);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m51734o0(List list) {
        this.f33755C.clear();
        this.f33755C.addAll(list);
        bnl0.m105540X(this.f33771s, qa00.m175859d(48.0f));
        bnl0.m105524M(this.f33770r, false);
        bnl0.m105524M(this.f33763k, true);
        bnl0.m105524M(this.f33766n, false);
        uqb0.f180374G.m127109I0(this.f33764l, this.f33755C.get(0).url, qa00.m175859d(106.0f), qa00.m175859d(106.0f));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m51735p0(Throwable th) {
        this.f33776x.progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                o1j0.m165651y("对方账号异常");
                return;
            } else {
                if (i != 40046) {
                    bsj0.m106246D(th);
                    return;
                }
                CoreModule.f18264c.f20384f0.m33905ap(this.f33778z.f56859id);
                CoreModule.f18264c.f20420r0.f20780s0.onNext(this.f33778z.f56859id);
                dismiss();
                return;
            }
        }
        if (!(th instanceof TantanException.Client.TantanForbidden)) {
            if (th instanceof IllegalPictureException) {
                o1j0.m165651y("照片含有违规内容，请更换后再试");
                return;
            } else {
                bsj0.m106246D(th);
                return;
            }
        }
        TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
        int i2 = tantanForbidden.code;
        if (i2 == 40325 || i2 == 40339) {
            o1j0.m165651y(CoreModule.f18263b.getString(com.tantan.core.base.R$string.f56626o));
            return;
        }
        if (g39.m128719e(tantanForbidden)) {
            o1j0.m165651y("对方同意配对后可发送消息，请耐心等待");
        } else if (g39.m128718d(tantanForbidden)) {
            o1j0.m165651y(tantanForbidden.message);
        } else {
            bsj0.m106246D(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C22421c m51736q0(String str, bkj0 bkj0Var) {
        return m51723z0(str, (List) bkj0Var.f77081a, (List) bkj0Var.f77082b, (String) bkj0Var.f77083c);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m51737r0(Message message) {
        this.f33776x.progressDismiss();
        CoreModule.f18264c.f20420r0.f20780s0.onNext(this.f33778z.f56859id);
        o1j0.m165651y("招呼已发送，对方回复即可配对");
        dismiss();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C22421c m51738s0(Message message, Message message2) {
        return this.f33756D ? CoreModule.f18264c.f20384f0.m33626Dn(this.f33778z.f56859id, message, null) : CoreModule.f18264c.f20420r0.m35152u6(this.f33778z.f56859id, Channel.get(Channel.city_c), message, null, null);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f33773u = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f33773u.setBottomSheetCallback(this.f33757E);
        m51712g0();
        if (this.f33772t == null) {
            this.f33772t = w1e.m204399c(m51730b0(), CityTopGreetDialog.class.getSimpleName());
        }
        w1e.m204402f(this.f33772t);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.n65
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f140430a.m51739t0(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m51739t0(DialogInterface dialogInterface) {
        w1e.m204401e(this.f33772t);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m51740u0() {
        this.f33758f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.t65
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f172292a.m51733n0();
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m51741v0() {
        this.f33756D = true;
        CoreModule.m30933P().m143412i().mo180313D4(this.f33776x, this.f33778z, 0);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m51742w0() {
        if (NullChecker.m82486a(this.f33762j.getText()) && this.f33762j.getText().length() < 10) {
            o1j0.m165651y(String.format(Locale.getDefault(), "为了表示交友诚意，招呼内容不能低于%d字", 10));
            i4g0.m138523u("e_greet_to_city_c_confirm", m51730b0(), jyb.m147494Y("greet_result", 3));
            return;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            if (userM116600p9.isJailed()) {
                CoreModule.m30930K().startJailedDialogLikeAct();
                return;
            } else if (userM116600p9.isNameFake()) {
                CoreModule.m30933P().m143412i().mo180291A(this.f33776x);
                return;
            }
        }
        i4g0.m138523u("e_greet_to_city_c_confirm", m51730b0(), jyb.m147494Y("greet_result", Integer.valueOf(jyb.m147479J(this.f33755C) ? 1 : 2)));
        psd0.m173633z(this.f33753A);
        this.f33753A = m51743y0(this.f33762j.getText().toString(), this.f33755C);
    }

    /* JADX INFO: renamed from: y0 */
    public kcg0 m51743y0(final String str, List<Media> list) {
        return duringCreated(jyb.m147479J(list) ? m51724A0(str) : new i1y(list, false).flatMap(new qcj() { // from class: l.j75
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f118629a.m51709Z((List) obj);
            }
        }).observeOn(fo0.m126432a()).last().compose(psd0.m173606Q()).flatMap(new qcj() { // from class: l.o65
            @Override // p153l.qcj
            public final Object call(Object obj) {
                bkj0 bkj0Var = (bkj0) obj;
                return yb5.m214982K((List) bkj0Var.f77081a, "greeting", null, UploadSource.get("chat")).map(new qcj() { // from class: l.u65
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        bkj0 bkj0Var2 = bkj0Var;
                        return bkj0.m104818a((List) obj2, (List) bkj0Var2.f77082b, (String) bkj0Var2.f77083c);
                    }
                });
            }
        }).compose(psd0.m173592C()).switchMap(new qcj() { // from class: l.p65
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f150736a.m51736q0(str, (bkj0) obj);
            }
        })).doOnSubscribe(new x20() { // from class: l.q65
            @Override // p153l.x20
            public final void call() {
                this.f155783a.m51726E0();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.r65
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161444a.m51737r0((Message) obj);
            }
        }, new y20() { // from class: l.s65
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166538a.m51735p0((Throwable) obj);
            }
        }));
    }
}
