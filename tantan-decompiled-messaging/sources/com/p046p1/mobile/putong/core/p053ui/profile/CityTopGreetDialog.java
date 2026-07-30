package com.p046p1.mobile.putong.core.p053ui.profile;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CityCentreConfig;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.p053ui.profile.CityTopGreetDialog;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.safety.IllegalPictureException;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.c4g0;
import p149l.cwf0;
import p149l.d30;
import p149l.e30;
import p149l.i0e;
import p149l.j65;
import p149l.jo0;
import p149l.l5j0;
import p149l.lsi0;
import p149l.lsx;
import p149l.mkd0;
import p149l.p4c0;
import p149l.qib0;
import p149l.szb0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.x19;
import p149l.xaj0;
import p149l.xdl0;
import p149l.y19;
import p149l.yij0;
import p149l.zqx;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class CityTopGreetDialog extends l5j0 {

    /* JADX INFO: renamed from: A */
    public c4g0 f32905A;

    /* JADX INFO: renamed from: B */
    public CityCentreConfig f32906B;

    /* JADX INFO: renamed from: C */
    public List<Media> f32907C;

    /* JADX INFO: renamed from: D */
    public boolean f32908D;

    /* JADX INFO: renamed from: E */
    public BottomSheetBehavior.BottomSheetCallback f32909E;

    /* JADX INFO: renamed from: f */
    public FrameLayout f32910f;

    /* JADX INFO: renamed from: g */
    public View f32911g;

    /* JADX INFO: renamed from: h */
    public ConstraintLayout f32912h;

    /* JADX INFO: renamed from: i */
    public TextView f32913i;

    /* JADX INFO: renamed from: j */
    public VEditText f32914j;

    /* JADX INFO: renamed from: k */
    public VFrame f32915k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f32916l;

    /* JADX INFO: renamed from: m */
    public VImage f32917m;

    /* JADX INFO: renamed from: n */
    public VFrame f32918n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f32919o;

    /* JADX INFO: renamed from: p */
    public VImage f32920p;

    /* JADX INFO: renamed from: q */
    public VIcon f32921q;

    /* JADX INFO: renamed from: r */
    public VLinear f32922r;

    /* JADX INFO: renamed from: s */
    public VText f32923s;

    /* JADX INFO: renamed from: t */
    public cwf0 f32924t;

    /* JADX INFO: renamed from: u */
    public BottomSheetBehavior f32925u;

    /* JADX INFO: renamed from: v */
    public int f32926v;

    /* JADX INFO: renamed from: w */
    public int f32927w;

    /* JADX INFO: renamed from: x */
    public Act f32928x;

    /* JADX INFO: renamed from: y */
    public String f32929y;

    /* JADX INFO: renamed from: z */
    public User f32930z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog$a */
    public class C8617a implements TextWatcher {
        public C8617a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == 0 && CityTopGreetDialog.this.f32913i.isEnabled()) {
                CityTopGreetDialog.this.f32913i.setEnabled(false);
                CityTopGreetDialog.this.f32914j.setTypeface(Typeface.DEFAULT);
            } else {
                if (editable.length() <= 0 || CityTopGreetDialog.this.f32913i.isEnabled()) {
                    return;
                }
                CityTopGreetDialog.this.f32913i.setEnabled(true);
                CityTopGreetDialog.this.f32914j.setTypeface(Typeface.DEFAULT_BOLD);
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
    public class C8618b extends BottomSheetBehavior.BottomSheetCallback {
        public C8618b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                CityTopGreetDialog.this.f32925u.setState(3);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog$c */
    public static class C8619c {

        /* JADX INFO: renamed from: a */
        public Act f32933a;

        /* JADX INFO: renamed from: b */
        public String f32934b;

        /* JADX INFO: renamed from: c */
        public cwf0 f32935c;

        /* JADX INFO: renamed from: d */
        public User f32936d;

        public C8619c(Act act) {
            this.f32933a = act;
        }

        /* JADX INFO: renamed from: a */
        public CityTopGreetDialog m50561a() {
            CityTopGreetDialog cityTopGreetDialog = new CityTopGreetDialog(this.f32933a);
            cityTopGreetDialog.m50503C0(this.f32936d);
            cityTopGreetDialog.m50542B0(this.f32934b, this.f32935c);
            return cityTopGreetDialog;
        }

        /* JADX INFO: renamed from: b */
        public C8619c m50562b(User user) {
            this.f32936d = user;
            return this;
        }
    }

    public CityTopGreetDialog(@NonNull Context context) {
        super(context);
        this.f32907C = new ArrayList();
        this.f32909E = new C8618b();
        m50528f0(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public void m50503C0(User user) {
        this.f32930z = user;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m50504D(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static void m50505D0(Act act, final d30 d30Var) {
        PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m79905w(false).m79897o(new d30() { // from class: l.v55
            @Override // p149l.d30
            public final void call() {
                CityTopGreetDialog.m50504D(d30Var);
            }
        }).m79891i(act);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ boolean m50509H(e30 e30Var, int i, int i2, Intent intent) {
        if (i2 == -1 && NullChecker.m81303a(intent)) {
            e30Var.call((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h));
        }
        return i2 == -1 && NullChecker.m81303a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public C22306c<xaj0<List<Media>, List<String>, String>> m50526Z(final List<Media> list) {
        return (!vwb.m200296J(list) && (list.get(0) instanceof Picture) && qib0.f154703R.m94727c()) ? qib0.f154703R.m94726b(Uri.parse(list.get(0).url).getPath()).map(new w9j() { // from class: l.y55
            @Override // p149l.w9j
            public final Object call(Object obj) {
                xaj0 xaj0Var = (xaj0) obj;
                return xaj0.m207578a(list, ((Boolean) xaj0Var.f191751a).booleanValue() ? (List) xaj0Var.f191752b : null, !TextUtils.isEmpty((CharSequence) xaj0Var.f191753c) ? (String) xaj0Var.f191753c : "");
            }
        }) : C22306c.just(xaj0.m207578a(list, new ArrayList<String>() { // from class: com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog.2
        }, ""));
    }

    /* JADX INFO: renamed from: d0 */
    private static boolean m50527d0() {
        return PermissionHelper.m79881b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX INFO: renamed from: f0 */
    private void m50528f0(Context context) {
        this.f32928x = (Act) context;
        setContentView(m50545Y(LayoutInflater.from(context), null));
        this.f32906B = y19.m212174i();
    }

    /* JADX INFO: renamed from: g0 */
    private void m50529g0() {
        if (NullChecker.m81303a(this.f32930z)) {
            qib0.f154691G.m102323H0(this.f32919o, this.f32930z.m60124fp().profile480(), t100.m186890d(80.0f), t100.m186890d(80.0f));
        }
        xdl0.m208329E0(this.f32921q, new View.OnClickListener() { // from class: l.x55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191089a.m50530h0(view);
            }
        });
        xdl0.m208329E0(this.f32912h, new View.OnClickListener() { // from class: l.b65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73743a.m50531i0(view);
            }
        });
        xdl0.m208329E0(this.f32922r, new View.OnClickListener() { // from class: l.c65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79437a.m50532j0(view);
            }
        });
        xdl0.m208329E0(this.f32916l, new View.OnClickListener() { // from class: l.d65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84585a.m50533k0(view);
            }
        });
        xdl0.m208329E0(this.f32917m, new View.OnClickListener() { // from class: l.e65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89500a.m50534l0(view);
            }
        });
        xdl0.m208329E0(this.f32913i, new View.OnClickListener() { // from class: l.f65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95230a.m50535m0(view);
            }
        });
        this.f32923s.setTypeface(Typeface.DEFAULT_BOLD);
        this.f32914j.setMaxLength(50);
        this.f32914j.addTextChangedListener(new C8617a());
        m50557u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m50530h0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m50531i0(View view) {
        m50549e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m50532j0(View view) {
        m50537x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m50533k0(View view) {
        m50537x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m50534l0(View view) {
        m50546a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m50535m0(View view) {
        m50559w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public void m50537x0() {
        zvf0.m220396r("e_greet_to_city_c_pic", m50547b0());
        if (m50527d0() || zqx.m219898k()) {
            m50544F0(new e30() { // from class: l.h65
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f106007a.m50551o0((List) obj);
                }
            });
        } else {
            m50505D0(this.f32928x, new d30() { // from class: l.g65
                @Override // p149l.d30
                public final void call() {
                    this.f101225a.m50537x0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: z0 */
    private C22306c<Message> m50540z0(String str, List<Media> list, List<String> list2, String str2) {
        final Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("picture");
        messageNew_.media = list;
        if (!vwb.m200296J(list2)) {
            messageNew_.riskTags = list2;
        }
        if (!TextUtils.isEmpty(str2)) {
            messageNew_.localExtraInfo = str2;
        }
        return m50541A0(str).switchMap(new w9j() { // from class: l.w55
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f184642a.m50555s0(messageNew_, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public final C22306c<Message> m50541A0(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        return CoreModule.f17545c.f19678r0.m34149u6(this.f32930z.f56011id, Channel.get(Channel.city_c), messageNew_, null, new d30() { // from class: l.a65
            @Override // p149l.d30
            public final void call() {
                this.f67740a.m50558v0();
            }
        });
    }

    /* JADX INFO: renamed from: B0 */
    public final void m50542B0(String str, cwf0 cwf0Var) {
        this.f32929y = str;
        this.f32924t = cwf0Var;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m50543E0() {
        this.f32928x.progress("发送中...");
    }

    /* JADX INFO: renamed from: F0 */
    public final void m50544F0(final e30<List<Media>> e30Var) {
        this.f32928x.startActivityForResult(MediaPickerAct.m78919X1(this.f32928x, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withMinPickCount(1).showPreviewEditBtn(false).build()).withSubmitButtonTitle(this.f32928x.getString(R$string.f18356a9)).needClickPreview(true).withFromType(14).build()), new C4317a.a() { // from class: l.z55
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return CityTopGreetDialog.m50509H(e30Var, i, i2, intent);
            }
        });
        this.f32928x.overridePendingTransition(szb0.f167030e, szb0.f167026a);
    }

    /* JADX INFO: renamed from: Y */
    public View m50545Y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j65.m139904b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m50546a0() {
        xdl0.m208344M(this.f32918n, true);
        xdl0.m208360X(this.f32923s, t100.m186890d(22.0f));
        xdl0.m208344M(this.f32915k, false);
        xdl0.m208344M(this.f32922r, true);
        this.f32907C.clear();
    }

    @NonNull
    /* JADX INFO: renamed from: b0 */
    public String m50547b0() {
        return TextUtils.isEmpty(this.f32929y) ? "p_greet_to_city_c" : this.f32929y;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m50548c0(final View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int iMax = Math.max(this.f32926v, iHeight);
        this.f32926v = iMax;
        if (this.f32927w == iHeight) {
            return;
        }
        this.f32927w = iHeight;
        if (iHeight < iMax + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR) {
            view.post(new Runnable() { // from class: l.u55
                @Override // java.lang.Runnable
                public final void run() {
                    view.setTranslationY(-t100.f167236K);
                }
            });
        } else {
            view.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m50549e0() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f32928x.getSystemService("input_method");
        if (!inputMethodManager.isActive() || getCurrentFocus() == null || getCurrentFocus().getWindowToken() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m50550n0() {
        FrameLayout frameLayout = this.f32910f;
        if (frameLayout != null) {
            m50548c0(frameLayout);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m50551o0(List list) {
        this.f32907C.clear();
        this.f32907C.addAll(list);
        xdl0.m208360X(this.f32923s, t100.m186890d(48.0f));
        xdl0.m208344M(this.f32922r, false);
        xdl0.m208344M(this.f32915k, true);
        xdl0.m208344M(this.f32918n, false);
        qib0.f154691G.m102325I0(this.f32916l, this.f32907C.get(0).url, t100.m186890d(106.0f), t100.m186890d(106.0f));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m50552p0(Throwable th) {
        this.f32928x.progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                lsi0.m151595y("对方账号异常");
                return;
            } else {
                if (i != 40046) {
                    yij0.m214926D(th);
                    return;
                }
                CoreModule.f17545c.f19642f0.m32902ap(this.f32930z.f56011id);
                CoreModule.f17545c.f19678r0.f20038s0.onNext(this.f32930z.f56011id);
                dismiss();
                return;
            }
        }
        if (!(th instanceof TantanException.Client.TantanForbidden)) {
            if (th instanceof IllegalPictureException) {
                lsi0.m151595y("照片含有违规内容，请更换后再试");
                return;
            } else {
                yij0.m214926D(th);
                return;
            }
        }
        TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
        int i2 = tantanForbidden.code;
        if (i2 == 40325 || i2 == 40339) {
            lsi0.m151595y(CoreModule.f17544b.getString(com.tantan.core.base.R$string.f55778o));
            return;
        }
        if (x19.m206695e(tantanForbidden)) {
            lsi0.m151595y("对方同意配对后可发送消息，请耐心等待");
        } else if (x19.m206694d(tantanForbidden)) {
            lsi0.m151595y(tantanForbidden.message);
        } else {
            yij0.m214926D(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C22306c m50553q0(String str, xaj0 xaj0Var) {
        return m50540z0(str, (List) xaj0Var.f191751a, (List) xaj0Var.f191752b, (String) xaj0Var.f191753c);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m50554r0(Message message) {
        this.f32928x.progressDismiss();
        CoreModule.f17545c.f19678r0.f20038s0.onNext(this.f32930z.f56011id);
        lsi0.m151595y("招呼已发送，对方回复即可配对");
        dismiss();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C22306c m50555s0(Message message, Message message2) {
        return this.f32908D ? CoreModule.f17545c.f19642f0.m32623Dn(this.f32930z.f56011id, message, null) : CoreModule.f17545c.f19678r0.m34149u6(this.f32930z.f56011id, Channel.get(Channel.city_c), message, null, null);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f32925u = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f32925u.setBottomSheetCallback(this.f32909E);
        m50529g0();
        if (this.f32924t == null) {
            this.f32924t = i0e.m133794c(m50547b0(), CityTopGreetDialog.class.getSimpleName());
        }
        i0e.m133797f(this.f32924t);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.m55
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f131365a.m50556t0(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m50556t0(DialogInterface dialogInterface) {
        i0e.m133796e(this.f32924t);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m50557u0() {
        this.f32910f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.s55
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f162486a.m50550n0();
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m50558v0() {
        this.f32908D = true;
        CoreModule.m29935P().m94658i().mo158221D4(this.f32928x, this.f32930z, 0);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m50559w0() {
        if (NullChecker.m81303a(this.f32914j.getText()) && this.f32914j.getText().length() < 10) {
            lsi0.m151595y(String.format(Locale.getDefault(), "为了表示交友诚意，招呼内容不能低于%d字", 10));
            zvf0.m220399u("e_greet_to_city_c_confirm", m50547b0(), vwb.m200311Y("greet_result", 3));
            return;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            if (userM169527p9.isJailed()) {
                CoreModule.m29932K().startJailedDialogLikeAct();
                return;
            } else if (userM169527p9.isNameFake()) {
                CoreModule.m29935P().m94658i().mo158199A(this.f32928x);
                return;
            }
        }
        zvf0.m220399u("e_greet_to_city_c_confirm", m50547b0(), vwb.m200311Y("greet_result", Integer.valueOf(vwb.m200296J(this.f32907C) ? 1 : 2)));
        mkd0.m154992z(this.f32905A);
        this.f32905A = m50560y0(this.f32914j.getText().toString(), this.f32907C);
    }

    /* JADX INFO: renamed from: y0 */
    public c4g0 m50560y0(final String str, List<Media> list) {
        return duringCreated(vwb.m200296J(list) ? m50541A0(str) : new lsx(list, false).flatMap(new w9j() { // from class: l.i65
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f111675a.m50526Z((List) obj);
            }
        }).observeOn(jo0.m142408a()).last().compose(mkd0.m154965Q()).flatMap(new w9j() { // from class: l.n55
            @Override // p149l.w9j
            public final Object call(Object obj) {
                xaj0 xaj0Var = (xaj0) obj;
                return ya5.m213795K((List) xaj0Var.f191751a, "greeting", null, UploadSource.get("chat")).map(new w9j() { // from class: l.t55
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        xaj0 xaj0Var2 = xaj0Var;
                        return xaj0.m207578a((List) obj2, (List) xaj0Var2.f191752b, (String) xaj0Var2.f191753c);
                    }
                });
            }
        }).compose(mkd0.m154951C()).switchMap(new w9j() { // from class: l.o55
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f141873a.m50553q0(str, (xaj0) obj);
            }
        })).doOnSubscribe(new d30() { // from class: l.p55
            @Override // p149l.d30
            public final void call() {
                this.f147257a.m50543E0();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.q55
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152727a.m50554r0((Message) obj);
            }
        }, new e30() { // from class: l.r55
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157758a.m50552p0((Throwable) obj);
            }
        }));
    }
}
