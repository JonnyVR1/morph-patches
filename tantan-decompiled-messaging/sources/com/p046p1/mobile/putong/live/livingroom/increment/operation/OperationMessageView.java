package com.p046p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.hxs;
import p149l.ku50;
import p149l.nt50;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class OperationMessageView extends LiveOperationMessageViewBindings<nt50> {

    /* JADX INFO: renamed from: f */
    public nt50 f50843f;

    public OperationMessageView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m75065i(View view) {
        this.f50843f.m161343i4();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings, p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(nt50 nt50Var) {
        this.f50843f = nt50Var;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings, p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m75067e() {
        this.f48057e.m74295b();
    }

    /* JADX INFO: renamed from: f */
    public void m75068f(Runnable runnable) {
        this.f48057e.setAnimDuration(1200);
        this.f48057e.m74296c(1000, runnable, 10);
    }

    public xdl0.C21104g getOperationIconPos() {
        return xdl0.m208380i0(this.f48056d);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m75070k(BLiveOperationItem bLiveOperationItem, LiveMessage liveMessage) {
        if (NullChecker.m81303a(bLiveOperationItem.popup) && NullChecker.m81303a(bLiveOperationItem.popup.textDrawer)) {
            this.f50843f.m161354t4(bLiveOperationItem);
            this.f50843f.m205023S3(bLiveOperationItem.popup.textDrawer.shading);
            hxs.m133407t("context_livingAct", this.f48056d, bLiveOperationItem.popup.textDrawer.iconUrl, t100.m186890d(32.0f));
            final SpannableStringBuilder spannableStringBuilder = liveMessage.spanList.get(0);
            this.f50843f.m161353s4(spannableStringBuilder, new d30() { // from class: l.pt50
                @Override // p149l.d30
                public final void call() {
                    this.f151115a.m75069j(spannableStringBuilder);
                }
            });
            m75069j(spannableStringBuilder);
        }
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m75069j(SpannableStringBuilder spannableStringBuilder) {
        this.f48057e.setMarqueeText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: m */
    public void m75072m(BLiveOperationItem bLiveOperationItem) {
        this.f50843f.m206028F2().OperationsEvent.messageIconTrans().mo172463j(new ku50.C18083a(8100).m147259d(bLiveOperationItem).m147257b(true).m147262g(getOperationIconPos()).m147256a());
    }

    /* JADX INFO: renamed from: n */
    public void m75073n(BLiveOperationItem bLiveOperationItem) {
        this.f50843f.m206028F2().OperationsEvent.messageOpen().mo172463j(new ku50.C18083a(8100).m147259d(bLiveOperationItem).m147256a());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72028a(this);
        xdl0.m208329E0(this.f48055c, new View.OnClickListener() { // from class: l.ot50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145547a.m75065i(view);
            }
        });
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m75074p() {
        this.f48057e.m74295b();
    }

    public OperationMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
