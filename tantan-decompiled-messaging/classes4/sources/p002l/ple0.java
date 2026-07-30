package p002l;

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
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveDailyPayment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.dlf0;
import l.kvc0;
import l.lsi0;
import l.t100;
import l.vwb;
import l.w8u;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VEditText;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ¸\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002¹\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0014J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u0014J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010\u001cJ\u001f\u0010(\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\u0004\u0018\u00010\n2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b*\u0010)J\u0019\u0010+\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b+\u0010\u000eJ\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u0014J\u0015\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\fH\u0014¢\u0006\u0004\b1\u0010\u0014R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010?\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u000eR\"\u0010B\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010;\u001a\u0004\b@\u0010=\"\u0004\bA\u0010\u000eR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010M\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR\"\u0010Z\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010;\u001a\u0004\bX\u0010=\"\u0004\bY\u0010\u000eR\"\u0010]\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010E\u001a\u0004\b[\u0010G\"\u0004\b\\\u0010IR\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010q\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010;\u001a\u0004\bo\u0010=\"\u0004\bp\u0010\u000eR\"\u0010u\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010;\u001a\u0004\bs\u0010=\"\u0004\bt\u0010\u000eR\"\u0010x\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010E\u001a\u0004\bv\u0010G\"\u0004\bw\u0010IR\"\u0010|\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010`\u001a\u0004\bz\u0010b\"\u0004\b{\u0010dR#\u0010\u0080\u0001\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010`\u001a\u0004\b~\u0010b\"\u0004\b\u007f\u0010dR&\u0010\u0084\u0001\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010`\u001a\u0005\b\u0082\u0001\u0010b\"\u0005\b\u0083\u0001\u0010dR*\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R&\u0010\u0090\u0001\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010E\u001a\u0005\b\u008e\u0001\u0010G\"\u0005\b\u008f\u0001\u0010IR&\u0010\u0094\u0001\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010E\u001a\u0005\b\u0092\u0001\u0010G\"\u0005\b\u0093\u0001\u0010IR&\u0010\u0098\u0001\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010E\u001a\u0005\b\u0096\u0001\u0010G\"\u0005\b\u0097\u0001\u0010IR*\u0010 \u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R&\u0010¤\u0001\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¡\u0001\u0010`\u001a\u0005\b¢\u0001\u0010b\"\u0005\b£\u0001\u0010dR&\u0010¨\u0001\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¥\u0001\u0010`\u001a\u0005\b¦\u0001\u0010b\"\u0005\b§\u0001\u0010dR&\u0010¬\u0001\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b©\u0001\u0010`\u001a\u0005\bª\u0001\u0010b\"\u0005\b«\u0001\u0010dR\u0018\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u00ad\u0001R\u0018\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010±\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0001\u0010oR\u0018\u0010³\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010oR\u001a\u0010·\u0001\u001a\u00030´\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001¨\u0006º\u0001"}, d2 = {"Ll/ple0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/qz5;", "", "layoutRes", "Lcom/p1/mobile/android/app/Act;", "act", "presenter", "<init>", "(ILcom/p1/mobile/android/app/Act;Ll/qz5;)V", "Landroid/view/View;", "view", "", "P", "(Landroid/view/View;)V", "number", "", "y0", "(I)Ljava/lang/String;", "w0", "()V", "selectedType", "t0", "(I)V", "z0", "", "isShowRules", "v0", "(Z)V", "isShowKeyBoard", "u0", "isOpen", "x0", "s0", "p0", "q0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Q", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "m", "r", "Lcom/p1/mobile/putong/live/base/data/BLiveDailyPayment;", "data", "r0", "(Lcom/p1/mobile/putong/live/base/data/BLiveDailyPayment;)V", "w", "Landroidx/constraintlayout/widget/ConstraintLayout;", "k", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b0", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "l", "Landroid/view/View;", "j0", "()Landroid/view/View;", "set_shadow", "_shadow", "get_bg", "set_bg", "_bg", "Landroid/widget/TextView;", "n", "Landroid/widget/TextView;", "o0", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VImage;", "o", "Lv/VImage;", "T", "()Lv/VImage;", "set_back_icon", "(Lv/VImage;)V", "_back_icon", "p", "a0", "set_question_icon", "_question_icon", "q", "get_line", "set_line", "_line", "n0", "set_switch_title", "_switch_title", "Lv/VText;", "s", "Lv/VText;", "m0", "()Lv/VText;", "set_switch_sub_title", "(Lv/VText;)V", "_switch_sub_title", "Landroid/widget/FrameLayout;", "t", "Landroid/widget/FrameLayout;", "l0", "()Landroid/widget/FrameLayout;", "set_switch_open", "(Landroid/widget/FrameLayout;)V", "_switch_open", "u", "Z", "set_point_bg", "_point_bg", "v", "d0", "set_round_point", "_round_point", "i0", "set_set_count_title", "_set_count_title", "x", "V", "set_count_position_left", "_count_position_left", "y", "U", "set_count_position_center", "_count_position_center", "z", "W", "set_count_position_right", "_count_position_right", "Lv/VEditText;", "A", "Lv/VEditText;", "Y", "()Lv/VEditText;", "set_input_number", "(Lv/VEditText;)V", "_input_number", "B", "X", "set_hint_unit_text", "_hint_unit_text", "C", "k0", "set_submit_bt", "_submit_bt", "D", "c0", "set_root_text", "_root_text", "Lv/VLinear;", "E", "Lv/VLinear;", "e0", "()Lv/VLinear;", "set_ruler_linear", "(Lv/VLinear;)V", "_ruler_linear", "F", "f0", "set_rules_text_one", "_rules_text_one", "G", "h0", "set_rules_text_two", "_rules_text_two", "H", "g0", "set_rules_text_three", "_rules_text_three", "I", "J", "Lcom/p1/mobile/putong/live/base/data/BLiveDailyPayment;", "K", "keyBoardIsShow", "L", "switchIsOpen", "Landroid/animation/ObjectAnimator;", "M", "Landroid/animation/ObjectAnimator;", "animator", "Companion", "a", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class ple0 extends LiveMenuDialogHolder<qz5> {

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

    /* JADX INFO: renamed from: l.ple0$b */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"l/ple0$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0753b implements TextWatcher {
        public C0753b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            s.getClass();
            ple0.this.m20458k0().setEnabled((TextUtils.isEmpty(s) || ple0.this.selectedType == -1) ? false : true);
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

    /* JADX INFO: renamed from: l.ple0$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\u000b¸\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$1", "core-ktx_release"}, k = 1, mv = {2, 2, 0})
    @SourceDebugExtension
    public static final class C0754c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f17524b;

        public C0754c(boolean z) {
            this.f17524b = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            animator.getClass();
            ple0.this.m20447Z().setBackground(kvc0.b(this.f17524b ? i3c0.f12838j7 : i3c0.f12826i7));
            ple0.this.m20451d0().setBackground(kvc0.b(this.f17524b ? i3c0.f12862l7 : i3c0.f12850k7));
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

    /* JADX INFO: renamed from: l.ple0$d */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"l/ple0$d", "Ll/dlf0$a;", "", "height", "", "b", "(I)V", "a", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0755d implements dlf0.a {
        public C0755d() {
        }

        /* JADX INFO: renamed from: a */
        public void m20474a(int height) {
            ple0.this.m20469u0(false);
        }

        /* JADX INFO: renamed from: b */
        public void m20475b(int height) {
            ple0.this.m20469u0(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ple0(int i, @Nullable Act act, @NotNull qz5 qz5Var) {
        super(i, act, qz5Var);
        qz5Var.getClass();
        this.selectedType = -1;
    }

    /* JADX INFO: renamed from: F */
    public static void m20426F(ple0 ple0Var, View view) {
        ple0Var.m20468t0(1);
    }

    /* JADX INFO: renamed from: G */
    public static void m20427G(ple0 ple0Var, View view) {
        ple0Var.m20470v0(false);
    }

    /* JADX INFO: renamed from: H */
    public static void m20428H(ple0 ple0Var, View view) {
        if (ple0Var.keyBoardIsShow) {
            ple0Var.m20463p0();
        } else {
            ple0Var.mo5216p();
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m20429I(ple0 ple0Var, View view) {
        ple0Var.m20468t0(0);
    }

    /* JADX INFO: renamed from: J */
    public static void m20430J(ple0 ple0Var, View view) {
        ple0Var.m20438x0(!ple0Var.switchIsOpen);
    }

    /* JADX INFO: renamed from: K */
    public static void m20431K(ple0 ple0Var, View view) {
        ple0Var.m20468t0(3);
        ple0Var.m20473z0();
    }

    /* JADX INFO: renamed from: L */
    public static void m20432L(ple0 ple0Var, View view, boolean z) {
        if (z) {
            ple0Var.m20468t0(3);
            ple0Var.m20473z0();
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m20433M(ple0 ple0Var, View view) {
        ple0Var.m20471w0();
    }

    /* JADX INFO: renamed from: N */
    public static void m20434N(ple0 ple0Var, View view) {
        if (ple0Var.keyBoardIsShow) {
            ple0Var.m20463p0();
        } else {
            ple0Var.m20470v0(true);
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m20435O(ple0 ple0Var, View view) {
        ple0Var.m20468t0(2);
    }

    /* JADX INFO: renamed from: x0 */
    private final void m20438x0(boolean isOpen) {
        this.switchIsOpen = isOpen;
        m20464q0(isOpen);
        xdl0.M(m20445X(), isOpen);
        xdl0.M(m20456i0(), isOpen);
        xdl0.M(m20446Y(), isOpen);
        xdl0.M(m20443V(), isOpen);
        xdl0.M(m20442U(), isOpen);
        xdl0.M(m20444W(), isOpen);
        xdl0.M(m20458k0(), isOpen);
        xdl0.M(m20450c0(), isOpen);
    }

    /* JADX INFO: renamed from: P */
    public final void m20439P(View view) {
        qle0.m21477a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final View m20440Q(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM21478b = qle0.m21478b(this, inflater, parent);
        viewM21478b.getClass();
        return viewM21478b;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VImage m20441T() {
        VImage vImage = this._back_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_back_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VText m20442U() {
        VText vText = this._count_position_center;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_count_position_center");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VText m20443V() {
        VText vText = this._count_position_left;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_count_position_left");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m20444W() {
        VText vText = this._count_position_right;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_count_position_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final TextView m20445X() {
        TextView textView = this._hint_unit_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_hint_unit_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VEditText m20446Y() {
        VEditText vEditText = this._input_number;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.r("_input_number");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final View m20447Z() {
        View view = this._point_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_point_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VImage m20448a0() {
        VImage vImage = this._question_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_question_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final ConstraintLayout m20449b0() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final TextView m20450c0() {
        TextView textView = this._root_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_root_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final View m20451d0() {
        View view = this._round_point;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_round_point");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VLinear m20452e0() {
        VLinear vLinear = this._ruler_linear;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_ruler_linear");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VText m20453f0() {
        VText vText = this._rules_text_one;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_rules_text_one");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VText m20454g0() {
        VText vText = this._rules_text_three;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_rules_text_three");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m20455h0() {
        VText vText = this._rules_text_two;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_rules_text_two");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final TextView m20456i0() {
        TextView textView = this._set_count_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_set_count_title");
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        if (inflater != null) {
            return m20440Q(inflater, parent);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final View m20457j0() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final TextView m20458k0() {
        TextView textView = this._submit_bt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_submit_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final FrameLayout m20459l0() {
        FrameLayout frameLayout = this._switch_open;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_switch_open");
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(@Nullable View view) {
        super.mo5214m(view);
        if (view != null) {
            m20439P(view);
        }
        m20465r();
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final VText m20460m0() {
        VText vText = this._switch_sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_switch_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final TextView m20461n0() {
        TextView textView = this._switch_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_switch_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final TextView m20462o0() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m20463p0() {
        m20446Y().clearFocus();
        this.f3802e.hideInput(m20446Y());
    }

    /* JADX INFO: renamed from: q0 */
    public final void m20464q0(boolean isOpen) {
        ObjectAnimator objectAnimatorOfFloat = isOpen ? ObjectAnimator.ofFloat(m20451d0(), (Property<View, Float>) View.TRANSLATION_X, 0.0f, t100.d(16.0f)) : ObjectAnimator.ofFloat(m20451d0(), (Property<View, Float>) View.TRANSLATION_X, t100.d(16.0f), 0.0f);
        objectAnimatorOfFloat.getClass();
        this.animator = objectAnimatorOfFloat;
        ObjectAnimator objectAnimator = null;
        if (objectAnimatorOfFloat == null) {
            Intrinsics.r("animator");
            objectAnimatorOfFloat = null;
        }
        objectAnimatorOfFloat.addListener(new C0754c(isOpen));
        ObjectAnimator objectAnimator2 = this.animator;
        if (objectAnimator2 == null) {
            Intrinsics.r("animator");
        } else {
            objectAnimator = objectAnimator2;
        }
        objectAnimator.start();
    }

    /* JADX INFO: renamed from: r */
    public final void m20465r() {
        xdl0.E0(m20457j0(), new View.OnClickListener() { // from class: l.fle0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ple0.m20428H(this.f10458a, view);
            }
        });
        xdl0.E0(m20448a0(), new View.OnClickListener() { // from class: l.gle0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ple0.m20434N(this.f11494a, view);
            }
        });
        xdl0.E0(m20441T(), new View.OnClickListener() { // from class: l.hle0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ple0.m20427G(this.f12106a, view);
            }
        });
        xdl0.E0(m20443V(), new View.OnClickListener() { // from class: l.ile0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ple0.m20429I(this.f13298a, view);
            }
        });
        xdl0.E0(m20444W(), new View.OnClickListener() { // from class: l.jle0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ple0.m20435O(this.f13866a, view);
            }
        });
        xdl0.E0(m20442U(), new View.OnClickListener() { // from class: l.kle0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ple0.m20426F(this.f14374a, view);
            }
        });
        xdl0.E0(m20458k0(), new View.OnClickListener() { // from class: l.lle0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ple0.m20433M(this.f14946a, view);
            }
        });
        xdl0.E0(m20459l0(), new View.OnClickListener() { // from class: l.mle0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ple0.m20430J(this.f15441a, view);
            }
        });
        xdl0.E0(m20446Y(), new View.OnClickListener() { // from class: l.nle0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ple0.m20431K(this.f16097a, view);
            }
        });
        m20446Y().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.ole0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ple0.m20432L(this.f16692a, view, z);
            }
        });
        m20446Y().addTextChangedListener(new C0753b());
    }

    /* JADX INFO: renamed from: r0 */
    public final void m20466r0(@NotNull BLiveDailyPayment data) {
        data.getClass();
        this.data = data;
        this.selectedType = -1;
        m5211E();
        m20467s0();
        m20470v0(false);
        m20438x0(data.isDailyLimitOn);
        VEditText vEditTextM20446Y = m20446Y();
        Editable.Factory factory = Editable.Factory.getInstance();
        int i = data.dailyAmount;
        vEditTextM20446Y.setText(factory.newEditable((i <= 0 || !data.isDailyLimitOn) ? "" : String.valueOf(i)));
        if (!vwb.J(data.defaultAmounts) && data.defaultAmounts.size() >= 3) {
            VText vTextM20443V = m20443V();
            Object obj = data.defaultAmounts.get(0);
            obj.getClass();
            vTextM20443V.setText(m20472y0(((Number) obj).intValue()));
            VText vTextM20442U = m20442U();
            Object obj2 = data.defaultAmounts.get(1);
            obj2.getClass();
            vTextM20442U.setText(m20472y0(((Number) obj2).intValue()));
            VText vTextM20444W = m20444W();
            Object obj3 = data.defaultAmounts.get(2);
            obj3.getClass();
            vTextM20444W.setText(m20472y0(((Number) obj3).intValue()));
        }
        dlf0.c(m20449b0(), new C0755d());
    }

    /* JADX INFO: renamed from: s0 */
    public final void m20467s0() {
        m20446Y().setSelected(false);
        m20443V().setSelected(false);
        m20442U().setSelected(false);
        m20444W().setSelected(false);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m20468t0(int selectedType) {
        this.selectedType = selectedType;
        m20467s0();
        if (selectedType == 0) {
            m20443V().setSelected(true);
            m20463p0();
        } else if (selectedType == 1) {
            m20442U().setSelected(true);
            m20463p0();
        } else if (selectedType != 2) {
            m20446Y().requestFocus();
            m20446Y().setSelected(true);
        } else {
            m20444W().setSelected(true);
            m20463p0();
        }
        m20473z0();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m20469u0(boolean isShowKeyBoard) {
        this.keyBoardIsShow = isShowKeyBoard;
        xdl0.M(m20461n0(), !isShowKeyBoard);
        xdl0.M(m20460m0(), !isShowKeyBoard);
        xdl0.M(m20459l0(), !isShowKeyBoard);
        xdl0.M(m20456i0(), !isShowKeyBoard);
        xdl0.M(m20443V(), !isShowKeyBoard);
        xdl0.M(m20442U(), !isShowKeyBoard);
        xdl0.M(m20444W(), !isShowKeyBoard);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m20470v0(boolean isShowRules) {
        xdl0.M(m20448a0(), !isShowRules);
        xdl0.M(m20441T(), isShowRules);
        xdl0.M(m20452e0(), isShowRules);
        xdl0.M(m20453f0(), isShowRules);
        xdl0.M(m20455h0(), isShowRules);
        xdl0.M(m20454g0(), isShowRules);
        m20462o0().setText(isShowRules ? w8u.t(R$string.f3707z2) : w8u.t(R$string.f2623B2));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo5219w() {
        if (!this.switchIsOpen) {
            ((qz5) this.f3799b).m21634a4(false, 0);
        }
        super.mo5219w();
        ObjectAnimator objectAnimator = this.animator;
        ObjectAnimator objectAnimator2 = null;
        if (objectAnimator == null) {
            Intrinsics.r("animator");
            objectAnimator = null;
        }
        if (objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator3 = this.animator;
            if (objectAnimator3 == null) {
                Intrinsics.r("animator");
            } else {
                objectAnimator2 = objectAnimator3;
            }
            objectAnimator2.cancel();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m20471w0() {
        Integer numValueOf;
        if (this.selectedType != -1) {
            BLiveDailyPayment bLiveDailyPayment = this.data;
            BLiveDailyPayment bLiveDailyPayment2 = null;
            if (bLiveDailyPayment == null) {
                Intrinsics.r("data");
                bLiveDailyPayment = null;
            }
            if (vwb.J(bLiveDailyPayment.defaultAmounts)) {
                return;
            }
            BLiveDailyPayment bLiveDailyPayment3 = this.data;
            if (bLiveDailyPayment3 == null) {
                Intrinsics.r("data");
                bLiveDailyPayment3 = null;
            }
            if (bLiveDailyPayment3.defaultAmounts.size() < 3) {
                return;
            }
            int i = this.selectedType;
            if (i == 0) {
                BLiveDailyPayment bLiveDailyPayment4 = this.data;
                if (bLiveDailyPayment4 == null) {
                    Intrinsics.r("data");
                } else {
                    bLiveDailyPayment2 = bLiveDailyPayment4;
                }
                numValueOf = (Integer) bLiveDailyPayment2.defaultAmounts.get(0);
            } else if (i == 1) {
                BLiveDailyPayment bLiveDailyPayment5 = this.data;
                if (bLiveDailyPayment5 == null) {
                    Intrinsics.r("data");
                } else {
                    bLiveDailyPayment2 = bLiveDailyPayment5;
                }
                numValueOf = (Integer) bLiveDailyPayment2.defaultAmounts.get(1);
            } else if (i != 2) {
                numValueOf = Integer.valueOf(TextUtils.isEmpty(m20446Y().getText().toString()) ? "0" : m20446Y().getText().toString());
            } else {
                BLiveDailyPayment bLiveDailyPayment6 = this.data;
                if (bLiveDailyPayment6 == null) {
                    Intrinsics.r("data");
                } else {
                    bLiveDailyPayment2 = bLiveDailyPayment6;
                }
                numValueOf = (Integer) bLiveDailyPayment2.defaultAmounts.get(2);
            }
            if (numValueOf != null && numValueOf.intValue() == 0) {
                lsi0.y(kvc0.d(R$string.f3685y2));
                return;
            }
            if (this.switchIsOpen) {
                qz5 qz5Var = (qz5) this.f3799b;
                numValueOf.getClass();
                qz5Var.m21634a4(true, numValueOf.intValue());
            }
            mo5216p();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final String m20472y0(int number) {
        if (number > 10000) {
            String strU = w8u.u(R$string.f3663x2, String.valueOf(number / 10000));
            strU.getClass();
            return strU;
        }
        String strU2 = w8u.u(R$string.f3641w2, String.valueOf(number));
        strU2.getClass();
        return strU2;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m20473z0() {
        if ((this.selectedType == 3 && TextUtils.isEmpty(m20446Y().getText())) || this.selectedType == -1) {
            m20458k0().setEnabled(false);
        } else {
            m20458k0().setEnabled(true);
        }
    }
}
