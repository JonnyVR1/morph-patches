package p149l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncement;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0005J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u000fR#\u0010\u001f\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010$\u001a\n \u001a*\u0004\u0018\u00010 0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#¨\u0006%"}, m87232d2 = {"Ll/hl0;", "Ll/h5t;", "Ll/pl0;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;", "<init>", "()V", "", "show", "", RXScreenCaptureService.KEY_INDEX, "", "K", "(ZI)V", VirtualVoiceMotionType.announcement, "L", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;)V", "init", "j", "M", "enable", "F", "(Z)V", "J", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;)Z", "N", "Lcom/p1/mobile/putong/live/base/data/BLiveCommonConfig;", "kotlin.jvm.PlatformType", BLiveStormDanmakuGiftResourceType.f44444l, "Lkotlin/Lazy;", "H", "()Lcom/p1/mobile/putong/live/base/data/BLiveCommonConfig;", "roomAnnouncement", "", "m", "G", "()Ljava/lang/String;", "publishStr", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class hl0 extends h5t<pl0<?>, BLiveMultiCallAnnouncement> {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy roomAnnouncement;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy publishStr;

    /* JADX INFO: renamed from: l.hl0$a */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"l/hl0$a", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f44446s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17337a implements TextWatcher {
        public C17337a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            s.getClass();
            hl0.this.m131620F(s.length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            s.getClass();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            s.getClass();
            if (!TextUtils.isEmpty(s) && s.length() == hl0.this.m131622H().maxLength) {
                osi0.m165783g(w8u.m202218u(R$string.f47280hc, String.valueOf(hl0.this.m131622H().maxLength)));
            }
            hl0 hl0Var = hl0.this;
            hl0Var.f105988i.setText(String.valueOf(hl0Var.m131622H().maxLength - s.length()));
        }
    }

    public hl0() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.roomAnnouncement = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.el0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return hl0.m131616w();
            }
        });
        this.publishStr = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.fl0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return hl0.m131615v();
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static void m131609A(hl0 hl0Var, View view) {
        hl0Var.f105987h.requestFocus();
    }

    /* JADX INFO: renamed from: B */
    public static Unit m131610B(hl0 hl0Var, View view) {
        view.getClass();
        if (Intrinsics.m87488d(hl0Var.m131621G(), hl0Var.f105989j.getText())) {
            ((pl0) hl0Var.f47706b).m170071Z3(hl0Var.f105987h.getText().toString());
        } else {
            osi0.m165782f(R$string.f47367lc);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static void m131611C(hl0 hl0Var) {
        View viewM71729l = hl0Var.m71729l();
        if (viewM71729l != null) {
            viewM71729l.setTranslationY(0.0f);
        }
        Act act = hl0Var.getAct();
        if (act != null) {
            act.hideInput();
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m131613I(hl0 hl0Var, View view) {
        ((pl0) hl0Var.f47706b).m170069W3();
    }

    /* JADX INFO: renamed from: K */
    private final void m131614K(boolean show, int i) {
        if (show) {
            View viewM71729l = m71729l();
            if (viewM71729l != null) {
                viewM71729l.setTranslationY(-i);
                return;
            }
            return;
        }
        View viewM71729l2 = m71729l();
        if (viewM71729l2 != null) {
            viewM71729l2.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: v */
    public static String m131615v() {
        return w8u.m202217t(R$string.f47323jc);
    }

    /* JADX INFO: renamed from: w */
    public static BLiveCommonConfig m131616w() {
        return ypv.m215672k().m195872k5();
    }

    /* JADX INFO: renamed from: x */
    public static void m131617x(hl0 hl0Var, Boolean bool, Integer num) {
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        num.getClass();
        hl0Var.m131614K(zBooleanValue, num.intValue());
    }

    /* JADX INFO: renamed from: z */
    public static Unit m131619z(final hl0 hl0Var, View view) {
        view.getClass();
        zi10.m218899m();
        new xh0.C21150a(hl0Var.getContext()).m208731j(w8u.m202217t(R$string.f47389mc)).m208726e(R$string.f47113a).m208738q(R$string.f47135b).m208729h(false).m208736o(new View.OnClickListener() { // from class: l.gl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hl0.m131613I(this.f103274a, view2);
            }
        }).m208722a().m208721g();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public final void m131620F(boolean enable) {
        TextView textView = this.f105989j;
        if (enable) {
            textView.setBackgroundResource(i3c0.f111130q0);
        } else {
            textView.setBackgroundResource(i3c0.f110882V);
        }
    }

    /* JADX INFO: renamed from: G */
    public final String m131621G() {
        return (String) this.publishStr.getValue();
    }

    /* JADX INFO: renamed from: H */
    public final BLiveCommonConfig m131622H() {
        return (BLiveCommonConfig) this.roomAnnouncement.getValue();
    }

    /* JADX INFO: renamed from: J */
    public final boolean m131623J(BLiveMultiCallAnnouncement announcement) {
        return TEnum.equals(announcement.state, "default") || TEnum.equals(announcement.state, "pending");
    }

    /* JADX INFO: renamed from: L */
    public void m131624L(@NotNull BLiveMultiCallAnnouncement announcement) {
        announcement.getClass();
        super.m71732q(announcement);
        xdl0.m208344M(this.f105990k, TEnum.equals(announcement.state, "approved"));
        m131625M(announcement);
        m131626N(announcement);
    }

    /* JADX INFO: renamed from: M */
    public final void m131625M(@NotNull BLiveMultiCallAnnouncement announcement) {
        announcement.getClass();
        boolean zEquals = TEnum.equals(announcement.state, "default");
        EditText editText = this.f105987h;
        if (zEquals) {
            editText.setHint(R$string.f47302ic);
            this.f105987h.setText("");
        } else {
            editText.setText(announcement.content);
        }
        this.f105988i.setText(String.valueOf(m131622H().maxLength - this.f105987h.getText().length()));
        boolean zEquals2 = TEnum.equals(announcement.state, "pending");
        EditText editText2 = this.f105987h;
        if (zEquals2) {
            editText2.setFocusable(false);
            this.f105987h.setFocusableInTouchMode(false);
            return;
        }
        editText2.setFocusableInTouchMode(true);
        this.f105987h.setFocusable(true);
        this.f105987h.requestFocus();
        EditText editText3 = this.f105987h;
        editText3.setSelection(editText3.getText().length());
    }

    /* JADX INFO: renamed from: N */
    public final void m131626N(BLiveMultiCallAnnouncement announcement) {
        if (TEnum.equals(announcement.state, "pending")) {
            this.f105989j.setText(w8u.m202217t(R$string.f47236fc));
        } else {
            zi10.INSTANCE.m218908r();
            this.f105989j.setText(m131621G());
        }
        m131620F(!m131623J(announcement));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        Act act = getAct();
        if (act != null) {
            act.setUpKeyboardDetectorLayout(new View(getAct()), this.f105987h, new f30() { // from class: l.zk0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    hl0.m131617x(this.f203497a, (Boolean) obj, (Integer) obj2);
                }
            });
        }
        this.f105987h.setOnClickListener(new View.OnClickListener() { // from class: l.al0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hl0.m131609A(this.f70354a, view);
            }
        });
        this.f105987h.addTextChangedListener(new C17337a());
        this.f105988i.setText(String.valueOf(m131622H().maxLength));
        TextView textView = this.f105989j;
        textView.getClass();
        cxq.m109105c(textView, new Function1() { // from class: l.bl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hl0.m131610B(this.f76153a, (View) obj);
            }
        });
        TextView textView2 = this.f105990k;
        textView2.getClass();
        cxq.m109105c(textView2, new Function1() { // from class: l.cl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hl0.m131619z(this.f81360a, (View) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: j */
    public void mo71727j() {
        super.mo71727j();
        e51.m114743H(getAct(), new Runnable() { // from class: l.dl0
            @Override // java.lang.Runnable
            public final void run() {
                hl0.m131611C(this.f86770a);
            }
        }, 300L);
    }
}
