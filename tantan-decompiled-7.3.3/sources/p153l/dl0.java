package p153l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncement;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0005J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u000fR#\u0010\u001f\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010$\u001a\n \u001a*\u0004\u0018\u00010 0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#¨\u0006%"}, m88121d2 = {"Ll/dl0;", "Ll/i7t;", "Ll/ll0;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;", "<init>", "()V", "", "show", "", RXScreenCaptureService.KEY_INDEX, "", "K", "(ZI)V", VirtualVoiceMotionType.announcement, "L", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;)V", "init", "j", "M", "enable", "F", "(Z)V", "J", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;)Z", "N", "Lcom/p1/mobile/putong/live/base/data/BLiveCommonConfig;", "kotlin.jvm.PlatformType", BLiveStormDanmakuGiftResourceType.f45292l, "Lkotlin/Lazy;", "H", "()Lcom/p1/mobile/putong/live/base/data/BLiveCommonConfig;", "roomAnnouncement", "", "m", "G", "()Ljava/lang/String;", "publishStr", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dl0 extends i7t<ll0<?>, BLiveMultiCallAnnouncement> {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy roomAnnouncement;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy publishStr;

    /* JADX INFO: renamed from: l.dl0$a */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"l/dl0$a", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f45294s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16568a implements TextWatcher {
        public C16568a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            s.getClass();
            dl0.this.m116703F(s.length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            s.getClass();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            s.getClass();
            if (!TextUtils.isEmpty(s) && s.length() == dl0.this.m116705H().maxLength) {
                r1j0.m179420g(xau.m209911u(R$string.f48128hc, String.valueOf(dl0.this.m116705H().maxLength)));
            }
            dl0 dl0Var = dl0.this;
            dl0Var.f113295i.setText(String.valueOf(dl0Var.m116705H().maxLength - s.length()));
        }
    }

    public dl0() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.roomAnnouncement = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.al0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return dl0.m116699w();
            }
        });
        this.publishStr = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.bl0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return dl0.m116698v();
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static void m116692A(dl0 dl0Var, View view) {
        dl0Var.f113294h.requestFocus();
    }

    /* JADX INFO: renamed from: B */
    public static Unit m116693B(dl0 dl0Var, View view) {
        view.getClass();
        if (Intrinsics.m88377d(dl0Var.m116704G(), dl0Var.f113296j.getText())) {
            ((ll0) dl0Var.f48554b).m154675Z3(dl0Var.f113294h.getText().toString());
        } else {
            r1j0.m179419f(R$string.f48215lc);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static void m116694C(dl0 dl0Var) {
        View viewM72912l = dl0Var.m72912l();
        if (viewM72912l != null) {
            viewM72912l.setTranslationY(0.0f);
        }
        Act act = dl0Var.getAct();
        if (act != null) {
            act.hideInput();
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m116696I(dl0 dl0Var, View view) {
        ((ll0) dl0Var.f48554b).m154673W3();
    }

    /* JADX INFO: renamed from: K */
    private final void m116697K(boolean show, int i) {
        if (show) {
            View viewM72912l = m72912l();
            if (viewM72912l != null) {
                viewM72912l.setTranslationY(-i);
                return;
            }
            return;
        }
        View viewM72912l2 = m72912l();
        if (viewM72912l2 != null) {
            viewM72912l2.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: v */
    public static String m116698v() {
        return xau.m209910t(R$string.f48171jc);
    }

    /* JADX INFO: renamed from: w */
    public static BLiveCommonConfig m116699w() {
        return zrv.m221193k().m203659k5();
    }

    /* JADX INFO: renamed from: x */
    public static void m116700x(dl0 dl0Var, Boolean bool, Integer num) {
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        num.getClass();
        dl0Var.m116697K(zBooleanValue, num.intValue());
    }

    /* JADX INFO: renamed from: z */
    public static Unit m116702z(final dl0 dl0Var, View view) {
        view.getClass();
        jr10.m146663m();
        new th0.C20312a(dl0Var.getContext()).m191151j(xau.m209910t(R$string.f48237mc)).m191146e(R$string.f47961a).m191158q(R$string.f47983b).m191149h(false).m191156o(new View.OnClickListener() { // from class: l.cl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dl0.m116696I(this.f82333a, view2);
            }
        }).m191142a().m191141g();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public final void m116703F(boolean enable) {
        TextView textView = this.f113296j;
        if (enable) {
            textView.setBackgroundResource(obc0.f146458q0);
        } else {
            textView.setBackgroundResource(obc0.f146210V);
        }
    }

    /* JADX INFO: renamed from: G */
    public final String m116704G() {
        return (String) this.publishStr.getValue();
    }

    /* JADX INFO: renamed from: H */
    public final BLiveCommonConfig m116705H() {
        return (BLiveCommonConfig) this.roomAnnouncement.getValue();
    }

    /* JADX INFO: renamed from: J */
    public final boolean m116706J(BLiveMultiCallAnnouncement announcement) {
        return TEnum.equals(announcement.state, "default") || TEnum.equals(announcement.state, "pending");
    }

    /* JADX INFO: renamed from: L */
    public void m116707L(@NotNull BLiveMultiCallAnnouncement announcement) {
        announcement.getClass();
        super.m72915q(announcement);
        bnl0.m105524M(this.f113297k, TEnum.equals(announcement.state, "approved"));
        m116708M(announcement);
        m116709N(announcement);
    }

    /* JADX INFO: renamed from: M */
    public final void m116708M(@NotNull BLiveMultiCallAnnouncement announcement) {
        announcement.getClass();
        boolean zEquals = TEnum.equals(announcement.state, "default");
        EditText editText = this.f113294h;
        if (zEquals) {
            editText.setHint(R$string.f48150ic);
            this.f113294h.setText("");
        } else {
            editText.setText(announcement.content);
        }
        this.f113295i.setText(String.valueOf(m116705H().maxLength - this.f113294h.getText().length()));
        boolean zEquals2 = TEnum.equals(announcement.state, "pending");
        EditText editText2 = this.f113294h;
        if (zEquals2) {
            editText2.setFocusable(false);
            this.f113294h.setFocusableInTouchMode(false);
            return;
        }
        editText2.setFocusableInTouchMode(true);
        this.f113294h.setFocusable(true);
        this.f113294h.requestFocus();
        EditText editText3 = this.f113294h;
        editText3.setSelection(editText3.getText().length());
    }

    /* JADX INFO: renamed from: N */
    public final void m116709N(BLiveMultiCallAnnouncement announcement) {
        if (TEnum.equals(announcement.state, "pending")) {
            this.f113296j.setText(xau.m209910t(R$string.f48084fc));
        } else {
            jr10.INSTANCE.m146672r();
            this.f113296j.setText(m116704G());
        }
        m116703F(!m116706J(announcement));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        Act act = getAct();
        if (act != null) {
            act.setUpKeyboardDetectorLayout(new View(getAct()), this.f113294h, new z20() { // from class: l.vk0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    dl0.m116700x(this.f184450a, (Boolean) obj, (Integer) obj2);
                }
            });
        }
        this.f113294h.setOnClickListener(new View.OnClickListener() { // from class: l.wk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dl0.m116692A(this.f189517a, view);
            }
        });
        this.f113294h.addTextChangedListener(new C16568a());
        this.f113295i.setText(String.valueOf(m116705H().maxLength));
        TextView textView = this.f113296j;
        textView.getClass();
        czq.m113347c(textView, new Function1() { // from class: l.xk0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dl0.m116693B(this.f194659a, (View) obj);
            }
        });
        TextView textView2 = this.f113297k;
        textView2.getClass();
        czq.m113347c(textView2, new Function1() { // from class: l.yk0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dl0.m116702z(this.f200363a, (View) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: j */
    public void mo72910j() {
        super.mo72910j();
        l51.m152888H(getAct(), new Runnable() { // from class: l.zk0
            @Override // java.lang.Runnable
            public final void run() {
                dl0.m116694C(this.f204720a);
            }
        }, 300L);
    }
}
