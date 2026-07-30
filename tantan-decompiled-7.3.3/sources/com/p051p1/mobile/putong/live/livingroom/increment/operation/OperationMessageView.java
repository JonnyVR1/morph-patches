package com.p051p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.izs;
import p153l.q260;
import p153l.qa00;
import p153l.t160;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class OperationMessageView extends LiveOperationMessageViewBindings<t160> {

    /* JADX INFO: renamed from: f */
    public t160 f51691f;

    public OperationMessageView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m76248i(View view) {
        this.f51691f.m188859i4();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings, p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(t160 t160Var) {
        this.f51691f = t160Var;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings, p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m76250e() {
        this.f48905e.m75478b();
    }

    /* JADX INFO: renamed from: f */
    public void m76251f(Runnable runnable) {
        this.f48905e.setAnimDuration(1200);
        this.f48905e.m75479c(1000, runnable, 10);
    }

    public bnl0.C16067g getOperationIconPos() {
        return bnl0.m105560i0(this.f48904d);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m76253k(BLiveOperationItem bLiveOperationItem, LiveMessage liveMessage) {
        if (NullChecker.m82486a(bLiveOperationItem.popup) && NullChecker.m82486a(bLiveOperationItem.popup.textDrawer)) {
            this.f51691f.m188870t4(bLiveOperationItem);
            this.f51691f.m113265S3(bLiveOperationItem.popup.textDrawer.shading);
            izs.m142869t("context_livingAct", this.f48904d, bLiveOperationItem.popup.textDrawer.iconUrl, qa00.m175859d(32.0f));
            final SpannableStringBuilder spannableStringBuilder = liveMessage.spanList.get(0);
            this.f51691f.m188869s4(spannableStringBuilder, new x20() { // from class: l.v160
                @Override // p153l.x20
                public final void call() {
                    this.f181933a.m76252j(spannableStringBuilder);
                }
            });
            m76252j(spannableStringBuilder);
        }
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m76252j(SpannableStringBuilder spannableStringBuilder) {
        this.f48905e.setMarqueeText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: m */
    public void m76255m(BLiveOperationItem bLiveOperationItem) {
        this.f51691f.m213811F2().OperationsEvent.messageIconTrans().mo199273j(new q260.C19505a(8100).m175005d(bLiveOperationItem).m175003b(true).m175008g(getOperationIconPos()).m175002a());
    }

    /* JADX INFO: renamed from: n */
    public void m76256n(BLiveOperationItem bLiveOperationItem) {
        this.f51691f.m213811F2().OperationsEvent.messageOpen().mo199273j(new q260.C19505a(8100).m175005d(bLiveOperationItem).m175002a());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73211a(this);
        bnl0.m105509E0(this.f48903c, new View.OnClickListener() { // from class: l.u160
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176973a.m76248i(view);
            }
        });
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m76257p() {
        this.f48905e.m75478b();
    }

    public OperationMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
