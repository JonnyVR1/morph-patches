package p153l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveDailyPayment;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ¸\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002¹\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0014J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u0014J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010\u001cJ\u001f\u0010(\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\u0004\u0018\u00010\n2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b*\u0010)J\u0019\u0010+\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b+\u0010\u000eJ\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u0014J\u0015\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\fH\u0014¢\u0006\u0004\b1\u0010\u0014R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010?\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u000eR\"\u0010B\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010;\u001a\u0004\b@\u0010=\"\u0004\bA\u0010\u000eR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010M\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR\"\u0010Z\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010;\u001a\u0004\bX\u0010=\"\u0004\bY\u0010\u000eR\"\u0010]\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010E\u001a\u0004\b[\u0010G\"\u0004\b\\\u0010IR\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010q\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010;\u001a\u0004\bo\u0010=\"\u0004\bp\u0010\u000eR\"\u0010u\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010;\u001a\u0004\bs\u0010=\"\u0004\bt\u0010\u000eR\"\u0010x\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010E\u001a\u0004\bv\u0010G\"\u0004\bw\u0010IR\"\u0010|\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010`\u001a\u0004\bz\u0010b\"\u0004\b{\u0010dR#\u0010\u0080\u0001\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010`\u001a\u0004\b~\u0010b\"\u0004\b\u007f\u0010dR&\u0010\u0084\u0001\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010`\u001a\u0005\b\u0082\u0001\u0010b\"\u0005\b\u0083\u0001\u0010dR*\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R&\u0010\u0090\u0001\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010E\u001a\u0005\b\u008e\u0001\u0010G\"\u0005\b\u008f\u0001\u0010IR&\u0010\u0094\u0001\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010E\u001a\u0005\b\u0092\u0001\u0010G\"\u0005\b\u0093\u0001\u0010IR&\u0010\u0098\u0001\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010E\u001a\u0005\b\u0096\u0001\u0010G\"\u0005\b\u0097\u0001\u0010IR*\u0010 \u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R&\u0010¤\u0001\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¡\u0001\u0010`\u001a\u0005\b¢\u0001\u0010b\"\u0005\b£\u0001\u0010dR&\u0010¨\u0001\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¥\u0001\u0010`\u001a\u0005\b¦\u0001\u0010b\"\u0005\b§\u0001\u0010dR&\u0010¬\u0001\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b©\u0001\u0010`\u001a\u0005\bª\u0001\u0010b\"\u0005\b«\u0001\u0010dR\u0018\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u00ad\u0001R\u0018\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010±\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0001\u0010oR\u0018\u0010³\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010oR\u001a\u0010·\u0001\u001a\u00030´\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001¨\u0006º\u0001"}, m88121d2 = {"Ll/ute0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/v06;", "", "layoutRes", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(ILcom/p1/mobile/android/app/Act;Ll/v06;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "P", "(Landroid/view/View;)V", "number", "", "y0", "(I)Ljava/lang/String;", "w0", "()V", "selectedType", "t0", "(I)V", "z0", "", "isShowRules", "v0", "(Z)V", "isShowKeyBoard", "u0", "isOpen", "x0", "s0", "p0", "q0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Q", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "m", "r", "Lcom/p1/mobile/putong/live/base/data/BLiveDailyPayment;", "data", "r0", "(Lcom/p1/mobile/putong/live/base/data/BLiveDailyPayment;)V", "w", "Landroidx/constraintlayout/widget/ConstraintLayout;", "k", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b0", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/view/View;", "j0", "()Landroid/view/View;", "set_shadow", "_shadow", "get_bg", "set_bg", "_bg", "Landroid/widget/TextView;", "n", "Landroid/widget/TextView;", "o0", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VImage;", "o", "Lv/VImage;", p7f.GPS_DIRECTION_TRUE, "()Lv/VImage;", "set_back_icon", "(Lv/VImage;)V", "_back_icon", "p", "a0", "set_question_icon", "_question_icon", "q", "get_line", "set_line", "_line", "n0", "set_switch_title", "_switch_title", "Lv/VText;", BLiveStormDanmakuGiftResourceType.f45294s, "Lv/VText;", "m0", "()Lv/VText;", "set_switch_sub_title", "(Lv/VText;)V", "_switch_sub_title", "Landroid/widget/FrameLayout;", Constants.KEY_T, "Landroid/widget/FrameLayout;", "l0", "()Landroid/widget/FrameLayout;", "set_switch_open", "(Landroid/widget/FrameLayout;)V", "_switch_open", "u", "Z", "set_point_bg", "_point_bg", ResourceDirection.f39656v, "d0", "set_round_point", "_round_point", "i0", "set_set_count_title", "_set_count_title", BaseSei.f14624X, p7f.GPS_MEASUREMENT_INTERRUPTED, "set_count_position_left", "_count_position_left", BaseSei.f14625Y, "U", "set_count_position_center", "_count_position_center", BaseSei.f14626Z, "W", "set_count_position_right", "_count_position_right", "Lv/VEditText;", "A", "Lv/VEditText;", "Y", "()Lv/VEditText;", "set_input_number", "(Lv/VEditText;)V", "_input_number", "B", "X", "set_hint_unit_text", "_hint_unit_text", c4s.C_ZONE, "k0", "set_submit_bt", "_submit_bt", "D", "c0", "set_root_text", "_root_text", "Lv/VLinear;", "E", "Lv/VLinear;", "e0", "()Lv/VLinear;", "set_ruler_linear", "(Lv/VLinear;)V", "_ruler_linear", "F", "f0", "set_rules_text_one", "_rules_text_one", "G", "h0", "set_rules_text_two", "_rules_text_two", "H", "g0", "set_rules_text_three", "_rules_text_three", "I", "J", "Lcom/p1/mobile/putong/live/base/data/BLiveDailyPayment;", "K", "keyBoardIsShow", "L", "switchIsOpen", "Landroid/animation/ObjectAnimator;", "M", "Landroid/animation/ObjectAnimator;", "animator", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ute0 extends LiveMenuDialogHolder<v06> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VEditText _input_number;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public TextView _hint_unit_text;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public TextView _submit_bt;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public TextView _root_text;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VLinear _ruler_linear;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public VText _rules_text_one;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public VText _rules_text_two;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public VText _rules_text_three;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public int selectedType;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public BLiveDailyPayment data;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public boolean keyBoardIsShow;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public boolean switchIsOpen;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ObjectAnimator animator;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public ConstraintLayout _root;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _shadow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VImage _back_icon;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VImage _question_icon;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public View _line;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public TextView _switch_title;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VText _switch_sub_title;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public FrameLayout _switch_open;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public View _point_bg;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public View _round_point;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public TextView _set_count_title;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VText _count_position_left;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VText _count_position_center;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public VText _count_position_right;

    /* JADX INFO: renamed from: l.ute0$b */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"l/ute0$b", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f45294s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20664b implements TextWatcher {
        public C20664b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            s.getClass();
            ute0.this.m198017k0().setEnabled((TextUtils.isEmpty(s) || ute0.this.selectedType == -1) ? false : true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            s.getClass();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            s.getClass();
        }
    }

    /* JADX INFO: renamed from: l.ute0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\u000b¸\u0006\n"}, m88121d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$1", "core-ktx_release"}, m88122k = 1, m88123mv = {2, 2, 0})
    @SourceDebugExtension
    public static final class C20665c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f180939b;

        public C20665c(boolean z) {
            this.f180939b = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            animator.getClass();
            ute0.this.m198006Z().setBackground(n3d0.m161278b(this.f180939b ? obc0.f146381j7 : obc0.f146369i7));
            ute0.this.m198010d0().setBackground(n3d0.m161278b(this.f180939b ? obc0.f146405l7 : obc0.f146393k7));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            animator.getClass();
        }
    }

    /* JADX INFO: renamed from: l.ute0$d */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"l/ute0$d", "Ll/mtf0$a;", "", "height", "", "b", "(I)V", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20666d implements mtf0.InterfaceC18702a {
        public C20666d() {
        }

        @Override // p153l.mtf0.InterfaceC18702a
        /* JADX INFO: renamed from: a */
        public void mo159991a(int height) {
            ute0.this.m198028u0(false);
        }

        @Override // p153l.mtf0.InterfaceC18702a
        /* JADX INFO: renamed from: b */
        public void mo159992b(int height) {
            ute0.this.m198028u0(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ute0(int i, @Nullable Act act, @NotNull v06 v06Var) {
        super(i, act, v06Var);
        v06Var.getClass();
        this.selectedType = -1;
    }

    /* JADX INFO: renamed from: F */
    public static void m197985F(ute0 ute0Var, View view) {
        ute0Var.m198027t0(1);
    }

    /* JADX INFO: renamed from: G */
    public static void m197986G(ute0 ute0Var, View view) {
        ute0Var.m198029v0(false);
    }

    /* JADX INFO: renamed from: H */
    public static void m197987H(ute0 ute0Var, View view) {
        if (ute0Var.keyBoardIsShow) {
            ute0Var.m198022p0();
        } else {
            ute0Var.mo73021p();
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m197988I(ute0 ute0Var, View view) {
        ute0Var.m198027t0(0);
    }

    /* JADX INFO: renamed from: J */
    public static void m197989J(ute0 ute0Var, View view) {
        ute0Var.m197997x0(!ute0Var.switchIsOpen);
    }

    /* JADX INFO: renamed from: K */
    public static void m197990K(ute0 ute0Var, View view) {
        ute0Var.m198027t0(3);
        ute0Var.m198032z0();
    }

    /* JADX INFO: renamed from: L */
    public static void m197991L(ute0 ute0Var, View view, boolean z) {
        if (z) {
            ute0Var.m198027t0(3);
            ute0Var.m198032z0();
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m197992M(ute0 ute0Var, View view) {
        ute0Var.m198030w0();
    }

    /* JADX INFO: renamed from: N */
    public static void m197993N(ute0 ute0Var, View view) {
        if (ute0Var.keyBoardIsShow) {
            ute0Var.m198022p0();
        } else {
            ute0Var.m198029v0(true);
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m197994O(ute0 ute0Var, View view) {
        ute0Var.m198027t0(2);
    }

    /* JADX INFO: renamed from: x0 */
    private final void m197997x0(boolean isOpen) {
        this.switchIsOpen = isOpen;
        m198023q0(isOpen);
        bnl0.m105524M(m198004X(), isOpen);
        bnl0.m105524M(m198015i0(), isOpen);
        bnl0.m105524M(m198005Y(), isOpen);
        bnl0.m105524M(m198002V(), isOpen);
        bnl0.m105524M(m198001U(), isOpen);
        bnl0.m105524M(m198003W(), isOpen);
        bnl0.m105524M(m198017k0(), isOpen);
        bnl0.m105524M(m198009c0(), isOpen);
    }

    /* JADX INFO: renamed from: P */
    public final void m197998P(View view) {
        vte0.m202671a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final View m197999Q(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM202672b = vte0.m202672b(this, inflater, parent);
        viewM202672b.getClass();
        return viewM202672b;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VImage m198000T() {
        VImage vImage = this._back_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_back_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VText m198001U() {
        VText vText = this._count_position_center;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_count_position_center");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VText m198002V() {
        VText vText = this._count_position_left;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_count_position_left");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m198003W() {
        VText vText = this._count_position_right;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_count_position_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final TextView m198004X() {
        TextView textView = this._hint_unit_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_hint_unit_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VEditText m198005Y() {
        VEditText vEditText = this._input_number;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.m88391r("_input_number");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final View m198006Z() {
        View view = this._point_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_point_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VImage m198007a0() {
        VImage vImage = this._question_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_question_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final ConstraintLayout m198008b0() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final TextView m198009c0() {
        TextView textView = this._root_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_root_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final View m198010d0() {
        View view = this._round_point;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_round_point");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VLinear m198011e0() {
        VLinear vLinear = this._ruler_linear;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_ruler_linear");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VText m198012f0() {
        VText vText = this._rules_text_one;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_rules_text_one");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VText m198013g0() {
        VText vText = this._rules_text_three;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_rules_text_three");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m198014h0() {
        VText vText = this._rules_text_two;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_rules_text_two");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final TextView m198015i0() {
        TextView textView = this._set_count_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_set_count_title");
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        if (inflater != null) {
            return m197999Q(inflater, parent);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final View m198016j0() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final TextView m198017k0() {
        TextView textView = this._submit_bt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_submit_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final FrameLayout m198018l0() {
        FrameLayout frameLayout = this._switch_open;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_switch_open");
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@Nullable View view) {
        super.mo73019m(view);
        if (view != null) {
            m197998P(view);
        }
        m198024r();
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final VText m198019m0() {
        VText vText = this._switch_sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_switch_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final TextView m198020n0() {
        TextView textView = this._switch_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_switch_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final TextView m198021o0() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m198022p0() {
        m198005Y().clearFocus();
        this.f48608e.hideInput(m198005Y());
    }

    /* JADX INFO: renamed from: q0 */
    public final void m198023q0(boolean isOpen) {
        ObjectAnimator objectAnimatorOfFloat = isOpen ? ObjectAnimator.ofFloat(m198010d0(), (Property<View, Float>) View.TRANSLATION_X, 0.0f, qa00.m175859d(16.0f)) : ObjectAnimator.ofFloat(m198010d0(), (Property<View, Float>) View.TRANSLATION_X, qa00.m175859d(16.0f), 0.0f);
        objectAnimatorOfFloat.getClass();
        this.animator = objectAnimatorOfFloat;
        ObjectAnimator objectAnimator = null;
        if (objectAnimatorOfFloat == null) {
            Intrinsics.m88391r("animator");
            objectAnimatorOfFloat = null;
        }
        objectAnimatorOfFloat.addListener(new C20665c(isOpen));
        ObjectAnimator objectAnimator2 = this.animator;
        if (objectAnimator2 == null) {
            Intrinsics.m88391r("animator");
        } else {
            objectAnimator = objectAnimator2;
        }
        objectAnimator.start();
    }

    /* JADX INFO: renamed from: r */
    public final void m198024r() {
        bnl0.m105509E0(m198016j0(), new View.OnClickListener() { // from class: l.kte0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ute0.m197987H(this.f128681a, view);
            }
        });
        bnl0.m105509E0(m198007a0(), new View.OnClickListener() { // from class: l.lte0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ute0.m197993N(this.f133541a, view);
            }
        });
        bnl0.m105509E0(m198000T(), new View.OnClickListener() { // from class: l.mte0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ute0.m197986G(this.f138603a, view);
            }
        });
        bnl0.m105509E0(m198002V(), new View.OnClickListener() { // from class: l.nte0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ute0.m197988I(this.f143599a, view);
            }
        });
        bnl0.m105509E0(m198003W(), new View.OnClickListener() { // from class: l.ote0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ute0.m197994O(this.f148952a, view);
            }
        });
        bnl0.m105509E0(m198001U(), new View.OnClickListener() { // from class: l.pte0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ute0.m197985F(this.f154039a, view);
            }
        });
        bnl0.m105509E0(m198017k0(), new View.OnClickListener() { // from class: l.qte0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ute0.m197992M(this.f159442a, view);
            }
        });
        bnl0.m105509E0(m198018l0(), new View.OnClickListener() { // from class: l.rte0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ute0.m197989J(this.f164810a, view);
            }
        });
        bnl0.m105509E0(m198005Y(), new View.OnClickListener() { // from class: l.ste0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ute0.m197990K(this.f170563a, view);
            }
        });
        m198005Y().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.tte0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ute0.m197991L(this.f176070a, view, z);
            }
        });
        m198005Y().addTextChangedListener(new C20664b());
    }

    /* JADX INFO: renamed from: r0 */
    public final void m198025r0(@NotNull BLiveDailyPayment data) {
        data.getClass();
        this.data = data;
        this.selectedType = -1;
        m73017E();
        m198026s0();
        m198029v0(false);
        m197997x0(data.isDailyLimitOn);
        VEditText vEditTextM198005Y = m198005Y();
        Editable.Factory factory = Editable.Factory.getInstance();
        int i = data.dailyAmount;
        vEditTextM198005Y.setText(factory.newEditable((i <= 0 || !data.isDailyLimitOn) ? "" : String.valueOf(i)));
        if (!jyb.m147479J(data.defaultAmounts) && data.defaultAmounts.size() >= 3) {
            VText vTextM198002V = m198002V();
            Integer num = data.defaultAmounts.get(0);
            num.getClass();
            vTextM198002V.setText(m198031y0(num.intValue()));
            VText vTextM198001U = m198001U();
            Integer num2 = data.defaultAmounts.get(1);
            num2.getClass();
            vTextM198001U.setText(m198031y0(num2.intValue()));
            VText vTextM198003W = m198003W();
            Integer num3 = data.defaultAmounts.get(2);
            num3.getClass();
            vTextM198003W.setText(m198031y0(num3.intValue()));
        }
        mtf0.m159988c(m198008b0(), new C20666d());
    }

    /* JADX INFO: renamed from: s0 */
    public final void m198026s0() {
        m198005Y().setSelected(false);
        m198002V().setSelected(false);
        m198001U().setSelected(false);
        m198003W().setSelected(false);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m198027t0(int selectedType) {
        this.selectedType = selectedType;
        m198026s0();
        if (selectedType == 0) {
            m198002V().setSelected(true);
            m198022p0();
        } else if (selectedType == 1) {
            m198001U().setSelected(true);
            m198022p0();
        } else if (selectedType != 2) {
            m198005Y().requestFocus();
            m198005Y().setSelected(true);
        } else {
            m198003W().setSelected(true);
            m198022p0();
        }
        m198032z0();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m198028u0(boolean isShowKeyBoard) {
        this.keyBoardIsShow = isShowKeyBoard;
        bnl0.m105524M(m198020n0(), !isShowKeyBoard);
        bnl0.m105524M(m198019m0(), !isShowKeyBoard);
        bnl0.m105524M(m198018l0(), !isShowKeyBoard);
        bnl0.m105524M(m198015i0(), !isShowKeyBoard);
        bnl0.m105524M(m198002V(), !isShowKeyBoard);
        bnl0.m105524M(m198001U(), !isShowKeyBoard);
        bnl0.m105524M(m198003W(), !isShowKeyBoard);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m198029v0(boolean isShowRules) {
        bnl0.m105524M(m198007a0(), !isShowRules);
        bnl0.m105524M(m198000T(), isShowRules);
        bnl0.m105524M(m198011e0(), isShowRules);
        bnl0.m105524M(m198012f0(), isShowRules);
        bnl0.m105524M(m198014h0(), isShowRules);
        bnl0.m105524M(m198013g0(), isShowRules);
        m198021o0().setText(isShowRules ? xau.m209910t(R$string.f48513z2) : xau.m209910t(R$string.f47429B2));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        if (!this.switchIsOpen) {
            ((v06) this.f48605b).m198890a4(false, 0);
        }
        super.mo73024w();
        ObjectAnimator objectAnimator = this.animator;
        ObjectAnimator objectAnimator2 = null;
        if (objectAnimator == null) {
            Intrinsics.m88391r("animator");
            objectAnimator = null;
        }
        if (objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator3 = this.animator;
            if (objectAnimator3 == null) {
                Intrinsics.m88391r("animator");
            } else {
                objectAnimator2 = objectAnimator3;
            }
            objectAnimator2.cancel();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m198030w0() {
        Integer numValueOf;
        if (this.selectedType != -1) {
            BLiveDailyPayment bLiveDailyPayment = this.data;
            BLiveDailyPayment bLiveDailyPayment2 = null;
            if (bLiveDailyPayment == null) {
                Intrinsics.m88391r("data");
                bLiveDailyPayment = null;
            }
            if (jyb.m147479J(bLiveDailyPayment.defaultAmounts)) {
                return;
            }
            BLiveDailyPayment bLiveDailyPayment3 = this.data;
            if (bLiveDailyPayment3 == null) {
                Intrinsics.m88391r("data");
                bLiveDailyPayment3 = null;
            }
            if (bLiveDailyPayment3.defaultAmounts.size() < 3) {
                return;
            }
            int i = this.selectedType;
            if (i == 0) {
                BLiveDailyPayment bLiveDailyPayment4 = this.data;
                if (bLiveDailyPayment4 == null) {
                    Intrinsics.m88391r("data");
                } else {
                    bLiveDailyPayment2 = bLiveDailyPayment4;
                }
                numValueOf = bLiveDailyPayment2.defaultAmounts.get(0);
            } else if (i == 1) {
                BLiveDailyPayment bLiveDailyPayment5 = this.data;
                if (bLiveDailyPayment5 == null) {
                    Intrinsics.m88391r("data");
                } else {
                    bLiveDailyPayment2 = bLiveDailyPayment5;
                }
                numValueOf = bLiveDailyPayment2.defaultAmounts.get(1);
            } else if (i != 2) {
                numValueOf = Integer.valueOf(TextUtils.isEmpty(m198005Y().getText().toString()) ? "0" : m198005Y().getText().toString());
            } else {
                BLiveDailyPayment bLiveDailyPayment6 = this.data;
                if (bLiveDailyPayment6 == null) {
                    Intrinsics.m88391r("data");
                } else {
                    bLiveDailyPayment2 = bLiveDailyPayment6;
                }
                numValueOf = bLiveDailyPayment2.defaultAmounts.get(2);
            }
            if (numValueOf != null && numValueOf.intValue() == 0) {
                o1j0.m165651y(n3d0.m161280d(R$string.f48491y2));
                return;
            }
            if (this.switchIsOpen) {
                v06 v06Var = (v06) this.f48605b;
                numValueOf.getClass();
                v06Var.m198890a4(true, numValueOf.intValue());
            }
            mo73021p();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final String m198031y0(int number) {
        if (number > 10000) {
            String strM209911u = xau.m209911u(R$string.f48469x2, String.valueOf(number / 10000));
            strM209911u.getClass();
            return strM209911u;
        }
        String strM209911u2 = xau.m209911u(R$string.f48447w2, String.valueOf(number));
        strM209911u2.getClass();
        return strM209911u2;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m198032z0() {
        if ((this.selectedType == 3 && TextUtils.isEmpty(m198005Y().getText())) || this.selectedType == -1) {
            m198017k0().setEnabled(false);
        } else {
            m198017k0().setEnabled(true);
        }
    }
}
