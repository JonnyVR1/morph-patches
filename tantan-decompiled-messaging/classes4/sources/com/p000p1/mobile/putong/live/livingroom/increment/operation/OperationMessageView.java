package com.p000p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.ku50;
import p002l.nt50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OperationMessageView extends LiveOperationMessageViewBindings<nt50> {

    /* JADX INFO: renamed from: f */
    public nt50 f6885f;

    public OperationMessageView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m8677i(View view) {
        this.f6885f.m18992i4();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5447C0() {
        return getContext();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo5449i1(nt50 nt50Var) {
        this.f6885f = nt50Var;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m8679e() {
        this.f4099e.m7876b();
    }

    /* JADX INFO: renamed from: f */
    public void m8680f(Runnable runnable) {
        this.f4099e.setAnimDuration(1200);
        this.f4099e.m7877c(1000, runnable, 10);
    }

    public xdl0.g getOperationIconPos() {
        return xdl0.i0(this.f4098d);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m8682k(BLiveOperationItem bLiveOperationItem, LiveMessage liveMessage) {
        if (NullChecker.a(bLiveOperationItem.popup) && NullChecker.a(bLiveOperationItem.popup.textDrawer)) {
            this.f6885f.m19004t4(bLiveOperationItem);
            this.f6885f.m25298S3(bLiveOperationItem.popup.textDrawer.shading);
            hxs.t("context_livingAct", this.f4098d, bLiveOperationItem.popup.textDrawer.iconUrl, t100.d(32.0f));
            final SpannableStringBuilder spannableStringBuilder = liveMessage.spanList.get(0);
            this.f6885f.m19002s4(spannableStringBuilder, new d30() { // from class: l.pt50
                public final void call() {
                    this.f17639a.m8681j(spannableStringBuilder);
                }
            });
            m8681j(spannableStringBuilder);
        }
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m8681j(SpannableStringBuilder spannableStringBuilder) {
        this.f4099e.setMarqueeText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: m */
    public void m8684m(BLiveOperationItem bLiveOperationItem) {
        this.f6885f.m25548F2().OperationsEvent.messageIconTrans().j(new ku50.C0652a(8100).m16802d(bLiveOperationItem).m16800b(true).m16805g(getOperationIconPos()).m16799a());
    }

    /* JADX INFO: renamed from: n */
    public void m8685n(BLiveOperationItem bLiveOperationItem) {
        this.f6885f.m25548F2().OperationsEvent.messageOpen().j(new ku50.C0652a(8100).m16802d(bLiveOperationItem).m16799a());
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.binding.LiveOperationMessageViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5448a(this);
        xdl0.E0(this.f4097c, new View.OnClickListener() { // from class: l.ot50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16777a.m8677i(view);
            }
        });
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m8686p() {
        this.f4099e.m7876b();
    }

    public OperationMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
