package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.messages.aichat.AIChatView;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemType;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarOpt;
import com.p046p1.mobile.putong.core.p053ui.messages.model.record.view.RecordAnimLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageInputBaseEditView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VLinear;
import p147v.VText;
import p149l.ud50;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MessageBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ud50 f31585a;

    public MessageBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo48830a();

    /* JADX INFO: renamed from: b */
    public abstract View mo48831b(MessageBarActionItemType messageBarActionItemType);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo48832c(MessageBarActionItemType messageBarActionItemType);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo48833d(MessageBarActionItemType messageBarActionItemType);

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (NullChecker.m81303a(getOnDispatchTouchEventListener()) && getOnDispatchTouchEventListener().dispatchTouchEvent(motionEvent)) {
                return true;
            }
        } catch (IllegalArgumentException e) {
            CrashHelper.m81296c(e);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public boolean m48834e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo48835f();

    /* JADX INFO: renamed from: g */
    public abstract void mo48836g(MessageBarOpt.MessageBarState messageBarState);

    public abstract View getActionLayout();

    public abstract AIChatView getAiChatview();

    public abstract FrameLayout getBarWrapper();

    public abstract MessageInputBaseEditView getBar_center_text();

    public abstract VLinear getBar_center_text_layout();

    public abstract View getBar_send();

    public abstract VText getBlockText();

    public abstract View getGiftView();

    public abstract KeyboardFrameWithShadowOutside getHidden_slide_out();

    public abstract View getInputAiView();

    public abstract View getInputContent();

    public abstract View getInputRoot();

    public abstract View getMessageBarRoot();

    public ud50 getOnDispatchTouchEventListener() {
        return this.f31585a;
    }

    public abstract RecordAnimLayout getRecordLayout();

    public abstract VButton getRecoverMatchView();

    public abstract LinearLayout getReferenceView();

    /* JADX INFO: renamed from: h */
    public abstract void mo48837h(MessageBarActionItemType messageBarActionItemType, boolean z);

    /* JADX INFO: renamed from: i */
    public abstract void mo48838i(boolean z, boolean z2);

    /* JADX INFO: renamed from: j */
    public void mo48839j(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: k */
    public void mo48840k(int i, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, double d) {
    }

    /* JADX INFO: renamed from: l */
    public void mo48841l(int i, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, double d) {
    }

    public abstract void setGroupStyle(Act act);

    public void setOnDispatchTouchEventListener(ud50 ud50Var) {
        this.f31585a = ud50Var;
    }

    public MessageBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
