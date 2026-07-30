package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.messages.aichat.AIChatView;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemType;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarOpt;
import com.p051p1.mobile.putong.core.p058ui.messages.model.record.view.RecordAnimLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageInputBaseEditView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VLinear;
import p151v.VText;
import p153l.bm50;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MessageBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public bm50 f32433a;

    public MessageBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo50013a();

    /* JADX INFO: renamed from: b */
    public abstract View mo50014b(MessageBarActionItemType messageBarActionItemType);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo50015c(MessageBarActionItemType messageBarActionItemType);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo50016d(MessageBarActionItemType messageBarActionItemType);

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (NullChecker.m82486a(getOnDispatchTouchEventListener()) && getOnDispatchTouchEventListener().dispatchTouchEvent(motionEvent)) {
                return true;
            }
        } catch (IllegalArgumentException e) {
            CrashHelper.m82479c(e);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public boolean m50017e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo50018f();

    /* JADX INFO: renamed from: g */
    public abstract void mo50019g(MessageBarOpt.MessageBarState messageBarState);

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

    public bm50 getOnDispatchTouchEventListener() {
        return this.f32433a;
    }

    public abstract RecordAnimLayout getRecordLayout();

    public abstract VButton getRecoverMatchView();

    public abstract LinearLayout getReferenceView();

    /* JADX INFO: renamed from: h */
    public abstract void mo50020h(MessageBarActionItemType messageBarActionItemType, boolean z);

    /* JADX INFO: renamed from: i */
    public abstract void mo50021i(boolean z, boolean z2);

    /* JADX INFO: renamed from: j */
    public void mo50022j(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: k */
    public void mo50023k(int i, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, double d) {
    }

    /* JADX INFO: renamed from: l */
    public void mo50024l(int i, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, double d) {
    }

    public abstract void setGroupStyle(Act act);

    public void setOnDispatchTouchEventListener(bm50 bm50Var) {
        this.f32433a = bm50Var;
    }

    public MessageBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
