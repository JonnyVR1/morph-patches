package com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceEditNoticeDialog;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VEditText;
import p147v.VFrame;
import p149l.byr;
import p149l.c4n0;
import p149l.f30;
import p149l.h1c0;
import p149l.i3c0;
import p149l.kvc0;
import p149l.nnn0;
import p149l.osi0;
import p149l.s7m;
import p149l.x3n0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u0012J\u001d\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0014¢\u0006\u0004\b%\u0010\u0017J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b&\u0010\u0017J\r\u0010'\u001a\u00020\u000e¢\u0006\u0004\b'\u0010\u0012J\u0019\u0010)\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b.\u0010\u0012J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u0014¢\u0006\u0004\b3\u0010\u0017J\u0015\u00104\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0014¢\u0006\u0004\b4\u0010\u0017R\"\u0010;\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010A\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0010R\"\u0010E\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?\"\u0004\bD\u0010\u0010R\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010X\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010P\u001a\u0004\bV\u0010R\"\u0004\bW\u0010TR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010l\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010P\u001a\u0004\bj\u0010R\"\u0004\bk\u0010TR\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u00102\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010v\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010t¨\u0006w"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceEditNoticeDialog;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ll/s7m;", "Ll/c4n0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "m0", "(Landroid/view/View;)V", "r", "()V", "u0", "", "text", "setCompleteBtnStyle", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "n0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "onFinishInflate", "", "show", RXScreenCaptureService.KEY_INDEX, "t0", "(ZI)V", "currentNotice", "v0", "setCheckSuccessToCache", "r0", "presenter", "p0", "(Ll/c4n0;)V", "", "s0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ljava/lang/Void;", "destroy", "Lcom/p1/mobile/android/app/Act;", "q0", "()Lcom/p1/mobile/android/app/Act;", "announcementStatus", "setConfirmBtnStatus", "w0", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceEditNoticeDialog;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceEditNoticeDialog;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceEditNoticeDialog;)V", "_root", "e", "Landroid/view/View;", "get_empty", "()Landroid/view/View;", "set_empty", "_empty", "f", "get_empty_anchor", "set_empty_anchor", "_empty_anchor", "Landroid/widget/RelativeLayout;", "g", "Landroid/widget/RelativeLayout;", "get_container", "()Landroid/widget/RelativeLayout;", "set_container", "(Landroid/widget/RelativeLayout;)V", "_container", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "get_can_input_num", "set_can_input_num", "_can_input_num", "Lv/VFrame;", "j", "Lv/VFrame;", "get_edit_layout", "()Lv/VFrame;", "set_edit_layout", "(Lv/VFrame;)V", "_edit_layout", "Lv/VEditText;", "k", "Lv/VEditText;", "get_input_notice_text", "()Lv/VEditText;", "set_input_notice_text", "(Lv/VEditText;)V", "_input_notice_text", BLiveStormDanmakuGiftResourceType.f44444l, "get_complete_update", "set_complete_update", "_complete_update", "m", "Ll/c4n0;", "Ll/byr;", "n", "Ll/byr;", OMSTemplateType.dialog, "o", "Ljava/lang/String;", "p", "lastInputText", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class VoiceEditNoticeDialog extends ConstraintLayout implements s7m<c4n0> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VoiceEditNoticeDialog _root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _empty;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public View _empty_anchor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public RelativeLayout _container;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public TextView _can_input_num;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VFrame _edit_layout;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VEditText _input_notice_text;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public TextView _complete_update;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public c4n0 presenter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public byr dialog;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public String announcementStatus;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public String lastInputText;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceEditNoticeDialog$a */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceEditNoticeDialog$a", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f44446s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12989a implements TextWatcher {
        public C12989a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            s.getClass();
            if (s.length() <= 0 || s.length() <= 1000) {
                return;
            }
            osi0.m165782f(R$string.f46576Aj);
            VoiceEditNoticeDialog.this.get_input_notice_text().setText(s.subSequence(0, 1000).toString());
            VoiceEditNoticeDialog.this.get_input_notice_text().setSelection(VoiceEditNoticeDialog.this.get_input_notice_text().getText().length());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            s.getClass();
            VoiceEditNoticeDialog.this.setCompleteBtnStyle(s.toString());
            VoiceEditNoticeDialog.this.get_can_input_num().setText(String.valueOf(1000 - s.length()));
        }
    }

    public /* synthetic */ VoiceEditNoticeDialog(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m77701h0(View view) {
        osi0.m165783g("审核中不可以修改");
    }

    /* JADX INFO: renamed from: i0 */
    public static void m77702i0(VoiceEditNoticeDialog voiceEditNoticeDialog, Boolean bool, Integer num) {
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        num.getClass();
        voiceEditNoticeDialog.m77715t0(zBooleanValue, num.intValue());
    }

    /* JADX INFO: renamed from: j0 */
    public static void m77703j0(VoiceEditNoticeDialog voiceEditNoticeDialog, View view) {
        String str = voiceEditNoticeDialog.lastInputText;
        Editable text = voiceEditNoticeDialog.get_input_notice_text().getText();
        text.getClass();
        if (str.contentEquals(text)) {
            voiceEditNoticeDialog.m77713r0();
            return;
        }
        voiceEditNoticeDialog.lastInputText = voiceEditNoticeDialog.get_input_notice_text().getText().toString();
        c4n0 c4n0Var = voiceEditNoticeDialog.presenter;
        if (c4n0Var != null) {
            c4n0Var.m105230O3(voiceEditNoticeDialog.get_input_notice_text().getText().toString());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m77704k0(VoiceEditNoticeDialog voiceEditNoticeDialog, View view) {
        voiceEditNoticeDialog.get_input_notice_text().requestFocus();
    }

    /* JADX INFO: renamed from: l0 */
    public static void m77705l0(VoiceEditNoticeDialog voiceEditNoticeDialog, View view) {
        voiceEditNoticeDialog.m77713r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private final void m77707r() {
        nnn0 nnn0Var;
        if (this.dialog == null) {
            c4n0 c4n0Var = this.presenter;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            layoutInflaterFrom.getClass();
            this.dialog = new byr(c4n0Var, m77710n0(layoutInflaterFrom, null));
            m77708u0();
        }
        get_input_notice_text().setText(this.lastInputText);
        get_input_notice_text().setSelection(get_input_notice_text().getText().length());
        c4n0 c4n0Var2 = this.presenter;
        if (c4n0Var2 != null && (nnn0Var = (nnn0) c4n0Var2.m206027E2()) != null && nnn0Var.m160271i3()) {
            get_input_notice_text().setHint("介绍本群规则和玩法，让更多人参与进来");
        }
        get_can_input_num().setText(String.valueOf(1000 - this.lastInputText.length()));
        setCompleteBtnStyle(this.lastInputText);
        TextView textView = get_title();
        textView.setTextColor(kvc0.m147352a(h1c0.f105395p1));
        textView.getPaint().setFakeBoldText(true);
        TextView textView2 = get_can_input_num();
        textView2.setTextColor(kvc0.m147352a(h1c0.f105377j1));
        textView2.getPaint().setFakeBoldText(true);
        get_input_notice_text().setTextColor(kvc0.m147352a(h1c0.f105395p1));
        get_input_notice_text().setHintTextColor(kvc0.m147352a(h1c0.f105377j1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCompleteBtnStyle(String text) {
        if (TextUtils.isEmpty(text)) {
            get_complete_update().setBackgroundResource(i3c0.f111030h8);
            get_complete_update().setTextColor(kvc0.m147352a(h1c0.f105377j1));
            get_complete_update().setClickable(false);
        } else {
            get_complete_update().setTextColor(kvc0.m147352a(h1c0.f105362e1));
            get_complete_update().setBackgroundResource(i3c0.f111018g8);
            get_complete_update().setClickable(true);
        }
    }

    /* JADX INFO: renamed from: u0 */
    private final void m77708u0() {
        Act act;
        xdl0.m208329E0(get_empty(), new View.OnClickListener() { // from class: l.t3n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceEditNoticeDialog.m77705l0(this.f167647a, view);
            }
        });
        c4n0 c4n0Var = this.presenter;
        if (c4n0Var != null && (act = c4n0Var.act()) != null) {
            act.setUpKeyboardDetectorLayout(new View(act()), get_input_notice_text(), new f30() { // from class: l.u3n0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    VoiceEditNoticeDialog.m77702i0(this.f173640a, (Boolean) obj, (Integer) obj2);
                }
            });
        }
        xdl0.m208329E0(get_complete_update(), new View.OnClickListener() { // from class: l.v3n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceEditNoticeDialog.m77703j0(this.f179831a, view);
            }
        });
        get_input_notice_text().setOnClickListener(new View.OnClickListener() { // from class: l.w3n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceEditNoticeDialog.m77704k0(this.f184408a, view);
            }
        });
        get_input_notice_text().addTextChangedListener(new C12989a());
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @NotNull
    public final TextView get_can_input_num() {
        TextView textView = this._can_input_num;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_can_input_num");
        return null;
    }

    @NotNull
    public final TextView get_complete_update() {
        TextView textView = this._complete_update;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_complete_update");
        return null;
    }

    @NotNull
    public final RelativeLayout get_container() {
        RelativeLayout relativeLayout = this._container;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_container");
        return null;
    }

    @NotNull
    public final VFrame get_edit_layout() {
        VFrame vFrame = this._edit_layout;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_edit_layout");
        return null;
    }

    @NotNull
    public final View get_empty() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    public final View get_empty_anchor() {
        View view = this._empty_anchor;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_empty_anchor");
        return null;
    }

    @NotNull
    public final VEditText get_input_notice_text() {
        VEditText vEditText = this._input_notice_text;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.m87502r("_input_notice_text");
        return null;
    }

    @NotNull
    public final VoiceEditNoticeDialog get_root() {
        VoiceEditNoticeDialog voiceEditNoticeDialog = this._root;
        if (voiceEditNoticeDialog != null) {
            return voiceEditNoticeDialog;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    @Override // p149l.s7m
    public /* bridge */ /* synthetic */ View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (View) m77714s0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m77709m0(View view) {
        x3n0.m206933a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final View m77710n0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM206934b = x3n0.m206934b(this, inflater, parent);
        viewM206934b.getClass();
        return viewM206934b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77709m0(this);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable c4n0 presenter) {
        this.presenter = presenter;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public Act getContext() {
        c4n0 c4n0Var = this.presenter;
        if (c4n0Var != null) {
            return c4n0Var.act();
        }
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m77713r0() {
        Act act;
        byr byrVar = this.dialog;
        if (byrVar != null) {
            byrVar.getClass();
            if (byrVar.isShowing()) {
                c4n0 c4n0Var = this.presenter;
                if (c4n0Var != null && (act = c4n0Var.act()) != null) {
                    act.hideInput(get_input_notice_text());
                }
                byr byrVar2 = this.dialog;
                if (byrVar2 != null) {
                    byrVar2.dismiss();
                }
            }
        }
        this.announcementStatus = "";
    }

    @Nullable
    /* JADX INFO: renamed from: s0 */
    public Void m77714s0(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    public final void setCheckSuccessToCache(@NotNull String text) {
        text.getClass();
        this.lastInputText = text;
    }

    public final void setConfirmBtnStatus(@NotNull String announcementStatus) {
        announcementStatus.getClass();
        this.announcementStatus = announcementStatus;
        if (BLiveVoiceRoomProfile.isStatePending(announcementStatus)) {
            get_complete_update().setText("审核中");
            get_complete_update().setEnabled(false);
            get_edit_layout().setOnClickListener(new View.OnClickListener() { // from class: l.s3n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoiceEditNoticeDialog.m77701h0(view);
                }
            });
            get_complete_update().setBackgroundResource(i3c0.f110993e7);
            get_complete_update().setTextColor(Color.parseColor("#66FFFFFF"));
            return;
        }
        get_complete_update().setEnabled(true);
        get_complete_update().setText("确认");
        get_edit_layout().setOnClickListener(null);
        get_complete_update().setBackgroundResource(i3c0.f111018g8);
        get_complete_update().setTextColor(Color.parseColor("#FFFFFF"));
    }

    public final void set_can_input_num(@NotNull TextView textView) {
        textView.getClass();
        this._can_input_num = textView;
    }

    public final void set_complete_update(@NotNull TextView textView) {
        textView.getClass();
        this._complete_update = textView;
    }

    public final void set_container(@NotNull RelativeLayout relativeLayout) {
        relativeLayout.getClass();
        this._container = relativeLayout;
    }

    public final void set_edit_layout(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._edit_layout = vFrame;
    }

    public final void set_empty(@NotNull View view) {
        view.getClass();
        this._empty = view;
    }

    public final void set_empty_anchor(@NotNull View view) {
        view.getClass();
        this._empty_anchor = view;
    }

    public final void set_input_notice_text(@NotNull VEditText vEditText) {
        vEditText.getClass();
        this._input_notice_text = vEditText;
    }

    public final void set_root(@NotNull VoiceEditNoticeDialog voiceEditNoticeDialog) {
        voiceEditNoticeDialog.getClass();
        this._root = voiceEditNoticeDialog;
    }

    public final void set_title(@NotNull TextView textView) {
        textView.getClass();
        this._title = textView;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m77715t0(boolean show, int i) {
        if (show) {
            get_root().setTranslationY(-i);
        } else {
            get_root().setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m77716v0(@NotNull String currentNotice) {
        byr byrVar;
        currentNotice.getClass();
        if (TextUtils.isEmpty(this.lastInputText) && !TextUtils.isEmpty(currentNotice)) {
            this.lastInputText = currentNotice;
        }
        m77707r();
        byr byrVar2 = this.dialog;
        if (byrVar2 != null) {
            byrVar2.getClass();
            if (byrVar2.isShowing() || (byrVar = this.dialog) == null) {
                return;
            }
            byrVar.show();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m77717w0(@NotNull String currentNotice) {
        byr byrVar;
        currentNotice.getClass();
        this.lastInputText = currentNotice;
        m77707r();
        byr byrVar2 = this.dialog;
        if (byrVar2 != null) {
            byrVar2.getClass();
            if (byrVar2.isShowing() || (byrVar = this.dialog) == null) {
                return;
            }
            byrVar.show();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceEditNoticeDialog(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceEditNoticeDialog(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.announcementStatus = "";
        this.lastInputText = "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceEditNoticeDialog(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
