package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.aichat.AIChatView;
import com.p000p1.mobile.putong.core.p001ui.messages.helper.MessageWarmingUpHelper;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemType;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarOpt;
import com.p000p1.mobile.putong.core.p001ui.messages.model.record.view.RecordAnimLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p003l.ud50;
import p028v.VButton;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class MessageBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ud50 f1476a;

    public MessageBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1915a();

    /* JADX INFO: renamed from: b */
    public abstract View mo1916b(MessageBarActionItemType messageBarActionItemType);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo1917c(MessageBarActionItemType messageBarActionItemType);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo1918d(MessageBarActionItemType messageBarActionItemType);

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (NullChecker.a(getOnDispatchTouchEventListener()) && getOnDispatchTouchEventListener().dispatchTouchEvent(motionEvent)) {
                return true;
            }
        } catch (IllegalArgumentException e) {
            CrashHelper.c(e);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public boolean m1919e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1920f();

    /* JADX INFO: renamed from: g */
    public abstract void mo1921g(MessageBarOpt.MessageBarState messageBarState);

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
        return this.f1476a;
    }

    public abstract RecordAnimLayout getRecordLayout();

    public abstract VButton getRecoverMatchView();

    public abstract LinearLayout getReferenceView();

    /* JADX INFO: renamed from: h */
    public abstract void mo1922h(MessageBarActionItemType messageBarActionItemType, boolean z);

    /* JADX INFO: renamed from: i */
    public abstract void mo1923i(boolean z, boolean z2);

    /* JADX INFO: renamed from: j */
    public void mo1924j(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: k */
    public void mo1925k(int i, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, double d) {
    }

    /* JADX INFO: renamed from: l */
    public void mo1926l(int i, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, double d) {
    }

    public abstract void setGroupStyle(Act act);

    public void setOnDispatchTouchEventListener(ud50 ud50Var) {
        this.f1476a = ud50Var;
    }

    public MessageBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
