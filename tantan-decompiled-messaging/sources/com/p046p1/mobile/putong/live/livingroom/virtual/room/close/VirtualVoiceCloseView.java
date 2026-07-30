package com.p046p1.mobile.putong.live.livingroom.virtual.room.close;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceCloseAreaViewBindings;
import p149l.uyl0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualVoiceCloseView extends LiveVirtualVoiceCloseAreaViewBindings<uyl0> {
    public VirtualVoiceCloseView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m77321l0(View view) {
        ((uyl0) this.f48103d).m196308W3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m77322m0(View view) {
        ((uyl0) this.f48103d).m196312a4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m77323n0(View view) {
        ((uyl0) this.f48103d).m196310Y3();
    }

    /* JADX INFO: renamed from: r */
    private void m77324r() {
        xdl0.m208329E0(this.f48105f, new View.OnClickListener() { // from class: l.vyl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183541a.m77321l0(view);
            }
        });
        xdl0.m208329E0(this.f48106g, new View.OnClickListener() { // from class: l.wyl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188577a.m77322m0(view);
            }
        });
        xdl0.m208329E0(this.f48107h, new View.OnClickListener() { // from class: l.xyl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195092a.m77323n0(view);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m77325o0(String str) {
        xdl0.m208344M(this.f48106g, true);
        xdl0.m208344M(this.f48107h, false);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceCloseAreaViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77324r();
    }

    public VirtualVoiceCloseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualVoiceCloseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
